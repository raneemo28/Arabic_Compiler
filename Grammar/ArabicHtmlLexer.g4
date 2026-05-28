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
OPEN_TAG   : '<'  ARABIC_WORD '>' ;
SELF_CLOSE : '<'  ARABIC_WORD '/>' ;


// ============================================================
// ============= CSS KEYWORDS =============
// ============================================================

// --- Layout & Box Model ---
CSS_DISPLAY       : 'عرض' ;
CSS_POSITION      : 'موقع' ;
CSS_WIDTH         : 'عرض-المساحة' ;
CSS_HEIGHT        : 'طول-المساحة' ;
CSS_MAX_WIDTH     : 'أقصى-عرض' ;
CSS_MIN_WIDTH     : 'أقل-عرض' ;
CSS_MAX_HEIGHT    : 'أقصى-طول' ;
CSS_MIN_HEIGHT    : 'أقل-طول' ;
CSS_MARGIN        : 'هامش' ;
CSS_PADDING       : 'حشو' ;
CSS_BORDER        : 'إطار' ;
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
CSS_TEXT_INDENT    : 'إزاحة-النص' ;
CSS_LINE_HEIGHT    : 'ارتفاع-السطر' ;
CSS_LETTER_SPACING : 'تباعد-الأحرف' ;
CSS_WORD_SPACING   : 'تباعد-الكلمات' ;
CSS_WHITE_SPACE    : 'المساحة-البيضاء' ;
CSS_DIRECTION      : 'اتجاه-الكتابة' ;
CSS_WRITING_MODE   : 'نمط-الكتابة' ;

// --- Borders & Outlines ---
CSS_BORDER_RADIUS  : 'انحناء-الإطار' ;
CSS_BORDER_WIDTH   : 'سمك-الإطار' ;
CSS_BORDER_STYLE   : 'نمط-الإطار' ;
CSS_BORDER_COLOR   : 'لون-الإطار' ;
CSS_OUTLINE        : 'خط-خارجي' ;

// --- Positioning ---
CSS_TOP    : 'أعلى' ;
CSS_BOTTOM : 'أسفل' ;
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
CSS_INITIAL : 'أولي' ;
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
// ============= JS KEYWORDS ==============
// ============================================================

// --- Variable Declarations ---
JS_VAR   : 'متغير' ;
JS_LET   : 'لنفرض' ;
JS_CONST : 'ثابت' ;

// --- Data Types ---
JS_ARRAY_KW   : 'مصفوفة' ;
JS_STRING_KW  : 'سلسلة' ;
JS_NUMBER_KW  : 'عدد' ;
JS_BOOLEAN_KW : 'منطقي' ;
JS_SYMBOL_KW  : 'رمز' ;
JS_MAP_KW     : 'خريطة' ;
JS_SET_KW     : 'مجموعة' ;
JS_DATE_KW    : 'تاريخ' ;
JS_OBJECT_KW  : 'كائن' ;

// --- Control Flow ---
JS_IF      : 'إذا' | 'اذا' ;
JS_ELSE    : 'إلا' | 'وإلا' | 'والا' ;
JS_SWITCH  : 'اختبر' ;
JS_CASE    : 'حالة' ;
JS_DEFAULT : 'بشكل-افتراضي' ;

// --- Loops ---
JS_FOR      : 'لأجل' | 'لكل' ;
JS_WHILE    : 'طالما' ;
JS_DO       : 'نفذ' ;
JS_BREAK    : 'إيقاف' ;
JS_CONTINUE : 'تخطى-ثم-تابع' ;
JS_OF       : 'في' ;
JS_IN       : 'ضمن' ;

// --- Functions ---
JS_FUNCTION : 'دالة' ;
JS_RETURN   : 'أرجع' | 'ارجع' ;

// --- Logical Constants ---
JS_TRUE      : 'صحيح' ;
JS_FALSE     : 'خاطئ' ;
JS_NULL      : 'غير_موجود' ;
JS_UNDEFINED : 'غير_معرف' ;
JS_THIS      : 'هذا' ;
JS_NAN       : 'ليس_رقم' ;
JS_INFINITY  : 'لانهاية' ;

// --- Exception Handling ---
JS_TRY       : 'حاول' ;
JS_CATCH     : 'امسك' ;
JS_FINALLY   : 'أخيرا' | 'اخيرا' ;
JS_THROW     : 'اطلق' | 'أطلق' ;
JS_EXCEPTION : 'استثناء' ;

// --- OOP ---
JS_NEW         : 'عنصر-جديد' ;
JS_CLASS       : 'فئة' | 'صف' ;
JS_EXTENDS     : 'يرث_من' ;
JS_SUPER       : 'الاب' ;
JS_IMPLEMENTS  : 'يطبق' ;
JS_INTERFACE   : 'واجهة' ;
JS_CONSTRUCTOR : 'منشئ' ;
JS_PRIVATE     : 'خاص' ;
JS_PROTECTED   : 'محمي' ;
JS_PUBLIC      : 'عام' ;
JS_STATIC      : 'صف_ثابت' ;
JS_ENUM        : 'تعداد' ;
JS_PACKAGE     : 'حزمة' ;

// --- Modules ---
JS_IMPORT     : 'استورد' ;
JS_EXPORT     : 'تصدير' ;
JS_FROM       : 'من' ;
JS_AS         : 'كـ' | 'كما' ;
JS_TYPEOF     : 'من_نوع' ;
JS_INSTANCEOF : 'عنصر_من' ;
JS_DELETE     : 'احذف' ;

// --- DOM ---
JS_DOCUMENT        : 'الوثيقة' ;
JS_WINDOW          : 'النافذة' ;
JS_CONSOLE         : 'المراقب' ;
JS_EVENT           : 'حدث' ;
JS_NODE            : 'عقدة' ;
JS_ELEMENT         : 'عنصر' ;
JS_LISTENER        : 'مستمع' ;
JS_LOCAL_STORAGE   : 'تخزين_محلي' ;
JS_SESSION_STORAGE : 'تخزين_جلسة' ;
JS_GET_ELEMENT     : 'احضرعنصر' ;
JS_GET_ELEMENTS    : 'احضرعناصر' ;
JS_CREATE_EL       : 'انشئ_عنصر' ;
JS_INNER_TEXT      : 'النص_الداخلي' ;
JS_INNER_HTML      : 'كود_html' ;
JS_STYLE           : 'التنسيق' ;

// --- Events & Dev Tools ---
JS_ADD_LISTENER : 'عند_الحدث' | 'استمع_للحدث' ;
JS_ON_CLICK     : 'عند_النقر' ;
JS_ON_SUBMIT    : 'عند_الإرسال' ;
JS_ON_CHANGE    : 'عند_التغيير' ;
JS_ON_LOAD      : 'عند_التحميل' ;
JS_LOG          : 'اطبع' ;
JS_ALERT        : 'تنبيه' ;
JS_PROMPT       : 'ادخل' ;


// ============================================================
// ================ GENERAL IDENTIFIER ========================
// ============================================================
IDENTIFIER
    : [\u0621-\u064A] ([\u0621-\u064A] | [0-9] | [$_-])*
    ;


// ============================================================
// =================== NUMBERS & UNITS ========================
// ============================================================

CSS_UNIT
    : [0-9]+ ('.' [0-9]+)? ('بكسل' | '%' | 'ثانية' | 'ملي-ثانية' | 'درجة' | 'em' | 'rem' | 'vh' | 'vw')
    ;

NUMBER
    : [0-9]+ ('.' [0-9]+)?
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

JS_INC        : '++' ;
JS_DEC        : '--' ;
JS_EXP_ASSIGN : '**=' ;      
JS_EXP        : '**' ;       
JS_ADD_ASSIGN : '+=' ;
JS_SUB_ASSIGN : '-=' ;
JS_MUL_ASSIGN : '*=' ;
JS_DIV_ASSIGN : '/=' ;
JS_MOD_ASSIGN : '%=' ;
JS_AND_ASSIGN : '&&=' ;
JS_OR_ASSIGN  : '||=' ;
JS_NULL_ASSIGN: '??=' ;
JS_SPREAD     : '...' ;      
JS_ARROW      : '=>' ;       
JS_STREQ      : '===' ;      
JS_STRNEQ     : '!==' ;      
JS_EQ         : '==' ;      
JS_NEQ        : '!=' ;       
JS_GTE        : '>=' ;       
JS_LTE        : '<=' ;       
JS_AND        : '&&' ;
JS_OR         : '||' ;
JS_NULL_COAL  : '??' ;
JS_URSH       : '>>>' ;      
JS_RSH        : '>>' ;       
JS_LSH        : '<<' ;       
JS_ASSIGN     : '=' ;
JS_BIT_AND    : '&' ;
JS_BIT_OR     : '|' ;
JS_BIT_XOR    : '^' ;
JS_QUESTION   : '?' ;

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
