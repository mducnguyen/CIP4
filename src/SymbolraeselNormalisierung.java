// $ANTLR 3.4 /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g 2016-01-20 09:38:18

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraeselNormalisierung extends TreeParser {
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


    public SymbolraeselNormalisierung(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraeselNormalisierung(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SymbolraeselNormalisierung.tokenNames; }
    public String getGrammarFileName() { return "/Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g"; }


    public static class s_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "s"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:10:1: s : ^( Operations operation operation operation operation operation operation ) ;
    public final SymbolraeselNormalisierung.s_return s() throws RecognitionException {
        SymbolraeselNormalisierung.s_return retval = new SymbolraeselNormalisierung.s_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Operations1=null;
        SymbolraeselNormalisierung.operation_return operation2 =null;

        SymbolraeselNormalisierung.operation_return operation3 =null;

        SymbolraeselNormalisierung.operation_return operation4 =null;

        SymbolraeselNormalisierung.operation_return operation5 =null;

        SymbolraeselNormalisierung.operation_return operation6 =null;

        SymbolraeselNormalisierung.operation_return operation7 =null;


        CommonTree Operations1_tree=null;

        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:10:4: ( ^( Operations operation operation operation operation operation operation ) )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:10:6: ^( Operations operation operation operation operation operation operation )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Operations1=(CommonTree)match(input,Operations,FOLLOW_Operations_in_s40); 
            Operations1_tree = (CommonTree)adaptor.dupNode(Operations1);


            root_1 = (CommonTree)adaptor.becomeRoot(Operations1_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_s42);
            operation2=operation();

            state._fsp--;

            adaptor.addChild(root_1, operation2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_s44);
            operation3=operation();

            state._fsp--;

            adaptor.addChild(root_1, operation3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_s46);
            operation4=operation();

            state._fsp--;

            adaptor.addChild(root_1, operation4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_s48);
            operation5=operation();

            state._fsp--;

            adaptor.addChild(root_1, operation5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_s50);
            operation6=operation();

            state._fsp--;

            adaptor.addChild(root_1, operation6.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_s52);
            operation7=operation();

            state._fsp--;

            adaptor.addChild(root_1, operation7.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "s"


    public static class operation_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operation"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:13:1: operation : ( plusOperation | minusOpration );
    public final SymbolraeselNormalisierung.operation_return operation() throws RecognitionException {
        SymbolraeselNormalisierung.operation_return retval = new SymbolraeselNormalisierung.operation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolraeselNormalisierung.plusOperation_return plusOperation8 =null;

        SymbolraeselNormalisierung.minusOpration_return minusOpration9 =null;



        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:14:2: ( plusOperation | minusOpration )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQ) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==PLUS) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==MINUS) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:14:4: plusOperation
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_plusOperation_in_operation66);
                    plusOperation8=plusOperation();

                    state._fsp--;

                    adaptor.addChild(root_0, plusOperation8.getTree());


                    }
                    break;
                case 2 :
                    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:15:4: minusOpration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_minusOpration_in_operation71);
                    minusOpration9=minusOpration();

                    state._fsp--;

                    adaptor.addChild(root_0, minusOpration9.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "operation"


    public static class plusOperation_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "plusOperation"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:17:1: plusOperation : ^( EQ ^( PLUS operand operand ) operand ) ;
    public final SymbolraeselNormalisierung.plusOperation_return plusOperation() throws RecognitionException {
        SymbolraeselNormalisierung.plusOperation_return retval = new SymbolraeselNormalisierung.plusOperation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ10=null;
        CommonTree PLUS11=null;
        SymbolraeselNormalisierung.operand_return operand12 =null;

        SymbolraeselNormalisierung.operand_return operand13 =null;

        SymbolraeselNormalisierung.operand_return operand14 =null;


        CommonTree EQ10_tree=null;
        CommonTree PLUS11_tree=null;

        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:18:2: ( ^( EQ ^( PLUS operand operand ) operand ) )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:18:4: ^( EQ ^( PLUS operand operand ) operand )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ10=(CommonTree)match(input,EQ,FOLLOW_EQ_in_plusOperation83); 
            EQ10_tree = (CommonTree)adaptor.dupNode(EQ10);


            root_1 = (CommonTree)adaptor.becomeRoot(EQ10_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PLUS11=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_plusOperation86); 
            PLUS11_tree = (CommonTree)adaptor.dupNode(PLUS11);


            root_2 = (CommonTree)adaptor.becomeRoot(PLUS11_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operand_in_plusOperation88);
            operand12=operand();

            state._fsp--;

            adaptor.addChild(root_2, operand12.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operand_in_plusOperation90);
            operand13=operand();

            state._fsp--;

            adaptor.addChild(root_2, operand13.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operand_in_plusOperation93);
            operand14=operand();

            state._fsp--;

            adaptor.addChild(root_1, operand14.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "plusOperation"


    public static class minusOpration_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minusOpration"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:20:1: minusOpration : ^( EQ ^( MINUS op1= operand op2= operand ) op3= operand ) -> ^( EQ ^( PLUS[null,\"+\"] $op2 $op3) $op1) ;
    public final SymbolraeselNormalisierung.minusOpration_return minusOpration() throws RecognitionException {
        SymbolraeselNormalisierung.minusOpration_return retval = new SymbolraeselNormalisierung.minusOpration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ15=null;
        CommonTree MINUS16=null;
        SymbolraeselNormalisierung.operand_return op1 =null;

        SymbolraeselNormalisierung.operand_return op2 =null;

        SymbolraeselNormalisierung.operand_return op3 =null;


        CommonTree EQ15_tree=null;
        CommonTree MINUS16_tree=null;
        RewriteRuleNodeStream stream_EQ=new RewriteRuleNodeStream(adaptor,"token EQ");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:21:2: ( ^( EQ ^( MINUS op1= operand op2= operand ) op3= operand ) -> ^( EQ ^( PLUS[null,\"+\"] $op2 $op3) $op1) )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:21:4: ^( EQ ^( MINUS op1= operand op2= operand ) op3= operand )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ15=(CommonTree)match(input,EQ,FOLLOW_EQ_in_minusOpration106);  
            stream_EQ.add(EQ15);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MINUS16=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_minusOpration109);  
            stream_MINUS.add(MINUS16);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operand_in_minusOpration115);
            op1=operand();

            state._fsp--;

            stream_operand.add(op1.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operand_in_minusOpration119);
            op2=operand();

            state._fsp--;

            stream_operand.add(op2.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operand_in_minusOpration124);
            op3=operand();

            state._fsp--;

            stream_operand.add(op3.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: EQ, op2, op1, op3
            // token labels: 
            // rule labels: op2, op1, op3, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.tree:null);
            RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.tree:null);
            RewriteRuleSubtreeStream stream_op3=new RewriteRuleSubtreeStream(adaptor,"rule op3",op3!=null?op3.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 22:4: -> ^( EQ ^( PLUS[null,\"+\"] $op2 $op3) $op1)
            {
                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:22:7: ^( EQ ^( PLUS[null,\"+\"] $op2 $op3) $op1)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:22:12: ^( PLUS[null,\"+\"] $op2 $op3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PLUS, null, "+")
                , root_2);

                adaptor.addChild(root_2, stream_op2.nextTree());

                adaptor.addChild(root_2, stream_op3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_op1.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "minusOpration"


    public static class operand_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operand"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:24:1: operand : ^( OPERAND ( SYMBOL )+ ) ;
    public final SymbolraeselNormalisierung.operand_return operand() throws RecognitionException {
        SymbolraeselNormalisierung.operand_return retval = new SymbolraeselNormalisierung.operand_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OPERAND17=null;
        CommonTree SYMBOL18=null;

        CommonTree OPERAND17_tree=null;
        CommonTree SYMBOL18_tree=null;

        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:24:9: ( ^( OPERAND ( SYMBOL )+ ) )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:24:11: ^( OPERAND ( SYMBOL )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            OPERAND17=(CommonTree)match(input,OPERAND,FOLLOW_OPERAND_in_operand159); 
            OPERAND17_tree = (CommonTree)adaptor.dupNode(OPERAND17);


            root_1 = (CommonTree)adaptor.becomeRoot(OPERAND17_tree, root_1);


            match(input, Token.DOWN, null); 
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:24:21: ( SYMBOL )+
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
            	    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/SymbolraeselNormalisierung.g:24:21: SYMBOL
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SYMBOL18=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_operand161); 
            	    SYMBOL18_tree = (CommonTree)adaptor.dupNode(SYMBOL18);


            	    adaptor.addChild(root_1, SYMBOL18_tree);


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
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "operand"

    // Delegated rules


 

    public static final BitSet FOLLOW_Operations_in_s40 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_s42 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_operation_in_s44 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_operation_in_s46 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_operation_in_s48 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_operation_in_s50 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_operation_in_s52 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_plusOperation_in_operation66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minusOpration_in_operation71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_plusOperation83 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_plusOperation86 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operand_in_plusOperation88 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_operand_in_plusOperation90 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operand_in_plusOperation93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_minusOpration106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_minusOpration109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operand_in_minusOpration115 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_operand_in_minusOpration119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operand_in_minusOpration124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERAND_in_operand159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYMBOL_in_operand161 = new BitSet(new long[]{0x0000000000000208L});

}