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
		TS_VAR=120, TS_LET=121, TS_CONST=122, TS_ANY_KW=123, TS_BIGINT_KW=124, 
		TS_ARRAY_KW=125, TS_STRING_KW=126, TS_NUMBER_KW=127, TS_BOOLEAN_KW=128, 
		TS_MAP_KW=129, TS_SET_KW=130, TS_DATE_KW=131, TS_OBJECT_KW=132, TS_IF=133, 
		TS_ELSE=134, TS_SWITCH=135, TS_CASE=136, TS_DEFAULT=137, TS_FOR=138, TS_WHILE=139, 
		TS_DO=140, TS_BREAK=141, TS_CONTINUE=142, TS_OF=143, TS_IN=144, TS_FUNCTION=145, 
		TS_RETURN=146, TS_TRUE=147, TS_FALSE=148, TS_NULL=149, TS_UNDEFINED=150, 
		TS_THIS=151, TS_NAN=152, TS_INFINITY=153, TS_TRY=154, TS_CATCH=155, TS_FINALLY=156, 
		TS_THROW=157, TS_EXCEPTION=158, TS_NEW=159, TS_CLASS=160, TS_EXTENDS=161, 
		TS_SUPER=162, TS_IMPLEMENTS=163, TS_INTERFACE=164, TS_CONSTRUCTOR=165, 
		TS_PRIVATE=166, TS_PROTECTED=167, TS_PUBLIC=168, TS_STATIC=169, TS_ENUM=170, 
		TS_PACKAGE=171, TS_IMPORT=172, TS_EXPORT=173, TS_FROM=174, TS_AS=175, 
		TS_TYPEOF=176, TS_INSTANCEOF=177, TS_DELETE=178, TS_DOCUMENT=179, TS_WINDOW=180, 
		TS_CONSOLE=181, TS_EVENT=182, TS_NODE=183, TS_ELEMENT=184, TS_LISTENER=185, 
		TS_LOCAL_STORAGE=186, TS_SESSION_STORAGE=187, TS_GET_ELEMENT=188, TS_GET_ELEMENTS=189, 
		TS_CREATE_EL=190, TS_INNER_TEXT=191, TS_INNER_HTML=192, TS_STYLE=193, 
		TS_ADD_LISTENER=194, TS_ON_CLICK=195, TS_ON_SUBMIT=196, TS_ON_CHANGE=197, 
		TS_ON_LOAD=198, TS_LOG=199, TS_ALERT=200, TS_PROMPT=201, IDENTIFIER=202, 
		CSS_UNIT=203, NUMBER=204, CSS_HEX_COLOR=205, TS_INC=206, TS_DEC=207, TS_EXP_ASSIGN=208, 
		TS_EXP=209, TS_ADD_ASSIGN=210, TS_SUB_ASSIGN=211, TS_MUL_ASSIGN=212, TS_DIV_ASSIGN=213, 
		TS_MOD_ASSIGN=214, TS_AND_ASSIGN=215, TS_OR_ASSIGN=216, TS_NULL_ASSIGN=217, 
		TS_SPREAD=218, TS_ARROW=219, TS_STREQ=220, TS_STRNEQ=221, TS_EQ=222, TS_NEQ=223, 
		TS_GTE=224, TS_LTE=225, TS_AND=226, TS_OR=227, TS_NULL_COAL=228, TS_URSH=229, 
		TS_RSH=230, TS_LSH=231, TS_ASSIGN=232, TS_BIT_AND=233, TS_BIT_OR=234, 
		TS_BIT_XOR=235, TS_QUESTION=236, LBRACE=237, RBRACE=238, COLON=239, SEMI=240, 
		COMMA=241, DOT=242, HASH=243, LPAREN=244, RPAREN=245, TILDE=246, DBL_COLON=247, 
		LBRACK=248, RBRACK=249, PLUS=250, MINUS=251, STAR=252, SLASH=253, PERCENT=254, 
		LT=255, GT=256, BANG=257, WS=258, BLOCK_COMMENT=259, LINE_COMMENT=260, 
		STRING=261;
	public static final int
		RULE_program = 0, RULE_attribute = 1, RULE_htmlElement = 2, RULE_htmlContent = 3, 
		RULE_text = 4, RULE_arabicKeyword = 5, RULE_cssRule = 6, RULE_selector = 7, 
		RULE_pseudoClass = 8, RULE_declarationList = 9, RULE_declaration = 10, 
		RULE_cssProperty = 11, RULE_cssValue = 12, RULE_cssValueToken = 13, RULE_cssFunction = 14, 
		RULE_tsType = 15, RULE_tsStatement = 16, RULE_interfaceDeclaration = 17, 
		RULE_interfaceMember = 18, RULE_variableDeclaration = 19, RULE_tsDeclaration = 20, 
		RULE_block = 21, RULE_assignmentStatement = 22, RULE_ifStatement = 23, 
		RULE_forLoop = 24, RULE_arrayLoop = 25, RULE_whileLoop = 26, RULE_functionDeclaration = 27, 
		RULE_parameterList = 28, RULE_returnStatement = 29, RULE_tryCatchStatement = 30, 
		RULE_expressionStatement = 31, RULE_builtInCall = 32, RULE_expression = 33, 
		RULE_assignmentExpression = 34, RULE_logicalOrExpression = 35, RULE_logicalAndExpression = 36, 
		RULE_equalityExpression = 37, RULE_relationalExpression = 38, RULE_additiveExpression = 39, 
		RULE_multiplicativeExpression = 40, RULE_memberExpression = 41, RULE_primaryExpression = 42, 
		RULE_arrayLiteral = 43, RULE_objectLiteral = 44, RULE_identifier = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "attribute", "htmlElement", "htmlContent", "text", "arabicKeyword", 
			"cssRule", "selector", "pseudoClass", "declarationList", "declaration", 
			"cssProperty", "cssValue", "cssValueToken", "cssFunction", "tsType", 
			"tsStatement", "interfaceDeclaration", "interfaceMember", "variableDeclaration", 
			"tsDeclaration", "block", "assignmentStatement", "ifStatement", "forLoop", 
			"arrayLoop", "whileLoop", "functionDeclaration", "parameterList", "returnStatement", 
			"tryCatchStatement", "expressionStatement", "builtInCall", "expression", 
			"assignmentExpression", "logicalOrExpression", "logicalAndExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"memberExpression", "primaryExpression", "arrayLiteral", "objectLiteral", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'/>'", "'\\u0645\\u0639\\u0631\\u0641'", "'\\u0635\\u0646\\u0641'", 
			"'\\u0645\\u0635\\u062F\\u0631'", "'\\u0648\\u062C\\u0647\\u0629'", "'\\u0639\\u0631\\u0636'", 
			"'\\u0645\\u0648\\u0642\\u0639'", "'\\u0639\\u0631\\u0636-\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629'", 
			"'\\u0637\\u0648\\u0644-\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629'", 
			"'\\u0627\\u0642\\u0635\\u0649-\\u0639\\u0631\\u0636'", "'\\u0627\\u0642\\u0644-\\u0639\\u0631\\u0636'", 
			"'\\u0627\\u0642\\u0635\\u0649-\\u0637\\u0648\\u0644'", "'\\u0627\\u0642\\u0644-\\u0637\\u0648\\u0644'", 
			"'\\u0647\\u0627\\u0645\\u0634'", "'\\u062D\\u0634\\u0648'", "'\\u0627\\u0637\\u0627\\u0631'", 
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
			"'\\u0638\\u0644-\\u0627\\u0644\\u0646\\u0635'", "'\\u0627\\u0632\\u0627\\u062D\\u0629-\\u0627\\u0644\\u0646\\u0635'", 
			"'\\u0627\\u0631\\u062A\\u0641\\u0627\\u0639-\\u0627\\u0644\\u0633\\u0637\\u0631'", 
			"'\\u062A\\u0628\\u0627\\u0639\\u062F-\\u0627\\u0644\\u0627\\u062D\\u0631\\u0641'", 
			"'\\u062A\\u0628\\u0627\\u0639\\u062F-\\u0627\\u0644\\u0643\\u0644\\u0645\\u0627\\u062A'", 
			"'\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629-\\u0627\\u0644\\u0628\\u064A\\u0636\\u0627\\u0621'", 
			"'\\u0627\\u062A\\u062C\\u0627\\u0647-\\u0627\\u0644\\u0643\\u062A\\u0627\\u0628\\u0629'", 
			"'\\u0646\\u0645\\u0637-\\u0627\\u0644\\u0643\\u062A\\u0627\\u0628\\u0629'", 
			"'\\u0627\\u0646\\u062D\\u0646\\u0627\\u0621-\\u0627\\u0644\\u0627\\u0637\\u0627\\u0631'", 
			"'\\u0633\\u0645\\u0643-\\u0627\\u0644\\u0627\\u0637\\u0627\\u0631'", 
			"'\\u0646\\u0645\\u0637-\\u0627\\u0644\\u0627\\u0637\\u0627\\u0631'", 
			"'\\u0644\\u0648\\u0646-\\u0627\\u0644\\u0627\\u0637\\u0627\\u0631'", 
			"'\\u062E\\u0637-\\u062E\\u0627\\u0631\\u062C\\u064A'", "'\\u0627\\u0639\\u0644\\u0649'", 
			"'\\u0627\\u0633\\u0641\\u0644'", "'\\u064A\\u0645\\u064A\\u0646'", "'\\u064A\\u0633\\u0627\\u0631'", 
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
			"'\\u0627\\u0648\\u0644\\u064A'", "'\\u063A\\u064A\\u0631-\\u0645\\u062D\\u062F\\u062F'", 
			"'\\u0644\\u0627-\\u0634\\u064A\\u0621'", "'\\u062A\\u0644\\u0642\\u0627\\u0626\\u064A'", 
			"'\\u0645\\u0631\\u0643\\u0632'", "'\\u0645\\u062A\\u0635\\u0644'", "'\\u0645\\u0642\\u0637\\u0639'", 
			"'\\u0645\\u0646\\u0642\\u0637'", "'\\u0645\\u0632\\u062F\\u0648\\u062C'", 
			"'\\u0645\\u062E\\u0641\\u064A'", "'\\u0643\\u062A\\u0644\\u0629'", "'\\u0633\\u0637\\u0631\\u064A'", 
			"'\\u0645\\u0631\\u0648\\u0646\\u0629'", "'\\u0645\\u0637\\u0644\\u0642'", 
			"'\\u0646\\u0633\\u0628\\u064A'", "'\\u0645\\u062B\\u0628\\u062A'", "'\\u0644\\u0627\\u0635\\u0642'", 
			"'\\u0633\\u0637\\u0631'", "'\\u0639\\u0645\\u0648\\u062F'", "'\\u0644\\u0641'", 
			"'\\u0645\\u0624\\u0634\\u0631'", "'\\u0639\\u0631\\u064A\\u0636'", "'\\u0645\\u0627\\u0626\\u0644'", 
			"'\\u0647\\u0627\\u0645'", "'\\u0631\\u0627\\u0628\\u0637'", "'\\u0646\\u0638\\u0627\\u0645-\\u0631-\\u062C-\\u0628'", 
			"'\\u0646\\u0638\\u0627\\u0645-\\u0631-\\u062C-\\u0628-\\u0627'", "'\\u062D\\u0633\\u0627\\u0628'", 
			"'\\u062F\\u0627\\u0644\\u0629-\\u0645\\u062A\\u063A\\u064A\\u0631'", 
			"'\\u062A\\u062F\\u0648\\u064A\\u0631'", "'\\u062A\\u0643\\u0628\\u064A\\u0631'", 
			"'\\u062A\\u063A\\u0628\\u064A\\u0634'", "'\\u0645\\u062A\\u063A\\u064A\\u0631'", 
			"'\\u062F\\u0639'", "'\\u062B\\u0627\\u0628\\u062A'", "'\\u0627\\u064A'", 
			"'\\u0631\\u0642\\u0645-\\u0643\\u0628\\u064A\\u0631'", "'\\u0645\\u0635\\u0641\\u0648\\u0641\\u0629'", 
			"'\\u0633\\u0644\\u0633\\u0644\\u0629'", "'\\u0639\\u062F\\u062F'", "'\\u0645\\u0646\\u0637\\u0642\\u064A'", 
			"'\\u062E\\u0631\\u064A\\u0637\\u0629'", "'\\u0645\\u062C\\u0645\\u0648\\u0639\\u0629'", 
			"'\\u062A\\u0627\\u0631\\u064A\\u062E'", "'\\u0643\\u0627\\u0626\\u0646'", 
			"'\\u0627\\u0630\\u0627'", null, "'\\u0627\\u062E\\u062A\\u0628\\u0631'", 
			"'\\u062D\\u0627\\u0644\\u0629'", "'\\u0628\\u0634\\u0643\\u0644-\\u0627\\u0641\\u062A\\u0631\\u0627\\u0636\\u064A'", 
			"'\\u062D\\u0644\\u0642\\u0629'", "'\\u0637\\u0627\\u0644\\u0645\\u0627'", 
			"'\\u0646\\u0641\\u0630'", "'\\u0627\\u064A\\u0642\\u0627\\u0641'", "'\\u062A\\u062C\\u0627\\u0648\\u0632'", 
			"'\\u0641\\u064A'", "'\\u0636\\u0645\\u0646'", "'\\u062F\\u0627\\u0644\\u0629'", 
			"'\\u0627\\u0631\\u062C\\u0639'", "'\\u0635\\u062D\\u064A\\u062D'", "'\\u062E\\u0627\\u0637\\u0626'", 
			"'\\u063A\\u064A\\u0631-\\u0645\\u0648\\u062C\\u0648\\u062F'", "'\\u063A\\u064A\\u0631-\\u0645\\u0639\\u0631\\u0641'", 
			"'\\u0647\\u0630\\u0627'", "'\\u0644\\u064A\\u0633-\\u0631\\u0642\\u0645'", 
			"'\\u0644\\u0627\\u0646\\u0647\\u0627\\u064A\\u0629'", "'\\u062D\\u0627\\u0648\\u0644'", 
			"'\\u0627\\u0645\\u0633\\u0643'", "'\\u0627\\u062E\\u064A\\u0631\\u0627'", 
			"'\\u0627\\u0637\\u0644\\u0642'", "'\\u0627\\u0633\\u062A\\u062B\\u0646\\u0627\\u0621'", 
			"'\\u0639\\u0646\\u0635\\u0631-\\u062C\\u062F\\u064A\\u062F'", null, 
			"'\\u064A\\u0631\\u062B-\\u0645\\u0646'", "'\\u0627\\u0644\\u0627\\u0628'", 
			"'\\u064A\\u0637\\u0628\\u0642'", "'\\u0648\\u0627\\u062C\\u0647\\u0629'", 
			"'\\u0645\\u0646\\u0634\\u0626'", "'\\u062E\\u0627\\u0635'", "'\\u0645\\u062D\\u0645\\u064A'", 
			"'\\u0639\\u0627\\u0645'", "'\\u0635\\u0641-\\u062B\\u0627\\u0628\\u062A'", 
			"'\\u062A\\u0639\\u062F\\u0627\\u062F'", "'\\u062D\\u0632\\u0645\\u0629'", 
			"'\\u0627\\u0633\\u062A\\u0648\\u0631\\u062F'", "'\\u062A\\u0635\\u062F\\u064A\\u0631'", 
			"'\\u0645\\u0646'", "'\\u0643\\u0645\\u0627'", "'\\u0645\\u0646-\\u0646\\u0648\\u0639'", 
			"'\\u0639\\u0646\\u0635\\u0631-\\u0645\\u0646'", "'\\u0627\\u062D\\u0630\\u0641'", 
			"'\\u0627\\u0644\\u0648\\u062B\\u064A\\u0642\\u0629'", "'\\u0627\\u0644\\u0646\\u0627\\u0641\\u0630\\u0629'", 
			"'\\u0627\\u0644\\u0645\\u0631\\u0627\\u0642\\u0628'", "'\\u062D\\u062F\\u062B'", 
			"'\\u0639\\u0642\\u062F\\u0629'", "'\\u0639\\u0646\\u0635\\u0631'", "'\\u0645\\u0633\\u062A\\u0645\\u0639'", 
			"'\\u062A\\u062E\\u0632\\u064A\\u0646-\\u0645\\u062D\\u0644\\u064A'", 
			"'\\u062A\\u062E\\u0632\\u064A\\u0646-\\u062C\\u0644\\u0633\\u0629'", 
			"'\\u0627\\u062D\\u0636\\u0631\\u0639\\u0646\\u0635\\u0631'", "'\\u0627\\u062D\\u0636\\u0631\\u0639\\u0646\\u0627\\u0635\\u0631'", 
			"'\\u0627\\u0646\\u0634\\u0626-\\u0639\\u0646\\u0635\\u0631'", "'\\u0627\\u0644\\u0646\\u0635-\\u0627\\u0644\\u062F\\u0627\\u062E\\u0644\\u064A'", 
			"'\\u0643\\u0648\\u062F-html'", "'\\u0627\\u0644\\u062A\\u0646\\u0633\\u064A\\u0642'", 
			null, "'\\u0639\\u0646\\u062F-\\u0627\\u0644\\u0646\\u0642\\u0631'", 
			"'\\u0639\\u0646\\u062F-\\u0627\\u0644\\u0627\\u0631\\u0633\\u0627\\u0644'", 
			"'\\u0639\\u0646\\u062F-\\u0627\\u0644\\u062A\\u063A\\u064A\\u064A\\u0631'", 
			"'\\u0639\\u0646\\u062F-\\u0627\\u0644\\u062A\\u062D\\u0645\\u064A\\u0644'", 
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
			"CSS_ROTATE_FUNC", "CSS_SCALE_FUNC", "CSS_BLUR_FUNC", "TS_VAR", "TS_LET", 
			"TS_CONST", "TS_ANY_KW", "TS_BIGINT_KW", "TS_ARRAY_KW", "TS_STRING_KW", 
			"TS_NUMBER_KW", "TS_BOOLEAN_KW", "TS_MAP_KW", "TS_SET_KW", "TS_DATE_KW", 
			"TS_OBJECT_KW", "TS_IF", "TS_ELSE", "TS_SWITCH", "TS_CASE", "TS_DEFAULT", 
			"TS_FOR", "TS_WHILE", "TS_DO", "TS_BREAK", "TS_CONTINUE", "TS_OF", "TS_IN", 
			"TS_FUNCTION", "TS_RETURN", "TS_TRUE", "TS_FALSE", "TS_NULL", "TS_UNDEFINED", 
			"TS_THIS", "TS_NAN", "TS_INFINITY", "TS_TRY", "TS_CATCH", "TS_FINALLY", 
			"TS_THROW", "TS_EXCEPTION", "TS_NEW", "TS_CLASS", "TS_EXTENDS", "TS_SUPER", 
			"TS_IMPLEMENTS", "TS_INTERFACE", "TS_CONSTRUCTOR", "TS_PRIVATE", "TS_PROTECTED", 
			"TS_PUBLIC", "TS_STATIC", "TS_ENUM", "TS_PACKAGE", "TS_IMPORT", "TS_EXPORT", 
			"TS_FROM", "TS_AS", "TS_TYPEOF", "TS_INSTANCEOF", "TS_DELETE", "TS_DOCUMENT", 
			"TS_WINDOW", "TS_CONSOLE", "TS_EVENT", "TS_NODE", "TS_ELEMENT", "TS_LISTENER", 
			"TS_LOCAL_STORAGE", "TS_SESSION_STORAGE", "TS_GET_ELEMENT", "TS_GET_ELEMENTS", 
			"TS_CREATE_EL", "TS_INNER_TEXT", "TS_INNER_HTML", "TS_STYLE", "TS_ADD_LISTENER", 
			"TS_ON_CLICK", "TS_ON_SUBMIT", "TS_ON_CHANGE", "TS_ON_LOAD", "TS_LOG", 
			"TS_ALERT", "TS_PROMPT", "IDENTIFIER", "CSS_UNIT", "NUMBER", "CSS_HEX_COLOR", 
			"TS_INC", "TS_DEC", "TS_EXP_ASSIGN", "TS_EXP", "TS_ADD_ASSIGN", "TS_SUB_ASSIGN", 
			"TS_MUL_ASSIGN", "TS_DIV_ASSIGN", "TS_MOD_ASSIGN", "TS_AND_ASSIGN", "TS_OR_ASSIGN", 
			"TS_NULL_ASSIGN", "TS_SPREAD", "TS_ARROW", "TS_STREQ", "TS_STRNEQ", "TS_EQ", 
			"TS_NEQ", "TS_GTE", "TS_LTE", "TS_AND", "TS_OR", "TS_NULL_COAL", "TS_URSH", 
			"TS_RSH", "TS_LSH", "TS_ASSIGN", "TS_BIT_AND", "TS_BIT_OR", "TS_BIT_XOR", 
			"TS_QUESTION", "LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", "DOT", "HASH", 
			"LPAREN", "RPAREN", "TILDE", "DBL_COLON", "LBRACK", "RBRACK", "PLUS", 
			"MINUS", "STAR", "SLASH", "PERCENT", "LT", "GT", "BANG", "WS", "BLOCK_COMMENT", 
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_TAG_START || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15832967439974401L) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 2744383173554273L) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & 4612310815909871663L) != 0)) {
				{
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(92);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(93);
					cssRule();
					}
					break;
				case 3:
					{
					setState(94);
					tsStatement();
					}
					break;
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
		public TerminalNode TS_ASSIGN() { return getToken(ArabicHtmlParser.TS_ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public IdAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassAttributeContext extends AttributeContext {
		public TerminalNode ATTR_CLASS() { return getToken(ArabicHtmlParser.ATTR_CLASS, 0); }
		public TerminalNode TS_ASSIGN() { return getToken(ArabicHtmlParser.TS_ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public ClassAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HrefAttributeContext extends AttributeContext {
		public TerminalNode ATTR_HREF() { return getToken(ArabicHtmlParser.ATTR_HREF, 0); }
		public TerminalNode TS_ASSIGN() { return getToken(ArabicHtmlParser.TS_ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public HrefAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SrcAttributeContext extends AttributeContext {
		public TerminalNode ATTR_SRC() { return getToken(ArabicHtmlParser.ATTR_SRC, 0); }
		public TerminalNode TS_ASSIGN() { return getToken(ArabicHtmlParser.TS_ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public SrcAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_attribute);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR_ID:
				_localctx = new IdAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(ATTR_ID);
				setState(103);
				match(TS_ASSIGN);
				setState(104);
				match(STRING);
				}
				break;
			case ATTR_CLASS:
				_localctx = new ClassAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(ATTR_CLASS);
				setState(106);
				match(TS_ASSIGN);
				setState(107);
				match(STRING);
				}
				break;
			case ATTR_SRC:
				_localctx = new SrcAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(ATTR_SRC);
				setState(109);
				match(TS_ASSIGN);
				setState(110);
				match(STRING);
				}
				break;
			case ATTR_HREF:
				_localctx = new HrefAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(ATTR_HREF);
				setState(112);
				match(TS_ASSIGN);
				setState(113);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ParentElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(OPEN_TAG_START);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
					{
					{
					setState(117);
					attribute();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(GT);
				setState(124);
				htmlContent();
				setState(125);
				match(CLOSE_TAG);
				}
				break;
			case 2:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(OPEN_TAG_START);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
					{
					{
					setState(128);
					attribute();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
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
		public List<TsStatementContext> tsStatement() {
			return getRuleContexts(TsStatementContext.class);
		}
		public TsStatementContext tsStatement(int i) {
			return getRuleContext(TsStatementContext.class,i);
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 196868L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 304063344136945665L) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 2744383173557347L) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & 4652843221146140719L) != 0)) {
				{
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(137);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(138);
					tsStatement();
					}
					break;
				case 3:
					{
					setState(139);
					cssRule();
					}
					break;
				case 4:
					{
					setState(140);
					text();
					}
					break;
				}
				}
				setState(145);
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
		public TerminalNode MINUS() { return getToken(ArabicHtmlParser.MINUS, 0); }
		public TerminalNode TS_ASSIGN() { return getToken(ArabicHtmlParser.TS_ASSIGN, 0); }
		public TerminalNode PERCENT() { return getToken(ArabicHtmlParser.PERCENT, 0); }
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(NUMBER);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(MINUS);
				}
				break;
			case TS_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(TS_ASSIGN);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(PERCENT);
				}
				break;
			case CSS_DISPLAY:
			case CSS_MARGIN:
			case CSS_PADDING:
			case CSS_CENTER:
			case CSS_BLOCK:
			case TS_VAR:
			case TS_LET:
			case TS_CONST:
			case TS_NUMBER_KW:
			case TS_IF:
			case TS_ELSE:
			case TS_FOR:
			case TS_WHILE:
			case TS_OF:
			case TS_IN:
			case TS_FUNCTION:
			case TS_RETURN:
			case TS_TRUE:
			case TS_FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
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
		public TerminalNode TS_IF() { return getToken(ArabicHtmlParser.TS_IF, 0); }
		public TerminalNode TS_ELSE() { return getToken(ArabicHtmlParser.TS_ELSE, 0); }
		public TerminalNode TS_FOR() { return getToken(ArabicHtmlParser.TS_FOR, 0); }
		public TerminalNode TS_WHILE() { return getToken(ArabicHtmlParser.TS_WHILE, 0); }
		public TerminalNode TS_FUNCTION() { return getToken(ArabicHtmlParser.TS_FUNCTION, 0); }
		public TerminalNode TS_RETURN() { return getToken(ArabicHtmlParser.TS_RETURN, 0); }
		public TerminalNode TS_OF() { return getToken(ArabicHtmlParser.TS_OF, 0); }
		public TerminalNode TS_IN() { return getToken(ArabicHtmlParser.TS_IN, 0); }
		public TerminalNode TS_VAR() { return getToken(ArabicHtmlParser.TS_VAR, 0); }
		public TerminalNode TS_LET() { return getToken(ArabicHtmlParser.TS_LET, 0); }
		public TerminalNode TS_CONST() { return getToken(ArabicHtmlParser.TS_CONST, 0); }
		public TerminalNode TS_TRUE() { return getToken(ArabicHtmlParser.TS_TRUE, 0); }
		public TerminalNode TS_FALSE() { return getToken(ArabicHtmlParser.TS_FALSE, 0); }
		public TerminalNode CSS_DISPLAY() { return getToken(ArabicHtmlParser.CSS_DISPLAY, 0); }
		public TerminalNode CSS_MARGIN() { return getToken(ArabicHtmlParser.CSS_MARGIN, 0); }
		public TerminalNode CSS_PADDING() { return getToken(ArabicHtmlParser.CSS_PADDING, 0); }
		public TerminalNode CSS_CENTER() { return getToken(ArabicHtmlParser.CSS_CENTER, 0); }
		public TerminalNode CSS_BLOCK() { return getToken(ArabicHtmlParser.CSS_BLOCK, 0); }
		public TerminalNode TS_NUMBER_KW() { return getToken(ArabicHtmlParser.TS_NUMBER_KW, 0); }
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
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 196864L) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 142081127803256897L) != 0)) ) {
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
			setState(157);
			selector();
			setState(158);
			match(LBRACE);
			setState(159);
			declarationList();
			setState(160);
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
		public PseudoClassContext pseudoClass() {
			return getRuleContext(PseudoClassContext.class,0);
		}
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
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_CALC_FUNC:
			case TS_ELEMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				identifier();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(163);
					pseudoClass();
					}
				}

				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(HASH);
				setState(167);
				identifier();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(168);
					pseudoClass();
					}
				}

				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(DOT);
				setState(172);
				identifier();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(173);
					pseudoClass();
					}
				}

				}
				break;
			case CSS_MEDIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(CSS_MEDIA);
				setState(177);
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
	public static class PseudoClassContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ArabicHtmlParser.COLON, 0); }
		public TerminalNode CSS_HOVER() { return getToken(ArabicHtmlParser.CSS_HOVER, 0); }
		public TerminalNode CSS_ACTIVE() { return getToken(ArabicHtmlParser.CSS_ACTIVE, 0); }
		public TerminalNode CSS_FOCUS() { return getToken(ArabicHtmlParser.CSS_FOCUS, 0); }
		public TerminalNode CSS_VISITED() { return getToken(ArabicHtmlParser.CSS_VISITED, 0); }
		public TerminalNode CSS_ENABLED() { return getToken(ArabicHtmlParser.CSS_ENABLED, 0); }
		public TerminalNode CSS_DISABLED() { return getToken(ArabicHtmlParser.CSS_DISABLED, 0); }
		public TerminalNode CSS_CHECKED() { return getToken(ArabicHtmlParser.CSS_CHECKED, 0); }
		public TerminalNode CSS_BEFORE() { return getToken(ArabicHtmlParser.CSS_BEFORE, 0); }
		public TerminalNode CSS_AFTER() { return getToken(ArabicHtmlParser.CSS_AFTER, 0); }
		public TerminalNode CSS_PLACEHOLDER() { return getToken(ArabicHtmlParser.CSS_PLACEHOLDER, 0); }
		public TerminalNode CSS_SELECTION() { return getToken(ArabicHtmlParser.CSS_SELECTION, 0); }
		public PseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClass; }
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pseudoClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(COLON);
			setState(181);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 2047L) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -256L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4063L) != 0)) {
				{
				setState(183);
				declaration();
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(193);
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
		enterRule(_localctx, 20, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			cssProperty();
			setState(197);
			match(COLON);
			setState(198);
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
		public TerminalNode CSS_TOP() { return getToken(ArabicHtmlParser.CSS_TOP, 0); }
		public TerminalNode CSS_BOTTOM() { return getToken(ArabicHtmlParser.CSS_BOTTOM, 0); }
		public TerminalNode CSS_RIGHT() { return getToken(ArabicHtmlParser.CSS_RIGHT, 0); }
		public TerminalNode CSS_LEFT() { return getToken(ArabicHtmlParser.CSS_LEFT, 0); }
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -256L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4063L) != 0)) ) {
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
		public List<CssValueTokenContext> cssValueToken() {
			return getRuleContexts(CssValueTokenContext.class);
		}
		public CssValueTokenContext cssValueToken(int i) {
			return getRuleContext(CssValueTokenContext.class,i);
		}
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cssValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				cssValueToken();
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_FLEX || _la==CSS_GRID || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 35958428270592015L) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & 576460752303423503L) != 0) );
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
	public static class CssValueTokenContext extends ParserRuleContext {
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
		public TerminalNode CSS_FLEX() { return getToken(ArabicHtmlParser.CSS_FLEX, 0); }
		public TerminalNode CSS_GRID() { return getToken(ArabicHtmlParser.CSS_GRID, 0); }
		public TerminalNode CSS_RIGHT() { return getToken(ArabicHtmlParser.CSS_RIGHT, 0); }
		public TerminalNode CSS_LEFT() { return getToken(ArabicHtmlParser.CSS_LEFT, 0); }
		public TerminalNode CSS_TOP() { return getToken(ArabicHtmlParser.CSS_TOP, 0); }
		public TerminalNode CSS_BOTTOM() { return getToken(ArabicHtmlParser.CSS_BOTTOM, 0); }
		public TerminalNode CSS_POINTER() { return getToken(ArabicHtmlParser.CSS_POINTER, 0); }
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public CssValueTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueToken; }
	}

	public final CssValueTokenContext cssValueToken() throws RecognitionException {
		CssValueTokenContext _localctx = new CssValueTokenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cssValueToken);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(NUMBER);
				}
				break;
			case CSS_UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(CSS_UNIT);
				}
				break;
			case CSS_HEX_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(CSS_HEX_COLOR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				match(STRING);
				}
				break;
			case CSS_INHERIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(CSS_INHERIT);
				}
				break;
			case CSS_INITIAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
				match(CSS_INITIAL);
				}
				break;
			case CSS_UNSET:
				enterOuterAlt(_localctx, 8);
				{
				setState(214);
				match(CSS_UNSET);
				}
				break;
			case CSS_NONE:
				enterOuterAlt(_localctx, 9);
				{
				setState(215);
				match(CSS_NONE);
				}
				break;
			case CSS_AUTO:
				enterOuterAlt(_localctx, 10);
				{
				setState(216);
				match(CSS_AUTO);
				}
				break;
			case CSS_CENTER:
				enterOuterAlt(_localctx, 11);
				{
				setState(217);
				match(CSS_CENTER);
				}
				break;
			case CSS_SOLID:
				enterOuterAlt(_localctx, 12);
				{
				setState(218);
				match(CSS_SOLID);
				}
				break;
			case CSS_DASHED:
				enterOuterAlt(_localctx, 13);
				{
				setState(219);
				match(CSS_DASHED);
				}
				break;
			case CSS_DOTTED:
				enterOuterAlt(_localctx, 14);
				{
				setState(220);
				match(CSS_DOTTED);
				}
				break;
			case CSS_DOUBLE:
				enterOuterAlt(_localctx, 15);
				{
				setState(221);
				match(CSS_DOUBLE);
				}
				break;
			case CSS_HIDDEN:
				enterOuterAlt(_localctx, 16);
				{
				setState(222);
				match(CSS_HIDDEN);
				}
				break;
			case CSS_BLOCK:
				enterOuterAlt(_localctx, 17);
				{
				setState(223);
				match(CSS_BLOCK);
				}
				break;
			case CSS_INLINE:
				enterOuterAlt(_localctx, 18);
				{
				setState(224);
				match(CSS_INLINE);
				}
				break;
			case CSS_FLEX_VALUE:
				enterOuterAlt(_localctx, 19);
				{
				setState(225);
				match(CSS_FLEX_VALUE);
				}
				break;
			case CSS_ABSOLUTE:
				enterOuterAlt(_localctx, 20);
				{
				setState(226);
				match(CSS_ABSOLUTE);
				}
				break;
			case CSS_RELATIVE:
				enterOuterAlt(_localctx, 21);
				{
				setState(227);
				match(CSS_RELATIVE);
				}
				break;
			case CSS_FIXED:
				enterOuterAlt(_localctx, 22);
				{
				setState(228);
				match(CSS_FIXED);
				}
				break;
			case CSS_STICKY:
				enterOuterAlt(_localctx, 23);
				{
				setState(229);
				match(CSS_STICKY);
				}
				break;
			case CSS_ROW:
				enterOuterAlt(_localctx, 24);
				{
				setState(230);
				match(CSS_ROW);
				}
				break;
			case CSS_COLUMN:
				enterOuterAlt(_localctx, 25);
				{
				setState(231);
				match(CSS_COLUMN);
				}
				break;
			case CSS_WRAP:
				enterOuterAlt(_localctx, 26);
				{
				setState(232);
				match(CSS_WRAP);
				}
				break;
			case CSS_BOLD:
				enterOuterAlt(_localctx, 27);
				{
				setState(233);
				match(CSS_BOLD);
				}
				break;
			case CSS_ITALIC:
				enterOuterAlt(_localctx, 28);
				{
				setState(234);
				match(CSS_ITALIC);
				}
				break;
			case CSS_FLEX:
				enterOuterAlt(_localctx, 29);
				{
				setState(235);
				match(CSS_FLEX);
				}
				break;
			case CSS_GRID:
				enterOuterAlt(_localctx, 30);
				{
				setState(236);
				match(CSS_GRID);
				}
				break;
			case CSS_RIGHT:
				enterOuterAlt(_localctx, 31);
				{
				setState(237);
				match(CSS_RIGHT);
				}
				break;
			case CSS_LEFT:
				enterOuterAlt(_localctx, 32);
				{
				setState(238);
				match(CSS_LEFT);
				}
				break;
			case CSS_TOP:
				enterOuterAlt(_localctx, 33);
				{
				setState(239);
				match(CSS_TOP);
				}
				break;
			case CSS_BOTTOM:
				enterOuterAlt(_localctx, 34);
				{
				setState(240);
				match(CSS_BOTTOM);
				}
				break;
			case CSS_POINTER:
				enterOuterAlt(_localctx, 35);
				{
				setState(241);
				match(CSS_POINTER);
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
				enterOuterAlt(_localctx, 36);
				{
				setState(242);
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
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
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
		enterRule(_localctx, 28, RULE_cssFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(246);
			match(LPAREN);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_FLEX || _la==CSS_GRID || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 35958428270592015L) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & 576460752303423503L) != 0)) {
				{
				setState(247);
				cssValue();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(248);
					match(COMMA);
					setState(249);
					cssValue();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(257);
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
	public static class TsTypeContext extends ParserRuleContext {
		public TerminalNode TS_STRING_KW() { return getToken(ArabicHtmlParser.TS_STRING_KW, 0); }
		public TerminalNode TS_NUMBER_KW() { return getToken(ArabicHtmlParser.TS_NUMBER_KW, 0); }
		public TerminalNode TS_BOOLEAN_KW() { return getToken(ArabicHtmlParser.TS_BOOLEAN_KW, 0); }
		public TerminalNode TS_ANY_KW() { return getToken(ArabicHtmlParser.TS_ANY_KW, 0); }
		public TerminalNode TS_BIGINT_KW() { return getToken(ArabicHtmlParser.TS_BIGINT_KW, 0); }
		public TsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsType; }
	}

	public final TsTypeContext tsType() throws RecognitionException {
		TsTypeContext _localctx = new TsTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tsType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & 59L) != 0)) ) {
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
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ArrayLoopContext arrayLoop() {
			return getRuleContext(ArrayLoopContext.class,0);
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
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsStatement; }
	}

	public final TsStatementContext tsStatement() throws RecognitionException {
		TsStatementContext _localctx = new TsStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tsStatement);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				tsDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				arrayLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				forLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				tryCatchStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(270);
				expressionStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(271);
				builtInCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(272);
				block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(273);
				interfaceDeclaration();
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
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode TS_INTERFACE() { return getToken(ArabicHtmlParser.TS_INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(ArabicHtmlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArabicHtmlParser.RBRACE, 0); }
		public List<InterfaceMemberContext> interfaceMember() {
			return getRuleContexts(InterfaceMemberContext.class);
		}
		public InterfaceMemberContext interfaceMember(int i) {
			return getRuleContext(InterfaceMemberContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(TS_INTERFACE);
			setState(277);
			match(IDENTIFIER);
			setState(278);
			match(LBRACE);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(279);
				interfaceMember();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
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
	public static class InterfaceMemberContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ArabicHtmlParser.COLON, 0); }
		public TsTypeContext tsType() {
			return getRuleContext(TsTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArabicHtmlParser.SEMI, 0); }
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(IDENTIFIER);
			setState(288);
			match(COLON);
			setState(289);
			tsType();
			setState(290);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
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
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(293);
			identifier();
			setState(294);
			match(COLON);
			setState(295);
			tsType();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TS_ASSIGN) {
				{
				setState(296);
				match(TS_ASSIGN);
				setState(297);
				expression();
				}
			}

			setState(300);
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
	public static class TsDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ArabicHtmlParser.SEMI, 0); }
		public TerminalNode TS_VAR() { return getToken(ArabicHtmlParser.TS_VAR, 0); }
		public TerminalNode TS_LET() { return getToken(ArabicHtmlParser.TS_LET, 0); }
		public TerminalNode TS_CONST() { return getToken(ArabicHtmlParser.TS_CONST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ArabicHtmlParser.COLON, 0); }
		public TsTypeContext tsType() {
			return getRuleContext(TsTypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(ArabicHtmlParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ArabicHtmlParser.RBRACK, 0); }
		public TerminalNode TS_ASSIGN() { return getToken(ArabicHtmlParser.TS_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_tsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(303);
				identifier();
				setState(304);
				match(COLON);
				setState(305);
				tsType();
				setState(306);
				match(LBRACK);
				setState(307);
				match(RBRACK);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TS_ASSIGN) {
					{
					setState(308);
					match(TS_ASSIGN);
					setState(309);
					arrayLiteral();
					}
				}

				}
				break;
			case 2:
				{
				setState(312);
				identifier();
				setState(313);
				match(COLON);
				setState(314);
				tsType();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TS_ASSIGN) {
					{
					setState(315);
					match(TS_ASSIGN);
					setState(316);
					expression();
					}
				}

				}
				break;
			case 3:
				{
				setState(319);
				identifier();
				setState(320);
				match(TS_ASSIGN);
				setState(321);
				expression();
				}
				break;
			}
			setState(325);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ArabicHtmlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArabicHtmlParser.RBRACE, 0); }
		public List<TsStatementContext> tsStatement() {
			return getRuleContexts(TsStatementContext.class);
		}
		public TsStatementContext tsStatement(int i) {
			return getRuleContext(TsStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(LBRACE);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 563773538828513L) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 288230376200994855L) != 0) || ((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & 131089L) != 0)) {
				{
				{
				setState(328);
				tsStatement();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArabicHtmlParser.SEMI, 0); }
		public TerminalNode TS_ASSIGN() { return getToken(ArabicHtmlParser.TS_ASSIGN, 0); }
		public TerminalNode TS_ADD_ASSIGN() { return getToken(ArabicHtmlParser.TS_ADD_ASSIGN, 0); }
		public TerminalNode TS_SUB_ASSIGN() { return getToken(ArabicHtmlParser.TS_SUB_ASSIGN, 0); }
		public TerminalNode TS_MUL_ASSIGN() { return getToken(ArabicHtmlParser.TS_MUL_ASSIGN, 0); }
		public TerminalNode TS_DIV_ASSIGN() { return getToken(ArabicHtmlParser.TS_DIV_ASSIGN, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			identifier();
			setState(337);
			_la = _input.LA(1);
			if ( !(((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & 4194319L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(338);
			expression();
			setState(339);
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
		public TerminalNode TS_IF() { return getToken(ArabicHtmlParser.TS_IF, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public List<TsStatementContext> tsStatement() {
			return getRuleContexts(TsStatementContext.class);
		}
		public TsStatementContext tsStatement(int i) {
			return getRuleContext(TsStatementContext.class,i);
		}
		public TerminalNode TS_ELSE() { return getToken(ArabicHtmlParser.TS_ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(TS_IF);
			setState(342);
			match(LPAREN);
			setState(343);
			expression();
			setState(344);
			match(RPAREN);
			setState(345);
			tsStatement();
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(346);
				match(TS_ELSE);
				setState(347);
				tsStatement();
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
		public TerminalNode TS_FOR() { return getToken(ArabicHtmlParser.TS_FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ArabicHtmlParser.SEMI, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(TS_FOR);
			setState(351);
			match(LPAREN);
			{
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TS_VAR:
			case TS_LET:
			case TS_CONST:
				{
				setState(352);
				variableDeclaration();
				}
				break;
			case CSS_CALC_FUNC:
			case TS_FUNCTION:
			case TS_TRUE:
			case TS_FALSE:
			case TS_NULL:
			case TS_UNDEFINED:
			case TS_THIS:
			case TS_NAN:
			case TS_DOCUMENT:
			case TS_WINDOW:
			case TS_ELEMENT:
			case IDENTIFIER:
			case NUMBER:
			case LBRACE:
			case LPAREN:
			case LBRACK:
			case STRING:
				{
				setState(353);
				assignmentExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356);
			expression();
			setState(357);
			match(SEMI);
			setState(358);
			expression();
			}
			setState(360);
			match(RPAREN);
			setState(361);
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
	public static class ArrayLoopContext extends ParserRuleContext {
		public TerminalNode TS_FOR() { return getToken(ArabicHtmlParser.TS_FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public TerminalNode TS_CONST() { return getToken(ArabicHtmlParser.TS_CONST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TS_OF() { return getToken(ArabicHtmlParser.TS_OF, 0); }
		public TerminalNode TS_IN() { return getToken(ArabicHtmlParser.TS_IN, 0); }
		public ArrayLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLoop; }
	}

	public final ArrayLoopContext arrayLoop() throws RecognitionException {
		ArrayLoopContext _localctx = new ArrayLoopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(TS_FOR);
			setState(364);
			match(LPAREN);
			setState(365);
			match(TS_CONST);
			setState(366);
			identifier();
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==TS_OF || _la==TS_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(368);
			expression();
			setState(369);
			match(RPAREN);
			setState(370);
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
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode TS_WHILE() { return getToken(ArabicHtmlParser.TS_WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(TS_WHILE);
			setState(373);
			match(LPAREN);
			setState(374);
			expression();
			setState(375);
			match(RPAREN);
			setState(376);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode TS_FUNCTION() { return getToken(ArabicHtmlParser.TS_FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(TS_FUNCTION);
			setState(379);
			identifier();
			setState(380);
			match(LPAREN);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(381);
				parameterList();
				}
			}

			setState(384);
			match(RPAREN);
			setState(385);
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
		public List<TerminalNode> COLON() { return getTokens(ArabicHtmlParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ArabicHtmlParser.COLON, i);
		}
		public List<TsTypeContext> tsType() {
			return getRuleContexts(TsTypeContext.class);
		}
		public TsTypeContext tsType(int i) {
			return getRuleContext(TsTypeContext.class,i);
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
		enterRule(_localctx, 56, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(IDENTIFIER);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(388);
				match(COLON);
				setState(389);
				tsType();
				}
			}

			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(392);
				match(COMMA);
				setState(393);
				match(IDENTIFIER);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(394);
					match(COLON);
					setState(395);
					tsType();
					}
				}

				}
				}
				setState(402);
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
		public TerminalNode TS_RETURN() { return getToken(ArabicHtmlParser.TS_RETURN, 0); }
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
		enterRule(_localctx, 58, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(TS_RETURN);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 271656681473L) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 288230376193654819L) != 0) || ((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & 131089L) != 0)) {
				{
				setState(404);
				expression();
				}
			}

			setState(407);
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
		public TerminalNode TS_TRY() { return getToken(ArabicHtmlParser.TS_TRY, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode TS_CATCH() { return getToken(ArabicHtmlParser.TS_CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public TerminalNode TS_FINALLY() { return getToken(ArabicHtmlParser.TS_FINALLY, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(TS_TRY);
			setState(410);
			block();
			setState(411);
			match(TS_CATCH);
			setState(412);
			match(LPAREN);
			setState(413);
			identifier();
			setState(414);
			match(RPAREN);
			setState(415);
			block();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TS_FINALLY) {
				{
				setState(416);
				match(TS_FINALLY);
				setState(417);
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
		enterRule(_localctx, 62, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			expression();
			setState(421);
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
		public TerminalNode TS_CONSOLE() { return getToken(ArabicHtmlParser.TS_CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(ArabicHtmlParser.DOT, 0); }
		public TerminalNode TS_LOG() { return getToken(ArabicHtmlParser.TS_LOG, 0); }
		public TerminalNode TS_ALERT() { return getToken(ArabicHtmlParser.TS_ALERT, 0); }
		public TerminalNode TS_PROMPT() { return getToken(ArabicHtmlParser.TS_PROMPT, 0); }
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
		enterRule(_localctx, 64, RULE_builtInCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TS_CONSOLE:
				{
				setState(423);
				match(TS_CONSOLE);
				setState(424);
				match(DOT);
				setState(425);
				match(TS_LOG);
				}
				break;
			case TS_LOG:
				{
				setState(426);
				match(TS_LOG);
				}
				break;
			case TS_ALERT:
				{
				setState(427);
				match(TS_ALERT);
				}
				break;
			case TS_PROMPT:
				{
				setState(428);
				match(TS_PROMPT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(431);
			match(LPAREN);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 271656681473L) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 288230376193654819L) != 0) || ((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & 131089L) != 0)) {
				{
				setState(432);
				expression();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(433);
					match(COMMA);
					setState(434);
					expression();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(442);
			match(RPAREN);
			setState(443);
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
		enterRule(_localctx, 66, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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
		public TerminalNode TS_ASSIGN() { return getToken(ArabicHtmlParser.TS_ASSIGN, 0); }
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
		enterRule(_localctx, 68, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			logicalOrExpression();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TS_ASSIGN) {
				{
				setState(448);
				match(TS_ASSIGN);
				setState(449);
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
		public List<TerminalNode> TS_OR() { return getTokens(ArabicHtmlParser.TS_OR); }
		public TerminalNode TS_OR(int i) {
			return getToken(ArabicHtmlParser.TS_OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			logicalAndExpression();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TS_OR) {
				{
				{
				setState(453);
				match(TS_OR);
				setState(454);
				logicalAndExpression();
				}
				}
				setState(459);
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
		public List<TerminalNode> TS_AND() { return getTokens(ArabicHtmlParser.TS_AND); }
		public TerminalNode TS_AND(int i) {
			return getToken(ArabicHtmlParser.TS_AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			equalityExpression();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TS_AND) {
				{
				{
				setState(461);
				match(TS_AND);
				setState(462);
				equalityExpression();
				}
				}
				setState(467);
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
		public List<TerminalNode> TS_STREQ() { return getTokens(ArabicHtmlParser.TS_STREQ); }
		public TerminalNode TS_STREQ(int i) {
			return getToken(ArabicHtmlParser.TS_STREQ, i);
		}
		public List<TerminalNode> TS_STRNEQ() { return getTokens(ArabicHtmlParser.TS_STRNEQ); }
		public TerminalNode TS_STRNEQ(int i) {
			return getToken(ArabicHtmlParser.TS_STRNEQ, i);
		}
		public List<TerminalNode> TS_EQ() { return getTokens(ArabicHtmlParser.TS_EQ); }
		public TerminalNode TS_EQ(int i) {
			return getToken(ArabicHtmlParser.TS_EQ, i);
		}
		public List<TerminalNode> TS_NEQ() { return getTokens(ArabicHtmlParser.TS_NEQ); }
		public TerminalNode TS_NEQ(int i) {
			return getToken(ArabicHtmlParser.TS_NEQ, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			relationalExpression();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & 15L) != 0)) {
				{
				{
				setState(469);
				_la = _input.LA(1);
				if ( !(((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(470);
				relationalExpression();
				}
				}
				setState(475);
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
		public List<TerminalNode> TS_GTE() { return getTokens(ArabicHtmlParser.TS_GTE); }
		public TerminalNode TS_GTE(int i) {
			return getToken(ArabicHtmlParser.TS_GTE, i);
		}
		public List<TerminalNode> TS_LTE() { return getTokens(ArabicHtmlParser.TS_LTE); }
		public TerminalNode TS_LTE(int i) {
			return getToken(ArabicHtmlParser.TS_LTE, i);
		}
		public List<TerminalNode> TS_INSTANCEOF() { return getTokens(ArabicHtmlParser.TS_INSTANCEOF); }
		public TerminalNode TS_INSTANCEOF(int i) {
			return getToken(ArabicHtmlParser.TS_INSTANCEOF, i);
		}
		public List<TerminalNode> TS_IN() { return getTokens(ArabicHtmlParser.TS_IN); }
		public TerminalNode TS_IN(int i) {
			return getToken(ArabicHtmlParser.TS_IN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			additiveExpression();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TS_IN || _la==TS_INSTANCEOF || ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & 6442450947L) != 0)) {
				{
				{
				setState(477);
				_la = _input.LA(1);
				if ( !(_la==TS_IN || _la==TS_INSTANCEOF || ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & 6442450947L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(478);
				additiveExpression();
				}
				}
				setState(483);
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
		enterRule(_localctx, 78, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			multiplicativeExpression();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(485);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(486);
				multiplicativeExpression();
				}
				}
				setState(491);
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
		enterRule(_localctx, 80, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			memberExpression();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & 7L) != 0)) {
				{
				{
				setState(493);
				_la = _input.LA(1);
				if ( !(((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(494);
				memberExpression();
				}
				}
				setState(499);
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
		public List<TerminalNode> TS_LOG() { return getTokens(ArabicHtmlParser.TS_LOG); }
		public TerminalNode TS_LOG(int i) {
			return getToken(ArabicHtmlParser.TS_LOG, i);
		}
		public List<TerminalNode> TS_ADD_LISTENER() { return getTokens(ArabicHtmlParser.TS_ADD_LISTENER); }
		public TerminalNode TS_ADD_LISTENER(int i) {
			return getToken(ArabicHtmlParser.TS_ADD_LISTENER, i);
		}
		public List<TerminalNode> TS_INNER_TEXT() { return getTokens(ArabicHtmlParser.TS_INNER_TEXT); }
		public TerminalNode TS_INNER_TEXT(int i) {
			return getToken(ArabicHtmlParser.TS_INNER_TEXT, i);
		}
		public List<TerminalNode> TS_STYLE() { return getTokens(ArabicHtmlParser.TS_STYLE); }
		public TerminalNode TS_STYLE(int i) {
			return getToken(ArabicHtmlParser.TS_STYLE, i);
		}
		public List<TerminalNode> TS_GET_ELEMENT() { return getTokens(ArabicHtmlParser.TS_GET_ELEMENT); }
		public TerminalNode TS_GET_ELEMENT(int i) {
			return getToken(ArabicHtmlParser.TS_GET_ELEMENT, i);
		}
		public List<TerminalNode> TS_GET_ELEMENTS() { return getTokens(ArabicHtmlParser.TS_GET_ELEMENTS); }
		public TerminalNode TS_GET_ELEMENTS(int i) {
			return getToken(ArabicHtmlParser.TS_GET_ELEMENTS, i);
		}
		public List<TerminalNode> TS_CREATE_EL() { return getTokens(ArabicHtmlParser.TS_CREATE_EL); }
		public TerminalNode TS_CREATE_EL(int i) {
			return getToken(ArabicHtmlParser.TS_CREATE_EL, i);
		}
		public List<TerminalNode> TS_ON_CLICK() { return getTokens(ArabicHtmlParser.TS_ON_CLICK); }
		public TerminalNode TS_ON_CLICK(int i) {
			return getToken(ArabicHtmlParser.TS_ON_CLICK, i);
		}
		public List<TerminalNode> TS_ON_SUBMIT() { return getTokens(ArabicHtmlParser.TS_ON_SUBMIT); }
		public TerminalNode TS_ON_SUBMIT(int i) {
			return getToken(ArabicHtmlParser.TS_ON_SUBMIT, i);
		}
		public List<TerminalNode> TS_ON_CHANGE() { return getTokens(ArabicHtmlParser.TS_ON_CHANGE); }
		public TerminalNode TS_ON_CHANGE(int i) {
			return getToken(ArabicHtmlParser.TS_ON_CHANGE, i);
		}
		public List<TerminalNode> TS_ON_LOAD() { return getTokens(ArabicHtmlParser.TS_ON_LOAD); }
		public TerminalNode TS_ON_LOAD(int i) {
			return getToken(ArabicHtmlParser.TS_ON_LOAD, i);
		}
		public List<TerminalNode> TS_INNER_HTML() { return getTokens(ArabicHtmlParser.TS_INNER_HTML); }
		public TerminalNode TS_INNER_HTML(int i) {
			return getToken(ArabicHtmlParser.TS_INNER_HTML, i);
		}
		public List<TerminalNode> TS_LOCAL_STORAGE() { return getTokens(ArabicHtmlParser.TS_LOCAL_STORAGE); }
		public TerminalNode TS_LOCAL_STORAGE(int i) {
			return getToken(ArabicHtmlParser.TS_LOCAL_STORAGE, i);
		}
		public List<TerminalNode> TS_SESSION_STORAGE() { return getTokens(ArabicHtmlParser.TS_SESSION_STORAGE); }
		public TerminalNode TS_SESSION_STORAGE(int i) {
			return getToken(ArabicHtmlParser.TS_SESSION_STORAGE, i);
		}
		public List<TerminalNode> CSS_COLOR() { return getTokens(ArabicHtmlParser.CSS_COLOR); }
		public TerminalNode CSS_COLOR(int i) {
			return getToken(ArabicHtmlParser.CSS_COLOR, i);
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
		enterRule(_localctx, 82, RULE_memberExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			primaryExpression();
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(519);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAREN:
						{
						setState(501);
						match(LPAREN);
						setState(510);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 271656681473L) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 288230376193654819L) != 0) || ((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & 131089L) != 0)) {
							{
							setState(502);
							expression();
							setState(507);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(503);
								match(COMMA);
								setState(504);
								expression();
								}
								}
								setState(509);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(512);
						match(RPAREN);
						}
						break;
					case DOT:
						{
						setState(513);
						match(DOT);
						setState(514);
						_la = _input.LA(1);
						if ( !(_la==CSS_COLOR || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & 81919L) != 0)) ) {
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
						setState(515);
						match(LBRACK);
						setState(516);
						expression();
						setState(517);
						match(RBRACK);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ArabicHtmlParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ArabicHtmlParser.STRING, 0); }
		public TerminalNode TS_TRUE() { return getToken(ArabicHtmlParser.TS_TRUE, 0); }
		public TerminalNode TS_FALSE() { return getToken(ArabicHtmlParser.TS_FALSE, 0); }
		public TerminalNode TS_NULL() { return getToken(ArabicHtmlParser.TS_NULL, 0); }
		public TerminalNode TS_UNDEFINED() { return getToken(ArabicHtmlParser.TS_UNDEFINED, 0); }
		public TerminalNode TS_THIS() { return getToken(ArabicHtmlParser.TS_THIS, 0); }
		public TerminalNode TS_NAN() { return getToken(ArabicHtmlParser.TS_NAN, 0); }
		public TerminalNode TS_DOCUMENT() { return getToken(ArabicHtmlParser.TS_DOCUMENT, 0); }
		public TerminalNode TS_WINDOW() { return getToken(ArabicHtmlParser.TS_WINDOW, 0); }
		public TerminalNode LPAREN() { return getToken(ArabicHtmlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArabicHtmlParser.RPAREN, 0); }
		public TerminalNode TS_FUNCTION() { return getToken(ArabicHtmlParser.TS_FUNCTION, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
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
		enterRule(_localctx, 84, RULE_primaryExpression);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_CALC_FUNC:
			case TS_ELEMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				identifier();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				match(STRING);
				}
				break;
			case TS_TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(527);
				match(TS_TRUE);
				}
				break;
			case TS_FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(528);
				match(TS_FALSE);
				}
				break;
			case TS_NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(529);
				match(TS_NULL);
				}
				break;
			case TS_UNDEFINED:
				enterOuterAlt(_localctx, 7);
				{
				setState(530);
				match(TS_UNDEFINED);
				}
				break;
			case TS_THIS:
				enterOuterAlt(_localctx, 8);
				{
				setState(531);
				match(TS_THIS);
				}
				break;
			case TS_NAN:
				enterOuterAlt(_localctx, 9);
				{
				setState(532);
				match(TS_NAN);
				}
				break;
			case TS_DOCUMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(533);
				match(TS_DOCUMENT);
				}
				break;
			case TS_WINDOW:
				enterOuterAlt(_localctx, 11);
				{
				setState(534);
				match(TS_WINDOW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 12);
				{
				setState(535);
				match(LPAREN);
				setState(536);
				expression();
				setState(537);
				match(RPAREN);
				}
				break;
			case TS_FUNCTION:
				enterOuterAlt(_localctx, 13);
				{
				setState(539);
				match(TS_FUNCTION);
				setState(540);
				match(LPAREN);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(541);
					parameterList();
					}
				}

				setState(544);
				match(RPAREN);
				setState(545);
				block();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 14);
				{
				setState(546);
				arrayLiteral();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 15);
				{
				setState(547);
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
		enterRule(_localctx, 86, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(LBRACK);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 271656681473L) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 288230376193654819L) != 0) || ((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & 131089L) != 0)) {
				{
				setState(551);
				expression();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(552);
					match(COMMA);
					setState(553);
					expression();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(561);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		enterRule(_localctx, 88, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(LBRACE);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_CALC_FUNC || _la==TS_ELEMENT || _la==IDENTIFIER) {
				{
				setState(564);
				identifier();
				setState(565);
				match(COLON);
				setState(566);
				expression();
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(567);
					match(COMMA);
					setState(568);
					identifier();
					setState(569);
					match(COLON);
					setState(570);
					expression();
					}
					}
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(579);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicHtmlParser.IDENTIFIER, 0); }
		public TerminalNode TS_ELEMENT() { return getToken(ArabicHtmlParser.TS_ELEMENT, 0); }
		public TerminalNode CSS_CALC_FUNC() { return getToken(ArabicHtmlParser.CSS_CALC_FUNC, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_la = _input.LA(1);
			if ( !(_la==CSS_CALC_FUNC || _la==TS_ELEMENT || _la==IDENTIFIER) ) {
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
		"\u0004\u0001\u0105\u0248\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		",\u0002-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000`\b\u0000"+
		"\n\u0000\f\u0000c\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001s\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002w\b\u0002\n\u0002\f\u0002z\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u0082\b\u0002\n\u0002\f\u0002\u0085\t\u0002\u0001\u0002\u0003"+
		"\u0002\u0088\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u008e\b\u0003\n\u0003\f\u0003\u0091\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u009a\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00a5\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00aa\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00af\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b3\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00bb\b\t\n\t\f\t\u00be\t\t\u0003\t\u00c0\b\t\u0001\t\u0003"+
		"\t\u00c3\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0004\f\u00cc\b\f\u000b\f\f\f\u00cd\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f4\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00fb\b\u000e"+
		"\n\u000e\f\u000e\u00fe\t\u000e\u0003\u000e\u0100\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0113\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0119\b\u0011\n"+
		"\u0011\f\u0011\u011c\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u012b\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0137\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u013e"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0144"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u014a"+
		"\b\u0015\n\u0015\f\u0015\u014d\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u015d\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0163\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u017f\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0187\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u018d\b\u001c\u0005\u001c\u018f\b\u001c\n\u001c\f\u001c\u0192\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0196\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01a3\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u01ae\b \u0001 \u0001 \u0001 \u0001 \u0005 \u01b4\b \n \f \u01b7\t "+
		"\u0003 \u01b9\b \u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01c3\b\"\u0001#\u0001#\u0001#\u0005#\u01c8\b#\n#\f#\u01cb"+
		"\t#\u0001$\u0001$\u0001$\u0005$\u01d0\b$\n$\f$\u01d3\t$\u0001%\u0001%"+
		"\u0001%\u0005%\u01d8\b%\n%\f%\u01db\t%\u0001&\u0001&\u0001&\u0005&\u01e0"+
		"\b&\n&\f&\u01e3\t&\u0001\'\u0001\'\u0001\'\u0005\'\u01e8\b\'\n\'\f\'\u01eb"+
		"\t\'\u0001(\u0001(\u0001(\u0005(\u01f0\b(\n(\f(\u01f3\t(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u01fa\b)\n)\f)\u01fd\t)\u0003)\u01ff\b)"+
		"\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0208\b)\n)\f"+
		")\u020b\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u021f\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u0225\b*\u0001+\u0001+\u0001"+
		"+\u0001+\u0005+\u022b\b+\n+\f+\u022e\t+\u0003+\u0230\b+\u0001+\u0001+"+
		"\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u023d\b,\n,\f,\u0240\t,\u0003,\u0242\b,\u0001,\u0001,\u0001-\u0001-"+
		"\u0001-\u0000\u0000.\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u000e"+
		"\t\u0000\b\b\u0010\u0011\\\\bbxz\u007f\u007f\u0085\u0086\u008a\u008b\u008f"+
		"\u0094\u0001\u0000LV\u0002\u0000\bDFK\u0001\u0000pw\u0002\u0000{|~\u0080"+
		"\u0001\u0000xz\u0002\u0000\u00d2\u00d5\u00e8\u00e8\u0001\u0000\u008f\u0090"+
		"\u0001\u0000\u00dc\u00df\u0004\u0000\u0090\u0090\u00b1\u00b1\u00e0\u00e1"+
		"\u00ff\u0100\u0001\u0000\u00fa\u00fb\u0001\u0000\u00fc\u00fe\u0003\u0000"+
		"##\u00ba\u00c7\u00ca\u00ca\u0003\u0000ss\u00b8\u00b8\u00ca\u00ca\u029a"+
		"\u0000a\u0001\u0000\u0000\u0000\u0002r\u0001\u0000\u0000\u0000\u0004\u0087"+
		"\u0001\u0000\u0000\u0000\u0006\u008f\u0001\u0000\u0000\u0000\b\u0099\u0001"+
		"\u0000\u0000\u0000\n\u009b\u0001\u0000\u0000\u0000\f\u009d\u0001\u0000"+
		"\u0000\u0000\u000e\u00b2\u0001\u0000\u0000\u0000\u0010\u00b4\u0001\u0000"+
		"\u0000\u0000\u0012\u00bf\u0001\u0000\u0000\u0000\u0014\u00c4\u0001\u0000"+
		"\u0000\u0000\u0016\u00c8\u0001\u0000\u0000\u0000\u0018\u00cb\u0001\u0000"+
		"\u0000\u0000\u001a\u00f3\u0001\u0000\u0000\u0000\u001c\u00f5\u0001\u0000"+
		"\u0000\u0000\u001e\u0103\u0001\u0000\u0000\u0000 \u0112\u0001\u0000\u0000"+
		"\u0000\"\u0114\u0001\u0000\u0000\u0000$\u011f\u0001\u0000\u0000\u0000"+
		"&\u0124\u0001\u0000\u0000\u0000(\u012e\u0001\u0000\u0000\u0000*\u0147"+
		"\u0001\u0000\u0000\u0000,\u0150\u0001\u0000\u0000\u0000.\u0155\u0001\u0000"+
		"\u0000\u00000\u015e\u0001\u0000\u0000\u00002\u016b\u0001\u0000\u0000\u0000"+
		"4\u0174\u0001\u0000\u0000\u00006\u017a\u0001\u0000\u0000\u00008\u0183"+
		"\u0001\u0000\u0000\u0000:\u0193\u0001\u0000\u0000\u0000<\u0199\u0001\u0000"+
		"\u0000\u0000>\u01a4\u0001\u0000\u0000\u0000@\u01ad\u0001\u0000\u0000\u0000"+
		"B\u01bd\u0001\u0000\u0000\u0000D\u01bf\u0001\u0000\u0000\u0000F\u01c4"+
		"\u0001\u0000\u0000\u0000H\u01cc\u0001\u0000\u0000\u0000J\u01d4\u0001\u0000"+
		"\u0000\u0000L\u01dc\u0001\u0000\u0000\u0000N\u01e4\u0001\u0000\u0000\u0000"+
		"P\u01ec\u0001\u0000\u0000\u0000R\u01f4\u0001\u0000\u0000\u0000T\u0224"+
		"\u0001\u0000\u0000\u0000V\u0226\u0001\u0000\u0000\u0000X\u0233\u0001\u0000"+
		"\u0000\u0000Z\u0245\u0001\u0000\u0000\u0000\\`\u0003\u0004\u0002\u0000"+
		"]`\u0003\f\u0006\u0000^`\u0003 \u0010\u0000_\\\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u0000\u0000\u0001e\u0001"+
		"\u0001\u0000\u0000\u0000fg\u0005\u0004\u0000\u0000gh\u0005\u00e8\u0000"+
		"\u0000hs\u0005\u0105\u0000\u0000ij\u0005\u0005\u0000\u0000jk\u0005\u00e8"+
		"\u0000\u0000ks\u0005\u0105\u0000\u0000lm\u0005\u0006\u0000\u0000mn\u0005"+
		"\u00e8\u0000\u0000ns\u0005\u0105\u0000\u0000op\u0005\u0007\u0000\u0000"+
		"pq\u0005\u00e8\u0000\u0000qs\u0005\u0105\u0000\u0000rf\u0001\u0000\u0000"+
		"\u0000ri\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000ro\u0001\u0000"+
		"\u0000\u0000s\u0003\u0001\u0000\u0000\u0000tx\u0005\u0002\u0000\u0000"+
		"uw\u0003\u0002\u0001\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005\u0100\u0000\u0000|}\u0003"+
		"\u0006\u0003\u0000}~\u0005\u0001\u0000\u0000~\u0088\u0001\u0000\u0000"+
		"\u0000\u007f\u0083\u0005\u0002\u0000\u0000\u0080\u0082\u0003\u0002\u0001"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0088\u0005\u0003\u0000\u0000\u0087t\u0001\u0000\u0000\u0000"+
		"\u0087\u007f\u0001\u0000\u0000\u0000\u0088\u0005\u0001\u0000\u0000\u0000"+
		"\u0089\u008e\u0003\u0004\u0002\u0000\u008a\u008e\u0003 \u0010\u0000\u008b"+
		"\u008e\u0003\f\u0006\u0000\u008c\u008e\u0003\b\u0004\u0000\u008d\u0089"+
		"\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0007\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u009a\u0005\u0105\u0000\u0000\u0093\u009a"+
		"\u0005\u00ca\u0000\u0000\u0094\u009a\u0005\u00cc\u0000\u0000\u0095\u009a"+
		"\u0005\u00fb\u0000\u0000\u0096\u009a\u0005\u00e8\u0000\u0000\u0097\u009a"+
		"\u0005\u00fe\u0000\u0000\u0098\u009a\u0003\n\u0005\u0000\u0099\u0092\u0001"+
		"\u0000\u0000\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0094\u0001"+
		"\u0000\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\t\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0000"+
		"\u0000\u0000\u009c\u000b\u0001\u0000\u0000\u0000\u009d\u009e\u0003\u000e"+
		"\u0007\u0000\u009e\u009f\u0005\u00ed\u0000\u0000\u009f\u00a0\u0003\u0012"+
		"\t\u0000\u00a0\u00a1\u0005\u00ee\u0000\u0000\u00a1\r\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0003Z-\u0000\u00a3\u00a5\u0003\u0010\b\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u00f3\u0000\u0000\u00a7"+
		"\u00a9\u0003Z-\u0000\u00a8\u00aa\u0003\u0010\b\u0000\u00a9\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00b3\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\u00f2\u0000\u0000\u00ac\u00ae\u0003"+
		"Z-\u0000\u00ad\u00af\u0003\u0010\b\u0000\u00ae\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005E\u0000\u0000\u00b1\u00b3\u0003Z-\u0000\u00b2"+
		"\u00a2\u0001\u0000\u0000\u0000\u00b2\u00a6\u0001\u0000\u0000\u0000\u00b2"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u000f\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u00ef\u0000\u0000\u00b5"+
		"\u00b6\u0007\u0001\u0000\u0000\u00b6\u0011\u0001\u0000\u0000\u0000\u00b7"+
		"\u00bc\u0003\u0014\n\u0000\u00b8\u00b9\u0005\u00f0\u0000\u0000\u00b9\u00bb"+
		"\u0003\u0014\n\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00b7\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005"+
		"\u00f0\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u0013\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003"+
		"\u0016\u000b\u0000\u00c5\u00c6\u0005\u00ef\u0000\u0000\u00c6\u00c7\u0003"+
		"\u0018\f\u0000\u00c7\u0015\u0001\u0000\u0000\u0000\u00c8\u00c9\u0007\u0002"+
		"\u0000\u0000\u00c9\u0017\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003\u001a"+
		"\r\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u0019\u0001\u0000\u0000\u0000\u00cf\u00f4\u0005\u00ca\u0000"+
		"\u0000\u00d0\u00f4\u0005\u00cc\u0000\u0000\u00d1\u00f4\u0005\u00cb\u0000"+
		"\u0000\u00d2\u00f4\u0005\u00cd\u0000\u0000\u00d3\u00f4\u0005\u0105\u0000"+
		"\u0000\u00d4\u00f4\u0005W\u0000\u0000\u00d5\u00f4\u0005X\u0000\u0000\u00d6"+
		"\u00f4\u0005Y\u0000\u0000\u00d7\u00f4\u0005Z\u0000\u0000\u00d8\u00f4\u0005"+
		"[\u0000\u0000\u00d9\u00f4\u0005\\\u0000\u0000\u00da\u00f4\u0005]\u0000"+
		"\u0000\u00db\u00f4\u0005^\u0000\u0000\u00dc\u00f4\u0005_\u0000\u0000\u00dd"+
		"\u00f4\u0005`\u0000\u0000\u00de\u00f4\u0005a\u0000\u0000\u00df\u00f4\u0005"+
		"b\u0000\u0000\u00e0\u00f4\u0005c\u0000\u0000\u00e1\u00f4\u0005d\u0000"+
		"\u0000\u00e2\u00f4\u0005e\u0000\u0000\u00e3\u00f4\u0005f\u0000\u0000\u00e4"+
		"\u00f4\u0005g\u0000\u0000\u00e5\u00f4\u0005h\u0000\u0000\u00e6\u00f4\u0005"+
		"i\u0000\u0000\u00e7\u00f4\u0005j\u0000\u0000\u00e8\u00f4\u0005k\u0000"+
		"\u0000\u00e9\u00f4\u0005m\u0000\u0000\u00ea\u00f4\u0005n\u0000\u0000\u00eb"+
		"\u00f4\u0005\u0017\u0000\u0000\u00ec\u00f4\u0005\u001c\u0000\u0000\u00ed"+
		"\u00f4\u0005C\u0000\u0000\u00ee\u00f4\u0005D\u0000\u0000\u00ef\u00f4\u0005"+
		"A\u0000\u0000\u00f0\u00f4\u0005B\u0000\u0000\u00f1\u00f4\u0005l\u0000"+
		"\u0000\u00f2\u00f4\u0003\u001c\u000e\u0000\u00f3\u00cf\u0001\u0000\u0000"+
		"\u0000\u00f3\u00d0\u0001\u0000\u0000\u0000\u00f3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00d2\u0001\u0000\u0000\u0000\u00f3\u00d3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00d4\u0001\u0000\u0000\u0000\u00f3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00f3\u00d6\u0001\u0000\u0000\u0000\u00f3\u00d7\u0001\u0000\u0000"+
		"\u0000\u00f3\u00d8\u0001\u0000\u0000\u0000\u00f3\u00d9\u0001\u0000\u0000"+
		"\u0000\u00f3\u00da\u0001\u0000\u0000\u0000\u00f3\u00db\u0001\u0000\u0000"+
		"\u0000\u00f3\u00dc\u0001\u0000\u0000\u0000\u00f3\u00dd\u0001\u0000\u0000"+
		"\u0000\u00f3\u00de\u0001\u0000\u0000\u0000\u00f3\u00df\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e0\u0001\u0000\u0000\u0000\u00f3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e2\u0001\u0000\u0000\u0000\u00f3\u00e3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e4\u0001\u0000\u0000\u0000\u00f3\u00e5\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e6\u0001\u0000\u0000\u0000\u00f3\u00e7\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e8\u0001\u0000\u0000\u0000\u00f3\u00e9\u0001\u0000\u0000"+
		"\u0000\u00f3\u00ea\u0001\u0000\u0000\u0000\u00f3\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f3\u00ec\u0001\u0000\u0000\u0000\u00f3\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u001b\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0007\u0003\u0000\u0000\u00f6\u00ff\u0005\u00f4\u0000"+
		"\u0000\u00f7\u00fc\u0003\u0018\f\u0000\u00f8\u00f9\u0005\u00f1\u0000\u0000"+
		"\u00f9\u00fb\u0003\u0018\f\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00ff\u00f7\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0005\u00f5\u0000\u0000\u0102\u001d\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0007\u0004\u0000\u0000\u0104\u001f\u0001\u0000\u0000\u0000\u0105"+
		"\u0113\u0003(\u0014\u0000\u0106\u0113\u0003,\u0016\u0000\u0107\u0113\u0003"+
		".\u0017\u0000\u0108\u0113\u00032\u0019\u0000\u0109\u0113\u00030\u0018"+
		"\u0000\u010a\u0113\u00034\u001a\u0000\u010b\u0113\u00036\u001b\u0000\u010c"+
		"\u0113\u0003:\u001d\u0000\u010d\u0113\u0003<\u001e\u0000\u010e\u0113\u0003"+
		">\u001f\u0000\u010f\u0113\u0003@ \u0000\u0110\u0113\u0003*\u0015\u0000"+
		"\u0111\u0113\u0003\"\u0011\u0000\u0112\u0105\u0001\u0000\u0000\u0000\u0112"+
		"\u0106\u0001\u0000\u0000\u0000\u0112\u0107\u0001\u0000\u0000\u0000\u0112"+
		"\u0108\u0001\u0000\u0000\u0000\u0112\u0109\u0001\u0000\u0000\u0000\u0112"+
		"\u010a\u0001\u0000\u0000\u0000\u0112\u010b\u0001\u0000\u0000\u0000\u0112"+
		"\u010c\u0001\u0000\u0000\u0000\u0112\u010d\u0001\u0000\u0000\u0000\u0112"+
		"\u010e\u0001\u0000\u0000\u0000\u0112\u010f\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113"+
		"!\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u00a4\u0000\u0000\u0115\u0116"+
		"\u0005\u00ca\u0000\u0000\u0116\u011a\u0005\u00ed\u0000\u0000\u0117\u0119"+
		"\u0003$\u0012\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0005\u00ee\u0000\u0000\u011e#\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0005\u00ca\u0000\u0000\u0120\u0121\u0005\u00ef"+
		"\u0000\u0000\u0121\u0122\u0003\u001e\u000f\u0000\u0122\u0123\u0005\u00f0"+
		"\u0000\u0000\u0123%\u0001\u0000\u0000\u0000\u0124\u0125\u0007\u0005\u0000"+
		"\u0000\u0125\u0126\u0003Z-\u0000\u0126\u0127\u0005\u00ef\u0000\u0000\u0127"+
		"\u012a\u0003\u001e\u000f\u0000\u0128\u0129\u0005\u00e8\u0000\u0000\u0129"+
		"\u012b\u0003B!\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"\u00f0\u0000\u0000\u012d\'\u0001\u0000\u0000\u0000\u012e\u0143\u0007\u0005"+
		"\u0000\u0000\u012f\u0130\u0003Z-\u0000\u0130\u0131\u0005\u00ef\u0000\u0000"+
		"\u0131\u0132\u0003\u001e\u000f\u0000\u0132\u0133\u0005\u00f8\u0000\u0000"+
		"\u0133\u0136\u0005\u00f9\u0000\u0000\u0134\u0135\u0005\u00e8\u0000\u0000"+
		"\u0135\u0137\u0003V+\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0001\u0000\u0000\u0000\u0137\u0144\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0003Z-\u0000\u0139\u013a\u0005\u00ef\u0000\u0000\u013a\u013d\u0003\u001e"+
		"\u000f\u0000\u013b\u013c\u0005\u00e8\u0000\u0000\u013c\u013e\u0003B!\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e\u0144\u0001\u0000\u0000\u0000\u013f\u0140\u0003Z-\u0000\u0140\u0141"+
		"\u0005\u00e8\u0000\u0000\u0141\u0142\u0003B!\u0000\u0142\u0144\u0001\u0000"+
		"\u0000\u0000\u0143\u012f\u0001\u0000\u0000\u0000\u0143\u0138\u0001\u0000"+
		"\u0000\u0000\u0143\u013f\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005\u00f0\u0000\u0000\u0146)\u0001\u0000\u0000"+
		"\u0000\u0147\u014b\u0005\u00ed\u0000\u0000\u0148\u014a\u0003 \u0010\u0000"+
		"\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0005\u00ee\u0000\u0000\u014f+\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0003Z-\u0000\u0151\u0152\u0007\u0006\u0000\u0000\u0152\u0153\u0003"+
		"B!\u0000\u0153\u0154\u0005\u00f0\u0000\u0000\u0154-\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0005\u0085\u0000\u0000\u0156\u0157\u0005\u00f4\u0000"+
		"\u0000\u0157\u0158\u0003B!\u0000\u0158\u0159\u0005\u00f5\u0000\u0000\u0159"+
		"\u015c\u0003 \u0010\u0000\u015a\u015b\u0005\u0086\u0000\u0000\u015b\u015d"+
		"\u0003 \u0010\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001"+
		"\u0000\u0000\u0000\u015d/\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u008a"+
		"\u0000\u0000\u015f\u0162\u0005\u00f4\u0000\u0000\u0160\u0163\u0003&\u0013"+
		"\u0000\u0161\u0163\u0003D\"\u0000\u0162\u0160\u0001\u0000\u0000\u0000"+
		"\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0003B!\u0000\u0165\u0166\u0005\u00f0\u0000\u0000\u0166\u0167"+
		"\u0003B!\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u00f5"+
		"\u0000\u0000\u0169\u016a\u0003*\u0015\u0000\u016a1\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0005\u008a\u0000\u0000\u016c\u016d\u0005\u00f4\u0000\u0000"+
		"\u016d\u016e\u0005z\u0000\u0000\u016e\u016f\u0003Z-\u0000\u016f\u0170"+
		"\u0007\u0007\u0000\u0000\u0170\u0171\u0003B!\u0000\u0171\u0172\u0005\u00f5"+
		"\u0000\u0000\u0172\u0173\u0003*\u0015\u0000\u01733\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0005\u008b\u0000\u0000\u0175\u0176\u0005\u00f4\u0000\u0000"+
		"\u0176\u0177\u0003B!\u0000\u0177\u0178\u0005\u00f5\u0000\u0000\u0178\u0179"+
		"\u0003*\u0015\u0000\u01795\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0091"+
		"\u0000\u0000\u017b\u017c\u0003Z-\u0000\u017c\u017e\u0005\u00f4\u0000\u0000"+
		"\u017d\u017f\u00038\u001c\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0005\u00f5\u0000\u0000\u0181\u0182\u0003*\u0015\u0000\u01827\u0001"+
		"\u0000\u0000\u0000\u0183\u0186\u0005\u00ca\u0000\u0000\u0184\u0185\u0005"+
		"\u00ef\u0000\u0000\u0185\u0187\u0003\u001e\u000f\u0000\u0186\u0184\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0190\u0001"+
		"\u0000\u0000\u0000\u0188\u0189\u0005\u00f1\u0000\u0000\u0189\u018c\u0005"+
		"\u00ca\u0000\u0000\u018a\u018b\u0005\u00ef\u0000\u0000\u018b\u018d\u0003"+
		"\u001e\u000f\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001"+
		"\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u0188\u0001"+
		"\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u01919\u0001\u0000"+
		"\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0195\u0005\u0092"+
		"\u0000\u0000\u0194\u0196\u0003B!\u0000\u0195\u0194\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0005\u00f0\u0000\u0000\u0198;\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0005\u009a\u0000\u0000\u019a\u019b\u0003*\u0015\u0000\u019b\u019c"+
		"\u0005\u009b\u0000\u0000\u019c\u019d\u0005\u00f4\u0000\u0000\u019d\u019e"+
		"\u0003Z-\u0000\u019e\u019f\u0005\u00f5\u0000\u0000\u019f\u01a2\u0003*"+
		"\u0015\u0000\u01a0\u01a1\u0005\u009c\u0000\u0000\u01a1\u01a3\u0003*\u0015"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a3=\u0001\u0000\u0000\u0000\u01a4\u01a5\u0003B!\u0000\u01a5"+
		"\u01a6\u0005\u00f0\u0000\u0000\u01a6?\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0005\u00b5\u0000\u0000\u01a8\u01a9\u0005\u00f2\u0000\u0000\u01a9\u01ae"+
		"\u0005\u00c7\u0000\u0000\u01aa\u01ae\u0005\u00c7\u0000\u0000\u01ab\u01ae"+
		"\u0005\u00c8\u0000\u0000\u01ac\u01ae\u0005\u00c9\u0000\u0000\u01ad\u01a7"+
		"\u0001\u0000\u0000\u0000\u01ad\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af\u01b8\u0005\u00f4\u0000\u0000\u01b0\u01b5"+
		"\u0003B!\u0000\u01b1\u01b2\u0005\u00f1\u0000\u0000\u01b2\u01b4\u0003B"+
		"!\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b0\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u00f5\u0000"+
		"\u0000\u01bb\u01bc\u0005\u00f0\u0000\u0000\u01bcA\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0003D\"\u0000\u01beC\u0001\u0000\u0000\u0000\u01bf\u01c2"+
		"\u0003F#\u0000\u01c0\u01c1\u0005\u00e8\u0000\u0000\u01c1\u01c3\u0003B"+
		"!\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c3E\u0001\u0000\u0000\u0000\u01c4\u01c9\u0003H$\u0000\u01c5"+
		"\u01c6\u0005\u00e3\u0000\u0000\u01c6\u01c8\u0003H$\u0000\u01c7\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01caG\u0001\u0000"+
		"\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01d1\u0003J%\u0000"+
		"\u01cd\u01ce\u0005\u00e2\u0000\u0000\u01ce\u01d0\u0003J%\u0000\u01cf\u01cd"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2I\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d9\u0003"+
		"L&\u0000\u01d5\u01d6\u0007\b\u0000\u0000\u01d6\u01d8\u0003L&\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da"+
		"K\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01e1"+
		"\u0003N\'\u0000\u01dd\u01de\u0007\t\u0000\u0000\u01de\u01e0\u0003N\'\u0000"+
		"\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e2M\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e9\u0003P(\u0000\u01e5\u01e6\u0007\n\u0000\u0000\u01e6\u01e8\u0003"+
		"P(\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000"+
		"\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000"+
		"\u0000\u01eaO\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000"+
		"\u01ec\u01f1\u0003R)\u0000\u01ed\u01ee\u0007\u000b\u0000\u0000\u01ee\u01f0"+
		"\u0003R)\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f2Q\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f4\u0209\u0003T*\u0000\u01f5\u01fe\u0005\u00f4\u0000\u0000\u01f6"+
		"\u01fb\u0003B!\u0000\u01f7\u01f8\u0005\u00f1\u0000\u0000\u01f8\u01fa\u0003"+
		"B!\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fe\u01f6\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000"+
		"\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0208\u0005\u00f5\u0000"+
		"\u0000\u0201\u0202\u0005\u00f2\u0000\u0000\u0202\u0208\u0007\f\u0000\u0000"+
		"\u0203\u0204\u0005\u00f8\u0000\u0000\u0204\u0205\u0003B!\u0000\u0205\u0206"+
		"\u0005\u00f9\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u01f5"+
		"\u0001\u0000\u0000\u0000\u0207\u0201\u0001\u0000\u0000\u0000\u0207\u0203"+
		"\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207"+
		"\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020aS\u0001"+
		"\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u0225\u0003"+
		"Z-\u0000\u020d\u0225\u0005\u00cc\u0000\u0000\u020e\u0225\u0005\u0105\u0000"+
		"\u0000\u020f\u0225\u0005\u0093\u0000\u0000\u0210\u0225\u0005\u0094\u0000"+
		"\u0000\u0211\u0225\u0005\u0095\u0000\u0000\u0212\u0225\u0005\u0096\u0000"+
		"\u0000\u0213\u0225\u0005\u0097\u0000\u0000\u0214\u0225\u0005\u0098\u0000"+
		"\u0000\u0215\u0225\u0005\u00b3\u0000\u0000\u0216\u0225\u0005\u00b4\u0000"+
		"\u0000\u0217\u0218\u0005\u00f4\u0000\u0000\u0218\u0219\u0003B!\u0000\u0219"+
		"\u021a\u0005\u00f5\u0000\u0000\u021a\u0225\u0001\u0000\u0000\u0000\u021b"+
		"\u021c\u0005\u0091\u0000\u0000\u021c\u021e\u0005\u00f4\u0000\u0000\u021d"+
		"\u021f\u00038\u001c\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0005\u00f5\u0000\u0000\u0221\u0225\u0003*\u0015\u0000\u0222\u0225\u0003"+
		"V+\u0000\u0223\u0225\u0003X,\u0000\u0224\u020c\u0001\u0000\u0000\u0000"+
		"\u0224\u020d\u0001\u0000\u0000\u0000\u0224\u020e\u0001\u0000\u0000\u0000"+
		"\u0224\u020f\u0001\u0000\u0000\u0000\u0224\u0210\u0001\u0000\u0000\u0000"+
		"\u0224\u0211\u0001\u0000\u0000\u0000\u0224\u0212\u0001\u0000\u0000\u0000"+
		"\u0224\u0213\u0001\u0000\u0000\u0000\u0224\u0214\u0001\u0000\u0000\u0000"+
		"\u0224\u0215\u0001\u0000\u0000\u0000\u0224\u0216\u0001\u0000\u0000\u0000"+
		"\u0224\u0217\u0001\u0000\u0000\u0000\u0224\u021b\u0001\u0000\u0000\u0000"+
		"\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000"+
		"\u0225U\u0001\u0000\u0000\u0000\u0226\u022f\u0005\u00f8\u0000\u0000\u0227"+
		"\u022c\u0003B!\u0000\u0228\u0229\u0005\u00f1\u0000\u0000\u0229\u022b\u0003"+
		"B!\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000"+
		"\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000"+
		"\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000"+
		"\u0000\u022f\u0227\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0005\u00f9\u0000"+
		"\u0000\u0232W\u0001\u0000\u0000\u0000\u0233\u0241\u0005\u00ed\u0000\u0000"+
		"\u0234\u0235\u0003Z-\u0000\u0235\u0236\u0005\u00ef\u0000\u0000\u0236\u023e"+
		"\u0003B!\u0000\u0237\u0238\u0005\u00f1\u0000\u0000\u0238\u0239\u0003Z"+
		"-\u0000\u0239\u023a\u0005\u00ef\u0000\u0000\u023a\u023b\u0003B!\u0000"+
		"\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u0237\u0001\u0000\u0000\u0000"+
		"\u023d\u0240\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0242\u0001\u0000\u0000\u0000"+
		"\u0240\u023e\u0001\u0000\u0000\u0000\u0241\u0234\u0001\u0000\u0000\u0000"+
		"\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000"+
		"\u0243\u0244\u0005\u00ee\u0000\u0000\u0244Y\u0001\u0000\u0000\u0000\u0245"+
		"\u0246\u0007\r\u0000\u0000\u0246[\u0001\u0000\u0000\u00007_arx\u0083\u0087"+
		"\u008d\u008f\u0099\u00a4\u00a9\u00ae\u00b2\u00bc\u00bf\u00c2\u00cd\u00f3"+
		"\u00fc\u00ff\u0112\u011a\u012a\u0136\u013d\u0143\u014b\u015c\u0162\u017e"+
		"\u0186\u018c\u0190\u0195\u01a2\u01ad\u01b5\u01b8\u01c2\u01c9\u01d1\u01d9"+
		"\u01e1\u01e9\u01f1\u01fb\u01fe\u0207\u0209\u021e\u0224\u022c\u022f\u023e"+
		"\u0241";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}