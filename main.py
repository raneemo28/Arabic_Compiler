
# # main.py
# import sys, pprint, dataclasses
# from antlr4 import CommonTokenStream, FileStream
# from Grammar.ArabicHtmlLexer  import ArabicHtmlLexer
# from Grammar.ArabicHtmlParser import ArabicHtmlParser
# from AST.ast_visitor      import ArabicHtmlAstVisitor
# from AST.ast_nodes        import ASTNode

# def to_dict(node):
#     if not isinstance(node, ASTNode):
#         return str(node)
#     d = {"type": type(node).__name__}
#     for k, v in vars(node).items():       # ← use vars() not dataclasses.asdict()
#         if k in ("line", "column"):
#             d[k] = v
#         elif isinstance(v, list):
#             d[k] = [to_dict(i) if isinstance(i, ASTNode) else i for i in v]
#         elif isinstance(v, ASTNode):
#             d[k] = to_dict(v)
#         else:
#             d[k] = v
#     return d

# source = sys.argv[1] if len(sys.argv) > 1 else "tests/sample.arweb"
# stream = FileStream(source, encoding="utf-8")
# lexer  = ArabicHtmlLexer(stream)
# tokens = CommonTokenStream(lexer)
# parser = ArabicHtmlParser(tokens)
# tree   = parser.program()          # ← entry rule is now `program`

# visitor = ArabicHtmlAstVisitor()
# ast     = visitor.visit(tree)

# pprint.pprint(to_dict(ast), sort_dicts=False, width=80)

import sys
import os

# ── path setup ────────────────────────────────────────────────────────────────
# GRAMMAR_DIR = os.path.join(os.path.dirname(__file__), '..', 'Grammar')
# AST_DIR     = os.path.dirname(__file__)
# sys.path.insert(0, GRAMMAR_DIR)
# sys.path.insert(0, AST_DIR)

from antlr4 import CommonTokenStream, FileStream
from antlr4.error.ErrorListener import ErrorListener

from Grammar.ArabicHtmlLexer   import ArabicHtmlLexer
from Grammar.ArabicHtmlParser  import ArabicHtmlParser
from AST.ast_visitor       import ArabicHtmlAstVisitor
from AST.ast_nodes import ASTNode
from AST.ast_visualizer    import ASTVisualizerVisitor

import pprint


# ── error listener ────────────────────────────────────────────────────────────
class CompilerErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errors = []
    def syntaxError(self, recognizer, offendingSymbol, line, col, msg, e):
        self.errors.append(f"line {line}:{col} {msg}")


# ── to_dict for pprint ────────────────────────────────────────────────────────
def to_dict(node):
    if not isinstance(node, ASTNode):
        return str(node)
    d = {"type": type(node).__name__}
    for k, v in vars(node).items():
        if k in ("line", "column"):
            d[k] = v
        elif isinstance(v, list):
            d[k] = [to_dict(i) if isinstance(i, ASTNode) else i for i in v]
        elif isinstance(v, ASTNode):
            d[k] = to_dict(v)
        else:
            d[k] = v
    return d


# ── main ──────────────────────────────────────────────────────────────────────
def main():
    source = sys.argv[1] if len(sys.argv) > 1 else "tests/sample.arweb"

    # 1. Lex
    stream = FileStream(source, encoding='utf-8')
    error_listener = CompilerErrorListener()

    lexer = ArabicHtmlLexer(stream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(error_listener)

    tokens = CommonTokenStream(lexer)

    # 2. Parse
    parser = ArabicHtmlParser(tokens)
    parser.removeErrorListeners()
    parser.addErrorListener(error_listener)
    parse_tree = parser.program()

    if error_listener.errors:
        for e in error_listener.errors:
            print(f"ERROR: {e}", file=sys.stderr)
        sys.exit(1)

    # 3. Build AST
    visitor = ArabicHtmlAstVisitor()
    
    # test direct call
    
    ast = ArabicHtmlAstVisitor().visit(parse_tree)
    

    # 4. Print as text (pprint)
    pprint.pprint(to_dict(ast), sort_dicts=False, width=80)

    # 5. Draw as Graphviz image
    visualizer = ASTVisualizerVisitor()
    ast.accept(visualizer)
    output_name = os.path.splitext(os.path.basename(source))[0] + '_ast'
    visualizer.render(output_name)


if __name__ == '__main__':
    main()
