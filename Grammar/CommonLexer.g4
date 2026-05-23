lexer grammar CommonLexer;

options {
    superClass = ArabicLexerBase;
}

// ============================================================
// --- ATOMIC FRAGMENTS (Building Blocks, emit NO tokens) ---
// ============================================================

fragment ARABIC_CHAR  : [\u0621-\u064A] ;
fragment ENGLISH_CHAR : [a-zA-Z] ;
fragment LETTER       : ARABIC_CHAR | ENGLISH_CHAR ;
fragment DIGIT        : [0-9] | [\u0660-\u0669] ;
fragment ID_SYMBOL    : [$_] ;

// ============================================================
// --- STRICT COMPOSED FRAGMENTS ---
// ============================================================

fragment ARABIC_WORD
    : ARABIC_CHAR+
    ;

fragment ID_START
    : LETTER
    | ID_SYMBOL
    ;

fragment ID_CONTINUE
    : LETTER
    | DIGIT
    | ID_SYMBOL
    | '-'
    ;

// ============================================================
// --- WHITESPACE & COMMENTS (shared across ALL modes) ---
// NOTE: these are defined per-mode in the main lexer file.
// Keep them here only as reference — the main file overrides.
// ============================================================

WS           : [ \t\r\n]+    -> skip ;
COMMENT      : '/*' .*? '*/' -> skip ;
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
