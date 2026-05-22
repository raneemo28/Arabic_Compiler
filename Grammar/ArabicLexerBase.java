import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.misc.Interval;

/**
 * Base class that strips Arabic diacritics (Tashkeel, U+064B–U+065F
 * and U+0670) from the input *before* ANTLR tokenises it.
 */
public abstract class ArabicLexerBase extends Lexer {

    public ArabicLexerBase(CharStream input) {
        super(stripTashkeel(input));
    }

    private static CharStream stripTashkeel(CharStream input) {
        // 1. Read the entire raw text from the stream
        String rawText = input.getText(Interval.of(0, input.size() - 1));
        
        StringBuilder cleaned = new StringBuilder(rawText.length());
        
        // 2. Clean the text by removing diacritics
        for (int i = 0; i < rawText.length(); i++) {
            char ch = rawText.charAt(i);
            // Check if character is a diacritic (0x064B to 0x065F or 0x0670)
            if ((ch >= 0x064B && ch <= 0x065F) || ch == 0x0670) {
                continue; // Skip the diacritic
            }
            cleaned.append(ch);
        }
        
        // 3. Create a new stream with the cleaned text and hand it back
        return CharStreams.fromString(cleaned.toString(), input.getSourceName());
    }
}
