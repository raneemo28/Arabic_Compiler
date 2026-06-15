# Generated from ArabicHtmlParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ArabicHtmlParser import ArabicHtmlParser
else:
    from ArabicHtmlParser import ArabicHtmlParser

# This class defines a complete generic visitor for a parse tree produced by ArabicHtmlParser.

class ArabicHtmlParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ArabicHtmlParser#program.
    def visitProgram(self, ctx:ArabicHtmlParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#idAttribute.
    def visitIdAttribute(self, ctx:ArabicHtmlParser.IdAttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#classAttribute.
    def visitClassAttribute(self, ctx:ArabicHtmlParser.ClassAttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#srcAttribute.
    def visitSrcAttribute(self, ctx:ArabicHtmlParser.SrcAttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#hrefAttribute.
    def visitHrefAttribute(self, ctx:ArabicHtmlParser.HrefAttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#parentElement.
    def visitParentElement(self, ctx:ArabicHtmlParser.ParentElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#selfClosingElement.
    def visitSelfClosingElement(self, ctx:ArabicHtmlParser.SelfClosingElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#htmlContent.
    def visitHtmlContent(self, ctx:ArabicHtmlParser.HtmlContentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#text.
    def visitText(self, ctx:ArabicHtmlParser.TextContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#arabicKeyword.
    def visitArabicKeyword(self, ctx:ArabicHtmlParser.ArabicKeywordContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#cssRule.
    def visitCssRule(self, ctx:ArabicHtmlParser.CssRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#selector.
    def visitSelector(self, ctx:ArabicHtmlParser.SelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#declarationList.
    def visitDeclarationList(self, ctx:ArabicHtmlParser.DeclarationListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#declaration.
    def visitDeclaration(self, ctx:ArabicHtmlParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#cssProperty.
    def visitCssProperty(self, ctx:ArabicHtmlParser.CssPropertyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#cssValue.
    def visitCssValue(self, ctx:ArabicHtmlParser.CssValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#cssFunction.
    def visitCssFunction(self, ctx:ArabicHtmlParser.CssFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#tsType.
    def visitTsType(self, ctx:ArabicHtmlParser.TsTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#tsStatement.
    def visitTsStatement(self, ctx:ArabicHtmlParser.TsStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#interfaceDeclaration.
    def visitInterfaceDeclaration(self, ctx:ArabicHtmlParser.InterfaceDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#variableDeclaration.
    def visitVariableDeclaration(self, ctx:ArabicHtmlParser.VariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#tsDeclaration.
    def visitTsDeclaration(self, ctx:ArabicHtmlParser.TsDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#block.
    def visitBlock(self, ctx:ArabicHtmlParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#assignmentStatement.
    def visitAssignmentStatement(self, ctx:ArabicHtmlParser.AssignmentStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#ifStatement.
    def visitIfStatement(self, ctx:ArabicHtmlParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#forLoop.
    def visitForLoop(self, ctx:ArabicHtmlParser.ForLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#arrayLoop.
    def visitArrayLoop(self, ctx:ArabicHtmlParser.ArrayLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#whileLoop.
    def visitWhileLoop(self, ctx:ArabicHtmlParser.WhileLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#functionDeclaration.
    def visitFunctionDeclaration(self, ctx:ArabicHtmlParser.FunctionDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#parameterList.
    def visitParameterList(self, ctx:ArabicHtmlParser.ParameterListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#returnStatement.
    def visitReturnStatement(self, ctx:ArabicHtmlParser.ReturnStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#tryCatchStatement.
    def visitTryCatchStatement(self, ctx:ArabicHtmlParser.TryCatchStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#expressionStatement.
    def visitExpressionStatement(self, ctx:ArabicHtmlParser.ExpressionStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#builtInCall.
    def visitBuiltInCall(self, ctx:ArabicHtmlParser.BuiltInCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#expression.
    def visitExpression(self, ctx:ArabicHtmlParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#assignmentExpression.
    def visitAssignmentExpression(self, ctx:ArabicHtmlParser.AssignmentExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#logicalOrExpression.
    def visitLogicalOrExpression(self, ctx:ArabicHtmlParser.LogicalOrExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#logicalAndExpression.
    def visitLogicalAndExpression(self, ctx:ArabicHtmlParser.LogicalAndExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#equalityExpression.
    def visitEqualityExpression(self, ctx:ArabicHtmlParser.EqualityExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#relationalExpression.
    def visitRelationalExpression(self, ctx:ArabicHtmlParser.RelationalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#additiveExpression.
    def visitAdditiveExpression(self, ctx:ArabicHtmlParser.AdditiveExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#multiplicativeExpression.
    def visitMultiplicativeExpression(self, ctx:ArabicHtmlParser.MultiplicativeExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#memberExpression.
    def visitMemberExpression(self, ctx:ArabicHtmlParser.MemberExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#primaryExpression.
    def visitPrimaryExpression(self, ctx:ArabicHtmlParser.PrimaryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#arrayLiteral.
    def visitArrayLiteral(self, ctx:ArabicHtmlParser.ArrayLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#objectLiteral.
    def visitObjectLiteral(self, ctx:ArabicHtmlParser.ObjectLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArabicHtmlParser#identifier.
    def visitIdentifier(self, ctx:ArabicHtmlParser.IdentifierContext):
        return self.visitChildren(ctx)



del ArabicHtmlParser