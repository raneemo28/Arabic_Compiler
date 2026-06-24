lexer grammar ArabicHtmlLexer;

options {
    superClass = ArabicLexerBase;
}

fragment ARABIC_CHAR : [\u0621-\u064A] ;
fragment ARABIC_WORD : ARABIC_CHAR (ARABIC_CHAR | [0-9] | '-' )* ;
// ============================================================
// ============= HTML KEYWORDS =============
// ============================================================

CLOSE_TAG  : '</' ARABIC_WORD '>' ;
OPEN_TAG_START : '<' ARABIC_WORD ;
SELF_CLOSE_END : '/>' ;


ATTR_ID    : 'معرف' ;
ATTR_CLASS : 'صنف' ;
ATTR_SRC   : 'مصدر' ;
ATTR_HREF  : 'وجهة' ;
// ============================================================
// ============= CSS KEYWORDS =============
// ============================================================

// --- Layout & Box Model ---
CSS_DISPLAY       : 'عرض' ;
CSS_POSITION      : 'موقع' ;
CSS_WIDTH         : 'عرض-المساحة' ;
CSS_HEIGHT        : 'طول-المساحة' ;
CSS_MAX_WIDTH     : 'اقصى-عرض' ;
CSS_MIN_WIDTH     : 'اقل-عرض' ;
CSS_MAX_HEIGHT    : 'اقصى-طول' ;
CSS_MIN_HEIGHT    : 'اقل-طول' ;
CSS_MARGIN        : 'هامش' ;
CSS_PADDING       : 'حشو' ;
CSS_BORDER        : 'اطار' ;
CSS_VISIBILITY    : 'الظهور' ;
CSS_OVERFLOW      : 'فائض' ;
CSS_Z_INDEX       : 'ترتيب-العمق' ;
CSS_BOX_SIZING    : 'تحجيم-الصندوق' ;

// --- Flexbox & Grid ---
CSS_FLEX          : 'مرن' ;
CSS_FLEX_DIR      : 'اتجاه-المرونة' ;
CSS_FLEX_WRAP     : 'لف-المرونة' ;
CSS_FLEX_GROW     : 'نمو-المرونة' ;
CSS_FLEX_SHRINK   : 'انكماش-المرونة' ;
CSS_GRID          : 'شبكة' ;
CSS_GRID_TEMPLATE : 'قالب-الشبكة' ;
CSS_GAP           : 'فجوة' ;
CSS_JUSTIFY_CONT  : 'ضبط-المحتوى' ;
CSS_ALIGN_ITEMS   : 'محاذاة-العناصر' ;
CSS_ALIGN_SELF    : 'محاذاة-ذاتية' ;
CSS_ORDER         : 'ترتيب' ;

// --- Colors & Backgrounds ---
CSS_COLOR         : 'لون' ;
CSS_BACKGROUND    : 'خلفية' ;
CSS_BG_IMAGE      : 'صورة-الخلفية' ;
CSS_BG_COLOR      : 'لون-الخلفية' ;
CSS_BG_SIZE       : 'حجم-الخلفية' ;
CSS_BG_REPEAT     : 'تكرار-الخلفية' ;
CSS_BG_ATTACH     : 'تثبيت-الخلفية' ;
CSS_BG_CLIP       : 'قص-الخلفية' ;
CSS_OPACITY       : 'شفافية' ;
CSS_BOX_SHADOW    : 'ظل-الصندوق' ;

// --- Text & Typography ---
CSS_FONT_FAMILY    : 'نوع-الخط' ;
CSS_FONT_SIZE      : 'حجم-الخط' ;
CSS_FONT_WEIGHT    : 'ثقل-الخط' ;
CSS_FONT_STYLE     : 'نمط-الخط' ;
CSS_TEXT_ALIGN     : 'محاذاة-النص' ;
CSS_TEXT_DECOR     : 'زخرفة-النص' ;
CSS_TEXT_TRANS     : 'تحويل-النص' ;
CSS_TEXT_SHADOW    : 'ظل-النص' ;
CSS_TEXT_INDENT    : 'ازاحة-النص' ;
CSS_LINE_HEIGHT    : 'ارتفاع-السطر' ;
CSS_LETTER_SPACING : 'تباعد-الاحرف' ;
CSS_WORD_SPACING   : 'تباعد-الكلمات' ;
CSS_WHITE_SPACE    : 'المساحة-البيضاء' ;
CSS_DIRECTION      : 'اتجاه-الكتابة' ;
CSS_WRITING_MODE   : 'نمط-الكتابة' ;

// --- Borders & Outlines ---
CSS_BORDER_RADIUS  : 'انحناء-الاطار' ;
CSS_BORDER_WIDTH   : 'سمك-الاطار' ;
CSS_BORDER_STYLE   : 'نمط-الاطار' ;
CSS_BORDER_COLOR   : 'لون-الاطار' ;
CSS_OUTLINE        : 'خط-خارجي' ;

// --- Positioning ---
CSS_TOP    : 'اعلى' ;
CSS_BOTTOM : 'اسفل' ;
CSS_RIGHT  : 'يمين' ;
CSS_LEFT   : 'يسار' ;

// --- At-Rules ---
CSS_MEDIA  : '@وسائط' ;

// --- Tables & Lists ---
CSS_LIST_STYLE      : 'نمط-القائمة' ;
CSS_BORDER_COLLAPSE : 'دمج-الحدود' ;
CSS_TABLE_LAYOUT    : 'تنسيق-الجدول' ;
CSS_CAPTION_SIDE    : 'مكان-العنوان' ;

// --- Visual Effects ---
CSS_FILTER        : 'مرشح' ;
CSS_BACKDROP_FILT : 'مرشح-الخلفية' ;

// --- Pseudo-classes & Pseudo-elements ---
CSS_HOVER       : 'حوم' ;
CSS_ACTIVE      : 'نشط' ;
CSS_FOCUS       : 'تركيز' ;
CSS_VISITED     : 'تم-زيارته' ;
CSS_ENABLED     : 'مفعل' ;
CSS_DISABLED    : 'معطل' ;
CSS_CHECKED     : 'محدد' ;
CSS_BEFORE      : 'قبل' ;
CSS_AFTER       : 'بعد' ;
CSS_PLACEHOLDER : 'نص-مؤقت' ;
CSS_SELECTION   : 'تحديد' ;

// --- Value Keywords ---
CSS_INHERIT : 'وراثة' ;
CSS_INITIAL : 'اولي' ;
CSS_UNSET      : 'غير-محدد' ;
CSS_NONE       : 'لا-شيء' ;
CSS_AUTO       : 'تلقائي' ;
CSS_CENTER     : 'مركز' ;
CSS_SOLID      : 'متصل' ;
CSS_DASHED     : 'مقطع' ;
CSS_DOTTED     : 'منقط' ;
CSS_DOUBLE     : 'مزدوج' ;
CSS_HIDDEN     : 'مخفي' ;
CSS_BLOCK      : 'كتلة' ;
CSS_INLINE     : 'سطري' ;
CSS_FLEX_VALUE : 'مرونة' ;
CSS_ABSOLUTE   : 'مطلق' ;
CSS_RELATIVE   : 'نسبي' ;
CSS_FIXED      : 'مثبت' ;
CSS_STICKY     : 'لاصق' ;
CSS_ROW        : 'سطر' ;
CSS_COLUMN     : 'عمود' ;
CSS_WRAP       : 'لف' ;
CSS_POINTER    : 'مؤشر' ;
CSS_BOLD       : 'عريض' ;
CSS_ITALIC     : 'مائل' ;
CSS_IMPORTANT  : 'هام' ;

// --- Functions ---
CSS_URL_FUNC    : 'رابط' ;
CSS_RGB_FUNC    : 'نظام-ر-ج-ب' ;
CSS_RGBA_FUNC   : 'نظام-ر-ج-ب-ا' ;
CSS_CALC_FUNC   : 'حساب' ;
CSS_VAR_FUNC    : 'دالة-متغير' ;
CSS_ROTATE_FUNC : 'تدوير' ;
CSS_SCALE_FUNC  : 'تكبير' ;
CSS_BLUR_FUNC   : 'تغبيش' ;


// ============================================================
// ============= TS KEYWORDS ==============
// ============================================================

// --- Variable Declarations ---
TS_VAR   : 'متغير' ;
TS_LET   : 'دع' ; //
TS_CONST : 'ثابت' ;

// --- Data Types ---
// --- Primitive Types ---
TS_ANY_KW  : 'اي' ;
TS_BIGINT_KW  : 'رقم-كبير' ;
TS_ARRAY_KW   : 'مصفوفة' ;
TS_STRING_KW  : 'سلسلة' ;
TS_NUMBER_KW  : 'عدد' ;
TS_BOOLEAN_KW : 'منطقي' ;
// TS_SYMBOL_KW  : 'رمز' ;
TS_MAP_KW     : 'خريطة' ;
TS_SET_KW     : 'مجموعة' ;
TS_DATE_KW    : 'تاريخ' ;
TS_OBJECT_KW  : 'كائن' ;

// --- Control Flow ---
TS_IF      : 'اذا' ;
TS_ELSE    : 'الا' | 'والا';
TS_SWITCH  : 'اختبر' ;
TS_CASE    : 'حالة' ;
TS_DEFAULT : 'بشكل-افتراضي' ;

// --- Loops ---
TS_FOR      : 'حلقة' ;//تم تغييرها
TS_WHILE    : 'طالما' ;
TS_DO       : 'نفذ' ;
TS_BREAK    : 'ايقاف' ;
TS_CONTINUE : 'تجاوز' ; //تم تغييرها
TS_OF       : 'في' ;
TS_IN       : 'ضمن' ;

// --- Functions ---
TS_FUNCTION : 'دالة' ;
TS_RETURN   : 'ارجع' ; // لازم احذف الهمزة
// --- Logical Constants ---
TS_TRUE      : 'صحيح' ;
TS_FALSE     : 'خاطئ' ;
TS_NULL      : 'غير-موجود' ;
TS_UNDEFINED : 'غير-معرف' ;
TS_THIS      : 'هذا' ;
TS_NAN       : 'ليس-رقم' ;
TS_INFINITY  : 'لانهاية' ;

// --- Exception Handling ---
TS_TRY       : 'حاول' ;
TS_CATCH     : 'امسك' ;
TS_FINALLY   : 'اخيرا' ; // لازم احذف الهمزة
TS_THROW     : 'اطلق' ; // لازم احذف الهمزة
TS_EXCEPTION : 'استثناء' ;

// --- OOP ---
TS_NEW         : 'عنصر-جديد' ;
TS_CLASS       : 'فئة' | 'صف' ;
TS_EXTENDS     : 'يرث-من' ;
TS_SUPER       : 'الاب' ;
TS_IMPLEMENTS  : 'يطبق' ;
TS_INTERFACE   : 'واجهة' ;
TS_CONSTRUCTOR : 'منشئ' ;
TS_PRIVATE     : 'خاص' ;
TS_PROTECTED   : 'محمي' ;
TS_PUBLIC      : 'عام' ;
TS_STATIC      : 'صف-ثابت' ;
TS_ENUM        : 'تعداد' ;
TS_PACKAGE     : 'حزمة' ;

// --- Modules ---
TS_IMPORT     : 'استورد' ;
TS_EXPORT     : 'تصدير' ;
TS_FROM       : 'من' ;
TS_AS         :  'كما' ; // لازم احذف المد بالتانية
TS_TYPEOF     : 'من-نوع' ;
TS_INSTANCEOF : 'عنصر-من' ;
TS_DELETE     : 'احذف' ;

// --- DOM ---
TS_DOCUMENT        : 'الوثيقة' ;
TS_WINDOW          : 'النافذة' ;
TS_CONSOLE         : 'المراقب' ;
TS_EVENT           : 'حدث' ;
TS_NODE            : 'عقدة' ;
TS_ELEMENT         : 'عنصر' ;
TS_LISTENER        : 'مستمع' ;
TS_LOCAL_STORAGE   : 'تخزين-محلي' ;
TS_SESSION_STORAGE : 'تخزين-جلسة' ;
TS_GET_ELEMENT     : 'احضرعنصر' ;
TS_GET_ELEMENTS    : 'احضرعناصر' ;
TS_CREATE_EL       : 'انشئ-عنصر' ;
TS_INNER_TEXT      : 'النص-الداخلي' ;
TS_INNER_HTML      : 'كود-html' ;
TS_STYLE           : 'التنسيق' ;

// --- Events & Dev Tools ---
TS_ADD_LISTENER : 'عند-الحدث' | 'استمع-للحدث' ;
TS_ON_CLICK     : 'عند-النقر' ;
TS_ON_SUBMIT    : 'عند-الارسال' ;
TS_ON_CHANGE    : 'عند-التغيير' ;
TS_ON_LOAD      : 'عند-التحميل' ;
TS_LOG          : 'اطبع' ;
TS_ALERT        : 'تنبيه' ;
TS_PROMPT       : 'ادخل' ;


// ============================================================
// ================ GENERAL IDENTIFIER ========================
// ============================================================
IDENTIFIER
    : [\u0621-\u064A] ([\u0621-\u064A] | [0-9] | [$_-])*
    ;


// ============================================================
// =================== NUMBERS & UNITS ========================
// ============================================================

// Arabic-Indic digit fragment (٠١٢٣٤٥٦٧٨٩)
fragment ARABIC_DIGIT : [\u0660-\u0669] ;
fragment ANY_DIGIT    : [0-9] | ARABIC_DIGIT ;

CSS_UNIT
    : ANY_DIGIT+ ('.' ANY_DIGIT+)?
      ('بكسل' | '%' | 'ثانية' | 'ملي-ثانية' | 'درجة' | 'em' | 'rem' | 'vh' | 'vw')
    ;

NUMBER
    : ANY_DIGIT+ ('.' ANY_DIGIT+)?
    ;

// ============================================================
// =================== HEX COLOR (before HASH) ================
// ============================================================
CSS_HEX_COLOR
    : '#' ( [a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9]
           | [a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9]
           | [a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9]
           | [a-fA-F0-9][a-fA-F0-9][a-fA-F0-9]
           )
    ;


// ============================================================
// =================== OPERATORS & PUNCTUATION ================
// ============================================================


TS_INC        : '++' ;
TS_DEC        : '--' ;
TS_EXP_ASSIGN : '**=' ;      
TS_EXP        : '**' ;       
TS_ADD_ASSIGN : '+=' ;
TS_SUB_ASSIGN : '-=' ;
TS_MUL_ASSIGN : '*=' ;
TS_DIV_ASSIGN : '/=' ;
TS_MOD_ASSIGN : '%=' ;
TS_AND_ASSIGN : '&&=' ;
TS_OR_ASSIGN  : '||=' ;
TS_NULL_ASSIGN: '??=' ;
TS_SPREAD     : '...' ;      
TS_ARROW      : '=>' ;       
TS_STREQ      : '===' ;      
TS_STRNEQ     : '!==' ;      
TS_EQ         : '==' ;      
TS_NEQ        : '!=' ;       
TS_GTE        : '>=' ;       
TS_LTE        : '<=' ;       
TS_AND        : '&&' ;
TS_OR         : '||' ;
TS_NULL_COAL  : '??' ;
TS_URSH       : '>>>' ;      
TS_RSH        : '>>' ;       
TS_LSH        : '<<' ;       
TS_ASSIGN     : '=' ;
TS_BIT_AND    : '&' ;
TS_BIT_OR     : '|' ;
TS_BIT_XOR    : '^' ;
TS_QUESTION   : '?' ;

// Single-character operators / punctuation
LBRACE    : '{' ;
RBRACE    : '}' ;
COLON     : ':' ;
SEMI      : '؛' ;
COMMA     : '،' ;
DOT       : '.' ;
HASH      : '#' ;
LPAREN    : '(' ;
RPAREN    : ')' ;
TILDE     : '~' ;
DBL_COLON : '::' ;
LBRACK    : '[' ;
RBRACK    : ']' ;
PLUS      : '+' ;
MINUS     : '-' ;
STAR      : '*' ;
SLASH     : '/' ;
PERCENT   : '%' ;
LT        : '<' ;
GT        : '>' ;
BANG      : '!' ;


// ============================================================
// =================== SKIPPED TOKENS =========================
// ============================================================

WS            : [ \t\r\n]+  -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT  : '//' ~[\r\n]* -> skip ;

STRING
    : '"'  (~["\r\n])* '"'
    | '\'' (~['\r\n])* '\''
    ;


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
    
htmlElement
    : OPEN_TAG_START attribute* GT htmlContent CLOSE_TAG   # parentElement
    | OPEN_TAG_START attribute* SELF_CLOSE_END             # selfClosingElement
    ;

htmlContent
    : (htmlElement | tsStatement | cssRule | text)* 
    ;

text
    : STRING 
    | IDENTIFIER 
    | NUMBER 
    | MINUS
    | TS_ASSIGN
    | PERCENT
    | arabicKeyword 
    ;

arabicKeyword
    : TS_IF | TS_ELSE 
    | TS_FOR | TS_WHILE | TS_FUNCTION | TS_RETURN
    | TS_OF | TS_IN | TS_VAR | TS_LET 
    | TS_CONST | TS_TRUE | TS_FALSE 
    | CSS_DISPLAY | CSS_MARGIN | CSS_PADDING | CSS_CENTER 
    | CSS_BLOCK | TS_NUMBER_KW
    ;

// --- CSS Rules ---
cssRule
    : selector LBRACE declarationList RBRACE 
    ;

selector
    : identifier pseudoClass?
    | HASH identifier pseudoClass?
    | DOT identifier pseudoClass?
    | CSS_MEDIA identifier
    ;

pseudoClass
    : COLON (CSS_HOVER | CSS_ACTIVE | CSS_FOCUS | CSS_VISITED | CSS_ENABLED
            | CSS_DISABLED | CSS_CHECKED | CSS_BEFORE | CSS_AFTER
            | CSS_PLACEHOLDER | CSS_SELECTION)
    ;

// FIXED: Allow empty blocks like { }
declarationList
    : (declaration (SEMI declaration)*)? SEMI?
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
    | CSS_TOP | CSS_BOTTOM | CSS_RIGHT | CSS_LEFT // FIXED: Added missing positioning properties
    ;

cssValue
    : cssValueToken+ 
    ;

cssValueToken
    : IDENTIFIER | NUMBER | CSS_UNIT | CSS_HEX_COLOR | STRING 
    | CSS_INHERIT | CSS_INITIAL | CSS_UNSET | CSS_NONE | CSS_AUTO | CSS_CENTER 
    | CSS_SOLID | CSS_DASHED | CSS_DOTTED | CSS_DOUBLE | CSS_HIDDEN | CSS_BLOCK
    | CSS_INLINE | CSS_FLEX_VALUE | CSS_ABSOLUTE | CSS_RELATIVE | CSS_FIXED 
    | CSS_STICKY | CSS_ROW | CSS_COLUMN | CSS_WRAP | CSS_BOLD | CSS_ITALIC 
    | CSS_FLEX | CSS_GRID
    | CSS_RIGHT | CSS_LEFT | CSS_TOP | CSS_BOTTOM
    | CSS_POINTER
    | cssFunction 
    ;

// FIXED: Changed 'expression' to 'cssValue' so it accepts units like 5بكسل
cssFunction
    : (CSS_URL_FUNC | CSS_RGB_FUNC | CSS_RGBA_FUNC | CSS_CALC_FUNC | CSS_VAR_FUNC | CSS_ROTATE_FUNC | CSS_SCALE_FUNC | CSS_BLUR_FUNC) 
      LPAREN (cssValue (COMMA cssValue)*)? RPAREN
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
    | interfaceDeclaration // FIXED: Added interface support
    ;

// FIXED: New rule to handle 'واجهة { }'
interfaceDeclaration
    : TS_INTERFACE IDENTIFIER LBRACE interfaceMember* RBRACE
    ;

interfaceMember
    : IDENTIFIER COLON tsType SEMI
    ;

variableDeclaration
    : (TS_VAR | TS_LET | TS_CONST) identifier COLON tsType (TS_ASSIGN expression)?  SEMI
    ;
    
tsDeclaration
    : (TS_VAR | TS_LET | TS_CONST) 
      (
        identifier COLON tsType LBRACK RBRACK (TS_ASSIGN arrayLiteral)? 
        | identifier COLON tsType (TS_ASSIGN expression)?                            
        | identifier TS_ASSIGN expression
      ) 
      SEMI
    ;

block
    : LBRACE tsStatement* RBRACE 
    ;

assignmentStatement
    : identifier (TS_ASSIGN | TS_ADD_ASSIGN | TS_SUB_ASSIGN | TS_MUL_ASSIGN | TS_DIV_ASSIGN) expression SEMI 
    ;

ifStatement
    : TS_IF LPAREN expression RPAREN tsStatement (TS_ELSE tsStatement)? 
    ;

forLoop
    : TS_FOR LPAREN ((variableDeclaration | assignmentExpression) expression SEMI expression) RPAREN block
    ;
    
// FIXED: Changed IDENTIFIER to identifier to allow 'عنصر' as a loop variable
arrayLoop
    : TS_FOR LPAREN TS_CONST identifier (TS_OF|TS_IN) expression RPAREN block 
    ;

whileLoop
    : TS_WHILE LPAREN expression RPAREN block 
    ;

functionDeclaration
    : TS_FUNCTION identifier LPAREN parameterList? RPAREN block 
    ;

parameterList
    : IDENTIFIER (COLON tsType)? (COMMA IDENTIFIER (COLON tsType)?)*
    ;

returnStatement
    : TS_RETURN expression? SEMI 
    ;

tryCatchStatement
    : TS_TRY block TS_CATCH LPAREN identifier RPAREN block (TS_FINALLY block)? 
    ;

expressionStatement
    : expression SEMI 
    ;

// FIXED: Added TS_LOG so 'اطبع(...)' works without 'المراقب.'
builtInCall
    : (TS_CONSOLE DOT TS_LOG | TS_LOG | TS_ALERT | TS_PROMPT) LPAREN (expression (COMMA expression)*)? RPAREN SEMI 
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

memberExpression
    : primaryExpression (
        LPAREN (expression (COMMA expression)*)? RPAREN 
        | DOT (IDENTIFIER | TS_LOG | TS_ADD_LISTENER | TS_INNER_TEXT | TS_STYLE
               | TS_GET_ELEMENT | TS_GET_ELEMENTS | TS_CREATE_EL
               | TS_ON_CLICK | TS_ON_SUBMIT | TS_ON_CHANGE | TS_ON_LOAD
               | TS_INNER_HTML | TS_LOCAL_STORAGE | TS_SESSION_STORAGE
               | CSS_COLOR) 
        | LBRACK expression RBRACK 
    )*
    ;

// FIXED: Changed IDENTIFIER to identifier
primaryExpression
    : identifier 
    | NUMBER 
    | STRING 
    | TS_TRUE | TS_FALSE | TS_NULL | TS_UNDEFINED | TS_THIS | TS_NAN 
    | TS_DOCUMENT | TS_WINDOW 
    | LPAREN expression RPAREN 
    | TS_FUNCTION LPAREN parameterList? RPAREN block
    | arrayLiteral
    | objectLiteral
    ;

arrayLiteral
    : LBRACK (expression (COMMA expression)*)? RBRACK 
    ;

objectLiteral
    : LBRACE (identifier COLON expression (COMMA identifier COLON expression)*)? RBRACE 
    ;

// FIXED: New rule to allow keywords (like 'عنصر') to be used as variable names
identifier
    : IDENTIFIER
    | TS_ELEMENT
    | CSS_CALC_FUNC
    ;