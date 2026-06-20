# semantic/types_system.py
"""
نظام الأنواع (Type System) لمترجم لغتنا العربية.

يعكس هذا الملف الأنواع الخمسة الأساسية المدعومة في Grammar.md ضمن قاعدة tsType:

    tsType : TS_STRING_KW | TS_NUMBER_KW | TS_BOOLEAN_KW | TS_ANY_KW | TS_BIGINT_KW

أي:
    عدد        -> NUMBER  (نستخدمه كنوع رقمي موحّد عدد/عشري، الـ Grammar لا يفرّق بينهما)
    سلسلة      -> STRING
    منطقي      -> BOOLEAN
    اي         -> ANY
    رقم_كبير   -> BIGINT

بالإضافة إلى ما يطلبه المعمل صريحاً:
    - ArrayType   : لتمثيل المصفوفات المكتوبة (مصفوفة<عدد> .. الخ) ودعم
                    التحقق من تطابق نوع العناصر.
    - ErrorType   : النوع "المسموم" (Poison Type) المستخدم لمنع تسلسل أخطاء
                    إضافية بعد وقوع أول خطأ دلالي على عقدة معينة.

نستخدم نمط Singleton للأنواع البسيطة (ثوابت عامة على مستوى الموديول) توفيراً
للذاكرة وتسهيلاً للمقارنة بـ `is` أو `==`.
"""


class Type:
    """الفئة الأساسية لأي نوع بيانات في اللغة."""

    def __eq__(self, other):
        # تطابق اسمي (Nominal): نوعان متطابقان إذا كانا من نفس الفئة تماماً.
        if not isinstance(other, Type):
            return NotImplemented
        return isinstance(other, self.__class__) and isinstance(self, other.__class__)

    def __hash__(self):
        return hash(self.__class__.__name__)

    def __repr__(self):
        return f"<{self.__class__.__name__}>"

    def __str__(self):
        return self.__class__.__name__


# ─────────────────────────────────────────────
#  الأنواع الأساسية الخمسة (Primitive Types)
# ─────────────────────────────────────────────

class NumberType(Type):
    """يقابل الكلمة المفتاحية 'عدد' في الـ Grammar (TS_NUMBER_KW)."""
    def __str__(self):
        return "عدد"


class StringType(Type):
    """يقابل الكلمة المفتاحية 'سلسلة' (TS_STRING_KW)."""
    def __str__(self):
        return "سلسلة"


class BoolType(Type):
    """يقابل الكلمة المفتاحية 'منطقي' (TS_BOOLEAN_KW)."""
    def __str__(self):
        return "منطقي"


class AnyType(Type):
    """
    يقابل الكلمة المفتاحية 'اي' (TS_ANY_KW).

    النوع 'أي' خاص: يتوافق مع أي نوع آخر صراحة وضمنياً (مثل any في
    TypeScript)، لذلك نتعامل معه بشكل خاص داخل is_assignable_from أدناه
    بدلاً من الاعتماد فقط على __eq__.
    """
    def __str__(self):
        return "أي"


class BigIntType(Type):
    """يقابل الكلمة المفتاحية 'رقم_كبير' (TS_BIGINT_KW)."""
    def __str__(self):
        return "رقم_كبير"


# ─────────────────────────────────────────────
#  نوع المصفوفات (Array Type)
# ─────────────────────────────────────────────

class ArrayType(Type):
    """
    يمثل نوع المصفوفة المكتوبة، مثل: مصفوفة<عدد> أو مصفوفة<سلسلة>.

    ArrayType ليس Singleton لأنه parametrized بنوع العناصر (element_type)،
    لذلك نعيد تعريف __eq__/__hash__ بحيث تتطابق مصفوفتان فقط إذا كان
    نوع عناصرهما متطابقاً (Structural على مستوى العنصر، Nominal على باقي
    الأنواع).
    """
    def __init__(self, element_type: Type):
        self.element_type = element_type

    def __eq__(self, other):
        return isinstance(other, ArrayType) and self.element_type == other.element_type

    def __hash__(self):
        return hash(("ArrayType", self.element_type))

    def __repr__(self):
        return f"<ArrayType element={self.element_type!r}>"

    def __str__(self):
        return f"مصفوفة<{self.element_type}>"


# ─────────────────────────────────────────────
#  نوع الخطأ المسموم (Poison Type)
# ─────────────────────────────────────────────

class ErrorType(Type):
    """
    النوع المسموم: يُستخدم عند وجود خطأ دلالي لمنع تكرار رسائل الخطأ
    (Error Poisoning). أي عملية يدخل فيها ERROR_TYPE كأحد طرفيها تُرجع
    ERROR_TYPE بصمت دون طباعة خطأ إضافي.
    """
    def __str__(self):
        return "دلالي_خطأ"


# ─────────────────────────────────────────────
#  Singletons (ثوابت عامة تُستخدم في كل المترجم)
# ─────────────────────────────────────────────

NUMBER_TYPE = NumberType()
STRING_TYPE = StringType()
BOOL_TYPE = BoolType()
ANY_TYPE = AnyType()
BIGINT_TYPE = BigIntType()
ERROR_TYPE = ErrorType()


# ─────────────────────────────────────────────
#  جسر التحويل: من اسم النوع النصي (كما يكتبه المبرمج بالعربية في الـ
#  AST عبر TsTypedDeclarationNode.type_name) إلى كائن Type الحقيقي.
# ─────────────────────────────────────────────

_NAME_TO_TYPE = {
    "عدد": NUMBER_TYPE,
    "سلسلة": STRING_TYPE,
    "منطقي": BOOL_TYPE,
    "اي": ANY_TYPE,
    "أي": ANY_TYPE,          # كلا الإملائين قد يردان من المحلل اللفظي
    "رقم_كبير": BIGINT_TYPE,
}


def type_from_name(type_name: str) -> Type:
    """
    يحوّل النص العربي لاسم النوع (كما يظهر في tsType بالـ Grammar) إلى
    كائن Type المقابل. أي اسم غير معروف يُعامل بتسامح كـ ANY_TYPE بدلاً
    من تفجير المترجم (القرار الدلالي يُترك للزائر إن أراد التحذير).
    """
    return _NAME_TO_TYPE.get(type_name, ANY_TYPE)


def make_array_type(element_type_name: str) -> ArrayType:
    """يبني ArrayType من اسم نوع العنصر النصي، مثل 'عدد' -> مصفوفة<عدد>."""
    return ArrayType(type_from_name(element_type_name))


def is_assignable(target_type: Type, value_type: Type) -> bool:
    """
    يقرر إن كان يجوز إسناد قيمة من النوع value_type إلى متغير من النوع
    target_type.

    قواعد التوافق:
      1. تسميم: إذا كان أي طرف ERROR_TYPE، نعتبرها متوافقة (لمنع كرة ثلج
         من الأخطاء الإضافية بسبب خطأ سابق تمت طباعته فعلاً).
      2. النوع 'أي' (ANY_TYPE) متوافق مع كل شيء، وكل شيء متوافق معه.
      3. خلاف ذلك، التطابق الاسمي القياسي (==) يحسم الأمر، وهذا يشمل
         ArrayType بمقارنته البنيوية لنوع العنصر.
    """
    if _contains_error(target_type) or _contains_error(value_type):
        return True
    if target_type == ANY_TYPE or value_type == ANY_TYPE:
        return True
    return target_type == value_type


def _contains_error(t: Type) -> bool:
    """يكتشف التسميم حتى لو كان داخل مصفوفة (مصفوفة<دلالي_خطأ>)."""
    if t == ERROR_TYPE:
        return True
    if isinstance(t, ArrayType):
        return _contains_error(t.element_type)
    return False
