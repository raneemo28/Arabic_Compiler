// Generated from e:/compiler's project/Arabic_Compiler/Arabic_Compiler/Grammar/ArabicHtml.g4 by ANTLR 4.13.1
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
		LINE_COMMENT=1, WS=2, CLOSE_TAG=3, OPEN_TAG_START=4, SELF_CLOSE_END=5, 
		ATTR_ID=6, ATTR_CLASS=7, ATTR_SRC=8, ATTR_HREF=9, TS_VAR=10, TS_LET=11, 
		TS_CONST=12, TS_STRING_KW=13, TS_NUMBER_KW=14, TS_BOOLEAN_KW=15, TS_ANY_KW=16, 
		TS_ASSIGN=17, TS_ELEMENT=18, CSS_UNIT=19, NUMBER=20, STRING=21, LBRACE=22, 
		RBRACE=23, LBRACK=24, RBRACK=25, COLON=26, SEMI=27, COMMA=28, HASH=29, 
		DOT=30, GT=31, IDENTIFIER=32;
	public static final int
		RULE_program = 0, RULE_htmlElement = 1, RULE_htmlContent = 2, RULE_attribute = 3, 
		RULE_text = 4, RULE_cssRule = 5, RULE_selector = 6, RULE_declarationList = 7, 
		RULE_declaration = 8, RULE_cssProperty = 9, RULE_cssValue = 10, RULE_tsStatement = 11, 
		RULE_tsDeclaration = 12, RULE_tsType = 13, RULE_expression = 14, RULE_arrayLiteral = 15, 
		RULE_identifier = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "htmlElement", "htmlContent", "attribute", "text", "cssRule", 
			"selector", "declarationList", "declaration", "cssProperty", "cssValue", 
			"tsStatement", "tsDeclaration", "tsType", "expression", "arrayLiteral", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'/>'", "'\\u0645\\u0639\\u0631\\u0641'", 
			"'\\u0635\\u0646\\u0641'", "'\\u0645\\u0635\\u062F\\u0631'", "'\\u0648\\u062C\\u0647\\u0629'", 
			"'\\u0645\\u062A\\u063A\\u064A\\u0631'", "'\\u062F\\u0639'", "'\\u062B\\u0627\\u0628\\u062A'", 
			"'\\u0633\\u0644\\u0633\\u0644\\u0629'", "'\\u0639\\u062F\\u062F'", "'\\u0645\\u0646\\u0637\\u0642\\u064A'", 
			"'\\u0627\\u064A'", "'='", "'\\u0639\\u0646\\u0635\\u0631'", null, null, 
			null, "'{'", "'}'", "'['", "']'", "':'", "'\\u061B'", "'\\u060C'", "'#'", 
			"'.'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "WS", "CLOSE_TAG", "OPEN_TAG_START", "SELF_CLOSE_END", 
			"ATTR_ID", "ATTR_CLASS", "ATTR_SRC", "ATTR_HREF", "TS_VAR", "TS_LET", 
			"TS_CONST", "TS_STRING_KW", "TS_NUMBER_KW", "TS_BOOLEAN_KW", "TS_ANY_KW", 
			"TS_ASSIGN", "TS_ELEMENT", "CSS_UNIT", "NUMBER", "STRING", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "COLON", "SEMI", "COMMA", "HASH", "DOT", 
			"GT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "ArabicHtml.g4"; }

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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ArabicHtmlParser.EOF, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public List<TsStatementContext> tsStatement() {
			return getRuleContexts(TsStatementContext.class);
		}
		public TsStatementContext tsStatement(int i) {
			return getRuleContext(TsStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5905849360L) != 0)) {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_TAG_START:
					{
					setState(34);
					htmlElement();
					}
					break;
				case TS_ELEMENT:
				case HASH:
				case DOT:
				case IDENTIFIER:
					{
					setState(35);
					cssRule();
					}
					break;
				case TS_VAR:
				case TS_LET:
				case TS_CONST:
					{
					setState(36);
					tsStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG_START() { return getToken(ArabicHtmlParser.OPEN_TAG_START, 0); }
		public TerminalNode GT() { return getToken(ArabicHtmlParser.GT, 0); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode CLOSE_TAG() { return getToken(ArabicHtmlParser.CLOSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SELF_CLOSE_END() { return getToken(ArabicHtmlParser.SELF_CLOSE_END, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElement);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(OPEN_TAG_START);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) {
					{
					{
					setState(45);
					attribute();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(GT);
				setState(52);
				htmlContent();
				setState(53);
				match(CLOSE_TAG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(OPEN_TAG_START);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) {
					{
					{
					setState(56);
					attribute();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(SELF_CLOSE_END);
				}
				break;
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
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4298113040L) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_TAG_START:
					{
					setState(65);
					htmlElement();
					}
					break;
				case NUMBER:
				case STRING:
				case IDENTIFIER:
					{
					setState(66);
					text();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode TS_ASSIGN() { return getToken(ArabicHtmlParser.TS_ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public TerminalNode ATTR_ID() { return getToken(ArabicHtmlParser.ATTR_ID, 0); }
		public TerminalNode ATTR_CLASS() { return getToken(ArabicHtmlParser.ATTR_CLASS, 0); }
		public TerminalNode ATTR_SRC() { return getToken(ArabicHtmlParser.ATTR_SRC, 0); }
		public TerminalNode ATTR_HREF() { return getToken(ArabicHtmlParser.ATTR_HREF, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(73);
			match(TS_ASSIGN);
			setState(74);
			match(STRING);
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
	public static class TextContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(ArabicHtmlParser.NUMBER, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4298113024L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class CssRuleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ArabicHtmlParser.LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ArabicHtmlParser.RBRACE, 0); }
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cssRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			selector();
			setState(79);
			match(LBRACE);
			setState(80);
			declarationList();
			setState(81);
			match(RBRACE);
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
	public static class SelectorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode HASH() { return getToken(ArabicHtmlParser.HASH, 0); }
		public TerminalNode DOT() { return getToken(ArabicHtmlParser.DOT, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selector);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TS_ELEMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				identifier();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(HASH);
				setState(85);
				identifier();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(DOT);
				setState(87);
				identifier();
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
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ArabicHtmlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ArabicHtmlParser.SEMI, i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(90);
				declaration();
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(91);
						match(SEMI);
						setState(92);
						declaration();
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(100);
				match(SEMI);
				}
			}

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
	public static class DeclarationContext extends ParserRuleContext {
		public CssPropertyContext cssProperty() {
			return getRuleContext(CssPropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ArabicHtmlParser.COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			cssProperty();
			setState(104);
			match(COLON);
			setState(105);
			cssValue();
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
	public static class CssPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cssProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IDENTIFIER);
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
	public static class CssValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(ArabicHtmlParser.NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(ArabicHtmlParser.CSS_UNIT, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cssValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4298637312L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class TsStatementContext extends ParserRuleContext {
		public TsDeclarationContext tsDeclaration() {
			return getRuleContext(TsDeclarationContext.class,0);
		}
		public TsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsStatement; }
	}

	public final TsStatementContext tsStatement() throws RecognitionException {
		TsStatementContext _localctx = new TsStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			tsDeclaration();
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
	public static class TsDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ArabicHtmlParser.COLON, 0); }
		public TsTypeContext tsType() {
			return getRuleContext(TsTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArabicHtmlParser.SEMI, 0); }
		public TerminalNode TS_VAR() { return getToken(ArabicHtmlParser.TS_VAR, 0); }
		public TerminalNode TS_LET() { return getToken(ArabicHtmlParser.TS_LET, 0); }
		public TerminalNode TS_CONST() { return getToken(ArabicHtmlParser.TS_CONST, 0); }
		public TerminalNode TS_ASSIGN() { return getToken(ArabicHtmlParser.TS_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(ArabicHtmlParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ArabicHtmlParser.RBRACK, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsDeclaration; }
	}

	public final TsDeclarationContext tsDeclaration() throws RecognitionException {
		TsDeclarationContext _localctx = new TsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tsDeclaration);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				identifier();
				setState(115);
				match(COLON);
				setState(116);
				tsType();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TS_ASSIGN) {
					{
					setState(117);
					match(TS_ASSIGN);
					setState(118);
					expression();
					}
				}

				setState(121);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				identifier();
				setState(125);
				match(COLON);
				setState(126);
				tsType();
				setState(127);
				match(LBRACK);
				setState(128);
				match(RBRACK);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TS_ASSIGN) {
					{
					setState(129);
					match(TS_ASSIGN);
					setState(130);
					arrayLiteral();
					}
				}

				setState(133);
				match(SEMI);
				}
				break;
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
	public static class TsTypeContext extends ParserRuleContext {
		public TerminalNode TS_STRING_KW() { return getToken(ArabicHtmlParser.TS_STRING_KW, 0); }
		public TerminalNode TS_NUMBER_KW() { return getToken(ArabicHtmlParser.TS_NUMBER_KW, 0); }
		public TerminalNode TS_BOOLEAN_KW() { return getToken(ArabicHtmlParser.TS_BOOLEAN_KW, 0); }
		public TerminalNode TS_ANY_KW() { return getToken(ArabicHtmlParser.TS_ANY_KW, 0); }
		public TsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsType; }
	}

	public final TsTypeContext tsType() throws RecognitionException {
		TsTypeContext _localctx = new TsTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tsType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ArabicHtmlParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(STRING);
				}
				break;
			case TS_ELEMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				identifier();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				arrayLiteral();
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ArabicHtmlParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ArabicHtmlParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArabicHtmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArabicHtmlParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LBRACK);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4315152384L) != 0)) {
				{
				setState(146);
				expression();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(147);
					match(COMMA);
					setState(148);
					expression();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(156);
			match(RBRACK);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode TS_ELEMENT() { return getToken(ArabicHtmlParser.TS_ELEMENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==TS_ELEMENT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\u0004\u0001 \u00a1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		":\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001\u0003\u0001@\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0005\u0002D\b\u0002\n\u0002\f\u0002G\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007^\b\u0007\n\u0007\f\u0007a\t"+
		"\u0007\u0003\u0007c\b\u0007\u0001\u0007\u0003\u0007f\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fx\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0084\b\f\u0001\f\u0001\f\u0003\f\u0088\b\f\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0090\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0096\b\u000f"+
		"\n\u000f\f\u000f\u0099\t\u000f\u0003\u000f\u009b\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0006\u0001\u0000\u0006\t\u0002\u0000\u0014\u0015  \u0002\u0000"+
		"\u0013\u0015  \u0001\u0000\n\f\u0001\u0000\r\u0010\u0002\u0000\u0012\u0012"+
		"  \u00a4\u0000\'\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000"+
		"\u0004E\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bL\u0001"+
		"\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000"+
		"\u000eb\u0001\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012k"+
		"\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016o\u0001\u0000"+
		"\u0000\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u0089\u0001\u0000"+
		"\u0000\u0000\u001c\u008f\u0001\u0000\u0000\u0000\u001e\u0091\u0001\u0000"+
		"\u0000\u0000 \u009e\u0001\u0000\u0000\u0000\"&\u0003\u0002\u0001\u0000"+
		"#&\u0003\n\u0005\u0000$&\u0003\u0016\u000b\u0000%\"\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000"+
		"\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0000\u0000\u0001"+
		"+\u0001\u0001\u0000\u0000\u0000,0\u0005\u0004\u0000\u0000-/\u0003\u0006"+
		"\u0003\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000034\u0005\u001f\u0000\u000045\u0003\u0004\u0002"+
		"\u000056\u0005\u0003\u0000\u00006@\u0001\u0000\u0000\u00007;\u0005\u0004"+
		"\u0000\u00008:\u0003\u0006\u0003\u000098\u0001\u0000\u0000\u0000:=\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>@\u0005\u0005\u0000"+
		"\u0000?,\u0001\u0000\u0000\u0000?7\u0001\u0000\u0000\u0000@\u0003\u0001"+
		"\u0000\u0000\u0000AD\u0003\u0002\u0001\u0000BD\u0003\b\u0004\u0000CA\u0001"+
		"\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0005\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0007\u0000\u0000\u0000IJ\u0005"+
		"\u0011\u0000\u0000JK\u0005\u0015\u0000\u0000K\u0007\u0001\u0000\u0000"+
		"\u0000LM\u0007\u0001\u0000\u0000M\t\u0001\u0000\u0000\u0000NO\u0003\f"+
		"\u0006\u0000OP\u0005\u0016\u0000\u0000PQ\u0003\u000e\u0007\u0000QR\u0005"+
		"\u0017\u0000\u0000R\u000b\u0001\u0000\u0000\u0000SY\u0003 \u0010\u0000"+
		"TU\u0005\u001d\u0000\u0000UY\u0003 \u0010\u0000VW\u0005\u001e\u0000\u0000"+
		"WY\u0003 \u0010\u0000XS\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000Y\r\u0001\u0000\u0000\u0000Z_\u0003\u0010\b"+
		"\u0000[\\\u0005\u001b\u0000\u0000\\^\u0003\u0010\b\u0000][\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bZ\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000"+
		"\u0000df\u0005\u001b\u0000\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000f\u000f\u0001\u0000\u0000\u0000gh\u0003\u0012\t\u0000hi\u0005"+
		"\u001a\u0000\u0000ij\u0003\u0014\n\u0000j\u0011\u0001\u0000\u0000\u0000"+
		"kl\u0005 \u0000\u0000l\u0013\u0001\u0000\u0000\u0000mn\u0007\u0002\u0000"+
		"\u0000n\u0015\u0001\u0000\u0000\u0000op\u0003\u0018\f\u0000p\u0017\u0001"+
		"\u0000\u0000\u0000qr\u0007\u0003\u0000\u0000rs\u0003 \u0010\u0000st\u0005"+
		"\u001a\u0000\u0000tw\u0003\u001a\r\u0000uv\u0005\u0011\u0000\u0000vx\u0003"+
		"\u001c\u000e\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yz\u0005\u001b\u0000\u0000z\u0088\u0001\u0000"+
		"\u0000\u0000{|\u0007\u0003\u0000\u0000|}\u0003 \u0010\u0000}~\u0005\u001a"+
		"\u0000\u0000~\u007f\u0003\u001a\r\u0000\u007f\u0080\u0005\u0018\u0000"+
		"\u0000\u0080\u0083\u0005\u0019\u0000\u0000\u0081\u0082\u0005\u0011\u0000"+
		"\u0000\u0082\u0084\u0003\u001e\u000f\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\u001b\u0000\u0000\u0086\u0088\u0001\u0000\u0000"+
		"\u0000\u0087q\u0001\u0000\u0000\u0000\u0087{\u0001\u0000\u0000\u0000\u0088"+
		"\u0019\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0004\u0000\u0000\u008a"+
		"\u001b\u0001\u0000\u0000\u0000\u008b\u0090\u0005\u0014\u0000\u0000\u008c"+
		"\u0090\u0005\u0015\u0000\u0000\u008d\u0090\u0003 \u0010\u0000\u008e\u0090"+
		"\u0003\u001e\u000f\u0000\u008f\u008b\u0001\u0000\u0000\u0000\u008f\u008c"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u001d\u0001\u0000\u0000\u0000\u0091\u009a"+
		"\u0005\u0018\u0000\u0000\u0092\u0097\u0003\u001c\u000e\u0000\u0093\u0094"+
		"\u0005\u001c\u0000\u0000\u0094\u0096\u0003\u001c\u000e\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009b"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u0092"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0019\u0000\u0000\u009d\u001f"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0005\u0000\u0000\u009f!\u0001"+
		"\u0000\u0000\u0000\u0011%\'0;?CEX_bew\u0083\u0087\u008f\u0097\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}