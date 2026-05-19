# Generated from ArabicHtmlParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ArabicHtmlParser import ArabicHtmlParser
else:
    from ArabicHtmlParser import ArabicHtmlParser

# This class defines a complete generic visitor for a parse tree produced by ArabicHtmlParser.

class ArabicHtmlParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ArabicHtmlParser#document.
    def visitDocument(self, ctx:ArabicHtmlParser.DocumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#element.
    def visitElement(self, ctx:ArabicHtmlParser.ElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#tagElement.
    def visitTagElement(self, ctx:ArabicHtmlParser.TagElementContext):
        return self.visitChildren(ctx)



del ArabicHtmlParser