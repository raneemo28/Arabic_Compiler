# """
# main.py – Arabic Web Compiler entry point
# ==========================================
# Phase 1 : Lexer   – prints the token table
# Phase 2 : Parser  – builds the parse tree (ANTLR)
# Phase 3 : AST     – converts the parse tree to a typed AST and pretty-prints it

# Usage:
#     python main.py [source_file]          # default: tests/sample.arweb
#     python main.py tests/full_test.arweb  # custom file
# """

# import sys
# import os
# from antlr4 import FileStream, CommonTokenStream, Token
# from antlr4.error.ErrorListener import ErrorListener

# from Grammar.ArabicHtmlLexer import ArabicHtmlLexer
# from Grammar.ArabicHtmlParser import ArabicHtmlParser
# from AST.ast_visitor import ArabicHtmlAstVisitor
# from AST.ast_nodes import (
#     ASTNode,
#     ProgramNode, TagNode, SelfClosingTagNode, TextNode, AttributeNode,
#     CssRuleNode, CssSelectorNode, CssDeclarationListNode, CssDeclarationNode,
#     CssValueNode, CssFunctionValueNode,
#     JsStatementNode, JsBlockNode,
#     JsVariableDeclarationNode, JsAssignmentStatementNode,
#     JsIfStatementNode, JsForLoopNode, JsWhileLoopNode,
#     JsFunctionDeclarationNode, JsReturnStatementNode,
#     JsTryCatchNode, JsExpressionStatementNode, JsBuiltInCallNode,
#     JsExpressionNode, JsPrimaryNode,
# )

# # ─────────────────────────────────────────────────────────────────────────────
# #  Error collector
# # ─────────────────────────────────────────────────────────────────────────────

# class _ErrorCollector(ErrorListener):
#     def __init__(self):
#         super().__init__()
#         self.errors = []

#     def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
#         self.errors.append(f"  السطر {line}:{column}  →  {msg}")


# # ─────────────────────────────────────────────────────────────────────────────
# #  AST pretty-printer  (pure function, no visitor pattern needed here)
# # ─────────────────────────────────────────────────────────────────────────────

# # ANSI colours (disabled automatically when stdout is not a tty)
# _USE_COLOR = sys.stdout.isatty()

# def _c(code: str, text: str) -> str:
#     return f"\033[{code}m{text}\033[0m" if _USE_COLOR else text

# _CYAN   = lambda t: _c("96", t)
# _GREEN  = lambda t: _c("92", t)
# _YELLOW = lambda t: _c("93", t)
# _BLUE   = lambda t: _c("94", t)
# _MAGENTA= lambda t: _c("95", t)
# _GREY   = lambda t: _c("90", t)
# _RED    = lambda t: _c("91", t)
# _BOLD   = lambda t: _c("1",  t)


# def _loc(node: ASTNode) -> str:
#     return _GREY(f"  [{node.line}:{node.column}]")


# def _print_ast(node: ASTNode, indent: int = 0, last: bool = True) -> None:
#     """Recursively pretty-print the AST with box-drawing tree lines."""
#     pad   = "    " * indent
#     branch = "└── " if last else "├── "
#     ext    = "    " if last else "│   "

#     def _head(label: str, detail: str = "") -> None:
#         detail_str = f"  {detail}" if detail else ""
#         print(f"{pad}{branch}{label}{detail_str}{_loc(node)}")

#     # ── HTML ──────────────────────────────────────────────────────
#     if isinstance(node, ProgramNode):
#         print(_BOLD("▶ ProgramNode") + _GREY(f"  ({len(node.children)} top-level items)"))
#         _print_children(node.children, indent, ext)

#     elif isinstance(node, TagNode):
#         attrs = ", ".join(f"{a.kind}={repr(a.value)}" for a in node.attributes)
#         _head(_CYAN(f"<{node.tag_name}>"), _GREEN(attrs) if attrs else "")
#         _print_children(node.children, indent, ext)

#     elif isinstance(node, SelfClosingTagNode):
#         attrs = ", ".join(f"{a.kind}={repr(a.value)}" for a in node.attributes)
#         _head(_CYAN(f"<{node.tag_name}/>"), _GREEN(attrs) if attrs else "")

#     elif isinstance(node, TextNode):
#         _head(_YELLOW(f'Text: {repr(node.content)}'))

#     elif isinstance(node, AttributeNode):
#         _head(_GREEN(f"Attr: {node.kind}={repr(node.value)}"))

#     # ── CSS ───────────────────────────────────────────────────────
#     elif isinstance(node, CssRuleNode):
#         sel = node.selector
#         _head(_BLUE(f"CssRule"), f"selector={sel.kind}:{_BOLD(sel.name)}")
#         if node.declaration_list:
#             _print_children(node.declaration_list.declarations,
#                             indent, ext,
#                             parent_label="declarations")

#     elif isinstance(node, CssDeclarationNode):
#         val_text = node.value.raw_text if node.value else "?"
#         _head(_BLUE("Decl"), f"{_BOLD(node.property_name)}: {val_text}")
#         if node.value and node.value.is_function and node.value.function_node:
#             _print_children([node.value.function_node], indent, ext)

#     elif isinstance(node, CssFunctionValueNode):
#         _head(_BLUE(f"CssFunc: {node.function_name}"),
#               f"{len(node.arguments)} arg(s)")
#         _print_children(node.arguments, indent, ext)

#     # ── JS statements ─────────────────────────────────────────────
#     elif isinstance(node, JsVariableDeclarationNode):
#         _head(_MAGENTA(f"Var({node.keyword})"), _BOLD(node.name))
#         if node.initializer:
#             _print_children([node.initializer], indent, ext)

#     elif isinstance(node, JsAssignmentStatementNode):
#         _head(_MAGENTA(f"Assign"), f"{_BOLD(node.target)} {node.operator}")
#         if node.value:
#             _print_children([node.value], indent, ext)

#     elif isinstance(node, JsIfStatementNode):
#         _head(_MAGENTA("If"))
#         children = []
#         if node.condition:   children.append(("condition", node.condition))
#         if node.then_branch: children.append(("then",      node.then_branch))
#         if node.else_branch: children.append(("else",      node.else_branch))
#         _print_labeled_children(children, indent, ext)

#     elif isinstance(node, JsForLoopNode):
#         _head(_MAGENTA(f"For({node.loop_kind})"),
#               _BOLD(node.iterator) if node.iterator else "")
#         children = []
#         if node.init:      children.append(("init",     node.init))
#         if node.condition: children.append(("cond",     node.condition))
#         if node.update:    children.append(("update",   node.update))
#         if node.iterable:  children.append(("iterable", node.iterable))
#         if node.body:      children.append(("body",     node.body))
#         _print_labeled_children(children, indent, ext)

#     elif isinstance(node, JsWhileLoopNode):
#         _head(_MAGENTA("While"))
#         children = []
#         if node.condition: children.append(("cond", node.condition))
#         if node.body:      children.append(("body", node.body))
#         _print_labeled_children(children, indent, ext)

#     elif isinstance(node, JsFunctionDeclarationNode):
#         params = ", ".join(node.params) if node.params else "—"
#         _head(_MAGENTA(f"Function"), f"{_BOLD(node.name)}({params})")
#         if node.body:
#             _print_children([node.body], indent, ext)

#     elif isinstance(node, JsReturnStatementNode):
#         _head(_MAGENTA("Return"))
#         if node.value:
#             _print_children([node.value], indent, ext)

#     elif isinstance(node, JsTryCatchNode):
#         _head(_MAGENTA("TryCatch"), f"catch({node.catch_param})")
#         children = []
#         if node.try_block:     children.append(("try",     node.try_block))
#         if node.catch_block:   children.append(("catch",   node.catch_block))
#         if node.finally_block: children.append(("finally", node.finally_block))
#         _print_labeled_children(children, indent, ext)

#     elif isinstance(node, JsBuiltInCallNode):
#         _head(_MAGENTA(f"BuiltIn"), f"{_BOLD(node.callee)}(…)")
#         _print_children(node.arguments, indent, ext)

#     elif isinstance(node, JsExpressionStatementNode):
#         _head(_MAGENTA("ExprStmt"))
#         if node.expression:
#             _print_children([node.expression], indent, ext)

#     elif isinstance(node, JsBlockNode):
#         _head(_MAGENTA(f"Block"), f"{len(node.statements)} stmt(s)")
#         _print_children(node.statements, indent, ext)

#     # ── JS expressions ────────────────────────────────────────────
#     # ── JS expressions ────────────────────────────────────────────
#     elif isinstance(node, JsExpressionNode):
#         op = node.operator or "expr"
#         _head(_YELLOW(f"Expr({op}) "))
        
#         # Handle function calls where arguments are stored as a list in node.right
#         if op == "()" and isinstance(node.right, list):
#             for i, arg in enumerate(node.right):
#                 _print_ast(arg, indent + 1, last=(i == len(node.right) - 1))
#         else:
#             children = [c for c in [node.left, node.right] if c is not None]
#             _print_children(children, indent, ext)

#     elif isinstance(node, JsPrimaryNode):
#         val = repr(node.value) if node.value is not None else ""
#         _head(_YELLOW(f"Primary({node.kind})"), val)
#         if node.elements:
#             _print_children(node.elements, indent, ext)
#         if node.pairs:
#             for k, v in node.pairs:
#                 print(f"{pad}{ext}    " + _YELLOW(f"key={repr(k)}"))
#                 _print_ast(v, indent + 2, last=True)

#     else:
#         _head(_RED(type(node).__name__))


# def _print_children(children, indent: int, ext: str,
#                     parent_label: str = "") -> None:
#     if parent_label and children:
#         print(f"{'    ' * (indent+1)}{_GREY(parent_label + ':')}")
#     for i, child in enumerate(children):
#         _print_ast(child, indent + 1, last=(i == len(children) - 1))


# def _print_labeled_children(labeled, indent: int, ext: str) -> None:
#     for i, (label, child) in enumerate(labeled):
#         pad2 = "    " * (indent + 1)
#         br   = "└── " if i == len(labeled) - 1 else "├── "
#         print(f"{pad2}{br}{_GREY(label + ':')}")
#         _print_ast(child, indent + 2, last=True)


# # ─────────────────────────────────────────────────────────────────────────────
# #  Main
# # ─────────────────────────────────────────────────────────────────────────────

# def main():
#     source_file = sys.argv[1] if len(sys.argv) > 1 else "tests/sample.arweb"

#     # ── 1) Read source ────────────────────────────────────────────
#     try:
#         input_stream = FileStream(source_file, encoding='utf-8')
#     except FileNotFoundError:
#         print(f"خطأ: لم يتم العثور على الملف {source_file}")
#         sys.exit(1)

#     print()
#     print(_BOLD("═" * 70))
#     print(_BOLD(f"  المصدر: {source_file}"))
#     print(_BOLD("═" * 70))

#     # ── 2) Lexer phase ────────────────────────────────────────────
#     lexer = ArabicHtmlLexer(input_stream)

#     lex_errors = _ErrorCollector()
#     lexer.removeErrorListeners()
#     lexer.addErrorListener(lex_errors)

#     token_stream = CommonTokenStream(lexer)
#     token_stream.fill()

#     print()
#     print(_BOLD("┌─ المرحلة 1: الماسح المعجمي (Lexer) " + "─" * 32))
#     print(_BOLD(f"│  {'Lexeme (النص)':<28} │ {'Token (نوع الرمز)':<28} │ Line"))
#     print(_BOLD("│  " + "─" * 28 + " │ " + "─" * 28 + " │ ────"))

#     token_count = 0
#     for token in token_stream.tokens:
#         if token.type == Token.EOF:
#             break
#         token_name = lexer.symbolicNames[token.type]
#         lexeme = token.text.replace("\n", "\\n").replace("\t", "\\t")
#         print(f"│  {lexeme:<28} │ {token_name:<28} │ {token.line}")
#         token_count += 1

#     print(f"└─ {_GREY(str(token_count) + ' رمز مُستخرج')}")

#     if lex_errors.errors:
#         print(_RED("  ⚠ أخطاء معجمية:"))
#         for e in lex_errors.errors:
#             print(_RED(e))

#     # ── 3) Parser phase ───────────────────────────────────────────
#     # Reset the token stream so the parser starts from the beginning.
#     token_stream.reset()
#     parser = ArabicHtmlParser(token_stream)

#     parse_errors = _ErrorCollector()
#     parser.removeErrorListeners()
#     parser.addErrorListener(parse_errors)

#     parse_tree = parser.program()

#     print()
#     print(_BOLD("┌─ المرحلة 2: المحلل النحوي (Parser) " + "─" * 32))
#     print(f"│  شجرة التحليل النحوي (ANTLR):")
#     print(f"│  {parse_tree.toStringTree(recog=parser)[:300]}")
#     print(f"└─ {_GREY('اكتمل التحليل النحوي')}")

#     if parse_errors.errors:
#         print(_RED("  ⚠ أخطاء نحوية:"))
#         for e in parse_errors.errors:
#             print(_RED(e))

#     # ── 4) AST phase ──────────────────────────────────────────────
#     print()
#     print(_BOLD("┌─ المرحلة 3: شجرة النحو المجردة (AST) " + "─" * 30))
#     print()

#     visitor = ArabicHtmlAstVisitor()
#     try:
#         ast = visitor.visitProgram(parse_tree)
#         _print_ast(ast)
#     except Exception as exc:
#         print(_RED(f"  ⚠ خطأ في بناء الـ AST: {exc}"))
#         import traceback
#         traceback.print_exc()

#     print()
#     print(_BOLD("└─ " + _GREY("اكتملت جميع المراحل")))
#     print()

#     # Return non-zero exit code if any errors were found
#     if lex_errors.errors or parse_errors.errors:
#         sys.exit(1)


# if __name__ == "__main__":
#     main()

# main.py
import sys, pprint, dataclasses
from antlr4 import CommonTokenStream, FileStream
from Grammar.ArabicHtmlLexer  import ArabicHtmlLexer
from Grammar.ArabicHtmlParser import ArabicHtmlParser
from AST.ast_visitor      import ArabicHtmlAstVisitor
from AST.ast_nodes        import ASTNode

def to_dict(node):
    if not isinstance(node, ASTNode):
        return str(node)
    d = {"type": type(node).__name__}
    for k, v in vars(node).items():       # ← use vars() not dataclasses.asdict()
        if k in ("line", "column"):
            d[k] = v
        elif isinstance(v, list):
            d[k] = [to_dict(i) if isinstance(i, ASTNode) else i for i in v]
        elif isinstance(v, ASTNode):
            d[k] = to_dict(v)
        else:
            d[k] = v
    return d

source = sys.argv[1] if len(sys.argv) > 1 else "tests/sample.arweb"
stream = FileStream(source, encoding="utf-8")
lexer  = ArabicHtmlLexer(stream)
tokens = CommonTokenStream(lexer)
parser = ArabicHtmlParser(tokens)
tree   = parser.program()          # ← entry rule is now `program`

visitor = ArabicHtmlAstVisitor()
ast     = visitor.visit(tree)

pprint.pprint(to_dict(ast), sort_dicts=False, width=80)