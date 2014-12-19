// Generated from src/FOOL.g by ANTLR 4.1

import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOOLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMIC=1, COLON=2, COMMA=3, EQ=4, ASS=5, PLUS=6, TIMES=7, NAT=8, TRUE=9, 
		FALSE=10, LPAR=11, RPAR=12, CLPAR=13, CRPAR=14, IF=15, THEN=16, ELSE=17, 
		PRINT=18, LET=19, IN=20, VAR=21, FUN=22, INT=23, BOOL=24, ID=25, WHITESP=26, 
		ERR=27;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "':'", "','", "'=='", "'='", "'+'", "'*'", "NAT", 
		"'true'", "'false'", "'('", "')'", "'{'", "'}'", "'if'", "'then'", "'else'", 
		"'print'", "'let'", "'in'", "'var'", "'fun'", "'int'", "'bool'", "ID", 
		"WHITESP", "ERR"
	};
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_type = 2, RULE_exp = 3, RULE_term = 4, 
		RULE_value = 5, RULE_fatt = 6;
	public static final String[] ruleNames = {
		"prog", "dec", "type", "exp", "term", "value", "fatt"
	};

	@Override
	public String getGrammarFileName() { return "FOOL.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	private ArrayList<HashMap<String,STentry>>  symTable = new ArrayList<HashMap<String,STentry>>();
	private int nestingLevel = -1;

	public FOOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Node ast;
		public ExpContext e;
		public DecContext d;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(FOOLParser.SEMIC, 0); }
		public TerminalNode LET() { return getToken(FOOLParser.LET, 0); }
		public TerminalNode IN() { return getToken(FOOLParser.IN, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(26);
			switch (_input.LA(1)) {
			case NAT:
			case TRUE:
			case FALSE:
			case LPAR:
			case IF:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(14); ((ProgContext)_localctx).e = exp();
				setState(15); match(SEMIC);
				((ProgContext)_localctx).ast =  new ProgNode(((ProgContext)_localctx).e.ast);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(18); match(LET);
				nestingLevel++;
							 HashMap<String,STentry> hm = new HashMap<String,STentry> ();
							 symTable.add(hm);
							
				setState(20); ((ProgContext)_localctx).d = dec();
				setState(21); match(IN);
				setState(22); ((ProgContext)_localctx).e = exp();
				setState(23); match(SEMIC);
				symTable.remove(nestingLevel--);
							 ((ProgContext)_localctx).ast =  new LetInNode(((ProgContext)_localctx).d.astlist,((ProgContext)_localctx).e.ast) ;
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

	public static class DecContext extends ParserRuleContext {
		public ArrayList<Node> astlist;
		public Token i;
		public TypeContext t;
		public ExpContext e;
		public Token fid;
		public TypeContext fty;
		public Token id;
		public TypeContext ty;
		public DecContext d;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(FOOLParser.ID, i);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(FOOLParser.COMMA, i);
		}
		public TerminalNode RPAR(int i) {
			return getToken(FOOLParser.RPAR, i);
		}
		public List<TerminalNode> ID() { return getTokens(FOOLParser.ID); }
		public List<TerminalNode> VAR() { return getTokens(FOOLParser.VAR); }
		public TerminalNode SEMIC(int i) {
			return getToken(FOOLParser.SEMIC, i);
		}
		public TerminalNode LPAR(int i) {
			return getToken(FOOLParser.LPAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FOOLParser.COMMA); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode LET(int i) {
			return getToken(FOOLParser.LET, i);
		}
		public List<TerminalNode> COLON() { return getTokens(FOOLParser.COLON); }
		public TerminalNode FUN(int i) {
			return getToken(FOOLParser.FUN, i);
		}
		public TerminalNode VAR(int i) {
			return getToken(FOOLParser.VAR, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(FOOLParser.LPAR); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(FOOLParser.IN); }
		public List<TerminalNode> SEMIC() { return getTokens(FOOLParser.SEMIC); }
		public TerminalNode IN(int i) {
			return getToken(FOOLParser.IN, i);
		}
		public TerminalNode COLON(int i) {
			return getToken(FOOLParser.COLON, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FOOLParser.RPAR); }
		public List<TerminalNode> ASS() { return getTokens(FOOLParser.ASS); }
		public List<TerminalNode> FUN() { return getTokens(FOOLParser.FUN); }
		public List<TerminalNode> LET() { return getTokens(FOOLParser.LET); }
		public TerminalNode ASS(int i) {
			return getToken(FOOLParser.ASS, i);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DecContext)_localctx).astlist =  new ArrayList<Node>() ;
				   int offset=-1;
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==FUN) {
				{
				setState(74);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(29); match(VAR);
					setState(30); ((DecContext)_localctx).i = match(ID);
					setState(31); match(COLON);
					setState(32); ((DecContext)_localctx).t = type();
					setState(33); match(ASS);
					setState(34); ((DecContext)_localctx).e = exp();
					setState(35); match(SEMIC);
					VarNode v = new VarNode((((DecContext)_localctx).i!=null?((DecContext)_localctx).i.getText():null),((DecContext)_localctx).t.ast,((DecContext)_localctx).e.ast);
								 _localctx.astlist.add(v);
								 HashMap<String,STentry> hm = symTable.get(nestingLevel);
								 if ( hm.put((((DecContext)_localctx).i!=null?((DecContext)_localctx).i.getText():null),new STentry(v,nestingLevel,((DecContext)_localctx).t.ast,offset--)) != null  )
								 {System.out.println("Var id "+(((DecContext)_localctx).i!=null?((DecContext)_localctx).i.getText():null)+" at line "+(((DecContext)_localctx).i!=null?((DecContext)_localctx).i.getLine():0)+" already declared");
								  System.exit(0);}  
								
					}
					break;
				case FUN:
					{
					setState(38); match(FUN);
					setState(39); ((DecContext)_localctx).i = match(ID);
					setState(40); match(COLON);
					setState(41); ((DecContext)_localctx).t = type();
					//inserimento di ID nella symtable
								   FunNode f = new FunNode((((DecContext)_localctx).i!=null?((DecContext)_localctx).i.getText():null),((DecContext)_localctx).t.ast);
								   _localctx.astlist.add(f);
								   HashMap<String,STentry> hm = symTable.get(nestingLevel);
								   STentry entry = new STentry(f, nestingLevel, offset--);
								   if ( hm.put((((DecContext)_localctx).i!=null?((DecContext)_localctx).i.getText():null),entry) != null  )
								   {System.out.println("Fun id "+(((DecContext)_localctx).i!=null?((DecContext)_localctx).i.getText():null)+" at line "+(((DecContext)_localctx).i!=null?((DecContext)_localctx).i.getLine():0)+" already declared");
									System.exit(0);}
									//creare una nuova hashmap per la symTable
									nestingLevel++;
									HashMap<String,STentry> hmn = new HashMap<String,STentry> ();
									symTable.add(hmn);
									
					setState(43); match(LPAR);
					ArrayList<Node> parTypes = new ArrayList<Node>();
								  		int paroffset = 1;
					setState(60);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(45); ((DecContext)_localctx).fid = match(ID);
						setState(46); match(COLON);
						setState(47); ((DecContext)_localctx).fty = type();

										  parTypes.add(((DecContext)_localctx).fty.ast);
										  ParNode fpar = new ParNode((((DecContext)_localctx).fid!=null?((DecContext)_localctx).fid.getText():null),((DecContext)_localctx).fty.ast);
										  f.addPar(fpar);
										  if (hmn.put((((DecContext)_localctx).fid!=null?((DecContext)_localctx).fid.getText():null),new STentry(fpar, nestingLevel, ((DecContext)_localctx).fty.ast, paroffset++)) != null) {
										  	System.out.println("Parameter id "+(((DecContext)_localctx).fid!=null?((DecContext)_localctx).fid.getText():null)+" at line "+(((DecContext)_localctx).fid!=null?((DecContext)_localctx).fid.getLine():0)+" already declared");
										  	System.exit(0);}
										  
						setState(57);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(49); match(COMMA);
							setState(50); ((DecContext)_localctx).id = match(ID);
							setState(51); match(COLON);
							setState(52); ((DecContext)_localctx).ty = type();

												parTypes.add(((DecContext)_localctx).ty.ast);
												ParNode par = new ParNode((((DecContext)_localctx).id!=null?((DecContext)_localctx).id.getText():null),((DecContext)_localctx).ty.ast);
												f.addPar(par);
												if ( hmn.put((((DecContext)_localctx).id!=null?((DecContext)_localctx).id.getText():null),new STentry(par,nestingLevel,((DecContext)_localctx).ty.ast, paroffset++)) != null  )
												{System.out.println("Parameter id "+(((DecContext)_localctx).id!=null?((DecContext)_localctx).id.getText():null)+" at line "+(((DecContext)_localctx).id!=null?((DecContext)_localctx).id.getLine():0)+" already declared");
												 System.exit(0);}
												
							}
							}
							setState(59);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(62); match(RPAR);
					entry.addType( new ArrowTypeNode(parTypes , ((DecContext)_localctx).t.ast) );
					setState(68);
					_la = _input.LA(1);
					if (_la==LET) {
						{
						setState(64); match(LET);
						setState(65); ((DecContext)_localctx).d = dec();
						setState(66); match(IN);
						}
					}

					setState(70); ((DecContext)_localctx).e = exp();
					setState(71); match(SEMIC);
					//chiudere scope
								   symTable.remove(nestingLevel--);
								   f.addDecBody(((DecContext)_localctx).d.astlist,((DecContext)_localctx).e.ast);
								  
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
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

	public static class TypeContext extends ParserRuleContext {
		public Node ast;
		public TerminalNode BOOL() { return getToken(FOOLParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(FOOLParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(79); match(INT);
				((TypeContext)_localctx).ast = new IntTypeNode();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); match(BOOL);
				((TypeContext)_localctx).ast = new BoolTypeNode();
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

	public static class ExpContext extends ParserRuleContext {
		public Node ast;
		public TermContext f;
		public TermContext l;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(FOOLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(FOOLParser.PLUS, i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); ((ExpContext)_localctx).f = term();
			((ExpContext)_localctx).ast =  ((ExpContext)_localctx).f.ast;
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(87); match(PLUS);
				setState(88); ((ExpContext)_localctx).l = term();
				((ExpContext)_localctx).ast =  new PlusNode (_localctx.ast,((ExpContext)_localctx).l.ast);
				}
				}
				setState(95);
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

	public static class TermContext extends ParserRuleContext {
		public Node ast;
		public ValueContext f;
		public ValueContext l;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode TIMES(int i) {
			return getToken(FOOLParser.TIMES, i);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(FOOLParser.TIMES); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); ((TermContext)_localctx).f = value();
			((TermContext)_localctx).ast =  ((TermContext)_localctx).f.ast;
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES) {
				{
				{
				setState(98); match(TIMES);
				setState(99); ((TermContext)_localctx).l = value();
				((TermContext)_localctx).ast =  new MultNode (_localctx.ast,((TermContext)_localctx).l.ast);
				}
				}
				setState(106);
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

	public static class ValueContext extends ParserRuleContext {
		public Node ast;
		public FattContext f;
		public FattContext l;
		public FattContext fatt(int i) {
			return getRuleContext(FattContext.class,i);
		}
		public TerminalNode EQ(int i) {
			return getToken(FOOLParser.EQ, i);
		}
		public List<TerminalNode> EQ() { return getTokens(FOOLParser.EQ); }
		public List<FattContext> fatt() {
			return getRuleContexts(FattContext.class);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); ((ValueContext)_localctx).f = fatt();
			((ValueContext)_localctx).ast =  ((ValueContext)_localctx).f.ast;
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ) {
				{
				{
				setState(109); match(EQ);
				setState(110); ((ValueContext)_localctx).l = fatt();
				((ValueContext)_localctx).ast =  new EqualNode (_localctx.ast,((ValueContext)_localctx).l.ast);
				}
				}
				setState(117);
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

	public static class FattContext extends ParserRuleContext {
		public Node ast;
		public Token n;
		public ExpContext e;
		public ExpContext x;
		public ExpContext y;
		public ExpContext z;
		public Token i;
		public ExpContext fa;
		public ExpContext a;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode ELSE() { return getToken(FOOLParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(FOOLParser.IF, 0); }
		public TerminalNode PRINT() { return getToken(FOOLParser.PRINT, 0); }
		public TerminalNode FALSE() { return getToken(FOOLParser.FALSE, 0); }
		public List<TerminalNode> CRPAR() { return getTokens(FOOLParser.CRPAR); }
		public TerminalNode TRUE() { return getToken(FOOLParser.TRUE, 0); }
		public TerminalNode THEN() { return getToken(FOOLParser.THEN, 0); }
		public TerminalNode LPAR() { return getToken(FOOLParser.LPAR, 0); }
		public List<TerminalNode> CLPAR() { return getTokens(FOOLParser.CLPAR); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(FOOLParser.COMMA, i);
		}
		public TerminalNode ID() { return getToken(FOOLParser.ID, 0); }
		public TerminalNode CLPAR(int i) {
			return getToken(FOOLParser.CLPAR, i);
		}
		public TerminalNode CRPAR(int i) {
			return getToken(FOOLParser.CRPAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FOOLParser.COMMA); }
		public TerminalNode RPAR() { return getToken(FOOLParser.RPAR, 0); }
		public TerminalNode NAT() { return getToken(FOOLParser.NAT, 0); }
		public FattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).enterFatt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLListener ) ((FOOLListener)listener).exitFatt(this);
		}
	}

	public final FattContext fatt() throws RecognitionException {
		FattContext _localctx = new FattContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fatt);
		int _la;
		try {
			setState(168);
			switch (_input.LA(1)) {
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); ((FattContext)_localctx).n = match(NAT);
				((FattContext)_localctx).ast =  new NatNode(Integer.parseInt((((FattContext)_localctx).n!=null?((FattContext)_localctx).n.getText():null)));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(TRUE);
				((FattContext)_localctx).ast =  new BoolNode(true);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); match(FALSE);
				((FattContext)_localctx).ast =  new BoolNode(false);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(124); match(LPAR);
				setState(125); ((FattContext)_localctx).e = exp();
				setState(126); match(RPAR);
				((FattContext)_localctx).ast =  ((FattContext)_localctx).e.ast;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(129); match(IF);
				setState(130); ((FattContext)_localctx).x = exp();
				setState(131); match(THEN);
				setState(132); match(CLPAR);
				setState(133); ((FattContext)_localctx).y = exp();
				setState(134); match(CRPAR);
				setState(135); match(ELSE);
				setState(136); match(CLPAR);
				setState(137); ((FattContext)_localctx).z = exp();
				setState(138); match(CRPAR);
				((FattContext)_localctx).ast =  new IfNode(((FattContext)_localctx).x.ast,((FattContext)_localctx).y.ast,((FattContext)_localctx).z.ast);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(141); match(PRINT);
				setState(142); match(LPAR);
				setState(143); ((FattContext)_localctx).e = exp();
				setState(144); match(RPAR);
				((FattContext)_localctx).ast =  new PrintNode(((FattContext)_localctx).e.ast);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(147); ((FattContext)_localctx).i = match(ID);
				//cercare la dichiarazione
						   int j=nestingLevel;
						   STentry entry=null; 
						   while (j>=0 && entry==null)
							 entry=(symTable.get(j--)).get((((FattContext)_localctx).i!=null?((FattContext)_localctx).i.getText():null));
						   if (entry==null)
						   {System.out.println("Id "+(((FattContext)_localctx).i!=null?((FattContext)_localctx).i.getText():null)+" at line "+(((FattContext)_localctx).i!=null?((FattContext)_localctx).i.getLine():0)+" not declared");
							System.exit(0);}               
					   ((FattContext)_localctx).ast =  new IdNode((((FattContext)_localctx).i!=null?((FattContext)_localctx).i.getText():null), entry, nestingLevel-(j+1));
				setState(166);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(149); match(LPAR);
					ArrayList<Node> argList = new ArrayList<Node>();
					setState(162);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
						{
						setState(151); ((FattContext)_localctx).fa = exp();
						argList.add(((FattContext)_localctx).fa.ast);
						setState(159);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(153); match(COMMA);
							setState(154); ((FattContext)_localctx).a = exp();
							argList.add(((FattContext)_localctx).a.ast);
							}
							}
							setState(161);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					((FattContext)_localctx).ast = new CallNode((((FattContext)_localctx).i!=null?((FattContext)_localctx).i.getText():null), entry, argList, nestingLevel-(j+1));
					setState(165); match(RPAR);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\35\u00ad\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3:\n\3\f\3\16\3=\13\3\5\3?\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3G\n"+
		"\3\3\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\4\3\4\3\4\3\4\5\4V\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6i\n\6\f\6\16\6l\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7t\n\7\f\7\16\7w\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00a0\n\b\f\b\16\b\u00a3\13\b\5\b\u00a5\n\b\3\b"+
		"\3\b\5\b\u00a9\n\b\5\b\u00ab\n\b\3\b\2\t\2\4\6\b\n\f\16\2\2\u00b8\2\34"+
		"\3\2\2\2\4\36\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2\nb\3\2\2\2\fm\3\2\2\2\16\u00aa"+
		"\3\2\2\2\20\21\5\b\5\2\21\22\7\3\2\2\22\23\b\2\1\2\23\35\3\2\2\2\24\25"+
		"\7\25\2\2\25\26\b\2\1\2\26\27\5\4\3\2\27\30\7\26\2\2\30\31\5\b\5\2\31"+
		"\32\7\3\2\2\32\33\b\2\1\2\33\35\3\2\2\2\34\20\3\2\2\2\34\24\3\2\2\2\35"+
		"\3\3\2\2\2\36N\b\3\1\2\37 \7\27\2\2 !\7\33\2\2!\"\7\4\2\2\"#\5\6\4\2#"+
		"$\7\7\2\2$%\5\b\5\2%&\7\3\2\2&\'\b\3\1\2\'M\3\2\2\2()\7\30\2\2)*\7\33"+
		"\2\2*+\7\4\2\2+,\5\6\4\2,-\b\3\1\2-.\7\r\2\2.>\b\3\1\2/\60\7\33\2\2\60"+
		"\61\7\4\2\2\61\62\5\6\4\2\62;\b\3\1\2\63\64\7\5\2\2\64\65\7\33\2\2\65"+
		"\66\7\4\2\2\66\67\5\6\4\2\678\b\3\1\28:\3\2\2\29\63\3\2\2\2:=\3\2\2\2"+
		";9\3\2\2\2;<\3\2\2\2<?\3\2\2\2=;\3\2\2\2>/\3\2\2\2>?\3\2\2\2?@\3\2\2\2"+
		"@A\7\16\2\2AF\b\3\1\2BC\7\25\2\2CD\5\4\3\2DE\7\26\2\2EG\3\2\2\2FB\3\2"+
		"\2\2FG\3\2\2\2GH\3\2\2\2HI\5\b\5\2IJ\7\3\2\2JK\b\3\1\2KM\3\2\2\2L\37\3"+
		"\2\2\2L(\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PN\3\2\2\2QR"+
		"\7\31\2\2RV\b\4\1\2ST\7\32\2\2TV\b\4\1\2UQ\3\2\2\2US\3\2\2\2V\7\3\2\2"+
		"\2WX\5\n\6\2X_\b\5\1\2YZ\7\b\2\2Z[\5\n\6\2[\\\b\5\1\2\\^\3\2\2\2]Y\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\t\3\2\2\2a_\3\2\2\2bc\5\f\7\2cj\b"+
		"\6\1\2de\7\t\2\2ef\5\f\7\2fg\b\6\1\2gi\3\2\2\2hd\3\2\2\2il\3\2\2\2jh\3"+
		"\2\2\2jk\3\2\2\2k\13\3\2\2\2lj\3\2\2\2mn\5\16\b\2nu\b\7\1\2op\7\6\2\2"+
		"pq\5\16\b\2qr\b\7\1\2rt\3\2\2\2so\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2v\r\3\2\2\2wu\3\2\2\2xy\7\n\2\2y\u00ab\b\b\1\2z{\7\13\2\2{\u00ab\b\b"+
		"\1\2|}\7\f\2\2}\u00ab\b\b\1\2~\177\7\r\2\2\177\u0080\5\b\5\2\u0080\u0081"+
		"\7\16\2\2\u0081\u0082\b\b\1\2\u0082\u00ab\3\2\2\2\u0083\u0084\7\21\2\2"+
		"\u0084\u0085\5\b\5\2\u0085\u0086\7\22\2\2\u0086\u0087\7\17\2\2\u0087\u0088"+
		"\5\b\5\2\u0088\u0089\7\20\2\2\u0089\u008a\7\23\2\2\u008a\u008b\7\17\2"+
		"\2\u008b\u008c\5\b\5\2\u008c\u008d\7\20\2\2\u008d\u008e\b\b\1\2\u008e"+
		"\u00ab\3\2\2\2\u008f\u0090\7\24\2\2\u0090\u0091\7\r\2\2\u0091\u0092\5"+
		"\b\5\2\u0092\u0093\7\16\2\2\u0093\u0094\b\b\1\2\u0094\u00ab\3\2\2\2\u0095"+
		"\u0096\7\33\2\2\u0096\u00a8\b\b\1\2\u0097\u0098\7\r\2\2\u0098\u00a4\b"+
		"\b\1\2\u0099\u009a\5\b\5\2\u009a\u00a1\b\b\1\2\u009b\u009c\7\5\2\2\u009c"+
		"\u009d\5\b\5\2\u009d\u009e\b\b\1\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u0099\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\b\1\2\u00a7\u00a9\7\16\2\2\u00a8"+
		"\u0097\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aax\3\2\2\2"+
		"\u00aaz\3\2\2\2\u00aa|\3\2\2\2\u00aa~\3\2\2\2\u00aa\u0083\3\2\2\2\u00aa"+
		"\u008f\3\2\2\2\u00aa\u0095\3\2\2\2\u00ab\17\3\2\2\2\20\34;>FLNU_ju\u00a1"+
		"\u00a4\u00a8\u00aa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}