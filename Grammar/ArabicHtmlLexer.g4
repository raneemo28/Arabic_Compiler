lexer grammar ArabicHtmlLexer;

import CommonLexer;
options {
    superClass = ArabicLexerBase;
}

CLOSE_TAG
    : '</' ARABIC_ID '>'
    ;

OPEN_TAG
    : '<' ARABIC_ID '>'
    ;

TEXT
    : ~[<]+
    ;


fragment ARABIC_LETTER
    : [\u0621-\u064A]
    ;

fragment ARABIC_ID
    : ARABIC_LETTER+
    ;