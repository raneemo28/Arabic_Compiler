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
    runtime_errors_to_compiler_errors,
)
from Grammar.ArabicHtmlLexer import ArabicHtmlLexer
from Grammar.ArabicHtmlParser import ArabicHtmlParser
from AST.ast_visitor import ArabicHtmlAstVisitor
from semantic.semantic_analyzer import SemanticAnalyzerVisitor

from compiler_errors import PHASE_TITLE_AR, CompilerError, ErrorPhase, ErrorSeverity
from codegen.syntax_error_listener import CollectingErrorListener


def build_ast_from_file(path: str):
    """
    Returns (ast, syntax_listener). syntax_listener.errors is a
    list[CompilerError] for every lexical/syntax error ANTLR found.
    The AST is still built/returned even when there are syntax errors
    (ANTLR's error-recovery keeps parsing), but the caller should check
    syntax_listener.errors and stop before semantic analysis if it's
    non-empty — a tree built from broken input isn't safe to analyze.
    """
    input_stream = FileStream(path, encoding='utf-8')
    lexer = ArabicHtmlLexer(input_stream)

    syntax_listener = CollectingErrorListener()
    lexer.removeErrorListeners()
    lexer.addErrorListener(syntax_listener)

    token_stream = CommonTokenStream(lexer)
    parser = ArabicHtmlParser(token_stream)
    parser.removeErrorListeners()
    parser.addErrorListener(syntax_listener)

    parse_tree = parser.program()
    visitor = ArabicHtmlAstVisitor()
    ast = visitor.visit(parse_tree)
    return ast, syntax_listener


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


def render_report(all_errors: list, output_dir: str, source_file: str) -> str:
    """
    Writes ONE merged, translated, Arabic error report covering every
    phase that ran — syntax, semantic, and (if --capture-errors was
    used) runtime browser/terminal errors — sorted by source location
    and grouped by phase under Arabic section headers.

    all_errors: list[CompilerError] gathered across whichever phases
    actually ran. Phases that found nothing simply don't get a section.

    Returns the path to the written report file (output_dir/report.txt).
    """
    from collections import defaultdict

    report_path = os.path.join(output_dir, "report.txt")
    by_phase = defaultdict(list)
    for err in all_errors:
        by_phase[err.phase].append(err)

    with open(report_path, "w", encoding="utf-8") as f:
        f.write("=" * 70 + "\n")
        f.write("  تقرير الأخطاء\n")
        f.write(f"  الملف المصدر: {source_file}\n")
        f.write(f"  التاريخ: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}\n")
        f.write("=" * 70 + "\n")

        if not all_errors:
            f.write("\nلا توجد أي أخطاء. الكود سليم بالكامل.\n")
            f.write("\n" + "=" * 70 + "\n")
            return report_path

        f.write(f"\nإجمالي عدد المشاكل المرصودة: {len(all_errors)}\n")

        # Stable phase ordering: lexical/syntax first (earliest in the
        # pipeline), then semantic, then runtime browser/terminal last.
        for phase in ErrorPhase:
            group = by_phase.get(phase)
            if not group:
                continue
            group_sorted = sorted(group, key=lambda e: (e.line, e.column))
            title = PHASE_TITLE_AR.get(phase, phase.value)
            f.write(f"\n{title} ({len(group_sorted)})\n")
            f.write("-" * 70 + "\n")
            for err in group_sorted:
                if err.line:
                    loc = f"(سطر {err.line}، عمود {err.column}) " if err.column else f"(سطر {err.line}) "
                elif err.phase in (ErrorPhase.RUNTIME_BROWSER, ErrorPhase.RUNTIME_TERMINAL) and not err.source_mapped:
                    loc = "(لم يتم تحديد الموقع في الملف المصدر) "
                else:
                    loc = ""
                f.write(f"{loc}{err.message_ar}\n")

        f.write("\n" + "=" * 70 + "\n")

    return report_path


def main():
    args = parse_arguments()
    path = args.file
    output_dir = args.output

    if not os.path.isfile(path):
        print(f"❌ الملف غير موجود: {path}")
        sys.exit(1)

    os.makedirs(output_dir, exist_ok=True)

    print(f"📄 الملف: {path}")
    print("--- جاري التحليل ---")

    # All CompilerErrors collected across whichever phases run, merged
    # into one list and written by render_report() at every exit point —
    # so even a syntax-only failure gets one clean Arabic report file.
    all_errors: list = []

    try:
        ast, syntax_listener = build_ast_from_file(path)
    except Exception as e:
        print(f"❌ خطأ: {e}")
        sys.exit(1)

    # Per the "collect everything, then decide" approach: the lexer and
    # parser run to completion (ANTLR's error recovery keeps parsing
    # past a syntax error), so syntax_listener.errors already contains
    # every syntax error in the file, not just the first one. Only AFTER
    # that full pass do we decide whether to stop.
    if syntax_listener.errors:
        all_errors.extend(syntax_listener.errors)
        print(f"\n❌ أخطاء نحوية ({len(syntax_listener.errors)}):")
        for err in syntax_listener.errors:
            print(f"  ❌ (سطر {err.line}، عمود {err.column}) {err.message_ar}")
        report_path = render_report(all_errors, output_dir, path)
        print(f"\n💾 التقرير الكامل: {report_path}")
        sys.exit(1)

    if ast is None:
        print("❌ فشل بناء AST")
        sys.exit(1)

    print("--- التحليل الدلالي ---")
    analyzer = SemanticAnalyzerVisitor()
    ast.accept(analyzer)

    if analyzer.errors:
        # analyzer.errors is already a list[CompilerError] — log_error()
        # on SemanticAnalyzerVisitor builds CompilerError objects directly
        # (phase=ErrorPhase.SEMANTIC, with real line/column), so no
        # wrapping is needed here; just merge them into the report.
        all_errors.extend(analyzer.errors)

        print("\nأخطاء دلالية:")
        for err in analyzer.errors:
            print(f"  ❌ (سطر {err.line}، عمود {err.column}) {err.message_ar}")
        report_path = render_report(all_errors, output_dir, path)
        print(f"\n💾 التقرير الكامل: {report_path}")
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

        # Merge runtime errors into the same unified report as
        # syntax/semantic. Uses runtime_errors_to_compiler_errors(), which
        # wraps translate_errors()'s existing output — save_errors_to_file()
        # above still produces its own dedicated browser/terminal report
        # exactly as before; this is an additional combined view.
        runtime_compiler_errors = runtime_errors_to_compiler_errors(
            errors,
            generator._id_registry,
            generator.get_js_source_map(),
        )
        all_errors.extend(runtime_compiler_errors)

        if args.open:
            print("\n🌐 فتح الصفحة في المتصفح...")
            webbrowser.open(f"file:///{html_path.replace(os.sep, '/')}")
    elif args.open:
        print("\n🌐 فتح المتصفح...")
        webbrowser.open(f"file:///{html_path.replace(os.sep, '/')}")
    else:
        print("\n🎉 جاهز! افتح output.html في المتصفح")

    report_path = render_report(all_errors, output_dir, path)
    print(f"\n💾 التقرير الكامل: {report_path}")


if __name__ == "__main__":
    main()