// Generated from ArabicWebParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArabicWebParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DISPLAY=1, POSITION=2, WIDTH=3, HEIGHT=4, MAX_WIDTH=5, MIN_WIDTH=6, MAX_HEIGHT=7, 
		MIN_HEIGHT=8, MARGIN=9, PADDING=10, BORDER=11, VISIBILITY=12, OVERFLOW=13, 
		Z_INDEX=14, BOX_SIZING=15, FLEX=16, FLEX_DIR=17, FLEX_WRAP=18, FLEX_GROW=19, 
		FLEX_SHRINK=20, GRID=21, GRID_TEMPLATE=22, GAP=23, JUSTIFY_CONT=24, ALIGN_ITEMS=25, 
		ALIGN_SELF=26, ORDER=27, COLOR=28, BACKGROUND=29, BG_IMAGE=30, BG_COLOR=31, 
		BG_SIZE=32, BG_REPEAT=33, BG_ATTACH=34, BG_CLIP=35, OPACITY=36, BOX_SHADOW=37, 
		FONT_FAMILY=38, FONT_SIZE=39, FONT_WEIGHT=40, FONT_STYLE=41, TEXT_ALIGN=42, 
		TEXT_DECOR=43, TEXT_TRANS=44, TEXT_SHADOW=45, TEXT_INDENT=46, LINE_HEIGHT=47, 
		LETTER_SPACING=48, WORD_SPACING=49, WHITE_SPACE=50, DIRECTION=51, WRITING_MODE=52, 
		BORDER_RADIUS=53, BORDER_WIDTH=54, BORDER_STYLE=55, BORDER_COLOR=56, OUTLINE=57, 
		TOP=58, BOTTOM=59, RIGHT=60, LEFT=61, MEDIA=62, LIST_STYLE=63, BORDER_COLLAPSE=64, 
		TABLE_LAYOUT=65, CAPTION_SIDE=66, FILTER=67, BACKDROP_FILT=68, HOVER=69, 
		ACTIVE=70, FOCUS=71, VISITED=72, ENABLED=73, DISABLED=74, CHECKED=75, 
		BEFORE=76, AFTER=77, PLACEHOLDER=78, SELECTION=79, INHERIT=80, INITIAL=81, 
		UNSET=82, NONE=83, AUTO=84, CENTER=85, SOLID=86, DASHED=87, DOTTED=88, 
		DOUBLE=89, KW_HIDDEN=90, BLOCK=91, INLINE=92, FLEX_VALUE=93, ABSOLUTE=94, 
		RELATIVE=95, FIXED=96, STICKY=97, ROW=98, COLUMN=99, WRAP=100, POINTER=101, 
		BOLD=102, ITALIC=103, IMPORTANT=104, UNIT=105, NUMBER=106, HEX_COLOR=107, 
		IDENTIFIER=108, STRING=109, URL_FUNC=110, RGB_FUNC=111, RGBA_FUNC=112, 
		CALC_FUNC=113, VAR_FUNC=114, ROTATE_FUNC=115, SCALE_FUNC=116, BLUR_FUNC=117, 
		CLOSE_TAG=118, OPEN_TAG=119, TEXT=120, WS=121, COMMENT=122, LINE_COMMENT=123, 
		LBRACE=124, RBRACE=125, COLON=126, SEMI=127, COMMA=128, DOT=129, HASH=130, 
		LPAREN=131, RPAREN=132, PLUS=133, MINUS=134, STAR=135, SLASH=136, PERCENT=137, 
		GT=138, LT=139, TILDE=140, BANG=141, DBL_COLON=142;
	public static final int
		RULE_document = 0, RULE_element = 1, RULE_tagElement = 2, RULE_statement = 3, 
		RULE_mediaRule = 4, RULE_mediaQueryList = 5, RULE_mediaQuery = 6, RULE_mediaExpr = 7, 
		RULE_ruleset = 8, RULE_selectorList = 9, RULE_selector = 10, RULE_combinator = 11, 
		RULE_compoundSelector = 12, RULE_simpleSelector = 13, RULE_pseudoClass = 14, 
		RULE_pseudoElement = 15, RULE_declarationList = 16, RULE_declaration = 17, 
		RULE_exprModifier = 18, RULE_property = 19, RULE_value = 20, RULE_expr = 21, 
		RULE_term = 22, RULE_dimension = 23, RULE_keywordValue = 24, RULE_functionCall = 25, 
		RULE_functionName = 26, RULE_arguments = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "element", "tagElement", "statement", "mediaRule", "mediaQueryList", 
			"mediaQuery", "mediaExpr", "ruleset", "selectorList", "selector", "combinator", 
			"compoundSelector", "simpleSelector", "pseudoClass", "pseudoElement", 
			"declarationList", "declaration", "exprModifier", "property", "value", 
			"expr", "term", "dimension", "keywordValue", "functionCall", "functionName", 
			"arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u0639\\u0631\\u0636'", "'\\u0645\\u0648\\u0642\\u0639'", "'\\u0639\\u0631\\u0636-\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629'", 
			"'\\u0637\\u0648\\u0644-\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629'", 
			"'\\u0623\\u0642\\u0635\\u0649-\\u0639\\u0631\\u0636'", "'\\u0623\\u0642\\u0644-\\u0639\\u0631\\u0636'", 
			"'\\u0623\\u0642\\u0635\\u0649-\\u0637\\u0648\\u0644'", "'\\u0623\\u0642\\u0644-\\u0637\\u0648\\u0644'", 
			"'\\u0647\\u0627\\u0645\\u0634'", "'\\u062D\\u0634\\u0648'", "'\\u0625\\u0637\\u0627\\u0631'", 
			"'\\u0627\\u0644\\u0638\\u0647\\u0648\\u0631'", "'\\u0641\\u0627\\u0626\\u0636'", 
			"'\\u062A\\u0631\\u062A\\u064A\\u0628-\\u0627\\u0644\\u0639\\u0645\\u0642'", 
			"'\\u062A\\u062D\\u062C\\u064A\\u0645-\\u0627\\u0644\\u0635\\u0646\\u062F\\u0648\\u0642'", 
			"'\\u0645\\u0631\\u0646'", "'\\u0627\\u062A\\u062C\\u0627\\u0647-\\u0627\\u0644\\u0645\\u0631\\u0648\\u0646\\u0629'", 
			"'\\u0644\\u0641-\\u0627\\u0644\\u0645\\u0631\\u0648\\u0646\\u0629'", 
			"'\\u0646\\u0645\\u0648-\\u0627\\u0644\\u0645\\u0631\\u0648\\u0646\\u0629'", 
			"'\\u0627\\u0646\\u0643\\u0645\\u0627\\u0634-\\u0627\\u0644\\u0645\\u0631\\u0648\\u0646\\u0629'", 
			"'\\u0634\\u0628\\u0643\\u0629'", "'\\u0642\\u0627\\u0644\\u0628-\\u0627\\u0644\\u0634\\u0628\\u0643\\u0629'", 
			"'\\u0641\\u062C\\u0648\\u0629'", "'\\u0636\\u0628\\u0637-\\u0627\\u0644\\u0645\\u062D\\u062A\\u0648\\u0649'", 
			"'\\u0645\\u062D\\u0627\\u0630\\u0627\\u0629-\\u0627\\u0644\\u0639\\u0646\\u0627\\u0635\\u0631'", 
			"'\\u0645\\u062D\\u0627\\u0630\\u0627\\u0629-\\u0630\\u0627\\u062A\\u064A\\u0629'", 
			"'\\u062A\\u0631\\u062A\\u064A\\u0628'", "'\\u0644\\u0648\\u0646'", "'\\u062E\\u0644\\u0641\\u064A\\u0629'", 
			"'\\u0635\\u0648\\u0631\\u0629-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
			"'\\u0644\\u0648\\u0646-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
			"'\\u062D\\u062C\\u0645-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
			"'\\u062A\\u0643\\u0631\\u0627\\u0631-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
			"'\\u062A\\u062B\\u0628\\u064A\\u062A-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
			"'\\u0642\\u0635-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
			"'\\u0634\\u0641\\u0627\\u0641\\u064A\\u0629'", "'\\u0638\\u0644-\\u0627\\u0644\\u0635\\u0646\\u062F\\u0648\\u0642'", 
			"'\\u0646\\u0648\\u0639-\\u0627\\u0644\\u062E\\u0637'", "'\\u062D\\u062C\\u0645-\\u0627\\u0644\\u062E\\u0637'", 
			"'\\u062B\\u0642\\u0644-\\u0627\\u0644\\u062E\\u0637'", "'\\u0646\\u0645\\u0637-\\u0627\\u0644\\u062E\\u0637'", 
			"'\\u0645\\u062D\\u0627\\u0630\\u0627\\u0629-\\u0627\\u0644\\u0646\\u0635'", 
			"'\\u0632\\u062E\\u0631\\u0641\\u0629-\\u0627\\u0644\\u0646\\u0635'", 
			"'\\u062A\\u062D\\u0648\\u064A\\u0644-\\u0627\\u0644\\u0646\\u0635'", 
			"'\\u0638\\u0644-\\u0627\\u0644\\u0646\\u0635'", "'\\u0625\\u0632\\u0627\\u062D\\u0629-\\u0627\\u0644\\u0646\\u0635'", 
			"'\\u0627\\u0631\\u062A\\u0641\\u0627\\u0639-\\u0627\\u0644\\u0633\\u0637\\u0631'", 
			"'\\u062A\\u0628\\u0627\\u0639\\u062F-\\u0627\\u0644\\u0623\\u062D\\u0631\\u0641'", 
			"'\\u062A\\u0628\\u0627\\u0639\\u062F-\\u0627\\u0644\\u0643\\u0644\\u0645\\u0627\\u062A'", 
			"'\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629-\\u0627\\u0644\\u0628\\u064A\\u0636\\u0627\\u0621'", 
			"'\\u0627\\u062A\\u062C\\u0627\\u0647-\\u0627\\u0644\\u0643\\u062A\\u0627\\u0628\\u0629'", 
			"'\\u0646\\u0645\\u0637-\\u0627\\u0644\\u0643\\u062A\\u0627\\u0628\\u0629'", 
			"'\\u0627\\u0646\\u062D\\u0646\\u0627\\u0621-\\u0627\\u0644\\u0625\\u0637\\u0627\\u0631'", 
			"'\\u0633\\u0645\\u0643-\\u0627\\u0644\\u0625\\u0637\\u0627\\u0631'", 
			"'\\u0646\\u0645\\u0637-\\u0627\\u0644\\u0625\\u0637\\u0627\\u0631'", 
			"'\\u0644\\u0648\\u0646-\\u0627\\u0644\\u0625\\u0637\\u0627\\u0631'", 
			"'\\u062E\\u0637-\\u062E\\u0627\\u0631\\u062C\\u064A'", "'\\u0623\\u0639\\u0644\\u0649'", 
			"'\\u0623\\u0633\\u0641\\u0644'", "'\\u064A\\u0645\\u064A\\u0646'", "'\\u064A\\u0633\\u0627\\u0631'", 
			"'@\\u0648\\u0633\\u0627\\u0626\\u0637'", "'\\u0646\\u0645\\u0637-\\u0627\\u0644\\u0642\\u0627\\u0626\\u0645\\u0629'", 
			"'\\u062F\\u0645\\u062C-\\u0627\\u0644\\u062D\\u062F\\u0648\\u062F'", 
			"'\\u062A\\u0646\\u0633\\u064A\\u0642-\\u0627\\u0644\\u062C\\u062F\\u0648\\u0644'", 
			"'\\u0645\\u0643\\u0627\\u0646-\\u0627\\u0644\\u0639\\u0646\\u0648\\u0627\\u0646'", 
			"'\\u0645\\u0631\\u0634\\u062D'", "'\\u0645\\u0631\\u0634\\u062D-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
			"'\\u062D\\u0648\\u0645'", "'\\u0646\\u0634\\u0637'", "'\\u062A\\u0631\\u0643\\u064A\\u0632'", 
			"'\\u062A\\u0645-\\u0632\\u064A\\u0627\\u0631\\u062A\\u0647'", "'\\u0645\\u0641\\u0639\\u0644'", 
			"'\\u0645\\u0639\\u0637\\u0644'", "'\\u0645\\u062D\\u062F\\u062F'", "'\\u0642\\u0628\\u0644'", 
			"'\\u0628\\u0639\\u062F'", "'\\u0646\\u0635-\\u0645\\u0624\\u0642\\u062A'", 
			"'\\u062A\\u062D\\u062F\\u064A\\u062F'", "'\\u0648\\u0631\\u0627\\u062B\\u0629'", 
			"'\\u0623\\u0648\\u0644\\u064A'", "'\\u063A\\u064A\\u0631 \\u0645\\u062D\\u062F\\u062F'", 
			"'\\u0644\\u0627-\\u0634\\u064A\\u0621'", "'\\u062A\\u0644\\u0642\\u0627\\u0626\\u064A'", 
			"'\\u0645\\u0631\\u0643\\u0632'", "'\\u0645\\u062A\\u0635\\u0644'", "'\\u0645\\u0642\\u0637\\u0639'", 
			"'\\u0645\\u0646\\u0642\\u0637'", "'\\u0645\\u0632\\u062F\\u0648\\u062C'", 
			"'\\u0645\\u062E\\u0641\\u064A'", "'\\u0643\\u062A\\u0644\\u0629'", "'\\u0633\\u0637\\u0631\\u064A'", 
			"'\\u0645\\u0631\\u0648\\u0646\\u0629'", "'\\u0645\\u0637\\u0644\\u0642'", 
			"'\\u0646\\u0633\\u0628\\u064A'", "'\\u062B\\u0627\\u0628\\u062A'", "'\\u0644\\u0627\\u0635\\u0642'", 
			"'\\u0635\\u0641'", "'\\u0639\\u0645\\u0648\\u062F'", "'\\u0644\\u0641'", 
			"'\\u0645\\u0624\\u0634\\u0631'", "'\\u0639\\u0631\\u064A\\u0636'", "'\\u0645\\u0627\\u0626\\u0644'", 
			"'\\u0647\\u0627\\u0645'", null, null, null, null, null, "'\\u0631\\u0627\\u0628\\u0637'", 
			"'\\u0646\\u0638\\u0627\\u0645-\\u0631_\\u062C_\\u0628'", "'\\u0646\\u0638\\u0627\\u0645-\\u0631_\\u062C_\\u0628_\\u0627'", 
			"'\\u062D\\u0633\\u0627\\u0628'", "'\\u0645\\u062A\\u063A\\u064A\\u0631'", 
			"'\\u062A\\u062F\\u0648\\u064A\\u0631'", "'\\u062A\\u0643\\u0628\\u064A\\u0631'", 
			"'\\u062A\\u063A\\u0628\\u064A\\u0634'", null, null, null, null, null, 
			null, "'{'", "'}'", "':'", "'\\u061B'", "'\\u060C'", "'.'", "'#'", "'('", 
			"')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'~'", "'!'", 
			"'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DISPLAY", "POSITION", "WIDTH", "HEIGHT", "MAX_WIDTH", "MIN_WIDTH", 
			"MAX_HEIGHT", "MIN_HEIGHT", "MARGIN", "PADDING", "BORDER", "VISIBILITY", 
			"OVERFLOW", "Z_INDEX", "BOX_SIZING", "FLEX", "FLEX_DIR", "FLEX_WRAP", 
			"FLEX_GROW", "FLEX_SHRINK", "GRID", "GRID_TEMPLATE", "GAP", "JUSTIFY_CONT", 
			"ALIGN_ITEMS", "ALIGN_SELF", "ORDER", "COLOR", "BACKGROUND", "BG_IMAGE", 
			"BG_COLOR", "BG_SIZE", "BG_REPEAT", "BG_ATTACH", "BG_CLIP", "OPACITY", 
			"BOX_SHADOW", "FONT_FAMILY", "FONT_SIZE", "FONT_WEIGHT", "FONT_STYLE", 
			"TEXT_ALIGN", "TEXT_DECOR", "TEXT_TRANS", "TEXT_SHADOW", "TEXT_INDENT", 
			"LINE_HEIGHT", "LETTER_SPACING", "WORD_SPACING", "WHITE_SPACE", "DIRECTION", 
			"WRITING_MODE", "BORDER_RADIUS", "BORDER_WIDTH", "BORDER_STYLE", "BORDER_COLOR", 
			"OUTLINE", "TOP", "BOTTOM", "RIGHT", "LEFT", "MEDIA", "LIST_STYLE", "BORDER_COLLAPSE", 
			"TABLE_LAYOUT", "CAPTION_SIDE", "FILTER", "BACKDROP_FILT", "HOVER", "ACTIVE", 
			"FOCUS", "VISITED", "ENABLED", "DISABLED", "CHECKED", "BEFORE", "AFTER", 
			"PLACEHOLDER", "SELECTION", "INHERIT", "INITIAL", "UNSET", "NONE", "AUTO", 
			"CENTER", "SOLID", "DASHED", "DOTTED", "DOUBLE", "KW_HIDDEN", "BLOCK", 
			"INLINE", "FLEX_VALUE", "ABSOLUTE", "RELATIVE", "FIXED", "STICKY", "ROW", 
			"COLUMN", "WRAP", "POINTER", "BOLD", "ITALIC", "IMPORTANT", "UNIT", "NUMBER", 
			"HEX_COLOR", "IDENTIFIER", "STRING", "URL_FUNC", "RGB_FUNC", "RGBA_FUNC", 
			"CALC_FUNC", "VAR_FUNC", "ROTATE_FUNC", "SCALE_FUNC", "BLUR_FUNC", "CLOSE_TAG", 
			"OPEN_TAG", "TEXT", "WS", "COMMENT", "LINE_COMMENT", "LBRACE", "RBRACE", 
			"COLON", "SEMI", "COMMA", "DOT", "HASH", "LPAREN", "RPAREN", "PLUS", 
			"MINUS", "STAR", "SLASH", "PERCENT", "GT", "LT", "TILDE", "BANG", "DBL_COLON"
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
	public String getGrammarFileName() { return "ArabicWebParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArabicWebParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ArabicWebParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MEDIA || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 17320646657L) != 0)) {
				{
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_TAG:
				case TEXT:
					{
					setState(56);
					element();
					}
					break;
				case MEDIA:
				case IDENTIFIER:
				case COLON:
				case DOT:
				case HASH:
				case STAR:
				case DBL_COLON:
					{
					setState(57);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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
		public TerminalNode TEXT() { return getToken(ArabicWebParser.TEXT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				tagElement();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
		public TerminalNode OPEN_TAG() { return getToken(ArabicWebParser.OPEN_TAG, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(ArabicWebParser.CLOSE_TAG, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitTagElement(this);
		}
	}

	public final TagElementContext tagElement() throws RecognitionException {
		TagElementContext _localctx = new TagElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tagElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(OPEN_TAG);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_TAG || _la==TEXT) {
				{
				{
				setState(70);
				element();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public MediaRuleContext mediaRule() {
			return getRuleContext(MediaRuleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case COLON:
			case DOT:
			case HASH:
			case STAR:
			case DBL_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				ruleset();
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				mediaRule();
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
	public static class MediaRuleContext extends ParserRuleContext {
		public TerminalNode MEDIA() { return getToken(ArabicWebParser.MEDIA, 0); }
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ArabicWebParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArabicWebParser.RBRACE, 0); }
		public List<RulesetContext> ruleset() {
			return getRuleContexts(RulesetContext.class);
		}
		public RulesetContext ruleset(int i) {
			return getRuleContext(RulesetContext.class,i);
		}
		public MediaRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterMediaRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitMediaRule(this);
		}
	}

	public final MediaRuleContext mediaRule() throws RecognitionException {
		MediaRuleContext _localctx = new MediaRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mediaRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(MEDIA);
			setState(83);
			mediaQueryList();
			setState(84);
			match(LBRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 17320640513L) != 0)) {
				{
				{
				setState(85);
				ruleset();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
	public static class MediaQueryListContext extends ParserRuleContext {
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArabicWebParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArabicWebParser.COMMA, i);
		}
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterMediaQueryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitMediaQueryList(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			mediaQuery();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94);
				match(COMMA);
				setState(95);
				mediaQuery();
				}
				}
				setState(100);
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
	public static class MediaQueryContext extends ParserRuleContext {
		public MediaExprContext mediaExpr() {
			return getRuleContext(MediaExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArabicWebParser.IDENTIFIER, 0); }
		public TerminalNode KW_HIDDEN() { return getToken(ArabicWebParser.KW_HIDDEN, 0); }
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitMediaQuery(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mediaQuery);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				mediaExpr();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(IDENTIFIER);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_HIDDEN) {
					{
					setState(103);
					match(KW_HIDDEN);
					setState(104);
					mediaExpr();
					}
				}

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
	public static class MediaExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ArabicWebParser.LPAREN, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ArabicWebParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArabicWebParser.RPAREN, 0); }
		public MediaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterMediaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitMediaExpr(this);
		}
	}

	public final MediaExprContext mediaExpr() throws RecognitionException {
		MediaExprContext _localctx = new MediaExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mediaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LPAREN);
			setState(110);
			property();
			setState(111);
			match(COLON);
			setState(112);
			value();
			setState(113);
			match(RPAREN);
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
	public static class RulesetContext extends ParserRuleContext {
		public SelectorListContext selectorList() {
			return getRuleContext(SelectorListContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ArabicWebParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArabicWebParser.RBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitRuleset(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			selectorList();
			setState(116);
			match(LBRACE);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611686018427387906L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 17592186044447L) != 0)) {
				{
				setState(117);
				declarationList();
				}
			}

			setState(120);
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
	public static class SelectorListContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArabicWebParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArabicWebParser.COMMA, i);
		}
		public SelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitSelectorList(this);
		}
	}

	public final SelectorListContext selectorList() throws RecognitionException {
		SelectorListContext _localctx = new SelectorListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			selector();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				selector();
				}
				}
				setState(129);
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
	public static class SelectorContext extends ParserRuleContext {
		public List<CompoundSelectorContext> compoundSelector() {
			return getRuleContexts(CompoundSelectorContext.class);
		}
		public CompoundSelectorContext compoundSelector(int i) {
			return getRuleContext(CompoundSelectorContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			compoundSelector();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 161L) != 0)) {
				{
				{
				setState(131);
				combinator();
				setState(132);
				compoundSelector();
				}
				}
				setState(138);
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
	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(ArabicWebParser.GT, 0); }
		public TerminalNode PLUS() { return getToken(ArabicWebParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(ArabicWebParser.TILDE, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitCombinator(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 161L) != 0)) ) {
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
	public static class CompoundSelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public List<PseudoElementContext> pseudoElement() {
			return getRuleContexts(PseudoElementContext.class);
		}
		public PseudoElementContext pseudoElement(int i) {
			return getRuleContext(PseudoElementContext.class,i);
		}
		public List<PseudoClassContext> pseudoClass() {
			return getRuleContexts(PseudoClassContext.class);
		}
		public PseudoClassContext pseudoClass(int i) {
			return getRuleContext(PseudoClassContext.class,i);
		}
		public CompoundSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterCompoundSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitCompoundSelector(this);
		}
	}

	public final CompoundSelectorContext compoundSelector() throws RecognitionException {
		CompoundSelectorContext _localctx = new CompoundSelectorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compoundSelector);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
				case DOT:
				case HASH:
				case STAR:
					{
					setState(141);
					simpleSelector();
					}
					break;
				case DBL_COLON:
					{
					setState(142);
					pseudoElement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 17320640513L) != 0)) {
					{
					setState(148);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
					case DOT:
					case HASH:
					case STAR:
						{
						setState(145);
						simpleSelector();
						}
						break;
					case COLON:
						{
						setState(146);
						pseudoClass();
						}
						break;
					case DBL_COLON:
						{
						setState(147);
						pseudoElement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(155);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COLON:
						{
						setState(153);
						pseudoClass();
						}
						break;
					case DBL_COLON:
						{
						setState(154);
						pseudoElement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==DBL_COLON );
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicWebParser.IDENTIFIER, 0); }
		public TerminalNode HASH() { return getToken(ArabicWebParser.HASH, 0); }
		public TerminalNode DOT() { return getToken(ArabicWebParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(ArabicWebParser.STAR, 0); }
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitSimpleSelector(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpleSelector);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(IDENTIFIER);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(HASH);
				setState(163);
				match(IDENTIFIER);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(DOT);
				setState(165);
				match(IDENTIFIER);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(STAR);
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
	public static class PseudoClassContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ArabicWebParser.COLON, 0); }
		public TerminalNode HOVER() { return getToken(ArabicWebParser.HOVER, 0); }
		public TerminalNode ACTIVE() { return getToken(ArabicWebParser.ACTIVE, 0); }
		public TerminalNode FOCUS() { return getToken(ArabicWebParser.FOCUS, 0); }
		public TerminalNode VISITED() { return getToken(ArabicWebParser.VISITED, 0); }
		public TerminalNode ENABLED() { return getToken(ArabicWebParser.ENABLED, 0); }
		public TerminalNode DISABLED() { return getToken(ArabicWebParser.DISABLED, 0); }
		public TerminalNode CHECKED() { return getToken(ArabicWebParser.CHECKED, 0); }
		public PseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitPseudoClass(this);
		}
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pseudoClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(COLON);
			setState(170);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 127L) != 0)) ) {
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
	public static class PseudoElementContext extends ParserRuleContext {
		public TerminalNode DBL_COLON() { return getToken(ArabicWebParser.DBL_COLON, 0); }
		public TerminalNode BEFORE() { return getToken(ArabicWebParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(ArabicWebParser.AFTER, 0); }
		public TerminalNode PLACEHOLDER() { return getToken(ArabicWebParser.PLACEHOLDER, 0); }
		public TerminalNode SELECTION() { return getToken(ArabicWebParser.SELECTION, 0); }
		public PseudoElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterPseudoElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitPseudoElement(this);
		}
	}

	public final PseudoElementContext pseudoElement() throws RecognitionException {
		PseudoElementContext _localctx = new PseudoElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pseudoElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(DBL_COLON);
			setState(173);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 15L) != 0)) ) {
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
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ArabicWebParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ArabicWebParser.SEMI, i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			declaration();
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					match(SEMI);
					setState(177);
					declaration();
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(183);
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
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ArabicWebParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExprModifierContext exprModifier() {
			return getRuleContext(ExprModifierContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			property();
			setState(187);
			match(COLON);
			setState(188);
			value();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTANT) {
				{
				setState(189);
				exprModifier();
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
	public static class ExprModifierContext extends ParserRuleContext {
		public TerminalNode IMPORTANT() { return getToken(ArabicWebParser.IMPORTANT, 0); }
		public ExprModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterExprModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitExprModifier(this);
		}
	}

	public final ExprModifierContext exprModifier() throws RecognitionException {
		ExprModifierContext _localctx = new ExprModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IMPORTANT);
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
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(ArabicWebParser.DISPLAY, 0); }
		public TerminalNode POSITION() { return getToken(ArabicWebParser.POSITION, 0); }
		public TerminalNode WIDTH() { return getToken(ArabicWebParser.WIDTH, 0); }
		public TerminalNode HEIGHT() { return getToken(ArabicWebParser.HEIGHT, 0); }
		public TerminalNode MAX_WIDTH() { return getToken(ArabicWebParser.MAX_WIDTH, 0); }
		public TerminalNode MIN_WIDTH() { return getToken(ArabicWebParser.MIN_WIDTH, 0); }
		public TerminalNode MAX_HEIGHT() { return getToken(ArabicWebParser.MAX_HEIGHT, 0); }
		public TerminalNode MIN_HEIGHT() { return getToken(ArabicWebParser.MIN_HEIGHT, 0); }
		public TerminalNode MARGIN() { return getToken(ArabicWebParser.MARGIN, 0); }
		public TerminalNode PADDING() { return getToken(ArabicWebParser.PADDING, 0); }
		public TerminalNode BORDER() { return getToken(ArabicWebParser.BORDER, 0); }
		public TerminalNode VISIBILITY() { return getToken(ArabicWebParser.VISIBILITY, 0); }
		public TerminalNode OVERFLOW() { return getToken(ArabicWebParser.OVERFLOW, 0); }
		public TerminalNode Z_INDEX() { return getToken(ArabicWebParser.Z_INDEX, 0); }
		public TerminalNode BOX_SIZING() { return getToken(ArabicWebParser.BOX_SIZING, 0); }
		public TerminalNode FLEX() { return getToken(ArabicWebParser.FLEX, 0); }
		public TerminalNode FLEX_DIR() { return getToken(ArabicWebParser.FLEX_DIR, 0); }
		public TerminalNode FLEX_WRAP() { return getToken(ArabicWebParser.FLEX_WRAP, 0); }
		public TerminalNode FLEX_GROW() { return getToken(ArabicWebParser.FLEX_GROW, 0); }
		public TerminalNode FLEX_SHRINK() { return getToken(ArabicWebParser.FLEX_SHRINK, 0); }
		public TerminalNode GRID() { return getToken(ArabicWebParser.GRID, 0); }
		public TerminalNode GRID_TEMPLATE() { return getToken(ArabicWebParser.GRID_TEMPLATE, 0); }
		public TerminalNode GAP() { return getToken(ArabicWebParser.GAP, 0); }
		public TerminalNode JUSTIFY_CONT() { return getToken(ArabicWebParser.JUSTIFY_CONT, 0); }
		public TerminalNode ALIGN_ITEMS() { return getToken(ArabicWebParser.ALIGN_ITEMS, 0); }
		public TerminalNode ALIGN_SELF() { return getToken(ArabicWebParser.ALIGN_SELF, 0); }
		public TerminalNode ORDER() { return getToken(ArabicWebParser.ORDER, 0); }
		public TerminalNode COLOR() { return getToken(ArabicWebParser.COLOR, 0); }
		public TerminalNode BACKGROUND() { return getToken(ArabicWebParser.BACKGROUND, 0); }
		public TerminalNode BG_IMAGE() { return getToken(ArabicWebParser.BG_IMAGE, 0); }
		public TerminalNode BG_COLOR() { return getToken(ArabicWebParser.BG_COLOR, 0); }
		public TerminalNode BG_SIZE() { return getToken(ArabicWebParser.BG_SIZE, 0); }
		public TerminalNode BG_REPEAT() { return getToken(ArabicWebParser.BG_REPEAT, 0); }
		public TerminalNode BG_ATTACH() { return getToken(ArabicWebParser.BG_ATTACH, 0); }
		public TerminalNode BG_CLIP() { return getToken(ArabicWebParser.BG_CLIP, 0); }
		public TerminalNode OPACITY() { return getToken(ArabicWebParser.OPACITY, 0); }
		public TerminalNode BOX_SHADOW() { return getToken(ArabicWebParser.BOX_SHADOW, 0); }
		public TerminalNode FONT_FAMILY() { return getToken(ArabicWebParser.FONT_FAMILY, 0); }
		public TerminalNode FONT_SIZE() { return getToken(ArabicWebParser.FONT_SIZE, 0); }
		public TerminalNode FONT_WEIGHT() { return getToken(ArabicWebParser.FONT_WEIGHT, 0); }
		public TerminalNode FONT_STYLE() { return getToken(ArabicWebParser.FONT_STYLE, 0); }
		public TerminalNode TEXT_ALIGN() { return getToken(ArabicWebParser.TEXT_ALIGN, 0); }
		public TerminalNode TEXT_DECOR() { return getToken(ArabicWebParser.TEXT_DECOR, 0); }
		public TerminalNode TEXT_TRANS() { return getToken(ArabicWebParser.TEXT_TRANS, 0); }
		public TerminalNode TEXT_SHADOW() { return getToken(ArabicWebParser.TEXT_SHADOW, 0); }
		public TerminalNode TEXT_INDENT() { return getToken(ArabicWebParser.TEXT_INDENT, 0); }
		public TerminalNode LINE_HEIGHT() { return getToken(ArabicWebParser.LINE_HEIGHT, 0); }
		public TerminalNode LETTER_SPACING() { return getToken(ArabicWebParser.LETTER_SPACING, 0); }
		public TerminalNode WORD_SPACING() { return getToken(ArabicWebParser.WORD_SPACING, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(ArabicWebParser.WHITE_SPACE, 0); }
		public TerminalNode DIRECTION() { return getToken(ArabicWebParser.DIRECTION, 0); }
		public TerminalNode WRITING_MODE() { return getToken(ArabicWebParser.WRITING_MODE, 0); }
		public TerminalNode BORDER_RADIUS() { return getToken(ArabicWebParser.BORDER_RADIUS, 0); }
		public TerminalNode BORDER_WIDTH() { return getToken(ArabicWebParser.BORDER_WIDTH, 0); }
		public TerminalNode BORDER_STYLE() { return getToken(ArabicWebParser.BORDER_STYLE, 0); }
		public TerminalNode BORDER_COLOR() { return getToken(ArabicWebParser.BORDER_COLOR, 0); }
		public TerminalNode OUTLINE() { return getToken(ArabicWebParser.OUTLINE, 0); }
		public TerminalNode TOP() { return getToken(ArabicWebParser.TOP, 0); }
		public TerminalNode BOTTOM() { return getToken(ArabicWebParser.BOTTOM, 0); }
		public TerminalNode RIGHT() { return getToken(ArabicWebParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(ArabicWebParser.LEFT, 0); }
		public TerminalNode LIST_STYLE() { return getToken(ArabicWebParser.LIST_STYLE, 0); }
		public TerminalNode BORDER_COLLAPSE() { return getToken(ArabicWebParser.BORDER_COLLAPSE, 0); }
		public TerminalNode TABLE_LAYOUT() { return getToken(ArabicWebParser.TABLE_LAYOUT, 0); }
		public TerminalNode CAPTION_SIDE() { return getToken(ArabicWebParser.CAPTION_SIDE, 0); }
		public TerminalNode FILTER() { return getToken(ArabicWebParser.FILTER, 0); }
		public TerminalNode BACKDROP_FILT() { return getToken(ArabicWebParser.BACKDROP_FILT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArabicWebParser.IDENTIFIER, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611686018427387906L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 17592186044447L) != 0)) ) {
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
	public static class ValueContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			expr();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 274827575295L) != 0)) {
				{
				{
				setState(197);
				expr();
				}
				}
				setState(202);
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
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ArabicWebParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ArabicWebParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(ArabicWebParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(ArabicWebParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ArabicWebParser.PERCENT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				term();
				setState(205);
				_la = _input.LA(1);
				if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 31L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				term();
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
	public static class TermContext extends ParserRuleContext {
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public KeywordValueContext keywordValue() {
			return getRuleContext(KeywordValueContext.class,0);
		}
		public TerminalNode HEX_COLOR() { return getToken(ArabicWebParser.HEX_COLOR, 0); }
		public TerminalNode STRING() { return getToken(ArabicWebParser.STRING, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArabicWebParser.IDENTIFIER, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_term);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				dimension();
				}
				break;
			case INHERIT:
			case INITIAL:
			case UNSET:
			case NONE:
			case AUTO:
			case CENTER:
			case SOLID:
			case DASHED:
			case DOTTED:
			case DOUBLE:
			case KW_HIDDEN:
			case BLOCK:
			case INLINE:
			case FLEX_VALUE:
			case ABSOLUTE:
			case RELATIVE:
			case FIXED:
			case STICKY:
			case ROW:
			case COLUMN:
			case WRAP:
			case POINTER:
			case BOLD:
			case ITALIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				keywordValue();
				}
				break;
			case HEX_COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(HEX_COLOR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(STRING);
				}
				break;
			case URL_FUNC:
			case RGB_FUNC:
			case RGBA_FUNC:
			case CALC_FUNC:
			case VAR_FUNC:
			case ROTATE_FUNC:
			case SCALE_FUNC:
			case BLUR_FUNC:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				functionCall();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(IDENTIFIER);
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
	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ArabicWebParser.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(ArabicWebParser.UNIT, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitDimension(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(NUMBER);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIT) {
				{
				setState(219);
				match(UNIT);
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
	public static class KeywordValueContext extends ParserRuleContext {
		public TerminalNode INHERIT() { return getToken(ArabicWebParser.INHERIT, 0); }
		public TerminalNode INITIAL() { return getToken(ArabicWebParser.INITIAL, 0); }
		public TerminalNode UNSET() { return getToken(ArabicWebParser.UNSET, 0); }
		public TerminalNode NONE() { return getToken(ArabicWebParser.NONE, 0); }
		public TerminalNode AUTO() { return getToken(ArabicWebParser.AUTO, 0); }
		public TerminalNode CENTER() { return getToken(ArabicWebParser.CENTER, 0); }
		public TerminalNode SOLID() { return getToken(ArabicWebParser.SOLID, 0); }
		public TerminalNode DASHED() { return getToken(ArabicWebParser.DASHED, 0); }
		public TerminalNode DOTTED() { return getToken(ArabicWebParser.DOTTED, 0); }
		public TerminalNode DOUBLE() { return getToken(ArabicWebParser.DOUBLE, 0); }
		public TerminalNode KW_HIDDEN() { return getToken(ArabicWebParser.KW_HIDDEN, 0); }
		public TerminalNode BLOCK() { return getToken(ArabicWebParser.BLOCK, 0); }
		public TerminalNode INLINE() { return getToken(ArabicWebParser.INLINE, 0); }
		public TerminalNode FLEX_VALUE() { return getToken(ArabicWebParser.FLEX_VALUE, 0); }
		public TerminalNode ABSOLUTE() { return getToken(ArabicWebParser.ABSOLUTE, 0); }
		public TerminalNode RELATIVE() { return getToken(ArabicWebParser.RELATIVE, 0); }
		public TerminalNode FIXED() { return getToken(ArabicWebParser.FIXED, 0); }
		public TerminalNode STICKY() { return getToken(ArabicWebParser.STICKY, 0); }
		public TerminalNode ROW() { return getToken(ArabicWebParser.ROW, 0); }
		public TerminalNode COLUMN() { return getToken(ArabicWebParser.COLUMN, 0); }
		public TerminalNode WRAP() { return getToken(ArabicWebParser.WRAP, 0); }
		public TerminalNode POINTER() { return getToken(ArabicWebParser.POINTER, 0); }
		public TerminalNode BOLD() { return getToken(ArabicWebParser.BOLD, 0); }
		public TerminalNode ITALIC() { return getToken(ArabicWebParser.ITALIC, 0); }
		public KeywordValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterKeywordValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitKeywordValue(this);
		}
	}

	public final KeywordValueContext keywordValue() throws RecognitionException {
		KeywordValueContext _localctx = new KeywordValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_keywordValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 16777215L) != 0)) ) {
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
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ArabicWebParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArabicWebParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			functionName();
			setState(225);
			match(LPAREN);
			setState(226);
			arguments();
			setState(227);
			match(RPAREN);
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
	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode URL_FUNC() { return getToken(ArabicWebParser.URL_FUNC, 0); }
		public TerminalNode RGB_FUNC() { return getToken(ArabicWebParser.RGB_FUNC, 0); }
		public TerminalNode RGBA_FUNC() { return getToken(ArabicWebParser.RGBA_FUNC, 0); }
		public TerminalNode CALC_FUNC() { return getToken(ArabicWebParser.CALC_FUNC, 0); }
		public TerminalNode VAR_FUNC() { return getToken(ArabicWebParser.VAR_FUNC, 0); }
		public TerminalNode ROTATE_FUNC() { return getToken(ArabicWebParser.ROTATE_FUNC, 0); }
		public TerminalNode SCALE_FUNC() { return getToken(ArabicWebParser.SCALE_FUNC, 0); }
		public TerminalNode BLUR_FUNC() { return getToken(ArabicWebParser.BLUR_FUNC, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 255L) != 0)) ) {
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArabicWebParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArabicWebParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicWebParserListener ) ((ArabicWebParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			expr();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 281749804285951L) != 0)) {
				{
				{
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(232);
					match(COMMA);
					}
				}

				setState(235);
				expr();
				}
				}
				setState(240);
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

	public static final String _serializedATN =
		"\u0004\u0001\u008e\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001D\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003Q\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004W\b"+
		"\u0004\n\u0004\f\u0004Z\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005a\b\u0005\n\u0005\f\u0005d\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006j\b\u0006\u0003"+
		"\u0006l\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\bw\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t~\b\t\n\t\f\t\u0081\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0087\b\n\n\n\f\n\u008a\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0003\f\u0090\b\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0095\b\f\n\f\f\f\u0098\t\f\u0001\f\u0001\f\u0004\f\u009c\b\f\u000b"+
		"\f\f\f\u009d\u0003\f\u00a0\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u00a8\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00b3\b\u0010\n\u0010\f\u0010\u00b6\t\u0010\u0001\u0010\u0003\u0010\u00b9"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00bf"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u00c7\b\u0014\n\u0014\f\u0014\u00ca\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00d1\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00d9\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00dd\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u00ea\b\u001b\u0001\u001b\u0005\u001b\u00ed\b\u001b\n\u001b\f\u001b"+
		"\u00f0\t\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"46\u0000\u0007\u0003\u0000\u0085\u0085\u008a\u008a\u008c\u008c\u0001\u0000"+
		"EK\u0001\u0000LO\u0003\u0000\u0001=?Dll\u0001\u0000\u0085\u0089\u0001"+
		"\u0000Pg\u0001\u0000nu\u00f8\u0000<\u0001\u0000\u0000\u0000\u0002C\u0001"+
		"\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000"+
		"\u0000\bR\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000\fk\u0001"+
		"\u0000\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000"+
		"\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000"+
		"\u0016\u008b\u0001\u0000\u0000\u0000\u0018\u009f\u0001\u0000\u0000\u0000"+
		"\u001a\u00a7\u0001\u0000\u0000\u0000\u001c\u00a9\u0001\u0000\u0000\u0000"+
		"\u001e\u00ac\u0001\u0000\u0000\u0000 \u00af\u0001\u0000\u0000\u0000\""+
		"\u00ba\u0001\u0000\u0000\u0000$\u00c0\u0001\u0000\u0000\u0000&\u00c2\u0001"+
		"\u0000\u0000\u0000(\u00c4\u0001\u0000\u0000\u0000*\u00d0\u0001\u0000\u0000"+
		"\u0000,\u00d8\u0001\u0000\u0000\u0000.\u00da\u0001\u0000\u0000\u00000"+
		"\u00de\u0001\u0000\u0000\u00002\u00e0\u0001\u0000\u0000\u00004\u00e5\u0001"+
		"\u0000\u0000\u00006\u00e7\u0001\u0000\u0000\u00008;\u0003\u0002\u0001"+
		"\u00009;\u0003\u0006\u0003\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000"+
		"\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		"?@\u0005\u0000\u0000\u0001@\u0001\u0001\u0000\u0000\u0000AD\u0003\u0004"+
		"\u0002\u0000BD\u0005x\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000"+
		"\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EI\u0005w\u0000\u0000FH\u0003"+
		"\u0002\u0001\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LM\u0005v\u0000\u0000M\u0005\u0001\u0000"+
		"\u0000\u0000NQ\u0003\u0010\b\u0000OQ\u0003\b\u0004\u0000PN\u0001\u0000"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000"+
		"RS\u0005>\u0000\u0000ST\u0003\n\u0005\u0000TX\u0005|\u0000\u0000UW\u0003"+
		"\u0010\b\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[\\\u0005}\u0000\u0000\\\t\u0001\u0000\u0000"+
		"\u0000]b\u0003\f\u0006\u0000^_\u0005\u0080\u0000\u0000_a\u0003\f\u0006"+
		"\u0000`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000c\u000b\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000el\u0003\u000e\u0007\u0000fi\u0005l\u0000\u0000"+
		"gh\u0005Z\u0000\u0000hj\u0003\u000e\u0007\u0000ig\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000"+
		"\u0000kf\u0001\u0000\u0000\u0000l\r\u0001\u0000\u0000\u0000mn\u0005\u0083"+
		"\u0000\u0000no\u0003&\u0013\u0000op\u0005~\u0000\u0000pq\u0003(\u0014"+
		"\u0000qr\u0005\u0084\u0000\u0000r\u000f\u0001\u0000\u0000\u0000st\u0003"+
		"\u0012\t\u0000tv\u0005|\u0000\u0000uw\u0003 \u0010\u0000vu\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005"+
		"}\u0000\u0000y\u0011\u0001\u0000\u0000\u0000z\u007f\u0003\u0014\n\u0000"+
		"{|\u0005\u0080\u0000\u0000|~\u0003\u0014\n\u0000}{\u0001\u0000\u0000\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0013\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0088\u0003\u0018\f\u0000\u0083\u0084\u0003"+
		"\u0016\u000b\u0000\u0084\u0085\u0003\u0018\f\u0000\u0085\u0087\u0001\u0000"+
		"\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u0015\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0007\u0000\u0000\u0000\u008c\u0017\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0003\u001a\r\u0000\u008e\u0090\u0003\u001e\u000f"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0096\u0001\u0000\u0000\u0000\u0091\u0095\u0003\u001a\r\u0000"+
		"\u0092\u0095\u0003\u001c\u000e\u0000\u0093\u0095\u0003\u001e\u000f\u0000"+
		"\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u00a0\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0003\u001c\u000e\u0000\u009a\u009c\u0003\u001e\u000f\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000"+
		"\u009f\u008f\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000"+
		"\u00a0\u0019\u0001\u0000\u0000\u0000\u00a1\u00a8\u0005l\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0082\u0000\u0000\u00a3\u00a8\u0005l\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0081\u0000\u0000\u00a5\u00a8\u0005l\u0000\u0000\u00a6\u00a8\u0005"+
		"\u0087\u0000\u0000\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u001b\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"~\u0000\u0000\u00aa\u00ab\u0007\u0001\u0000\u0000\u00ab\u001d\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u008e\u0000\u0000\u00ad\u00ae\u0007\u0002"+
		"\u0000\u0000\u00ae\u001f\u0001\u0000\u0000\u0000\u00af\u00b4\u0003\"\u0011"+
		"\u0000\u00b0\u00b1\u0005\u007f\u0000\u0000\u00b1\u00b3\u0003\"\u0011\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0005\u007f\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9!\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0003&\u0013\u0000\u00bb\u00bc\u0005~\u0000\u0000\u00bc\u00be\u0003"+
		"(\u0014\u0000\u00bd\u00bf\u0003$\u0012\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf#\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0005h\u0000\u0000\u00c1%\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0007\u0003\u0000\u0000\u00c3\'\u0001\u0000\u0000\u0000\u00c4\u00c8\u0003"+
		"*\u0015\u0000\u00c5\u00c7\u0003*\u0015\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9)\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00d1\u0003,\u0016\u0000\u00cc"+
		"\u00cd\u0003,\u0016\u0000\u00cd\u00ce\u0007\u0004\u0000\u0000\u00ce\u00cf"+
		"\u0003,\u0016\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00cb\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d1+\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d9\u0003.\u0017\u0000\u00d3\u00d9\u00030\u0018\u0000"+
		"\u00d4\u00d9\u0005k\u0000\u0000\u00d5\u00d9\u0005m\u0000\u0000\u00d6\u00d9"+
		"\u00032\u0019\u0000\u00d7\u00d9\u0005l\u0000\u0000\u00d8\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9-\u0001\u0000\u0000"+
		"\u0000\u00da\u00dc\u0005j\u0000\u0000\u00db\u00dd\u0005i\u0000\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"/\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0005\u0000\u0000\u00df1\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u00034\u001a\u0000\u00e1\u00e2\u0005\u0083"+
		"\u0000\u0000\u00e2\u00e3\u00036\u001b\u0000\u00e3\u00e4\u0005\u0084\u0000"+
		"\u0000\u00e43\u0001\u0000\u0000\u0000\u00e5\u00e6\u0007\u0006\u0000\u0000"+
		"\u00e65\u0001\u0000\u0000\u0000\u00e7\u00ee\u0003*\u0015\u0000\u00e8\u00ea"+
		"\u0005\u0080\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed"+
		"\u0003*\u0015\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef7\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u001c:<CIPXbikv\u007f\u0088\u008f\u0094\u0096\u009b\u009d"+
		"\u009f\u00a7\u00b4\u00b8\u00be\u00c8\u00d0\u00d8\u00dc\u00e9\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}