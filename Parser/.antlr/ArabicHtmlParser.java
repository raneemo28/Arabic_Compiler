// Generated from c:/Users/Asus/Desktop/Arabic_Compiler/Parser/ArabicHtmlParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArabicHtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, CLOSE_TAG=2, OPEN_TAG=3, TEXT=4, WS=5;
	public static final int
		RULE_document = 0, RULE_element = 1, RULE_tagElement = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "element", "tagElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "CLOSE_TAG", "OPEN_TAG", "TEXT", "WS"
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

	@Override
	public String getGrammarFileName() { return "ArabicHtmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArabicHtmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ArabicHtmlParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_TAG || _la==TEXT) {
				{
				{
				setState(6);
				element();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public TagElementContext tagElement() {
			return getRuleContext(TagElementContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(ArabicHtmlParser.TEXT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				tagElement();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagElementContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(ArabicHtmlParser.OPEN_TAG, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(ArabicHtmlParser.CLOSE_TAG, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TagElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagElement; }
	}

	public final TagElementContext tagElement() throws RecognitionException {
		TagElementContext _localctx = new TagElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tagElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(OPEN_TAG);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_TAG || _la==TEXT) {
				{
				{
				setState(19);
				element();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0005\u001c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0005\u0000\b\b\u0000\n\u0000\f\u0000"+
		"\u000b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0011\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u0015\b\u0002\n\u0002"+
		"\f\u0002\u0018\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0000\u0000"+
		"\u0003\u0000\u0002\u0004\u0000\u0000\u001b\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0002\u0010\u0001\u0000\u0000\u0000\u0004\u0012\u0001\u0000\u0000\u0000"+
		"\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000\u0000\u0000\b"+
		"\u000b\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001"+
		"\u0000\u0000\u0000\n\f\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000"+
		"\u0000\f\r\u0005\u0000\u0000\u0001\r\u0001\u0001\u0000\u0000\u0000\u000e"+
		"\u0011\u0003\u0004\u0002\u0000\u000f\u0011\u0005\u0004\u0000\u0000\u0010"+
		"\u000e\u0001\u0000\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011"+
		"\u0003\u0001\u0000\u0000\u0000\u0012\u0016\u0005\u0003\u0000\u0000\u0013"+
		"\u0015\u0003\u0002\u0001\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000\u0018"+
		"\u0016\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a"+
		"\u0005\u0001\u0000\u0000\u0000\u0003\t\u0010\u0016";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}