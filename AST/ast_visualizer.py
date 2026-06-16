import graphviz
from AST.visitor_interface import ASTVisitor


class ASTVisualizerVisitor(ASTVisitor):
    """
    زائر يعبر شجرة الـ AST ويبني ملف Graphviz لتوليد صورة هندسية.
    يطبق واجهة ASTVisitor ويستخدم accept() على كل عقدة.
    """

    def __init__(self):
        self.dot = graphviz.Digraph(
            comment='Arabic Compiler AST',
            format='png'
        )
        # default node style
        self.dot.attr('node',
                      shape='box',
                      style='rounded,filled',
                      fontname='Arial',
                      fillcolor='lightblue')

    def render(self, output_filename='ast_output'):
        """حفظ وفتح الصورة تلقائياً"""
        self.dot.render(output_filename, view=True)
        print(f"✓ AST saved as {output_filename}.png")

    # ── helper ────────────────────────────────────────────────────────────────

    def _node(self, node, label, color='lightblue'):
        """رسم عقدة واحدة بلون ومسمى محددين"""
        self.dot.node(str(id(node)), label,
                      fillcolor=color)

    def _edge(self, parent, child, label=""):
        """رسم سهم من الأب إلى الابن"""
        self.dot.edge(str(id(parent)), str(id(child)), label=label)

    def _add(self, parent, child, label=""):
        """رسم الابن ثم الرابط — الدالة الأساسية من الدليل العملي"""
        if child is not None:
            child.accept(self)          # الابن يرسم نفسه أولاً
            self._edge(parent, child, label)

    def _add_list(self, parent, children, label=""):
        """رسم قائمة من الأبناء"""
        for child in (children or []):
            self._add(parent, child, label)

    # =========================================================================
    # HTML nodes
    # =========================================================================

    def visit_ProgramNode(self, node):
        self._node(node, "Program\nبرنامج", color='#B0C4FF')
        self._add_list(node, node.children)

    def visit_TagNode(self, node):
        self._node(node, f"TagNode\n{node.tag_name}", color='#AEE6D0')
        self._add_list(node, node.attributes, "attr")
        self._add_list(node, node.children)

    def visit_SelfClosingTagNode(self, node):
        self._node(node, f"SelfClose\n{node.tag_name}", color='#AEE6D0')
        self._add_list(node, node.attributes, "attr")

    def visit_AttributeNode(self, node):
        self._node(node,
                   f"Attribute\n{node.kind}=\"{node.value}\"",
                   color='#D4F0E0')

    def visit_TextNode(self, node):
        self._node(node, f"Text\n\"{node.content}\"", color='white')

    # =========================================================================
    # CSS nodes
    # =========================================================================

    def visit_CssRuleNode(self, node):
        self._node(node, "CssRule", color='#FFE4B0')
        self._add(node, node.selector, "selector")
        self._add(node, node.declaration_list, "declarations")

    def visit_CssSelectorNode(self, node):
        self._node(node,
                   f"Selector\n{node.raw_text}",
                   color='#FFD580')

    def visit_CssDeclarationListNode(self, node):
        self._node(node, "DeclarationList", color='#FFE4B0')
        self._add_list(node, node.declarations)

    def visit_CssDeclarationNode(self, node):
        self._node(node,
                   f"Declaration\n{node.property_name}",
                   color='#FFF0C0')
        self._add(node, node.value, "value")

    def visit_CssValueNode(self, node):
        self._node(node,
                   f"CssValue\n{node.raw_text}",
                   color='white')
        if node.function_node:
            self._add(node, node.function_node, "fn")

    def visit_CssFunctionValueNode(self, node):
        self._node(node,
                   f"CssFn\n{node.function_name}()",
                   color='#FFD580')
        self._add_list(node, node.arguments, "arg")

    # =========================================================================
    # TypeScript statement nodes
    # =========================================================================

    def visit_TsTypedDeclarationNode(self, node):
        arr = "[]" if node.is_array else ""
        label = (f"TypedDecl\n"
                 f"{node.keyword} {node.name}\n"
                 f": {node.type_name}{arr}")
        self._node(node, label, color='#C8E6C9')
        if node.initializer:
            self._add(node, node.initializer, "=")

    def visit_JsVariableDeclarationNode(self, node):
        self._node(node,
                   f"VarDecl\n{node.keyword} {node.name}",
                   color='#C8E6C9')
        if node.initializer:
            self._add(node, node.initializer, "=")

    def visit_JsAssignmentStatementNode(self, node):
        self._node(node,
                   f"Assign\n{node.target} {node.operator}",
                   color='#C8E6C9')
        self._add(node, node.value, "value")

    def visit_JsIfStatementNode(self, node):
        self._node(node, "If\nاذا", color='#FFB347')
        self._add(node, node.condition, "condition")
        self._add(node, node.then_branch, "then")
        if node.else_branch:
            self._add(node, node.else_branch, "else")

    def visit_JsForLoopNode(self, node):
        kind = node.loop_kind   # classic / of / in
        self._node(node, f"ForLoop\nحلقة {kind}", color='#FFB347')
        if node.init:
            self._add(node, node.init, "init")
        if node.condition:
            self._add(node, node.condition, "condition")
        if node.update:
            self._add(node, node.update, "update")
        if node.iterable:
            self._add(node, node.iterable, f"{kind}")
        self._add(node, node.body, "body")

    def visit_JsWhileLoopNode(self, node):
        self._node(node, "WhileLoop\nطالما", color='#FFB347')
        self._add(node, node.condition, "condition")
        self._add(node, node.body, "body")

    def visit_JsFunctionDeclarationNode(self, node):
        params = ", ".join(node.params) if node.params else "—"
        self._node(node,
                   f"Function\nدالة {node.name}\nparams: ({params})",
                   color='#CE93D8')
        self._add(node, node.body, "body")

    def visit_JsReturnStatementNode(self, node):
        self._node(node, "Return\nارجع", color='#CE93D8')
        if node.value:
            self._add(node, node.value, "value")

    def visit_JsTryCatchNode(self, node):
        self._node(node,
                   f"TryCatch\nحاول / امسك ({node.catch_param})",
                   color='#EF9A9A')
        self._add(node, node.try_block, "try")
        self._add(node, node.catch_block, "catch")
        if node.finally_block:
            self._add(node, node.finally_block, "finally")

    def visit_JsExpressionStatementNode(self, node):
        self._node(node, "ExprStmt", color='lightblue')
        if node.expression:
            self._add(node, node.expression, "expr")

    def visit_JsBuiltInCallNode(self, node):
        self._node(node,
                   f"BuiltIn\n{node.callee}",
                   color='#F48FB1')
        self._add_list(node, node.arguments, "arg")

    def visit_JsBlockNode(self, node):
        self._node(node, "Block\n", color='#E0E0E0')
        self._add_list(node, node.statements)

    def visit_JsInterfaceDeclarationNode(self, node):
        self._node(node,
                   f"Interface\nواجهة {node.name}",
                   color='#80DEEA')

    # =========================================================================
    # TypeScript expression nodes
    # =========================================================================

    def visit_JsExpressionNode(self, node):
        self._node(node,
                   f"Expr\n{node.operator or '?'}",
                   color='#FFF9C4')
        if node.left:
            self._add(node, node.left, "left")
        if node.right:
            self._add(node, node.right, "right")

    def visit_JsPrimaryNode(self, node):
        if node.kind == 'array':
            self._node(node, "Array ", color='white')
            self._add_list(node, node.elements, "item")
        elif node.kind == 'object':
            self._node(node, "Object { }", color='white')
            for key, val in (node.pairs or []):
                val.accept(self)
                self.dot.edge(str(id(node)), str(id(val)), label=key)
        elif node.kind == 'paren':
            self._node(node, "( )", color='white')
            self._add_list(node, node.elements)
        else:
            self._node(node,
                       f"{node.kind}\n{node.value or ''}",
                       color='white')

    # ── legacy stubs (won't be called but must exist) ─────────────────────────
    def visit_JsStatementNode(self, node): pass
    def visit_DocumentNode(self, node): pass
    def visit_MediaRuleNode(self, node): pass
    def visit_RulesetNode(self, node): pass
