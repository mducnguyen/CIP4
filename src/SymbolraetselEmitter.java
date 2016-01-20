// $ANTLR 3.4 /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g 2016-01-20 09:38:27

	import java.util.Set;
	import java.util.HashSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselEmitter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQ", "MINUS", "OPERAND", "Operations", "PLUS", "SYMBOL", "WS", "'\n'"
    };

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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SymbolraetselEmitter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselEmitter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SymbolraetselEmitterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return SymbolraetselEmitter.tokenNames; }
    public String getGrammarFileName() { return "/Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g"; }


    	Set<Character> symbolSet = new HashSet<>();


    public static class puzzle_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "puzzle"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:18:1: puzzle : ^( Operations (constraints+= constraint )* ) -> sums(symbols=symbolSetsums=$constraints);
    public final SymbolraetselEmitter.puzzle_return puzzle() throws RecognitionException {
        SymbolraetselEmitter.puzzle_return retval = new SymbolraetselEmitter.puzzle_return();
        retval.start = input.LT(1);


        List list_constraints=null;
        RuleReturnScope constraints = null;
        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:19:3: ( ^( Operations (constraints+= constraint )* ) -> sums(symbols=symbolSetsums=$constraints))
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:20:3: ^( Operations (constraints+= constraint )* )
            {
            match(input,Operations,FOLLOW_Operations_in_puzzle67); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:20:27: (constraints+= constraint )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==EQ) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:20:27: constraints+= constraint
                	    {
                	    pushFollow(FOLLOW_constraint_in_puzzle71);
                	    constraints=constraint();

                	    state._fsp--;

                	    if (list_constraints==null) list_constraints=new ArrayList();
                	    list_constraints.add(constraints.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 21:3: -> sums(symbols=symbolSetsums=$constraints)
            {
                retval.st = templateLib.getInstanceOf("sums",new STAttrMap().put("symbols", symbolSet).put("sums", list_constraints));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "puzzle"


    public static class constraint_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constraint"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:24:1: constraint : ^( EQ ^( PLUS n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number);
    public final SymbolraetselEmitter.constraint_return constraint() throws RecognitionException {
        SymbolraetselEmitter.constraint_return retval = new SymbolraetselEmitter.constraint_return();
        retval.start = input.LT(1);


        SymbolraetselEmitter.number_return n1 =null;

        SymbolraetselEmitter.number_return n2 =null;

        SymbolraetselEmitter.number_return n3 =null;


        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:32:3: ( ^( EQ ^( PLUS n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number))
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:33:3: ^( EQ ^( PLUS n1= number n2= number ) n3= number )
            {
            match(input,EQ,FOLLOW_EQ_in_constraint117); 

            match(input, Token.DOWN, null); 
            match(input,PLUS,FOLLOW_PLUS_in_constraint124); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_number_in_constraint128);
            n1=number();

            state._fsp--;


            pushFollow(FOLLOW_number_in_constraint132);
            n2=number();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_number_in_constraint141);
            n3=number();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 38:4: -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("number1", (n1!=null?n1.number:null)).put("number2", (n2!=null?n2.number:null)).put("number3", (n3!=null?n3.number:null)));
            }



            }


            	Constraint constraint = new Constraint();
            	constraint.numbers.add((n1!=null?n1.number:null));
            	constraint.numbers.add((n2!=null?n2.number:null));
            	constraint.numbers.add((n3!=null?n3.number:null));
            	constraint.prepare();

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraint"


    public static class number_return extends TreeRuleReturnScope {
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "number"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:41:1: number returns [Number number] : ^( OPERAND (syms+= SYMBOL )+ ) ;
    public final SymbolraetselEmitter.number_return number() throws RecognitionException {
        SymbolraetselEmitter.number_return retval = new SymbolraetselEmitter.number_return();
        retval.start = input.LT(1);


        CommonTree syms=null;
        List list_syms=null;

        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:47:3: ( ^( OPERAND (syms+= SYMBOL )+ ) )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:48:3: ^( OPERAND (syms+= SYMBOL )+ )
            {
            match(input,OPERAND,FOLLOW_OPERAND_in_number193); 

            match(input, Token.DOWN, null); 
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:48:17: (syms+= SYMBOL )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SYMBOL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraetselEmitter.g:48:17: syms+= SYMBOL
            	    {
            	    syms=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_number197); 
            	    if (list_syms==null) list_syms=new ArrayList();
            	    list_syms.add(syms);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); 


            }


            	retval.number = new Number();
            	retval.number.setDigits(list_syms);
            	symbolSet.addAll(retval.number.getCharacters());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_Operations_in_puzzle67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_puzzle71 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_EQ_in_constraint117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_constraint124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_constraint128 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_constraint132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_constraint141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERAND_in_number193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYMBOL_in_number197 = new BitSet(new long[]{0x0000000000000208L});

}