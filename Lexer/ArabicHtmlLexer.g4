lexer grammar ArabicHtmlLexer;

options {
    superClass = ArabicLexerBase;
}

LINE_COMMENT
    : '//' ~[\r\n]*
      -> skip
    ;

CLOSE_TAG
    : '</' ARABIC_ID '>'
    ;

OPEN_TAG
    : '<' ARABIC_ID '>'
    ;

TEXT
    : ~[<]+
    ;
WS
    : [ \t\r\n]+
      -> skip
    ;

fragment ARABIC_LETTER
    : [\u0621-\u064A]
    ;

fragment ARABIC_ID
    : ARABIC_LETTER+
    ;