parser grammar ArabicWebParser;
options {
    tokenVocab = ArabicHtmlLexer;
}

document
    : (element|statement)* EOF
    ;

element
    : tagElement
    | TEXT
    ;

tagElement
    : OPEN_TAG element* CLOSE_TAG
    ;
statement
    : ruleset
    | mediaRule
    ;

mediaRule
    : MEDIA mediaQueryList LBRACE ruleset* RBRACE
    ;

mediaQueryList
    : mediaQuery (COMMA mediaQuery)*
    ;

mediaQuery
    : mediaExpr
    | IDENTIFIER (KW_HIDDEN mediaExpr)? 
    ;

mediaExpr
    : LPAREN property COLON value RPAREN
    ;

ruleset
    : selectorList LBRACE declarationList? RBRACE
    ;

selectorList
    : selector (COMMA selector)*
    ;

selector
    : compoundSelector (combinator compoundSelector)*
    ;

combinator
    : GT
    | PLUS
    | TILDE
    ;

compoundSelector
    : (simpleSelector | pseudoElement) (simpleSelector | pseudoClass | pseudoElement)*
    | (pseudoClass | pseudoElement)+
    ;

className : DOT IDENTIFIER ;
idName    : HASH IDENTIFIER ;

simpleSelector
    : IDENTIFIER         
    | idName   
    | className    
    | STAR               
    ;

pseudoClass
    : COLON ( HOVER | ACTIVE | FOCUS | VISITED | ENABLED | DISABLED | CHECKED )
    ;

pseudoElement
    : DBL_COLON ( BEFORE | AFTER | PLACEHOLDER | SELECTION )
    ;

declarationList
    : declaration (SEMI declaration)* SEMI?
    ;

declaration
    : property COLON value exprModifier?
    ;

exprModifier
    : IMPORTANT
    ;

// --- Properties Mapping ---
property
    : DISPLAY | POSITION | WIDTH | HEIGHT | MAX_WIDTH | MIN_WIDTH | MAX_HEIGHT | MIN_HEIGHT 
    | MARGIN | PADDING | BORDER | VISIBILITY | OVERFLOW | Z_INDEX | BOX_SIZING
    | FLEX | FLEX_DIR | FLEX_WRAP | FLEX_GROW | FLEX_SHRINK | GRID | GRID_TEMPLATE | GAP 
    | JUSTIFY_CONT | ALIGN_ITEMS | ALIGN_SELF | ORDER
    | COLOR | BACKGROUND | BG_IMAGE | BG_COLOR | BG_SIZE | BG_REPEAT | BG_ATTACH | BG_CLIP 
    | OPACITY | BOX_SHADOW
    | FONT_FAMILY | FONT_SIZE | FONT_WEIGHT | FONT_STYLE | TEXT_ALIGN | TEXT_DECOR 
    | TEXT_TRANS | TEXT_SHADOW | TEXT_INDENT | LINE_HEIGHT | LETTER_SPACING | WORD_SPACING 
    | WHITE_SPACE | DIRECTION | WRITING_MODE
    | BORDER_RADIUS | BORDER_WIDTH | BORDER_STYLE | BORDER_COLOR | OUTLINE
    | TOP | BOTTOM | RIGHT | LEFT
    | LIST_STYLE | BORDER_COLLAPSE | TABLE_LAYOUT | CAPTION_SIDE
    | FILTER | BACKDROP_FILT
    | IDENTIFIER // Allows for custom properties / CSS variables (--foo)
    ;

value
    : expr (expr)*
    ;

expr
    : term
    | term (PLUS | MINUS | STAR | SLASH | PERCENT) term 
    ;

term
    : dimension
    | keywordValue
    | HEX_COLOR
    | STRING
    | functionCall
    | IDENTIFIER // Fallback for raw string tokens like font family names
    ;

dimension
    : NUMBER UNIT? 
    ;

keywordValue
    : INHERIT | INITIAL | UNSET | NONE | AUTO | CENTER | SOLID | DASHED 
    | DOTTED | DOUBLE | KW_HIDDEN | BLOCK | INLINE | FLEX_VALUE | ABSOLUTE 
    | RELATIVE | FIXED | STICKY | ROW | COLUMN | WRAP | POINTER | BOLD | ITALIC
    ;

// --- Functions ---
functionCall
    : functionName LPAREN arguments RPAREN
    ;

functionName
    : URL_FUNC | RGB_FUNC | RGBA_FUNC | CALC_FUNC | VAR_FUNC | ROTATE_FUNC | SCALE_FUNC | BLUR_FUNC
    ;

arguments
    : expr ( (COMMA)? expr )*
    ;