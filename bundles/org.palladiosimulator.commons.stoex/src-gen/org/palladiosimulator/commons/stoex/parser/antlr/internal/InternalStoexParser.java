package org.palladiosimulator.commons.stoex.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.palladiosimulator.commons.stoex.services.StoexGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStoexParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_ID", "RULE_BOOLEAN_KEYWORDS", "RULE_STRING", "RULE_DECINT", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "':'", "'^'", "'NOT'", "'-'", "'['", "']'", "'('", "')'", "','", "'BYTESIZE'", "'VALUE'", "'STRUCTURE'", "'TYPE'", "'NUMBER_OF_ELEMENTS'", "'.'", "'/'", "'*'", "'DoublePDF'", "'IntPMF'", "'DoublePMF'", "'EnumPMF'", "'ordered'", "'BoolPMF'", "';'", "'AND'", "'OR'", "'XOR'", "'>'", "'<'", "'=='", "'<>'", "'>='", "'<='", "'+'", "'%'", "'_'", "'unitless'", "'B'", "'s'", "'m'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN_KEYWORDS=6;
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=8;
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


        public InternalStoexParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStoexParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStoexParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStoex.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private StoexGrammarAccess grammarAccess;

        public InternalStoexParser(TokenStream input, StoexGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "expression";
       	}

       	@Override
       	protected StoexGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleexpression"
    // InternalStoex.g:71:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalStoex.g:71:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalStoex.g:72:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalStoex.g:78:1: ruleexpression returns [EObject current=null] : this_ifelseExpr_0= ruleifelseExpr ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject this_ifelseExpr_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:84:2: (this_ifelseExpr_0= ruleifelseExpr )
            // InternalStoex.g:85:2: this_ifelseExpr_0= ruleifelseExpr
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getIfelseExprParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ifelseExpr_0=ruleifelseExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ifelseExpr_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleifelseExpr"
    // InternalStoex.g:99:1: entryRuleifelseExpr returns [EObject current=null] : iv_ruleifelseExpr= ruleifelseExpr EOF ;
    public final EObject entryRuleifelseExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleifelseExpr = null;


        try {
            // InternalStoex.g:99:51: (iv_ruleifelseExpr= ruleifelseExpr EOF )
            // InternalStoex.g:100:2: iv_ruleifelseExpr= ruleifelseExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfelseExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleifelseExpr=ruleifelseExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleifelseExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleifelseExpr"


    // $ANTLR start "ruleifelseExpr"
    // InternalStoex.g:106:1: ruleifelseExpr returns [EObject current=null] : (this_boolAndExpr_0= ruleboolAndExpr ( () otherlv_2= '?' ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) otherlv_4= ':' ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )? ) ;
    public final EObject ruleifelseExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_boolAndExpr_0 = null;

        EObject lv_ifExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:112:2: ( (this_boolAndExpr_0= ruleboolAndExpr ( () otherlv_2= '?' ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) otherlv_4= ':' ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )? ) )
            // InternalStoex.g:113:2: (this_boolAndExpr_0= ruleboolAndExpr ( () otherlv_2= '?' ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) otherlv_4= ':' ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )? )
            {
            // InternalStoex.g:113:2: (this_boolAndExpr_0= ruleboolAndExpr ( () otherlv_2= '?' ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) otherlv_4= ':' ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )? )
            // InternalStoex.g:114:3: this_boolAndExpr_0= ruleboolAndExpr ( () otherlv_2= '?' ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) otherlv_4= ':' ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfelseExprAccess().getBoolAndExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_boolAndExpr_0=ruleboolAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_boolAndExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalStoex.g:125:3: ( () otherlv_2= '?' ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) otherlv_4= ':' ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalStoex.g:126:4: () otherlv_2= '?' ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) otherlv_4= ':' ( (lv_elseExpression_5_0= ruleboolAndExpr ) )
                    {
                    // InternalStoex.g:126:4: ()
                    // InternalStoex.g:127:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getIfelseExprAccess().getQuestionMarkKeyword_1_1());
                      			
                    }
                    // InternalStoex.g:140:4: ( (lv_ifExpression_3_0= ruleboolAndExpr ) )
                    // InternalStoex.g:141:5: (lv_ifExpression_3_0= ruleboolAndExpr )
                    {
                    // InternalStoex.g:141:5: (lv_ifExpression_3_0= ruleboolAndExpr )
                    // InternalStoex.g:142:6: lv_ifExpression_3_0= ruleboolAndExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfelseExprAccess().getIfExpressionBoolAndExprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_ifExpression_3_0=ruleboolAndExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfelseExprRule());
                      						}
                      						set(
                      							current,
                      							"ifExpression",
                      							lv_ifExpression_3_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.boolAndExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfelseExprAccess().getColonKeyword_1_3());
                      			
                    }
                    // InternalStoex.g:163:4: ( (lv_elseExpression_5_0= ruleboolAndExpr ) )
                    // InternalStoex.g:164:5: (lv_elseExpression_5_0= ruleboolAndExpr )
                    {
                    // InternalStoex.g:164:5: (lv_elseExpression_5_0= ruleboolAndExpr )
                    // InternalStoex.g:165:6: lv_elseExpression_5_0= ruleboolAndExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfelseExprAccess().getElseExpressionBoolAndExprParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_elseExpression_5_0=ruleboolAndExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfelseExprRule());
                      						}
                      						set(
                      							current,
                      							"elseExpression",
                      							lv_elseExpression_5_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.boolAndExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleifelseExpr"


    // $ANTLR start "entryRuleboolAndExpr"
    // InternalStoex.g:187:1: entryRuleboolAndExpr returns [EObject current=null] : iv_ruleboolAndExpr= ruleboolAndExpr EOF ;
    public final EObject entryRuleboolAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolAndExpr = null;


        try {
            // InternalStoex.g:187:52: (iv_ruleboolAndExpr= ruleboolAndExpr EOF )
            // InternalStoex.g:188:2: iv_ruleboolAndExpr= ruleboolAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolAndExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleboolAndExpr=ruleboolAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolAndExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleboolAndExpr"


    // $ANTLR start "ruleboolAndExpr"
    // InternalStoex.g:194:1: ruleboolAndExpr returns [EObject current=null] : (this_boolOrExpr_0= ruleboolOrExpr ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )* ) ;
    public final EObject ruleboolAndExpr() throws RecognitionException {
        EObject current = null;

        EObject this_boolOrExpr_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:200:2: ( (this_boolOrExpr_0= ruleboolOrExpr ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )* ) )
            // InternalStoex.g:201:2: (this_boolOrExpr_0= ruleboolOrExpr ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )* )
            {
            // InternalStoex.g:201:2: (this_boolOrExpr_0= ruleboolOrExpr ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )* )
            // InternalStoex.g:202:3: this_boolOrExpr_0= ruleboolOrExpr ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoolAndExprAccess().getBoolOrExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_boolOrExpr_0=ruleboolOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_boolOrExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalStoex.g:213:3: ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStoex.g:214:4: () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) )
            	    {
            	    // InternalStoex.g:214:4: ()
            	    // InternalStoex.g:215:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalStoex.g:224:4: ( (lv_operation_2_0= ruleandoperation ) )
            	    // InternalStoex.g:225:5: (lv_operation_2_0= ruleandoperation )
            	    {
            	    // InternalStoex.g:225:5: (lv_operation_2_0= ruleandoperation )
            	    // InternalStoex.g:226:6: lv_operation_2_0= ruleandoperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolAndExprAccess().getOperationAndoperationEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_operation_2_0=ruleandoperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolAndExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operation",
            	      							lv_operation_2_0,
            	      							"org.palladiosimulator.commons.stoex.Stoex.andoperation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalStoex.g:243:4: ( (lv_right_3_0= ruleboolOrExpr ) )
            	    // InternalStoex.g:244:5: (lv_right_3_0= ruleboolOrExpr )
            	    {
            	    // InternalStoex.g:244:5: (lv_right_3_0= ruleboolOrExpr )
            	    // InternalStoex.g:245:6: lv_right_3_0= ruleboolOrExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolAndExprAccess().getRightBoolOrExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_right_3_0=ruleboolOrExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolAndExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.palladiosimulator.commons.stoex.Stoex.boolOrExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolAndExpr"


    // $ANTLR start "entryRuleboolOrExpr"
    // InternalStoex.g:267:1: entryRuleboolOrExpr returns [EObject current=null] : iv_ruleboolOrExpr= ruleboolOrExpr EOF ;
    public final EObject entryRuleboolOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolOrExpr = null;


        try {
            // InternalStoex.g:267:51: (iv_ruleboolOrExpr= ruleboolOrExpr EOF )
            // InternalStoex.g:268:2: iv_ruleboolOrExpr= ruleboolOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolOrExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleboolOrExpr=ruleboolOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolOrExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleboolOrExpr"


    // $ANTLR start "ruleboolOrExpr"
    // InternalStoex.g:274:1: ruleboolOrExpr returns [EObject current=null] : (this_compareExpr_0= rulecompareExpr ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )* ) ;
    public final EObject ruleboolOrExpr() throws RecognitionException {
        EObject current = null;

        EObject this_compareExpr_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:280:2: ( (this_compareExpr_0= rulecompareExpr ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )* ) )
            // InternalStoex.g:281:2: (this_compareExpr_0= rulecompareExpr ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )* )
            {
            // InternalStoex.g:281:2: (this_compareExpr_0= rulecompareExpr ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )* )
            // InternalStoex.g:282:3: this_compareExpr_0= rulecompareExpr ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoolOrExprAccess().getCompareExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_7);
            this_compareExpr_0=rulecompareExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_compareExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalStoex.g:293:3: ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=40 && LA3_0<=41)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStoex.g:294:4: () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) )
            	    {
            	    // InternalStoex.g:294:4: ()
            	    // InternalStoex.g:295:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalStoex.g:304:4: ( (lv_operation_2_0= ruleoroperations ) )
            	    // InternalStoex.g:305:5: (lv_operation_2_0= ruleoroperations )
            	    {
            	    // InternalStoex.g:305:5: (lv_operation_2_0= ruleoroperations )
            	    // InternalStoex.g:306:6: lv_operation_2_0= ruleoroperations
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolOrExprAccess().getOperationOroperationsEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_operation_2_0=ruleoroperations();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolOrExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operation",
            	      							lv_operation_2_0,
            	      							"org.palladiosimulator.commons.stoex.Stoex.oroperations");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalStoex.g:323:4: ( (lv_right_3_0= rulecompareExpr ) )
            	    // InternalStoex.g:324:5: (lv_right_3_0= rulecompareExpr )
            	    {
            	    // InternalStoex.g:324:5: (lv_right_3_0= rulecompareExpr )
            	    // InternalStoex.g:325:6: lv_right_3_0= rulecompareExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolOrExprAccess().getRightCompareExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_right_3_0=rulecompareExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolOrExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.palladiosimulator.commons.stoex.Stoex.compareExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolOrExpr"


    // $ANTLR start "entryRulecompareExpr"
    // InternalStoex.g:347:1: entryRulecompareExpr returns [EObject current=null] : iv_rulecompareExpr= rulecompareExpr EOF ;
    public final EObject entryRulecompareExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompareExpr = null;


        try {
            // InternalStoex.g:347:52: (iv_rulecompareExpr= rulecompareExpr EOF )
            // InternalStoex.g:348:2: iv_rulecompareExpr= rulecompareExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulecompareExpr=rulecompareExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompareExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompareExpr"


    // $ANTLR start "rulecompareExpr"
    // InternalStoex.g:354:1: rulecompareExpr returns [EObject current=null] : (this_sumExpr_0= rulesumExpr ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )? ) ;
    public final EObject rulecompareExpr() throws RecognitionException {
        EObject current = null;

        EObject this_sumExpr_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:360:2: ( (this_sumExpr_0= rulesumExpr ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )? ) )
            // InternalStoex.g:361:2: (this_sumExpr_0= rulesumExpr ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )? )
            {
            // InternalStoex.g:361:2: (this_sumExpr_0= rulesumExpr ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )? )
            // InternalStoex.g:362:3: this_sumExpr_0= rulesumExpr ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompareExprAccess().getSumExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_8);
            this_sumExpr_0=rulesumExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_sumExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalStoex.g:373:3: ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=42 && LA4_0<=47)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalStoex.g:374:4: () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) )
                    {
                    // InternalStoex.g:374:4: ()
                    // InternalStoex.g:375:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalStoex.g:384:4: ( (lv_operation_2_0= ruleCompareOperations ) )
                    // InternalStoex.g:385:5: (lv_operation_2_0= ruleCompareOperations )
                    {
                    // InternalStoex.g:385:5: (lv_operation_2_0= ruleCompareOperations )
                    // InternalStoex.g:386:6: lv_operation_2_0= ruleCompareOperations
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCompareExprAccess().getOperationCompareOperationsEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_operation_2_0=ruleCompareOperations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCompareExprRule());
                      						}
                      						set(
                      							current,
                      							"operation",
                      							lv_operation_2_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.CompareOperations");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalStoex.g:403:4: ( (lv_right_3_0= rulesumExpr ) )
                    // InternalStoex.g:404:5: (lv_right_3_0= rulesumExpr )
                    {
                    // InternalStoex.g:404:5: (lv_right_3_0= rulesumExpr )
                    // InternalStoex.g:405:6: lv_right_3_0= rulesumExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCompareExprAccess().getRightSumExprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=rulesumExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCompareExprRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.sumExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompareExpr"


    // $ANTLR start "entryRulesumExpr"
    // InternalStoex.g:427:1: entryRulesumExpr returns [EObject current=null] : iv_rulesumExpr= rulesumExpr EOF ;
    public final EObject entryRulesumExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesumExpr = null;


        try {
            // InternalStoex.g:427:48: (iv_rulesumExpr= rulesumExpr EOF )
            // InternalStoex.g:428:2: iv_rulesumExpr= rulesumExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesumExpr=rulesumExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesumExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesumExpr"


    // $ANTLR start "rulesumExpr"
    // InternalStoex.g:434:1: rulesumExpr returns [EObject current=null] : (this_prodExpr_0= ruleprodExpr ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )* ) ;
    public final EObject rulesumExpr() throws RecognitionException {
        EObject current = null;

        EObject this_prodExpr_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:440:2: ( (this_prodExpr_0= ruleprodExpr ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )* ) )
            // InternalStoex.g:441:2: (this_prodExpr_0= ruleprodExpr ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )* )
            {
            // InternalStoex.g:441:2: (this_prodExpr_0= ruleprodExpr ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )* )
            // InternalStoex.g:442:3: this_prodExpr_0= ruleprodExpr ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSumExprAccess().getProdExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_9);
            this_prodExpr_0=ruleprodExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_prodExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalStoex.g:453:3: ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||LA5_0==48) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStoex.g:454:4: () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) )
            	    {
            	    // InternalStoex.g:454:4: ()
            	    // InternalStoex.g:455:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalStoex.g:464:4: ( (lv_operation_2_0= ruleTermOperations ) )
            	    // InternalStoex.g:465:5: (lv_operation_2_0= ruleTermOperations )
            	    {
            	    // InternalStoex.g:465:5: (lv_operation_2_0= ruleTermOperations )
            	    // InternalStoex.g:466:6: lv_operation_2_0= ruleTermOperations
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSumExprAccess().getOperationTermOperationsEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_operation_2_0=ruleTermOperations();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSumExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operation",
            	      							lv_operation_2_0,
            	      							"org.palladiosimulator.commons.stoex.Stoex.TermOperations");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalStoex.g:483:4: ( (lv_right_3_0= ruleprodExpr ) )
            	    // InternalStoex.g:484:5: (lv_right_3_0= ruleprodExpr )
            	    {
            	    // InternalStoex.g:484:5: (lv_right_3_0= ruleprodExpr )
            	    // InternalStoex.g:485:6: lv_right_3_0= ruleprodExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSumExprAccess().getRightProdExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_right_3_0=ruleprodExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSumExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.palladiosimulator.commons.stoex.Stoex.prodExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesumExpr"


    // $ANTLR start "entryRuleprodExpr"
    // InternalStoex.g:507:1: entryRuleprodExpr returns [EObject current=null] : iv_ruleprodExpr= ruleprodExpr EOF ;
    public final EObject entryRuleprodExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprodExpr = null;


        try {
            // InternalStoex.g:507:49: (iv_ruleprodExpr= ruleprodExpr EOF )
            // InternalStoex.g:508:2: iv_ruleprodExpr= ruleprodExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProdExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleprodExpr=ruleprodExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprodExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprodExpr"


    // $ANTLR start "ruleprodExpr"
    // InternalStoex.g:514:1: ruleprodExpr returns [EObject current=null] : (this_powExpr_0= rulepowExpr ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )* ) ;
    public final EObject ruleprodExpr() throws RecognitionException {
        EObject current = null;

        EObject this_powExpr_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:520:2: ( (this_powExpr_0= rulepowExpr ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )* ) )
            // InternalStoex.g:521:2: (this_powExpr_0= rulepowExpr ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )* )
            {
            // InternalStoex.g:521:2: (this_powExpr_0= rulepowExpr ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )* )
            // InternalStoex.g:522:3: this_powExpr_0= rulepowExpr ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getProdExprAccess().getPowExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_10);
            this_powExpr_0=rulepowExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_powExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalStoex.g:533:3: ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=30 && LA6_0<=31)||LA6_0==49) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStoex.g:534:4: () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) )
            	    {
            	    // InternalStoex.g:534:4: ()
            	    // InternalStoex.g:535:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalStoex.g:544:4: ( (lv_operation_2_0= ruleProductOperations ) )
            	    // InternalStoex.g:545:5: (lv_operation_2_0= ruleProductOperations )
            	    {
            	    // InternalStoex.g:545:5: (lv_operation_2_0= ruleProductOperations )
            	    // InternalStoex.g:546:6: lv_operation_2_0= ruleProductOperations
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getProdExprAccess().getOperationProductOperationsEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_operation_2_0=ruleProductOperations();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getProdExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operation",
            	      							lv_operation_2_0,
            	      							"org.palladiosimulator.commons.stoex.Stoex.ProductOperations");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalStoex.g:563:4: ( (lv_right_3_0= rulepowExpr ) )
            	    // InternalStoex.g:564:5: (lv_right_3_0= rulepowExpr )
            	    {
            	    // InternalStoex.g:564:5: (lv_right_3_0= rulepowExpr )
            	    // InternalStoex.g:565:6: lv_right_3_0= rulepowExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getProdExprAccess().getRightPowExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_right_3_0=rulepowExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getProdExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.palladiosimulator.commons.stoex.Stoex.powExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprodExpr"


    // $ANTLR start "entryRulepowExpr"
    // InternalStoex.g:587:1: entryRulepowExpr returns [EObject current=null] : iv_rulepowExpr= rulepowExpr EOF ;
    public final EObject entryRulepowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepowExpr = null;


        try {
            // InternalStoex.g:587:48: (iv_rulepowExpr= rulepowExpr EOF )
            // InternalStoex.g:588:2: iv_rulepowExpr= rulepowExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulepowExpr=rulepowExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepowExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepowExpr"


    // $ANTLR start "rulepowExpr"
    // InternalStoex.g:594:1: rulepowExpr returns [EObject current=null] : (this_unaryExpr_0= ruleunaryExpr ( () otherlv_2= '^' ( (lv_exponent_3_0= ruleunaryExpr ) ) )? ) ;
    public final EObject rulepowExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_unaryExpr_0 = null;

        EObject lv_exponent_3_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:600:2: ( (this_unaryExpr_0= ruleunaryExpr ( () otherlv_2= '^' ( (lv_exponent_3_0= ruleunaryExpr ) ) )? ) )
            // InternalStoex.g:601:2: (this_unaryExpr_0= ruleunaryExpr ( () otherlv_2= '^' ( (lv_exponent_3_0= ruleunaryExpr ) ) )? )
            {
            // InternalStoex.g:601:2: (this_unaryExpr_0= ruleunaryExpr ( () otherlv_2= '^' ( (lv_exponent_3_0= ruleunaryExpr ) ) )? )
            // InternalStoex.g:602:3: this_unaryExpr_0= ruleunaryExpr ( () otherlv_2= '^' ( (lv_exponent_3_0= ruleunaryExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPowExprAccess().getUnaryExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_11);
            this_unaryExpr_0=ruleunaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_unaryExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalStoex.g:613:3: ( () otherlv_2= '^' ( (lv_exponent_3_0= ruleunaryExpr ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStoex.g:614:4: () otherlv_2= '^' ( (lv_exponent_3_0= ruleunaryExpr ) )
                    {
                    // InternalStoex.g:614:4: ()
                    // InternalStoex.g:615:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPowExprAccess().getCircumflexAccentKeyword_1_1());
                      			
                    }
                    // InternalStoex.g:628:4: ( (lv_exponent_3_0= ruleunaryExpr ) )
                    // InternalStoex.g:629:5: (lv_exponent_3_0= ruleunaryExpr )
                    {
                    // InternalStoex.g:629:5: (lv_exponent_3_0= ruleunaryExpr )
                    // InternalStoex.g:630:6: lv_exponent_3_0= ruleunaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPowExprAccess().getExponentUnaryExprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_exponent_3_0=ruleunaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPowExprRule());
                      						}
                      						set(
                      							current,
                      							"exponent",
                      							lv_exponent_3_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.unaryExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepowExpr"


    // $ANTLR start "entryRuleunaryExpr"
    // InternalStoex.g:652:1: entryRuleunaryExpr returns [EObject current=null] : iv_ruleunaryExpr= ruleunaryExpr EOF ;
    public final EObject entryRuleunaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunaryExpr = null;


        try {
            // InternalStoex.g:652:50: (iv_ruleunaryExpr= ruleunaryExpr EOF )
            // InternalStoex.g:653:2: iv_ruleunaryExpr= ruleunaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleunaryExpr=ruleunaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunaryExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunaryExpr"


    // $ANTLR start "ruleunaryExpr"
    // InternalStoex.g:659:1: ruleunaryExpr returns [EObject current=null] : (this_NegativeExpression_0= ruleNegativeExpression | this_NotExpression_1= ruleNotExpression | this_atom_2= ruleatom ) ;
    public final EObject ruleunaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_NegativeExpression_0 = null;

        EObject this_NotExpression_1 = null;

        EObject this_atom_2 = null;



        	enterRule();

        try {
            // InternalStoex.g:665:2: ( (this_NegativeExpression_0= ruleNegativeExpression | this_NotExpression_1= ruleNotExpression | this_atom_2= ruleatom ) )
            // InternalStoex.g:666:2: (this_NegativeExpression_0= ruleNegativeExpression | this_NotExpression_1= ruleNotExpression | this_atom_2= ruleatom )
            {
            // InternalStoex.g:666:2: (this_NegativeExpression_0= ruleNegativeExpression | this_NotExpression_1= ruleNotExpression | this_atom_2= ruleatom )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case RULE_DOUBLE:
            case RULE_ID:
            case RULE_BOOLEAN_KEYWORDS:
            case RULE_STRING:
            case RULE_DECINT:
            case 21:
            case 32:
            case 33:
            case 34:
            case 35:
            case 37:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalStoex.g:667:3: this_NegativeExpression_0= ruleNegativeExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExprAccess().getNegativeExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NegativeExpression_0=ruleNegativeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NegativeExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStoex.g:679:3: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExprAccess().getNotExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NotExpression_1=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NotExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalStoex.g:691:3: this_atom_2= ruleatom
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_atom_2=ruleatom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_atom_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunaryExpr"


    // $ANTLR start "entryRuleNotExpression"
    // InternalStoex.g:706:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalStoex.g:706:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalStoex.g:707:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalStoex.g:713:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= 'NOT' ( (lv_inner_1_0= ruleunaryExpr ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_inner_1_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:719:2: ( (otherlv_0= 'NOT' ( (lv_inner_1_0= ruleunaryExpr ) ) ) )
            // InternalStoex.g:720:2: (otherlv_0= 'NOT' ( (lv_inner_1_0= ruleunaryExpr ) ) )
            {
            // InternalStoex.g:720:2: (otherlv_0= 'NOT' ( (lv_inner_1_0= ruleunaryExpr ) ) )
            // InternalStoex.g:721:3: otherlv_0= 'NOT' ( (lv_inner_1_0= ruleunaryExpr ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getNOTKeyword_0());
              		
            }
            // InternalStoex.g:725:3: ( (lv_inner_1_0= ruleunaryExpr ) )
            // InternalStoex.g:726:4: (lv_inner_1_0= ruleunaryExpr )
            {
            // InternalStoex.g:726:4: (lv_inner_1_0= ruleunaryExpr )
            // InternalStoex.g:727:5: lv_inner_1_0= ruleunaryExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNotExpressionAccess().getInnerUnaryExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_inner_1_0=ruleunaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              					}
              					set(
              						current,
              						"inner",
              						lv_inner_1_0,
              						"org.palladiosimulator.commons.stoex.Stoex.unaryExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleNegativeExpression"
    // InternalStoex.g:748:1: entryRuleNegativeExpression returns [EObject current=null] : iv_ruleNegativeExpression= ruleNegativeExpression EOF ;
    public final EObject entryRuleNegativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeExpression = null;


        try {
            // InternalStoex.g:748:59: (iv_ruleNegativeExpression= ruleNegativeExpression EOF )
            // InternalStoex.g:749:2: iv_ruleNegativeExpression= ruleNegativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegativeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegativeExpression=ruleNegativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegativeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegativeExpression"


    // $ANTLR start "ruleNegativeExpression"
    // InternalStoex.g:755:1: ruleNegativeExpression returns [EObject current=null] : (otherlv_0= '-' ( (lv_inner_1_0= ruleunaryExpr ) ) ) ;
    public final EObject ruleNegativeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_inner_1_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:761:2: ( (otherlv_0= '-' ( (lv_inner_1_0= ruleunaryExpr ) ) ) )
            // InternalStoex.g:762:2: (otherlv_0= '-' ( (lv_inner_1_0= ruleunaryExpr ) ) )
            {
            // InternalStoex.g:762:2: (otherlv_0= '-' ( (lv_inner_1_0= ruleunaryExpr ) ) )
            // InternalStoex.g:763:3: otherlv_0= '-' ( (lv_inner_1_0= ruleunaryExpr ) )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNegativeExpressionAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalStoex.g:767:3: ( (lv_inner_1_0= ruleunaryExpr ) )
            // InternalStoex.g:768:4: (lv_inner_1_0= ruleunaryExpr )
            {
            // InternalStoex.g:768:4: (lv_inner_1_0= ruleunaryExpr )
            // InternalStoex.g:769:5: lv_inner_1_0= ruleunaryExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNegativeExpressionAccess().getInnerUnaryExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_inner_1_0=ruleunaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNegativeExpressionRule());
              					}
              					set(
              						current,
              						"inner",
              						lv_inner_1_0,
              						"org.palladiosimulator.commons.stoex.Stoex.unaryExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegativeExpression"


    // $ANTLR start "entryRuleatom"
    // InternalStoex.g:790:1: entryRuleatom returns [EObject current=null] : iv_ruleatom= ruleatom EOF ;
    public final EObject entryRuleatom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleatom = null;


        try {
            // InternalStoex.g:790:45: (iv_ruleatom= ruleatom EOF )
            // InternalStoex.g:791:2: iv_ruleatom= ruleatom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleatom=ruleatom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleatom; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleatom"


    // $ANTLR start "ruleatom"
    // InternalStoex.g:797:1: ruleatom returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral | this_FunctionLiteral_4= ruleFunctionLiteral | this_Variable_5= ruleVariable | this_Parenthesis_6= ruleParenthesis | this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral ) ;
    public final EObject ruleatom() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DoubleLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BoolLiteral_3 = null;

        EObject this_FunctionLiteral_4 = null;

        EObject this_Variable_5 = null;

        EObject this_Parenthesis_6 = null;

        EObject this_ProbabilityFunctionLiteral_7 = null;



        	enterRule();

        try {
            // InternalStoex.g:803:2: ( (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral | this_FunctionLiteral_4= ruleFunctionLiteral | this_Variable_5= ruleVariable | this_Parenthesis_6= ruleParenthesis | this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral ) )
            // InternalStoex.g:804:2: (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral | this_FunctionLiteral_4= ruleFunctionLiteral | this_Variable_5= ruleVariable | this_Parenthesis_6= ruleParenthesis | this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral )
            {
            // InternalStoex.g:804:2: (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral | this_FunctionLiteral_4= ruleFunctionLiteral | this_Variable_5= ruleVariable | this_Parenthesis_6= ruleParenthesis | this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalStoex.g:805:3: this_IntLiteral_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomAccess().getIntLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStoex.g:817:3: this_DoubleLiteral_1= ruleDoubleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomAccess().getDoubleLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DoubleLiteral_1=ruleDoubleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DoubleLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalStoex.g:829:3: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalStoex.g:841:3: this_BoolLiteral_3= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomAccess().getBoolLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolLiteral_3=ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalStoex.g:853:3: this_FunctionLiteral_4= ruleFunctionLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomAccess().getFunctionLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionLiteral_4=ruleFunctionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalStoex.g:865:3: this_Variable_5= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomAccess().getVariableParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Variable_5=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalStoex.g:877:3: this_Parenthesis_6= ruleParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomAccess().getParenthesisParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Parenthesis_6=ruleParenthesis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Parenthesis_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalStoex.g:889:3: this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomAccess().getProbabilityFunctionLiteralParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ProbabilityFunctionLiteral_7=ruleProbabilityFunctionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProbabilityFunctionLiteral_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleatom"


    // $ANTLR start "entryRuleDoubleLiteral"
    // InternalStoex.g:904:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // InternalStoex.g:904:54: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // InternalStoex.g:905:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // InternalStoex.g:911:1: ruleDoubleLiteral returns [EObject current=null] : ( ( (lv_value_0_0= RULE_DOUBLE ) ) (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:917:2: ( ( ( (lv_value_0_0= RULE_DOUBLE ) ) (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )? ) )
            // InternalStoex.g:918:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )? )
            {
            // InternalStoex.g:918:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )? )
            // InternalStoex.g:919:3: ( (lv_value_0_0= RULE_DOUBLE ) ) (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )?
            {
            // InternalStoex.g:919:3: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalStoex.g:920:4: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalStoex.g:920:4: (lv_value_0_0= RULE_DOUBLE )
            // InternalStoex.g:921:5: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getDoubleLiteralAccess().getValueDOUBLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDoubleLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.palladiosimulator.commons.stoex.Stoex.DOUBLE");
              				
            }

            }


            }

            // InternalStoex.g:937:3: (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStoex.g:938:4: otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDoubleLiteralAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalStoex.g:942:4: ( (lv_unit_2_0= ruleUnit ) )
                    // InternalStoex.g:943:5: (lv_unit_2_0= ruleUnit )
                    {
                    // InternalStoex.g:943:5: (lv_unit_2_0= ruleUnit )
                    // InternalStoex.g:944:6: lv_unit_2_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDoubleLiteralAccess().getUnitUnitParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_unit_2_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDoubleLiteralRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_2_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.Unit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDoubleLiteralAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleProbabilityFunctionLiteral"
    // InternalStoex.g:970:1: entryRuleProbabilityFunctionLiteral returns [EObject current=null] : iv_ruleProbabilityFunctionLiteral= ruleProbabilityFunctionLiteral EOF ;
    public final EObject entryRuleProbabilityFunctionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityFunctionLiteral = null;


        try {
            // InternalStoex.g:970:67: (iv_ruleProbabilityFunctionLiteral= ruleProbabilityFunctionLiteral EOF )
            // InternalStoex.g:971:2: iv_ruleProbabilityFunctionLiteral= ruleProbabilityFunctionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProbabilityFunctionLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProbabilityFunctionLiteral=ruleProbabilityFunctionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProbabilityFunctionLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProbabilityFunctionLiteral"


    // $ANTLR start "ruleProbabilityFunctionLiteral"
    // InternalStoex.g:977:1: ruleProbabilityFunctionLiteral returns [EObject current=null] : ( (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition ) ) ;
    public final EObject ruleProbabilityFunctionLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_function_ProbabilityFunctionLiteral_0_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:983:2: ( ( (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition ) ) )
            // InternalStoex.g:984:2: ( (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition ) )
            {
            // InternalStoex.g:984:2: ( (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition ) )
            // InternalStoex.g:985:3: (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition )
            {
            // InternalStoex.g:985:3: (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition )
            // InternalStoex.g:986:4: lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getProbabilityFunctionLiteralAccess().getFunction_ProbabilityFunctionLiteralDefinitionParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_function_ProbabilityFunctionLiteral_0_0=ruledefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getProbabilityFunctionLiteralRule());
              				}
              				set(
              					current,
              					"function_ProbabilityFunctionLiteral",
              					lv_function_ProbabilityFunctionLiteral_0_0,
              					"org.palladiosimulator.commons.stoex.Stoex.definition");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProbabilityFunctionLiteral"


    // $ANTLR start "entryRuleParenthesis"
    // InternalStoex.g:1006:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalStoex.g:1006:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalStoex.g:1007:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesis; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalStoex.g:1013:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_innerExpression_1_0= ruleifelseExpr ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_innerExpression_1_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1019:2: ( (otherlv_0= '(' ( (lv_innerExpression_1_0= ruleifelseExpr ) ) otherlv_2= ')' ) )
            // InternalStoex.g:1020:2: (otherlv_0= '(' ( (lv_innerExpression_1_0= ruleifelseExpr ) ) otherlv_2= ')' )
            {
            // InternalStoex.g:1020:2: (otherlv_0= '(' ( (lv_innerExpression_1_0= ruleifelseExpr ) ) otherlv_2= ')' )
            // InternalStoex.g:1021:3: otherlv_0= '(' ( (lv_innerExpression_1_0= ruleifelseExpr ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalStoex.g:1025:3: ( (lv_innerExpression_1_0= ruleifelseExpr ) )
            // InternalStoex.g:1026:4: (lv_innerExpression_1_0= ruleifelseExpr )
            {
            // InternalStoex.g:1026:4: (lv_innerExpression_1_0= ruleifelseExpr )
            // InternalStoex.g:1027:5: lv_innerExpression_1_0= ruleifelseExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParenthesisAccess().getInnerExpressionIfelseExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_innerExpression_1_0=ruleifelseExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParenthesisRule());
              					}
              					set(
              						current,
              						"innerExpression",
              						lv_innerExpression_1_0,
              						"org.palladiosimulator.commons.stoex.Stoex.ifelseExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleFunctionLiteral"
    // InternalStoex.g:1052:1: entryRuleFunctionLiteral returns [EObject current=null] : iv_ruleFunctionLiteral= ruleFunctionLiteral EOF ;
    public final EObject entryRuleFunctionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionLiteral = null;


        try {
            // InternalStoex.g:1052:56: (iv_ruleFunctionLiteral= ruleFunctionLiteral EOF )
            // InternalStoex.g:1053:2: iv_ruleFunctionLiteral= ruleFunctionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionLiteral=ruleFunctionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionLiteral"


    // $ANTLR start "ruleFunctionLiteral"
    // InternalStoex.g:1059:1: ruleFunctionLiteral returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (otherlv_3= ',' ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_FunctionLiteral_2_0 = null;

        EObject lv_parameters_FunctionLiteral_4_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1065:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (otherlv_3= ',' ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )? otherlv_5= ')' ) )
            // InternalStoex.g:1066:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (otherlv_3= ',' ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )? otherlv_5= ')' )
            {
            // InternalStoex.g:1066:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (otherlv_3= ',' ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )? otherlv_5= ')' )
            // InternalStoex.g:1067:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (otherlv_3= ',' ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )? otherlv_5= ')'
            {
            // InternalStoex.g:1067:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalStoex.g:1068:4: (lv_id_0_0= RULE_ID )
            {
            // InternalStoex.g:1068:4: (lv_id_0_0= RULE_ID )
            // InternalStoex.g:1069:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_0_0, grammarAccess.getFunctionLiteralAccess().getIdIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_0_0,
              						"org.palladiosimulator.commons.stoex.Stoex.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionLiteralAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalStoex.g:1089:3: ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (otherlv_3= ',' ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_DOUBLE && LA12_0<=RULE_DECINT)||(LA12_0>=17 && LA12_0<=18)||LA12_0==21||(LA12_0>=32 && LA12_0<=35)||LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStoex.g:1090:4: ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (otherlv_3= ',' ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )*
                    {
                    // InternalStoex.g:1090:4: ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) )
                    // InternalStoex.g:1091:5: (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr )
                    {
                    // InternalStoex.g:1091:5: (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr )
                    // InternalStoex.g:1092:6: lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralBoolAndExprParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_parameters_FunctionLiteral_2_0=ruleboolAndExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionLiteralRule());
                      						}
                      						add(
                      							current,
                      							"parameters_FunctionLiteral",
                      							lv_parameters_FunctionLiteral_2_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.boolAndExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalStoex.g:1109:4: (otherlv_3= ',' ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalStoex.g:1110:5: otherlv_3= ',' ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionLiteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalStoex.g:1114:5: ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) )
                    	    // InternalStoex.g:1115:6: (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr )
                    	    {
                    	    // InternalStoex.g:1115:6: (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr )
                    	    // InternalStoex.g:1116:7: lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralBoolAndExprParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_18);
                    	    lv_parameters_FunctionLiteral_4_0=ruleboolAndExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters_FunctionLiteral",
                    	      								lv_parameters_FunctionLiteral_4_0,
                    	      								"org.palladiosimulator.commons.stoex.Stoex.boolAndExpr");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFunctionLiteralAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionLiteral"


    // $ANTLR start "entryRuleVariable"
    // InternalStoex.g:1143:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalStoex.g:1143:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalStoex.g:1144:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalStoex.g:1150:1: ruleVariable returns [EObject current=null] : ( (lv_id_Variable_0_0= ruleAbstractNamedReference ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_id_Variable_0_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1156:2: ( ( (lv_id_Variable_0_0= ruleAbstractNamedReference ) ) )
            // InternalStoex.g:1157:2: ( (lv_id_Variable_0_0= ruleAbstractNamedReference ) )
            {
            // InternalStoex.g:1157:2: ( (lv_id_Variable_0_0= ruleAbstractNamedReference ) )
            // InternalStoex.g:1158:3: (lv_id_Variable_0_0= ruleAbstractNamedReference )
            {
            // InternalStoex.g:1158:3: (lv_id_Variable_0_0= ruleAbstractNamedReference )
            // InternalStoex.g:1159:4: lv_id_Variable_0_0= ruleAbstractNamedReference
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getVariableAccess().getId_VariableAbstractNamedReferenceParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_id_Variable_0_0=ruleAbstractNamedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getVariableRule());
              				}
              				set(
              					current,
              					"id_Variable",
              					lv_id_Variable_0_0,
              					"org.palladiosimulator.commons.stoex.Stoex.AbstractNamedReference");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAbstractNamedReference"
    // InternalStoex.g:1179:1: entryRuleAbstractNamedReference returns [EObject current=null] : iv_ruleAbstractNamedReference= ruleAbstractNamedReference EOF ;
    public final EObject entryRuleAbstractNamedReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNamedReference = null;


        try {
            // InternalStoex.g:1179:63: (iv_ruleAbstractNamedReference= ruleAbstractNamedReference EOF )
            // InternalStoex.g:1180:2: iv_ruleAbstractNamedReference= ruleAbstractNamedReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractNamedReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractNamedReference=ruleAbstractNamedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractNamedReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractNamedReference"


    // $ANTLR start "ruleAbstractNamedReference"
    // InternalStoex.g:1186:1: ruleAbstractNamedReference returns [EObject current=null] : this_NamespaceReference_0= ruleNamespaceReference ;
    public final EObject ruleAbstractNamedReference() throws RecognitionException {
        EObject current = null;

        EObject this_NamespaceReference_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1192:2: (this_NamespaceReference_0= ruleNamespaceReference )
            // InternalStoex.g:1193:2: this_NamespaceReference_0= ruleNamespaceReference
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getAbstractNamedReferenceAccess().getNamespaceReferenceParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_NamespaceReference_0=ruleNamespaceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_NamespaceReference_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractNamedReference"


    // $ANTLR start "entryRuleVariableReference"
    // InternalStoex.g:1207:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalStoex.g:1207:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalStoex.g:1208:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalStoex.g:1214:1: ruleVariableReference returns [EObject current=null] : ( ( (lv_referenceName_0_1= 'BYTESIZE' | lv_referenceName_0_2= 'VALUE' | lv_referenceName_0_3= 'STRUCTURE' | lv_referenceName_0_4= 'TYPE' | lv_referenceName_0_5= 'NUMBER_OF_ELEMENTS' ) ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token lv_referenceName_0_1=null;
        Token lv_referenceName_0_2=null;
        Token lv_referenceName_0_3=null;
        Token lv_referenceName_0_4=null;
        Token lv_referenceName_0_5=null;


        	enterRule();

        try {
            // InternalStoex.g:1220:2: ( ( ( (lv_referenceName_0_1= 'BYTESIZE' | lv_referenceName_0_2= 'VALUE' | lv_referenceName_0_3= 'STRUCTURE' | lv_referenceName_0_4= 'TYPE' | lv_referenceName_0_5= 'NUMBER_OF_ELEMENTS' ) ) ) )
            // InternalStoex.g:1221:2: ( ( (lv_referenceName_0_1= 'BYTESIZE' | lv_referenceName_0_2= 'VALUE' | lv_referenceName_0_3= 'STRUCTURE' | lv_referenceName_0_4= 'TYPE' | lv_referenceName_0_5= 'NUMBER_OF_ELEMENTS' ) ) )
            {
            // InternalStoex.g:1221:2: ( ( (lv_referenceName_0_1= 'BYTESIZE' | lv_referenceName_0_2= 'VALUE' | lv_referenceName_0_3= 'STRUCTURE' | lv_referenceName_0_4= 'TYPE' | lv_referenceName_0_5= 'NUMBER_OF_ELEMENTS' ) ) )
            // InternalStoex.g:1222:3: ( (lv_referenceName_0_1= 'BYTESIZE' | lv_referenceName_0_2= 'VALUE' | lv_referenceName_0_3= 'STRUCTURE' | lv_referenceName_0_4= 'TYPE' | lv_referenceName_0_5= 'NUMBER_OF_ELEMENTS' ) )
            {
            // InternalStoex.g:1222:3: ( (lv_referenceName_0_1= 'BYTESIZE' | lv_referenceName_0_2= 'VALUE' | lv_referenceName_0_3= 'STRUCTURE' | lv_referenceName_0_4= 'TYPE' | lv_referenceName_0_5= 'NUMBER_OF_ELEMENTS' ) )
            // InternalStoex.g:1223:4: (lv_referenceName_0_1= 'BYTESIZE' | lv_referenceName_0_2= 'VALUE' | lv_referenceName_0_3= 'STRUCTURE' | lv_referenceName_0_4= 'TYPE' | lv_referenceName_0_5= 'NUMBER_OF_ELEMENTS' )
            {
            // InternalStoex.g:1223:4: (lv_referenceName_0_1= 'BYTESIZE' | lv_referenceName_0_2= 'VALUE' | lv_referenceName_0_3= 'STRUCTURE' | lv_referenceName_0_4= 'TYPE' | lv_referenceName_0_5= 'NUMBER_OF_ELEMENTS' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 28:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalStoex.g:1224:5: lv_referenceName_0_1= 'BYTESIZE'
                    {
                    lv_referenceName_0_1=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_referenceName_0_1, grammarAccess.getVariableReferenceAccess().getReferenceNameBYTESIZEKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableReferenceRule());
                      					}
                      					setWithLastConsumed(current, "referenceName", lv_referenceName_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalStoex.g:1235:5: lv_referenceName_0_2= 'VALUE'
                    {
                    lv_referenceName_0_2=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_referenceName_0_2, grammarAccess.getVariableReferenceAccess().getReferenceNameVALUEKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableReferenceRule());
                      					}
                      					setWithLastConsumed(current, "referenceName", lv_referenceName_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalStoex.g:1246:5: lv_referenceName_0_3= 'STRUCTURE'
                    {
                    lv_referenceName_0_3=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_referenceName_0_3, grammarAccess.getVariableReferenceAccess().getReferenceNameSTRUCTUREKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableReferenceRule());
                      					}
                      					setWithLastConsumed(current, "referenceName", lv_referenceName_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalStoex.g:1257:5: lv_referenceName_0_4= 'TYPE'
                    {
                    lv_referenceName_0_4=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_referenceName_0_4, grammarAccess.getVariableReferenceAccess().getReferenceNameTYPEKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableReferenceRule());
                      					}
                      					setWithLastConsumed(current, "referenceName", lv_referenceName_0_4, null);
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalStoex.g:1268:5: lv_referenceName_0_5= 'NUMBER_OF_ELEMENTS'
                    {
                    lv_referenceName_0_5=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_referenceName_0_5, grammarAccess.getVariableReferenceAccess().getReferenceNameNUMBER_OF_ELEMENTSKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableReferenceRule());
                      					}
                      					setWithLastConsumed(current, "referenceName", lv_referenceName_0_5, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleNamespaceReference"
    // InternalStoex.g:1284:1: entryRuleNamespaceReference returns [EObject current=null] : iv_ruleNamespaceReference= ruleNamespaceReference EOF ;
    public final EObject entryRuleNamespaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceReference = null;


        try {
            // InternalStoex.g:1284:59: (iv_ruleNamespaceReference= ruleNamespaceReference EOF )
            // InternalStoex.g:1285:2: iv_ruleNamespaceReference= ruleNamespaceReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNamespaceReference=ruleNamespaceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespaceReference"


    // $ANTLR start "ruleNamespaceReference"
    // InternalStoex.g:1291:1: ruleNamespaceReference returns [EObject current=null] : ( ( (lv_referenceName_0_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) ) | ( (lv_innerReference_NamespaceReference_3_0= ruleVariableReference ) ) ) ) ;
    public final EObject ruleNamespaceReference() throws RecognitionException {
        EObject current = null;

        Token lv_referenceName_0_0=null;
        Token otherlv_1=null;
        EObject lv_innerReference_NamespaceReference_2_0 = null;

        EObject lv_innerReference_NamespaceReference_3_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1297:2: ( ( ( (lv_referenceName_0_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) ) | ( (lv_innerReference_NamespaceReference_3_0= ruleVariableReference ) ) ) ) )
            // InternalStoex.g:1298:2: ( ( (lv_referenceName_0_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) ) | ( (lv_innerReference_NamespaceReference_3_0= ruleVariableReference ) ) ) )
            {
            // InternalStoex.g:1298:2: ( ( (lv_referenceName_0_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) ) | ( (lv_innerReference_NamespaceReference_3_0= ruleVariableReference ) ) ) )
            // InternalStoex.g:1299:3: ( (lv_referenceName_0_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) ) | ( (lv_innerReference_NamespaceReference_3_0= ruleVariableReference ) ) )
            {
            // InternalStoex.g:1299:3: ( (lv_referenceName_0_0= RULE_ID ) )
            // InternalStoex.g:1300:4: (lv_referenceName_0_0= RULE_ID )
            {
            // InternalStoex.g:1300:4: (lv_referenceName_0_0= RULE_ID )
            // InternalStoex.g:1301:5: lv_referenceName_0_0= RULE_ID
            {
            lv_referenceName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_referenceName_0_0, grammarAccess.getNamespaceReferenceAccess().getReferenceNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNamespaceReferenceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"referenceName",
              						lv_referenceName_0_0,
              						"org.palladiosimulator.commons.stoex.Stoex.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNamespaceReferenceAccess().getFullStopKeyword_1());
              		
            }
            // InternalStoex.g:1321:3: ( ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) ) | ( (lv_innerReference_NamespaceReference_3_0= ruleVariableReference ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=24 && LA14_0<=28)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalStoex.g:1322:4: ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) )
                    {
                    // InternalStoex.g:1322:4: ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) )
                    // InternalStoex.g:1323:5: (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference )
                    {
                    // InternalStoex.g:1323:5: (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference )
                    // InternalStoex.g:1324:6: lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAbstractNamedReferenceParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_innerReference_NamespaceReference_2_0=ruleAbstractNamedReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNamespaceReferenceRule());
                      						}
                      						set(
                      							current,
                      							"innerReference_NamespaceReference",
                      							lv_innerReference_NamespaceReference_2_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.AbstractNamedReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1342:4: ( (lv_innerReference_NamespaceReference_3_0= ruleVariableReference ) )
                    {
                    // InternalStoex.g:1342:4: ( (lv_innerReference_NamespaceReference_3_0= ruleVariableReference ) )
                    // InternalStoex.g:1343:5: (lv_innerReference_NamespaceReference_3_0= ruleVariableReference )
                    {
                    // InternalStoex.g:1343:5: (lv_innerReference_NamespaceReference_3_0= ruleVariableReference )
                    // InternalStoex.g:1344:6: lv_innerReference_NamespaceReference_3_0= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceVariableReferenceParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_innerReference_NamespaceReference_3_0=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNamespaceReferenceRule());
                      						}
                      						set(
                      							current,
                      							"innerReference_NamespaceReference",
                      							lv_innerReference_NamespaceReference_3_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.VariableReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespaceReference"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalStoex.g:1366:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalStoex.g:1366:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalStoex.g:1367:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalStoex.g:1373:1: ruleBoolLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_KEYWORDS ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalStoex.g:1379:2: ( ( (lv_value_0_0= RULE_BOOLEAN_KEYWORDS ) ) )
            // InternalStoex.g:1380:2: ( (lv_value_0_0= RULE_BOOLEAN_KEYWORDS ) )
            {
            // InternalStoex.g:1380:2: ( (lv_value_0_0= RULE_BOOLEAN_KEYWORDS ) )
            // InternalStoex.g:1381:3: (lv_value_0_0= RULE_BOOLEAN_KEYWORDS )
            {
            // InternalStoex.g:1381:3: (lv_value_0_0= RULE_BOOLEAN_KEYWORDS )
            // InternalStoex.g:1382:4: lv_value_0_0= RULE_BOOLEAN_KEYWORDS
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN_KEYWORDS,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getBoolLiteralAccess().getValueBOOLEAN_KEYWORDSTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getBoolLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.palladiosimulator.commons.stoex.Stoex.BOOLEAN_KEYWORDS");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalStoex.g:1401:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalStoex.g:1401:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalStoex.g:1402:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalStoex.g:1408:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalStoex.g:1414:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalStoex.g:1415:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalStoex.g:1415:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalStoex.g:1416:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalStoex.g:1416:3: (lv_value_0_0= RULE_STRING )
            // InternalStoex.g:1417:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.palladiosimulator.commons.stoex.Stoex.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalStoex.g:1436:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalStoex.g:1436:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalStoex.g:1437:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalStoex.g:1443:1: ruleIntLiteral returns [EObject current=null] : ( ( (lv_value_0_0= RULE_DECINT ) ) (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1449:2: ( ( ( (lv_value_0_0= RULE_DECINT ) ) (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )? ) )
            // InternalStoex.g:1450:2: ( ( (lv_value_0_0= RULE_DECINT ) ) (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )? )
            {
            // InternalStoex.g:1450:2: ( ( (lv_value_0_0= RULE_DECINT ) ) (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )? )
            // InternalStoex.g:1451:3: ( (lv_value_0_0= RULE_DECINT ) ) (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )?
            {
            // InternalStoex.g:1451:3: ( (lv_value_0_0= RULE_DECINT ) )
            // InternalStoex.g:1452:4: (lv_value_0_0= RULE_DECINT )
            {
            // InternalStoex.g:1452:4: (lv_value_0_0= RULE_DECINT )
            // InternalStoex.g:1453:5: lv_value_0_0= RULE_DECINT
            {
            lv_value_0_0=(Token)match(input,RULE_DECINT,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueDECINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.palladiosimulator.commons.stoex.Stoex.DECINT");
              				
            }

            }


            }

            // InternalStoex.g:1469:3: (otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalStoex.g:1470:4: otherlv_1= '[' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getIntLiteralAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalStoex.g:1474:4: ( (lv_unit_2_0= ruleUnit ) )
                    // InternalStoex.g:1475:5: (lv_unit_2_0= ruleUnit )
                    {
                    // InternalStoex.g:1475:5: (lv_unit_2_0= ruleUnit )
                    // InternalStoex.g:1476:6: lv_unit_2_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIntLiteralAccess().getUnitUnitParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_unit_2_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIntLiteralRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_2_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.Unit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getIntLiteralAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleUnit"
    // InternalStoex.g:1502:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalStoex.g:1502:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalStoex.g:1503:2: iv_ruleUnit= ruleUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnit; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalStoex.g:1509:1: ruleUnit returns [EObject current=null] : (this_unitMulti_0= ruleunitMulti | this_unitDiv_1= ruleunitDiv | this_BaseUnit_2= ruleBaseUnit ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        EObject this_unitMulti_0 = null;

        EObject this_unitDiv_1 = null;

        EObject this_BaseUnit_2 = null;



        	enterRule();

        try {
            // InternalStoex.g:1515:2: ( (this_unitMulti_0= ruleunitMulti | this_unitDiv_1= ruleunitDiv | this_BaseUnit_2= ruleBaseUnit ) )
            // InternalStoex.g:1516:2: (this_unitMulti_0= ruleunitMulti | this_unitDiv_1= ruleunitDiv | this_BaseUnit_2= ruleBaseUnit )
            {
            // InternalStoex.g:1516:2: (this_unitMulti_0= ruleunitMulti | this_unitDiv_1= ruleunitDiv | this_BaseUnit_2= ruleBaseUnit )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalStoex.g:1517:3: this_unitMulti_0= ruleunitMulti
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnitAccess().getUnitMultiParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_unitMulti_0=ruleunitMulti();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_unitMulti_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStoex.g:1529:3: this_unitDiv_1= ruleunitDiv
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnitAccess().getUnitDivParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_unitDiv_1=ruleunitDiv();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_unitDiv_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalStoex.g:1541:3: this_BaseUnit_2= ruleBaseUnit
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnitAccess().getBaseUnitParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BaseUnit_2=ruleBaseUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BaseUnit_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleunitDiv"
    // InternalStoex.g:1556:1: entryRuleunitDiv returns [EObject current=null] : iv_ruleunitDiv= ruleunitDiv EOF ;
    public final EObject entryRuleunitDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunitDiv = null;


        try {
            // InternalStoex.g:1556:48: (iv_ruleunitDiv= ruleunitDiv EOF )
            // InternalStoex.g:1557:2: iv_ruleunitDiv= ruleunitDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitDivRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleunitDiv=ruleunitDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunitDiv; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunitDiv"


    // $ANTLR start "ruleunitDiv"
    // InternalStoex.g:1563:1: ruleunitDiv returns [EObject current=null] : (this_unitPow_0= ruleunitPow ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )? ) ;
    public final EObject ruleunitDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_unitPow_0 = null;

        EObject lv_divisor_3_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1569:2: ( (this_unitPow_0= ruleunitPow ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )? ) )
            // InternalStoex.g:1570:2: (this_unitPow_0= ruleunitPow ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )? )
            {
            // InternalStoex.g:1570:2: (this_unitPow_0= ruleunitPow ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )? )
            // InternalStoex.g:1571:3: this_unitPow_0= ruleunitPow ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUnitDivAccess().getUnitPowParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_21);
            this_unitPow_0=ruleunitPow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_unitPow_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalStoex.g:1582:3: ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalStoex.g:1583:4: () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) )
                    {
                    // InternalStoex.g:1583:4: ()
                    // InternalStoex.g:1584:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getUnitDivAccess().getUnitDivisionDividendAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUnitDivAccess().getSolidusKeyword_1_1());
                      			
                    }
                    // InternalStoex.g:1597:4: ( (lv_divisor_3_0= ruleUnit ) )
                    // InternalStoex.g:1598:5: (lv_divisor_3_0= ruleUnit )
                    {
                    // InternalStoex.g:1598:5: (lv_divisor_3_0= ruleUnit )
                    // InternalStoex.g:1599:6: lv_divisor_3_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnitDivAccess().getDivisorUnitParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_divisor_3_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnitDivRule());
                      						}
                      						set(
                      							current,
                      							"divisor",
                      							lv_divisor_3_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.Unit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunitDiv"


    // $ANTLR start "entryRuleunitMulti"
    // InternalStoex.g:1621:1: entryRuleunitMulti returns [EObject current=null] : iv_ruleunitMulti= ruleunitMulti EOF ;
    public final EObject entryRuleunitMulti() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunitMulti = null;


        try {
            // InternalStoex.g:1621:50: (iv_ruleunitMulti= ruleunitMulti EOF )
            // InternalStoex.g:1622:2: iv_ruleunitMulti= ruleunitMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitMultiRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleunitMulti=ruleunitMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunitMulti; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunitMulti"


    // $ANTLR start "ruleunitMulti"
    // InternalStoex.g:1628:1: ruleunitMulti returns [EObject current=null] : (this_unitPow_0= ruleunitPow ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )* ) ;
    public final EObject ruleunitMulti() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_unitPow_0 = null;

        EObject lv_units_3_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1634:2: ( (this_unitPow_0= ruleunitPow ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )* ) )
            // InternalStoex.g:1635:2: (this_unitPow_0= ruleunitPow ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )* )
            {
            // InternalStoex.g:1635:2: (this_unitPow_0= ruleunitPow ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )* )
            // InternalStoex.g:1636:3: this_unitPow_0= ruleunitPow ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUnitMultiAccess().getUnitPowParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_22);
            this_unitPow_0=ruleunitPow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_unitPow_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalStoex.g:1647:3: ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred29_InternalStoex()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalStoex.g:1648:4: () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) )
            	    {
            	    // InternalStoex.g:1648:4: ()
            	    // InternalStoex.g:1649:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getUnitMultiAccess().getUnitMultiplicationUnitsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getUnitMultiAccess().getAsteriskKeyword_1_1());
            	      			
            	    }
            	    // InternalStoex.g:1662:4: ( (lv_units_3_0= ruleUnit ) )
            	    // InternalStoex.g:1663:5: (lv_units_3_0= ruleUnit )
            	    {
            	    // InternalStoex.g:1663:5: (lv_units_3_0= ruleUnit )
            	    // InternalStoex.g:1664:6: lv_units_3_0= ruleUnit
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnitMultiAccess().getUnitsUnitParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_units_3_0=ruleUnit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnitMultiRule());
            	      						}
            	      						add(
            	      							current,
            	      							"units",
            	      							lv_units_3_0,
            	      							"org.palladiosimulator.commons.stoex.Stoex.Unit");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunitMulti"


    // $ANTLR start "entryRuleunitPow"
    // InternalStoex.g:1686:1: entryRuleunitPow returns [EObject current=null] : iv_ruleunitPow= ruleunitPow EOF ;
    public final EObject entryRuleunitPow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunitPow = null;


        try {
            // InternalStoex.g:1686:48: (iv_ruleunitPow= ruleunitPow EOF )
            // InternalStoex.g:1687:2: iv_ruleunitPow= ruleunitPow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitPowRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleunitPow=ruleunitPow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunitPow; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunitPow"


    // $ANTLR start "ruleunitPow"
    // InternalStoex.g:1693:1: ruleunitPow returns [EObject current=null] : ( (this_BaseUnit_0= ruleBaseUnit | (otherlv_1= '(' (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) otherlv_4= ')' ) ) ( () otherlv_6= '^' ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )* ) ;
    public final EObject ruleunitPow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_BaseUnit_0 = null;

        EObject this_unitMulti_2 = null;

        EObject this_unitDiv_3 = null;

        AntlrDatatypeRuleToken lv_exponent_7_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1699:2: ( ( (this_BaseUnit_0= ruleBaseUnit | (otherlv_1= '(' (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) otherlv_4= ')' ) ) ( () otherlv_6= '^' ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )* ) )
            // InternalStoex.g:1700:2: ( (this_BaseUnit_0= ruleBaseUnit | (otherlv_1= '(' (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) otherlv_4= ')' ) ) ( () otherlv_6= '^' ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )* )
            {
            // InternalStoex.g:1700:2: ( (this_BaseUnit_0= ruleBaseUnit | (otherlv_1= '(' (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) otherlv_4= ')' ) ) ( () otherlv_6= '^' ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )* )
            // InternalStoex.g:1701:3: (this_BaseUnit_0= ruleBaseUnit | (otherlv_1= '(' (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) otherlv_4= ')' ) ) ( () otherlv_6= '^' ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )*
            {
            // InternalStoex.g:1701:3: (this_BaseUnit_0= ruleBaseUnit | (otherlv_1= '(' (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) otherlv_4= ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=50 && LA20_0<=54)) ) {
                alt20=1;
            }
            else if ( (LA20_0==21) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalStoex.g:1702:4: this_BaseUnit_0= ruleBaseUnit
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnitPowAccess().getBaseUnitParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    this_BaseUnit_0=ruleBaseUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BaseUnit_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalStoex.g:1714:4: (otherlv_1= '(' (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) otherlv_4= ')' )
                    {
                    // InternalStoex.g:1714:4: (otherlv_1= '(' (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) otherlv_4= ')' )
                    // InternalStoex.g:1715:5: otherlv_1= '(' (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getUnitPowAccess().getLeftParenthesisKeyword_0_1_0());
                      				
                    }
                    // InternalStoex.g:1719:5: (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv )
                    int alt19=2;
                    switch ( input.LA(1) ) {
                    case 50:
                        {
                        int LA19_1 = input.LA(2);

                        if ( (synpred31_InternalStoex()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                        {
                        int LA19_2 = input.LA(2);

                        if ( (synpred31_InternalStoex()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 52:
                        {
                        int LA19_3 = input.LA(2);

                        if ( (synpred31_InternalStoex()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 53:
                        {
                        int LA19_4 = input.LA(2);

                        if ( (synpred31_InternalStoex()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 54:
                        {
                        int LA19_5 = input.LA(2);

                        if ( (synpred31_InternalStoex()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 21:
                        {
                        int LA19_6 = input.LA(2);

                        if ( (synpred31_InternalStoex()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // InternalStoex.g:1720:6: this_unitMulti_2= ruleunitMulti
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getUnitPowAccess().getUnitMultiParserRuleCall_0_1_1_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_15);
                            this_unitMulti_2=ruleunitMulti();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_unitMulti_2;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalStoex.g:1732:6: this_unitDiv_3= ruleunitDiv
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getUnitPowAccess().getUnitDivParserRuleCall_0_1_1_1());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_15);
                            this_unitDiv_3=ruleunitDiv();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_unitDiv_3;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getUnitPowAccess().getRightParenthesisKeyword_0_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalStoex.g:1750:3: ( () otherlv_6= '^' ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalStoex.g:1751:4: () otherlv_6= '^' ( (lv_exponent_7_0= ruleSIGNED_INT ) )
            	    {
            	    // InternalStoex.g:1751:4: ()
            	    // InternalStoex.g:1752:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getUnitPowAccess().getUnitPowerUnitAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getUnitPowAccess().getCircumflexAccentKeyword_1_1());
            	      			
            	    }
            	    // InternalStoex.g:1765:4: ( (lv_exponent_7_0= ruleSIGNED_INT ) )
            	    // InternalStoex.g:1766:5: (lv_exponent_7_0= ruleSIGNED_INT )
            	    {
            	    // InternalStoex.g:1766:5: (lv_exponent_7_0= ruleSIGNED_INT )
            	    // InternalStoex.g:1767:6: lv_exponent_7_0= ruleSIGNED_INT
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnitPowAccess().getExponentSIGNED_INTParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_exponent_7_0=ruleSIGNED_INT();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnitPowRule());
            	      						}
            	      						set(
            	      							current,
            	      							"exponent",
            	      							lv_exponent_7_0,
            	      							"org.palladiosimulator.commons.stoex.Stoex.SIGNED_INT");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunitPow"


    // $ANTLR start "entryRuleBaseUnit"
    // InternalStoex.g:1789:1: entryRuleBaseUnit returns [EObject current=null] : iv_ruleBaseUnit= ruleBaseUnit EOF ;
    public final EObject entryRuleBaseUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseUnit = null;


        try {
            // InternalStoex.g:1789:49: (iv_ruleBaseUnit= ruleBaseUnit EOF )
            // InternalStoex.g:1790:2: iv_ruleBaseUnit= ruleBaseUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseUnitRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBaseUnit=ruleBaseUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseUnit; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseUnit"


    // $ANTLR start "ruleBaseUnit"
    // InternalStoex.g:1796:1: ruleBaseUnit returns [EObject current=null] : ( (lv_name_0_0= ruleUnitNames ) ) ;
    public final EObject ruleBaseUnit() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1802:2: ( ( (lv_name_0_0= ruleUnitNames ) ) )
            // InternalStoex.g:1803:2: ( (lv_name_0_0= ruleUnitNames ) )
            {
            // InternalStoex.g:1803:2: ( (lv_name_0_0= ruleUnitNames ) )
            // InternalStoex.g:1804:3: (lv_name_0_0= ruleUnitNames )
            {
            // InternalStoex.g:1804:3: (lv_name_0_0= ruleUnitNames )
            // InternalStoex.g:1805:4: lv_name_0_0= ruleUnitNames
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getBaseUnitAccess().getNameUnitNamesEnumRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_0_0=ruleUnitNames();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getBaseUnitRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.palladiosimulator.commons.stoex.Stoex.UnitNames");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseUnit"


    // $ANTLR start "entryRuledefinition"
    // InternalStoex.g:1825:1: entryRuledefinition returns [EObject current=null] : iv_ruledefinition= ruledefinition EOF ;
    public final EObject entryRuledefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledefinition = null;


        try {
            // InternalStoex.g:1825:51: (iv_ruledefinition= ruledefinition EOF )
            // InternalStoex.g:1826:2: iv_ruledefinition= ruledefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruledefinition=ruledefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledefinition"


    // $ANTLR start "ruledefinition"
    // InternalStoex.g:1832:1: ruledefinition returns [EObject current=null] : (this_ProbabilityMassFunction_0= ruleProbabilityMassFunction | this_ProbabilityDensityFunction_1= ruleProbabilityDensityFunction ) ;
    public final EObject ruledefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ProbabilityMassFunction_0 = null;

        EObject this_ProbabilityDensityFunction_1 = null;



        	enterRule();

        try {
            // InternalStoex.g:1838:2: ( (this_ProbabilityMassFunction_0= ruleProbabilityMassFunction | this_ProbabilityDensityFunction_1= ruleProbabilityDensityFunction ) )
            // InternalStoex.g:1839:2: (this_ProbabilityMassFunction_0= ruleProbabilityMassFunction | this_ProbabilityDensityFunction_1= ruleProbabilityDensityFunction )
            {
            // InternalStoex.g:1839:2: (this_ProbabilityMassFunction_0= ruleProbabilityMassFunction | this_ProbabilityDensityFunction_1= ruleProbabilityDensityFunction )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=33 && LA22_0<=35)||LA22_0==37) ) {
                alt22=1;
            }
            else if ( (LA22_0==32) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalStoex.g:1840:3: this_ProbabilityMassFunction_0= ruleProbabilityMassFunction
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getProbabilityMassFunctionParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ProbabilityMassFunction_0=ruleProbabilityMassFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProbabilityMassFunction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStoex.g:1852:3: this_ProbabilityDensityFunction_1= ruleProbabilityDensityFunction
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getProbabilityDensityFunctionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ProbabilityDensityFunction_1=ruleProbabilityDensityFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProbabilityDensityFunction_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledefinition"


    // $ANTLR start "entryRuleProbabilityDensityFunction"
    // InternalStoex.g:1867:1: entryRuleProbabilityDensityFunction returns [EObject current=null] : iv_ruleProbabilityDensityFunction= ruleProbabilityDensityFunction EOF ;
    public final EObject entryRuleProbabilityDensityFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityDensityFunction = null;


        try {
            // InternalStoex.g:1867:67: (iv_ruleProbabilityDensityFunction= ruleProbabilityDensityFunction EOF )
            // InternalStoex.g:1868:2: iv_ruleProbabilityDensityFunction= ruleProbabilityDensityFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProbabilityDensityFunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProbabilityDensityFunction=ruleProbabilityDensityFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProbabilityDensityFunction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProbabilityDensityFunction"


    // $ANTLR start "ruleProbabilityDensityFunction"
    // InternalStoex.g:1874:1: ruleProbabilityDensityFunction returns [EObject current=null] : this_BoxedPDF_0= ruleBoxedPDF ;
    public final EObject ruleProbabilityDensityFunction() throws RecognitionException {
        EObject current = null;

        EObject this_BoxedPDF_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1880:2: (this_BoxedPDF_0= ruleBoxedPDF )
            // InternalStoex.g:1881:2: this_BoxedPDF_0= ruleBoxedPDF
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getProbabilityDensityFunctionAccess().getBoxedPDFParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_BoxedPDF_0=ruleBoxedPDF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_BoxedPDF_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProbabilityDensityFunction"


    // $ANTLR start "entryRuleBoxedPDF"
    // InternalStoex.g:1895:1: entryRuleBoxedPDF returns [EObject current=null] : iv_ruleBoxedPDF= ruleBoxedPDF EOF ;
    public final EObject entryRuleBoxedPDF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxedPDF = null;


        try {
            // InternalStoex.g:1895:49: (iv_ruleBoxedPDF= ruleBoxedPDF EOF )
            // InternalStoex.g:1896:2: iv_ruleBoxedPDF= ruleBoxedPDF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoxedPDFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoxedPDF=ruleBoxedPDF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoxedPDF; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoxedPDF"


    // $ANTLR start "ruleBoxedPDF"
    // InternalStoex.g:1902:1: ruleBoxedPDF returns [EObject current=null] : (otherlv_0= 'DoublePDF' otherlv_1= '[' ( (lv_samples_2_0= rulereal_pdf_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )? ) ;
    public final EObject ruleBoxedPDF() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_samples_2_0 = null;

        EObject lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1908:2: ( (otherlv_0= 'DoublePDF' otherlv_1= '[' ( (lv_samples_2_0= rulereal_pdf_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )? ) )
            // InternalStoex.g:1909:2: (otherlv_0= 'DoublePDF' otherlv_1= '[' ( (lv_samples_2_0= rulereal_pdf_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )? )
            {
            // InternalStoex.g:1909:2: (otherlv_0= 'DoublePDF' otherlv_1= '[' ( (lv_samples_2_0= rulereal_pdf_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )? )
            // InternalStoex.g:1910:3: otherlv_0= 'DoublePDF' otherlv_1= '[' ( (lv_samples_2_0= rulereal_pdf_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBoxedPDFAccess().getDoublePDFKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBoxedPDFAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalStoex.g:1918:3: ( (lv_samples_2_0= rulereal_pdf_sample ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalStoex.g:1919:4: (lv_samples_2_0= rulereal_pdf_sample )
            	    {
            	    // InternalStoex.g:1919:4: (lv_samples_2_0= rulereal_pdf_sample )
            	    // InternalStoex.g:1920:5: lv_samples_2_0= rulereal_pdf_sample
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBoxedPDFAccess().getSamplesReal_pdf_sampleParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_samples_2_0=rulereal_pdf_sample();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBoxedPDFRule());
            	      					}
            	      					add(
            	      						current,
            	      						"samples",
            	      						lv_samples_2_0,
            	      						"org.palladiosimulator.commons.stoex.Stoex.real_pdf_sample");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBoxedPDFAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalStoex.g:1941:3: (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalStoex.g:1942:4: otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getBoxedPDFAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalStoex.g:1946:4: ( (lv_unit_5_0= ruleUnit ) )
                    // InternalStoex.g:1947:5: (lv_unit_5_0= ruleUnit )
                    {
                    // InternalStoex.g:1947:5: (lv_unit_5_0= ruleUnit )
                    // InternalStoex.g:1948:6: lv_unit_5_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBoxedPDFAccess().getUnitUnitParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_unit_5_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBoxedPDFRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_5_0,
                      							"org.palladiosimulator.commons.stoex.Stoex.Unit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getBoxedPDFAccess().getRightSquareBracketKeyword_4_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoxedPDF"


    // $ANTLR start "entryRuleProbabilityMassFunction"
    // InternalStoex.g:1974:1: entryRuleProbabilityMassFunction returns [EObject current=null] : iv_ruleProbabilityMassFunction= ruleProbabilityMassFunction EOF ;
    public final EObject entryRuleProbabilityMassFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityMassFunction = null;


        try {
            // InternalStoex.g:1974:64: (iv_ruleProbabilityMassFunction= ruleProbabilityMassFunction EOF )
            // InternalStoex.g:1975:2: iv_ruleProbabilityMassFunction= ruleProbabilityMassFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProbabilityMassFunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProbabilityMassFunction=ruleProbabilityMassFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProbabilityMassFunction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProbabilityMassFunction"


    // $ANTLR start "ruleProbabilityMassFunction"
    // InternalStoex.g:1981:1: ruleProbabilityMassFunction returns [EObject current=null] : ( (otherlv_0= 'IntPMF' otherlv_1= '[' ( (lv_samples_2_0= rulenumeric_int_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )? ) | (otherlv_7= 'DoublePMF' otherlv_8= '[' ( (lv_samples_9_0= rulenumeric_real_sample ) )+ otherlv_10= ']' (otherlv_11= '[' ( (lv_unit_12_0= ruleUnit ) ) otherlv_13= ']' )? ) | (otherlv_14= 'EnumPMF' (otherlv_15= '(' ( (lv_orderedDomain_16_0= 'ordered' ) ) otherlv_17= ')' )? otherlv_18= '[' ( (lv_samples_19_0= rulestringsample ) )+ otherlv_20= ']' ) | (otherlv_21= 'BoolPMF' (otherlv_22= '(' ( (lv_orderedDomain_23_0= 'ordered' ) ) otherlv_24= ')' )? otherlv_25= '[' ( (lv_samples_26_0= ruleboolsample ) )+ otherlv_27= ']' ) ) ;
    public final EObject ruleProbabilityMassFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_orderedDomain_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_orderedDomain_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_samples_2_0 = null;

        EObject lv_unit_5_0 = null;

        EObject lv_samples_9_0 = null;

        EObject lv_unit_12_0 = null;

        EObject lv_samples_19_0 = null;

        EObject lv_samples_26_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:1987:2: ( ( (otherlv_0= 'IntPMF' otherlv_1= '[' ( (lv_samples_2_0= rulenumeric_int_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )? ) | (otherlv_7= 'DoublePMF' otherlv_8= '[' ( (lv_samples_9_0= rulenumeric_real_sample ) )+ otherlv_10= ']' (otherlv_11= '[' ( (lv_unit_12_0= ruleUnit ) ) otherlv_13= ']' )? ) | (otherlv_14= 'EnumPMF' (otherlv_15= '(' ( (lv_orderedDomain_16_0= 'ordered' ) ) otherlv_17= ')' )? otherlv_18= '[' ( (lv_samples_19_0= rulestringsample ) )+ otherlv_20= ']' ) | (otherlv_21= 'BoolPMF' (otherlv_22= '(' ( (lv_orderedDomain_23_0= 'ordered' ) ) otherlv_24= ')' )? otherlv_25= '[' ( (lv_samples_26_0= ruleboolsample ) )+ otherlv_27= ']' ) ) )
            // InternalStoex.g:1988:2: ( (otherlv_0= 'IntPMF' otherlv_1= '[' ( (lv_samples_2_0= rulenumeric_int_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )? ) | (otherlv_7= 'DoublePMF' otherlv_8= '[' ( (lv_samples_9_0= rulenumeric_real_sample ) )+ otherlv_10= ']' (otherlv_11= '[' ( (lv_unit_12_0= ruleUnit ) ) otherlv_13= ']' )? ) | (otherlv_14= 'EnumPMF' (otherlv_15= '(' ( (lv_orderedDomain_16_0= 'ordered' ) ) otherlv_17= ')' )? otherlv_18= '[' ( (lv_samples_19_0= rulestringsample ) )+ otherlv_20= ']' ) | (otherlv_21= 'BoolPMF' (otherlv_22= '(' ( (lv_orderedDomain_23_0= 'ordered' ) ) otherlv_24= ')' )? otherlv_25= '[' ( (lv_samples_26_0= ruleboolsample ) )+ otherlv_27= ']' ) )
            {
            // InternalStoex.g:1988:2: ( (otherlv_0= 'IntPMF' otherlv_1= '[' ( (lv_samples_2_0= rulenumeric_int_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )? ) | (otherlv_7= 'DoublePMF' otherlv_8= '[' ( (lv_samples_9_0= rulenumeric_real_sample ) )+ otherlv_10= ']' (otherlv_11= '[' ( (lv_unit_12_0= ruleUnit ) ) otherlv_13= ']' )? ) | (otherlv_14= 'EnumPMF' (otherlv_15= '(' ( (lv_orderedDomain_16_0= 'ordered' ) ) otherlv_17= ')' )? otherlv_18= '[' ( (lv_samples_19_0= rulestringsample ) )+ otherlv_20= ']' ) | (otherlv_21= 'BoolPMF' (otherlv_22= '(' ( (lv_orderedDomain_23_0= 'ordered' ) ) otherlv_24= ')' )? otherlv_25= '[' ( (lv_samples_26_0= ruleboolsample ) )+ otherlv_27= ']' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt33=1;
                }
                break;
            case 34:
                {
                alt33=2;
                }
                break;
            case 35:
                {
                alt33=3;
                }
                break;
            case 37:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalStoex.g:1989:3: (otherlv_0= 'IntPMF' otherlv_1= '[' ( (lv_samples_2_0= rulenumeric_int_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )? )
                    {
                    // InternalStoex.g:1989:3: (otherlv_0= 'IntPMF' otherlv_1= '[' ( (lv_samples_2_0= rulenumeric_int_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )? )
                    // InternalStoex.g:1990:4: otherlv_0= 'IntPMF' otherlv_1= '[' ( (lv_samples_2_0= rulenumeric_int_sample ) )+ otherlv_3= ']' (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )?
                    {
                    otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getProbabilityMassFunctionAccess().getIntPMFKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_0_1());
                      			
                    }
                    // InternalStoex.g:1998:4: ( (lv_samples_2_0= rulenumeric_int_sample ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalStoex.g:1999:5: (lv_samples_2_0= rulenumeric_int_sample )
                    	    {
                    	    // InternalStoex.g:1999:5: (lv_samples_2_0= rulenumeric_int_sample )
                    	    // InternalStoex.g:2000:6: lv_samples_2_0= rulenumeric_int_sample
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getSamplesNumeric_int_sampleParserRuleCall_0_2_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_samples_2_0=rulenumeric_int_sample();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"samples",
                    	      							lv_samples_2_0,
                    	      							"org.palladiosimulator.commons.stoex.Stoex.numeric_int_sample");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);

                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_0_3());
                      			
                    }
                    // InternalStoex.g:2021:4: (otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==19) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalStoex.g:2022:5: otherlv_4= '[' ( (lv_unit_5_0= ruleUnit ) ) otherlv_6= ']'
                            {
                            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_0_4_0());
                              				
                            }
                            // InternalStoex.g:2026:5: ( (lv_unit_5_0= ruleUnit ) )
                            // InternalStoex.g:2027:6: (lv_unit_5_0= ruleUnit )
                            {
                            // InternalStoex.g:2027:6: (lv_unit_5_0= ruleUnit )
                            // InternalStoex.g:2028:7: lv_unit_5_0= ruleUnit
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getUnitUnitParserRuleCall_0_4_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_14);
                            lv_unit_5_0=ruleUnit();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                              							}
                              							set(
                              								current,
                              								"unit",
                              								lv_unit_5_0,
                              								"org.palladiosimulator.commons.stoex.Stoex.Unit");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_0_4_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:2052:3: (otherlv_7= 'DoublePMF' otherlv_8= '[' ( (lv_samples_9_0= rulenumeric_real_sample ) )+ otherlv_10= ']' (otherlv_11= '[' ( (lv_unit_12_0= ruleUnit ) ) otherlv_13= ']' )? )
                    {
                    // InternalStoex.g:2052:3: (otherlv_7= 'DoublePMF' otherlv_8= '[' ( (lv_samples_9_0= rulenumeric_real_sample ) )+ otherlv_10= ']' (otherlv_11= '[' ( (lv_unit_12_0= ruleUnit ) ) otherlv_13= ']' )? )
                    // InternalStoex.g:2053:4: otherlv_7= 'DoublePMF' otherlv_8= '[' ( (lv_samples_9_0= rulenumeric_real_sample ) )+ otherlv_10= ']' (otherlv_11= '[' ( (lv_unit_12_0= ruleUnit ) ) otherlv_13= ']' )?
                    {
                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getProbabilityMassFunctionAccess().getDoublePMFKeyword_1_0());
                      			
                    }
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_1_1());
                      			
                    }
                    // InternalStoex.g:2061:4: ( (lv_samples_9_0= rulenumeric_real_sample ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==21) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalStoex.g:2062:5: (lv_samples_9_0= rulenumeric_real_sample )
                    	    {
                    	    // InternalStoex.g:2062:5: (lv_samples_9_0= rulenumeric_real_sample )
                    	    // InternalStoex.g:2063:6: lv_samples_9_0= rulenumeric_real_sample
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getSamplesNumeric_real_sampleParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_samples_9_0=rulenumeric_real_sample();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"samples",
                    	      							lv_samples_9_0,
                    	      							"org.palladiosimulator.commons.stoex.Stoex.numeric_real_sample");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }
                    // InternalStoex.g:2084:4: (otherlv_11= '[' ( (lv_unit_12_0= ruleUnit ) ) otherlv_13= ']' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==19) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalStoex.g:2085:5: otherlv_11= '[' ( (lv_unit_12_0= ruleUnit ) ) otherlv_13= ']'
                            {
                            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_11, grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_1_4_0());
                              				
                            }
                            // InternalStoex.g:2089:5: ( (lv_unit_12_0= ruleUnit ) )
                            // InternalStoex.g:2090:6: (lv_unit_12_0= ruleUnit )
                            {
                            // InternalStoex.g:2090:6: (lv_unit_12_0= ruleUnit )
                            // InternalStoex.g:2091:7: lv_unit_12_0= ruleUnit
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getUnitUnitParserRuleCall_1_4_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_14);
                            lv_unit_12_0=ruleUnit();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                              							}
                              							set(
                              								current,
                              								"unit",
                              								lv_unit_12_0,
                              								"org.palladiosimulator.commons.stoex.Stoex.Unit");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_1_4_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:2115:3: (otherlv_14= 'EnumPMF' (otherlv_15= '(' ( (lv_orderedDomain_16_0= 'ordered' ) ) otherlv_17= ')' )? otherlv_18= '[' ( (lv_samples_19_0= rulestringsample ) )+ otherlv_20= ']' )
                    {
                    // InternalStoex.g:2115:3: (otherlv_14= 'EnumPMF' (otherlv_15= '(' ( (lv_orderedDomain_16_0= 'ordered' ) ) otherlv_17= ')' )? otherlv_18= '[' ( (lv_samples_19_0= rulestringsample ) )+ otherlv_20= ']' )
                    // InternalStoex.g:2116:4: otherlv_14= 'EnumPMF' (otherlv_15= '(' ( (lv_orderedDomain_16_0= 'ordered' ) ) otherlv_17= ')' )? otherlv_18= '[' ( (lv_samples_19_0= rulestringsample ) )+ otherlv_20= ']'
                    {
                    otherlv_14=(Token)match(input,35,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getProbabilityMassFunctionAccess().getEnumPMFKeyword_2_0());
                      			
                    }
                    // InternalStoex.g:2120:4: (otherlv_15= '(' ( (lv_orderedDomain_16_0= 'ordered' ) ) otherlv_17= ')' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==21) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalStoex.g:2121:5: otherlv_15= '(' ( (lv_orderedDomain_16_0= 'ordered' ) ) otherlv_17= ')'
                            {
                            otherlv_15=(Token)match(input,21,FollowSets000.FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getProbabilityMassFunctionAccess().getLeftParenthesisKeyword_2_1_0());
                              				
                            }
                            // InternalStoex.g:2125:5: ( (lv_orderedDomain_16_0= 'ordered' ) )
                            // InternalStoex.g:2126:6: (lv_orderedDomain_16_0= 'ordered' )
                            {
                            // InternalStoex.g:2126:6: (lv_orderedDomain_16_0= 'ordered' )
                            // InternalStoex.g:2127:7: lv_orderedDomain_16_0= 'ordered'
                            {
                            lv_orderedDomain_16_0=(Token)match(input,36,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_orderedDomain_16_0, grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainOrderedKeyword_2_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getProbabilityMassFunctionRule());
                              							}
                              							setWithLastConsumed(current, "orderedDomain", true, "ordered");
                              						
                            }

                            }


                            }

                            otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_17, grammarAccess.getProbabilityMassFunctionAccess().getRightParenthesisKeyword_2_1_2());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_2_2());
                      			
                    }
                    // InternalStoex.g:2148:4: ( (lv_samples_19_0= rulestringsample ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==21) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalStoex.g:2149:5: (lv_samples_19_0= rulestringsample )
                    	    {
                    	    // InternalStoex.g:2149:5: (lv_samples_19_0= rulestringsample )
                    	    // InternalStoex.g:2150:6: lv_samples_19_0= rulestringsample
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getSamplesStringsampleParserRuleCall_2_3_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_samples_19_0=rulestringsample();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"samples",
                    	      							lv_samples_19_0,
                    	      							"org.palladiosimulator.commons.stoex.Stoex.stringsample");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStoex.g:2173:3: (otherlv_21= 'BoolPMF' (otherlv_22= '(' ( (lv_orderedDomain_23_0= 'ordered' ) ) otherlv_24= ')' )? otherlv_25= '[' ( (lv_samples_26_0= ruleboolsample ) )+ otherlv_27= ']' )
                    {
                    // InternalStoex.g:2173:3: (otherlv_21= 'BoolPMF' (otherlv_22= '(' ( (lv_orderedDomain_23_0= 'ordered' ) ) otherlv_24= ')' )? otherlv_25= '[' ( (lv_samples_26_0= ruleboolsample ) )+ otherlv_27= ']' )
                    // InternalStoex.g:2174:4: otherlv_21= 'BoolPMF' (otherlv_22= '(' ( (lv_orderedDomain_23_0= 'ordered' ) ) otherlv_24= ')' )? otherlv_25= '[' ( (lv_samples_26_0= ruleboolsample ) )+ otherlv_27= ']'
                    {
                    otherlv_21=(Token)match(input,37,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getProbabilityMassFunctionAccess().getBoolPMFKeyword_3_0());
                      			
                    }
                    // InternalStoex.g:2178:4: (otherlv_22= '(' ( (lv_orderedDomain_23_0= 'ordered' ) ) otherlv_24= ')' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==21) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalStoex.g:2179:5: otherlv_22= '(' ( (lv_orderedDomain_23_0= 'ordered' ) ) otherlv_24= ')'
                            {
                            otherlv_22=(Token)match(input,21,FollowSets000.FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_22, grammarAccess.getProbabilityMassFunctionAccess().getLeftParenthesisKeyword_3_1_0());
                              				
                            }
                            // InternalStoex.g:2183:5: ( (lv_orderedDomain_23_0= 'ordered' ) )
                            // InternalStoex.g:2184:6: (lv_orderedDomain_23_0= 'ordered' )
                            {
                            // InternalStoex.g:2184:6: (lv_orderedDomain_23_0= 'ordered' )
                            // InternalStoex.g:2185:7: lv_orderedDomain_23_0= 'ordered'
                            {
                            lv_orderedDomain_23_0=(Token)match(input,36,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_orderedDomain_23_0, grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainOrderedKeyword_3_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getProbabilityMassFunctionRule());
                              							}
                              							setWithLastConsumed(current, "orderedDomain", true, "ordered");
                              						
                            }

                            }


                            }

                            otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_24, grammarAccess.getProbabilityMassFunctionAccess().getRightParenthesisKeyword_3_1_2());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_25=(Token)match(input,19,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_3_2());
                      			
                    }
                    // InternalStoex.g:2206:4: ( (lv_samples_26_0= ruleboolsample ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==21) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalStoex.g:2207:5: (lv_samples_26_0= ruleboolsample )
                    	    {
                    	    // InternalStoex.g:2207:5: (lv_samples_26_0= ruleboolsample )
                    	    // InternalStoex.g:2208:6: lv_samples_26_0= ruleboolsample
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getSamplesBoolsampleParserRuleCall_3_3_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_samples_26_0=ruleboolsample();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"samples",
                    	      							lv_samples_26_0,
                    	      							"org.palladiosimulator.commons.stoex.Stoex.boolsample");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProbabilityMassFunction"


    // $ANTLR start "entryRulenumeric_int_sample"
    // InternalStoex.g:2234:1: entryRulenumeric_int_sample returns [EObject current=null] : iv_rulenumeric_int_sample= rulenumeric_int_sample EOF ;
    public final EObject entryRulenumeric_int_sample() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumeric_int_sample = null;


        try {
            // InternalStoex.g:2234:59: (iv_rulenumeric_int_sample= rulenumeric_int_sample EOF )
            // InternalStoex.g:2235:2: iv_rulenumeric_int_sample= rulenumeric_int_sample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_int_sampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulenumeric_int_sample=rulenumeric_int_sample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumeric_int_sample; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumeric_int_sample"


    // $ANTLR start "rulenumeric_int_sample"
    // InternalStoex.g:2241:1: rulenumeric_int_sample returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_INT ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' ) ;
    public final EObject rulenumeric_int_sample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_probability_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:2247:2: ( (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_INT ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' ) )
            // InternalStoex.g:2248:2: (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_INT ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' )
            {
            // InternalStoex.g:2248:2: (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_INT ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' )
            // InternalStoex.g:2249:3: otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_INT ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNumeric_int_sampleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalStoex.g:2253:3: ( (lv_value_1_0= ruleSIGNED_INT ) )
            // InternalStoex.g:2254:4: (lv_value_1_0= ruleSIGNED_INT )
            {
            // InternalStoex.g:2254:4: (lv_value_1_0= ruleSIGNED_INT )
            // InternalStoex.g:2255:5: lv_value_1_0= ruleSIGNED_INT
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumeric_int_sampleAccess().getValueSIGNED_INTParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_value_1_0=ruleSIGNED_INT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNumeric_int_sampleRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.palladiosimulator.commons.stoex.Stoex.SIGNED_INT");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNumeric_int_sampleAccess().getSemicolonKeyword_2());
              		
            }
            // InternalStoex.g:2276:3: ( (lv_probability_3_0= RULE_DOUBLE ) )
            // InternalStoex.g:2277:4: (lv_probability_3_0= RULE_DOUBLE )
            {
            // InternalStoex.g:2277:4: (lv_probability_3_0= RULE_DOUBLE )
            // InternalStoex.g:2278:5: lv_probability_3_0= RULE_DOUBLE
            {
            lv_probability_3_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_probability_3_0, grammarAccess.getNumeric_int_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNumeric_int_sampleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"probability",
              						lv_probability_3_0,
              						"org.palladiosimulator.commons.stoex.Stoex.DOUBLE");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getNumeric_int_sampleAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumeric_int_sample"


    // $ANTLR start "entryRulenumeric_real_sample"
    // InternalStoex.g:2302:1: entryRulenumeric_real_sample returns [EObject current=null] : iv_rulenumeric_real_sample= rulenumeric_real_sample EOF ;
    public final EObject entryRulenumeric_real_sample() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumeric_real_sample = null;


        try {
            // InternalStoex.g:2302:60: (iv_rulenumeric_real_sample= rulenumeric_real_sample EOF )
            // InternalStoex.g:2303:2: iv_rulenumeric_real_sample= rulenumeric_real_sample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_real_sampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulenumeric_real_sample=rulenumeric_real_sample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumeric_real_sample; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumeric_real_sample"


    // $ANTLR start "rulenumeric_real_sample"
    // InternalStoex.g:2309:1: rulenumeric_real_sample returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' ) ;
    public final EObject rulenumeric_real_sample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_probability_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:2315:2: ( (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' ) )
            // InternalStoex.g:2316:2: (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' )
            {
            // InternalStoex.g:2316:2: (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' )
            // InternalStoex.g:2317:3: otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNumeric_real_sampleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalStoex.g:2321:3: ( (lv_value_1_0= ruleSIGNED_NUMBER ) )
            // InternalStoex.g:2322:4: (lv_value_1_0= ruleSIGNED_NUMBER )
            {
            // InternalStoex.g:2322:4: (lv_value_1_0= ruleSIGNED_NUMBER )
            // InternalStoex.g:2323:5: lv_value_1_0= ruleSIGNED_NUMBER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumeric_real_sampleAccess().getValueSIGNED_NUMBERParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_value_1_0=ruleSIGNED_NUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNumeric_real_sampleRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.palladiosimulator.commons.stoex.Stoex.SIGNED_NUMBER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNumeric_real_sampleAccess().getSemicolonKeyword_2());
              		
            }
            // InternalStoex.g:2344:3: ( (lv_probability_3_0= RULE_DOUBLE ) )
            // InternalStoex.g:2345:4: (lv_probability_3_0= RULE_DOUBLE )
            {
            // InternalStoex.g:2345:4: (lv_probability_3_0= RULE_DOUBLE )
            // InternalStoex.g:2346:5: lv_probability_3_0= RULE_DOUBLE
            {
            lv_probability_3_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_probability_3_0, grammarAccess.getNumeric_real_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNumeric_real_sampleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"probability",
              						lv_probability_3_0,
              						"org.palladiosimulator.commons.stoex.Stoex.DOUBLE");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getNumeric_real_sampleAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumeric_real_sample"


    // $ANTLR start "entryRulereal_pdf_sample"
    // InternalStoex.g:2370:1: entryRulereal_pdf_sample returns [EObject current=null] : iv_rulereal_pdf_sample= rulereal_pdf_sample EOF ;
    public final EObject entryRulereal_pdf_sample() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereal_pdf_sample = null;


        try {
            // InternalStoex.g:2370:56: (iv_rulereal_pdf_sample= rulereal_pdf_sample EOF )
            // InternalStoex.g:2371:2: iv_rulereal_pdf_sample= rulereal_pdf_sample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReal_pdf_sampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulereal_pdf_sample=rulereal_pdf_sample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulereal_pdf_sample; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulereal_pdf_sample"


    // $ANTLR start "rulereal_pdf_sample"
    // InternalStoex.g:2377:1: rulereal_pdf_sample returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' ) ;
    public final EObject rulereal_pdf_sample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_probability_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalStoex.g:2383:2: ( (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' ) )
            // InternalStoex.g:2384:2: (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' )
            {
            // InternalStoex.g:2384:2: (otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' )
            // InternalStoex.g:2385:3: otherlv_0= '(' ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReal_pdf_sampleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalStoex.g:2389:3: ( (lv_value_1_0= ruleSIGNED_NUMBER ) )
            // InternalStoex.g:2390:4: (lv_value_1_0= ruleSIGNED_NUMBER )
            {
            // InternalStoex.g:2390:4: (lv_value_1_0= ruleSIGNED_NUMBER )
            // InternalStoex.g:2391:5: lv_value_1_0= ruleSIGNED_NUMBER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReal_pdf_sampleAccess().getValueSIGNED_NUMBERParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_value_1_0=ruleSIGNED_NUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReal_pdf_sampleRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.palladiosimulator.commons.stoex.Stoex.SIGNED_NUMBER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReal_pdf_sampleAccess().getSemicolonKeyword_2());
              		
            }
            // InternalStoex.g:2412:3: ( (lv_probability_3_0= RULE_DOUBLE ) )
            // InternalStoex.g:2413:4: (lv_probability_3_0= RULE_DOUBLE )
            {
            // InternalStoex.g:2413:4: (lv_probability_3_0= RULE_DOUBLE )
            // InternalStoex.g:2414:5: lv_probability_3_0= RULE_DOUBLE
            {
            lv_probability_3_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_probability_3_0, grammarAccess.getReal_pdf_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReal_pdf_sampleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"probability",
              						lv_probability_3_0,
              						"org.palladiosimulator.commons.stoex.Stoex.DOUBLE");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getReal_pdf_sampleAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulereal_pdf_sample"


    // $ANTLR start "entryRulestringsample"
    // InternalStoex.g:2438:1: entryRulestringsample returns [EObject current=null] : iv_rulestringsample= rulestringsample EOF ;
    public final EObject entryRulestringsample() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringsample = null;


        try {
            // InternalStoex.g:2438:53: (iv_rulestringsample= rulestringsample EOF )
            // InternalStoex.g:2439:2: iv_rulestringsample= rulestringsample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringsampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulestringsample=rulestringsample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestringsample; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestringsample"


    // $ANTLR start "rulestringsample"
    // InternalStoex.g:2445:1: rulestringsample returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' ) ;
    public final EObject rulestringsample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_probability_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStoex.g:2451:2: ( (otherlv_0= '(' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' ) )
            // InternalStoex.g:2452:2: (otherlv_0= '(' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' )
            {
            // InternalStoex.g:2452:2: (otherlv_0= '(' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' )
            // InternalStoex.g:2453:3: otherlv_0= '(' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStringsampleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalStoex.g:2457:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalStoex.g:2458:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalStoex.g:2458:4: (lv_value_1_0= RULE_STRING )
            // InternalStoex.g:2459:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getStringsampleAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringsampleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.palladiosimulator.commons.stoex.Stoex.STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStringsampleAccess().getSemicolonKeyword_2());
              		
            }
            // InternalStoex.g:2479:3: ( (lv_probability_3_0= RULE_DOUBLE ) )
            // InternalStoex.g:2480:4: (lv_probability_3_0= RULE_DOUBLE )
            {
            // InternalStoex.g:2480:4: (lv_probability_3_0= RULE_DOUBLE )
            // InternalStoex.g:2481:5: lv_probability_3_0= RULE_DOUBLE
            {
            lv_probability_3_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_probability_3_0, grammarAccess.getStringsampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringsampleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"probability",
              						lv_probability_3_0,
              						"org.palladiosimulator.commons.stoex.Stoex.DOUBLE");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getStringsampleAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestringsample"


    // $ANTLR start "entryRuleboolsample"
    // InternalStoex.g:2505:1: entryRuleboolsample returns [EObject current=null] : iv_ruleboolsample= ruleboolsample EOF ;
    public final EObject entryRuleboolsample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolsample = null;


        try {
            // InternalStoex.g:2505:51: (iv_ruleboolsample= ruleboolsample EOF )
            // InternalStoex.g:2506:2: iv_ruleboolsample= ruleboolsample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolsampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleboolsample=ruleboolsample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolsample; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleboolsample"


    // $ANTLR start "ruleboolsample"
    // InternalStoex.g:2512:1: ruleboolsample returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' ) ;
    public final EObject ruleboolsample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_probability_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStoex.g:2518:2: ( (otherlv_0= '(' ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' ) )
            // InternalStoex.g:2519:2: (otherlv_0= '(' ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' )
            {
            // InternalStoex.g:2519:2: (otherlv_0= '(' ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')' )
            // InternalStoex.g:2520:3: otherlv_0= '(' ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) ) otherlv_2= ';' ( (lv_probability_3_0= RULE_DOUBLE ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBoolsampleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalStoex.g:2524:3: ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) )
            // InternalStoex.g:2525:4: (lv_value_1_0= RULE_BOOLEAN_KEYWORDS )
            {
            // InternalStoex.g:2525:4: (lv_value_1_0= RULE_BOOLEAN_KEYWORDS )
            // InternalStoex.g:2526:5: lv_value_1_0= RULE_BOOLEAN_KEYWORDS
            {
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN_KEYWORDS,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getBoolsampleAccess().getValueBOOLEAN_KEYWORDSTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBoolsampleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.palladiosimulator.commons.stoex.Stoex.BOOLEAN_KEYWORDS");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBoolsampleAccess().getSemicolonKeyword_2());
              		
            }
            // InternalStoex.g:2546:3: ( (lv_probability_3_0= RULE_DOUBLE ) )
            // InternalStoex.g:2547:4: (lv_probability_3_0= RULE_DOUBLE )
            {
            // InternalStoex.g:2547:4: (lv_probability_3_0= RULE_DOUBLE )
            // InternalStoex.g:2548:5: lv_probability_3_0= RULE_DOUBLE
            {
            lv_probability_3_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_probability_3_0, grammarAccess.getBoolsampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBoolsampleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"probability",
              						lv_probability_3_0,
              						"org.palladiosimulator.commons.stoex.Stoex.DOUBLE");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBoolsampleAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolsample"


    // $ANTLR start "entryRuleSIGNED_NUMBER"
    // InternalStoex.g:2572:1: entryRuleSIGNED_NUMBER returns [String current=null] : iv_ruleSIGNED_NUMBER= ruleSIGNED_NUMBER EOF ;
    public final String entryRuleSIGNED_NUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_NUMBER = null;


        try {
            // InternalStoex.g:2572:53: (iv_ruleSIGNED_NUMBER= ruleSIGNED_NUMBER EOF )
            // InternalStoex.g:2573:2: iv_ruleSIGNED_NUMBER= ruleSIGNED_NUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSIGNED_NUMBERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSIGNED_NUMBER=ruleSIGNED_NUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSIGNED_NUMBER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSIGNED_NUMBER"


    // $ANTLR start "ruleSIGNED_NUMBER"
    // InternalStoex.g:2579:1: ruleSIGNED_NUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_NUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalStoex.g:2585:2: ( ( (kw= '-' )? this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalStoex.g:2586:2: ( (kw= '-' )? this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalStoex.g:2586:2: ( (kw= '-' )? this_DOUBLE_1= RULE_DOUBLE )
            // InternalStoex.g:2587:3: (kw= '-' )? this_DOUBLE_1= RULE_DOUBLE
            {
            // InternalStoex.g:2587:3: (kw= '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalStoex.g:2588:4: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSIGNED_NUMBERAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DOUBLE_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_1, grammarAccess.getSIGNED_NUMBERAccess().getDOUBLETerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNED_NUMBER"


    // $ANTLR start "entryRuleSIGNED_INT"
    // InternalStoex.g:2605:1: entryRuleSIGNED_INT returns [String current=null] : iv_ruleSIGNED_INT= ruleSIGNED_INT EOF ;
    public final String entryRuleSIGNED_INT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_INT = null;


        try {
            // InternalStoex.g:2605:50: (iv_ruleSIGNED_INT= ruleSIGNED_INT EOF )
            // InternalStoex.g:2606:2: iv_ruleSIGNED_INT= ruleSIGNED_INT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSIGNED_INTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSIGNED_INT=ruleSIGNED_INT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSIGNED_INT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSIGNED_INT"


    // $ANTLR start "ruleSIGNED_INT"
    // InternalStoex.g:2612:1: ruleSIGNED_INT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_DECINT_1= RULE_DECINT ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_INT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DECINT_1=null;


        	enterRule();

        try {
            // InternalStoex.g:2618:2: ( ( (kw= '-' )? this_DECINT_1= RULE_DECINT ) )
            // InternalStoex.g:2619:2: ( (kw= '-' )? this_DECINT_1= RULE_DECINT )
            {
            // InternalStoex.g:2619:2: ( (kw= '-' )? this_DECINT_1= RULE_DECINT )
            // InternalStoex.g:2620:3: (kw= '-' )? this_DECINT_1= RULE_DECINT
            {
            // InternalStoex.g:2620:3: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalStoex.g:2621:4: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSIGNED_INTAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_DECINT_1=(Token)match(input,RULE_DECINT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DECINT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DECINT_1, grammarAccess.getSIGNED_INTAccess().getDECINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNED_INT"


    // $ANTLR start "ruleBooleanOperations"
    // InternalStoex.g:2638:1: ruleBooleanOperations returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) ) ;
    public final Enumerator ruleBooleanOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalStoex.g:2644:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) ) )
            // InternalStoex.g:2645:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) )
            {
            // InternalStoex.g:2645:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt36=1;
                }
                break;
            case 40:
                {
                alt36=2;
                }
                break;
            case 41:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalStoex.g:2646:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalStoex.g:2646:3: (enumLiteral_0= 'AND' )
                    // InternalStoex.g:2647:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanOperationsAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBooleanOperationsAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:2654:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalStoex.g:2654:3: (enumLiteral_1= 'OR' )
                    // InternalStoex.g:2655:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanOperationsAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBooleanOperationsAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:2662:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalStoex.g:2662:3: (enumLiteral_2= 'XOR' )
                    // InternalStoex.g:2663:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanOperationsAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBooleanOperationsAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanOperations"


    // $ANTLR start "ruleandoperation"
    // InternalStoex.g:2673:1: ruleandoperation returns [Enumerator current=null] : (enumLiteral_0= 'AND' ) ;
    public final Enumerator ruleandoperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalStoex.g:2679:2: ( (enumLiteral_0= 'AND' ) )
            // InternalStoex.g:2680:2: (enumLiteral_0= 'AND' )
            {
            // InternalStoex.g:2680:2: (enumLiteral_0= 'AND' )
            // InternalStoex.g:2681:3: enumLiteral_0= 'AND'
            {
            enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getAndoperationAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getAndoperationAccess().getANDEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleandoperation"


    // $ANTLR start "ruleoroperations"
    // InternalStoex.g:2690:1: ruleoroperations returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'XOR' ) ) ;
    public final Enumerator ruleoroperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalStoex.g:2696:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'XOR' ) ) )
            // InternalStoex.g:2697:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'XOR' ) )
            {
            // InternalStoex.g:2697:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'XOR' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            else if ( (LA37_0==41) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalStoex.g:2698:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalStoex.g:2698:3: (enumLiteral_0= 'OR' )
                    // InternalStoex.g:2699:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOroperationsAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOroperationsAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:2706:3: (enumLiteral_1= 'XOR' )
                    {
                    // InternalStoex.g:2706:3: (enumLiteral_1= 'XOR' )
                    // InternalStoex.g:2707:4: enumLiteral_1= 'XOR'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOroperationsAccess().getXOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOroperationsAccess().getXOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoroperations"


    // $ANTLR start "ruleCompareOperations"
    // InternalStoex.g:2717:1: ruleCompareOperations returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) ;
    public final Enumerator ruleCompareOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalStoex.g:2723:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) )
            // InternalStoex.g:2724:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            {
            // InternalStoex.g:2724:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt38=1;
                }
                break;
            case 43:
                {
                alt38=2;
                }
                break;
            case 44:
                {
                alt38=3;
                }
                break;
            case 45:
                {
                alt38=4;
                }
                break;
            case 46:
                {
                alt38=5;
                }
                break;
            case 47:
                {
                alt38=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalStoex.g:2725:3: (enumLiteral_0= '>' )
                    {
                    // InternalStoex.g:2725:3: (enumLiteral_0= '>' )
                    // InternalStoex.g:2726:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperationsAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperationsAccess().getGREATEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:2733:3: (enumLiteral_1= '<' )
                    {
                    // InternalStoex.g:2733:3: (enumLiteral_1= '<' )
                    // InternalStoex.g:2734:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperationsAccess().getLESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperationsAccess().getLESSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:2741:3: (enumLiteral_2= '==' )
                    {
                    // InternalStoex.g:2741:3: (enumLiteral_2= '==' )
                    // InternalStoex.g:2742:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperationsAccess().getEQUALSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperationsAccess().getEQUALSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStoex.g:2749:3: (enumLiteral_3= '<>' )
                    {
                    // InternalStoex.g:2749:3: (enumLiteral_3= '<>' )
                    // InternalStoex.g:2750:4: enumLiteral_3= '<>'
                    {
                    enumLiteral_3=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperationsAccess().getNOTEQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperationsAccess().getNOTEQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStoex.g:2757:3: (enumLiteral_4= '>=' )
                    {
                    // InternalStoex.g:2757:3: (enumLiteral_4= '>=' )
                    // InternalStoex.g:2758:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperationsAccess().getGREATEREQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperationsAccess().getGREATEREQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalStoex.g:2765:3: (enumLiteral_5= '<=' )
                    {
                    // InternalStoex.g:2765:3: (enumLiteral_5= '<=' )
                    // InternalStoex.g:2766:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperationsAccess().getLESSEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getCompareOperationsAccess().getLESSEQUALEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperations"


    // $ANTLR start "ruleTermOperations"
    // InternalStoex.g:2776:1: ruleTermOperations returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleTermOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalStoex.g:2782:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalStoex.g:2783:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalStoex.g:2783:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            else if ( (LA39_0==18) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalStoex.g:2784:3: (enumLiteral_0= '+' )
                    {
                    // InternalStoex.g:2784:3: (enumLiteral_0= '+' )
                    // InternalStoex.g:2785:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTermOperationsAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTermOperationsAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:2792:3: (enumLiteral_1= '-' )
                    {
                    // InternalStoex.g:2792:3: (enumLiteral_1= '-' )
                    // InternalStoex.g:2793:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTermOperationsAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTermOperationsAccess().getSUBEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermOperations"


    // $ANTLR start "ruleProductOperations"
    // InternalStoex.g:2803:1: ruleProductOperations returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleProductOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalStoex.g:2809:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalStoex.g:2810:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalStoex.g:2810:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt40=1;
                }
                break;
            case 30:
                {
                alt40=2;
                }
                break;
            case 49:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalStoex.g:2811:3: (enumLiteral_0= '*' )
                    {
                    // InternalStoex.g:2811:3: (enumLiteral_0= '*' )
                    // InternalStoex.g:2812:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProductOperationsAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getProductOperationsAccess().getMULTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:2819:3: (enumLiteral_1= '/' )
                    {
                    // InternalStoex.g:2819:3: (enumLiteral_1= '/' )
                    // InternalStoex.g:2820:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProductOperationsAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getProductOperationsAccess().getDIVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:2827:3: (enumLiteral_2= '%' )
                    {
                    // InternalStoex.g:2827:3: (enumLiteral_2= '%' )
                    // InternalStoex.g:2828:4: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProductOperationsAccess().getMODEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getProductOperationsAccess().getMODEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductOperations"


    // $ANTLR start "ruleUnitNames"
    // InternalStoex.g:2838:1: ruleUnitNames returns [Enumerator current=null] : ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'unitless' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 's' ) | (enumLiteral_4= 'm' ) ) ;
    public final Enumerator ruleUnitNames() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalStoex.g:2844:2: ( ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'unitless' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 's' ) | (enumLiteral_4= 'm' ) ) )
            // InternalStoex.g:2845:2: ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'unitless' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 's' ) | (enumLiteral_4= 'm' ) )
            {
            // InternalStoex.g:2845:2: ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'unitless' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 's' ) | (enumLiteral_4= 'm' ) )
            int alt41=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt41=1;
                }
                break;
            case 51:
                {
                alt41=2;
                }
                break;
            case 52:
                {
                alt41=3;
                }
                break;
            case 53:
                {
                alt41=4;
                }
                break;
            case 54:
                {
                alt41=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalStoex.g:2846:3: (enumLiteral_0= '_' )
                    {
                    // InternalStoex.g:2846:3: (enumLiteral_0= '_' )
                    // InternalStoex.g:2847:4: enumLiteral_0= '_'
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:2854:3: (enumLiteral_1= 'unitless' )
                    {
                    // InternalStoex.g:2854:3: (enumLiteral_1= 'unitless' )
                    // InternalStoex.g:2855:4: enumLiteral_1= 'unitless'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:2862:3: (enumLiteral_2= 'B' )
                    {
                    // InternalStoex.g:2862:3: (enumLiteral_2= 'B' )
                    // InternalStoex.g:2863:4: enumLiteral_2= 'B'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnitNamesAccess().getBYTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getUnitNamesAccess().getBYTEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStoex.g:2870:3: (enumLiteral_3= 's' )
                    {
                    // InternalStoex.g:2870:3: (enumLiteral_3= 's' )
                    // InternalStoex.g:2871:4: enumLiteral_3= 's'
                    {
                    enumLiteral_3=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnitNamesAccess().getSECONDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getUnitNamesAccess().getSECONDEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStoex.g:2878:3: (enumLiteral_4= 'm' )
                    {
                    // InternalStoex.g:2878:3: (enumLiteral_4= 'm' )
                    // InternalStoex.g:2879:4: enumLiteral_4= 'm'
                    {
                    enumLiteral_4=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnitNamesAccess().getMETEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getUnitNamesAccess().getMETEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitNames"

    // $ANTLR start synpred26_InternalStoex
    public final void synpred26_InternalStoex_fragment() throws RecognitionException {   
        EObject this_unitMulti_0 = null;


        // InternalStoex.g:1517:3: (this_unitMulti_0= ruleunitMulti )
        // InternalStoex.g:1517:3: this_unitMulti_0= ruleunitMulti
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_unitMulti_0=ruleunitMulti();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalStoex

    // $ANTLR start synpred27_InternalStoex
    public final void synpred27_InternalStoex_fragment() throws RecognitionException {   
        EObject this_unitDiv_1 = null;


        // InternalStoex.g:1529:3: (this_unitDiv_1= ruleunitDiv )
        // InternalStoex.g:1529:3: this_unitDiv_1= ruleunitDiv
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_unitDiv_1=ruleunitDiv();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalStoex

    // $ANTLR start synpred29_InternalStoex
    public final void synpred29_InternalStoex_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_units_3_0 = null;


        // InternalStoex.g:1648:4: ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )
        // InternalStoex.g:1648:4: () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) )
        {
        // InternalStoex.g:1648:4: ()
        // InternalStoex.g:1649:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalStoex.g:1662:4: ( (lv_units_3_0= ruleUnit ) )
        // InternalStoex.g:1663:5: (lv_units_3_0= ruleUnit )
        {
        // InternalStoex.g:1663:5: (lv_units_3_0= ruleUnit )
        // InternalStoex.g:1664:6: lv_units_3_0= ruleUnit
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getUnitMultiAccess().getUnitsUnitParserRuleCall_1_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_units_3_0=ruleUnit();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalStoex

    // $ANTLR start synpred31_InternalStoex
    public final void synpred31_InternalStoex_fragment() throws RecognitionException {   
        EObject this_unitMulti_2 = null;


        // InternalStoex.g:1720:6: (this_unitMulti_2= ruleunitMulti )
        // InternalStoex.g:1720:6: this_unitMulti_2= ruleunitMulti
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_unitMulti_2=ruleunitMulti();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalStoex

    // Delegated rules

    public final boolean synpred27_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\4\uffff\1\25\4\uffff";
    static final String dfa_3s = "\1\45\4\uffff\1\35\4\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\5\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\5\1\4\1\3\1\1\14\uffff\1\6\12\uffff\4\7\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\10\7\uffff\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "804:2: (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral | this_FunctionLiteral_4= ruleFunctionLiteral | this_Variable_5= ruleVariable | this_Parenthesis_6= ruleParenthesis | this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral )";
        }
    }
    static final String dfa_7s = "\1\25\6\0\3\uffff";
    static final String dfa_8s = "\1\66\6\0\3\uffff";
    static final String dfa_9s = "\7\uffff\1\1\1\2\1\3";
    static final String dfa_10s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\3\uffff}>";
    static final String[] dfa_11s = {
            "\1\6\34\uffff\1\1\1\2\1\3\1\4\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_10;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "1516:2: (this_unitMulti_0= ruleunitMulti | this_unitDiv_1= ruleunitDiv | this_BaseUnit_2= ruleBaseUnit )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalStoex()) ) {s = 7;}

                        else if ( (synpred27_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalStoex()) ) {s = 7;}

                        else if ( (synpred27_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalStoex()) ) {s = 7;}

                        else if ( (synpred27_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalStoex()) ) {s = 7;}

                        else if ( (synpred27_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalStoex()) ) {s = 7;}

                        else if ( (synpred27_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalStoex()) ) {s = 7;}

                        else if ( (synpred27_InternalStoex()) ) {s = 8;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002F002601F0L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000030000000002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000FC0000000002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001000000040002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00020000C0000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x007C000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002F006601F0L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001F000020L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040100L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000100L});
    }


}