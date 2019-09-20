// Generated from c:\Users\suporte05\SimpleCalcVSCode\bin\SimpleCalc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PE=6, PD=7, ASSIGN=8, LIT=9, INT=10, 
		NL=11, WHITESPACE=12;
	public static final int
		RULE_expr = 0, RULE_seq = 1, RULE_exp = 2, RULE_multdiv = 3, RULE_somsub = 4;
	public static final String[] ruleNames = {
		"expr", "seq", "exp", "multdiv", "somsub"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "';'", "'+'", "'-'", null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "PE", "PD", "ASSIGN", "LIT", "INT", 
		"NL", "WHITESPACE"
	};
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
	public String getGrammarFileName() { return "SimpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public List<SeqContext> seq() {
			return getRuleContexts(SeqContext.class);
		}
		public SeqContext seq(int i) {
			return getRuleContext(SeqContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				seq();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PE) | (1L << LIT) | (1L << INT) | (1L << NL))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeqContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NL() { return getToken(SimpleCalcParser.NL, 0); }
		public List<TerminalNode> LIT() { return getTokens(SimpleCalcParser.LIT); }
		public TerminalNode LIT(int i) {
			return getToken(SimpleCalcParser.LIT, i);
		}
		public TerminalNode ASSIGN() { return getToken(SimpleCalcParser.ASSIGN, 0); }
		public SeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq; }
	}

	public final SeqContext seq() throws RecognitionException {
		SeqContext _localctx = new SeqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seq);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				exp();
				setState(16);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(LIT);
				setState(19);
				match(NL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(LIT);
				setState(21);
				match(ASSIGN);
				setState(22);
				exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				match(LIT);
				setState(24);
				match(ASSIGN);
				setState(25);
				match(LIT);
				setState(26);
				match(NL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				match(NL);
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

	public static class ExpContext extends ParserRuleContext {
		public List<MultdivContext> multdiv() {
			return getRuleContexts(MultdivContext.class);
		}
		public MultdivContext multdiv(int i) {
			return getRuleContext(MultdivContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			multdiv();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(31);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(32);
				multdiv();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(38);
				match(T__2);
				}
				}
				setState(43);
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

	public static class MultdivContext extends ParserRuleContext {
		public List<SomsubContext> somsub() {
			return getRuleContexts(SomsubContext.class);
		}
		public SomsubContext somsub(int i) {
			return getRuleContext(SomsubContext.class,i);
		}
		public MultdivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multdiv; }
	}

	public final MultdivContext multdiv() throws RecognitionException {
		MultdivContext _localctx = new MultdivContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multdiv);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			somsub();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				{
				setState(45);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(46);
				somsub();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					match(T__2);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class SomsubContext extends ParserRuleContext {
		public TerminalNode LIT() { return getToken(SimpleCalcParser.LIT, 0); }
		public TerminalNode INT() { return getToken(SimpleCalcParser.INT, 0); }
		public TerminalNode PE() { return getToken(SimpleCalcParser.PE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PD() { return getToken(SimpleCalcParser.PD, 0); }
		public SomsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_somsub; }
	}

	public final SomsubContext somsub() throws RecognitionException {
		SomsubContext _localctx = new SomsubContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_somsub);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(LIT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(INT);
				}
				break;
			case PE:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(PE);
				setState(61);
				exp();
				setState(62);
				match(PD);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\7\4$\n\4\f"+
		"\4\16\4\'\13\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\5\7\5\62\n\5\f\5"+
		"\16\5\65\13\5\3\5\7\58\n\5\f\5\16\5;\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"C\n\6\3\6\2\2\7\2\4\6\b\n\2\4\3\2\3\4\3\2\6\7\2J\2\r\3\2\2\2\4\36\3\2"+
		"\2\2\6 \3\2\2\2\b.\3\2\2\2\nB\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3"+
		"\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23\7\r"+
		"\2\2\23\37\3\2\2\2\24\25\7\13\2\2\25\37\7\r\2\2\26\27\7\13\2\2\27\30\7"+
		"\n\2\2\30\37\5\6\4\2\31\32\7\13\2\2\32\33\7\n\2\2\33\34\7\13\2\2\34\37"+
		"\7\r\2\2\35\37\7\r\2\2\36\21\3\2\2\2\36\24\3\2\2\2\36\26\3\2\2\2\36\31"+
		"\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 %\5\b\5\2!\"\t\2\2\2\"$\5\b\5\2#!"+
		"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&+\3\2\2\2\'%\3\2\2\2(*\7\5\2\2"+
		")(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-+\3\2\2\2.\63\5\n"+
		"\6\2/\60\t\3\2\2\60\62\5\n\6\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\649\3\2\2\2\65\63\3\2\2\2\668\7\5\2\2\67\66\3\2\2\28;\3"+
		"\2\2\29\67\3\2\2\29:\3\2\2\2:\t\3\2\2\2;9\3\2\2\2<C\7\13\2\2=C\7\f\2\2"+
		">?\7\b\2\2?@\5\6\4\2@A\7\t\2\2AC\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2"+
		"C\13\3\2\2\2\t\17\36%+\639B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}