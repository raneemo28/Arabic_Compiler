# semantic/semantic_visitor.py
from AST.visitor_interface import ASTVisitor
from semantic.symbols import VariableSymbol, FunctionSymbol
from semantic.environment import Environment, SemanticError

class SemanticAnalysisVisitor(ASTVisitor):
    """
    محلل دلالي متكامل يعبر الـ AST الخاص بك، وينشئ جداول الرموز
    ويتحقق من صحة الاستدعاءات والتعريفات دون تعديل بناء الـ AST الأصلي.
    """
    def __init__(self):
        # إنشاء النطاق العام الجذري للملف الكامل (Global Scope)
        self.current_env = Environment()
        # حقن المعرفات المدمجة مسبقاً في نظام التشغيل للغتك مثل (المراقب)
        #self.current_env.define("المراقب", VariableSymbol("المراقب", "كائن"))
        self.current_env.define("اطبع", FunctionSymbol(name="اطبع", return_type="أي", arity=1))

    # ── HTML & CSS Nodes (التمرير الهيكلي دون توليد نطاقات منطقية) ──────────
    def visit_ProgramNode(self, node):
        for child in node.children:
            child.accept(self)

    def visit_TagNode(self, node):
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

    # ── Script Boundaries & Local Scoping ────────────────────────────────────
    def visit_JsBlockNode(self, node):
        """عند الدخول في كتلة برمجية محصورة بين { }، ننشئ نطاقاً محلياً جديداً"""
        previous_env = self.current_env
        self.current_env = Environment(enclosing=previous_env)  # ربط الأب بالنطاق الجديد
        
        # التكرار عبر الجمل داخل الكتلة
        statements = node.statements if hasattr(node, 'statements') else getattr(node, 'children', [])
        for statement in statements:
            statement.accept(self)
            
        # استعادة النطاق الأب فور الخروج من الكتلة وحذف النطاق المحلي
        self.current_env = previous_env

    def visit_TsTypedDeclarationNode(self, node):
        """معالجة التعاريف الصريحة النوع مثل (متغير س: عدد = ١٠)"""
        if node.initializer:
            node.initializer.accept(self)  # التحقق من سلامة التعبير المسند أولاً
        
        # تسجيل المتغير بنوعه الصريح المكتوب باللغة العربية (سلسلة، عدد، الخ)
        self.current_env.define(
            name=node.name, 
            symbol=VariableSymbol(node.name, node.type_name),
            line=node.line,
            column=node.column
        )

    def visit_JsVariableDeclarationNode(self, node):
        """معالجة التعاريف الضمنية أو الخالية من النوع (ثابت ص = 'مرحبا')"""
        if node.initializer:
            node.initializer.accept(self)
            
        # إسناد نوع تلقائي افتراضي "أي" في حال عدم التحديد الصريح
        self.current_env.define(
            name=node.name, 
            symbol=VariableSymbol(node.name, "أي"),
            line=node.line,
            column=node.column
        )

    def visit_JsAssignmentStatementNode(self, node):
        """التحقق من صحة عمليات التعديل (س = س + ١)"""
        # التأكد من أن المتغير المستهدف موجود ومعرف مسبقاً في النطاقات المتاحة
        self.current_env.resolve(node.target, line=node.line, column=node.column)
        if node.value:
            node.value.accept(self)

    def visit_JsFunctionDeclarationNode(self, node):
        """هندسة تعاريف الدوال ومحيطها المعجمي المغلّف"""
        # 1. تسجيل اسم الدالة أولاً في النطاق الخارجي الحالي لتفعيل الاستدعاء الذاتي (Recursion)
        arity = len(node.params) if node.params else 0
        func_symbol = FunctionSymbol(name=node.name, return_type="أي", arity=arity)
        self.current_env.define(node.name, func_symbol, line=node.line, column=node.column)

        # 2. إنشاء بيئة/نطاق مغلق خاص وحصري لداخل جسم الدالة
        previous_env = self.current_env
        self.current_env = Environment(enclosing=previous_env)

        # 3. حقن المعاملات (Parameters) كمتغيرات محلية داخل نطاق الدالة الجديد
        if node.params:
            for param in node.params:
                self.current_env.define(param, VariableSymbol(param, "أي"), line=node.line, column=node.column)

        # 4. معالجة العمليات داخل الدالة
        if node.body:
            node.body.accept(self)

        # 5. التراجع للنطاق الخارجي بعد انتهاء جسم الدالة
        self.current_env = previous_env

    def visit_JsIfStatementNode(self, node):
        """التحقق الدلالي للجمل الشرطية (إذا) وعقدها الفرعية الشرطية والتنفيذية"""
        if hasattr(node, 'condition') and node.condition:
            node.condition.accept(self)
        if hasattr(node, 'body') and node.body:
            node.body.accept(self)
        if hasattr(node, 'else_body') and node.else_body:
            node.else_body.accept(self)

    def visit_JsForLoopNode(self, node):
        """حلقات التكرار تمتلك نطاقاً لحماية متغيراتها العدادة"""
        previous_env = self.current_env
        self.current_env = Environment(enclosing=previous_env)

        if node.init: node.init.accept(self)
        if node.condition: node.condition.accept(self)
        if node.update: node.update.accept(self)
        if node.iterable: node.iterable.accept(self)
        if node.body: node.body.accept(self)

        self.current_env = previous_env

    def visit_JsWhileLoopNode(self, node):
        if node.condition: node.condition.accept(self)
        if node.body: node.body.accept(self)

    def visit_JsReturnStatementNode(self, node):
        if node.value: node.value.accept(self)

    def visit_JsInterfaceDeclarationNode(self, node):
        """معالجة تعريف الواجهات (Interfaces) دلالياً"""
        pass

    def visit_JsTryCatchNode(self, node):
        if node.try_block: node.try_block.accept(self)
        if node.catch_param:
            # تخصيص نطاق استثنائي محلي لمتغير الخطأ الملتقط داخل كتلة catch
            previous_env = self.current_env
            self.current_env = Environment(enclosing=previous_env)
            self.current_env.define(node.catch_param, VariableSymbol(node.catch_param, "خطأ"), line=node.line, column=node.column)
            if node.catch_block: 
                node.catch_block.accept(self)
            self.current_env = previous_env
        if node.finally_block: 
            node.finally_block.accept(self)

    def visit_JsExpressionStatementNode(self, node):
        if node.expression: node.expression.accept(self)

    def visit_JsBuiltInCallNode(self, node):
        # التحقق من أن الكائن المستدعى أو الدالة المدمجة مثل (المراقب.اطبع) مسجلة ومتاحة
        base_identifier = node.callee.split('.')[0]
        self.current_env.resolve(base_identifier, line=node.line, column=node.column)
        for arg in node.arguments:
            arg.accept(self)

    # ── Identifier Lookup Validation inside Expressions ──────────────────────
    def visit_JsExpressionNode(self, node):
        if node.left: node.left.accept(self)
        if node.right: node.right.accept(self)

    def visit_JsPrimaryNode(self, node):
        """النقطة المركزية للتحقق من صحة استدعاء المتغيرات داخل التعبيرات"""
        # في حال كانت العقدة تمثل معرف متغير مستدعى (Identifier) نقوم بفحصه دلالياً فوراً
        if node.kind == 'identifier' and node.value:
            # محاولة البحث عن المتغير؛ ستطلق SemanticError تلقائياً إذا كان وهمياً أو غير معرف
            self.current_env.resolve(node.value, line=node.line, column=node.column)
        
        # التمرير للمكونات الداخلية في حال المصفوفات التجميعية أو الكائنات
        if node.kind == 'array' and hasattr(node, 'elements') and node.elements:
            for el in node.elements: el.accept(self)
        elif node.kind == 'object' and hasattr(node, 'pairs') and node.pairs:
            for key, val in node.pairs: val.accept(self)
        elif node.kind == 'paren' and hasattr(node, 'elements') and node.elements:
            for el in node.elements: el.accept(self)