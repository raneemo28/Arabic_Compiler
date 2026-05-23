# ArabicLexerBase.py
from antlr4 import Lexer

class ArabicLexerBase(Lexer):
    def __init__(self, input=None, output=None):
        if output is not None:
            super().__init__(input, output)
        else:
            super().__init__(input)