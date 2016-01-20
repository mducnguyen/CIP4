// $ANTLR 3.4 /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g 2016-01-20 09:38:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class raeselParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQ", "MINUS", "OPERAND", "Operations", "PLUS", "SYMBOL", "WS", "'\\n'"
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public raeselParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public raeselParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return raeselParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g"; }


    public static class s_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "s"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:10:1: s : r1_1= symbols oh1= op r1_2= symbols EQ r1_3= symbols '\\n' ov1= op ov2= op ov3= op '\\n' r2_1= symbols oh2= op r2_2= symbols EQ r2_3= symbols '\\n' EQ EQ EQ '\\n' r3_1= symbols oh3= op r3_2= symbols EQ r3_3= symbols -> ^( Operations ^( EQ ^( $oh1 $r1_1 $r1_2) $r1_3) ^( EQ ^( $oh2 $r2_1 $r2_2) $r2_3) ^( EQ ^( $oh3 $r3_1 $r3_2) $r3_3) ^( EQ ^( $ov1 $r1_1 $r2_1) $r3_1) ^( EQ ^( $ov2 $r1_2 $r2_2) $r3_2) ^( EQ ^( $ov3 $r1_3 $r2_3) $r3_3) ) ;
    public final raeselParser.s_return s() throws RecognitionException {
        raeselParser.s_return retval = new raeselParser.s_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ1=null;
        Token char_literal2=null;
        Token char_literal3=null;
        Token EQ4=null;
        Token char_literal5=null;
        Token EQ6=null;
        Token EQ7=null;
        Token EQ8=null;
        Token char_literal9=null;
        Token EQ10=null;
        raeselParser.symbols_return r1_1 =null;

        raeselParser.op_return oh1 =null;

        raeselParser.symbols_return r1_2 =null;

        raeselParser.symbols_return r1_3 =null;

        raeselParser.op_return ov1 =null;

        raeselParser.op_return ov2 =null;

        raeselParser.op_return ov3 =null;

        raeselParser.symbols_return r2_1 =null;

        raeselParser.op_return oh2 =null;

        raeselParser.symbols_return r2_2 =null;

        raeselParser.symbols_return r2_3 =null;

        raeselParser.symbols_return r3_1 =null;

        raeselParser.op_return oh3 =null;

        raeselParser.symbols_return r3_2 =null;

        raeselParser.symbols_return r3_3 =null;


        CommonTree EQ1_tree=null;
        CommonTree char_literal2_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree EQ4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree EQ6_tree=null;
        CommonTree EQ7_tree=null;
        CommonTree EQ8_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree EQ10_tree=null;
        RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        RewriteRuleSubtreeStream stream_symbols=new RewriteRuleSubtreeStream(adaptor,"rule symbols");
        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:10:5: (r1_1= symbols oh1= op r1_2= symbols EQ r1_3= symbols '\\n' ov1= op ov2= op ov3= op '\\n' r2_1= symbols oh2= op r2_2= symbols EQ r2_3= symbols '\\n' EQ EQ EQ '\\n' r3_1= symbols oh3= op r3_2= symbols EQ r3_3= symbols -> ^( Operations ^( EQ ^( $oh1 $r1_1 $r1_2) $r1_3) ^( EQ ^( $oh2 $r2_1 $r2_2) $r2_3) ^( EQ ^( $oh3 $r3_1 $r3_2) $r3_3) ^( EQ ^( $ov1 $r1_1 $r2_1) $r3_1) ^( EQ ^( $ov2 $r1_2 $r2_2) $r3_2) ^( EQ ^( $ov3 $r1_3 $r2_3) $r3_3) ) )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:10:7: r1_1= symbols oh1= op r1_2= symbols EQ r1_3= symbols '\\n' ov1= op ov2= op ov3= op '\\n' r2_1= symbols oh2= op r2_2= symbols EQ r2_3= symbols '\\n' EQ EQ EQ '\\n' r3_1= symbols oh3= op r3_2= symbols EQ r3_3= symbols
            {
            pushFollow(FOLLOW_symbols_in_s49);
            r1_1=symbols();

            state._fsp--;

            stream_symbols.add(r1_1.getTree());

            pushFollow(FOLLOW_op_in_s55);
            oh1=op();

            state._fsp--;

            stream_op.add(oh1.getTree());

            pushFollow(FOLLOW_symbols_in_s61);
            r1_2=symbols();

            state._fsp--;

            stream_symbols.add(r1_2.getTree());

            EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_s63);  
            stream_EQ.add(EQ1);


            pushFollow(FOLLOW_symbols_in_s69);
            r1_3=symbols();

            state._fsp--;

            stream_symbols.add(r1_3.getTree());

            char_literal2=(Token)match(input,11,FOLLOW_11_in_s71);  
            stream_11.add(char_literal2);


            pushFollow(FOLLOW_op_in_s79);
            ov1=op();

            state._fsp--;

            stream_op.add(ov1.getTree());

            pushFollow(FOLLOW_op_in_s85);
            ov2=op();

            state._fsp--;

            stream_op.add(ov2.getTree());

            pushFollow(FOLLOW_op_in_s91);
            ov3=op();

            state._fsp--;

            stream_op.add(ov3.getTree());

            char_literal3=(Token)match(input,11,FOLLOW_11_in_s92);  
            stream_11.add(char_literal3);


            pushFollow(FOLLOW_symbols_in_s100);
            r2_1=symbols();

            state._fsp--;

            stream_symbols.add(r2_1.getTree());

            pushFollow(FOLLOW_op_in_s107);
            oh2=op();

            state._fsp--;

            stream_op.add(oh2.getTree());

            pushFollow(FOLLOW_symbols_in_s113);
            r2_2=symbols();

            state._fsp--;

            stream_symbols.add(r2_2.getTree());

            EQ4=(Token)match(input,EQ,FOLLOW_EQ_in_s115);  
            stream_EQ.add(EQ4);


            pushFollow(FOLLOW_symbols_in_s121);
            r2_3=symbols();

            state._fsp--;

            stream_symbols.add(r2_3.getTree());

            char_literal5=(Token)match(input,11,FOLLOW_11_in_s123);  
            stream_11.add(char_literal5);


            EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_s127);  
            stream_EQ.add(EQ6);


            EQ7=(Token)match(input,EQ,FOLLOW_EQ_in_s129);  
            stream_EQ.add(EQ7);


            EQ8=(Token)match(input,EQ,FOLLOW_EQ_in_s131);  
            stream_EQ.add(EQ8);


            char_literal9=(Token)match(input,11,FOLLOW_11_in_s133);  
            stream_11.add(char_literal9);


            pushFollow(FOLLOW_symbols_in_s141);
            r3_1=symbols();

            state._fsp--;

            stream_symbols.add(r3_1.getTree());

            pushFollow(FOLLOW_op_in_s147);
            oh3=op();

            state._fsp--;

            stream_op.add(oh3.getTree());

            pushFollow(FOLLOW_symbols_in_s153);
            r3_2=symbols();

            state._fsp--;

            stream_symbols.add(r3_2.getTree());

            EQ10=(Token)match(input,EQ,FOLLOW_EQ_in_s155);  
            stream_EQ.add(EQ10);


            pushFollow(FOLLOW_symbols_in_s161);
            r3_3=symbols();

            state._fsp--;

            stream_symbols.add(r3_3.getTree());

            // AST REWRITE
            // elements: r1_1, r1_1, ov3, oh1, r1_2, r1_3, ov1, EQ, r2_2, r3_3, r3_1, oh3, r3_3, EQ, r1_3, oh2, ov2, r2_3, r2_2, EQ, EQ, r2_1, r2_1, r3_2, r3_2, r2_3, EQ, r1_2, EQ, r3_1
            // token labels: 
            // rule labels: r2_3, r3_2, r3_3, r1_1, r1_2, r2_1, r1_3, r2_2, r3_1, ov2, ov1, ov3, retval, oh2, oh1, oh3
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_r2_3=new RewriteRuleSubtreeStream(adaptor,"rule r2_3",r2_3!=null?r2_3.tree:null);
            RewriteRuleSubtreeStream stream_r3_2=new RewriteRuleSubtreeStream(adaptor,"rule r3_2",r3_2!=null?r3_2.tree:null);
            RewriteRuleSubtreeStream stream_r3_3=new RewriteRuleSubtreeStream(adaptor,"rule r3_3",r3_3!=null?r3_3.tree:null);
            RewriteRuleSubtreeStream stream_r1_1=new RewriteRuleSubtreeStream(adaptor,"rule r1_1",r1_1!=null?r1_1.tree:null);
            RewriteRuleSubtreeStream stream_r1_2=new RewriteRuleSubtreeStream(adaptor,"rule r1_2",r1_2!=null?r1_2.tree:null);
            RewriteRuleSubtreeStream stream_r2_1=new RewriteRuleSubtreeStream(adaptor,"rule r2_1",r2_1!=null?r2_1.tree:null);
            RewriteRuleSubtreeStream stream_r1_3=new RewriteRuleSubtreeStream(adaptor,"rule r1_3",r1_3!=null?r1_3.tree:null);
            RewriteRuleSubtreeStream stream_r2_2=new RewriteRuleSubtreeStream(adaptor,"rule r2_2",r2_2!=null?r2_2.tree:null);
            RewriteRuleSubtreeStream stream_r3_1=new RewriteRuleSubtreeStream(adaptor,"rule r3_1",r3_1!=null?r3_1.tree:null);
            RewriteRuleSubtreeStream stream_ov2=new RewriteRuleSubtreeStream(adaptor,"rule ov2",ov2!=null?ov2.tree:null);
            RewriteRuleSubtreeStream stream_ov1=new RewriteRuleSubtreeStream(adaptor,"rule ov1",ov1!=null?ov1.tree:null);
            RewriteRuleSubtreeStream stream_ov3=new RewriteRuleSubtreeStream(adaptor,"rule ov3",ov3!=null?ov3.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_oh2=new RewriteRuleSubtreeStream(adaptor,"rule oh2",oh2!=null?oh2.tree:null);
            RewriteRuleSubtreeStream stream_oh1=new RewriteRuleSubtreeStream(adaptor,"rule oh1",oh1!=null?oh1.tree:null);
            RewriteRuleSubtreeStream stream_oh3=new RewriteRuleSubtreeStream(adaptor,"rule oh3",oh3!=null?oh3.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 16:3: -> ^( Operations ^( EQ ^( $oh1 $r1_1 $r1_2) $r1_3) ^( EQ ^( $oh2 $r2_1 $r2_2) $r2_3) ^( EQ ^( $oh3 $r3_1 $r3_2) $r3_3) ^( EQ ^( $ov1 $r1_1 $r2_1) $r3_1) ^( EQ ^( $ov2 $r1_2 $r2_2) $r3_2) ^( EQ ^( $ov3 $r1_3 $r2_3) $r3_3) )
            {
                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:16:7: ^( Operations ^( EQ ^( $oh1 $r1_1 $r1_2) $r1_3) ^( EQ ^( $oh2 $r2_1 $r2_2) $r2_3) ^( EQ ^( $oh3 $r3_1 $r3_2) $r3_3) ^( EQ ^( $ov1 $r1_1 $r2_1) $r3_1) ^( EQ ^( $ov2 $r1_2 $r2_2) $r3_2) ^( EQ ^( $ov3 $r1_3 $r2_3) $r3_3) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(Operations, "Operations")
                , root_1);

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:17:7: ^( EQ ^( $oh1 $r1_1 $r1_2) $r1_3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_2);

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:17:12: ^( $oh1 $r1_1 $r1_2)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_oh1.nextNode(), root_3);

                adaptor.addChild(root_3, stream_r1_1.nextTree());

                adaptor.addChild(root_3, stream_r1_2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_r1_3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:18:7: ^( EQ ^( $oh2 $r2_1 $r2_2) $r2_3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_2);

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:18:12: ^( $oh2 $r2_1 $r2_2)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_oh2.nextNode(), root_3);

                adaptor.addChild(root_3, stream_r2_1.nextTree());

                adaptor.addChild(root_3, stream_r2_2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_r2_3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:19:7: ^( EQ ^( $oh3 $r3_1 $r3_2) $r3_3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_2);

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:19:12: ^( $oh3 $r3_1 $r3_2)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_oh3.nextNode(), root_3);

                adaptor.addChild(root_3, stream_r3_1.nextTree());

                adaptor.addChild(root_3, stream_r3_2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_r3_3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:20:7: ^( EQ ^( $ov1 $r1_1 $r2_1) $r3_1)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_2);

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:20:12: ^( $ov1 $r1_1 $r2_1)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_ov1.nextNode(), root_3);

                adaptor.addChild(root_3, stream_r1_1.nextTree());

                adaptor.addChild(root_3, stream_r2_1.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_r3_1.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:21:7: ^( EQ ^( $ov2 $r1_2 $r2_2) $r3_2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_2);

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:21:12: ^( $ov2 $r1_2 $r2_2)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_ov2.nextNode(), root_3);

                adaptor.addChild(root_3, stream_r1_2.nextTree());

                adaptor.addChild(root_3, stream_r2_2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_r3_2.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:22:7: ^( EQ ^( $ov3 $r1_3 $r2_3) $r3_3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_2);

                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:22:12: ^( $ov3 $r1_3 $r2_3)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_ov3.nextNode(), root_3);

                adaptor.addChild(root_3, stream_r1_3.nextTree());

                adaptor.addChild(root_3, stream_r2_3.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_r3_3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "s"


    public static class symbols_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "symbols"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:24:1: symbols : (syms= SYMBOL )+ -> ^( OPERAND ( SYMBOL )+ ) ;
    public final raeselParser.symbols_return symbols() throws RecognitionException {
        raeselParser.symbols_return retval = new raeselParser.symbols_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token syms=null;

        CommonTree syms_tree=null;
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:24:10: ( (syms= SYMBOL )+ -> ^( OPERAND ( SYMBOL )+ ) )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:24:12: (syms= SYMBOL )+
            {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:24:17: (syms= SYMBOL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SYMBOL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:24:17: syms= SYMBOL
            	    {
            	    syms=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_symbols338);  
            	    stream_SYMBOL.add(syms);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: SYMBOL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 24:27: -> ^( OPERAND ( SYMBOL )+ )
            {
                // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:24:30: ^( OPERAND ( SYMBOL )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OPERAND, "OPERAND")
                , root_1);

                if ( !(stream_SYMBOL.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_SYMBOL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SYMBOL.nextNode()
                    );

                }
                stream_SYMBOL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "symbols"


    public static class op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:27:1: op : ( PLUS | MINUS );
    public final raeselParser.op_return op() throws RecognitionException {
        raeselParser.op_return retval = new raeselParser.op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:27:4: ( PLUS | MINUS )
            // /Users/DucNguyenMinh/Dropbox/HAW_Dropbox/Für sich/4.Semester/CI/Aufgabenblatt/Blatt4/raesel.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set11=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set11)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "op"

    // Delegated rules


 

    public static final BitSet FOLLOW_symbols_in_s49 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_op_in_s55 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_symbols_in_s61 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_s63 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_symbols_in_s69 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_s71 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_op_in_s79 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_op_in_s85 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_op_in_s91 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_s92 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_symbols_in_s100 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_op_in_s107 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_symbols_in_s113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_s115 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_symbols_in_s121 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_s123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_s127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_s129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_s131 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_s133 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_symbols_in_s141 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_op_in_s147 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_symbols_in_s153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_s155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_symbols_in_s161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_symbols338 = new BitSet(new long[]{0x0000000000000202L});

}