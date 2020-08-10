package org.palladiosimulator.commons.stoex.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStoexLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN_KEYWORDS=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int RULE_DIGIT=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=5;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalStoexLexer() {;} 
    public InternalStoexLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalStoexLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalStoex.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:11:7: ( 'AND' )
            // InternalStoex.g:11:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:12:7: ( 'BYTESIZE' )
            // InternalStoex.g:12:9: 'BYTESIZE'
            {
            match("BYTESIZE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:13:7: ( 'VALUE' )
            // InternalStoex.g:13:9: 'VALUE'
            {
            match("VALUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:14:7: ( 'STRUCTURE' )
            // InternalStoex.g:14:9: 'STRUCTURE'
            {
            match("STRUCTURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:15:7: ( 'TYPE' )
            // InternalStoex.g:15:9: 'TYPE'
            {
            match("TYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:16:7: ( 'NUMBER_OF_ELEMENTS' )
            // InternalStoex.g:16:9: 'NUMBER_OF_ELEMENTS'
            {
            match("NUMBER_OF_ELEMENTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:17:7: ( 'OR' )
            // InternalStoex.g:17:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:18:7: ( 'XOR' )
            // InternalStoex.g:18:9: 'XOR'
            {
            match("XOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:19:7: ( '>' )
            // InternalStoex.g:19:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:20:7: ( '<' )
            // InternalStoex.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:21:7: ( '==' )
            // InternalStoex.g:21:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:22:7: ( '<>' )
            // InternalStoex.g:22:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:23:7: ( '>=' )
            // InternalStoex.g:23:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:24:7: ( '<=' )
            // InternalStoex.g:24:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:25:7: ( '+' )
            // InternalStoex.g:25:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:26:7: ( '-' )
            // InternalStoex.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:27:7: ( '*' )
            // InternalStoex.g:27:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:28:7: ( '/' )
            // InternalStoex.g:28:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:29:7: ( '%' )
            // InternalStoex.g:29:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:30:7: ( '_' )
            // InternalStoex.g:30:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:31:7: ( 'unitless' )
            // InternalStoex.g:31:9: 'unitless'
            {
            match("unitless"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:32:7: ( 'B' )
            // InternalStoex.g:32:9: 'B'
            {
            match('B'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:33:7: ( 's' )
            // InternalStoex.g:33:9: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:34:7: ( 'm' )
            // InternalStoex.g:34:9: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:35:7: ( '?' )
            // InternalStoex.g:35:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:36:7: ( ':' )
            // InternalStoex.g:36:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:37:7: ( '^' )
            // InternalStoex.g:37:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:38:7: ( 'NOT' )
            // InternalStoex.g:38:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:39:7: ( '[' )
            // InternalStoex.g:39:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:40:7: ( ']' )
            // InternalStoex.g:40:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:41:7: ( '(' )
            // InternalStoex.g:41:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:42:7: ( ')' )
            // InternalStoex.g:42:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:43:7: ( ',' )
            // InternalStoex.g:43:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:44:7: ( '.' )
            // InternalStoex.g:44:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:45:7: ( 'DoublePDF' )
            // InternalStoex.g:45:9: 'DoublePDF'
            {
            match("DoublePDF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:46:7: ( 'IntPMF' )
            // InternalStoex.g:46:9: 'IntPMF'
            {
            match("IntPMF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:47:7: ( 'DoublePMF' )
            // InternalStoex.g:47:9: 'DoublePMF'
            {
            match("DoublePMF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:48:7: ( 'EnumPMF' )
            // InternalStoex.g:48:9: 'EnumPMF'
            {
            match("EnumPMF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:49:7: ( 'BoolPMF' )
            // InternalStoex.g:49:9: 'BoolPMF'
            {
            match("BoolPMF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:50:7: ( ';' )
            // InternalStoex.g:50:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:51:7: ( 'ordered' )
            // InternalStoex.g:51:9: 'ordered'
            {
            match("ordered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:6559:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalStoex.g:6559:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalStoex.g:6559:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalStoex.g:6559:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalStoex.g:6559:32: ( RULE_DIGIT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalStoex.g:6559:32: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalStoex.g:6559:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalStoex.g:6559:44: ( '.' ( RULE_DIGIT )* )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='.') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalStoex.g:6559:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalStoex.g:6559:49: ( RULE_DIGIT )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // InternalStoex.g:6559:49: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalStoex.g:6559:73: ( '-' | '+' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalStoex.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_DECINT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:6561:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalStoex.g:6561:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalStoex.g:6561:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                alt7=1;
            }
            else if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalStoex.g:6561:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalStoex.g:6561:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalStoex.g:6561:29: ( RULE_DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalStoex.g:6561:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_BOOLEAN_KEYWORDS"
    public final void mRULE_BOOLEAN_KEYWORDS() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_KEYWORDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:6563:23: ( ( 'false' | 'true' ) )
            // InternalStoex.g:6563:25: ( 'false' | 'true' )
            {
            // InternalStoex.g:6563:25: ( 'false' | 'true' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='f') ) {
                alt8=1;
            }
            else if ( (LA8_0=='t') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalStoex.g:6563:26: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // InternalStoex.g:6563:34: 'true'
                    {
                    match("true"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_KEYWORDS"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalStoex.g:6565:21: ( '0' .. '9' )
            // InternalStoex.g:6565:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:6567:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalStoex.g:6567:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalStoex.g:6567:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalStoex.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:6569:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\\'' ) )
            // InternalStoex.g:6569:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\\'' )
            {
            // InternalStoex.g:6569:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalStoex.g:6569:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalStoex.g:6569:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalStoex.g:6569:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalStoex.g:6569:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalStoex.g:6569:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalStoex.g:6569:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\'') ) {
                            int LA11_1 = input.LA(2);

                            if ( ((LA11_1>='\u0000' && LA11_1<='!')||(LA11_1>='#' && LA11_1<='\uFFFF')) ) {
                                alt11=2;
                            }


                        }
                        else if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalStoex.g:6569:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalStoex.g:6569:137: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:6571:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalStoex.g:6571:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalStoex.g:6571:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalStoex.g:6571:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:6573:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalStoex.g:6573:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalStoex.g:6573:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalStoex.g:6573:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalStoex.g:6573:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStoex.g:6573:41: ( '\\r' )? '\\n'
                    {
                    // InternalStoex.g:6573:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalStoex.g:6573:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:6575:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalStoex.g:6575:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalStoex.g:6575:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStoex.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStoex.g:6577:16: ( . )
            // InternalStoex.g:6577:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalStoex.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_DOUBLE | RULE_DECINT | RULE_BOOLEAN_KEYWORDS | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=50;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalStoex.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalStoex.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalStoex.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalStoex.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalStoex.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalStoex.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalStoex.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalStoex.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalStoex.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalStoex.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalStoex.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalStoex.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalStoex.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalStoex.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalStoex.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalStoex.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalStoex.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalStoex.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalStoex.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalStoex.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalStoex.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalStoex.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalStoex.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalStoex.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalStoex.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalStoex.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalStoex.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalStoex.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalStoex.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalStoex.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalStoex.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalStoex.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalStoex.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalStoex.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalStoex.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalStoex.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalStoex.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalStoex.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalStoex.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalStoex.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalStoex.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalStoex.g:1:256: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 43 :
                // InternalStoex.g:1:268: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 44 :
                // InternalStoex.g:1:280: RULE_BOOLEAN_KEYWORDS
                {
                mRULE_BOOLEAN_KEYWORDS(); 

                }
                break;
            case 45 :
                // InternalStoex.g:1:302: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // InternalStoex.g:1:310: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // InternalStoex.g:1:322: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // InternalStoex.g:1:338: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // InternalStoex.g:1:354: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // InternalStoex.g:1:362: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA5_eotS =
        "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA5_maxS =
        "\2\145\1\uffff\1\145\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = DFA5_transitionS_.DFA5_transitionS;
    private static final class DFA5_transitionS_ {
        static final String[] DFA5_transitionS = {
                "\1\1\26\uffff\1\2\37\uffff\1\2",
                "\12\3\13\uffff\1\2\37\uffff\1\2",
                "",
                "\12\3\13\uffff\1\2\37\uffff\1\2",
                ""
        };
    }

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    static class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "6559:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\55\1\60\6\55\1\71\1\74\1\53\3\uffff\1\103\1\uffff\1\105\1\55\1\107\1\110\11\uffff\3\55\1\uffff\1\55\2\127\2\55\1\uffff\2\53\2\uffff\1\55\1\uffff\2\55\1\uffff\5\55\1\146\1\55\16\uffff\1\55\13\uffff\3\55\1\uffff\1\55\2\uffff\1\127\2\55\2\uffff\1\157\6\55\1\166\1\uffff\1\167\7\55\1\uffff\4\55\1\u0083\1\55\2\uffff\6\55\1\u008b\2\55\1\u008e\1\55\1\uffff\6\55\1\u008b\1\uffff\2\55\1\uffff\4\55\1\u009c\3\55\1\u00a0\4\55\1\uffff\1\u00a6\1\u00a7\1\u00a8\1\uffff\2\55\1\u00ab\2\55\3\uffff\1\u00ae\1\55\1\uffff\1\u00b0\1\u00b1\1\uffff\1\55\2\uffff\7\55\1\u00ba\1\uffff";
    static final String DFA18_eofS =
        "\u00bb\uffff";
    static final String DFA18_minS =
        "\1\0\1\116\1\60\1\101\1\124\1\131\1\117\1\122\1\117\3\75\3\uffff\1\52\1\uffff\1\60\1\156\2\60\11\uffff\1\157\2\156\1\uffff\1\162\2\56\1\141\1\162\1\uffff\2\0\2\uffff\1\104\1\uffff\1\124\1\157\1\uffff\1\114\1\122\1\120\1\115\1\124\1\60\1\122\16\uffff\1\151\13\uffff\1\165\1\164\1\165\1\uffff\1\144\2\uffff\1\56\1\154\1\165\2\uffff\1\60\1\105\1\154\2\125\1\105\1\102\1\60\1\uffff\1\60\1\164\1\142\1\120\1\155\1\145\1\163\1\145\1\uffff\1\123\1\120\1\105\1\103\1\60\1\105\2\uffff\2\154\1\115\1\120\1\162\1\145\1\60\1\111\1\115\1\60\1\124\1\uffff\1\122\2\145\1\106\1\115\1\145\1\60\1\uffff\1\132\1\106\1\uffff\1\125\1\137\1\163\1\120\1\60\1\106\1\144\1\105\1\60\1\122\1\117\1\163\1\104\1\uffff\3\60\1\uffff\1\105\1\106\1\60\2\106\3\uffff\1\60\1\137\1\uffff\2\60\1\uffff\1\105\2\uffff\1\114\1\105\1\115\1\105\1\116\1\124\1\123\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\116\1\172\1\101\1\124\1\131\1\125\1\122\1\117\1\75\1\76\1\75\3\uffff\1\57\1\uffff\1\172\1\156\2\172\11\uffff\1\157\2\156\1\uffff\1\162\2\145\1\141\1\162\1\uffff\2\uffff\2\uffff\1\104\1\uffff\1\124\1\157\1\uffff\1\114\1\122\1\120\1\115\1\124\1\172\1\122\16\uffff\1\151\13\uffff\1\165\1\164\1\165\1\uffff\1\144\2\uffff\1\145\1\154\1\165\2\uffff\1\172\1\105\1\154\2\125\1\105\1\102\1\172\1\uffff\1\172\1\164\1\142\1\120\1\155\1\145\1\163\1\145\1\uffff\1\123\1\120\1\105\1\103\1\172\1\105\2\uffff\2\154\1\115\1\120\1\162\1\145\1\172\1\111\1\115\1\172\1\124\1\uffff\1\122\2\145\1\106\1\115\1\145\1\172\1\uffff\1\132\1\106\1\uffff\1\125\1\137\1\163\1\120\1\172\1\106\1\144\1\105\1\172\1\122\1\117\1\163\1\115\1\uffff\3\172\1\uffff\1\105\1\106\1\172\2\106\3\uffff\1\172\1\137\1\uffff\2\172\1\uffff\1\105\2\uffff\1\114\1\105\1\115\1\105\1\116\1\124\1\123\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\14\uffff\1\17\1\20\1\21\1\uffff\1\23\4\uffff\1\31\1\32\1\33\1\35\1\36\1\37\1\40\1\41\1\42\3\uffff\1\50\5\uffff\1\55\2\uffff\1\61\1\62\1\uffff\1\55\2\uffff\1\26\7\uffff\1\15\1\11\1\14\1\16\1\12\1\13\1\17\1\20\1\21\1\57\1\60\1\22\1\23\1\24\1\uffff\1\27\1\30\1\31\1\32\1\33\1\35\1\36\1\37\1\40\1\41\1\42\3\uffff\1\50\1\uffff\1\53\1\52\3\uffff\1\56\1\61\10\uffff\1\7\10\uffff\1\1\6\uffff\1\34\1\10\13\uffff\1\5\7\uffff\1\54\2\uffff\1\3\15\uffff\1\44\3\uffff\1\47\5\uffff\1\46\1\51\1\2\2\uffff\1\25\2\uffff\1\4\1\uffff\1\43\1\45\10\uffff\1\6";
    static final String DFA18_specialS =
        "\1\2\47\uffff\1\1\1\0\u0091\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\50\2\53\1\20\1\53\1\51\1\32\1\33\1\16\1\14\1\34\1\15\1\35\1\17\1\43\11\44\1\26\1\41\1\12\1\13\1\11\1\25\1\53\1\1\1\2\1\47\1\36\1\40\3\47\1\37\4\47\1\6\1\7\3\47\1\4\1\5\1\47\1\3\1\47\1\10\2\47\1\30\1\53\1\31\1\27\1\21\1\53\5\47\1\45\6\47\1\24\1\47\1\42\3\47\1\23\1\46\1\22\5\47\uff85\53",
            "\1\54",
            "\12\55\7\uffff\30\55\1\56\1\55\4\uffff\1\55\1\uffff\16\55\1\57\13\55",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65\5\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\73\1\72",
            "\1\75",
            "",
            "",
            "",
            "\1\101\4\uffff\1\102",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\106",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\126",
            "\1\130\26\uffff\1\130\37\uffff\1\130",
            "\1\130\1\uffff\12\131\13\uffff\1\130\37\uffff\1\130",
            "\1\132",
            "\1\133",
            "",
            "\0\134",
            "\42\134\1\uffff\uffdd\134",
            "",
            "",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "",
            "",
            "\1\130\1\uffff\12\131\13\uffff\1\130\37\uffff\1\130",
            "\1\155",
            "\1\156",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u008c",
            "\1\u008d",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\10\uffff\1\u00a5",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00af",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00b2",
            "",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_DOUBLE | RULE_DECINT | RULE_BOOLEAN_KEYWORDS | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_41 = input.LA(1);

                        s = -1;
                        if ( ((LA18_41>='\u0000' && LA18_41<='!')||(LA18_41>='#' && LA18_41<='\uFFFF')) ) {s = 92;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_40 = input.LA(1);

                        s = -1;
                        if ( ((LA18_40>='\u0000' && LA18_40<='\uFFFF')) ) {s = 92;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='A') ) {s = 1;}

                        else if ( (LA18_0=='B') ) {s = 2;}

                        else if ( (LA18_0=='V') ) {s = 3;}

                        else if ( (LA18_0=='S') ) {s = 4;}

                        else if ( (LA18_0=='T') ) {s = 5;}

                        else if ( (LA18_0=='N') ) {s = 6;}

                        else if ( (LA18_0=='O') ) {s = 7;}

                        else if ( (LA18_0=='X') ) {s = 8;}

                        else if ( (LA18_0=='>') ) {s = 9;}

                        else if ( (LA18_0=='<') ) {s = 10;}

                        else if ( (LA18_0=='=') ) {s = 11;}

                        else if ( (LA18_0=='+') ) {s = 12;}

                        else if ( (LA18_0=='-') ) {s = 13;}

                        else if ( (LA18_0=='*') ) {s = 14;}

                        else if ( (LA18_0=='/') ) {s = 15;}

                        else if ( (LA18_0=='%') ) {s = 16;}

                        else if ( (LA18_0=='_') ) {s = 17;}

                        else if ( (LA18_0=='u') ) {s = 18;}

                        else if ( (LA18_0=='s') ) {s = 19;}

                        else if ( (LA18_0=='m') ) {s = 20;}

                        else if ( (LA18_0=='?') ) {s = 21;}

                        else if ( (LA18_0==':') ) {s = 22;}

                        else if ( (LA18_0=='^') ) {s = 23;}

                        else if ( (LA18_0=='[') ) {s = 24;}

                        else if ( (LA18_0==']') ) {s = 25;}

                        else if ( (LA18_0=='(') ) {s = 26;}

                        else if ( (LA18_0==')') ) {s = 27;}

                        else if ( (LA18_0==',') ) {s = 28;}

                        else if ( (LA18_0=='.') ) {s = 29;}

                        else if ( (LA18_0=='D') ) {s = 30;}

                        else if ( (LA18_0=='I') ) {s = 31;}

                        else if ( (LA18_0=='E') ) {s = 32;}

                        else if ( (LA18_0==';') ) {s = 33;}

                        else if ( (LA18_0=='o') ) {s = 34;}

                        else if ( (LA18_0=='0') ) {s = 35;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 36;}

                        else if ( (LA18_0=='f') ) {s = 37;}

                        else if ( (LA18_0=='t') ) {s = 38;}

                        else if ( (LA18_0=='C'||(LA18_0>='F' && LA18_0<='H')||(LA18_0>='J' && LA18_0<='M')||(LA18_0>='P' && LA18_0<='R')||LA18_0=='U'||LA18_0=='W'||(LA18_0>='Y' && LA18_0<='Z')||(LA18_0>='a' && LA18_0<='e')||(LA18_0>='g' && LA18_0<='l')||LA18_0=='n'||(LA18_0>='p' && LA18_0<='r')||(LA18_0>='v' && LA18_0<='z')) ) {s = 39;}

                        else if ( (LA18_0=='\"') ) {s = 40;}

                        else if ( (LA18_0=='\'') ) {s = 41;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 42;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='$')||LA18_0=='&'||LA18_0=='@'||LA18_0=='\\'||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}