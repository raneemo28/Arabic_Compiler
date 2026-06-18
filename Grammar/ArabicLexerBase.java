import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.misc.Interval;

/**
 * Base class that strips Arabic diacritics (Tashkeel) from the input 
 * *before* ANTLR tokenises it, while preserving accurate line/column tracking.
 */
public abstract class ArabicLexerBase extends Lexer {

    // Removed the PrintStream constructor as ANTLR4 Java Lexer doesn't support it
    public ArabicLexerBase(CharStream input) {
        super(wrapStream(input));
    }

    private static CharStream wrapStream(CharStream input) {
        if (input instanceof ArabicCharStream) {
            return input;
        }
        
        // Extract the original text safely from the provided stream
        input.seek(0);
        String rawText = input.getText(Interval.of(0, input.size() - 1));
        
        // Wrap the original text in our custom stream
        return new ArabicCharStream(rawText);
    }

    /**
     * Overrides the default Lexer line tracking to return the 
     * precomputed original line number from the un-diacriticized text.
     */
    @Override
    public int getLine() {
        if (_input instanceof ArabicCharStream) {
            return ((ArabicCharStream) _input).getOriginalLine();
        }
        return super.getLine();
    }

    /**
     * Overrides the default Lexer column tracking to return the 
     * precomputed original column number from the un-diacriticized text.
     */
    @Override
    public int getCharPositionInLine() {
        if (_input instanceof ArabicCharStream) {
            return ((ArabicCharStream) _input).getOriginalColumn();
        }
        return super.getCharPositionInLine();
    }
}