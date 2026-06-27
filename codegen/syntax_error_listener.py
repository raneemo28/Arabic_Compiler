# -*- coding: utf-8 -*-
"""
syntax_error_listener.py

Collects ANTLR lexer/parser syntax errors into CompilerError objects
instead of letting ANTLR's default listener print them to stderr.

Key facts this module relies on (verified against the real generated
ArabicHtmlLexer.py / ArabicHtmlParser.py, not assumed):

1. ANTLR's own message builder (antlr4.error.ErrorStrategy) already
   renders expected/offending tokens using `recognizer.literalNames`
   when a token has one fixed literal. Since this grammar's literals
   ARE Arabic text (or punctuation like '؛' / '،'), single-token
   messages like:

       missing '}' at '<EOF>'
       extraneous input '؛' expecting '}'

   already contain the correct Arabic/punctuation literal with no
   lookup needed. The token_names_ar map is only consulted for:

     (a) tokens with no fixed literal (IDENTIFIER, NUMBER, STRING,
         CSS_UNIT, CSS_HEX_COLOR, CLOSE_TAG, OPEN_TAG_START) — these
         show up as their bare English symbolicName, e.g. "IDENTIFIER".

     (b) the multi-alternative form ANTLR emits when several tokens
         are valid next, e.g.:

           expecting {<EOF>, OPEN_TAG_START, '@وسائط', ..., IDENTIFIER,
                      NUMBER, '{', '.', '#', '(', '[', STRING}

         This brace-delimited, comma-separated list mixes already-
         Arabic literals with bare symbolic names. It's split, each
         piece is translated/passed through, and the result is capped
         so a 20+ item enumeration doesn't get dumped on the user.

2. The generated ArabicHtmlParser.py's `literalNames` array contains
   literal '\\uXXXX' character sequences at *runtime* instead of decoded
   Arabic characters (confirmed: iterating the characters of an entry
   shows literal backslash/u/digit characters, not an escaped unicode
   codepoint). ANTLR's error-message builder embeds these literalNames
   entries directly into syntaxError() messages, so every raw message
   is decoded here (_decode_escaped_arabic) before any translation
   pattern is matched — otherwise Arabic literals inside "expecting..."
   clauses render as garbled \\uXXXX text. This means: independently of
   any Arabic translation, syntax errors printed via ANTLR's default
   console listener today are showing garbled token text, not just
   untranslated text.
"""
import re
from antlr4.error.ErrorListener import ErrorListener

from compiler_errors import CompilerError, ErrorPhase, ErrorSeverity
from token_names_ar import display_for_token_name

# Cap on how many alternatives we list verbatim before falling back to
# "... أو غير ذلك" (or otherwise). Large alternative sets come from
# broad grammar branch points (tsStatement / htmlContent) and
# enumerating 20+ options is noise, not help.
_MAX_ALTERNATIVES_TO_SHOW = 4

_UNICODE_ESCAPE_RE = re.compile(r"\\u[0-9a-fA-F]{4}")
_BRACE_SET_RE = re.compile(r"^\{(.*)\}$", re.S)


def _decode_escaped_arabic(raw_msg: str) -> str:
    """
    Decode literal '\\uXXXX' character sequences embedded in ANTLR's raw
    message (see module docstring point 2). Only runs the decode when
    the message actually contains a \\uXXXX-looking sequence, so plain
    ASCII messages and already-decoded text pass through untouched.
    """
    if not _UNICODE_ESCAPE_RE.search(raw_msg):
        return raw_msg
    try:
        return raw_msg.encode("utf-8").decode("unicode_escape")
    except (UnicodeDecodeError, UnicodeEncodeError):
        # If decoding ever fails on some unexpected byte pattern, fall
        # back to the raw message rather than crash error reporting.
        return raw_msg


def _split_expecting_clause(clause: str) -> list:
    """
    Split an ANTLR "expecting ..." clause into individual raw pieces.
    The clause is either:
      - a single piece with no braces:        expecting '}'
      - a single piece that IS '<EOF>':       expecting <EOF>
      - a brace-wrapped, comma-separated set: expecting {A, B, C}
    """
    clause = clause.strip()
    m = _BRACE_SET_RE.match(clause)
    if not m:
        return [clause]
    inner = m.group(1)
    pieces, cur, in_quote = [], "", False
    for ch in inner:
        if ch == "'":
            in_quote = not in_quote
            cur += ch
        elif ch == "," and not in_quote:
            pieces.append(cur.strip())
            cur = ""
        else:
            cur += ch
    if cur.strip():
        pieces.append(cur.strip())
    return pieces


def _translate_token_piece(piece: str) -> str:
    """
    A piece is one of:
      - a quoted EOF marker:   "'<EOF>'"    -> Arabic EOF phrase, quoted
      - a bare EOF marker:     "<EOF>"      -> Arabic EOF phrase, quoted
      - a quoted literal:      "'؛'"        -> already correct, kept as-is
      - a bare symbolic name:  "IDENTIFIER" -> Arabic description, NOT
                                                quoted (it's a phrase, not
                                                literal text; quoting it
                                                would visually conflate a
                                                description with a literal)
    """
    piece = piece.strip()
    if piece in ("'<EOF>'", "<EOF>"):
        return "'نهاية الملف'"
    if piece.startswith("'") and piece.endswith("'"):
        return piece
    return display_for_token_name(piece)


def _render_expecting_clause(clause: str) -> str:
    pieces = _split_expecting_clause(clause)
    translated = [_translate_token_piece(p) for p in pieces]
    if len(translated) == 1:
        return translated[0]
    if len(translated) <= _MAX_ALTERNATIVES_TO_SHOW:
        return " أو ".join(translated)
    sample = " أو ".join(translated[:_MAX_ALTERNATIVES_TO_SHOW])
    return f"{sample} … أو غير ذلك"


# ---------------------------------------------------------------------------
# Message-shape handlers, matched against the (already-decoded) raw msg.
# Order matters: more specific patterns first.
# ---------------------------------------------------------------------------

def _msg_missing(msg: str):
    m = re.match(r"^missing (.+?) at (.+)$", msg)
    if not m:
        return None
    expecting_raw, at_raw = m.group(1), m.group(2)
    expecting = _render_expecting_clause(expecting_raw)
    at_piece = _translate_token_piece(at_raw)
    return f"رمز ناقص: متوقع {expecting} قبل {at_piece}"


def _msg_extraneous(msg: str):
    m = re.match(r"^extraneous input (.+?) expecting (.+)$", msg)
    if not m:
        return None
    found_raw, expecting_raw = m.group(1), m.group(2)
    found = _translate_token_piece(found_raw)
    expecting = _render_expecting_clause(expecting_raw)
    return f"رمز زائد غير متوقع {found} — كان المتوقع {expecting}"


def _msg_mismatched(msg: str):
    m = re.match(r"^mismatched input (.+?) expecting (.+)$", msg)
    if not m:
        return None
    found_raw, expecting_raw = m.group(1), m.group(2)
    found = _translate_token_piece(found_raw)
    expecting = _render_expecting_clause(expecting_raw)
    return f"رمز غير متوقع {found} — كان المتوقع {expecting}"


def _msg_no_viable_alt(msg: str):
    m = re.match(r"^no viable alternative at input (.+)$", msg)
    if not m:
        return None
    found_raw = m.group(1)
    found = _translate_token_piece(found_raw)
    return f"تركيب غير صحيح بدءاً من {found}"


def _msg_token_recognition(msg: str):
    m = re.match(r"^token recognition error at: (.+)$", msg)
    if not m:
        return None
    found_raw = m.group(1)
    found = _translate_token_piece(found_raw)
    return f"رمز غير معروف في اللغة: {found}"


def _msg_rule_failed_predicate(msg: str):
    m = re.match(r"^rule (\S+) (.+)$", msg)
    if not m:
        return None
    return f"خطأ نحوي داخل القاعدة '{m.group(1)}': {m.group(2)}"


_MESSAGE_HANDLERS = [
    _msg_missing,
    _msg_extraneous,
    _msg_mismatched,
    _msg_no_viable_alt,
    _msg_token_recognition,
    _msg_rule_failed_predicate,
]


def translate_syntax_message(raw_msg: str) -> str:
    raw_msg = _decode_escaped_arabic(raw_msg)
    for handler in _MESSAGE_HANDLERS:
        result = handler(raw_msg)
        if result is not None:
            return result
    # Unrecognized shape — degrade gracefully rather than hide it.
    return f"خطأ نحوي: {raw_msg}"


# ---------------------------------------------------------------------------
# The actual ErrorListener to attach to both Lexer and Parser.
# ---------------------------------------------------------------------------

class CollectingErrorListener(ErrorListener):
    """
    Attach ONE shared instance to both the lexer and the parser:

        listener = CollectingErrorListener()
        lexer.removeErrorListeners(); lexer.addErrorListener(listener)
        parser.removeErrorListeners(); parser.addErrorListener(listener)

    so lexical and syntactic errors land in the same ordered list,
    instead of ANTLR's default listener printing them to stderr.
    """

    def __init__(self):
        super().__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append(CompilerError(
            phase=ErrorPhase.SYNTAX,
            severity=ErrorSeverity.ERROR,
            message_ar=translate_syntax_message(msg),
            line=line,
            column=column + 1,  # ANTLR columns are 0-based
            raw_message=msg,
        ))
