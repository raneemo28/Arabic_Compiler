lexer grammar CommonLexer;

options {
    superClass = ArabicLexerBase;
}

// ============================================================
// --- ATOMIC FRAGMENTS (Building Blocks, emit NO tokens) ---
// ============================================================

// Pure Arabic alphabet (Unicode Arabic letters block)
fragment ARABIC_CHAR
    : [\u0621-\u064A]
    ;

// Pure English alphabet characters
fragment ENGLISH_CHAR
    : [a-zA-Z]
    ;

// Any letter (Arabic or English)
fragment LETTER
    : ARABIC_CHAR
    | ENGLISH_CHAR
    ;

// Standard digits (Western) + Arabic-Indic digits (٠-٩)
fragment DIGIT
    : [0-9]
    | [\u0660-\u0669]
    ;

// Special symbols allowed inside identifier names
fragment ID_SYMBOL
    : [$_]
    ;

// ============================================================
// --- STRICT COMPOSED FRAGMENTS (for specific use cases) ---
// ============================================================

// Strictly Arabic-only word (used for HTML tag names)
fragment ARABIC_WORD
    : ARABIC_CHAR+
    ;

// Full identifier start: letter or $ or _
fragment ID_START
    : LETTER
    | ID_SYMBOL
    ;

// Full identifier continuation: letter, digit, special symbol, or dash
fragment ID_CONTINUE
    : LETTER
    | DIGIT
    | ID_SYMBOL
    | '-'
    ;

// ============================================================
// --- WHITESPACE & COMMENTS ---
// ============================================================

WS          : [ \t\r\n]+     -> skip ;
COMMENT     : '/*' .*? '*/' -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;

// ============================================================
// --- SHARED SYNTAX SYMBOLS ---
// ============================================================

LBRACE    : '{' ;
RBRACE    : '}' ;
COLON     : ':' ;
SEMI      : '؛' ;
COMMA     : '،' ;
DOT       : '.' ;
HASH      : '#' ;
LPAREN    : '(' ;
RPAREN    : ')' ;
PLUS      : '+' ;
MINUS     : '-' ;
STAR      : '*' ;
SLASH     : '/' ;
PERCENT   : '%' ;
GT        : '>' ;
LT        : '<' ;
TILDE     : '~' ;
BANG      : '!' ;
DBL_COLON : '::' ;