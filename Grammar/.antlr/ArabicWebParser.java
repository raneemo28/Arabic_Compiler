// Generated from e:/compiler's project/Arabic_Compiler/Arabic_Compiler/Grammar/ArabicWebParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArabicWebParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLOSE_TAG=1, OPEN_TAG=2, HEX_COLOR=3, NUMBER=4, STRING=5, IDENTIFIER=6, 
		TEXT=7, WS=8, COMMENT=9, LINE_COMMENT=10, LBRACE=11, RBRACE=12, COLON=13, 
		SEMI=14, COMMA=15, DOT=16, HASH=17, LPAREN=18, RPAREN=19, PLUS=20, MINUS=21, 
		STAR=22, SLASH=23, PERCENT=24, GT=25, LT=26, TILDE=27, BANG=28, DBL_COLON=29, 
		DISPLAY=30, POSITION=31, WIDTH=32, HEIGHT=33, MAX_WIDTH=34, MIN_WIDTH=35, 
		MAX_HEIGHT=36, MIN_HEIGHT=37, MARGIN=38, PADDING=39, BORDER=40, VISIBILITY=41, 
		OVERFLOW=42, Z_INDEX=43, BOX_SIZING=44, FLEX=45, FLEX_DIR=46, FLEX_WRAP=47, 
		FLEX_GROW=48, FLEX_SHRINK=49, GRID=50, GRID_TEMPLATE=51, GAP=52, JUSTIFY_CONT=53, 
		ALIGN_ITEMS=54, ALIGN_SELF=55, ORDER=56, COLOR=57, BACKGROUND=58, BG_IMAGE=59, 
		BG_COLOR=60, BG_SIZE=61, BG_REPEAT=62, BG_ATTACH=63, BG_CLIP=64, OPACITY=65, 
		BOX_SHADOW=66, FONT_FAMILY=67, FONT_SIZE=68, FONT_WEIGHT=69, FONT_STYLE=70, 
		TEXT_ALIGN=71, TEXT_DECOR=72, TEXT_TRANS=73, TEXT_SHADOW=74, TEXT_INDENT=75, 
		LINE_HEIGHT=76, LETTER_SPACING=77, WORD_SPACING=78, WHITE_SPACE=79, DIRECTION=80, 
		WRITING_MODE=81, BORDER_RADIUS=82, BORDER_WIDTH=83, BORDER_STYLE=84, BORDER_COLOR=85, 
		OUTLINE=86, TOP=87, BOTTOM=88, RIGHT=89, LEFT=90, MEDIA=91, LIST_STYLE=92, 
		BORDER_COLLAPSE=93, TABLE_LAYOUT=94, CAPTION_SIDE=95, FILTER=96, BACKDROP_FILT=97, 
		HOVER=98, ACTIVE=99, FOCUS=100, VISITED=101, ENABLED=102, DISABLED=103, 
		CHECKED=104, BEFORE=105, AFTER=106, PLACEHOLDER=107, SELECTION=108, INHERIT=109, 
		INITIAL=110, UNSET=111, NONE=112, AUTO=113, CENTER=114, SOLID=115, DASHED=116, 
		DOTTED=117, DOUBLE=118, KW_HIDDEN=119, BLOCK=120, INLINE=121, FLEX_VALUE=122, 
		ABSOLUTE=123, RELATIVE=124, FIXED=125, STICKY=126, ROW=127, COLUMN=128, 
		WRAP=129, POINTER=130, BOLD=131, ITALIC=132, IMPORTANT=133, URL_FUNC=134, 
		RGB_FUNC=135, RGBA_FUNC=136, CALC_FUNC=137, VAR_FUNC=138, ROTATE_FUNC=139, 
		SCALE_FUNC=140, BLUR_FUNC=141, UNIT=142, VAR=143, LET=144, CONST=145, 
		ARRAY_KW=146, STRING_KW=147, NUMBER_KW=148, BOOLEAN_KW=149, SYMBOL_KW=150, 
		MAP_KW=151, SET_KW=152, DATE_KW=153, OBJECT_KW=154, IF=155, ELSE=156, 
		SWITCH=157, CASE=158, DEFAULT=159, FOR=160, WHILE=161, DO=162, BREAK=163, 
		CONTINUE=164, OF=165, IN=166, FUNCTION=167, RETURN=168, TRUE=169, FALSE=170, 
		NULL=171, UNDEFINED=172, THIS=173, NAN=174, INFINITY=175, TRY=176, CATCH=177, 
		FINALLY=178, THROW=179, EXCEPTION=180, NEW=181, CLASS=182, EXTENDS=183, 
		SUPER=184, IMPLEMENTS=185, INTERFACE=186, CONSTRUCTOR=187, PRIVATE=188, 
		PROTECTED=189, PUBLIC=190, STATIC=191, ENUM=192, PACKAGE=193, IMPORT=194, 
		EXPORT=195, FROM=196, AS=197, TYPEOF=198, INSTANCEOF=199, DELETE=200, 
		DOCUMENT=201, WINDOW=202, CONSOLE=203, EVENT=204, NODE=205, ELEMENT=206, 
		LISTENER=207, LOCAL_STORAGE=208, SESSION_STORAGE=209, GET_ELEMENT=210, 
		GET_ELEMENTS=211, CREATE_EL=212, INNER_TEXT=213, INNER_HTML=214, STYLE=215, 
		ADD_LISTENER=216, ON_CLICK=217, ON_SUBMIT=218, ON_CHANGE=219, ON_LOAD=220, 
		LOG=221, ALERT=222, PROMPT=223, INC=224, DEC=225, EXP=226, EXP_ASSIGN=227, 
		ADD_ASSIGN=228, SUB_ASSIGN=229, MUL_ASSIGN=230, DIV_ASSIGN=231, MOD_ASSIGN=232, 
		AND_ASSIGN=233, OR_ASSIGN=234, NULL_ASSIGN=235, ASSIGN=236, STREQ=237, 
		STRNEQ=238, EQ=239, NEQ=240, GTE=241, LTE=242, AND=243, OR=244, NULL_COAL=245, 
		URSH=246, LSH=247, RSH=248, BIT_AND=249, BIT_OR=250, BIT_XOR=251, QUESTION=252, 
		ARROW=253, SPREAD=254;
	public static final int
		RULE_document = 0, RULE_element = 1, RULE_tagElement = 2, RULE_statement = 3, 
		RULE_mediaRule = 4, RULE_mediaQueryList = 5, RULE_mediaQuery = 6, RULE_mediaExpr = 7, 
		RULE_ruleset = 8, RULE_selectorList = 9, RULE_selector = 10, RULE_combinator = 11, 
		RULE_compoundSelector = 12, RULE_className = 13, RULE_idName = 14, RULE_simpleSelector = 15, 
		RULE_pseudoClass = 16, RULE_pseudoElement = 17, RULE_declarationList = 18, 
		RULE_declaration = 19, RULE_exprModifier = 20, RULE_property = 21, RULE_value = 22, 
		RULE_expr = 23, RULE_term = 24, RULE_dimension = 25, RULE_keywordValue = 26, 
		RULE_functionCall = 27, RULE_functionName = 28, RULE_arguments = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "element", "tagElement", "statement", "mediaRule", "mediaQueryList", 
			"mediaQuery", "mediaExpr", "ruleset", "selectorList", "selector", "combinator", 
			"compoundSelector", "className", "idName", "simpleSelector", "pseudoClass", 
			"pseudoElement", "declarationList", "declaration", "exprModifier", "property", 
			"value", "expr", "term", "dimension", "keywordValue", "functionCall", 
			"functionName", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'{'", 
			"'}'", "':'", "'\\u061B'", "'\\u060C'", "'.'", "'#'", "'('", "')'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'~'", "'!'", "'::'", "'\\u0639\\u0631\\u0636'", 
			"'\\u0645\\u0648\\u0642\\u0639'", "'\\u0639\\u0631\\u0636-\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629'", 
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
			"'\\u0646\\u0633\\u0628\\u064A'", "'\\u0645\\u062B\\u0628\\u062A'", "'\\u0644\\u0627\\u0635\\u0642'", 
			"'\\u0633\\u0637\\u0631'", "'\\u0639\\u0645\\u0648\\u062F'", "'\\u0644\\u0641'", 
			"'\\u0645\\u0624\\u0634\\u0631'", "'\\u0639\\u0631\\u064A\\u0636'", "'\\u0645\\u0627\\u0626\\u0644'", 
			"'\\u0647\\u0627\\u0645'", "'\\u0631\\u0627\\u0628\\u0637'", "'\\u0646\\u0638\\u0627\\u0645-\\u0631_\\u062C_\\u0628'", 
			"'\\u0646\\u0638\\u0627\\u0645-\\u0631_\\u062C_\\u0628_\\u0627'", "'\\u062D\\u0633\\u0627\\u0628'", 
			"'\\u062F\\u0627\\u0644\\u0629_\\u0645\\u062A\\u063A\\u064A\\u0631'", 
			"'\\u062A\\u062F\\u0648\\u064A\\u0631'", "'\\u062A\\u0643\\u0628\\u064A\\u0631'", 
			"'\\u062A\\u063A\\u0628\\u064A\\u0634'", null, "'\\u0645\\u062A\\u063A\\u064A\\u0631'", 
			"'\\u0644\\u0646\\u0641\\u0631\\u0636'", "'\\u062B\\u0627\\u0628\\u062A'", 
			"'\\u0645\\u0635\\u0641\\u0648\\u0641\\u0629'", "'\\u0633\\u0644\\u0633\\u0644\\u0629'", 
			"'\\u0639\\u062F\\u062F'", "'\\u0645\\u0646\\u0637\\u0642\\u064A'", "'\\u0631\\u0645\\u0632'", 
			"'\\u062E\\u0631\\u064A\\u0637\\u0629'", "'\\u0645\\u062C\\u0645\\u0648\\u0639\\u0629'", 
			"'\\u062A\\u0627\\u0631\\u064A\\u062E'", "'\\u0643\\u0627\\u0626\\u0646'", 
			null, null, "'\\u0627\\u062E\\u062A\\u0628\\u0631'", "'\\u062D\\u0627\\u0644\\u0629'", 
			"'\\u0628\\u0634\\u0643\\u0644 \\u0627\\u0641\\u062A\\u0631\\u0627\\u0636\\u064A'", 
			null, "'\\u0637\\u0627\\u0644\\u0645\\u0627'", "'\\u0646\\u0641\\u0630'", 
			"'\\u0625\\u064A\\u0642\\u0627\\u0641'", "'\\u062A\\u062E\\u0637\\u0649 \\u062B\\u0645 \\u062A\\u0627\\u0628\\u0639'", 
			"'\\u0641\\u064A'", "'\\u0636\\u0645\\u0646'", "'\\u062F\\u0627\\u0644\\u0629'", 
			null, "'\\u0635\\u062D\\u064A\\u062D'", "'\\u062E\\u0627\\u0637\\u0626'", 
			"'\\u063A\\u064A\\u0631_\\u0645\\u0648\\u062C\\u0648\\u062F'", "'\\u063A\\u064A\\u0631_\\u0645\\u0639\\u0631\\u0641'", 
			"'\\u0647\\u0630\\u0627'", "'\\u0644\\u064A\\u0633_\\u0631\\u0642\\u0645'", 
			"'\\u0644\\u0627\\u0646\\u0647\\u0627\\u064A\\u0629'", "'\\u062D\\u0627\\u0648\\u0644'", 
			"'\\u0627\\u0645\\u0633\\u0643'", null, null, "'\\u0627\\u0633\\u062A\\u062B\\u0646\\u0627\\u0621'", 
			"'\\u0639\\u0646\\u0635\\u0631 \\u062C\\u062F\\u064A\\u062F'", null, 
			"'\\u064A\\u0631\\u062B_\\u0645\\u0646'", "'\\u0627\\u0644\\u0627\\u0628'", 
			"'\\u064A\\u0637\\u0628\\u0642'", "'\\u0648\\u0627\\u062C\\u0647\\u0629'", 
			"'\\u0645\\u0646\\u0634\\u0626'", "'\\u062E\\u0627\\u0635'", "'\\u0645\\u062D\\u0645\\u064A'", 
			"'\\u0639\\u0627\\u0645'", "'\\u0635\\u0641_\\u062B\\u0627\\u0628\\u062A'", 
			"'\\u062A\\u0639\\u062F\\u0627\\u062F'", "'\\u062D\\u0632\\u0645\\u0629'", 
			"'\\u0627\\u0633\\u062A\\u0648\\u0631\\u062F'", "'\\u062A\\u0635\\u062F\\u064A\\u0631'", 
			"'\\u0645\\u0646'", null, "'\\u0645\\u0646_\\u0646\\u0648\\u0639'", "'\\u0639\\u0646\\u0635\\u0631_\\u0645\\u0646'", 
			"'\\u0627\\u062D\\u0630\\u0641'", "'\\u0627\\u0644\\u0648\\u062B\\u064A\\u0642\\u0629'", 
			"'\\u0627\\u0644\\u0646\\u0627\\u0641\\u0630\\u0629'", "'\\u0627\\u0644\\u0645\\u0631\\u0627\\u0642\\u0628'", 
			"'\\u062D\\u062F\\u062B'", "'\\u0639\\u0642\\u062F\\u0629'", "'\\u0639\\u0646\\u0635\\u0631'", 
			"'\\u0645\\u0633\\u062A\\u0645\\u0639'", "'\\u062A\\u062E\\u0632\\u064A\\u0646_\\u0645\\u062D\\u0644\\u064A'", 
			"'\\u062A\\u062E\\u0632\\u064A\\u0646_\\u062C\\u0644\\u0633\\u0629'", 
			"'\\u0627\\u062D\\u0636\\u0631\\u0639\\u0646\\u0635\\u0631'", "'\\u0627\\u062D\\u0636\\u0631\\u0639\\u0646\\u0627\\u0635\\u0631'", 
			"'\\u0627\\u0646\\u0634\\u0626_\\u0639\\u0646\\u0635\\u0631'", "'\\u0627\\u0644\\u0646\\u0635_\\u0627\\u0644\\u062F\\u0627\\u062E\\u0644\\u064A'", 
			"'\\u0643\\u0648\\u062F_html'", "'\\u0627\\u0644\\u062A\\u0646\\u0633\\u064A\\u0642'", 
			null, "'\\u0639\\u0646\\u062F_\\u0627\\u0644\\u0646\\u0642\\u0631'", 
			"'\\u0639\\u0646\\u062F_\\u0627\\u0644\\u0625\\u0631\\u0633\\u0627\\u0644'", 
			"'\\u0639\\u0646\\u062F_\\u0627\\u0644\\u062A\\u063A\\u064A\\u064A\\u0631'", 
			"'\\u0639\\u0646\\u062F_\\u0627\\u0644\\u062A\\u062D\\u0645\\u064A\\u0644'", 
			"'\\u0627\\u0637\\u0628\\u0639'", "'\\u062A\\u0646\\u0628\\u064A\\u0647'", 
			"'\\u0627\\u062F\\u062E\\u0644'", "'++'", "'--'", "'**'", "'**='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'&&='", "'||='", "'??='", "'='", "'==='", 
			"'!=='", "'=='", "'!='", "'>='", "'<='", "'&&'", "'||'", "'??'", "'>>>'", 
			"'<<'", "'>>'", "'&'", "'|'", "'^'", "'?'", "'=>'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLOSE_TAG", "OPEN_TAG", "HEX_COLOR", "NUMBER", "STRING", "IDENTIFIER", 
			"TEXT", "WS", "COMMENT", "LINE_COMMENT", "LBRACE", "RBRACE", "COLON", 
			"SEMI", "COMMA", "DOT", "HASH", "LPAREN", "RPAREN", "PLUS", "MINUS", 
			"STAR", "SLASH", "PERCENT", "GT", "LT", "TILDE", "BANG", "DBL_COLON", 
			"DISPLAY", "POSITION", "WIDTH", "HEIGHT", "MAX_WIDTH", "MIN_WIDTH", "MAX_HEIGHT", 
			"MIN_HEIGHT", "MARGIN", "PADDING", "BORDER", "VISIBILITY", "OVERFLOW", 
			"Z_INDEX", "BOX_SIZING", "FLEX", "FLEX_DIR", "FLEX_WRAP", "FLEX_GROW", 
			"FLEX_SHRINK", "GRID", "GRID_TEMPLATE", "GAP", "JUSTIFY_CONT", "ALIGN_ITEMS", 
			"ALIGN_SELF", "ORDER", "COLOR", "BACKGROUND", "BG_IMAGE", "BG_COLOR", 
			"BG_SIZE", "BG_REPEAT", "BG_ATTACH", "BG_CLIP", "OPACITY", "BOX_SHADOW", 
			"FONT_FAMILY", "FONT_SIZE", "FONT_WEIGHT", "FONT_STYLE", "TEXT_ALIGN", 
			"TEXT_DECOR", "TEXT_TRANS", "TEXT_SHADOW", "TEXT_INDENT", "LINE_HEIGHT", 
			"LETTER_SPACING", "WORD_SPACING", "WHITE_SPACE", "DIRECTION", "WRITING_MODE", 
			"BORDER_RADIUS", "BORDER_WIDTH", "BORDER_STYLE", "BORDER_COLOR", "OUTLINE", 
			"TOP", "BOTTOM", "RIGHT", "LEFT", "MEDIA", "LIST_STYLE", "BORDER_COLLAPSE", 
			"TABLE_LAYOUT", "CAPTION_SIDE", "FILTER", "BACKDROP_FILT", "HOVER", "ACTIVE", 
			"FOCUS", "VISITED", "ENABLED", "DISABLED", "CHECKED", "BEFORE", "AFTER", 
			"PLACEHOLDER", "SELECTION", "INHERIT", "INITIAL", "UNSET", "NONE", "AUTO", 
			"CENTER", "SOLID", "DASHED", "DOTTED", "DOUBLE", "KW_HIDDEN", "BLOCK", 
			"INLINE", "FLEX_VALUE", "ABSOLUTE", "RELATIVE", "FIXED", "STICKY", "ROW", 
			"COLUMN", "WRAP", "POINTER", "BOLD", "ITALIC", "IMPORTANT", "URL_FUNC", 
			"RGB_FUNC", "RGBA_FUNC", "CALC_FUNC", "VAR_FUNC", "ROTATE_FUNC", "SCALE_FUNC", 
			"BLUR_FUNC", "UNIT", "VAR", "LET", "CONST", "ARRAY_KW", "STRING_KW", 
			"NUMBER_KW", "BOOLEAN_KW", "SYMBOL_KW", "MAP_KW", "SET_KW", "DATE_KW", 
			"OBJECT_KW", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "FOR", "WHILE", 
			"DO", "BREAK", "CONTINUE", "OF", "IN", "FUNCTION", "RETURN", "TRUE", 
			"FALSE", "NULL", "UNDEFINED", "THIS", "NAN", "INFINITY", "TRY", "CATCH", 
			"FINALLY", "THROW", "EXCEPTION", "NEW", "CLASS", "EXTENDS", "SUPER", 
			"IMPLEMENTS", "INTERFACE", "CONSTRUCTOR", "PRIVATE", "PROTECTED", "PUBLIC", 
			"STATIC", "ENUM", "PACKAGE", "IMPORT", "EXPORT", "FROM", "AS", "TYPEOF", 
			"INSTANCEOF", "DELETE", "DOCUMENT", "WINDOW", "CONSOLE", "EVENT", "NODE", 
			"ELEMENT", "LISTENER", "LOCAL_STORAGE", "SESSION_STORAGE", "GET_ELEMENT", 
			"GET_ELEMENTS", "CREATE_EL", "INNER_TEXT", "INNER_HTML", "STYLE", "ADD_LISTENER", 
			"ON_CLICK", "ON_SUBMIT", "ON_CHANGE", "ON_LOAD", "LOG", "ALERT", "PROMPT", 
			"INC", "DEC", "EXP", "EXP_ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "NULL_ASSIGN", 
			"ASSIGN", "STREQ", "STRNEQ", "EQ", "NEQ", "GTE", "LTE", "AND", "OR", 
			"NULL_COAL", "URSH", "LSH", "RSH", "BIT_AND", "BIT_OR", "BIT_XOR", "QUESTION", 
			"ARROW", "SPREAD"
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
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 541270212L) != 0) || _la==MEDIA) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_TAG:
				case TEXT:
					{
					setState(60);
					element();
					}
					break;
				case IDENTIFIER:
				case COLON:
				case DOT:
				case HASH:
				case STAR:
				case DBL_COLON:
				case MEDIA:
					{
					setState(61);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				tagElement();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
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
	}

	public final TagElementContext tagElement() throws RecognitionException {
		TagElementContext _localctx = new TagElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tagElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(OPEN_TAG);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_TAG || _la==TEXT) {
				{
				{
				setState(74);
				element();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(84);
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
				setState(82);
				ruleset();
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
	}

	public final MediaRuleContext mediaRule() throws RecognitionException {
		MediaRuleContext _localctx = new MediaRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mediaRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(MEDIA);
			setState(87);
			mediaQueryList();
			setState(88);
			match(LBRACE);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 541270080L) != 0)) {
				{
				{
				setState(89);
				ruleset();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			mediaQuery();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				mediaQuery();
				}
				}
				setState(104);
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
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mediaQuery);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				mediaExpr();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(IDENTIFIER);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_HIDDEN) {
					{
					setState(107);
					match(KW_HIDDEN);
					setState(108);
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
	}

	public final MediaExprContext mediaExpr() throws RecognitionException {
		MediaExprContext _localctx = new MediaExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mediaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LPAREN);
			setState(114);
			property();
			setState(115);
			match(COLON);
			setState(116);
			value();
			setState(117);
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
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			selectorList();
			setState(120);
			match(LBRACE);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1073741760L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 17045651455L) != 0)) {
				{
				setState(121);
				declarationList();
				}
			}

			setState(124);
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
	}

	public final SelectorListContext selectorList() throws RecognitionException {
		SelectorListContext _localctx = new SelectorListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			selector();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127);
				match(COMMA);
				setState(128);
				selector();
				}
				}
				setState(133);
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
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			compoundSelector();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 168820736L) != 0)) {
				{
				{
				setState(135);
				combinator();
				setState(136);
				compoundSelector();
				}
				}
				setState(142);
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
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 168820736L) != 0)) ) {
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
	}

	public final CompoundSelectorContext compoundSelector() throws RecognitionException {
		CompoundSelectorContext _localctx = new CompoundSelectorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compoundSelector);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
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
				case DBL_COLON:
					{
					setState(146);
					pseudoElement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 541270080L) != 0)) {
					{
					setState(152);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
					case DOT:
					case HASH:
					case STAR:
						{
						setState(149);
						simpleSelector();
						}
						break;
					case COLON:
						{
						setState(150);
						pseudoClass();
						}
						break;
					case DBL_COLON:
						{
						setState(151);
						pseudoElement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(159);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COLON:
						{
						setState(157);
						pseudoClass();
						}
						break;
					case DBL_COLON:
						{
						setState(158);
						pseudoElement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(161); 
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
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ArabicWebParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArabicWebParser.IDENTIFIER, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(DOT);
			setState(166);
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
	public static class IdNameContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(ArabicWebParser.HASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArabicWebParser.IDENTIFIER, 0); }
		public IdNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idName; }
	}

	public final IdNameContext idName() throws RecognitionException {
		IdNameContext _localctx = new IdNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_idName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(HASH);
			setState(169);
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicWebParser.IDENTIFIER, 0); }
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(ArabicWebParser.STAR, 0); }
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleSelector);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(IDENTIFIER);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				idName();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				className();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
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
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pseudoClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(COLON);
			setState(178);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 127L) != 0)) ) {
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
	}

	public final PseudoElementContext pseudoElement() throws RecognitionException {
		PseudoElementContext _localctx = new PseudoElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pseudoElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(DBL_COLON);
			setState(181);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 15L) != 0)) ) {
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
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			declaration();
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					match(SEMI);
					setState(185);
					declaration();
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(191);
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
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			property();
			setState(195);
			match(COLON);
			setState(196);
			value();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTANT) {
				{
				setState(197);
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
	}

	public final ExprModifierContext exprModifier() throws RecognitionException {
		ExprModifierContext _localctx = new ExprModifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -1073741760L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 17045651455L) != 0)) ) {
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			expr();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 8573157375L) != 0)) {
				{
				{
				setState(205);
				expr();
				}
				}
				setState(210);
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				term();
				setState(213);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32505856L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
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
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
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
				setState(219);
				keywordValue();
				}
				break;
			case HEX_COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(HEX_COLOR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
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
				setState(222);
				functionCall();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
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
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(NUMBER);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIT) {
				{
				setState(227);
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
	}

	public final KeywordValueContext keywordValue() throws RecognitionException {
		KeywordValueContext _localctx = new KeywordValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keywordValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 16777215L) != 0)) ) {
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
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			functionName();
			setState(233);
			match(LPAREN);
			setState(234);
			arguments();
			setState(235);
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
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 255L) != 0)) ) {
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
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			expr();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32888L) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 8573157375L) != 0)) {
				{
				{
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(240);
					match(COMMA);
					}
				}

				setState(243);
				expr();
				}
				}
				setState(248);
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
		"\u0004\u0001\u00fe\u00fa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001"+
		"\u0000\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004[\b\u0004\n\u0004\f\u0004^\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005e\b\u0005\n\u0005\f\u0005h\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006n\b\u0006\u0003\u0006p\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\b{\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u0082\b\t\n\t\f\t\u0085\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u008b\b\n\n\n\f\n\u008e\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003"+
		"\f\u0094\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u0099\b\f\n\f\f\f\u009c\t"+
		"\f\u0001\f\u0001\f\u0004\f\u00a0\b\f\u000b\f\f\f\u00a1\u0003\f\u00a4\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b0\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00bb\b\u0012\n\u0012\f\u0012\u00be"+
		"\t\u0012\u0001\u0012\u0003\u0012\u00c1\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00c7\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u00cf\b\u0016"+
		"\n\u0016\f\u0016\u00d2\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00d9\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e1\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u00e5\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u00f2\b\u001d\u0001\u001d\u0005"+
		"\u001d\u00f5\b\u001d\n\u001d\f\u001d\u00f8\t\u001d\u0001\u001d\u0000\u0000"+
		"\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0007\u0003\u0000\u0014\u0014"+
		"\u0019\u0019\u001b\u001b\u0001\u0000bh\u0001\u0000il\u0003\u0000\u0006"+
		"\u0006\u001eZ\\a\u0001\u0000\u0014\u0018\u0001\u0000m\u0084\u0001\u0000"+
		"\u0086\u008d\u00fe\u0000@\u0001\u0000\u0000\u0000\u0002G\u0001\u0000\u0000"+
		"\u0000\u0004I\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\b"+
		"V\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000"+
		"\u0000\u000eq\u0001\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012"+
		"~\u0001\u0000\u0000\u0000\u0014\u0086\u0001\u0000\u0000\u0000\u0016\u008f"+
		"\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000\u0000\u001a\u00a5"+
		"\u0001\u0000\u0000\u0000\u001c\u00a8\u0001\u0000\u0000\u0000\u001e\u00af"+
		"\u0001\u0000\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000\"\u00b4\u0001"+
		"\u0000\u0000\u0000$\u00b7\u0001\u0000\u0000\u0000&\u00c2\u0001\u0000\u0000"+
		"\u0000(\u00c8\u0001\u0000\u0000\u0000*\u00ca\u0001\u0000\u0000\u0000,"+
		"\u00cc\u0001\u0000\u0000\u0000.\u00d8\u0001\u0000\u0000\u00000\u00e0\u0001"+
		"\u0000\u0000\u00002\u00e2\u0001\u0000\u0000\u00004\u00e6\u0001\u0000\u0000"+
		"\u00006\u00e8\u0001\u0000\u0000\u00008\u00ed\u0001\u0000\u0000\u0000:"+
		"\u00ef\u0001\u0000\u0000\u0000<?\u0003\u0002\u0001\u0000=?\u0003\u0006"+
		"\u0003\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u0000\u0000"+
		"\u0001D\u0001\u0001\u0000\u0000\u0000EH\u0003\u0004\u0002\u0000FH\u0005"+
		"\u0007\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"H\u0003\u0001\u0000\u0000\u0000IM\u0005\u0002\u0000\u0000JL\u0003\u0002"+
		"\u0001\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PQ\u0005\u0001\u0000\u0000Q\u0005\u0001\u0000"+
		"\u0000\u0000RU\u0003\u0010\b\u0000SU\u0003\b\u0004\u0000TR\u0001\u0000"+
		"\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0007\u0001\u0000\u0000\u0000"+
		"VW\u0005[\u0000\u0000WX\u0003\n\u0005\u0000X\\\u0005\u000b\u0000\u0000"+
		"Y[\u0003\u0010\b\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\f\u0000\u0000`\t\u0001\u0000"+
		"\u0000\u0000af\u0003\f\u0006\u0000bc\u0005\u000f\u0000\u0000ce\u0003\f"+
		"\u0006\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u000b\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000ip\u0003\u000e\u0007\u0000jm\u0005\u0006"+
		"\u0000\u0000kl\u0005w\u0000\u0000ln\u0003\u000e\u0007\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000oi\u0001"+
		"\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000p\r\u0001\u0000\u0000\u0000"+
		"qr\u0005\u0012\u0000\u0000rs\u0003*\u0015\u0000st\u0005\r\u0000\u0000"+
		"tu\u0003,\u0016\u0000uv\u0005\u0013\u0000\u0000v\u000f\u0001\u0000\u0000"+
		"\u0000wx\u0003\u0012\t\u0000xz\u0005\u000b\u0000\u0000y{\u0003$\u0012"+
		"\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0005\f\u0000\u0000}\u0011\u0001\u0000\u0000\u0000~\u0083"+
		"\u0003\u0014\n\u0000\u007f\u0080\u0005\u000f\u0000\u0000\u0080\u0082\u0003"+
		"\u0014\n\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u008c\u0003\u0018\f\u0000\u0087\u0088\u0003\u0016\u000b"+
		"\u0000\u0088\u0089\u0003\u0018\f\u0000\u0089\u008b\u0001\u0000\u0000\u0000"+
		"\u008a\u0087\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u0015\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0007\u0000\u0000\u0000\u0090\u0017\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0003\u001e\u000f\u0000\u0092\u0094\u0003\"\u0011\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u009a\u0001\u0000\u0000\u0000\u0095\u0099\u0003\u001e\u000f\u0000\u0096"+
		"\u0099\u0003 \u0010\u0000\u0097\u0099\u0003\"\u0011\u0000\u0098\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00a4"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0"+
		"\u0003 \u0010\u0000\u009e\u00a0\u0003\"\u0011\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u0093\u0001"+
		"\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a4\u0019\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\u0010\u0000\u0000\u00a6\u00a7\u0005"+
		"\u0006\u0000\u0000\u00a7\u001b\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0011\u0000\u0000\u00a9\u00aa\u0005\u0006\u0000\u0000\u00aa\u001d\u0001"+
		"\u0000\u0000\u0000\u00ab\u00b0\u0005\u0006\u0000\u0000\u00ac\u00b0\u0003"+
		"\u001c\u000e\u0000\u00ad\u00b0\u0003\u001a\r\u0000\u00ae\u00b0\u0005\u0016"+
		"\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u001f\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\r\u0000"+
		"\u0000\u00b2\u00b3\u0007\u0001\u0000\u0000\u00b3!\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u001d\u0000\u0000\u00b5\u00b6\u0007\u0002\u0000\u0000"+
		"\u00b6#\u0001\u0000\u0000\u0000\u00b7\u00bc\u0003&\u0013\u0000\u00b8\u00b9"+
		"\u0005\u000e\u0000\u0000\u00b9\u00bb\u0003&\u0013\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005"+
		"\u000e\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1%\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003*\u0015"+
		"\u0000\u00c3\u00c4\u0005\r\u0000\u0000\u00c4\u00c6\u0003,\u0016\u0000"+
		"\u00c5\u00c7\u0003(\u0014\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\'\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0005\u0085\u0000\u0000\u00c9)\u0001\u0000\u0000\u0000\u00ca\u00cb\u0007"+
		"\u0003\u0000\u0000\u00cb+\u0001\u0000\u0000\u0000\u00cc\u00d0\u0003.\u0017"+
		"\u0000\u00cd\u00cf\u0003.\u0017\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1-\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d9\u00030\u0018\u0000\u00d4\u00d5"+
		"\u00030\u0018\u0000\u00d5\u00d6\u0007\u0004\u0000\u0000\u00d6\u00d7\u0003"+
		"0\u0018\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d9/\u0001\u0000\u0000"+
		"\u0000\u00da\u00e1\u00032\u0019\u0000\u00db\u00e1\u00034\u001a\u0000\u00dc"+
		"\u00e1\u0005\u0003\u0000\u0000\u00dd\u00e1\u0005\u0005\u0000\u0000\u00de"+
		"\u00e1\u00036\u001b\u0000\u00df\u00e1\u0005\u0006\u0000\u0000\u00e0\u00da"+
		"\u0001\u0000\u0000\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e0\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e11\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0005\u0004\u0000\u0000\u00e3\u00e5\u0005"+
		"\u008e\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e53\u0001\u0000\u0000\u0000\u00e6\u00e7\u0007\u0005"+
		"\u0000\u0000\u00e75\u0001\u0000\u0000\u0000\u00e8\u00e9\u00038\u001c\u0000"+
		"\u00e9\u00ea\u0005\u0012\u0000\u0000\u00ea\u00eb\u0003:\u001d\u0000\u00eb"+
		"\u00ec\u0005\u0013\u0000\u0000\u00ec7\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0007\u0006\u0000\u0000\u00ee9\u0001\u0000\u0000\u0000\u00ef\u00f6\u0003"+
		".\u0017\u0000\u00f0\u00f2\u0005\u000f\u0000\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0003.\u0017\u0000\u00f4\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7;\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u001c>@GMT\\fmoz\u0083\u008c\u0093"+
		"\u0098\u009a\u009f\u00a1\u00a3\u00af\u00bc\u00c0\u00c6\u00d0\u00d8\u00e0"+
		"\u00e4\u00f1\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}