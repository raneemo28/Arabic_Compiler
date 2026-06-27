# -*- coding: utf-8 -*-
"""
compiler_errors.py

The single shared error shape used across all compilation phases —
lexical/syntax (ANTLR), semantic (SemanticAnalyzerVisitor), and runtime
(browser/terminal, via error_translator.py).

Before this module, each phase spoke a different language:
  - syntax errors: not collected at all (ANTLR's default console listener
    just printed to stderr and discarded them)
  - semantic errors: a list[str] of pre-formatted Arabic strings
  - runtime errors: a list[dict] with level/message_ar/ar_line/ar_column

CompilerError is the common envelope all three now produce, so a single
list can be sorted, grouped, and rendered into one report regardless of
which phase an error came from.
"""
from dataclasses import dataclass
from enum import Enum


class ErrorPhase(Enum):
    LEXICAL = "lexical"
    SYNTAX = "syntax"
    SEMANTIC = "semantic"
    RUNTIME_BROWSER = "runtime_browser"
    RUNTIME_TERMINAL = "runtime_terminal"


class ErrorSeverity(Enum):
    ERROR = "error"
    WARNING = "warning"
    INFO = "info"


# Arabic section titles used when rendering the final report, keyed by phase.
PHASE_TITLE_AR = {
    ErrorPhase.LEXICAL: "أخطاء التحليل اللفظي",
    ErrorPhase.SYNTAX: "أخطاء نحوية",
    ErrorPhase.SEMANTIC: "أخطاء دلالية",
    ErrorPhase.RUNTIME_BROWSER: "أخطاء وقت التشغيل (المتصفح)",
    ErrorPhase.RUNTIME_TERMINAL: "أخطاء وقت التشغيل (الطرفية)",
}

SEVERITY_LABEL_AR = {
    ErrorSeverity.ERROR: "خطأ",
    ErrorSeverity.WARNING: "تحذير",
    ErrorSeverity.INFO: "معلومة",
}


@dataclass
class CompilerError:
    phase: ErrorPhase
    severity: ErrorSeverity
    message_ar: str          # final, translated, user-facing message
    line: int = 0
    column: int = 0
    source_mapped: bool = True   # False only for runtime errors that
                                  # couldn't be mapped back to .arweb source
    raw_message: str = ""        # original ANTLR/JS message, kept for
                                  # debugging; never shown by default
