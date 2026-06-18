import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.misc.Interval;
import java.util.ArrayList;
import java.util.List;

public class ArabicCharStream implements CharStream {
    
    private final String originalData;
    private final int[] cleanToOrig;
    private final int[] cleanToOrigLine;
    private final int[] cleanToOrigCol;
    private final int cleanSize;
    
    private int p;

    private static boolean isDiacritic(int codePoint) {
        return (codePoint >= 0x064B && codePoint <= 0x065F) || codePoint == 0x0670;
    }

    public ArabicCharStream(String data) {
        this.originalData = data;
        
        List<Integer> mapping = new ArrayList<>();
        List<Integer> origLines = new ArrayList<>();
        List<Integer> origCols = new ArrayList<>();
        
        int currentLine = 1;
        int currentCol = 0;
        
        for (int i = 0; i < data.length(); ) {
            int codePoint = data.codePointAt(i);
            
            if (!isDiacritic(codePoint)) {
                mapping.add(i);
                origLines.add(currentLine);
                origCols.add(currentCol);
            }
            
            if (codePoint == '\n') {
                currentLine++;
                currentCol = 0;
            } else {
                currentCol++;
            }
            
            i += Character.charCount(codePoint);
        }
        
        this.cleanSize = mapping.size();
        this.cleanToOrig = new int[cleanSize];
        this.cleanToOrigLine = new int[cleanSize];
        this.cleanToOrigCol = new int[cleanSize];
        
        for (int i = 0; i < cleanSize; i++) {
            this.cleanToOrig[i] = mapping.get(i);
            this.cleanToOrigLine[i] = origLines.get(i);
            this.cleanToOrigCol[i] = origCols.get(i);
        }
        
        this.p = 0;
    }

    public int getOriginalLine() {
        if (p < cleanSize) {
            return cleanToOrigLine[p];
        }
        return cleanSize > 0 ? cleanToOrigLine[cleanSize - 1] : 1;
    }

    public int getOriginalColumn() {
        if (p < cleanSize) {
            return cleanToOrigCol[p];
        }
        return cleanSize > 0 ? cleanToOrigCol[cleanSize - 1] + 1 : 0;
    }

    @Override
    public int LA(int i) {
        if (i == 0) return 0;
        int targetCleanIdx = p + i - 1;
        if (targetCleanIdx < 0 || targetCleanIdx >= cleanSize) {
            return CharStream.EOF;
        }
        int origIdx = cleanToOrig[targetCleanIdx];
        return originalData.codePointAt(origIdx);
    }

    @Override
    public void consume() {
        if (p >= cleanSize) {
            throw new IllegalStateException("cannot consume EOF");
        }
        p++;
    }

    @Override
    public int mark() {
        return -1;
    }

    @Override
    public void release(int marker) {
    }

    @Override
    public int index() {
        return p;
    }

    @Override
    public void seek(int index) {
        if (index < 0) index = 0;
        if (index > cleanSize) index = cleanSize;
        p = index;
    }

    @Override
    public int size() {
        return cleanSize;
    }

    @Override
    public String getSourceName() {
        return "ArabicCharStream";
    }

    @Override
    public String getText(Interval interval) {
        int start = interval.a;
        int stop = interval.b;
        
        if (stop >= cleanSize) stop = cleanSize - 1;
        if (start >= cleanSize || start > stop) {
            return "";
        }
        
        int origStart = cleanToOrig[start];
        int origStop = cleanToOrig[stop];
        
        int nextOrigIdx = (stop + 1 < cleanSize) ? cleanToOrig[stop + 1] : originalData.length();
        
        StringBuilder sb = new StringBuilder();
        for (int i = origStart; i < nextOrigIdx; ) {
            int codePoint = originalData.codePointAt(i);
            if (!isDiacritic(codePoint)) {
                sb.appendCodePoint(codePoint);
            }
            i += Character.charCount(codePoint);
        }
        
        return sb.toString();
    }
}