// Generated from e:/compiler's project/Arabic_Compiler/Arabic_Compiler/Grammar/ArabicHtmlParser.g4 by ANTLR 4.13.1
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
		CLOSE_TAG=1, OPEN_TAG_START=2, SELF_CLOSE_END=3, ATTR_ID=4, ATTR_CLASS=5, 
		ATTR_SRC=6, ATTR_HREF=7, CSS_DISPLAY=8, CSS_POSITION=9, CSS_WIDTH=10, 
		CSS_HEIGHT=11, CSS_MAX_WIDTH=12, CSS_MIN_WIDTH=13, CSS_MAX_HEIGHT=14, 
		CSS_MIN_HEIGHT=15, CSS_MARGIN=16, CSS_PADDING=17, CSS_BORDER=18, CSS_VISIBILITY=19, 
		CSS_OVERFLOW=20, CSS_Z_INDEX=21, CSS_BOX_SIZING=22, CSS_FLEX=23, CSS_FLEX_DIR=24, 
		CSS_FLEX_WRAP=25, CSS_FLEX_GROW=26, CSS_FLEX_SHRINK=27, CSS_GRID=28, CSS_GRID_TEMPLATE=29, 
		CSS_GAP=30, CSS_JUSTIFY_CONT=31, CSS_ALIGN_ITEMS=32, CSS_ALIGN_SELF=33, 
		CSS_ORDER=34, CSS_COLOR=35, CSS_BACKGROUND=36, CSS_BG_IMAGE=37, CSS_BG_COLOR=38, 
		CSS_BG_SIZE=39, CSS_BG_REPEAT=40, CSS_BG_ATTACH=41, CSS_BG_CLIP=42, CSS_OPACITY=43, 
		CSS_BOX_SHADOW=44, CSS_FONT_FAMILY=45, CSS_FONT_SIZE=46, CSS_FONT_WEIGHT=47, 
		CSS_FONT_STYLE=48, CSS_TEXT_ALIGN=49, CSS_TEXT_DECOR=50, CSS_TEXT_TRANS=51, 
		CSS_TEXT_SHADOW=52, CSS_TEXT_INDENT=53, CSS_LINE_HEIGHT=54, CSS_LETTER_SPACING=55, 
		CSS_WORD_SPACING=56, CSS_WHITE_SPACE=57, CSS_DIRECTION=58, CSS_WRITING_MODE=59, 
		CSS_BORDER_RADIUS=60, CSS_BORDER_WIDTH=61, CSS_BORDER_STYLE=62, CSS_BORDER_COLOR=63, 
		CSS_OUTLINE=64, CSS_TOP=65, CSS_BOTTOM=66, CSS_RIGHT=67, CSS_LEFT=68, 
		CSS_MEDIA=69, CSS_LIST_STYLE=70, CSS_BORDER_COLLAPSE=71, CSS_TABLE_LAYOUT=72, 
		CSS_CAPTION_SIDE=73, CSS_FILTER=74, CSS_BACKDROP_FILT=75, CSS_HOVER=76, 
		CSS_ACTIVE=77, CSS_FOCUS=78, CSS_VISITED=79, CSS_ENABLED=80, CSS_DISABLED=81, 
		CSS_CHECKED=82, CSS_BEFORE=83, CSS_AFTER=84, CSS_PLACEHOLDER=85, CSS_SELECTION=86, 
		CSS_INHERIT=87, CSS_INITIAL=88, CSS_UNSET=89, CSS_NONE=90, CSS_AUTO=91, 
		CSS_CENTER=92, CSS_SOLID=93, CSS_DASHED=94, CSS_DOTTED=95, CSS_DOUBLE=96, 
		CSS_HIDDEN=97, CSS_BLOCK=98, CSS_INLINE=99, CSS_FLEX_VALUE=100, CSS_ABSOLUTE=101, 
		CSS_RELATIVE=102, CSS_FIXED=103, CSS_STICKY=104, CSS_ROW=105, CSS_COLUMN=106, 
		CSS_WRAP=107, CSS_POINTER=108, CSS_BOLD=109, CSS_ITALIC=110, CSS_IMPORTANT=111, 
		CSS_URL_FUNC=112, CSS_RGB_FUNC=113, CSS_RGBA_FUNC=114, CSS_CALC_FUNC=115, 
		CSS_VAR_FUNC=116, CSS_ROTATE_FUNC=117, CSS_SCALE_FUNC=118, CSS_BLUR_FUNC=119, 
		JS_VAR=120, JS_LET=121, JS_CONST=122, JS_ARRAY_KW=123, JS_STRING_KW=124, 
		JS_NUMBER_KW=125, JS_BOOLEAN_KW=126, JS_SYMBOL_KW=127, JS_MAP_KW=128, 
		JS_SET_KW=129, JS_DATE_KW=130, JS_OBJECT_KW=131, JS_IF=132, JS_ELSE=133, 
		JS_SWITCH=134, JS_CASE=135, JS_DEFAULT=136, JS_FOR=137, JS_WHILE=138, 
		JS_DO=139, JS_BREAK=140, JS_CONTINUE=141, JS_OF=142, JS_IN=143, JS_FUNCTION=144, 
		JS_RETURN=145, JS_TRUE=146, JS_FALSE=147, JS_NULL=148, JS_UNDEFINED=149, 
		JS_THIS=150, JS_NAN=151, JS_INFINITY=152, JS_TRY=153, JS_CATCH=154, JS_FINALLY=155, 
		JS_THROW=156, JS_EXCEPTION=157, JS_NEW=158, JS_CLASS=159, JS_EXTENDS=160, 
		JS_SUPER=161, JS_IMPLEMENTS=162, JS_INTERFACE=163, JS_CONSTRUCTOR=164, 
		JS_PRIVATE=165, JS_PROTECTED=166, JS_PUBLIC=167, JS_STATIC=168, JS_ENUM=169, 
		JS_PACKAGE=170, JS_IMPORT=171, JS_EXPORT=172, JS_FROM=173, JS_AS=174, 
		JS_TYPEOF=175, JS_INSTANCEOF=176, JS_DELETE=177, JS_DOCUMENT=178, JS_WINDOW=179, 
		JS_CONSOLE=180, JS_EVENT=181, JS_NODE=182, JS_ELEMENT=183, JS_LISTENER=184, 
		JS_LOCAL_STORAGE=185, JS_SESSION_STORAGE=186, JS_GET_ELEMENT=187, JS_GET_ELEMENTS=188, 
		JS_CREATE_EL=189, JS_INNER_TEXT=190, JS_INNER_HTML=191, JS_STYLE=192, 
		JS_ADD_LISTENER=193, JS_ON_CLICK=194, JS_ON_SUBMIT=195, JS_ON_CHANGE=196, 
		JS_ON_LOAD=197, JS_LOG=198, JS_ALERT=199, JS_PROMPT=200, IDENTIFIER=201, 
		CSS_UNIT=202, NUMBER=203, CSS_HEX_COLOR=204, JS_INC=205, JS_DEC=206, JS_EXP_ASSIGN=207, 
		JS_EXP=208, JS_ADD_ASSIGN=209, JS_SUB_ASSIGN=210, JS_MUL_ASSIGN=211, JS_DIV_ASSIGN=212, 
		JS_MOD_ASSIGN=213, JS_AND_ASSIGN=214, JS_OR_ASSIGN=215, JS_NULL_ASSIGN=216, 
		JS_SPREAD=217, JS_ARROW=218, JS_STREQ=219, JS_STRNEQ=220, JS_EQ=221, JS_NEQ=222, 
		JS_GTE=223, JS_LTE=224, JS_AND=225, JS_OR=226, JS_NULL_COAL=227, JS_URSH=228, 
		JS_RSH=229, JS_LSH=230, JS_ASSIGN=231, JS_BIT_AND=232, JS_BIT_OR=233, 
		JS_BIT_XOR=234, JS_QUESTION=235, LBRACE=236, RBRACE=237, COLON=238, SEMI=239, 
		COMMA=240, DOT=241, HASH=242, LPAREN=243, RPAREN=244, TILDE=245, DBL_COLON=246, 
		LBRACK=247, RBRACK=248, PLUS=249, MINUS=250, STAR=251, SLASH=252, PERCENT=253, 
		LT=254, GT=255, BANG=256, WS=257, BLOCK_COMMENT=258, LINE_COMMENT=259, 
		STRING=260;
	public static final int
		RULE_program = 0, RULE_attribute = 1, RULE_htmlElement = 2, RULE_htmlContent = 3, 
		RULE_text = 4, RULE_arabicKeyword = 5, RULE_cssRule = 6, RULE_selector = 7, 
		RULE_declarationList = 8, RULE_declaration = 9, RULE_cssProperty = 10, 
		RULE_cssValue = 11, RULE_cssFunction = 12, RULE_jsStatement = 13, RULE_block = 14, 
		RULE_variableDeclaration = 15, RULE_assignmentStatement = 16, RULE_ifStatement = 17, 
		RULE_forLoop = 18, RULE_whileLoop = 19, RULE_functionDeclaration = 20, 
		RULE_parameterList = 21, RULE_returnStatement = 22, RULE_tryCatchStatement = 23, 
		RULE_expressionStatement = 24, RULE_builtInCall = 25, RULE_expression = 26, 
		RULE_assignmentExpression = 27, RULE_logicalOrExpression = 28, RULE_logicalAndExpression = 29, 
		RULE_equalityExpression = 30, RULE_relationalExpression = 31, RULE_additiveExpression = 32, 
		RULE_multiplicativeExpression = 33, RULE_memberExpression = 34, RULE_primaryExpression = 35, 
		RULE_arrayLiteral = 36, RULE_objectLiteral = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "attribute", "htmlElement", "htmlContent", "text", "arabicKeyword", 
			"cssRule", "selector", "declarationList", "declaration", "cssProperty", 
			"cssValue", "cssFunction", "jsStatement", "block", "variableDeclaration", 
			"assignmentStatement", "ifStatement", "forLoop", "whileLoop", "functionDeclaration", 
			"parameterList", "returnStatement", "tryCatchStatement", "expressionStatement", 
			"builtInCall", "expression", "assignmentExpression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "memberExpression", 
			"primaryExpression", "arrayLiteral", "objectLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'/>'", "'\\u0645\\u0639\\u0631\\u0641'", "'\\u0635\\u0646\\u0641'", 
			"'\\u0645\\u0635\\u062F\\u0631'", "'\\u0648\\u062C\\u0647\\u0629'", "'\\u0639\\u0631\\u0636'", 
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
			null, "CLOSE_TAG", "OPEN_TAG_START", "SELF_CLOSE_END", "ATTR_ID", "ATTR_CLASS", 
			"ATTR_SRC", "ATTR_HREF", "CSS_DISPLAY", "CSS_POSITION", "CSS_WIDTH", 
			"CSS_HEIGHT", "CSS_MAX_WIDTH", "CSS_MIN_WIDTH", "CSS_MAX_HEIGHT", "CSS_MIN_HEIGHT", 
			"CSS_MARGIN", "CSS_PADDING", "CSS_BORDER", "CSS_VISIBILITY", "CSS_OVERFLOW", 
			"CSS_Z_INDEX", "CSS_BOX_SIZING", "CSS_FLEX", "CSS_FLEX_DIR", "CSS_FLEX_WRAP", 
			"CSS_FLEX_GROW", "CSS_FLEX_SHRINK", "CSS_GRID", "CSS_GRID_TEMPLATE", 
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_TAG_START || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & -9207609438158979071L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & -4611670625264500861L) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 576538851988733957L) != 0)) {
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(76);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(77);
					cssRule();
					}
					break;
				case 3:
					{
					setState(78);
					jsStatement();
					}
					break;
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAttributeContext extends AttributeContext {
		public TerminalNode ATTR_ID() { return getToken(ArabicHtmlParser.ATTR_ID, 0); }
		public TerminalNode JS_ASSIGN() { return getToken(ArabicHtmlParser.JS_ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public IdAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassAttributeContext extends AttributeContext {
		public TerminalNode ATTR_CLASS() { return getToken(ArabicHtmlParser.ATTR_CLASS, 0); }
		public TerminalNode JS_ASSIGN() { return getToken(ArabicHtmlParser.JS_ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public ClassAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HrefAttributeContext extends AttributeContext {
		public TerminalNode ATTR_HREF() { return getToken(ArabicHtmlParser.ATTR_HREF, 0); }
		public TerminalNode JS_ASSIGN() { return getToken(ArabicHtmlParser.JS_ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public HrefAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SrcAttributeContext extends AttributeContext {
		public TerminalNode ATTR_SRC() { return getToken(ArabicHtmlParser.ATTR_SRC, 0); }
		public TerminalNode JS_ASSIGN() { return getToken(ArabicHtmlParser.JS_ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public SrcAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_attribute);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR_ID:
				_localctx = new IdAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(ATTR_ID);
				setState(87);
				match(JS_ASSIGN);
				setState(88);
				match(STRING);
				}
				break;
			case ATTR_CLASS:
				_localctx = new ClassAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(ATTR_CLASS);
				setState(90);
				match(JS_ASSIGN);
				setState(91);
				match(STRING);
				}
				break;
			case ATTR_SRC:
				_localctx = new SrcAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(ATTR_SRC);
				setState(93);
				match(JS_ASSIGN);
				setState(94);
				match(STRING);
				}
				break;
			case ATTR_HREF:
				_localctx = new HrefAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(ATTR_HREF);
				setState(96);
				match(JS_ASSIGN);
				setState(97);
				match(STRING);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends HtmlElementContext {
		public TerminalNode OPEN_TAG_START() { return getToken(ArabicHtmlParser.OPEN_TAG_START, 0); }
		public TerminalNode SELF_CLOSE_END() { return getToken(ArabicHtmlParser.SELF_CLOSE_END, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfClosingElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentElementContext extends HtmlElementContext {
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
		public ParentElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ParentElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(OPEN_TAG_START);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
					{
					{
					setState(101);
					attribute();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(GT);
				setState(108);
				htmlContent();
				setState(109);
				match(CLOSE_TAG);
				}
				break;
			case 2:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(OPEN_TAG_START);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
					{
					{
					setState(112);
					attribute();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
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
		enterRule(_localctx, 6, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 196868L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & -9207609437613719551L) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 246290606194225L) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & 2306155407954935831L) != 0)) {
				{
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(121);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(122);
					jsStatement();
					}
					break;
				case 3:
					{
					setState(123);
					cssRule();
					}
					break;
				case 4:
					{
					setState(124);
					text();
					}
					break;
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
		enterRule(_localctx, 8, RULE_text);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
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
				setState(133);
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
		enterRule(_localctx, 10, RULE_arabicKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 196864L) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 71040547661283393L) != 0)) ) {
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
		enterRule(_localctx, 12, RULE_cssRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			selector();
			setState(139);
			match(LBRACE);
			setState(140);
			declarationList();
			setState(141);
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
		enterRule(_localctx, 14, RULE_selector);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(IDENTIFIER);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(HASH);
				setState(145);
				match(IDENTIFIER);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(DOT);
				setState(147);
				match(IDENTIFIER);
				}
				break;
			case CSS_MEDIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(CSS_MEDIA);
				setState(149);
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
		enterRule(_localctx, 16, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			declaration();
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					match(SEMI);
					setState(154);
					declaration();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(160);
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
		enterRule(_localctx, 18, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			cssProperty();
			setState(164);
			match(COLON);
			setState(165);
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
		enterRule(_localctx, 20, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -256L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4033L) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_cssValue);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(NUMBER);
				}
				break;
			case CSS_UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(CSS_UNIT);
				}
				break;
			case CSS_HEX_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(CSS_HEX_COLOR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(STRING);
				}
				break;
			case CSS_INHERIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				match(CSS_INHERIT);
				}
				break;
			case CSS_INITIAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				match(CSS_INITIAL);
				}
				break;
			case CSS_UNSET:
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				match(CSS_UNSET);
				}
				break;
			case CSS_NONE:
				enterOuterAlt(_localctx, 9);
				{
				setState(177);
				match(CSS_NONE);
				}
				break;
			case CSS_AUTO:
				enterOuterAlt(_localctx, 10);
				{
				setState(178);
				match(CSS_AUTO);
				}
				break;
			case CSS_CENTER:
				enterOuterAlt(_localctx, 11);
				{
				setState(179);
				match(CSS_CENTER);
				}
				break;
			case CSS_SOLID:
				enterOuterAlt(_localctx, 12);
				{
				setState(180);
				match(CSS_SOLID);
				}
				break;
			case CSS_DASHED:
				enterOuterAlt(_localctx, 13);
				{
				setState(181);
				match(CSS_DASHED);
				}
				break;
			case CSS_DOTTED:
				enterOuterAlt(_localctx, 14);
				{
				setState(182);
				match(CSS_DOTTED);
				}
				break;
			case CSS_DOUBLE:
				enterOuterAlt(_localctx, 15);
				{
				setState(183);
				match(CSS_DOUBLE);
				}
				break;
			case CSS_HIDDEN:
				enterOuterAlt(_localctx, 16);
				{
				setState(184);
				match(CSS_HIDDEN);
				}
				break;
			case CSS_BLOCK:
				enterOuterAlt(_localctx, 17);
				{
				setState(185);
				match(CSS_BLOCK);
				}
				break;
			case CSS_INLINE:
				enterOuterAlt(_localctx, 18);
				{
				setState(186);
				match(CSS_INLINE);
				}
				break;
			case CSS_FLEX_VALUE:
				enterOuterAlt(_localctx, 19);
				{
				setState(187);
				match(CSS_FLEX_VALUE);
				}
				break;
			case CSS_ABSOLUTE:
				enterOuterAlt(_localctx, 20);
				{
				setState(188);
				match(CSS_ABSOLUTE);
				}
				break;
			case CSS_RELATIVE:
				enterOuterAlt(_localctx, 21);
				{
				setState(189);
				match(CSS_RELATIVE);
				}
				break;
			case CSS_FIXED:
				enterOuterAlt(_localctx, 22);
				{
				setState(190);
				match(CSS_FIXED);
				}
				break;
			case CSS_STICKY:
				enterOuterAlt(_localctx, 23);
				{
				setState(191);
				match(CSS_STICKY);
				}
				break;
			case CSS_ROW:
				enterOuterAlt(_localctx, 24);
				{
				setState(192);
				match(CSS_ROW);
				}
				break;
			case CSS_COLUMN:
				enterOuterAlt(_localctx, 25);
				{
				setState(193);
				match(CSS_COLUMN);
				}
				break;
			case CSS_WRAP:
				enterOuterAlt(_localctx, 26);
				{
				setState(194);
				match(CSS_WRAP);
				}
				break;
			case CSS_BOLD:
				enterOuterAlt(_localctx, 27);
				{
				setState(195);
				match(CSS_BOLD);
				}
				break;
			case CSS_ITALIC:
				enterOuterAlt(_localctx, 28);
				{
				setState(196);
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
				setState(197);
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
		enterRule(_localctx, 24, RULE_cssFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(201);
			match(LPAREN);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & 180143997979721791L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 16779393L) != 0)) {
				{
				setState(202);
				expression();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(203);
					match(COMMA);
					setState(204);
					expression();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(212);
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
		enterRule(_localctx, 26, RULE_jsStatement);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				functionDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				tryCatchStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
				expressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(223);
				builtInCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(224);
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
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LBRACE);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 2017612645930504199L) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & 2306142213815402519L) != 0)) {
				{
				{
				setState(228);
				jsStatement();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
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
		enterRule(_localctx, 30, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(237);
			match(IDENTIFIER);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_ASSIGN) {
				{
				setState(238);
				match(JS_ASSIGN);
				setState(239);
				expression();
				}
			}

			setState(242);
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
		enterRule(_localctx, 32, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(IDENTIFIER);
			setState(245);
			_la = _input.LA(1);
			if ( !(((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & 4194319L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(246);
			expression();
			setState(247);
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
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(JS_IF);
			setState(250);
			match(LPAREN);
			setState(251);
			expression();
			setState(252);
			match(RPAREN);
			setState(253);
			jsStatement();
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(254);
				match(JS_ELSE);
				setState(255);
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
		enterRule(_localctx, 36, RULE_forLoop);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(JS_FOR);
				setState(259);
				match(LPAREN);
				setState(267);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JS_VAR:
				case JS_LET:
				case JS_CONST:
					{
					setState(260);
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
					setState(261);
					expression();
					setState(262);
					match(SEMI);
					setState(263);
					expression();
					setState(264);
					match(SEMI);
					setState(265);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(269);
				match(RPAREN);
				setState(270);
				jsStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(JS_FOR);
				setState(273);
				match(LPAREN);
				setState(274);
				_la = _input.LA(1);
				if ( !(_la==JS_VAR || _la==JS_LET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(275);
				match(IDENTIFIER);
				setState(276);
				_la = _input.LA(1);
				if ( !(_la==JS_OF || _la==JS_IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(277);
				expression();
				setState(278);
				match(RPAREN);
				setState(279);
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
		enterRule(_localctx, 38, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(JS_WHILE);
			setState(284);
			match(LPAREN);
			setState(285);
			expression();
			setState(286);
			match(RPAREN);
			setState(287);
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
		enterRule(_localctx, 40, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(JS_FUNCTION);
			setState(290);
			match(IDENTIFIER);
			setState(291);
			match(LPAREN);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(292);
				parameterList();
				}
			}

			setState(295);
			match(RPAREN);
			setState(296);
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
		enterRule(_localctx, 42, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(IDENTIFIER);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(299);
				match(COMMA);
				setState(300);
				match(IDENTIFIER);
				}
				}
				setState(305);
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
		enterRule(_localctx, 44, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(JS_RETURN);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & 180143997979721791L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 16779393L) != 0)) {
				{
				setState(307);
				expression();
				}
			}

			setState(310);
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
		enterRule(_localctx, 46, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(JS_TRY);
			setState(313);
			block();
			setState(314);
			match(JS_CATCH);
			setState(315);
			match(LPAREN);
			setState(316);
			match(IDENTIFIER);
			setState(317);
			match(RPAREN);
			setState(318);
			block();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_FINALLY) {
				{
				setState(319);
				match(JS_FINALLY);
				setState(320);
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
		enterRule(_localctx, 48, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			expression();
			setState(324);
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
		enterRule(_localctx, 50, RULE_builtInCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_CONSOLE:
				{
				setState(326);
				match(JS_CONSOLE);
				setState(327);
				match(DOT);
				setState(328);
				match(JS_LOG);
				}
				break;
			case JS_ALERT:
				{
				setState(329);
				match(JS_ALERT);
				}
				break;
			case JS_PROMPT:
				{
				setState(330);
				match(JS_PROMPT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(333);
			match(LPAREN);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & 180143997979721791L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 16779393L) != 0)) {
				{
				setState(334);
				expression();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(335);
					match(COMMA);
					setState(336);
					expression();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(344);
			match(RPAREN);
			setState(345);
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
		enterRule(_localctx, 52, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		enterRule(_localctx, 54, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			logicalOrExpression();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_ASSIGN) {
				{
				setState(350);
				match(JS_ASSIGN);
				setState(351);
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
		enterRule(_localctx, 56, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			logicalAndExpression();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_OR) {
				{
				{
				setState(355);
				match(JS_OR);
				setState(356);
				logicalAndExpression();
				}
				}
				setState(361);
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
		enterRule(_localctx, 58, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			equalityExpression();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_AND) {
				{
				{
				setState(363);
				match(JS_AND);
				setState(364);
				equalityExpression();
				}
				}
				setState(369);
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
		enterRule(_localctx, 60, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			relationalExpression();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & 15L) != 0)) {
				{
				{
				setState(371);
				_la = _input.LA(1);
				if ( !(((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(372);
				relationalExpression();
				}
				}
				setState(377);
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
		enterRule(_localctx, 62, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			additiveExpression();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_IN || _la==JS_INSTANCEOF || ((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & 6442450947L) != 0)) {
				{
				{
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==JS_IN || _la==JS_INSTANCEOF || ((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & 6442450947L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
				additiveExpression();
				}
				}
				setState(385);
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
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			multiplicativeExpression();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(387);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(388);
				multiplicativeExpression();
				}
				}
				setState(393);
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
		enterRule(_localctx, 66, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			memberExpression();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & 7L) != 0)) {
				{
				{
				setState(395);
				_la = _input.LA(1);
				if ( !(((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(396);
				memberExpression();
				}
				}
				setState(401);
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
		enterRule(_localctx, 68, RULE_memberExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			primaryExpression();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 241)) & ~0x3f) == 0 && ((1L << (_la - 241)) & 69L) != 0)) {
				{
				setState(421);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(403);
					match(LPAREN);
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & 180143997979721791L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 16779393L) != 0)) {
						{
						setState(404);
						expression();
						setState(409);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(405);
							match(COMMA);
							setState(406);
							expression();
							}
							}
							setState(411);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(414);
					match(RPAREN);
					}
					break;
				case DOT:
					{
					setState(415);
					match(DOT);
					setState(416);
					_la = _input.LA(1);
					if ( !(((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & 2317L) != 0)) ) {
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
					setState(417);
					match(LBRACK);
					setState(418);
					expression();
					setState(419);
					match(RBRACK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(425);
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
		enterRule(_localctx, 70, RULE_primaryExpression);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(STRING);
				}
				break;
			case JS_TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				match(JS_TRUE);
				}
				break;
			case JS_FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				match(JS_FALSE);
				}
				break;
			case JS_NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(431);
				match(JS_NULL);
				}
				break;
			case JS_UNDEFINED:
				enterOuterAlt(_localctx, 7);
				{
				setState(432);
				match(JS_UNDEFINED);
				}
				break;
			case JS_THIS:
				enterOuterAlt(_localctx, 8);
				{
				setState(433);
				match(JS_THIS);
				}
				break;
			case JS_NAN:
				enterOuterAlt(_localctx, 9);
				{
				setState(434);
				match(JS_NAN);
				}
				break;
			case JS_DOCUMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(435);
				match(JS_DOCUMENT);
				}
				break;
			case JS_WINDOW:
				enterOuterAlt(_localctx, 11);
				{
				setState(436);
				match(JS_WINDOW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 12);
				{
				setState(437);
				match(LPAREN);
				setState(438);
				expression();
				setState(439);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 13);
				{
				setState(441);
				arrayLiteral();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 14);
				{
				setState(442);
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
		enterRule(_localctx, 72, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(LBRACK);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & 180143997979721791L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 16779393L) != 0)) {
				{
				setState(446);
				expression();
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(447);
					match(COMMA);
					setState(448);
					expression();
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(456);
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
		enterRule(_localctx, 74, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LBRACE);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(459);
				match(IDENTIFIER);
				setState(460);
				match(COLON);
				setState(461);
				expression();
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(462);
					match(COMMA);
					setState(463);
					match(IDENTIFIER);
					setState(464);
					match(COLON);
					setState(465);
					expression();
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(473);
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
		"\u0004\u0001\u0104\u01dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001c\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002g\b\u0002"+
		"\n\u0002\f\u0002j\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002r\b\u0002\n\u0002\f\u0002u\t\u0002"+
		"\u0001\u0002\u0003\u0002x\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003~\b\u0003\n\u0003\f\u0003\u0081\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0087\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0097\b\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u009c\b\b\n\b\f\b\u009f\t\b\u0001\b\u0003\b\u00a2\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00c7\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00ce\b\f\n\f\f\f\u00d1\t\f\u0003\f\u00d3\b"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e2\b\r\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00e6\b\u000e\n\u000e\f\u000e\u00e9\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00f1\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0101\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u010c\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011a\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0126\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u012e\b\u0015\n\u0015\f\u0015\u0131\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0135\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0142\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u014c\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0152\b\u0019\n\u0019\f\u0019\u0155\t\u0019\u0003\u0019\u0157\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0161\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0166\b\u001c\n\u001c\f\u001c\u0169\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u016e\b\u001d\n\u001d"+
		"\f\u001d\u0171\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0176\b\u001e\n\u001e\f\u001e\u0179\t\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u017e\b\u001f\n\u001f\f\u001f\u0181\t\u001f\u0001 "+
		"\u0001 \u0001 \u0005 \u0186\b \n \f \u0189\t \u0001!\u0001!\u0001!\u0005"+
		"!\u018e\b!\n!\f!\u0191\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u0198\b\"\n\"\f\"\u019b\t\"\u0003\"\u019d\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01a6\b\"\n\"\f\"\u01a9\t\""+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01bc\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u01c2\b$\n$\f$\u01c5\t$\u0003$\u01c7\b$"+
		"\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0005%\u01d3\b%\n%\f%\u01d6\t%\u0003%\u01d8\b%\u0001%\u0001%\u0001%"+
		"\u0000\u0000&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\f\b\u0000\b\b\u0010"+
		"\u0011\\\\bbxz\u0084\u0085\u0089\u008a\u008e\u0093\u0002\u0000\b@FK\u0001"+
		"\u0000pw\u0001\u0000xz\u0002\u0000\u00d1\u00d4\u00e7\u00e7\u0001\u0000"+
		"xy\u0001\u0000\u008e\u008f\u0001\u0000\u00db\u00de\u0004\u0000\u008f\u008f"+
		"\u00b0\u00b0\u00df\u00e0\u00fe\u00ff\u0001\u0000\u00f9\u00fa\u0001\u0000"+
		"\u00fb\u00fd\u0004\u0000\u00be\u00be\u00c0\u00c1\u00c6\u00c6\u00c9\u00c9"+
		"\u021c\u0000Q\u0001\u0000\u0000\u0000\u0002b\u0001\u0000\u0000\u0000\u0004"+
		"w\u0001\u0000\u0000\u0000\u0006\u007f\u0001\u0000\u0000\u0000\b\u0086"+
		"\u0001\u0000\u0000\u0000\n\u0088\u0001\u0000\u0000\u0000\f\u008a\u0001"+
		"\u0000\u0000\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u0098\u0001"+
		"\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014\u00a7\u0001"+
		"\u0000\u0000\u0000\u0016\u00c6\u0001\u0000\u0000\u0000\u0018\u00c8\u0001"+
		"\u0000\u0000\u0000\u001a\u00e1\u0001\u0000\u0000\u0000\u001c\u00e3\u0001"+
		"\u0000\u0000\u0000\u001e\u00ec\u0001\u0000\u0000\u0000 \u00f4\u0001\u0000"+
		"\u0000\u0000\"\u00f9\u0001\u0000\u0000\u0000$\u0119\u0001\u0000\u0000"+
		"\u0000&\u011b\u0001\u0000\u0000\u0000(\u0121\u0001\u0000\u0000\u0000*"+
		"\u012a\u0001\u0000\u0000\u0000,\u0132\u0001\u0000\u0000\u0000.\u0138\u0001"+
		"\u0000\u0000\u00000\u0143\u0001\u0000\u0000\u00002\u014b\u0001\u0000\u0000"+
		"\u00004\u015b\u0001\u0000\u0000\u00006\u015d\u0001\u0000\u0000\u00008"+
		"\u0162\u0001\u0000\u0000\u0000:\u016a\u0001\u0000\u0000\u0000<\u0172\u0001"+
		"\u0000\u0000\u0000>\u017a\u0001\u0000\u0000\u0000@\u0182\u0001\u0000\u0000"+
		"\u0000B\u018a\u0001\u0000\u0000\u0000D\u0192\u0001\u0000\u0000\u0000F"+
		"\u01bb\u0001\u0000\u0000\u0000H\u01bd\u0001\u0000\u0000\u0000J\u01ca\u0001"+
		"\u0000\u0000\u0000LP\u0003\u0004\u0002\u0000MP\u0003\f\u0006\u0000NP\u0003"+
		"\u001a\r\u0000OL\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0000\u0000\u0001U\u0001\u0001\u0000\u0000\u0000VW\u0005"+
		"\u0004\u0000\u0000WX\u0005\u00e7\u0000\u0000Xc\u0005\u0104\u0000\u0000"+
		"YZ\u0005\u0005\u0000\u0000Z[\u0005\u00e7\u0000\u0000[c\u0005\u0104\u0000"+
		"\u0000\\]\u0005\u0006\u0000\u0000]^\u0005\u00e7\u0000\u0000^c\u0005\u0104"+
		"\u0000\u0000_`\u0005\u0007\u0000\u0000`a\u0005\u00e7\u0000\u0000ac\u0005"+
		"\u0104\u0000\u0000bV\u0001\u0000\u0000\u0000bY\u0001\u0000\u0000\u0000"+
		"b\\\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000c\u0003\u0001\u0000"+
		"\u0000\u0000dh\u0005\u0002\u0000\u0000eg\u0003\u0002\u0001\u0000fe\u0001"+
		"\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000kl\u0005\u00ff\u0000\u0000lm\u0003\u0006\u0003\u0000mn\u0005\u0001"+
		"\u0000\u0000nx\u0001\u0000\u0000\u0000os\u0005\u0002\u0000\u0000pr\u0003"+
		"\u0002\u0001\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vx\u0005\u0003\u0000\u0000wd\u0001\u0000"+
		"\u0000\u0000wo\u0001\u0000\u0000\u0000x\u0005\u0001\u0000\u0000\u0000"+
		"y~\u0003\u0004\u0002\u0000z~\u0003\u001a\r\u0000{~\u0003\f\u0006\u0000"+
		"|~\u0003\b\u0004\u0000}y\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0007\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0087\u0005\u0104\u0000\u0000\u0083\u0087\u0005\u00c9\u0000"+
		"\u0000\u0084\u0087\u0005\u00cb\u0000\u0000\u0085\u0087\u0003\n\u0005\u0000"+
		"\u0086\u0082\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\t\u0001\u0000\u0000\u0000\u0088\u0089\u0007\u0000\u0000\u0000\u0089"+
		"\u000b\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u000e\u0007\u0000\u008b"+
		"\u008c\u0005\u00ec\u0000\u0000\u008c\u008d\u0003\u0010\b\u0000\u008d\u008e"+
		"\u0005\u00ed\u0000\u0000\u008e\r\u0001\u0000\u0000\u0000\u008f\u0097\u0005"+
		"\u00c9\u0000\u0000\u0090\u0091\u0005\u00f2\u0000\u0000\u0091\u0097\u0005"+
		"\u00c9\u0000\u0000\u0092\u0093\u0005\u00f1\u0000\u0000\u0093\u0097\u0005"+
		"\u00c9\u0000\u0000\u0094\u0095\u0005E\u0000\u0000\u0095\u0097\u0005\u00c9"+
		"\u0000\u0000\u0096\u008f\u0001\u0000\u0000\u0000\u0096\u0090\u0001\u0000"+
		"\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u000f\u0001\u0000\u0000\u0000\u0098\u009d\u0003\u0012"+
		"\t\u0000\u0099\u009a\u0005\u00ef\u0000\u0000\u009a\u009c\u0003\u0012\t"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a2\u0005\u00ef\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u0011\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0003\u0014\n\u0000\u00a4\u00a5\u0005\u00ee\u0000\u0000"+
		"\u00a5\u00a6\u0003\u0016\u000b\u0000\u00a6\u0013\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0007\u0001\u0000\u0000\u00a8\u0015\u0001\u0000\u0000\u0000"+
		"\u00a9\u00c7\u0005\u00c9\u0000\u0000\u00aa\u00c7\u0005\u00cb\u0000\u0000"+
		"\u00ab\u00c7\u0005\u00ca\u0000\u0000\u00ac\u00c7\u0005\u00cc\u0000\u0000"+
		"\u00ad\u00c7\u0005\u0104\u0000\u0000\u00ae\u00c7\u0005W\u0000\u0000\u00af"+
		"\u00c7\u0005X\u0000\u0000\u00b0\u00c7\u0005Y\u0000\u0000\u00b1\u00c7\u0005"+
		"Z\u0000\u0000\u00b2\u00c7\u0005[\u0000\u0000\u00b3\u00c7\u0005\\\u0000"+
		"\u0000\u00b4\u00c7\u0005]\u0000\u0000\u00b5\u00c7\u0005^\u0000\u0000\u00b6"+
		"\u00c7\u0005_\u0000\u0000\u00b7\u00c7\u0005`\u0000\u0000\u00b8\u00c7\u0005"+
		"a\u0000\u0000\u00b9\u00c7\u0005b\u0000\u0000\u00ba\u00c7\u0005c\u0000"+
		"\u0000\u00bb\u00c7\u0005d\u0000\u0000\u00bc\u00c7\u0005e\u0000\u0000\u00bd"+
		"\u00c7\u0005f\u0000\u0000\u00be\u00c7\u0005g\u0000\u0000\u00bf\u00c7\u0005"+
		"h\u0000\u0000\u00c0\u00c7\u0005i\u0000\u0000\u00c1\u00c7\u0005j\u0000"+
		"\u0000\u00c2\u00c7\u0005k\u0000\u0000\u00c3\u00c7\u0005m\u0000\u0000\u00c4"+
		"\u00c7\u0005n\u0000\u0000\u00c5\u00c7\u0003\u0018\f\u0000\u00c6\u00a9"+
		"\u0001\u0000\u0000\u0000\u00c6\u00aa\u0001\u0000\u0000\u0000\u00c6\u00ab"+
		"\u0001\u0000\u0000\u0000\u00c6\u00ac\u0001\u0000\u0000\u0000\u00c6\u00ad"+
		"\u0001\u0000\u0000\u0000\u00c6\u00ae\u0001\u0000\u0000\u0000\u00c6\u00af"+
		"\u0001\u0000\u0000\u0000\u00c6\u00b0\u0001\u0000\u0000\u0000\u00c6\u00b1"+
		"\u0001\u0000\u0000\u0000\u00c6\u00b2\u0001\u0000\u0000\u0000\u00c6\u00b3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00b4\u0001\u0000\u0000\u0000\u00c6\u00b5"+
		"\u0001\u0000\u0000\u0000\u00c6\u00b6\u0001\u0000\u0000\u0000\u00c6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00c6\u00b8\u0001\u0000\u0000\u0000\u00c6\u00b9"+
		"\u0001\u0000\u0000\u0000\u00c6\u00ba\u0001\u0000\u0000\u0000\u00c6\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c6\u00bc\u0001\u0000\u0000\u0000\u00c6\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c6\u00be\u0001\u0000\u0000\u0000\u00c6\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u0017\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0007\u0002\u0000\u0000\u00c9\u00d2\u0005\u00f3\u0000\u0000\u00ca\u00cf"+
		"\u00034\u001a\u0000\u00cb\u00cc\u0005\u00f0\u0000\u0000\u00cc\u00ce\u0003"+
		"4\u001a\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00ca\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u00f4"+
		"\u0000\u0000\u00d5\u0019\u0001\u0000\u0000\u0000\u00d6\u00e2\u0003\u001e"+
		"\u000f\u0000\u00d7\u00e2\u0003 \u0010\u0000\u00d8\u00e2\u0003\"\u0011"+
		"\u0000\u00d9\u00e2\u0003$\u0012\u0000\u00da\u00e2\u0003&\u0013\u0000\u00db"+
		"\u00e2\u0003(\u0014\u0000\u00dc\u00e2\u0003,\u0016\u0000\u00dd\u00e2\u0003"+
		".\u0017\u0000\u00de\u00e2\u00030\u0018\u0000\u00df\u00e2\u00032\u0019"+
		"\u0000\u00e0\u00e2\u0003\u001c\u000e\u0000\u00e1\u00d6\u0001\u0000\u0000"+
		"\u0000\u00e1\u00d7\u0001\u0000\u0000\u0000\u00e1\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e1\u00d9\u0001\u0000\u0000\u0000\u00e1\u00da\u0001\u0000\u0000"+
		"\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000"+
		"\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u001b\u0001\u0000\u0000\u0000\u00e3\u00e7\u0005\u00ec\u0000"+
		"\u0000\u00e4\u00e6\u0003\u001a\r\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u00ed\u0000\u0000"+
		"\u00eb\u001d\u0001\u0000\u0000\u0000\u00ec\u00ed\u0007\u0003\u0000\u0000"+
		"\u00ed\u00f0\u0005\u00c9\u0000\u0000\u00ee\u00ef\u0005\u00e7\u0000\u0000"+
		"\u00ef\u00f1\u00034\u001a\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0005\u00ef\u0000\u0000\u00f3\u001f\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005\u00c9\u0000\u0000\u00f5\u00f6\u0007\u0004\u0000\u0000\u00f6"+
		"\u00f7\u00034\u001a\u0000\u00f7\u00f8\u0005\u00ef\u0000\u0000\u00f8!\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005\u0084\u0000\u0000\u00fa\u00fb\u0005"+
		"\u00f3\u0000\u0000\u00fb\u00fc\u00034\u001a\u0000\u00fc\u00fd\u0005\u00f4"+
		"\u0000\u0000\u00fd\u0100\u0003\u001a\r\u0000\u00fe\u00ff\u0005\u0085\u0000"+
		"\u0000\u00ff\u0101\u0003\u001a\r\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101#\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005\u0089\u0000\u0000\u0103\u010b\u0005\u00f3\u0000\u0000\u0104"+
		"\u010c\u0003\u001e\u000f\u0000\u0105\u0106\u00034\u001a\u0000\u0106\u0107"+
		"\u0005\u00ef\u0000\u0000\u0107\u0108\u00034\u001a\u0000\u0108\u0109\u0005"+
		"\u00ef\u0000\u0000\u0109\u010a\u00034\u001a\u0000\u010a\u010c\u0001\u0000"+
		"\u0000\u0000\u010b\u0104\u0001\u0000\u0000\u0000\u010b\u0105\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u00f4"+
		"\u0000\u0000\u010e\u010f\u0003\u001a\r\u0000\u010f\u011a\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0005\u0089\u0000\u0000\u0111\u0112\u0005\u00f3\u0000"+
		"\u0000\u0112\u0113\u0007\u0005\u0000\u0000\u0113\u0114\u0005\u00c9\u0000"+
		"\u0000\u0114\u0115\u0007\u0006\u0000\u0000\u0115\u0116\u00034\u001a\u0000"+
		"\u0116\u0117\u0005\u00f4\u0000\u0000\u0117\u0118\u0003\u001a\r\u0000\u0118"+
		"\u011a\u0001\u0000\u0000\u0000\u0119\u0102\u0001\u0000\u0000\u0000\u0119"+
		"\u0110\u0001\u0000\u0000\u0000\u011a%\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0005\u008a\u0000\u0000\u011c\u011d\u0005\u00f3\u0000\u0000\u011d\u011e"+
		"\u00034\u001a\u0000\u011e\u011f\u0005\u00f4\u0000\u0000\u011f\u0120\u0003"+
		"\u001a\r\u0000\u0120\'\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0090"+
		"\u0000\u0000\u0122\u0123\u0005\u00c9\u0000\u0000\u0123\u0125\u0005\u00f3"+
		"\u0000\u0000\u0124\u0126\u0003*\u0015\u0000\u0125\u0124\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0005\u00f4\u0000\u0000\u0128\u0129\u0003\u001c\u000e"+
		"\u0000\u0129)\u0001\u0000\u0000\u0000\u012a\u012f\u0005\u00c9\u0000\u0000"+
		"\u012b\u012c\u0005\u00f0\u0000\u0000\u012c\u012e\u0005\u00c9\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000"+
		"\u0130+\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132"+
		"\u0134\u0005\u0091\u0000\u0000\u0133\u0135\u00034\u001a\u0000\u0134\u0133"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u00ef\u0000\u0000\u0137-\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005\u0099\u0000\u0000\u0139\u013a\u0003"+
		"\u001c\u000e\u0000\u013a\u013b\u0005\u009a\u0000\u0000\u013b\u013c\u0005"+
		"\u00f3\u0000\u0000\u013c\u013d\u0005\u00c9\u0000\u0000\u013d\u013e\u0005"+
		"\u00f4\u0000\u0000\u013e\u0141\u0003\u001c\u000e\u0000\u013f\u0140\u0005"+
		"\u009b\u0000\u0000\u0140\u0142\u0003\u001c\u000e\u0000\u0141\u013f\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142/\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u00034\u001a\u0000\u0144\u0145\u0005\u00ef\u0000"+
		"\u0000\u01451\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u00b4\u0000\u0000"+
		"\u0147\u0148\u0005\u00f1\u0000\u0000\u0148\u014c\u0005\u00c6\u0000\u0000"+
		"\u0149\u014c\u0005\u00c7\u0000\u0000\u014a\u014c\u0005\u00c8\u0000\u0000"+
		"\u014b\u0146\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u0156\u0005\u00f3\u0000\u0000\u014e\u0153\u00034\u001a\u0000\u014f"+
		"\u0150\u0005\u00f0\u0000\u0000\u0150\u0152\u00034\u001a\u0000\u0151\u014f"+
		"\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0157"+
		"\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u014e"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0005\u00f4\u0000\u0000\u0159\u015a"+
		"\u0005\u00ef\u0000\u0000\u015a3\u0001\u0000\u0000\u0000\u015b\u015c\u0003"+
		"6\u001b\u0000\u015c5\u0001\u0000\u0000\u0000\u015d\u0160\u00038\u001c"+
		"\u0000\u015e\u015f\u0005\u00e7\u0000\u0000\u015f\u0161\u00034\u001a\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u01617\u0001\u0000\u0000\u0000\u0162\u0167\u0003:\u001d\u0000\u0163\u0164"+
		"\u0005\u00e2\u0000\u0000\u0164\u0166\u0003:\u001d\u0000\u0165\u0163\u0001"+
		"\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u01689\u0001\u0000"+
		"\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016f\u0003<\u001e"+
		"\u0000\u016b\u016c\u0005\u00e1\u0000\u0000\u016c\u016e\u0003<\u001e\u0000"+
		"\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000"+
		"\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170;\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172"+
		"\u0177\u0003>\u001f\u0000\u0173\u0174\u0007\u0007\u0000\u0000\u0174\u0176"+
		"\u0003>\u001f\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0179\u0001"+
		"\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178=\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u017a\u017f\u0003@ \u0000\u017b\u017c\u0007\b\u0000\u0000"+
		"\u017c\u017e\u0003@ \u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0181"+
		"\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180?\u0001\u0000\u0000\u0000\u0181\u017f\u0001"+
		"\u0000\u0000\u0000\u0182\u0187\u0003B!\u0000\u0183\u0184\u0007\t\u0000"+
		"\u0000\u0184\u0186\u0003B!\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186"+
		"\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0001\u0000\u0000\u0000\u0188A\u0001\u0000\u0000\u0000\u0189\u0187"+
		"\u0001\u0000\u0000\u0000\u018a\u018f\u0003D\"\u0000\u018b\u018c\u0007"+
		"\n\u0000\u0000\u018c\u018e\u0003D\"\u0000\u018d\u018b\u0001\u0000\u0000"+
		"\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190C\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u01a7\u0003F#\u0000\u0193\u019c"+
		"\u0005\u00f3\u0000\u0000\u0194\u0199\u00034\u001a\u0000\u0195\u0196\u0005"+
		"\u00f0\u0000\u0000\u0196\u0198\u00034\u001a\u0000\u0197\u0195\u0001\u0000"+
		"\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u0194\u0001\u0000"+
		"\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000"+
		"\u0000\u0000\u019e\u01a6\u0005\u00f4\u0000\u0000\u019f\u01a0\u0005\u00f1"+
		"\u0000\u0000\u01a0\u01a6\u0007\u000b\u0000\u0000\u01a1\u01a2\u0005\u00f7"+
		"\u0000\u0000\u01a2\u01a3\u00034\u001a\u0000\u01a3\u01a4\u0005\u00f8\u0000"+
		"\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u0193\u0001\u0000\u0000"+
		"\u0000\u01a5\u019f\u0001\u0000\u0000\u0000\u01a5\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8E\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01bc\u0005\u00c9\u0000\u0000"+
		"\u01ab\u01bc\u0005\u00cb\u0000\u0000\u01ac\u01bc\u0005\u0104\u0000\u0000"+
		"\u01ad\u01bc\u0005\u0092\u0000\u0000\u01ae\u01bc\u0005\u0093\u0000\u0000"+
		"\u01af\u01bc\u0005\u0094\u0000\u0000\u01b0\u01bc\u0005\u0095\u0000\u0000"+
		"\u01b1\u01bc\u0005\u0096\u0000\u0000\u01b2\u01bc\u0005\u0097\u0000\u0000"+
		"\u01b3\u01bc\u0005\u00b2\u0000\u0000\u01b4\u01bc\u0005\u00b3\u0000\u0000"+
		"\u01b5\u01b6\u0005\u00f3\u0000\u0000\u01b6\u01b7\u00034\u001a\u0000\u01b7"+
		"\u01b8\u0005\u00f4\u0000\u0000\u01b8\u01bc\u0001\u0000\u0000\u0000\u01b9"+
		"\u01bc\u0003H$\u0000\u01ba\u01bc\u0003J%\u0000\u01bb\u01aa\u0001\u0000"+
		"\u0000\u0000\u01bb\u01ab\u0001\u0000\u0000\u0000\u01bb\u01ac\u0001\u0000"+
		"\u0000\u0000\u01bb\u01ad\u0001\u0000\u0000\u0000\u01bb\u01ae\u0001\u0000"+
		"\u0000\u0000\u01bb\u01af\u0001\u0000\u0000\u0000\u01bb\u01b0\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b1\u0001\u0000\u0000\u0000\u01bb\u01b2\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b3\u0001\u0000\u0000\u0000\u01bb\u01b4\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b5\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000"+
		"\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bcG\u0001\u0000\u0000"+
		"\u0000\u01bd\u01c6\u0005\u00f7\u0000\u0000\u01be\u01c3\u00034\u001a\u0000"+
		"\u01bf\u01c0\u0005\u00f0\u0000\u0000\u01c0\u01c2\u00034\u001a\u0000\u01c1"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6"+
		"\u01be\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\u00f8\u0000\u0000\u01c9"+
		"I\u0001\u0000\u0000\u0000\u01ca\u01d7\u0005\u00ec\u0000\u0000\u01cb\u01cc"+
		"\u0005\u00c9\u0000\u0000\u01cc\u01cd\u0005\u00ee\u0000\u0000\u01cd\u01d4"+
		"\u00034\u001a\u0000\u01ce\u01cf\u0005\u00f0\u0000\u0000\u01cf\u01d0\u0005"+
		"\u00c9\u0000\u0000\u01d0\u01d1\u0005\u00ee\u0000\u0000\u01d1\u01d3\u0003"+
		"4\u001a\u0000\u01d2\u01ce\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d7\u01cb\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\u00ed"+
		"\u0000\u0000\u01daK\u0001\u0000\u0000\u0000,OQbhsw}\u007f\u0086\u0096"+
		"\u009d\u00a1\u00c6\u00cf\u00d2\u00e1\u00e7\u00f0\u0100\u010b\u0119\u0125"+
		"\u012f\u0134\u0141\u014b\u0153\u0156\u0160\u0167\u016f\u0177\u017f\u0187"+
		"\u018f\u0199\u019c\u01a5\u01a7\u01bb\u01c3\u01c6\u01d4\u01d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}