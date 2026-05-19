// ============================================================
//  ArabicHtmlLexer.g4
//  Pure ANTLR4 Lexer grammar — no Python code inside.
//  The superClass option links this lexer to ArabicLexerBase.py
//  at runtime, which handles UTF-8 and diacritic stripping.
//
//  Generate with:
//    antlr4 -Dlanguage=Python3 -visitor ArabicHtmlLexer.g4
//    antlr4 -Dlanguage=Python3 -visitor ArabicHtmlParser.g4
// ============================================================

lexer grammar ArabicHtmlLexer;

// ------------------------------------------------------------
// OPTIONS
// Links the generated ArabicHtmlLexer.py to the hand-written
// ArabicLexerBase.py superclass.  That file is where all
// Python runtime logic (UTF-8 normalisation, Tashkeel stripping)
// lives — keeping this .g4 file pure ANTLR syntax.
// ------------------------------------------------------------
options {
    superClass = ArabicLexerBase;
}

// ============================================================
// TOKENS  — order defines priority (first rule wins on a tie)
// ============================================================

// ------------------------------------------------------------
// 1. COMMENTS  (before TEXT so '//' is never absorbed by TEXT)
// ------------------------------------------------------------
LINE_COMMENT
    : '//' ~[\r\n]*
      -> skip
    ;

// ------------------------------------------------------------
// 2. CLOSING TAG   </وسم>
//    Declared BEFORE OPEN_TAG so that the two-char prefix '</'
//    is always consumed here via Maximal Munch, never split.
// ------------------------------------------------------------
CLOSE_TAG
    : '</' ARABIC_ID '>'
    ;

// ------------------------------------------------------------
// 3. OPENING TAG   <وسم>
// ------------------------------------------------------------
OPEN_TAG
    : '<' ARABIC_ID '>'
    ;

// ------------------------------------------------------------
// 4. TEXT — everything between tags except '<'
//    Using ~[<]+ (one-or-more non-'<' characters) means the
//    lexer grabs the longest possible run of content characters
//    before it ever considers starting a new tag token.
// ------------------------------------------------------------
TEXT
    : ~[<]+
    ;

// ------------------------------------------------------------
// 5. WHITESPACE — silently discarded
// ------------------------------------------------------------
WS
    : [ \t\r\n]+
      -> skip
    ;

// ============================================================
// FRAGMENTS  (building blocks — produce no tokens on their own)
// ============================================================

// Arabic base letters U+0621–U+064A.
// Tashkeel (U+064B–U+065F) is above this range and is therefore
// never a valid identifier character at the grammar level.
// ArabicLexerBase.py strips diacritics from the stream before
// tokenisation, so vocalised tags such as <كِتَابٌ> reach this
// rule already normalised to <كتاب>.
fragment ARABIC_LETTER
    : [\u0621-\u064A]
    ;

// One or more Arabic letters form a valid tag identifier.
fragment ARABIC_ID
    : ARABIC_LETTER+
    ;
