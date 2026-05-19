# Generated from ArabicHtmlParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ArabicHtmlParser import ArabicHtmlParser
else:
    from ArabicHtmlParser import ArabicHtmlParser

# This class defines a complete listener for a parse tree produced by ArabicHtmlParser.
class ArabicHtmlParserListener(ParseTreeListener):

    # Enter a parse tree produced by ArabicHtmlParser#document.
    def enterDocument(self, ctx:ArabicHtmlParser.DocumentContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#document.
    def exitDocument(self, ctx:ArabicHtmlParser.DocumentContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#element.
    def enterElement(self, ctx:ArabicHtmlParser.ElementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#element.
    def exitElement(self, ctx:ArabicHtmlParser.ElementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#tagElement.
    def enterTagElement(self, ctx:ArabicHtmlParser.TagElementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#tagElement.
    def exitTagElement(self, ctx:ArabicHtmlParser.TagElementContext):
        pass



del ArabicHtmlParser