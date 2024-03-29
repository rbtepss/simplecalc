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
public class SimpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PE=6, PD=7, ASSIGN=8, LIT=9, INT=10, 
		NL=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "PE", "PD", "ASSIGN", "LIT", "INT", 
		"NL", "WHITESPACE"
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


	public SimpleCalcLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16G\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7\'"+
		"\n\7\r\7\16\7(\3\b\6\b,\n\b\r\b\16\b-\3\t\3\t\3\n\6\n\63\n\n\r\n\16\n"+
		"\64\3\13\6\138\n\13\r\13\16\139\3\f\5\f=\n\f\3\f\3\f\3\r\6\rB\n\r\r\r"+
		"\16\rC\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2L\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2"+
		"\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13#\3\2\2\2\r&\3\2\2\2\17+\3\2"+
		"\2\2\21/\3\2\2\2\23\62\3\2\2\2\25\67\3\2\2\2\27<\3\2\2\2\31A\3\2\2\2\33"+
		"\34\7,\2\2\34\4\3\2\2\2\35\36\7\61\2\2\36\6\3\2\2\2\37 \7=\2\2 \b\3\2"+
		"\2\2!\"\7-\2\2\"\n\3\2\2\2#$\7/\2\2$\f\3\2\2\2%\'\7*\2\2&%\3\2\2\2\'("+
		"\3\2\2\2(&\3\2\2\2()\3\2\2\2)\16\3\2\2\2*,\7+\2\2+*\3\2\2\2,-\3\2\2\2"+
		"-+\3\2\2\2-.\3\2\2\2.\20\3\2\2\2/\60\7?\2\2\60\22\3\2\2\2\61\63\t\2\2"+
		"\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\24\3\2\2"+
		"\2\668\4\62;\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\26\3\2\2"+
		"\2;=\7\17\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\f\2\2?\30\3\2\2\2@B\t"+
		"\3\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\r\2\2F\32"+
		"\3\2\2\2\t\2(-\649<C\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}