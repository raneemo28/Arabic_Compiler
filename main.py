# main.py
"""
الخطوة الرابعة: ربط المترجم ببعضه.

الاستخدام:
    python main.py tests_arweb/test_01_lab_example.arweb
"""
import sys
import os

# Ensure the script can locate modules in the current directory
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

# ANTLR4 Runtime Imports
from antlr4 import FileStream, CommonTokenStream

# Actual Generated Grammar Imports
from Grammar.ArabicHtmlLexer import ArabicHtmlLexer
from Grammar.ArabicHtmlParser import ArabicHtmlParser

# AST Visitor & Semantic Analyzer
from AST.ast_visitor import ArabicHtmlAstVisitor
from semantic.semantic_analyzer import SemanticAnalyzerVisitor

DEFAULT_PROGRAM_PATH = "./tests/test_02_valid_program.arweb"


def build_ast_from_file(path: str):
    """
    1. End-Front: قراءة وبناء الشجرة عبر ANTLR4 والـ Visitor.
    """
    # إنشاء دفق الإدخال من الملف بترميز UTF-8
    input_stream = FileStream(path, encoding='utf-8')
    
    # تهيئة الـ Lexer لتقسيم النص إلى الرموز (Tokens)
    lexer = ArabicHtmlLexer(input_stream)
    
    # تمرير الرموز إلى الـ Parser لبناء شجرة الإعراب (Parse Tree)
    token_stream = CommonTokenStream(lexer)
    parser = ArabicHtmlParser(token_stream)
    
    # نقطة انطلاق القواعد النحوية (برنامج / program)
    parse_tree = parser.program()
    
    # استخدام الـ Visitor لتحويل شجرة الإعراب إلى شجرة AST حقيقية
    visitor = ArabicHtmlAstVisitor()
    ast = visitor.visit(parse_tree)
    
    return ast


def main():
    path = sys.argv[1] if len(sys.argv) > 1 else DEFAULT_PROGRAM_PATH

    if not os.path.isfile(path):
        print(f"❌ خطأ: لم يتم العثور على الملف '{path}'.")
        print(f"الاستخدام: python main.py <مسار_الملف.arweb>")
        sys.exit(1)

    try:
        ast = build_ast_from_file(path)
    except Exception as e:
        print(f"❌ خطأ تركيبي أو بنيوي أثناء معالجة '{path}':")
        print(f"   {e}")
        sys.exit(1)

    # التحقق من أن الشجرة ليست فارغة قبل المتابعة
    if ast is None:
        print(f"❌ خطأ: فشل بناء شجرة الـ AST للملف '{path}'.")
        sys.exit(1)

    print(f"📄 الملف: {path}")
    print("--- جاري التحليل الدلالي (Type Checking) ---")

    # 2. التحليل الدلالي (التحقق من الأنواع والنطاقات) كـ Pass ثانٍ بعد بناء الشجرة
    analyzer = SemanticAnalyzerVisitor()
    ast.accept(analyzer)  # إرسال الزائر للشجرة

    # 3. طباعة تقرير الأخطاء
    if len(analyzer.errors) > 0:
        print("\nتم العثور على الأخطاء التالية:")
        for err in analyzer.errors:
            print("  ❌ " + err)
        print("\nفشلت عملية الترجمة. الرجاء إصلاح الأخطاء أعلاه.")
        sys.exit(1)
    else:
        print("✅ الكود سليم دلالياً ونحوياً. 100% جاهز لتوليد كود الآلة (IR)!")


if __name__ == "__main__":
    main()