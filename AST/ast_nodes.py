from __future__ import annotations
from dataclasses import dataclass, field
from typing import List, Union, Optional
from abc import ABC, abstractmethod

# ─────────────────────────────────────────────
#  Base
# ─────────────────────────────────────────────

@dataclass
class ASTNode(ABC):
    line: int = 0
    column: int = 0

    @abstractmethod
    def accept(self, visitor):
        pass


# ─────────────────────────────────────────────
#  HTML nodes
# ─────────────────────────────────────────────

@dataclass
class TextNode(ASTNode):
    """A bare text token inside HTML content."""
    content: str = ""

    def accept(self, visitor):
        return visitor.visit_TextNode(self)


@dataclass
class AttributeNode(ASTNode):
    """A single HTML attribute: kind (id/class/src/href) + value string."""
    kind: str = ""   # "id" | "class" | "src" | "href"
    value: str = ""

    def accept(self, visitor):
        return visitor.visit_AttributeNode(self)


@dataclass
class TagNode(ASTNode):
    """
    An HTML element with optional attributes and child content.

    BUG FIX: children was previously typed as List[Union[TagNode, TextNode]],
    which was too narrow.  The grammar allows CSS rules and JS statements
    inside htmlContent, so the correct type is List[ASTNode].
    """
    tag_name: str = ""
    attributes: List[AttributeNode] = field(default_factory=list)
    children: List[ASTNode] = field(default_factory=list)   # was Union[TagNode, TextNode] – too narrow

    def accept(self, visitor):
        return visitor.visit_TagNode(self)


@dataclass
class SelfClosingTagNode(ASTNode):
    """A self-closing HTML element (<صورة مصدر="…"/>)."""
    tag_name: str = ""
    attributes: List[AttributeNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_SelfClosingTagNode(self)


@dataclass
class ProgramNode(ASTNode):
    """
    Root of the AST – replaces the old DocumentNode.

    The new grammar entry point is `program`, not `document`.
    The old DocumentNode / ast_visitor tried to import a non-existent
    ArabicWebParser; the correct parser is ArabicHtmlParser.
    """
    children: List[ASTNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_ProgramNode(self)


# ─────────────────────────────────────────────────────────────────────────────
#  CSS / Styling nodes  (new – aligned with ArabicHtmlParser grammar)
# ─────────────────────────────────────────────────────────────────────────────

class SelectorKind:
    """Enum-like constants for the four selector forms in the grammar."""
    ELEMENT = "element"    # plain IDENTIFIER              e.g.  لوحة
    ID      = "id"         # HASH IDENTIFIER               e.g.  #رأس
    CLASS   = "class"      # DOT IDENTIFIER                e.g.  .بطاقة
    MEDIA   = "media"      # CSS_MEDIA IDENTIFIER          e.g.  @وسائط شاشة


@dataclass
class CssSelectorNode(ASTNode):
    """
    A single CSS selector.

    BUG FIX: The old code used CompoundSelectorNode / SelectorNode with
    combinator strings, which belonged to a completely different (old)
    grammar that had compoundSelector / combinator / simpleSelector /
    pseudoClass rules.  The new grammar has a flat four-alternative
    `selector` rule with no combinators or pseudo-classes at this level.

    Fields
    ------
    kind        : one of SelectorKind.{ELEMENT, ID, CLASS, MEDIA}
    name        : the IDENTIFIER token text (without prefix punctuation)
    raw_text    : the full selector text as written (e.g. "#رأس", ".بطاقة")
    """
    kind: str = SelectorKind.ELEMENT
    name: str = ""
    raw_text: str = ""

    def accept(self, visitor):
        return visitor.visit_CssSelectorNode(self)


@dataclass
class CssValueNode(ASTNode):
    """
    A single CSS value token or function call.

    Fields
    ------
    raw_text        : the literal value text (keyword, number, unit, hex-color,
                      string literal, etc.)
    is_function     : True when this value is a cssFunction (url(), rgb(), …)
    function_node   : populated when is_function=True
    """
    raw_text: str = ""
    is_function: bool = False
    function_node: Optional[CssFunctionValueNode] = None

    def accept(self, visitor):
        return visitor.visit_CssValueNode(self)


@dataclass
class CssFunctionValueNode(ASTNode):
    """
    A CSS function call: url(…), rgb(…), rgba(…), calc(…), var(…),
    rotate(…), scale(…), blur(…).

    Replaces the old FunctionCallNode for the CSS domain.
    The grammar rule is `cssFunction` and its arguments are JS `expression`
    nodes (the grammar reuses the JS expression hierarchy inside CSS
    functions).

    Fields
    ------
    function_name   : the function keyword token text (Arabic spelling)
    arguments       : list of JS expression AST nodes (JsExpressionNode)
    """
    function_name: str = ""
    arguments: List[ASTNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_CssFunctionValueNode(self)


@dataclass
class CssDeclarationNode(ASTNode):
    """
    A single CSS property: value pair inside a ruleset.

    Replaces DeclarationNode.  The old DeclarationNode had an `is_important`
    flag and used ValueNode / ExpressionNode / TermNode / DimensionNode
    which came from an old grammar; the new grammar's `declaration` rule is
    simply  `cssProperty COLON cssValue`.

    Fields
    ------
    property_name   : the Arabic CSS property token text (e.g. 'لون-الخلفية')
    value           : the CssValueNode for the property's value
    """
    property_name: str = ""
    value: Optional[CssValueNode] = None

    def accept(self, visitor):
        return visitor.visit_CssDeclarationNode(self)


@dataclass
class CssDeclarationListNode(ASTNode):
    """
    An ordered list of CssDeclarationNode objects inside a ruleset block.

    Corresponds directly to the grammar rule `declarationList`.
    """
    declarations: List[CssDeclarationNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_CssDeclarationListNode(self)


@dataclass
class CssRuleNode(ASTNode):
    """
    A complete CSS ruleset: selector { declarationList }.

    Replaces the old RulesetNode (which was designed for an old grammar with
    selectorList / compoundSelector / combinator rules that no longer exist).

    This is the primary top-level styling node produced by the new grammar's
    `cssRule` production.

    Fields
    ------
    selector        : the parsed CssSelectorNode
    declaration_list: the CssDeclarationListNode (may be empty)
    """
    selector: Optional[CssSelectorNode] = None
    declaration_list: Optional[CssDeclarationListNode] = None

    def accept(self, visitor):
        return visitor.visit_CssRuleNode(self)


# ─────────────────────────────────────────────────────────────────────────────
#  JavaScript AST nodes  (minimal – enough to represent JS in the visitor)
# ─────────────────────────────────────────────────────────────────────────────

@dataclass
class JsStatementNode(ASTNode):
    """
    Opaque wrapper around a JS statement subtree.

    The visitor builds concrete subclasses below; this base class lets
    callers treat any JS statement uniformly when they do not need to
    distinguish statement kinds.
    """
    def accept(self, visitor):
        return visitor.visit_JsStatementNode(self)


@dataclass
class JsVariableDeclarationNode(JsStatementNode):
    """
    JS variable declaration: (متغير | ثابت | لنفرض) IDENTIFIER (= expression)?;

    Fields
    ------
    keyword     : 'var' | 'let' | 'const'  (Arabic keyword token text)
    name        : the IDENTIFIER token text
    initializer : optional expression node; None if declared without a value
    """
    keyword: str = ""
    name: str = ""
    initializer: Optional[ASTNode] = None

    def accept(self, visitor):
        return visitor.visit_JsVariableDeclarationNode(self)


@dataclass
class JsAssignmentStatementNode(JsStatementNode):
    """
    JS assignment: IDENTIFIER (= | += | -= | *= | /=) expression;

    Fields
    ------
    target      : the IDENTIFIER being assigned to
    operator    : the assignment operator string
    value       : the right-hand expression node
    """
    target: str = ""
    operator: str = ""
    value: Optional[ASTNode] = None

    def accept(self, visitor):
        return visitor.visit_JsAssignmentStatementNode(self)


@dataclass
class JsIfStatementNode(JsStatementNode):
    """
    JS if statement: إذا (expression) statement (وإلا statement)?

    Fields
    ------
    condition   : expression node
    then_branch : the then-branch statement/block node
    else_branch : optional else-branch statement/block node
    """
    condition: Optional[ASTNode] = None
    then_branch: Optional[ASTNode] = None
    else_branch: Optional[ASTNode] = None

    def accept(self, visitor):
        return visitor.visit_JsIfStatementNode(self)


@dataclass
class JsForLoopNode(JsStatementNode):
    """
    JS for-loop (both classic and for-of / for-in forms).

    Fields
    ------
    init        : initializer (variable declaration or expression node); None for for-of/in
    condition   : condition expression node; None for for-of/in
    update      : update expression node; None for for-of/in
    iterator    : variable name for for-of/in; empty string for classic for
    iterable    : iterable expression for for-of/in; None for classic for
    loop_kind   : 'classic' | 'of' | 'in'
    body        : loop body statement/block node
    """
    init: Optional[ASTNode] = None
    condition: Optional[ASTNode] = None
    update: Optional[ASTNode] = None
    iterator: str = ""
    iterable: Optional[ASTNode] = None
    loop_kind: str = "classic"
    body: Optional[ASTNode] = None

    def accept(self, visitor):
        return visitor.visit_JsForLoopNode(self)


@dataclass
class JsWhileLoopNode(JsStatementNode):
    """
    JS while-loop: طالما (expression) statement

    Fields
    ------
    condition   : condition expression node
    body        : loop body statement/block node
    """
    condition: Optional[ASTNode] = None
    body: Optional[ASTNode] = None

    def accept(self, visitor):
        return visitor.visit_JsWhileLoopNode(self)


@dataclass
class JsFunctionDeclarationNode(JsStatementNode):
    """
    JS function declaration: دالة IDENTIFIER(params) { body }

    Fields
    ------
    name        : function name
    params      : ordered list of parameter name strings
    body        : JsBlockNode
    """
    name: str = ""
    params: List[str] = field(default_factory=list)
    body: Optional[ASTNode] = None

    def accept(self, visitor):
        return visitor.visit_JsFunctionDeclarationNode(self)


@dataclass
class JsReturnStatementNode(JsStatementNode):
    """
    JS return statement: أرجع expression?;

    Fields
    ------
    value : optional expression node; None for bare `return;`
    """
    value: Optional[ASTNode] = None

    def accept(self, visitor):
        return visitor.visit_JsReturnStatementNode(self)


@dataclass
class JsTryCatchNode(JsStatementNode):
    """
    JS try-catch(-finally): جرب { } إلا (e) { } (أخيراً { })?

    Fields
    ------
    try_block       : JsBlockNode for the try body
    catch_param     : the catch-parameter IDENTIFIER text
    catch_block     : JsBlockNode for the catch body
    finally_block   : optional JsBlockNode; None if no finally clause
    """
    try_block: Optional[ASTNode] = None
    catch_param: str = ""
    catch_block: Optional[ASTNode] = None
    finally_block: Optional[ASTNode] = None

    def accept(self, visitor):
        return visitor.visit_JsTryCatchNode(self)


@dataclass
class JsExpressionStatementNode(JsStatementNode):
    """
    A bare expression used as a statement: expression;

    Fields
    ------
    expression : the expression node
    """
    expression: Optional[ASTNode] = None

    def accept(self, visitor):
        return visitor.visit_JsExpressionStatementNode(self)


@dataclass
class JsBuiltInCallNode(JsStatementNode):
    """
    A call to a built-in: console.log(…);  alert(…);  prompt(…);

    Fields
    ------
    callee      : the built-in name string (e.g. 'المراقب.اطبع', 'تنبيه')
    arguments   : list of expression nodes
    """
    callee: str = ""
    arguments: List[ASTNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_JsBuiltInCallNode(self)


@dataclass
class JsBlockNode(JsStatementNode):
    """
    A braced block: { statement* }

    Fields
    ------
    statements : list of statement nodes
    """
    statements: List[ASTNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_JsBlockNode(self)


# ── JS Expressions ────────────────────────────────────────────────────────────

@dataclass
class JsExpressionNode(ASTNode):
    """
    Generic JS expression wrapper.

    Rather than modelling the full precedence hierarchy as separate node
    types, we use a recursive binary-node design that mirrors the grammar's
    left-recursive expression rules.

    Fields
    ------
    left        : left operand node (always set for non-primary expressions)
    operator    : operator string; empty for primary / unary expressions
    right       : right operand node; None for primary / unary expressions
    """
    left: Optional[ASTNode] = None
    operator: str = ""
    right: Optional[ASTNode] = None

    def accept(self, visitor):
        return visitor.visit_JsExpressionNode(self)


@dataclass
class JsPrimaryNode(ASTNode):
    """
    A primary expression: literal, identifier, parenthesised expression,
    array literal, or object literal.

    Fields
    ------
    kind    : 'identifier' | 'number' | 'string' | 'boolean' | 'null' |
              'undefined' | 'this' | 'nan' | 'document' | 'window' |
              'paren' | 'array' | 'object'
    value   : the raw token text for scalar kinds; None for compound kinds
    elements: list of nodes for 'array' or 'paren' kind
    pairs   : list of (key_str, JsExpressionNode) for 'object' kind
    """
    kind: str = "identifier"
    value: Optional[str] = None
    elements: List[ASTNode] = field(default_factory=list)
    pairs: List[tuple] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_JsPrimaryNode(self)


# ─────────────────────────────────────────────────────────────────────────────
#  Legacy nodes retained for backward compatibility
#  (kept but marked as deprecated – do not use in new visitor code)
# ─────────────────────────────────────────────────────────────────────────────

@dataclass
class DocumentNode(ASTNode):
    """
    DEPRECATED – use ProgramNode instead.

    The old visitor imported ArabicWebParser (which does not exist) and
    tried to visit a `document` rule that is not in the new grammar.
    Retained only so that any existing downstream code referencing
    DocumentNode does not immediately break at import time.
    """
    children: List[ASTNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_DocumentNode(self)


@dataclass
class MediaRuleNode(ASTNode):
    """
    DEPRECATED – @media rules are now modelled via CssRuleNode with a
    CssSelectorNode of kind SelectorKind.MEDIA.

    The old MediaRuleNode / MediaQueryNode / MediaExprNode hierarchy assumed
    grammar rules (mediaQueryList, mediaQuery, mediaExpr, property_) that do
    not exist in the new ArabicHtmlParser grammar.
    """
    queries: list = field(default_factory=list)
    rulesets: list = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_MediaRuleNode(self)


@dataclass
class RulesetNode(ASTNode):
    """
    DEPRECATED – use CssRuleNode instead.

    The old RulesetNode assumed grammar rules (selectorList, compoundSelector,
    combinator, simpleSelector, pseudoClass, pseudoElement, declarationList
    with exprModifier / property_ / value / expr / term / dimension /
    keywordValue / functionName / functionCall / arguments) that do not exist
    in the new ArabicHtmlParser grammar.
    """
    selectors: list = field(default_factory=list)
    declarations: list = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_RulesetNode(self)