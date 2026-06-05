// Generated from c:/Users/Asus/Desktop/Arabic_Compiler/Grammar/ArabicHtmlParser.g4 by ANTLR 4.13.1
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
		CLOSE_TAG=1, OPEN_TAG=2, SELF_CLOSE=3, CSS_DISPLAY=4, CSS_POSITION=5, 
		CSS_WIDTH=6, CSS_HEIGHT=7, CSS_MAX_WIDTH=8, CSS_MIN_WIDTH=9, CSS_MAX_HEIGHT=10, 
		CSS_MIN_HEIGHT=11, CSS_MARGIN=12, CSS_PADDING=13, CSS_BORDER=14, CSS_VISIBILITY=15, 
		CSS_OVERFLOW=16, CSS_Z_INDEX=17, CSS_BOX_SIZING=18, CSS_FLEX=19, CSS_FLEX_DIR=20, 
		CSS_FLEX_WRAP=21, CSS_FLEX_GROW=22, CSS_FLEX_SHRINK=23, CSS_GRID=24, CSS_GRID_TEMPLATE=25, 
		CSS_GAP=26, CSS_JUSTIFY_CONT=27, CSS_ALIGN_ITEMS=28, CSS_ALIGN_SELF=29, 
		CSS_ORDER=30, CSS_COLOR=31, CSS_BACKGROUND=32, CSS_BG_IMAGE=33, CSS_BG_COLOR=34, 
		CSS_BG_SIZE=35, CSS_BG_REPEAT=36, CSS_BG_ATTACH=37, CSS_BG_CLIP=38, CSS_OPACITY=39, 
		CSS_BOX_SHADOW=40, CSS_FONT_FAMILY=41, CSS_FONT_SIZE=42, CSS_FONT_WEIGHT=43, 
		CSS_FONT_STYLE=44, CSS_TEXT_ALIGN=45, CSS_TEXT_DECOR=46, CSS_TEXT_TRANS=47, 
		CSS_TEXT_SHADOW=48, CSS_TEXT_INDENT=49, CSS_LINE_HEIGHT=50, CSS_LETTER_SPACING=51, 
		CSS_WORD_SPACING=52, CSS_WHITE_SPACE=53, CSS_DIRECTION=54, CSS_WRITING_MODE=55, 
		CSS_BORDER_RADIUS=56, CSS_BORDER_WIDTH=57, CSS_BORDER_STYLE=58, CSS_BORDER_COLOR=59, 
		CSS_OUTLINE=60, CSS_TOP=61, CSS_BOTTOM=62, CSS_RIGHT=63, CSS_LEFT=64, 
		CSS_MEDIA=65, CSS_LIST_STYLE=66, CSS_BORDER_COLLAPSE=67, CSS_TABLE_LAYOUT=68, 
		CSS_CAPTION_SIDE=69, CSS_FILTER=70, CSS_BACKDROP_FILT=71, CSS_HOVER=72, 
		CSS_ACTIVE=73, CSS_FOCUS=74, CSS_VISITED=75, CSS_ENABLED=76, CSS_DISABLED=77, 
		CSS_CHECKED=78, CSS_BEFORE=79, CSS_AFTER=80, CSS_PLACEHOLDER=81, CSS_SELECTION=82, 
		CSS_INHERIT=83, CSS_INITIAL=84, CSS_UNSET=85, CSS_NONE=86, CSS_AUTO=87, 
		CSS_CENTER=88, CSS_SOLID=89, CSS_DASHED=90, CSS_DOTTED=91, CSS_DOUBLE=92, 
		CSS_HIDDEN=93, CSS_BLOCK=94, CSS_INLINE=95, CSS_FLEX_VALUE=96, CSS_ABSOLUTE=97, 
		CSS_RELATIVE=98, CSS_FIXED=99, CSS_STICKY=100, CSS_ROW=101, CSS_COLUMN=102, 
		CSS_WRAP=103, CSS_POINTER=104, CSS_BOLD=105, CSS_ITALIC=106, CSS_IMPORTANT=107, 
		CSS_URL_FUNC=108, CSS_RGB_FUNC=109, CSS_RGBA_FUNC=110, CSS_CALC_FUNC=111, 
		CSS_VAR_FUNC=112, CSS_ROTATE_FUNC=113, CSS_SCALE_FUNC=114, CSS_BLUR_FUNC=115, 
		JS_VAR=116, JS_LET=117, JS_CONST=118, JS_ARRAY_KW=119, JS_STRING_KW=120, 
		JS_NUMBER_KW=121, JS_BOOLEAN_KW=122, JS_SYMBOL_KW=123, JS_MAP_KW=124, 
		JS_SET_KW=125, JS_DATE_KW=126, JS_OBJECT_KW=127, JS_IF=128, JS_ELSE=129, 
		JS_SWITCH=130, JS_CASE=131, JS_DEFAULT=132, JS_FOR=133, JS_WHILE=134, 
		JS_DO=135, JS_BREAK=136, JS_CONTINUE=137, JS_OF=138, JS_IN=139, JS_FUNCTION=140, 
		JS_RETURN=141, JS_TRUE=142, JS_FALSE=143, JS_NULL=144, JS_UNDEFINED=145, 
		JS_THIS=146, JS_NAN=147, JS_INFINITY=148, JS_TRY=149, JS_CATCH=150, JS_FINALLY=151, 
		JS_THROW=152, JS_EXCEPTION=153, JS_NEW=154, JS_CLASS=155, JS_EXTENDS=156, 
		JS_SUPER=157, JS_IMPLEMENTS=158, JS_INTERFACE=159, JS_CONSTRUCTOR=160, 
		JS_PRIVATE=161, JS_PROTECTED=162, JS_PUBLIC=163, JS_STATIC=164, JS_ENUM=165, 
		JS_PACKAGE=166, JS_IMPORT=167, JS_EXPORT=168, JS_FROM=169, JS_AS=170, 
		JS_TYPEOF=171, JS_INSTANCEOF=172, JS_DELETE=173, JS_DOCUMENT=174, JS_WINDOW=175, 
		JS_CONSOLE=176, JS_EVENT=177, JS_NODE=178, JS_ELEMENT=179, JS_LISTENER=180, 
		JS_LOCAL_STORAGE=181, JS_SESSION_STORAGE=182, JS_GET_ELEMENT=183, JS_GET_ELEMENTS=184, 
		JS_CREATE_EL=185, JS_INNER_TEXT=186, JS_INNER_HTML=187, JS_STYLE=188, 
		JS_ADD_LISTENER=189, JS_ON_CLICK=190, JS_ON_SUBMIT=191, JS_ON_CHANGE=192, 
		JS_ON_LOAD=193, JS_LOG=194, JS_ALERT=195, JS_PROMPT=196, IDENTIFIER=197, 
		CSS_UNIT=198, NUMBER=199, CSS_HEX_COLOR=200, JS_INC=201, JS_DEC=202, JS_EXP_ASSIGN=203, 
		JS_EXP=204, JS_ADD_ASSIGN=205, JS_SUB_ASSIGN=206, JS_MUL_ASSIGN=207, JS_DIV_ASSIGN=208, 
		JS_MOD_ASSIGN=209, JS_AND_ASSIGN=210, JS_OR_ASSIGN=211, JS_NULL_ASSIGN=212, 
		JS_SPREAD=213, JS_ARROW=214, JS_STREQ=215, JS_STRNEQ=216, JS_EQ=217, JS_NEQ=218, 
		JS_GTE=219, JS_LTE=220, JS_AND=221, JS_OR=222, JS_NULL_COAL=223, JS_URSH=224, 
		JS_RSH=225, JS_LSH=226, JS_ASSIGN=227, JS_BIT_AND=228, JS_BIT_OR=229, 
		JS_BIT_XOR=230, JS_QUESTION=231, LBRACE=232, RBRACE=233, COLON=234, SEMI=235, 
		COMMA=236, DOT=237, HASH=238, LPAREN=239, RPAREN=240, TILDE=241, DBL_COLON=242, 
		LBRACK=243, RBRACK=244, PLUS=245, MINUS=246, STAR=247, SLASH=248, PERCENT=249, 
		LT=250, GT=251, BANG=252, WS=253, BLOCK_COMMENT=254, LINE_COMMENT=255, 
		STRING=256;
	public static final int
		RULE_program = 0, RULE_htmlElement = 1, RULE_htmlContent = 2, RULE_text = 3, 
		RULE_arabicKeyword = 4, RULE_cssRule = 5, RULE_selector = 6, RULE_declarationList = 7, 
		RULE_declaration = 8, RULE_cssProperty = 9, RULE_cssValue = 10, RULE_cssFunction = 11, 
		RULE_jsStatement = 12, RULE_block = 13, RULE_variableDeclaration = 14, 
		RULE_assignmentStatement = 15, RULE_ifStatement = 16, RULE_forLoop = 17, 
		RULE_whileLoop = 18, RULE_functionDeclaration = 19, RULE_parameterList = 20, 
		RULE_returnStatement = 21, RULE_tryCatchStatement = 22, RULE_expressionStatement = 23, 
		RULE_builtInCall = 24, RULE_expression = 25, RULE_assignmentExpression = 26, 
		RULE_logicalOrExpression = 27, RULE_logicalAndExpression = 28, RULE_equalityExpression = 29, 
		RULE_relationalExpression = 30, RULE_additiveExpression = 31, RULE_multiplicativeExpression = 32, 
		RULE_memberExpression = 33, RULE_primaryExpression = 34, RULE_arrayLiteral = 35, 
		RULE_objectLiteral = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "htmlElement", "htmlContent", "text", "arabicKeyword", "cssRule", 
			"selector", "declarationList", "declaration", "cssProperty", "cssValue", 
			"cssFunction", "jsStatement", "block", "variableDeclaration", "assignmentStatement", 
			"ifStatement", "forLoop", "whileLoop", "functionDeclaration", "parameterList", 
			"returnStatement", "tryCatchStatement", "expressionStatement", "builtInCall", 
			"expression", "assignmentExpression", "logicalOrExpression", "logicalAndExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"memberExpression", "primaryExpression", "arrayLiteral", "objectLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'\\u0639\\u0631\\u0636'", "'\\u0645\\u0648\\u0642\\u0639'", 
			"'\\u0639\\u0631\\u0636-\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629'", 
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
			"'\\u0623\\u0648\\u0644\\u064A'", "'\\u063A\\u064A\\u0631-\\u0645\\u062D\\u062F\\u062F'", 
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
			"'\\u062A\\u063A\\u0628\\u064A\\u0634'", "'\\u0645\\u062A\\u063A\\u064A\\u0631'", 
			"'\\u0644\\u0646\\u0641\\u0631\\u0636'", "'\\u062B\\u0627\\u0628\\u062A'", 
			"'\\u0645\\u0635\\u0641\\u0648\\u0641\\u0629'", "'\\u0633\\u0644\\u0633\\u0644\\u0629'", 
			"'\\u0639\\u062F\\u062F'", "'\\u0645\\u0646\\u0637\\u0642\\u064A'", "'\\u0631\\u0645\\u0632'", 
			"'\\u062E\\u0631\\u064A\\u0637\\u0629'", "'\\u0645\\u062C\\u0645\\u0648\\u0639\\u0629'", 
			"'\\u062A\\u0627\\u0631\\u064A\\u062E'", "'\\u0643\\u0627\\u0626\\u0646'", 
			null, null, "'\\u0627\\u062E\\u062A\\u0628\\u0631'", "'\\u062D\\u0627\\u0644\\u0629'", 
			"'\\u0628\\u0634\\u0643\\u0644-\\u0627\\u0641\\u062A\\u0631\\u0627\\u0636\\u064A'", 
			null, "'\\u0637\\u0627\\u0644\\u0645\\u0627'", "'\\u0646\\u0641\\u0630'", 
			"'\\u0625\\u064A\\u0642\\u0627\\u0641'", "'\\u062A\\u062E\\u0637\\u0649-\\u062B\\u0645-\\u062A\\u0627\\u0628\\u0639'", 
			"'\\u0641\\u064A'", "'\\u0636\\u0645\\u0646'", "'\\u062F\\u0627\\u0644\\u0629'", 
			null, "'\\u0635\\u062D\\u064A\\u062D'", "'\\u062E\\u0627\\u0637\\u0626'", 
			"'\\u063A\\u064A\\u0631_\\u0645\\u0648\\u062C\\u0648\\u062F'", "'\\u063A\\u064A\\u0631_\\u0645\\u0639\\u0631\\u0641'", 
			"'\\u0647\\u0630\\u0627'", "'\\u0644\\u064A\\u0633_\\u0631\\u0642\\u0645'", 
			"'\\u0644\\u0627\\u0646\\u0647\\u0627\\u064A\\u0629'", "'\\u062D\\u0627\\u0648\\u0644'", 
			"'\\u0627\\u0645\\u0633\\u0643'", null, null, "'\\u0627\\u0633\\u062A\\u062B\\u0646\\u0627\\u0621'", 
			"'\\u0639\\u0646\\u0635\\u0631-\\u062C\\u062F\\u064A\\u062F'", null, 
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
			"'\\u0627\\u062F\\u062E\\u0644'", null, null, null, null, "'++'", "'--'", 
			"'**='", "'**'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&&='", "'||='", 
			"'??='", "'...'", "'=>'", "'==='", "'!=='", "'=='", "'!='", "'>='", "'<='", 
			"'&&'", "'||'", "'??'", "'>>>'", "'>>'", "'<<'", "'='", "'&'", "'|'", 
			"'^'", "'?'", "'{'", "'}'", "':'", "'\\u061B'", "'\\u060C'", "'.'", "'#'", 
			"'('", "')'", "'~'", "'::'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'<'", "'>'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLOSE_TAG", "OPEN_TAG", "SELF_CLOSE", "CSS_DISPLAY", "CSS_POSITION", 
			"CSS_WIDTH", "CSS_HEIGHT", "CSS_MAX_WIDTH", "CSS_MIN_WIDTH", "CSS_MAX_HEIGHT", 
			"CSS_MIN_HEIGHT", "CSS_MARGIN", "CSS_PADDING", "CSS_BORDER", "CSS_VISIBILITY", 
			"CSS_OVERFLOW", "CSS_Z_INDEX", "CSS_BOX_SIZING", "CSS_FLEX", "CSS_FLEX_DIR", 
			"CSS_FLEX_WRAP", "CSS_FLEX_GROW", "CSS_FLEX_SHRINK", "CSS_GRID", "CSS_GRID_TEMPLATE", 
			"CSS_GAP", "CSS_JUSTIFY_CONT", "CSS_ALIGN_ITEMS", "CSS_ALIGN_SELF", "CSS_ORDER", 
			"CSS_COLOR", "CSS_BACKGROUND", "CSS_BG_IMAGE", "CSS_BG_COLOR", "CSS_BG_SIZE", 
			"CSS_BG_REPEAT", "CSS_BG_ATTACH", "CSS_BG_CLIP", "CSS_OPACITY", "CSS_BOX_SHADOW", 
			"CSS_FONT_FAMILY", "CSS_FONT_SIZE", "CSS_FONT_WEIGHT", "CSS_FONT_STYLE", 
			"CSS_TEXT_ALIGN", "CSS_TEXT_DECOR", "CSS_TEXT_TRANS", "CSS_TEXT_SHADOW", 
			"CSS_TEXT_INDENT", "CSS_LINE_HEIGHT", "CSS_LETTER_SPACING", "CSS_WORD_SPACING", 
			"CSS_WHITE_SPACE", "CSS_DIRECTION", "CSS_WRITING_MODE", "CSS_BORDER_RADIUS", 
			"CSS_BORDER_WIDTH", "CSS_BORDER_STYLE", "CSS_BORDER_COLOR", "CSS_OUTLINE", 
			"CSS_TOP", "CSS_BOTTOM", "CSS_RIGHT", "CSS_LEFT", "CSS_MEDIA", "CSS_LIST_STYLE", 
			"CSS_BORDER_COLLAPSE", "CSS_TABLE_LAYOUT", "CSS_CAPTION_SIDE", "CSS_FILTER", 
			"CSS_BACKDROP_FILT", "CSS_HOVER", "CSS_ACTIVE", "CSS_FOCUS", "CSS_VISITED", 
			"CSS_ENABLED", "CSS_DISABLED", "CSS_CHECKED", "CSS_BEFORE", "CSS_AFTER", 
			"CSS_PLACEHOLDER", "CSS_SELECTION", "CSS_INHERIT", "CSS_INITIAL", "CSS_UNSET", 
			"CSS_NONE", "CSS_AUTO", "CSS_CENTER", "CSS_SOLID", "CSS_DASHED", "CSS_DOTTED", 
			"CSS_DOUBLE", "CSS_HIDDEN", "CSS_BLOCK", "CSS_INLINE", "CSS_FLEX_VALUE", 
			"CSS_ABSOLUTE", "CSS_RELATIVE", "CSS_FIXED", "CSS_STICKY", "CSS_ROW", 
			"CSS_COLUMN", "CSS_WRAP", "CSS_POINTER", "CSS_BOLD", "CSS_ITALIC", "CSS_IMPORTANT", 
			"CSS_URL_FUNC", "CSS_RGB_FUNC", "CSS_RGBA_FUNC", "CSS_CALC_FUNC", "CSS_VAR_FUNC", 
			"CSS_ROTATE_FUNC", "CSS_SCALE_FUNC", "CSS_BLUR_FUNC", "JS_VAR", "JS_LET", 
			"JS_CONST", "JS_ARRAY_KW", "JS_STRING_KW", "JS_NUMBER_KW", "JS_BOOLEAN_KW", 
			"JS_SYMBOL_KW", "JS_MAP_KW", "JS_SET_KW", "JS_DATE_KW", "JS_OBJECT_KW", 
			"JS_IF", "JS_ELSE", "JS_SWITCH", "JS_CASE", "JS_DEFAULT", "JS_FOR", "JS_WHILE", 
			"JS_DO", "JS_BREAK", "JS_CONTINUE", "JS_OF", "JS_IN", "JS_FUNCTION", 
			"JS_RETURN", "JS_TRUE", "JS_FALSE", "JS_NULL", "JS_UNDEFINED", "JS_THIS", 
			"JS_NAN", "JS_INFINITY", "JS_TRY", "JS_CATCH", "JS_FINALLY", "JS_THROW", 
			"JS_EXCEPTION", "JS_NEW", "JS_CLASS", "JS_EXTENDS", "JS_SUPER", "JS_IMPLEMENTS", 
			"JS_INTERFACE", "JS_CONSTRUCTOR", "JS_PRIVATE", "JS_PROTECTED", "JS_PUBLIC", 
			"JS_STATIC", "JS_ENUM", "JS_PACKAGE", "JS_IMPORT", "JS_EXPORT", "JS_FROM", 
			"JS_AS", "JS_TYPEOF", "JS_INSTANCEOF", "JS_DELETE", "JS_DOCUMENT", "JS_WINDOW", 
			"JS_CONSOLE", "JS_EVENT", "JS_NODE", "JS_ELEMENT", "JS_LISTENER", "JS_LOCAL_STORAGE", 
			"JS_SESSION_STORAGE", "JS_GET_ELEMENT", "JS_GET_ELEMENTS", "JS_CREATE_EL", 
			"JS_INNER_TEXT", "JS_INNER_HTML", "JS_STYLE", "JS_ADD_LISTENER", "JS_ON_CLICK", 
			"JS_ON_SUBMIT", "JS_ON_CHANGE", "JS_ON_LOAD", "JS_LOG", "JS_ALERT", "JS_PROMPT", 
			"IDENTIFIER", "CSS_UNIT", "NUMBER", "CSS_HEX_COLOR", "JS_INC", "JS_DEC", 
			"JS_EXP_ASSIGN", "JS_EXP", "JS_ADD_ASSIGN", "JS_SUB_ASSIGN", "JS_MUL_ASSIGN", 
			"JS_DIV_ASSIGN", "JS_MOD_ASSIGN", "JS_AND_ASSIGN", "JS_OR_ASSIGN", "JS_NULL_ASSIGN", 
			"JS_SPREAD", "JS_ARROW", "JS_STREQ", "JS_STRNEQ", "JS_EQ", "JS_NEQ", 
			"JS_GTE", "JS_LTE", "JS_AND", "JS_OR", "JS_NULL_COAL", "JS_URSH", "JS_RSH", 
			"JS_LSH", "JS_ASSIGN", "JS_BIT_AND", "JS_BIT_OR", "JS_BIT_XOR", "JS_QUESTION", 
			"LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", "DOT", "HASH", "LPAREN", 
			"RPAREN", "TILDE", "DBL_COLON", "LBRACK", "RBRACK", "PLUS", "MINUS", 
			"STAR", "SLASH", "PERCENT", "LT", "GT", "BANG", "WS", "BLOCK_COMMENT", 
			"LINE_COMMENT", "STRING"
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
		public List<JsStatementContext> jsStatement() {
			return getRuleContexts(JsStatementContext.class);
		}
		public JsStatementContext jsStatement(int i) {
			return getRuleContext(JsStatementContext.class,i);
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -9223372036854775805L) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 2017612645930504199L) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & 2306155407954935831L) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(74);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(75);
					cssRule();
					}
					break;
				case 3:
					{
					setState(76);
					jsStatement();
					}
					break;
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
		public TerminalNode OPEN_TAG() { return getToken(ArabicHtmlParser.OPEN_TAG, 0); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode CLOSE_TAG() { return getToken(ArabicHtmlParser.CLOSE_TAG, 0); }
		public TerminalNode SELF_CLOSE() { return getToken(ArabicHtmlParser.SELF_CLOSE, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElement);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(OPEN_TAG);
				setState(85);
				htmlContent();
				setState(86);
				match(CLOSE_TAG);
				}
				break;
			case SELF_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(SELF_CLOSE);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<JsStatementContext> jsStatement() {
			return getRuleContexts(JsStatementContext.class);
		}
		public JsStatementContext jsStatement(int i) {
			return getRuleContext(JsStatementContext.class,i);
		}
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12316L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9207609437613719551L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 246290606194225L) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & 2306155407954935831L) != 0)) {
				{
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(91);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(92);
					jsStatement();
					}
					break;
				case 3:
					{
					setState(93);
					cssRule();
					}
					break;
				case 4:
					{
					setState(94);
					text();
					}
					break;
				}
				}
				setState(99);
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
	public static class TextContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(ArabicHtmlParser.NUMBER, 0); }
		public ArabicKeywordContext arabicKeyword() {
			return getRuleContext(ArabicKeywordContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_text);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(NUMBER);
				}
				break;
			case CSS_DISPLAY:
			case CSS_MARGIN:
			case CSS_PADDING:
			case CSS_CENTER:
			case CSS_BLOCK:
			case JS_VAR:
			case JS_LET:
			case JS_CONST:
			case JS_IF:
			case JS_ELSE:
			case JS_FOR:
			case JS_WHILE:
			case JS_OF:
			case JS_IN:
			case JS_FUNCTION:
			case JS_RETURN:
			case JS_TRUE:
			case JS_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				arabicKeyword();
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
	public static class ArabicKeywordContext extends ParserRuleContext {
		public TerminalNode JS_IF() { return getToken(ArabicHtmlParser.JS_IF, 0); }
		public TerminalNode JS_ELSE() { return getToken(ArabicHtmlParser.JS_ELSE, 0); }
		public TerminalNode JS_FOR() { return getToken(ArabicHtmlParser.JS_FOR, 0); }
		public TerminalNode JS_WHILE() { return getToken(ArabicHtmlParser.JS_WHILE, 0); }
		public TerminalNode JS_FUNCTION() { return getToken(ArabicHtmlParser.JS_FUNCTION, 0); }
		public TerminalNode JS_RETURN() { return getToken(ArabicHtmlParser.JS_RETURN, 0); }
		public TerminalNode JS_OF() { return getToken(ArabicHtmlParser.JS_OF, 0); }
		public TerminalNode JS_IN() { return getToken(ArabicHtmlParser.JS_IN, 0); }
		public TerminalNode JS_VAR() { return getToken(ArabicHtmlParser.JS_VAR, 0); }
		public TerminalNode JS_LET() { return getToken(ArabicHtmlParser.JS_LET, 0); }
		public TerminalNode JS_CONST() { return getToken(ArabicHtmlParser.JS_CONST, 0); }
		public TerminalNode JS_TRUE() { return getToken(ArabicHtmlParser.JS_TRUE, 0); }
		public TerminalNode JS_FALSE() { return getToken(ArabicHtmlParser.JS_FALSE, 0); }
		public TerminalNode CSS_DISPLAY() { return getToken(ArabicHtmlParser.CSS_DISPLAY, 0); }
		public TerminalNode CSS_MARGIN() { return getToken(ArabicHtmlParser.CSS_MARGIN, 0); }
		public TerminalNode CSS_PADDING() { return getToken(ArabicHtmlParser.CSS_PADDING, 0); }
		public TerminalNode CSS_CENTER() { return getToken(ArabicHtmlParser.CSS_CENTER, 0); }
		public TerminalNode CSS_BLOCK() { return getToken(ArabicHtmlParser.CSS_BLOCK, 0); }
		public ArabicKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arabicKeyword; }
	}

	public final ArabicKeywordContext arabicKeyword() throws RecognitionException {
		ArabicKeywordContext _localctx = new ArabicKeywordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arabicKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12304L) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 71040547661283393L) != 0)) ) {
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
			setState(108);
			selector();
			setState(109);
			match(LBRACE);
			setState(110);
			declarationList();
			setState(111);
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
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode HASH() { return getToken(ArabicHtmlParser.HASH, 0); }
		public TerminalNode DOT() { return getToken(ArabicHtmlParser.DOT, 0); }
		public TerminalNode CSS_MEDIA() { return getToken(ArabicHtmlParser.CSS_MEDIA, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selector);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(IDENTIFIER);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(HASH);
				setState(115);
				match(IDENTIFIER);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(DOT);
				setState(117);
				match(IDENTIFIER);
				}
				break;
			case CSS_MEDIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(CSS_MEDIA);
				setState(119);
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
			setState(122);
			declaration();
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(SEMI);
					setState(124);
					declaration();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(130);
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
			setState(133);
			cssProperty();
			setState(134);
			match(COLON);
			setState(135);
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
		public TerminalNode CSS_DISPLAY() { return getToken(ArabicHtmlParser.CSS_DISPLAY, 0); }
		public TerminalNode CSS_POSITION() { return getToken(ArabicHtmlParser.CSS_POSITION, 0); }
		public TerminalNode CSS_WIDTH() { return getToken(ArabicHtmlParser.CSS_WIDTH, 0); }
		public TerminalNode CSS_HEIGHT() { return getToken(ArabicHtmlParser.CSS_HEIGHT, 0); }
		public TerminalNode CSS_MAX_WIDTH() { return getToken(ArabicHtmlParser.CSS_MAX_WIDTH, 0); }
		public TerminalNode CSS_MIN_WIDTH() { return getToken(ArabicHtmlParser.CSS_MIN_WIDTH, 0); }
		public TerminalNode CSS_MAX_HEIGHT() { return getToken(ArabicHtmlParser.CSS_MAX_HEIGHT, 0); }
		public TerminalNode CSS_MIN_HEIGHT() { return getToken(ArabicHtmlParser.CSS_MIN_HEIGHT, 0); }
		public TerminalNode CSS_MARGIN() { return getToken(ArabicHtmlParser.CSS_MARGIN, 0); }
		public TerminalNode CSS_PADDING() { return getToken(ArabicHtmlParser.CSS_PADDING, 0); }
		public TerminalNode CSS_BORDER() { return getToken(ArabicHtmlParser.CSS_BORDER, 0); }
		public TerminalNode CSS_VISIBILITY() { return getToken(ArabicHtmlParser.CSS_VISIBILITY, 0); }
		public TerminalNode CSS_OVERFLOW() { return getToken(ArabicHtmlParser.CSS_OVERFLOW, 0); }
		public TerminalNode CSS_Z_INDEX() { return getToken(ArabicHtmlParser.CSS_Z_INDEX, 0); }
		public TerminalNode CSS_BOX_SIZING() { return getToken(ArabicHtmlParser.CSS_BOX_SIZING, 0); }
		public TerminalNode CSS_FLEX() { return getToken(ArabicHtmlParser.CSS_FLEX, 0); }
		public TerminalNode CSS_FLEX_DIR() { return getToken(ArabicHtmlParser.CSS_FLEX_DIR, 0); }
		public TerminalNode CSS_FLEX_WRAP() { return getToken(ArabicHtmlParser.CSS_FLEX_WRAP, 0); }
		public TerminalNode CSS_FLEX_GROW() { return getToken(ArabicHtmlParser.CSS_FLEX_GROW, 0); }
		public TerminalNode CSS_FLEX_SHRINK() { return getToken(ArabicHtmlParser.CSS_FLEX_SHRINK, 0); }
		public TerminalNode CSS_GRID() { return getToken(ArabicHtmlParser.CSS_GRID, 0); }
		public TerminalNode CSS_GRID_TEMPLATE() { return getToken(ArabicHtmlParser.CSS_GRID_TEMPLATE, 0); }
		public TerminalNode CSS_GAP() { return getToken(ArabicHtmlParser.CSS_GAP, 0); }
		public TerminalNode CSS_JUSTIFY_CONT() { return getToken(ArabicHtmlParser.CSS_JUSTIFY_CONT, 0); }
		public TerminalNode CSS_ALIGN_ITEMS() { return getToken(ArabicHtmlParser.CSS_ALIGN_ITEMS, 0); }
		public TerminalNode CSS_ALIGN_SELF() { return getToken(ArabicHtmlParser.CSS_ALIGN_SELF, 0); }
		public TerminalNode CSS_ORDER() { return getToken(ArabicHtmlParser.CSS_ORDER, 0); }
		public TerminalNode CSS_COLOR() { return getToken(ArabicHtmlParser.CSS_COLOR, 0); }
		public TerminalNode CSS_BACKGROUND() { return getToken(ArabicHtmlParser.CSS_BACKGROUND, 0); }
		public TerminalNode CSS_BG_IMAGE() { return getToken(ArabicHtmlParser.CSS_BG_IMAGE, 0); }
		public TerminalNode CSS_BG_COLOR() { return getToken(ArabicHtmlParser.CSS_BG_COLOR, 0); }
		public TerminalNode CSS_BG_SIZE() { return getToken(ArabicHtmlParser.CSS_BG_SIZE, 0); }
		public TerminalNode CSS_BG_REPEAT() { return getToken(ArabicHtmlParser.CSS_BG_REPEAT, 0); }
		public TerminalNode CSS_BG_ATTACH() { return getToken(ArabicHtmlParser.CSS_BG_ATTACH, 0); }
		public TerminalNode CSS_BG_CLIP() { return getToken(ArabicHtmlParser.CSS_BG_CLIP, 0); }
		public TerminalNode CSS_OPACITY() { return getToken(ArabicHtmlParser.CSS_OPACITY, 0); }
		public TerminalNode CSS_BOX_SHADOW() { return getToken(ArabicHtmlParser.CSS_BOX_SHADOW, 0); }
		public TerminalNode CSS_FONT_FAMILY() { return getToken(ArabicHtmlParser.CSS_FONT_FAMILY, 0); }
		public TerminalNode CSS_FONT_SIZE() { return getToken(ArabicHtmlParser.CSS_FONT_SIZE, 0); }
		public TerminalNode CSS_FONT_WEIGHT() { return getToken(ArabicHtmlParser.CSS_FONT_WEIGHT, 0); }
		public TerminalNode CSS_FONT_STYLE() { return getToken(ArabicHtmlParser.CSS_FONT_STYLE, 0); }
		public TerminalNode CSS_TEXT_ALIGN() { return getToken(ArabicHtmlParser.CSS_TEXT_ALIGN, 0); }
		public TerminalNode CSS_TEXT_DECOR() { return getToken(ArabicHtmlParser.CSS_TEXT_DECOR, 0); }
		public TerminalNode CSS_TEXT_TRANS() { return getToken(ArabicHtmlParser.CSS_TEXT_TRANS, 0); }
		public TerminalNode CSS_TEXT_SHADOW() { return getToken(ArabicHtmlParser.CSS_TEXT_SHADOW, 0); }
		public TerminalNode CSS_TEXT_INDENT() { return getToken(ArabicHtmlParser.CSS_TEXT_INDENT, 0); }
		public TerminalNode CSS_LINE_HEIGHT() { return getToken(ArabicHtmlParser.CSS_LINE_HEIGHT, 0); }
		public TerminalNode CSS_LETTER_SPACING() { return getToken(ArabicHtmlParser.CSS_LETTER_SPACING, 0); }
		public TerminalNode CSS_WORD_SPACING() { return getToken(ArabicHtmlParser.CSS_WORD_SPACING, 0); }
		public TerminalNode CSS_WHITE_SPACE() { return getToken(ArabicHtmlParser.CSS_WHITE_SPACE, 0); }
		public TerminalNode CSS_DIRECTION() { return getToken(ArabicHtmlParser.CSS_DIRECTION, 0); }
		public TerminalNode CSS_WRITING_MODE() { return getToken(ArabicHtmlParser.CSS_WRITING_MODE, 0); }
		public TerminalNode CSS_BORDER_RADIUS() { return getToken(ArabicHtmlParser.CSS_BORDER_RADIUS, 0); }
		public TerminalNode CSS_BORDER_WIDTH() { return getToken(ArabicHtmlParser.CSS_BORDER_WIDTH, 0); }
		public TerminalNode CSS_BORDER_STYLE() { return getToken(ArabicHtmlParser.CSS_BORDER_STYLE, 0); }
		public TerminalNode CSS_BORDER_COLOR() { return getToken(ArabicHtmlParser.CSS_BORDER_COLOR, 0); }
		public TerminalNode CSS_OUTLINE() { return getToken(ArabicHtmlParser.CSS_OUTLINE, 0); }
		public TerminalNode CSS_LIST_STYLE() { return getToken(ArabicHtmlParser.CSS_LIST_STYLE, 0); }
		public TerminalNode CSS_BORDER_COLLAPSE() { return getToken(ArabicHtmlParser.CSS_BORDER_COLLAPSE, 0); }
		public TerminalNode CSS_TABLE_LAYOUT() { return getToken(ArabicHtmlParser.CSS_TABLE_LAYOUT, 0); }
		public TerminalNode CSS_CAPTION_SIDE() { return getToken(ArabicHtmlParser.CSS_CAPTION_SIDE, 0); }
		public TerminalNode CSS_FILTER() { return getToken(ArabicHtmlParser.CSS_FILTER, 0); }
		public TerminalNode CSS_BACKDROP_FILT() { return getToken(ArabicHtmlParser.CSS_BACKDROP_FILT, 0); }
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843009213693936L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 63L) != 0)) ) {
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
	public static class CssValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(ArabicHtmlParser.NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(ArabicHtmlParser.CSS_UNIT, 0); }
		public TerminalNode CSS_HEX_COLOR() { return getToken(ArabicHtmlParser.CSS_HEX_COLOR, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public TerminalNode CSS_INHERIT() { return getToken(ArabicHtmlParser.CSS_INHERIT, 0); }
		public TerminalNode CSS_INITIAL() { return getToken(ArabicHtmlParser.CSS_INITIAL, 0); }
		public TerminalNode CSS_UNSET() { return getToken(ArabicHtmlParser.CSS_UNSET, 0); }
		public TerminalNode CSS_NONE() { return getToken(ArabicHtmlParser.CSS_NONE, 0); }
		public TerminalNode CSS_AUTO() { return getToken(ArabicHtmlParser.CSS_AUTO, 0); }
		public TerminalNode CSS_CENTER() { return getToken(ArabicHtmlParser.CSS_CENTER, 0); }
		public TerminalNode CSS_SOLID() { return getToken(ArabicHtmlParser.CSS_SOLID, 0); }
		public TerminalNode CSS_DASHED() { return getToken(ArabicHtmlParser.CSS_DASHED, 0); }
		public TerminalNode CSS_DOTTED() { return getToken(ArabicHtmlParser.CSS_DOTTED, 0); }
		public TerminalNode CSS_DOUBLE() { return getToken(ArabicHtmlParser.CSS_DOUBLE, 0); }
		public TerminalNode CSS_HIDDEN() { return getToken(ArabicHtmlParser.CSS_HIDDEN, 0); }
		public TerminalNode CSS_BLOCK() { return getToken(ArabicHtmlParser.CSS_BLOCK, 0); }
		public TerminalNode CSS_INLINE() { return getToken(ArabicHtmlParser.CSS_INLINE, 0); }
		public TerminalNode CSS_FLEX_VALUE() { return getToken(ArabicHtmlParser.CSS_FLEX_VALUE, 0); }
		public TerminalNode CSS_ABSOLUTE() { return getToken(ArabicHtmlParser.CSS_ABSOLUTE, 0); }
		public TerminalNode CSS_RELATIVE() { return getToken(ArabicHtmlParser.CSS_RELATIVE, 0); }
		public TerminalNode CSS_FIXED() { return getToken(ArabicHtmlParser.CSS_FIXED, 0); }
		public TerminalNode CSS_STICKY() { return getToken(ArabicHtmlParser.CSS_STICKY, 0); }
		public TerminalNode CSS_ROW() { return getToken(ArabicHtmlParser.CSS_ROW, 0); }
		public TerminalNode CSS_COLUMN() { return getToken(ArabicHtmlParser.CSS_COLUMN, 0); }
		public TerminalNode CSS_WRAP() { return getToken(ArabicHtmlParser.CSS_WRAP, 0); }
		public TerminalNode CSS_BOLD() { return getToken(ArabicHtmlParser.CSS_BOLD, 0); }
		public TerminalNode CSS_ITALIC() { return getToken(ArabicHtmlParser.CSS_ITALIC, 0); }
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cssValue);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(NUMBER);
				}
				break;
			case CSS_UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(CSS_UNIT);
				}
				break;
			case CSS_HEX_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(CSS_HEX_COLOR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(STRING);
				}
				break;
			case CSS_INHERIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(CSS_INHERIT);
				}
				break;
			case CSS_INITIAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(CSS_INITIAL);
				}
				break;
			case CSS_UNSET:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				match(CSS_UNSET);
				}
				break;
			case CSS_NONE:
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				match(CSS_NONE);
				}
				break;
			case CSS_AUTO:
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
				match(CSS_AUTO);
				}
				break;
			case CSS_CENTER:
				enterOuterAlt(_localctx, 11);
				{
				setState(149);
				match(CSS_CENTER);
				}
				break;
			case CSS_SOLID:
				enterOuterAlt(_localctx, 12);
				{
				setState(150);
				match(CSS_SOLID);
				}
				break;
			case CSS_DASHED:
				enterOuterAlt(_localctx, 13);
				{
				setState(151);
				match(CSS_DASHED);
				}
				break;
			case CSS_DOTTED:
				enterOuterAlt(_localctx, 14);
				{
				setState(152);
				match(CSS_DOTTED);
				}
				break;
			case CSS_DOUBLE:
				enterOuterAlt(_localctx, 15);
				{
				setState(153);
				match(CSS_DOUBLE);
				}
				break;
			case CSS_HIDDEN:
				enterOuterAlt(_localctx, 16);
				{
				setState(154);
				match(CSS_HIDDEN);
				}
				break;
			case CSS_BLOCK:
				enterOuterAlt(_localctx, 17);
				{
				setState(155);
				match(CSS_BLOCK);
				}
				break;
			case CSS_INLINE:
				enterOuterAlt(_localctx, 18);
				{
				setState(156);
				match(CSS_INLINE);
				}
				break;
			case CSS_FLEX_VALUE:
				enterOuterAlt(_localctx, 19);
				{
				setState(157);
				match(CSS_FLEX_VALUE);
				}
				break;
			case CSS_ABSOLUTE:
				enterOuterAlt(_localctx, 20);
				{
				setState(158);
				match(CSS_ABSOLUTE);
				}
				break;
			case CSS_RELATIVE:
				enterOuterAlt(_localctx, 21);
				{
				setState(159);
				match(CSS_RELATIVE);
				}
				break;
			case CSS_FIXED:
				enterOuterAlt(_localctx, 22);
				{
				setState(160);
				match(CSS_FIXED);
				}
				break;
			case CSS_STICKY:
				enterOuterAlt(_localctx, 23);
				{
				setState(161);
				match(CSS_STICKY);
				}
				break;
			case CSS_ROW:
				enterOuterAlt(_localctx, 24);
				{
				setState(162);
				match(CSS_ROW);
				}
				break;
			case CSS_COLUMN:
				enterOuterAlt(_localctx, 25);
				{
				setState(163);
				match(CSS_COLUMN);
				}
				break;
			case CSS_WRAP:
				enterOuterAlt(_localctx, 26);
				{
				setState(164);
				match(CSS_WRAP);
				}
				break;
			case CSS_BOLD:
				enterOuterAlt(_localctx, 27);
				{
				setState(165);
				match(CSS_BOLD);
				}
				break;
			case CSS_ITALIC:
				enterOuterAlt(_localctx, 28);
				{
				setState(166);
				match(CSS_ITALIC);
				}
				break;
			case CSS_URL_FUNC:
			case CSS_RGB_FUNC:
			case CSS_RGBA_FUNC:
			case CSS_CALC_FUNC:
			case CSS_VAR_FUNC:
			case CSS_ROTATE_FUNC:
			case CSS_SCALE_FUNC:
			case CSS_BLUR_FUNC:
				enterOuterAlt(_localctx, 29);
				{
				setState(167);
				cssFunction();
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
	public static class CssFunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public TerminalNode CSS_URL_FUNC() { return getToken(ArabicHtmlParser.CSS_URL_FUNC, 0); }
		public TerminalNode CSS_RGB_FUNC() { return getToken(ArabicHtmlParser.CSS_RGB_FUNC, 0); }
		public TerminalNode CSS_RGBA_FUNC() { return getToken(ArabicHtmlParser.CSS_RGBA_FUNC, 0); }
		public TerminalNode CSS_CALC_FUNC() { return getToken(ArabicHtmlParser.CSS_CALC_FUNC, 0); }
		public TerminalNode CSS_VAR_FUNC() { return getToken(ArabicHtmlParser.CSS_VAR_FUNC, 0); }
		public TerminalNode CSS_ROTATE_FUNC() { return getToken(ArabicHtmlParser.CSS_ROTATE_FUNC, 0); }
		public TerminalNode CSS_SCALE_FUNC() { return getToken(ArabicHtmlParser.CSS_SCALE_FUNC, 0); }
		public TerminalNode CSS_BLUR_FUNC() { return getToken(ArabicHtmlParser.CSS_BLUR_FUNC, 0); }
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
		public CssFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunction; }
	}

	public final CssFunctionContext cssFunction() throws RecognitionException {
		CssFunctionContext _localctx = new CssFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cssFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(171);
			match(LPAREN);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 180143997979721791L) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & 16779393L) != 0)) {
				{
				setState(172);
				expression();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(173);
					match(COMMA);
					setState(174);
					expression();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(182);
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
	public static class JsStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public JsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsStatement; }
	}

	public final JsStatementContext jsStatement() throws RecognitionException {
		JsStatementContext _localctx = new JsStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jsStatement);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				functionDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				tryCatchStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(192);
				expressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(193);
				builtInCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(194);
				block();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ArabicHtmlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArabicHtmlParser.RBRACE, 0); }
		public List<JsStatementContext> jsStatement() {
			return getRuleContexts(JsStatementContext.class);
		}
		public JsStatementContext jsStatement(int i) {
			return getRuleContext(JsStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LBRACE);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 2017612645930504199L) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & 2306142213815402519L) != 0)) {
				{
				{
				setState(198);
				jsStatement();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(ArabicHtmlParser.SEMI, 0); }
		public TerminalNode JS_VAR() { return getToken(ArabicHtmlParser.JS_VAR, 0); }
		public TerminalNode JS_LET() { return getToken(ArabicHtmlParser.JS_LET, 0); }
		public TerminalNode JS_CONST() { return getToken(ArabicHtmlParser.JS_CONST, 0); }
		public TerminalNode JS_ASSIGN() { return getToken(ArabicHtmlParser.JS_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(207);
			match(IDENTIFIER);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_ASSIGN) {
				{
				setState(208);
				match(JS_ASSIGN);
				setState(209);
				expression();
				}
			}

			setState(212);
			match(SEMI);
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArabicHtmlParser.SEMI, 0); }
		public TerminalNode JS_ASSIGN() { return getToken(ArabicHtmlParser.JS_ASSIGN, 0); }
		public TerminalNode JS_ADD_ASSIGN() { return getToken(ArabicHtmlParser.JS_ADD_ASSIGN, 0); }
		public TerminalNode JS_SUB_ASSIGN() { return getToken(ArabicHtmlParser.JS_SUB_ASSIGN, 0); }
		public TerminalNode JS_MUL_ASSIGN() { return getToken(ArabicHtmlParser.JS_MUL_ASSIGN, 0); }
		public TerminalNode JS_DIV_ASSIGN() { return getToken(ArabicHtmlParser.JS_DIV_ASSIGN, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(IDENTIFIER);
			setState(215);
			_la = _input.LA(1);
			if ( !(((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & 4194319L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(216);
			expression();
			setState(217);
			match(SEMI);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode JS_IF() { return getToken(ArabicHtmlParser.JS_IF, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public List<JsStatementContext> jsStatement() {
			return getRuleContexts(JsStatementContext.class);
		}
		public JsStatementContext jsStatement(int i) {
			return getRuleContext(JsStatementContext.class,i);
		}
		public TerminalNode JS_ELSE() { return getToken(ArabicHtmlParser.JS_ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(JS_IF);
			setState(220);
			match(LPAREN);
			setState(221);
			expression();
			setState(222);
			match(RPAREN);
			setState(223);
			jsStatement();
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(224);
				match(JS_ELSE);
				setState(225);
				jsStatement();
				}
				break;
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode JS_FOR() { return getToken(ArabicHtmlParser.JS_FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public JsStatementContext jsStatement() {
			return getRuleContext(JsStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ArabicHtmlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ArabicHtmlParser.SEMI, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode JS_LET() { return getToken(ArabicHtmlParser.JS_LET, 0); }
		public TerminalNode JS_VAR() { return getToken(ArabicHtmlParser.JS_VAR, 0); }
		public TerminalNode JS_OF() { return getToken(ArabicHtmlParser.JS_OF, 0); }
		public TerminalNode JS_IN() { return getToken(ArabicHtmlParser.JS_IN, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLoop);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(JS_FOR);
				setState(229);
				match(LPAREN);
				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JS_VAR:
				case JS_LET:
				case JS_CONST:
					{
					setState(230);
					variableDeclaration();
					}
					break;
				case JS_TRUE:
				case JS_FALSE:
				case JS_NULL:
				case JS_UNDEFINED:
				case JS_THIS:
				case JS_NAN:
				case JS_DOCUMENT:
				case JS_WINDOW:
				case IDENTIFIER:
				case NUMBER:
				case LBRACE:
				case LPAREN:
				case LBRACK:
				case STRING:
					{
					setState(231);
					expression();
					setState(232);
					match(SEMI);
					setState(233);
					expression();
					setState(234);
					match(SEMI);
					setState(235);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(239);
				match(RPAREN);
				setState(240);
				jsStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(JS_FOR);
				setState(243);
				match(LPAREN);
				setState(244);
				_la = _input.LA(1);
				if ( !(_la==JS_VAR || _la==JS_LET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				match(IDENTIFIER);
				setState(246);
				_la = _input.LA(1);
				if ( !(_la==JS_OF || _la==JS_IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(247);
				expression();
				setState(248);
				match(RPAREN);
				setState(249);
				jsStatement();
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
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode JS_WHILE() { return getToken(ArabicHtmlParser.JS_WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public JsStatementContext jsStatement() {
			return getRuleContext(JsStatementContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(JS_WHILE);
			setState(254);
			match(LPAREN);
			setState(255);
			expression();
			setState(256);
			match(RPAREN);
			setState(257);
			jsStatement();
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode JS_FUNCTION() { return getToken(ArabicHtmlParser.JS_FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(JS_FUNCTION);
			setState(260);
			match(IDENTIFIER);
			setState(261);
			match(LPAREN);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(262);
				parameterList();
				}
			}

			setState(265);
			match(RPAREN);
			setState(266);
			block();
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArabicHtmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArabicHtmlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArabicHtmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArabicHtmlParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IDENTIFIER);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(269);
				match(COMMA);
				setState(270);
				match(IDENTIFIER);
				}
				}
				setState(275);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode JS_RETURN() { return getToken(ArabicHtmlParser.JS_RETURN, 0); }
		public TerminalNode SEMI() { return getToken(ArabicHtmlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(JS_RETURN);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 180143997979721791L) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & 16779393L) != 0)) {
				{
				setState(277);
				expression();
				}
			}

			setState(280);
			match(SEMI);
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
	public static class TryCatchStatementContext extends ParserRuleContext {
		public TerminalNode JS_TRY() { return getToken(ArabicHtmlParser.JS_TRY, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode JS_CATCH() { return getToken(ArabicHtmlParser.JS_CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public TerminalNode JS_FINALLY() { return getToken(ArabicHtmlParser.JS_FINALLY, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(JS_TRY);
			setState(283);
			block();
			setState(284);
			match(JS_CATCH);
			setState(285);
			match(LPAREN);
			setState(286);
			match(IDENTIFIER);
			setState(287);
			match(RPAREN);
			setState(288);
			block();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_FINALLY) {
				{
				setState(289);
				match(JS_FINALLY);
				setState(290);
				block();
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArabicHtmlParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			expression();
			setState(294);
			match(SEMI);
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
	public static class BuiltInCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ArabicHtmlParser.SEMI, 0); }
		public TerminalNode JS_CONSOLE() { return getToken(ArabicHtmlParser.JS_CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(ArabicHtmlParser.DOT, 0); }
		public TerminalNode JS_LOG() { return getToken(ArabicHtmlParser.JS_LOG, 0); }
		public TerminalNode JS_ALERT() { return getToken(ArabicHtmlParser.JS_ALERT, 0); }
		public TerminalNode JS_PROMPT() { return getToken(ArabicHtmlParser.JS_PROMPT, 0); }
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
		public BuiltInCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInCall; }
	}

	public final BuiltInCallContext builtInCall() throws RecognitionException {
		BuiltInCallContext _localctx = new BuiltInCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_builtInCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_CONSOLE:
				{
				setState(296);
				match(JS_CONSOLE);
				setState(297);
				match(DOT);
				setState(298);
				match(JS_LOG);
				}
				break;
			case JS_ALERT:
				{
				setState(299);
				match(JS_ALERT);
				}
				break;
			case JS_PROMPT:
				{
				setState(300);
				match(JS_PROMPT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(303);
			match(LPAREN);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 180143997979721791L) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & 16779393L) != 0)) {
				{
				setState(304);
				expression();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(305);
					match(COMMA);
					setState(306);
					expression();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(314);
			match(RPAREN);
			setState(315);
			match(SEMI);
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
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			assignmentExpression();
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
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode JS_ASSIGN() { return getToken(ArabicHtmlParser.JS_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			logicalOrExpression();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_ASSIGN) {
				{
				setState(320);
				match(JS_ASSIGN);
				setState(321);
				expression();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> JS_OR() { return getTokens(ArabicHtmlParser.JS_OR); }
		public TerminalNode JS_OR(int i) {
			return getToken(ArabicHtmlParser.JS_OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			logicalAndExpression();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_OR) {
				{
				{
				setState(325);
				match(JS_OR);
				setState(326);
				logicalAndExpression();
				}
				}
				setState(331);
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
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> JS_AND() { return getTokens(ArabicHtmlParser.JS_AND); }
		public TerminalNode JS_AND(int i) {
			return getToken(ArabicHtmlParser.JS_AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			equalityExpression();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_AND) {
				{
				{
				setState(333);
				match(JS_AND);
				setState(334);
				equalityExpression();
				}
				}
				setState(339);
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
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> JS_STREQ() { return getTokens(ArabicHtmlParser.JS_STREQ); }
		public TerminalNode JS_STREQ(int i) {
			return getToken(ArabicHtmlParser.JS_STREQ, i);
		}
		public List<TerminalNode> JS_STRNEQ() { return getTokens(ArabicHtmlParser.JS_STRNEQ); }
		public TerminalNode JS_STRNEQ(int i) {
			return getToken(ArabicHtmlParser.JS_STRNEQ, i);
		}
		public List<TerminalNode> JS_EQ() { return getTokens(ArabicHtmlParser.JS_EQ); }
		public TerminalNode JS_EQ(int i) {
			return getToken(ArabicHtmlParser.JS_EQ, i);
		}
		public List<TerminalNode> JS_NEQ() { return getTokens(ArabicHtmlParser.JS_NEQ); }
		public TerminalNode JS_NEQ(int i) {
			return getToken(ArabicHtmlParser.JS_NEQ, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			relationalExpression();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 215)) & ~0x3f) == 0 && ((1L << (_la - 215)) & 15L) != 0)) {
				{
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(((((_la - 215)) & ~0x3f) == 0 && ((1L << (_la - 215)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				relationalExpression();
				}
				}
				setState(347);
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(ArabicHtmlParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ArabicHtmlParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ArabicHtmlParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ArabicHtmlParser.GT, i);
		}
		public List<TerminalNode> JS_GTE() { return getTokens(ArabicHtmlParser.JS_GTE); }
		public TerminalNode JS_GTE(int i) {
			return getToken(ArabicHtmlParser.JS_GTE, i);
		}
		public List<TerminalNode> JS_LTE() { return getTokens(ArabicHtmlParser.JS_LTE); }
		public TerminalNode JS_LTE(int i) {
			return getToken(ArabicHtmlParser.JS_LTE, i);
		}
		public List<TerminalNode> JS_INSTANCEOF() { return getTokens(ArabicHtmlParser.JS_INSTANCEOF); }
		public TerminalNode JS_INSTANCEOF(int i) {
			return getToken(ArabicHtmlParser.JS_INSTANCEOF, i);
		}
		public List<TerminalNode> JS_IN() { return getTokens(ArabicHtmlParser.JS_IN); }
		public TerminalNode JS_IN(int i) {
			return getToken(ArabicHtmlParser.JS_IN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			additiveExpression();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_IN || _la==JS_INSTANCEOF || ((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & 6442450947L) != 0)) {
				{
				{
				setState(349);
				_la = _input.LA(1);
				if ( !(_la==JS_IN || _la==JS_INSTANCEOF || ((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & 6442450947L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(350);
				additiveExpression();
				}
				}
				setState(355);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ArabicHtmlParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ArabicHtmlParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ArabicHtmlParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ArabicHtmlParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			multiplicativeExpression();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(357);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(358);
				multiplicativeExpression();
				}
				}
				setState(363);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<MemberExpressionContext> memberExpression() {
			return getRuleContexts(MemberExpressionContext.class);
		}
		public MemberExpressionContext memberExpression(int i) {
			return getRuleContext(MemberExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(ArabicHtmlParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(ArabicHtmlParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(ArabicHtmlParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(ArabicHtmlParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(ArabicHtmlParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(ArabicHtmlParser.PERCENT, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			memberExpression();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & 7L) != 0)) {
				{
				{
				setState(365);
				_la = _input.LA(1);
				if ( !(((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(366);
				memberExpression();
				}
				}
				setState(371);
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
	public static class MemberExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ArabicHtmlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ArabicHtmlParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ArabicHtmlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ArabicHtmlParser.RPAREN, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ArabicHtmlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ArabicHtmlParser.DOT, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ArabicHtmlParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ArabicHtmlParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ArabicHtmlParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ArabicHtmlParser.RBRACK, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArabicHtmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArabicHtmlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> JS_LOG() { return getTokens(ArabicHtmlParser.JS_LOG); }
		public TerminalNode JS_LOG(int i) {
			return getToken(ArabicHtmlParser.JS_LOG, i);
		}
		public List<TerminalNode> JS_ADD_LISTENER() { return getTokens(ArabicHtmlParser.JS_ADD_LISTENER); }
		public TerminalNode JS_ADD_LISTENER(int i) {
			return getToken(ArabicHtmlParser.JS_ADD_LISTENER, i);
		}
		public List<TerminalNode> JS_INNER_TEXT() { return getTokens(ArabicHtmlParser.JS_INNER_TEXT); }
		public TerminalNode JS_INNER_TEXT(int i) {
			return getToken(ArabicHtmlParser.JS_INNER_TEXT, i);
		}
		public List<TerminalNode> JS_STYLE() { return getTokens(ArabicHtmlParser.JS_STYLE); }
		public TerminalNode JS_STYLE(int i) {
			return getToken(ArabicHtmlParser.JS_STYLE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArabicHtmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArabicHtmlParser.COMMA, i);
		}
		public MemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberExpression; }
	}

	public final MemberExpressionContext memberExpression() throws RecognitionException {
		MemberExpressionContext _localctx = new MemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_memberExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			primaryExpression();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 237)) & ~0x3f) == 0 && ((1L << (_la - 237)) & 69L) != 0)) {
				{
				setState(391);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(373);
					match(LPAREN);
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 180143997979721791L) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & 16779393L) != 0)) {
						{
						setState(374);
						expression();
						setState(379);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(375);
							match(COMMA);
							setState(376);
							expression();
							}
							}
							setState(381);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(384);
					match(RPAREN);
					}
					break;
				case DOT:
					{
					setState(385);
					match(DOT);
					setState(386);
					_la = _input.LA(1);
					if ( !(((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & 2317L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LBRACK:
					{
					setState(387);
					match(LBRACK);
					setState(388);
					expression();
					setState(389);
					match(RBRACK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(395);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(ArabicHtmlParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public TerminalNode JS_TRUE() { return getToken(ArabicHtmlParser.JS_TRUE, 0); }
		public TerminalNode JS_FALSE() { return getToken(ArabicHtmlParser.JS_FALSE, 0); }
		public TerminalNode JS_NULL() { return getToken(ArabicHtmlParser.JS_NULL, 0); }
		public TerminalNode JS_UNDEFINED() { return getToken(ArabicHtmlParser.JS_UNDEFINED, 0); }
		public TerminalNode JS_THIS() { return getToken(ArabicHtmlParser.JS_THIS, 0); }
		public TerminalNode JS_NAN() { return getToken(ArabicHtmlParser.JS_NAN, 0); }
		public TerminalNode JS_DOCUMENT() { return getToken(ArabicHtmlParser.JS_DOCUMENT, 0); }
		public TerminalNode JS_WINDOW() { return getToken(ArabicHtmlParser.JS_WINDOW, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primaryExpression);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(STRING);
				}
				break;
			case JS_TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(JS_TRUE);
				}
				break;
			case JS_FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				match(JS_FALSE);
				}
				break;
			case JS_NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(401);
				match(JS_NULL);
				}
				break;
			case JS_UNDEFINED:
				enterOuterAlt(_localctx, 7);
				{
				setState(402);
				match(JS_UNDEFINED);
				}
				break;
			case JS_THIS:
				enterOuterAlt(_localctx, 8);
				{
				setState(403);
				match(JS_THIS);
				}
				break;
			case JS_NAN:
				enterOuterAlt(_localctx, 9);
				{
				setState(404);
				match(JS_NAN);
				}
				break;
			case JS_DOCUMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(405);
				match(JS_DOCUMENT);
				}
				break;
			case JS_WINDOW:
				enterOuterAlt(_localctx, 11);
				{
				setState(406);
				match(JS_WINDOW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 12);
				{
				setState(407);
				match(LPAREN);
				setState(408);
				expression();
				setState(409);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 13);
				{
				setState(411);
				arrayLiteral();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 14);
				{
				setState(412);
				objectLiteral();
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
		enterRule(_localctx, 70, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(LBRACK);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 180143997979721791L) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & 16779393L) != 0)) {
				{
				setState(416);
				expression();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(417);
					match(COMMA);
					setState(418);
					expression();
					}
					}
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(426);
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
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ArabicHtmlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArabicHtmlParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArabicHtmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArabicHtmlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ArabicHtmlParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ArabicHtmlParser.COLON, i);
		}
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
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(LBRACE);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(429);
				match(IDENTIFIER);
				setState(430);
				match(COLON);
				setState(431);
				expression();
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(432);
					match(COMMA);
					setState(433);
					match(IDENTIFIER);
					setState(434);
					match(COLON);
					setState(435);
					expression();
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(443);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0100\u01be\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000N\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Z\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002`\b"+
		"\u0002\n\u0002\f\u0002c\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003i\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006y\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007~\b\u0007\n\u0007"+
		"\f\u0007\u0081\t\u0007\u0001\u0007\u0003\u0007\u0084\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a9\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b0"+
		"\b\u000b\n\u000b\f\u000b\u00b3\t\u000b\u0003\u000b\u00b5\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c4\b\f\u0001\r\u0001\r\u0005"+
		"\r\u00c8\b\r\n\r\f\r\u00cb\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00d3\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00e3\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00ee\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00fc\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0108\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0110\b\u0014\n\u0014"+
		"\f\u0014\u0113\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0117\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0124\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u012e\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0134\b\u0018\n\u0018"+
		"\f\u0018\u0137\t\u0018\u0003\u0018\u0139\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0143\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u0148\b\u001b\n\u001b\f\u001b\u014b\t\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u0150\b\u001c\n\u001c\f\u001c\u0153\t\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u0158\b\u001d\n\u001d\f\u001d\u015b"+
		"\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0160\b\u001e"+
		"\n\u001e\f\u001e\u0163\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0168\b\u001f\n\u001f\f\u001f\u016b\t\u001f\u0001 \u0001 \u0001"+
		" \u0005 \u0170\b \n \f \u0173\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u017a\b!\n!\f!\u017d\t!\u0003!\u017f\b!\u0001!\u0001!\u0001!\u0001!"+
		"\u0001!\u0001!\u0001!\u0005!\u0188\b!\n!\f!\u018b\t!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u019e\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0005#\u01a4\b#\n#\f#\u01a7\t#\u0003#\u01a9\b#\u0001#"+
		"\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u01b5\b$\n$\f$\u01b8\t$\u0003$\u01ba\b$\u0001$\u0001$\u0001$\u0000\u0000"+
		"%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\f\b\u0000\u0004\u0004\f\rXX^"+
		"^tv\u0080\u0081\u0085\u0086\u008a\u008f\u0002\u0000\u0004<BG\u0001\u0000"+
		"ls\u0001\u0000tv\u0002\u0000\u00cd\u00d0\u00e3\u00e3\u0001\u0000tu\u0001"+
		"\u0000\u008a\u008b\u0001\u0000\u00d7\u00da\u0004\u0000\u008b\u008b\u00ac"+
		"\u00ac\u00db\u00dc\u00fa\u00fb\u0001\u0000\u00f5\u00f6\u0001\u0000\u00f7"+
		"\u00f9\u0004\u0000\u00ba\u00ba\u00bc\u00bd\u00c2\u00c2\u00c5\u00c5\u01fa"+
		"\u0000O\u0001\u0000\u0000\u0000\u0002Y\u0001\u0000\u0000\u0000\u0004a"+
		"\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000\u0000\bj\u0001\u0000"+
		"\u0000\u0000\nl\u0001\u0000\u0000\u0000\fx\u0001\u0000\u0000\u0000\u000e"+
		"z\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u0089"+
		"\u0001\u0000\u0000\u0000\u0014\u00a8\u0001\u0000\u0000\u0000\u0016\u00aa"+
		"\u0001\u0000\u0000\u0000\u0018\u00c3\u0001\u0000\u0000\u0000\u001a\u00c5"+
		"\u0001\u0000\u0000\u0000\u001c\u00ce\u0001\u0000\u0000\u0000\u001e\u00d6"+
		"\u0001\u0000\u0000\u0000 \u00db\u0001\u0000\u0000\u0000\"\u00fb\u0001"+
		"\u0000\u0000\u0000$\u00fd\u0001\u0000\u0000\u0000&\u0103\u0001\u0000\u0000"+
		"\u0000(\u010c\u0001\u0000\u0000\u0000*\u0114\u0001\u0000\u0000\u0000,"+
		"\u011a\u0001\u0000\u0000\u0000.\u0125\u0001\u0000\u0000\u00000\u012d\u0001"+
		"\u0000\u0000\u00002\u013d\u0001\u0000\u0000\u00004\u013f\u0001\u0000\u0000"+
		"\u00006\u0144\u0001\u0000\u0000\u00008\u014c\u0001\u0000\u0000\u0000:"+
		"\u0154\u0001\u0000\u0000\u0000<\u015c\u0001\u0000\u0000\u0000>\u0164\u0001"+
		"\u0000\u0000\u0000@\u016c\u0001\u0000\u0000\u0000B\u0174\u0001\u0000\u0000"+
		"\u0000D\u019d\u0001\u0000\u0000\u0000F\u019f\u0001\u0000\u0000\u0000H"+
		"\u01ac\u0001\u0000\u0000\u0000JN\u0003\u0002\u0001\u0000KN\u0003\n\u0005"+
		"\u0000LN\u0003\u0018\f\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RS\u0005\u0000\u0000\u0001S\u0001\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0002\u0000\u0000UV\u0003\u0004\u0002\u0000VW\u0005\u0001"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XZ\u0005\u0003\u0000\u0000YT\u0001"+
		"\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u0003\u0001\u0000\u0000"+
		"\u0000[`\u0003\u0002\u0001\u0000\\`\u0003\u0018\f\u0000]`\u0003\n\u0005"+
		"\u0000^`\u0003\u0006\u0003\u0000_[\u0001\u0000\u0000\u0000_\\\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"b\u0005\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000di\u0005\u0100"+
		"\u0000\u0000ei\u0005\u00c5\u0000\u0000fi\u0005\u00c7\u0000\u0000gi\u0003"+
		"\b\u0004\u0000hd\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000i\u0007\u0001\u0000\u0000"+
		"\u0000jk\u0007\u0000\u0000\u0000k\t\u0001\u0000\u0000\u0000lm\u0003\f"+
		"\u0006\u0000mn\u0005\u00e8\u0000\u0000no\u0003\u000e\u0007\u0000op\u0005"+
		"\u00e9\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qy\u0005\u00c5\u0000"+
		"\u0000rs\u0005\u00ee\u0000\u0000sy\u0005\u00c5\u0000\u0000tu\u0005\u00ed"+
		"\u0000\u0000uy\u0005\u00c5\u0000\u0000vw\u0005A\u0000\u0000wy\u0005\u00c5"+
		"\u0000\u0000xq\u0001\u0000\u0000\u0000xr\u0001\u0000\u0000\u0000xt\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y\r\u0001\u0000\u0000\u0000"+
		"z\u007f\u0003\u0010\b\u0000{|\u0005\u00eb\u0000\u0000|~\u0003\u0010\b"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0005\u00eb\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u000f\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0003\u0012\t\u0000\u0086\u0087\u0005\u00ea\u0000\u0000\u0087\u0088\u0003"+
		"\u0014\n\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0001"+
		"\u0000\u0000\u008a\u0013\u0001\u0000\u0000\u0000\u008b\u00a9\u0005\u00c5"+
		"\u0000\u0000\u008c\u00a9\u0005\u00c7\u0000\u0000\u008d\u00a9\u0005\u00c6"+
		"\u0000\u0000\u008e\u00a9\u0005\u00c8\u0000\u0000\u008f\u00a9\u0005\u0100"+
		"\u0000\u0000\u0090\u00a9\u0005S\u0000\u0000\u0091\u00a9\u0005T\u0000\u0000"+
		"\u0092\u00a9\u0005U\u0000\u0000\u0093\u00a9\u0005V\u0000\u0000\u0094\u00a9"+
		"\u0005W\u0000\u0000\u0095\u00a9\u0005X\u0000\u0000\u0096\u00a9\u0005Y"+
		"\u0000\u0000\u0097\u00a9\u0005Z\u0000\u0000\u0098\u00a9\u0005[\u0000\u0000"+
		"\u0099\u00a9\u0005\\\u0000\u0000\u009a\u00a9\u0005]\u0000\u0000\u009b"+
		"\u00a9\u0005^\u0000\u0000\u009c\u00a9\u0005_\u0000\u0000\u009d\u00a9\u0005"+
		"`\u0000\u0000\u009e\u00a9\u0005a\u0000\u0000\u009f\u00a9\u0005b\u0000"+
		"\u0000\u00a0\u00a9\u0005c\u0000\u0000\u00a1\u00a9\u0005d\u0000\u0000\u00a2"+
		"\u00a9\u0005e\u0000\u0000\u00a3\u00a9\u0005f\u0000\u0000\u00a4\u00a9\u0005"+
		"g\u0000\u0000\u00a5\u00a9\u0005i\u0000\u0000\u00a6\u00a9\u0005j\u0000"+
		"\u0000\u00a7\u00a9\u0003\u0016\u000b\u0000\u00a8\u008b\u0001\u0000\u0000"+
		"\u0000\u00a8\u008c\u0001\u0000\u0000\u0000\u00a8\u008d\u0001\u0000\u0000"+
		"\u0000\u00a8\u008e\u0001\u0000\u0000\u0000\u00a8\u008f\u0001\u0000\u0000"+
		"\u0000\u00a8\u0090\u0001\u0000\u0000\u0000\u00a8\u0091\u0001\u0000\u0000"+
		"\u0000\u00a8\u0092\u0001\u0000\u0000\u0000\u00a8\u0093\u0001\u0000\u0000"+
		"\u0000\u00a8\u0094\u0001\u0000\u0000\u0000\u00a8\u0095\u0001\u0000\u0000"+
		"\u0000\u00a8\u0096\u0001\u0000\u0000\u0000\u00a8\u0097\u0001\u0000\u0000"+
		"\u0000\u00a8\u0098\u0001\u0000\u0000\u0000\u00a8\u0099\u0001\u0000\u0000"+
		"\u0000\u00a8\u009a\u0001\u0000\u0000\u0000\u00a8\u009b\u0001\u0000\u0000"+
		"\u0000\u00a8\u009c\u0001\u0000\u0000\u0000\u00a8\u009d\u0001\u0000\u0000"+
		"\u0000\u00a8\u009e\u0001\u0000\u0000\u0000\u00a8\u009f\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u0015\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0002\u0000"+
		"\u0000\u00ab\u00b4\u0005\u00ef\u0000\u0000\u00ac\u00b1\u00032\u0019\u0000"+
		"\u00ad\u00ae\u0005\u00ec\u0000\u0000\u00ae\u00b0\u00032\u0019\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u00f0\u0000\u0000\u00b7"+
		"\u0017\u0001\u0000\u0000\u0000\u00b8\u00c4\u0003\u001c\u000e\u0000\u00b9"+
		"\u00c4\u0003\u001e\u000f\u0000\u00ba\u00c4\u0003 \u0010\u0000\u00bb\u00c4"+
		"\u0003\"\u0011\u0000\u00bc\u00c4\u0003$\u0012\u0000\u00bd\u00c4\u0003"+
		"&\u0013\u0000\u00be\u00c4\u0003*\u0015\u0000\u00bf\u00c4\u0003,\u0016"+
		"\u0000\u00c0\u00c4\u0003.\u0017\u0000\u00c1\u00c4\u00030\u0018\u0000\u00c2"+
		"\u00c4\u0003\u001a\r\u0000\u00c3\u00b8\u0001\u0000\u0000\u0000\u00c3\u00b9"+
		"\u0001\u0000\u0000\u0000\u00c3\u00ba\u0001\u0000\u0000\u0000\u00c3\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c3\u00bc\u0001\u0000\u0000\u0000\u00c3\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u0019"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c9\u0005\u00e8\u0000\u0000\u00c6\u00c8"+
		"\u0003\u0018\f\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005\u00e9\u0000\u0000\u00cd\u001b\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0007\u0003\u0000\u0000\u00cf\u00d2\u0005"+
		"\u00c5\u0000\u0000\u00d0\u00d1\u0005\u00e3\u0000\u0000\u00d1\u00d3\u0003"+
		"2\u0019\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u00eb"+
		"\u0000\u0000\u00d5\u001d\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u00c5"+
		"\u0000\u0000\u00d7\u00d8\u0007\u0004\u0000\u0000\u00d8\u00d9\u00032\u0019"+
		"\u0000\u00d9\u00da\u0005\u00eb\u0000\u0000\u00da\u001f\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0005\u0080\u0000\u0000\u00dc\u00dd\u0005\u00ef\u0000"+
		"\u0000\u00dd\u00de\u00032\u0019\u0000\u00de\u00df\u0005\u00f0\u0000\u0000"+
		"\u00df\u00e2\u0003\u0018\f\u0000\u00e0\u00e1\u0005\u0081\u0000\u0000\u00e1"+
		"\u00e3\u0003\u0018\f\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3!\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\u0085\u0000\u0000\u00e5\u00ed\u0005\u00ef\u0000\u0000\u00e6\u00ee\u0003"+
		"\u001c\u000e\u0000\u00e7\u00e8\u00032\u0019\u0000\u00e8\u00e9\u0005\u00eb"+
		"\u0000\u0000\u00e9\u00ea\u00032\u0019\u0000\u00ea\u00eb\u0005\u00eb\u0000"+
		"\u0000\u00eb\u00ec\u00032\u0019\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ed\u00e6\u0001\u0000\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u00f0\u0000\u0000"+
		"\u00f0\u00f1\u0003\u0018\f\u0000\u00f1\u00fc\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0005\u0085\u0000\u0000\u00f3\u00f4\u0005\u00ef\u0000\u0000\u00f4"+
		"\u00f5\u0007\u0005\u0000\u0000\u00f5\u00f6\u0005\u00c5\u0000\u0000\u00f6"+
		"\u00f7\u0007\u0006\u0000\u0000\u00f7\u00f8\u00032\u0019\u0000\u00f8\u00f9"+
		"\u0005\u00f0\u0000\u0000\u00f9\u00fa\u0003\u0018\f\u0000\u00fa\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fb\u00e4\u0001\u0000\u0000\u0000\u00fb\u00f2\u0001"+
		"\u0000\u0000\u0000\u00fc#\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0086"+
		"\u0000\u0000\u00fe\u00ff\u0005\u00ef\u0000\u0000\u00ff\u0100\u00032\u0019"+
		"\u0000\u0100\u0101\u0005\u00f0\u0000\u0000\u0101\u0102\u0003\u0018\f\u0000"+
		"\u0102%\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u008c\u0000\u0000\u0104"+
		"\u0105\u0005\u00c5\u0000\u0000\u0105\u0107\u0005\u00ef\u0000\u0000\u0106"+
		"\u0108\u0003(\u0014\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0005\u00f0\u0000\u0000\u010a\u010b\u0003\u001a\r\u0000\u010b\'\u0001"+
		"\u0000\u0000\u0000\u010c\u0111\u0005\u00c5\u0000\u0000\u010d\u010e\u0005"+
		"\u00ec\u0000\u0000\u010e\u0110\u0005\u00c5\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112)\u0001\u0000"+
		"\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0116\u0005\u008d"+
		"\u0000\u0000\u0115\u0117\u00032\u0019\u0000\u0116\u0115\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0005\u00eb\u0000\u0000\u0119+\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005\u0095\u0000\u0000\u011b\u011c\u0003\u001a\r\u0000\u011c"+
		"\u011d\u0005\u0096\u0000\u0000\u011d\u011e\u0005\u00ef\u0000\u0000\u011e"+
		"\u011f\u0005\u00c5\u0000\u0000\u011f\u0120\u0005\u00f0\u0000\u0000\u0120"+
		"\u0123\u0003\u001a\r\u0000\u0121\u0122\u0005\u0097\u0000\u0000\u0122\u0124"+
		"\u0003\u001a\r\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124-\u0001\u0000\u0000\u0000\u0125\u0126\u00032\u0019"+
		"\u0000\u0126\u0127\u0005\u00eb\u0000\u0000\u0127/\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0005\u00b0\u0000\u0000\u0129\u012a\u0005\u00ed\u0000\u0000"+
		"\u012a\u012e\u0005\u00c2\u0000\u0000\u012b\u012e\u0005\u00c3\u0000\u0000"+
		"\u012c\u012e\u0005\u00c4\u0000\u0000\u012d\u0128\u0001\u0000\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0138\u0005\u00ef\u0000\u0000"+
		"\u0130\u0135\u00032\u0019\u0000\u0131\u0132\u0005\u00ec\u0000\u0000\u0132"+
		"\u0134\u00032\u0019\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0137"+
		"\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0138\u0130\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0005\u00f0\u0000\u0000\u013b\u013c\u0005\u00eb\u0000\u0000\u013c1\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u00034\u001a\u0000\u013e3\u0001\u0000\u0000"+
		"\u0000\u013f\u0142\u00036\u001b\u0000\u0140\u0141\u0005\u00e3\u0000\u0000"+
		"\u0141\u0143\u00032\u0019\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u01435\u0001\u0000\u0000\u0000\u0144\u0149"+
		"\u00038\u001c\u0000\u0145\u0146\u0005\u00de\u0000\u0000\u0146\u0148\u0003"+
		"8\u001c\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a7\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u0151\u0003:\u001d\u0000\u014d\u014e\u0005\u00dd\u0000\u0000"+
		"\u014e\u0150\u0003:\u001d\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150"+
		"\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0001\u0000\u0000\u0000\u01529\u0001\u0000\u0000\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0154\u0159\u0003<\u001e\u0000\u0155\u0156\u0007"+
		"\u0007\u0000\u0000\u0156\u0158\u0003<\u001e\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a;\u0001\u0000\u0000"+
		"\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u0161\u0003>\u001f\u0000"+
		"\u015d\u015e\u0007\b\u0000\u0000\u015e\u0160\u0003>\u001f\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"=\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0169"+
		"\u0003@ \u0000\u0165\u0166\u0007\t\u0000\u0000\u0166\u0168\u0003@ \u0000"+
		"\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000"+
		"\u016a?\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c"+
		"\u0171\u0003B!\u0000\u016d\u016e\u0007\n\u0000\u0000\u016e\u0170\u0003"+
		"B!\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000"+
		"\u0000\u0172A\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0174\u0189\u0003D\"\u0000\u0175\u017e\u0005\u00ef\u0000\u0000\u0176"+
		"\u017b\u00032\u0019\u0000\u0177\u0178\u0005\u00ec\u0000\u0000\u0178\u017a"+
		"\u00032\u0019\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017d\u0001"+
		"\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017e\u0176\u0001\u0000\u0000\u0000\u017e\u017f\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0188\u0005"+
		"\u00f0\u0000\u0000\u0181\u0182\u0005\u00ed\u0000\u0000\u0182\u0188\u0007"+
		"\u000b\u0000\u0000\u0183\u0184\u0005\u00f3\u0000\u0000\u0184\u0185\u0003"+
		"2\u0019\u0000\u0185\u0186\u0005\u00f4\u0000\u0000\u0186\u0188\u0001\u0000"+
		"\u0000\u0000\u0187\u0175\u0001\u0000\u0000\u0000\u0187\u0181\u0001\u0000"+
		"\u0000\u0000\u0187\u0183\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000"+
		"\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000"+
		"\u0000\u0000\u018aC\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000"+
		"\u0000\u018c\u019e\u0005\u00c5\u0000\u0000\u018d\u019e\u0005\u00c7\u0000"+
		"\u0000\u018e\u019e\u0005\u0100\u0000\u0000\u018f\u019e\u0005\u008e\u0000"+
		"\u0000\u0190\u019e\u0005\u008f\u0000\u0000\u0191\u019e\u0005\u0090\u0000"+
		"\u0000\u0192\u019e\u0005\u0091\u0000\u0000\u0193\u019e\u0005\u0092\u0000"+
		"\u0000\u0194\u019e\u0005\u0093\u0000\u0000\u0195\u019e\u0005\u00ae\u0000"+
		"\u0000\u0196\u019e\u0005\u00af\u0000\u0000\u0197\u0198\u0005\u00ef\u0000"+
		"\u0000\u0198\u0199\u00032\u0019\u0000\u0199\u019a\u0005\u00f0\u0000\u0000"+
		"\u019a\u019e\u0001\u0000\u0000\u0000\u019b\u019e\u0003F#\u0000\u019c\u019e"+
		"\u0003H$\u0000\u019d\u018c\u0001\u0000\u0000\u0000\u019d\u018d\u0001\u0000"+
		"\u0000\u0000\u019d\u018e\u0001\u0000\u0000\u0000\u019d\u018f\u0001\u0000"+
		"\u0000\u0000\u019d\u0190\u0001\u0000\u0000\u0000\u019d\u0191\u0001\u0000"+
		"\u0000\u0000\u019d\u0192\u0001\u0000\u0000\u0000\u019d\u0193\u0001\u0000"+
		"\u0000\u0000\u019d\u0194\u0001\u0000\u0000\u0000\u019d\u0195\u0001\u0000"+
		"\u0000\u0000\u019d\u0196\u0001\u0000\u0000\u0000\u019d\u0197\u0001\u0000"+
		"\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019c\u0001\u0000"+
		"\u0000\u0000\u019eE\u0001\u0000\u0000\u0000\u019f\u01a8\u0005\u00f3\u0000"+
		"\u0000\u01a0\u01a5\u00032\u0019\u0000\u01a1\u01a2\u0005\u00ec\u0000\u0000"+
		"\u01a2\u01a4\u00032\u0019\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a0\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0005\u00f4\u0000\u0000\u01abG\u0001\u0000\u0000\u0000\u01ac\u01b9"+
		"\u0005\u00e8\u0000\u0000\u01ad\u01ae\u0005\u00c5\u0000\u0000\u01ae\u01af"+
		"\u0005\u00ea\u0000\u0000\u01af\u01b6\u00032\u0019\u0000\u01b0\u01b1\u0005"+
		"\u00ec\u0000\u0000\u01b1\u01b2\u0005\u00c5\u0000\u0000\u01b2\u01b3\u0005"+
		"\u00ea\u0000\u0000\u01b3\u01b5\u00032\u0019\u0000\u01b4\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01ad\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0005\u00e9\u0000\u0000\u01bcI\u0001\u0000\u0000"+
		"\u0000)MOY_ahx\u007f\u0083\u00a8\u00b1\u00b4\u00c3\u00c9\u00d2\u00e2\u00ed"+
		"\u00fb\u0107\u0111\u0116\u0123\u012d\u0135\u0138\u0142\u0149\u0151\u0159"+
		"\u0161\u0169\u0171\u017b\u017e\u0187\u0189\u019d\u01a5\u01a8\u01b6\u01b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}