"""
الزائر الرابع: مولد الكود الحقيقي (CodeGeneratorVisitor)
النسخة النهائية - جميع المعرّفات تُحوَّل بشكل متناسق عبر سجل موحد.
"""
import os
from AST.visitor_interface import ASTVisitor
from AST.ast_nodes import (
    TagNode, SelfClosingTagNode, TextNode,
    CssRuleNode, CssSelectorNode, SelectorKind,
)


class CodeGeneratorVisitor(ASTVisitor):
    INDENT = "    "

    _ARABIC_DIGIT_MAP = str.maketrans("٠١٢٣٤٥٦٧٨٩", "0123456789")

    # ── ✅ Dynamic Arabic → Latin transliteration ────────────────────
    _ARABIC_TO_LATIN = {
        'ا': 'a', 'أ': 'a', 'إ': 'e', 'آ': 'aa', 'ب': 'b', 'ت': 't',
        'ث': 'th', 'ج': 'j', 'ح': 'h', 'خ': 'kh', 'د': 'd', 'ذ': 'dh',
        'ر': 'r', 'ز': 'z', 'س': 's', 'ش': 'sh', 'ص': 's', 'ض': 'd',
        'ط': 't', 'ظ': 'z', 'ع': 'a', 'غ': 'gh', 'ف': 'f', 'ق': 'q',
        'ك': 'k', 'ل': 'l', 'م': 'm', 'ن': 'n', 'ه': 'h', 'و': 'w',
        'ي': 'y', 'ى': 'a', 'ة': 'h', 'ء': '', 'ئ': 'y', 'ؤ': 'w',
        '٠': '0', '١': '1', '٢': '2', '٣': '3', '٤': '4',
        '٥': '5', '٦': '6', '٧': '7', '٨': '8', '٩': '9',
        'َ': '', 'ُ': '', 'ِ': '', 'ّ': '', 'ْ': '', 'ً': '', 'ٌ': '', 'ٍ': '',
        'ـ': '','-':'_'
    }

    # ── HTML Tags ─────────────────────────────────────────────────────
    _HTML_TAG_MAP = {
        "صورة": "img",       "رابط": "a",         "فقرة": "p",
        "قسم": "div",        "عنوان": "h1",       "نص": "span",
        "زر": "button",      "جدول": "table",     "سطر": "tr",
        "خلية": "td",        "قائمة": "ul",       "عنصر-قائمة": "li",
        "نموذج": "form",     "ادخال": "input",    "خط": "hr",
        "راس": "header",     "تذييل": "footer",   "تنقل": "nav",
    }

    # ── CSS Properties ────────────────────────────────────────────────
    _CSS_PROPERTY_MAP = {
        "عرض": "display",            "موقع": "position",
        "عرض-المساحة": "width",      "طول-المساحة": "height",
        "اقصى-عرض": "max-width",     "اقل-عرض": "min-width",
        "اقصى-طول": "max-height",    "اقل-طول": "min-height",
        "هامش": "margin",            "حشو": "padding",
        "اطار": "border",            "الظهور": "visibility",
        "فائض": "overflow",          "ترتيب-العمق": "z-index",
        "تحجيم-الصندوق": "box-sizing",
        "مرن": "flex",               "اتجاه-المرونة": "flex-direction",
        "لف-المرونة": "flex-wrap",   "نمو-المرونة": "flex-grow",
        "انكماش-المرونة": "flex-shrink",
        "شبكة": "grid",              "قالب-الشبكة": "grid-template",
        "فجوة": "gap",               "ضبط-المحتوى": "justify-content",
        "محاذاة-العناصر": "align-items",
        "محاذاة-ذاتية": "align-self","ترتيب": "order",
        "لون": "color",              "خلفية": "background",
        "صورة-الخلفية": "background-image",
        "لون-الخلفية": "background-color",
        "حجم-الخلفية": "background-size",
        "تكرار-الخلفية": "background-repeat",
        "تثبيت-الخلفية": "background-attachment",
        "قص-الخلفية": "background-clip",
        "شفافية": "opacity",         "ظل-الصندوق": "box-shadow",
        "نوع-الخط": "font-family",   "حجم-الخط": "font-size",
        "ثقل-الخط": "font-weight",   "نمط-الخط": "font-style",
        "محاذاة-النص": "text-align", "زخرفة-النص": "text-decoration",
        "تحويل-النص": "text-transform",
        "ظل-النص": "text-shadow",    "ازاحة-النص": "text-indent",
        "ارتفاع-السطر": "line-height",
        "تباعد-الاحرف": "letter-spacing",
        "تباعد-الكلمات": "word-spacing",
        "المساحة-البيضاء": "white-space",
        "اتجاه-الكتابة": "direction","نمط-الكتابة": "writing-mode",
        "انحناء-الاطار": "border-radius",
        "سمك-الاطار": "border-width","نمط-الاطار": "border-style",
        "لون-الاطار": "border-color","خط-خارجي": "outline",
        "اعلى": "top",               "اسفل": "bottom",
        "يمين": "right",             "يسار": "left",
        "نمط-القائمة": "list-style","دمج-الحدود": "border-collapse",
        "تنسيق-الجدول": "table-layout",
        "مكان-العنوان": "caption-side",
        "مرشح": "filter",            "مرشح-الخلفية": "backdrop-filter",
    }

    # ── CSS Values ────────────────────────────────────────────────────
    _CSS_VALUE_MAP = {
        "وراثة": "inherit",    "اولي": "initial",
        "غير-محدد": "unset",   "لا-شيء": "none",
        "تلقائي": "auto",      "مركز": "center",
        "متصل": "solid",       "مقطع": "dashed",
        "منقط": "dotted",      "مزدوج": "double",
        "مخفي": "hidden",      "كتلة": "block",
        "سطري": "inline",      "مرونة": "flex",
        "مطلق": "absolute",    "نسبي": "relative",
        "مثبت": "fixed",       "لاصق": "sticky",
        "سطر": "row",          "عمود": "column",
        "لف": "wrap",          "عريض": "bold",
        "مائل": "italic",      "مرن": "flex",
        "شبكة": "grid",
    }

    _CSS_UNIT_SUFFIX_MAP = {
        "بكسل": "px",    "ثانية": "s",
        "ملي-ثانية": "ms","درجة": "deg",
    }

    _CSS_FUNCTION_MAP = {
        "رابط": "url",         "نظام-ر-ج-ب": "rgb",
        "نظام-ر-ج-ب-ا": "rgba","حساب": "calc",
        "دالة-متغير": "var",  "تدوير": "rotate",
        "تكبير": "scale",      "تغبيش": "blur",
    }

    _TS_KEYWORD_MAP = {
        "متغير": "var",  "دع": "let",  "ثابت": "const",
    }

    _LITERAL_MAP = {
        "صحيح": "true",     "خاطئ": "false",
        "غير-موجود": "null","غير-معرف": "undefined",
        "هذا": "this",      "ليس-رقم": "NaN",
        "الوثيقة": "document","النافذة": "window",
    }

    _BUILTIN_CALLEE_MAP = {
        "المراقب.اطبع": "console.log", "اطبع": "console.log",
        "تنبيه": "alert",              "ادخل": "prompt",
    }

    # ── ✅ مُوسّع: خصائص DOM + دوال المصفوفات + RegExp ──────────────
    _PROPERTY_NAME_MAP = {
        "اطبع": "log",
        "عند-الحدث": "addEventListener",
        "استمع-للحدث": "addEventListener",
        "النص-الداخلي": "innerText",
        "التنسيق": "style",
        "احضرعنصر": "getElementById",
        "احضرعناصر": "getElementsByClassName",
        "انشئ-عنصر": "createElement",
        "القيمة": "value",
        "طول": "length",
        "ادفع": "push",
        "اختبر": "test",
        "محدد": "checked",
        "نوع": "type",
    }

    _CSS_COLOR_NAME_MAP = {
        "احمر": "red",     "ازرق": "blue",
        "اخضر": "green",   "اصفر": "yellow",
        "اسود": "black",   "ابيض": "white",
        "رمادي": "gray",   "برتقالي": "orange",
        "بنفسجي": "purple","وردي": "pink",
        "بني": "brown",
    }

    _CSS_PSEUDO_CLASS_MAP = {
        "حوم": "hover",        "نشط": "active",
        "تركيز": "focus",      "تم-زيارته": "visited",
        "مفعل": "enabled",     "معطل": "disabled",
        "محدد": "checked",     "قبل": "before",
        "بعد": "after",        "نص-مؤقت": "placeholder",
        "تحديد": "selection",
    }

    # ── ✅ DOM methods that can be accessed via bracket notation ──────
    # إذا كتب المستخدم: الوثيقة["getElementById"]("id")
    # نحولها إلى: document.getElementById("id")
    _BRACKET_TO_DOT_METHODS = {
        "getElementById", "getElementsByClassName", "getElementsByTagName",
        "querySelector", "querySelectorAll", "createElement",
        "addEventListener", "removeEventListener",
        "appendChild", "removeChild", "replaceChild",
        "setAttribute", "getAttribute", "removeAttribute",
        "classList", "style", "innerText", "innerHTML",
    }

    def __init__(self):
        self.html_lines = []
        self.css_lines = []
        self.js_lines = []
        # ✅ السجل الموحد: يضمن أن نفس الاسم العربي → نفس الاسم اللاتيني
        self._id_registry: dict[str, str] = {}

    # ── ✅ ID Transliteration Methods ─────────────────────────────────

    def _transliterate_identifier(self, name: str) -> str:
        """تحويل أي معرّف عربي إلى معرّف لاتيني صالح ديناميكياً."""
        if not name:
            return "unnamed"

        # إذا كان لاتينياً بالكامل، مرّره كما هو
        if all(ord(c) < 128 for c in name):
            return name

        parts = []
        for ch in name:
            if ch in self._ARABIC_TO_LATIN:
                parts.append(self._ARABIC_TO_LATIN[ch])
            elif ch.isalnum() or ch in ('-', '_'):
                parts.append(ch)
            elif ch.isspace():
                parts.append('-')

        latin = ''.join(parts)

        # تنظيف: طيّ الشرطات المتتالية
        while '--' in latin:
            latin = latin.replace('--', '-')
        latin = latin.strip('-_')

        # حماية: إذا بدأ برقم، أضف بادئة
        if latin and latin[0].isdigit():
            latin = 'n_' + latin

        return latin or 'unnamed'

    def _resolve_html_identifier(self, name: str) -> str:
        """
        تحويل معرّف عربي إلى لاتيني مع ذاكرة لضمان التناسق.
        نفس الاسم العربي → نفس الاسم اللاتيني في HTML/CSS/JS.
        """
        if not name:
            return "unnamed"

        # إذا كان لاتينياً بالكامل، مرّره كما هو (بدون تسجيل)
        if all(ord(c) < 128 for c in name):
            return name

        if name in self._id_registry:
            return self._id_registry[name]

        latin = self._transliterate_identifier(name)

        # حماية من التصادم
        if latin in self._id_registry.values():
            original_arabic = next(
                (k for k, v in self._id_registry.items() if v == latin), None
            )
            if original_arabic != name:
                suffix = hex(abs(hash(name)) & 0xFFFF)[2:]
                latin = f"{latin}_{suffix}"

        self._id_registry[name] = latin
        return latin

    # ── أدوات مساعدة ──────────────────────────────────────────────────

    def _resolve_tag_name(self, original_name: str) -> str:
        return self._HTML_TAG_MAP.get(original_name, original_name)

    def _normalize_digits(self, text: str) -> str:
        return text.translate(self._ARABIC_DIGIT_MAP)

    # ── نقطة الدخول ───────────────────────────────────────────────────

    def visit_ProgramNode(self, node):
        for child in node.children:
            self._dispatch_top_level(child)

    def _dispatch_top_level(self, node):
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
                number_part = raw_text[:-len(arabic_suffix)]
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

    # ── HTML ──────────────────────────────────────────────────────────

    def visit_TagNode(self, node):
        tag_name = self._resolve_tag_name(node.tag_name)
        attrs = self._render_attributes(node.attributes)
        inner_parts = []

        for child in node.children:
            if isinstance(child, (TagNode, SelfClosingTagNode, TextNode)):
                inner_parts.append(child.accept(self))
            else:
                self._dispatch_top_level(child)

        # ✅ الحفاظ على المسافات بين النصوص المتتالية فقط
        inner = ""
        for i, part in enumerate(inner_parts):
            if part:
                inner += part
                if i < len(inner_parts) - 1:
                    current_is_text = isinstance(node.children[i], TextNode)
                    next_is_text = isinstance(node.children[i + 1], TextNode)
                    if current_is_text and next_is_text:
                        inner += " "

        return f"<{tag_name}{attrs}>{inner}</{tag_name}>"

    def visit_SelfClosingTagNode(self, node):
        tag_name = self._resolve_tag_name(node.tag_name)
        attrs = self._render_attributes(node.attributes)
        return f"<{tag_name}{attrs} />"

    def visit_TextNode(self, node):
        return node.content

    def visit_AttributeNode(self, node):
        return f'{node.kind}="{node.value}"'

    def _render_attributes(self, attributes):
        if not attributes:
            return ""
        parts = []
        for a in attributes:
            value = a.value
            # ✅ تحويل id و class عبر السجل الموحد
            if a.kind == "id":
                value = self._resolve_html_identifier(value)
            elif a.kind == "class":
                value = " ".join(
                    self._resolve_html_identifier(cls_name)
                    for cls_name in value.split()
                )
            parts.append(f'{a.kind}="{value}"')
        return " " + " ".join(parts)

    # ── CSS ───────────────────────────────────────────────────────────

    def visit_CssRuleNode(self, node):
        selector = node.selector.accept(self) if node.selector else ""
        decls = node.declaration_list.accept(self) if node.declaration_list else ""
        if not decls.strip():
            return f"{selector} {{\n}}"
        return f"{selector} {{\n{decls}\n}}"

    def visit_CssSelectorNode(self, node):
        if node.kind == SelectorKind.ID:
            # ✅ تحويل ID عبر السجل
            base = f"#{self._resolve_html_identifier(node.name)}"
        elif node.kind == SelectorKind.CLASS:
            # ✅ تحويل class عبر السجل
            base = f".{self._resolve_html_identifier(node.name)}"
        elif node.kind == SelectorKind.MEDIA:
            return f"@media {node.name}"
        else:
            base = self._resolve_tag_name(node.name)
        if node.pseudo_class:
            real_pseudo = self._CSS_PSEUDO_CLASS_MAP.get(
                node.pseudo_class, node.pseudo_class
            )
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

    # ── التصريحات (TS/JS) ────────────────────────────────────────────

    def visit_TsTypedDeclarationNode(self, node):
        keyword = self._TS_KEYWORD_MAP.get(node.keyword, node.keyword)
        # ✅ تحويل اسم المتغير
        name = self._resolve_html_identifier(node.name)
        init = f" = {node.initializer.accept(self)}" if node.initializer else ""
        return f"{keyword} {name}{init};"

    def visit_JsVariableDeclarationNode(self, node):
        keyword = self._TS_KEYWORD_MAP.get(node.keyword, node.keyword)
        # ✅ تحويل اسم المتغير
        name = self._resolve_html_identifier(node.name)
        init = f" = {node.initializer.accept(self)}" if node.initializer else ""
        return f"{keyword} {name}{init};"

    def visit_JsAssignmentStatementNode(self, node):
        # ✅ تحويل هدف الإسناد
        target = self._resolve_html_identifier(node.target) if node.target else ""
        value = node.value.accept(self) if node.value else ""
        return f"{target} {node.operator} {value};"

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
        # ✅ تحويل اسم الـ iterator
        iterator = self._resolve_html_identifier(node.iterator) if node.iterator else "item"
        return f"for (const {iterator} {keyword} {iterable}) {body}"

    def visit_JsWhileLoopNode(self, node):
        cond = node.condition.accept(self) if node.condition else ""
        body = node.body.accept(self) if node.body else "{}"
        return f"while ({cond}) {body}"

    def visit_JsFunctionDeclarationNode(self, node):
        # ✅ تحويل اسم الدالة والمعاملات
        name = self._resolve_html_identifier(node.name) if node.name else "anonymous"
        params = ", ".join(
            self._resolve_html_identifier(p) for p in (node.params or [])
        )
        body = node.body.accept(self) if node.body else "{}"
        return f"function {name}({params}) {body}"

    def visit_JsReturnStatementNode(self, node):
        if node.value:
            return f"return {node.value.accept(self)};"
        return "return;"

    def visit_JsInterfaceDeclarationNode(self, node):
        return ""

    def visit_JsTryCatchNode(self, node):
        try_code = node.try_block.accept(self) if node.try_block else "{}"
        # ✅ تحويل معامل catch
        catch_param = self._resolve_html_identifier(node.catch_param) if node.catch_param else "e"
        catch_code = node.catch_block.accept(self) if node.catch_block else "{}"
        code = f"try {try_code} catch ({catch_param}) {catch_code}"
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

    # ── التعبيرات (Expressions) ──────────────────────────────────────

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
            # ✅ تحويل bracket access إلى dot access لـ DOM methods
            right_code = node.right.accept(self)
            # إذا كان الوصول عبر string literal لاسم دالة DOM معروفة
            if node.right.kind == "string" and node.right.value in self._BRACKET_TO_DOT_METHODS:
                return f"{left_code}.{node.right.value}"
            return f"{left_code}[{right_code}]"

        right_code = node.right.accept(self)
        return f"{left_code} {op} {right_code}"

    def visit_JsPrimaryNode(self, node):
        if node.kind == "identifier":
            # ✅ تحويل كل المعرفات عبر السجل الموحد
            return self._resolve_html_identifier(node.value or "")

        if node.kind == "number":
            return self._normalize_digits(node.value or "0")

        if node.kind == "string":
            # ✅ إذا كانت السلسلة تطابق معرّفاً مسجلاً (مثل ID في getElementById)
            # نحولها أيضاً لضمان التطابق مع HTML/CSS
            raw_value = node.value or ""
            if raw_value in self._id_registry:
                escaped = self._id_registry[raw_value].replace("\\", "\\\\").replace('"', '\\"')
                return f'"{escaped}"'
            escaped = raw_value.replace("\\", "\\\\").replace('"', '\\"')
            return f'"{escaped}"'

        if node.kind == "boolean":
            return self._LITERAL_MAP.get(node.value, node.value)

        if node.kind in ("null", "undefined", "nan", "this", "document", "window"):
            return self._LITERAL_MAP.get(node.value, node.value)

        if node.kind == "array":
            elements = [el.accept(self) for el in (node.elements or [])]
            return f"[{', '.join(elements)}]"

        if node.kind == "object":
            # ✅ تحويل مفاتيح الكائن أيضاً
            pairs = []
            for k, v in (node.pairs or []):
                key_translated = self._resolve_html_identifier(k)
                pairs.append(f"{key_translated}: {v.accept(self)}")
            return f"{{ {', '.join(pairs)} }}"

        if node.kind == "paren":
            inner = " ".join(el.accept(self) for el in (node.elements or []))
            return f"({inner})"

        if node.kind == "call":
            args = [el.accept(self) for el in (node.elements or [])]
            return f"({', '.join(args)})"

        return node.value or ""