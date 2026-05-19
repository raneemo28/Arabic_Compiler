import unicodedata
from antlr4 import Lexer, InputStream  # <-- لاحظ أننا أضفنا InputStream هنا


class ArabicLexerBase(Lexer):
    """
    Base class that strips Arabic diacritics (Tashkeel, U+064B–U+065F
    and U+0670) from the input *before* ANTLR tokenises it.
    """

    _DIACRITICS = set(range(0x064B, 0x0660)) | {0x0670}

    def __init__(self, input_stream, output=None):
        # 1. نقرأ النص الخام بالكامل من الصندوق القديم
        raw_text = input_stream.getText(0, input_stream.size - 1)
        
        # 2. ننظف النص من التشكيل
        cleaned = self._strip_tashkeel(raw_text)
        
        # 3. نصنع صندوقاً جديداً (Stream جديد) نضع فيه النص النظيف
        new_stream = InputStream(cleaned)
        
        # 4. نسلم الصندوق الجديد للبرنامج ليكمل عمله بدون مشاكل
        super().__init__(new_stream, output)

    @classmethod
    def _strip_tashkeel(cls, text: str) -> str:
        """Return *text* with all Arabic diacritic characters removed."""
        return "".join(ch for ch in text if ord(ch) not in cls._DIACRITICS)