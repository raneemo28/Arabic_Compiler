// Generated from ArabicWebParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArabicWebParser}.
 */
public interface ArabicWebParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(ArabicWebParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(ArabicWebParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ArabicWebParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ArabicWebParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#tagElement}.
	 * @param ctx the parse tree
	 */
	void enterTagElement(ArabicWebParser.TagElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#tagElement}.
	 * @param ctx the parse tree
	 */
	void exitTagElement(ArabicWebParser.TagElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ArabicWebParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ArabicWebParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#mediaRule}.
	 * @param ctx the parse tree
	 */
	void enterMediaRule(ArabicWebParser.MediaRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#mediaRule}.
	 * @param ctx the parse tree
	 */
	void exitMediaRule(ArabicWebParser.MediaRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void enterMediaQueryList(ArabicWebParser.MediaQueryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void exitMediaQueryList(ArabicWebParser.MediaQueryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterMediaQuery(ArabicWebParser.MediaQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitMediaQuery(ArabicWebParser.MediaQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#mediaExpr}.
	 * @param ctx the parse tree
	 */
	void enterMediaExpr(ArabicWebParser.MediaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#mediaExpr}.
	 * @param ctx the parse tree
	 */
	void exitMediaExpr(ArabicWebParser.MediaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterRuleset(ArabicWebParser.RulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitRuleset(ArabicWebParser.RulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void enterSelectorList(ArabicWebParser.SelectorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void exitSelectorList(ArabicWebParser.SelectorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ArabicWebParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ArabicWebParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinator(ArabicWebParser.CombinatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinator(ArabicWebParser.CombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#compoundSelector}.
	 * @param ctx the parse tree
	 */
	void enterCompoundSelector(ArabicWebParser.CompoundSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#compoundSelector}.
	 * @param ctx the parse tree
	 */
	void exitCompoundSelector(ArabicWebParser.CompoundSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(ArabicWebParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(ArabicWebParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#idName}.
	 * @param ctx the parse tree
	 */
	void enterIdName(ArabicWebParser.IdNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#idName}.
	 * @param ctx the parse tree
	 */
	void exitIdName(ArabicWebParser.IdNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(ArabicWebParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(ArabicWebParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClass(ArabicWebParser.PseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClass(ArabicWebParser.PseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#pseudoElement}.
	 * @param ctx the parse tree
	 */
	void enterPseudoElement(ArabicWebParser.PseudoElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#pseudoElement}.
	 * @param ctx the parse tree
	 */
	void exitPseudoElement(ArabicWebParser.PseudoElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(ArabicWebParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(ArabicWebParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ArabicWebParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ArabicWebParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#exprModifier}.
	 * @param ctx the parse tree
	 */
	void enterExprModifier(ArabicWebParser.ExprModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#exprModifier}.
	 * @param ctx the parse tree
	 */
	void exitExprModifier(ArabicWebParser.ExprModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ArabicWebParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ArabicWebParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ArabicWebParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ArabicWebParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ArabicWebParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ArabicWebParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ArabicWebParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ArabicWebParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(ArabicWebParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(ArabicWebParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#keywordValue}.
	 * @param ctx the parse tree
	 */
	void enterKeywordValue(ArabicWebParser.KeywordValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#keywordValue}.
	 * @param ctx the parse tree
	 */
	void exitKeywordValue(ArabicWebParser.KeywordValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ArabicWebParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ArabicWebParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(ArabicWebParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(ArabicWebParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicWebParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ArabicWebParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicWebParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ArabicWebParser.ArgumentsContext ctx);
}