from __future__ import annotations
import warnings
from typing import List, Union, Optional

try:
    from Grammar.ArabicWebParserVisitor import ArabicWebParserVisitor
    from Grammar.ArabicWebParser        import ArabicWebParser
except ImportError:
    from ArabicWebParserVisitor import ArabicWebParserVisitor
    from ArabicWebParser        import ArabicWebParser

from AST.ast_nodes import (
    ASTNode, DocumentNode, TagNode, TextNode,
    RulesetNode, MediaRuleNode, MediaQueryNode, MediaExprNode,
    SelectorNode, CompoundSelectorNode, DeclarationNode,
    ValueNode, ExpressionNode, TermNode, DimensionNode, FunctionCallNode
)


def _tag_name_from_open(token_text: str) -> str:
    return token_text[1:-1]


def _tag_name_from_close(token_text: str) -> str:
    
    return token_text[2:-1]


class ArabicWebAstVisitor(ArabicWebParserVisitor):

    def visitDocument(self, ctx: ArabicWebParser.DocumentContext) -> DocumentNode:
        first_token = ctx.start
        line = first_token.line if first_token else 1
        column = first_token.column if first_token else 0

        node = DocumentNode(line=line, column=column)

        if ctx.children:
            for child_ctx in ctx.children:
                # Filter out raw terminal nodes like EOF tokens
                if isinstance(child_ctx, (ArabicWebParser.ElementContext, ArabicWebParser.StatementContext)):
                    child_node = self.visit(child_ctx)
                    if child_node is not None:
                        node.children.append(child_node)

        return node

    def visitElement(self, ctx: ArabicWebParser.ElementContext):
        if ctx.tagElement():
            return self.visit(ctx.tagElement())

        text_token = ctx.TEXT()
        raw = text_token.getText()
        content = raw.strip()
        if not content:
            return None  

        return TextNode(
            line=text_token.symbol.line,
            column=text_token.symbol.column,
            content=content,
        )

    def visitTagElement(self, ctx: ArabicWebParser.TagElementContext) -> TagNode:
        open_token = ctx.OPEN_TAG()
        close_token = ctx.CLOSE_TAG()

        open_text = open_token.getText()
        close_text = close_token.getText()

        open_name = _tag_name_from_open(open_text)
        close_name = _tag_name_from_close(close_text)

        if open_name != close_name:
            warnings.warn(
                f"Mismatched tags: <{open_name}> closed by </{close_name}> "
                f"at line {open_token.symbol.line}, col {open_token.symbol.column}",
                stacklevel=2,
            )

        node = TagNode(
            line=open_token.symbol.line,
            column=open_token.symbol.column,
            tag_name=open_name,
        )

        for element_ctx in ctx.element():
            child = self.visit(element_ctx)
            if child is not None:
                node.children.append(child)

        return node

    def visitStatement(self, ctx: ArabicWebParser.StatementContext):
        if ctx.ruleset():
            return self.visit(ctx.ruleset())
        if ctx.mediaRule():
            return self.visit(ctx.mediaRule())
        return None

    def visitMediaRule(self, ctx: ArabicWebParser.MediaRuleContext) -> MediaRuleNode:
        node = MediaRuleNode(line=ctx.start.line, column=ctx.start.column)
        
        # Populate queries list
        if ctx.mediaQueryList():
            node.queries = self.visit(ctx.mediaQueryList())
            
        for ruleset_ctx in ctx.ruleset():
            ruleset_node = self.visit(ruleset_ctx)
            if ruleset_node:
                node.rulesets.append(ruleset_node)
                
        return node

    def visitMediaQueryList(self, ctx: ArabicWebParser.MediaQueryListContext) -> List[MediaQueryNode]:
        queries = []
        for q_ctx in ctx.mediaQuery():
            query_node = self.visit(q_ctx)
            if query_node:
                queries.append(query_node)
        return queries

    def visitMediaQuery(self, ctx: ArabicWebParser.MediaQueryContext) -> MediaQueryNode:
        node = MediaQueryNode(line=ctx.start.line, column=ctx.start.column, expression=None)
        
        if ctx.mediaExpr():
            node.expression = self.visit(ctx.mediaExpr())
            
        if ctx.IDENTIFIER():
            node.identifier = ctx.IDENTIFIER().getText()
            if ctx.KW_HIDDEN():
                node.is_hidden_modifier = True
                if not node.expression and ctx.mediaExpr():
                    node.expression = self.visit(ctx.mediaExpr())
                    
        return node

    def visitMediaExpr(self, ctx: ArabicWebParser.MediaExprContext) -> MediaExprNode:
        prop_text = ctx.property_().getText()
        val_node = self.visit(ctx.value())
        return MediaExprNode(
            line=ctx.start.line,
            column=ctx.start.column,
            property_name=prop_text,
            value=val_node
        )

    def visitRuleset(self, ctx: ArabicWebParser.RulesetContext) -> RulesetNode:
        node = RulesetNode(line=ctx.start.line, column=ctx.start.column)
        node.selectors = self.visit(ctx.selectorList())
        
        if ctx.declarationList():
            node.declarations = self.visit(ctx.declarationList())
        return node

    def visitSelectorList(self, ctx: ArabicWebParser.SelectorListContext) -> List[SelectorNode]:
        selectors = []
        for sel_ctx in ctx.selector():
            sel_node = self.visit(sel_ctx)
            if sel_node:
                selectors.append(sel_node)
        return selectors

    def visitSelector(self, ctx: ArabicWebParser.SelectorContext) -> SelectorNode:
        node = SelectorNode(line=ctx.start.line, column=ctx.start.column)
        
        # Track items sequentially to build the flatten chain with explicit combinators
        comp_selectors = ctx.compoundSelector()
        combinators = ctx.combinator()
        
        for i, comp_ctx in enumerate(comp_selectors):
            node.parts.append(self.visit(comp_ctx))
            if i < len(combinators):
                # Grab exact token operator string directly (e.g. '>', '+', '~')
                node.parts.append(combinators[i].getText())
        return node

    def visitCombinator(self, ctx: ArabicWebParser.CombinatorContext) -> str:
        return ctx.getText()

    def visitCompoundSelector(self, ctx: ArabicWebParser.CompoundSelectorContext) -> CompoundSelectorNode:
        node = CompoundSelectorNode(line=ctx.start.line, column=ctx.start.column)
        
        for simple in ctx.simpleSelector():
            node.base_selectors.append(simple.getText())
        for pc in ctx.pseudoClass():
            node.pseudo_classes.append(pc.getText())
        for pe in ctx.pseudoElement():
            node.pseudo_elements.append(pe.getText())
            
        return node

    def visitDeclarationList(self, ctx: ArabicWebParser.DeclarationListContext) -> List[DeclarationNode]:
        declarations = []
        for decl_ctx in ctx.declaration():
            decl_node = self.visit(decl_ctx)
            if decl_node:
                declarations.append(decl_node)
        return declarations

    def visitDeclaration(self, ctx: ArabicWebParser.DeclarationContext) -> DeclarationNode:
        prop_name = ctx.property_().getText()
        val_node = self.visit(ctx.value())
        is_imp = True if ctx.exprModifier() else False
        
        return DeclarationNode(
            line=ctx.start.line,
            column=ctx.start.column,
            property_name=prop_name,
            value=val_node,
            is_important=is_imp
        )

    def visitValue(self, ctx: ArabicWebParser.ValueContext) -> ValueNode:
        node = ValueNode(line=ctx.start.line, column=ctx.start.column)
        for expr_ctx in ctx.expr():
            expr_node = self.visit(expr_ctx)
            if expr_node:
                node.expressions.append(expr_node)
        return node

    def visitExpr(self, ctx: ArabicWebParser.ExprContext) -> ExpressionNode:
        terms = ctx.term()
        left = self.visit(terms[0])
        
        # Check if it's a binary equation rule (term operator term)
        if len(terms) > 1:
            op_text = ""
            if ctx.PLUS(): op_text = "+"
            elif ctx.MINUS(): op_text = "-"
            elif ctx.STAR(): op_text = "*"
            elif ctx.SLASH(): op_text = "/"
            elif ctx.PERCENT(): op_text = "%"
            
            right = self.visit(terms[1])
            return ExpressionNode(
                line=ctx.start.line, column=ctx.start.column,
                left_term=left, operator=op_text, right_term=right
            )
            
        return ExpressionNode(line=ctx.start.line, column=ctx.start.column, left_term=left)

    def visitTerm(self, ctx: ArabicWebParser.TermContext) -> TermNode:
        if ctx.dimension():
            dim = self.visit(ctx.dimension())
            return TermNode(line=ctx.start.line, column=ctx.start.column, value=dim, type='dimension')
        if ctx.keywordValue():
            return TermNode(line=ctx.start.line, column=ctx.start.column, value=ctx.keywordValue().getText(), type='keyword')
        if ctx.HEX_COLOR():
            return TermNode(line=ctx.start.line, column=ctx.start.column, value=ctx.HEX_COLOR().getText(), type='hex_color')
        if ctx.STRING():
            return TermNode(line=ctx.start.line, column=ctx.start.column, value=ctx.STRING().getText(), type='string')
        if ctx.functionCall():
            func = self.visit(ctx.functionCall())
            return TermNode(line=ctx.start.line, column=ctx.start.column, value=func, type='function')
        if ctx.IDENTIFIER():
            return TermNode(line=ctx.start.line, column=ctx.start.column, value=ctx.IDENTIFIER().getText(), type='identifier')
            
        return None

    def visitDimension(self, ctx: ArabicWebParser.DimensionContext) -> DimensionNode:
        num = ctx.NUMBER().getText()
        unit = ctx.UNIT().getText() if ctx.UNIT() else None
        return DimensionNode(line=ctx.start.line, column=ctx.start.column, number=num, unit=unit)

    def visitFunctionCall(self, ctx: ArabicWebParser.FunctionCallContext) -> FunctionCallNode:
        func_name = ctx.functionName().getText()
        node = FunctionCallNode(line=ctx.start.line, column=ctx.start.column, function_name=func_name)
        
        if ctx.arguments():
            node.arguments = self.visit(ctx.arguments())
        return node

    def visitArguments(self, ctx: ArabicWebParser.ArgumentsContext) -> List[ExpressionNode]:
        args = []
        for expr_ctx in ctx.expr():
            expr_node = self.visit(expr_ctx)
            if expr_node:
                args.append(expr_node)
        return args