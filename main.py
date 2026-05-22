import sys
import pprint
from dataclasses import asdict, is_dataclass
import os

sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from antlr4 import CommonTokenStream, FileStream
from antlr4.error.ErrorListener import ErrorListener

from Grammar.ArabicHtmlLexer import ArabicHtmlLexer
from Grammar.ArabicWebParser import ArabicWebParser
from AST.ast_visitor         import ArabicWebAstVisitor  
from AST.ast_nodes           import ASTNode

class CompilerErrorListener(ErrorListener):

    def __init__(self, source_name: str):
        super().__init__()
        self.source_name = source_name
        self.errors: list[str] = []

    def syntaxError(self, recognizer, offending_symbol, line, column, msg, e):
        self.errors.append(
            f"{self.source_name}:{line}:{column}: error: {msg}"
        )

    def has_errors(self) -> bool:
        return bool(self.errors)

    def report(self) -> None:
        for err in self.errors:
            print(err, file=sys.stderr)


def stage_lex(source_path: str, error_listener: CompilerErrorListener):
    
    print(f"[1/3] Lexing   : {source_path}")
    input_stream = FileStream(source_path, encoding="utf-8")

    lexer = ArabicHtmlLexer(input_stream)
    lexer.removeErrorListeners()          
    lexer.addErrorListener(error_listener)

    return CommonTokenStream(lexer)


def stage_parse(token_stream: CommonTokenStream,
                error_listener: CompilerErrorListener):

    print("[2/3] Parsing  : building parse tree")
    parser = ArabicWebParser(token_stream)
    parser.removeErrorListeners()
    parser.addErrorListener(error_listener)

    return parser.document()            


def stage_build_ast(parse_tree):
\
    print("[3/3] AST Build: visiting parse tree")
    visitor = ArabicWebAstVisitor()
    return visitor.visit(parse_tree)    

def _ast_to_dict(node) -> dict:
    """
    Recursively converts an ASTNode tree into a clean dictionary format.
    Explicitly injects a 'type' key matching the node's Python class name.
    """
    if not is_dataclass(node):
        return node

    result = {"type": type(node).__name__}
    
    for field in node.__dataclass_fields__:
        value = getattr(node, field)
        if field == "children" and isinstance(value, list):
            result["children"] = [_ast_to_dict(child) for child in value]
        elif is_dataclass(value):
            result[field] = _ast_to_dict(value)
        elif isinstance(value, list):
            result[field] = [_ast_to_dict(item) for item in value]
        else:
            result[field] = value

    return result

def main():
    if len(sys.argv) != 2:
        print("Usage: python main.py <file.ahtml>", file=sys.stderr)
        sys.exit(1)

    source_path = sys.argv[1]

    error_listener = CompilerErrorListener(source_path)

    token_stream = stage_lex(source_path, error_listener)

    parse_tree = stage_parse(token_stream, error_listener)

    if error_listener.has_errors():
        print("\n── Compilation failed ──────────────────────────────────────",
              file=sys.stderr)
        error_listener.report()
        sys.exit(1)

    ast_root = stage_build_ast(parse_tree)

    print("\n── AST ─────────────────────────────────────────────────────────")
    pprint.pprint(_ast_to_dict(ast_root), sort_dicts=False, width=72)
    print("────────────────────────────────────────────────────────────────")
    print(f"✓ Compiled successfully: {source_path}")


if __name__ == "__main__":
    main()