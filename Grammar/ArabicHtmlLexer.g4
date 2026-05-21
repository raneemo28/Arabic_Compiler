lexer grammar ArabicHtmlLexer;

import ACSSLexer;
options {
    superClass = ArabicLexerBase;
}

CLOSE_TAG
    : '</' ARABIC_ID '>'
    ;

OPEN_TAG
    : '<' ARABIC_ID '>'
    ;

fragment ARABIC_LETTER
    : [\u0621-\u064A]
    ;

fragment ARABIC_ID
    : ARABIC_LETTER+
    ;

TEXT
    : ~[<>{};؛]+
    ;