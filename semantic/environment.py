# semantic/environment.py
from semantic.symbols import Symbol

class SemanticError(Exception):
    """استثناء مخصص لالتقاط أخطاء التحليل الدلالي مع تحديد السطر والعمود بدقة"""
    def __init__(self, message: str, line: int = 0, column: int = 0):
        super().__init__(message)
        self.message = message
        self.line = line
        self.column = column

    def __str__(self):
        if self.line > 0:
            return f"خطأ دلالي: {self.message} (السطر: {self.line}، العمود: {self.column})"
        return f"خطأ دلالي: {self.message}"

class Environment:
    """دماغ المترجم لإدارة الذاكرة ونطاقات المتغيرات المتداخلة"""
    def __init__(self, enclosing: 'Environment' = None):
        self._values = {}  # جدول التجزئة المحلي للنطاق الحالي
        self.enclosing = enclosing  # مؤشر يشير إلى النطاق الأب (الخارجي)

    def define(self, name: str, symbol: Symbol, line: int = 0, column: int = 0):
        """تعريف رمز جديد في النطاق المحلي ويمنع التكرار في نفس الكتلة البرمجية"""
        if name in self._values:
            raise SemanticError(f"المتغير '{name}' معرف مسبقاً في هذا النطاق بالتحديد", line, column)
        self._values[name] = symbol

    def resolve(self, name: str, line: int = 0, column: int = 0) -> Symbol:
        """البحث عن رمز. يبدأ محلياً، وإذا لم يجده يصعد في سلسلة النطاقات الآباء"""
        if name in self._values:
            return self._values[name]
        if self.enclosing is not None:
            return self.enclosing.resolve(name, line, column)
        raise SemanticError(f"استخدام متغير أو معرف غير معرف مسبقاً '{name}'", line, column)

    def print_stack(self, level=0):
        """دالة مساعدة لطباعة هيكلية الشجرة لتتبع النطاقات في الذاكرة أثناء التطوير"""
        indent = "  " * level
        print(f"{indent}[Scope Level {level}] -> {list(self._values.keys())}")
        if self.enclosing:
            self.enclosing.print_stack(level + 1)