parser grammar ArabicHtmlParser;

options {
    tokenVocab = ArabicHtmlLexer;
}

// --- Entry Point ---
program
    : (htmlElement | cssRule | tsStatement)* EOF
    ;

// --- HTML Rules ---

attribute
    : ATTR_ID    TS_ASSIGN STRING   # idAttribute
    | ATTR_CLASS TS_ASSIGN STRING   # classAttribute
    | ATTR_SRC   TS_ASSIGN STRING   # srcAttribute
    | ATTR_HREF  TS_ASSIGN STRING   # hrefAttribute
    ;
    
// CORRECT
htmlElement
    : OPEN_TAG_START attribute* GT htmlContent CLOSE_TAG   # parentElement
    | OPEN_TAG_START attribute* SELF_CLOSE_END             # selfClosingElement
    ;

htmlContent
    : (htmlElement | tsStatement | cssRule | text)* 
    ;

// Allows keywords to be treated as plain text inside HTML tags
text
    : STRING 
    | IDENTIFIER 
    | NUMBER 
    | arabicKeyword 
    ;

// Groups all keywords that might appear as natural language in HTML
arabicKeyword
    : TS_IF | TS_ELSE 
    | TS_FOR | TS_WHILE | TS_FUNCTION | TS_RETURN
    | TS_OF | TS_IN | TS_VAR | TS_LET 
    | TS_CONST | TS_TRUE | TS_FALSE 
    | CSS_DISPLAY | CSS_MARGIN | CSS_PADDING | CSS_CENTER 
    | CSS_BLOCK 
    ;

// --- CSS Rules ---
cssRule
    : selector LBRACE declarationList RBRACE 
    ;

selector
    : IDENTIFIER 
    | HASH IDENTIFIER     // ID selector [cite: 149]
    | DOT IDENTIFIER      // Class selector [cite: 150]
    | CSS_MEDIA IDENTIFIER // @media rule 
    ;

declarationList
    : declaration (SEMI declaration)* SEMI? 
    ;

declaration
    : cssProperty COLON cssValue 
    ;

cssProperty
    : CSS_DISPLAY | CSS_POSITION | CSS_WIDTH | CSS_HEIGHT | CSS_MAX_WIDTH | CSS_MIN_WIDTH 
    | CSS_MAX_HEIGHT | CSS_MIN_HEIGHT | CSS_MARGIN | CSS_PADDING | CSS_BORDER | CSS_VISIBILITY 
    | CSS_OVERFLOW | CSS_Z_INDEX | CSS_BOX_SIZING | CSS_FLEX | CSS_FLEX_DIR 
    | CSS_FLEX_WRAP | CSS_FLEX_GROW | CSS_FLEX_SHRINK | CSS_GRID | CSS_GRID_TEMPLATE | CSS_GAP 
    | CSS_JUSTIFY_CONT | CSS_ALIGN_ITEMS | CSS_ALIGN_SELF | CSS_ORDER | CSS_COLOR | CSS_BACKGROUND 
    | CSS_BG_IMAGE | CSS_BG_COLOR | CSS_BG_SIZE | CSS_BG_REPEAT | CSS_BG_ATTACH | CSS_BG_CLIP 
    | CSS_OPACITY | CSS_BOX_SHADOW | CSS_FONT_FAMILY | CSS_FONT_SIZE | CSS_FONT_WEIGHT | CSS_FONT_STYLE 
    | CSS_TEXT_ALIGN | CSS_TEXT_DECOR | CSS_TEXT_TRANS | CSS_TEXT_SHADOW | CSS_TEXT_INDENT 
    | CSS_LINE_HEIGHT | CSS_LETTER_SPACING | CSS_WORD_SPACING | CSS_WHITE_SPACE | CSS_DIRECTION 
    | CSS_WRITING_MODE | CSS_BORDER_RADIUS | CSS_BORDER_WIDTH | CSS_BORDER_STYLE 
    | CSS_BORDER_COLOR | CSS_OUTLINE | CSS_LIST_STYLE | CSS_BORDER_COLLAPSE | CSS_TABLE_LAYOUT | CSS_CAPTION_SIDE 
    | CSS_FILTER | CSS_BACKDROP_FILT 
    ;

cssValue
    : IDENTIFIER | NUMBER | CSS_UNIT | CSS_HEX_COLOR | STRING 
    | CSS_INHERIT | CSS_INITIAL | CSS_UNSET | CSS_NONE | CSS_AUTO | CSS_CENTER 
    | CSS_SOLID | CSS_DASHED | CSS_DOTTED | CSS_DOUBLE | CSS_HIDDEN | CSS_BLOCK
    | CSS_INLINE | CSS_FLEX_VALUE | CSS_ABSOLUTE | CSS_RELATIVE | CSS_FIXED 
    | CSS_STICKY | CSS_ROW | CSS_COLUMN | CSS_WRAP | CSS_BOLD | CSS_ITALIC 
    | cssFunction 
    ;

cssFunction
    : (CSS_URL_FUNC | CSS_RGB_FUNC | CSS_RGBA_FUNC | CSS_CALC_FUNC | CSS_VAR_FUNC | CSS_ROTATE_FUNC | CSS_SCALE_FUNC | CSS_BLUR_FUNC) 
      LPAREN (expression (COMMA expression)*)? RPAREN 
    ;

tsType
    : TS_STRING_KW 
    | TS_NUMBER_KW 
    | TS_BOOLEAN_KW
    | TS_ANY_KW
    | TS_BIGINT_KW
    ;
// --- Typescript Rules ---
tsStatement
    : tsDeclaration
    | assignmentStatement 
    | ifStatement 
    | arrayLoop 
    | forLoop
    | whileLoop 
    | functionDeclaration 
    | returnStatement 
    | tryCatchStatement 
    | expressionStatement 
    | builtInCall 
    | block 
    ;

// قاعدة موحدة للتعريفات مع تأخير القرار
variableDeclaration
    : (TS_VAR | TS_LET | TS_CONST) IDENTIFIER COLON tsType (TS_ASSIGN expression)?  SEMI
    ;

tsDeclaration
    : (TS_VAR | TS_LET | TS_CONST) 
      (
        IDENTIFIER COLON tsType (TS_ASSIGN expression)?                            
        | IDENTIFIER COLON tsType LBRACK RBRACK (TS_ASSIGN arrayLiteral)? 
        | IDENTIFIER TS_ASSIGN objectLiteral
      ) 
      SEMI
    ;

block
    : LBRACE tsStatement* RBRACE 
    ;


assignmentStatement
    : IDENTIFIER (TS_ASSIGN | TS_ADD_ASSIGN | TS_SUB_ASSIGN | TS_MUL_ASSIGN | TS_DIV_ASSIGN) expression SEMI 
    ;

ifStatement
    : TS_IF LPAREN expression RPAREN tsStatement (TS_ELSE tsStatement)? 
    ;

forLoop
    : TS_FOR LPAREN ((variableDeclaration | assignmentExpression) expression SEMI expression) RPAREN block
    ;
    
arrayLoop
    : TS_FOR LPAREN TS_CONST IDENTIFIER (TS_OF|TS_IN) expression RPAREN block 
    ;


whileLoop
    : TS_WHILE LPAREN expression RPAREN block 
    ;

functionDeclaration
    : TS_FUNCTION IDENTIFIER LPAREN parameterList? RPAREN block 
    ;

parameterList
    : IDENTIFIER (COMMA IDENTIFIER)* 
    ;

returnStatement
    : TS_RETURN expression? SEMI 
    ;

tryCatchStatement
    : TS_TRY block TS_CATCH LPAREN IDENTIFIER RPAREN block (TS_FINALLY block)? 
    ;

expressionStatement
    : expression SEMI 
    ;

builtInCall
    : (TS_CONSOLE DOT TS_LOG | TS_ALERT | TS_PROMPT) LPAREN (expression (COMMA expression)*)? RPAREN SEMI 
    ;

// --- TS Expression Hierarchy ---
expression
    : assignmentExpression 
    ;

assignmentExpression
    : logicalOrExpression (TS_ASSIGN expression)? 
    ;

logicalOrExpression
    : logicalAndExpression (TS_OR logicalAndExpression)* 
    ;

logicalAndExpression
    : equalityExpression (TS_AND equalityExpression)* 
    ;

equalityExpression
    : relationalExpression ((TS_STREQ | TS_STRNEQ | TS_EQ | TS_NEQ) relationalExpression)* 
    ;

relationalExpression
    : additiveExpression ((LT | GT | TS_GTE | TS_LTE | TS_INSTANCEOF | TS_IN) additiveExpression)* 
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)* 
    ;

multiplicativeExpression
    : memberExpression ((STAR | SLASH | PERCENT) memberExpression)* 
    ;

// Fixed left-recursion by separating primary and member expressions
memberExpression
    : primaryExpression (
        LPAREN (expression (COMMA expression)*)? RPAREN 
        | DOT (IDENTIFIER | TS_LOG | TS_ADD_LISTENER | TS_INNER_TEXT | TS_STYLE) 
        | LBRACK expression RBRACK 
    )*
    ;

primaryExpression
    : IDENTIFIER 
    | NUMBER 
    | STRING 
    | TS_TRUE | TS_FALSE | TS_NULL | TS_UNDEFINED | TS_THIS | TS_NAN 
    | TS_DOCUMENT | TS_WINDOW 
    | LPAREN expression RPAREN 
    ;


arrayLiteral
    : LBRACK (expression (COMMA expression)*)? RBRACK 
    ;

// arrayDeclaration
//     : (TS_VAR | TS_LET | TS_CONST) TS_ARRAY_KW IDENTIFIER COLON tsType LBRACK RBRACK (TS_ASSIGN arrayLiteral)? SEMI
//     ;

objectLiteral
    : LBRACE (IDENTIFIER COLON expression (COMMA IDENTIFIER COLON expression)*)? RBRACE 
    ;

// objectDeclaration
//     : (TS_VAR | TS_LET | TS_CONST) TS_OBJECT_KW COLON tsType LBRACE RBRACE IDENTIFIER (TS_ASSIGN objectLiteral)? SEMI 
//     ;