// Generated from e:/compiler's project/Arabic_Compiler/Arabic_Compiler/Grammar/CommonLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CommonLexer extends ArabicLexerBase {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LINE_COMMENT=3, LBRACE=4, RBRACE=5, COLON=6, SEMI=7, 
		COMMA=8, DOT=9, HASH=10, LPAREN=11, RPAREN=12, PLUS=13, MINUS=14, STAR=15, 
		SLASH=16, PERCENT=17, GT=18, LT=19, TILDE=20, BANG=21, DBL_COLON=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARABIC_CHAR", "ENGLISH_CHAR", "LETTER", "DIGIT", "ID_SYMBOL", "ARABIC_WORD", 
			"ID_START", "ID_CONTINUE", "WS", "COMMENT", "LINE_COMMENT", "LBRACE", 
			"RBRACE", "COLON", "SEMI", "COMMA", "DOT", "HASH", "LPAREN", "RPAREN", 
			"PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "GT", "LT", "TILDE", "BANG", 
			"DBL_COLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'{'", "'}'", "':'", "'\\u061B'", "'\\u060C'", 
			"'.'", "'#'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", 
			"'<'", "'~'", "'!'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "LINE_COMMENT", "LBRACE", "RBRACE", "COLON", "SEMI", 
			"COMMA", "DOT", "HASH", "LPAREN", "RPAREN", "PLUS", "MINUS", "STAR", 
			"SLASH", "PERCENT", "GT", "LT", "TILDE", "BANG", "DBL_COLON"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002D\b\u0002\u0001\u0003\u0003\u0003G\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0004\u0005L\b\u0005\u000b\u0005\f\u0005M\u0001\u0006"+
		"\u0001\u0006\u0003\u0006R\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007X\b\u0007\u0001\b\u0004\b[\b\b\u000b\b\f\b\\\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\te\b\t\n\t\f\th\t\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\ns\b\n\n\n\f\nv\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001f\u0000\u001e"+
		"\u0001\u0000\u0003\u0000\u0005\u0000\u0007\u0000\t\u0000\u000b\u0000\r"+
		"\u0000\u000f\u0000\u0011\u0001\u0013\u0002\u0015\u0003\u0017\u0004\u0019"+
		"\u0005\u001b\u0006\u001d\u0007\u001f\b!\t#\n%\u000b\'\f)\r+\u000e-\u000f"+
		"/\u00101\u00113\u00125\u00137\u00149\u0015;\u0016\u0001\u0000\u0006\u0001"+
		"\u0000\u0621\u064a\u0002\u0000AZaz\u0002\u000009\u0660\u0669\u0002\u0000"+
		"$$__\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00a0\u0000\u0011\u0001"+
		"\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001"+
		"\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001"+
		"\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000"+
		"\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000"+
		"\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000"+
		"+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001"+
		"\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000"+
		"\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u0000"+
		"9\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0001=\u0001"+
		"\u0000\u0000\u0000\u0003?\u0001\u0000\u0000\u0000\u0005C\u0001\u0000\u0000"+
		"\u0000\u0007F\u0001\u0000\u0000\u0000\tH\u0001\u0000\u0000\u0000\u000b"+
		"K\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000\u0000\u000fW\u0001\u0000"+
		"\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000\u0013`\u0001\u0000\u0000\u0000"+
		"\u0015n\u0001\u0000\u0000\u0000\u0017y\u0001\u0000\u0000\u0000\u0019{"+
		"\u0001\u0000\u0000\u0000\u001b}\u0001\u0000\u0000\u0000\u001d\u007f\u0001"+
		"\u0000\u0000\u0000\u001f\u0081\u0001\u0000\u0000\u0000!\u0083\u0001\u0000"+
		"\u0000\u0000#\u0085\u0001\u0000\u0000\u0000%\u0087\u0001\u0000\u0000\u0000"+
		"\'\u0089\u0001\u0000\u0000\u0000)\u008b\u0001\u0000\u0000\u0000+\u008d"+
		"\u0001\u0000\u0000\u0000-\u008f\u0001\u0000\u0000\u0000/\u0091\u0001\u0000"+
		"\u0000\u00001\u0093\u0001\u0000\u0000\u00003\u0095\u0001\u0000\u0000\u0000"+
		"5\u0097\u0001\u0000\u0000\u00007\u0099\u0001\u0000\u0000\u00009\u009b"+
		"\u0001\u0000\u0000\u0000;\u009d\u0001\u0000\u0000\u0000=>\u0007\u0000"+
		"\u0000\u0000>\u0002\u0001\u0000\u0000\u0000?@\u0007\u0001\u0000\u0000"+
		"@\u0004\u0001\u0000\u0000\u0000AD\u0003\u0001\u0000\u0000BD\u0003\u0003"+
		"\u0001\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0006"+
		"\u0001\u0000\u0000\u0000EG\u0007\u0002\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000G\b\u0001\u0000\u0000\u0000HI\u0007\u0003\u0000\u0000I\n\u0001\u0000"+
		"\u0000\u0000JL\u0003\u0001\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\f\u0001\u0000\u0000\u0000OR\u0003\u0005\u0002\u0000PR\u0003\t\u0004"+
		"\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\u000e\u0001"+
		"\u0000\u0000\u0000SX\u0003\u0005\u0002\u0000TX\u0003\u0007\u0003\u0000"+
		"UX\u0003\t\u0004\u0000VX\u0005-\u0000\u0000WS\u0001\u0000\u0000\u0000"+
		"WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000X\u0010\u0001\u0000\u0000\u0000Y[\u0007\u0004\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0006\b\u0000"+
		"\u0000_\u0012\u0001\u0000\u0000\u0000`a\u0005/\u0000\u0000ab\u0005*\u0000"+
		"\u0000bf\u0001\u0000\u0000\u0000ce\t\u0000\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005"+
		"*\u0000\u0000jk\u0005/\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0006\t"+
		"\u0000\u0000m\u0014\u0001\u0000\u0000\u0000no\u0005/\u0000\u0000op\u0005"+
		"/\u0000\u0000pt\u0001\u0000\u0000\u0000qs\b\u0005\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000wx\u0006\n\u0000\u0000x\u0016\u0001\u0000\u0000\u0000yz\u0005{\u0000"+
		"\u0000z\u0018\u0001\u0000\u0000\u0000{|\u0005}\u0000\u0000|\u001a\u0001"+
		"\u0000\u0000\u0000}~\u0005:\u0000\u0000~\u001c\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005\u061b\u0000\u0000\u0080\u001e\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u060c\u0000\u0000\u0082 \u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005.\u0000\u0000\u0084\"\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005#\u0000\u0000\u0086$\u0001\u0000\u0000\u0000\u0087\u0088\u0005("+
		"\u0000\u0000\u0088&\u0001\u0000\u0000\u0000\u0089\u008a\u0005)\u0000\u0000"+
		"\u008a(\u0001\u0000\u0000\u0000\u008b\u008c\u0005+\u0000\u0000\u008c*"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005-\u0000\u0000\u008e,\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005*\u0000\u0000\u0090.\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0005/\u0000\u0000\u00920\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005%\u0000\u0000\u00942\u0001\u0000\u0000\u0000\u0095\u0096\u0005>"+
		"\u0000\u0000\u00964\u0001\u0000\u0000\u0000\u0097\u0098\u0005<\u0000\u0000"+
		"\u00986\u0001\u0000\u0000\u0000\u0099\u009a\u0005~\u0000\u0000\u009a8"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005!\u0000\u0000\u009c:\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005:\u0000\u0000\u009e\u009f\u0005:\u0000\u0000"+
		"\u009f<\u0001\u0000\u0000\u0000\t\u0000CFMQW\\ft\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}