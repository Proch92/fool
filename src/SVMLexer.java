// Generated from src/SVM.g by ANTLR 4.1

import java.util.HashMap;
import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVMLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUSH=1, POP=2, ADD=3, SUB=4, MULT=5, DIV=6, STOREW=7, LOADW=8, BRANCH=9, 
		BRANCHEQ=10, BRANCHLESS=11, JS=12, LOADRA=13, STORERA=14, LOADRV=15, STORERV=16, 
		LOADFP=17, STOREFP=18, COPYFP=19, LOADHP=20, STOREHP=21, PRINT=22, HALT=23, 
		COL=24, LABEL=25, NUMBER=26, WHITESP=27, ERR=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'push'", "'pop'", "'add'", "'sub'", "'mult'", "'div'", "'sw'", "'lw'", 
		"'b'", "'beq'", "'bless'", "'js'", "'lra'", "'sra'", "'lrv'", "'srv'", 
		"'lfp'", "'sfp'", "'cfp'", "'lhp'", "'shp'", "'print'", "'halt'", "':'", 
		"LABEL", "NUMBER", "WHITESP", "ERR"
	};
	public static final String[] ruleNames = {
		"PUSH", "POP", "ADD", "SUB", "MULT", "DIV", "STOREW", "LOADW", "BRANCH", 
		"BRANCHEQ", "BRANCHLESS", "JS", "LOADRA", "STORERA", "LOADRV", "STORERV", 
		"LOADFP", "STOREFP", "COPYFP", "LOADHP", "STOREHP", "PRINT", "HALT", "COL", 
		"LABEL", "NUMBER", "WHITESP", "ERR"
	};


	      
	    private int[] code = new int[ExecuteVM.CODESIZE];    
	    private int i = 0;
	    private HashMap<String,Integer> labelAddress = new HashMap<String,Integer>();
	    private ArrayList<String> labels = new ArrayList<String>();
	    private ArrayList<Integer> addresses  = new ArrayList<Integer>();
	    
	    public int[] createCode() throws Exception {
	       assembly();
	       return code;
	    }
	    


	public SVMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SVM.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26: WHITESP_action((RuleContext)_localctx, actionIndex); break;

		case 27: ERR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  System.out.println("Invalid char!");  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\36\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\7\32\u009e\n\32\f\32\16\32\u00a1\13\32\3\33\3\33\5\33\u00a5\n\33\3"+
		"\33\3\33\7\33\u00a9\n\33\f\33\16\33\u00ac\13\33\5\33\u00ae\n\33\3\34\6"+
		"\34\u00b1\n\34\r\34\16\34\u00b2\3\34\3\34\3\35\3\35\3\35\2\36\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\29\36\3\3\2\5\4\2C\\c|\5\2\62;C\\"+
		"c|\5\2\13\f\17\17\"\"\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5@\3\2\2\2\7D\3\2\2\2\tH\3\2\2\2\13"+
		"L\3\2\2\2\rQ\3\2\2\2\17U\3\2\2\2\21X\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27"+
		"a\3\2\2\2\31g\3\2\2\2\33j\3\2\2\2\35n\3\2\2\2\37r\3\2\2\2!v\3\2\2\2#z"+
		"\3\2\2\2%~\3\2\2\2\'\u0082\3\2\2\2)\u0086\3\2\2\2+\u008a\3\2\2\2-\u008e"+
		"\3\2\2\2/\u0094\3\2\2\2\61\u0099\3\2\2\2\63\u009b\3\2\2\2\65\u00ad\3\2"+
		"\2\2\67\u00b0\3\2\2\29\u00b6\3\2\2\2;<\7r\2\2<=\7w\2\2=>\7u\2\2>?\7j\2"+
		"\2?\4\3\2\2\2@A\7r\2\2AB\7q\2\2BC\7r\2\2C\6\3\2\2\2DE\7c\2\2EF\7f\2\2"+
		"FG\7f\2\2G\b\3\2\2\2HI\7u\2\2IJ\7w\2\2JK\7d\2\2K\n\3\2\2\2LM\7o\2\2MN"+
		"\7w\2\2NO\7n\2\2OP\7v\2\2P\f\3\2\2\2QR\7f\2\2RS\7k\2\2ST\7x\2\2T\16\3"+
		"\2\2\2UV\7u\2\2VW\7y\2\2W\20\3\2\2\2XY\7n\2\2YZ\7y\2\2Z\22\3\2\2\2[\\"+
		"\7d\2\2\\\24\3\2\2\2]^\7d\2\2^_\7g\2\2_`\7s\2\2`\26\3\2\2\2ab\7d\2\2b"+
		"c\7n\2\2cd\7g\2\2de\7u\2\2ef\7u\2\2f\30\3\2\2\2gh\7l\2\2hi\7u\2\2i\32"+
		"\3\2\2\2jk\7n\2\2kl\7t\2\2lm\7c\2\2m\34\3\2\2\2no\7u\2\2op\7t\2\2pq\7"+
		"c\2\2q\36\3\2\2\2rs\7n\2\2st\7t\2\2tu\7x\2\2u \3\2\2\2vw\7u\2\2wx\7t\2"+
		"\2xy\7x\2\2y\"\3\2\2\2z{\7n\2\2{|\7h\2\2|}\7r\2\2}$\3\2\2\2~\177\7u\2"+
		"\2\177\u0080\7h\2\2\u0080\u0081\7r\2\2\u0081&\3\2\2\2\u0082\u0083\7e\2"+
		"\2\u0083\u0084\7h\2\2\u0084\u0085\7r\2\2\u0085(\3\2\2\2\u0086\u0087\7"+
		"n\2\2\u0087\u0088\7j\2\2\u0088\u0089\7r\2\2\u0089*\3\2\2\2\u008a\u008b"+
		"\7u\2\2\u008b\u008c\7j\2\2\u008c\u008d\7r\2\2\u008d,\3\2\2\2\u008e\u008f"+
		"\7r\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092"+
		"\u0093\7v\2\2\u0093.\3\2\2\2\u0094\u0095\7j\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7v\2\2\u0098\60\3\2\2\2\u0099\u009a\7<\2\2\u009a"+
		"\62\3\2\2\2\u009b\u009f\t\2\2\2\u009c\u009e\t\3\2\2\u009d\u009c\3\2\2"+
		"\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\64"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00ae\7\62\2\2\u00a3\u00a5\7/\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00aa\4\63"+
		";\2\u00a7\u00a9\4\62;\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00a2\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ae\66\3\2\2\2\u00af\u00b1"+
		"\t\4\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\34\2\2\u00b58\3\2\2\2"+
		"\u00b6\u00b7\13\2\2\2\u00b7\u00b8\b\35\3\2\u00b8:\3\2\2\2\b\2\u009f\u00a4"+
		"\u00aa\u00ad\u00b2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}