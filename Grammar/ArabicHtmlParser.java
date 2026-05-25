// Generated from ArabicHtmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArabicHtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CSS_OPEN=1, CSS_CLOSE=2, JS_OPEN=3, JS_CLOSE=4, DOC_OPEN=5, DOC_CLOSE=6, 
		HEAD_OPEN=7, HEAD_CLOSE=8, BODY_OPEN=9, BODY_CLOSE=10, CLOSE_TAG=11, OPEN_TAG=12, 
		SELF_CLOSE=13, TEXT=14, HTML_WS=15, CSS_CLOSE_TAG=16, CSS_WS=17, CSS_COMMENT=18, 
		CSS_DISPLAY=19, CSS_POSITION=20, CSS_WIDTH=21, CSS_HEIGHT=22, CSS_MAX_WIDTH=23, 
		CSS_MIN_WIDTH=24, CSS_MAX_HEIGHT=25, CSS_MIN_HEIGHT=26, CSS_MARGIN=27, 
		CSS_PADDING=28, CSS_BORDER=29, CSS_VISIBILITY=30, CSS_OVERFLOW=31, CSS_Z_INDEX=32, 
		CSS_BOX_SIZING=33, CSS_FLEX=34, CSS_FLEX_DIR=35, CSS_FLEX_WRAP=36, CSS_FLEX_GROW=37, 
		CSS_FLEX_SHRINK=38, CSS_GRID=39, CSS_GRID_TEMPLATE=40, CSS_GAP=41, CSS_JUSTIFY_CONT=42, 
		CSS_ALIGN_ITEMS=43, CSS_ALIGN_SELF=44, CSS_ORDER=45, CSS_COLOR=46, CSS_BACKGROUND=47, 
		CSS_BG_IMAGE=48, CSS_BG_COLOR=49, CSS_BG_SIZE=50, CSS_BG_REPEAT=51, CSS_BG_ATTACH=52, 
		CSS_BG_CLIP=53, CSS_OPACITY=54, CSS_BOX_SHADOW=55, CSS_FONT_FAMILY=56, 
		CSS_FONT_SIZE=57, CSS_FONT_WEIGHT=58, CSS_FONT_STYLE=59, CSS_TEXT_ALIGN=60, 
		CSS_TEXT_DECOR=61, CSS_TEXT_TRANS=62, CSS_TEXT_SHADOW=63, CSS_TEXT_INDENT=64, 
		CSS_LINE_HEIGHT=65, CSS_LETTER_SPACING=66, CSS_WORD_SPACING=67, CSS_WHITE_SPACE=68, 
		CSS_DIRECTION=69, CSS_WRITING_MODE=70, CSS_BORDER_RADIUS=71, CSS_BORDER_WIDTH=72, 
		CSS_BORDER_STYLE=73, CSS_BORDER_COLOR=74, CSS_OUTLINE=75, CSS_TOP=76, 
		CSS_BOTTOM=77, CSS_RIGHT=78, CSS_LEFT=79, CSS_MEDIA=80, CSS_LIST_STYLE=81, 
		CSS_BORDER_COLLAPSE=82, CSS_TABLE_LAYOUT=83, CSS_CAPTION_SIDE=84, CSS_FILTER=85, 
		CSS_BACKDROP_FILT=86, CSS_HOVER=87, CSS_ACTIVE=88, CSS_FOCUS=89, CSS_VISITED=90, 
		CSS_ENABLED=91, CSS_DISABLED=92, CSS_CHECKED=93, CSS_BEFORE=94, CSS_AFTER=95, 
		CSS_PLACEHOLDER=96, CSS_SELECTION=97, CSS_INHERIT=98, CSS_INITIAL=99, 
		CSS_UNSET=100, CSS_NONE=101, CSS_AUTO=102, CSS_CENTER=103, CSS_SOLID=104, 
		CSS_DASHED=105, CSS_DOTTED=106, CSS_DOUBLE=107, CSS_HIDDEN=108, CSS_BLOCK=109, 
		CSS_INLINE=110, CSS_FLEX_VALUE=111, CSS_ABSOLUTE=112, CSS_RELATIVE=113, 
		CSS_FIXED=114, CSS_STICKY=115, CSS_ROW=116, CSS_COLUMN=117, CSS_WRAP=118, 
		CSS_POINTER=119, CSS_BOLD=120, CSS_ITALIC=121, CSS_IMPORTANT=122, CSS_URL_FUNC=123, 
		CSS_RGB_FUNC=124, CSS_RGBA_FUNC=125, CSS_CALC_FUNC=126, CSS_VAR_FUNC=127, 
		CSS_ROTATE_FUNC=128, CSS_SCALE_FUNC=129, CSS_BLUR_FUNC=130, CSS_UNIT=131, 
		CSS_HEX_COLOR=132, CSS_NUMBER=133, CSS_STRING=134, CSS_LBRACE=135, CSS_RBRACE=136, 
		CSS_COLON=137, CSS_SEMI=138, CSS_COMMA=139, CSS_DOT=140, CSS_HASH=141, 
		CSS_LPAREN=142, CSS_RPAREN=143, CSS_GT=144, CSS_TILDE=145, CSS_DBL_COLON=146, 
		CSS_IDENTIFIER=147, JS_CLOSE_TAG=148, JS_WS=149, JS_COMMENT=150, JS_LINE_COMMENT=151, 
		JS_VAR=152, JS_LET=153, JS_CONST=154, JS_ARRAY_KW=155, JS_STRING_KW=156, 
		JS_NUMBER_KW=157, JS_BOOLEAN_KW=158, JS_SYMBOL_KW=159, JS_MAP_KW=160, 
		JS_SET_KW=161, JS_DATE_KW=162, JS_OBJECT_KW=163, JS_IF=164, JS_ELSE=165, 
		JS_SWITCH=166, JS_CASE=167, JS_DEFAULT=168, JS_FOR=169, JS_WHILE=170, 
		JS_DO=171, JS_BREAK=172, JS_CONTINUE=173, JS_OF=174, JS_IN=175, JS_FUNCTION=176, 
		JS_RETURN=177, JS_TRUE=178, JS_FALSE=179, JS_NULL=180, JS_UNDEFINED=181, 
		JS_THIS=182, JS_NAN=183, JS_INFINITY=184, JS_TRY=185, JS_CATCH=186, JS_FINALLY=187, 
		JS_THROW=188, JS_EXCEPTION=189, JS_NEW=190, JS_CLASS=191, JS_EXTENDS=192, 
		JS_SUPER=193, JS_IMPLEMENTS=194, JS_INTERFACE=195, JS_CONSTRUCTOR=196, 
		JS_PRIVATE=197, JS_PROTECTED=198, JS_PUBLIC=199, JS_STATIC=200, JS_ENUM=201, 
		JS_PACKAGE=202, JS_IMPORT=203, JS_EXPORT=204, JS_FROM=205, JS_AS=206, 
		JS_TYPEOF=207, JS_INSTANCEOF=208, JS_DELETE=209, JS_DOCUMENT=210, JS_WINDOW=211, 
		JS_CONSOLE=212, JS_EVENT=213, JS_NODE=214, JS_ELEMENT=215, JS_LISTENER=216, 
		JS_LOCAL_STORAGE=217, JS_SESSION_STORAGE=218, JS_GET_ELEMENT=219, JS_GET_ELEMENTS=220, 
		JS_CREATE_EL=221, JS_INNER_TEXT=222, JS_INNER_HTML=223, JS_STYLE=224, 
		JS_ADD_LISTENER=225, JS_ON_CLICK=226, JS_ON_SUBMIT=227, JS_ON_CHANGE=228, 
		JS_ON_LOAD=229, JS_LOG=230, JS_ALERT=231, JS_PROMPT=232, JS_INC=233, JS_DEC=234, 
		JS_EXP=235, JS_EXP_ASSIGN=236, JS_ADD_ASSIGN=237, JS_SUB_ASSIGN=238, JS_MUL_ASSIGN=239, 
		JS_DIV_ASSIGN=240, JS_MOD_ASSIGN=241, JS_AND_ASSIGN=242, JS_OR_ASSIGN=243, 
		JS_NULL_ASSIGN=244, JS_ASSIGN=245, JS_STREQ=246, JS_STRNEQ=247, JS_EQ=248, 
		JS_NEQ=249, JS_GTE=250, JS_LTE=251, JS_AND=252, JS_OR=253, JS_NULL_COAL=254, 
		JS_URSH=255, JS_LSH=256, JS_RSH=257, JS_BIT_AND=258, JS_BIT_OR=259, JS_BIT_XOR=260, 
		JS_QUESTION=261, JS_ARROW=262, JS_SPREAD=263, JS_NUMBER=264, JS_STRING=265, 
		JS_LBRACE=266, JS_RBRACE=267, JS_LPAREN=268, JS_RPAREN=269, JS_LBRACK=270, 
		JS_RBRACK=271, JS_SEMI=272, JS_COMMA=273, JS_DOT=274, JS_COLON=275, JS_PLUS=276, 
		JS_MINUS=277, JS_STAR=278, JS_SLASH=279, JS_PERCENT=280, JS_LT=281, JS_GT=282, 
		JS_BANG=283, JS_IDENTIFIER=284;
	public static final int
		RULE_program = 0, RULE_document = 1, RULE_head = 2, RULE_body = 3, RULE_htmlElement = 4, 
		RULE_openTag = 5, RULE_closeTag = 6, RULE_content = 7, RULE_cssBlock = 8, 
		RULE_cssRule = 9, RULE_mediaRule = 10, RULE_cssSelector = 11, RULE_simpleSelectorList = 12, 
		RULE_simpleSelector = 13, RULE_combinator = 14, RULE_pseudoSelector = 15, 
		RULE_pseudoClass = 16, RULE_pseudoElement = 17, RULE_cssDeclaration = 18, 
		RULE_cssProperty = 19, RULE_cssValue = 20, RULE_cssKeyword = 21, RULE_cssFunction = 22, 
		RULE_cssCalcExpr = 23, RULE_cssCalcTerm = 24, RULE_jsBlock = 25, RULE_jsStatement = 26, 
		RULE_varDeclaration = 27, RULE_varKeyword = 28, RULE_functionDeclaration = 29, 
		RULE_parameterList = 30, RULE_jsBody = 31, RULE_classDeclaration = 32, 
		RULE_classMember = 33, RULE_accessModifier = 34, RULE_returnStatement = 35, 
		RULE_ifStatement = 36, RULE_switchStatement = 37, RULE_switchCase = 38, 
		RULE_defaultCase = 39, RULE_forStatement = 40, RULE_forInit = 41, RULE_whileStatement = 42, 
		RULE_doWhileStatement = 43, RULE_tryCatchStatement = 44, RULE_throwStatement = 45, 
		RULE_importStatement = 46, RULE_importClause = 47, RULE_exportStatement = 48, 
		RULE_expressionStatement = 49, RULE_expression = 50, RULE_assignmentExpr = 51, 
		RULE_assignOp = 52, RULE_ternaryExpr = 53, RULE_logicalOrExpr = 54, RULE_logicalAndExpr = 55, 
		RULE_nullCoalesceExpr = 56, RULE_bitwiseOrExpr = 57, RULE_bitwiseXorExpr = 58, 
		RULE_bitwiseAndExpr = 59, RULE_equalityExpr = 60, RULE_relationalExpr = 61, 
		RULE_shiftExpr = 62, RULE_addExpr = 63, RULE_mulExpr = 64, RULE_expExpr = 65, 
		RULE_unaryExpr = 66, RULE_postfixExpr = 67, RULE_callExpr = 68, RULE_callSuffix = 69, 
		RULE_memberExpr = 70, RULE_argumentList = 71, RULE_primaryExpr = 72, RULE_literal = 73, 
		RULE_arrayLiteral = 74, RULE_objectLiteral = 75, RULE_objectProperty = 76, 
		RULE_arrowFunction = 77, RULE_arrowParams = 78, RULE_domExpression = 79, 
		RULE_domMethod = 80, RULE_consoleExpression = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "document", "head", "body", "htmlElement", "openTag", "closeTag", 
			"content", "cssBlock", "cssRule", "mediaRule", "cssSelector", "simpleSelectorList", 
			"simpleSelector", "combinator", "pseudoSelector", "pseudoClass", "pseudoElement", 
			"cssDeclaration", "cssProperty", "cssValue", "cssKeyword", "cssFunction", 
			"cssCalcExpr", "cssCalcTerm", "jsBlock", "jsStatement", "varDeclaration", 
			"varKeyword", "functionDeclaration", "parameterList", "jsBody", "classDeclaration", 
			"classMember", "accessModifier", "returnStatement", "ifStatement", "switchStatement", 
			"switchCase", "defaultCase", "forStatement", "forInit", "whileStatement", 
			"doWhileStatement", "tryCatchStatement", "throwStatement", "importStatement", 
			"importClause", "exportStatement", "expressionStatement", "expression", 
			"assignmentExpr", "assignOp", "ternaryExpr", "logicalOrExpr", "logicalAndExpr", 
			"nullCoalesceExpr", "bitwiseOrExpr", "bitwiseXorExpr", "bitwiseAndExpr", 
			"equalityExpr", "relationalExpr", "shiftExpr", "addExpr", "mulExpr", 
			"expExpr", "unaryExpr", "postfixExpr", "callExpr", "callSuffix", "memberExpr", 
			"argumentList", "primaryExpr", "literal", "arrayLiteral", "objectLiteral", 
			"objectProperty", "arrowFunction", "arrowParams", "domExpression", "domMethod", 
			"consoleExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<\\u0646\\u0645\\u0637>'", null, "'<\\u0633\\u0643\\u0631\\u064A\\u0628\\u062A>'", 
			null, "'<\\u0648\\u062B\\u064A\\u0642\\u0629>'", "'</\\u0648\\u062B\\u064A\\u0642\\u0629>'", 
			"'<\\u0631\\u0623\\u0633>'", "'</\\u0631\\u0623\\u0633>'", "'<\\u062C\\u0633\\u0645>'", 
			"'</\\u062C\\u0633\\u0645>'", null, null, null, null, null, null, null, 
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
			"'\\u0646\\u0633\\u0628\\u064A'", "'\\u0645\\u062B\\u0628\\u062A'", "'\\u0644\\u0627\\u0635\\u0642'", 
			"'\\u0633\\u0637\\u0631'", "'\\u0639\\u0645\\u0648\\u062F'", "'\\u0644\\u0641'", 
			"'\\u0645\\u0624\\u0634\\u0631'", "'\\u0639\\u0631\\u064A\\u0636'", "'\\u0645\\u0627\\u0626\\u0644'", 
			"'\\u0647\\u0627\\u0645'", "'\\u0631\\u0627\\u0628\\u0637'", "'\\u0646\\u0638\\u0627\\u0645-\\u0631_\\u062C_\\u0628'", 
			"'\\u0646\\u0638\\u0627\\u0645-\\u0631_\\u062C_\\u0628_\\u0627'", "'\\u062D\\u0633\\u0627\\u0628'", 
			"'\\u062F\\u0627\\u0644\\u0629_\\u0645\\u062A\\u063A\\u064A\\u0631'", 
			"'\\u062A\\u062F\\u0648\\u064A\\u0631'", "'\\u062A\\u0643\\u0628\\u064A\\u0631'", 
			"'\\u062A\\u063A\\u0628\\u064A\\u0634'", null, null, null, null, null, 
			null, null, "'\\u061B'", "'\\u060C'", null, "'#'", null, null, null, 
			"'~'", "'::'", null, null, null, null, null, "'\\u0645\\u062A\\u063A\\u064A\\u0631'", 
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
			"'<<'", "'>>'", "'&'", "'|'", "'^'", "'?'", "'=>'", "'...'", null, null, 
			null, null, null, null, "'['", "']'", null, null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'<'", null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CSS_OPEN", "CSS_CLOSE", "JS_OPEN", "JS_CLOSE", "DOC_OPEN", "DOC_CLOSE", 
			"HEAD_OPEN", "HEAD_CLOSE", "BODY_OPEN", "BODY_CLOSE", "CLOSE_TAG", "OPEN_TAG", 
			"SELF_CLOSE", "TEXT", "HTML_WS", "CSS_CLOSE_TAG", "CSS_WS", "CSS_COMMENT", 
			"CSS_DISPLAY", "CSS_POSITION", "CSS_WIDTH", "CSS_HEIGHT", "CSS_MAX_WIDTH", 
			"CSS_MIN_WIDTH", "CSS_MAX_HEIGHT", "CSS_MIN_HEIGHT", "CSS_MARGIN", "CSS_PADDING", 
			"CSS_BORDER", "CSS_VISIBILITY", "CSS_OVERFLOW", "CSS_Z_INDEX", "CSS_BOX_SIZING", 
			"CSS_FLEX", "CSS_FLEX_DIR", "CSS_FLEX_WRAP", "CSS_FLEX_GROW", "CSS_FLEX_SHRINK", 
			"CSS_GRID", "CSS_GRID_TEMPLATE", "CSS_GAP", "CSS_JUSTIFY_CONT", "CSS_ALIGN_ITEMS", 
			"CSS_ALIGN_SELF", "CSS_ORDER", "CSS_COLOR", "CSS_BACKGROUND", "CSS_BG_IMAGE", 
			"CSS_BG_COLOR", "CSS_BG_SIZE", "CSS_BG_REPEAT", "CSS_BG_ATTACH", "CSS_BG_CLIP", 
			"CSS_OPACITY", "CSS_BOX_SHADOW", "CSS_FONT_FAMILY", "CSS_FONT_SIZE", 
			"CSS_FONT_WEIGHT", "CSS_FONT_STYLE", "CSS_TEXT_ALIGN", "CSS_TEXT_DECOR", 
			"CSS_TEXT_TRANS", "CSS_TEXT_SHADOW", "CSS_TEXT_INDENT", "CSS_LINE_HEIGHT", 
			"CSS_LETTER_SPACING", "CSS_WORD_SPACING", "CSS_WHITE_SPACE", "CSS_DIRECTION", 
			"CSS_WRITING_MODE", "CSS_BORDER_RADIUS", "CSS_BORDER_WIDTH", "CSS_BORDER_STYLE", 
			"CSS_BORDER_COLOR", "CSS_OUTLINE", "CSS_TOP", "CSS_BOTTOM", "CSS_RIGHT", 
			"CSS_LEFT", "CSS_MEDIA", "CSS_LIST_STYLE", "CSS_BORDER_COLLAPSE", "CSS_TABLE_LAYOUT", 
			"CSS_CAPTION_SIDE", "CSS_FILTER", "CSS_BACKDROP_FILT", "CSS_HOVER", "CSS_ACTIVE", 
			"CSS_FOCUS", "CSS_VISITED", "CSS_ENABLED", "CSS_DISABLED", "CSS_CHECKED", 
			"CSS_BEFORE", "CSS_AFTER", "CSS_PLACEHOLDER", "CSS_SELECTION", "CSS_INHERIT", 
			"CSS_INITIAL", "CSS_UNSET", "CSS_NONE", "CSS_AUTO", "CSS_CENTER", "CSS_SOLID", 
			"CSS_DASHED", "CSS_DOTTED", "CSS_DOUBLE", "CSS_HIDDEN", "CSS_BLOCK", 
			"CSS_INLINE", "CSS_FLEX_VALUE", "CSS_ABSOLUTE", "CSS_RELATIVE", "CSS_FIXED", 
			"CSS_STICKY", "CSS_ROW", "CSS_COLUMN", "CSS_WRAP", "CSS_POINTER", "CSS_BOLD", 
			"CSS_ITALIC", "CSS_IMPORTANT", "CSS_URL_FUNC", "CSS_RGB_FUNC", "CSS_RGBA_FUNC", 
			"CSS_CALC_FUNC", "CSS_VAR_FUNC", "CSS_ROTATE_FUNC", "CSS_SCALE_FUNC", 
			"CSS_BLUR_FUNC", "CSS_UNIT", "CSS_HEX_COLOR", "CSS_NUMBER", "CSS_STRING", 
			"CSS_LBRACE", "CSS_RBRACE", "CSS_COLON", "CSS_SEMI", "CSS_COMMA", "CSS_DOT", 
			"CSS_HASH", "CSS_LPAREN", "CSS_RPAREN", "CSS_GT", "CSS_TILDE", "CSS_DBL_COLON", 
			"CSS_IDENTIFIER", "JS_CLOSE_TAG", "JS_WS", "JS_COMMENT", "JS_LINE_COMMENT", 
			"JS_VAR", "JS_LET", "JS_CONST", "JS_ARRAY_KW", "JS_STRING_KW", "JS_NUMBER_KW", 
			"JS_BOOLEAN_KW", "JS_SYMBOL_KW", "JS_MAP_KW", "JS_SET_KW", "JS_DATE_KW", 
			"JS_OBJECT_KW", "JS_IF", "JS_ELSE", "JS_SWITCH", "JS_CASE", "JS_DEFAULT", 
			"JS_FOR", "JS_WHILE", "JS_DO", "JS_BREAK", "JS_CONTINUE", "JS_OF", "JS_IN", 
			"JS_FUNCTION", "JS_RETURN", "JS_TRUE", "JS_FALSE", "JS_NULL", "JS_UNDEFINED", 
			"JS_THIS", "JS_NAN", "JS_INFINITY", "JS_TRY", "JS_CATCH", "JS_FINALLY", 
			"JS_THROW", "JS_EXCEPTION", "JS_NEW", "JS_CLASS", "JS_EXTENDS", "JS_SUPER", 
			"JS_IMPLEMENTS", "JS_INTERFACE", "JS_CONSTRUCTOR", "JS_PRIVATE", "JS_PROTECTED", 
			"JS_PUBLIC", "JS_STATIC", "JS_ENUM", "JS_PACKAGE", "JS_IMPORT", "JS_EXPORT", 
			"JS_FROM", "JS_AS", "JS_TYPEOF", "JS_INSTANCEOF", "JS_DELETE", "JS_DOCUMENT", 
			"JS_WINDOW", "JS_CONSOLE", "JS_EVENT", "JS_NODE", "JS_ELEMENT", "JS_LISTENER", 
			"JS_LOCAL_STORAGE", "JS_SESSION_STORAGE", "JS_GET_ELEMENT", "JS_GET_ELEMENTS", 
			"JS_CREATE_EL", "JS_INNER_TEXT", "JS_INNER_HTML", "JS_STYLE", "JS_ADD_LISTENER", 
			"JS_ON_CLICK", "JS_ON_SUBMIT", "JS_ON_CHANGE", "JS_ON_LOAD", "JS_LOG", 
			"JS_ALERT", "JS_PROMPT", "JS_INC", "JS_DEC", "JS_EXP", "JS_EXP_ASSIGN", 
			"JS_ADD_ASSIGN", "JS_SUB_ASSIGN", "JS_MUL_ASSIGN", "JS_DIV_ASSIGN", "JS_MOD_ASSIGN", 
			"JS_AND_ASSIGN", "JS_OR_ASSIGN", "JS_NULL_ASSIGN", "JS_ASSIGN", "JS_STREQ", 
			"JS_STRNEQ", "JS_EQ", "JS_NEQ", "JS_GTE", "JS_LTE", "JS_AND", "JS_OR", 
			"JS_NULL_COAL", "JS_URSH", "JS_LSH", "JS_RSH", "JS_BIT_AND", "JS_BIT_OR", 
			"JS_BIT_XOR", "JS_QUESTION", "JS_ARROW", "JS_SPREAD", "JS_NUMBER", "JS_STRING", 
			"JS_LBRACE", "JS_RBRACE", "JS_LPAREN", "JS_RPAREN", "JS_LBRACK", "JS_RBRACK", 
			"JS_SEMI", "JS_COMMA", "JS_DOT", "JS_COLON", "JS_PLUS", "JS_MINUS", "JS_STAR", 
			"JS_SLASH", "JS_PERCENT", "JS_LT", "JS_GT", "JS_BANG", "JS_IDENTIFIER"
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
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArabicHtmlParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			document();
			setState(165);
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
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode DOC_OPEN() { return getToken(ArabicHtmlParser.DOC_OPEN, 0); }
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOC_CLOSE() { return getToken(ArabicHtmlParser.DOC_CLOSE, 0); }
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(DOC_OPEN);
			setState(168);
			head();
			setState(169);
			body();
			setState(170);
			match(DOC_CLOSE);
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
	public static class HeadContext extends ParserRuleContext {
		public TerminalNode HEAD_OPEN() { return getToken(ArabicHtmlParser.HEAD_OPEN, 0); }
		public TerminalNode HEAD_CLOSE() { return getToken(ArabicHtmlParser.HEAD_CLOSE, 0); }
		public List<CssBlockContext> cssBlock() {
			return getRuleContexts(CssBlockContext.class);
		}
		public CssBlockContext cssBlock(int i) {
			return getRuleContext(CssBlockContext.class,i);
		}
		public List<JsBlockContext> jsBlock() {
			return getRuleContexts(JsBlockContext.class);
		}
		public JsBlockContext jsBlock(int i) {
			return getRuleContext(JsBlockContext.class,i);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(HEAD_OPEN);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_OPEN || _la==JS_OPEN) {
				{
				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_OPEN:
					{
					setState(173);
					cssBlock();
					}
					break;
				case JS_OPEN:
					{
					setState(174);
					jsBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(HEAD_CLOSE);
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
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY_OPEN() { return getToken(ArabicHtmlParser.BODY_OPEN, 0); }
		public TerminalNode BODY_CLOSE() { return getToken(ArabicHtmlParser.BODY_CLOSE, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(BODY_OPEN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_TAG || _la==SELF_CLOSE) {
				{
				{
				setState(183);
				htmlElement();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(BODY_CLOSE);
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
		public TerminalNode SELF_CLOSE() { return getToken(ArabicHtmlParser.SELF_CLOSE, 0); }
		public SelfClosingElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitSelfClosingElement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentElementContext extends HtmlElementContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ParentElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterParentElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitParentElement(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlElement);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
				_localctx = new ParentElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				openTag();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) {
					{
					{
					setState(192);
					content();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				closeTag();
				}
				break;
			case SELF_CLOSE:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
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
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(ArabicHtmlParser.OPEN_TAG, 0); }
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitOpenTag(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_openTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(OPEN_TAG);
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
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode CLOSE_TAG() { return getToken(ArabicHtmlParser.CLOSE_TAG, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCloseTag(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
	public static class ContentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(ArabicHtmlParser.TEXT, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_content);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
			case SELF_CLOSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				htmlElement();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
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
	public static class CssBlockContext extends ParserRuleContext {
		public TerminalNode CSS_OPEN() { return getToken(ArabicHtmlParser.CSS_OPEN, 0); }
		public TerminalNode CSS_CLOSE_TAG() { return getToken(ArabicHtmlParser.CSS_CLOSE_TAG, 0); }
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCssBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCssBlock(this);
		}
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CSS_OPEN);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 3602879701896396801L) != 0) || _la==CSS_DBL_COLON || _la==CSS_IDENTIFIER) {
				{
				{
				setState(212);
				cssRule();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(CSS_CLOSE_TAG);
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
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
	 
		public CssRuleContext() { }
		public void copyFrom(CssRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaRuleItemContext extends CssRuleContext {
		public MediaRuleContext mediaRule() {
			return getRuleContext(MediaRuleContext.class,0);
		}
		public MediaRuleItemContext(CssRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterMediaRuleItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitMediaRuleItem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularRuleContext extends CssRuleContext {
		public TerminalNode CSS_LBRACE() { return getToken(ArabicHtmlParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(ArabicHtmlParser.CSS_RBRACE, 0); }
		public List<CssSelectorContext> cssSelector() {
			return getRuleContexts(CssSelectorContext.class);
		}
		public CssSelectorContext cssSelector(int i) {
			return getRuleContext(CssSelectorContext.class,i);
		}
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public RegularRuleContext(CssRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterRegularRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitRegularRule(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cssRule);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_COLON:
			case CSS_DOT:
			case CSS_HASH:
			case CSS_DBL_COLON:
			case CSS_IDENTIFIER:
				_localctx = new RegularRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					cssSelector();
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 1561L) != 0) );
				setState(225);
				match(CSS_LBRACE);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -524288L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8323071L) != 0)) {
					{
					{
					setState(226);
					cssDeclaration();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(CSS_RBRACE);
				}
				break;
			case CSS_MEDIA:
				_localctx = new MediaRuleItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
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
		public TerminalNode CSS_MEDIA() { return getToken(ArabicHtmlParser.CSS_MEDIA, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(ArabicHtmlParser.CSS_LPAREN, 0); }
		public CssDeclarationContext cssDeclaration() {
			return getRuleContext(CssDeclarationContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(ArabicHtmlParser.CSS_RPAREN, 0); }
		public TerminalNode CSS_LBRACE() { return getToken(ArabicHtmlParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(ArabicHtmlParser.CSS_RBRACE, 0); }
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public MediaRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterMediaRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitMediaRule(this);
		}
	}

	public final MediaRuleContext mediaRule() throws RecognitionException {
		MediaRuleContext _localctx = new MediaRuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mediaRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(CSS_MEDIA);
			setState(238);
			match(CSS_LPAREN);
			setState(239);
			cssDeclaration();
			setState(240);
			match(CSS_RPAREN);
			setState(241);
			match(CSS_LBRACE);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 3602879701896396801L) != 0) || _la==CSS_DBL_COLON || _la==CSS_IDENTIFIER) {
				{
				{
				setState(242);
				cssRule();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(CSS_RBRACE);
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
	public static class CssSelectorContext extends ParserRuleContext {
		public List<SimpleSelectorListContext> simpleSelectorList() {
			return getRuleContexts(SimpleSelectorListContext.class);
		}
		public SimpleSelectorListContext simpleSelectorList(int i) {
			return getRuleContext(SimpleSelectorListContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCssSelector(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			simpleSelectorList();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_GT || _la==CSS_TILDE) {
				{
				{
				setState(251);
				combinator();
				setState(252);
				simpleSelectorList();
				}
				}
				setState(258);
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
	public static class SimpleSelectorListContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public SimpleSelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterSimpleSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitSimpleSelectorList(this);
		}
	}

	public final SimpleSelectorListContext simpleSelectorList() throws RecognitionException {
		SimpleSelectorListContext _localctx = new SimpleSelectorListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleSelectorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(259);
					simpleSelector();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(262); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	 
		public SimpleSelectorContext() { }
		public void copyFrom(SimpleSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends SimpleSelectorContext {
		public TerminalNode CSS_IDENTIFIER() { return getToken(ArabicHtmlParser.CSS_IDENTIFIER, 0); }
		public TypeSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitTypeSelector(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends SimpleSelectorContext {
		public TerminalNode CSS_HASH() { return getToken(ArabicHtmlParser.CSS_HASH, 0); }
		public TerminalNode CSS_IDENTIFIER() { return getToken(ArabicHtmlParser.CSS_IDENTIFIER, 0); }
		public IdSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitIdSelector(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoSelContext extends SimpleSelectorContext {
		public PseudoSelectorContext pseudoSelector() {
			return getRuleContext(PseudoSelectorContext.class,0);
		}
		public PseudoSelContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterPseudoSel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitPseudoSel(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends SimpleSelectorContext {
		public TerminalNode CSS_DOT() { return getToken(ArabicHtmlParser.CSS_DOT, 0); }
		public TerminalNode CSS_IDENTIFIER() { return getToken(ArabicHtmlParser.CSS_IDENTIFIER, 0); }
		public ClassSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitClassSelector(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpleSelector);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENTIFIER:
				_localctx = new TypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(CSS_IDENTIFIER);
				}
				break;
			case CSS_DOT:
				_localctx = new ClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(CSS_DOT);
				setState(266);
				match(CSS_IDENTIFIER);
				}
				break;
			case CSS_HASH:
				_localctx = new IdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(CSS_HASH);
				setState(268);
				match(CSS_IDENTIFIER);
				}
				break;
			case CSS_COLON:
			case CSS_DBL_COLON:
				_localctx = new PseudoSelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				pseudoSelector();
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
	public static class CombinatorContext extends ParserRuleContext {
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
	 
		public CombinatorContext() { }
		public void copyFrom(CombinatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildCombinatorContext extends CombinatorContext {
		public TerminalNode CSS_GT() { return getToken(ArabicHtmlParser.CSS_GT, 0); }
		public ChildCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterChildCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitChildCombinator(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SiblingCombinatorContext extends CombinatorContext {
		public TerminalNode CSS_TILDE() { return getToken(ArabicHtmlParser.CSS_TILDE, 0); }
		public SiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitSiblingCombinator(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_combinator);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_GT:
				_localctx = new ChildCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(CSS_GT);
				}
				break;
			case CSS_TILDE:
				_localctx = new SiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(CSS_TILDE);
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
	public static class PseudoSelectorContext extends ParserRuleContext {
		public TerminalNode CSS_COLON() { return getToken(ArabicHtmlParser.CSS_COLON, 0); }
		public PseudoClassContext pseudoClass() {
			return getRuleContext(PseudoClassContext.class,0);
		}
		public TerminalNode CSS_DBL_COLON() { return getToken(ArabicHtmlParser.CSS_DBL_COLON, 0); }
		public PseudoElementContext pseudoElement() {
			return getRuleContext(PseudoElementContext.class,0);
		}
		public PseudoSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterPseudoSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitPseudoSelector(this);
		}
	}

	public final PseudoSelectorContext pseudoSelector() throws RecognitionException {
		PseudoSelectorContext _localctx = new PseudoSelectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pseudoSelector);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(CSS_COLON);
				setState(277);
				pseudoClass();
				}
				break;
			case CSS_DBL_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(CSS_DBL_COLON);
				setState(279);
				pseudoElement();
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
		public TerminalNode CSS_HOVER() { return getToken(ArabicHtmlParser.CSS_HOVER, 0); }
		public TerminalNode CSS_ACTIVE() { return getToken(ArabicHtmlParser.CSS_ACTIVE, 0); }
		public TerminalNode CSS_FOCUS() { return getToken(ArabicHtmlParser.CSS_FOCUS, 0); }
		public TerminalNode CSS_VISITED() { return getToken(ArabicHtmlParser.CSS_VISITED, 0); }
		public TerminalNode CSS_ENABLED() { return getToken(ArabicHtmlParser.CSS_ENABLED, 0); }
		public TerminalNode CSS_DISABLED() { return getToken(ArabicHtmlParser.CSS_DISABLED, 0); }
		public TerminalNode CSS_CHECKED() { return getToken(ArabicHtmlParser.CSS_CHECKED, 0); }
		public PseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitPseudoClass(this);
		}
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pseudoClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 127L) != 0)) ) {
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
		public TerminalNode CSS_BEFORE() { return getToken(ArabicHtmlParser.CSS_BEFORE, 0); }
		public TerminalNode CSS_AFTER() { return getToken(ArabicHtmlParser.CSS_AFTER, 0); }
		public TerminalNode CSS_PLACEHOLDER() { return getToken(ArabicHtmlParser.CSS_PLACEHOLDER, 0); }
		public TerminalNode CSS_SELECTION() { return getToken(ArabicHtmlParser.CSS_SELECTION, 0); }
		public PseudoElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterPseudoElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitPseudoElement(this);
		}
	}

	public final PseudoElementContext pseudoElement() throws RecognitionException {
		PseudoElementContext _localctx = new PseudoElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pseudoElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 15L) != 0)) ) {
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
	public static class CssDeclarationContext extends ParserRuleContext {
		public CssPropertyContext cssProperty() {
			return getRuleContext(CssPropertyContext.class,0);
		}
		public TerminalNode CSS_COLON() { return getToken(ArabicHtmlParser.CSS_COLON, 0); }
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public TerminalNode CSS_SEMI() { return getToken(ArabicHtmlParser.CSS_SEMI, 0); }
		public List<TerminalNode> CSS_COMMA() { return getTokens(ArabicHtmlParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(ArabicHtmlParser.CSS_COMMA, i);
		}
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCssDeclaration(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cssDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			cssProperty();
			setState(287);
			match(CSS_COLON);
			setState(288);
			cssValue();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(289);
				match(CSS_COMMA);
				setState(290);
				cssValue();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(CSS_SEMI);
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
		public TerminalNode CSS_TOP() { return getToken(ArabicHtmlParser.CSS_TOP, 0); }
		public TerminalNode CSS_BOTTOM() { return getToken(ArabicHtmlParser.CSS_BOTTOM, 0); }
		public TerminalNode CSS_RIGHT() { return getToken(ArabicHtmlParser.CSS_RIGHT, 0); }
		public TerminalNode CSS_LEFT() { return getToken(ArabicHtmlParser.CSS_LEFT, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCssProperty(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -524288L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8323071L) != 0)) ) {
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
		public TerminalNode CSS_UNIT() { return getToken(ArabicHtmlParser.CSS_UNIT, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(ArabicHtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_HEX_COLOR() { return getToken(ArabicHtmlParser.CSS_HEX_COLOR, 0); }
		public TerminalNode CSS_STRING() { return getToken(ArabicHtmlParser.CSS_STRING, 0); }
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public TerminalNode CSS_IDENTIFIER() { return getToken(ArabicHtmlParser.CSS_IDENTIFIER, 0); }
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCssValue(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cssValue);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_UNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(CSS_UNIT);
				}
				break;
			case CSS_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(CSS_NUMBER);
				}
				break;
			case CSS_HEX_COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(CSS_HEX_COLOR);
				}
				break;
			case CSS_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(CSS_STRING);
				}
				break;
			case CSS_INHERIT:
			case CSS_INITIAL:
			case CSS_UNSET:
			case CSS_NONE:
			case CSS_AUTO:
			case CSS_CENTER:
			case CSS_SOLID:
			case CSS_DASHED:
			case CSS_DOTTED:
			case CSS_DOUBLE:
			case CSS_HIDDEN:
			case CSS_BLOCK:
			case CSS_INLINE:
			case CSS_FLEX_VALUE:
			case CSS_ABSOLUTE:
			case CSS_RELATIVE:
			case CSS_FIXED:
			case CSS_STICKY:
			case CSS_ROW:
			case CSS_COLUMN:
			case CSS_WRAP:
			case CSS_POINTER:
			case CSS_BOLD:
			case CSS_ITALIC:
			case CSS_IMPORTANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				cssKeyword();
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
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				cssFunction();
				}
				break;
			case CSS_IDENTIFIER:
				enterOuterAlt(_localctx, 7);
				{
				setState(306);
				match(CSS_IDENTIFIER);
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
	public static class CssKeywordContext extends ParserRuleContext {
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
		public TerminalNode CSS_POINTER() { return getToken(ArabicHtmlParser.CSS_POINTER, 0); }
		public TerminalNode CSS_BOLD() { return getToken(ArabicHtmlParser.CSS_BOLD, 0); }
		public TerminalNode CSS_ITALIC() { return getToken(ArabicHtmlParser.CSS_ITALIC, 0); }
		public TerminalNode CSS_INHERIT() { return getToken(ArabicHtmlParser.CSS_INHERIT, 0); }
		public TerminalNode CSS_INITIAL() { return getToken(ArabicHtmlParser.CSS_INITIAL, 0); }
		public TerminalNode CSS_UNSET() { return getToken(ArabicHtmlParser.CSS_UNSET, 0); }
		public TerminalNode CSS_IMPORTANT() { return getToken(ArabicHtmlParser.CSS_IMPORTANT, 0); }
		public CssKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCssKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCssKeyword(this);
		}
	}

	public final CssKeywordContext cssKeyword() throws RecognitionException {
		CssKeywordContext _localctx = new CssKeywordContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cssKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 33554431L) != 0)) ) {
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
	public static class CssFunctionContext extends ParserRuleContext {
		public TerminalNode CSS_RGB_FUNC() { return getToken(ArabicHtmlParser.CSS_RGB_FUNC, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(ArabicHtmlParser.CSS_LPAREN, 0); }
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public TerminalNode CSS_RPAREN() { return getToken(ArabicHtmlParser.CSS_RPAREN, 0); }
		public List<TerminalNode> CSS_COMMA() { return getTokens(ArabicHtmlParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(ArabicHtmlParser.CSS_COMMA, i);
		}
		public TerminalNode CSS_RGBA_FUNC() { return getToken(ArabicHtmlParser.CSS_RGBA_FUNC, 0); }
		public TerminalNode CSS_CALC_FUNC() { return getToken(ArabicHtmlParser.CSS_CALC_FUNC, 0); }
		public CssCalcExprContext cssCalcExpr() {
			return getRuleContext(CssCalcExprContext.class,0);
		}
		public TerminalNode CSS_VAR_FUNC() { return getToken(ArabicHtmlParser.CSS_VAR_FUNC, 0); }
		public TerminalNode CSS_IDENTIFIER() { return getToken(ArabicHtmlParser.CSS_IDENTIFIER, 0); }
		public TerminalNode CSS_URL_FUNC() { return getToken(ArabicHtmlParser.CSS_URL_FUNC, 0); }
		public TerminalNode CSS_STRING() { return getToken(ArabicHtmlParser.CSS_STRING, 0); }
		public TerminalNode CSS_ROTATE_FUNC() { return getToken(ArabicHtmlParser.CSS_ROTATE_FUNC, 0); }
		public TerminalNode CSS_SCALE_FUNC() { return getToken(ArabicHtmlParser.CSS_SCALE_FUNC, 0); }
		public TerminalNode CSS_BLUR_FUNC() { return getToken(ArabicHtmlParser.CSS_BLUR_FUNC, 0); }
		public CssFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCssFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCssFunction(this);
		}
	}

	public final CssFunctionContext cssFunction() throws RecognitionException {
		CssFunctionContext _localctx = new CssFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cssFunction);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_RGB_FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(CSS_RGB_FUNC);
				setState(312);
				match(CSS_LPAREN);
				setState(313);
				cssValue();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COMMA) {
					{
					{
					setState(314);
					match(CSS_COMMA);
					setState(315);
					cssValue();
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(CSS_RPAREN);
				}
				break;
			case CSS_RGBA_FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(CSS_RGBA_FUNC);
				setState(324);
				match(CSS_LPAREN);
				setState(325);
				cssValue();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COMMA) {
					{
					{
					setState(326);
					match(CSS_COMMA);
					setState(327);
					cssValue();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333);
				match(CSS_RPAREN);
				}
				break;
			case CSS_CALC_FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(CSS_CALC_FUNC);
				setState(336);
				match(CSS_LPAREN);
				setState(337);
				cssCalcExpr();
				setState(338);
				match(CSS_RPAREN);
				}
				break;
			case CSS_VAR_FUNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(CSS_VAR_FUNC);
				setState(341);
				match(CSS_LPAREN);
				setState(342);
				match(CSS_IDENTIFIER);
				setState(343);
				match(CSS_RPAREN);
				}
				break;
			case CSS_URL_FUNC:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				match(CSS_URL_FUNC);
				setState(345);
				match(CSS_LPAREN);
				setState(346);
				match(CSS_STRING);
				setState(347);
				match(CSS_RPAREN);
				}
				break;
			case CSS_ROTATE_FUNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(348);
				match(CSS_ROTATE_FUNC);
				setState(349);
				match(CSS_LPAREN);
				setState(350);
				cssValue();
				setState(351);
				match(CSS_RPAREN);
				}
				break;
			case CSS_SCALE_FUNC:
				enterOuterAlt(_localctx, 7);
				{
				setState(353);
				match(CSS_SCALE_FUNC);
				setState(354);
				match(CSS_LPAREN);
				setState(355);
				cssValue();
				setState(356);
				match(CSS_RPAREN);
				}
				break;
			case CSS_BLUR_FUNC:
				enterOuterAlt(_localctx, 8);
				{
				setState(358);
				match(CSS_BLUR_FUNC);
				setState(359);
				match(CSS_LPAREN);
				setState(360);
				cssValue();
				setState(361);
				match(CSS_RPAREN);
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
	public static class CssCalcExprContext extends ParserRuleContext {
		public List<CssCalcTermContext> cssCalcTerm() {
			return getRuleContexts(CssCalcTermContext.class);
		}
		public CssCalcTermContext cssCalcTerm(int i) {
			return getRuleContext(CssCalcTermContext.class,i);
		}
		public List<TerminalNode> JS_PLUS() { return getTokens(ArabicHtmlParser.JS_PLUS); }
		public TerminalNode JS_PLUS(int i) {
			return getToken(ArabicHtmlParser.JS_PLUS, i);
		}
		public List<TerminalNode> JS_MINUS() { return getTokens(ArabicHtmlParser.JS_MINUS); }
		public TerminalNode JS_MINUS(int i) {
			return getToken(ArabicHtmlParser.JS_MINUS, i);
		}
		public CssCalcExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssCalcExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCssCalcExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCssCalcExpr(this);
		}
	}

	public final CssCalcExprContext cssCalcExpr() throws RecognitionException {
		CssCalcExprContext _localctx = new CssCalcExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cssCalcExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			cssCalcTerm();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_PLUS || _la==JS_MINUS) {
				{
				{
				setState(366);
				_la = _input.LA(1);
				if ( !(_la==JS_PLUS || _la==JS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(367);
				cssCalcTerm();
				}
				}
				setState(372);
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
	public static class CssCalcTermContext extends ParserRuleContext {
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public List<TerminalNode> JS_STAR() { return getTokens(ArabicHtmlParser.JS_STAR); }
		public TerminalNode JS_STAR(int i) {
			return getToken(ArabicHtmlParser.JS_STAR, i);
		}
		public List<TerminalNode> JS_SLASH() { return getTokens(ArabicHtmlParser.JS_SLASH); }
		public TerminalNode JS_SLASH(int i) {
			return getToken(ArabicHtmlParser.JS_SLASH, i);
		}
		public CssCalcTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssCalcTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCssCalcTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCssCalcTerm(this);
		}
	}

	public final CssCalcTermContext cssCalcTerm() throws RecognitionException {
		CssCalcTermContext _localctx = new CssCalcTermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cssCalcTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			cssValue();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_STAR || _la==JS_SLASH) {
				{
				{
				setState(374);
				_la = _input.LA(1);
				if ( !(_la==JS_STAR || _la==JS_SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(375);
				cssValue();
				}
				}
				setState(380);
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
	public static class JsBlockContext extends ParserRuleContext {
		public TerminalNode JS_OPEN() { return getToken(ArabicHtmlParser.JS_OPEN, 0); }
		public TerminalNode JS_CLOSE_TAG() { return getToken(ArabicHtmlParser.JS_CLOSE_TAG, 0); }
		public List<JsStatementContext> jsStatement() {
			return getRuleContexts(JsStatementContext.class);
		}
		public JsStatementContext jsStatement(int i) {
			return getRuleContext(JsStatementContext.class,i);
		}
		public JsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterJsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitJsBlock(this);
		}
	}

	public final JsBlockContext jsBlock() throws RecognitionException {
		JsBlockContext _localctx = new JsBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(JS_OPEN);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 2204512928115085319L) != 0) || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & 3404274830671875L) != 0)) {
				{
				{
				setState(382);
				jsStatement();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
			match(JS_CLOSE_TAG);
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
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public JsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterJsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitJsStatement(this);
		}
	}

	public final JsStatementContext jsStatement() throws RecognitionException {
		JsStatementContext _localctx = new JsStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jsStatement);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_VAR:
			case JS_LET:
			case JS_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				varDeclaration();
				}
				break;
			case JS_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				functionDeclaration();
				}
				break;
			case JS_CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				classDeclaration();
				}
				break;
			case JS_RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				returnStatement();
				}
				break;
			case JS_IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
				ifStatement();
				}
				break;
			case JS_SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(395);
				switchStatement();
				}
				break;
			case JS_FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(396);
				forStatement();
				}
				break;
			case JS_WHILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(397);
				whileStatement();
				}
				break;
			case JS_DO:
				enterOuterAlt(_localctx, 9);
				{
				setState(398);
				doWhileStatement();
				}
				break;
			case JS_TRY:
				enterOuterAlt(_localctx, 10);
				{
				setState(399);
				tryCatchStatement();
				}
				break;
			case JS_THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(400);
				throwStatement();
				}
				break;
			case JS_IMPORT:
				enterOuterAlt(_localctx, 12);
				{
				setState(401);
				importStatement();
				}
				break;
			case JS_EXPORT:
				enterOuterAlt(_localctx, 13);
				{
				setState(402);
				exportStatement();
				}
				break;
			case JS_TRUE:
			case JS_FALSE:
			case JS_NULL:
			case JS_UNDEFINED:
			case JS_THIS:
			case JS_NAN:
			case JS_INFINITY:
			case JS_NEW:
			case JS_TYPEOF:
			case JS_DELETE:
			case JS_DOCUMENT:
			case JS_WINDOW:
			case JS_CONSOLE:
			case JS_INC:
			case JS_DEC:
			case JS_NUMBER:
			case JS_STRING:
			case JS_LBRACE:
			case JS_LPAREN:
			case JS_LBRACK:
			case JS_PLUS:
			case JS_MINUS:
			case JS_BANG:
			case JS_IDENTIFIER:
				enterOuterAlt(_localctx, 14);
				{
				setState(403);
				expressionStatement();
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarKeywordContext varKeyword() {
			return getRuleContext(VarKeywordContext.class,0);
		}
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public TerminalNode JS_SEMI() { return getToken(ArabicHtmlParser.JS_SEMI, 0); }
		public TerminalNode JS_ASSIGN() { return getToken(ArabicHtmlParser.JS_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			varKeyword();
			setState(407);
			match(JS_IDENTIFIER);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_ASSIGN) {
				{
				setState(408);
				match(JS_ASSIGN);
				setState(409);
				expression();
				}
			}

			setState(412);
			match(JS_SEMI);
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
	public static class VarKeywordContext extends ParserRuleContext {
		public TerminalNode JS_VAR() { return getToken(ArabicHtmlParser.JS_VAR, 0); }
		public TerminalNode JS_LET() { return getToken(ArabicHtmlParser.JS_LET, 0); }
		public TerminalNode JS_CONST() { return getToken(ArabicHtmlParser.JS_CONST, 0); }
		public VarKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterVarKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitVarKeyword(this);
		}
	}

	public final VarKeywordContext varKeyword() throws RecognitionException {
		VarKeywordContext _localctx = new VarKeywordContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !(((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 7L) != 0)) ) {
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode JS_FUNCTION() { return getToken(ArabicHtmlParser.JS_FUNCTION, 0); }
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public JsBodyContext jsBody() {
			return getRuleContext(JsBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(JS_FUNCTION);
			setState(417);
			match(JS_IDENTIFIER);
			setState(418);
			match(JS_LPAREN);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_IDENTIFIER) {
				{
				setState(419);
				parameterList();
				}
			}

			setState(422);
			match(JS_RPAREN);
			setState(423);
			jsBody();
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
		public List<TerminalNode> JS_IDENTIFIER() { return getTokens(ArabicHtmlParser.JS_IDENTIFIER); }
		public TerminalNode JS_IDENTIFIER(int i) {
			return getToken(ArabicHtmlParser.JS_IDENTIFIER, i);
		}
		public List<TerminalNode> JS_COMMA() { return getTokens(ArabicHtmlParser.JS_COMMA); }
		public TerminalNode JS_COMMA(int i) {
			return getToken(ArabicHtmlParser.JS_COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(JS_IDENTIFIER);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_COMMA) {
				{
				{
				setState(426);
				match(JS_COMMA);
				setState(427);
				match(JS_IDENTIFIER);
				}
				}
				setState(432);
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
	public static class JsBodyContext extends ParserRuleContext {
		public TerminalNode JS_LBRACE() { return getToken(ArabicHtmlParser.JS_LBRACE, 0); }
		public TerminalNode JS_RBRACE() { return getToken(ArabicHtmlParser.JS_RBRACE, 0); }
		public List<JsStatementContext> jsStatement() {
			return getRuleContexts(JsStatementContext.class);
		}
		public JsStatementContext jsStatement(int i) {
			return getRuleContext(JsStatementContext.class,i);
		}
		public JsBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterJsBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitJsBody(this);
		}
	}

	public final JsBodyContext jsBody() throws RecognitionException {
		JsBodyContext _localctx = new JsBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_jsBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(JS_LBRACE);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 2204512928115085319L) != 0) || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & 3404274830671875L) != 0)) {
				{
				{
				setState(434);
				jsStatement();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			match(JS_RBRACE);
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode JS_CLASS() { return getToken(ArabicHtmlParser.JS_CLASS, 0); }
		public List<TerminalNode> JS_IDENTIFIER() { return getTokens(ArabicHtmlParser.JS_IDENTIFIER); }
		public TerminalNode JS_IDENTIFIER(int i) {
			return getToken(ArabicHtmlParser.JS_IDENTIFIER, i);
		}
		public TerminalNode JS_LBRACE() { return getToken(ArabicHtmlParser.JS_LBRACE, 0); }
		public TerminalNode JS_RBRACE() { return getToken(ArabicHtmlParser.JS_RBRACE, 0); }
		public TerminalNode JS_EXTENDS() { return getToken(ArabicHtmlParser.JS_EXTENDS, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(JS_CLASS);
			setState(443);
			match(JS_IDENTIFIER);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_EXTENDS) {
				{
				setState(444);
				match(JS_EXTENDS);
				setState(445);
				match(JS_IDENTIFIER);
				}
			}

			setState(448);
			match(JS_LBRACE);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 545357784154119L) != 0) || _la==JS_IDENTIFIER) {
				{
				{
				setState(449);
				classMember();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(JS_RBRACE);
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
	public static class ClassMemberContext extends ParserRuleContext {
		public TerminalNode JS_CONSTRUCTOR() { return getToken(ArabicHtmlParser.JS_CONSTRUCTOR, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public JsBodyContext jsBody() {
			return getRuleContext(JsBodyContext.class,0);
		}
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public VarKeywordContext varKeyword() {
			return getRuleContext(VarKeywordContext.class,0);
		}
		public TerminalNode JS_SEMI() { return getToken(ArabicHtmlParser.JS_SEMI, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode JS_STATIC() { return getToken(ArabicHtmlParser.JS_STATIC, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode JS_FUNCTION() { return getToken(ArabicHtmlParser.JS_FUNCTION, 0); }
		public TerminalNode JS_ASSIGN() { return getToken(ArabicHtmlParser.JS_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitClassMember(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_classMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & 7L) != 0)) {
				{
				setState(457);
				accessModifier();
				}
			}

			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_STATIC) {
				{
				setState(460);
				match(JS_STATIC);
				}
			}

			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_CONSTRUCTOR:
				{
				setState(463);
				match(JS_CONSTRUCTOR);
				setState(464);
				match(JS_LPAREN);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JS_IDENTIFIER) {
					{
					setState(465);
					parameterList();
					}
				}

				setState(468);
				match(JS_RPAREN);
				setState(469);
				jsBody();
				}
				break;
			case JS_FUNCTION:
			case JS_IDENTIFIER:
				{
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JS_FUNCTION) {
					{
					setState(470);
					match(JS_FUNCTION);
					}
				}

				setState(473);
				match(JS_IDENTIFIER);
				setState(474);
				match(JS_LPAREN);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JS_IDENTIFIER) {
					{
					setState(475);
					parameterList();
					}
				}

				setState(478);
				match(JS_RPAREN);
				setState(479);
				jsBody();
				}
				break;
			case JS_VAR:
			case JS_LET:
			case JS_CONST:
				{
				setState(480);
				varKeyword();
				setState(481);
				match(JS_IDENTIFIER);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JS_ASSIGN) {
					{
					setState(482);
					match(JS_ASSIGN);
					setState(483);
					expression();
					}
				}

				setState(486);
				match(JS_SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode JS_PUBLIC() { return getToken(ArabicHtmlParser.JS_PUBLIC, 0); }
		public TerminalNode JS_PRIVATE() { return getToken(ArabicHtmlParser.JS_PRIVATE, 0); }
		public TerminalNode JS_PROTECTED() { return getToken(ArabicHtmlParser.JS_PROTECTED, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitAccessModifier(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_la = _input.LA(1);
			if ( !(((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & 7L) != 0)) ) {
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode JS_RETURN() { return getToken(ArabicHtmlParser.JS_RETURN, 0); }
		public TerminalNode JS_SEMI() { return getToken(ArabicHtmlParser.JS_SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(JS_RETURN);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 108086423806021759L) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & 1585239L) != 0)) {
				{
				setState(493);
				expression();
				}
			}

			setState(496);
			match(JS_SEMI);
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
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public List<JsBodyContext> jsBody() {
			return getRuleContexts(JsBodyContext.class);
		}
		public JsBodyContext jsBody(int i) {
			return getRuleContext(JsBodyContext.class,i);
		}
		public TerminalNode JS_ELSE() { return getToken(ArabicHtmlParser.JS_ELSE, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(JS_IF);
			setState(499);
			match(JS_LPAREN);
			setState(500);
			expression();
			setState(501);
			match(JS_RPAREN);
			setState(502);
			jsBody();
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(503);
				match(JS_ELSE);
				setState(504);
				ifStatement();
				}
				break;
			case 2:
				{
				setState(505);
				match(JS_ELSE);
				setState(506);
				jsBody();
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode JS_SWITCH() { return getToken(ArabicHtmlParser.JS_SWITCH, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public TerminalNode JS_LBRACE() { return getToken(ArabicHtmlParser.JS_LBRACE, 0); }
		public TerminalNode JS_RBRACE() { return getToken(ArabicHtmlParser.JS_RBRACE, 0); }
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(JS_SWITCH);
			setState(510);
			match(JS_LPAREN);
			setState(511);
			expression();
			setState(512);
			match(JS_RPAREN);
			setState(513);
			match(JS_LBRACE);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_CASE) {
				{
				{
				setState(514);
				switchCase();
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_DEFAULT) {
				{
				setState(520);
				defaultCase();
				}
			}

			setState(523);
			match(JS_RBRACE);
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
	public static class SwitchCaseContext extends ParserRuleContext {
		public TerminalNode JS_CASE() { return getToken(ArabicHtmlParser.JS_CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_COLON() { return getToken(ArabicHtmlParser.JS_COLON, 0); }
		public List<JsStatementContext> jsStatement() {
			return getRuleContexts(JsStatementContext.class);
		}
		public JsStatementContext jsStatement(int i) {
			return getRuleContext(JsStatementContext.class,i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(JS_CASE);
			setState(526);
			expression();
			setState(527);
			match(JS_COLON);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 2204512928115085319L) != 0) || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & 3404274830671875L) != 0)) {
				{
				{
				setState(528);
				jsStatement();
				}
				}
				setState(533);
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
	public static class DefaultCaseContext extends ParserRuleContext {
		public TerminalNode JS_DEFAULT() { return getToken(ArabicHtmlParser.JS_DEFAULT, 0); }
		public TerminalNode JS_COLON() { return getToken(ArabicHtmlParser.JS_COLON, 0); }
		public List<JsStatementContext> jsStatement() {
			return getRuleContexts(JsStatementContext.class);
		}
		public JsStatementContext jsStatement(int i) {
			return getRuleContext(JsStatementContext.class,i);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitDefaultCase(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_defaultCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(JS_DEFAULT);
			setState(535);
			match(JS_COLON);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 2204512928115085319L) != 0) || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & 3404274830671875L) != 0)) {
				{
				{
				setState(536);
				jsStatement();
				}
				}
				setState(541);
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
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassicForContext extends ForStatementContext {
		public TerminalNode JS_FOR() { return getToken(ArabicHtmlParser.JS_FOR, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public List<TerminalNode> JS_SEMI() { return getTokens(ArabicHtmlParser.JS_SEMI); }
		public TerminalNode JS_SEMI(int i) {
			return getToken(ArabicHtmlParser.JS_SEMI, i);
		}
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public JsBodyContext jsBody() {
			return getRuleContext(JsBodyContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ClassicForContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterClassicFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitClassicFor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForOfContext extends ForStatementContext {
		public TerminalNode JS_FOR() { return getToken(ArabicHtmlParser.JS_FOR, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public VarKeywordContext varKeyword() {
			return getRuleContext(VarKeywordContext.class,0);
		}
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public TerminalNode JS_OF() { return getToken(ArabicHtmlParser.JS_OF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public JsBodyContext jsBody() {
			return getRuleContext(JsBodyContext.class,0);
		}
		public ForOfContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterForOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitForOf(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInContext extends ForStatementContext {
		public TerminalNode JS_FOR() { return getToken(ArabicHtmlParser.JS_FOR, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public VarKeywordContext varKeyword() {
			return getRuleContext(VarKeywordContext.class,0);
		}
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public TerminalNode JS_IN() { return getToken(ArabicHtmlParser.JS_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public JsBodyContext jsBody() {
			return getRuleContext(JsBodyContext.class,0);
		}
		public ForInContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterForIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitForIn(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forStatement);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new ClassicForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(JS_FOR);
				setState(543);
				match(JS_LPAREN);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 2197756901557534727L) != 0) || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & 3404274830671875L) != 0)) {
					{
					setState(544);
					forInit();
					}
				}

				setState(547);
				match(JS_SEMI);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 108086423806021759L) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & 1585239L) != 0)) {
					{
					setState(548);
					expression();
					}
				}

				setState(551);
				match(JS_SEMI);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 108086423806021759L) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & 1585239L) != 0)) {
					{
					setState(552);
					expression();
					}
				}

				setState(555);
				match(JS_RPAREN);
				setState(556);
				jsBody();
				}
				break;
			case 2:
				_localctx = new ForOfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(JS_FOR);
				setState(558);
				match(JS_LPAREN);
				setState(559);
				varKeyword();
				setState(560);
				match(JS_IDENTIFIER);
				setState(561);
				match(JS_OF);
				setState(562);
				expression();
				setState(563);
				match(JS_RPAREN);
				setState(564);
				jsBody();
				}
				break;
			case 3:
				_localctx = new ForInContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				match(JS_FOR);
				setState(567);
				match(JS_LPAREN);
				setState(568);
				varKeyword();
				setState(569);
				match(JS_IDENTIFIER);
				setState(570);
				match(JS_IN);
				setState(571);
				expression();
				setState(572);
				match(JS_RPAREN);
				setState(573);
				jsBody();
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
	public static class ForInitContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_forInit);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_VAR:
			case JS_LET:
			case JS_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				varDeclaration();
				}
				break;
			case JS_TRUE:
			case JS_FALSE:
			case JS_NULL:
			case JS_UNDEFINED:
			case JS_THIS:
			case JS_NAN:
			case JS_INFINITY:
			case JS_NEW:
			case JS_TYPEOF:
			case JS_DELETE:
			case JS_DOCUMENT:
			case JS_WINDOW:
			case JS_CONSOLE:
			case JS_INC:
			case JS_DEC:
			case JS_NUMBER:
			case JS_STRING:
			case JS_LBRACE:
			case JS_LPAREN:
			case JS_LBRACK:
			case JS_PLUS:
			case JS_MINUS:
			case JS_BANG:
			case JS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				expression();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode JS_WHILE() { return getToken(ArabicHtmlParser.JS_WHILE, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public JsBodyContext jsBody() {
			return getRuleContext(JsBodyContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(JS_WHILE);
			setState(582);
			match(JS_LPAREN);
			setState(583);
			expression();
			setState(584);
			match(JS_RPAREN);
			setState(585);
			jsBody();
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
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode JS_DO() { return getToken(ArabicHtmlParser.JS_DO, 0); }
		public JsBodyContext jsBody() {
			return getRuleContext(JsBodyContext.class,0);
		}
		public TerminalNode JS_WHILE() { return getToken(ArabicHtmlParser.JS_WHILE, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public TerminalNode JS_SEMI() { return getToken(ArabicHtmlParser.JS_SEMI, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(JS_DO);
			setState(588);
			jsBody();
			setState(589);
			match(JS_WHILE);
			setState(590);
			match(JS_LPAREN);
			setState(591);
			expression();
			setState(592);
			match(JS_RPAREN);
			setState(593);
			match(JS_SEMI);
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
		public List<JsBodyContext> jsBody() {
			return getRuleContexts(JsBodyContext.class);
		}
		public JsBodyContext jsBody(int i) {
			return getRuleContext(JsBodyContext.class,i);
		}
		public TerminalNode JS_CATCH() { return getToken(ArabicHtmlParser.JS_CATCH, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public TerminalNode JS_FINALLY() { return getToken(ArabicHtmlParser.JS_FINALLY, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitTryCatchStatement(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(JS_TRY);
			setState(596);
			jsBody();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_CATCH) {
				{
				setState(597);
				match(JS_CATCH);
				setState(598);
				match(JS_LPAREN);
				setState(599);
				match(JS_IDENTIFIER);
				setState(600);
				match(JS_RPAREN);
				setState(601);
				jsBody();
				}
			}

			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JS_FINALLY) {
				{
				setState(604);
				match(JS_FINALLY);
				setState(605);
				jsBody();
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
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode JS_THROW() { return getToken(ArabicHtmlParser.JS_THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_SEMI() { return getToken(ArabicHtmlParser.JS_SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(JS_THROW);
			setState(609);
			expression();
			setState(610);
			match(JS_SEMI);
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode JS_IMPORT() { return getToken(ArabicHtmlParser.JS_IMPORT, 0); }
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public TerminalNode JS_FROM() { return getToken(ArabicHtmlParser.JS_FROM, 0); }
		public TerminalNode JS_STRING() { return getToken(ArabicHtmlParser.JS_STRING, 0); }
		public TerminalNode JS_SEMI() { return getToken(ArabicHtmlParser.JS_SEMI, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(JS_IMPORT);
			setState(613);
			importClause();
			setState(614);
			match(JS_FROM);
			setState(615);
			match(JS_STRING);
			setState(616);
			match(JS_SEMI);
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
	public static class ImportClauseContext extends ParserRuleContext {
		public ImportClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importClause; }
	 
		public ImportClauseContext() { }
		public void copyFrom(ImportClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultImportContext extends ImportClauseContext {
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public DefaultImportContext(ImportClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterDefaultImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitDefaultImport(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedImportContext extends ImportClauseContext {
		public TerminalNode JS_LBRACE() { return getToken(ArabicHtmlParser.JS_LBRACE, 0); }
		public List<TerminalNode> JS_IDENTIFIER() { return getTokens(ArabicHtmlParser.JS_IDENTIFIER); }
		public TerminalNode JS_IDENTIFIER(int i) {
			return getToken(ArabicHtmlParser.JS_IDENTIFIER, i);
		}
		public TerminalNode JS_RBRACE() { return getToken(ArabicHtmlParser.JS_RBRACE, 0); }
		public List<TerminalNode> JS_COMMA() { return getTokens(ArabicHtmlParser.JS_COMMA); }
		public TerminalNode JS_COMMA(int i) {
			return getToken(ArabicHtmlParser.JS_COMMA, i);
		}
		public NamedImportContext(ImportClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterNamedImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitNamedImport(this);
		}
	}

	public final ImportClauseContext importClause() throws RecognitionException {
		ImportClauseContext _localctx = new ImportClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_importClause);
		int _la;
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_IDENTIFIER:
				_localctx = new DefaultImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(JS_IDENTIFIER);
				}
				break;
			case JS_LBRACE:
				_localctx = new NamedImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(JS_LBRACE);
				setState(620);
				match(JS_IDENTIFIER);
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==JS_COMMA) {
					{
					{
					setState(621);
					match(JS_COMMA);
					setState(622);
					match(JS_IDENTIFIER);
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(628);
				match(JS_RBRACE);
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
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode JS_EXPORT() { return getToken(ArabicHtmlParser.JS_EXPORT, 0); }
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitExportStatement(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(JS_EXPORT);
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_FUNCTION:
				{
				setState(632);
				functionDeclaration();
				}
				break;
			case JS_CLASS:
				{
				setState(633);
				classDeclaration();
				}
				break;
			case JS_VAR:
			case JS_LET:
			case JS_CONST:
				{
				setState(634);
				varDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode JS_SEMI() { return getToken(ArabicHtmlParser.JS_SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			expression();
			setState(638);
			match(JS_SEMI);
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
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			assignmentExpr();
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
	public static class AssignmentExprContext extends ParserRuleContext {
		public TernaryExprContext ternaryExpr() {
			return getRuleContext(TernaryExprContext.class,0);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitAssignmentExpr(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_assignmentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			ternaryExpr();
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(643);
				assignOp();
				setState(644);
				assignmentExpr();
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
	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode JS_ASSIGN() { return getToken(ArabicHtmlParser.JS_ASSIGN, 0); }
		public TerminalNode JS_ADD_ASSIGN() { return getToken(ArabicHtmlParser.JS_ADD_ASSIGN, 0); }
		public TerminalNode JS_SUB_ASSIGN() { return getToken(ArabicHtmlParser.JS_SUB_ASSIGN, 0); }
		public TerminalNode JS_MUL_ASSIGN() { return getToken(ArabicHtmlParser.JS_MUL_ASSIGN, 0); }
		public TerminalNode JS_DIV_ASSIGN() { return getToken(ArabicHtmlParser.JS_DIV_ASSIGN, 0); }
		public TerminalNode JS_MOD_ASSIGN() { return getToken(ArabicHtmlParser.JS_MOD_ASSIGN, 0); }
		public TerminalNode JS_EXP_ASSIGN() { return getToken(ArabicHtmlParser.JS_EXP_ASSIGN, 0); }
		public TerminalNode JS_AND_ASSIGN() { return getToken(ArabicHtmlParser.JS_AND_ASSIGN, 0); }
		public TerminalNode JS_OR_ASSIGN() { return getToken(ArabicHtmlParser.JS_OR_ASSIGN, 0); }
		public TerminalNode JS_NULL_ASSIGN() { return getToken(ArabicHtmlParser.JS_NULL_ASSIGN, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitAssignOp(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_la = _input.LA(1);
			if ( !(((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 1023L) != 0)) ) {
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
	public static class TernaryExprContext extends ParserRuleContext {
		public LogicalOrExprContext logicalOrExpr() {
			return getRuleContext(LogicalOrExprContext.class,0);
		}
		public TerminalNode JS_QUESTION() { return getToken(ArabicHtmlParser.JS_QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode JS_COLON() { return getToken(ArabicHtmlParser.JS_COLON, 0); }
		public TernaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterTernaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitTernaryExpr(this);
		}
	}

	public final TernaryExprContext ternaryExpr() throws RecognitionException {
		TernaryExprContext _localctx = new TernaryExprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ternaryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			logicalOrExpr();
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(651);
				match(JS_QUESTION);
				setState(652);
				expression();
				setState(653);
				match(JS_COLON);
				setState(654);
				expression();
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
	public static class LogicalOrExprContext extends ParserRuleContext {
		public List<LogicalAndExprContext> logicalAndExpr() {
			return getRuleContexts(LogicalAndExprContext.class);
		}
		public LogicalAndExprContext logicalAndExpr(int i) {
			return getRuleContext(LogicalAndExprContext.class,i);
		}
		public List<TerminalNode> JS_OR() { return getTokens(ArabicHtmlParser.JS_OR); }
		public TerminalNode JS_OR(int i) {
			return getToken(ArabicHtmlParser.JS_OR, i);
		}
		public LogicalOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterLogicalOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitLogicalOrExpr(this);
		}
	}

	public final LogicalOrExprContext logicalOrExpr() throws RecognitionException {
		LogicalOrExprContext _localctx = new LogicalOrExprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_logicalOrExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			logicalAndExpr();
			setState(663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(659);
					match(JS_OR);
					setState(660);
					logicalAndExpr();
					}
					} 
				}
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
	public static class LogicalAndExprContext extends ParserRuleContext {
		public List<NullCoalesceExprContext> nullCoalesceExpr() {
			return getRuleContexts(NullCoalesceExprContext.class);
		}
		public NullCoalesceExprContext nullCoalesceExpr(int i) {
			return getRuleContext(NullCoalesceExprContext.class,i);
		}
		public List<TerminalNode> JS_AND() { return getTokens(ArabicHtmlParser.JS_AND); }
		public TerminalNode JS_AND(int i) {
			return getToken(ArabicHtmlParser.JS_AND, i);
		}
		public LogicalAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterLogicalAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitLogicalAndExpr(this);
		}
	}

	public final LogicalAndExprContext logicalAndExpr() throws RecognitionException {
		LogicalAndExprContext _localctx = new LogicalAndExprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_logicalAndExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			nullCoalesceExpr();
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(667);
					match(JS_AND);
					setState(668);
					nullCoalesceExpr();
					}
					} 
				}
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
	public static class NullCoalesceExprContext extends ParserRuleContext {
		public List<BitwiseOrExprContext> bitwiseOrExpr() {
			return getRuleContexts(BitwiseOrExprContext.class);
		}
		public BitwiseOrExprContext bitwiseOrExpr(int i) {
			return getRuleContext(BitwiseOrExprContext.class,i);
		}
		public List<TerminalNode> JS_NULL_COAL() { return getTokens(ArabicHtmlParser.JS_NULL_COAL); }
		public TerminalNode JS_NULL_COAL(int i) {
			return getToken(ArabicHtmlParser.JS_NULL_COAL, i);
		}
		public NullCoalesceExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullCoalesceExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterNullCoalesceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitNullCoalesceExpr(this);
		}
	}

	public final NullCoalesceExprContext nullCoalesceExpr() throws RecognitionException {
		NullCoalesceExprContext _localctx = new NullCoalesceExprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_nullCoalesceExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			bitwiseOrExpr();
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(675);
					match(JS_NULL_COAL);
					setState(676);
					bitwiseOrExpr();
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
	public static class BitwiseOrExprContext extends ParserRuleContext {
		public List<BitwiseXorExprContext> bitwiseXorExpr() {
			return getRuleContexts(BitwiseXorExprContext.class);
		}
		public BitwiseXorExprContext bitwiseXorExpr(int i) {
			return getRuleContext(BitwiseXorExprContext.class,i);
		}
		public List<TerminalNode> JS_BIT_OR() { return getTokens(ArabicHtmlParser.JS_BIT_OR); }
		public TerminalNode JS_BIT_OR(int i) {
			return getToken(ArabicHtmlParser.JS_BIT_OR, i);
		}
		public BitwiseOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterBitwiseOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitBitwiseOrExpr(this);
		}
	}

	public final BitwiseOrExprContext bitwiseOrExpr() throws RecognitionException {
		BitwiseOrExprContext _localctx = new BitwiseOrExprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_bitwiseOrExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			bitwiseXorExpr();
			setState(687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(683);
					match(JS_BIT_OR);
					setState(684);
					bitwiseXorExpr();
					}
					} 
				}
				setState(689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
	public static class BitwiseXorExprContext extends ParserRuleContext {
		public List<BitwiseAndExprContext> bitwiseAndExpr() {
			return getRuleContexts(BitwiseAndExprContext.class);
		}
		public BitwiseAndExprContext bitwiseAndExpr(int i) {
			return getRuleContext(BitwiseAndExprContext.class,i);
		}
		public List<TerminalNode> JS_BIT_XOR() { return getTokens(ArabicHtmlParser.JS_BIT_XOR); }
		public TerminalNode JS_BIT_XOR(int i) {
			return getToken(ArabicHtmlParser.JS_BIT_XOR, i);
		}
		public BitwiseXorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseXorExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterBitwiseXorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitBitwiseXorExpr(this);
		}
	}

	public final BitwiseXorExprContext bitwiseXorExpr() throws RecognitionException {
		BitwiseXorExprContext _localctx = new BitwiseXorExprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_bitwiseXorExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			bitwiseAndExpr();
			setState(695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(691);
					match(JS_BIT_XOR);
					setState(692);
					bitwiseAndExpr();
					}
					} 
				}
				setState(697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
	public static class BitwiseAndExprContext extends ParserRuleContext {
		public List<EqualityExprContext> equalityExpr() {
			return getRuleContexts(EqualityExprContext.class);
		}
		public EqualityExprContext equalityExpr(int i) {
			return getRuleContext(EqualityExprContext.class,i);
		}
		public List<TerminalNode> JS_BIT_AND() { return getTokens(ArabicHtmlParser.JS_BIT_AND); }
		public TerminalNode JS_BIT_AND(int i) {
			return getToken(ArabicHtmlParser.JS_BIT_AND, i);
		}
		public BitwiseAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterBitwiseAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitBitwiseAndExpr(this);
		}
	}

	public final BitwiseAndExprContext bitwiseAndExpr() throws RecognitionException {
		BitwiseAndExprContext _localctx = new BitwiseAndExprContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_bitwiseAndExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			equalityExpr();
			setState(703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(699);
					match(JS_BIT_AND);
					setState(700);
					equalityExpr();
					}
					} 
				}
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
	public static class EqualityExprContext extends ParserRuleContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
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
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitEqualityExpr(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_equalityExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			relationalExpr();
			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(707);
					_la = _input.LA(1);
					if ( !(((((_la - 246)) & ~0x3f) == 0 && ((1L << (_la - 246)) & 15L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(708);
					relationalExpr();
					}
					} 
				}
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
	public static class RelationalExprContext extends ParserRuleContext {
		public List<ShiftExprContext> shiftExpr() {
			return getRuleContexts(ShiftExprContext.class);
		}
		public ShiftExprContext shiftExpr(int i) {
			return getRuleContext(ShiftExprContext.class,i);
		}
		public List<TerminalNode> JS_LT() { return getTokens(ArabicHtmlParser.JS_LT); }
		public TerminalNode JS_LT(int i) {
			return getToken(ArabicHtmlParser.JS_LT, i);
		}
		public List<TerminalNode> JS_GT() { return getTokens(ArabicHtmlParser.JS_GT); }
		public TerminalNode JS_GT(int i) {
			return getToken(ArabicHtmlParser.JS_GT, i);
		}
		public List<TerminalNode> JS_LTE() { return getTokens(ArabicHtmlParser.JS_LTE); }
		public TerminalNode JS_LTE(int i) {
			return getToken(ArabicHtmlParser.JS_LTE, i);
		}
		public List<TerminalNode> JS_GTE() { return getTokens(ArabicHtmlParser.JS_GTE); }
		public TerminalNode JS_GTE(int i) {
			return getToken(ArabicHtmlParser.JS_GTE, i);
		}
		public List<TerminalNode> JS_INSTANCEOF() { return getTokens(ArabicHtmlParser.JS_INSTANCEOF); }
		public TerminalNode JS_INSTANCEOF(int i) {
			return getToken(ArabicHtmlParser.JS_INSTANCEOF, i);
		}
		public List<TerminalNode> JS_IN() { return getTokens(ArabicHtmlParser.JS_IN); }
		public TerminalNode JS_IN(int i) {
			return getToken(ArabicHtmlParser.JS_IN, i);
		}
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitRelationalExpr(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_relationalExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			shiftExpr();
			setState(719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(715);
					_la = _input.LA(1);
					if ( !(_la==JS_IN || _la==JS_INSTANCEOF || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & 6442450947L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(716);
					shiftExpr();
					}
					} 
				}
				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
	public static class ShiftExprContext extends ParserRuleContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public List<TerminalNode> JS_LSH() { return getTokens(ArabicHtmlParser.JS_LSH); }
		public TerminalNode JS_LSH(int i) {
			return getToken(ArabicHtmlParser.JS_LSH, i);
		}
		public List<TerminalNode> JS_RSH() { return getTokens(ArabicHtmlParser.JS_RSH); }
		public TerminalNode JS_RSH(int i) {
			return getToken(ArabicHtmlParser.JS_RSH, i);
		}
		public List<TerminalNode> JS_URSH() { return getTokens(ArabicHtmlParser.JS_URSH); }
		public TerminalNode JS_URSH(int i) {
			return getToken(ArabicHtmlParser.JS_URSH, i);
		}
		public ShiftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitShiftExpr(this);
		}
	}

	public final ShiftExprContext shiftExpr() throws RecognitionException {
		ShiftExprContext _localctx = new ShiftExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_shiftExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			addExpr();
			setState(727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(723);
					_la = _input.LA(1);
					if ( !(((((_la - 255)) & ~0x3f) == 0 && ((1L << (_la - 255)) & 7L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(724);
					addExpr();
					}
					} 
				}
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
	public static class AddExprContext extends ParserRuleContext {
		public List<MulExprContext> mulExpr() {
			return getRuleContexts(MulExprContext.class);
		}
		public MulExprContext mulExpr(int i) {
			return getRuleContext(MulExprContext.class,i);
		}
		public List<TerminalNode> JS_PLUS() { return getTokens(ArabicHtmlParser.JS_PLUS); }
		public TerminalNode JS_PLUS(int i) {
			return getToken(ArabicHtmlParser.JS_PLUS, i);
		}
		public List<TerminalNode> JS_MINUS() { return getTokens(ArabicHtmlParser.JS_MINUS); }
		public TerminalNode JS_MINUS(int i) {
			return getToken(ArabicHtmlParser.JS_MINUS, i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitAddExpr(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_addExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			mulExpr();
			setState(735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(731);
					_la = _input.LA(1);
					if ( !(_la==JS_PLUS || _la==JS_MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(732);
					mulExpr();
					}
					} 
				}
				setState(737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
	public static class MulExprContext extends ParserRuleContext {
		public List<ExpExprContext> expExpr() {
			return getRuleContexts(ExpExprContext.class);
		}
		public ExpExprContext expExpr(int i) {
			return getRuleContext(ExpExprContext.class,i);
		}
		public List<TerminalNode> JS_STAR() { return getTokens(ArabicHtmlParser.JS_STAR); }
		public TerminalNode JS_STAR(int i) {
			return getToken(ArabicHtmlParser.JS_STAR, i);
		}
		public List<TerminalNode> JS_SLASH() { return getTokens(ArabicHtmlParser.JS_SLASH); }
		public TerminalNode JS_SLASH(int i) {
			return getToken(ArabicHtmlParser.JS_SLASH, i);
		}
		public List<TerminalNode> JS_PERCENT() { return getTokens(ArabicHtmlParser.JS_PERCENT); }
		public TerminalNode JS_PERCENT(int i) {
			return getToken(ArabicHtmlParser.JS_PERCENT, i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitMulExpr(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_mulExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			expExpr();
			setState(743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(739);
					_la = _input.LA(1);
					if ( !(((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & 7L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(740);
					expExpr();
					}
					} 
				}
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
	public static class ExpExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> JS_EXP() { return getTokens(ArabicHtmlParser.JS_EXP); }
		public TerminalNode JS_EXP(int i) {
			return getToken(ArabicHtmlParser.JS_EXP, i);
		}
		public ExpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterExpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitExpExpr(this);
		}
	}

	public final ExpExprContext expExpr() throws RecognitionException {
		ExpExprContext _localctx = new ExpExprContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_expExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			unaryExpr();
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(747);
					match(JS_EXP);
					setState(748);
					unaryExpr();
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode JS_BANG() { return getToken(ArabicHtmlParser.JS_BANG, 0); }
		public TerminalNode JS_MINUS() { return getToken(ArabicHtmlParser.JS_MINUS, 0); }
		public TerminalNode JS_PLUS() { return getToken(ArabicHtmlParser.JS_PLUS, 0); }
		public TerminalNode JS_INC() { return getToken(ArabicHtmlParser.JS_INC, 0); }
		public TerminalNode JS_DEC() { return getToken(ArabicHtmlParser.JS_DEC, 0); }
		public TerminalNode JS_TYPEOF() { return getToken(ArabicHtmlParser.JS_TYPEOF, 0); }
		public TerminalNode JS_DELETE() { return getToken(ArabicHtmlParser.JS_DELETE, 0); }
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unaryExpr);
		int _la;
		try {
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_TYPEOF:
			case JS_DELETE:
			case JS_INC:
			case JS_DEC:
			case JS_PLUS:
			case JS_MINUS:
			case JS_BANG:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				_la = _input.LA(1);
				if ( !(((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & 201326597L) != 0) || ((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & 131L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(755);
				unaryExpr();
				}
				break;
			case JS_TRUE:
			case JS_FALSE:
			case JS_NULL:
			case JS_UNDEFINED:
			case JS_THIS:
			case JS_NAN:
			case JS_INFINITY:
			case JS_NEW:
			case JS_DOCUMENT:
			case JS_WINDOW:
			case JS_CONSOLE:
			case JS_NUMBER:
			case JS_STRING:
			case JS_LBRACE:
			case JS_LPAREN:
			case JS_LBRACK:
			case JS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				postfixExpr();
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
	public static class PostfixExprContext extends ParserRuleContext {
		public CallExprContext callExpr() {
			return getRuleContext(CallExprContext.class,0);
		}
		public TerminalNode JS_INC() { return getToken(ArabicHtmlParser.JS_INC, 0); }
		public TerminalNode JS_DEC() { return getToken(ArabicHtmlParser.JS_DEC, 0); }
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitPostfixExpr(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_postfixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			callExpr();
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(760);
				_la = _input.LA(1);
				if ( !(_la==JS_INC || _la==JS_DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class CallExprContext extends ParserRuleContext {
		public MemberExprContext memberExpr() {
			return getRuleContext(MemberExprContext.class,0);
		}
		public List<CallSuffixContext> callSuffix() {
			return getRuleContexts(CallSuffixContext.class);
		}
		public CallSuffixContext callSuffix(int i) {
			return getRuleContext(CallSuffixContext.class,i);
		}
		public CallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCallExpr(this);
		}
	}

	public final CallExprContext callExpr() throws RecognitionException {
		CallExprContext _localctx = new CallExprContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_callExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			memberExpr();
			setState(767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(764);
					callSuffix();
					}
					} 
				}
				setState(769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
	public static class CallSuffixContext extends ParserRuleContext {
		public CallSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSuffix; }
	 
		public CallSuffixContext() { }
		public void copyFrom(CallSuffixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends CallSuffixContext {
		public TerminalNode JS_DOT() { return getToken(ArabicHtmlParser.JS_DOT, 0); }
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public MemberAccessContext(CallSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitMemberAccess(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallArgsContext extends CallSuffixContext {
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallArgsContext(CallSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitCallArgs(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComputedAccessContext extends CallSuffixContext {
		public TerminalNode JS_LBRACK() { return getToken(ArabicHtmlParser.JS_LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_RBRACK() { return getToken(ArabicHtmlParser.JS_RBRACK, 0); }
		public ComputedAccessContext(CallSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterComputedAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitComputedAccess(this);
		}
	}

	public final CallSuffixContext callSuffix() throws RecognitionException {
		CallSuffixContext _localctx = new CallSuffixContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_callSuffix);
		int _la;
		try {
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_LPAREN:
				_localctx = new CallArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(JS_LPAREN);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 108086423806021759L) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & 1585239L) != 0)) {
					{
					setState(771);
					argumentList();
					}
				}

				setState(774);
				match(JS_RPAREN);
				}
				break;
			case JS_DOT:
				_localctx = new MemberAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(JS_DOT);
				setState(776);
				match(JS_IDENTIFIER);
				}
				break;
			case JS_LBRACK:
				_localctx = new ComputedAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(777);
				match(JS_LBRACK);
				setState(778);
				expression();
				setState(779);
				match(JS_RBRACK);
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
	public static class MemberExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode JS_NEW() { return getToken(ArabicHtmlParser.JS_NEW, 0); }
		public MemberExprContext memberExpr() {
			return getRuleContext(MemberExprContext.class,0);
		}
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MemberExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterMemberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitMemberExpr(this);
		}
	}

	public final MemberExprContext memberExpr() throws RecognitionException {
		MemberExprContext _localctx = new MemberExprContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_memberExpr);
		int _la;
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_TRUE:
			case JS_FALSE:
			case JS_NULL:
			case JS_UNDEFINED:
			case JS_THIS:
			case JS_NAN:
			case JS_INFINITY:
			case JS_DOCUMENT:
			case JS_WINDOW:
			case JS_CONSOLE:
			case JS_NUMBER:
			case JS_STRING:
			case JS_LBRACE:
			case JS_LPAREN:
			case JS_LBRACK:
			case JS_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				primaryExpr();
				}
				break;
			case JS_NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(JS_NEW);
				setState(785);
				memberExpr();
				setState(786);
				match(JS_LPAREN);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 108086423806021759L) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & 1585239L) != 0)) {
					{
					setState(787);
					argumentList();
					}
				}

				setState(790);
				match(JS_RPAREN);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> JS_COMMA() { return getTokens(ArabicHtmlParser.JS_COMMA); }
		public TerminalNode JS_COMMA(int i) {
			return getToken(ArabicHtmlParser.JS_COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			expression();
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_COMMA) {
				{
				{
				setState(795);
				match(JS_COMMA);
				setState(796);
				expression();
				}
				}
				setState(801);
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
	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode JS_THIS() { return getToken(ArabicHtmlParser.JS_THIS, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public DomExpressionContext domExpression() {
			return getRuleContext(DomExpressionContext.class,0);
		}
		public ConsoleExpressionContext consoleExpression() {
			return getRuleContext(ConsoleExpressionContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_primaryExpr);
		try {
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(JS_IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(804);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(805);
				objectLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(806);
				arrowFunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(807);
				match(JS_THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(808);
				match(JS_LPAREN);
				setState(809);
				expression();
				setState(810);
				match(JS_RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(812);
				domExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(813);
				consoleExpression();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode JS_NUMBER() { return getToken(ArabicHtmlParser.JS_NUMBER, 0); }
		public TerminalNode JS_STRING() { return getToken(ArabicHtmlParser.JS_STRING, 0); }
		public TerminalNode JS_TRUE() { return getToken(ArabicHtmlParser.JS_TRUE, 0); }
		public TerminalNode JS_FALSE() { return getToken(ArabicHtmlParser.JS_FALSE, 0); }
		public TerminalNode JS_NULL() { return getToken(ArabicHtmlParser.JS_NULL, 0); }
		public TerminalNode JS_UNDEFINED() { return getToken(ArabicHtmlParser.JS_UNDEFINED, 0); }
		public TerminalNode JS_NAN() { return getToken(ArabicHtmlParser.JS_NAN, 0); }
		public TerminalNode JS_INFINITY() { return getToken(ArabicHtmlParser.JS_INFINITY, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_la = _input.LA(1);
			if ( !(((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 111L) != 0) || _la==JS_NUMBER || _la==JS_STRING) ) {
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode JS_LBRACK() { return getToken(ArabicHtmlParser.JS_LBRACK, 0); }
		public TerminalNode JS_RBRACK() { return getToken(ArabicHtmlParser.JS_RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> JS_COMMA() { return getTokens(ArabicHtmlParser.JS_COMMA); }
		public TerminalNode JS_COMMA(int i) {
			return getToken(ArabicHtmlParser.JS_COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(JS_LBRACK);
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 108086423806021759L) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & 1585239L) != 0)) {
				{
				setState(819);
				expression();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==JS_COMMA) {
					{
					{
					setState(820);
					match(JS_COMMA);
					setState(821);
					expression();
					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(829);
			match(JS_RBRACK);
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
		public TerminalNode JS_LBRACE() { return getToken(ArabicHtmlParser.JS_LBRACE, 0); }
		public TerminalNode JS_RBRACE() { return getToken(ArabicHtmlParser.JS_RBRACE, 0); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> JS_COMMA() { return getTokens(ArabicHtmlParser.JS_COMMA); }
		public TerminalNode JS_COMMA(int i) {
			return getToken(ArabicHtmlParser.JS_COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(JS_LBRACE);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & 2097157L) != 0)) {
				{
				setState(832);
				objectProperty();
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==JS_COMMA) {
					{
					{
					setState(833);
					match(JS_COMMA);
					setState(834);
					objectProperty();
					}
					}
					setState(839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(842);
			match(JS_RBRACE);
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
	public static class ObjectPropertyContext extends ParserRuleContext {
		public TerminalNode JS_COLON() { return getToken(ArabicHtmlParser.JS_COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public TerminalNode JS_STRING() { return getToken(ArabicHtmlParser.JS_STRING, 0); }
		public TerminalNode JS_SPREAD() { return getToken(ArabicHtmlParser.JS_SPREAD, 0); }
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitObjectProperty(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_objectProperty);
		int _la;
		try {
			setState(849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_STRING:
			case JS_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				_la = _input.LA(1);
				if ( !(_la==JS_STRING || _la==JS_IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(845);
				match(JS_COLON);
				setState(846);
				expression();
				}
				break;
			case JS_SPREAD:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				match(JS_SPREAD);
				setState(848);
				expression();
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArrowParamsContext arrowParams() {
			return getRuleContext(ArrowParamsContext.class,0);
		}
		public TerminalNode JS_ARROW() { return getToken(ArabicHtmlParser.JS_ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsBodyContext jsBody() {
			return getRuleContext(JsBodyContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitArrowFunction(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			arrowParams();
			setState(852);
			match(JS_ARROW);
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(853);
				expression();
				}
				break;
			case 2:
				{
				setState(854);
				jsBody();
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
	public static class ArrowParamsContext extends ParserRuleContext {
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ArrowParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterArrowParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitArrowParams(this);
		}
	}

	public final ArrowParamsContext arrowParams() throws RecognitionException {
		ArrowParamsContext _localctx = new ArrowParamsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_arrowParams);
		int _la;
		try {
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				match(JS_IDENTIFIER);
				}
				break;
			case JS_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				match(JS_LPAREN);
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JS_IDENTIFIER) {
					{
					setState(859);
					parameterList();
					}
				}

				setState(862);
				match(JS_RPAREN);
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
	public static class DomExpressionContext extends ParserRuleContext {
		public TerminalNode JS_DOCUMENT() { return getToken(ArabicHtmlParser.JS_DOCUMENT, 0); }
		public TerminalNode JS_DOT() { return getToken(ArabicHtmlParser.JS_DOT, 0); }
		public DomMethodContext domMethod() {
			return getRuleContext(DomMethodContext.class,0);
		}
		public TerminalNode JS_WINDOW() { return getToken(ArabicHtmlParser.JS_WINDOW, 0); }
		public TerminalNode JS_IDENTIFIER() { return getToken(ArabicHtmlParser.JS_IDENTIFIER, 0); }
		public DomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterDomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitDomExpression(this);
		}
	}

	public final DomExpressionContext domExpression() throws RecognitionException {
		DomExpressionContext _localctx = new DomExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_domExpression);
		try {
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_DOCUMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				match(JS_DOCUMENT);
				setState(866);
				match(JS_DOT);
				setState(867);
				domMethod();
				}
				break;
			case JS_WINDOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				match(JS_WINDOW);
				setState(869);
				match(JS_DOT);
				setState(870);
				match(JS_IDENTIFIER);
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
	public static class DomMethodContext extends ParserRuleContext {
		public TerminalNode JS_GET_ELEMENT() { return getToken(ArabicHtmlParser.JS_GET_ELEMENT, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public TerminalNode JS_GET_ELEMENTS() { return getToken(ArabicHtmlParser.JS_GET_ELEMENTS, 0); }
		public TerminalNode JS_CREATE_EL() { return getToken(ArabicHtmlParser.JS_CREATE_EL, 0); }
		public DomMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterDomMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitDomMethod(this);
		}
	}

	public final DomMethodContext domMethod() throws RecognitionException {
		DomMethodContext _localctx = new DomMethodContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_domMethod);
		try {
			setState(888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JS_GET_ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				match(JS_GET_ELEMENT);
				setState(874);
				match(JS_LPAREN);
				setState(875);
				expression();
				setState(876);
				match(JS_RPAREN);
				}
				break;
			case JS_GET_ELEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
				match(JS_GET_ELEMENTS);
				setState(879);
				match(JS_LPAREN);
				setState(880);
				expression();
				setState(881);
				match(JS_RPAREN);
				}
				break;
			case JS_CREATE_EL:
				enterOuterAlt(_localctx, 3);
				{
				setState(883);
				match(JS_CREATE_EL);
				setState(884);
				match(JS_LPAREN);
				setState(885);
				expression();
				setState(886);
				match(JS_RPAREN);
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
	public static class ConsoleExpressionContext extends ParserRuleContext {
		public TerminalNode JS_CONSOLE() { return getToken(ArabicHtmlParser.JS_CONSOLE, 0); }
		public TerminalNode JS_DOT() { return getToken(ArabicHtmlParser.JS_DOT, 0); }
		public TerminalNode JS_LOG() { return getToken(ArabicHtmlParser.JS_LOG, 0); }
		public TerminalNode JS_LPAREN() { return getToken(ArabicHtmlParser.JS_LPAREN, 0); }
		public TerminalNode JS_RPAREN() { return getToken(ArabicHtmlParser.JS_RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ConsoleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).enterConsoleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArabicHtmlParserListener ) ((ArabicHtmlParserListener)listener).exitConsoleExpression(this);
		}
	}

	public final ConsoleExpressionContext consoleExpression() throws RecognitionException {
		ConsoleExpressionContext _localctx = new ConsoleExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_consoleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(JS_CONSOLE);
			setState(891);
			match(JS_DOT);
			setState(892);
			match(JS_LOG);
			setState(893);
			match(JS_LPAREN);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 108086423806021759L) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & 1585239L) != 0)) {
				{
				setState(894);
				argumentList();
				}
			}

			setState(897);
			match(JS_RPAREN);
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
		"\u0004\u0001\u011c\u0384\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u00b0\b\u0002\n\u0002\f\u0002\u00b3\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003\u00b9\b\u0003"+
		"\n\u0003\f\u0003\u00bc\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00c2\b\u0004\n\u0004\f\u0004\u00c5\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00ca\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00d2\b\u0007"+
		"\u0001\b\u0001\b\u0005\b\u00d6\b\b\n\b\f\b\u00d9\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0004\t\u00de\b\t\u000b\t\f\t\u00df\u0001\t\u0001\t\u0005\t\u00e4\b"+
		"\t\n\t\f\t\u00e7\t\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ec\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00f4\b\n\n\n\f\n\u00f7"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00ff\b\u000b\n\u000b\f\u000b\u0102\t\u000b\u0001\f\u0004\f\u0105"+
		"\b\f\u000b\f\f\f\u0106\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u010f\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u0113\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0119\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0124\b\u0012\n\u0012\f\u0012"+
		"\u0127\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0134\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u013d\b\u0016\n\u0016"+
		"\f\u0016\u0140\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0149\b\u0016\n\u0016"+
		"\f\u0016\u014c\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u016c\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0171\b\u0017\n\u0017\f\u0017\u0174\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0179\b\u0018\n\u0018\f\u0018"+
		"\u017c\t\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u0180\b\u0019\n\u0019"+
		"\f\u0019\u0183\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0195\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u019b\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a5\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u01ad\b\u001e\n\u001e\f\u001e\u01b0\t\u001e\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01b4\b\u001f\n\u001f\f\u001f\u01b7\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01bf\b \u0001 \u0001"+
		" \u0005 \u01c3\b \n \f \u01c6\t \u0001 \u0001 \u0001!\u0003!\u01cb\b!"+
		"\u0001!\u0003!\u01ce\b!\u0001!\u0001!\u0001!\u0003!\u01d3\b!\u0001!\u0001"+
		"!\u0001!\u0003!\u01d8\b!\u0001!\u0001!\u0001!\u0003!\u01dd\b!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u01e5\b!\u0001!\u0001!\u0003!\u01e9"+
		"\b!\u0001\"\u0001\"\u0001#\u0001#\u0003#\u01ef\b#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01fc"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0204\b%\n%\f%\u0207"+
		"\t%\u0001%\u0003%\u020a\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005"+
		"&\u0212\b&\n&\f&\u0215\t&\u0001\'\u0001\'\u0001\'\u0005\'\u021a\b\'\n"+
		"\'\f\'\u021d\t\'\u0001(\u0001(\u0001(\u0003(\u0222\b(\u0001(\u0001(\u0003"+
		"(\u0226\b(\u0001(\u0001(\u0003(\u022a\b(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0240\b(\u0001)\u0001)\u0003"+
		")\u0244\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u025b\b,\u0001,\u0001,\u0003,\u025f\b,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0005/\u0270\b/\n/\f/\u0273\t/\u0001/\u0003/\u0276"+
		"\b/\u00010\u00010\u00010\u00010\u00030\u027c\b0\u00011\u00011\u00011\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00033\u0287\b3\u00014\u00014\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00035\u0291\b5\u00016\u00016\u0001"+
		"6\u00056\u0296\b6\n6\f6\u0299\t6\u00017\u00017\u00017\u00057\u029e\b7"+
		"\n7\f7\u02a1\t7\u00018\u00018\u00018\u00058\u02a6\b8\n8\f8\u02a9\t8\u0001"+
		"9\u00019\u00019\u00059\u02ae\b9\n9\f9\u02b1\t9\u0001:\u0001:\u0001:\u0005"+
		":\u02b6\b:\n:\f:\u02b9\t:\u0001;\u0001;\u0001;\u0005;\u02be\b;\n;\f;\u02c1"+
		"\t;\u0001<\u0001<\u0001<\u0005<\u02c6\b<\n<\f<\u02c9\t<\u0001=\u0001="+
		"\u0001=\u0005=\u02ce\b=\n=\f=\u02d1\t=\u0001>\u0001>\u0001>\u0005>\u02d6"+
		"\b>\n>\f>\u02d9\t>\u0001?\u0001?\u0001?\u0005?\u02de\b?\n?\f?\u02e1\t"+
		"?\u0001@\u0001@\u0001@\u0005@\u02e6\b@\n@\f@\u02e9\t@\u0001A\u0001A\u0001"+
		"A\u0005A\u02ee\bA\nA\fA\u02f1\tA\u0001B\u0001B\u0001B\u0003B\u02f6\bB"+
		"\u0001C\u0001C\u0003C\u02fa\bC\u0001D\u0001D\u0005D\u02fe\bD\nD\fD\u0301"+
		"\tD\u0001E\u0001E\u0003E\u0305\bE\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0003E\u030e\bE\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u0315"+
		"\bF\u0001F\u0001F\u0003F\u0319\bF\u0001G\u0001G\u0001G\u0005G\u031e\b"+
		"G\nG\fG\u0321\tG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0003H\u032f\bH\u0001I\u0001I\u0001J\u0001"+
		"J\u0001J\u0001J\u0005J\u0337\bJ\nJ\fJ\u033a\tJ\u0003J\u033c\bJ\u0001J"+
		"\u0001J\u0001K\u0001K\u0001K\u0001K\u0005K\u0344\bK\nK\fK\u0347\tK\u0003"+
		"K\u0349\bK\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0003L\u0352"+
		"\bL\u0001M\u0001M\u0001M\u0001M\u0003M\u0358\bM\u0001N\u0001N\u0001N\u0003"+
		"N\u035d\bN\u0001N\u0003N\u0360\bN\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0003O\u0368\bO\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u0379\bP\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0380\bQ\u0001Q\u0001Q\u0001Q\u0000"+
		"\u0000R\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u0000\u0011\u0001\u0000W]\u0001\u0000^"+
		"a\u0002\u0000\u0013OQV\u0001\u0000bz\u0001\u0000\u0114\u0115\u0001\u0000"+
		"\u0116\u0117\u0001\u0000\u0098\u009a\u0001\u0000\u00c5\u00c7\u0001\u0000"+
		"\u00ec\u00f5\u0001\u0000\u00f6\u00f9\u0004\u0000\u00af\u00af\u00d0\u00d0"+
		"\u00fa\u00fb\u0119\u011a\u0001\u0000\u00ff\u0101\u0001\u0000\u0116\u0118"+
		"\u0005\u0000\u00cf\u00cf\u00d1\u00d1\u00e9\u00ea\u0114\u0115\u011b\u011b"+
		"\u0001\u0000\u00e9\u00ea\u0003\u0000\u00b2\u00b5\u00b7\u00b8\u0108\u0109"+
		"\u0002\u0000\u0109\u0109\u011c\u011c\u03af\u0000\u00a4\u0001\u0000\u0000"+
		"\u0000\u0002\u00a7\u0001\u0000\u0000\u0000\u0004\u00ac\u0001\u0000\u0000"+
		"\u0000\u0006\u00b6\u0001\u0000\u0000\u0000\b\u00c9\u0001\u0000\u0000\u0000"+
		"\n\u00cb\u0001\u0000\u0000\u0000\f\u00cd\u0001\u0000\u0000\u0000\u000e"+
		"\u00d1\u0001\u0000\u0000\u0000\u0010\u00d3\u0001\u0000\u0000\u0000\u0012"+
		"\u00eb\u0001\u0000\u0000\u0000\u0014\u00ed\u0001\u0000\u0000\u0000\u0016"+
		"\u00fa\u0001\u0000\u0000\u0000\u0018\u0104\u0001\u0000\u0000\u0000\u001a"+
		"\u010e\u0001\u0000\u0000\u0000\u001c\u0112\u0001\u0000\u0000\u0000\u001e"+
		"\u0118\u0001\u0000\u0000\u0000 \u011a\u0001\u0000\u0000\u0000\"\u011c"+
		"\u0001\u0000\u0000\u0000$\u011e\u0001\u0000\u0000\u0000&\u012a\u0001\u0000"+
		"\u0000\u0000(\u0133\u0001\u0000\u0000\u0000*\u0135\u0001\u0000\u0000\u0000"+
		",\u016b\u0001\u0000\u0000\u0000.\u016d\u0001\u0000\u0000\u00000\u0175"+
		"\u0001\u0000\u0000\u00002\u017d\u0001\u0000\u0000\u00004\u0194\u0001\u0000"+
		"\u0000\u00006\u0196\u0001\u0000\u0000\u00008\u019e\u0001\u0000\u0000\u0000"+
		":\u01a0\u0001\u0000\u0000\u0000<\u01a9\u0001\u0000\u0000\u0000>\u01b1"+
		"\u0001\u0000\u0000\u0000@\u01ba\u0001\u0000\u0000\u0000B\u01ca\u0001\u0000"+
		"\u0000\u0000D\u01ea\u0001\u0000\u0000\u0000F\u01ec\u0001\u0000\u0000\u0000"+
		"H\u01f2\u0001\u0000\u0000\u0000J\u01fd\u0001\u0000\u0000\u0000L\u020d"+
		"\u0001\u0000\u0000\u0000N\u0216\u0001\u0000\u0000\u0000P\u023f\u0001\u0000"+
		"\u0000\u0000R\u0243\u0001\u0000\u0000\u0000T\u0245\u0001\u0000\u0000\u0000"+
		"V\u024b\u0001\u0000\u0000\u0000X\u0253\u0001\u0000\u0000\u0000Z\u0260"+
		"\u0001\u0000\u0000\u0000\\\u0264\u0001\u0000\u0000\u0000^\u0275\u0001"+
		"\u0000\u0000\u0000`\u0277\u0001\u0000\u0000\u0000b\u027d\u0001\u0000\u0000"+
		"\u0000d\u0280\u0001\u0000\u0000\u0000f\u0282\u0001\u0000\u0000\u0000h"+
		"\u0288\u0001\u0000\u0000\u0000j\u028a\u0001\u0000\u0000\u0000l\u0292\u0001"+
		"\u0000\u0000\u0000n\u029a\u0001\u0000\u0000\u0000p\u02a2\u0001\u0000\u0000"+
		"\u0000r\u02aa\u0001\u0000\u0000\u0000t\u02b2\u0001\u0000\u0000\u0000v"+
		"\u02ba\u0001\u0000\u0000\u0000x\u02c2\u0001\u0000\u0000\u0000z\u02ca\u0001"+
		"\u0000\u0000\u0000|\u02d2\u0001\u0000\u0000\u0000~\u02da\u0001\u0000\u0000"+
		"\u0000\u0080\u02e2\u0001\u0000\u0000\u0000\u0082\u02ea\u0001\u0000\u0000"+
		"\u0000\u0084\u02f5\u0001\u0000\u0000\u0000\u0086\u02f7\u0001\u0000\u0000"+
		"\u0000\u0088\u02fb\u0001\u0000\u0000\u0000\u008a\u030d\u0001\u0000\u0000"+
		"\u0000\u008c\u0318\u0001\u0000\u0000\u0000\u008e\u031a\u0001\u0000\u0000"+
		"\u0000\u0090\u032e\u0001\u0000\u0000\u0000\u0092\u0330\u0001\u0000\u0000"+
		"\u0000\u0094\u0332\u0001\u0000\u0000\u0000\u0096\u033f\u0001\u0000\u0000"+
		"\u0000\u0098\u0351\u0001\u0000\u0000\u0000\u009a\u0353\u0001\u0000\u0000"+
		"\u0000\u009c\u035f\u0001\u0000\u0000\u0000\u009e\u0367\u0001\u0000\u0000"+
		"\u0000\u00a0\u0378\u0001\u0000\u0000\u0000\u00a2\u037a\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0003\u0002\u0001\u0000\u00a5\u00a6\u0005\u0000\u0000"+
		"\u0001\u00a6\u0001\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0005\u0000"+
		"\u0000\u00a8\u00a9\u0003\u0004\u0002\u0000\u00a9\u00aa\u0003\u0006\u0003"+
		"\u0000\u00aa\u00ab\u0005\u0006\u0000\u0000\u00ab\u0003\u0001\u0000\u0000"+
		"\u0000\u00ac\u00b1\u0005\u0007\u0000\u0000\u00ad\u00b0\u0003\u0010\b\u0000"+
		"\u00ae\u00b0\u00032\u0019\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005\b\u0000\u0000\u00b5\u0005\u0001\u0000\u0000\u0000\u00b6\u00ba"+
		"\u0005\t\u0000\u0000\u00b7\u00b9\u0003\b\u0004\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"\n\u0000\u0000\u00be\u0007\u0001\u0000\u0000\u0000\u00bf\u00c3\u0003\n"+
		"\u0005\u0000\u00c0\u00c2\u0003\u000e\u0007\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\f\u0006"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005\r\u0000\u0000"+
		"\u00c9\u00bf\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\t\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\f\u0000\u0000\u00cc"+
		"\u000b\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u000b\u0000\u0000\u00ce"+
		"\r\u0001\u0000\u0000\u0000\u00cf\u00d2\u0003\b\u0004\u0000\u00d0\u00d2"+
		"\u0005\u000e\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u000f\u0001\u0000\u0000\u0000\u00d3\u00d7"+
		"\u0005\u0001\u0000\u0000\u00d4\u00d6\u0003\u0012\t\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0005"+
		"\u0010\u0000\u0000\u00db\u0011\u0001\u0000\u0000\u0000\u00dc\u00de\u0003"+
		"\u0016\u000b\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e5\u0005"+
		"\u0087\u0000\u0000\u00e2\u00e4\u0003$\u0012\u0000\u00e3\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0088"+
		"\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003\u0014"+
		"\n\u0000\u00eb\u00dd\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u0013\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005P\u0000\u0000"+
		"\u00ee\u00ef\u0005\u008e\u0000\u0000\u00ef\u00f0\u0003$\u0012\u0000\u00f0"+
		"\u00f1\u0005\u008f\u0000\u0000\u00f1\u00f5\u0005\u0087\u0000\u0000\u00f2"+
		"\u00f4\u0003\u0012\t\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0088\u0000\u0000\u00f9\u0015"+
		"\u0001\u0000\u0000\u0000\u00fa\u0100\u0003\u0018\f\u0000\u00fb\u00fc\u0003"+
		"\u001c\u000e\u0000\u00fc\u00fd\u0003\u0018\f\u0000\u00fd\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000"+
		"\u0000\u0000\u0101\u0017\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0103\u0105\u0003\u001a\r\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0019\u0001\u0000\u0000"+
		"\u0000\u0108\u010f\u0005\u0093\u0000\u0000\u0109\u010a\u0005\u008c\u0000"+
		"\u0000\u010a\u010f\u0005\u0093\u0000\u0000\u010b\u010c\u0005\u008d\u0000"+
		"\u0000\u010c\u010f\u0005\u0093\u0000\u0000\u010d\u010f\u0003\u001e\u000f"+
		"\u0000\u010e\u0108\u0001\u0000\u0000\u0000\u010e\u0109\u0001\u0000\u0000"+
		"\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u001b\u0001\u0000\u0000\u0000\u0110\u0113\u0005\u0090\u0000"+
		"\u0000\u0111\u0113\u0005\u0091\u0000\u0000\u0112\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u001d\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0005\u0089\u0000\u0000\u0115\u0119\u0003 \u0010\u0000"+
		"\u0116\u0117\u0005\u0092\u0000\u0000\u0117\u0119\u0003\"\u0011\u0000\u0118"+
		"\u0114\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119"+
		"\u001f\u0001\u0000\u0000\u0000\u011a\u011b\u0007\u0000\u0000\u0000\u011b"+
		"!\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0001\u0000\u0000\u011d#\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0003&\u0013\u0000\u011f\u0120\u0005\u0089"+
		"\u0000\u0000\u0120\u0125\u0003(\u0014\u0000\u0121\u0122\u0005\u008b\u0000"+
		"\u0000\u0122\u0124\u0003(\u0014\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u008a\u0000\u0000"+
		"\u0129%\u0001\u0000\u0000\u0000\u012a\u012b\u0007\u0002\u0000\u0000\u012b"+
		"\'\u0001\u0000\u0000\u0000\u012c\u0134\u0005\u0083\u0000\u0000\u012d\u0134"+
		"\u0005\u0085\u0000\u0000\u012e\u0134\u0005\u0084\u0000\u0000\u012f\u0134"+
		"\u0005\u0086\u0000\u0000\u0130\u0134\u0003*\u0015\u0000\u0131\u0134\u0003"+
		",\u0016\u0000\u0132\u0134\u0005\u0093\u0000\u0000\u0133\u012c\u0001\u0000"+
		"\u0000\u0000\u0133\u012d\u0001\u0000\u0000\u0000\u0133\u012e\u0001\u0000"+
		"\u0000\u0000\u0133\u012f\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000"+
		"\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000"+
		"\u0000\u0000\u0134)\u0001\u0000\u0000\u0000\u0135\u0136\u0007\u0003\u0000"+
		"\u0000\u0136+\u0001\u0000\u0000\u0000\u0137\u0138\u0005|\u0000\u0000\u0138"+
		"\u0139\u0005\u008e\u0000\u0000\u0139\u013e\u0003(\u0014\u0000\u013a\u013b"+
		"\u0005\u008b\u0000\u0000\u013b\u013d\u0003(\u0014\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0141\u0001"+
		"\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0142\u0005"+
		"\u008f\u0000\u0000\u0142\u016c\u0001\u0000\u0000\u0000\u0143\u0144\u0005"+
		"}\u0000\u0000\u0144\u0145\u0005\u008e\u0000\u0000\u0145\u014a\u0003(\u0014"+
		"\u0000\u0146\u0147\u0005\u008b\u0000\u0000\u0147\u0149\u0003(\u0014\u0000"+
		"\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0005\u008f\u0000\u0000\u014e\u016c\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0005~\u0000\u0000\u0150\u0151\u0005\u008e\u0000\u0000\u0151"+
		"\u0152\u0003.\u0017\u0000\u0152\u0153\u0005\u008f\u0000\u0000\u0153\u016c"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u007f\u0000\u0000\u0155\u0156"+
		"\u0005\u008e\u0000\u0000\u0156\u0157\u0005\u0093\u0000\u0000\u0157\u016c"+
		"\u0005\u008f\u0000\u0000\u0158\u0159\u0005{\u0000\u0000\u0159\u015a\u0005"+
		"\u008e\u0000\u0000\u015a\u015b\u0005\u0086\u0000\u0000\u015b\u016c\u0005"+
		"\u008f\u0000\u0000\u015c\u015d\u0005\u0080\u0000\u0000\u015d\u015e\u0005"+
		"\u008e\u0000\u0000\u015e\u015f\u0003(\u0014\u0000\u015f\u0160\u0005\u008f"+
		"\u0000\u0000\u0160\u016c\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0081"+
		"\u0000\u0000\u0162\u0163\u0005\u008e\u0000\u0000\u0163\u0164\u0003(\u0014"+
		"\u0000\u0164\u0165\u0005\u008f\u0000\u0000\u0165\u016c\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005\u0082\u0000\u0000\u0167\u0168\u0005\u008e\u0000"+
		"\u0000\u0168\u0169\u0003(\u0014\u0000\u0169\u016a\u0005\u008f\u0000\u0000"+
		"\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0137\u0001\u0000\u0000\u0000"+
		"\u016b\u0143\u0001\u0000\u0000\u0000\u016b\u014f\u0001\u0000\u0000\u0000"+
		"\u016b\u0154\u0001\u0000\u0000\u0000\u016b\u0158\u0001\u0000\u0000\u0000"+
		"\u016b\u015c\u0001\u0000\u0000\u0000\u016b\u0161\u0001\u0000\u0000\u0000"+
		"\u016b\u0166\u0001\u0000\u0000\u0000\u016c-\u0001\u0000\u0000\u0000\u016d"+
		"\u0172\u00030\u0018\u0000\u016e\u016f\u0007\u0004\u0000\u0000\u016f\u0171"+
		"\u00030\u0018\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0174\u0001"+
		"\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001"+
		"\u0000\u0000\u0000\u0173/\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000"+
		"\u0000\u0000\u0175\u017a\u0003(\u0014\u0000\u0176\u0177\u0007\u0005\u0000"+
		"\u0000\u0177\u0179\u0003(\u0014\u0000\u0178\u0176\u0001\u0000\u0000\u0000"+
		"\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0001\u0000\u0000\u0000\u017b1\u0001\u0000\u0000\u0000\u017c"+
		"\u017a\u0001\u0000\u0000\u0000\u017d\u0181\u0005\u0003\u0000\u0000\u017e"+
		"\u0180\u00034\u001a\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180\u0183"+
		"\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0181"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0005\u0094\u0000\u0000\u01853\u0001"+
		"\u0000\u0000\u0000\u0186\u0195\u00036\u001b\u0000\u0187\u0195\u0003:\u001d"+
		"\u0000\u0188\u0195\u0003@ \u0000\u0189\u0195\u0003F#\u0000\u018a\u0195"+
		"\u0003H$\u0000\u018b\u0195\u0003J%\u0000\u018c\u0195\u0003P(\u0000\u018d"+
		"\u0195\u0003T*\u0000\u018e\u0195\u0003V+\u0000\u018f\u0195\u0003X,\u0000"+
		"\u0190\u0195\u0003Z-\u0000\u0191\u0195\u0003\\.\u0000\u0192\u0195\u0003"+
		"`0\u0000\u0193\u0195\u0003b1\u0000\u0194\u0186\u0001\u0000\u0000\u0000"+
		"\u0194\u0187\u0001\u0000\u0000\u0000\u0194\u0188\u0001\u0000\u0000\u0000"+
		"\u0194\u0189\u0001\u0000\u0000\u0000\u0194\u018a\u0001\u0000\u0000\u0000"+
		"\u0194\u018b\u0001\u0000\u0000\u0000\u0194\u018c\u0001\u0000\u0000\u0000"+
		"\u0194\u018d\u0001\u0000\u0000\u0000\u0194\u018e\u0001\u0000\u0000\u0000"+
		"\u0194\u018f\u0001\u0000\u0000\u0000\u0194\u0190\u0001\u0000\u0000\u0000"+
		"\u0194\u0191\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000"+
		"\u0194\u0193\u0001\u0000\u0000\u0000\u01955\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u00038\u001c\u0000\u0197\u019a\u0005\u011c\u0000\u0000\u0198\u0199"+
		"\u0005\u00f5\u0000\u0000\u0199\u019b\u0003d2\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000"+
		"\u0000\u0000\u019c\u019d\u0005\u0110\u0000\u0000\u019d7\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0007\u0006\u0000\u0000\u019f9\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0005\u00b0\u0000\u0000\u01a1\u01a2\u0005\u011c\u0000\u0000"+
		"\u01a2\u01a4\u0005\u010c\u0000\u0000\u01a3\u01a5\u0003<\u001e\u0000\u01a4"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005\u010d\u0000\u0000\u01a7"+
		"\u01a8\u0003>\u001f\u0000\u01a8;\u0001\u0000\u0000\u0000\u01a9\u01ae\u0005"+
		"\u011c\u0000\u0000\u01aa\u01ab\u0005\u0111\u0000\u0000\u01ab\u01ad\u0005"+
		"\u011c\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001"+
		"\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001"+
		"\u0000\u0000\u0000\u01af=\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b5\u0005\u010a\u0000\u0000\u01b2\u01b4\u00034\u001a"+
		"\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0005\u010b\u0000\u0000\u01b9?\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0005\u00bf\u0000\u0000\u01bb\u01be\u0005\u011c\u0000\u0000"+
		"\u01bc\u01bd\u0005\u00c0\u0000\u0000\u01bd\u01bf\u0005\u011c\u0000\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c4\u0005\u010a\u0000\u0000"+
		"\u01c1\u01c3\u0003B!\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005\u010b\u0000\u0000\u01c8A\u0001"+
		"\u0000\u0000\u0000\u01c9\u01cb\u0003D\"\u0000\u01ca\u01c9\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cc\u01ce\u0005\u00c8\u0000\u0000\u01cd\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01e8\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0005\u00c4\u0000\u0000\u01d0\u01d2\u0005\u010c"+
		"\u0000\u0000\u01d1\u01d3\u0003<\u001e\u0000\u01d2\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0005\u010d\u0000\u0000\u01d5\u01e9\u0003>\u001f\u0000"+
		"\u01d6\u01d8\u0005\u00b0\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005\u011c\u0000\u0000\u01da\u01dc\u0005\u010c\u0000\u0000"+
		"\u01db\u01dd\u0003<\u001e\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc"+
		"\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de"+
		"\u01df\u0005\u010d\u0000\u0000\u01df\u01e9\u0003>\u001f\u0000\u01e0\u01e1"+
		"\u00038\u001c\u0000\u01e1\u01e4\u0005\u011c\u0000\u0000\u01e2\u01e3\u0005"+
		"\u00f5\u0000\u0000\u01e3\u01e5\u0003d2\u0000\u01e4\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0005\u0110\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e8\u01cf\u0001\u0000\u0000\u0000\u01e8\u01d7\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e0\u0001\u0000\u0000\u0000\u01e9C\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0007\u0007\u0000\u0000\u01ebE\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ee\u0005\u00b1\u0000\u0000\u01ed\u01ef\u0003d2\u0000\u01ee\u01ed\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0005\u0110\u0000\u0000\u01f1G\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0005\u00a4\u0000\u0000\u01f3\u01f4\u0005\u010c"+
		"\u0000\u0000\u01f4\u01f5\u0003d2\u0000\u01f5\u01f6\u0005\u010d\u0000\u0000"+
		"\u01f6\u01fb\u0003>\u001f\u0000\u01f7\u01f8\u0005\u00a5\u0000\u0000\u01f8"+
		"\u01fc\u0003H$\u0000\u01f9\u01fa\u0005\u00a5\u0000\u0000\u01fa\u01fc\u0003"+
		">\u001f\u0000\u01fb\u01f7\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fcI\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0005\u00a6\u0000\u0000\u01fe\u01ff\u0005\u010c\u0000"+
		"\u0000\u01ff\u0200\u0003d2\u0000\u0200\u0201\u0005\u010d\u0000\u0000\u0201"+
		"\u0205\u0005\u010a\u0000\u0000\u0202\u0204\u0003L&\u0000\u0203\u0202\u0001"+
		"\u0000\u0000\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0209\u0001"+
		"\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u020a\u0003"+
		"N\'\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u010b"+
		"\u0000\u0000\u020cK\u0001\u0000\u0000\u0000\u020d\u020e\u0005\u00a7\u0000"+
		"\u0000\u020e\u020f\u0003d2\u0000\u020f\u0213\u0005\u0113\u0000\u0000\u0210"+
		"\u0212\u00034\u001a\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0212\u0215"+
		"\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u0001\u0000\u0000\u0000\u0214M\u0001\u0000\u0000\u0000\u0215\u0213\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0005\u00a8\u0000\u0000\u0217\u021b\u0005"+
		"\u0113\u0000\u0000\u0218\u021a\u00034\u001a\u0000\u0219\u0218\u0001\u0000"+
		"\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000"+
		"\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021cO\u0001\u0000\u0000"+
		"\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u021f\u0005\u00a9\u0000"+
		"\u0000\u021f\u0221\u0005\u010c\u0000\u0000\u0220\u0222\u0003R)\u0000\u0221"+
		"\u0220\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0001\u0000\u0000\u0000\u0223\u0225\u0005\u0110\u0000\u0000\u0224"+
		"\u0226\u0003d2\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001"+
		"\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0229\u0005"+
		"\u0110\u0000\u0000\u0228\u022a\u0003d2\u0000\u0229\u0228\u0001\u0000\u0000"+
		"\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000"+
		"\u0000\u022b\u022c\u0005\u010d\u0000\u0000\u022c\u0240\u0003>\u001f\u0000"+
		"\u022d\u022e\u0005\u00a9\u0000\u0000\u022e\u022f\u0005\u010c\u0000\u0000"+
		"\u022f\u0230\u00038\u001c\u0000\u0230\u0231\u0005\u011c\u0000\u0000\u0231"+
		"\u0232\u0005\u00ae\u0000\u0000\u0232\u0233\u0003d2\u0000\u0233\u0234\u0005"+
		"\u010d\u0000\u0000\u0234\u0235\u0003>\u001f\u0000\u0235\u0240\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0005\u00a9\u0000\u0000\u0237\u0238\u0005\u010c"+
		"\u0000\u0000\u0238\u0239\u00038\u001c\u0000\u0239\u023a\u0005\u011c\u0000"+
		"\u0000\u023a\u023b\u0005\u00af\u0000\u0000\u023b\u023c\u0003d2\u0000\u023c"+
		"\u023d\u0005\u010d\u0000\u0000\u023d\u023e\u0003>\u001f\u0000\u023e\u0240"+
		"\u0001\u0000\u0000\u0000\u023f\u021e\u0001\u0000\u0000\u0000\u023f\u022d"+
		"\u0001\u0000\u0000\u0000\u023f\u0236\u0001\u0000\u0000\u0000\u0240Q\u0001"+
		"\u0000\u0000\u0000\u0241\u0244\u00036\u001b\u0000\u0242\u0244\u0003d2"+
		"\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0242\u0001\u0000\u0000"+
		"\u0000\u0244S\u0001\u0000\u0000\u0000\u0245\u0246\u0005\u00aa\u0000\u0000"+
		"\u0246\u0247\u0005\u010c\u0000\u0000\u0247\u0248\u0003d2\u0000\u0248\u0249"+
		"\u0005\u010d\u0000\u0000\u0249\u024a\u0003>\u001f\u0000\u024aU\u0001\u0000"+
		"\u0000\u0000\u024b\u024c\u0005\u00ab\u0000\u0000\u024c\u024d\u0003>\u001f"+
		"\u0000\u024d\u024e\u0005\u00aa\u0000\u0000\u024e\u024f\u0005\u010c\u0000"+
		"\u0000\u024f\u0250\u0003d2\u0000\u0250\u0251\u0005\u010d\u0000\u0000\u0251"+
		"\u0252\u0005\u0110\u0000\u0000\u0252W\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0005\u00b9\u0000\u0000\u0254\u025a\u0003>\u001f\u0000\u0255\u0256\u0005"+
		"\u00ba\u0000\u0000\u0256\u0257\u0005\u010c\u0000\u0000\u0257\u0258\u0005"+
		"\u011c\u0000\u0000\u0258\u0259\u0005\u010d\u0000\u0000\u0259\u025b\u0003"+
		">\u001f\u0000\u025a\u0255\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000"+
		"\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025d\u0005\u00bb"+
		"\u0000\u0000\u025d\u025f\u0003>\u001f\u0000\u025e\u025c\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025fY\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0005\u00bc\u0000\u0000\u0261\u0262\u0003d2\u0000\u0262\u0263"+
		"\u0005\u0110\u0000\u0000\u0263[\u0001\u0000\u0000\u0000\u0264\u0265\u0005"+
		"\u00cb\u0000\u0000\u0265\u0266\u0003^/\u0000\u0266\u0267\u0005\u00cd\u0000"+
		"\u0000\u0267\u0268\u0005\u0109\u0000\u0000\u0268\u0269\u0005\u0110\u0000"+
		"\u0000\u0269]\u0001\u0000\u0000\u0000\u026a\u0276\u0005\u011c\u0000\u0000"+
		"\u026b\u026c\u0005\u010a\u0000\u0000\u026c\u0271\u0005\u011c\u0000\u0000"+
		"\u026d\u026e\u0005\u0111\u0000\u0000\u026e\u0270\u0005\u011c\u0000\u0000"+
		"\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0273\u0001\u0000\u0000\u0000"+
		"\u0271\u026f\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000"+
		"\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000"+
		"\u0274\u0276\u0005\u010b\u0000\u0000\u0275\u026a\u0001\u0000\u0000\u0000"+
		"\u0275\u026b\u0001\u0000\u0000\u0000\u0276_\u0001\u0000\u0000\u0000\u0277"+
		"\u027b\u0005\u00cc\u0000\u0000\u0278\u027c\u0003:\u001d\u0000\u0279\u027c"+
		"\u0003@ \u0000\u027a\u027c\u00036\u001b\u0000\u027b\u0278\u0001\u0000"+
		"\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027a\u0001\u0000"+
		"\u0000\u0000\u027ca\u0001\u0000\u0000\u0000\u027d\u027e\u0003d2\u0000"+
		"\u027e\u027f\u0005\u0110\u0000\u0000\u027fc\u0001\u0000\u0000\u0000\u0280"+
		"\u0281\u0003f3\u0000\u0281e\u0001\u0000\u0000\u0000\u0282\u0286\u0003"+
		"j5\u0000\u0283\u0284\u0003h4\u0000\u0284\u0285\u0003f3\u0000\u0285\u0287"+
		"\u0001\u0000\u0000\u0000\u0286\u0283\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0001\u0000\u0000\u0000\u0287g\u0001\u0000\u0000\u0000\u0288\u0289\u0007"+
		"\b\u0000\u0000\u0289i\u0001\u0000\u0000\u0000\u028a\u0290\u0003l6\u0000"+
		"\u028b\u028c\u0005\u0105\u0000\u0000\u028c\u028d\u0003d2\u0000\u028d\u028e"+
		"\u0005\u0113\u0000\u0000\u028e\u028f\u0003d2\u0000\u028f\u0291\u0001\u0000"+
		"\u0000\u0000\u0290\u028b\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000"+
		"\u0000\u0000\u0291k\u0001\u0000\u0000\u0000\u0292\u0297\u0003n7\u0000"+
		"\u0293\u0294\u0005\u00fd\u0000\u0000\u0294\u0296\u0003n7\u0000\u0295\u0293"+
		"\u0001\u0000\u0000\u0000\u0296\u0299\u0001\u0000\u0000\u0000\u0297\u0295"+
		"\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298m\u0001"+
		"\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u029a\u029f\u0003"+
		"p8\u0000\u029b\u029c\u0005\u00fc\u0000\u0000\u029c\u029e\u0003p8\u0000"+
		"\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u02a1\u0001\u0000\u0000\u0000"+
		"\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a0o\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a7\u0003r9\u0000\u02a3\u02a4\u0005\u00fe\u0000\u0000\u02a4\u02a6\u0003"+
		"r9\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000"+
		"\u0000\u02a8q\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000"+
		"\u02aa\u02af\u0003t:\u0000\u02ab\u02ac\u0005\u0103\u0000\u0000\u02ac\u02ae"+
		"\u0003t:\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ae\u02b1\u0001\u0000"+
		"\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b0s\u0001\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b7\u0003v;\u0000\u02b3\u02b4\u0005\u0104\u0000\u0000\u02b4"+
		"\u02b6\u0003v;\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b9\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b8u\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bf\u0003x<\u0000\u02bb\u02bc\u0005\u0102\u0000\u0000"+
		"\u02bc\u02be\u0003x<\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02be\u02c1"+
		"\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c0w\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c7\u0003z=\u0000\u02c3\u02c4\u0007\t\u0000"+
		"\u0000\u02c4\u02c6\u0003z=\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c8\u0001\u0000\u0000\u0000\u02c8y\u0001\u0000\u0000\u0000\u02c9\u02c7"+
		"\u0001\u0000\u0000\u0000\u02ca\u02cf\u0003|>\u0000\u02cb\u02cc\u0007\n"+
		"\u0000\u0000\u02cc\u02ce\u0003|>\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000"+
		"\u02ce\u02d1\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0{\u0001\u0000\u0000\u0000\u02d1"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d2\u02d7\u0003~?\u0000\u02d3\u02d4\u0007"+
		"\u000b\u0000\u0000\u02d4\u02d6\u0003~?\u0000\u02d5\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d9\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8}\u0001\u0000\u0000\u0000"+
		"\u02d9\u02d7\u0001\u0000\u0000\u0000\u02da\u02df\u0003\u0080@\u0000\u02db"+
		"\u02dc\u0007\u0004\u0000\u0000\u02dc\u02de\u0003\u0080@\u0000\u02dd\u02db"+
		"\u0001\u0000\u0000\u0000\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02dd"+
		"\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u007f"+
		"\u0001\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e2\u02e7"+
		"\u0003\u0082A\u0000\u02e3\u02e4\u0007\f\u0000\u0000\u02e4\u02e6\u0003"+
		"\u0082A\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000"+
		"\u0000\u0000\u02e8\u0081\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000"+
		"\u0000\u0000\u02ea\u02ef\u0003\u0084B\u0000\u02eb\u02ec\u0005\u00eb\u0000"+
		"\u0000\u02ec\u02ee\u0003\u0084B\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000"+
		"\u02ee\u02f1\u0001\u0000\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u0083\u0001\u0000\u0000\u0000"+
		"\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f2\u02f3\u0007\r\u0000\u0000\u02f3"+
		"\u02f6\u0003\u0084B\u0000\u02f4\u02f6\u0003\u0086C\u0000\u02f5\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f6\u0085\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f9\u0003\u0088D\u0000\u02f8\u02fa\u0007\u000e"+
		"\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000"+
		"\u0000\u0000\u02fa\u0087\u0001\u0000\u0000\u0000\u02fb\u02ff\u0003\u008c"+
		"F\u0000\u02fc\u02fe\u0003\u008aE\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fe\u0301\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000"+
		"\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0089\u0001\u0000\u0000\u0000"+
		"\u0301\u02ff\u0001\u0000\u0000\u0000\u0302\u0304\u0005\u010c\u0000\u0000"+
		"\u0303\u0305\u0003\u008eG\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0304"+
		"\u0305\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306"+
		"\u030e\u0005\u010d\u0000\u0000\u0307\u0308\u0005\u0112\u0000\u0000\u0308"+
		"\u030e\u0005\u011c\u0000\u0000\u0309\u030a\u0005\u010e\u0000\u0000\u030a"+
		"\u030b\u0003d2\u0000\u030b\u030c\u0005\u010f\u0000\u0000\u030c\u030e\u0001"+
		"\u0000\u0000\u0000\u030d\u0302\u0001\u0000\u0000\u0000\u030d\u0307\u0001"+
		"\u0000\u0000\u0000\u030d\u0309\u0001\u0000\u0000\u0000\u030e\u008b\u0001"+
		"\u0000\u0000\u0000\u030f\u0319\u0003\u0090H\u0000\u0310\u0311\u0005\u00be"+
		"\u0000\u0000\u0311\u0312\u0003\u008cF\u0000\u0312\u0314\u0005\u010c\u0000"+
		"\u0000\u0313\u0315\u0003\u008eG\u0000\u0314\u0313\u0001\u0000\u0000\u0000"+
		"\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000"+
		"\u0316\u0317\u0005\u010d\u0000\u0000\u0317\u0319\u0001\u0000\u0000\u0000"+
		"\u0318\u030f\u0001\u0000\u0000\u0000\u0318\u0310\u0001\u0000\u0000\u0000"+
		"\u0319\u008d\u0001\u0000\u0000\u0000\u031a\u031f\u0003d2\u0000\u031b\u031c"+
		"\u0005\u0111\u0000\u0000\u031c\u031e\u0003d2\u0000\u031d\u031b\u0001\u0000"+
		"\u0000\u0000\u031e\u0321\u0001\u0000\u0000\u0000\u031f\u031d\u0001\u0000"+
		"\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u008f\u0001\u0000"+
		"\u0000\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0322\u032f\u0005\u011c"+
		"\u0000\u0000\u0323\u032f\u0003\u0092I\u0000\u0324\u032f\u0003\u0094J\u0000"+
		"\u0325\u032f\u0003\u0096K\u0000\u0326\u032f\u0003\u009aM\u0000\u0327\u032f"+
		"\u0005\u00b6\u0000\u0000\u0328\u0329\u0005\u010c\u0000\u0000\u0329\u032a"+
		"\u0003d2\u0000\u032a\u032b\u0005\u010d\u0000\u0000\u032b\u032f\u0001\u0000"+
		"\u0000\u0000\u032c\u032f\u0003\u009eO\u0000\u032d\u032f\u0003\u00a2Q\u0000"+
		"\u032e\u0322\u0001\u0000\u0000\u0000\u032e\u0323\u0001\u0000\u0000\u0000"+
		"\u032e\u0324\u0001\u0000\u0000\u0000\u032e\u0325\u0001\u0000\u0000\u0000"+
		"\u032e\u0326\u0001\u0000\u0000\u0000\u032e\u0327\u0001\u0000\u0000\u0000"+
		"\u032e\u0328\u0001\u0000\u0000\u0000\u032e\u032c\u0001\u0000\u0000\u0000"+
		"\u032e\u032d\u0001\u0000\u0000\u0000\u032f\u0091\u0001\u0000\u0000\u0000"+
		"\u0330\u0331\u0007\u000f\u0000\u0000\u0331\u0093\u0001\u0000\u0000\u0000"+
		"\u0332\u033b\u0005\u010e\u0000\u0000\u0333\u0338\u0003d2\u0000\u0334\u0335"+
		"\u0005\u0111\u0000\u0000\u0335\u0337\u0003d2\u0000\u0336\u0334\u0001\u0000"+
		"\u0000\u0000\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000"+
		"\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033c\u0001\u0000"+
		"\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033b\u0333\u0001\u0000"+
		"\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000"+
		"\u0000\u0000\u033d\u033e\u0005\u010f\u0000\u0000\u033e\u0095\u0001\u0000"+
		"\u0000\u0000\u033f\u0348\u0005\u010a\u0000\u0000\u0340\u0345\u0003\u0098"+
		"L\u0000\u0341\u0342\u0005\u0111\u0000\u0000\u0342\u0344\u0003\u0098L\u0000"+
		"\u0343\u0341\u0001\u0000\u0000\u0000\u0344\u0347\u0001\u0000\u0000\u0000"+
		"\u0345\u0343\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000"+
		"\u0346\u0349\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000"+
		"\u0348\u0340\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000"+
		"\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034b\u0005\u010b\u0000\u0000"+
		"\u034b\u0097\u0001\u0000\u0000\u0000\u034c\u034d\u0007\u0010\u0000\u0000"+
		"\u034d\u034e\u0005\u0113\u0000\u0000\u034e\u0352\u0003d2\u0000\u034f\u0350"+
		"\u0005\u0107\u0000\u0000\u0350\u0352\u0003d2\u0000\u0351\u034c\u0001\u0000"+
		"\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0352\u0099\u0001\u0000"+
		"\u0000\u0000\u0353\u0354\u0003\u009cN\u0000\u0354\u0357\u0005\u0106\u0000"+
		"\u0000\u0355\u0358\u0003d2\u0000\u0356\u0358\u0003>\u001f\u0000\u0357"+
		"\u0355\u0001\u0000\u0000\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0358"+
		"\u009b\u0001\u0000\u0000\u0000\u0359\u0360\u0005\u011c\u0000\u0000\u035a"+
		"\u035c\u0005\u010c\u0000\u0000\u035b\u035d\u0003<\u001e\u0000\u035c\u035b"+
		"\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035e"+
		"\u0001\u0000\u0000\u0000\u035e\u0360\u0005\u010d\u0000\u0000\u035f\u0359"+
		"\u0001\u0000\u0000\u0000\u035f\u035a\u0001\u0000\u0000\u0000\u0360\u009d"+
		"\u0001\u0000\u0000\u0000\u0361\u0362\u0005\u00d2\u0000\u0000\u0362\u0363"+
		"\u0005\u0112\u0000\u0000\u0363\u0368\u0003\u00a0P\u0000\u0364\u0365\u0005"+
		"\u00d3\u0000\u0000\u0365\u0366\u0005\u0112\u0000\u0000\u0366\u0368\u0005"+
		"\u011c\u0000\u0000\u0367\u0361\u0001\u0000\u0000\u0000\u0367\u0364\u0001"+
		"\u0000\u0000\u0000\u0368\u009f\u0001\u0000\u0000\u0000\u0369\u036a\u0005"+
		"\u00db\u0000\u0000\u036a\u036b\u0005\u010c\u0000\u0000\u036b\u036c\u0003"+
		"d2\u0000\u036c\u036d\u0005\u010d\u0000\u0000\u036d\u0379\u0001\u0000\u0000"+
		"\u0000\u036e\u036f\u0005\u00dc\u0000\u0000\u036f\u0370\u0005\u010c\u0000"+
		"\u0000\u0370\u0371\u0003d2\u0000\u0371\u0372\u0005\u010d\u0000\u0000\u0372"+
		"\u0379\u0001\u0000\u0000\u0000\u0373\u0374\u0005\u00dd\u0000\u0000\u0374"+
		"\u0375\u0005\u010c\u0000\u0000\u0375\u0376\u0003d2\u0000\u0376\u0377\u0005"+
		"\u010d\u0000\u0000\u0377\u0379\u0001\u0000\u0000\u0000\u0378\u0369\u0001"+
		"\u0000\u0000\u0000\u0378\u036e\u0001\u0000\u0000\u0000\u0378\u0373\u0001"+
		"\u0000\u0000\u0000\u0379\u00a1\u0001\u0000\u0000\u0000\u037a\u037b\u0005"+
		"\u00d4\u0000\u0000\u037b\u037c\u0005\u0112\u0000\u0000\u037c\u037d\u0005"+
		"\u00e6\u0000\u0000\u037d\u037f\u0005\u010c\u0000\u0000\u037e\u0380\u0003"+
		"\u008eG\u0000\u037f\u037e\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000"+
		"\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u0382\u0005\u010d"+
		"\u0000\u0000\u0382\u00a3\u0001\u0000\u0000\u0000X\u00af\u00b1\u00ba\u00c3"+
		"\u00c9\u00d1\u00d7\u00df\u00e5\u00eb\u00f5\u0100\u0106\u010e\u0112\u0118"+
		"\u0125\u0133\u013e\u014a\u016b\u0172\u017a\u0181\u0194\u019a\u01a4\u01ae"+
		"\u01b5\u01be\u01c4\u01ca\u01cd\u01d2\u01d7\u01dc\u01e4\u01e8\u01ee\u01fb"+
		"\u0205\u0209\u0213\u021b\u0221\u0225\u0229\u023f\u0243\u025a\u025e\u0271"+
		"\u0275\u027b\u0286\u0290\u0297\u029f\u02a7\u02af\u02b7\u02bf\u02c7\u02cf"+
		"\u02d7\u02df\u02e7\u02ef\u02f5\u02f9\u02ff\u0304\u030d\u0314\u0318\u031f"+
		"\u032e\u0338\u033b\u0345\u0348\u0351\u0357\u035c\u035f\u0367\u0378\u037f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}