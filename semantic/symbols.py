from dataclasses import dataclass
from typing import Any

class Symbol:
    """الفئة الأساسية لأي كيان يتم تعريفه في الكود (متغيرات، دوال، الخ)"""
    def __init__(self, name: str, sym_type: Any = None):
        self.name = name
        self.type = sym_type  # نوع البيانات مثل: عدد، سلسلة، منطقي، أي

    def __repr__(self):
        return f"<{self.__class__.__name__} name='{self.name}' type='{self.type}'>"

class VariableSymbol(Symbol):
    """فئة متخصصة للمتغيرات العادية المكتوبة بلغة البرمجة الخاصة بك"""
    def __init__(self, name: str, sym_type: Any = None):
        super().__init__(name, sym_type)

class FunctionSymbol(Symbol):
    """فئة متخصصة لتخزين بيانات الدوال ومعاملاتها"""
    def __init__(self, name: str, return_type: Any = None, arity: int = 0):
        super().__init__(name, return_type)
        self.arity = arity  # عدد المعاملات (Parameters) التي تقبلها الدالة