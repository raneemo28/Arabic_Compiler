parser grammar ArabicHtmlParser;

options {
    tokenVocab = ArabicHtmlLexer;
}

// --- Entry Point ---
program
    : (htmlElement | cssRule | jsStatement)* EOF
    ;

// --- HTML Rules ---

attribute
    : ATTR_ID    JS_ASSIGN STRING   # idAttribute
    | ATTR_CLASS JS_ASSIGN STRING   # classAttribute
    | ATTR_SRC   JS_ASSIGN STRING   # srcAttribute
    | ATTR_HREF  JS_ASSIGN STRING   # hrefAttribute
    ;
    
// CORRECT
htmlElement
    : OPEN_TAG_START attribute* GT htmlContent CLOSE_TAG   # parentElement
    | OPEN_TAG_START attribute* SELF_CLOSE_END             # selfClosingElement
    ;

htmlContent
    : (htmlElement | jsStatement | cssRule | text)* 
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
    : JS_IF | JS_ELSE 
    | JS_FOR | JS_WHILE | JS_FUNCTION | JS_RETURN
    | JS_OF | JS_IN | JS_VAR | JS_LET 
    | JS_CONST | JS_TRUE | JS_FALSE 
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

// --- JavaScript Rules ---
jsStatement
    : variableDeclaration 
    | assignmentStatement 
    | ifStatement 
    | forLoop 
    | whileLoop 
    | functionDeclaration 
    | returnStatement 
    | tryCatchStatement 
    | expressionStatement 
    | builtInCall 
    | block 
    ;

block
    : LBRACE jsStatement* RBRACE 
    ;

variableDeclaration
    : (JS_VAR | JS_LET | JS_CONST) IDENTIFIER (JS_ASSIGN expression)? SEMI 
    ;

assignmentStatement
    : IDENTIFIER (JS_ASSIGN | JS_ADD_ASSIGN | JS_SUB_ASSIGN | JS_MUL_ASSIGN | JS_DIV_ASSIGN) expression SEMI 
    ;

ifStatement
    : JS_IF LPAREN expression RPAREN jsStatement (JS_ELSE jsStatement)? 
    ;

forLoop
    : JS_FOR LPAREN (variableDeclaration | expression SEMI expression SEMI expression) RPAREN jsStatement 
    | JS_FOR LPAREN (JS_LET | JS_VAR) IDENTIFIER (JS_OF | JS_IN) expression RPAREN jsStatement 
    ;

whileLoop
    : JS_WHILE LPAREN expression RPAREN jsStatement 
    ;

functionDeclaration
    : JS_FUNCTION IDENTIFIER LPAREN parameterList? RPAREN block 
    ;

parameterList
    : IDENTIFIER (COMMA IDENTIFIER)* 
    ;

returnStatement
    : JS_RETURN expression? SEMI 
    ;

tryCatchStatement
    : JS_TRY block JS_CATCH LPAREN IDENTIFIER RPAREN block (JS_FINALLY block)? 
    ;

expressionStatement
    : expression SEMI 
    ;

builtInCall
    : (JS_CONSOLE DOT JS_LOG | JS_ALERT | JS_PROMPT) LPAREN (expression (COMMA expression)*)? RPAREN SEMI 
    ;

// --- JS Expression Hierarchy ---
expression
    : assignmentExpression 
    ;

assignmentExpression
    : logicalOrExpression (JS_ASSIGN expression)? 
    ;

logicalOrExpression
    : logicalAndExpression (JS_OR logicalAndExpression)* 
    ;

logicalAndExpression
    : equalityExpression (JS_AND equalityExpression)* 
    ;

equalityExpression
    : relationalExpression ((JS_STREQ | JS_STRNEQ | JS_EQ | JS_NEQ) relationalExpression)* 
    ;

relationalExpression
    : additiveExpression ((LT | GT | JS_GTE | JS_LTE | JS_INSTANCEOF | JS_IN) additiveExpression)* 
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
        | DOT (IDENTIFIER | JS_LOG | JS_ADD_LISTENER | JS_INNER_TEXT | JS_STYLE) 
        | LBRACK expression RBRACK 
    )*
    ;

primaryExpression
    : IDENTIFIER 
    | NUMBER 
    | STRING 
    | JS_TRUE | JS_FALSE | JS_NULL | JS_UNDEFINED | JS_THIS | JS_NAN 
    | JS_DOCUMENT | JS_WINDOW 
    | LPAREN expression RPAREN 
    | arrayLiteral 
    | objectLiteral 
    ;

arrayLiteral
    : LBRACK (expression (COMMA expression)*)? RBRACK 
    ;

objectLiteral
    : LBRACE (IDENTIFIER COLON expression (COMMA IDENTIFIER COLON expression)*)? RBRACE 
    ;