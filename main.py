# main.py
import sys
import os

from antlr4 import CommonTokenStream, FileStream
from antlr4.error.ErrorListener import ErrorListener

from Grammar.ArabicHtmlLexer   import ArabicHtmlLexer
from Grammar.ArabicHtmlParser  import ArabicHtmlParser
from AST.ast_visitor           import ArabicHtmlAstVisitor
from AST.ast_nodes             import ASTNode
from AST.ast_visualizer        import ASTVisualizerVisitor

# استيراد أدوات التحليل الدلالي ونطاقات الذاكرة (مفاهيم المعمل 10)
from semantic.semantic_visitor import SemanticAnalysisVisitor
from semantic.environment      import SemanticError

import pprint


# ── error listener ────────────────────────────────────────────────────────────
class CompilerErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errors = []
    def syntaxError(self, recognizer, offendingSymbol, line, col, msg, e):
        self.errors.append(f"line {line}:{col} {msg}")


# ── to_dict for pprint ────────────────────────────────────────────────────────
def to_dict(node):
    if not isinstance(node, ASTNode):
        return str(node)
    d = {"type": type(node).__name__}
    for k, v in vars(node).items():
        if k in ("line", "column"):
            d[k] = v
        elif isinstance(v, list):
            d[k] = [to_dict(i) if isinstance(i, ASTNode) else i for i in v]
        elif isinstance(v, ASTNode):
            d[k] = to_dict(v)
        else:
            d[k] = v
    return d


# ── main ──────────────────────────────────────────────────────────────────────
def main():
    source = sys.argv[1] if len(sys.argv) > 1 else "tests/sample.arweb"

    # 1. Lex
    stream = FileStream(source, encoding='utf-8')
    error_listener = CompilerErrorListener()

    lexer = ArabicHtmlLexer(stream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(error_listener)

    tokens = CommonTokenStream(lexer)

    # 2. Parse
    parser = ArabicHtmlParser(tokens)
    parser.removeErrorListeners()
    parser.addErrorListener(error_listener)
    parse_tree = parser.program()

    if error_listener.errors:
        for e in error_listener.errors:
            print(f"ERROR: {e}", file=sys.stderr)
        sys.exit(1)

    # 3. Build AST
    visitor = ArabicHtmlAstVisitor()
    ast = visitor.visit(parse_tree)

    # 3.5. التحليل الدلالي وفحص النطاقات والرموز (مفاهيم المعمل 10)
    print("⏳ جاري بدء مرحلة التحليل الدلالي والتحقق من النطاقات والرموز...")
    semantic_analyzer = SemanticAnalysisVisitor()
    
    try:
        # عبور الشجرة للتحقق من سلامة استخدام المتغيرات والدوال معجمياً
        ast.accept(semantic_analyzer)
        print("✅ نجح التحليل الدلالي: جميع النطاقات والرموز سليمة ومتناسقة هندسياً!")
        
    except SemanticError as error:
        # التقاط الأخطاء الدلالية (مثل استخدام متغير غير معرف أو تكرار تعريفه في نفس الكتلة)
        print(f"\n❌ فشلت عملية البناء بسبب خطأ دلالي:")
        print(error, file=sys.stderr)
        sys.exit(1)  # إيقاف البرنامج فوراً وعدم الانتقال للرسم أو التوليد

    # 4. Print as text (pprint)
    print("\n📊 هيكلية شجرة الـ AST النصية:")
    pprint.pprint(to_dict(ast), sort_dicts=False, width=80)

    # 5. Draw as Graphviz image
    visualizer = ASTVisualizerVisitor()
    ast.accept(visualizer)
    output_name = os.path.splitext(os.path.basename(source))[0] + '_ast'
    visualizer.render(output_name)


if __name__ == '__main__':
    main()