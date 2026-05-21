from __future__ import annotations
from dataclasses import dataclass, field
from typing import List, Union, Optional
from abc import ABC, abstractmethod

@dataclass
class ASTNode(ABC):
    line: int = 0   
    column: int = 0
    
    @abstractmethod
    def accept(self, visitor):
        pass

@dataclass
class TextNode(ASTNode):
    content: str = ""

    def accept(self, visitor):
        return visitor.visit_TextNode(self)

@dataclass
class TagNode(ASTNode):
    tag_name: str = ""
    children: List[Union[TagNode, TextNode]] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_TagNode(self)

@dataclass
class DocumentNode(ASTNode):
    children: List[Union[TagNode, TextNode, RulesetNode, MediaRuleNode]] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_DocumentNode(self)

@dataclass
class MediaRuleNode(ASTNode):
    queries: List[MediaQueryNode] = field(default_factory=list)
    rulesets: List[RulesetNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_MediaRuleNode(self)

@dataclass
class MediaQueryNode(ASTNode):
    expression: Optional[MediaExprNode] = None
    identifier: Optional[str] = None
    is_hidden_modifier: bool = False  

    def accept(self, visitor):
        return visitor.visit_MediaQueryNode(self)

@dataclass
class MediaExprNode(ASTNode):
    property_name: str = ""
    value: Optional[ValueNode] = None

    def accept(self, visitor):
        return visitor.visit_MediaExprNode(self)

@dataclass
class RulesetNode(ASTNode):
    selectors: List[SelectorNode] = field(default_factory=list)
    declarations: List[DeclarationNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_RulesetNode(self)

@dataclass
class SelectorNode(ASTNode):
    parts: List[Union[CompoundSelectorNode, str]] = field(default_factory=list) 

    def accept(self, visitor):
        return visitor.visit_SelectorNode(self)

@dataclass
class CompoundSelectorNode(ASTNode):
    base_selectors: List[str] = field(default_factory=list)    
    pseudo_classes: List[str] = field(default_factory=list)    
    pseudo_elements: List[str] = field(default_factory=list)   

    def accept(self, visitor):
        return visitor.visit_CompoundSelectorNode(self)

@dataclass
class DeclarationNode(ASTNode):
    property_name: str = ""
    value: Optional[ValueNode] = None
    is_important: bool = False  

    def accept(self, visitor):
        return visitor.visit_DeclarationNode(self)

@dataclass
class ValueNode(ASTNode):
    expressions: List[ExpressionNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_ValueNode(self)

@dataclass
class ExpressionNode(ASTNode):
    left_term: Optional[TermNode] = None
    operator: Optional[str] = None  
    right_term: Optional[TermNode] = None

    def accept(self, visitor):
        return visitor.visit_ExpressionNode(self)

@dataclass
class TermNode(ASTNode):
    value: Optional[Union[DimensionNode, FunctionCallNode, str]] = None
    type: str = ""  

    def accept(self, visitor):
        return visitor.visit_TermNode(self)

@dataclass
class DimensionNode(ASTNode):
    number: str = ""
    unit: Optional[str] = None

    def accept(self, visitor):
        return visitor.visit_DimensionNode(self)

@dataclass
class FunctionCallNode(ASTNode):
    function_name: str = ""
    arguments: List[ExpressionNode] = field(default_factory=list)

    def accept(self, visitor):
        return visitor.visit_FunctionCallNode(self)
