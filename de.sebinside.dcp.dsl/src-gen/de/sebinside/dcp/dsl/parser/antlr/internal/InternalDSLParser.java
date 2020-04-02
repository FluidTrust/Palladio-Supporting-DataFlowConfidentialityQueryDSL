package de.sebinside.dcp.dsl.parser.antlr.internal;

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
import de.sebinside.dcp.dsl.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'target'", "'type'", "':'", "'class'", "'{'", "','", "'}'", "'.'", "'!'", "'['", "']'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'node.name.'", "'FLOWS'", "'NEVER'", "'OperationModel'", "'DataCentricPalladio'", "'ExtendedDFD'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }



     	private DSLGrammarAccess grammarAccess;

        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDSL.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_targetModelType_0_0 = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:78:2: ( ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* ) )
            // InternalDSL.g:79:2: ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* )
            {
            // InternalDSL.g:79:2: ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* )
            // InternalDSL.g:80:3: ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )? ( (lv_elements_1_0= ruleAbstractElement ) )*
            {
            // InternalDSL.g:80:3: ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSL.g:81:4: (lv_targetModelType_0_0= ruleTargetModelTypeDef )
                    {
                    // InternalDSL.g:81:4: (lv_targetModelType_0_0= ruleTargetModelTypeDef )
                    // InternalDSL.g:82:5: lv_targetModelType_0_0= ruleTargetModelTypeDef
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getTargetModelTypeTargetModelTypeDefParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_targetModelType_0_0=ruleTargetModelTypeDef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"targetModelType",
                    						lv_targetModelType_0_0,
                    						"de.sebinside.dcp.dsl.DSL.TargetModelTypeDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:99:3: ( (lv_elements_1_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_SL_COMMENT||LA2_0==12||LA2_0==14||(LA2_0>=22 && LA2_0<=23)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDSL.g:100:4: (lv_elements_1_0= ruleAbstractElement )
            	    {
            	    // InternalDSL.g:100:4: (lv_elements_1_0= ruleAbstractElement )
            	    // InternalDSL.g:101:5: lv_elements_1_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"de.sebinside.dcp.dsl.DSL.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTargetModelTypeDef"
    // InternalDSL.g:122:1: entryRuleTargetModelTypeDef returns [EObject current=null] : iv_ruleTargetModelTypeDef= ruleTargetModelTypeDef EOF ;
    public final EObject entryRuleTargetModelTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetModelTypeDef = null;


        try {
            // InternalDSL.g:122:59: (iv_ruleTargetModelTypeDef= ruleTargetModelTypeDef EOF )
            // InternalDSL.g:123:2: iv_ruleTargetModelTypeDef= ruleTargetModelTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTargetModelTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetModelTypeDef=ruleTargetModelTypeDef();

            state._fsp--;

             current =iv_ruleTargetModelTypeDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTargetModelTypeDef"


    // $ANTLR start "ruleTargetModelTypeDef"
    // InternalDSL.g:129:1: ruleTargetModelTypeDef returns [EObject current=null] : (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) ) ;
    public final EObject ruleTargetModelTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:135:2: ( (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) ) )
            // InternalDSL.g:136:2: (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) )
            {
            // InternalDSL.g:136:2: (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) )
            // InternalDSL.g:137:3: otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetModelTypeDefAccess().getTargetKeyword_0());
            		
            // InternalDSL.g:141:3: ( (lv_type_1_0= ruleTargetModelType ) )
            // InternalDSL.g:142:4: (lv_type_1_0= ruleTargetModelType )
            {
            // InternalDSL.g:142:4: (lv_type_1_0= ruleTargetModelType )
            // InternalDSL.g:143:5: lv_type_1_0= ruleTargetModelType
            {

            					newCompositeNode(grammarAccess.getTargetModelTypeDefAccess().getTypeTargetModelTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleTargetModelType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetModelTypeDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.sebinside.dcp.dsl.DSL.TargetModelType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetModelTypeDef"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDSL.g:164:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalDSL.g:164:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalDSL.g:165:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDSL.g:171:1: ruleAbstractElement returns [EObject current=null] : (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_5=null;
        EObject this_Include_0 = null;

        EObject this_CharacteristicType_1 = null;

        EObject this_CharacteristicClass_2 = null;

        EObject this_Constraint_3 = null;



        	enterRule();

        try {
            // InternalDSL.g:177:2: ( (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) ) )
            // InternalDSL.g:178:2: (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) )
            {
            // InternalDSL.g:178:2: (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSL.g:179:3: this_Include_0= ruleInclude
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getIncludeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Include_0=ruleInclude();

                    state._fsp--;


                    			current = this_Include_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:188:3: this_CharacteristicType_1= ruleCharacteristicType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getCharacteristicTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicType_1=ruleCharacteristicType();

                    state._fsp--;


                    			current = this_CharacteristicType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:197:3: this_CharacteristicClass_2= ruleCharacteristicClass
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicClass_2=ruleCharacteristicClass();

                    state._fsp--;


                    			current = this_CharacteristicClass_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:206:3: this_Constraint_3= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_3=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDSL.g:215:3: ( () this_SL_COMMENT_5= RULE_SL_COMMENT )
                    {
                    // InternalDSL.g:215:3: ( () this_SL_COMMENT_5= RULE_SL_COMMENT )
                    // InternalDSL.g:216:4: () this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    // InternalDSL.g:216:4: ()
                    // InternalDSL.g:217:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAbstractElementAccess().getAbstractElementAction_4_0(),
                    						current);
                    				

                    }

                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

                    				newLeafNode(this_SL_COMMENT_5, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_4_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleCharacteristicType"
    // InternalDSL.g:232:1: entryRuleCharacteristicType returns [EObject current=null] : iv_ruleCharacteristicType= ruleCharacteristicType EOF ;
    public final EObject entryRuleCharacteristicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicType = null;


        try {
            // InternalDSL.g:232:59: (iv_ruleCharacteristicType= ruleCharacteristicType EOF )
            // InternalDSL.g:233:2: iv_ruleCharacteristicType= ruleCharacteristicType EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicType=ruleCharacteristicType();

            state._fsp--;

             current =iv_ruleCharacteristicType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicType"


    // $ANTLR start "ruleCharacteristicType"
    // InternalDSL.g:239:1: ruleCharacteristicType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCharacteristicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:245:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDSL.g:246:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDSL.g:246:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalDSL.g:247:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0());
            		
            // InternalDSL.g:251:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:252:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:252:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:253:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCharacteristicTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2());
            		
            // InternalDSL.g:273:3: ( (otherlv_3= RULE_ID ) )
            // InternalDSL.g:274:4: (otherlv_3= RULE_ID )
            {
            // InternalDSL.g:274:4: (otherlv_3= RULE_ID )
            // InternalDSL.g:275:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicTypeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacteristicType"


    // $ANTLR start "entryRuleCharacteristicClass"
    // InternalDSL.g:290:1: entryRuleCharacteristicClass returns [EObject current=null] : iv_ruleCharacteristicClass= ruleCharacteristicClass EOF ;
    public final EObject entryRuleCharacteristicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicClass = null;


        try {
            // InternalDSL.g:290:60: (iv_ruleCharacteristicClass= ruleCharacteristicClass EOF )
            // InternalDSL.g:291:2: iv_ruleCharacteristicClass= ruleCharacteristicClass EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicClass=ruleCharacteristicClass();

            state._fsp--;

             current =iv_ruleCharacteristicClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicClass"


    // $ANTLR start "ruleCharacteristicClass"
    // InternalDSL.g:297:1: ruleCharacteristicClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleCharacteristicClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_3_0 = null;

        EObject lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:303:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' ) )
            // InternalDSL.g:304:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' )
            {
            // InternalDSL.g:304:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' )
            // InternalDSL.g:305:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicClassAccess().getClassKeyword_0());
            		
            // InternalDSL.g:309:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:310:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:310:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:311:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCharacteristicClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:331:3: ( (lv_members_3_0= ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:332:4: (lv_members_3_0= ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:332:4: (lv_members_3_0= ruleCharacteristicTypeSelector )
            // InternalDSL.g:333:5: lv_members_3_0= ruleCharacteristicTypeSelector
            {

            					newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_members_3_0=ruleCharacteristicTypeSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacteristicClassRule());
            					}
            					add(
            						current,
            						"members",
            						lv_members_3_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicTypeSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:350:3: (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDSL.g:351:4: otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDSL.g:355:4: ( (lv_members_5_0= ruleCharacteristicTypeSelector ) )
            	    // InternalDSL.g:356:5: (lv_members_5_0= ruleCharacteristicTypeSelector )
            	    {
            	    // InternalDSL.g:356:5: (lv_members_5_0= ruleCharacteristicTypeSelector )
            	    // InternalDSL.g:357:6: lv_members_5_0= ruleCharacteristicTypeSelector
            	    {

            	    						newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_members_5_0=ruleCharacteristicTypeSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCharacteristicClassRule());
            	    						}
            	    						add(
            	    							current,
            	    							"members",
            	    							lv_members_5_0,
            	    							"de.sebinside.dcp.dsl.DSL.CharacteristicTypeSelector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacteristicClass"


    // $ANTLR start "entryRuleCharacteristicTypeSelector"
    // InternalDSL.g:383:1: entryRuleCharacteristicTypeSelector returns [EObject current=null] : iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF ;
    public final EObject entryRuleCharacteristicTypeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicTypeSelector = null;


        try {
            // InternalDSL.g:383:67: (iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF )
            // InternalDSL.g:384:2: iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicTypeSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicTypeSelector=ruleCharacteristicTypeSelector();

            state._fsp--;

             current =iv_ruleCharacteristicTypeSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicTypeSelector"


    // $ANTLR start "ruleCharacteristicTypeSelector"
    // InternalDSL.g:390:1: ruleCharacteristicTypeSelector returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) ) ) ;
    public final EObject ruleCharacteristicTypeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_negated_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDSL.g:396:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) ) ) )
            // InternalDSL.g:397:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) ) )
            {
            // InternalDSL.g:397:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) ) )
            // InternalDSL.g:398:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) )
            {
            // InternalDSL.g:398:3: ( (otherlv_0= RULE_ID ) )
            // InternalDSL.g:399:4: (otherlv_0= RULE_ID )
            {
            // InternalDSL.g:399:4: (otherlv_0= RULE_ID )
            // InternalDSL.g:400:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1());
            		
            // InternalDSL.g:415:3: ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:416:4: ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalDSL.g:416:4: ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) )
                    // InternalDSL.g:417:5: ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDSL.g:417:5: ( (lv_negated_2_0= '!' ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDSL.g:418:6: (lv_negated_2_0= '!' )
                            {
                            // InternalDSL.g:418:6: (lv_negated_2_0= '!' )
                            // InternalDSL.g:419:7: lv_negated_2_0= '!'
                            {
                            lv_negated_2_0=(Token)match(input,19,FOLLOW_5); 

                            							newLeafNode(lv_negated_2_0, grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                            							}
                            							setWithLastConsumed(current, "negated", true, "!");
                            						

                            }


                            }
                            break;

                    }

                    // InternalDSL.g:431:5: ( (otherlv_3= RULE_ID ) )
                    // InternalDSL.g:432:6: (otherlv_3= RULE_ID )
                    {
                    // InternalDSL.g:432:6: (otherlv_3= RULE_ID )
                    // InternalDSL.g:433:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_3, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:446:4: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )
                    {
                    // InternalDSL.g:446:4: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )
                    // InternalDSL.g:447:5: otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalDSL.g:451:5: ( (otherlv_5= RULE_ID ) )
                    // InternalDSL.g:452:6: (otherlv_5= RULE_ID )
                    {
                    // InternalDSL.g:452:6: (otherlv_5= RULE_ID )
                    // InternalDSL.g:453:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

                    							newLeafNode(otherlv_5, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_1_0());
                    						

                    }


                    }

                    // InternalDSL.g:464:5: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDSL.g:465:6: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0());
                    	    					
                    	    // InternalDSL.g:469:6: ( (otherlv_7= RULE_ID ) )
                    	    // InternalDSL.g:470:7: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalDSL.g:470:7: (otherlv_7= RULE_ID )
                    	    // InternalDSL.g:471:8: otherlv_7= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    	    								}
                    	    							
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

                    	    								newLeafNode(otherlv_7, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_2_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacteristicTypeSelector"


    // $ANTLR start "entryRuleInclude"
    // InternalDSL.g:493:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalDSL.g:493:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalDSL.g:494:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalDSL.g:500:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:506:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalDSL.g:507:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalDSL.g:507:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalDSL.g:508:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
            		
            // InternalDSL.g:512:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalDSL.g:513:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalDSL.g:513:4: (lv_importURI_1_0= RULE_STRING )
            // InternalDSL.g:514:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleConstraint"
    // InternalDSL.g:534:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalDSL.g:534:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalDSL.g:535:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalDSL.g:541:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:547:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) )
            // InternalDSL.g:548:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            {
            // InternalDSL.g:548:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            // InternalDSL.g:549:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalDSL.g:553:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:554:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:554:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:555:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:575:3: ( (lv_rule_3_0= ruleRule ) )
            // InternalDSL.g:576:4: (lv_rule_3_0= ruleRule )
            {
            // InternalDSL.g:576:4: (lv_rule_3_0= ruleRule )
            // InternalDSL.g:577:5: lv_rule_3_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_rule_3_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_3_0,
            						"de.sebinside.dcp.dsl.DSL.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRule"
    // InternalDSL.g:602:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDSL.g:602:45: (iv_ruleRule= ruleRule EOF )
            // InternalDSL.g:603:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDSL.g:609:1: ruleRule returns [EObject current=null] : ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_dataSelectors_0_0 = null;

        EObject lv_dataSelectors_2_0 = null;

        EObject lv_statement_3_0 = null;

        EObject lv_destinationSelectors_4_0 = null;

        EObject lv_destinationSelectors_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:615:2: ( ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ) )
            // InternalDSL.g:616:2: ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* )
            {
            // InternalDSL.g:616:2: ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* )
            // InternalDSL.g:617:3: ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )*
            {
            // InternalDSL.g:617:3: ( (lv_dataSelectors_0_0= ruleDataSelector ) )
            // InternalDSL.g:618:4: (lv_dataSelectors_0_0= ruleDataSelector )
            {
            // InternalDSL.g:618:4: (lv_dataSelectors_0_0= ruleDataSelector )
            // InternalDSL.g:619:5: lv_dataSelectors_0_0= ruleDataSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_dataSelectors_0_0=ruleDataSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"dataSelectors",
            						lv_dataSelectors_0_0,
            						"de.sebinside.dcp.dsl.DSL.DataSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:636:3: (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:637:4: otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getAmpersandKeyword_1_0());
            	    			
            	    // InternalDSL.g:641:4: ( (lv_dataSelectors_2_0= ruleDataSelector ) )
            	    // InternalDSL.g:642:5: (lv_dataSelectors_2_0= ruleDataSelector )
            	    {
            	    // InternalDSL.g:642:5: (lv_dataSelectors_2_0= ruleDataSelector )
            	    // InternalDSL.g:643:6: lv_dataSelectors_2_0= ruleDataSelector
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_dataSelectors_2_0=ruleDataSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataSelectors",
            	    							lv_dataSelectors_2_0,
            	    							"de.sebinside.dcp.dsl.DSL.DataSelector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDSL.g:661:3: ( (lv_statement_3_0= ruleStatement ) )
            // InternalDSL.g:662:4: (lv_statement_3_0= ruleStatement )
            {
            // InternalDSL.g:662:4: (lv_statement_3_0= ruleStatement )
            // InternalDSL.g:663:5: lv_statement_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_statement_3_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
            						"de.sebinside.dcp.dsl.DSL.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:680:3: ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) )
            // InternalDSL.g:681:4: (lv_destinationSelectors_4_0= ruleDestinationSelector )
            {
            // InternalDSL.g:681:4: (lv_destinationSelectors_4_0= ruleDestinationSelector )
            // InternalDSL.g:682:5: lv_destinationSelectors_4_0= ruleDestinationSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_destinationSelectors_4_0=ruleDestinationSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"destinationSelectors",
            						lv_destinationSelectors_4_0,
            						"de.sebinside.dcp.dsl.DSL.DestinationSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:699:3: (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:700:4: otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_16); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAmpersandKeyword_4_0());
            	    			
            	    // InternalDSL.g:704:4: ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) )
            	    // InternalDSL.g:705:5: (lv_destinationSelectors_6_0= ruleDestinationSelector )
            	    {
            	    // InternalDSL.g:705:5: (lv_destinationSelectors_6_0= ruleDestinationSelector )
            	    // InternalDSL.g:706:6: lv_destinationSelectors_6_0= ruleDestinationSelector
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_destinationSelectors_6_0=ruleDestinationSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"destinationSelectors",
            	    							lv_destinationSelectors_6_0,
            	    							"de.sebinside.dcp.dsl.DSL.DestinationSelector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDataSelector"
    // InternalDSL.g:728:1: entryRuleDataSelector returns [EObject current=null] : iv_ruleDataSelector= ruleDataSelector EOF ;
    public final EObject entryRuleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSelector = null;


        try {
            // InternalDSL.g:728:53: (iv_ruleDataSelector= ruleDataSelector EOF )
            // InternalDSL.g:729:2: iv_ruleDataSelector= ruleDataSelector EOF
            {
             newCompositeNode(grammarAccess.getDataSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSelector=ruleDataSelector();

            state._fsp--;

             current =iv_ruleDataSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataSelector"


    // $ANTLR start "ruleDataSelector"
    // InternalDSL.g:735:1: ruleDataSelector returns [EObject current=null] : (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) ;
    public final EObject ruleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeSelector_0 = null;

        EObject this_AttributeClassSelector_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:741:2: ( (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) )
            // InternalDSL.g:742:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            {
            // InternalDSL.g:742:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:743:3: this_AttributeSelector_0= ruleAttributeSelector
                    {

                    			newCompositeNode(grammarAccess.getDataSelectorAccess().getAttributeSelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeSelector_0=ruleAttributeSelector();

                    state._fsp--;


                    			current = this_AttributeSelector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:752:3: this_AttributeClassSelector_1= ruleAttributeClassSelector
                    {

                    			newCompositeNode(grammarAccess.getDataSelectorAccess().getAttributeClassSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeClassSelector_1=ruleAttributeClassSelector();

                    state._fsp--;


                    			current = this_AttributeClassSelector_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // InternalDSL.g:764:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // InternalDSL.g:764:58: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // InternalDSL.g:765:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
            {
             newCompositeNode(grammarAccess.getAttributeSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeSelector=ruleAttributeSelector();

            state._fsp--;

             current =iv_ruleAttributeSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // InternalDSL.g:771:1: ruleAttributeSelector returns [EObject current=null] : (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:777:2: ( (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) )
            // InternalDSL.g:778:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            {
            // InternalDSL.g:778:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            // InternalDSL.g:779:3: otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0());
            		
            // InternalDSL.g:783:3: ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:784:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:784:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            // InternalDSL.g:785:5: lv_ref_1_0= ruleCharacteristicTypeSelector
            {

            					newCompositeNode(grammarAccess.getAttributeSelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_1_0=ruleCharacteristicTypeSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicTypeSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleAttributeClassSelector"
    // InternalDSL.g:806:1: entryRuleAttributeClassSelector returns [EObject current=null] : iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF ;
    public final EObject entryRuleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeClassSelector = null;


        try {
            // InternalDSL.g:806:63: (iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF )
            // InternalDSL.g:807:2: iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF
            {
             newCompositeNode(grammarAccess.getAttributeClassSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeClassSelector=ruleAttributeClassSelector();

            state._fsp--;

             current =iv_ruleAttributeClassSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeClassSelector"


    // $ANTLR start "ruleAttributeClassSelector"
    // InternalDSL.g:813:1: ruleAttributeClassSelector returns [EObject current=null] : (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDSL.g:819:2: ( (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDSL.g:820:2: (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDSL.g:820:2: (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) )
            // InternalDSL.g:821:3: otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0());
            		
            // InternalDSL.g:825:3: ( (otherlv_1= RULE_ID ) )
            // InternalDSL.g:826:4: (otherlv_1= RULE_ID )
            {
            // InternalDSL.g:826:4: (otherlv_1= RULE_ID )
            // InternalDSL.g:827:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeClassSelectorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeClassSelector"


    // $ANTLR start "entryRuleDestinationSelector"
    // InternalDSL.g:842:1: entryRuleDestinationSelector returns [EObject current=null] : iv_ruleDestinationSelector= ruleDestinationSelector EOF ;
    public final EObject entryRuleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationSelector = null;


        try {
            // InternalDSL.g:842:60: (iv_ruleDestinationSelector= ruleDestinationSelector EOF )
            // InternalDSL.g:843:2: iv_ruleDestinationSelector= ruleDestinationSelector EOF
            {
             newCompositeNode(grammarAccess.getDestinationSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestinationSelector=ruleDestinationSelector();

            state._fsp--;

             current =iv_ruleDestinationSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDestinationSelector"


    // $ANTLR start "ruleDestinationSelector"
    // InternalDSL.g:849:1: ruleDestinationSelector returns [EObject current=null] : (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector ) ;
    public final EObject ruleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject this_PropertySelector_0 = null;

        EObject this_PropertyClassSelector_1 = null;

        EObject this_NodeIdentitiySelector_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:855:2: ( (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector ) )
            // InternalDSL.g:856:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector )
            {
            // InternalDSL.g:856:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDSL.g:857:3: this_PropertySelector_0= rulePropertySelector
                    {

                    			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getPropertySelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertySelector_0=rulePropertySelector();

                    state._fsp--;


                    			current = this_PropertySelector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:866:3: this_PropertyClassSelector_1= rulePropertyClassSelector
                    {

                    			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyClassSelector_1=rulePropertyClassSelector();

                    state._fsp--;


                    			current = this_PropertyClassSelector_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:875:3: this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector
                    {

                    			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getNodeIdentitiySelectorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NodeIdentitiySelector_2=ruleNodeIdentitiySelector();

                    state._fsp--;


                    			current = this_NodeIdentitiySelector_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestinationSelector"


    // $ANTLR start "entryRulePropertySelector"
    // InternalDSL.g:887:1: entryRulePropertySelector returns [EObject current=null] : iv_rulePropertySelector= rulePropertySelector EOF ;
    public final EObject entryRulePropertySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelector = null;


        try {
            // InternalDSL.g:887:57: (iv_rulePropertySelector= rulePropertySelector EOF )
            // InternalDSL.g:888:2: iv_rulePropertySelector= rulePropertySelector EOF
            {
             newCompositeNode(grammarAccess.getPropertySelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertySelector=rulePropertySelector();

            state._fsp--;

             current =iv_rulePropertySelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertySelector"


    // $ANTLR start "rulePropertySelector"
    // InternalDSL.g:894:1: rulePropertySelector returns [EObject current=null] : (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) ;
    public final EObject rulePropertySelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:900:2: ( (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) )
            // InternalDSL.g:901:2: (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            {
            // InternalDSL.g:901:2: (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            // InternalDSL.g:902:3: otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0());
            		
            // InternalDSL.g:906:3: ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:907:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:907:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            // InternalDSL.g:908:5: lv_ref_1_0= ruleCharacteristicTypeSelector
            {

            					newCompositeNode(grammarAccess.getPropertySelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_1_0=ruleCharacteristicTypeSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertySelectorRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicTypeSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertySelector"


    // $ANTLR start "entryRulePropertyClassSelector"
    // InternalDSL.g:929:1: entryRulePropertyClassSelector returns [EObject current=null] : iv_rulePropertyClassSelector= rulePropertyClassSelector EOF ;
    public final EObject entryRulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyClassSelector = null;


        try {
            // InternalDSL.g:929:62: (iv_rulePropertyClassSelector= rulePropertyClassSelector EOF )
            // InternalDSL.g:930:2: iv_rulePropertyClassSelector= rulePropertyClassSelector EOF
            {
             newCompositeNode(grammarAccess.getPropertyClassSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyClassSelector=rulePropertyClassSelector();

            state._fsp--;

             current =iv_rulePropertyClassSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyClassSelector"


    // $ANTLR start "rulePropertyClassSelector"
    // InternalDSL.g:936:1: rulePropertyClassSelector returns [EObject current=null] : (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDSL.g:942:2: ( (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDSL.g:943:2: (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDSL.g:943:2: (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) )
            // InternalDSL.g:944:3: otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0());
            		
            // InternalDSL.g:948:3: ( (otherlv_1= RULE_ID ) )
            // InternalDSL.g:949:4: (otherlv_1= RULE_ID )
            {
            // InternalDSL.g:949:4: (otherlv_1= RULE_ID )
            // InternalDSL.g:950:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyClassSelectorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyClassSelector"


    // $ANTLR start "entryRuleNodeIdentitiySelector"
    // InternalDSL.g:965:1: entryRuleNodeIdentitiySelector returns [EObject current=null] : iv_ruleNodeIdentitiySelector= ruleNodeIdentitiySelector EOF ;
    public final EObject entryRuleNodeIdentitiySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeIdentitiySelector = null;


        try {
            // InternalDSL.g:965:62: (iv_ruleNodeIdentitiySelector= ruleNodeIdentitiySelector EOF )
            // InternalDSL.g:966:2: iv_ruleNodeIdentitiySelector= ruleNodeIdentitiySelector EOF
            {
             newCompositeNode(grammarAccess.getNodeIdentitiySelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeIdentitiySelector=ruleNodeIdentitiySelector();

            state._fsp--;

             current =iv_ruleNodeIdentitiySelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNodeIdentitiySelector"


    // $ANTLR start "ruleNodeIdentitiySelector"
    // InternalDSL.g:972:1: ruleNodeIdentitiySelector returns [EObject current=null] : (otherlv_0= 'node.name.' ( (lv_ref_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNodeIdentitiySelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ref_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:978:2: ( (otherlv_0= 'node.name.' ( (lv_ref_1_0= RULE_STRING ) ) ) )
            // InternalDSL.g:979:2: (otherlv_0= 'node.name.' ( (lv_ref_1_0= RULE_STRING ) ) )
            {
            // InternalDSL.g:979:2: (otherlv_0= 'node.name.' ( (lv_ref_1_0= RULE_STRING ) ) )
            // InternalDSL.g:980:3: otherlv_0= 'node.name.' ( (lv_ref_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0());
            		
            // InternalDSL.g:984:3: ( (lv_ref_1_0= RULE_STRING ) )
            // InternalDSL.g:985:4: (lv_ref_1_0= RULE_STRING )
            {
            // InternalDSL.g:985:4: (lv_ref_1_0= RULE_STRING )
            // InternalDSL.g:986:5: lv_ref_1_0= RULE_STRING
            {
            lv_ref_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_ref_1_0, grammarAccess.getNodeIdentitiySelectorAccess().getRefSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeIdentitiySelector"


    // $ANTLR start "entryRuleStatement"
    // InternalDSL.g:1006:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDSL.g:1006:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDSL.g:1007:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDSL.g:1013:1: ruleStatement returns [EObject current=null] : ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_modality_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1019:2: ( ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) )
            // InternalDSL.g:1020:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            {
            // InternalDSL.g:1020:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            // InternalDSL.g:1021:3: ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) )
            {
            // InternalDSL.g:1021:3: ( (lv_modality_0_0= ruleStatementModality ) )
            // InternalDSL.g:1022:4: (lv_modality_0_0= ruleStatementModality )
            {
            // InternalDSL.g:1022:4: (lv_modality_0_0= ruleStatementModality )
            // InternalDSL.g:1023:5: lv_modality_0_0= ruleStatementModality
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_modality_0_0=ruleStatementModality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"modality",
            						lv_modality_0_0,
            						"de.sebinside.dcp.dsl.DSL.StatementModality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:1040:3: ( (lv_type_1_0= ruleStatementType ) )
            // InternalDSL.g:1041:4: (lv_type_1_0= ruleStatementType )
            {
            // InternalDSL.g:1041:4: (lv_type_1_0= ruleStatementType )
            // InternalDSL.g:1042:5: lv_type_1_0= ruleStatementType
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getTypeStatementTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleStatementType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.sebinside.dcp.dsl.DSL.StatementType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStatementType"
    // InternalDSL.g:1063:1: entryRuleStatementType returns [EObject current=null] : iv_ruleStatementType= ruleStatementType EOF ;
    public final EObject entryRuleStatementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementType = null;


        try {
            // InternalDSL.g:1063:54: (iv_ruleStatementType= ruleStatementType EOF )
            // InternalDSL.g:1064:2: iv_ruleStatementType= ruleStatementType EOF
            {
             newCompositeNode(grammarAccess.getStatementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementType=ruleStatementType();

            state._fsp--;

             current =iv_ruleStatementType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatementType"


    // $ANTLR start "ruleStatementType"
    // InternalDSL.g:1070:1: ruleStatementType returns [EObject current=null] : ( (lv_name_0_0= 'FLOWS' ) ) ;
    public final EObject ruleStatementType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1076:2: ( ( (lv_name_0_0= 'FLOWS' ) ) )
            // InternalDSL.g:1077:2: ( (lv_name_0_0= 'FLOWS' ) )
            {
            // InternalDSL.g:1077:2: ( (lv_name_0_0= 'FLOWS' ) )
            // InternalDSL.g:1078:3: (lv_name_0_0= 'FLOWS' )
            {
            // InternalDSL.g:1078:3: (lv_name_0_0= 'FLOWS' )
            // InternalDSL.g:1079:4: lv_name_0_0= 'FLOWS'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStatementTypeRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "FLOWS");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementType"


    // $ANTLR start "entryRuleStatementModality"
    // InternalDSL.g:1094:1: entryRuleStatementModality returns [EObject current=null] : iv_ruleStatementModality= ruleStatementModality EOF ;
    public final EObject entryRuleStatementModality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementModality = null;


        try {
            // InternalDSL.g:1094:58: (iv_ruleStatementModality= ruleStatementModality EOF )
            // InternalDSL.g:1095:2: iv_ruleStatementModality= ruleStatementModality EOF
            {
             newCompositeNode(grammarAccess.getStatementModalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementModality=ruleStatementModality();

            state._fsp--;

             current =iv_ruleStatementModality; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatementModality"


    // $ANTLR start "ruleStatementModality"
    // InternalDSL.g:1101:1: ruleStatementModality returns [EObject current=null] : ( (lv_name_0_0= 'NEVER' ) ) ;
    public final EObject ruleStatementModality() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1107:2: ( ( (lv_name_0_0= 'NEVER' ) ) )
            // InternalDSL.g:1108:2: ( (lv_name_0_0= 'NEVER' ) )
            {
            // InternalDSL.g:1108:2: ( (lv_name_0_0= 'NEVER' ) )
            // InternalDSL.g:1109:3: (lv_name_0_0= 'NEVER' )
            {
            // InternalDSL.g:1109:3: (lv_name_0_0= 'NEVER' )
            // InternalDSL.g:1110:4: lv_name_0_0= 'NEVER'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStatementModalityRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "NEVER");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementModality"


    // $ANTLR start "ruleTargetModelType"
    // InternalDSL.g:1125:1: ruleTargetModelType returns [Enumerator current=null] : ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) ) ;
    public final Enumerator ruleTargetModelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:1131:2: ( ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) ) )
            // InternalDSL.g:1132:2: ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) )
            {
            // InternalDSL.g:1132:2: ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1133:3: (enumLiteral_0= 'OperationModel' )
                    {
                    // InternalDSL.g:1133:3: (enumLiteral_0= 'OperationModel' )
                    // InternalDSL.g:1134:4: enumLiteral_0= 'OperationModel'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1141:3: (enumLiteral_1= 'DataCentricPalladio' )
                    {
                    // InternalDSL.g:1141:3: (enumLiteral_1= 'DataCentricPalladio' )
                    // InternalDSL.g:1142:4: enumLiteral_1= 'DataCentricPalladio'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1149:3: (enumLiteral_2= 'ExtendedDFD' )
                    {
                    // InternalDSL.g:1149:3: (enumLiteral_2= 'ExtendedDFD' )
                    // InternalDSL.g:1150:4: enumLiteral_2= 'ExtendedDFD'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetModelType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C05012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});

}