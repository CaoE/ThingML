/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// $ANTLR 3.4

	package org.sintef.thingml.resource.thingml.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ThingmlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int ANNOTATION=4;
    public static final int BOOLEAN_LITERAL=5;
    public static final int INTEGER_LITERAL=6;
    public static final int LINEBREAKS=7;
    public static final int ML_COMMENT=8;
    public static final int SL_COMMENT=9;
    public static final int STRING_EXT=10;
    public static final int STRING_LITERAL=11;
    public static final int TEXT=12;
    public static final int T_ARRAY=13;
    public static final int T_ASPECT=14;
    public static final int T_HISTORY=15;
    public static final int T_OPTIONAL=16;
    public static final int T_READONLY=17;
    public static final int WHITESPACE=18;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ThingmlLexer() {} 
    public ThingmlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ThingmlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Thingml.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:15:7: ( '!' )
            // Thingml.g:15:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:16:7: ( '#' )
            // Thingml.g:16:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17:7: ( '&' )
            // Thingml.g:17:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:18:7: ( '(' )
            // Thingml.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:19:7: ( ')' )
            // Thingml.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:20:7: ( '*' )
            // Thingml.g:20:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:21:7: ( '+' )
            // Thingml.g:21:9: '+'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:22:7: ( ',' )
            // Thingml.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:23:7: ( '-' )
            // Thingml.g:23:9: '-'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:24:7: ( '->' )
            // Thingml.g:24:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:25:7: ( '.' )
            // Thingml.g:25:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:26:7: ( '/' )
            // Thingml.g:26:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:27:7: ( ':' )
            // Thingml.g:27:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:28:7: ( '::' )
            // Thingml.g:28:9: '::'
            {
            match("::"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:29:7: ( ';' )
            // Thingml.g:29:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:30:7: ( '<' )
            // Thingml.g:30:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:31:7: ( '=' )
            // Thingml.g:31:9: '='
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:32:7: ( '==' )
            // Thingml.g:32:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:33:7: ( '=>' )
            // Thingml.g:33:9: '=>'
            {
            match("=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:34:7: ( '>' )
            // Thingml.g:34:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:35:7: ( '?' )
            // Thingml.g:35:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:36:7: ( '[]' )
            // Thingml.g:36:9: '[]'
            {
            match("[]"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:37:7: ( '\\u0025' )
            // Thingml.g:37:9: '\\u0025'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:38:7: ( ']' )
            // Thingml.g:38:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:39:7: ( 'action' )
            // Thingml.g:39:9: 'action'
            {
            match("action"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:40:7: ( 'after' )
            // Thingml.g:40:9: 'after'
            {
            match("after"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:41:7: ( 'and' )
            // Thingml.g:41:9: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:42:7: ( 'before' )
            // Thingml.g:42:9: 'before'
            {
            match("before"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:43:7: ( 'composite' )
            // Thingml.g:43:9: 'composite'
            {
            match("composite"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:44:7: ( 'configuration' )
            // Thingml.g:44:9: 'configuration'
            {
            match("configuration"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:45:7: ( 'connector' )
            // Thingml.g:45:9: 'connector'
            {
            match("connector"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:46:7: ( 'datatype' )
            // Thingml.g:46:9: 'datatype'
            {
            match("datatype"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:47:7: ( 'do' )
            // Thingml.g:47:9: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:48:7: ( 'else' )
            // Thingml.g:48:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:49:7: ( 'end' )
            // Thingml.g:49:9: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:50:7: ( 'entry' )
            // Thingml.g:50:9: 'entry'
            {
            match("entry"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:51:7: ( 'enumeration' )
            // Thingml.g:51:9: 'enumeration'
            {
            match("enumeration"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:52:7: ( 'error' )
            // Thingml.g:52:9: 'error'
            {
            match("error"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:53:7: ( 'event' )
            // Thingml.g:53:9: 'event'
            {
            match("event"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:54:7: ( 'exit' )
            // Thingml.g:54:9: 'exit'
            {
            match("exit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:55:7: ( 'filter' )
            // Thingml.g:55:9: 'filter'
            {
            match("filter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:56:7: ( 'from' )
            // Thingml.g:56:9: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:57:7: ( 'function' )
            // Thingml.g:57:9: 'function'
            {
            match("function"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:58:7: ( 'group' )
            // Thingml.g:58:9: 'group'
            {
            match("group"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:59:7: ( 'guard' )
            // Thingml.g:59:9: 'guard'
            {
            match("guard"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:60:7: ( 'if' )
            // Thingml.g:60:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:61:7: ( 'import' )
            // Thingml.g:61:9: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:62:7: ( 'includes' )
            // Thingml.g:62:9: 'includes'
            {
            match("includes"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:63:7: ( 'init' )
            // Thingml.g:63:9: 'init'
            {
            match("init"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:64:7: ( 'instance' )
            // Thingml.g:64:9: 'instance'
            {
            match("instance"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:65:7: ( 'internal' )
            // Thingml.g:65:9: 'internal'
            {
            match("internal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:66:7: ( 'keeps' )
            // Thingml.g:66:9: 'keeps'
            {
            match("keeps"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:67:7: ( 'length' )
            // Thingml.g:67:9: 'length'
            {
            match("length"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:68:7: ( 'lengthWindow' )
            // Thingml.g:68:9: 'lengthWindow'
            {
            match("lengthWindow"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:69:7: ( 'message' )
            // Thingml.g:69:9: 'message'
            {
            match("message"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:70:7: ( 'not' )
            // Thingml.g:70:9: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:71:7: ( 'on' )
            // Thingml.g:71:9: 'on'
            {
            match("on"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:72:7: ( 'operator' )
            // Thingml.g:72:9: 'operator'
            {
            match("operator"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:73:7: ( 'or' )
            // Thingml.g:73:9: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:74:7: ( 'port' )
            // Thingml.g:74:9: 'port'
            {
            match("port"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:75:7: ( 'print' )
            // Thingml.g:75:9: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:76:7: ( 'property' )
            // Thingml.g:76:9: 'property'
            {
            match("property"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:77:7: ( 'provided' )
            // Thingml.g:77:9: 'provided'
            {
            match("provided"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:78:7: ( 'receives' )
            // Thingml.g:78:9: 'receives'
            {
            match("receives"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:79:7: ( 'region' )
            // Thingml.g:79:9: 'region'
            {
            match("region"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:80:7: ( 'required' )
            // Thingml.g:80:9: 'required'
            {
            match("required"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:81:7: ( 'return' )
            // Thingml.g:81:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:82:7: ( 'select' )
            // Thingml.g:82:9: 'select'
            {
            match("select"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:83:7: ( 'sends' )
            // Thingml.g:83:9: 'sends'
            {
            match("sends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:84:7: ( 'set' )
            // Thingml.g:84:9: 'set'
            {
            match("set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:85:7: ( 'state' )
            // Thingml.g:85:9: 'state'
            {
            match("state"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:86:7: ( 'statechart' )
            // Thingml.g:86:9: 'statechart'
            {
            match("statechart"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:87:7: ( 'stream' )
            // Thingml.g:87:9: 'stream'
            {
            match("stream"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:88:7: ( 'thing' )
            // Thingml.g:88:9: 'thing'
            {
            match("thing"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:89:7: ( 'timeWindow' )
            // Thingml.g:89:9: 'timeWindow'
            {
            match("timeWindow"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:90:7: ( 'transition' )
            // Thingml.g:90:9: 'transition'
            {
            match("transition"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:91:7: ( 'var' )
            // Thingml.g:91:9: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:92:7: ( 'while' )
            // Thingml.g:92:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:93:7: ( '{' )
            // Thingml.g:93:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:94:7: ( '|' )
            // Thingml.g:94:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:95:7: ( '}' )
            // Thingml.g:95:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17499:11: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Thingml.g:17500:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Thingml.g:17500:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Thingml.g:17500:2: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Thingml.g:17500:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Thingml.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17503:11: ( ( '/*' ( . )* '*/' ) )
            // Thingml.g:17504:2: ( '/*' ( . )* '*/' )
            {
            // Thingml.g:17504:2: ( '/*' ( . )* '*/' )
            // Thingml.g:17504:2: '/*' ( . )* '*/'
            {
            match("/*"); 



            // Thingml.g:17504:6: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Thingml.g:17504:6: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match("*/"); 



            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "ANNOTATION"
    public final void mANNOTATION() throws RecognitionException {
        try {
            int _type = ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17507:11: ( ( '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )+ ) )
            // Thingml.g:17508:2: ( '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )+ )
            {
            // Thingml.g:17508:2: ( '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )+ )
            // Thingml.g:17508:2: '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )+
            {
            match('@'); 

            // Thingml.g:17508:5: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Thingml.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANNOTATION"

    // $ANTLR start "BOOLEAN_LITERAL"
    public final void mBOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17510:16: ( ( 'true' | 'false' ) )
            // Thingml.g:17511:2: ( 'true' | 'false' )
            {
            // Thingml.g:17511:2: ( 'true' | 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Thingml.g:17511:2: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // Thingml.g:17511:9: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN_LITERAL"

    // $ANTLR start "INTEGER_LITERAL"
    public final void mINTEGER_LITERAL() throws RecognitionException {
        try {
            int _type = INTEGER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17513:16: ( ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) )
            // Thingml.g:17514:2: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            {
            // Thingml.g:17514:2: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= '1' && LA6_0 <= '9')) ) {
                alt6=1;
            }
            else if ( (LA6_0=='0') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Thingml.g:17514:2: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Thingml.g:17514:13: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Thingml.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Thingml.g:17514:27: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17516:15: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\"' ) )* '\"' ) )
            // Thingml.g:17517:2: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\"' ) )* '\"' )
            {
            // Thingml.g:17517:2: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\"' ) )* '\"' )
            // Thingml.g:17517:2: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // Thingml.g:17517:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=5;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    switch ( input.LA(2) ) {
                    case '\"':
                    case '\'':
                    case '\\':
                    case 'b':
                    case 'f':
                    case 'n':
                    case 'r':
                    case 't':
                        {
                        alt7=1;
                        }
                        break;
                    case 'u':
                        {
                        alt7=2;
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        {
                        alt7=3;
                        }
                        break;

                    }

                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=4;
                }


                switch (alt7) {
            	case 1 :
            	    // Thingml.g:17517:6: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 

            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // Thingml.g:17517:47: ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            	    {
            	    // Thingml.g:17517:47: ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            	    // Thingml.g:17517:48: '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            	    {
            	    match('\\'); 

            	    match('u'); 

            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // Thingml.g:17517:169: '\\\\' ( '0' .. '7' )
            	    {
            	    match('\\'); 

            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 4 :
            	    // Thingml.g:17517:184: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('\"'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "STRING_EXT"
    public final void mSTRING_EXT() throws RecognitionException {
        try {
            int _type = STRING_EXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17519:11: ( ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\\'' ) )* '\\'' ) )
            // Thingml.g:17520:2: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\\'' ) )* '\\'' )
            {
            // Thingml.g:17520:2: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\\'' ) )* '\\'' )
            // Thingml.g:17520:2: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 

            // Thingml.g:17520:6: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\\'' ) )*
            loop8:
            do {
                int alt8=5;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    switch ( input.LA(2) ) {
                    case '\"':
                    case '\'':
                    case '\\':
                    case 'b':
                    case 'f':
                    case 'n':
                    case 'r':
                    case 't':
                        {
                        alt8=1;
                        }
                        break;
                    case 'u':
                        {
                        alt8=2;
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        {
                        alt8=3;
                        }
                        break;

                    }

                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
                    alt8=4;
                }


                switch (alt8) {
            	case 1 :
            	    // Thingml.g:17520:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 

            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // Thingml.g:17520:48: ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            	    {
            	    // Thingml.g:17520:48: ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            	    // Thingml.g:17520:49: '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            	    {
            	    match('\\'); 

            	    match('u'); 

            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // Thingml.g:17520:170: '\\\\' ( '0' .. '7' )
            	    {
            	    match('\\'); 

            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 4 :
            	    // Thingml.g:17520:185: ~ ( '\\\\' | '\\'' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('\''); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_EXT"

    // $ANTLR start "T_READONLY"
    public final void mT_READONLY() throws RecognitionException {
        try {
            int _type = T_READONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17522:11: ( ( 'readonly' ) )
            // Thingml.g:17523:2: ( 'readonly' )
            {
            // Thingml.g:17523:2: ( 'readonly' )
            // Thingml.g:17523:2: 'readonly'
            {
            match("readonly"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_READONLY"

    // $ANTLR start "T_OPTIONAL"
    public final void mT_OPTIONAL() throws RecognitionException {
        try {
            int _type = T_OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17525:11: ( ( 'optional' ) )
            // Thingml.g:17526:2: ( 'optional' )
            {
            // Thingml.g:17526:2: ( 'optional' )
            // Thingml.g:17526:2: 'optional'
            {
            match("optional"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_OPTIONAL"

    // $ANTLR start "T_ASPECT"
    public final void mT_ASPECT() throws RecognitionException {
        try {
            int _type = T_ASPECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17528:9: ( ( 'fragment' ) )
            // Thingml.g:17529:2: ( 'fragment' )
            {
            // Thingml.g:17529:2: ( 'fragment' )
            // Thingml.g:17529:2: 'fragment'
            {
            match("fragment"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_ASPECT"

    // $ANTLR start "T_HISTORY"
    public final void mT_HISTORY() throws RecognitionException {
        try {
            int _type = T_HISTORY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17531:10: ( ( 'history' ) )
            // Thingml.g:17532:2: ( 'history' )
            {
            // Thingml.g:17532:2: ( 'history' )
            // Thingml.g:17532:2: 'history'
            {
            match("history"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_HISTORY"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17534:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Thingml.g:17535:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAKS"
    public final void mLINEBREAKS() throws RecognitionException {
        try {
            int _type = LINEBREAKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17538:11: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Thingml.g:17539:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Thingml.g:17539:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Thingml.g:17539:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Thingml.g:17539:2: ( '\\r\\n' | '\\r' | '\\n' )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='\n') ) {
                    alt9=1;
                }
                else {
                    alt9=2;
                }
            }
            else if ( (LA9_0=='\n') ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Thingml.g:17539:3: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Thingml.g:17539:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Thingml.g:17539:15: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAKS"

    // $ANTLR start "T_ARRAY"
    public final void mT_ARRAY() throws RecognitionException {
        try {
            int _type = T_ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17542:8: ( '[' )
            // Thingml.g:17543:1: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_ARRAY"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Thingml.g:17544:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )+ ) )
            // Thingml.g:17545:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )+ )
            {
            // Thingml.g:17545:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )+ )
            // Thingml.g:17545:2: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )+
            {
            // Thingml.g:17545:2: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Thingml.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    public void mTokens() throws RecognitionException {
        // Thingml.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | SL_COMMENT | ML_COMMENT | ANNOTATION | BOOLEAN_LITERAL | INTEGER_LITERAL | STRING_LITERAL | STRING_EXT | T_READONLY | T_OPTIONAL | T_ASPECT | T_HISTORY | WHITESPACE | LINEBREAKS | T_ARRAY | TEXT )
        int alt11=96;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // Thingml.g:1:10: T__19
                {
                mT__19(); 


                }
                break;
            case 2 :
                // Thingml.g:1:16: T__20
                {
                mT__20(); 


                }
                break;
            case 3 :
                // Thingml.g:1:22: T__21
                {
                mT__21(); 


                }
                break;
            case 4 :
                // Thingml.g:1:28: T__22
                {
                mT__22(); 


                }
                break;
            case 5 :
                // Thingml.g:1:34: T__23
                {
                mT__23(); 


                }
                break;
            case 6 :
                // Thingml.g:1:40: T__24
                {
                mT__24(); 


                }
                break;
            case 7 :
                // Thingml.g:1:46: T__25
                {
                mT__25(); 


                }
                break;
            case 8 :
                // Thingml.g:1:52: T__26
                {
                mT__26(); 


                }
                break;
            case 9 :
                // Thingml.g:1:58: T__27
                {
                mT__27(); 


                }
                break;
            case 10 :
                // Thingml.g:1:64: T__28
                {
                mT__28(); 


                }
                break;
            case 11 :
                // Thingml.g:1:70: T__29
                {
                mT__29(); 


                }
                break;
            case 12 :
                // Thingml.g:1:76: T__30
                {
                mT__30(); 


                }
                break;
            case 13 :
                // Thingml.g:1:82: T__31
                {
                mT__31(); 


                }
                break;
            case 14 :
                // Thingml.g:1:88: T__32
                {
                mT__32(); 


                }
                break;
            case 15 :
                // Thingml.g:1:94: T__33
                {
                mT__33(); 


                }
                break;
            case 16 :
                // Thingml.g:1:100: T__34
                {
                mT__34(); 


                }
                break;
            case 17 :
                // Thingml.g:1:106: T__35
                {
                mT__35(); 


                }
                break;
            case 18 :
                // Thingml.g:1:112: T__36
                {
                mT__36(); 


                }
                break;
            case 19 :
                // Thingml.g:1:118: T__37
                {
                mT__37(); 


                }
                break;
            case 20 :
                // Thingml.g:1:124: T__38
                {
                mT__38(); 


                }
                break;
            case 21 :
                // Thingml.g:1:130: T__39
                {
                mT__39(); 


                }
                break;
            case 22 :
                // Thingml.g:1:136: T__40
                {
                mT__40(); 


                }
                break;
            case 23 :
                // Thingml.g:1:142: T__41
                {
                mT__41(); 


                }
                break;
            case 24 :
                // Thingml.g:1:148: T__42
                {
                mT__42(); 


                }
                break;
            case 25 :
                // Thingml.g:1:154: T__43
                {
                mT__43(); 


                }
                break;
            case 26 :
                // Thingml.g:1:160: T__44
                {
                mT__44(); 


                }
                break;
            case 27 :
                // Thingml.g:1:166: T__45
                {
                mT__45(); 


                }
                break;
            case 28 :
                // Thingml.g:1:172: T__46
                {
                mT__46(); 


                }
                break;
            case 29 :
                // Thingml.g:1:178: T__47
                {
                mT__47(); 


                }
                break;
            case 30 :
                // Thingml.g:1:184: T__48
                {
                mT__48(); 


                }
                break;
            case 31 :
                // Thingml.g:1:190: T__49
                {
                mT__49(); 


                }
                break;
            case 32 :
                // Thingml.g:1:196: T__50
                {
                mT__50(); 


                }
                break;
            case 33 :
                // Thingml.g:1:202: T__51
                {
                mT__51(); 


                }
                break;
            case 34 :
                // Thingml.g:1:208: T__52
                {
                mT__52(); 


                }
                break;
            case 35 :
                // Thingml.g:1:214: T__53
                {
                mT__53(); 


                }
                break;
            case 36 :
                // Thingml.g:1:220: T__54
                {
                mT__54(); 


                }
                break;
            case 37 :
                // Thingml.g:1:226: T__55
                {
                mT__55(); 


                }
                break;
            case 38 :
                // Thingml.g:1:232: T__56
                {
                mT__56(); 


                }
                break;
            case 39 :
                // Thingml.g:1:238: T__57
                {
                mT__57(); 


                }
                break;
            case 40 :
                // Thingml.g:1:244: T__58
                {
                mT__58(); 


                }
                break;
            case 41 :
                // Thingml.g:1:250: T__59
                {
                mT__59(); 


                }
                break;
            case 42 :
                // Thingml.g:1:256: T__60
                {
                mT__60(); 


                }
                break;
            case 43 :
                // Thingml.g:1:262: T__61
                {
                mT__61(); 


                }
                break;
            case 44 :
                // Thingml.g:1:268: T__62
                {
                mT__62(); 


                }
                break;
            case 45 :
                // Thingml.g:1:274: T__63
                {
                mT__63(); 


                }
                break;
            case 46 :
                // Thingml.g:1:280: T__64
                {
                mT__64(); 


                }
                break;
            case 47 :
                // Thingml.g:1:286: T__65
                {
                mT__65(); 


                }
                break;
            case 48 :
                // Thingml.g:1:292: T__66
                {
                mT__66(); 


                }
                break;
            case 49 :
                // Thingml.g:1:298: T__67
                {
                mT__67(); 


                }
                break;
            case 50 :
                // Thingml.g:1:304: T__68
                {
                mT__68(); 


                }
                break;
            case 51 :
                // Thingml.g:1:310: T__69
                {
                mT__69(); 


                }
                break;
            case 52 :
                // Thingml.g:1:316: T__70
                {
                mT__70(); 


                }
                break;
            case 53 :
                // Thingml.g:1:322: T__71
                {
                mT__71(); 


                }
                break;
            case 54 :
                // Thingml.g:1:328: T__72
                {
                mT__72(); 


                }
                break;
            case 55 :
                // Thingml.g:1:334: T__73
                {
                mT__73(); 


                }
                break;
            case 56 :
                // Thingml.g:1:340: T__74
                {
                mT__74(); 


                }
                break;
            case 57 :
                // Thingml.g:1:346: T__75
                {
                mT__75(); 


                }
                break;
            case 58 :
                // Thingml.g:1:352: T__76
                {
                mT__76(); 


                }
                break;
            case 59 :
                // Thingml.g:1:358: T__77
                {
                mT__77(); 


                }
                break;
            case 60 :
                // Thingml.g:1:364: T__78
                {
                mT__78(); 


                }
                break;
            case 61 :
                // Thingml.g:1:370: T__79
                {
                mT__79(); 


                }
                break;
            case 62 :
                // Thingml.g:1:376: T__80
                {
                mT__80(); 


                }
                break;
            case 63 :
                // Thingml.g:1:382: T__81
                {
                mT__81(); 


                }
                break;
            case 64 :
                // Thingml.g:1:388: T__82
                {
                mT__82(); 


                }
                break;
            case 65 :
                // Thingml.g:1:394: T__83
                {
                mT__83(); 


                }
                break;
            case 66 :
                // Thingml.g:1:400: T__84
                {
                mT__84(); 


                }
                break;
            case 67 :
                // Thingml.g:1:406: T__85
                {
                mT__85(); 


                }
                break;
            case 68 :
                // Thingml.g:1:412: T__86
                {
                mT__86(); 


                }
                break;
            case 69 :
                // Thingml.g:1:418: T__87
                {
                mT__87(); 


                }
                break;
            case 70 :
                // Thingml.g:1:424: T__88
                {
                mT__88(); 


                }
                break;
            case 71 :
                // Thingml.g:1:430: T__89
                {
                mT__89(); 


                }
                break;
            case 72 :
                // Thingml.g:1:436: T__90
                {
                mT__90(); 


                }
                break;
            case 73 :
                // Thingml.g:1:442: T__91
                {
                mT__91(); 


                }
                break;
            case 74 :
                // Thingml.g:1:448: T__92
                {
                mT__92(); 


                }
                break;
            case 75 :
                // Thingml.g:1:454: T__93
                {
                mT__93(); 


                }
                break;
            case 76 :
                // Thingml.g:1:460: T__94
                {
                mT__94(); 


                }
                break;
            case 77 :
                // Thingml.g:1:466: T__95
                {
                mT__95(); 


                }
                break;
            case 78 :
                // Thingml.g:1:472: T__96
                {
                mT__96(); 


                }
                break;
            case 79 :
                // Thingml.g:1:478: T__97
                {
                mT__97(); 


                }
                break;
            case 80 :
                // Thingml.g:1:484: T__98
                {
                mT__98(); 


                }
                break;
            case 81 :
                // Thingml.g:1:490: T__99
                {
                mT__99(); 


                }
                break;
            case 82 :
                // Thingml.g:1:496: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 83 :
                // Thingml.g:1:507: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 84 :
                // Thingml.g:1:518: ANNOTATION
                {
                mANNOTATION(); 


                }
                break;
            case 85 :
                // Thingml.g:1:529: BOOLEAN_LITERAL
                {
                mBOOLEAN_LITERAL(); 


                }
                break;
            case 86 :
                // Thingml.g:1:545: INTEGER_LITERAL
                {
                mINTEGER_LITERAL(); 


                }
                break;
            case 87 :
                // Thingml.g:1:561: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 88 :
                // Thingml.g:1:576: STRING_EXT
                {
                mSTRING_EXT(); 


                }
                break;
            case 89 :
                // Thingml.g:1:587: T_READONLY
                {
                mT_READONLY(); 


                }
                break;
            case 90 :
                // Thingml.g:1:598: T_OPTIONAL
                {
                mT_OPTIONAL(); 


                }
                break;
            case 91 :
                // Thingml.g:1:609: T_ASPECT
                {
                mT_ASPECT(); 


                }
                break;
            case 92 :
                // Thingml.g:1:618: T_HISTORY
                {
                mT_HISTORY(); 


                }
                break;
            case 93 :
                // Thingml.g:1:628: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 94 :
                // Thingml.g:1:639: LINEBREAKS
                {
                mLINEBREAKS(); 


                }
                break;
            case 95 :
                // Thingml.g:1:650: T_ARRAY
                {
                mT_ARRAY(); 


                }
                break;
            case 96 :
                // Thingml.g:1:658: TEXT
                {
                mTEXT(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\11\uffff\1\65\1\uffff\1\70\1\72\2\uffff\1\75\2\uffff\1\77\2\uffff"+
        "\23\63\4\uffff\2\147\2\uffff\1\63\17\uffff\6\63\1\160\13\63\1\177"+
        "\6\63\1\u0089\1\63\1\u008c\12\63\1\147\1\uffff\3\63\1\u00a3\4\63"+
        "\1\uffff\1\63\1\u00aa\14\63\1\uffff\10\63\1\u00bf\1\uffff\2\63\1"+
        "\uffff\12\63\1\u00cd\6\63\1\u00d4\4\63\1\uffff\5\63\1\u00de\1\uffff"+
        "\4\63\1\u00e3\1\63\1\u00e5\7\63\1\u00ed\5\63\1\uffff\2\63\1\u00f5"+
        "\12\63\1\uffff\5\63\1\u0105\1\uffff\3\63\1\u0109\5\63\1\uffff\1"+
        "\u010f\1\63\1\u0111\1\u0112\1\uffff\1\63\1\uffff\2\63\1\u0105\1"+
        "\u0116\1\u0117\2\63\1\uffff\2\63\1\u011c\4\63\1\uffff\1\u0121\10"+
        "\63\1\u012a\1\u012c\1\63\1\u012e\2\63\1\uffff\1\u0131\1\63\1\u0133"+
        "\1\uffff\1\u0134\4\63\1\uffff\1\63\2\uffff\1\u013a\2\63\2\uffff"+
        "\1\u013d\3\63\1\uffff\1\u0142\3\63\1\uffff\3\63\1\u0149\1\63\1\u014b"+
        "\1\63\1\u014d\1\uffff\1\63\1\uffff\1\u014f\1\uffff\2\63\1\uffff"+
        "\1\63\2\uffff\5\63\1\uffff\2\63\1\uffff\4\63\1\uffff\1\u015e\5\63"+
        "\1\uffff\1\63\1\uffff\1\63\1\uffff\1\63\1\uffff\2\63\1\u0169\3\63"+
        "\1\u016d\1\63\1\u016f\1\u0170\1\u0171\1\u0172\1\u0173\1\63\1\uffff"+
        "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\u017b\3\63\1"+
        "\uffff\1\u017f\1\63\1\u0181\1\uffff\1\63\5\uffff\1\63\7\uffff\3"+
        "\63\1\uffff\1\63\1\uffff\2\63\1\u018a\1\u018b\1\u018c\1\63\1\u018e"+
        "\1\63\3\uffff\1\63\1\uffff\1\u0191\1\u0192\2\uffff";
    static final String DFA11_eofS =
        "\u0193\uffff";
    static final String DFA11_minS =
        "\1\11\10\uffff\1\76\1\uffff\1\52\1\72\2\uffff\1\75\2\uffff\1\135"+
        "\2\uffff\1\143\1\145\1\157\1\141\1\154\1\141\1\162\1\146\3\145\1"+
        "\157\1\156\1\157\2\145\1\150\1\141\1\150\4\uffff\2\60\2\uffff\1"+
        "\151\17\uffff\2\164\1\144\1\146\1\155\1\164\1\60\1\163\1\144\1\162"+
        "\1\145\1\151\1\154\1\141\1\156\1\154\1\157\1\141\1\60\1\160\1\143"+
        "\1\145\1\156\1\163\1\164\1\60\1\145\1\60\1\162\1\151\1\141\1\154"+
        "\1\141\1\151\1\155\1\141\1\162\1\151\1\60\1\uffff\1\163\1\151\1"+
        "\145\1\60\1\157\1\160\1\146\1\141\1\uffff\1\145\1\60\1\162\1\155"+
        "\1\157\1\156\2\164\1\155\1\147\1\143\1\163\1\165\1\162\1\uffff\1"+
        "\157\1\154\2\164\1\145\1\160\1\147\1\163\1\60\1\uffff\1\162\1\151"+
        "\1\uffff\1\164\1\156\1\160\1\145\1\151\2\165\1\144\1\145\1\144\1"+
        "\60\1\164\1\145\1\156\1\145\1\156\1\145\1\60\1\154\1\164\1\157\1"+
        "\162\1\uffff\1\162\1\157\1\151\1\145\1\164\1\60\1\uffff\1\171\1"+
        "\145\1\162\1\164\1\60\1\145\1\60\1\155\1\164\1\145\1\160\1\144\1"+
        "\162\1\165\1\60\1\141\1\162\1\163\1\164\1\141\1\uffff\1\141\1\157"+
        "\1\60\1\164\1\145\2\151\1\157\1\151\1\162\1\157\1\143\1\163\1\uffff"+
        "\1\145\1\141\1\147\1\127\1\163\1\60\1\uffff\1\145\1\157\1\156\1"+
        "\60\1\145\1\163\1\147\1\143\1\171\1\uffff\1\60\1\162\2\60\1\uffff"+
        "\1\162\1\uffff\1\145\1\151\3\60\1\164\1\144\1\uffff\2\156\1\60\1"+
        "\150\1\147\1\164\1\156\1\uffff\1\60\1\162\1\144\1\166\1\156\1\162"+
        "\2\156\1\164\2\60\1\155\1\60\2\151\1\uffff\1\60\1\162\1\60\1\uffff"+
        "\1\60\1\151\1\165\1\164\1\160\1\uffff\1\141\2\uffff\1\60\1\156\1"+
        "\157\2\uffff\1\60\1\145\1\143\1\141\1\uffff\1\60\1\145\1\157\1\141"+
        "\1\uffff\1\164\2\145\1\60\1\145\1\60\1\154\1\60\1\uffff\1\150\1"+
        "\uffff\1\60\1\uffff\1\156\1\164\1\uffff\1\171\2\uffff\1\164\1\162"+
        "\1\157\1\145\1\164\1\uffff\1\164\1\156\1\uffff\1\163\1\145\1\154"+
        "\1\151\1\uffff\1\60\1\162\1\154\1\171\1\144\1\163\1\uffff\1\144"+
        "\1\uffff\1\171\1\uffff\1\141\1\uffff\1\144\1\151\1\60\1\145\1\141"+
        "\1\162\1\60\1\151\5\60\1\156\1\uffff\7\60\1\162\2\157\1\uffff\1"+
        "\60\1\164\1\60\1\uffff\1\157\5\uffff\1\144\7\uffff\1\164\1\167\1"+
        "\156\1\uffff\1\151\1\uffff\1\156\1\157\3\60\1\157\1\60\1\167\3\uffff"+
        "\1\156\1\uffff\2\60\2\uffff";
    static final String DFA11_maxS =
        "\1\175\10\uffff\1\76\1\uffff\1\57\1\72\2\uffff\1\76\2\uffff\1\135"+
        "\2\uffff\1\156\1\145\2\157\1\170\2\165\1\156\3\145\1\157\2\162\1"+
        "\145\1\164\1\162\1\141\1\150\4\uffff\2\172\2\uffff\1\151\17\uffff"+
        "\2\164\1\144\1\146\1\156\1\164\1\172\1\163\1\165\1\162\1\145\1\151"+
        "\1\154\1\157\1\156\1\154\1\157\1\141\1\172\1\160\1\164\1\145\1\156"+
        "\1\163\1\164\1\172\1\164\1\172\1\162\1\157\2\164\1\162\1\151\1\155"+
        "\1\165\1\162\1\151\1\172\1\uffff\1\163\1\151\1\145\1\172\1\157\1"+
        "\160\1\156\1\141\1\uffff\1\145\1\172\1\162\1\155\1\157\1\156\2\164"+
        "\1\155\1\147\1\143\1\163\1\165\1\162\1\uffff\1\157\1\154\2\164\1"+
        "\145\1\160\1\147\1\163\1\172\1\uffff\1\162\1\151\1\uffff\1\164\1"+
        "\156\1\166\1\145\1\151\2\165\1\144\1\145\1\144\1\172\1\164\1\145"+
        "\1\156\1\145\1\156\1\145\1\172\1\154\1\164\1\157\1\162\1\uffff\1"+
        "\162\1\157\1\151\1\145\1\164\1\172\1\uffff\1\171\1\145\1\162\1\164"+
        "\1\172\1\145\1\172\1\155\1\164\1\145\1\160\1\144\1\162\1\165\1\172"+
        "\1\141\1\162\1\163\1\164\1\141\1\uffff\1\141\1\157\1\172\1\164\1"+
        "\145\2\151\1\157\1\151\1\162\1\157\1\143\1\163\1\uffff\1\145\1\141"+
        "\1\147\1\127\1\163\1\172\1\uffff\1\145\1\157\1\156\1\172\1\145\1"+
        "\163\1\147\1\143\1\171\1\uffff\1\172\1\162\2\172\1\uffff\1\162\1"+
        "\uffff\1\145\1\151\3\172\1\164\1\144\1\uffff\2\156\1\172\1\150\1"+
        "\147\1\164\1\156\1\uffff\1\172\1\162\1\144\1\166\1\156\1\162\2\156"+
        "\1\164\2\172\1\155\1\172\2\151\1\uffff\1\172\1\162\1\172\1\uffff"+
        "\1\172\1\151\1\165\1\164\1\160\1\uffff\1\141\2\uffff\1\172\1\156"+
        "\1\157\2\uffff\1\172\1\145\1\143\1\141\1\uffff\1\172\1\145\1\157"+
        "\1\141\1\uffff\1\164\2\145\1\172\1\145\1\172\1\154\1\172\1\uffff"+
        "\1\150\1\uffff\1\172\1\uffff\1\156\1\164\1\uffff\1\171\2\uffff\1"+
        "\164\1\162\1\157\1\145\1\164\1\uffff\1\164\1\156\1\uffff\1\163\1"+
        "\145\1\154\1\151\1\uffff\1\172\1\162\1\154\1\171\1\144\1\163\1\uffff"+
        "\1\144\1\uffff\1\171\1\uffff\1\141\1\uffff\1\144\1\151\1\172\1\145"+
        "\1\141\1\162\1\172\1\151\5\172\1\156\1\uffff\7\172\1\162\2\157\1"+
        "\uffff\1\172\1\164\1\172\1\uffff\1\157\5\uffff\1\144\7\uffff\1\164"+
        "\1\167\1\156\1\uffff\1\151\1\uffff\1\156\1\157\3\172\1\157\1\172"+
        "\1\167\3\uffff\1\156\1\uffff\2\172\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\2\uffff\1"+
        "\17\1\20\1\uffff\1\24\1\25\1\uffff\1\27\1\30\23\uffff\1\117\1\120"+
        "\1\121\1\124\2\uffff\1\127\1\130\1\uffff\1\135\1\136\1\140\1\12"+
        "\1\11\1\122\1\123\1\14\1\16\1\15\1\22\1\23\1\21\1\26\1\137\47\uffff"+
        "\1\126\10\uffff\1\41\16\uffff\1\56\11\uffff\1\71\2\uffff\1\73\26"+
        "\uffff\1\33\6\uffff\1\43\24\uffff\1\70\15\uffff\1\106\6\uffff\1"+
        "\115\11\uffff\1\42\4\uffff\1\50\1\uffff\1\52\7\uffff\1\61\7\uffff"+
        "\1\74\17\uffff\1\125\3\uffff\1\32\5\uffff\1\44\1\uffff\1\46\1\47"+
        "\3\uffff\1\54\1\55\4\uffff\1\64\4\uffff\1\75\10\uffff\1\105\1\uffff"+
        "\1\107\1\uffff\1\112\2\uffff\1\116\1\uffff\1\31\1\34\5\uffff\1\51"+
        "\2\uffff\1\57\4\uffff\1\65\6\uffff\1\101\1\uffff\1\103\1\uffff\1"+
        "\104\1\uffff\1\111\16\uffff\1\67\12\uffff\1\134\3\uffff\1\40\1\uffff"+
        "\1\133\1\53\1\60\1\62\1\63\1\uffff\1\72\1\132\1\76\1\77\1\100\1"+
        "\102\1\131\3\uffff\1\35\1\uffff\1\37\10\uffff\1\110\1\113\1\114"+
        "\1\uffff\1\45\2\uffff\1\66\1\36";
    static final String DFA11_specialS =
        "\u0193\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\61\1\62\1\uffff\1\61\1\62\22\uffff\1\61\1\1\1\56\1\2\1\uffff"+
            "\1\23\1\3\1\57\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\55\11\54"+
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\53\32\63\1\22\1\uffff\1\24"+
            "\1\uffff\1\63\1\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\60"+
            "\1\34\1\63\1\35\1\36\1\37\1\40\1\41\1\42\1\63\1\43\1\44\1\45"+
            "\1\63\1\46\1\47\3\63\1\50\1\51\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "",
            "\1\67\4\uffff\1\66",
            "\1\71",
            "",
            "",
            "\1\73\1\74",
            "",
            "",
            "\1\76",
            "",
            "",
            "\1\100\2\uffff\1\101\7\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\105\15\uffff\1\106",
            "\1\107\1\uffff\1\110\3\uffff\1\111\3\uffff\1\112\1\uffff\1"+
            "\113",
            "\1\117\7\uffff\1\114\10\uffff\1\115\2\uffff\1\116",
            "\1\120\2\uffff\1\121",
            "\1\122\6\uffff\1\123\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131\1\uffff\1\132\1\uffff\1\133",
            "\1\134\2\uffff\1\135",
            "\1\136",
            "\1\137\16\uffff\1\140",
            "\1\141\1\142\10\uffff\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "",
            "",
            "\12\146\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155\1\156",
            "\1\157",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\161",
            "\1\162\17\uffff\1\163\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\172\15\uffff\1\171",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0080",
            "\1\u0081\5\uffff\1\u0082\11\uffff\1\u0083\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u008a\16\uffff\1\u008b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u008d",
            "\1\u008e\5\uffff\1\u008f",
            "\1\u0094\1\uffff\1\u0090\3\uffff\1\u0091\11\uffff\1\u0092\2"+
            "\uffff\1\u0093",
            "\1\u0095\1\uffff\1\u0096\5\uffff\1\u0097",
            "\1\u0098\20\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c\23\uffff\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\146\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\7\uffff\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4\5\uffff\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0110",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0113",
            "",
            "\1\u0114",
            "\1\u0115",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u012b\27\63",
            "\1\u012d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u012f",
            "\1\u0130",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0132",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\u0139",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u013b",
            "\1\u013c",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "\12\63\7\uffff\26\63\1\u0141\3\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u014a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u014c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u014e",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0150",
            "\1\u0151",
            "",
            "\1\u0152",
            "",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "",
            "\1\u0164",
            "",
            "\1\u0165",
            "",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u016e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0174",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0180",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0182",
            "",
            "",
            "",
            "",
            "",
            "\1\u0183",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u018d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u018f",
            "",
            "",
            "",
            "\1\u0190",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | SL_COMMENT | ML_COMMENT | ANNOTATION | BOOLEAN_LITERAL | INTEGER_LITERAL | STRING_LITERAL | STRING_EXT | T_READONLY | T_OPTIONAL | T_ASPECT | T_HISTORY | WHITESPACE | LINEBREAKS | T_ARRAY | TEXT );";
        }
    }
 

}