"""
ArabicHtmlAstVisitor
====================
Converts the ANTLR4 parse tree produced by ArabicHtmlParser into an AST
built from the node classes in ast_nodes.py.

Key bug-fixes over the original ast_visitor.py
-----------------------------------------------
1.  Imports now reference ArabicHtmlParser / ArabicHtmlParserVisitor
    (the generated parser that actually exists).  The original imported
    the non-existent ArabicWebParser / ArabicWebParserVisitor.

2.  The visitor entry point is visitProgram (grammar rule `program`),
    not visitDocument (no such rule in the new grammar).

3.  HTML element handling is split into visitParentElement and
    visitSelfClosingElement, matching the grammar's labelled alternatives
    (#parentElement / #selfClosingElement).

4.  Attribute nodes are built for each grammar alternative (idAttribute,
    classAttribute, srcAttribute, hrefAttribute).

5.  CSS visitor methods (visitCssRule, visitSelector, visitDeclarationList,
    visitDeclaration, visitCssProperty, visitCssValue, visitCssFunction)
    are implemented from scratch to match the actual grammar rules.  The
    old visitor used rule names (selectorList, compoundSelector, combinator,
    simpleSelector, pseudoClass, pseudoElement, property_, exprModifier,
    term, dimension, keywordValue, functionName, arguments) that do not
    exist in the new grammar.

6.  JS visitor methods are implemented for all grammar productions.
"""
from __future__ import annotations
from typing import List, Optional

try:
    from Grammar.ArabicHtmlParserVisitor import ArabicHtmlParserVisitor
    from Grammar.ArabicHtmlParser import ArabicHtmlParser
except ImportError:
    from ArabicHtmlParserVisitor import ArabicHtmlParserVisitor
    from ArabicHtmlParser import ArabicHtmlParser

from AST.ast_nodes import (
    ASTNode,
    # HTML
    ProgramNode, TagNode, SelfClosingTagNode, TextNode, AttributeNode,
    # CSS – new styling nodes
    CssRuleNode, CssSelectorNode, SelectorKind,
    CssDeclarationListNode, CssDeclarationNode,
    CssValueNode, CssFunctionValueNode,
    # JS statements
    JsStatementNode, JsBlockNode,
    JsVariableDeclarationNode, JsAssignmentStatementNode,
    JsIfStatementNode, JsForLoopNode, JsWhileLoopNode,
    JsFunctionDeclarationNode, JsReturnStatementNode,
    JsTryCatchNode, JsExpressionStatementNode, JsBuiltInCallNode,
    # JS expressions
    JsExpressionNode, JsPrimaryNode,
)


class ArabicHtmlAstVisitor(ArabicHtmlParserVisitor):
    """Walks the ANTLR parse tree and produces a typed AST."""

    # ─────────────────────────────────────────────────────────────
    #  Entry point
    # ─────────────────────────────────────────────────────────────

    def visitProgram(self, ctx: ArabicHtmlParser.ProgramContext) -> ProgramNode:
        """
        program : (htmlElement | cssRule | jsStatement)* EOF
        """
        node = ProgramNode(
            line=ctx.start.line if ctx.start else 1,
            column=ctx.start.column if ctx.start else 0,
        )
        if ctx.children:
            for child in ctx.children:
                result = None
                if isinstance(child, ArabicHtmlParser.HtmlElementContext):
                    result = self.visit(child)
                elif isinstance(child, ArabicHtmlParser.CssRuleContext):
                    result = self.visit(child)
                elif isinstance(child, ArabicHtmlParser.JsStatementContext):
                    result = self.visit(child)
                if result is not None:
                    node.children.append(result)
        return node

    # ─────────────────────────────────────────────────────────────
    #  HTML
    # ─────────────────────────────────────────────────────────────

    def visitHtmlElement(self, ctx: ArabicHtmlParser.HtmlElementContext):
        """Dispatch to the labelled alternative that was actually matched."""
        if isinstance(ctx, ArabicHtmlParser.ParentElementContext):
            return self.visitParentElement(ctx)
        if isinstance(ctx, ArabicHtmlParser.SelfClosingElementContext):
            return self.visitSelfClosingElement(ctx)
        return None

    def visitParentElement(
        self, ctx: ArabicHtmlParser.ParentElementContext
    ) -> TagNode:
        """
        htmlElement : OPEN_TAG_START attribute* GT htmlContent CLOSE_TAG  # parentElement
        """
        open_text = ctx.OPEN_TAG_START().getText()   # e.g. '<قسم'
        tag_name = open_text[1:]                     # strip leading '<'

        node = TagNode(
            line=ctx.start.line,
            column=ctx.start.column,
            tag_name=tag_name,
        )

        for attr_ctx in ctx.attribute():
            attr = self.visit(attr_ctx)
            if attr is not None:
                node.attributes.append(attr)

        if ctx.htmlContent():
            node.children = self.visitHtmlContent(ctx.htmlContent())

        return node

    def visitSelfClosingElement(
        self, ctx: ArabicHtmlParser.SelfClosingElementContext
    ) -> SelfClosingTagNode:
        """
        htmlElement : OPEN_TAG_START attribute* SELF_CLOSE_END  # selfClosingElement
        """
        open_text = ctx.OPEN_TAG_START().getText()
        tag_name = open_text[1:]

        node = SelfClosingTagNode(
            line=ctx.start.line,
            column=ctx.start.column,
            tag_name=tag_name,
        )
        for attr_ctx in ctx.attribute():
            attr = self.visit(attr_ctx)
            if attr is not None:
                node.attributes.append(attr)
        return node

    def visitHtmlContent(
        self, ctx: ArabicHtmlParser.HtmlContentContext
    ) -> List[ASTNode]:
        """
        htmlContent : (htmlElement | jsStatement | cssRule | text)*
        """
        children: List[ASTNode] = []
        if not ctx.children:
            return children
        for child in ctx.children:
            result = None
            if isinstance(child, ArabicHtmlParser.HtmlElementContext):
                result = self.visit(child)
            elif isinstance(child, ArabicHtmlParser.JsStatementContext):
                result = self.visit(child)
            elif isinstance(child, ArabicHtmlParser.CssRuleContext):
                result = self.visit(child)
            elif isinstance(child, ArabicHtmlParser.TextContext):
                result = self.visitText(child)
            if result is not None:
                children.append(result)
        return children

    def visitText(self, ctx: ArabicHtmlParser.TextContext) -> Optional[TextNode]:
        """
        text : STRING | IDENTIFIER | NUMBER | arabicKeyword
        """
        raw = ctx.getText().strip()
        if not raw:
            return None
        return TextNode(line=ctx.start.line, column=ctx.start.column, content=raw)

    def visitArabicKeyword(self, ctx: ArabicHtmlParser.ArabicKeywordContext):
        # arabicKeyword only appears inside `text`; visitText handles it via getText()
        return ctx.getText()

    # ── Attributes ────────────────────────────────────────────────

    def visitAttribute(self, ctx: ArabicHtmlParser.AttributeContext):
        return self.visitChildren(ctx)

    def visitIdAttribute(
        self, ctx: ArabicHtmlParser.IdAttributeContext
    ) -> AttributeNode:
        """ATTR_ID JS_ASSIGN STRING   # idAttribute"""
        return AttributeNode(
            line=ctx.start.line, column=ctx.start.column,
            kind="id",
            value=ctx.STRING().getText().strip('"\''),
        )

    def visitClassAttribute(
        self, ctx: ArabicHtmlParser.ClassAttributeContext
    ) -> AttributeNode:
        """ATTR_CLASS JS_ASSIGN STRING   # classAttribute"""
        return AttributeNode(
            line=ctx.start.line, column=ctx.start.column,
            kind="class",
            value=ctx.STRING().getText().strip('"\''),
        )

    def visitSrcAttribute(
        self, ctx: ArabicHtmlParser.SrcAttributeContext
    ) -> AttributeNode:
        """ATTR_SRC JS_ASSIGN STRING   # srcAttribute"""
        return AttributeNode(
            line=ctx.start.line, column=ctx.start.column,
            kind="src",
            value=ctx.STRING().getText().strip('"\''),
        )

    def visitHrefAttribute(
        self, ctx: ArabicHtmlParser.HrefAttributeContext
    ) -> AttributeNode:
        """ATTR_HREF JS_ASSIGN STRING   # hrefAttribute"""
        return AttributeNode(
            line=ctx.start.line, column=ctx.start.column,
            kind="href",
            value=ctx.STRING().getText().strip('"\''),
        )

    # ─────────────────────────────────────────────────────────────
    #  CSS / Styling nodes
    # ─────────────────────────────────────────────────────────────

    def visitCssRule(
        self, ctx: ArabicHtmlParser.CssRuleContext
    ) -> CssRuleNode:
        """
        cssRule : selector LBRACE declarationList RBRACE
        """
        sel_node = self.visitSelector(ctx.selector())
        decl_list = self.visitDeclarationList(ctx.declarationList())
        return CssRuleNode(
            line=ctx.start.line,
            column=ctx.start.column,
            selector=sel_node,
            declaration_list=decl_list,
        )

    def visitSelector(
        self, ctx: ArabicHtmlParser.SelectorContext
    ) -> CssSelectorNode:
        """
        selector
            : IDENTIFIER              # element selector
            | HASH IDENTIFIER         # ID selector
            | DOT IDENTIFIER          # class selector
            | CSS_MEDIA IDENTIFIER    # @media rule
        """
        line = ctx.start.line
        col = ctx.start.column

        if ctx.HASH():
            ident = ctx.IDENTIFIER().getText()
            return CssSelectorNode(
                line=line, column=col,
                kind=SelectorKind.ID,
                name=ident,
                raw_text="#" + ident,
            )
        if ctx.DOT():
            ident = ctx.IDENTIFIER().getText()
            return CssSelectorNode(
                line=line, column=col,
                kind=SelectorKind.CLASS,
                name=ident,
                raw_text="." + ident,
            )
        if ctx.CSS_MEDIA():
            ident = ctx.IDENTIFIER().getText()
            return CssSelectorNode(
                line=line, column=col,
                kind=SelectorKind.MEDIA,
                name=ident,
                raw_text=ctx.CSS_MEDIA().getText() + " " + ident,
            )
        # Plain element selector
        ident = ctx.IDENTIFIER().getText()
        return CssSelectorNode(
            line=line, column=col,
            kind=SelectorKind.ELEMENT,
            name=ident,
            raw_text=ident,
        )

    def visitDeclarationList(
        self, ctx: ArabicHtmlParser.DeclarationListContext
    ) -> CssDeclarationListNode:
        """
        declarationList : declaration (SEMI declaration)* SEMI?
        """
        node = CssDeclarationListNode(
            line=ctx.start.line, column=ctx.start.column
        )
        for decl_ctx in ctx.declaration():
            decl = self.visitDeclaration(decl_ctx)
            if decl is not None:
                node.declarations.append(decl)
        return node

    def visitDeclaration(
        self, ctx: ArabicHtmlParser.DeclarationContext
    ) -> CssDeclarationNode:
        """
        declaration : cssProperty COLON cssValue
        """
        prop_name = ctx.cssProperty().getText()
        value_node = self.visitCssValue(ctx.cssValue())
        return CssDeclarationNode(
            line=ctx.start.line,
            column=ctx.start.column,
            property_name=prop_name,
            value=value_node,
        )

    def visitCssProperty(self, ctx: ArabicHtmlParser.CssPropertyContext) -> str:
        """Returns the raw Arabic property token text."""
        return ctx.getText()

    def visitCssValue(
        self, ctx: ArabicHtmlParser.CssValueContext
    ) -> CssValueNode:
        """
        cssValue
            : IDENTIFIER | NUMBER | CSS_UNIT | CSS_HEX_COLOR | STRING
            | CSS_INHERIT | CSS_INITIAL | CSS_UNSET | CSS_NONE | CSS_AUTO
            | CSS_CENTER | CSS_SOLID | CSS_DASHED | CSS_DOTTED | CSS_DOUBLE
            | CSS_HIDDEN | CSS_BLOCK | CSS_INLINE | CSS_FLEX_VALUE
            | CSS_ABSOLUTE | CSS_RELATIVE | CSS_FIXED | CSS_STICKY
            | CSS_ROW | CSS_COLUMN | CSS_WRAP | CSS_BOLD | CSS_ITALIC
            | cssFunction
        """
        if ctx.cssFunction():
            func_node = self.visitCssFunction(ctx.cssFunction())
            return CssValueNode(
                line=ctx.start.line,
                column=ctx.start.column,
                raw_text=ctx.getText(),
                is_function=True,
                function_node=func_node,
            )
        return CssValueNode(
            line=ctx.start.line,
            column=ctx.start.column,
            raw_text=ctx.getText(),
        )

    def visitCssFunction(
        self, ctx: ArabicHtmlParser.CssFunctionContext
    ) -> CssFunctionValueNode:
        """
        cssFunction
            : (CSS_URL_FUNC | CSS_RGB_FUNC | CSS_RGBA_FUNC | CSS_CALC_FUNC
               | CSS_VAR_FUNC | CSS_ROTATE_FUNC | CSS_SCALE_FUNC | CSS_BLUR_FUNC)
              LPAREN (expression (COMMA expression)*)? RPAREN
        """
        # The function keyword is the first token.
        func_name = ctx.getChild(0).getText()
        node = CssFunctionValueNode(
            line=ctx.start.line,
            column=ctx.start.column,
            function_name=func_name,
        )
        for expr_ctx in ctx.expression():
            arg = self.visitExpression(expr_ctx)
            if arg is not None:
                node.arguments.append(arg)
        return node

    # ─────────────────────────────────────────────────────────────
    #  JavaScript statements
    # ─────────────────────────────────────────────────────────────

    def visitJsStatement(
        self, ctx: ArabicHtmlParser.JsStatementContext
    ) -> Optional[ASTNode]:
        """
        jsStatement
            : variableDeclaration | assignmentStatement | ifStatement
            | forLoop | whileLoop | functionDeclaration | returnStatement
            | tryCatchStatement | expressionStatement | builtInCall | block
        """
        if ctx.variableDeclaration():
            return self.visitVariableDeclaration(ctx.variableDeclaration())
        if ctx.assignmentStatement():
            return self.visitAssignmentStatement(ctx.assignmentStatement())
        if ctx.ifStatement():
            return self.visitIfStatement(ctx.ifStatement())
        if ctx.forLoop():
            return self.visitForLoop(ctx.forLoop())
        if ctx.whileLoop():
            return self.visitWhileLoop(ctx.whileLoop())
        if ctx.functionDeclaration():
            return self.visitFunctionDeclaration(ctx.functionDeclaration())
        if ctx.returnStatement():
            return self.visitReturnStatement(ctx.returnStatement())
        if ctx.tryCatchStatement():
            return self.visitTryCatchStatement(ctx.tryCatchStatement())
        if ctx.expressionStatement():
            return self.visitExpressionStatement(ctx.expressionStatement())
        if ctx.builtInCall():
            return self.visitBuiltInCall(ctx.builtInCall())
        if ctx.block():
            return self.visitBlock(ctx.block())
        return None

    def visitBlock(
        self, ctx: ArabicHtmlParser.BlockContext
    ) -> JsBlockNode:
        """block : LBRACE jsStatement* RBRACE"""
        node = JsBlockNode(line=ctx.start.line, column=ctx.start.column)
        for stmt_ctx in ctx.jsStatement():
            stmt = self.visitJsStatement(stmt_ctx)
            if stmt is not None:
                node.statements.append(stmt)
        return node

    def visitVariableDeclaration(
        self, ctx: ArabicHtmlParser.VariableDeclarationContext
    ) -> JsVariableDeclarationNode:
        """
        variableDeclaration : (JS_VAR | JS_LET | JS_CONST) IDENTIFIER (JS_ASSIGN expression)? SEMI
        """
        kw = ctx.getChild(0).getText()
        name = ctx.IDENTIFIER().getText()
        init = None
        if ctx.expression():
            init = self.visitExpression(ctx.expression())
        return JsVariableDeclarationNode(
            line=ctx.start.line, column=ctx.start.column,
            keyword=kw, name=name, initializer=init,
        )

    def visitAssignmentStatement(
        self, ctx: ArabicHtmlParser.AssignmentStatementContext
    ) -> JsAssignmentStatementNode:
        """
        assignmentStatement
            : IDENTIFIER (JS_ASSIGN | JS_ADD_ASSIGN | JS_SUB_ASSIGN
                          | JS_MUL_ASSIGN | JS_DIV_ASSIGN) expression SEMI
        """
        target = ctx.IDENTIFIER().getText()
        op = ctx.getChild(1).getText()
        val = self.visitExpression(ctx.expression())
        return JsAssignmentStatementNode(
            line=ctx.start.line, column=ctx.start.column,
            target=target, operator=op, value=val,
        )

    def visitIfStatement(
        self, ctx: ArabicHtmlParser.IfStatementContext
    ) -> JsIfStatementNode:
        """
        ifStatement : JS_IF LPAREN expression RPAREN jsStatement (JS_ELSE jsStatement)?
        """
        cond = self.visitExpression(ctx.expression())
        stmts = ctx.jsStatement()
        then_br = self.visitJsStatement(stmts[0])
        else_br = self.visitJsStatement(stmts[1]) if len(stmts) > 1 else None
        return JsIfStatementNode(
            line=ctx.start.line, column=ctx.start.column,
            condition=cond, then_branch=then_br, else_branch=else_br,
        )

    def visitForLoop(
        self, ctx: ArabicHtmlParser.ForLoopContext
    ) -> JsForLoopNode:
        """
        forLoop
            : JS_FOR LPAREN (variableDeclaration | expression SEMI expression SEMI expression) RPAREN jsStatement
            | JS_FOR LPAREN (JS_LET | JS_VAR) IDENTIFIER (JS_OF | JS_IN) expression RPAREN jsStatement
        """
        line, col = ctx.start.line, ctx.start.column
        body = self.visitJsStatement(ctx.jsStatement())

        # Detect for-of / for-in form by checking for JS_OF or JS_IN tokens
        child_texts = [ctx.getChild(i).getText() for i in range(ctx.getChildCount())]
        if 'في' in child_texts or 'ضمن' in child_texts:  # JS_IN / JS_OF
            # JS_FOR LPAREN (JS_LET|JS_VAR) IDENTIFIER (JS_OF|JS_IN) expression RPAREN body
            kind = 'of' if 'ضمن' in child_texts else 'in'
            ident_token = ctx.IDENTIFIER()
            iterator = ident_token.getText() if ident_token else ""
            iterable = self.visitExpression(ctx.expression(0)) if ctx.expression() else None
            return JsForLoopNode(
                line=line, column=col,
                loop_kind=kind, iterator=iterator, iterable=iterable, body=body,
            )

        # Classic for (init; cond; update)
        init_node = None
        if ctx.variableDeclaration():
            init_node = self.visitVariableDeclaration(ctx.variableDeclaration())
        exprs = ctx.expression()
        cond_node = self.visitExpression(exprs[0]) if len(exprs) > 0 else None
        update_node = self.visitExpression(exprs[1]) if len(exprs) > 1 else None
        if ctx.variableDeclaration():
            cond_node = self.visitExpression(exprs[0]) if len(exprs) > 0 else None
            update_node = self.visitExpression(exprs[1]) if len(exprs) > 1 else None
        else:
            init_node = self.visitExpression(exprs[0]) if len(exprs) > 0 else None
            cond_node = self.visitExpression(exprs[1]) if len(exprs) > 1 else None
            update_node = self.visitExpression(exprs[2]) if len(exprs) > 2 else None
        return JsForLoopNode(
            line=line, column=col,
            loop_kind='classic',
            init=init_node, condition=cond_node, update=update_node, body=body,
        )

    def visitWhileLoop(
        self, ctx: ArabicHtmlParser.WhileLoopContext
    ) -> JsWhileLoopNode:
        """whileLoop : JS_WHILE LPAREN expression RPAREN jsStatement"""
        cond = self.visitExpression(ctx.expression())
        body = self.visitJsStatement(ctx.jsStatement())
        return JsWhileLoopNode(
            line=ctx.start.line, column=ctx.start.column,
            condition=cond, body=body,
        )

    def visitFunctionDeclaration(
        self, ctx: ArabicHtmlParser.FunctionDeclarationContext
    ) -> JsFunctionDeclarationNode:
        """functionDeclaration : JS_FUNCTION IDENTIFIER LPAREN parameterList? RPAREN block"""
        name = ctx.IDENTIFIER().getText()
        params: List[str] = []
        if ctx.parameterList():
            params = self.visitParameterList(ctx.parameterList())
        body = self.visitBlock(ctx.block())
        return JsFunctionDeclarationNode(
            line=ctx.start.line, column=ctx.start.column,
            name=name, params=params, body=body,
        )

    def visitParameterList(
        self, ctx: ArabicHtmlParser.ParameterListContext
    ) -> List[str]:
        """parameterList : IDENTIFIER (COMMA IDENTIFIER)*"""
        return [tok.getText() for tok in ctx.IDENTIFIER()]

    def visitReturnStatement(
        self, ctx: ArabicHtmlParser.ReturnStatementContext
    ) -> JsReturnStatementNode:
        """returnStatement : JS_RETURN expression? SEMI"""
        val = self.visitExpression(ctx.expression()) if ctx.expression() else None
        return JsReturnStatementNode(
            line=ctx.start.line, column=ctx.start.column,
            value=val,
        )

    def visitTryCatchStatement(
        self, ctx: ArabicHtmlParser.TryCatchStatementContext
    ) -> JsTryCatchNode:
        """
        tryCatchStatement
            : JS_TRY block JS_CATCH LPAREN IDENTIFIER RPAREN block (JS_FINALLY block)?
        """
        blocks = ctx.block()
        try_blk = self.visitBlock(blocks[0])
        catch_param = ctx.IDENTIFIER().getText()
        catch_blk = self.visitBlock(blocks[1])
        finally_blk = self.visitBlock(blocks[2]) if len(blocks) > 2 else None
        return JsTryCatchNode(
            line=ctx.start.line, column=ctx.start.column,
            try_block=try_blk,
            catch_param=catch_param,
            catch_block=catch_blk,
            finally_block=finally_blk,
        )

    def visitExpressionStatement(
        self, ctx: ArabicHtmlParser.ExpressionStatementContext
    ) -> JsExpressionStatementNode:
        """expressionStatement : expression SEMI"""
        expr = self.visitExpression(ctx.expression())
        return JsExpressionStatementNode(
            line=ctx.start.line, column=ctx.start.column,
            expression=expr,
        )

    def visitBuiltInCall(
        self, ctx: ArabicHtmlParser.BuiltInCallContext
    ) -> JsBuiltInCallNode:
        """
        builtInCall
            : (JS_CONSOLE DOT JS_LOG | JS_ALERT | JS_PROMPT)
              LPAREN (expression (COMMA expression)*)? RPAREN SEMI
        """
        # Gather the callee text from the tokens before LPAREN
        callee_parts = []
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if child.getText() == '(':
                break
            callee_parts.append(child.getText())
        callee = "".join(callee_parts)

        args: List[ASTNode] = []
        for expr_ctx in ctx.expression():
            arg = self.visitExpression(expr_ctx)
            if arg is not None:
                args.append(arg)
        return JsBuiltInCallNode(
            line=ctx.start.line, column=ctx.start.column,
            callee=callee, arguments=args,
        )

    # ─────────────────────────────────────────────────────────────
    #  JavaScript expressions
    # ─────────────────────────────────────────────────────────────

    def visitExpression(
        self, ctx: ArabicHtmlParser.ExpressionContext
    ) -> ASTNode:
        """expression : assignmentExpression"""
        return self.visitAssignmentExpression(ctx.assignmentExpression())

    def visitAssignmentExpression(
        self, ctx: ArabicHtmlParser.AssignmentExpressionContext
    ) -> ASTNode:
        """assignmentExpression : logicalOrExpression (JS_ASSIGN expression)?"""
        left = self.visitLogicalOrExpression(ctx.logicalOrExpression())
        if ctx.expression():
            right = self.visitExpression(ctx.expression())
            return JsExpressionNode(
                line=ctx.start.line, column=ctx.start.column,
                left=left, operator="=", right=right,
            )
        return left

    def visitLogicalOrExpression(
        self, ctx: ArabicHtmlParser.LogicalOrExpressionContext
    ) -> ASTNode:
        """logicalOrExpression : logicalAndExpression (JS_OR logicalAndExpression)*"""
        return self._fold_binary(ctx, ctx.logicalAndExpression(), self.visitLogicalAndExpression, "||")

    def visitLogicalAndExpression(
        self, ctx: ArabicHtmlParser.LogicalAndExpressionContext
    ) -> ASTNode:
        """logicalAndExpression : equalityExpression (JS_AND equalityExpression)*"""
        return self._fold_binary(ctx, ctx.equalityExpression(), self.visitEqualityExpression, "&&")

    def visitEqualityExpression(
        self, ctx: ArabicHtmlParser.EqualityExpressionContext
    ) -> ASTNode:
        """equalityExpression : relationalExpression ((===|!==|==|!=) relationalExpression)*"""
        operands = ctx.relationalExpression()
        result = self.visitRelationalExpression(operands[0])
        op_idx = 1  # token children interleaved between operands
        for rel in operands[1:]:
            # operator token sits between the two relational expressions in the child list
            op = self._extract_operator_between(ctx, operands[op_idx - 1], rel)
            right = self.visitRelationalExpression(rel)
            result = JsExpressionNode(
                line=ctx.start.line, column=ctx.start.column,
                left=result, operator=op, right=right,
            )
            op_idx += 1
        return result

    def visitRelationalExpression(
        self, ctx: ArabicHtmlParser.RelationalExpressionContext
    ) -> ASTNode:
        """relationalExpression : additiveExpression ((<|>|>=|<=|instanceof|in) additiveExpression)*"""
        operands = ctx.additiveExpression()
        result = self.visitAdditiveExpression(operands[0])
        for i, add in enumerate(operands[1:], 1):
            op = self._extract_operator_between(ctx, operands[i - 1], add)
            right = self.visitAdditiveExpression(add)
            result = JsExpressionNode(
                line=ctx.start.line, column=ctx.start.column,
                left=result, operator=op, right=right,
            )
        return result

    def visitAdditiveExpression(
        self, ctx: ArabicHtmlParser.AdditiveExpressionContext
    ) -> ASTNode:
        """additiveExpression : multiplicativeExpression ((+|-) multiplicativeExpression)*"""
        return self._fold_binary(ctx, ctx.multiplicativeExpression(), self.visitMultiplicativeExpression, None)

    def visitMultiplicativeExpression(
        self, ctx: ArabicHtmlParser.MultiplicativeExpressionContext
    ) -> ASTNode:
        """multiplicativeExpression : memberExpression ((*|/|%) memberExpression)*"""
        return self._fold_binary(ctx, ctx.memberExpression(), self.visitMemberExpression, None)

    def visitMemberExpression(self, ctx: ArabicHtmlParser.MemberExpressionContext) -> ASTNode:
        """
        memberExpression
            : primaryExpression (
                LPAREN (expression (COMMA expression)*)? RPAREN 
                | DOT (IDENTIFIER | JS_LOG | JS_ADD_LISTENER | JS_INNER_TEXT | JS_STYLE) 
                | LBRACK expression RBRACK 
            )*
            ;
        """
        # 1. نبدأ بزيارة التعبير الأساسي (مثل اسم الدالة أو الكائن)
        result = self.visit(ctx.primaryExpression())
        
        # 2. إذا لم يكن هناك لاحقات متكررة، نعيد التعبير الأساسي مباشرة
        if ctx.getChildCount() == 1:
            return result

        # 3. نمر على اللاحقات المتكررة لبناء الشجرة بشكل متداخل (Left-Associative)
        child_count = ctx.getChildCount()
        i = 1 # نبدأ من الابن الثاني بعد primaryExpression
        
        while i < child_count:
            child = ctx.getChild(i)
            token_text = child.getText()
            
            # الحالة الأولى: استدعاء دالة LPAREN ... RPAREN
            if token_text == '(':
                # نحدد السطر والعمود عند بداية القوس
                line = child.symbol.line if hasattr(child, 'symbol') else ctx.start.line
                col = child.symbol.column if hasattr(child, 'symbol') else ctx.start.column
                
                # نجمع كل التعبيرات الممررة كوسائط (expression) داخل الأقواس
                # الجرامر يحتوي على مصفوفة من الـ expression() داخل هذا النطاق
                args_ctxs = []
                i += 1
                while i < child_count and ctx.getChild(i).getText() != ')':
                    current_child = ctx.getChild(i)
                    # إذا كان الابن عبارة عن تعبير (ExpressionContext)، نضيفه للقائمة
                    if isinstance(current_child, ArabicHtmlParser.ExpressionContext):
                        args_ctxs.append(current_child)
                    i += 1
                
                # نقوم بزيارة كل وسيط وتحويله إلى عقدة AST
                visited_args = [self.visit(arg) for arg in args_ctxs]
                
                # نضع قائمة الوسائط المستخرجة داخل خانة الـ right بدلاً من None
                # (ملاحظة: يمكنك تمرير القائمة مباشرة أو لفها في عقدة مخصصة إذا أردت)
                result = JsExpressionNode(
                    line=line, column=col,
                    left=result, 
                    operator="()", 
                    right=visited_args # الآن الوسائط مثل "click" و ترحيب محفوظة هنا!
                )
                
            # الحالة الثانية: الوصول لخاصية عبر النقطة DOT
            elif token_text == '.':
                i += 1 # الانتقال إلى المعرّف المكتوب بعد النقطة
                prop_child = ctx.getChild(i)
                line = child.symbol.line if hasattr(child, 'symbol') else ctx.start.line
                col = child.symbol.column if hasattr(child, 'symbol') else ctx.start.column
                
                # ننشئ عقدة تمثل المعرّف الأيمن
                right_node = JsPrimaryNode(
                    line=prop_child.start.line if hasattr(prop_child, 'start') else line,
                    column=prop_child.start.column if hasattr(prop_child, 'start') else col,
                    kind="identifier",
                    value=prop_child.getText()
                )
                
                result = JsExpressionNode(
                    line=line, column=col,
                    left=result, 
                    operator=".", 
                    right=right_node
                )
                
            # الحالة الثالثة: الوصول لعنصر في مصفوفة LBRACK ... RBRACK
            elif token_text == '[':
                line = child.symbol.line if hasattr(child, 'symbol') else ctx.start.line
                col = child.symbol.column if hasattr(child, 'symbol') else ctx.start.column
                
                i += 1 # الانتقال إلى التعبير المعبر عن الفهرس (Index Expression)
                expr_child = ctx.getChild(i)
                index_node = self.visit(expr_child)
                
                # تخطي قوس الإغلاق ]
                while i < child_count and ctx.getChild(i).getText() != ']':
                    i += 1
                    
                result = JsExpressionNode(
                    line=line, column=col,
                    left=result, 
                    operator="[]", 
                    right=index_node
                )
                
            i += 1
            
        return result

    def visitPrimaryExpression(
        self, ctx: ArabicHtmlParser.PrimaryExpressionContext
    ) -> ASTNode:
        """
        primaryExpression
            : IDENTIFIER | NUMBER | STRING
            | JS_TRUE | JS_FALSE | JS_NULL | JS_UNDEFINED | JS_THIS | JS_NAN
            | JS_DOCUMENT | JS_WINDOW
            | LPAREN expression RPAREN
            | arrayLiteral | objectLiteral
        """
        line, col = ctx.start.line, ctx.start.column
        text = ctx.getText()

        if ctx.arrayLiteral():
            return self.visitArrayLiteral(ctx.arrayLiteral())
        if ctx.objectLiteral():
            return self.visitObjectLiteral(ctx.objectLiteral())
        if ctx.expression():
            inner = self.visitExpression(ctx.expression())
            return JsPrimaryNode(line=line, column=col, kind="paren", elements=[inner])
        if ctx.IDENTIFIER():
            return JsPrimaryNode(line=line, column=col, kind="identifier", value=text)
        if ctx.NUMBER():
            return JsPrimaryNode(line=line, column=col, kind="number", value=text)
        if ctx.STRING():
            return JsPrimaryNode(line=line, column=col, kind="string", value=text)
        # Boolean / null / special keywords
        return JsPrimaryNode(line=line, column=col, kind="keyword", value=text)

    def visitArrayLiteral(
        self, ctx: ArabicHtmlParser.ArrayLiteralContext
    ) -> JsPrimaryNode:
        """arrayLiteral : LBRACK (expression (COMMA expression)*)? RBRACK"""
        elements = [self.visitExpression(e) for e in ctx.expression()]
        return JsPrimaryNode(
            line=ctx.start.line, column=ctx.start.column,
            kind="array", elements=elements,
        )

    def visitObjectLiteral(
        self, ctx: ArabicHtmlParser.ObjectLiteralContext
    ) -> JsPrimaryNode:
        """
        objectLiteral : LBRACE (IDENTIFIER COLON expression (COMMA IDENTIFIER COLON expression)*)? RBRACE
        """
        keys = [tok.getText() for tok in ctx.IDENTIFIER()]
        exprs = [self.visitExpression(e) for e in ctx.expression()]
        pairs = list(zip(keys, exprs))
        return JsPrimaryNode(
            line=ctx.start.line, column=ctx.start.column,
            kind="object", pairs=pairs,
        )

    # ── Helpers ───────────────────────────────────────────────────

    def _fold_binary(self, ctx, operands, visit_fn, fixed_op) -> ASTNode:
        """
        Left-fold a list of operand contexts into a chain of JsExpressionNode.
        When fixed_op is None the operator is inferred by scanning child tokens
        between successive operands.
        """
        result = visit_fn(operands[0])
        for i, operand in enumerate(operands[1:], 1):
            op = fixed_op if fixed_op else self._extract_operator_between(ctx, operands[i - 1], operand)
            right = visit_fn(operand)
            result = JsExpressionNode(
                line=ctx.start.line, column=ctx.start.column,
                left=result, operator=op, right=right,
            )
        return result

    @staticmethod
    def _extract_operator_between(parent_ctx, left_ctx, right_ctx) -> str:
        """
        Scan the parent rule's child tokens to find the operator token that
        sits between left_ctx and right_ctx in the token stream.
        """
        left_end = left_ctx.stop.tokenIndex if left_ctx.stop else -1
        right_start = right_ctx.start.tokenIndex if right_ctx.start else -1
        for i in range(parent_ctx.getChildCount()):
            child = parent_ctx.getChild(i)
            # terminal nodes have .symbol; rule contexts do not
            if hasattr(child, 'symbol'):
                idx = child.symbol.tokenIndex
                if left_end < idx < right_start:
                    return child.getText()
        return ""