// $ANTLR 3.4 /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g 2016-01-20 09:38:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class raeselLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int EQ=4;
    public static final int MINUS=5;
    public static final int OPERAND=6;
    public static final int Operations=7;
    public static final int PLUS=8;
    public static final int SYMBOL=9;
    public static final int WS=10;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public raeselLexer() {} 
    public raeselLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public raeselLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:2:7: ( '\\n' )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:2:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            int _type = SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:26:9: ( 'A' .. 'Z' )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SYMBOL"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:28:6: ( '+' )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:28:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:29:7: ( '-' )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:29:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:30:5: ( '=' )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:30:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:31:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:31:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:1:8: ( T__11 | SYMBOL | PLUS | MINUS | EQ | WS )
        int alt1=6;
        switch ( input.LA(1) ) {
        case '\n':
            {
            alt1=1;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt1=2;
            }
            break;
        case '+':
            {
            alt1=3;
            }
            break;
        case '-':
            {
            alt1=4;
            }
            break;
        case '=':
            {
            alt1=5;
            }
            break;
        case '\t':
        case '\r':
        case ' ':
            {
            alt1=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }

        switch (alt1) {
            case 1 :
                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:1:16: SYMBOL
                {
                mSYMBOL(); 


                }
                break;
            case 3 :
                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:1:23: PLUS
                {
                mPLUS(); 


                }
                break;
            case 4 :
                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:1:28: MINUS
                {
                mMINUS(); 


                }
                break;
            case 5 :
                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:1:34: EQ
                {
                mEQ(); 


                }
                break;
            case 6 :
                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:1:37: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}