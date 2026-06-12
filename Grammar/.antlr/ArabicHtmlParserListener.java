// Generated from c:/Users/ElectoMall/OneDrive/Desktop/projects/MiniProjects/compilers/Arabic_Compiler/Grammar/ArabicHtmlParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArabicHtmlParser}.
 */
public interface ArabicHtmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ArabicHtmlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ArabicHtmlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterIdAttribute(ArabicHtmlParser.IdAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitIdAttribute(ArabicHtmlParser.IdAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterClassAttribute(ArabicHtmlParser.ClassAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitClassAttribute(ArabicHtmlParser.ClassAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code srcAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterSrcAttribute(ArabicHtmlParser.SrcAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code srcAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitSrcAttribute(ArabicHtmlParser.SrcAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hrefAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterHrefAttribute(ArabicHtmlParser.HrefAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hrefAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitHrefAttribute(ArabicHtmlParser.HrefAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentElement}
	 * labeled alternative in {@link ArabicHtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterParentElement(ArabicHtmlParser.ParentElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentElement}
	 * labeled alternative in {@link ArabicHtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitParentElement(ArabicHtmlParser.ParentElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link ArabicHtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(ArabicHtmlParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link ArabicHtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(ArabicHtmlParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(ArabicHtmlParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(ArabicHtmlParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(ArabicHtmlParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(ArabicHtmlParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#arabicKeyword}.
	 * @param ctx the parse tree
	 */
	void enterArabicKeyword(ArabicHtmlParser.ArabicKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#arabicKeyword}.
	 * @param ctx the parse tree
	 */
	void exitArabicKeyword(ArabicHtmlParser.ArabicKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(ArabicHtmlParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(ArabicHtmlParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ArabicHtmlParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ArabicHtmlParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(ArabicHtmlParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(ArabicHtmlParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ArabicHtmlParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ArabicHtmlParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterCssProperty(ArabicHtmlParser.CssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitCssProperty(ArabicHtmlParser.CssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(ArabicHtmlParser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(ArabicHtmlParser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssFunction(ArabicHtmlParser.CssFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssFunction(ArabicHtmlParser.CssFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#tsType}.
	 * @param ctx the parse tree
	 */
	void enterTsType(ArabicHtmlParser.TsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#tsType}.
	 * @param ctx the parse tree
	 */
	void exitTsType(ArabicHtmlParser.TsTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#tsStatement}.
	 * @param ctx the parse tree
	 */
	void enterTsStatement(ArabicHtmlParser.TsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#tsStatement}.
	 * @param ctx the parse tree
	 */
	void exitTsStatement(ArabicHtmlParser.TsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ArabicHtmlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ArabicHtmlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ArabicHtmlParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ArabicHtmlParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(ArabicHtmlParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(ArabicHtmlParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ArabicHtmlParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ArabicHtmlParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(ArabicHtmlParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(ArabicHtmlParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(ArabicHtmlParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(ArabicHtmlParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ArabicHtmlParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ArabicHtmlParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ArabicHtmlParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ArabicHtmlParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ArabicHtmlParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ArabicHtmlParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(ArabicHtmlParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(ArabicHtmlParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ArabicHtmlParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ArabicHtmlParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#builtInCall}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInCall(ArabicHtmlParser.BuiltInCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#builtInCall}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInCall(ArabicHtmlParser.BuiltInCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ArabicHtmlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ArabicHtmlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ArabicHtmlParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ArabicHtmlParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ArabicHtmlParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ArabicHtmlParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ArabicHtmlParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ArabicHtmlParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ArabicHtmlParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ArabicHtmlParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ArabicHtmlParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ArabicHtmlParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ArabicHtmlParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ArabicHtmlParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ArabicHtmlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ArabicHtmlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpression(ArabicHtmlParser.MemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpression(ArabicHtmlParser.MemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(ArabicHtmlParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(ArabicHtmlParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(ArabicHtmlParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(ArabicHtmlParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(ArabicHtmlParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(ArabicHtmlParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ArabicHtmlParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ArabicHtmlParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(ArabicHtmlParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(ArabicHtmlParser.ObjectDeclarationContext ctx);
}