import sys
from antlr4 import FileStream, CommonTokenStream, Token
from Grammar.ArabicHtmlLexer import ArabicHtmlLexer


def main():
    # 1) قراءة الملف المصدري باستخدام ترميز UTF‑8
    source_file = "tests/sample.arweb"

    try:
        input_stream = FileStream(source_file, encoding='utf-8')
    except FileNotFoundError:
        print(f"خطأ: لم يتم العثور على الملف {source_file}")
        sys.exit(1)

    # 2) إنشاء كائن الماسح المعجمي
    lexer = ArabicHtmlLexer(input_stream)

    # 3) سحب الرموز ووضعها في مكدس Tokens
    token_stream = CommonTokenStream(lexer)
    token_stream.fill()

    # 4) طباعة النتائج بشكل منسق
    print("=" * 70)
    print(f"{'Lexeme (النص)':<25} | {'Token (نوع الرمز)':<25} | {'Line':<5}")
    print("=" * 70)

    for token in token_stream.tokens:
        if token.type == Token.EOF:
            break

        token_name = lexer.symbolicNames[token.type]
        lexeme = token.text.replace("\n", "\\n").replace("\t", "\\t")

        print(f"{lexeme:<25} | {token_name:<25} | {token.line:<5}")


if __name__ == "__main__":
    main()
