# Generated from ArabicHtmlLexer.g4 by ANTLR 4.13.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


if "." in __name__:
    from .ArabicLexerBase import ArabicLexerBase
else:
    from Lexer.ArabicLexerBase import ArabicLexerBase

def serializedATN():
    return [
        4,0,5,55,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,1,0,1,0,1,0,1,0,5,0,20,8,0,10,0,12,0,23,9,0,1,0,1,0,1,1,1,
        1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,3,4,3,38,8,3,11,3,12,3,39,1,
        4,4,4,43,8,4,11,4,12,4,44,1,4,1,4,1,5,1,5,1,6,4,6,52,8,6,11,6,12,
        6,53,0,0,7,1,1,3,2,5,3,7,4,9,5,11,0,13,0,1,0,4,2,0,10,10,13,13,1,
        0,60,60,3,0,9,10,13,13,32,32,1,0,1569,1610,56,0,1,1,0,0,0,0,3,1,
        0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,1,15,1,0,0,0,3,26,1,0,
        0,0,5,32,1,0,0,0,7,37,1,0,0,0,9,42,1,0,0,0,11,48,1,0,0,0,13,51,1,
        0,0,0,15,16,5,47,0,0,16,17,5,47,0,0,17,21,1,0,0,0,18,20,8,0,0,0,
        19,18,1,0,0,0,20,23,1,0,0,0,21,19,1,0,0,0,21,22,1,0,0,0,22,24,1,
        0,0,0,23,21,1,0,0,0,24,25,6,0,0,0,25,2,1,0,0,0,26,27,5,60,0,0,27,
        28,5,47,0,0,28,29,1,0,0,0,29,30,3,13,6,0,30,31,5,62,0,0,31,4,1,0,
        0,0,32,33,5,60,0,0,33,34,3,13,6,0,34,35,5,62,0,0,35,6,1,0,0,0,36,
        38,8,1,0,0,37,36,1,0,0,0,38,39,1,0,0,0,39,37,1,0,0,0,39,40,1,0,0,
        0,40,8,1,0,0,0,41,43,7,2,0,0,42,41,1,0,0,0,43,44,1,0,0,0,44,42,1,
        0,0,0,44,45,1,0,0,0,45,46,1,0,0,0,46,47,6,4,0,0,47,10,1,0,0,0,48,
        49,7,3,0,0,49,12,1,0,0,0,50,52,3,11,5,0,51,50,1,0,0,0,52,53,1,0,
        0,0,53,51,1,0,0,0,53,54,1,0,0,0,54,14,1,0,0,0,5,0,21,39,44,53,1,
        6,0,0
    ]

class ArabicHtmlLexer(ArabicLexerBase):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    LINE_COMMENT = 1
    CLOSE_TAG = 2
    OPEN_TAG = 3
    TEXT = 4
    WS = 5

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
 ]

    symbolicNames = [ "<INVALID>",
            "LINE_COMMENT", "CLOSE_TAG", "OPEN_TAG", "TEXT", "WS" ]

    ruleNames = [ "LINE_COMMENT", "CLOSE_TAG", "OPEN_TAG", "TEXT", "WS", 
                  "ARABIC_LETTER", "ARABIC_ID" ]

    grammarFileName = "ArabicHtmlLexer.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


