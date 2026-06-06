"""
test_parser.py
──────────────
Parses a .arweb file and prints the parse tree.

Usage:
    python test_parser.py tests/sample.arweb
"""

import sys
import os

sys.path.insert(0, os.path.join(os.path.dirname(__file__), 'generated'))

from antlr4 import CommonTokenStream, FileStream, ParseTreeWalker
from Grammar.ArabicHtmlLexer import ArabicHtmlLexer
from Grammar.ArabicHtmlParser import ArabicHtmlParser

def test(filepath):
    print(f"\n{'─'*60}")
    print(f"  File : {filepath}")
    print(f"{'─'*60}")

    input_stream = FileStream(filepath, encoding='utf-8')
    lexer        = ArabicHtmlLexer(input_stream)
    stream       = CommonTokenStream(lexer)
    parser       = ArabicHtmlParser(stream)

    tree = parser.program()

    errors = parser.getNumberOfSyntaxErrors()
    if errors > 0:
        print(f"  ✗  {errors} syntax error(s) found")
    else:
        print(f"  ✓  Parsed successfully — no syntax errors")
        print(f"\n  Parse Tree:")
        print(f"  {tree.toStringTree(recog=parser)}")

    print(f"{'─'*60}\n")

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("Usage: python test_parser.py <file.arweb>")
        sys.exit(1)
    test(sys.argv[1])