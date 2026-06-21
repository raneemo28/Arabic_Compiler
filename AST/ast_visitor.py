# =============================================================================
#  ast_visitor.py
#  Converts the ANTLR parse tree produced by ArabicHtmlParser into a typed
#  AST using the node classes in ast_nodes.py.
#
#  Class    : ArabicHtmlAstVisitor
#  Extends  : ArabicHtmlParserVisitor   (ANTLR-generated)
#
#  Grammar entry point : program  (not document — that was the old grammar)
#  Parser import       : ArabicHtmlParser  (not ArabicWebParser)
#
#  Design
#  ------
#  Every visitXxx method corresponds to one parser rule.
#  Methods return the matching ASTNode subclass.
#  self.visit(ctx) recurses into child rules automatically.
#
#  The visitor is organised in the same order as the parser grammar:
#    1. Program (entry)
#    2. HTML
#    3. CSS
#    4. TypeScript statements
#    5. TypeScript expressions
# =============================================================================

from __future__ import annotations
import sys
import os

# Tell Python where to find the ANTLR-generated files
# sys.path.insert(0, os.path.join(os.path.dirname(__file__), '..', 'Grammar'))

from typing import Optional
from Grammar.ArabicHtmlParserVisitor import ArabicHtmlParserVisitor
from Grammar.ArabicHtmlParser import ArabicHtmlParser

# All AST node classes
from AST.ast_nodes import (
    ASTNode,
    # HTML
    ProgramNode, TagNode, SelfClosingTagNode, AttributeNode,
    TextNode,
    # CSS
    CssRuleNode, CssSelectorNode, SelectorKind,
    CssDeclarationListNode, CssDeclarationNode,
    CssValueNode, CssFunctionValueNode,
    # TS statements
    JsBlockNode, JsVariableDeclarationNode,
    JsAssignmentStatementNode, JsIfStatementNode,
    JsForLoopNode, JsWhileLoopNode,
    JsFunctionDeclarationNode, JsReturnStatementNode,
    JsTryCatchNode, JsExpressionStatementNode,
    JsBuiltInCallNode,
    # TS new nodes
    TsTypedDeclarationNode, JsInterfaceDeclarationNode,
    # TS expressions
    JsExpressionNode, JsPrimaryNode,
)


def _loc(token) -> dict:
    """Extract line/column from an ANTLR token into a dict for **kwargs."""
    return {"line": token.line, "column": token.column}


def _tok(ctx) -> dict:
    """Convenience: get location from a context's start token."""
    return _loc(ctx.start)


class ArabicHtmlAstVisitor(ArabicHtmlParserVisitor):
    """
    Single-pass visitor that walks the ANTLR parse tree top-down and
    returns a ProgramNode as the AST root from visitProgram().

    Usage
    -----
        visitor  = ArabicHtmlAstVisitor()
        ast_root = visitor.visit(parse_tree)   # returns ProgramNode
    """

    # =========================================================================
    # 1. PROGRAM — entry point
    # =========================================================================


    def visit(self, tree):
        """
        Override ANTLR's visit to call our methods directly by context class name.
        This bypasses the accept() dispatch which fails due to module import conflicts.
        """
        if tree is None:
            return None
        class_name = type(tree).__name__  # e.g. 'ParentElementContext'
        # strip 'Context' suffix and add 'visit' prefix
        method_name = 'visit' + class_name.replace('Context', '')
        method = getattr(self, method_name, None)
        if method:
            return method(tree)
        # fallback
        return self.visitChildren(tree)
    
    def visitProgram(self, ctx: ArabicHtmlParser.ProgramContext) -> ProgramNode:
        node = ProgramNode(**_tok(ctx))
        for child in ctx.children or []:
            if isinstance(child, ArabicHtmlParser.HtmlElementContext):
                node.children.append(self.visit(child))
            elif isinstance(child, ArabicHtmlParser.CssRuleContext):
                node.children.append(self.visit(child))
            elif isinstance(child, ArabicHtmlParser.TsStatementContext):
                node.children.append(self.visit(child))
            else:
                print(f"DEBUG → NO MATCH for {type(child).__name__}")
        node.children = [c for c in node.children if c is not None]
        return node

    # =========================================================================
    # 2. HTML
    # =========================================================================

    def visitParentElement(self, ctx: ArabicHtmlParser.ParentElementContext) -> TagNode:
        """
        htmlElement # parentElement
            : OPEN_TAG_START attribute* GT htmlContent CLOSE_TAG
        """
        # OPEN_TAG_START text is e.g. '<مقال'  → strip the leading '<'
    
        print(f"DEBUG visitParentElement called, tag={ctx.OPEN_TAG_START().getText()}")
    
        tag_name = ctx.OPEN_TAG_START().getText()[1:]
    
        # CLOSE_TAG text is e.g. '</مقال>'  → strip leading '</' and trailing '>'
        closing_tag_name = ctx.CLOSE_TAG().getText()[2:-1]
    
        attrs = [self.visit(a) for a in (ctx.attribute() or [])]
    
        children = []
        if ctx.htmlContent():
            children = self._visit_html_content(ctx.htmlContent())
    
        return TagNode(
            tag_name=tag_name,
            attributes=attrs,
            children=children,
            closing_tag_name=closing_tag_name,
            **_loc(ctx.OPEN_TAG_START().symbol),
        )

    def visitSelfClosingElement(self, ctx: ArabicHtmlParser.SelfClosingElementContext) -> SelfClosingTagNode:
        """
        htmlElement # selfClosingElement
            : OPEN_TAG_START attribute* SELF_CLOSE_END
        """
        tag_name = ctx.OPEN_TAG_START().getText()[1:]
        attrs = [self.visit(a) for a in (ctx.attribute() or [])]
        return SelfClosingTagNode(
            tag_name=tag_name,
            attributes=attrs,
            **_loc(ctx.OPEN_TAG_START().symbol),
        )

    def _visit_html_content(self, ctx: ArabicHtmlParser.HtmlContentContext) -> list:
        result = []
        for child in ctx.children or []:
            if isinstance(child, ArabicHtmlParser.HtmlElementContext):
                result.append(self.visit(child))
            elif isinstance(child, ArabicHtmlParser.TsStatementContext):
                result.append(self.visit(child))
            elif isinstance(child, ArabicHtmlParser.CssRuleContext):
                result.append(self.visit(child))
            elif isinstance(child, ArabicHtmlParser.TextContext):
                result.append(self.visit(child))
        return [r for r in result if r is not None]

    # ── Attributes ────────────────────────────────────────────────────────────

    def visitIdAttribute(self, ctx: ArabicHtmlParser.IdAttributeContext) -> AttributeNode:
        return AttributeNode(kind="id",
                             value=ctx.STRING().getText().strip('"\''),
                             **_tok(ctx))

    def visitClassAttribute(self, ctx: ArabicHtmlParser.ClassAttributeContext) -> AttributeNode:
        return AttributeNode(kind="class",
                             value=ctx.STRING().getText().strip('"\''),
                             **_tok(ctx))

    def visitSrcAttribute(self, ctx: ArabicHtmlParser.SrcAttributeContext) -> AttributeNode:
        return AttributeNode(kind="src",
                             value=ctx.STRING().getText().strip('"\''),
                             **_tok(ctx))

    def visitHrefAttribute(self, ctx: ArabicHtmlParser.HrefAttributeContext) -> AttributeNode:
        return AttributeNode(kind="href",
                             value=ctx.STRING().getText().strip('"\''),
                             **_tok(ctx))

    # ── Text content ──────────────────────────────────────────────────────────

    def visitText(self, ctx: ArabicHtmlParser.TextContext) -> TextNode:
        """
        text : STRING | IDENTIFIER | NUMBER | arabicKeyword ;
        Collapse all alternatives into a single TextNode with raw content.
        """
        return TextNode(content=ctx.getText(), **_tok(ctx))

    # =========================================================================
    # 3. CSS
    # =========================================================================

    def visitCssRule(self, ctx: ArabicHtmlParser.CssRuleContext) -> CssRuleNode:
        """
        cssRule : selector LBRACE declarationList RBRACE ;
        """
        selector = self.visit(ctx.selector())
        decl_list = self.visit(ctx.declarationList())
        return CssRuleNode(selector=selector,
                           declaration_list=decl_list,
                           **_tok(ctx))

    def visitSelector(self, ctx: ArabicHtmlParser.SelectorContext) -> CssSelectorNode:
        pseudo = ""
        if ctx.pseudoClass():
            pseudo = ctx.pseudoClass().getText().lstrip(":")

        if ctx.HASH():
            kind = SelectorKind.ID
            name = ctx.identifier().getText()
            raw  = "#" + name + (":" + pseudo if pseudo else "")
        elif ctx.DOT():
            kind = SelectorKind.CLASS
            name = ctx.identifier().getText()
            raw  = "." + name + (":" + pseudo if pseudo else "")
        elif ctx.CSS_MEDIA():
            kind = SelectorKind.MEDIA
            name = ctx.identifier().getText()
            raw  = ctx.CSS_MEDIA().getText() + " " + name
        else:
            kind = SelectorKind.ELEMENT
            name = ctx.identifier().getText()
            raw  = name + (":" + pseudo if pseudo else "")
        return CssSelectorNode(kind=kind, name=name, raw_text=raw, pseudo_class=pseudo, **_tok(ctx))
    
    def visitDeclarationList(self, ctx: ArabicHtmlParser.DeclarationListContext) -> CssDeclarationListNode:
        """
        declarationList : (declaration (SEMI declaration)*)? SEMI? ;
        """
        decls = [self.visit(d) for d in (ctx.declaration() or [])]
        return CssDeclarationListNode(declarations=decls, **_tok(ctx))

    def visitDeclaration(self, ctx: ArabicHtmlParser.DeclarationContext) -> CssDeclarationNode:
        """
        declaration : cssProperty COLON cssValue ;
        """
        prop_name = ctx.cssProperty().getText()
        value_node = self.visit(ctx.cssValue())
        return CssDeclarationNode(property_name=prop_name,
                                  value=value_node,
                                  **_tok(ctx))

    def visitCssValue(self, ctx: ArabicHtmlParser.CssValueContext) -> CssValueNode:
        """
        cssValue : IDENTIFIER | NUMBER | CSS_UNIT | CSS_HEX_COLOR | STRING
                 | <keyword tokens> | cssFunction ;
        """
        if ctx.cssFunction():
            fn_node = self.visit(ctx.cssFunction())
            return CssValueNode(raw_text=ctx.getText(),
                                is_function=True,
                                function_node=fn_node,
                                **_tok(ctx))
        return CssValueNode(raw_text=ctx.getText(), **_tok(ctx))

    def visitCssFunction(self, ctx: ArabicHtmlParser.CssFunctionContext) -> CssFunctionValueNode:
        """
        cssFunction : (CSS_URL_FUNC | CSS_RGB_FUNC | …) LPAREN (cssValue (COMMA cssValue)*)? RPAREN ;
        """
        # First token is the function keyword
        fn_name = ctx.getChild(0).getText()
        args = [self.visit(v) for v in (ctx.cssValue() or [])]
        return CssFunctionValueNode(function_name=fn_name,
                                    arguments=args,
                                    **_tok(ctx))

    # =========================================================================
    # 4. TypeScript / JavaScript — statements
    # =========================================================================

    def visitTsStatement(self, ctx: ArabicHtmlParser.TsStatementContext) -> ASTNode:
        # find the single real child and visit it directly
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            class_name = type(child).__name__
            method_name = 'visit' + class_name.replace('Context', '')
            method = getattr(self, method_name, None)
            if method:
                return method(child)
        return None

    # ── Variable / array declarations ─────────────────────────────────────────

    def visitTsDeclaration(self, ctx: ArabicHtmlParser.TsDeclarationContext) -> ASTNode:
        keyword = ctx.getChild(0).getText()
        name    = ctx.identifier().getText()

        if ctx.COLON():
            type_name = ctx.tsType().getText()
            if ctx.LBRACK():
                is_array    = True
                init_ctx    = ctx.arrayLiteral()
                initializer = self.visit(init_ctx) if init_ctx else None
            else:
                is_array    = False
                init_ctx    = ctx.expression()
                initializer = self.visit(init_ctx) if init_ctx else None
            return TsTypedDeclarationNode(
                keyword=keyword, name=name, type_name=type_name,
                is_array=is_array, initializer=initializer, **_tok(ctx),
            )

        # لا يوجد COLON: إما واجهة كائن أو تعبير عادي بلا نوع صريح (استنتاج نوع)
        if ctx.objectLiteral():
            initializer = self.visit(ctx.objectLiteral())
        else:
            initializer = self.visit(ctx.expression()) if ctx.expression() else None

        return JsVariableDeclarationNode(
            keyword=keyword, name=name, initializer=initializer, **_tok(ctx),
        )

    def visitInterfaceDeclaration(self, ctx: ArabicHtmlParser.InterfaceDeclarationContext) -> JsInterfaceDeclarationNode:
        """
        interfaceDeclaration : TS_INTERFACE IDENTIFIER LBRACE interfaceMember* RBRACE ;
        """
        name = ctx.IDENTIFIER().getText()
        members = [self.visit(m) for m in (ctx.interfaceMember() or [])]
        return JsInterfaceDeclarationNode(name=name, members=members, **_tok(ctx))


    def visitInterfaceMember(self, ctx: ArabicHtmlParser.InterfaceMemberContext):
        """
        interfaceMember : IDENTIFIER COLON tsType SEMI ;
        تُعاد كزوج (اسم، نوع) بسيط — بيانات وصفية فقط، لا تحتاج عقدة AST
        كاملة ولا visit خاص بها في بقية الزوار.
        """
        return (ctx.IDENTIFIER().getText(), ctx.tsType().getText())
    # ── Assignment ────────────────────────────────────────────────────────────

    def visitAssignmentStatement(self, ctx: ArabicHtmlParser.AssignmentStatementContext) -> JsAssignmentStatementNode:
        """
        assignmentStatement
            : identifier (TS_ASSIGN | TS_ADD_ASSIGN | …) expression SEMI ;
        """
        target   = ctx.identifier().getText()
        operator = ctx.getChild(1).getText()   # the operator token
        value    = self.visit(ctx.expression())
        return JsAssignmentStatementNode(target=target,
                                         operator=operator,
                                         value=value,
                                         **_tok(ctx))

    # ── If statement ──────────────────────────────────────────────────────────

    def visitIfStatement(self, ctx: ArabicHtmlParser.IfStatementContext) -> JsIfStatementNode:
        """
        ifStatement : TS_IF LPAREN expression RPAREN tsStatement (TS_ELSE tsStatement)? ;
        """
        condition   = self.visit(ctx.expression())
        stmts       = ctx.tsStatement()
        then_branch = self.visit(stmts[0])
        else_branch = self.visit(stmts[1]) if len(stmts) > 1 else None
        return JsIfStatementNode(condition=condition,
                                  then_branch=then_branch,
                                  else_branch=else_branch,
                                  **_tok(ctx))

    # ── Loops ─────────────────────────────────────────────────────────────────

    def visitForLoop(self, ctx: ArabicHtmlParser.ForLoopContext) -> JsForLoopNode:
        """
        forLoop : TS_FOR LPAREN (variableDeclaration | assignmentExpression)
                  expression SEMI expression RPAREN block ;
        """
        # init: first child inside parens
        init_ctx  = ctx.variableDeclaration() or ctx.assignmentExpression()
        init      = self.visit(init_ctx) if init_ctx else None
        exprs     = ctx.expression()
        condition = self.visit(exprs[0]) if exprs else None
        update    = self.visit(exprs[1]) if len(exprs) > 1 else None
        body      = self.visit(ctx.block())
        return JsForLoopNode(init=init,
                              condition=condition,
                              update=update,
                              loop_kind="classic",
                              body=body,
                              **_tok(ctx))

    def visitArrayLoop(self, ctx: ArabicHtmlParser.ArrayLoopContext) -> JsForLoopNode:
        """
        arrayLoop : TS_FOR LPAREN TS_CONST identifier (TS_OF|TS_IN) expression RPAREN block ;
        """
        iterator = ctx.identifier().getText()
        # TS_OF or TS_IN — whichever is present
        loop_kind = "of" if ctx.TS_OF() else "in"
        iterable  = self.visit(ctx.expression())
        body      = self.visit(ctx.block())
        return JsForLoopNode(iterator=iterator,
                              iterable=iterable,
                              loop_kind=loop_kind,
                              body=body,
                              **_tok(ctx))

    def visitWhileLoop(self, ctx: ArabicHtmlParser.WhileLoopContext) -> JsWhileLoopNode:
        """
        whileLoop : TS_WHILE LPAREN expression RPAREN block ;
        """
        condition = self.visit(ctx.expression())
        body      = self.visit(ctx.block())
        return JsWhileLoopNode(condition=condition, body=body, **_tok(ctx))

    # ── Functions ─────────────────────────────────────────────────────────────

    def visitFunctionDeclaration(self, ctx: ArabicHtmlParser.FunctionDeclarationContext) -> JsFunctionDeclarationNode:
        """
        functionDeclaration : TS_FUNCTION identifier LPAREN parameterList? RPAREN block ;
        """
        name   = ctx.identifier().getText()
        params = []
        if ctx.parameterList():
            # parameterList : IDENTIFIER (COMMA IDENTIFIER COLON tsType)*
            # Collect every IDENTIFIER token text
            params = [id_.getText() for id_ in ctx.parameterList().IDENTIFIER()]
        body = self.visit(ctx.block())
        return JsFunctionDeclarationNode(name=name, params=params, body=body, **_tok(ctx))

    def visitReturnStatement(self, ctx: ArabicHtmlParser.ReturnStatementContext) -> JsReturnStatementNode:
        """
        returnStatement : TS_RETURN expression? SEMI ;
        """
        value = self.visit(ctx.expression()) if ctx.expression() else None
        return JsReturnStatementNode(value=value, **_tok(ctx))

    # ── Try-catch ─────────────────────────────────────────────────────────────

    def visitTryCatchStatement(self, ctx: ArabicHtmlParser.TryCatchStatementContext) -> JsTryCatchNode:
        """
        tryCatchStatement
            : TS_TRY block TS_CATCH LPAREN identifier RPAREN block (TS_FINALLY block)? ;
        """
        blocks       = ctx.block()
        try_block    = self.visit(blocks[0])
        catch_param  = ctx.identifier().getText()
        catch_block  = self.visit(blocks[1])
        finally_block = self.visit(blocks[2]) if len(blocks) > 2 else None
        return JsTryCatchNode(try_block=try_block,
                               catch_param=catch_param,
                               catch_block=catch_block,
                               finally_block=finally_block,
                               **_tok(ctx))

    # ── Expression statement & built-ins ──────────────────────────────────────

    def visitExpressionStatement(self, ctx: ArabicHtmlParser.ExpressionStatementContext) -> JsExpressionStatementNode:
        """
        expressionStatement : expression SEMI ;
        """
        expr = self.visit(ctx.expression())
        return JsExpressionStatementNode(expression=expr, **_tok(ctx))

    def visitBuiltInCall(self, ctx: ArabicHtmlParser.BuiltInCallContext) -> JsBuiltInCallNode:
        """
        builtInCall
            : (TS_CONSOLE DOT TS_LOG | TS_LOG | TS_ALERT | TS_PROMPT)
              LPAREN (expression (COMMA expression)*)? RPAREN SEMI ;
        """
        # Reconstruct callee string from first 1-3 tokens before LPAREN
        callee_parts = []
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            text  = child.getText()
            if text == "(":
                break
            callee_parts.append(text)
        callee = "".join(callee_parts)
        args   = [self.visit(e) for e in (ctx.expression() or [])]
        return JsBuiltInCallNode(callee=callee, arguments=args, **_tok(ctx))

    # ── Block ─────────────────────────────────────────────────────────────────

    def visitBlock(self, ctx: ArabicHtmlParser.BlockContext) -> JsBlockNode:
        stmts = [self.visit(s) for s in (ctx.tsStatement() or [])]
        return JsBlockNode(statements=[s for s in stmts if s is not None], **_tok(ctx))
    
    # =========================================================================
    # 5. TypeScript / JavaScript — expressions
    #
    # The grammar has a deep precedence chain:
    #   expression → assignmentExpression → logicalOrExpression → …
    #                → memberExpression → primaryExpression
    #
    # Strategy: collapse binary operator layers into JsExpressionNode(left, op, right).
    # Only primaryExpression and memberExpression get dedicated handling.
    # =========================================================================

    def _visit_binary(self, ctx) -> ASTNode:
        """
        Generic handler for all binary-operator expression rules.
        If there is only one child, delegate down. If there are multiple
        children (left op right op …), fold left into JsExpressionNode pairs.
        """
        children = [c for c in (ctx.children or [])
                    if not c.getText() in ("(", ")")]  # strip parens at this level
        if len(children) == 1:
            return self.visit(children[0])

        # Fold left: (((a op b) op c) op d) …
        result = self.visit(children[0])
        i = 1
        while i < len(children) - 1:
            op    = children[i].getText()
            right = self.visit(children[i + 1])
            result = JsExpressionNode(left=result, operator=op, right=right,
                                       **_tok(ctx))
            i += 2
        return result

    def visitExpression(self, ctx):            return self._visit_binary(ctx)
    def visitAssignmentExpression(self, ctx):  return self._visit_binary(ctx)
    def visitLogicalOrExpression(self, ctx):   return self._visit_binary(ctx)
    def visitLogicalAndExpression(self, ctx):  return self._visit_binary(ctx)
    def visitEqualityExpression(self, ctx):    return self._visit_binary(ctx)
    def visitRelationalExpression(self, ctx):  return self._visit_binary(ctx)
    def visitAdditiveExpression(self, ctx):    return self._visit_binary(ctx)
    def visitMultiplicativeExpression(self, ctx): return self._visit_binary(ctx)

    def visitMemberExpression(self, ctx: ArabicHtmlParser.MemberExpressionContext) -> ASTNode:
        """
        memberExpression
            : primaryExpression (
                LPAREN (expression (COMMA expression)*)? RPAREN
                | DOT (IDENTIFIER | TS_LOG | …)
                | LBRACK expression RBRACK
              )* ;

        A bare primaryExpression with no suffix → delegate.
        Any suffix → wrap as JsExpressionNode with operator=call/dot/index.
        """
        base = self.visit(ctx.primaryExpression())
        # If no suffixes, return base directly
        if ctx.getChildCount() == 1:
            return base

        result = base
        # Walk suffixes: each group starts with ( or . or [
        i = 1
        children = list(ctx.children)
        while i < len(children):
            tok = children[i].getText()
            if tok == "(":
                # function call — collect args until ")"
                args = []
                i += 1
                while children[i].getText() != ")":
                    if children[i].getText() != "،":
                        args.append(self.visit(children[i]))
                    i += 1
                call_node = JsPrimaryNode(kind="call", elements=args,
                                          **_tok(ctx))
                result = JsExpressionNode(left=result, operator="()",
                                           right=call_node, **_tok(ctx))
            elif tok == ".":
                i += 1
                member = children[i].getText()
                result = JsExpressionNode(left=result, operator=".",
                                           right=JsPrimaryNode(kind="identifier",
                                                               value=member,
                                                               **_tok(ctx)),
                                           **_tok(ctx))
            elif tok == "[":
                i += 1
                index = self.visit(children[i])
                i += 1  # skip "]"
                result = JsExpressionNode(left=result, operator="[]",
                                           right=index, **_tok(ctx))
            i += 1
        return result

    def visitPrimaryExpression(self, ctx: ArabicHtmlParser.PrimaryExpressionContext) -> JsPrimaryNode:
        """
        primaryExpression
            : identifier | NUMBER | STRING
            | TS_TRUE | TS_FALSE | TS_NULL | TS_UNDEFINED | TS_THIS | TS_NAN
            | TS_DOCUMENT | TS_WINDOW
            | LPAREN expression RPAREN ;
        """
        text = ctx.getText()

        if ctx.NUMBER():
            return JsPrimaryNode(kind="number", value=text, **_tok(ctx))
        if ctx.STRING():
            return JsPrimaryNode(kind="string", value=text.strip('"\''), **_tok(ctx))
        if ctx.TS_TRUE() or ctx.TS_FALSE():
            return JsPrimaryNode(kind="boolean", value=text, **_tok(ctx))
        if ctx.TS_NULL():
            return JsPrimaryNode(kind="null", value=text, **_tok(ctx))
        if ctx.TS_UNDEFINED():
            return JsPrimaryNode(kind="undefined", value=text, **_tok(ctx))
        if ctx.TS_THIS():
            return JsPrimaryNode(kind="this", value=text, **_tok(ctx))
        if ctx.TS_NAN():
            return JsPrimaryNode(kind="nan", value=text, **_tok(ctx))
        if ctx.TS_DOCUMENT():
            return JsPrimaryNode(kind="document", value=text, **_tok(ctx))
        if ctx.TS_WINDOW():
            return JsPrimaryNode(kind="window", value=text, **_tok(ctx))
        if ctx.LPAREN():
            inner = self.visit(ctx.expression())
            return JsPrimaryNode(kind="paren", elements=[inner], **_tok(ctx))
        # identifier (including TS_ELEMENT alias)
        if ctx.identifier():
            return JsPrimaryNode(kind="identifier",
                                  value=ctx.identifier().getText(),
                                  **_tok(ctx))
        return JsPrimaryNode(kind="identifier", value=text, **_tok(ctx))

    def visitArrayLiteral(self, ctx: ArabicHtmlParser.ArrayLiteralContext) -> JsPrimaryNode:
        """
        arrayLiteral : LBRACK (expression (COMMA expression)*)? RBRACK ;
        """
        elements = [self.visit(e) for e in (ctx.expression() or [])]
        return JsPrimaryNode(kind="array", elements=elements, **_tok(ctx))

    def visitObjectLiteral(self, ctx: ArabicHtmlParser.ObjectLiteralContext) -> JsPrimaryNode:
        """
        objectLiteral
            : LBRACE (identifier COLON expression
                      (COMMA identifier COLON expression)*)? RBRACE ;
        """
        keys   = [i.getText() for i in (ctx.identifier() or [])]
        values = [self.visit(e) for e in (ctx.expression() or [])]
        pairs  = list(zip(keys, values))
        return JsPrimaryNode(kind="object", pairs=pairs, **_tok(ctx))

    # ── identifier rule (allows TS_ELEMENT as a variable name) ───────────────

    def visitIdentifier(self, ctx: ArabicHtmlParser.IdentifierContext) -> JsPrimaryNode:
        return JsPrimaryNode(kind="identifier", value=ctx.getText(), **_tok(ctx))

    # ── variableDeclaration (used inside forLoop init) ────────────────────────

    def visitVariableDeclaration(self, ctx: ArabicHtmlParser.VariableDeclarationContext) -> TsTypedDeclarationNode:
        """
        variableDeclaration
            : (TS_VAR | TS_LET | TS_CONST) identifier COLON tsType
              (TS_ASSIGN expression)? SEMI ;
        """
        keyword    = ctx.getChild(0).getText()
        name       = ctx.identifier().getText()
        type_name  = ctx.tsType().getText()
        init_ctx   = ctx.expression()
        initializer = self.visit(init_ctx) if init_ctx else None
        return TsTypedDeclarationNode(
            keyword=keyword,
            name=name,
            type_name=type_name,
            is_array=False,
            initializer=initializer,
            **_tok(ctx),
        )
