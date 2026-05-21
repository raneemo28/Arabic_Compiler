# Generated from ArabicHtmlParser.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,5,28,2,0,7,0,2,1,7,1,2,2,7,2,1,0,5,0,8,8,0,10,0,12,0,11,9,0,
        1,0,1,0,1,1,1,1,3,1,17,8,1,1,2,1,2,5,2,21,8,2,10,2,12,2,24,9,2,1,
        2,1,2,1,2,0,0,3,0,2,4,0,0,27,0,9,1,0,0,0,2,16,1,0,0,0,4,18,1,0,0,
        0,6,8,3,2,1,0,7,6,1,0,0,0,8,11,1,0,0,0,9,7,1,0,0,0,9,10,1,0,0,0,
        10,12,1,0,0,0,11,9,1,0,0,0,12,13,5,0,0,1,13,1,1,0,0,0,14,17,3,4,
        2,0,15,17,5,4,0,0,16,14,1,0,0,0,16,15,1,0,0,0,17,3,1,0,0,0,18,22,
        5,3,0,0,19,21,3,2,1,0,20,19,1,0,0,0,21,24,1,0,0,0,22,20,1,0,0,0,
        22,23,1,0,0,0,23,25,1,0,0,0,24,22,1,0,0,0,25,26,5,2,0,0,26,5,1,0,
        0,0,3,9,16,22
    ]

class ArabicHtmlParser ( Parser ):

    grammarFileName = "ArabicHtmlParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "LINE_COMMENT", "CLOSE_TAG", "OPEN_TAG", 
                      "TEXT", "WS" ]

    RULE_document = 0
    RULE_element = 1
    RULE_tagElement = 2

    ruleNames =  [ "document", "element", "tagElement" ]

    EOF = Token.EOF
    LINE_COMMENT=1
    CLOSE_TAG=2
    OPEN_TAG=3
    TEXT=4
    WS=5

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class DocumentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ArabicHtmlParser.EOF, 0)

        def element(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicHtmlParser.ElementContext)
            else:
                return self.getTypedRuleContext(ArabicHtmlParser.ElementContext,i)


        def getRuleIndex(self):
            return ArabicHtmlParser.RULE_document

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDocument" ):
                listener.enterDocument(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDocument" ):
                listener.exitDocument(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDocument" ):
                return visitor.visitDocument(self)
            else:
                return visitor.visitChildren(self)




    def document(self):

        localctx = ArabicHtmlParser.DocumentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_document)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==3 or _la==4:
                self.state = 6
                self.element()
                self.state = 11
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 12
            self.match(ArabicHtmlParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def tagElement(self):
            return self.getTypedRuleContext(ArabicHtmlParser.TagElementContext,0)


        def TEXT(self):
            return self.getToken(ArabicHtmlParser.TEXT, 0)

        def getRuleIndex(self):
            return ArabicHtmlParser.RULE_element

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElement" ):
                listener.enterElement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElement" ):
                listener.exitElement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElement" ):
                return visitor.visitElement(self)
            else:
                return visitor.visitChildren(self)




    def element(self):

        localctx = ArabicHtmlParser.ElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_element)
        try:
            self.state = 16
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [3]:
                self.enterOuterAlt(localctx, 1)
                self.state = 14
                self.tagElement()
                pass
            elif token in [4]:
                self.enterOuterAlt(localctx, 2)
                self.state = 15
                self.match(ArabicHtmlParser.TEXT)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TagElementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN_TAG(self):
            return self.getToken(ArabicHtmlParser.OPEN_TAG, 0)

        def CLOSE_TAG(self):
            return self.getToken(ArabicHtmlParser.CLOSE_TAG, 0)

        def element(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicHtmlParser.ElementContext)
            else:
                return self.getTypedRuleContext(ArabicHtmlParser.ElementContext,i)


        def getRuleIndex(self):
            return ArabicHtmlParser.RULE_tagElement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTagElement" ):
                listener.enterTagElement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTagElement" ):
                listener.exitTagElement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTagElement" ):
                return visitor.visitTagElement(self)
            else:
                return visitor.visitChildren(self)




    def tagElement(self):

        localctx = ArabicHtmlParser.TagElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_tagElement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.match(ArabicHtmlParser.OPEN_TAG)
            self.state = 22
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==3 or _la==4:
                self.state = 19
                self.element()
                self.state = 24
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 25
            self.match(ArabicHtmlParser.CLOSE_TAG)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





