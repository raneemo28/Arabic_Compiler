// Generated from ArabicHtmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArabicHtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArabicHtmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ArabicHtmlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAttribute(ArabicHtmlParser.IdAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAttribute(ArabicHtmlParser.ClassAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code srcAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrcAttribute(ArabicHtmlParser.SrcAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hrefAttribute}
	 * labeled alternative in {@link ArabicHtmlParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHrefAttribute(ArabicHtmlParser.HrefAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentElement}
	 * labeled alternative in {@link ArabicHtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentElement(ArabicHtmlParser.ParentElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link ArabicHtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(ArabicHtmlParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(ArabicHtmlParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ArabicHtmlParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#arabicKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArabicKeyword(ArabicHtmlParser.ArabicKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(ArabicHtmlParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(ArabicHtmlParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(ArabicHtmlParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ArabicHtmlParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProperty(ArabicHtmlParser.CssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(ArabicHtmlParser.CssValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#cssFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunction(ArabicHtmlParser.CssFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#tsType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsType(ArabicHtmlParser.TsTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#tsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsStatement(ArabicHtmlParser.TsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(ArabicHtmlParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ArabicHtmlParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#tsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsDeclaration(ArabicHtmlParser.TsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ArabicHtmlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(ArabicHtmlParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ArabicHtmlParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(ArabicHtmlParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#arrayLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLoop(ArabicHtmlParser.ArrayLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(ArabicHtmlParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ArabicHtmlParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ArabicHtmlParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ArabicHtmlParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(ArabicHtmlParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ArabicHtmlParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#builtInCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInCall(ArabicHtmlParser.BuiltInCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ArabicHtmlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(ArabicHtmlParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(ArabicHtmlParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(ArabicHtmlParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ArabicHtmlParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ArabicHtmlParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ArabicHtmlParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ArabicHtmlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#memberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpression(ArabicHtmlParser.MemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(ArabicHtmlParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(ArabicHtmlParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(ArabicHtmlParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArabicHtmlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ArabicHtmlParser.IdentifierContext ctx);
}