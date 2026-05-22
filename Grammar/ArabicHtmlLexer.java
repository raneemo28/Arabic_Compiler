// Generated from ../Lexer/ArabicHtmlLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
//import org.antlr.v4.runtime.LexerATNSimulator;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArabicHtmlLexer extends ArabicLexerBase {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLOSE_TAG=1, OPEN_TAG=2, TEXT=3, WS=4, COMMENT=5, LINE_COMMENT=6, LBRACE=7, 
		RBRACE=8, COLON=9, SEMI=10, COMMA=11, DOT=12, HASH=13, LPAREN=14, RPAREN=15, 
		PLUS=16, MINUS=17, STAR=18, SLASH=19, PERCENT=20, GT=21, LT=22, TILDE=23, 
		BANG=24, DBL_COLON=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLOSE_TAG", "OPEN_TAG", "TEXT", "ARABIC_LETTER", "ARABIC_ID", "WS", 
			"COMMENT", "LINE_COMMENT", "LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", 
			"DOT", "HASH", "LPAREN", "RPAREN", "PLUS", "MINUS", "STAR", "SLASH", 
			"PERCENT", "GT", "LT", "TILDE", "BANG", "DBL_COLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'{'", "'}'", "':'", "'\\u061B'", 
			"'\\u060C'", "'.'", "'#'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'>'", "'<'", "'~'", "'!'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLOSE_TAG", "OPEN_TAG", "TEXT", "WS", "COMMENT", "LINE_COMMENT", 
			"LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", "DOT", "HASH", "LPAREN", 
			"RPAREN", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "GT", "LT", "TILDE", 
			"BANG", "DBL_COLON"
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


	public ArabicHtmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArabicHtmlLexer.g4"; }

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
		"\u0004\u0000\u0019\u0094\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002"+
		"C\b\u0002\u000b\u0002\f\u0002D\u0001\u0003\u0001\u0003\u0001\u0004\u0004"+
		"\u0004J\b\u0004\u000b\u0004\f\u0004K\u0001\u0005\u0004\u0005O\b\u0005"+
		"\u000b\u0005\f\u0005P\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006Y\b\u0006\n\u0006\f\u0006\\\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007g\b\u0007\n\u0007\f\u0007"+
		"j\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001Z\u0000\u001b\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0000\t\u0000\u000b\u0004\r\u0005\u000f\u0006\u0011"+
		"\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e"+
		"!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u00161\u00173\u0018"+
		"5\u0019\u0001\u0000\u0004\u0001\u0000<<\u0001\u0000\u0621\u064a\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0096\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u0003=\u0001\u0000\u0000"+
		"\u0000\u0005B\u0001\u0000\u0000\u0000\u0007F\u0001\u0000\u0000\u0000\t"+
		"I\u0001\u0000\u0000\u0000\u000bN\u0001\u0000\u0000\u0000\rT\u0001\u0000"+
		"\u0000\u0000\u000fb\u0001\u0000\u0000\u0000\u0011m\u0001\u0000\u0000\u0000"+
		"\u0013o\u0001\u0000\u0000\u0000\u0015q\u0001\u0000\u0000\u0000\u0017s"+
		"\u0001\u0000\u0000\u0000\u0019u\u0001\u0000\u0000\u0000\u001bw\u0001\u0000"+
		"\u0000\u0000\u001dy\u0001\u0000\u0000\u0000\u001f{\u0001\u0000\u0000\u0000"+
		"!}\u0001\u0000\u0000\u0000#\u007f\u0001\u0000\u0000\u0000%\u0081\u0001"+
		"\u0000\u0000\u0000\'\u0083\u0001\u0000\u0000\u0000)\u0085\u0001\u0000"+
		"\u0000\u0000+\u0087\u0001\u0000\u0000\u0000-\u0089\u0001\u0000\u0000\u0000"+
		"/\u008b\u0001\u0000\u0000\u00001\u008d\u0001\u0000\u0000\u00003\u008f"+
		"\u0001\u0000\u0000\u00005\u0091\u0001\u0000\u0000\u000078\u0005<\u0000"+
		"\u000089\u0005/\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0003\t\u0004"+
		"\u0000;<\u0005>\u0000\u0000<\u0002\u0001\u0000\u0000\u0000=>\u0005<\u0000"+
		"\u0000>?\u0003\t\u0004\u0000?@\u0005>\u0000\u0000@\u0004\u0001\u0000\u0000"+
		"\u0000AC\b\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0006\u0001"+
		"\u0000\u0000\u0000FG\u0007\u0001\u0000\u0000G\b\u0001\u0000\u0000\u0000"+
		"HJ\u0003\u0007\u0003\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\n\u0001\u0000"+
		"\u0000\u0000MO\u0007\u0002\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RS\u0006\u0005\u0000\u0000S\f\u0001\u0000\u0000"+
		"\u0000TU\u0005/\u0000\u0000UV\u0005*\u0000\u0000VZ\u0001\u0000\u0000\u0000"+
		"WY\t\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005*\u0000\u0000^_\u0005/"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0006\u0006\u0000\u0000a\u000e"+
		"\u0001\u0000\u0000\u0000bc\u0005/\u0000\u0000cd\u0005/\u0000\u0000dh\u0001"+
		"\u0000\u0000\u0000eg\b\u0003\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0006\u0007\u0000"+
		"\u0000l\u0010\u0001\u0000\u0000\u0000mn\u0005{\u0000\u0000n\u0012\u0001"+
		"\u0000\u0000\u0000op\u0005}\u0000\u0000p\u0014\u0001\u0000\u0000\u0000"+
		"qr\u0005:\u0000\u0000r\u0016\u0001\u0000\u0000\u0000st\u0005\u061b\u0000"+
		"\u0000t\u0018\u0001\u0000\u0000\u0000uv\u0005\u060c\u0000\u0000v\u001a"+
		"\u0001\u0000\u0000\u0000wx\u0005.\u0000\u0000x\u001c\u0001\u0000\u0000"+
		"\u0000yz\u0005#\u0000\u0000z\u001e\u0001\u0000\u0000\u0000{|\u0005(\u0000"+
		"\u0000| \u0001\u0000\u0000\u0000}~\u0005)\u0000\u0000~\"\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005+\u0000\u0000\u0080$\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005-\u0000\u0000\u0082&\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"*\u0000\u0000\u0084(\u0001\u0000\u0000\u0000\u0085\u0086\u0005/\u0000"+
		"\u0000\u0086*\u0001\u0000\u0000\u0000\u0087\u0088\u0005%\u0000\u0000\u0088"+
		",\u0001\u0000\u0000\u0000\u0089\u008a\u0005>\u0000\u0000\u008a.\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005<\u0000\u0000\u008c0\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005~\u0000\u0000\u008e2\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005!\u0000\u0000\u00904\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		":\u0000\u0000\u0092\u0093\u0005:\u0000\u0000\u00936\u0001\u0000\u0000"+
		"\u0000\u0006\u0000DKPZh\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}