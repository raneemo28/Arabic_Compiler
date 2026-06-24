"""
ترجمة أخطاء وقت التشغيل (متصفح + طرفية) إلى رسائل عربية
مع إرجاع السطر والعمود في ملف .arweb المصدر.
"""
import os
import re
from datetime import datetime
from typing import Optional

ERROR_SOURCE_BROWSER = "browser"
ERROR_SOURCE_TERMINAL = "terminal"

_JS_LOCATION_RE = re.compile(r"output\.js[:\s]+(\d+)(?::(\d+))?")

# ── أنماط أخطاء JS (SEVERE / WARNING في المتصفح) ─────────────────────
RUNTIME_ERROR_PATTERNS: list[tuple[re.Pattern, str]] = [
    (
        re.compile(r"ReferenceError:\s*(.+?)\s+is not defined", re.IGNORECASE),
        "استخدام متغير أو معرف غير معرف مسبقاً '{0}'",
    ),
    (
        re.compile(r"ReferenceError:\s*Cannot access '(.+?)' before initialization", re.IGNORECASE),
        "لا يمكن الوصول إلى المتغير '{0}' قبل تهيئته",
    ),
    (
        re.compile(r"ReferenceError:\s*(.+)", re.IGNORECASE),
        "خطأ مرجع: {0}",
    ),
    (
        re.compile(
            r"TypeError:\s*Cannot read propert(?:y|ies) of (null|undefined) \(reading '(.+?)'\)",
            re.IGNORECASE,
        ),
        "لا يمكن قراءة الخاصية '{1}' من قيمة {0} — تحقق من أن العنصر موجود (مثلاً عبر احضرعنصر)",
    ),
    (
        re.compile(
            r"TypeError:\s*Cannot set propert(?:y|ies) of (null|undefined) \(setting '(.+?)'\)",
            re.IGNORECASE,
        ),
        "لا يمكن تعيين الخاصية '{1}' على قيمة {0} — العنصر غير موجود أو لم يُحمَّل بعد",
    ),
    (
        re.compile(
            r"TypeError:\s*Cannot read propert(?:y|ies) of (null|undefined)",
            re.IGNORECASE,
        ),
        "محاولة الوصول لخاصية على قيمة {0}",
    ),
    (
        re.compile(
            r"TypeError:\s*Failed to execute '(\w+)' on '(\w+)': (.+)",
            re.IGNORECASE,
        ),
        "فشل تنفيذ '{0}' على '{1}': {2}",
    ),
    (
        re.compile(r"TypeError:\s*document\.(\w+) is not a function", re.IGNORECASE),
        "'{0}' ليست دالة صالحة على الوثيقة",
    ),
    (
        re.compile(r"TypeError:\s*(.+?)\s+is not a function", re.IGNORECASE),
        "'{0}' ليست دالة — تحقق من اسم الدالة أو من أن القيمة قابلة للاستدعاء",
    ),
    (
        re.compile(r"TypeError:\s*(.+?)\.(\w+) is not a function", re.IGNORECASE),
        "'{1}' ليست دالة على '{0}'",
    ),
    (
        re.compile(r"TypeError:\s*(.+?)\s+is not iterable", re.IGNORECASE),
        "'{0}' غير قابل للتكرار — يُتوقع مصفوفة في حلقة 'في'",
    ),
    (
        re.compile(r"TypeError:\s*Cannot convert undefined or null to object", re.IGNORECASE),
        "لا يمكن تحويل 'غير-معرف' أو 'غير-موجود' إلى كائن",
    ),
    (
        re.compile(r"TypeError:\s*(.+?)\.push is not a function", re.IGNORECASE),
        "لا يمكن استخدام 'ادفع' على '{0}' — القيمة ليست مصفوفة",
    ),
    (
        re.compile(r"TypeError:\s*Assignment to constant variable", re.IGNORECASE),
        "محاولة إسناد قيمة لثابت مُعرَّف بـ 'ثابت'",
    ),
    (
        re.compile(
            r"TypeError:\s*Cannot use 'in' operator to search for '(.+?)' in (.+)",
            re.IGNORECASE,
        ),
        "لا يمكن استخدام عامل 'في' للبحث عن '{0}' داخل '{1}'",
    ),
    (
        re.compile(r"TypeError:\s*(.+?)\s+is not an object", re.IGNORECASE),
        "'{0}' ليس كائناً",
    ),
    (
        re.compile(r"TypeError:\s*(.+)", re.IGNORECASE),
        "خطأ نوع: {0}",
    ),
    (
        re.compile(r"SyntaxError:\s*(.+)", re.IGNORECASE),
        "خطأ نحوي في الكود المُولَّد: {0}",
    ),
    (
        re.compile(r"RangeError:\s*(.+)", re.IGNORECASE),
        "خطأ نطاق: {0}",
    ),
    (
        re.compile(r"Failed to load resource:\s*(.+)", re.IGNORECASE),
        "فشل تحميل المورد: {0}",
    ),
]

TERMINAL_ERROR_PATTERNS: list[tuple[re.Pattern, str]] = [
    (
        re.compile(r"No module named ['\"]selenium['\"]", re.IGNORECASE),
        "حزمة selenium غير مثبتة — نفّذ: pip install selenium",
    ),
    (
        re.compile(r"No module named ['\"]webdriver_manager['\"]", re.IGNORECASE),
        "حزمة webdriver-manager غير مثبتة — نفّذ: pip install webdriver-manager",
    ),
    (
        re.compile(r"ImportError:\s*(.+)", re.IGNORECASE),
        "خطأ استيراد: {0}",
    ),
    (
        re.compile(r"session not created[:\s]*(.+)", re.IGNORECASE),
        "فشل إنشاء جلسة المتصفح — {0}",
    ),
    (
        re.compile(r"chromedriver.*?(not found|unable to discover|executable)", re.IGNORECASE),
        "تعذّر العثور على ChromeDriver — تأكد من تثبيت Google Chrome",
    ),
    (
        re.compile(r"WebDriverException:\s*(.+)", re.IGNORECASE),
        "خطأ أتمتة المتصفح: {0}",
    ),
    (
        re.compile(r"TimeoutException:\s*(.+)", re.IGNORECASE),
        "انتهت مهلة الاتصال بالمتصفح: {0}",
    ),
    (
        re.compile(r"MaxRetryError.*", re.IGNORECASE),
        "فشل الاتصال بخادم ChromeDriver بعد عدة محاولات",
    ),
]

_DOM_PROPERTY_MAP = {
    "value": "القيمة",
    "innerText": "النص-الداخلي",
    "innerHTML": "كود-html",
    "style": "التنسيق",
    "length": "طول",
    "type": "نوع",
    "checked": "محدد",
    "addEventListener": "عند-الحدث",
    "getElementById": "احضرعنصر",
    "push": "ادفع",
    "log": "اطبع",
}

_NULL_TERM_MAP = {
    "null": "غير-موجود",
    "undefined": "غير-معرف",
}


def _build_reverse_registry(latin_to_arabic: dict[str, str]) -> dict[str, str]:
    return {latin: arabic for arabic, latin in latin_to_arabic.items()}


def _restore_arabic_name(name: str, reverse_registry: dict[str, str]) -> str:
    name = name.strip().strip("'\"")
    return reverse_registry.get(name, name)


def _localize_dom_terms(text: str) -> str:
    for eng, ar in _NULL_TERM_MAP.items():
        text = re.sub(rf"\b{eng}\b", ar, text, flags=re.IGNORECASE)
    for eng, ar in _DOM_PROPERTY_MAP.items():
        text = text.replace(f"'{eng}'", f"'{ar}'")
        text = text.replace(f'"{eng}"', f'"{ar}"')
    return text


def _apply_groups(template: str, groups: tuple) -> str:
    localized_groups = tuple(_localize_dom_terms(g) if g else g for g in groups)
    result = template
    for i, group in enumerate(localized_groups):
        result = result.replace(f"{{{i}}}", group or "")
    return result


def _extract_js_error_part(message: str) -> str:
    uncaught = re.search(r"Uncaught\s+(.+)", message, re.IGNORECASE)
    if uncaught:
        return uncaught.group(1).strip()
    return message.strip()


def _extract_js_location(message: str) -> tuple[Optional[int], Optional[int]]:
    match = _JS_LOCATION_RE.search(message)
    if not match:
        return None, None
    js_line = int(match.group(1))
    js_col = int(match.group(2)) if match.group(2) else None
    return js_line, js_col


def _resolve_arabic_location(
    js_line: Optional[int],
    js_col: Optional[int],
    source_map: Optional[dict[int, tuple[int, int]]],
) -> tuple[int, int, bool]:
    """Map output.js line → (.arweb line, .arweb column). Returns hit flag."""
    if js_line and source_map and js_line in source_map:
        ar_line, ar_col = source_map[js_line]
        return ar_line, ar_col or (js_col or 0), True
    return 0, 0, False


def _format_source_location(ar_line: int, ar_col: int, mapped: bool) -> str:
    if not mapped or not ar_line:
        return ""
    if ar_col:
        return f"(سطر {ar_line}، عمود {ar_col}) "
    return f"(سطر {ar_line}) "


def _match_patterns(
    message: str,
    patterns: list[tuple[re.Pattern, str]],
    groups_mapper=None,
) -> Optional[str]:
    for pattern, template in patterns:
        match = pattern.search(message)
        if not match:
            continue
        groups = match.groups()
        if groups_mapper:
            groups = groups_mapper(groups)
        return _apply_groups(template, groups)
    return None


def _extract_info_content(message: str) -> str:
    """Strip file path / output.js location from console INFO messages."""
    text = _JS_LOCATION_RE.sub("", message)
    text = re.sub(r"file:///\S+\s*", "", text)
    text = re.sub(r"^Console\s*(API)?\s*", "", text, flags=re.IGNORECASE).strip()
    return text.strip() or message.strip()


def translate_info_message(
    message: str,
    source_map: Optional[dict[int, tuple[int, int]]] = None,
) -> tuple[str, int, int, bool]:
    js_line, js_col = _extract_js_location(message)
    ar_line, ar_col, mapped = _resolve_arabic_location(js_line, js_col, source_map)
    content = _extract_info_content(message)
    loc = _format_source_location(ar_line, ar_col, mapped)
    return f"{loc}معلومات: {content}", ar_line, ar_col, mapped


def translate_error_message(
    message: str,
    id_registry: Optional[dict[str, str]] = None,
    source: str = ERROR_SOURCE_BROWSER,
    level: str = "SEVERE",
    source_map: Optional[dict[int, tuple[int, int]]] = None,
) -> tuple[str, int, int, bool]:
    """Translate one log entry. INFO is not treated as an error."""
    if level == "INFO":
        return translate_info_message(message, source_map)

    js_line, js_col = _extract_js_location(message)
    ar_line, ar_col, mapped = _resolve_arabic_location(js_line, js_col, source_map)
    loc = _format_source_location(ar_line, ar_col, mapped)

    if source == ERROR_SOURCE_TERMINAL:
        body = _match_patterns(message, TERMINAL_ERROR_PATTERNS)
        prefix = "تحذير طرفي" if level == "WARNING" else "خطأ طرفي"
        text = body or message.strip()
        return f"{loc}{prefix}: {text}", ar_line, ar_col, mapped

    reverse = _build_reverse_registry(id_registry or {})
    error_part = _extract_js_error_part(message)

    def map_groups(groups):
        return tuple(_restore_arabic_name(g, reverse) if g else g for g in groups)

    body = _match_patterns(error_part, RUNTIME_ERROR_PATTERNS, map_groups)
    if body:
        body = _localize_dom_terms(body)
    else:
        restored = error_part
        for latin, arabic in reverse.items():
            restored = re.sub(rf"\b{re.escape(latin)}\b", arabic, restored)
        body = restored

    if level == "WARNING":
        prefix = "تحذير"
    else:
        prefix = "خطأ وقت التشغيل"

    return f"{loc}{prefix}: {body}", ar_line, ar_col, mapped


def translate_errors(
    errors: list[dict],
    id_registry: Optional[dict[str, str]] = None,
    source_map: Optional[dict[int, tuple[int, int]]] = None,
) -> list[dict]:
    translated = []
    for err in errors:
        msg_ar, ar_line, ar_col, mapped = translate_error_message(
            err["message"],
            id_registry,
            err.get("source", ERROR_SOURCE_BROWSER),
            err.get("level", "SEVERE"),
            source_map,
        )
        translated.append({
            **err,
            "message_ar": msg_ar,
            "ar_line": ar_line,
            "ar_column": ar_col,
            "source_mapped": mapped,
        })
    return translated


def _split_by_source(errors: list[dict]) -> tuple[list[dict], list[dict]]:
    browser = [e for e in errors if e.get("source", ERROR_SOURCE_BROWSER) == ERROR_SOURCE_BROWSER]
    terminal = [e for e in errors if e.get("source") == ERROR_SOURCE_TERMINAL]
    return browser, terminal


def _count_levels(errors: list[dict]) -> dict[str, int]:
    return {
        "severe": sum(1 for e in errors if e["level"] == "SEVERE"),
        "warning": sum(1 for e in errors if e["level"] == "WARNING"),
        "info": sum(1 for e in errors if e["level"] == "INFO"),
    }


def _write_level_section(f, title: str, entries: list[dict]):
    if not entries:
        return
    f.write(f"\n{title}\n")
    f.write("-" * 80 + "\n")
    for i, entry in enumerate(entries, 1):
        f.write(f"\n[#{i}] {entry['timestamp']}\n")
        f.write(f"{entry['message_ar']}\n")


def save_errors_to_file(
    errors: list[dict],
    output_dir: str,
    source_file: str,
    id_registry: Optional[dict[str, str]] = None,
    source_map: Optional[dict[int, tuple[int, int]]] = None,
) -> str:
    """Save Arabic error report only → output/errors.txt."""
    translated = translate_errors(errors, id_registry, source_map)
    errors_file = os.path.join(output_dir, "errors.txt")
    browser, terminal = _split_by_source(translated)
    all_counts = _count_levels(translated)
    browser_counts = _count_levels(browser)
    terminal_counts = _count_levels(terminal)

    with open(errors_file, "w", encoding="utf-8") as f:
        f.write("=" * 80 + "\n")
        f.write("  تقرير أخطاء وقت التشغيل\n")
        f.write(f"  الملف المصدر: {source_file}\n")
        f.write(f"  التاريخ: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}\n")
        f.write("=" * 80 + "\n\n")

        if not translated:
            f.write("لا توجد أخطاء أو سجلات.\n")
        else:
            f.write("الملخص:\n")
            f.write(f"  أخطاء حرجة:  {all_counts['severe']}\n")
            f.write(f"  تحذيرات:     {all_counts['warning']}\n")
            f.write(f"  معلومات:     {all_counts['info']}\n")
            f.write(f"  من المتصفح:  {len(browser)} "
                    f"(حرجة {browser_counts['severe']}، "
                    f"تحذيرات {browser_counts['warning']}، "
                    f"معلومات {browser_counts['info']})\n")
            f.write(f"  من الطرفية:  {len(terminal)} "
                    f"(حرجة {terminal_counts['severe']}، "
                    f"تحذيرات {terminal_counts['warning']})\n")
            f.write("\nملاحظة: السطر والعمود يشيران إلى ملف .arweb المصدر.\n")

            browser_severe = [e for e in browser if e["level"] == "SEVERE"]
            browser_warn = [e for e in browser if e["level"] == "WARNING"]
            browser_info = [e for e in browser if e["level"] == "INFO"]
            terminal_severe = [e for e in terminal if e["level"] == "SEVERE"]
            terminal_warn = [e for e in terminal if e["level"] == "WARNING"]

            if browser_severe or terminal_severe:
                f.write("\n" + "=" * 80 + "\n")
                f.write("أخطاء حرجة\n")
                _write_level_section(f, "  ◦ المتصفح", browser_severe)
                _write_level_section(f, "  ◦ الطرفية", terminal_severe)

            if browser_warn or terminal_warn:
                f.write("\n" + "=" * 80 + "\n")
                f.write("تحذيرات\n")
                _write_level_section(f, "  ◦ المتصفح", browser_warn)
                _write_level_section(f, "  ◦ الطرفية", terminal_warn)

            if browser_info:
                f.write("\n" + "=" * 80 + "\n")
                f.write("معلومات (ليست أخطاء)\n")
                _write_level_section(f, "  ◦ المتصفح", browser_info)

        f.write("\n" + "=" * 80 + "\n")

    return errors_file


def make_error_entry(level: str, message: str, source: str) -> dict:
    return {
        "level": level,
        "message": message,
        "timestamp": datetime.now().strftime("%Y-%m-%d %H:%M:%S"),
        "source": source,
    }
