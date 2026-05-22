lexer grammar ArabicHtmlLexer;

// Import order matters:
// 1. CommonLexer first (fragments + symbols — the foundation)
// 2. ACSSLexer second (CSS keywords)
// 3. JavascriptLexer third (JS keywords)
// Main file rules (defined below) ALWAYS take highest priority.
import CommonLexer, ACSSLexer, JavascriptLexer;

options {
    superClass = ArabicLexerBase;
}


// --- HTML STRUCTURE TOKENS (Highest priority - defined here)
// Uses ARABIC_WORD fragment from CommonLexer for strict Arabic-only tags
// ============================================================

CLOSE_TAG : '</' ARABIC_WORD '>' ;
OPEN_TAG  : '<'  ARABIC_WORD '>' ;

// ============================================================
// --- DYNAMIC TOKENS (Always last — fallback rules)
// Defined here in the main file to guarantee they come AFTER
// all fixed keywords from every imported sub-lexer.
// ============================================================

// CSS unit suffixes (must come before NUMBER to avoid partial match)


// Hex colors (must come before IDENTIFIER to avoid '#' being consumed)
HEX_COLOR
    : '#' [a-fA-F0-9]
      ( [a-fA-F0-9] [a-fA-F0-9]
        [a-fA-F0-9]? [a-fA-F0-9]? [a-fA-F0-9]?
      )?
    ;

// Numbers: Western (0-9) and Arabic-Indic (٠-٩) with optional decimal
NUMBER
    : DIGIT+ ('.' DIGIT+)?
    ;

// String literals (double or single quoted)
STRING
    : '"'  (~["\r\n])* '"'
    | '\'' (~['\r\n])* '\''
    ;

// *** THE KEY RULE: Unified bilingual identifier ***
// Composed from shared fragments: ID_START and ID_CONTINUE
// Matches Arabic words, English words, mixed names, CSS selectors,
// JS variable names — anything that is NOT a fixed keyword above.
IDENTIFIER
    : ID_START ID_CONTINUE*
    ;

// Free-form text between HTML tags (last resort — catches everything else)
TEXT
    : ~[<>{}؛;]+
    ;