lexer grammar ArabicHtmlLexer;

options {
    superClass = ArabicLexerBase;
}

fragment ARABIC_CHAR : [\u0621-\u064A] ;
fragment ARABIC_WORD : ARABIC_CHAR+ ;
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
CSS_RGB_FUNC    : 'نظام-ر_ج_ب' ;
CSS_RGBA_FUNC   : 'نظام-ر_ج_ب_ا' ;
CSS_CALC_FUNC   : 'حساب' ;
CSS_VAR_FUNC    : 'دالة_متغير' ;
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
TS_BIGINT_KW  : 'رقم_كبير' ;
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
TS_NULL      : 'غير_موجود' ;
TS_UNDEFINED : 'غير_معرف' ;
TS_THIS      : 'هذا' ;
TS_NAN       : 'ليس_رقم' ;
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
TS_EXTENDS     : 'يرث_من' ;
TS_SUPER       : 'الاب' ;
TS_IMPLEMENTS  : 'يطبق' ;
TS_INTERFACE   : 'واجهة' ;
TS_CONSTRUCTOR : 'منشئ' ;
TS_PRIVATE     : 'خاص' ;
TS_PROTECTED   : 'محمي' ;
TS_PUBLIC      : 'عام' ;
TS_STATIC      : 'صف_ثابت' ;
TS_ENUM        : 'تعداد' ;
TS_PACKAGE     : 'حزمة' ;

// --- Modules ---
TS_IMPORT     : 'استورد' ;
TS_EXPORT     : 'تصدير' ;
TS_FROM       : 'من' ;
TS_AS         : 'ك' | 'كما' ; // لازم احذف المد بالتانية
TS_TYPEOF     : 'من_نوع' ;
TS_INSTANCEOF : 'عنصر_من' ;
TS_DELETE     : 'احذف' ;

// --- DOM ---
TS_DOCUMENT        : 'الوثيقة' ;
TS_WINDOW          : 'النافذة' ;
TS_CONSOLE         : 'المراقب' ;
TS_EVENT           : 'حدث' ;
TS_NODE            : 'عقدة' ;
TS_ELEMENT         : 'عنصر' ;
TS_LISTENER        : 'مستمع' ;
TS_LOCAL_STORAGE   : 'تخزين_محلي' ;
TS_SESSION_STORAGE : 'تخزين_جلسة' ;
TS_GET_ELEMENT     : 'احضرعنصر' ;
TS_GET_ELEMENTS    : 'احضرعناصر' ;
TS_CREATE_EL       : 'انشئ_عنصر' ;
TS_INNER_TEXT      : 'النص_الداخلي' ;
TS_INNER_HTML      : 'كود_html' ;
TS_STYLE           : 'التنسيق' ;

// --- Events & Dev Tools ---
TS_ADD_LISTENER : 'عند_الحدث' | 'استمع_للحدث' ;
TS_ON_CLICK     : 'عند_النقر' ;
TS_ON_SUBMIT    : 'عند_الارسال' ;
TS_ON_CHANGE    : 'عند_التغيير' ;
TS_ON_LOAD      : 'عند_التحميل' ;
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

