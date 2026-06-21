# codegen/codegen_visitor.py
"""
الزائر الرابع: مولد الكود الحقيقي (CodeGeneratorVisitor)
===========================================================

نفس شجرة الـ AST التي يستخدمها بقية الزوار (البناء، الرسم، التحليل
الدلالي)، لكن هذا الزائر يبني نصوص HTML/CSS/JS حقيقية بدلاً من رسم
أو فحص الأنواع.

استراتيجية الترجمة
-------------------
1. الكلمات المفتاحية المغلقة (CSS properties، CSS values، TS keywords)
   لها قاموس ترجمة ثابت لأن اللاحقة الإنجليزية الحقيقية معروفة سلفاً.
2. المعرّفات المفتوحة (أسماء الوسوم، المتغيرات، الدوال) تمر دون تغيير
   لأنها أسماء اختارها المبرمج، لا كلمات لغوية.
3. عقد CSS وTS المُضمّنة داخل HTML تُفصل لملفاتها الخاصة دائماً، بصرف
   النظر عن مكان وجودها في الشجرة، لأن الناتج النهائي ثلاثة ملفات منفصلة.
4. واجهات TypeScript (interface) لا وجود لها في JS الحقيقي، فلا تُولّد
   أي كود.
5. شروط if/while العددية (مثل: إذا (عداد)) لا تحتاج أي معالجة خاصة هنا
   لأن JS نفسه يطبّق نفس قاعدة "صفر = خطأ، غير ذلك = صحيح" افتراضياً.
6. الأرقام العربية الهندية (٠١٢٣...) يجب تحويلها لأرقام لاتينية (0123...)
   لأن JS/CSS الحقيقيين لا يفهمان رموز الأرقام العربية كقيم عددية.
"""

import os
from platform import node
from AST.visitor_interface import ASTVisitor
from AST.ast_nodes import (
    TagNode, SelfClosingTagNode, TextNode,
    CssRuleNode, CssSelectorNode, SelectorKind,
)


class CodeGeneratorVisitor(ASTVisitor):

    INDENT = "    "

    _ARABIC_DIGIT_MAP = str.maketrans("٠١٢٣٤٥٦٧٨٩", "0123456789")
    _HTML_TAG_MAP = {
        "صورة": "img", "رابط": "a", "فقرة": "p", "قسم": "div",
        "عنوان": "h1", "نص": "span", "زر": "button", "جدول": "table",
        "سطر": "tr", "خلية": "td", "قائمة": "ul", "عنصر-قائمة": "li",
        "نموذج": "form", "ادخال": "input", "خط": "hr",
        "راس": "header", "تذييل": "footer", "تنقل": "nav",
    }

   
    _CSS_PROPERTY_MAP = {
        "عرض": "display", "موقع": "position", "عرض-المساحة": "width",
        "طول-المساحة": "height", "اقصى-عرض": "max-width", "اقل-عرض": "min-width",
        "اقصى-طول": "max-height", "اقل-طول": "min-height", "هامش": "margin",
        "حشو": "padding", "اطار": "border", "الظهور": "visibility",
        "فائض": "overflow", "ترتيب-العمق": "z-index", "تحجيم-الصندوق": "box-sizing",
        "مرن": "flex", "اتجاه-المرونة": "flex-direction", "لف-المرونة": "flex-wrap",
        "نمو-المرونة": "flex-grow", "انكماش-المرونة": "flex-shrink", "شبكة": "grid",
        "قالب-الشبكة": "grid-template", "فجوة": "gap", "ضبط-المحتوى": "justify-content",
        "محاذاة-العناصر": "align-items", "محاذاة-ذاتية": "align-self", "ترتيب": "order",
        "لون": "color", "خلفية": "background", "صورة-الخلفية": "background-image",
        "لون-الخلفية": "background-color", "حجم-الخلفية": "background-size",
        "تكرار-الخلفية": "background-repeat", "تثبيت-الخلفية": "background-attachment",
        "قص-الخلفية": "background-clip", "شفافية": "opacity", "ظل-الصندوق": "box-shadow",
        "نوع-الخط": "font-family", "حجم-الخط": "font-size", "ثقل-الخط": "font-weight",
        "نمط-الخط": "font-style", "محاذاة-النص": "text-align", "زخرفة-النص": "text-decoration",
        "تحويل-النص": "text-transform", "ظل-النص": "text-shadow", "ازاحة-النص": "text-indent",
        "ارتفاع-السطر": "line-height", "تباعد-الاحرف": "letter-spacing",
        "تباعد-الكلمات": "word-spacing", "المساحة-البيضاء": "white-space",
        "اتجاه-الكتابة": "direction", "نمط-الكتابة": "writing-mode",
        "انحناء-الاطار": "border-radius", "سمك-الاطار": "border-width",
        "نمط-الاطار": "border-style", "لون-الاطار": "border-color", "خط-خارجي": "outline",
        "اعلى": "top", "اسفل": "bottom", "يمين": "right", "يسار": "left",
        "نمط-القائمة": "list-style", "دمج-الحدود": "border-collapse",
        "تنسيق-الجدول": "table-layout", "مكان-العنوان": "caption-side",
        "مرشح": "filter", "مرشح-الخلفية": "backdrop-filter",
    }

    _CSS_VALUE_MAP = {
        "وراثة": "inherit", "اولي": "initial", "غير-محدد": "unset", "لا-شيء": "none",
        "تلقائي": "auto", "مركز": "center", "متصل": "solid", "مقطع": "dashed",
        "منقط": "dotted", "مزدوج": "double", "مخفي": "hidden", "كتلة": "block",
        "سطري": "inline", "مرونة": "flex", "مطلق": "absolute", "نسبي": "relative",
        "مثبت": "fixed", "لاصق": "sticky", "سطر": "row", "عمود": "column",
        "لف": "wrap", "عريض": "bold", "مائل": "italic", "مرن": "flex", "شبكة": "grid",
    }

    _CSS_UNIT_SUFFIX_MAP = {
        "بكسل": "px", "ثانية": "s", "ملي-ثانية": "ms", "درجة": "deg",
    }

    _CSS_FUNCTION_MAP = {
        "رابط": "url", "نظام-ر-ج-ب": "rgb", "نظام-ر-ج-ب-ا": "rgba",
        "حساب": "calc", "دالة-متغير": "var", "تدوير": "rotate",
        "تكبير": "scale", "تغبيش": "blur",
    }

    _TS_KEYWORD_MAP = {
        "متغير": "var", "دع": "let", "ثابت": "const",
    }

    _LITERAL_MAP = {
        "صحيح": "true", "خاطئ": "false", "غير-موجود": "null",
        "غير-معرف": "undefined", "هذا": "this", "ليس-رقم": "NaN",
        "الوثيقة": "document", "النافذة": "window",
    }

    _BUILTIN_CALLEE_MAP = {
        "المراقب.اطبع": "console.log", "اطبع": "console.log",
        "تنبيه": "alert", "ادخل": "prompt",
    }

    _PROPERTY_NAME_MAP = {
        "اطبع": "log", "عند-الحدث": "addEventListener",
        "استمع-للحدث": "addEventListener", "النص-الداخلي": "innerText",
        "التنسيق": "style",
    }
    
    _CSS_COLOR_NAME_MAP = {
    "احمر": "red", "ازرق": "blue", "اخضر": "green", "اصفر": "yellow",
    "اسود": "black", "ابيض": "white", "رمادي": "gray",
    "برتقالي": "orange", "بنفسجي": "purple", "وردي": "pink", "بني": "brown",
}

    _CSS_PSEUDO_CLASS_MAP = {
        "حوم": "hover", "نشط": "active", "تركيز": "focus", "تم-زيارته": "visited",
        "مفعل": "enabled", "معطل": "disabled", "محدد": "checked",
        "قبل": "before", "بعد": "after", "نص-مؤقت": "placeholder", "تحديد": "selection",
    }

    def __init__(self):
        self.html_lines = []
        self.css_lines = []
        self.js_lines = []

    # ── أدوات مساعدة عامة ────────────────────────────────────────────────
    def _resolve_tag_name(self, original_name: str) -> str:
        return self._HTML_TAG_MAP.get(original_name, f"ar-{original_name}")
    def _normalize_digits(self, text: str) -> str:
        return text.translate(self._ARABIC_DIGIT_MAP)

    # ── نقطة الدخول ───────────────────────────────────────────────────────

    def visit_ProgramNode(self, node):
        for child in node.children:
            self._dispatch_top_level(child)

    def _dispatch_top_level(self, node):
        """توجيه كل عقدة من المستوى الأعلى لمخزنها الصحيح حسب نوعها."""
        result = node.accept(self)
        if not result:
            return
        if isinstance(node, (TagNode, SelfClosingTagNode)):
            self.html_lines.append(result)
        elif isinstance(node, CssRuleNode):
            self.css_lines.append(result)
        else:
            self.js_lines.append(result)

    def get_html(self) -> str:
        body = "\n".join(self.html_lines)
        return (
            "<!DOCTYPE html>\n"
            "<html lang=\"ar\" dir=\"rtl\">\n"
            "<head>\n"
            "    <meta charset=\"UTF-8\">\n"
            "    <link rel=\"stylesheet\" href=\"output.css\">\n"
            "</head>\n"
            "<body>\n"
            f"{body}\n"
            "    <script src=\"output.js\"></script>\n"
            "</body>\n"
            "</html>\n"
        )
    def _translate_css_raw_value(self, raw_text: str) -> str:
        if raw_text in self._CSS_VALUE_MAP:
            return self._CSS_VALUE_MAP[raw_text]

        if raw_text in self._CSS_COLOR_NAME_MAP:
            return self._CSS_COLOR_NAME_MAP[raw_text]

        for arabic_suffix, real_suffix in self._CSS_UNIT_SUFFIX_MAP.items():
            if raw_text.endswith(arabic_suffix):
                number_part = raw_text[: -len(arabic_suffix)]
                return f"{self._normalize_digits(number_part)}{real_suffix}"

        if raw_text.startswith('"') or raw_text.startswith("'"):
            return raw_text

        return self._normalize_digits(raw_text)
    def get_css(self) -> str:
        return "\n\n".join(self.css_lines) + ("\n" if self.css_lines else "")

    def get_js(self) -> str:
        return "\n".join(self.js_lines) + ("\n" if self.js_lines else "")

    def write_files(self, output_dir: str = "."):
        os.makedirs(output_dir, exist_ok=True)
        with open(os.path.join(output_dir, "output.html"), "w", encoding="utf-8") as f:
            f.write(self.get_html())
        with open(os.path.join(output_dir, "output.css"), "w", encoding="utf-8") as f:
            f.write(self.get_css())
        with open(os.path.join(output_dir, "output.js"), "w", encoding="utf-8") as f:
            f.write(self.get_js())

    # ── HTML ──────────────────────────────────────────────────────────────

    def visit_TagNode(self, node):
        tag_name = self._resolve_tag_name(node.tag_name)
        attrs = self._render_attributes(node.attributes)
        inner_parts = []
        for child in node.children:
            if isinstance(child, (TagNode, SelfClosingTagNode, TextNode)):
                inner_parts.append(child.accept(self))
            else:
                self._dispatch_top_level(child)
        inner = " ".join(p for p in inner_parts if p)
        return f"<{tag_name}{attrs}>{inner}</{tag_name}>"

    def visit_SelfClosingTagNode(self, node):
        tag_name = self._resolve_tag_name(node.tag_name)
        attrs = self._render_attributes(node.attributes)
        return f"<{tag_name}{attrs} />"

    def visit_TextNode(self, node):
        return node.content

    def visit_AttributeNode(self, node):
        # لا تُستدعى مباشرة عبر accept() — تُقرأ كبيانات خام في _render_attributes
        return f'{node.kind}="{node.value}"'

    def _render_attributes(self, attributes):
        if not attributes:
            return ""
        return " " + " ".join(f'{a.kind}="{a.value}"' for a in attributes)

    # ── CSS ───────────────────────────────────────────────────────────────

    def visit_CssRuleNode(self, node):
        selector = node.selector.accept(self) if node.selector else ""
        decls = node.declaration_list.accept(self) if node.declaration_list else ""
        if not decls.strip():
            return f"{selector} {{\n}}"
        return f"{selector} {{\n{decls}\n}}"

    def visit_CssSelectorNode(self, node):
        if node.kind == SelectorKind.ID:
            base = f"#{node.name}"
        elif node.kind == SelectorKind.CLASS:
            base = f".{node.name}"
        elif node.kind == SelectorKind.MEDIA:
            return f"@media {node.name}"
        else:
            base = self._resolve_tag_name(node.name)

        if node.pseudo_class:
            real_pseudo = self._CSS_PSEUDO_CLASS_MAP.get(node.pseudo_class, node.pseudo_class)
            return f"{base}:{real_pseudo}"
        return base
    
    def visit_CssDeclarationListNode(self, node):
        lines = [decl.accept(self) for decl in node.declarations]
        return "\n".join(f"{self.INDENT}{line}" for line in lines)

    def visit_CssDeclarationNode(self, node):
        prop = self._CSS_PROPERTY_MAP.get(node.property_name, node.property_name)
        value = node.value.accept(self) if node.value else ""
        return f"{prop}: {value};"

    def visit_CssValueNode(self, node):
        if node.is_function and node.function_node:
            return node.function_node.accept(self)
        return self._translate_css_raw_value(node.raw_text)

    def visit_CssFunctionValueNode(self, node):
        fn_name = self._CSS_FUNCTION_MAP.get(node.function_name, node.function_name)
        args = ", ".join(arg.accept(self) for arg in node.arguments)
        return f"{fn_name}({args})"

    

    # ── التصريحات (TS/JS) ────────────────────────────────────────────────

    def visit_TsTypedDeclarationNode(self, node):
        keyword = self._TS_KEYWORD_MAP.get(node.keyword, node.keyword)
        init = f" = {node.initializer.accept(self)}" if node.initializer else ""
        return f"{keyword} {node.name}{init};"

    def visit_JsVariableDeclarationNode(self, node):
        keyword = self._TS_KEYWORD_MAP.get(node.keyword, node.keyword)
        init = f" = {node.initializer.accept(self)}" if node.initializer else ""
        return f"{keyword} {node.name}{init};"

    def visit_JsAssignmentStatementNode(self, node):
        value = node.value.accept(self) if node.value else ""
        return f"{node.target} {node.operator} {value};"

    def visit_JsIfStatementNode(self, node):
        cond = node.condition.accept(self) if node.condition else ""
        then_code = node.then_branch.accept(self) if node.then_branch else "{}"
        code = f"if ({cond}) {then_code}"
        if node.else_branch:
            code += f" else {node.else_branch.accept(self)}"
        return code

    def visit_JsForLoopNode(self, node):
        body = node.body.accept(self) if node.body else "{}"
        if node.loop_kind == "classic":
            init = node.init.accept(self).rstrip(";") if node.init else ""
            cond = node.condition.accept(self) if node.condition else ""
            update = node.update.accept(self).rstrip(";") if node.update else ""
            return f"for ({init}; {cond}; {update}) {body}"
        keyword = "of" if node.loop_kind == "of" else "in"
        iterable = node.iterable.accept(self) if node.iterable else ""
        return f"for (const {node.iterator} {keyword} {iterable}) {body}"

    def visit_JsWhileLoopNode(self, node):
        cond = node.condition.accept(self) if node.condition else ""
        body = node.body.accept(self) if node.body else "{}"
        return f"while ({cond}) {body}"

    def visit_JsFunctionDeclarationNode(self, node):
        params = ", ".join(node.params) if node.params else ""
        body = node.body.accept(self) if node.body else "{}"
        return f"function {node.name}({params}) {body}"

    def visit_JsReturnStatementNode(self, node):
        if node.value:
            return f"return {node.value.accept(self)};"
        return "return;"

    def visit_JsInterfaceDeclarationNode(self, node):
        # الواجهات (interfaces) مفهوم خاص بـ TypeScript وقت الترجمة فقط؛
        # لا وجود لها في JS الفعلي، فلا تُولّد أي كود.
        return ""

    def visit_JsTryCatchNode(self, node):
        try_code = node.try_block.accept(self) if node.try_block else "{}"
        catch_code = node.catch_block.accept(self) if node.catch_block else "{}"
        code = f"try {try_code} catch ({node.catch_param}) {catch_code}"
        if node.finally_block:
            code += f" finally {node.finally_block.accept(self)}"
        return code

    def visit_JsExpressionStatementNode(self, node):
        expr = node.expression.accept(self) if node.expression else ""
        return f"{expr};"

    def visit_JsBuiltInCallNode(self, node):
        callee = self._BUILTIN_CALLEE_MAP.get(node.callee, node.callee)
        args = ", ".join(arg.accept(self) for arg in node.arguments)
        return f"{callee}({args});"

    def visit_JsBlockNode(self, node):
        lines = [s.accept(self) for s in node.statements if s is not None]
        lines = [l for l in lines if l]
        if not lines:
            return "{}"
        indented = "\n".join(f"{self.INDENT}{line}" for line in lines)
        return f"{{\n{indented}\n}}"

    # ── التعبيرات (Expressions) ──────────────────────────────────────────

    def visit_JsExpressionNode(self, node):
        if not node.left:
            return ""
        left_code = node.left.accept(self)

        if not node.operator or not node.right:
            return left_code

        op = node.operator

        if op == "()":
            return f"{left_code}{node.right.accept(self)}"

        if op == ".":
            prop = node.right.value if node.right.kind == "identifier" else node.right.accept(self)
            real_prop = self._PROPERTY_NAME_MAP.get(prop, prop)
            return f"{left_code}.{real_prop}"

        if op == "[]":
            return f"{left_code}[{node.right.accept(self)}]"

        right_code = node.right.accept(self)
        return f"{left_code} {op} {right_code}"

    def visit_JsPrimaryNode(self, node):
        if node.kind == "identifier":
            return node.value or ""

        if node.kind == "number":
            return self._normalize_digits(node.value or "0")

        if node.kind == "string":
            escaped = (node.value or "").replace("\\", "\\\\").replace('"', '\\"')
            return f'"{escaped}"'

        if node.kind == "boolean":
            return self._LITERAL_MAP.get(node.value, node.value)

        if node.kind in ("null", "undefined", "nan", "this", "document", "window"):
            return self._LITERAL_MAP.get(node.value, node.value)

        if node.kind == "array":
            elements = [el.accept(self) for el in (node.elements or [])]
            return f"[{', '.join(elements)}]"

        if node.kind == "object":
            pairs = [f"{k}: {v.accept(self)}" for k, v in (node.pairs or [])]
            return f"{{ {', '.join(pairs)} }}"

        if node.kind == "paren":
            inner = "".join(el.accept(self) for el in (node.elements or []))
            return f"({inner})"

        if node.kind == "call":
            args = [el.accept(self) for el in (node.elements or [])]
            return f"({', '.join(args)})"

        return node.value or ""