# semantic/semantic_analyzer.py
"""
الزائر الدلالي الثاني: فاحص الأنواع (SemanticAnalyzerVisitor)
==============================================================

هذا الزائر مختلف عن SemanticAnalysisVisitor الموجود في semantic_visitor.py:

  * SemanticAnalysisVisitor (الجلسة 10/11)  -> يبني جداول الرموز ويتحقق
    فقط من النطاقات (هل المتغير معرّف؟ هل أعيد تعريفه؟). دوال accept()
    فيه لا تُرجع شيئاً ذا معنى (None).

  * SemanticAnalyzerVisitor (هذا الملف، الجلسة 12) -> يمر على نفس الشجرة
    لكن كل عقدة تعبير (Expression) تُرجع كائن Type حقيقي من types_system،
    فيستطيع الزائر التحقق من توافق الأنواع في الإسناد والعمليات الحسابية،
    ويستخدم تقنية "تسميم الأنواع" (ERROR_TYPE) لمنع انفجار رسائل الخطأ.

الزائران يتشاركان نفس Environment/Symbol من الجلسات السابقة، فقط الجديد
هنا هو أن VariableSymbol.type يحمل الآن كائن Type حقيقي (NumberType،
StringType، ...) بدلاً من نص عربي خام.
"""

from semantic.environment import Environment, SemanticError
from semantic.symbols import VariableSymbol, FunctionSymbol
from semantic.types_system import (
    Type, NUMBER_TYPE, STRING_TYPE, BOOL_TYPE, ANY_TYPE, BIGINT_TYPE,
    ERROR_TYPE, ArrayType, type_from_name, make_array_type, is_assignable,
)


class SemanticAnalyzerVisitor:
    """
    يعبر شجرة AST الكاملة (نفس عقد ast_nodes.py)، ويُرجع من كل عقدة تعبير
    كائن Type يمثل نوع نتيجتها، ويجمّع كل الأخطاء الدلالية بدلاً من
    التوقف عند أول خطأ.
    """

    def __init__(self):
        self.current_env = Environment()
        self.errors = []

        # حقن المعرفات المدمجة مسبقاً (نفس فكرة semantic_visitor.py)
        self.current_env.define(
            "اطبع", FunctionSymbol(name="اطبع", return_type=ANY_TYPE, arity=1)
        )
        self.current_env.define(
            "المراقب", VariableSymbol("المراقب", ANY_TYPE)
        )

    # ── أدوات مساعدة ──────────────────────────────────────────────────────

    def log_error(self, line: int, column: int, message: str):
        """تسجيل خطأ دلالي دون إيقاف عملية التحليل (جمع كل الأخطاء معاً)."""
        if line:
            self.errors.append(f"خطأ دلالي (سطر {line}): {message}")
        else:
            self.errors.append(f"خطأ دلالي: {message}")

    # ── البرنامج والكتل البرمجية ─────────────────────────────────────────

    def visit_ProgramNode(self, node):
        for child in node.children:
            child.accept(self)

    def visit_JsBlockNode(self, node):
        previous_env = self.current_env
        self.current_env = Environment(enclosing=previous_env)

        statements = node.statements if hasattr(node, 'statements') else getattr(node, 'children', [])
        for statement in statements:
            statement.accept(self)

        self.current_env = previous_env

    # ── HTML / CSS: تمرير هيكلي فقط (لا أنواع هنا) ──────────────────────

    def visit_TagNode(self, node):
        """
        تتحقق من أن اسم وسم الإغلاق (closing_tag_name) يطابق اسم وسم الفتح
        (tag_name). القواعد النحوية الحرة من السياق (CFG) لا يمكنها فرض هذا
        التطابق بنفسها — </وسم> و<وسم> يُقبلان كرمزين مستقلين تماماً في
        المحلل اللغوي والمحلل النحوي، لذلك يجب أن يقع هذا الفحص هنا في
        التحليل الدلالي.
        """
        if node.tag_name != node.closing_tag_name:
            self.log_error(
                node.line, node.column,
                f"وسم غير متطابق: تم فتحه بـ '<{node.tag_name}>' لكن تم إغلاقه بـ '</{node.closing_tag_name}>'."
            )

        for child in node.children:
            child.accept(self)

    def visit_SelfClosingTagNode(self, node):
        pass

    def visit_AttributeNode(self, node):
        pass

    def visit_TextNode(self, node):
        pass

    def visit_CssRuleNode(self, node):
        if node.declaration_list:
            node.declaration_list.accept(self)

    def visit_CssSelectorNode(self, node):
        pass

    def visit_CssDeclarationListNode(self, node):
        for decl in node.declarations:
            decl.accept(self)

    def visit_CssDeclarationNode(self, node):
        if node.value:
            node.value.accept(self)

    def visit_CssValueNode(self, node):
        if node.is_function and node.function_node:
            node.function_node.accept(self)

    def visit_CssFunctionValueNode(self, node):
        for arg in node.arguments:
            arg.accept(self)

    # ── التصريحات المكتوبة (TsTypedDeclarationNode) ────────────────────

    def visit_TsTypedDeclarationNode(self, node):
        """
        ثابت/متغير س: عدد = ٥؛   أو   ثابت أرقام: مصفوفة<عدد> = [١، ٢]؛

        1. نحدد النوع المُعلن (declared_type) من type_name.
        2. نقيّم المُهيّئ (initializer) إن وجد لمعرفة نوعه الفعلي.
        3. نتحقق من التوافق، ونسجل خطأ عند التعارض (مع تجاهل ERROR_TYPE).
        4. نسجل المتغير في البيئة الحالية بنوعه المُعلن الحقيقي (Type)،
           لا كنص عربي خام.
        """
        declared_type = (
            make_array_type(node.type_name) if node.is_array
            else type_from_name(node.type_name)
        )

        if node.initializer:
            value_type = node.initializer.accept(self)
            if not is_assignable(declared_type, value_type):
                self.log_error(
                    node.line, node.column,
                    f"لا يمكن إسناد قيمة من نوع '{value_type}' إلى متغير من نوع '{declared_type}'."
                )

        try:
            self.current_env.define(
                node.name, VariableSymbol(node.name, declared_type),
                line=node.line, column=node.column
            )
        except SemanticError as e:
            self.log_error(node.line, node.column, str(e))

    def visit_JsVariableDeclarationNode(self, node):
        """ثابت ص = 'مرحبا'؛  -- بلا نوع صريح، فنستنتج النوع من المُهيّئ (Type Inference)."""
        if node.initializer:
            inferred_type = node.initializer.accept(self)
        else:
            inferred_type = ANY_TYPE

        try:
            self.current_env.define(
                node.name, VariableSymbol(node.name, inferred_type),
                line=node.line, column=node.column
            )
        except SemanticError as e:
            self.log_error(node.line, node.column, str(e))

    def visit_JsAssignmentStatementNode(self, node):
        """س = س + ١؛  -- التحقق من وجود الهدف ومن توافق نوع القيمة المُسندة."""
        try:
            target_symbol = self.current_env.resolve(node.target, line=node.line, column=node.column)
            target_type = target_symbol.type
        except SemanticError as e:
            self.log_error(node.line, node.column, str(e))
            target_type = ERROR_TYPE

        value_type = node.value.accept(self) if node.value else ERROR_TYPE

        if node.operator == "=" :
            if not is_assignable(target_type, value_type):
                self.log_error(
                    node.line, node.column,
                    f"لا يمكن إسناد قيمة من نوع '{value_type}' إلى متغير من نوع '{target_type}'."
                )
        else:
            # عمليات مركّبة مثل += -= *= /= تتطلب أن يكون كلا الطرفين رقميين
            # (أو أحدهما مسموماً/أي، فنتجاوز بصمت).
            numeric = {NUMBER_TYPE, BIGINT_TYPE}
            if target_type not in (ERROR_TYPE, ANY_TYPE) and value_type not in (ERROR_TYPE, ANY_TYPE):
                if target_type not in numeric or value_type not in numeric:
                    self.log_error(
                        node.line, node.column,
                        f"العملية '{node.operator}' غير مسموحة بين '{target_type}' و '{value_type}'."
                    )

        return target_type

    def visit_JsFunctionDeclarationNode(self, node):
        arity = len(node.params) if node.params else 0
        func_symbol = FunctionSymbol(name=node.name, return_type=ANY_TYPE, arity=arity)
        try:
            self.current_env.define(node.name, func_symbol, line=node.line, column=node.column)
        except SemanticError as e:
            self.log_error(node.line, node.column, str(e))

        previous_env = self.current_env
        self.current_env = Environment(enclosing=previous_env)

        if node.params:
            for param in node.params:
                self.current_env.define(param, VariableSymbol(param, ANY_TYPE), line=node.line, column=node.column)

        if node.body:
            node.body.accept(self)

        self.current_env = previous_env

    def visit_JsIfStatementNode(self, node):
        if getattr(node, 'condition', None):
            cond_type = node.condition.accept(self)
            # المنطقي مقبول كالمعتاد، والآن أيضاً الأعداد بأسلوب بايثون:
            # ٠ = خطأ، أي عدد آخر = صحيح. التحويل الفعلي (compare-to-zero)
            # يبقى لمرحلة توليد كود LLVM IR لاحقاً.
            if cond_type not in (BOOL_TYPE, ERROR_TYPE, ANY_TYPE, NUMBER_TYPE, BIGINT_TYPE):
                self.log_error(
                    node.line, node.column,
                    f"شرط جملة 'إذا' يجب أن يكون من النوع 'منطقي' أو 'عدد'، وليس '{cond_type}'."
                )
        if getattr(node, 'then_branch', None):
            node.then_branch.accept(self)
        elif getattr(node, 'body', None):
            node.body.accept(self)
        if getattr(node, 'else_branch', None):
            node.else_branch.accept(self)
        elif getattr(node, 'else_body', None):
            node.else_body.accept(self)


    def visit_JsWhileLoopNode(self, node):
        if node.condition:
            cond_type = node.condition.accept(self)
            if cond_type not in (BOOL_TYPE, ERROR_TYPE, ANY_TYPE, NUMBER_TYPE, BIGINT_TYPE):
                self.log_error(
                    node.line, node.column,
                    f"شرط جملة 'طالما' يجب أن يكون من النوع 'منطقي' أو 'عدد'، وليس '{cond_type}'."
                )
        if node.body: node.body.accept(self)

    def visit_JsForLoopNode(self, node):
        previous_env = self.current_env
        self.current_env = Environment(enclosing=previous_env)

        if node.init: node.init.accept(self)
        if node.condition: node.condition.accept(self)
        if node.update: node.update.accept(self)
        if node.iterable: node.iterable.accept(self)
        if node.body: node.body.accept(self)

        self.current_env = previous_env

   

    def visit_JsReturnStatementNode(self, node):
        return node.value.accept(self) if node.value else ANY_TYPE

    def visit_JsInterfaceDeclarationNode(self, node):
        pass

    def visit_JsTryCatchNode(self, node):
        if node.try_block: node.try_block.accept(self)
        if node.catch_param:
            previous_env = self.current_env
            self.current_env = Environment(enclosing=previous_env)
            self.current_env.define(node.catch_param, VariableSymbol(node.catch_param, ANY_TYPE), line=node.line, column=node.column)
            if node.catch_block:
                node.catch_block.accept(self)
            self.current_env = previous_env
        if node.finally_block:
            node.finally_block.accept(self)

    def visit_JsExpressionStatementNode(self, node):
        if node.expression:
            node.expression.accept(self)

    def visit_JsBuiltInCallNode(self, node):
        """اطبع(...)، المراقب.اطبع(...)، تنبيه(...)، ادخل(...)."""
        base_identifier = node.callee.split('.')[0]
        try:
            self.current_env.resolve(base_identifier, line=node.line, column=node.column)
        except SemanticError as e:
            self.log_error(node.line, node.column, str(e))

        for arg in node.arguments:
            arg.accept(self)

    # ── التعبيرات (Expressions) — هنا يحدث فحص الأنواع الحقيقي ──────────

    _ARITHMETIC_OPS = {"+", "-", "*", "/", "%", "**"}
    _COMPARISON_OPS = {"<", ">", ">=", "<=", "==", "!=", "===", "!=="}
    _LOGICAL_OPS = {"&&", "||"}
    
    def visit_JsExpressionNode(self, node):
        """
        عقدة ثنائية عامة: left operator right.
        ...
        """
        if not node.left:
            return ERROR_TYPE
    
        left_type = node.left.accept(self)
    
        if not node.operator or not node.right:
            return left_type
    
        op = node.operator
    
        # ── الوصول لخاصية عبر نقطة: عنصر.الخاصية ────────────────────────
        # الطرف الأيمن هنا اسم خاصية (property name) وليس مرجعاً لمتغير،
        # لذلك يجب ألا يُمرَّر إلى visit_JsPrimaryNode الذي يحاول البحث
        # عنه في جدول الرموز ويُطلق خطأ "غير معرف" خاطئاً.
        if op == ".":
            return ANY_TYPE if left_type != ERROR_TYPE else ERROR_TYPE
    
        right_type = node.right.accept(self)
    
        if left_type == ERROR_TYPE or right_type == ERROR_TYPE:
            return ERROR_TYPE
    
        numeric = {NUMBER_TYPE, BIGINT_TYPE}
    
        if op == "+":
            if left_type == STRING_TYPE or right_type == STRING_TYPE:
                return STRING_TYPE
            if left_type in numeric and right_type in numeric:
                return NUMBER_TYPE
            if left_type == ANY_TYPE or right_type == ANY_TYPE:
                return ANY_TYPE
            self.log_error(
                node.line, node.column,
                f"العملية '+' غير مسموحة بين '{left_type}' و '{right_type}'."
            )
            return ERROR_TYPE
    
        if op in self._ARITHMETIC_OPS:
            if left_type == ANY_TYPE or right_type == ANY_TYPE:
                return ANY_TYPE
            if left_type in numeric and right_type in numeric:
                return NUMBER_TYPE
            self.log_error(
                node.line, node.column,
                f"العملية '{op}' غير مسموحة بين '{left_type}' و '{right_type}'."
            )
            return ERROR_TYPE
    
        if op in self._COMPARISON_OPS:
            involves_array = isinstance(left_type, ArrayType) or isinstance(right_type, ArrayType)
    
            if op in ("<", ">", ">=", "<="):
                if involves_array:
                    self.log_error(
                        node.line, node.column,
                        f"لا يمكن استخدام عملية الترتيب '{op}' على نوع 'مصفوفة' ('{left_type}' و '{right_type}')."
                    )
                    return ERROR_TYPE
    
            if left_type != right_type and ANY_TYPE not in (left_type, right_type):
                self.log_error(
                    node.line, node.column,
                    f"لا يمكن مقارنة '{left_type}' مع '{right_type}' بالعملية '{op}'."
                )
                return ERROR_TYPE
            return BOOL_TYPE
    
        if op in self._LOGICAL_OPS:
            if left_type not in (BOOL_TYPE, ANY_TYPE, ERROR_TYPE) or right_type not in (BOOL_TYPE, ANY_TYPE, ERROR_TYPE):
                self.log_error(
                    node.line, node.column,
                    f"العملية المنطقية '{op}' تتطلب نوع 'منطقي' على الطرفين، وُجد '{left_type}' و '{right_type}'."
                )
                return ERROR_TYPE
            return BOOL_TYPE
    
        # عامل غير معروف للفاحص (مثل "()" أو "[]") — right_type تم حسابه
        # أعلاه بالفعل، وهذا يضمن زيارة وسائط الاستدعاء عبر visit_JsPrimaryNode.
        return ANY_TYPE    

    def visit_JsPrimaryNode(self, node):
        if node.kind == 'identifier' and node.value:
            try:
                symbol = self.current_env.resolve(node.value, line=node.line, column=node.column)
                return symbol.type
            except SemanticError as e:
                self.log_error(node.line, node.column, str(e))
                return ERROR_TYPE

        if node.kind == 'number':
            return NUMBER_TYPE

        if node.kind == 'string':
            return STRING_TYPE

        if node.kind == 'boolean':
            return BOOL_TYPE

        if node.kind in ('null', 'undefined', 'nan', 'this', 'document', 'window'):
            return ANY_TYPE

        if node.kind == 'array':
            elements = getattr(node, 'elements', None) or []
            # تصفية أي عناصر None قد تأتي من الشجرة
            valid_elements = [el for el in elements if el is not None]
            
            if not valid_elements:
                return ArrayType(ANY_TYPE)
                
            element_types = [el.accept(self) for el in valid_elements]
            first = next((t for t in element_types if t != ERROR_TYPE), ANY_TYPE)
            for t in element_types:
                if t != ERROR_TYPE and t != ANY_TYPE and t != first:
                    self.log_error(
                        node.line, node.column,
                        f"عناصر المصفوفة ليست من نوع واحد: وُجد '{first}' و '{t}' معاً."
                    )
                    return ArrayType(ERROR_TYPE)
            return ArrayType(first)

        if node.kind == 'object' and getattr(node, 'pairs', None):
            for _, val in node.pairs:
                if val is not None:
                    val.accept(self)
            return ANY_TYPE

        if node.kind == 'paren' and getattr(node, 'elements', None):
            result_type = ANY_TYPE
            for el in node.elements:
                if el is not None: # إضافة حماية هنا أيضاً
                    result_type = el.accept(self)
            return result_type

        # ── استدعاء دالة: "معالج(غير_مسجل، ٥)؛" يُبنى في ast_visitor.py
        # كـ JsPrimaryNode(kind='call', elements=[...الوسائط...]).
        if node.kind == 'call':
            elements = getattr(node, 'elements', None) or []
            for arg in elements:
                if arg is not None:  # <--- [الحل هنا] منع استدعاء accept على None
                    arg.accept(self)
            return ANY_TYPE

        return ANY_TYPE