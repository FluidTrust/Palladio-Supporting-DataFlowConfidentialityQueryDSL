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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'target'", "'using'", "','", "'type'", "':'", "'class'", "'{'", "'}'", "'.'", "'!'", "'['", "']'", "'$'", "'{}'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'node.name.'", "'node.identity.'", "'FLOWS'", "'NEVER'", "'WHERE'", "'('", "')'", "'=='", "'!='", "'isEmpty('", "'intersection('", "'OperationModel'", "'DataCentricPalladio'", "'ExtendedDFD'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA2_0==RULE_SL_COMMENT||LA2_0==14||LA2_0==16||(LA2_0>=25 && LA2_0<=26)) ) {
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
    // InternalDSL.g:129:1: ruleTargetModelTypeDef returns [EObject current=null] : (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) (otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )? ) ;
    public final EObject ruleTargetModelTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:135:2: ( (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) (otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )? ) )
            // InternalDSL.g:136:2: (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) (otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )? )
            {
            // InternalDSL.g:136:2: (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) (otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )? )
            // InternalDSL.g:137:3: otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) (otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )?
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
            				
            pushFollow(FOLLOW_5);
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

            // InternalDSL.g:160:3: (otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:161:4: otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )?
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getTargetModelTypeDefAccess().getUsingKeyword_2_0());
                    			
                    // InternalDSL.g:165:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDSL.g:166:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDSL.g:166:5: (otherlv_3= RULE_ID )
                    // InternalDSL.g:167:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_3, grammarAccess.getTargetModelTypeDefAccess().getTypeContainerCharacteristicTypeContainerCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalDSL.g:178:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==13) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalDSL.g:179:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                            {
                            otherlv_4=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_0());
                            				
                            // InternalDSL.g:183:5: ( (otherlv_5= RULE_ID ) )
                            // InternalDSL.g:184:6: (otherlv_5= RULE_ID )
                            {
                            // InternalDSL.g:184:6: (otherlv_5= RULE_ID )
                            // InternalDSL.g:185:7: otherlv_5= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
                            							}
                            						
                            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

                            							newLeafNode(otherlv_5, grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationCrossReference_2_2_1_0());
                            						

                            }


                            }

                            otherlv_6=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_6, grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_2());
                            				
                            // InternalDSL.g:200:5: ( (otherlv_7= RULE_ID ) )
                            // InternalDSL.g:201:6: (otherlv_7= RULE_ID )
                            {
                            // InternalDSL.g:201:6: (otherlv_7= RULE_ID )
                            // InternalDSL.g:202:7: otherlv_7= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
                            							}
                            						
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(otherlv_7, grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelCrossReference_2_2_3_0());
                            						

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleTargetModelTypeDef"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDSL.g:219:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalDSL.g:219:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalDSL.g:220:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // InternalDSL.g:226:1: ruleAbstractElement returns [EObject current=null] : (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_5=null;
        EObject this_Include_0 = null;

        EObject this_CharacteristicType_1 = null;

        EObject this_CharacteristicClass_2 = null;

        EObject this_Constraint_3 = null;



        	enterRule();

        try {
            // InternalDSL.g:232:2: ( (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) ) )
            // InternalDSL.g:233:2: (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) )
            {
            // InternalDSL.g:233:2: (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDSL.g:234:3: this_Include_0= ruleInclude
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
                    // InternalDSL.g:243:3: this_CharacteristicType_1= ruleCharacteristicType
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
                    // InternalDSL.g:252:3: this_CharacteristicClass_2= ruleCharacteristicClass
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
                    // InternalDSL.g:261:3: this_Constraint_3= ruleConstraint
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
                    // InternalDSL.g:270:3: ( () this_SL_COMMENT_5= RULE_SL_COMMENT )
                    {
                    // InternalDSL.g:270:3: ( () this_SL_COMMENT_5= RULE_SL_COMMENT )
                    // InternalDSL.g:271:4: () this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    // InternalDSL.g:271:4: ()
                    // InternalDSL.g:272:5: 
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
    // InternalDSL.g:287:1: entryRuleCharacteristicType returns [EObject current=null] : iv_ruleCharacteristicType= ruleCharacteristicType EOF ;
    public final EObject entryRuleCharacteristicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicType = null;


        try {
            // InternalDSL.g:287:59: (iv_ruleCharacteristicType= ruleCharacteristicType EOF )
            // InternalDSL.g:288:2: iv_ruleCharacteristicType= ruleCharacteristicType EOF
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
    // InternalDSL.g:294:1: ruleCharacteristicType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCharacteristicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:300:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDSL.g:301:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDSL.g:301:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalDSL.g:302:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0());
            		
            // InternalDSL.g:306:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:307:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:307:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:308:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2());
            		
            // InternalDSL.g:328:3: ( (otherlv_3= RULE_ID ) )
            // InternalDSL.g:329:4: (otherlv_3= RULE_ID )
            {
            // InternalDSL.g:329:4: (otherlv_3= RULE_ID )
            // InternalDSL.g:330:5: otherlv_3= RULE_ID
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
    // InternalDSL.g:345:1: entryRuleCharacteristicClass returns [EObject current=null] : iv_ruleCharacteristicClass= ruleCharacteristicClass EOF ;
    public final EObject entryRuleCharacteristicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicClass = null;


        try {
            // InternalDSL.g:345:60: (iv_ruleCharacteristicClass= ruleCharacteristicClass EOF )
            // InternalDSL.g:346:2: iv_ruleCharacteristicClass= ruleCharacteristicClass EOF
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
    // InternalDSL.g:352:1: ruleCharacteristicClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' ) ;
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
            // InternalDSL.g:358:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' ) )
            // InternalDSL.g:359:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' )
            {
            // InternalDSL.g:359:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' )
            // InternalDSL.g:360:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicClassAccess().getClassKeyword_0());
            		
            // InternalDSL.g:364:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:365:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:365:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:366:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:386:3: ( (lv_members_3_0= ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:387:4: (lv_members_3_0= ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:387:4: (lv_members_3_0= ruleCharacteristicTypeSelector )
            // InternalDSL.g:388:5: lv_members_3_0= ruleCharacteristicTypeSelector
            {

            					newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalDSL.g:405:3: (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:406:4: otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDSL.g:410:4: ( (lv_members_5_0= ruleCharacteristicTypeSelector ) )
            	    // InternalDSL.g:411:5: (lv_members_5_0= ruleCharacteristicTypeSelector )
            	    {
            	    // InternalDSL.g:411:5: (lv_members_5_0= ruleCharacteristicTypeSelector )
            	    // InternalDSL.g:412:6: lv_members_5_0= ruleCharacteristicTypeSelector
            	    {

            	    						newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalDSL.g:438:1: entryRuleCharacteristicTypeSelector returns [EObject current=null] : iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF ;
    public final EObject entryRuleCharacteristicTypeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicTypeSelector = null;


        try {
            // InternalDSL.g:438:67: (iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF )
            // InternalDSL.g:439:2: iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF
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
    // InternalDSL.g:445:1: ruleCharacteristicTypeSelector returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) ) ;
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
        Token lv_isVariableSelector_9_0=null;
        EObject lv_variable_10_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:451:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) ) )
            // InternalDSL.g:452:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) )
            {
            // InternalDSL.g:452:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) )
            // InternalDSL.g:453:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) )
            {
            // InternalDSL.g:453:3: ( (otherlv_0= RULE_ID ) )
            // InternalDSL.g:454:4: (otherlv_0= RULE_ID )
            {
            // InternalDSL.g:454:4: (otherlv_0= RULE_ID )
            // InternalDSL.g:455:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1());
            		
            // InternalDSL.g:470:3: ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDSL.g:471:4: ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalDSL.g:471:4: ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) )
                    // InternalDSL.g:472:5: ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDSL.g:472:5: ( (lv_negated_2_0= '!' ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==20) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDSL.g:473:6: (lv_negated_2_0= '!' )
                            {
                            // InternalDSL.g:473:6: (lv_negated_2_0= '!' )
                            // InternalDSL.g:474:7: lv_negated_2_0= '!'
                            {
                            lv_negated_2_0=(Token)match(input,20,FOLLOW_6); 

                            							newLeafNode(lv_negated_2_0, grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                            							}
                            							setWithLastConsumed(current, "negated", true, "!");
                            						

                            }


                            }
                            break;

                    }

                    // InternalDSL.g:486:5: ( (otherlv_3= RULE_ID ) )
                    // InternalDSL.g:487:6: (otherlv_3= RULE_ID )
                    {
                    // InternalDSL.g:487:6: (otherlv_3= RULE_ID )
                    // InternalDSL.g:488:7: otherlv_3= RULE_ID
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
                    // InternalDSL.g:501:4: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )
                    {
                    // InternalDSL.g:501:4: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )
                    // InternalDSL.g:502:5: otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalDSL.g:506:5: ( (otherlv_5= RULE_ID ) )
                    // InternalDSL.g:507:6: (otherlv_5= RULE_ID )
                    {
                    // InternalDSL.g:507:6: (otherlv_5= RULE_ID )
                    // InternalDSL.g:508:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

                    							newLeafNode(otherlv_5, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_1_0());
                    						

                    }


                    }

                    // InternalDSL.g:519:5: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==13) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDSL.g:520:6: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_6); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0());
                    	    					
                    	    // InternalDSL.g:524:6: ( (otherlv_7= RULE_ID ) )
                    	    // InternalDSL.g:525:7: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalDSL.g:525:7: (otherlv_7= RULE_ID )
                    	    // InternalDSL.g:526:8: otherlv_7= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    	    								}
                    	    							
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	    								newLeafNode(otherlv_7, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_2_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:544:4: ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) )
                    {
                    // InternalDSL.g:544:4: ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) )
                    // InternalDSL.g:545:5: ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) )
                    {
                    // InternalDSL.g:545:5: ( (lv_isVariableSelector_9_0= '$' ) )
                    // InternalDSL.g:546:6: (lv_isVariableSelector_9_0= '$' )
                    {
                    // InternalDSL.g:546:6: (lv_isVariableSelector_9_0= '$' )
                    // InternalDSL.g:547:7: lv_isVariableSelector_9_0= '$'
                    {
                    lv_isVariableSelector_9_0=(Token)match(input,23,FOLLOW_6); 

                    							newLeafNode(lv_isVariableSelector_9_0, grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    							}
                    							setWithLastConsumed(current, "isVariableSelector", true, "$");
                    						

                    }


                    }

                    // InternalDSL.g:559:5: ( (lv_variable_10_0= ruleCharacteristicVariableType ) )
                    // InternalDSL.g:560:6: (lv_variable_10_0= ruleCharacteristicVariableType )
                    {
                    // InternalDSL.g:560:6: (lv_variable_10_0= ruleCharacteristicVariableType )
                    // InternalDSL.g:561:7: lv_variable_10_0= ruleCharacteristicVariableType
                    {

                    							newCompositeNode(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableCharacteristicVariableTypeParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_variable_10_0=ruleCharacteristicVariableType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCharacteristicTypeSelectorRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_10_0,
                    								"de.sebinside.dcp.dsl.DSL.CharacteristicVariableType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


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


    // $ANTLR start "entryRuleCharacteristicVariableType"
    // InternalDSL.g:584:1: entryRuleCharacteristicVariableType returns [EObject current=null] : iv_ruleCharacteristicVariableType= ruleCharacteristicVariableType EOF ;
    public final EObject entryRuleCharacteristicVariableType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicVariableType = null;


        try {
            // InternalDSL.g:584:67: (iv_ruleCharacteristicVariableType= ruleCharacteristicVariableType EOF )
            // InternalDSL.g:585:2: iv_ruleCharacteristicVariableType= ruleCharacteristicVariableType EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicVariableType=ruleCharacteristicVariableType();

            state._fsp--;

             current =iv_ruleCharacteristicVariableType; 
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
    // $ANTLR end "entryRuleCharacteristicVariableType"


    // $ANTLR start "ruleCharacteristicVariableType"
    // InternalDSL.g:591:1: ruleCharacteristicVariableType returns [EObject current=null] : (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet ) ;
    public final EObject ruleCharacteristicVariableType() throws RecognitionException {
        EObject current = null;

        EObject this_CharacteristicVariable_0 = null;

        EObject this_CharacteristicSet_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:597:2: ( (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet ) )
            // InternalDSL.g:598:2: (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet )
            {
            // InternalDSL.g:598:2: (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==24) ) {
                    alt10=2;
                }
                else if ( (LA10_1==EOF||LA10_1==13||LA10_1==18||LA10_1==27||(LA10_1>=35 && LA10_1<=36)) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:599:3: this_CharacteristicVariable_0= ruleCharacteristicVariable
                    {

                    			newCompositeNode(grammarAccess.getCharacteristicVariableTypeAccess().getCharacteristicVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicVariable_0=ruleCharacteristicVariable();

                    state._fsp--;


                    			current = this_CharacteristicVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:608:3: this_CharacteristicSet_1= ruleCharacteristicSet
                    {

                    			newCompositeNode(grammarAccess.getCharacteristicVariableTypeAccess().getCharacteristicSetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicSet_1=ruleCharacteristicSet();

                    state._fsp--;


                    			current = this_CharacteristicSet_1;
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
    // $ANTLR end "ruleCharacteristicVariableType"


    // $ANTLR start "entryRuleCharacteristicVariable"
    // InternalDSL.g:620:1: entryRuleCharacteristicVariable returns [EObject current=null] : iv_ruleCharacteristicVariable= ruleCharacteristicVariable EOF ;
    public final EObject entryRuleCharacteristicVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicVariable = null;


        try {
            // InternalDSL.g:620:63: (iv_ruleCharacteristicVariable= ruleCharacteristicVariable EOF )
            // InternalDSL.g:621:2: iv_ruleCharacteristicVariable= ruleCharacteristicVariable EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicVariable=ruleCharacteristicVariable();

            state._fsp--;

             current =iv_ruleCharacteristicVariable; 
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
    // $ANTLR end "entryRuleCharacteristicVariable"


    // $ANTLR start "ruleCharacteristicVariable"
    // InternalDSL.g:627:1: ruleCharacteristicVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCharacteristicVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:633:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDSL.g:634:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDSL.g:634:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDSL.g:635:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDSL.g:635:3: (lv_name_0_0= RULE_ID )
            // InternalDSL.g:636:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCharacteristicVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCharacteristicVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleCharacteristicVariable"


    // $ANTLR start "entryRuleCharacteristicSet"
    // InternalDSL.g:655:1: entryRuleCharacteristicSet returns [EObject current=null] : iv_ruleCharacteristicSet= ruleCharacteristicSet EOF ;
    public final EObject entryRuleCharacteristicSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicSet = null;


        try {
            // InternalDSL.g:655:58: (iv_ruleCharacteristicSet= ruleCharacteristicSet EOF )
            // InternalDSL.g:656:2: iv_ruleCharacteristicSet= ruleCharacteristicSet EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicSet=ruleCharacteristicSet();

            state._fsp--;

             current =iv_ruleCharacteristicSet; 
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
    // $ANTLR end "entryRuleCharacteristicSet"


    // $ANTLR start "ruleCharacteristicSet"
    // InternalDSL.g:662:1: ruleCharacteristicSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' ) ;
    public final EObject ruleCharacteristicSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDSL.g:668:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' ) )
            // InternalDSL.g:669:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' )
            {
            // InternalDSL.g:669:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' )
            // InternalDSL.g:670:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}'
            {
            // InternalDSL.g:670:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDSL.g:671:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDSL.g:671:4: (lv_name_0_0= RULE_ID )
            // InternalDSL.g:672:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCharacteristicSetAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCharacteristicSetAccess().getLeftCurlyBracketRightCurlyBracketKeyword_1());
            		

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
    // $ANTLR end "ruleCharacteristicSet"


    // $ANTLR start "entryRuleInclude"
    // InternalDSL.g:696:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalDSL.g:696:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalDSL.g:697:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalDSL.g:703:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:709:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalDSL.g:710:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalDSL.g:710:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalDSL.g:711:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
            		
            // InternalDSL.g:715:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalDSL.g:716:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalDSL.g:716:4: (lv_importURI_1_0= RULE_STRING )
            // InternalDSL.g:717:5: lv_importURI_1_0= RULE_STRING
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
    // InternalDSL.g:737:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalDSL.g:737:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalDSL.g:738:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalDSL.g:744:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:750:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) )
            // InternalDSL.g:751:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            {
            // InternalDSL.g:751:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            // InternalDSL.g:752:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalDSL.g:756:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:757:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:757:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:758:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:778:3: ( (lv_rule_3_0= ruleRule ) )
            // InternalDSL.g:779:4: (lv_rule_3_0= ruleRule )
            {
            // InternalDSL.g:779:4: (lv_rule_3_0= ruleRule )
            // InternalDSL.g:780:5: lv_rule_3_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalDSL.g:805:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDSL.g:805:45: (iv_ruleRule= ruleRule EOF )
            // InternalDSL.g:806:2: iv_ruleRule= ruleRule EOF
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
    // InternalDSL.g:812:1: ruleRule returns [EObject current=null] : ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_dataSelectors_0_0 = null;

        EObject lv_dataSelectors_2_0 = null;

        EObject lv_statement_3_0 = null;

        EObject lv_destinationSelectors_4_0 = null;

        EObject lv_destinationSelectors_6_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:818:2: ( ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? ) )
            // InternalDSL.g:819:2: ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? )
            {
            // InternalDSL.g:819:2: ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? )
            // InternalDSL.g:820:3: ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )?
            {
            // InternalDSL.g:820:3: ( (lv_dataSelectors_0_0= ruleDataSelector ) )
            // InternalDSL.g:821:4: (lv_dataSelectors_0_0= ruleDataSelector )
            {
            // InternalDSL.g:821:4: (lv_dataSelectors_0_0= ruleDataSelector )
            // InternalDSL.g:822:5: lv_dataSelectors_0_0= ruleDataSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalDSL.g:839:3: (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:840:4: otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_17); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getAmpersandKeyword_1_0());
            	    			
            	    // InternalDSL.g:844:4: ( (lv_dataSelectors_2_0= ruleDataSelector ) )
            	    // InternalDSL.g:845:5: (lv_dataSelectors_2_0= ruleDataSelector )
            	    {
            	    // InternalDSL.g:845:5: (lv_dataSelectors_2_0= ruleDataSelector )
            	    // InternalDSL.g:846:6: lv_dataSelectors_2_0= ruleDataSelector
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop11;
                }
            } while (true);

            // InternalDSL.g:864:3: ( (lv_statement_3_0= ruleStatement ) )
            // InternalDSL.g:865:4: (lv_statement_3_0= ruleStatement )
            {
            // InternalDSL.g:865:4: (lv_statement_3_0= ruleStatement )
            // InternalDSL.g:866:5: lv_statement_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalDSL.g:883:3: ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) )
            // InternalDSL.g:884:4: (lv_destinationSelectors_4_0= ruleDestinationSelector )
            {
            // InternalDSL.g:884:4: (lv_destinationSelectors_4_0= ruleDestinationSelector )
            // InternalDSL.g:885:5: lv_destinationSelectors_4_0= ruleDestinationSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalDSL.g:902:3: (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:903:4: otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) )
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_20); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAmpersandKeyword_4_0());
            	    			
            	    // InternalDSL.g:907:4: ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) )
            	    // InternalDSL.g:908:5: (lv_destinationSelectors_6_0= ruleDestinationSelector )
            	    {
            	    // InternalDSL.g:908:5: (lv_destinationSelectors_6_0= ruleDestinationSelector )
            	    // InternalDSL.g:909:6: lv_destinationSelectors_6_0= ruleDestinationSelector
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop12;
                }
            } while (true);

            // InternalDSL.g:927:3: ( (lv_condition_7_0= ruleCondition ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:928:4: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalDSL.g:928:4: (lv_condition_7_0= ruleCondition )
                    // InternalDSL.g:929:5: lv_condition_7_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_condition_7_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_7_0,
                    						"de.sebinside.dcp.dsl.DSL.Condition");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDataSelector"
    // InternalDSL.g:950:1: entryRuleDataSelector returns [EObject current=null] : iv_ruleDataSelector= ruleDataSelector EOF ;
    public final EObject entryRuleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSelector = null;


        try {
            // InternalDSL.g:950:53: (iv_ruleDataSelector= ruleDataSelector EOF )
            // InternalDSL.g:951:2: iv_ruleDataSelector= ruleDataSelector EOF
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
    // InternalDSL.g:957:1: ruleDataSelector returns [EObject current=null] : (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) ;
    public final EObject ruleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeSelector_0 = null;

        EObject this_AttributeClassSelector_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:963:2: ( (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) )
            // InternalDSL.g:964:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            {
            // InternalDSL.g:964:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:965:3: this_AttributeSelector_0= ruleAttributeSelector
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
                    // InternalDSL.g:974:3: this_AttributeClassSelector_1= ruleAttributeClassSelector
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
    // InternalDSL.g:986:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // InternalDSL.g:986:58: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // InternalDSL.g:987:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
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
    // InternalDSL.g:993:1: ruleAttributeSelector returns [EObject current=null] : (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:999:2: ( (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) )
            // InternalDSL.g:1000:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            {
            // InternalDSL.g:1000:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            // InternalDSL.g:1001:3: otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0());
            		
            // InternalDSL.g:1005:3: ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:1006:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:1006:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            // InternalDSL.g:1007:5: lv_ref_1_0= ruleCharacteristicTypeSelector
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
    // InternalDSL.g:1028:1: entryRuleAttributeClassSelector returns [EObject current=null] : iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF ;
    public final EObject entryRuleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeClassSelector = null;


        try {
            // InternalDSL.g:1028:63: (iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF )
            // InternalDSL.g:1029:2: iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF
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
    // InternalDSL.g:1035:1: ruleAttributeClassSelector returns [EObject current=null] : (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1041:2: ( (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDSL.g:1042:2: (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDSL.g:1042:2: (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) )
            // InternalDSL.g:1043:3: otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0());
            		
            // InternalDSL.g:1047:3: ( (otherlv_1= RULE_ID ) )
            // InternalDSL.g:1048:4: (otherlv_1= RULE_ID )
            {
            // InternalDSL.g:1048:4: (otherlv_1= RULE_ID )
            // InternalDSL.g:1049:5: otherlv_1= RULE_ID
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
    // InternalDSL.g:1064:1: entryRuleDestinationSelector returns [EObject current=null] : iv_ruleDestinationSelector= ruleDestinationSelector EOF ;
    public final EObject entryRuleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationSelector = null;


        try {
            // InternalDSL.g:1064:60: (iv_ruleDestinationSelector= ruleDestinationSelector EOF )
            // InternalDSL.g:1065:2: iv_ruleDestinationSelector= ruleDestinationSelector EOF
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
    // InternalDSL.g:1071:1: ruleDestinationSelector returns [EObject current=null] : (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector ) ;
    public final EObject ruleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject this_PropertySelector_0 = null;

        EObject this_PropertyClassSelector_1 = null;

        EObject this_NodeIdentitiySelector_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:1077:2: ( (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector ) )
            // InternalDSL.g:1078:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector )
            {
            // InternalDSL.g:1078:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 32:
            case 33:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDSL.g:1079:3: this_PropertySelector_0= rulePropertySelector
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
                    // InternalDSL.g:1088:3: this_PropertyClassSelector_1= rulePropertyClassSelector
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
                    // InternalDSL.g:1097:3: this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector
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
    // InternalDSL.g:1109:1: entryRulePropertySelector returns [EObject current=null] : iv_rulePropertySelector= rulePropertySelector EOF ;
    public final EObject entryRulePropertySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelector = null;


        try {
            // InternalDSL.g:1109:57: (iv_rulePropertySelector= rulePropertySelector EOF )
            // InternalDSL.g:1110:2: iv_rulePropertySelector= rulePropertySelector EOF
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
    // InternalDSL.g:1116:1: rulePropertySelector returns [EObject current=null] : (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) ;
    public final EObject rulePropertySelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1122:2: ( (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) )
            // InternalDSL.g:1123:2: (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            {
            // InternalDSL.g:1123:2: (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            // InternalDSL.g:1124:3: otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0());
            		
            // InternalDSL.g:1128:3: ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:1129:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:1129:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            // InternalDSL.g:1130:5: lv_ref_1_0= ruleCharacteristicTypeSelector
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
    // InternalDSL.g:1151:1: entryRulePropertyClassSelector returns [EObject current=null] : iv_rulePropertyClassSelector= rulePropertyClassSelector EOF ;
    public final EObject entryRulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyClassSelector = null;


        try {
            // InternalDSL.g:1151:62: (iv_rulePropertyClassSelector= rulePropertyClassSelector EOF )
            // InternalDSL.g:1152:2: iv_rulePropertyClassSelector= rulePropertyClassSelector EOF
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
    // InternalDSL.g:1158:1: rulePropertyClassSelector returns [EObject current=null] : (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1164:2: ( (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDSL.g:1165:2: (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDSL.g:1165:2: (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) )
            // InternalDSL.g:1166:3: otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0());
            		
            // InternalDSL.g:1170:3: ( (otherlv_1= RULE_ID ) )
            // InternalDSL.g:1171:4: (otherlv_1= RULE_ID )
            {
            // InternalDSL.g:1171:4: (otherlv_1= RULE_ID )
            // InternalDSL.g:1172:5: otherlv_1= RULE_ID
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
    // InternalDSL.g:1187:1: entryRuleNodeIdentitiySelector returns [EObject current=null] : iv_ruleNodeIdentitiySelector= ruleNodeIdentitiySelector EOF ;
    public final EObject entryRuleNodeIdentitiySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeIdentitiySelector = null;


        try {
            // InternalDSL.g:1187:62: (iv_ruleNodeIdentitiySelector= ruleNodeIdentitiySelector EOF )
            // InternalDSL.g:1188:2: iv_ruleNodeIdentitiySelector= ruleNodeIdentitiySelector EOF
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
    // InternalDSL.g:1194:1: ruleNodeIdentitiySelector returns [EObject current=null] : ( (otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'node.identity.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleNodeIdentitiySelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDSL.g:1200:2: ( ( (otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'node.identity.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalDSL.g:1201:2: ( (otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'node.identity.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalDSL.g:1201:2: ( (otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'node.identity.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDSL.g:1202:3: (otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) ) )
                    {
                    // InternalDSL.g:1202:3: (otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) ) )
                    // InternalDSL.g:1203:4: otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0_0());
                    			
                    // InternalDSL.g:1207:4: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalDSL.g:1208:5: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalDSL.g:1208:5: (lv_name_1_0= RULE_STRING )
                    // InternalDSL.g:1209:6: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getNodeIdentitiySelectorAccess().getNameSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1227:3: (otherlv_2= 'node.identity.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalDSL.g:1227:3: (otherlv_2= 'node.identity.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
                    // InternalDSL.g:1228:4: otherlv_2= 'node.identity.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeIdentitiySelectorAccess().getNodeIdentityKeyword_1_0());
                    			
                    // InternalDSL.g:1232:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDSL.g:1233:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDSL.g:1233:5: (otherlv_3= RULE_ID )
                    // InternalDSL.g:1234:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_2());
                    			
                    // InternalDSL.g:1249:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDSL.g:1250:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDSL.g:1250:5: (otherlv_5= RULE_ID )
                    // InternalDSL.g:1251:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_5, grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_4());
                    			
                    // InternalDSL.g:1266:4: ( (otherlv_7= RULE_ID ) )
                    // InternalDSL.g:1267:5: (otherlv_7= RULE_ID )
                    {
                    // InternalDSL.g:1267:5: (otherlv_7= RULE_ID )
                    // InternalDSL.g:1268:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationCrossReference_1_5_0());
                    					

                    }


                    }


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
    // $ANTLR end "ruleNodeIdentitiySelector"


    // $ANTLR start "entryRuleStatement"
    // InternalDSL.g:1284:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDSL.g:1284:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDSL.g:1285:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalDSL.g:1291:1: ruleStatement returns [EObject current=null] : ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_modality_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1297:2: ( ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) )
            // InternalDSL.g:1298:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            {
            // InternalDSL.g:1298:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            // InternalDSL.g:1299:3: ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) )
            {
            // InternalDSL.g:1299:3: ( (lv_modality_0_0= ruleStatementModality ) )
            // InternalDSL.g:1300:4: (lv_modality_0_0= ruleStatementModality )
            {
            // InternalDSL.g:1300:4: (lv_modality_0_0= ruleStatementModality )
            // InternalDSL.g:1301:5: lv_modality_0_0= ruleStatementModality
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalDSL.g:1318:3: ( (lv_type_1_0= ruleStatementType ) )
            // InternalDSL.g:1319:4: (lv_type_1_0= ruleStatementType )
            {
            // InternalDSL.g:1319:4: (lv_type_1_0= ruleStatementType )
            // InternalDSL.g:1320:5: lv_type_1_0= ruleStatementType
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
    // InternalDSL.g:1341:1: entryRuleStatementType returns [EObject current=null] : iv_ruleStatementType= ruleStatementType EOF ;
    public final EObject entryRuleStatementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementType = null;


        try {
            // InternalDSL.g:1341:54: (iv_ruleStatementType= ruleStatementType EOF )
            // InternalDSL.g:1342:2: iv_ruleStatementType= ruleStatementType EOF
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
    // InternalDSL.g:1348:1: ruleStatementType returns [EObject current=null] : ( (lv_name_0_0= 'FLOWS' ) ) ;
    public final EObject ruleStatementType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1354:2: ( ( (lv_name_0_0= 'FLOWS' ) ) )
            // InternalDSL.g:1355:2: ( (lv_name_0_0= 'FLOWS' ) )
            {
            // InternalDSL.g:1355:2: ( (lv_name_0_0= 'FLOWS' ) )
            // InternalDSL.g:1356:3: (lv_name_0_0= 'FLOWS' )
            {
            // InternalDSL.g:1356:3: (lv_name_0_0= 'FLOWS' )
            // InternalDSL.g:1357:4: lv_name_0_0= 'FLOWS'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_2); 

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
    // InternalDSL.g:1372:1: entryRuleStatementModality returns [EObject current=null] : iv_ruleStatementModality= ruleStatementModality EOF ;
    public final EObject entryRuleStatementModality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementModality = null;


        try {
            // InternalDSL.g:1372:58: (iv_ruleStatementModality= ruleStatementModality EOF )
            // InternalDSL.g:1373:2: iv_ruleStatementModality= ruleStatementModality EOF
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
    // InternalDSL.g:1379:1: ruleStatementModality returns [EObject current=null] : ( (lv_name_0_0= 'NEVER' ) ) ;
    public final EObject ruleStatementModality() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1385:2: ( ( (lv_name_0_0= 'NEVER' ) ) )
            // InternalDSL.g:1386:2: ( (lv_name_0_0= 'NEVER' ) )
            {
            // InternalDSL.g:1386:2: ( (lv_name_0_0= 'NEVER' ) )
            // InternalDSL.g:1387:3: (lv_name_0_0= 'NEVER' )
            {
            // InternalDSL.g:1387:3: (lv_name_0_0= 'NEVER' )
            // InternalDSL.g:1388:4: lv_name_0_0= 'NEVER'
            {
            lv_name_0_0=(Token)match(input,35,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCondition"
    // InternalDSL.g:1403:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalDSL.g:1403:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalDSL.g:1404:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalDSL.g:1410:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operation_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1416:2: ( (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) ) )
            // InternalDSL.g:1417:2: (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) )
            {
            // InternalDSL.g:1417:2: (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) )
            // InternalDSL.g:1418:3: otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getWHEREKeyword_0());
            		
            // InternalDSL.g:1422:3: ( (lv_operation_1_0= ruleBooleanOperation ) )
            // InternalDSL.g:1423:4: (lv_operation_1_0= ruleBooleanOperation )
            {
            // InternalDSL.g:1423:4: (lv_operation_1_0= ruleBooleanOperation )
            // InternalDSL.g:1424:5: lv_operation_1_0= ruleBooleanOperation
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperationBooleanOperationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operation_1_0=ruleBooleanOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_1_0,
            						"de.sebinside.dcp.dsl.DSL.BooleanOperation");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCharacteristicReference"
    // InternalDSL.g:1445:1: entryRuleCharacteristicReference returns [EObject current=null] : iv_ruleCharacteristicReference= ruleCharacteristicReference EOF ;
    public final EObject entryRuleCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicReference = null;


        try {
            // InternalDSL.g:1445:64: (iv_ruleCharacteristicReference= ruleCharacteristicReference EOF )
            // InternalDSL.g:1446:2: iv_ruleCharacteristicReference= ruleCharacteristicReference EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicReference=ruleCharacteristicReference();

            state._fsp--;

             current =iv_ruleCharacteristicReference; 
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
    // $ANTLR end "entryRuleCharacteristicReference"


    // $ANTLR start "ruleCharacteristicReference"
    // InternalDSL.g:1452:1: ruleCharacteristicReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCharacteristicReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1458:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDSL.g:1459:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDSL.g:1459:2: ( (otherlv_0= RULE_ID ) )
            // InternalDSL.g:1460:3: (otherlv_0= RULE_ID )
            {
            // InternalDSL.g:1460:3: (otherlv_0= RULE_ID )
            // InternalDSL.g:1461:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCharacteristicReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableCrossReference_0());
            			

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
    // $ANTLR end "ruleCharacteristicReference"


    // $ANTLR start "entryRuleCharacteristicSetReference"
    // InternalDSL.g:1475:1: entryRuleCharacteristicSetReference returns [EObject current=null] : iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF ;
    public final EObject entryRuleCharacteristicSetReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicSetReference = null;


        try {
            // InternalDSL.g:1475:67: (iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF )
            // InternalDSL.g:1476:2: iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicSetReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicSetReference=ruleCharacteristicSetReference();

            state._fsp--;

             current =iv_ruleCharacteristicSetReference; 
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
    // $ANTLR end "entryRuleCharacteristicSetReference"


    // $ANTLR start "ruleCharacteristicSetReference"
    // InternalDSL.g:1482:1: ruleCharacteristicSetReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) ) ;
    public final EObject ruleCharacteristicSetReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1488:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) ) )
            // InternalDSL.g:1489:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) )
            {
            // InternalDSL.g:1489:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==17||LA17_0==42) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDSL.g:1490:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalDSL.g:1490:3: ( (otherlv_0= RULE_ID ) )
                    // InternalDSL.g:1491:4: (otherlv_0= RULE_ID )
                    {
                    // InternalDSL.g:1491:4: (otherlv_0= RULE_ID )
                    // InternalDSL.g:1492:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCharacteristicSetReferenceRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1504:3: ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) )
                    {
                    // InternalDSL.g:1504:3: ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) )
                    // InternalDSL.g:1505:4: (lv_ref_1_0= ruleCharacteristsicSetOperation )
                    {
                    // InternalDSL.g:1505:4: (lv_ref_1_0= ruleCharacteristsicSetOperation )
                    // InternalDSL.g:1506:5: lv_ref_1_0= ruleCharacteristsicSetOperation
                    {

                    					newCompositeNode(grammarAccess.getCharacteristicSetReferenceAccess().getRefCharacteristsicSetOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ref_1_0=ruleCharacteristsicSetOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCharacteristicSetReferenceRule());
                    					}
                    					set(
                    						current,
                    						"ref",
                    						lv_ref_1_0,
                    						"de.sebinside.dcp.dsl.DSL.CharacteristsicSetOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleCharacteristicSetReference"


    // $ANTLR start "entryRuleBooleanOperation"
    // InternalDSL.g:1527:1: entryRuleBooleanOperation returns [EObject current=null] : iv_ruleBooleanOperation= ruleBooleanOperation EOF ;
    public final EObject entryRuleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperation = null;


        try {
            // InternalDSL.g:1527:57: (iv_ruleBooleanOperation= ruleBooleanOperation EOF )
            // InternalDSL.g:1528:2: iv_ruleBooleanOperation= ruleBooleanOperation EOF
            {
             newCompositeNode(grammarAccess.getBooleanOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanOperation=ruleBooleanOperation();

            state._fsp--;

             current =iv_ruleBooleanOperation; 
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
    // $ANTLR end "entryRuleBooleanOperation"


    // $ANTLR start "ruleBooleanOperation"
    // InternalDSL.g:1534:1: ruleBooleanOperation returns [EObject current=null] : (this_LogicalAndOperation_0= ruleLogicalAndOperation | this_LogicalNegationOperation_1= ruleLogicalNegationOperation | this_VariableEqualityOperation_2= ruleVariableEqualityOperation | this_VariableInequalityOperation_3= ruleVariableInequalityOperation | this_EmptySetOperation_4= ruleEmptySetOperation ) ;
    public final EObject ruleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndOperation_0 = null;

        EObject this_LogicalNegationOperation_1 = null;

        EObject this_VariableEqualityOperation_2 = null;

        EObject this_VariableInequalityOperation_3 = null;

        EObject this_EmptySetOperation_4 = null;



        	enterRule();

        try {
            // InternalDSL.g:1540:2: ( (this_LogicalAndOperation_0= ruleLogicalAndOperation | this_LogicalNegationOperation_1= ruleLogicalNegationOperation | this_VariableEqualityOperation_2= ruleVariableEqualityOperation | this_VariableInequalityOperation_3= ruleVariableInequalityOperation | this_EmptySetOperation_4= ruleEmptySetOperation ) )
            // InternalDSL.g:1541:2: (this_LogicalAndOperation_0= ruleLogicalAndOperation | this_LogicalNegationOperation_1= ruleLogicalNegationOperation | this_VariableEqualityOperation_2= ruleVariableEqualityOperation | this_VariableInequalityOperation_3= ruleVariableInequalityOperation | this_EmptySetOperation_4= ruleEmptySetOperation )
            {
            // InternalDSL.g:1541:2: (this_LogicalAndOperation_0= ruleLogicalAndOperation | this_LogicalNegationOperation_1= ruleLogicalNegationOperation | this_VariableEqualityOperation_2= ruleVariableEqualityOperation | this_VariableInequalityOperation_3= ruleVariableInequalityOperation | this_EmptySetOperation_4= ruleEmptySetOperation )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt18=1;
                }
                break;
            case 20:
                {
                alt18=2;
                }
                break;
            case RULE_ID:
                {
                int LA18_3 = input.LA(2);

                if ( (LA18_3==39) ) {
                    alt18=3;
                }
                else if ( (LA18_3==40) ) {
                    alt18=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDSL.g:1542:3: this_LogicalAndOperation_0= ruleLogicalAndOperation
                    {

                    			newCompositeNode(grammarAccess.getBooleanOperationAccess().getLogicalAndOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalAndOperation_0=ruleLogicalAndOperation();

                    state._fsp--;


                    			current = this_LogicalAndOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1551:3: this_LogicalNegationOperation_1= ruleLogicalNegationOperation
                    {

                    			newCompositeNode(grammarAccess.getBooleanOperationAccess().getLogicalNegationOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalNegationOperation_1=ruleLogicalNegationOperation();

                    state._fsp--;


                    			current = this_LogicalNegationOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:1560:3: this_VariableEqualityOperation_2= ruleVariableEqualityOperation
                    {

                    			newCompositeNode(grammarAccess.getBooleanOperationAccess().getVariableEqualityOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableEqualityOperation_2=ruleVariableEqualityOperation();

                    state._fsp--;


                    			current = this_VariableEqualityOperation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:1569:3: this_VariableInequalityOperation_3= ruleVariableInequalityOperation
                    {

                    			newCompositeNode(grammarAccess.getBooleanOperationAccess().getVariableInequalityOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableInequalityOperation_3=ruleVariableInequalityOperation();

                    state._fsp--;


                    			current = this_VariableInequalityOperation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDSL.g:1578:3: this_EmptySetOperation_4= ruleEmptySetOperation
                    {

                    			newCompositeNode(grammarAccess.getBooleanOperationAccess().getEmptySetOperationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmptySetOperation_4=ruleEmptySetOperation();

                    state._fsp--;


                    			current = this_EmptySetOperation_4;
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
    // $ANTLR end "ruleBooleanOperation"


    // $ANTLR start "entryRuleCharacteristsicSetOperation"
    // InternalDSL.g:1590:1: entryRuleCharacteristsicSetOperation returns [EObject current=null] : iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF ;
    public final EObject entryRuleCharacteristsicSetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristsicSetOperation = null;


        try {
            // InternalDSL.g:1590:68: (iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF )
            // InternalDSL.g:1591:2: iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF
            {
             newCompositeNode(grammarAccess.getCharacteristsicSetOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristsicSetOperation=ruleCharacteristsicSetOperation();

            state._fsp--;

             current =iv_ruleCharacteristsicSetOperation; 
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
    // $ANTLR end "entryRuleCharacteristsicSetOperation"


    // $ANTLR start "ruleCharacteristsicSetOperation"
    // InternalDSL.g:1597:1: ruleCharacteristsicSetOperation returns [EObject current=null] : (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation ) ;
    public final EObject ruleCharacteristsicSetOperation() throws RecognitionException {
        EObject current = null;

        EObject this_CreateSetOperation_0 = null;

        EObject this_IntersectionOperation_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:1603:2: ( (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation ) )
            // InternalDSL.g:1604:2: (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation )
            {
            // InternalDSL.g:1604:2: (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            else if ( (LA19_0==42) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDSL.g:1605:3: this_CreateSetOperation_0= ruleCreateSetOperation
                    {

                    			newCompositeNode(grammarAccess.getCharacteristsicSetOperationAccess().getCreateSetOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateSetOperation_0=ruleCreateSetOperation();

                    state._fsp--;


                    			current = this_CreateSetOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1614:3: this_IntersectionOperation_1= ruleIntersectionOperation
                    {

                    			newCompositeNode(grammarAccess.getCharacteristsicSetOperationAccess().getIntersectionOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntersectionOperation_1=ruleIntersectionOperation();

                    state._fsp--;


                    			current = this_IntersectionOperation_1;
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
    // $ANTLR end "ruleCharacteristsicSetOperation"


    // $ANTLR start "entryRuleLogicalAndOperation"
    // InternalDSL.g:1626:1: entryRuleLogicalAndOperation returns [EObject current=null] : iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF ;
    public final EObject entryRuleLogicalAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndOperation = null;


        try {
            // InternalDSL.g:1626:60: (iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF )
            // InternalDSL.g:1627:2: iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF
            {
             newCompositeNode(grammarAccess.getLogicalAndOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAndOperation=ruleLogicalAndOperation();

            state._fsp--;

             current =iv_ruleLogicalAndOperation; 
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
    // $ANTLR end "entryRuleLogicalAndOperation"


    // $ANTLR start "ruleLogicalAndOperation"
    // InternalDSL.g:1633:1: ruleLogicalAndOperation returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleBooleanOperation ) ) otherlv_2= '&' ( (lv_right_3_0= ruleBooleanOperation ) ) otherlv_4= ')' ) ;
    public final EObject ruleLogicalAndOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1639:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleBooleanOperation ) ) otherlv_2= '&' ( (lv_right_3_0= ruleBooleanOperation ) ) otherlv_4= ')' ) )
            // InternalDSL.g:1640:2: (otherlv_0= '(' ( (lv_left_1_0= ruleBooleanOperation ) ) otherlv_2= '&' ( (lv_right_3_0= ruleBooleanOperation ) ) otherlv_4= ')' )
            {
            // InternalDSL.g:1640:2: (otherlv_0= '(' ( (lv_left_1_0= ruleBooleanOperation ) ) otherlv_2= '&' ( (lv_right_3_0= ruleBooleanOperation ) ) otherlv_4= ')' )
            // InternalDSL.g:1641:3: otherlv_0= '(' ( (lv_left_1_0= ruleBooleanOperation ) ) otherlv_2= '&' ( (lv_right_3_0= ruleBooleanOperation ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalAndOperationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDSL.g:1645:3: ( (lv_left_1_0= ruleBooleanOperation ) )
            // InternalDSL.g:1646:4: (lv_left_1_0= ruleBooleanOperation )
            {
            // InternalDSL.g:1646:4: (lv_left_1_0= ruleBooleanOperation )
            // InternalDSL.g:1647:5: lv_left_1_0= ruleBooleanOperation
            {

            					newCompositeNode(grammarAccess.getLogicalAndOperationAccess().getLeftBooleanOperationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_left_1_0=ruleBooleanOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalAndOperationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"de.sebinside.dcp.dsl.DSL.BooleanOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_2());
            		
            // InternalDSL.g:1668:3: ( (lv_right_3_0= ruleBooleanOperation ) )
            // InternalDSL.g:1669:4: (lv_right_3_0= ruleBooleanOperation )
            {
            // InternalDSL.g:1669:4: (lv_right_3_0= ruleBooleanOperation )
            // InternalDSL.g:1670:5: lv_right_3_0= ruleBooleanOperation
            {

            					newCompositeNode(grammarAccess.getLogicalAndOperationAccess().getRightBooleanOperationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_right_3_0=ruleBooleanOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalAndOperationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
            						"de.sebinside.dcp.dsl.DSL.BooleanOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalAndOperationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleLogicalAndOperation"


    // $ANTLR start "entryRuleLogicalNegationOperation"
    // InternalDSL.g:1695:1: entryRuleLogicalNegationOperation returns [EObject current=null] : iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF ;
    public final EObject entryRuleLogicalNegationOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNegationOperation = null;


        try {
            // InternalDSL.g:1695:65: (iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF )
            // InternalDSL.g:1696:2: iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF
            {
             newCompositeNode(grammarAccess.getLogicalNegationOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalNegationOperation=ruleLogicalNegationOperation();

            state._fsp--;

             current =iv_ruleLogicalNegationOperation; 
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
    // $ANTLR end "entryRuleLogicalNegationOperation"


    // $ANTLR start "ruleLogicalNegationOperation"
    // InternalDSL.g:1702:1: ruleLogicalNegationOperation returns [EObject current=null] : (otherlv_0= '!' ( (lv_value_1_0= ruleBooleanOperation ) ) ) ;
    public final EObject ruleLogicalNegationOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1708:2: ( (otherlv_0= '!' ( (lv_value_1_0= ruleBooleanOperation ) ) ) )
            // InternalDSL.g:1709:2: (otherlv_0= '!' ( (lv_value_1_0= ruleBooleanOperation ) ) )
            {
            // InternalDSL.g:1709:2: (otherlv_0= '!' ( (lv_value_1_0= ruleBooleanOperation ) ) )
            // InternalDSL.g:1710:3: otherlv_0= '!' ( (lv_value_1_0= ruleBooleanOperation ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_0());
            		
            // InternalDSL.g:1714:3: ( (lv_value_1_0= ruleBooleanOperation ) )
            // InternalDSL.g:1715:4: (lv_value_1_0= ruleBooleanOperation )
            {
            // InternalDSL.g:1715:4: (lv_value_1_0= ruleBooleanOperation )
            // InternalDSL.g:1716:5: lv_value_1_0= ruleBooleanOperation
            {

            					newCompositeNode(grammarAccess.getLogicalNegationOperationAccess().getValueBooleanOperationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleBooleanOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalNegationOperationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"de.sebinside.dcp.dsl.DSL.BooleanOperation");
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
    // $ANTLR end "ruleLogicalNegationOperation"


    // $ANTLR start "entryRuleVariableEqualityOperation"
    // InternalDSL.g:1737:1: entryRuleVariableEqualityOperation returns [EObject current=null] : iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF ;
    public final EObject entryRuleVariableEqualityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableEqualityOperation = null;


        try {
            // InternalDSL.g:1737:66: (iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF )
            // InternalDSL.g:1738:2: iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF
            {
             newCompositeNode(grammarAccess.getVariableEqualityOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableEqualityOperation=ruleVariableEqualityOperation();

            state._fsp--;

             current =iv_ruleVariableEqualityOperation; 
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
    // $ANTLR end "entryRuleVariableEqualityOperation"


    // $ANTLR start "ruleVariableEqualityOperation"
    // InternalDSL.g:1744:1: ruleVariableEqualityOperation returns [EObject current=null] : ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) ;
    public final EObject ruleVariableEqualityOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1750:2: ( ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) )
            // InternalDSL.g:1751:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            {
            // InternalDSL.g:1751:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            // InternalDSL.g:1752:3: ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) )
            {
            // InternalDSL.g:1752:3: ( (lv_left_0_0= ruleCharacteristicReference ) )
            // InternalDSL.g:1753:4: (lv_left_0_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:1753:4: (lv_left_0_0= ruleCharacteristicReference )
            // InternalDSL.g:1754:5: lv_left_0_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getVariableEqualityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_left_0_0=ruleCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableEqualityOperationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableEqualityOperationAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalDSL.g:1775:3: ( (lv_right_2_0= ruleCharacteristicReference ) )
            // InternalDSL.g:1776:4: (lv_right_2_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:1776:4: (lv_right_2_0= ruleCharacteristicReference )
            // InternalDSL.g:1777:5: lv_right_2_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getVariableEqualityOperationAccess().getRightCharacteristicReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableEqualityOperationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicReference");
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
    // $ANTLR end "ruleVariableEqualityOperation"


    // $ANTLR start "entryRuleVariableInequalityOperation"
    // InternalDSL.g:1798:1: entryRuleVariableInequalityOperation returns [EObject current=null] : iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF ;
    public final EObject entryRuleVariableInequalityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableInequalityOperation = null;


        try {
            // InternalDSL.g:1798:68: (iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF )
            // InternalDSL.g:1799:2: iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF
            {
             newCompositeNode(grammarAccess.getVariableInequalityOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableInequalityOperation=ruleVariableInequalityOperation();

            state._fsp--;

             current =iv_ruleVariableInequalityOperation; 
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
    // $ANTLR end "entryRuleVariableInequalityOperation"


    // $ANTLR start "ruleVariableInequalityOperation"
    // InternalDSL.g:1805:1: ruleVariableInequalityOperation returns [EObject current=null] : ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) ;
    public final EObject ruleVariableInequalityOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1811:2: ( ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) )
            // InternalDSL.g:1812:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            {
            // InternalDSL.g:1812:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            // InternalDSL.g:1813:3: ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) )
            {
            // InternalDSL.g:1813:3: ( (lv_left_0_0= ruleCharacteristicReference ) )
            // InternalDSL.g:1814:4: (lv_left_0_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:1814:4: (lv_left_0_0= ruleCharacteristicReference )
            // InternalDSL.g:1815:5: lv_left_0_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getVariableInequalityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_left_0_0=ruleCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableInequalityOperationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableInequalityOperationAccess().getExclamationMarkEqualsSignKeyword_1());
            		
            // InternalDSL.g:1836:3: ( (lv_right_2_0= ruleCharacteristicReference ) )
            // InternalDSL.g:1837:4: (lv_right_2_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:1837:4: (lv_right_2_0= ruleCharacteristicReference )
            // InternalDSL.g:1838:5: lv_right_2_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getVariableInequalityOperationAccess().getRightCharacteristicReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableInequalityOperationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicReference");
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
    // $ANTLR end "ruleVariableInequalityOperation"


    // $ANTLR start "entryRuleEmptySetOperation"
    // InternalDSL.g:1859:1: entryRuleEmptySetOperation returns [EObject current=null] : iv_ruleEmptySetOperation= ruleEmptySetOperation EOF ;
    public final EObject entryRuleEmptySetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptySetOperation = null;


        try {
            // InternalDSL.g:1859:58: (iv_ruleEmptySetOperation= ruleEmptySetOperation EOF )
            // InternalDSL.g:1860:2: iv_ruleEmptySetOperation= ruleEmptySetOperation EOF
            {
             newCompositeNode(grammarAccess.getEmptySetOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptySetOperation=ruleEmptySetOperation();

            state._fsp--;

             current =iv_ruleEmptySetOperation; 
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
    // $ANTLR end "entryRuleEmptySetOperation"


    // $ANTLR start "ruleEmptySetOperation"
    // InternalDSL.g:1866:1: ruleEmptySetOperation returns [EObject current=null] : (otherlv_0= 'isEmpty(' ( (lv_value_1_0= ruleCharacteristicSetReference ) ) otherlv_2= ')' ) ;
    public final EObject ruleEmptySetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1872:2: ( (otherlv_0= 'isEmpty(' ( (lv_value_1_0= ruleCharacteristicSetReference ) ) otherlv_2= ')' ) )
            // InternalDSL.g:1873:2: (otherlv_0= 'isEmpty(' ( (lv_value_1_0= ruleCharacteristicSetReference ) ) otherlv_2= ')' )
            {
            // InternalDSL.g:1873:2: (otherlv_0= 'isEmpty(' ( (lv_value_1_0= ruleCharacteristicSetReference ) ) otherlv_2= ')' )
            // InternalDSL.g:1874:3: otherlv_0= 'isEmpty(' ( (lv_value_1_0= ruleCharacteristicSetReference ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getEmptySetOperationAccess().getIsEmptyKeyword_0());
            		
            // InternalDSL.g:1878:3: ( (lv_value_1_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:1879:4: (lv_value_1_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:1879:4: (lv_value_1_0= ruleCharacteristicSetReference )
            // InternalDSL.g:1880:5: lv_value_1_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getEmptySetOperationAccess().getValueCharacteristicSetReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_value_1_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmptySetOperationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEmptySetOperationAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleEmptySetOperation"


    // $ANTLR start "entryRuleIntersectionOperation"
    // InternalDSL.g:1905:1: entryRuleIntersectionOperation returns [EObject current=null] : iv_ruleIntersectionOperation= ruleIntersectionOperation EOF ;
    public final EObject entryRuleIntersectionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectionOperation = null;


        try {
            // InternalDSL.g:1905:62: (iv_ruleIntersectionOperation= ruleIntersectionOperation EOF )
            // InternalDSL.g:1906:2: iv_ruleIntersectionOperation= ruleIntersectionOperation EOF
            {
             newCompositeNode(grammarAccess.getIntersectionOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntersectionOperation=ruleIntersectionOperation();

            state._fsp--;

             current =iv_ruleIntersectionOperation; 
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
    // $ANTLR end "entryRuleIntersectionOperation"


    // $ANTLR start "ruleIntersectionOperation"
    // InternalDSL.g:1912:1: ruleIntersectionOperation returns [EObject current=null] : (otherlv_0= 'intersection(' ( (lv_left_1_0= ruleCharacteristicSetReference ) ) otherlv_2= ',' ( (lv_right_3_0= ruleCharacteristicSetReference ) ) otherlv_4= ')' ) ;
    public final EObject ruleIntersectionOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1918:2: ( (otherlv_0= 'intersection(' ( (lv_left_1_0= ruleCharacteristicSetReference ) ) otherlv_2= ',' ( (lv_right_3_0= ruleCharacteristicSetReference ) ) otherlv_4= ')' ) )
            // InternalDSL.g:1919:2: (otherlv_0= 'intersection(' ( (lv_left_1_0= ruleCharacteristicSetReference ) ) otherlv_2= ',' ( (lv_right_3_0= ruleCharacteristicSetReference ) ) otherlv_4= ')' )
            {
            // InternalDSL.g:1919:2: (otherlv_0= 'intersection(' ( (lv_left_1_0= ruleCharacteristicSetReference ) ) otherlv_2= ',' ( (lv_right_3_0= ruleCharacteristicSetReference ) ) otherlv_4= ')' )
            // InternalDSL.g:1920:3: otherlv_0= 'intersection(' ( (lv_left_1_0= ruleCharacteristicSetReference ) ) otherlv_2= ',' ( (lv_right_3_0= ruleCharacteristicSetReference ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getIntersectionOperationAccess().getIntersectionKeyword_0());
            		
            // InternalDSL.g:1924:3: ( (lv_left_1_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:1925:4: (lv_left_1_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:1925:4: (lv_left_1_0= ruleCharacteristicSetReference )
            // InternalDSL.g:1926:5: lv_left_1_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getIntersectionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_left_1_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntersectionOperationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getIntersectionOperationAccess().getCommaKeyword_2());
            		
            // InternalDSL.g:1947:3: ( (lv_right_3_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:1948:4: (lv_right_3_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:1948:4: (lv_right_3_0= ruleCharacteristicSetReference )
            // InternalDSL.g:1949:5: lv_right_3_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getIntersectionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_right_3_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntersectionOperationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIntersectionOperationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleIntersectionOperation"


    // $ANTLR start "entryRuleCreateSetOperation"
    // InternalDSL.g:1974:1: entryRuleCreateSetOperation returns [EObject current=null] : iv_ruleCreateSetOperation= ruleCreateSetOperation EOF ;
    public final EObject entryRuleCreateSetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateSetOperation = null;


        try {
            // InternalDSL.g:1974:59: (iv_ruleCreateSetOperation= ruleCreateSetOperation EOF )
            // InternalDSL.g:1975:2: iv_ruleCreateSetOperation= ruleCreateSetOperation EOF
            {
             newCompositeNode(grammarAccess.getCreateSetOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateSetOperation=ruleCreateSetOperation();

            state._fsp--;

             current =iv_ruleCreateSetOperation; 
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
    // $ANTLR end "entryRuleCreateSetOperation"


    // $ANTLR start "ruleCreateSetOperation"
    // InternalDSL.g:1981:1: ruleCreateSetOperation returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' ) ;
    public final EObject ruleCreateSetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1987:2: ( (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' ) )
            // InternalDSL.g:1988:2: (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' )
            {
            // InternalDSL.g:1988:2: (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' )
            // InternalDSL.g:1989:3: otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateSetOperationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalDSL.g:1993:3: ( (lv_value_1_0= ruleCharacteristicReference ) )
            // InternalDSL.g:1994:4: (lv_value_1_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:1994:4: (lv_value_1_0= ruleCharacteristicReference )
            // InternalDSL.g:1995:5: lv_value_1_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getCreateSetOperationAccess().getValueCharacteristicReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_value_1_0=ruleCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateSetOperationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateSetOperationAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleCreateSetOperation"


    // $ANTLR start "ruleTargetModelType"
    // InternalDSL.g:2020:1: ruleTargetModelType returns [Enumerator current=null] : ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) ) ;
    public final Enumerator ruleTargetModelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:2026:2: ( ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) ) )
            // InternalDSL.g:2027:2: ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) )
            {
            // InternalDSL.g:2027:2: ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt20=1;
                }
                break;
            case 44:
                {
                alt20=2;
                }
                break;
            case 45:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDSL.g:2028:3: (enumLiteral_0= 'OperationModel' )
                    {
                    // InternalDSL.g:2028:3: (enumLiteral_0= 'OperationModel' )
                    // InternalDSL.g:2029:4: enumLiteral_0= 'OperationModel'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:2036:3: (enumLiteral_1= 'DataCentricPalladio' )
                    {
                    // InternalDSL.g:2036:3: (enumLiteral_1= 'DataCentricPalladio' )
                    // InternalDSL.g:2037:4: enumLiteral_1= 'DataCentricPalladio'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:2044:3: (enumLiteral_2= 'ExtendedDFD' )
                    {
                    // InternalDSL.g:2044:3: (enumLiteral_2= 'ExtendedDFD' )
                    // InternalDSL.g:2045:4: enumLiteral_2= 'ExtendedDFD'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000006014022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000B00010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000022000100010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000020010L});

}