from abc import ABC, abstractmethod

class ASTVisitor(ABC):
    """
    الواجهة البرمجية الأساسية لأي زائر سيعبر شجرة الـ AST الخاصة بنا.
    يجب على أي زائر أن يطبق هذه الدوال.
    """

    # ── HTML ──────────────────────────────────────────────
    @abstractmethod
    def visit_ProgramNode(self, node): pass

    @abstractmethod
    def visit_TagNode(self, node): pass

    @abstractmethod
    def visit_SelfClosingTagNode(self, node): pass

    @abstractmethod
    def visit_AttributeNode(self, node): pass

    @abstractmethod
    def visit_TextNode(self, node): pass

    # ── CSS ───────────────────────────────────────────────
    @abstractmethod
    def visit_CssRuleNode(self, node): pass

    @abstractmethod
    def visit_CssSelectorNode(self, node): pass

    @abstractmethod
    def visit_CssDeclarationListNode(self, node): pass

    @abstractmethod
    def visit_CssDeclarationNode(self, node): pass

    @abstractmethod
    def visit_CssValueNode(self, node): pass

    @abstractmethod
    def visit_CssFunctionValueNode(self, node): pass

    # ── TypeScript statements ──────────────────────────────
    @abstractmethod
    def visit_TsTypedDeclarationNode(self, node): pass

    @abstractmethod
    def visit_JsVariableDeclarationNode(self, node): pass

    @abstractmethod
    def visit_JsAssignmentStatementNode(self, node): pass

    @abstractmethod
    def visit_JsIfStatementNode(self, node): pass

    @abstractmethod
    def visit_JsForLoopNode(self, node): pass

    @abstractmethod
    def visit_JsWhileLoopNode(self, node): pass

    @abstractmethod
    def visit_JsFunctionDeclarationNode(self, node): pass

    @abstractmethod
    def visit_JsReturnStatementNode(self, node): pass

    @abstractmethod
    def visit_JsTryCatchNode(self, node): pass

    @abstractmethod
    def visit_JsExpressionStatementNode(self, node): pass

    @abstractmethod
    def visit_JsBuiltInCallNode(self, node): pass

    @abstractmethod
    def visit_JsBlockNode(self, node): pass

    @abstractmethod
    def visit_JsInterfaceDeclarationNode(self, node): pass

    # ── TypeScript expressions ─────────────────────────────
    @abstractmethod
    def visit_JsExpressionNode(self, node): pass

    @abstractmethod
    def visit_JsPrimaryNode(self, node): pass

    # ── Legacy (deprecated) ───────────────────────────────
    def visit_JsStatementNode(self, node): pass
    def visit_DocumentNode(self, node): pass
    def visit_MediaRuleNode(self, node): pass
    def visit_RulesetNode(self, node): pass
