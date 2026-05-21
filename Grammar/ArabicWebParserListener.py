# Generated from ArabicWebParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ArabicWebParser import ArabicWebParser
else:
    from ArabicWebParser import ArabicWebParser

# This class defines a complete listener for a parse tree produced by ArabicWebParser.
class ArabicWebParserListener(ParseTreeListener):

    # Enter a parse tree produced by ArabicWebParser#document.
    def enterDocument(self, ctx:ArabicWebParser.DocumentContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#document.
    def exitDocument(self, ctx:ArabicWebParser.DocumentContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#element.
    def enterElement(self, ctx:ArabicWebParser.ElementContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#element.
    def exitElement(self, ctx:ArabicWebParser.ElementContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#tagElement.
    def enterTagElement(self, ctx:ArabicWebParser.TagElementContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#tagElement.
    def exitTagElement(self, ctx:ArabicWebParser.TagElementContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#statement.
    def enterStatement(self, ctx:ArabicWebParser.StatementContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#statement.
    def exitStatement(self, ctx:ArabicWebParser.StatementContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#mediaRule.
    def enterMediaRule(self, ctx:ArabicWebParser.MediaRuleContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#mediaRule.
    def exitMediaRule(self, ctx:ArabicWebParser.MediaRuleContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#mediaQueryList.
    def enterMediaQueryList(self, ctx:ArabicWebParser.MediaQueryListContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#mediaQueryList.
    def exitMediaQueryList(self, ctx:ArabicWebParser.MediaQueryListContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#mediaQuery.
    def enterMediaQuery(self, ctx:ArabicWebParser.MediaQueryContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#mediaQuery.
    def exitMediaQuery(self, ctx:ArabicWebParser.MediaQueryContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#mediaExpr.
    def enterMediaExpr(self, ctx:ArabicWebParser.MediaExprContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#mediaExpr.
    def exitMediaExpr(self, ctx:ArabicWebParser.MediaExprContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#ruleset.
    def enterRuleset(self, ctx:ArabicWebParser.RulesetContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#ruleset.
    def exitRuleset(self, ctx:ArabicWebParser.RulesetContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#selectorList.
    def enterSelectorList(self, ctx:ArabicWebParser.SelectorListContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#selectorList.
    def exitSelectorList(self, ctx:ArabicWebParser.SelectorListContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#selector.
    def enterSelector(self, ctx:ArabicWebParser.SelectorContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#selector.
    def exitSelector(self, ctx:ArabicWebParser.SelectorContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#combinator.
    def enterCombinator(self, ctx:ArabicWebParser.CombinatorContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#combinator.
    def exitCombinator(self, ctx:ArabicWebParser.CombinatorContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#compoundSelector.
    def enterCompoundSelector(self, ctx:ArabicWebParser.CompoundSelectorContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#compoundSelector.
    def exitCompoundSelector(self, ctx:ArabicWebParser.CompoundSelectorContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#simpleSelector.
    def enterSimpleSelector(self, ctx:ArabicWebParser.SimpleSelectorContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#simpleSelector.
    def exitSimpleSelector(self, ctx:ArabicWebParser.SimpleSelectorContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#pseudoClass.
    def enterPseudoClass(self, ctx:ArabicWebParser.PseudoClassContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#pseudoClass.
    def exitPseudoClass(self, ctx:ArabicWebParser.PseudoClassContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#pseudoElement.
    def enterPseudoElement(self, ctx:ArabicWebParser.PseudoElementContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#pseudoElement.
    def exitPseudoElement(self, ctx:ArabicWebParser.PseudoElementContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#declarationList.
    def enterDeclarationList(self, ctx:ArabicWebParser.DeclarationListContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#declarationList.
    def exitDeclarationList(self, ctx:ArabicWebParser.DeclarationListContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#declaration.
    def enterDeclaration(self, ctx:ArabicWebParser.DeclarationContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#declaration.
    def exitDeclaration(self, ctx:ArabicWebParser.DeclarationContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#exprModifier.
    def enterExprModifier(self, ctx:ArabicWebParser.ExprModifierContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#exprModifier.
    def exitExprModifier(self, ctx:ArabicWebParser.ExprModifierContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#property.
    def enterProperty(self, ctx:ArabicWebParser.PropertyContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#property.
    def exitProperty(self, ctx:ArabicWebParser.PropertyContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#value.
    def enterValue(self, ctx:ArabicWebParser.ValueContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#value.
    def exitValue(self, ctx:ArabicWebParser.ValueContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#expr.
    def enterExpr(self, ctx:ArabicWebParser.ExprContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#expr.
    def exitExpr(self, ctx:ArabicWebParser.ExprContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#term.
    def enterTerm(self, ctx:ArabicWebParser.TermContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#term.
    def exitTerm(self, ctx:ArabicWebParser.TermContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#dimension.
    def enterDimension(self, ctx:ArabicWebParser.DimensionContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#dimension.
    def exitDimension(self, ctx:ArabicWebParser.DimensionContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#keywordValue.
    def enterKeywordValue(self, ctx:ArabicWebParser.KeywordValueContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#keywordValue.
    def exitKeywordValue(self, ctx:ArabicWebParser.KeywordValueContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#functionCall.
    def enterFunctionCall(self, ctx:ArabicWebParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#functionCall.
    def exitFunctionCall(self, ctx:ArabicWebParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#functionName.
    def enterFunctionName(self, ctx:ArabicWebParser.FunctionNameContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#functionName.
    def exitFunctionName(self, ctx:ArabicWebParser.FunctionNameContext):
        pass


    # Enter a parse tree produced by ArabicWebParser#arguments.
    def enterArguments(self, ctx:ArabicWebParser.ArgumentsContext):
        pass

    # Exit a parse tree produced by ArabicWebParser#arguments.
    def exitArguments(self, ctx:ArabicWebParser.ArgumentsContext):
        pass



del ArabicWebParser