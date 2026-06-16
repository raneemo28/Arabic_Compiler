"""
test_lexer.py
─────────────
Tokenizes a .arweb file and prints each token with:
  - its mode (HTML / CSS / JS)
  - its symbolic name
  - its text

Usage:
    python test_lexer.py tests/sample.arweb
"""

import sys
import os

sys.path.insert(0, os.path.join(os.path.dirname(__file__), 'generated'))

from antlr4 import CommonTokenStream, FileStream
from Grammar.ArabicHtmlLexer import ArabicHtmlLexer


def tokenize(filepath):
   

    input_stream = FileStream(filepath, encoding='utf-8')
    lexer = ArabicHtmlLexer(input_stream)

    stream = CommonTokenStream(lexer)
    stream.fill()

    errors = 0
    for token in stream.tokens:
        if token.type == -1:
            continue

        try:
            sym = lexer.symbolicNames[token.type]
        except IndexError:
            sym = f'TYPE_{token.type}'

        flag = ''
        if sym in ('<INVALID>', 'SKIP', '') or sym.startswith('TYPE_'):
            flag = '  ← ⚠ UNRECOGNISED'
            errors += 1

        text = repr(token.text)

        if sym.startswith('CSS_'):
            mode = 'CSS  '
        elif sym.startswith('JS_'):
            mode = 'JS   '
        elif sym.startswith('ATTR_'):
            mode = 'ATTR '
        else:
            mode = 'HTML '

        print(f"  {mode}  {sym:<25}  {text}{flag}")

    print(f"{'─'*60}")
    if errors:
        print(f"  ⚠  {errors} unrecognised token(s) found.")
    else:
        print(f"  ✓  All tokens recognised successfully.")
    print(f"{'─'*60}\n")


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("Usage: python test_lexer.py <file.arweb>")
        sys.exit(1)
    tokenize(sys.argv[1])