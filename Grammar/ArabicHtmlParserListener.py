# Generated from ArabicHtmlParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ArabicHtmlParser import ArabicHtmlParser
else:
    from ArabicHtmlParser import ArabicHtmlParser

# This class defines a complete listener for a parse tree produced by ArabicHtmlParser.
class ArabicHtmlParserListener(ParseTreeListener):

    # Enter a parse tree produced by ArabicHtmlParser#program.
    def enterProgram(self, ctx:ArabicHtmlParser.ProgramContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#program.
    def exitProgram(self, ctx:ArabicHtmlParser.ProgramContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#document.
    def enterDocument(self, ctx:ArabicHtmlParser.DocumentContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#document.
    def exitDocument(self, ctx:ArabicHtmlParser.DocumentContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#head.
    def enterHead(self, ctx:ArabicHtmlParser.HeadContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#head.
    def exitHead(self, ctx:ArabicHtmlParser.HeadContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#body.
    def enterBody(self, ctx:ArabicHtmlParser.BodyContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#body.
    def exitBody(self, ctx:ArabicHtmlParser.BodyContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#parentElement.
    def enterParentElement(self, ctx:ArabicHtmlParser.ParentElementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#parentElement.
    def exitParentElement(self, ctx:ArabicHtmlParser.ParentElementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#selfClosingElement.
    def enterSelfClosingElement(self, ctx:ArabicHtmlParser.SelfClosingElementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#selfClosingElement.
    def exitSelfClosingElement(self, ctx:ArabicHtmlParser.SelfClosingElementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#openTag.
    def enterOpenTag(self, ctx:ArabicHtmlParser.OpenTagContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#openTag.
    def exitOpenTag(self, ctx:ArabicHtmlParser.OpenTagContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#closeTag.
    def enterCloseTag(self, ctx:ArabicHtmlParser.CloseTagContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#closeTag.
    def exitCloseTag(self, ctx:ArabicHtmlParser.CloseTagContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#content.
    def enterContent(self, ctx:ArabicHtmlParser.ContentContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#content.
    def exitContent(self, ctx:ArabicHtmlParser.ContentContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssBlock.
    def enterCssBlock(self, ctx:ArabicHtmlParser.CssBlockContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssBlock.
    def exitCssBlock(self, ctx:ArabicHtmlParser.CssBlockContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#regularRule.
    def enterRegularRule(self, ctx:ArabicHtmlParser.RegularRuleContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#regularRule.
    def exitRegularRule(self, ctx:ArabicHtmlParser.RegularRuleContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#mediaRuleItem.
    def enterMediaRuleItem(self, ctx:ArabicHtmlParser.MediaRuleItemContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#mediaRuleItem.
    def exitMediaRuleItem(self, ctx:ArabicHtmlParser.MediaRuleItemContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#mediaRule.
    def enterMediaRule(self, ctx:ArabicHtmlParser.MediaRuleContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#mediaRule.
    def exitMediaRule(self, ctx:ArabicHtmlParser.MediaRuleContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssSelector.
    def enterCssSelector(self, ctx:ArabicHtmlParser.CssSelectorContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssSelector.
    def exitCssSelector(self, ctx:ArabicHtmlParser.CssSelectorContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#simpleSelectorList.
    def enterSimpleSelectorList(self, ctx:ArabicHtmlParser.SimpleSelectorListContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#simpleSelectorList.
    def exitSimpleSelectorList(self, ctx:ArabicHtmlParser.SimpleSelectorListContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#typeSelector.
    def enterTypeSelector(self, ctx:ArabicHtmlParser.TypeSelectorContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#typeSelector.
    def exitTypeSelector(self, ctx:ArabicHtmlParser.TypeSelectorContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#classSelector.
    def enterClassSelector(self, ctx:ArabicHtmlParser.ClassSelectorContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#classSelector.
    def exitClassSelector(self, ctx:ArabicHtmlParser.ClassSelectorContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#idSelector.
    def enterIdSelector(self, ctx:ArabicHtmlParser.IdSelectorContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#idSelector.
    def exitIdSelector(self, ctx:ArabicHtmlParser.IdSelectorContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#pseudoSel.
    def enterPseudoSel(self, ctx:ArabicHtmlParser.PseudoSelContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#pseudoSel.
    def exitPseudoSel(self, ctx:ArabicHtmlParser.PseudoSelContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#childCombinator.
    def enterChildCombinator(self, ctx:ArabicHtmlParser.ChildCombinatorContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#childCombinator.
    def exitChildCombinator(self, ctx:ArabicHtmlParser.ChildCombinatorContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#siblingCombinator.
    def enterSiblingCombinator(self, ctx:ArabicHtmlParser.SiblingCombinatorContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#siblingCombinator.
    def exitSiblingCombinator(self, ctx:ArabicHtmlParser.SiblingCombinatorContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#pseudoSelector.
    def enterPseudoSelector(self, ctx:ArabicHtmlParser.PseudoSelectorContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#pseudoSelector.
    def exitPseudoSelector(self, ctx:ArabicHtmlParser.PseudoSelectorContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#pseudoClass.
    def enterPseudoClass(self, ctx:ArabicHtmlParser.PseudoClassContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#pseudoClass.
    def exitPseudoClass(self, ctx:ArabicHtmlParser.PseudoClassContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#pseudoElement.
    def enterPseudoElement(self, ctx:ArabicHtmlParser.PseudoElementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#pseudoElement.
    def exitPseudoElement(self, ctx:ArabicHtmlParser.PseudoElementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssDeclaration.
    def enterCssDeclaration(self, ctx:ArabicHtmlParser.CssDeclarationContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssDeclaration.
    def exitCssDeclaration(self, ctx:ArabicHtmlParser.CssDeclarationContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssProperty.
    def enterCssProperty(self, ctx:ArabicHtmlParser.CssPropertyContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssProperty.
    def exitCssProperty(self, ctx:ArabicHtmlParser.CssPropertyContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssValue.
    def enterCssValue(self, ctx:ArabicHtmlParser.CssValueContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssValue.
    def exitCssValue(self, ctx:ArabicHtmlParser.CssValueContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssKeyword.
    def enterCssKeyword(self, ctx:ArabicHtmlParser.CssKeywordContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssKeyword.
    def exitCssKeyword(self, ctx:ArabicHtmlParser.CssKeywordContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssFunction.
    def enterCssFunction(self, ctx:ArabicHtmlParser.CssFunctionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssFunction.
    def exitCssFunction(self, ctx:ArabicHtmlParser.CssFunctionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssCalcExpr.
    def enterCssCalcExpr(self, ctx:ArabicHtmlParser.CssCalcExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssCalcExpr.
    def exitCssCalcExpr(self, ctx:ArabicHtmlParser.CssCalcExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssCalcTerm.
    def enterCssCalcTerm(self, ctx:ArabicHtmlParser.CssCalcTermContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssCalcTerm.
    def exitCssCalcTerm(self, ctx:ArabicHtmlParser.CssCalcTermContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#jsBlock.
    def enterJsBlock(self, ctx:ArabicHtmlParser.JsBlockContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#jsBlock.
    def exitJsBlock(self, ctx:ArabicHtmlParser.JsBlockContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#jsStatement.
    def enterJsStatement(self, ctx:ArabicHtmlParser.JsStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#jsStatement.
    def exitJsStatement(self, ctx:ArabicHtmlParser.JsStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#varDeclaration.
    def enterVarDeclaration(self, ctx:ArabicHtmlParser.VarDeclarationContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#varDeclaration.
    def exitVarDeclaration(self, ctx:ArabicHtmlParser.VarDeclarationContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#varKeyword.
    def enterVarKeyword(self, ctx:ArabicHtmlParser.VarKeywordContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#varKeyword.
    def exitVarKeyword(self, ctx:ArabicHtmlParser.VarKeywordContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#functionDeclaration.
    def enterFunctionDeclaration(self, ctx:ArabicHtmlParser.FunctionDeclarationContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#functionDeclaration.
    def exitFunctionDeclaration(self, ctx:ArabicHtmlParser.FunctionDeclarationContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#parameterList.
    def enterParameterList(self, ctx:ArabicHtmlParser.ParameterListContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#parameterList.
    def exitParameterList(self, ctx:ArabicHtmlParser.ParameterListContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#jsBody.
    def enterJsBody(self, ctx:ArabicHtmlParser.JsBodyContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#jsBody.
    def exitJsBody(self, ctx:ArabicHtmlParser.JsBodyContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#classDeclaration.
    def enterClassDeclaration(self, ctx:ArabicHtmlParser.ClassDeclarationContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#classDeclaration.
    def exitClassDeclaration(self, ctx:ArabicHtmlParser.ClassDeclarationContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#classMember.
    def enterClassMember(self, ctx:ArabicHtmlParser.ClassMemberContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#classMember.
    def exitClassMember(self, ctx:ArabicHtmlParser.ClassMemberContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#accessModifier.
    def enterAccessModifier(self, ctx:ArabicHtmlParser.AccessModifierContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#accessModifier.
    def exitAccessModifier(self, ctx:ArabicHtmlParser.AccessModifierContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#returnStatement.
    def enterReturnStatement(self, ctx:ArabicHtmlParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#returnStatement.
    def exitReturnStatement(self, ctx:ArabicHtmlParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#ifStatement.
    def enterIfStatement(self, ctx:ArabicHtmlParser.IfStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#ifStatement.
    def exitIfStatement(self, ctx:ArabicHtmlParser.IfStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#switchStatement.
    def enterSwitchStatement(self, ctx:ArabicHtmlParser.SwitchStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#switchStatement.
    def exitSwitchStatement(self, ctx:ArabicHtmlParser.SwitchStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#switchCase.
    def enterSwitchCase(self, ctx:ArabicHtmlParser.SwitchCaseContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#switchCase.
    def exitSwitchCase(self, ctx:ArabicHtmlParser.SwitchCaseContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#defaultCase.
    def enterDefaultCase(self, ctx:ArabicHtmlParser.DefaultCaseContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#defaultCase.
    def exitDefaultCase(self, ctx:ArabicHtmlParser.DefaultCaseContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#classicFor.
    def enterClassicFor(self, ctx:ArabicHtmlParser.ClassicForContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#classicFor.
    def exitClassicFor(self, ctx:ArabicHtmlParser.ClassicForContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#forOf.
    def enterForOf(self, ctx:ArabicHtmlParser.ForOfContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#forOf.
    def exitForOf(self, ctx:ArabicHtmlParser.ForOfContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#forIn.
    def enterForIn(self, ctx:ArabicHtmlParser.ForInContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#forIn.
    def exitForIn(self, ctx:ArabicHtmlParser.ForInContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#forInit.
    def enterForInit(self, ctx:ArabicHtmlParser.ForInitContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#forInit.
    def exitForInit(self, ctx:ArabicHtmlParser.ForInitContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#whileStatement.
    def enterWhileStatement(self, ctx:ArabicHtmlParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#whileStatement.
    def exitWhileStatement(self, ctx:ArabicHtmlParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#doWhileStatement.
    def enterDoWhileStatement(self, ctx:ArabicHtmlParser.DoWhileStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#doWhileStatement.
    def exitDoWhileStatement(self, ctx:ArabicHtmlParser.DoWhileStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#tryCatchStatement.
    def enterTryCatchStatement(self, ctx:ArabicHtmlParser.TryCatchStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#tryCatchStatement.
    def exitTryCatchStatement(self, ctx:ArabicHtmlParser.TryCatchStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#throwStatement.
    def enterThrowStatement(self, ctx:ArabicHtmlParser.ThrowStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#throwStatement.
    def exitThrowStatement(self, ctx:ArabicHtmlParser.ThrowStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#importStatement.
    def enterImportStatement(self, ctx:ArabicHtmlParser.ImportStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#importStatement.
    def exitImportStatement(self, ctx:ArabicHtmlParser.ImportStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#defaultImport.
    def enterDefaultImport(self, ctx:ArabicHtmlParser.DefaultImportContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#defaultImport.
    def exitDefaultImport(self, ctx:ArabicHtmlParser.DefaultImportContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#namedImport.
    def enterNamedImport(self, ctx:ArabicHtmlParser.NamedImportContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#namedImport.
    def exitNamedImport(self, ctx:ArabicHtmlParser.NamedImportContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#exportStatement.
    def enterExportStatement(self, ctx:ArabicHtmlParser.ExportStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#exportStatement.
    def exitExportStatement(self, ctx:ArabicHtmlParser.ExportStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#expressionStatement.
    def enterExpressionStatement(self, ctx:ArabicHtmlParser.ExpressionStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#expressionStatement.
    def exitExpressionStatement(self, ctx:ArabicHtmlParser.ExpressionStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#expression.
    def enterExpression(self, ctx:ArabicHtmlParser.ExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#expression.
    def exitExpression(self, ctx:ArabicHtmlParser.ExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#assignmentExpr.
    def enterAssignmentExpr(self, ctx:ArabicHtmlParser.AssignmentExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#assignmentExpr.
    def exitAssignmentExpr(self, ctx:ArabicHtmlParser.AssignmentExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#assignOp.
    def enterAssignOp(self, ctx:ArabicHtmlParser.AssignOpContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#assignOp.
    def exitAssignOp(self, ctx:ArabicHtmlParser.AssignOpContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#ternaryExpr.
    def enterTernaryExpr(self, ctx:ArabicHtmlParser.TernaryExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#ternaryExpr.
    def exitTernaryExpr(self, ctx:ArabicHtmlParser.TernaryExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#logicalOrExpr.
    def enterLogicalOrExpr(self, ctx:ArabicHtmlParser.LogicalOrExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#logicalOrExpr.
    def exitLogicalOrExpr(self, ctx:ArabicHtmlParser.LogicalOrExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#logicalAndExpr.
    def enterLogicalAndExpr(self, ctx:ArabicHtmlParser.LogicalAndExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#logicalAndExpr.
    def exitLogicalAndExpr(self, ctx:ArabicHtmlParser.LogicalAndExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#nullCoalesceExpr.
    def enterNullCoalesceExpr(self, ctx:ArabicHtmlParser.NullCoalesceExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#nullCoalesceExpr.
    def exitNullCoalesceExpr(self, ctx:ArabicHtmlParser.NullCoalesceExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#bitwiseOrExpr.
    def enterBitwiseOrExpr(self, ctx:ArabicHtmlParser.BitwiseOrExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#bitwiseOrExpr.
    def exitBitwiseOrExpr(self, ctx:ArabicHtmlParser.BitwiseOrExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#bitwiseXorExpr.
    def enterBitwiseXorExpr(self, ctx:ArabicHtmlParser.BitwiseXorExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#bitwiseXorExpr.
    def exitBitwiseXorExpr(self, ctx:ArabicHtmlParser.BitwiseXorExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#bitwiseAndExpr.
    def enterBitwiseAndExpr(self, ctx:ArabicHtmlParser.BitwiseAndExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#bitwiseAndExpr.
    def exitBitwiseAndExpr(self, ctx:ArabicHtmlParser.BitwiseAndExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#equalityExpr.
    def enterEqualityExpr(self, ctx:ArabicHtmlParser.EqualityExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#equalityExpr.
    def exitEqualityExpr(self, ctx:ArabicHtmlParser.EqualityExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#relationalExpr.
    def enterRelationalExpr(self, ctx:ArabicHtmlParser.RelationalExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#relationalExpr.
    def exitRelationalExpr(self, ctx:ArabicHtmlParser.RelationalExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#shiftExpr.
    def enterShiftExpr(self, ctx:ArabicHtmlParser.ShiftExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#shiftExpr.
    def exitShiftExpr(self, ctx:ArabicHtmlParser.ShiftExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#addExpr.
    def enterAddExpr(self, ctx:ArabicHtmlParser.AddExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#addExpr.
    def exitAddExpr(self, ctx:ArabicHtmlParser.AddExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#mulExpr.
    def enterMulExpr(self, ctx:ArabicHtmlParser.MulExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#mulExpr.
    def exitMulExpr(self, ctx:ArabicHtmlParser.MulExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#expExpr.
    def enterExpExpr(self, ctx:ArabicHtmlParser.ExpExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#expExpr.
    def exitExpExpr(self, ctx:ArabicHtmlParser.ExpExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#unaryExpr.
    def enterUnaryExpr(self, ctx:ArabicHtmlParser.UnaryExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#unaryExpr.
    def exitUnaryExpr(self, ctx:ArabicHtmlParser.UnaryExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#postfixExpr.
    def enterPostfixExpr(self, ctx:ArabicHtmlParser.PostfixExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#postfixExpr.
    def exitPostfixExpr(self, ctx:ArabicHtmlParser.PostfixExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#callExpr.
    def enterCallExpr(self, ctx:ArabicHtmlParser.CallExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#callExpr.
    def exitCallExpr(self, ctx:ArabicHtmlParser.CallExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#callArgs.
    def enterCallArgs(self, ctx:ArabicHtmlParser.CallArgsContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#callArgs.
    def exitCallArgs(self, ctx:ArabicHtmlParser.CallArgsContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#memberAccess.
    def enterMemberAccess(self, ctx:ArabicHtmlParser.MemberAccessContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#memberAccess.
    def exitMemberAccess(self, ctx:ArabicHtmlParser.MemberAccessContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#computedAccess.
    def enterComputedAccess(self, ctx:ArabicHtmlParser.ComputedAccessContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#computedAccess.
    def exitComputedAccess(self, ctx:ArabicHtmlParser.ComputedAccessContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#memberExpr.
    def enterMemberExpr(self, ctx:ArabicHtmlParser.MemberExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#memberExpr.
    def exitMemberExpr(self, ctx:ArabicHtmlParser.MemberExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#argumentList.
    def enterArgumentList(self, ctx:ArabicHtmlParser.ArgumentListContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#argumentList.
    def exitArgumentList(self, ctx:ArabicHtmlParser.ArgumentListContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#primaryExpr.
    def enterPrimaryExpr(self, ctx:ArabicHtmlParser.PrimaryExprContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#primaryExpr.
    def exitPrimaryExpr(self, ctx:ArabicHtmlParser.PrimaryExprContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#literal.
    def enterLiteral(self, ctx:ArabicHtmlParser.LiteralContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#literal.
    def exitLiteral(self, ctx:ArabicHtmlParser.LiteralContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#arrayLiteral.
    def enterArrayLiteral(self, ctx:ArabicHtmlParser.ArrayLiteralContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#arrayLiteral.
    def exitArrayLiteral(self, ctx:ArabicHtmlParser.ArrayLiteralContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#objectLiteral.
    def enterObjectLiteral(self, ctx:ArabicHtmlParser.ObjectLiteralContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#objectLiteral.
    def exitObjectLiteral(self, ctx:ArabicHtmlParser.ObjectLiteralContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#objectProperty.
    def enterObjectProperty(self, ctx:ArabicHtmlParser.ObjectPropertyContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#objectProperty.
    def exitObjectProperty(self, ctx:ArabicHtmlParser.ObjectPropertyContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#arrowFunction.
    def enterArrowFunction(self, ctx:ArabicHtmlParser.ArrowFunctionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#arrowFunction.
    def exitArrowFunction(self, ctx:ArabicHtmlParser.ArrowFunctionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#arrowParams.
    def enterArrowParams(self, ctx:ArabicHtmlParser.ArrowParamsContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#arrowParams.
    def exitArrowParams(self, ctx:ArabicHtmlParser.ArrowParamsContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#domExpression.
    def enterDomExpression(self, ctx:ArabicHtmlParser.DomExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#domExpression.
    def exitDomExpression(self, ctx:ArabicHtmlParser.DomExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#domMethod.
    def enterDomMethod(self, ctx:ArabicHtmlParser.DomMethodContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#domMethod.
    def exitDomMethod(self, ctx:ArabicHtmlParser.DomMethodContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#consoleExpression.
    def enterConsoleExpression(self, ctx:ArabicHtmlParser.ConsoleExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#consoleExpression.
    def exitConsoleExpression(self, ctx:ArabicHtmlParser.ConsoleExpressionContext):
        pass



del ArabicHtmlParser