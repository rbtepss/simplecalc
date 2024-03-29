// Generated from c:\Users\suporte05\SimpleCalcVSCode\bin\SimpleCalc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NUMBER=12, CONSTANT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "NUMBER", "DIGIT", "CONSTANT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'^'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'sin'", 
		"'cos'", "'log'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NUMBER", "CONSTANT", "WS"
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


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\7\r?\n\r\f\r\16\rB\13\r\3\r\3\r\7\rF\n"+
		"\r\f\r\16\rI\13\r\3\r\6\rL\n\r\r\r\16\rM\3\r\5\rQ\n\r\3\16\3\16\3\17\3"+
		"\17\3\17\5\17X\n\17\3\20\6\20[\n\20\r\20\16\20\\\3\20\3\20\2\2\21\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\17\37\20"+
		"\3\2\3\5\2\13\f\17\17\"\"\2e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3"+
		"\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3"+
		"\2\2\2\21/\3\2\2\2\23\61\3\2\2\2\25\65\3\2\2\2\279\3\2\2\2\31P\3\2\2\2"+
		"\33R\3\2\2\2\35W\3\2\2\2\37Z\3\2\2\2!\"\7\'\2\2\"\4\3\2\2\2#$\7`\2\2$"+
		"\6\3\2\2\2%&\7,\2\2&\b\3\2\2\2\'(\7\61\2\2(\n\3\2\2\2)*\7-\2\2*\f\3\2"+
		"\2\2+,\7/\2\2,\16\3\2\2\2-.\7*\2\2.\20\3\2\2\2/\60\7+\2\2\60\22\3\2\2"+
		"\2\61\62\7u\2\2\62\63\7k\2\2\63\64\7p\2\2\64\24\3\2\2\2\65\66\7e\2\2\66"+
		"\67\7q\2\2\678\7u\2\28\26\3\2\2\29:\7n\2\2:;\7q\2\2;<\7i\2\2<\30\3\2\2"+
		"\2=?\5\33\16\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2"+
		"\2\2CG\7\60\2\2DF\5\33\16\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HQ"+
		"\3\2\2\2IG\3\2\2\2JL\5\33\16\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"NQ\3\2\2\2OQ\5\35\17\2P@\3\2\2\2PK\3\2\2\2PO\3\2\2\2Q\32\3\2\2\2RS\4\62"+
		";\2S\34\3\2\2\2TU\7r\2\2UX\7k\2\2VX\7g\2\2WT\3\2\2\2WV\3\2\2\2X\36\3\2"+
		"\2\2Y[\t\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_"+
		"\b\20\2\2_ \3\2\2\2\t\2@GMPW\\\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}