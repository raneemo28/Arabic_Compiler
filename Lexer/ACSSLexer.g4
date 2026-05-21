lexer grammar ACSSLexer;

options {
    superClass = ArabicLexerBase;
}
// --- Channels ---
WS : [ \t\r\n]+ -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;

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


///////CSS///////

// --- Layout & Box Model ---
DISPLAY       : 'عرض' ;
POSITION      : 'موقع' ;
WIDTH         : 'عرض-المساحة' ;
HEIGHT        : 'طول-المساحة' ;
MAX_WIDTH     : 'أقصى-عرض' ;
MIN_WIDTH     : 'أقل-عرض' ;
MAX_HEIGHT    : 'أقصى-طول' ;
MIN_HEIGHT    : 'أقل-طول' ;
MARGIN        : 'هامش' ;
PADDING       : 'حشو' ;
BORDER        : 'إطار' ;
VISIBILITY    : 'الظهور' ;
OVERFLOW      : 'فائض' ;
Z_INDEX       : 'ترتيب-العمق' ;
BOX_SIZING    : 'تحجيم-الصندوق' ;

// --- Flexbox & Grid ---
FLEX          : 'مرن' ;
FLEX_DIR      : 'اتجاه-المرونة' ;
FLEX_WRAP     : 'لف-المرونة' ;
FLEX_GROW     : 'نمو-المرونة' ;
FLEX_SHRINK   : 'انكماش-المرونة' ;
GRID          : 'شبكة' ;
GRID_TEMPLATE : 'قالب-الشبكة' ;
GAP           : 'فجوة' ;
JUSTIFY_CONT  : 'ضبط-المحتوى' ;
ALIGN_ITEMS   : 'محاذاة-العناصر' ;
ALIGN_SELF    : 'محاذاة-ذاتية' ;
ORDER         : 'ترتيب' ;

// --- Colors & Backgrounds ---
COLOR         : 'لون' ;
BACKGROUND    : 'خلفية' ;
BG_IMAGE      : 'صورة-الخلفية' ;
BG_COLOR      : 'لون-الخلفية' ;
BG_SIZE       : 'حجم-الخلفية' ;
BG_REPEAT     : 'تكرار-الخلفية' ;
BG_ATTACH     : 'تثبيت-الخلفية' ;
BG_CLIP       : 'قص-الخلفية' ;
OPACITY       : 'شفافية' ;
BOX_SHADOW    : 'ظل-الصندوق' ;

// --- Text & Typography ---
FONT_FAMILY   : 'نوع-الخط' ;
FONT_SIZE     : 'حجم-الخط' ;
FONT_WEIGHT   : 'ثقل-الخط' ;
FONT_STYLE    : 'نمط-الخط' ;
TEXT_ALIGN    : 'محاذاة-النص' ;
TEXT_DECOR    : 'زخرفة-النص' ;
TEXT_TRANS    : 'تحويل-النص' ;
TEXT_SHADOW   : 'ظل-النص' ;
TEXT_INDENT   : 'إزاحة-النص' ;
LINE_HEIGHT   : 'ارتفاع-السطر' ;
LETTER_SPACING: 'تباعد-الأحرف' ;
WORD_SPACING  : 'تباعد-الكلمات' ;
WHITE_SPACE   : 'المساحة-البيضاء' ;
DIRECTION     : 'اتجاه-الكتابة' ;
WRITING_MODE  : 'نمط-الكتابة' ;

// --- Borders & Outlines ---
BORDER_RADIUS : 'انحناء-الإطار' ;
BORDER_WIDTH  : 'سمك-الإطار' ;
BORDER_STYLE  : 'نمط-الإطار' ;
BORDER_COLOR  : 'لون-الإطار' ;
OUTLINE       : 'خط-خارجي' ;

// --- Positioning ---
TOP           : 'أعلى' ;
BOTTOM        : 'أسفل' ;
RIGHT         : 'يمين' ;
LEFT          : 'يسار' ;

// --- At-Rules (Directives) ---
MEDIA         : '@وسائط' ;   

// --- Tables & Lists ---
LIST_STYLE    : 'نمط-القائمة' ;
BORDER_COLLAPSE: 'دمج-الحدود' ;
TABLE_LAYOUT  : 'تنسيق-الجدول' ;
CAPTION_SIDE  : 'مكان-العنوان' ;

// --- Visual Effects ---
FILTER        : 'مرشح' ;
BACKDROP_FILT : 'مرشح-الخلفية' ;

// --- Pseudo-classes & Pseudo-elements ---
HOVER         : 'حوم' ;
ACTIVE        : 'نشط' ;
FOCUS         : 'تركيز' ;
VISITED       : 'تم-زيارته' ;
ENABLED       : 'مفعل' ;
DISABLED      : 'معطل' ;
CHECKED       : 'محدد' ;
BEFORE        : 'قبل' ;
AFTER         : 'بعد' ;
PLACEHOLDER   : 'نص-مؤقت' ;
SELECTION     : 'تحديد' ;

// --- Arabic Value Keywords ---
INHERIT       : 'وراثة' ;
INITIAL       : 'أولي' ;
UNSET         : 'غير محدد' ;
NONE          : 'لا-شيء' ;
AUTO          : 'تلقائي' ;
CENTER        : 'مركز' ;
SOLID         : 'متصل' ;
DASHED        : 'مقطع' ;
DOTTED        : 'منقط' ;
DOUBLE        : 'مزدوج' ;
KW_HIDDEN     : 'مخفي' ;
BLOCK         : 'كتلة' ;
INLINE        : 'سطري' ;
FLEX_VALUE    : 'مرونة' ;
ABSOLUTE      : 'مطلق' ;
RELATIVE      : 'نسبي' ;
FIXED         : 'ثابت' ;
STICKY        : 'لاصق' ;
ROW           : 'صف' ;
COLUMN        : 'عمود' ;
WRAP          : 'لف' ;
POINTER       : 'مؤشر' ;
BOLD          : 'عريض' ;
ITALIC        : 'مائل' ;
IMPORTANT     : 'هام' ;

// --- Units & Literals ---
UNIT          : ('بكسل' | '%' | 'ثانية' | 'ملي-ثانية' | 'درجة' | 'em' | 'rem' | 'vh' | 'vw') ;
NUMBER        :  ([0-9] | [\u0660-\u0669])+ ('.' ([0-9] | [\u0660-\u0669])+)? ;
HEX_COLOR     : '#' [a-fA-F0-9] ( [a-fA-F0-9] [a-fA-F0-9] [a-fA-F0-9]? [a-fA-F0-9]? [a-fA-F0-9]? )? ;

// --- Identifiers (Selectors/Classes/IDs) ---
IDENTIFIER    : [\u0621-\u064A] [\u0621-\u064A\u0660-\u06690-9_]* ;
STRING        : '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'' ;

// --- Functions ---
URL_FUNC      : 'رابط' ;
RGB_FUNC      : 'نظام-ر_ج_ب' ;
RGBA_FUNC     : 'نظام-ر_ج_ب_ا' ;
CALC_FUNC     : 'حساب' ;
VAR_FUNC      : 'متغير' ;
ROTATE_FUNC   : 'تدوير' ;
SCALE_FUNC    : 'تكبير' ;
BLUR_FUNC     : 'تغبيش' ;
