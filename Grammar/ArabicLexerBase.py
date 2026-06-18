# Grammar/ArabicLexerBase.py
import sys
import os

from antlr4 import Lexer, InputStream

class ArabicCharStream(InputStream):
    """
    A custom CharStream that transparently skips Arabic diacritics (Tashkeel)
    while preserving the original string's length and structure so that 
    ANTLR's line and column tracking remains 100% accurate.
    """
    # تصفية حركات التشكيل والتطويل (التطويل الكشيدة 0x0640) لضمان مطابقة الكلمات النحوية بسلاسة
    _DIACRITICS = set(range(0x064B, 0x0660)) | {0x0670, 0x0640}

    def __init__(self, data: str):
        super().__init__(data)
        self.original_data = data
        
        # بناء مصفوفة مقابلة المؤشرات بين النص النظيف الخالي من الحركات والنص الأصلي المشكل
        self.clean_to_orig = []
        clean_idx = 0
        for i, ch in enumerate(data):
            if ord(ch) not in self._DIACRITICS:
                self.clean_to_orig.append(i)
                clean_idx += 1
                
        self.clean_size = clean_idx
        self.p = 0  # مؤشر الموقع الحالي داخل الستريم النظيف

    def LA(self, offset: int) -> int:
        """قراءة الرمز المستقبلي (Lookahead) مع تخطي التشكيل تلقائياً"""
        if offset == 0:
            return 0
        target_clean_idx = self.p + offset - 1
        if target_clean_idx < 0 or target_clean_idx >= self.clean_size:
            return -1  # نهاية الملف EOF
        orig_idx = self.clean_to_orig[target_clean_idx]
        return ord(self.original_data[orig_idx])

    def consume(self):
        """التقدم للأمام خطوة مع الحفاظ على دقة حساب وتحديث رقم السطر والعمود"""
        if self.p >= self.clean_size:
            raise EOFError()
        
        curr_orig = self.clean_to_orig[self.p]
        next_orig = self.clean_to_orig[self.p + 1] if self.p + 1 < self.clean_size else len(self.original_data)
        
        # تحريك الستريم الأساسي بالخطوات الحقيقية (بما فيها الحركات المستبعدة) لتحديث تتبع الأسطر
        steps = next_orig - curr_orig
        for _ in range(steps):
            super().consume()
            
        self.p += 1

    def seek(self, index: int):
        """التحرك لموقع محدد داخل الستريم النظيف (يدعم التراجع والتقدم الآمن)"""
        if index < 0:
            index = 0
        if index > self.clean_size:
            index = self.clean_size
            
        orig_idx = self.clean_to_orig[index] if index < self.clean_size else len(self.original_data)
        
        if index <= self.p:
            # التراجع للخلف: إرجاع المؤشر الأساسي وإعادة حساب الأسطر بدقة
            super().seek(orig_idx)
            self.p = index
            
            self.line = 1
            self.column = 0
            for i in range(orig_idx):
                if self.original_data[i] == '\n':
                    self.line += 1
                    self.column = 0
                else:
                    self.column += 1
        else:
            # التقدم للأمام: استهلاك الرموز بالتوالي لتحديث السطر والعمود
            while self.p < index:
                self.consume()

    @property
    def index(self):
        """خاصية برمجية قياسية (Property) لإرجاع الموقع الحالي لمفسر ANTLR"""
        return self.p

    def getText(self, start: int, stop: int) -> str:
        """جلب النص البرمي النظيف الخالي من الحركات لمطابقته داخل القواعد"""
        if stop >= self.clean_size:
            stop = self.clean_size - 1
        if start >= self.clean_size or start > stop:
            return ""
        orig_start = self.clean_to_orig[start]
        orig_stop = self.clean_to_orig[stop]
        
        return "".join(ch for ch in self.original_data[orig_start:orig_stop+1] 
                       if ord(ch) not in self._DIACRITICS)


class ArabicLexerBase(Lexer):
    """
    الفئة الأساسية للمحلل المعجمي (Lexer Base) التي تضمن تغليف النصوص بالستريم المخصص 
    لتصفية التشكيل والتطويل قبل بدء مطابقة الرموز والكلمات المفتاحية
    """
    def __init__(self, input_stream, output=None):
        if isinstance(input_stream, ArabicCharStream):
            clean_stream = input_stream
        else:
            raw_text = getattr(input_stream, 'strdata', None)
            if raw_text is None:
                input_stream.seek(0)
                raw_text = input_stream.getText(0, input_stream.size - 1)
                
            clean_stream = ArabicCharStream(raw_text)
            
        super().__init__(clean_stream, output)