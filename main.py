import sys
import pprint
from dataclasses import asdict
import os

# Add parent directory to sys.path to resolve sibling imports (Lexer, AST) when run directly
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from antlr4 import CommonTokenStream, FileStream, ParseTreeWalker
from antlr4.error.ErrorListener import ErrorListener

from Grammar.ArabicHtmlLexer   import ArabicHtmlLexer
from Grammar  import ArabicWebParser
from AST.ast_visitor       import ArabicHtmlAstVisitor
from AST.ast_nodes         import ASTNode


# =============================================================================
# Custom error listener — replaces ANTLR's default console output with
# structured messages that include the file name for IDE-friendly errors.
# =============================================================================
class CompilerErrorListener(ErrorListener):
    """Collects lexer/parser errors and re-raises after parsing completes."""

    def __init__(self, source_name: str):
        super().__init__()
        self.source_name = source_name
        self.errors: list[str] = []

    def syntaxError(self, recogniser, offending_symbol, line, column, msg, e):
        self.errors.append(
            f"{self.source_name}:{line}:{column}: error: {msg}"
        )

    def has_errors(self) -> bool:
        return bool(self.errors)

    def report(self) -> None:
        for err in self.errors:
            print(err, file=sys.stderr)


# =============================================================================
# Pipeline stages — each function is a pure transformation step.
# =============================================================================

def stage_lex(source_path: str, error_listener: CompilerErrorListener):
    """
    Stage 1 — Lexing
    Reads the .ahtml file as UTF-8, passes it through ArabicHtmlLexer
    (which inherits from ArabicLexerBase for diacritic stripping),
    and returns a CommonTokenStream ready for the parser.
    """
    print(f"[1/3] Lexing   : {source_path}")
    input_stream = FileStream(source_path, encoding="utf-8")

    lexer = ArabicHtmlLexer(input_stream)
    lexer.removeErrorListeners()          # silence default console listener
    lexer.addErrorListener(error_listener)

    return CommonTokenStream(lexer)


def stage_parse(token_stream: CommonTokenStream,
                error_listener: CompilerErrorListener):
    """
    Stage 2 — Parsing
    Feeds the token stream to ArabicHtmlParser and returns the
    DocumentContext (the root of the ANTLR parse tree).
    """
    print("[2/3] Parsing  : building parse tree")
    parser = ArabicWebParser(token_stream)
    parser.removeErrorListeners()
    parser.addErrorListener(error_listener)

    return parser.document()             # entry rule from ArabicHtmlParser.g4


def stage_build_ast(parse_tree):
    """
    Stage 3 — AST Construction
    Walks the ANTLR parse tree with ArabicHtmlAstVisitor and returns
    a DocumentNode — the root of the typed AST.
    """
    print("[3/3] AST Build: visiting parse tree")
    visitor = ArabicHtmlAstVisitor()
    return visitor.visit(parse_tree)    # returns DocumentNode


# =============================================================================
# Pretty-print helpers
# =============================================================================

def _ast_to_dict(node: ASTNode) -> dict:
    """
    Recursively convert an ASTNode tree to a plain dict suitable for pprint.
    Uses dataclasses.asdict() which handles nested dataclasses automatically.
    A 'type' key is injected so the output identifies each node class by name.
    """
    d = asdict(node)
    d["type"] = type(node).__name__

    # asdict() converts nested dataclasses to plain dicts too, but loses the
    # class name — so we rebuild children lists with type annotations.
    if "children" in d:
        from AST.ast_nodes import TagNode, TextNode, DocumentNode
        original_children = (
            node.children if hasattr(node, "children") else []
        )
        d["children"] = [_ast_to_dict(child) for child in original_children]

    return d

# =============================================================================
# Entry point
# =============================================================================

def main():
    if len(sys.argv) != 2:
        print("Usage: python main.py <file.ahtml>", file=sys.stderr)
        sys.exit(1)

    source_path = sys.argv[1]

    # ── Error listener (shared between lexer and parser) ─────────────────────
    error_listener = CompilerErrorListener(source_path)

    # ── Stage 1 : Lex ────────────────────────────────────────────────────────
    token_stream = stage_lex(source_path, error_listener)

    # ── Stage 2 : Parse ──────────────────────────────────────────────────────
    parse_tree = stage_parse(token_stream, error_listener)

    # Abort early if lex/parse errors were found — the AST would be malformed.
    if error_listener.has_errors():
        print("\n── Compilation failed ──────────────────────────────────────",
              file=sys.stderr)
        error_listener.report()
        sys.exit(1)

    # ── Stage 3 : Build AST ──────────────────────────────────────────────────
    ast_root = stage_build_ast(parse_tree)

    # ── Output ───────────────────────────────────────────────────────────────
    print("\n── AST ─────────────────────────────────────────────────────────")
    pprint.pprint(_ast_to_dict(ast_root), sort_dicts=False, width=72)
    print("────────────────────────────────────────────────────────────────")
    print(f"✓ Compiled successfully: {source_path}")


if __name__ == "__main__":
    main()
