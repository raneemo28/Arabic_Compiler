// Generated from c:/Users/ElectoMall/OneDrive/Desktop/projects/MiniProjects/compilers/Arabic_Compiler/Grammar/ArabicHtmlParser.g4 by ANTLR 4.13.1
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
		RULE_declarationList = 8, RULE_declaration = 9, RULE_cssProperty = 10, 
		RULE_cssValue = 11, RULE_cssFunction = 12, RULE_tsType = 13, RULE_tsStatement = 14, 
		RULE_interfaceDeclaration = 15, RULE_variableDeclaration = 16, RULE_tsDeclaration = 17, 
		RULE_block = 18, RULE_assignmentStatement = 19, RULE_ifStatement = 20, 
		RULE_forLoop = 21, RULE_arrayLoop = 22, RULE_whileLoop = 23, RULE_functionDeclaration = 24, 
		RULE_parameterList = 25, RULE_returnStatement = 26, RULE_tryCatchStatement = 27, 
		RULE_expressionStatement = 28, RULE_builtInCall = 29, RULE_expression = 30, 
		RULE_assignmentExpression = 31, RULE_logicalOrExpression = 32, RULE_logicalAndExpression = 33, 
		RULE_equalityExpression = 34, RULE_relationalExpression = 35, RULE_additiveExpression = 36, 
		RULE_multiplicativeExpression = 37, RULE_memberExpression = 38, RULE_primaryExpression = 39, 
		RULE_arrayLiteral = 40, RULE_objectLiteral = 41, RULE_identifier = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "attribute", "htmlElement", "htmlContent", "text", "arabicKeyword", 
			"cssRule", "selector", "declarationList", "declaration", "cssProperty", 
			"cssValue", "cssFunction", "tsType", "tsStatement", "interfaceDeclaration", 
			"variableDeclaration", "tsDeclaration", "block", "assignmentStatement", 
			"ifStatement", "forLoop", "arrayLoop", "whileLoop", "functionDeclaration", 
			"parameterList", "returnStatement", "tryCatchStatement", "expressionStatement", 
			"builtInCall", "expression", "assignmentExpression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "memberExpression", 
			"primaryExpression", "arrayLiteral", "objectLiteral", "identifier"
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
			"'\\u0647\\u0627\\u0645'", "'\\u0631\\u0627\\u0628\\u0637'", "'\\u0646\\u0638\\u0627\\u0645-\\u0631_\\u062C_\\u0628'", 
			"'\\u0646\\u0638\\u0627\\u0645-\\u0631_\\u062C_\\u0628_\\u0627'", "'\\u062D\\u0633\\u0627\\u0628'", 
			"'\\u062F\\u0627\\u0644\\u0629_\\u0645\\u062A\\u063A\\u064A\\u0631'", 
			"'\\u062A\\u062F\\u0648\\u064A\\u0631'", "'\\u062A\\u0643\\u0628\\u064A\\u0631'", 
			"'\\u062A\\u063A\\u0628\\u064A\\u0634'", "'\\u0645\\u062A\\u063A\\u064A\\u0631'", 
			"'\\u062F\\u0639'", "'\\u062B\\u0627\\u0628\\u062A'", "'\\u0627\\u064A'", 
			"'\\u0631\\u0642\\u0645_\\u0643\\u0628\\u064A\\u0631'", "'\\u0645\\u0635\\u0641\\u0648\\u0641\\u0629'", 
			"'\\u0633\\u0644\\u0633\\u0644\\u0629'", "'\\u0639\\u062F\\u062F'", "'\\u0645\\u0646\\u0637\\u0642\\u064A'", 
			"'\\u062E\\u0631\\u064A\\u0637\\u0629'", "'\\u0645\\u062C\\u0645\\u0648\\u0639\\u0629'", 
			"'\\u062A\\u0627\\u0631\\u064A\\u062E'", "'\\u0643\\u0627\\u0626\\u0646'", 
			"'\\u0627\\u0630\\u0627'", null, "'\\u0627\\u062E\\u062A\\u0628\\u0631'", 
			"'\\u062D\\u0627\\u0644\\u0629'", "'\\u0628\\u0634\\u0643\\u0644-\\u0627\\u0641\\u062A\\u0631\\u0627\\u0636\\u064A'", 
			"'\\u062D\\u0644\\u0642\\u0629'", "'\\u0637\\u0627\\u0644\\u0645\\u0627'", 
			"'\\u0646\\u0641\\u0630'", "'\\u0627\\u064A\\u0642\\u0627\\u0641'", "'\\u062A\\u062C\\u0627\\u0648\\u0632'", 
			"'\\u0641\\u064A'", "'\\u0636\\u0645\\u0646'", "'\\u062F\\u0627\\u0644\\u0629'", 
			"'\\u0627\\u0631\\u062C\\u0639'", "'\\u0635\\u062D\\u064A\\u062D'", "'\\u062E\\u0627\\u0637\\u0626'", 
			"'\\u063A\\u064A\\u0631_\\u0645\\u0648\\u062C\\u0648\\u062F'", "'\\u063A\\u064A\\u0631_\\u0645\\u0639\\u0631\\u0641'", 
			"'\\u0647\\u0630\\u0627'", "'\\u0644\\u064A\\u0633_\\u0631\\u0642\\u0645'", 
			"'\\u0644\\u0627\\u0646\\u0647\\u0627\\u064A\\u0629'", "'\\u062D\\u0627\\u0648\\u0644'", 
			"'\\u0627\\u0645\\u0633\\u0643'", "'\\u0627\\u062E\\u064A\\u0631\\u0627'", 
			"'\\u0627\\u0637\\u0644\\u0642'", "'\\u0627\\u0633\\u062A\\u062B\\u0646\\u0627\\u0621'", 
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
			"'\\u0639\\u0646\\u062F_\\u0627\\u0644\\u0627\\u0631\\u0633\\u0627\\u0644'", 
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_TAG_START || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15762598695796737L) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 2744383173554273L) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & 4611747865956450351L) != 0)) {
				{
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(86);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(87);
					cssRule();
					}
					break;
				case 3:
					{
					setState(88);
					tsStatement();
					}
					break;
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR_ID:
				_localctx = new IdAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(ATTR_ID);
				setState(97);
				match(TS_ASSIGN);
				setState(98);
				match(STRING);
				}
				break;
			case ATTR_CLASS:
				_localctx = new ClassAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(ATTR_CLASS);
				setState(100);
				match(TS_ASSIGN);
				setState(101);
				match(STRING);
				}
				break;
			case ATTR_SRC:
				_localctx = new SrcAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(ATTR_SRC);
				setState(103);
				match(TS_ASSIGN);
				setState(104);
				match(STRING);
				}
				break;
			case ATTR_HREF:
				_localctx = new HrefAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(ATTR_HREF);
				setState(106);
				match(TS_ASSIGN);
				setState(107);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ParentElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(OPEN_TAG_START);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
					{
					{
					setState(111);
					attribute();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(GT);
				setState(118);
				htmlContent();
				setState(119);
				match(CLOSE_TAG);
				}
				break;
			case 2:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(OPEN_TAG_START);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
					{
					{
					setState(122);
					attribute();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 196868L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15762599241056257L) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 2744383173557347L) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & 4611747865956450351L) != 0)) {
				{
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(131);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(132);
					tsStatement();
					}
					break;
				case 3:
					{
					setState(133);
					cssRule();
					}
					break;
				case 4:
					{
					setState(134);
					text();
					}
					break;
				}
				}
				setState(139);
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(NUMBER);
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
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
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
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 196864L) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 142081093443518529L) != 0)) ) {
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
			setState(148);
			selector();
			setState(149);
			match(LBRACE);
			setState(150);
			declarationList();
			setState(151);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TS_ELEMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				identifier();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(HASH);
				setState(155);
				identifier();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(DOT);
				setState(157);
				identifier();
				}
				break;
			case CSS_MEDIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(CSS_MEDIA);
				setState(159);
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
		enterRule(_localctx, 16, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -256L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4063L) != 0)) {
				{
				setState(162);
				declaration();
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(163);
						match(SEMI);
						setState(164);
						declaration();
						}
						} 
					}
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(172);
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
			setState(175);
			cssProperty();
			setState(176);
			match(COLON);
			setState(177);
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
		enterRule(_localctx, 20, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(NUMBER);
				}
				break;
			case CSS_UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(CSS_UNIT);
				}
				break;
			case CSS_HEX_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(CSS_HEX_COLOR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(STRING);
				}
				break;
			case CSS_INHERIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(CSS_INHERIT);
				}
				break;
			case CSS_INITIAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				match(CSS_INITIAL);
				}
				break;
			case CSS_UNSET:
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				match(CSS_UNSET);
				}
				break;
			case CSS_NONE:
				enterOuterAlt(_localctx, 9);
				{
				setState(189);
				match(CSS_NONE);
				}
				break;
			case CSS_AUTO:
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
				match(CSS_AUTO);
				}
				break;
			case CSS_CENTER:
				enterOuterAlt(_localctx, 11);
				{
				setState(191);
				match(CSS_CENTER);
				}
				break;
			case CSS_SOLID:
				enterOuterAlt(_localctx, 12);
				{
				setState(192);
				match(CSS_SOLID);
				}
				break;
			case CSS_DASHED:
				enterOuterAlt(_localctx, 13);
				{
				setState(193);
				match(CSS_DASHED);
				}
				break;
			case CSS_DOTTED:
				enterOuterAlt(_localctx, 14);
				{
				setState(194);
				match(CSS_DOTTED);
				}
				break;
			case CSS_DOUBLE:
				enterOuterAlt(_localctx, 15);
				{
				setState(195);
				match(CSS_DOUBLE);
				}
				break;
			case CSS_HIDDEN:
				enterOuterAlt(_localctx, 16);
				{
				setState(196);
				match(CSS_HIDDEN);
				}
				break;
			case CSS_BLOCK:
				enterOuterAlt(_localctx, 17);
				{
				setState(197);
				match(CSS_BLOCK);
				}
				break;
			case CSS_INLINE:
				enterOuterAlt(_localctx, 18);
				{
				setState(198);
				match(CSS_INLINE);
				}
				break;
			case CSS_FLEX_VALUE:
				enterOuterAlt(_localctx, 19);
				{
				setState(199);
				match(CSS_FLEX_VALUE);
				}
				break;
			case CSS_ABSOLUTE:
				enterOuterAlt(_localctx, 20);
				{
				setState(200);
				match(CSS_ABSOLUTE);
				}
				break;
			case CSS_RELATIVE:
				enterOuterAlt(_localctx, 21);
				{
				setState(201);
				match(CSS_RELATIVE);
				}
				break;
			case CSS_FIXED:
				enterOuterAlt(_localctx, 22);
				{
				setState(202);
				match(CSS_FIXED);
				}
				break;
			case CSS_STICKY:
				enterOuterAlt(_localctx, 23);
				{
				setState(203);
				match(CSS_STICKY);
				}
				break;
			case CSS_ROW:
				enterOuterAlt(_localctx, 24);
				{
				setState(204);
				match(CSS_ROW);
				}
				break;
			case CSS_COLUMN:
				enterOuterAlt(_localctx, 25);
				{
				setState(205);
				match(CSS_COLUMN);
				}
				break;
			case CSS_WRAP:
				enterOuterAlt(_localctx, 26);
				{
				setState(206);
				match(CSS_WRAP);
				}
				break;
			case CSS_BOLD:
				enterOuterAlt(_localctx, 27);
				{
				setState(207);
				match(CSS_BOLD);
				}
				break;
			case CSS_ITALIC:
				enterOuterAlt(_localctx, 28);
				{
				setState(208);
				match(CSS_ITALIC);
				}
				break;
			case CSS_FLEX:
				enterOuterAlt(_localctx, 29);
				{
				setState(209);
				match(CSS_FLEX);
				}
				break;
			case CSS_GRID:
				enterOuterAlt(_localctx, 30);
				{
				setState(210);
				match(CSS_GRID);
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
				enterOuterAlt(_localctx, 31);
				{
				setState(211);
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
		enterRule(_localctx, 24, RULE_cssFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(215);
			match(LPAREN);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_FLEX || _la==CSS_GRID || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 8571060223L) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & 576460752303423503L) != 0)) {
				{
				setState(216);
				cssValue();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(217);
					match(COMMA);
					setState(218);
					cssValue();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(226);
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
		enterRule(_localctx, 26, RULE_tsType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		enterRule(_localctx, 28, RULE_tsStatement);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				tsDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				arrayLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				forLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(238);
				tryCatchStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(239);
				expressionStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(240);
				builtInCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(241);
				block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(242);
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
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(TS_INTERFACE);
			setState(246);
			match(IDENTIFIER);
			setState(247);
			match(LBRACE);
			setState(248);
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
		enterRule(_localctx, 32, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(251);
			identifier();
			setState(252);
			match(COLON);
			setState(253);
			tsType();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TS_ASSIGN) {
				{
				setState(254);
				match(TS_ASSIGN);
				setState(255);
				expression();
				}
			}

			setState(258);
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
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_tsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(261);
				identifier();
				setState(262);
				match(COLON);
				setState(263);
				tsType();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TS_ASSIGN) {
					{
					setState(264);
					match(TS_ASSIGN);
					setState(265);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(268);
				identifier();
				setState(269);
				match(COLON);
				setState(270);
				tsType();
				setState(271);
				match(LBRACK);
				setState(272);
				match(RBRACK);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TS_ASSIGN) {
					{
					setState(273);
					match(TS_ASSIGN);
					setState(274);
					arrayLiteral();
					}
				}

				}
				break;
			case 3:
				{
				setState(277);
				identifier();
				setState(278);
				match(TS_ASSIGN);
				setState(279);
				objectLiteral();
				}
				break;
			}
			setState(283);
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
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LBRACE);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 4035242884047052807L) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & 1161928703863128065L) != 0) || _la==STRING) {
				{
				{
				setState(286);
				tsStatement();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
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
		enterRule(_localctx, 38, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			identifier();
			setState(295);
			_la = _input.LA(1);
			if ( !(((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & 4194319L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(296);
			expression();
			setState(297);
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
		enterRule(_localctx, 40, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(TS_IF);
			setState(300);
			match(LPAREN);
			setState(301);
			expression();
			setState(302);
			match(RPAREN);
			setState(303);
			tsStatement();
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(304);
				match(TS_ELSE);
				setState(305);
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
		enterRule(_localctx, 42, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(TS_FOR);
			setState(309);
			match(LPAREN);
			{
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TS_VAR:
			case TS_LET:
			case TS_CONST:
				{
				setState(310);
				variableDeclaration();
				}
				break;
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
			case LPAREN:
			case STRING:
				{
				setState(311);
				assignmentExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(314);
			expression();
			setState(315);
			match(SEMI);
			setState(316);
			expression();
			}
			setState(318);
			match(RPAREN);
			setState(319);
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
		enterRule(_localctx, 44, RULE_arrayLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(TS_FOR);
			setState(322);
			match(LPAREN);
			setState(323);
			match(TS_CONST);
			setState(324);
			identifier();
			setState(325);
			_la = _input.LA(1);
			if ( !(_la==TS_OF || _la==TS_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(326);
			expression();
			setState(327);
			match(RPAREN);
			setState(328);
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
		enterRule(_localctx, 46, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(TS_WHILE);
			setState(331);
			match(LPAREN);
			setState(332);
			expression();
			setState(333);
			match(RPAREN);
			setState(334);
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
		enterRule(_localctx, 48, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(TS_FUNCTION);
			setState(337);
			identifier();
			setState(338);
			match(LPAREN);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(339);
				parameterList();
				}
			}

			setState(342);
			match(RPAREN);
			setState(343);
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
		enterRule(_localctx, 50, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(IDENTIFIER);
			setState(346);
			match(COLON);
			setState(347);
			tsType();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(348);
				match(COMMA);
				setState(349);
				match(IDENTIFIER);
				setState(350);
				match(COLON);
				setState(351);
				tsType();
				}
				}
				setState(356);
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
		enterRule(_localctx, 52, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(TS_RETURN);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & 180144135418675263L) != 0) || _la==LPAREN || _la==STRING) {
				{
				setState(358);
				expression();
				}
			}

			setState(361);
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
		enterRule(_localctx, 54, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(TS_TRY);
			setState(364);
			block();
			setState(365);
			match(TS_CATCH);
			setState(366);
			match(LPAREN);
			setState(367);
			identifier();
			setState(368);
			match(RPAREN);
			setState(369);
			block();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TS_FINALLY) {
				{
				setState(370);
				match(TS_FINALLY);
				setState(371);
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
		enterRule(_localctx, 56, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			expression();
			setState(375);
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
		enterRule(_localctx, 58, RULE_builtInCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TS_CONSOLE:
				{
				setState(377);
				match(TS_CONSOLE);
				setState(378);
				match(DOT);
				setState(379);
				match(TS_LOG);
				}
				break;
			case TS_LOG:
				{
				setState(380);
				match(TS_LOG);
				}
				break;
			case TS_ALERT:
				{
				setState(381);
				match(TS_ALERT);
				}
				break;
			case TS_PROMPT:
				{
				setState(382);
				match(TS_PROMPT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(385);
			match(LPAREN);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & 180144135418675263L) != 0) || _la==LPAREN || _la==STRING) {
				{
				setState(386);
				expression();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(387);
					match(COMMA);
					setState(388);
					expression();
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(396);
			match(RPAREN);
			setState(397);
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
		enterRule(_localctx, 60, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		enterRule(_localctx, 62, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			logicalOrExpression();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TS_ASSIGN) {
				{
				setState(402);
				match(TS_ASSIGN);
				setState(403);
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
		enterRule(_localctx, 64, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			logicalAndExpression();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TS_OR) {
				{
				{
				setState(407);
				match(TS_OR);
				setState(408);
				logicalAndExpression();
				}
				}
				setState(413);
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
		enterRule(_localctx, 66, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			equalityExpression();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TS_AND) {
				{
				{
				setState(415);
				match(TS_AND);
				setState(416);
				equalityExpression();
				}
				}
				setState(421);
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
		enterRule(_localctx, 68, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			relationalExpression();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & 15L) != 0)) {
				{
				{
				setState(423);
				_la = _input.LA(1);
				if ( !(((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(424);
				relationalExpression();
				}
				}
				setState(429);
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
		enterRule(_localctx, 70, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			additiveExpression();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TS_IN || _la==TS_INSTANCEOF || ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & 6442450947L) != 0)) {
				{
				{
				setState(431);
				_la = _input.LA(1);
				if ( !(_la==TS_IN || _la==TS_INSTANCEOF || ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & 6442450947L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(432);
				additiveExpression();
				}
				}
				setState(437);
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
		enterRule(_localctx, 72, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			multiplicativeExpression();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(439);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(440);
				multiplicativeExpression();
				}
				}
				setState(445);
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
		enterRule(_localctx, 74, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			memberExpression();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & 7L) != 0)) {
				{
				{
				setState(447);
				_la = _input.LA(1);
				if ( !(((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
				memberExpression();
				}
				}
				setState(453);
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
		enterRule(_localctx, 76, RULE_memberExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			primaryExpression();
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(473);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAREN:
						{
						setState(455);
						match(LPAREN);
						setState(464);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & 180144135418675263L) != 0) || _la==LPAREN || _la==STRING) {
							{
							setState(456);
							expression();
							setState(461);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(457);
								match(COMMA);
								setState(458);
								expression();
								}
								}
								setState(463);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(466);
						match(RPAREN);
						}
						break;
					case DOT:
						{
						setState(467);
						match(DOT);
						setState(468);
						_la = _input.LA(1);
						if ( !(((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & 2317L) != 0)) ) {
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
						setState(469);
						match(LBRACK);
						setState(470);
						expression();
						setState(471);
						match(RBRACK);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primaryExpression);
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TS_ELEMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				identifier();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				match(STRING);
				}
				break;
			case TS_TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				match(TS_TRUE);
				}
				break;
			case TS_FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
				match(TS_FALSE);
				}
				break;
			case TS_NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(483);
				match(TS_NULL);
				}
				break;
			case TS_UNDEFINED:
				enterOuterAlt(_localctx, 7);
				{
				setState(484);
				match(TS_UNDEFINED);
				}
				break;
			case TS_THIS:
				enterOuterAlt(_localctx, 8);
				{
				setState(485);
				match(TS_THIS);
				}
				break;
			case TS_NAN:
				enterOuterAlt(_localctx, 9);
				{
				setState(486);
				match(TS_NAN);
				}
				break;
			case TS_DOCUMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(487);
				match(TS_DOCUMENT);
				}
				break;
			case TS_WINDOW:
				enterOuterAlt(_localctx, 11);
				{
				setState(488);
				match(TS_WINDOW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 12);
				{
				setState(489);
				match(LPAREN);
				setState(490);
				expression();
				setState(491);
				match(RPAREN);
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
		enterRule(_localctx, 80, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(LBRACK);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & 180144135418675263L) != 0) || _la==LPAREN || _la==STRING) {
				{
				setState(496);
				expression();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(497);
					match(COMMA);
					setState(498);
					expression();
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(506);
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
		enterRule(_localctx, 82, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(LBRACE);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TS_ELEMENT || _la==IDENTIFIER) {
				{
				setState(509);
				identifier();
				setState(510);
				match(COLON);
				setState(511);
				expression();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(512);
					match(COMMA);
					setState(513);
					identifier();
					setState(514);
					match(COLON);
					setState(515);
					expression();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(524);
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
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		"\u0004\u0001\u0105\u0211\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001m\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002q\b\u0002"+
		"\n\u0002\f\u0002t\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002|\b\u0002\n\u0002\f\u0002\u007f\t"+
		"\u0002\u0001\u0002\u0003\u0002\u0082\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u0088\b\u0003\n\u0003\f\u0003\u008b\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0091\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00a1\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00a6\b\b\n\b\f\b\u00a9\t\b\u0003\b\u00ab\b\b\u0001\b\u0003"+
		"\b\u00ae\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00d5\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00dc\b\f\n\f\f\f\u00df\t\f\u0003\f\u00e1\b\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00f4\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0101\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u010b\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0114\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u011a\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u0120\b\u0012"+
		"\n\u0012\f\u0012\u0123\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0133"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0139"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0155\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0161\b\u0019\n\u0019\f\u0019"+
		"\u0164\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0168\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0175"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0180\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0186\b\u001d\n"+
		"\u001d\f\u001d\u0189\t\u001d\u0003\u001d\u018b\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0195\b\u001f\u0001 \u0001 \u0001 \u0005 \u019a\b "+
		"\n \f \u019d\t \u0001!\u0001!\u0001!\u0005!\u01a2\b!\n!\f!\u01a5\t!\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u01aa\b\"\n\"\f\"\u01ad\t\"\u0001#\u0001#\u0001"+
		"#\u0005#\u01b2\b#\n#\f#\u01b5\t#\u0001$\u0001$\u0001$\u0005$\u01ba\b$"+
		"\n$\f$\u01bd\t$\u0001%\u0001%\u0001%\u0005%\u01c2\b%\n%\f%\u01c5\t%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0005&\u01cc\b&\n&\f&\u01cf\t&\u0003&\u01d1"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u01da\b&\n"+
		"&\f&\u01dd\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u01ee\b\'\u0001(\u0001(\u0001(\u0001(\u0005(\u01f4\b(\n(\f(\u01f7\t"+
		"(\u0003(\u01f9\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0206\b)\n)\f)\u0209\t)\u0003)\u020b\b)"+
		"\u0001)\u0001)\u0001*\u0001*\u0001*\u0000\u0000+\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRT\u0000\r\b\u0000\b\b\u0010\u0011\\\\bbxz\u0085\u0086"+
		"\u008a\u008b\u008f\u0094\u0002\u0000\bDFK\u0001\u0000pw\u0002\u0000{|"+
		"~\u0080\u0001\u0000xz\u0002\u0000\u00d2\u00d5\u00e8\u00e8\u0001\u0000"+
		"\u008f\u0090\u0001\u0000\u00dc\u00df\u0004\u0000\u0090\u0090\u00b1\u00b1"+
		"\u00e0\u00e1\u00ff\u0100\u0001\u0000\u00fa\u00fb\u0001\u0000\u00fc\u00fe"+
		"\u0004\u0000\u00bf\u00bf\u00c1\u00c2\u00c7\u00c7\u00ca\u00ca\u0002\u0000"+
		"\u00b8\u00b8\u00ca\u00ca\u0253\u0000[\u0001\u0000\u0000\u0000\u0002l\u0001"+
		"\u0000\u0000\u0000\u0004\u0081\u0001\u0000\u0000\u0000\u0006\u0089\u0001"+
		"\u0000\u0000\u0000\b\u0090\u0001\u0000\u0000\u0000\n\u0092\u0001\u0000"+
		"\u0000\u0000\f\u0094\u0001\u0000\u0000\u0000\u000e\u00a0\u0001\u0000\u0000"+
		"\u0000\u0010\u00aa\u0001\u0000\u0000\u0000\u0012\u00af\u0001\u0000\u0000"+
		"\u0000\u0014\u00b3\u0001\u0000\u0000\u0000\u0016\u00d4\u0001\u0000\u0000"+
		"\u0000\u0018\u00d6\u0001\u0000\u0000\u0000\u001a\u00e4\u0001\u0000\u0000"+
		"\u0000\u001c\u00f3\u0001\u0000\u0000\u0000\u001e\u00f5\u0001\u0000\u0000"+
		"\u0000 \u00fa\u0001\u0000\u0000\u0000\"\u0104\u0001\u0000\u0000\u0000"+
		"$\u011d\u0001\u0000\u0000\u0000&\u0126\u0001\u0000\u0000\u0000(\u012b"+
		"\u0001\u0000\u0000\u0000*\u0134\u0001\u0000\u0000\u0000,\u0141\u0001\u0000"+
		"\u0000\u0000.\u014a\u0001\u0000\u0000\u00000\u0150\u0001\u0000\u0000\u0000"+
		"2\u0159\u0001\u0000\u0000\u00004\u0165\u0001\u0000\u0000\u00006\u016b"+
		"\u0001\u0000\u0000\u00008\u0176\u0001\u0000\u0000\u0000:\u017f\u0001\u0000"+
		"\u0000\u0000<\u018f\u0001\u0000\u0000\u0000>\u0191\u0001\u0000\u0000\u0000"+
		"@\u0196\u0001\u0000\u0000\u0000B\u019e\u0001\u0000\u0000\u0000D\u01a6"+
		"\u0001\u0000\u0000\u0000F\u01ae\u0001\u0000\u0000\u0000H\u01b6\u0001\u0000"+
		"\u0000\u0000J\u01be\u0001\u0000\u0000\u0000L\u01c6\u0001\u0000\u0000\u0000"+
		"N\u01ed\u0001\u0000\u0000\u0000P\u01ef\u0001\u0000\u0000\u0000R\u01fc"+
		"\u0001\u0000\u0000\u0000T\u020e\u0001\u0000\u0000\u0000VZ\u0003\u0004"+
		"\u0002\u0000WZ\u0003\f\u0006\u0000XZ\u0003\u001c\u000e\u0000YV\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\u0000\u0000"+
		"\u0001_\u0001\u0001\u0000\u0000\u0000`a\u0005\u0004\u0000\u0000ab\u0005"+
		"\u00e8\u0000\u0000bm\u0005\u0105\u0000\u0000cd\u0005\u0005\u0000\u0000"+
		"de\u0005\u00e8\u0000\u0000em\u0005\u0105\u0000\u0000fg\u0005\u0006\u0000"+
		"\u0000gh\u0005\u00e8\u0000\u0000hm\u0005\u0105\u0000\u0000ij\u0005\u0007"+
		"\u0000\u0000jk\u0005\u00e8\u0000\u0000km\u0005\u0105\u0000\u0000l`\u0001"+
		"\u0000\u0000\u0000lc\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000"+
		"li\u0001\u0000\u0000\u0000m\u0003\u0001\u0000\u0000\u0000nr\u0005\u0002"+
		"\u0000\u0000oq\u0003\u0002\u0001\u0000po\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u0100\u0000"+
		"\u0000vw\u0003\u0006\u0003\u0000wx\u0005\u0001\u0000\u0000x\u0082\u0001"+
		"\u0000\u0000\u0000y}\u0005\u0002\u0000\u0000z|\u0003\u0002\u0001\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u0082\u0005\u0003\u0000\u0000\u0081"+
		"n\u0001\u0000\u0000\u0000\u0081y\u0001\u0000\u0000\u0000\u0082\u0005\u0001"+
		"\u0000\u0000\u0000\u0083\u0088\u0003\u0004\u0002\u0000\u0084\u0088\u0003"+
		"\u001c\u000e\u0000\u0085\u0088\u0003\f\u0006\u0000\u0086\u0088\u0003\b"+
		"\u0004\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0007\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0091\u0005\u0105"+
		"\u0000\u0000\u008d\u0091\u0005\u00ca\u0000\u0000\u008e\u0091\u0005\u00cc"+
		"\u0000\u0000\u008f\u0091\u0003\n\u0005\u0000\u0090\u008c\u0001\u0000\u0000"+
		"\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\t\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0007\u0000\u0000\u0000\u0093\u000b\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0003\u000e\u0007\u0000\u0095\u0096\u0005\u00ed\u0000\u0000"+
		"\u0096\u0097\u0003\u0010\b\u0000\u0097\u0098\u0005\u00ee\u0000\u0000\u0098"+
		"\r\u0001\u0000\u0000\u0000\u0099\u00a1\u0003T*\u0000\u009a\u009b\u0005"+
		"\u00f3\u0000\u0000\u009b\u00a1\u0003T*\u0000\u009c\u009d\u0005\u00f2\u0000"+
		"\u0000\u009d\u00a1\u0003T*\u0000\u009e\u009f\u0005E\u0000\u0000\u009f"+
		"\u00a1\u0003T*\u0000\u00a0\u0099\u0001\u0000\u0000\u0000\u00a0\u009a\u0001"+
		"\u0000\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a7\u0003"+
		"\u0012\t\u0000\u00a3\u00a4\u0005\u00f0\u0000\u0000\u00a4\u00a6\u0003\u0012"+
		"\t\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00ae\u0005\u00f0\u0000"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u0011\u0001\u0000\u0000\u0000\u00af\u00b0\u0003\u0014\n\u0000"+
		"\u00b0\u00b1\u0005\u00ef\u0000\u0000\u00b1\u00b2\u0003\u0016\u000b\u0000"+
		"\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0001\u0000\u0000"+
		"\u00b4\u0015\u0001\u0000\u0000\u0000\u00b5\u00d5\u0005\u00ca\u0000\u0000"+
		"\u00b6\u00d5\u0005\u00cc\u0000\u0000\u00b7\u00d5\u0005\u00cb\u0000\u0000"+
		"\u00b8\u00d5\u0005\u00cd\u0000\u0000\u00b9\u00d5\u0005\u0105\u0000\u0000"+
		"\u00ba\u00d5\u0005W\u0000\u0000\u00bb\u00d5\u0005X\u0000\u0000\u00bc\u00d5"+
		"\u0005Y\u0000\u0000\u00bd\u00d5\u0005Z\u0000\u0000\u00be\u00d5\u0005["+
		"\u0000\u0000\u00bf\u00d5\u0005\\\u0000\u0000\u00c0\u00d5\u0005]\u0000"+
		"\u0000\u00c1\u00d5\u0005^\u0000\u0000\u00c2\u00d5\u0005_\u0000\u0000\u00c3"+
		"\u00d5\u0005`\u0000\u0000\u00c4\u00d5\u0005a\u0000\u0000\u00c5\u00d5\u0005"+
		"b\u0000\u0000\u00c6\u00d5\u0005c\u0000\u0000\u00c7\u00d5\u0005d\u0000"+
		"\u0000\u00c8\u00d5\u0005e\u0000\u0000\u00c9\u00d5\u0005f\u0000\u0000\u00ca"+
		"\u00d5\u0005g\u0000\u0000\u00cb\u00d5\u0005h\u0000\u0000\u00cc\u00d5\u0005"+
		"i\u0000\u0000\u00cd\u00d5\u0005j\u0000\u0000\u00ce\u00d5\u0005k\u0000"+
		"\u0000\u00cf\u00d5\u0005m\u0000\u0000\u00d0\u00d5\u0005n\u0000\u0000\u00d1"+
		"\u00d5\u0005\u0017\u0000\u0000\u00d2\u00d5\u0005\u001c\u0000\u0000\u00d3"+
		"\u00d5\u0003\u0018\f\u0000\u00d4\u00b5\u0001\u0000\u0000\u0000\u00d4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00d4\u00b7\u0001\u0000\u0000\u0000\u00d4\u00b8"+
		"\u0001\u0000\u0000\u0000\u00d4\u00b9\u0001\u0000\u0000\u0000\u00d4\u00ba"+
		"\u0001\u0000\u0000\u0000\u00d4\u00bb\u0001\u0000\u0000\u0000\u00d4\u00bc"+
		"\u0001\u0000\u0000\u0000\u00d4\u00bd\u0001\u0000\u0000\u0000\u00d4\u00be"+
		"\u0001\u0000\u0000\u0000\u00d4\u00bf\u0001\u0000\u0000\u0000\u00d4\u00c0"+
		"\u0001\u0000\u0000\u0000\u00d4\u00c1\u0001\u0000\u0000\u0000\u00d4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00d4\u00c3\u0001\u0000\u0000\u0000\u00d4\u00c4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00c5\u0001\u0000\u0000\u0000\u00d4\u00c6"+
		"\u0001\u0000\u0000\u0000\u00d4\u00c7\u0001\u0000\u0000\u0000\u00d4\u00c8"+
		"\u0001\u0000\u0000\u0000\u00d4\u00c9\u0001\u0000\u0000\u0000\u00d4\u00ca"+
		"\u0001\u0000\u0000\u0000\u00d4\u00cb\u0001\u0000\u0000\u0000\u00d4\u00cc"+
		"\u0001\u0000\u0000\u0000\u00d4\u00cd\u0001\u0000\u0000\u0000\u00d4\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u0017"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0007\u0002\u0000\u0000\u00d7\u00e0"+
		"\u0005\u00f4\u0000\u0000\u00d8\u00dd\u0003\u0016\u000b\u0000\u00d9\u00da"+
		"\u0005\u00f1\u0000\u0000\u00da\u00dc\u0003\u0016\u000b\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00d8"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u00f5\u0000\u0000\u00e3\u0019"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0007\u0003\u0000\u0000\u00e5\u001b"+
		"\u0001\u0000\u0000\u0000\u00e6\u00f4\u0003\"\u0011\u0000\u00e7\u00f4\u0003"+
		"&\u0013\u0000\u00e8\u00f4\u0003(\u0014\u0000\u00e9\u00f4\u0003,\u0016"+
		"\u0000\u00ea\u00f4\u0003*\u0015\u0000\u00eb\u00f4\u0003.\u0017\u0000\u00ec"+
		"\u00f4\u00030\u0018\u0000\u00ed\u00f4\u00034\u001a\u0000\u00ee\u00f4\u0003"+
		"6\u001b\u0000\u00ef\u00f4\u00038\u001c\u0000\u00f0\u00f4\u0003:\u001d"+
		"\u0000\u00f1\u00f4\u0003$\u0012\u0000\u00f2\u00f4\u0003\u001e\u000f\u0000"+
		"\u00f3\u00e6\u0001\u0000\u0000\u0000\u00f3\u00e7\u0001\u0000\u0000\u0000"+
		"\u00f3\u00e8\u0001\u0000\u0000\u0000\u00f3\u00e9\u0001\u0000\u0000\u0000"+
		"\u00f3\u00ea\u0001\u0000\u0000\u0000\u00f3\u00eb\u0001\u0000\u0000\u0000"+
		"\u00f3\u00ec\u0001\u0000\u0000\u0000\u00f3\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f3\u00ee\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u001d\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0005\u00a4\u0000\u0000\u00f6\u00f7\u0005\u00ca\u0000\u0000"+
		"\u00f7\u00f8\u0005\u00ed\u0000\u0000\u00f8\u00f9\u0005\u00ee\u0000\u0000"+
		"\u00f9\u001f\u0001\u0000\u0000\u0000\u00fa\u00fb\u0007\u0004\u0000\u0000"+
		"\u00fb\u00fc\u0003T*\u0000\u00fc\u00fd\u0005\u00ef\u0000\u0000\u00fd\u0100"+
		"\u0003\u001a\r\u0000\u00fe\u00ff\u0005\u00e8\u0000\u0000\u00ff\u0101\u0003"+
		"<\u001e\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u00f0"+
		"\u0000\u0000\u0103!\u0001\u0000\u0000\u0000\u0104\u0119\u0007\u0004\u0000"+
		"\u0000\u0105\u0106\u0003T*\u0000\u0106\u0107\u0005\u00ef\u0000\u0000\u0107"+
		"\u010a\u0003\u001a\r\u0000\u0108\u0109\u0005\u00e8\u0000\u0000\u0109\u010b"+
		"\u0003<\u001e\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u011a\u0001\u0000\u0000\u0000\u010c\u010d\u0003"+
		"T*\u0000\u010d\u010e\u0005\u00ef\u0000\u0000\u010e\u010f\u0003\u001a\r"+
		"\u0000\u010f\u0110\u0005\u00f8\u0000\u0000\u0110\u0113\u0005\u00f9\u0000"+
		"\u0000\u0111\u0112\u0005\u00e8\u0000\u0000\u0112\u0114\u0003P(\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u011a\u0001\u0000\u0000\u0000\u0115\u0116\u0003T*\u0000\u0116\u0117\u0005"+
		"\u00e8\u0000\u0000\u0117\u0118\u0003R)\u0000\u0118\u011a\u0001\u0000\u0000"+
		"\u0000\u0119\u0105\u0001\u0000\u0000\u0000\u0119\u010c\u0001\u0000\u0000"+
		"\u0000\u0119\u0115\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0005\u00f0\u0000\u0000\u011c#\u0001\u0000\u0000\u0000"+
		"\u011d\u0121\u0005\u00ed\u0000\u0000\u011e\u0120\u0003\u001c\u000e\u0000"+
		"\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000"+
		"\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000"+
		"\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0005\u00ee\u0000\u0000\u0125%\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0003T*\u0000\u0127\u0128\u0007\u0005\u0000\u0000\u0128\u0129\u0003"+
		"<\u001e\u0000\u0129\u012a\u0005\u00f0\u0000\u0000\u012a\'\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005\u0085\u0000\u0000\u012c\u012d\u0005\u00f4"+
		"\u0000\u0000\u012d\u012e\u0003<\u001e\u0000\u012e\u012f\u0005\u00f5\u0000"+
		"\u0000\u012f\u0132\u0003\u001c\u000e\u0000\u0130\u0131\u0005\u0086\u0000"+
		"\u0000\u0131\u0133\u0003\u001c\u000e\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133)\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0005\u008a\u0000\u0000\u0135\u0138\u0005\u00f4\u0000\u0000"+
		"\u0136\u0139\u0003 \u0010\u0000\u0137\u0139\u0003>\u001f\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0003<\u001e\u0000\u013b\u013c\u0005"+
		"\u00f0\u0000\u0000\u013c\u013d\u0003<\u001e\u0000\u013d\u013e\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0005\u00f5\u0000\u0000\u013f\u0140\u0003$\u0012"+
		"\u0000\u0140+\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u008a\u0000\u0000"+
		"\u0142\u0143\u0005\u00f4\u0000\u0000\u0143\u0144\u0005z\u0000\u0000\u0144"+
		"\u0145\u0003T*\u0000\u0145\u0146\u0007\u0006\u0000\u0000\u0146\u0147\u0003"+
		"<\u001e\u0000\u0147\u0148\u0005\u00f5\u0000\u0000\u0148\u0149\u0003$\u0012"+
		"\u0000\u0149-\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u008b\u0000\u0000"+
		"\u014b\u014c\u0005\u00f4\u0000\u0000\u014c\u014d\u0003<\u001e\u0000\u014d"+
		"\u014e\u0005\u00f5\u0000\u0000\u014e\u014f\u0003$\u0012\u0000\u014f/\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0005\u0091\u0000\u0000\u0151\u0152\u0003"+
		"T*\u0000\u0152\u0154\u0005\u00f4\u0000\u0000\u0153\u0155\u00032\u0019"+
		"\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u00f5\u0000"+
		"\u0000\u0157\u0158\u0003$\u0012\u0000\u01581\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005\u00ca\u0000\u0000\u015a\u015b\u0005\u00ef\u0000\u0000\u015b"+
		"\u0162\u0003\u001a\r\u0000\u015c\u015d\u0005\u00f1\u0000\u0000\u015d\u015e"+
		"\u0005\u00ca\u0000\u0000\u015e\u015f\u0005\u00ef\u0000\u0000\u015f\u0161"+
		"\u0003\u001a\r\u0000\u0160\u015c\u0001\u0000\u0000\u0000\u0161\u0164\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u01633\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000"+
		"\u0000\u0000\u0165\u0167\u0005\u0092\u0000\u0000\u0166\u0168\u0003<\u001e"+
		"\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u00f0\u0000"+
		"\u0000\u016a5\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u009a\u0000\u0000"+
		"\u016c\u016d\u0003$\u0012\u0000\u016d\u016e\u0005\u009b\u0000\u0000\u016e"+
		"\u016f\u0005\u00f4\u0000\u0000\u016f\u0170\u0003T*\u0000\u0170\u0171\u0005"+
		"\u00f5\u0000\u0000\u0171\u0174\u0003$\u0012\u0000\u0172\u0173\u0005\u009c"+
		"\u0000\u0000\u0173\u0175\u0003$\u0012\u0000\u0174\u0172\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u01757\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0003<\u001e\u0000\u0177\u0178\u0005\u00f0\u0000\u0000\u0178"+
		"9\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u00b5\u0000\u0000\u017a\u017b"+
		"\u0005\u00f2\u0000\u0000\u017b\u0180\u0005\u00c7\u0000\u0000\u017c\u0180"+
		"\u0005\u00c7\u0000\u0000\u017d\u0180\u0005\u00c8\u0000\u0000\u017e\u0180"+
		"\u0005\u00c9\u0000\u0000\u017f\u0179\u0001\u0000\u0000\u0000\u017f\u017c"+
		"\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u017e"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u018a"+
		"\u0005\u00f4\u0000\u0000\u0182\u0187\u0003<\u001e\u0000\u0183\u0184\u0005"+
		"\u00f1\u0000\u0000\u0184\u0186\u0003<\u001e\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000"+
		"\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u0182\u0001\u0000"+
		"\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0005\u00f5\u0000\u0000\u018d\u018e\u0005\u00f0"+
		"\u0000\u0000\u018e;\u0001\u0000\u0000\u0000\u018f\u0190\u0003>\u001f\u0000"+
		"\u0190=\u0001\u0000\u0000\u0000\u0191\u0194\u0003@ \u0000\u0192\u0193"+
		"\u0005\u00e8\u0000\u0000\u0193\u0195\u0003<\u001e\u0000\u0194\u0192\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195?\u0001\u0000"+
		"\u0000\u0000\u0196\u019b\u0003B!\u0000\u0197\u0198\u0005\u00e3\u0000\u0000"+
		"\u0198\u019a\u0003B!\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019d"+
		"\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0001\u0000\u0000\u0000\u019cA\u0001\u0000\u0000\u0000\u019d\u019b\u0001"+
		"\u0000\u0000\u0000\u019e\u01a3\u0003D\"\u0000\u019f\u01a0\u0005\u00e2"+
		"\u0000\u0000\u01a0\u01a2\u0003D\"\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4C\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01ab\u0003F#\u0000\u01a7\u01a8"+
		"\u0007\u0007\u0000\u0000\u01a8\u01aa\u0003F#\u0000\u01a9\u01a7\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01acE\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01b3\u0003H$\u0000\u01af"+
		"\u01b0\u0007\b\u0000\u0000\u01b0\u01b2\u0003H$\u0000\u01b1\u01af\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4G\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01bb\u0003J%\u0000"+
		"\u01b7\u01b8\u0007\t\u0000\u0000\u01b8\u01ba\u0003J%\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bcI\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c3\u0003"+
		"L&\u0000\u01bf\u01c0\u0007\n\u0000\u0000\u01c0\u01c2\u0003L&\u0000\u01c1"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4"+
		"K\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01db"+
		"\u0003N\'\u0000\u01c7\u01d0\u0005\u00f4\u0000\u0000\u01c8\u01cd\u0003"+
		"<\u001e\u0000\u01c9\u01ca\u0005\u00f1\u0000\u0000\u01ca\u01cc\u0003<\u001e"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000"+
		"\u0000\u01d0\u01c8\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01da\u0005\u00f5\u0000"+
		"\u0000\u01d3\u01d4\u0005\u00f2\u0000\u0000\u01d4\u01da\u0007\u000b\u0000"+
		"\u0000\u01d5\u01d6\u0005\u00f8\u0000\u0000\u01d6\u01d7\u0003<\u001e\u0000"+
		"\u01d7\u01d8\u0005\u00f9\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000"+
		"\u01d9\u01c7\u0001\u0000\u0000\u0000\u01d9\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d9\u01d5\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000"+
		"\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000"+
		"\u01dcM\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de"+
		"\u01ee\u0003T*\u0000\u01df\u01ee\u0005\u00cc\u0000\u0000\u01e0\u01ee\u0005"+
		"\u0105\u0000\u0000\u01e1\u01ee\u0005\u0093\u0000\u0000\u01e2\u01ee\u0005"+
		"\u0094\u0000\u0000\u01e3\u01ee\u0005\u0095\u0000\u0000\u01e4\u01ee\u0005"+
		"\u0096\u0000\u0000\u01e5\u01ee\u0005\u0097\u0000\u0000\u01e6\u01ee\u0005"+
		"\u0098\u0000\u0000\u01e7\u01ee\u0005\u00b3\u0000\u0000\u01e8\u01ee\u0005"+
		"\u00b4\u0000\u0000\u01e9\u01ea\u0005\u00f4\u0000\u0000\u01ea\u01eb\u0003"+
		"<\u001e\u0000\u01eb\u01ec\u0005\u00f5\u0000\u0000\u01ec\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ed\u01de\u0001\u0000\u0000\u0000\u01ed\u01df\u0001\u0000"+
		"\u0000\u0000\u01ed\u01e0\u0001\u0000\u0000\u0000\u01ed\u01e1\u0001\u0000"+
		"\u0000\u0000\u01ed\u01e2\u0001\u0000\u0000\u0000\u01ed\u01e3\u0001\u0000"+
		"\u0000\u0000\u01ed\u01e4\u0001\u0000\u0000\u0000\u01ed\u01e5\u0001\u0000"+
		"\u0000\u0000\u01ed\u01e6\u0001\u0000\u0000\u0000\u01ed\u01e7\u0001\u0000"+
		"\u0000\u0000\u01ed\u01e8\u0001\u0000\u0000\u0000\u01ed\u01e9\u0001\u0000"+
		"\u0000\u0000\u01eeO\u0001\u0000\u0000\u0000\u01ef\u01f8\u0005\u00f8\u0000"+
		"\u0000\u01f0\u01f5\u0003<\u001e\u0000\u01f1\u01f2\u0005\u00f1\u0000\u0000"+
		"\u01f2\u01f4\u0003<\u001e\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f8\u01f0\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0005\u00f9\u0000\u0000\u01fbQ\u0001\u0000\u0000\u0000\u01fc\u020a"+
		"\u0005\u00ed\u0000\u0000\u01fd\u01fe\u0003T*\u0000\u01fe\u01ff\u0005\u00ef"+
		"\u0000\u0000\u01ff\u0207\u0003<\u001e\u0000\u0200\u0201\u0005\u00f1\u0000"+
		"\u0000\u0201\u0202\u0003T*\u0000\u0202\u0203\u0005\u00ef\u0000\u0000\u0203"+
		"\u0204\u0003<\u001e\u0000\u0204\u0206\u0001\u0000\u0000\u0000\u0205\u0200"+
		"\u0001\u0000\u0000\u0000\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0205"+
		"\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020b"+
		"\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u01fd"+
		"\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0005\u00ee\u0000\u0000\u020dS\u0001"+
		"\u0000\u0000\u0000\u020e\u020f\u0007\f\u0000\u0000\u020fU\u0001\u0000"+
		"\u0000\u0000/Y[lr}\u0081\u0087\u0089\u0090\u00a0\u00a7\u00aa\u00ad\u00d4"+
		"\u00dd\u00e0\u00f3\u0100\u010a\u0113\u0119\u0121\u0132\u0138\u0154\u0162"+
		"\u0167\u0174\u017f\u0187\u018a\u0194\u019b\u01a3\u01ab\u01b3\u01bb\u01c3"+
		"\u01cd\u01d0\u01d9\u01db\u01ed\u01f5\u01f8\u0207\u020a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}