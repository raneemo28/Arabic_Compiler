# Generated from ArabicWebParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ArabicWebParser import ArabicWebParser
else:
    from ArabicWebParser import ArabicWebParser

# This class defines a complete generic visitor for a parse tree produced by ArabicWebParser.

class ArabicWebParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ArabicWebParser#document.
    def visitDocument(self, ctx:ArabicWebParser.DocumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#element.
    def visitElement(self, ctx:ArabicWebParser.ElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#tagElement.
    def visitTagElement(self, ctx:ArabicWebParser.TagElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#statement.
    def visitStatement(self, ctx:ArabicWebParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#mediaRule.
    def visitMediaRule(self, ctx:ArabicWebParser.MediaRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#mediaQueryList.
    def visitMediaQueryList(self, ctx:ArabicWebParser.MediaQueryListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#mediaQuery.
    def visitMediaQuery(self, ctx:ArabicWebParser.MediaQueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#mediaExpr.
    def visitMediaExpr(self, ctx:ArabicWebParser.MediaExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#ruleset.
    def visitRuleset(self, ctx:ArabicWebParser.RulesetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#selectorList.
    def visitSelectorList(self, ctx:ArabicWebParser.SelectorListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#selector.
    def visitSelector(self, ctx:ArabicWebParser.SelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#combinator.
    def visitCombinator(self, ctx:ArabicWebParser.CombinatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#compoundSelector.
    def visitCompoundSelector(self, ctx:ArabicWebParser.CompoundSelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#className.
    def visitClassName(self, ctx:ArabicWebParser.ClassNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#idName.
    def visitIdName(self, ctx:ArabicWebParser.IdNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#simpleSelector.
    def visitSimpleSelector(self, ctx:ArabicWebParser.SimpleSelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#pseudoClass.
    def visitPseudoClass(self, ctx:ArabicWebParser.PseudoClassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#pseudoElement.
    def visitPseudoElement(self, ctx:ArabicWebParser.PseudoElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#declarationList.
    def visitDeclarationList(self, ctx:ArabicWebParser.DeclarationListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#declaration.
    def visitDeclaration(self, ctx:ArabicWebParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#exprModifier.
    def visitExprModifier(self, ctx:ArabicWebParser.ExprModifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#property.
    def visitProperty(self, ctx:ArabicWebParser.PropertyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#value.
    def visitValue(self, ctx:ArabicWebParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#expr.
    def visitExpr(self, ctx:ArabicWebParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#term.
    def visitTerm(self, ctx:ArabicWebParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#dimension.
    def visitDimension(self, ctx:ArabicWebParser.DimensionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#keywordValue.
    def visitKeywordValue(self, ctx:ArabicWebParser.KeywordValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#functionCall.
    def visitFunctionCall(self, ctx:ArabicWebParser.FunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#functionName.
    def visitFunctionName(self, ctx:ArabicWebParser.FunctionNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicWebParser#arguments.
    def visitArguments(self, ctx:ArabicWebParser.ArgumentsContext):
        return self.visitChildren(ctx)



del ArabicWebParser