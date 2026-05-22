lexer grammar JavascriptLexer;

options {
    superClass = ArabicLexerBase;
}
// VARIABLE DECLARATIONS
VAR   : 'متغير' ;
LET   : 'لنفرض' ;
CONST : 'ثابت' ;

// DATA TYPE KEYWORDS (Type Checking & Definitions)

ARRAY_KW   : 'مصفوفة' ;
STRING_KW  : 'سلسلة' ;
NUMBER_KW  : 'عدد' ;
BOOLEAN_KW : 'منطقي' ;
SYMBOL_KW  : 'رمز' ;
MAP_KW     : 'خريطة' ;
SET_KW     : 'مجموعة' ;
DATE_KW    : 'تاريخ' ;
OBJECT_KW  : 'كائن' ;

// CONTROL FLOW & CONDITIONALS

IF      : 'إذا' | 'اذا' ;
ELSE    : 'إلا' | 'وإلا' | 'والا' ;
SWITCH  : 'اختبر' ;
CASE    : 'حالة' ;
DEFAULT : 'بشكل افتراضي' ;

// LOOPS & ITERATION

FOR      : 'لأجل' | 'لكل' ;
WHILE    : 'طالما' ;
DO       : 'نفذ' ;
BREAK    : 'إيقاف' ;
CONTINUE : 'تخطى ثم تابع' ;

/* DIFFERENCE BETWEEN 'OF' AND 'IN':
  - OF ('في'): Used in (for...of) loops to iterate over iterable values (Arrays, Strings, Maps).
  - IN ('ضمن'): Used in (for...in) loops to iterate over object keys/properties, or check property existence.
*/
OF       : 'في' ;
IN       : 'ضمن' ;

// FUNCTIONS & VALUE RETURNS

FUNCTION : 'دالة' ;
RETURN   : 'أرجع' | 'ارجع' ;

// LOGICAL CONSTANTS & OBJECT REFERENCE
TRUE      : 'صحيح' ;
FALSE     : 'خاطئ' ;
NULL      : 'غير_موجود' ;
UNDEFINED : 'غير_معرف' ;
THIS      : 'هذا' ;
NAN       : 'ليس_رقم' ;
INFINITY  : 'لانهاية' ;

// EXCEPTION HANDLING

TRY       : 'حاول' ;
CATCH     : 'امسك' ;
FINALLY   : 'أخيرا' | 'اخيرا' ;
THROW     : 'اطلق' | 'أطلق' ;
EXCEPTION : 'استثناء' ;

// OBJECT ORIENTED PROGRAMING (OOP)

NEW         : 'عنصر جديد' ;
CLASS       : 'فئة' | 'صف' ;
EXTENDS     : 'يرث_من' ;
SUPER       : 'الاب' ;
IMPLEMENTS  : 'يطبق' ;
INTERFACE   : 'واجهة' ;
CONSTRUCTOR : 'منشئ' ;
PRIVATE     : 'خاص' ;
PROTECTED   : 'محمي' ;
PUBLIC      : 'عام' ;
STATIC      : 'صف_ثابت' ;
ENUM        : 'تعداد' ;
PACKAGE     : 'حزمة' ;

// MODULES & METADATA

IMPORT     : 'استورد' ;
EXPORT     : 'تصدير' ;
FROM       : 'من' ;
AS         : 'كـ' | 'كما' ;
TYPEOF     : 'من_نوع' ;
INSTANCEOF : 'عنصر_من' ;
DELETE     : 'احذف' ;

// GLOBAL BROWSER OBJECTS & DOM METHODS

DOCUMENT        : 'الوثيقة' ;
WINDOW          : 'النافذة' ;
CONSOLE         : 'المراقب' ;
EVENT           : 'حدث' ;
NODE            : 'عقدة' ;
ELEMENT         : 'عنصر' ;
LISTENER        : 'مستمع' ;
LOCAL_STORAGE   : 'تخزين_محلي' ;
SESSION_STORAGE : 'تخزين_جلسة' ;

GET_ELEMENT     : 'احضرعنصر' ;
GET_ELEMENTS    : 'احضرعناصر' ;
CREATE_EL       : 'انشئ_عنصر' ;
INNER_TEXT      : 'النص_الداخلي' ;
INNER_HTML      : 'كود_html' ;
STYLE           : 'التنسيق' ;

// EVENTS, LISTENERS & DEV TOOLS

ADD_LISTENER    : 'عند_الحدث' | 'استمع_للحدث' ;
ON_CLICK        : 'عند_النقر' ;
ON_SUBMIT       : 'عند_الإرسال' ;
ON_CHANGE       : 'عند_التغيير' ;
ON_LOAD         : 'عند_التحميل' ;
LOG             : 'اطبع' ;
ALERT           : 'تنبيه' ;
PROMPT          : 'ادخل' ;

// OPERATORS & PUNCTUATION

// --- 1. ARITHMETIC OPERATORS (non-conflicting only) ---
INC          : '++' ;
DEC          : '--' ;
EXP          : '**' ;


// --- 2. ASSIGNMENT OPERATORS ---
EXP_ASSIGN   : '**=' ;
ADD_ASSIGN   : '+=' ;
SUB_ASSIGN   : '-=' ;
MUL_ASSIGN   : '*=' ;
DIV_ASSIGN   : '/=' ;
MOD_ASSIGN   : '%=' ;
AND_ASSIGN   : '&&=' ;
OR_ASSIGN    : '||=' ;
NULL_ASSIGN  : '??=' ;
ASSIGN       : '=' ;

// --- 3. COMPARISON OPERATORS ---
STREQ        : '===' ;
STRNEQ       : '!==' ;
EQ           : '==' ;
NEQ          : '!=' ;
GTE          : '>=' ;
LTE          : '<=' ;


// --- 4. LOGICAL OPERATORS ---
AND          : '&&' ;
OR           : '||' ;
NULL_COAL    : '??' ;

// --- 5. BITWISE OPERATORS ---
URSH         : '>>>' ;
LSH          : '<<' ;
RSH          : '>>' ;
BIT_AND      : '&' ;
BIT_OR       : '|' ;
BIT_XOR      : '^' ;


// --- 6. CONDITIONAL & MISCELLANEOUS OPERATORS ---
QUESTION     : '?' ;
ARROW        : '=>' ;
SPREAD       : '...' ;

// LITERALS & IDENTIFIERS

DIGITAL : ([0-9] | [\u0660-\u0669])+ ('.' ([0-9] | [\u0660-\u0669])+)? ;

STRING_LITERAL
    : '"' (~["\r\n])* '"'
    | '\'' (~['\r\n])* '\''
    ;

IDENTIFIER
    : [\u0621-\u064A_a-zA-Z$] [\u0621-\u064A\u0660-\u0669a-zA-Z0-9_$]*
    ;
