"""
الخطوة الرابعة: ربط المترجم ببعضه.

الاستخدام:
    python main.py path/to/file.arweb
    python main.py path/to/file.arweb --open
    python main.py path/to/file.arweb --capture-errors
"""
import sys
import os
import argparse
import webbrowser
import time
from datetime import datetime

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))


from antlr4 import FileStream, CommonTokenStream
from codegen.codegen_visitor import CodeGeneratorVisitor
from Grammar.ArabicHtmlLexer import ArabicHtmlLexer
from Grammar.ArabicHtmlParser import ArabicHtmlParser
from AST.ast_visitor import ArabicHtmlAstVisitor
from semantic.semantic_analyzer import SemanticAnalyzerVisitor


def build_ast_from_file(path: str):
    input_stream = FileStream(path, encoding='utf-8')
    lexer = ArabicHtmlLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = ArabicHtmlParser(token_stream)
    parse_tree = parser.program()
    visitor = ArabicHtmlAstVisitor()
    return visitor.visit(parse_tree)


def parse_arguments():
    parser = argparse.ArgumentParser(
        description="مترجم .arweb → HTML/CSS/JS",
        formatter_class=argparse.RawDescriptionHelpFormatter,
    )
    parser.add_argument("file", type=str, help=" مسار الملف .arweb")
    parser.add_argument("-o", "--output", type=str, default="output", help="مجلد الإخراج")
    parser.add_argument("--open", action="store_true", help="فتح المتصفح")
    parser.add_argument("--capture-errors", action="store_true", help="التقاط أخطاء وقت التشغيل")
    parser.add_argument("--wait", type=int, default=5, help="ثواني الانتظار (افتراضي: 5)")
    return parser.parse_args()


def capture_runtime_errors(html_path: str, wait_seconds: int = 5) -> list:
    """فتح HTML في Chrome والتقاط أخطاء Console."""
    try:
        from selenium import webdriver  # type: ignore
        from selenium.webdriver.chrome.options import Options  # type: ignore
        from selenium.webdriver.chrome.service import Service  # type: ignore
        from webdriver_manager.chrome import ChromeDriverManager  # type: ignore
    except ImportError:
        print("❌ يجب تثبيت: pip install selenium webdriver-manager")
        return []

    chrome_options = Options()
    chrome_options.add_argument("--headless=new")
    chrome_options.add_argument("--disable-gpu")
    chrome_options.add_argument("--no-sandbox")
    chrome_options.add_argument("--disable-dev-shm-usage")
    chrome_options.set_capability("goog:loggingPrefs", {"browser": "ALL"})

    print(f"🌐 جاري فتح المتصفح...")
    print(f"   ⏳ الانتظار {wait_seconds} ثانية...")

    driver = None
    errors = []

    try:
        service = Service(ChromeDriverManager().install())
        driver = webdriver.Chrome(service=service, options=chrome_options)
        
        file_url = f"file:///{os.path.abspath(html_path).replace(os.sep, '/')}"
        driver.get(file_url)
        time.sleep(wait_seconds)
        
        logs = driver.get_log("browser")
        for entry in logs:
            errors.append({
                "level": entry["level"],
                "message": entry["message"],
                "timestamp": datetime.fromtimestamp(entry["timestamp"] / 1000).strftime("%Y-%m-%d %H:%M:%S"),
            })
    except Exception as e:
        print(f"❌ خطأ في Selenium: {e}")
    finally:
        if driver:
            driver.quit()
    
    return errors


def save_errors_to_file(errors: list, output_dir: str, source_file: str):
    """حفظ الأخطاء في errors.txt."""
    errors_file = os.path.join(output_dir, "errors.txt")
    
    with open(errors_file, "w", encoding="utf-8") as f:
        f.write("=" * 80 + "\n")
        f.write(f"  تقرير أخطاء وقت التشغيل\n")
        f.write(f"  الملف المصدر: {source_file}\n")
        f.write(f"  التاريخ: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}\n")
        f.write("=" * 80 + "\n\n")
        
        if not errors:
            f.write("✅ لا توجد أخطاء!\n")
        else:
            severe = [e for e in errors if e["level"] == "SEVERE"]
            warnings = [e for e in errors if e["level"] == "WARNING"]
            info = [e for e in errors if e["level"] == "INFO"]
            
            f.write(f"📊 الملخص:\n")
            f.write(f"   أخطاء حرجة: {len(severe)}\n")
            f.write(f"   تحذيرات:    {len(warnings)}\n")
            f.write(f"   معلومات:    {len(info)}\n")
            f.write(f"   الإجمالي:   {len(errors)}\n\n")
            
            if severe:
                f.write("❌ الأخطاء الحرجة:\n")
                f.write("-" * 80 + "\n")
                for i, err in enumerate(severe, 1):
                    f.write(f"\n[#{i}] {err['timestamp']}\n{err['message']}\n")
            
            if warnings:
                f.write("\n⚠️  التحذيرات:\n")
                f.write("-" * 80 + "\n")
                for i, warn in enumerate(warnings, 1):
                    f.write(f"\n[#{i}] {warn['timestamp']}\n{warn['message']}\n")
        
        f.write("\n" + "=" * 80 + "\n")
    
    return errors_file


def main():
    args = parse_arguments()
    path = args.file
    output_dir = args.output

    if not os.path.isfile(path):
        print(f"❌ الملف غير موجود: {path}")
        sys.exit(1)

    print(f"📄 الملف: {path}")
    print("--- جاري التحليل ---")

    try:
        ast = build_ast_from_file(path)
    except Exception as e:
        print(f"❌ خطأ: {e}")
        sys.exit(1)

    if ast is None:
        print("❌ فشل بناء AST")
        sys.exit(1)

    print("--- التحليل الدلالي ---")
    analyzer = SemanticAnalyzerVisitor()
    ast.accept(analyzer)

    if analyzer.errors:
        print("\nأخطاء دلالية:")
        for err in analyzer.errors:
            print(f"  ❌ {err}")
        sys.exit(1)

    print("✅ الكود سليم")
    print("--- توليد الكود ---")

    generator = CodeGeneratorVisitor()
    ast.accept(generator)
    generator.write_files(output_dir)

    print(f"✅ تم التوليد في {output_dir}/")

    html_path = os.path.abspath(os.path.join(output_dir, "output.html"))
    
    if args.open and not args.capture_errors:
        print(f"\n🌐 فتح المتصفح...")
        webbrowser.open(f"file://{html_path}")

    if args.capture_errors:
        print("\n" + "=" * 60)
        print("🔍 التقاط أخطاء وقت التشغيل...")
        print("=" * 60)
        
        errors = capture_runtime_errors(html_path, wait_seconds=args.wait)
        errors_file = save_errors_to_file(errors, output_dir, path)
        
        severe_count = sum(1 for e in errors if e["level"] == "SEVERE")
        warning_count = sum(1 for e in errors if e["level"] == "WARNING")
        
        print(f"\n📊 تم التقاط {len(errors)} سجل:")
        print(f"   ❌ أخطاء حرجة: {severe_count}")
        print(f"   ⚠️  تحذيرات:    {warning_count}")
        print(f"   💾 الحفظ في: {errors_file}")
        
        if severe_count > 0:
            print(f"\n🔥 أول 3 أخطاء:")
            for i, err in enumerate(errors[:3], 1):
                if err["level"] == "SEVERE":
                    msg = err["message"][:100]
                    print(f"   {i}. {msg}...")

    if not args.open and not args.capture_errors:
        print("\n🎉 جاهز! افتح output.html في المتصفح")


if __name__ == "__main__":
    main()