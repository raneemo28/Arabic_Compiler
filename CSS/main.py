import sys
# استيراد مكتبات التشغيل الخاصة بـ ANTLR
# مرجع المكتبة: https://github.com/antlr/antlr4/tree/master/runtime/Python3

from antlr4 import *
# استيراد الماسح المعجمي الذي تم توليده
from ACSSLexer import ACSSLexer

def main():
    # 1. قراءة الملف المصدري
    # استخدام ترميز utf-8 هنا إجباري كما تعلمنا في المحاضرة النظرية
    try:
        input_stream = FileStream('program.ACSS', encoding='utf-8')
    except FileNotFoundError:
        print("خطأ : لم يتم العثور على الملف program.ACSS")
        sys.exit(1)

    # 2. إنشاء كائن الماسح المعجمي وتغذيته بالنص
    lexer = ACSSLexer(input_stream)

    # 3. سحب الرموز (Tokens) من الماسح ووضعها في شريط أو مكدس
    token_stream = CommonTokenStream(lexer)
    
    # إجبار الماسح على قراءة كل الملف وتوليد الرموز فوراً
    token_stream.fill()

    # 4. طباعة النتائج بشكل هندسي جميل
    print("=" * 50)
    print(f"{'السطر':<8} | {'نوع الرمز (Token)':<20} | {'النص (Lexeme)':<20}")
    print("=" * 50)
    
    for token in token_stream.tokens:
        # التوقف عند الوصول إلى علامة نهاية الملف EOF
        if token.type == Token.EOF:
            break
            
        # جلب الاسم البرمجي للرمز (مثل VAR أو NUMBER) بدلاً من رقمه الداخلي
        token_name = lexer.symbolicNames[token.type]
        
        # طباعة النتيجة
        print(f"{token.line:<8} | {token_name:<20} | {token.text:<20}")

# بناء المترجمات – د.م. عبد العظيم عموري ٢
if __name__ == '__main__':
    main()