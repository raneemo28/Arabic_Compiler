
try:
    from Parser.ArabicHtmlParserVisitor import ArabicHtmlParserVisitor
    from Parser.ArabicHtmlParser        import ArabicHtmlParser
except ImportError:
    from ArabicHtmlParserVisitor import ArabicHtmlParserVisitor
    from ArabicHtmlParser        import ArabicHtmlParser
from AST.ast_nodes               import ASTNode, DocumentNode, TagNode, TextNode


def _tag_name_from_open(token_text: str) -> str:
    """
    Extract the bare Arabic identifier from an OPEN_TAG token.

    "<مقال>"  →  "مقال"

    Slices off the leading '<' (index 0) and trailing '>' (index -1).
    """
    return token_text[1:-1]


def _tag_name_from_close(token_text: str) -> str:
    """
    Extract the bare Arabic identifier from a CLOSE_TAG token.

    "</مقال>"  →  "مقال"

    Slices off the leading '</' (indices 0-1) and trailing '>' (index -1).
    """
    return token_text[2:-1]


class ArabicHtmlAstVisitor(ArabicHtmlParserVisitor):
    """
    Walks the ANTLR parse tree produced by ArabicHtmlParser and
    returns a DocumentNode (the AST root) from visitDocument().

    Usage:
        visitor = ArabicHtmlAstVisitor()
        ast     = visitor.visit(parse_tree)   # returns DocumentNode
    """

    # -------------------------------------------------------------------------
    # visitDocument
    # Grammar rule:  document : element* EOF ;
    #
    # ctx.element() returns a list of ElementContext objects, one per child.
    # We visit each one and collect non-None results (the EOF produces None).
    # Source location is anchored to the first token in the document,
    # or line 1 col 0 when the document is empty.
    # -------------------------------------------------------------------------
    def visitDocument(self, ctx: ArabicHtmlParser.DocumentContext) -> DocumentNode:
        # Determine source position of the document node itself.
        first_token = ctx.start           # the very first token in the input
        line   = first_token.line   if first_token else 1
        column = first_token.column if first_token else 0

        node = DocumentNode(line=line, column=column)

        for element_ctx in ctx.element():
            child = self.visit(element_ctx)
            if child is not None:
                node.children.append(child)

        return node

    # -------------------------------------------------------------------------
    # visitElement
    # Grammar rule:  element : tagElement | TEXT ;
    #
    # ANTLR creates two possible children:
    #   - tagElement() is set when the alternative is a tag
    #   - TEXT()       is set when the alternative is raw text
    # We delegate to the appropriate branch.
    # -------------------------------------------------------------------------
    def visitElement(self, ctx: ArabicHtmlParser.ElementContext):
        if ctx.tagElement():
            # delegate to visitTagElement
            return self.visit(ctx.tagElement())

        # TEXT alternative: ctx.TEXT() returns the TerminalNode
        text_token = ctx.TEXT()
        raw        = text_token.getText()
        content    = raw.strip()          # normalise surrounding whitespace
        if not content:
            return None                   # skip whitespace-only text tokens

        return TextNode(
            line    = text_token.symbol.line,
            column  = text_token.symbol.column,
            content = content,
        )

    # -------------------------------------------------------------------------
    # visitTagElement
    # Grammar rule:  tagElement : OPEN_TAG element* CLOSE_TAG ;
    #
    # We read the OPEN_TAG token for the tag name and source position,
    # optionally cross-check it against the CLOSE_TAG name for well-formedness,
    # then recurse into every child element.
    # -------------------------------------------------------------------------
    def visitTagElement(self, ctx: ArabicHtmlParser.TagElementContext) -> TagNode:
        open_token  = ctx.OPEN_TAG()          # TerminalNode
        close_token = ctx.CLOSE_TAG()         # TerminalNode

        open_text  = open_token.getText()     # e.g. "<مقال>"
        close_text = close_token.getText()    # e.g. "</مقال>"

        open_name  = _tag_name_from_open(open_text)
        close_name = _tag_name_from_close(close_text)

        # Warn on mismatched open/close tag names.
        # We don't raise an exception here — the parser already accepted the
        # token stream; this is a semantic-level consistency check.
        if open_name != close_name:
            import warnings
            warnings.warn(
                f"Mismatched tags: <{open_name}> closed by </{close_name}> "
                f"at line {open_token.symbol.line}, col {open_token.symbol.column}",
                stacklevel=2,
            )

        node = TagNode(
            line     = open_token.symbol.line,
            column   = open_token.symbol.column,
            tag_name = open_name,
        )

        for element_ctx in ctx.element():
            child = self.visit(element_ctx)
            if child is not None:
                node.children.append(child)

        return node
