// Generated from ArabicHtmlParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link ArabicHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(ArabicHtmlParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(ArabicHtmlParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(ArabicHtmlParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(ArabicHtmlParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ArabicHtmlParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ArabicHtmlParser.BodyContext ctx);
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
	 * Enter a parse tree produced by {@link ArabicHtmlParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(ArabicHtmlParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(ArabicHtmlParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(ArabicHtmlParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(ArabicHtmlParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ArabicHtmlParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ArabicHtmlParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlock(ArabicHtmlParser.CssBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlock(ArabicHtmlParser.CssBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularRule}
	 * labeled alternative in {@link ArabicHtmlParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterRegularRule(ArabicHtmlParser.RegularRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularRule}
	 * labeled alternative in {@link ArabicHtmlParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitRegularRule(ArabicHtmlParser.RegularRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mediaRuleItem}
	 * labeled alternative in {@link ArabicHtmlParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterMediaRuleItem(ArabicHtmlParser.MediaRuleItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mediaRuleItem}
	 * labeled alternative in {@link ArabicHtmlParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitMediaRuleItem(ArabicHtmlParser.MediaRuleItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#mediaRule}.
	 * @param ctx the parse tree
	 */
	void enterMediaRule(ArabicHtmlParser.MediaRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#mediaRule}.
	 * @param ctx the parse tree
	 */
	void exitMediaRule(ArabicHtmlParser.MediaRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(ArabicHtmlParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(ArabicHtmlParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#simpleSelectorList}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelectorList(ArabicHtmlParser.SimpleSelectorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#simpleSelectorList}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelectorList(ArabicHtmlParser.SimpleSelectorListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link ArabicHtmlParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(ArabicHtmlParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link ArabicHtmlParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(ArabicHtmlParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link ArabicHtmlParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(ArabicHtmlParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link ArabicHtmlParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(ArabicHtmlParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link ArabicHtmlParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(ArabicHtmlParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link ArabicHtmlParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(ArabicHtmlParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoSel}
	 * labeled alternative in {@link ArabicHtmlParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoSel(ArabicHtmlParser.PseudoSelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoSel}
	 * labeled alternative in {@link ArabicHtmlParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoSel(ArabicHtmlParser.PseudoSelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childCombinator}
	 * labeled alternative in {@link ArabicHtmlParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterChildCombinator(ArabicHtmlParser.ChildCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childCombinator}
	 * labeled alternative in {@link ArabicHtmlParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitChildCombinator(ArabicHtmlParser.ChildCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code siblingCombinator}
	 * labeled alternative in {@link ArabicHtmlParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterSiblingCombinator(ArabicHtmlParser.SiblingCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code siblingCombinator}
	 * labeled alternative in {@link ArabicHtmlParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitSiblingCombinator(ArabicHtmlParser.SiblingCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#pseudoSelector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoSelector(ArabicHtmlParser.PseudoSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#pseudoSelector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoSelector(ArabicHtmlParser.PseudoSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClass(ArabicHtmlParser.PseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClass(ArabicHtmlParser.PseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#pseudoElement}.
	 * @param ctx the parse tree
	 */
	void enterPseudoElement(ArabicHtmlParser.PseudoElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#pseudoElement}.
	 * @param ctx the parse tree
	 */
	void exitPseudoElement(ArabicHtmlParser.PseudoElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(ArabicHtmlParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(ArabicHtmlParser.CssDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link ArabicHtmlParser#cssKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCssKeyword(ArabicHtmlParser.CssKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#cssKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCssKeyword(ArabicHtmlParser.CssKeywordContext ctx);
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
	 * Enter a parse tree produced by {@link ArabicHtmlParser#cssCalcExpr}.
	 * @param ctx the parse tree
	 */
	void enterCssCalcExpr(ArabicHtmlParser.CssCalcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#cssCalcExpr}.
	 * @param ctx the parse tree
	 */
	void exitCssCalcExpr(ArabicHtmlParser.CssCalcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#cssCalcTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssCalcTerm(ArabicHtmlParser.CssCalcTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#cssCalcTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssCalcTerm(ArabicHtmlParser.CssCalcTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#jsBlock}.
	 * @param ctx the parse tree
	 */
	void enterJsBlock(ArabicHtmlParser.JsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#jsBlock}.
	 * @param ctx the parse tree
	 */
	void exitJsBlock(ArabicHtmlParser.JsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#jsStatement}.
	 * @param ctx the parse tree
	 */
	void enterJsStatement(ArabicHtmlParser.JsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#jsStatement}.
	 * @param ctx the parse tree
	 */
	void exitJsStatement(ArabicHtmlParser.JsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(ArabicHtmlParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(ArabicHtmlParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#varKeyword}.
	 * @param ctx the parse tree
	 */
	void enterVarKeyword(ArabicHtmlParser.VarKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#varKeyword}.
	 * @param ctx the parse tree
	 */
	void exitVarKeyword(ArabicHtmlParser.VarKeywordContext ctx);
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
	 * Enter a parse tree produced by {@link ArabicHtmlParser#jsBody}.
	 * @param ctx the parse tree
	 */
	void enterJsBody(ArabicHtmlParser.JsBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#jsBody}.
	 * @param ctx the parse tree
	 */
	void exitJsBody(ArabicHtmlParser.JsBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ArabicHtmlParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ArabicHtmlParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(ArabicHtmlParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(ArabicHtmlParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(ArabicHtmlParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(ArabicHtmlParser.AccessModifierContext ctx);
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
	 * Enter a parse tree produced by {@link ArabicHtmlParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ArabicHtmlParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ArabicHtmlParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(ArabicHtmlParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(ArabicHtmlParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(ArabicHtmlParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(ArabicHtmlParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classicFor}
	 * labeled alternative in {@link ArabicHtmlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassicFor(ArabicHtmlParser.ClassicForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classicFor}
	 * labeled alternative in {@link ArabicHtmlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassicFor(ArabicHtmlParser.ClassicForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forOf}
	 * labeled alternative in {@link ArabicHtmlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOf(ArabicHtmlParser.ForOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forOf}
	 * labeled alternative in {@link ArabicHtmlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOf(ArabicHtmlParser.ForOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forIn}
	 * labeled alternative in {@link ArabicHtmlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForIn(ArabicHtmlParser.ForInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forIn}
	 * labeled alternative in {@link ArabicHtmlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForIn(ArabicHtmlParser.ForInContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ArabicHtmlParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ArabicHtmlParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ArabicHtmlParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ArabicHtmlParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ArabicHtmlParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ArabicHtmlParser.DoWhileStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ArabicHtmlParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ArabicHtmlParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ArabicHtmlParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ArabicHtmlParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ArabicHtmlParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultImport}
	 * labeled alternative in {@link ArabicHtmlParser#importClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultImport(ArabicHtmlParser.DefaultImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultImport}
	 * labeled alternative in {@link ArabicHtmlParser#importClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultImport(ArabicHtmlParser.DefaultImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedImport}
	 * labeled alternative in {@link ArabicHtmlParser#importClause}.
	 * @param ctx the parse tree
	 */
	void enterNamedImport(ArabicHtmlParser.NamedImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedImport}
	 * labeled alternative in {@link ArabicHtmlParser#importClause}.
	 * @param ctx the parse tree
	 */
	void exitNamedImport(ArabicHtmlParser.NamedImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(ArabicHtmlParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(ArabicHtmlParser.ExportStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ArabicHtmlParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(ArabicHtmlParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(ArabicHtmlParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(ArabicHtmlParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(ArabicHtmlParser.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#ternaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(ArabicHtmlParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#ternaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(ArabicHtmlParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(ArabicHtmlParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(ArabicHtmlParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(ArabicHtmlParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(ArabicHtmlParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#nullCoalesceExpr}.
	 * @param ctx the parse tree
	 */
	void enterNullCoalesceExpr(ArabicHtmlParser.NullCoalesceExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#nullCoalesceExpr}.
	 * @param ctx the parse tree
	 */
	void exitNullCoalesceExpr(ArabicHtmlParser.NullCoalesceExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#bitwiseOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrExpr(ArabicHtmlParser.BitwiseOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#bitwiseOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrExpr(ArabicHtmlParser.BitwiseOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#bitwiseXorExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXorExpr(ArabicHtmlParser.BitwiseXorExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#bitwiseXorExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXorExpr(ArabicHtmlParser.BitwiseXorExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#bitwiseAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndExpr(ArabicHtmlParser.BitwiseAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#bitwiseAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndExpr(ArabicHtmlParser.BitwiseAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(ArabicHtmlParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(ArabicHtmlParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(ArabicHtmlParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(ArabicHtmlParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpr(ArabicHtmlParser.ShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpr(ArabicHtmlParser.ShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ArabicHtmlParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ArabicHtmlParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(ArabicHtmlParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(ArabicHtmlParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#expExpr}.
	 * @param ctx the parse tree
	 */
	void enterExpExpr(ArabicHtmlParser.ExpExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#expExpr}.
	 * @param ctx the parse tree
	 */
	void exitExpExpr(ArabicHtmlParser.ExpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(ArabicHtmlParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(ArabicHtmlParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(ArabicHtmlParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(ArabicHtmlParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(ArabicHtmlParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(ArabicHtmlParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callArgs}
	 * labeled alternative in {@link ArabicHtmlParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterCallArgs(ArabicHtmlParser.CallArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callArgs}
	 * labeled alternative in {@link ArabicHtmlParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitCallArgs(ArabicHtmlParser.CallArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link ArabicHtmlParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(ArabicHtmlParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link ArabicHtmlParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(ArabicHtmlParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code computedAccess}
	 * labeled alternative in {@link ArabicHtmlParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterComputedAccess(ArabicHtmlParser.ComputedAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code computedAccess}
	 * labeled alternative in {@link ArabicHtmlParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitComputedAccess(ArabicHtmlParser.ComputedAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#memberExpr}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpr(ArabicHtmlParser.MemberExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#memberExpr}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpr(ArabicHtmlParser.MemberExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ArabicHtmlParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ArabicHtmlParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(ArabicHtmlParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(ArabicHtmlParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ArabicHtmlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ArabicHtmlParser.LiteralContext ctx);
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
	 * Enter a parse tree produced by {@link ArabicHtmlParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperty(ArabicHtmlParser.ObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperty(ArabicHtmlParser.ObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(ArabicHtmlParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(ArabicHtmlParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#arrowParams}.
	 * @param ctx the parse tree
	 */
	void enterArrowParams(ArabicHtmlParser.ArrowParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#arrowParams}.
	 * @param ctx the parse tree
	 */
	void exitArrowParams(ArabicHtmlParser.ArrowParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#domExpression}.
	 * @param ctx the parse tree
	 */
	void enterDomExpression(ArabicHtmlParser.DomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#domExpression}.
	 * @param ctx the parse tree
	 */
	void exitDomExpression(ArabicHtmlParser.DomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#domMethod}.
	 * @param ctx the parse tree
	 */
	void enterDomMethod(ArabicHtmlParser.DomMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#domMethod}.
	 * @param ctx the parse tree
	 */
	void exitDomMethod(ArabicHtmlParser.DomMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArabicHtmlParser#consoleExpression}.
	 * @param ctx the parse tree
	 */
	void enterConsoleExpression(ArabicHtmlParser.ConsoleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArabicHtmlParser#consoleExpression}.
	 * @param ctx the parse tree
	 */
	void exitConsoleExpression(ArabicHtmlParser.ConsoleExpressionContext ctx);
}