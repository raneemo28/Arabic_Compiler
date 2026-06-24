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
from codegen.error_translator import (
    ERROR_SOURCE_BROWSER,
    ERROR_SOURCE_TERMINAL,
    make_error_entry,
    save_errors_to_file,
    translate_errors,
)
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
    parser.add_argument("file", type=str, help="مسار ملف .arweb")
    parser.add_argument("-o", "--output", type=str, default="output", help="مجلد الإخراج")
    parser.add_argument("--open", action="store_true", help="فتح المتصفح")
    parser.add_argument("--capture-errors", action="store_true", help="التقاط أخطاء وقت التشغيل")
    parser.add_argument("--wait", type=int, default=3, help="ثواني الانتظار بعد تحميل الصفحة (افتراضي: 3)")
    return parser.parse_args()


def capture_runtime_errors(
    html_path: str,
    wait_seconds: int = 5,
    headless: bool = True,
) -> list:
    """Open HTML in Chrome; capture browser console logs and terminal failures."""
    errors = []

    try:
        from selenium import webdriver
        from selenium.common.exceptions import WebDriverException
        from selenium.webdriver.chrome.options import Options
        from selenium.webdriver.chrome.service import Service
    except ImportError as e:
        print("❌ يجب تثبيت: pip install selenium")
        errors.append(make_error_entry(
            "SEVERE", f"ImportError: {e}", ERROR_SOURCE_TERMINAL
        ))
        return errors

    chrome_options = Options()
    if headless:
        chrome_options.add_argument("--headless=new")
    chrome_options.add_argument("--disable-gpu")
    chrome_options.add_argument("--no-sandbox")
    chrome_options.add_argument("--disable-dev-shm-usage")
    chrome_options.set_capability("goog:loggingPrefs", {"browser": "ALL"})

    mode = "خلفي" if headless else "مرئي"
    print(f"🌐 جاري تشغيل Chrome ({mode})...")
    print(f"   ⏳ الانتظار {wait_seconds} ثانية بعد التحميل...")

    driver = None
    service = None

    try:
        # Selenium 4.6+ ships its own driver manager (faster than webdriver-manager)
        try:
            driver = webdriver.Chrome(options=chrome_options)
        except WebDriverException:
            print("   ↪ محاولة ثانية عبر webdriver-manager...")
            from webdriver_manager.chrome import ChromeDriverManager
            service = Service(ChromeDriverManager().install())
            driver = webdriver.Chrome(service=service, options=chrome_options)

        driver.set_page_load_timeout(30)
        driver.set_script_timeout(30)

        file_url = f"file:///{os.path.abspath(html_path).replace(os.sep, '/')}"
        print(f"   📂 {file_url}")
        driver.get(file_url)
        time.sleep(wait_seconds)

        logs = driver.get_log("browser")
        for entry in logs:
            errors.append({
                "level": entry["level"],
                "message": entry["message"],
                "timestamp": datetime.fromtimestamp(
                    entry["timestamp"] / 1000
                ).strftime("%Y-%m-%d %H:%M:%S"),
                "source": ERROR_SOURCE_BROWSER,
            })
        print("   ✅ انتهى التقاط سجل المتصفح")
    except Exception as e:
        print(f"❌ خطأ في Selenium: {e}")
        errors.append(make_error_entry(
            "SEVERE", f"{type(e).__name__}: {e}", ERROR_SOURCE_TERMINAL
        ))
    finally:
        if driver:
            driver.quit()
        if service and getattr(service, "log_output", None):
            _append_chromedriver_log_errors(service, errors)

    return errors


def _append_chromedriver_log_errors(service, errors: list):
    """Read ChromeDriver log output and append error lines to terminal errors."""
    log_output = service.log_output
    if not log_output or not hasattr(log_output, "read"):
        return
    try:
        raw = log_output.read()
        if isinstance(raw, bytes):
            text = raw.decode("utf-8", errors="replace")
        else:
            text = str(raw)
        for line in text.splitlines():
            stripped = line.strip()
            if not stripped:
                continue
            lower = stripped.lower()
            if any(k in lower for k in ("error", "failed", "exception", "unable")):
                errors.append(make_error_entry(
                    "WARNING", stripped, ERROR_SOURCE_TERMINAL
                ))
    except Exception:
        pass


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
    
    if args.capture_errors:
        print("\n" + "=" * 60)
        print("🔍 التقاط أخطاء وقت التشغيل...")
        print("=" * 60)

        # Headless capture is faster; --open opens the page in your browser afterward
        errors = capture_runtime_errors(
            html_path,
            wait_seconds=args.wait,
            headless=True,
        )
        errors_file = save_errors_to_file(
            errors,
            output_dir,
            path,
            id_registry=generator._id_registry,
            source_map=generator.get_js_source_map(),
        )

        severe_count = sum(1 for e in errors if e["level"] == "SEVERE")
        warning_count = sum(1 for e in errors if e["level"] == "WARNING")
        info_count = sum(1 for e in errors if e["level"] == "INFO")
        browser_count = sum(1 for e in errors if e.get("source") == ERROR_SOURCE_BROWSER)
        terminal_count = sum(1 for e in errors if e.get("source") == ERROR_SOURCE_TERMINAL)

        print(f"\n📊 تم التقاط {len(errors)} سجل:")
        print(f"   🌐 متصفح:    {browser_count}")
        print(f"   💻 طرفية:   {terminal_count}")
        print(f"   ❌ أخطاء حرجة: {severe_count}")
        print(f"   ⚠️  تحذيرات:    {warning_count}")
        print(f"   ℹ️  معلومات:    {info_count}")
        print(f"   💾 التقرير: {errors_file}")

        if severe_count > 0:
            print("\n🔥 أول 3 أخطاء حرجة:")
            shown = 0
            for err in translate_errors(
                errors,
                generator._id_registry,
                generator.get_js_source_map(),
            ):
                if err["level"] == "SEVERE":
                    shown += 1
                    print(f"   {shown}. {err['message_ar'][:120]}")
                    if shown >= 3:
                        break

        if args.open:
            print("\n🌐 فتح الصفحة في المتصفح...")
            webbrowser.open(f"file:///{html_path.replace(os.sep, '/')}")
    elif args.open:
        print("\n🌐 فتح المتصفح...")
        webbrowser.open(f"file:///{html_path.replace(os.sep, '/')}")
    else:
        print("\n🎉 جاهز! افتح output.html في المتصفح")


if __name__ == "__main__":
    main()