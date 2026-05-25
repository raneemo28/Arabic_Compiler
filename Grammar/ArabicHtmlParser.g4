parser grammar ArabicHtmlParser;

options {
    tokenVocab = ArabicHtmlLexer;
}


// ============================================================
// TOP LEVEL
// ============================================================

program
    : topLevelItem* EOF
    ;

topLevelItem
    : htmlElement
    | cssBlock
    | jsBlock
    ;


// ============================================================
// HTML
// ============================================================

htmlElement
    : openTag content* closeTag   # parentElement
    | SELF_CLOSE                  # selfClosingElement
    ;

openTag  : OPEN_TAG ;
closeTag : CLOSE_TAG ;

content
    : htmlElement
    | TEXT
    ;


// ============================================================
// CSS
// ============================================================

cssBlock
    : CSS_OPEN cssRule* CSS_CLOSE_TAG
    ;

cssRule
    : cssSelector+ CSS_LBRACE cssDeclaration* CSS_RBRACE   # regularRule
    | mediaRule                                              # mediaRuleItem
    ;

mediaRule
    : CSS_MEDIA CSS_LPAREN cssDeclaration CSS_RPAREN CSS_LBRACE cssRule* CSS_RBRACE
    ;

cssSelector
    : simpleSelectorList (combinator simpleSelectorList)*
    ;

simpleSelectorList
    : simpleSelector+
    ;

simpleSelector
    : CSS_IDENTIFIER              # typeSelector
    | CSS_DOT CSS_IDENTIFIER      # classSelector
    | CSS_HASH CSS_IDENTIFIER     # idSelector
    | pseudoSelector              # pseudoSel
    ;

combinator
    : CSS_GT      # childCombinator
    | CSS_TILDE   # siblingCombinator
    ;

pseudoSelector
    : CSS_COLON     pseudoClass
    | CSS_DBL_COLON pseudoElement
    ;

pseudoClass
    : CSS_HOVER | CSS_ACTIVE | CSS_FOCUS | CSS_VISITED
    | CSS_ENABLED | CSS_DISABLED | CSS_CHECKED
    ;

pseudoElement
    : CSS_BEFORE | CSS_AFTER | CSS_PLACEHOLDER | CSS_SELECTION
    ;

cssDeclaration
    : cssProperty CSS_COLON cssValue (CSS_COMMA cssValue)* CSS_SEMI
    ;

cssProperty
    : CSS_DISPLAY       | CSS_POSITION    | CSS_WIDTH        | CSS_HEIGHT
    | CSS_MAX_WIDTH     | CSS_MIN_WIDTH   | CSS_MAX_HEIGHT   | CSS_MIN_HEIGHT
    | CSS_MARGIN        | CSS_PADDING     | CSS_BORDER       | CSS_VISIBILITY
    | CSS_OVERFLOW      | CSS_Z_INDEX     | CSS_BOX_SIZING
    | CSS_FLEX          | CSS_FLEX_DIR    | CSS_FLEX_WRAP    | CSS_FLEX_GROW
    | CSS_FLEX_SHRINK   | CSS_GRID        | CSS_GRID_TEMPLATE| CSS_GAP
    | CSS_JUSTIFY_CONT  | CSS_ALIGN_ITEMS | CSS_ALIGN_SELF   | CSS_ORDER
    | CSS_COLOR         | CSS_BACKGROUND  | CSS_BG_IMAGE     | CSS_BG_COLOR
    | CSS_BG_SIZE       | CSS_BG_REPEAT   | CSS_BG_ATTACH    | CSS_BG_CLIP
    | CSS_OPACITY       | CSS_BOX_SHADOW
    | CSS_FONT_FAMILY   | CSS_FONT_SIZE   | CSS_FONT_WEIGHT  | CSS_FONT_STYLE
    | CSS_TEXT_ALIGN    | CSS_TEXT_DECOR  | CSS_TEXT_TRANS   | CSS_TEXT_SHADOW
    | CSS_TEXT_INDENT   | CSS_LINE_HEIGHT | CSS_LETTER_SPACING | CSS_WORD_SPACING
    | CSS_WHITE_SPACE   | CSS_DIRECTION   | CSS_WRITING_MODE
    | CSS_BORDER_RADIUS | CSS_BORDER_WIDTH| CSS_BORDER_STYLE | CSS_BORDER_COLOR
    | CSS_OUTLINE
    | CSS_TOP           | CSS_BOTTOM      | CSS_RIGHT        | CSS_LEFT
    | CSS_LIST_STYLE    | CSS_BORDER_COLLAPSE | CSS_TABLE_LAYOUT | CSS_CAPTION_SIDE
    | CSS_FILTER        | CSS_BACKDROP_FILT
    ;

cssValue
    : CSS_UNIT
    | CSS_NUMBER
    | CSS_HEX_COLOR
    | CSS_STRING
    | cssKeyword
    | cssFunction
    | CSS_IDENTIFIER
    ;

cssKeyword
    : CSS_NONE    | CSS_AUTO      | CSS_CENTER   | CSS_SOLID  | CSS_DASHED
    | CSS_DOTTED  | CSS_DOUBLE    | CSS_HIDDEN   | CSS_BLOCK  | CSS_INLINE
    | CSS_FLEX_VALUE | CSS_ABSOLUTE | CSS_RELATIVE | CSS_FIXED | CSS_STICKY
    | CSS_ROW     | CSS_COLUMN    | CSS_WRAP     | CSS_POINTER| CSS_BOLD
    | CSS_ITALIC  | CSS_INHERIT   | CSS_INITIAL  | CSS_UNSET  | CSS_IMPORTANT
    ;

cssFunction
    : CSS_RGB_FUNC  CSS_LPAREN cssValue (CSS_COMMA cssValue)* CSS_RPAREN
    | CSS_RGBA_FUNC CSS_LPAREN cssValue (CSS_COMMA cssValue)* CSS_RPAREN
    | CSS_CALC_FUNC CSS_LPAREN cssCalcExpr CSS_RPAREN
    | CSS_VAR_FUNC  CSS_LPAREN CSS_IDENTIFIER CSS_RPAREN
    | CSS_URL_FUNC  CSS_LPAREN CSS_STRING CSS_RPAREN
    | CSS_ROTATE_FUNC CSS_LPAREN cssValue CSS_RPAREN
    | CSS_SCALE_FUNC  CSS_LPAREN cssValue CSS_RPAREN
    | CSS_BLUR_FUNC   CSS_LPAREN cssValue CSS_RPAREN
    ;

cssCalcExpr
    : cssCalcTerm (('+' | '-') cssCalcTerm)*
    ;

cssCalcTerm
    : cssValue (('*' | '/') cssValue)*
    ;


// ============================================================
// JAVASCRIPT
// ============================================================

jsBlock
    : JS_OPEN jsStatement* JS_CLOSE_TAG
    ;

// ---- Statements ----

jsStatement
    : varDeclaration
    | functionDeclaration
    | classDeclaration
    | returnStatement
    | ifStatement
    | switchStatement
    | forStatement
    | whileStatement
    | doWhileStatement
    | tryCatchStatement
    | throwStatement
    | importStatement
    | exportStatement
    | expressionStatement
    ;

varDeclaration
    : varKeyword JS_IDENTIFIER (JS_ASSIGN expression)? JS_SEMI
    ;

varKeyword
    : JS_VAR | JS_LET | JS_CONST
    ;

functionDeclaration
    : JS_FUNCTION JS_IDENTIFIER JS_LPAREN parameterList? JS_RPAREN jsBody
    ;

parameterList
    : JS_IDENTIFIER (JS_COMMA JS_IDENTIFIER)*
    ;

jsBody
    : JS_LBRACE jsStatement* JS_RBRACE
    ;

classDeclaration
    : JS_CLASS JS_IDENTIFIER (JS_EXTENDS JS_IDENTIFIER)? JS_LBRACE classMember* JS_RBRACE
    ;

classMember
    : accessModifier? JS_STATIC?
      ( JS_CONSTRUCTOR JS_LPAREN parameterList? JS_RPAREN jsBody
      | JS_FUNCTION? JS_IDENTIFIER JS_LPAREN parameterList? JS_RPAREN jsBody
      | varKeyword JS_IDENTIFIER (JS_ASSIGN expression)? JS_SEMI
      )
    ;

accessModifier
    : JS_PUBLIC | JS_PRIVATE | JS_PROTECTED
    ;

returnStatement
    : JS_RETURN expression? JS_SEMI
    ;

ifStatement
    : JS_IF JS_LPAREN expression JS_RPAREN jsBody
      (JS_ELSE ifStatement | JS_ELSE jsBody)?
    ;

switchStatement
    : JS_SWITCH JS_LPAREN expression JS_RPAREN JS_LBRACE switchCase* defaultCase? JS_RBRACE
    ;

switchCase
    : JS_CASE expression JS_COLON jsStatement*
    ;

defaultCase
    : JS_DEFAULT JS_COLON jsStatement*
    ;

forStatement
    : JS_FOR JS_LPAREN forInit? JS_SEMI expression? JS_SEMI expression? JS_RPAREN jsBody  # classicFor
    | JS_FOR JS_LPAREN varKeyword JS_IDENTIFIER JS_OF expression JS_RPAREN jsBody          # forOf
    | JS_FOR JS_LPAREN varKeyword JS_IDENTIFIER JS_IN expression JS_RPAREN jsBody          # forIn
    ;

forInit
    : varDeclaration
    | expression
    ;

whileStatement
    : JS_WHILE JS_LPAREN expression JS_RPAREN jsBody
    ;

doWhileStatement
    : JS_DO jsBody JS_WHILE JS_LPAREN expression JS_RPAREN JS_SEMI
    ;

tryCatchStatement
    : JS_TRY jsBody
      (JS_CATCH JS_LPAREN JS_IDENTIFIER JS_RPAREN jsBody)?
      (JS_FINALLY jsBody)?
    ;

throwStatement
    : JS_THROW expression JS_SEMI
    ;

importStatement
    : JS_IMPORT importClause JS_FROM JS_STRING JS_SEMI
    ;

importClause
    : JS_IDENTIFIER                                                     # defaultImport
    | JS_LBRACE JS_IDENTIFIER (JS_COMMA JS_IDENTIFIER)* JS_RBRACE      # namedImport
    ;

exportStatement
    : JS_EXPORT (functionDeclaration | classDeclaration | varDeclaration)
    ;

expressionStatement
    : expression JS_SEMI
    ;

// ---- Expressions (precedence climbing) ----

expression
    : assignmentExpr
    ;

assignmentExpr
    : ternaryExpr (assignOp assignmentExpr)?
    ;

assignOp
    : JS_ASSIGN    | JS_ADD_ASSIGN | JS_SUB_ASSIGN | JS_MUL_ASSIGN
    | JS_DIV_ASSIGN| JS_MOD_ASSIGN | JS_EXP_ASSIGN | JS_AND_ASSIGN
    | JS_OR_ASSIGN | JS_NULL_ASSIGN
    ;

ternaryExpr
    : logicalOrExpr (JS_QUESTION expression JS_COLON expression)?
    ;

logicalOrExpr
    : logicalAndExpr (JS_OR logicalAndExpr)*
    ;

logicalAndExpr
    : nullCoalesceExpr (JS_AND nullCoalesceExpr)*
    ;

nullCoalesceExpr
    : bitwiseOrExpr (JS_NULL_COAL bitwiseOrExpr)*
    ;

bitwiseOrExpr
    : bitwiseXorExpr (JS_BIT_OR bitwiseXorExpr)*
    ;

bitwiseXorExpr
    : bitwiseAndExpr (JS_BIT_XOR bitwiseAndExpr)*
    ;

bitwiseAndExpr
    : equalityExpr (JS_BIT_AND equalityExpr)*
    ;

equalityExpr
    : relationalExpr ((JS_STREQ | JS_STRNEQ | JS_EQ | JS_NEQ) relationalExpr)*
    ;

relationalExpr
    : shiftExpr ((JS_LT | JS_GT | JS_LTE | JS_GTE | JS_INSTANCEOF | JS_IN) shiftExpr)*
    ;

shiftExpr
    : addExpr ((JS_LSH | JS_RSH | JS_URSH) addExpr)*
    ;

addExpr
    : mulExpr ((JS_PLUS | JS_MINUS) mulExpr)*
    ;

mulExpr
    : expExpr ((JS_STAR | JS_SLASH | JS_PERCENT) expExpr)*
    ;

expExpr
    : unaryExpr (JS_EXP unaryExpr)*
    ;

unaryExpr
    : (JS_BANG | JS_MINUS | JS_PLUS | JS_INC | JS_DEC | JS_TYPEOF | JS_DELETE) unaryExpr
    | postfixExpr
    ;

postfixExpr
    : callExpr (JS_INC | JS_DEC)?
    ;

callExpr
    : memberExpr callSuffix*
    ;

callSuffix
    : JS_LPAREN argumentList? JS_RPAREN   # callArgs
    | JS_DOT JS_IDENTIFIER                # memberAccess
    | JS_LBRACK expression JS_RBRACK      # computedAccess
    ;

memberExpr
    : primaryExpr
    | JS_NEW memberExpr JS_LPAREN argumentList? JS_RPAREN
    ;

argumentList
    : expression (JS_COMMA expression)*
    ;

primaryExpr
    : JS_IDENTIFIER
    | literal
    | arrayLiteral
    | objectLiteral
    | arrowFunction
    | JS_THIS
    | JS_LPAREN expression JS_RPAREN
    | domExpression
    | consoleExpression
    ;

literal
    : JS_NUMBER
    | JS_STRING
    | JS_TRUE
    | JS_FALSE
    | JS_NULL
    | JS_UNDEFINED
    | JS_NAN
    | JS_INFINITY
    ;

arrayLiteral
    : JS_LBRACK (expression (JS_COMMA expression)*)? JS_RBRACK
    ;

objectLiteral
    : JS_LBRACE (objectProperty (JS_COMMA objectProperty)*)? JS_RBRACE
    ;

objectProperty
    : (JS_IDENTIFIER | JS_STRING) JS_COLON expression
    | JS_SPREAD expression
    ;

arrowFunction
    : arrowParams JS_ARROW (expression | jsBody)
    ;

arrowParams
    : JS_IDENTIFIER
    | JS_LPAREN parameterList? JS_RPAREN
    ;

// ---- DOM helpers ----

domExpression
    : JS_DOCUMENT JS_DOT domMethod
    | JS_WINDOW   JS_DOT JS_IDENTIFIER
    ;

domMethod
    : JS_GET_ELEMENT  JS_LPAREN expression JS_RPAREN
    | JS_GET_ELEMENTS JS_LPAREN expression JS_RPAREN
    | JS_CREATE_EL    JS_LPAREN expression JS_RPAREN
    ;

consoleExpression
    : JS_CONSOLE JS_DOT JS_LOG JS_LPAREN argumentList? JS_RPAREN
    ;
