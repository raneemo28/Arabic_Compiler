# =============================================================================
#  ast_nodes.py
#  Abstract Syntax Tree node definitions for the Arabic HTML compiler.
#
#  Design notes (Lecture 8 / Lab 5 conventions):
#    - Every node carries line + column metadata for error reporting.
#    - @dataclass generates __init__, __repr__, and __eq__ automatically.
#    - Fields use English names throughout (interoperability requirement),
#      even though the data they hold comes from Arabic source text.
#    - `children` in TagNode uses a default_factory so each instance gets
#      its own list — never share a mutable default across instances.
# =============================================================================

from __future__ import annotations          # allows forward references in hints
from dataclasses import dataclass, field
from typing import List, Union


# -----------------------------------------------------------------------------
# Base node — all AST nodes inherit from this.
# Stores source-location metadata so error messages can say "line 3, col 7".
# -----------------------------------------------------------------------------
@dataclass
class ASTNode:
    """Abstract base for every node in the Arabic HTML AST."""
    line:   int   # 1-based line number from the ANTLR token
    column: int   # 0-based character offset within the line


# -----------------------------------------------------------------------------
# Leaf node — raw text content appearing between tags.
#
# Example source:  <مقال>مرحبا بالعالم</مقال>
#                           ^^^^^^^^^^^^^^
#                           TextNode(content="مرحبا بالعالم", line=1, column=7)
# -----------------------------------------------------------------------------
@dataclass
class TextNode(ASTNode):
    """Represents a raw text token between tags."""
    content: str   # the verbatim text string (may contain Arabic + spaces)


# -----------------------------------------------------------------------------
# Interior node — a matched open/close tag pair with nested content.
#
# `tag_name` holds only the identifier stripped of angle-brackets, e.g.
#   OPEN_TAG token text "<مقال>"  →  tag_name = "مقال"
#
# `children` is an ordered list of the nodes directly inside this tag.
# Each child is either another TagNode (nested tag) or a TextNode.
# The Union type hint documents that mix explicitly.
# -----------------------------------------------------------------------------
@dataclass
class TagNode(ASTNode):
    """Represents a <tag>…</tag> element with optional nested content."""
    tag_name: str                                      # Arabic identifier only
    children: List[Union["TagNode", TextNode]] = field(default_factory=list)


# -----------------------------------------------------------------------------
# Root node — the entire parsed document.
#
# A document is a flat list of top-level elements (tags or stray text).
# In a well-formed file there is typically one root tag, but the grammar
# allows multiple top-level nodes, so the list handles that naturally.
# -----------------------------------------------------------------------------
@dataclass
class DocumentNode(ASTNode):
    """Root node of the AST — holds all top-level elements."""
    children: List[Union[TagNode, TextNode]] = field(default_factory=list)
