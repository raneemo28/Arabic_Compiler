lexer grammar CommonLexer;

options {
    superClass = ArabicLexerBase;
}
// --- Channels ---
WS : [ \t\r\n]+ -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT:'//' ~[\r\n]* -> skip;

// --- Syntax Symbols ---
LBRACE : '{' ;
RBRACE : '}' ;
COLON  : ':' ;
SEMI   : '؛' ;
COMMA  : '،' ;
DOT    : '.' ;
HASH   : '#' ;
LPAREN : '(' ;
RPAREN : ')' ;
PLUS   : '+' ;
MINUS  : '-' ;
STAR   : '*' ;
SLASH  : '/' ;
PERCENT: '%' ;
GT     : '>' ;
LT     : '<' ;
TILDE  : '~' ;
BANG   : '!' ;
DBL_COLON : '::' ;