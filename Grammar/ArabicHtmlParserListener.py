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


    # Enter a parse tree produced by ArabicHtmlParser#idAttribute.
    def enterIdAttribute(self, ctx:ArabicHtmlParser.IdAttributeContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#idAttribute.
    def exitIdAttribute(self, ctx:ArabicHtmlParser.IdAttributeContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#classAttribute.
    def enterClassAttribute(self, ctx:ArabicHtmlParser.ClassAttributeContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#classAttribute.
    def exitClassAttribute(self, ctx:ArabicHtmlParser.ClassAttributeContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#srcAttribute.
    def enterSrcAttribute(self, ctx:ArabicHtmlParser.SrcAttributeContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#srcAttribute.
    def exitSrcAttribute(self, ctx:ArabicHtmlParser.SrcAttributeContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#hrefAttribute.
    def enterHrefAttribute(self, ctx:ArabicHtmlParser.HrefAttributeContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#hrefAttribute.
    def exitHrefAttribute(self, ctx:ArabicHtmlParser.HrefAttributeContext):
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


    # Enter a parse tree produced by ArabicHtmlParser#htmlContent.
    def enterHtmlContent(self, ctx:ArabicHtmlParser.HtmlContentContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#htmlContent.
    def exitHtmlContent(self, ctx:ArabicHtmlParser.HtmlContentContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#text.
    def enterText(self, ctx:ArabicHtmlParser.TextContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#text.
    def exitText(self, ctx:ArabicHtmlParser.TextContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#arabicKeyword.
    def enterArabicKeyword(self, ctx:ArabicHtmlParser.ArabicKeywordContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#arabicKeyword.
    def exitArabicKeyword(self, ctx:ArabicHtmlParser.ArabicKeywordContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssRule.
    def enterCssRule(self, ctx:ArabicHtmlParser.CssRuleContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssRule.
    def exitCssRule(self, ctx:ArabicHtmlParser.CssRuleContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#selector.
    def enterSelector(self, ctx:ArabicHtmlParser.SelectorContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#selector.
    def exitSelector(self, ctx:ArabicHtmlParser.SelectorContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#pseudoClass.
    def enterPseudoClass(self, ctx:ArabicHtmlParser.PseudoClassContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#pseudoClass.
    def exitPseudoClass(self, ctx:ArabicHtmlParser.PseudoClassContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#declarationList.
    def enterDeclarationList(self, ctx:ArabicHtmlParser.DeclarationListContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#declarationList.
    def exitDeclarationList(self, ctx:ArabicHtmlParser.DeclarationListContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#declaration.
    def enterDeclaration(self, ctx:ArabicHtmlParser.DeclarationContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#declaration.
    def exitDeclaration(self, ctx:ArabicHtmlParser.DeclarationContext):
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


    # Enter a parse tree produced by ArabicHtmlParser#cssValueToken.
    def enterCssValueToken(self, ctx:ArabicHtmlParser.CssValueTokenContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssValueToken.
    def exitCssValueToken(self, ctx:ArabicHtmlParser.CssValueTokenContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#cssFunction.
    def enterCssFunction(self, ctx:ArabicHtmlParser.CssFunctionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#cssFunction.
    def exitCssFunction(self, ctx:ArabicHtmlParser.CssFunctionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#tsType.
    def enterTsType(self, ctx:ArabicHtmlParser.TsTypeContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#tsType.
    def exitTsType(self, ctx:ArabicHtmlParser.TsTypeContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#tsStatement.
    def enterTsStatement(self, ctx:ArabicHtmlParser.TsStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#tsStatement.
    def exitTsStatement(self, ctx:ArabicHtmlParser.TsStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#interfaceDeclaration.
    def enterInterfaceDeclaration(self, ctx:ArabicHtmlParser.InterfaceDeclarationContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#interfaceDeclaration.
    def exitInterfaceDeclaration(self, ctx:ArabicHtmlParser.InterfaceDeclarationContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#interfaceMember.
    def enterInterfaceMember(self, ctx:ArabicHtmlParser.InterfaceMemberContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#interfaceMember.
    def exitInterfaceMember(self, ctx:ArabicHtmlParser.InterfaceMemberContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:ArabicHtmlParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:ArabicHtmlParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#tsDeclaration.
    def enterTsDeclaration(self, ctx:ArabicHtmlParser.TsDeclarationContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#tsDeclaration.
    def exitTsDeclaration(self, ctx:ArabicHtmlParser.TsDeclarationContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#block.
    def enterBlock(self, ctx:ArabicHtmlParser.BlockContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#block.
    def exitBlock(self, ctx:ArabicHtmlParser.BlockContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#assignmentStatement.
    def enterAssignmentStatement(self, ctx:ArabicHtmlParser.AssignmentStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#assignmentStatement.
    def exitAssignmentStatement(self, ctx:ArabicHtmlParser.AssignmentStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#ifStatement.
    def enterIfStatement(self, ctx:ArabicHtmlParser.IfStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#ifStatement.
    def exitIfStatement(self, ctx:ArabicHtmlParser.IfStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#forLoop.
    def enterForLoop(self, ctx:ArabicHtmlParser.ForLoopContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#forLoop.
    def exitForLoop(self, ctx:ArabicHtmlParser.ForLoopContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#arrayLoop.
    def enterArrayLoop(self, ctx:ArabicHtmlParser.ArrayLoopContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#arrayLoop.
    def exitArrayLoop(self, ctx:ArabicHtmlParser.ArrayLoopContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#whileLoop.
    def enterWhileLoop(self, ctx:ArabicHtmlParser.WhileLoopContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#whileLoop.
    def exitWhileLoop(self, ctx:ArabicHtmlParser.WhileLoopContext):
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


    # Enter a parse tree produced by ArabicHtmlParser#returnStatement.
    def enterReturnStatement(self, ctx:ArabicHtmlParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#returnStatement.
    def exitReturnStatement(self, ctx:ArabicHtmlParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#tryCatchStatement.
    def enterTryCatchStatement(self, ctx:ArabicHtmlParser.TryCatchStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#tryCatchStatement.
    def exitTryCatchStatement(self, ctx:ArabicHtmlParser.TryCatchStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#expressionStatement.
    def enterExpressionStatement(self, ctx:ArabicHtmlParser.ExpressionStatementContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#expressionStatement.
    def exitExpressionStatement(self, ctx:ArabicHtmlParser.ExpressionStatementContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#builtInCall.
    def enterBuiltInCall(self, ctx:ArabicHtmlParser.BuiltInCallContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#builtInCall.
    def exitBuiltInCall(self, ctx:ArabicHtmlParser.BuiltInCallContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#expression.
    def enterExpression(self, ctx:ArabicHtmlParser.ExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#expression.
    def exitExpression(self, ctx:ArabicHtmlParser.ExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#assignmentExpression.
    def enterAssignmentExpression(self, ctx:ArabicHtmlParser.AssignmentExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#assignmentExpression.
    def exitAssignmentExpression(self, ctx:ArabicHtmlParser.AssignmentExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#logicalOrExpression.
    def enterLogicalOrExpression(self, ctx:ArabicHtmlParser.LogicalOrExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#logicalOrExpression.
    def exitLogicalOrExpression(self, ctx:ArabicHtmlParser.LogicalOrExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#logicalAndExpression.
    def enterLogicalAndExpression(self, ctx:ArabicHtmlParser.LogicalAndExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#logicalAndExpression.
    def exitLogicalAndExpression(self, ctx:ArabicHtmlParser.LogicalAndExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#equalityExpression.
    def enterEqualityExpression(self, ctx:ArabicHtmlParser.EqualityExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#equalityExpression.
    def exitEqualityExpression(self, ctx:ArabicHtmlParser.EqualityExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#relationalExpression.
    def enterRelationalExpression(self, ctx:ArabicHtmlParser.RelationalExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#relationalExpression.
    def exitRelationalExpression(self, ctx:ArabicHtmlParser.RelationalExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#additiveExpression.
    def enterAdditiveExpression(self, ctx:ArabicHtmlParser.AdditiveExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#additiveExpression.
    def exitAdditiveExpression(self, ctx:ArabicHtmlParser.AdditiveExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#multiplicativeExpression.
    def enterMultiplicativeExpression(self, ctx:ArabicHtmlParser.MultiplicativeExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#multiplicativeExpression.
    def exitMultiplicativeExpression(self, ctx:ArabicHtmlParser.MultiplicativeExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#memberExpression.
    def enterMemberExpression(self, ctx:ArabicHtmlParser.MemberExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#memberExpression.
    def exitMemberExpression(self, ctx:ArabicHtmlParser.MemberExpressionContext):
        pass


    # Enter a parse tree produced by ArabicHtmlParser#primaryExpression.
    def enterPrimaryExpression(self, ctx:ArabicHtmlParser.PrimaryExpressionContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#primaryExpression.
    def exitPrimaryExpression(self, ctx:ArabicHtmlParser.PrimaryExpressionContext):
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


    # Enter a parse tree produced by ArabicHtmlParser#identifier.
    def enterIdentifier(self, ctx:ArabicHtmlParser.IdentifierContext):
        pass

    # Exit a parse tree produced by ArabicHtmlParser#identifier.
    def exitIdentifier(self, ctx:ArabicHtmlParser.IdentifierContext):
        pass



del ArabicHtmlParser