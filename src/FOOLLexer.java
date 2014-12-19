// Generated from src/FOOL.g by ANTLR 4.1

import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOOLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMIC=1, COLON=2, COMMA=3, EQ=4, ASS=5, PLUS=6, TIMES=7, NAT=8, TRUE=9, 
		FALSE=10, LPAR=11, RPAR=12, CLPAR=13, CRPAR=14, IF=15, THEN=16, ELSE=17, 
		PRINT=18, LET=19, IN=20, VAR=21, FUN=22, INT=23, BOOL=24, ID=25, WHITESP=26, 
		ERR=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"';'", "':'", "','", "'=='", "'='", "'+'", "'*'", "NAT", "'true'", "'false'", 
		"'('", "')'", "'{'", "'}'", "'if'", "'then'", "'else'", "'print'", "'let'", 
		"'in'", "'var'", "'fun'", "'int'", "'bool'", "ID", "WHITESP", "ERR"
	};
	public static final String[] ruleNames = {
		"SEMIC", "COLON", "COMMA", "EQ", "ASS", "PLUS", "TIMES", "NAT", "TRUE", 
		"FALSE", "LPAR", "RPAR", "CLPAR", "CRPAR", "IF", "THEN", "ELSE", "PRINT", 
		"LET", "IN", "VAR", "FUN", "INT", "BOOL", "ID", "WHITESP", "ERR"
	};


	private ArrayList<HashMap<String,STentry>>  symTable = new ArrayList<HashMap<String,STentry>>();
	private int nestingLevel = -1;


	public FOOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FOOL.g"; }

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
		case 25: WHITESP_action((RuleContext)_localctx, actionIndex); break;

		case 26: ERR_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\35\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\tK\n\t\f\t\16\tN\13\t\3\t\5\tQ\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\7\32\u0093\n\32\f\32\16\32\u0096\13"+
		"\32\3\33\6\33\u0099\n\33\r\33\16\33\u009a\3\33\3\33\3\34\3\34\3\34\2\35"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\2\67\35\3\3\2\5\4\2C\\c|\5\2\62;"+
		"C\\c|\5\2\13\f\17\17\"\"\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13B\3\2\2\2"+
		"\rD\3\2\2\2\17F\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25W\3\2\2\2\27]\3\2\2"+
		"\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!h\3\2\2\2#m\3\2\2\2"+
		"%r\3\2\2\2\'x\3\2\2\2)|\3\2\2\2+\177\3\2\2\2-\u0083\3\2\2\2/\u0087\3\2"+
		"\2\2\61\u008b\3\2\2\2\63\u0090\3\2\2\2\65\u0098\3\2\2\2\67\u009e\3\2\2"+
		"\29:\7=\2\2:\4\3\2\2\2;<\7<\2\2<\6\3\2\2\2=>\7.\2\2>\b\3\2\2\2?@\7?\2"+
		"\2@A\7?\2\2A\n\3\2\2\2BC\7?\2\2C\f\3\2\2\2DE\7-\2\2E\16\3\2\2\2FG\7,\2"+
		"\2G\20\3\2\2\2HL\4\63;\2IK\4\62;\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2MQ\3\2\2\2NL\3\2\2\2OQ\7\62\2\2PH\3\2\2\2PO\3\2\2\2Q\22\3\2\2\2RS"+
		"\7v\2\2ST\7t\2\2TU\7w\2\2UV\7g\2\2V\24\3\2\2\2WX\7h\2\2XY\7c\2\2YZ\7n"+
		"\2\2Z[\7u\2\2[\\\7g\2\2\\\26\3\2\2\2]^\7*\2\2^\30\3\2\2\2_`\7+\2\2`\32"+
		"\3\2\2\2ab\7}\2\2b\34\3\2\2\2cd\7\177\2\2d\36\3\2\2\2ef\7k\2\2fg\7h\2"+
		"\2g \3\2\2\2hi\7v\2\2ij\7j\2\2jk\7g\2\2kl\7p\2\2l\"\3\2\2\2mn\7g\2\2n"+
		"o\7n\2\2op\7u\2\2pq\7g\2\2q$\3\2\2\2rs\7r\2\2st\7t\2\2tu\7k\2\2uv\7p\2"+
		"\2vw\7v\2\2w&\3\2\2\2xy\7n\2\2yz\7g\2\2z{\7v\2\2{(\3\2\2\2|}\7k\2\2}~"+
		"\7p\2\2~*\3\2\2\2\177\u0080\7x\2\2\u0080\u0081\7c\2\2\u0081\u0082\7t\2"+
		"\2\u0082,\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7w\2\2\u0085\u0086\7"+
		"p\2\2\u0086.\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a"+
		"\7v\2\2\u008a\60\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d\7q\2\2\u008d\u008e"+
		"\7q\2\2\u008e\u008f\7n\2\2\u008f\62\3\2\2\2\u0090\u0094\t\2\2\2\u0091"+
		"\u0093\t\3\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\64\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099"+
		"\t\4\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\33\2\2\u009d\66\3\2\2"+
		"\2\u009e\u009f\13\2\2\2\u009f\u00a0\b\34\3\2\u00a08\3\2\2\2\7\2LP\u0094"+
		"\u009a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}