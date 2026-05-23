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

from pydoc import text
import sys
import os

# Add the generated/ folder to the path so Python finds the lexer
sys.path.insert(0, os.path.join(os.path.dirname(__file__), 'generated'))

from antlr4 import CommonTokenStream, FileStream
from ArabicHtmlLexer import ArabicHtmlLexer


# ── Mode names (must match order in your .g4 file) ──────────
MODE_NAMES = {
    0: 'HTML ',
    1: 'CSS  ',
    2: 'JS   ',
}

def mode_name(m):
    return MODE_NAMES.get(m, f'MODE_{m}')


def tokenize(filepath):
    print(f"\n{'─'*60}")
    print(f"  File : {filepath}")
    print(f"{'─'*60}")
    print(f"  {'MODE':<6}  {'TOKEN TYPE':<25}  TEXT")
    print(f"{'─'*60}")

    input_stream = FileStream(filepath, encoding='utf-8')
    lexer = ArabicHtmlLexer(input_stream)

    # Collect all tokens (fills the stream)
    stream = CommonTokenStream(lexer)
    stream.fill()

    errors = 0
    for token in stream.tokens:
        # Skip EOF
        if token.type == -1:
            continue

        # Resolve symbolic name safely
        try:
            sym = lexer.symbolicNames[token.type]
        except IndexError:
            sym = f'TYPE_{token.type}'

        # Flag unknown tokens
        flag = ''
        if sym in ('<INVALID>', 'SKIP', '') or sym.startswith('TYPE_'):
            flag = '  ← ⚠ UNRECOGNISED'
            errors += 1

        text = repr(token.text)
        # Replace the mode_name() call in the print line with this:
        sym = lexer.symbolicNames[token.type]
        
        if sym.startswith('CSS_'):
            mode = 'CSS  '
        elif sym.startswith('JS_'):
            mode = 'JS   '
        else:
            mode = 'HTML '
        
        print(f"  {mode}  {sym:<25}  {text}{flag}")
        
    print(f"{'─'*60}")
    if errors:
        print(f"  ⚠  {errors} unrecognised token(s) found — check grammar rules above.")
    else:
        print(f"  ✓  All tokens recognised successfully.")
    print(f"{'─'*60}\n")


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("Usage: python test_lexer.py <file.arweb>")
        sys.exit(1)
    tokenize(sys.argv[1])
