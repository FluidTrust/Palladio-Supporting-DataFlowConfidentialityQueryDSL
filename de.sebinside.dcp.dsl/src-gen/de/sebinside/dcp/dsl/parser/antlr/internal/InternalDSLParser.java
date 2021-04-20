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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'target'", "'using'", "','", "'type'", "':'", "'class'", "'{'", "'}'", "'.'", "'!'", "'['", "']'", "'$'", "'{}'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'node.name.'", "'node.identity.'", "'FLOWS'", "'NEVER'", "'WHERE'", "'|'", "'('", "')'", "'=='", "'!='", "'isEmpty'", "'intersection'", "'union'", "'subtract'", "'elementOf'", "'OperationModel'", "'DataCentricPalladio'", "'ExtendedDFD'"
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

                    						newLeafNode(otherlv_3, grammarAccess.getTargetModelTypeDefAccess().getTypeContainerDataDictionaryCharacterizedCrossReference_2_1_0());
                    					

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
                            							setWithLastConsumed(current, "negated", lv_negated_2_0 != null, "!");
                            						

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

                    							newLeafNode(otherlv_3, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_0_1_0());
                    						

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

                    							newLeafNode(otherlv_5, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_1_0());
                    						

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

                    	    								newLeafNode(otherlv_7, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_2_1_0());
                    	    							

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
                    							setWithLastConsumed(current, "isVariableSelector", lv_isVariableSelector_9_0 != null, "$");
                    						

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
    // InternalDSL.g:1194:1: ruleNodeIdentitiySelector returns [EObject current=null] : ( (otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'node.identity.' ( ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( (otherlv_8= RULE_ID ) ) ) ) ) ;
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
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDSL.g:1200:2: ( ( (otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'node.identity.' ( ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( (otherlv_8= RULE_ID ) ) ) ) ) )
            // InternalDSL.g:1201:2: ( (otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'node.identity.' ( ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( (otherlv_8= RULE_ID ) ) ) ) )
            {
            // InternalDSL.g:1201:2: ( (otherlv_0= 'node.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'node.identity.' ( ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( (otherlv_8= RULE_ID ) ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            else if ( (LA17_0==33) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
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
                    // InternalDSL.g:1227:3: (otherlv_2= 'node.identity.' ( ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( (otherlv_8= RULE_ID ) ) ) )
                    {
                    // InternalDSL.g:1227:3: (otherlv_2= 'node.identity.' ( ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( (otherlv_8= RULE_ID ) ) ) )
                    // InternalDSL.g:1228:4: otherlv_2= 'node.identity.' ( ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( (otherlv_8= RULE_ID ) ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeIdentitiySelectorAccess().getNodeIdentityKeyword_1_0());
                    			
                    // InternalDSL.g:1232:4: ( ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( (otherlv_8= RULE_ID ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==19) ) {
                            alt16=1;
                        }
                        else if ( (LA16_1==EOF||LA16_1==18||LA16_1==27||LA16_1==36) ) {
                            alt16=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalDSL.g:1233:5: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
                            {
                            // InternalDSL.g:1233:5: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
                            // InternalDSL.g:1234:6: ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
                            {
                            // InternalDSL.g:1234:6: ( (otherlv_3= RULE_ID ) )
                            // InternalDSL.g:1235:7: (otherlv_3= RULE_ID )
                            {
                            // InternalDSL.g:1235:7: (otherlv_3= RULE_ID )
                            // InternalDSL.g:1236:8: otherlv_3= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                            								newLeafNode(otherlv_3, grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_0_0_0());
                            							

                            }


                            }

                            otherlv_4=(Token)match(input,19,FOLLOW_6); 

                            						newLeafNode(otherlv_4, grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_1_0_1());
                            					
                            // InternalDSL.g:1251:6: ( (otherlv_5= RULE_ID ) )
                            // InternalDSL.g:1252:7: (otherlv_5= RULE_ID )
                            {
                            // InternalDSL.g:1252:7: (otherlv_5= RULE_ID )
                            // InternalDSL.g:1253:8: otherlv_5= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

                            								newLeafNode(otherlv_5, grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_1_0_2_0());
                            							

                            }


                            }

                            otherlv_6=(Token)match(input,19,FOLLOW_6); 

                            						newLeafNode(otherlv_6, grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_1_0_3());
                            					
                            // InternalDSL.g:1268:6: ( (otherlv_7= RULE_ID ) )
                            // InternalDSL.g:1269:7: (otherlv_7= RULE_ID )
                            {
                            // InternalDSL.g:1269:7: (otherlv_7= RULE_ID )
                            // InternalDSL.g:1270:8: otherlv_7= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                            								newLeafNode(otherlv_7, grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationCrossReference_1_1_0_4_0());
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDSL.g:1283:5: ( (otherlv_8= RULE_ID ) )
                            {
                            // InternalDSL.g:1283:5: ( (otherlv_8= RULE_ID ) )
                            // InternalDSL.g:1284:6: (otherlv_8= RULE_ID )
                            {
                            // InternalDSL.g:1284:6: (otherlv_8= RULE_ID )
                            // InternalDSL.g:1285:7: otherlv_8= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            							}
                            						
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(otherlv_8, grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeCharacterizedNodeCrossReference_1_1_1_0());
                            						

                            }


                            }


                            }
                            break;

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
    // InternalDSL.g:1302:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDSL.g:1302:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDSL.g:1303:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalDSL.g:1309:1: ruleStatement returns [EObject current=null] : ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_modality_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1315:2: ( ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) )
            // InternalDSL.g:1316:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            {
            // InternalDSL.g:1316:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            // InternalDSL.g:1317:3: ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) )
            {
            // InternalDSL.g:1317:3: ( (lv_modality_0_0= ruleStatementModality ) )
            // InternalDSL.g:1318:4: (lv_modality_0_0= ruleStatementModality )
            {
            // InternalDSL.g:1318:4: (lv_modality_0_0= ruleStatementModality )
            // InternalDSL.g:1319:5: lv_modality_0_0= ruleStatementModality
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

            // InternalDSL.g:1336:3: ( (lv_type_1_0= ruleStatementType ) )
            // InternalDSL.g:1337:4: (lv_type_1_0= ruleStatementType )
            {
            // InternalDSL.g:1337:4: (lv_type_1_0= ruleStatementType )
            // InternalDSL.g:1338:5: lv_type_1_0= ruleStatementType
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
    // InternalDSL.g:1359:1: entryRuleStatementType returns [EObject current=null] : iv_ruleStatementType= ruleStatementType EOF ;
    public final EObject entryRuleStatementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementType = null;


        try {
            // InternalDSL.g:1359:54: (iv_ruleStatementType= ruleStatementType EOF )
            // InternalDSL.g:1360:2: iv_ruleStatementType= ruleStatementType EOF
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
    // InternalDSL.g:1366:1: ruleStatementType returns [EObject current=null] : ( (lv_name_0_0= 'FLOWS' ) ) ;
    public final EObject ruleStatementType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1372:2: ( ( (lv_name_0_0= 'FLOWS' ) ) )
            // InternalDSL.g:1373:2: ( (lv_name_0_0= 'FLOWS' ) )
            {
            // InternalDSL.g:1373:2: ( (lv_name_0_0= 'FLOWS' ) )
            // InternalDSL.g:1374:3: (lv_name_0_0= 'FLOWS' )
            {
            // InternalDSL.g:1374:3: (lv_name_0_0= 'FLOWS' )
            // InternalDSL.g:1375:4: lv_name_0_0= 'FLOWS'
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
    // InternalDSL.g:1390:1: entryRuleStatementModality returns [EObject current=null] : iv_ruleStatementModality= ruleStatementModality EOF ;
    public final EObject entryRuleStatementModality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementModality = null;


        try {
            // InternalDSL.g:1390:58: (iv_ruleStatementModality= ruleStatementModality EOF )
            // InternalDSL.g:1391:2: iv_ruleStatementModality= ruleStatementModality EOF
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
    // InternalDSL.g:1397:1: ruleStatementModality returns [EObject current=null] : ( (lv_name_0_0= 'NEVER' ) ) ;
    public final EObject ruleStatementModality() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1403:2: ( ( (lv_name_0_0= 'NEVER' ) ) )
            // InternalDSL.g:1404:2: ( (lv_name_0_0= 'NEVER' ) )
            {
            // InternalDSL.g:1404:2: ( (lv_name_0_0= 'NEVER' ) )
            // InternalDSL.g:1405:3: (lv_name_0_0= 'NEVER' )
            {
            // InternalDSL.g:1405:3: (lv_name_0_0= 'NEVER' )
            // InternalDSL.g:1406:4: lv_name_0_0= 'NEVER'
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
    // InternalDSL.g:1421:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalDSL.g:1421:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalDSL.g:1422:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalDSL.g:1428:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operation_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1434:2: ( (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) ) )
            // InternalDSL.g:1435:2: (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) )
            {
            // InternalDSL.g:1435:2: (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) )
            // InternalDSL.g:1436:3: otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getWHEREKeyword_0());
            		
            // InternalDSL.g:1440:3: ( (lv_operation_1_0= ruleBooleanOperation ) )
            // InternalDSL.g:1441:4: (lv_operation_1_0= ruleBooleanOperation )
            {
            // InternalDSL.g:1441:4: (lv_operation_1_0= ruleBooleanOperation )
            // InternalDSL.g:1442:5: lv_operation_1_0= ruleBooleanOperation
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
    // InternalDSL.g:1463:1: entryRuleCharacteristicReference returns [EObject current=null] : iv_ruleCharacteristicReference= ruleCharacteristicReference EOF ;
    public final EObject entryRuleCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicReference = null;


        try {
            // InternalDSL.g:1463:64: (iv_ruleCharacteristicReference= ruleCharacteristicReference EOF )
            // InternalDSL.g:1464:2: iv_ruleCharacteristicReference= ruleCharacteristicReference EOF
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
    // InternalDSL.g:1470:1: ruleCharacteristicReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCharacteristicReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1476:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDSL.g:1477:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDSL.g:1477:2: ( (otherlv_0= RULE_ID ) )
            // InternalDSL.g:1478:3: (otherlv_0= RULE_ID )
            {
            // InternalDSL.g:1478:3: (otherlv_0= RULE_ID )
            // InternalDSL.g:1479:4: otherlv_0= RULE_ID
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
    // InternalDSL.g:1493:1: entryRuleCharacteristicSetReference returns [EObject current=null] : iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF ;
    public final EObject entryRuleCharacteristicSetReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicSetReference = null;


        try {
            // InternalDSL.g:1493:67: (iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF )
            // InternalDSL.g:1494:2: iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF
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
    // InternalDSL.g:1500:1: ruleCharacteristicSetReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) ) ;
    public final EObject ruleCharacteristicSetReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1506:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) ) )
            // InternalDSL.g:1507:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) )
            {
            // InternalDSL.g:1507:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==17||(LA18_0>=43 && LA18_0<=45)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDSL.g:1508:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalDSL.g:1508:3: ( (otherlv_0= RULE_ID ) )
                    // InternalDSL.g:1509:4: (otherlv_0= RULE_ID )
                    {
                    // InternalDSL.g:1509:4: (otherlv_0= RULE_ID )
                    // InternalDSL.g:1510:5: otherlv_0= RULE_ID
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
                    // InternalDSL.g:1522:3: ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) )
                    {
                    // InternalDSL.g:1522:3: ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) )
                    // InternalDSL.g:1523:4: (lv_ref_1_0= ruleCharacteristsicSetOperation )
                    {
                    // InternalDSL.g:1523:4: (lv_ref_1_0= ruleCharacteristsicSetOperation )
                    // InternalDSL.g:1524:5: lv_ref_1_0= ruleCharacteristsicSetOperation
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
    // InternalDSL.g:1545:1: entryRuleBooleanOperation returns [EObject current=null] : iv_ruleBooleanOperation= ruleBooleanOperation EOF ;
    public final EObject entryRuleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperation = null;


        try {
            // InternalDSL.g:1545:57: (iv_ruleBooleanOperation= ruleBooleanOperation EOF )
            // InternalDSL.g:1546:2: iv_ruleBooleanOperation= ruleBooleanOperation EOF
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
    // InternalDSL.g:1552:1: ruleBooleanOperation returns [EObject current=null] : this_LogicalOrOperation_0= ruleLogicalOrOperation ;
    public final EObject ruleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrOperation_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1558:2: (this_LogicalOrOperation_0= ruleLogicalOrOperation )
            // InternalDSL.g:1559:2: this_LogicalOrOperation_0= ruleLogicalOrOperation
            {

            		newCompositeNode(grammarAccess.getBooleanOperationAccess().getLogicalOrOperationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_LogicalOrOperation_0=ruleLogicalOrOperation();

            state._fsp--;


            		current = this_LogicalOrOperation_0;
            		afterParserOrEnumRuleCall();
            	

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
    // InternalDSL.g:1570:1: entryRuleCharacteristsicSetOperation returns [EObject current=null] : iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF ;
    public final EObject entryRuleCharacteristsicSetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristsicSetOperation = null;


        try {
            // InternalDSL.g:1570:68: (iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF )
            // InternalDSL.g:1571:2: iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF
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
    // InternalDSL.g:1577:1: ruleCharacteristsicSetOperation returns [EObject current=null] : (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation ) ;
    public final EObject ruleCharacteristsicSetOperation() throws RecognitionException {
        EObject current = null;

        EObject this_CreateSetOperation_0 = null;

        EObject this_IntersectionOperation_1 = null;

        EObject this_UnionOperation_2 = null;

        EObject this_SubtractOperation_3 = null;



        	enterRule();

        try {
            // InternalDSL.g:1583:2: ( (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation ) )
            // InternalDSL.g:1584:2: (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation )
            {
            // InternalDSL.g:1584:2: (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt19=1;
                }
                break;
            case 43:
                {
                alt19=2;
                }
                break;
            case 44:
                {
                alt19=3;
                }
                break;
            case 45:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDSL.g:1585:3: this_CreateSetOperation_0= ruleCreateSetOperation
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
                    // InternalDSL.g:1594:3: this_IntersectionOperation_1= ruleIntersectionOperation
                    {

                    			newCompositeNode(grammarAccess.getCharacteristsicSetOperationAccess().getIntersectionOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntersectionOperation_1=ruleIntersectionOperation();

                    state._fsp--;


                    			current = this_IntersectionOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:1603:3: this_UnionOperation_2= ruleUnionOperation
                    {

                    			newCompositeNode(grammarAccess.getCharacteristsicSetOperationAccess().getUnionOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnionOperation_2=ruleUnionOperation();

                    state._fsp--;


                    			current = this_UnionOperation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:1612:3: this_SubtractOperation_3= ruleSubtractOperation
                    {

                    			newCompositeNode(grammarAccess.getCharacteristsicSetOperationAccess().getSubtractOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubtractOperation_3=ruleSubtractOperation();

                    state._fsp--;


                    			current = this_SubtractOperation_3;
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


    // $ANTLR start "entryRuleLogicalOrOperation"
    // InternalDSL.g:1624:1: entryRuleLogicalOrOperation returns [EObject current=null] : iv_ruleLogicalOrOperation= ruleLogicalOrOperation EOF ;
    public final EObject entryRuleLogicalOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrOperation = null;


        try {
            // InternalDSL.g:1624:59: (iv_ruleLogicalOrOperation= ruleLogicalOrOperation EOF )
            // InternalDSL.g:1625:2: iv_ruleLogicalOrOperation= ruleLogicalOrOperation EOF
            {
             newCompositeNode(grammarAccess.getLogicalOrOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOrOperation=ruleLogicalOrOperation();

            state._fsp--;

             current =iv_ruleLogicalOrOperation; 
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
    // $ANTLR end "entryRuleLogicalOrOperation"


    // $ANTLR start "ruleLogicalOrOperation"
    // InternalDSL.g:1631:1: ruleLogicalOrOperation returns [EObject current=null] : (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* ) ;
    public final EObject ruleLogicalOrOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1637:2: ( (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* ) )
            // InternalDSL.g:1638:2: (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* )
            {
            // InternalDSL.g:1638:2: (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* )
            // InternalDSL.g:1639:3: this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalOrOperationAccess().getLogicalAndOperationParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_LogicalAndOperation_0=ruleLogicalAndOperation();

            state._fsp--;


            			current = this_LogicalAndOperation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSL.g:1647:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDSL.g:1648:4: () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) )
            	    {
            	    // InternalDSL.g:1648:4: ()
            	    // InternalDSL.g:1649:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicalOrOperationAccess().getLogicalOrOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLogicalOrOperationAccess().getVerticalLineKeyword_1_1());
            	    			
            	    // InternalDSL.g:1659:4: ( (lv_right_3_0= ruleLogicalAndOperation ) )
            	    // InternalDSL.g:1660:5: (lv_right_3_0= ruleLogicalAndOperation )
            	    {
            	    // InternalDSL.g:1660:5: (lv_right_3_0= ruleLogicalAndOperation )
            	    // InternalDSL.g:1661:6: lv_right_3_0= ruleLogicalAndOperation
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalOrOperationAccess().getRightLogicalAndOperationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleLogicalAndOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalOrOperationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.sebinside.dcp.dsl.DSL.LogicalAndOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleLogicalOrOperation"


    // $ANTLR start "entryRuleLogicalAndOperation"
    // InternalDSL.g:1683:1: entryRuleLogicalAndOperation returns [EObject current=null] : iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF ;
    public final EObject entryRuleLogicalAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndOperation = null;


        try {
            // InternalDSL.g:1683:60: (iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF )
            // InternalDSL.g:1684:2: iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF
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
    // InternalDSL.g:1690:1: ruleLogicalAndOperation returns [EObject current=null] : (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* ) ;
    public final EObject ruleLogicalAndOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNegationOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1696:2: ( (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* ) )
            // InternalDSL.g:1697:2: (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* )
            {
            // InternalDSL.g:1697:2: (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* )
            // InternalDSL.g:1698:3: this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalAndOperationAccess().getLogicalNegationOperationParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_LogicalNegationOperation_0=ruleLogicalNegationOperation();

            state._fsp--;


            			current = this_LogicalNegationOperation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSL.g:1706:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDSL.g:1707:4: () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) )
            	    {
            	    // InternalDSL.g:1707:4: ()
            	    // InternalDSL.g:1708:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicalAndOperationAccess().getLogicalAndOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_1_1());
            	    			
            	    // InternalDSL.g:1718:4: ( (lv_right_3_0= ruleLogicalNegationOperation ) )
            	    // InternalDSL.g:1719:5: (lv_right_3_0= ruleLogicalNegationOperation )
            	    {
            	    // InternalDSL.g:1719:5: (lv_right_3_0= ruleLogicalNegationOperation )
            	    // InternalDSL.g:1720:6: lv_right_3_0= ruleLogicalNegationOperation
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalAndOperationAccess().getRightLogicalNegationOperationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleLogicalNegationOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalAndOperationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.sebinside.dcp.dsl.DSL.LogicalNegationOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // InternalDSL.g:1742:1: entryRuleLogicalNegationOperation returns [EObject current=null] : iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF ;
    public final EObject entryRuleLogicalNegationOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNegationOperation = null;


        try {
            // InternalDSL.g:1742:65: (iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF )
            // InternalDSL.g:1743:2: iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF
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
    // InternalDSL.g:1749:1: ruleLogicalNegationOperation returns [EObject current=null] : (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) ) ;
    public final EObject ruleLogicalNegationOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EncapsulatedLogicalOperation_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1755:2: ( (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) ) )
            // InternalDSL.g:1756:2: (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) )
            {
            // InternalDSL.g:1756:2: (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==38||LA22_0==42||LA22_0==46) ) {
                alt22=1;
            }
            else if ( (LA22_0==20) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDSL.g:1757:3: this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation
                    {

                    			newCompositeNode(grammarAccess.getLogicalNegationOperationAccess().getEncapsulatedLogicalOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EncapsulatedLogicalOperation_0=ruleEncapsulatedLogicalOperation();

                    state._fsp--;


                    			current = this_EncapsulatedLogicalOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1766:3: ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) )
                    {
                    // InternalDSL.g:1766:3: ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) )
                    // InternalDSL.g:1767:4: () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) )
                    {
                    // InternalDSL.g:1767:4: ()
                    // InternalDSL.g:1768:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLogicalNegationOperationAccess().getLogicalNegationOperationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalDSL.g:1778:4: ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) )
                    // InternalDSL.g:1779:5: (lv_value_3_0= ruleEncapsulatedLogicalOperation )
                    {
                    // InternalDSL.g:1779:5: (lv_value_3_0= ruleEncapsulatedLogicalOperation )
                    // InternalDSL.g:1780:6: lv_value_3_0= ruleEncapsulatedLogicalOperation
                    {

                    						newCompositeNode(grammarAccess.getLogicalNegationOperationAccess().getValueEncapsulatedLogicalOperationParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEncapsulatedLogicalOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalNegationOperationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"de.sebinside.dcp.dsl.DSL.EncapsulatedLogicalOperation");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleLogicalNegationOperation"


    // $ANTLR start "entryRuleEncapsulatedLogicalOperation"
    // InternalDSL.g:1802:1: entryRuleEncapsulatedLogicalOperation returns [EObject current=null] : iv_ruleEncapsulatedLogicalOperation= ruleEncapsulatedLogicalOperation EOF ;
    public final EObject entryRuleEncapsulatedLogicalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncapsulatedLogicalOperation = null;


        try {
            // InternalDSL.g:1802:69: (iv_ruleEncapsulatedLogicalOperation= ruleEncapsulatedLogicalOperation EOF )
            // InternalDSL.g:1803:2: iv_ruleEncapsulatedLogicalOperation= ruleEncapsulatedLogicalOperation EOF
            {
             newCompositeNode(grammarAccess.getEncapsulatedLogicalOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEncapsulatedLogicalOperation=ruleEncapsulatedLogicalOperation();

            state._fsp--;

             current =iv_ruleEncapsulatedLogicalOperation; 
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
    // $ANTLR end "entryRuleEncapsulatedLogicalOperation"


    // $ANTLR start "ruleEncapsulatedLogicalOperation"
    // InternalDSL.g:1809:1: ruleEncapsulatedLogicalOperation returns [EObject current=null] : (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) ) ;
    public final EObject ruleEncapsulatedLogicalOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_SimpleBooleanOperation_0 = null;

        EObject this_LogicalOrOperation_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:1815:2: ( (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) ) )
            // InternalDSL.g:1816:2: (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) )
            {
            // InternalDSL.g:1816:2: (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==42||LA23_0==46) ) {
                alt23=1;
            }
            else if ( (LA23_0==38) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDSL.g:1817:3: this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation
                    {

                    			newCompositeNode(grammarAccess.getEncapsulatedLogicalOperationAccess().getSimpleBooleanOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleBooleanOperation_0=ruleSimpleBooleanOperation();

                    state._fsp--;


                    			current = this_SimpleBooleanOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1826:3: (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' )
                    {
                    // InternalDSL.g:1826:3: (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' )
                    // InternalDSL.g:1827:4: otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getEncapsulatedLogicalOperationAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getEncapsulatedLogicalOperationAccess().getLogicalOrOperationParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_27);
                    this_LogicalOrOperation_2=ruleLogicalOrOperation();

                    state._fsp--;


                    				current = this_LogicalOrOperation_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEncapsulatedLogicalOperationAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleEncapsulatedLogicalOperation"


    // $ANTLR start "entryRuleSimpleBooleanOperation"
    // InternalDSL.g:1848:1: entryRuleSimpleBooleanOperation returns [EObject current=null] : iv_ruleSimpleBooleanOperation= ruleSimpleBooleanOperation EOF ;
    public final EObject entryRuleSimpleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBooleanOperation = null;


        try {
            // InternalDSL.g:1848:63: (iv_ruleSimpleBooleanOperation= ruleSimpleBooleanOperation EOF )
            // InternalDSL.g:1849:2: iv_ruleSimpleBooleanOperation= ruleSimpleBooleanOperation EOF
            {
             newCompositeNode(grammarAccess.getSimpleBooleanOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleBooleanOperation=ruleSimpleBooleanOperation();

            state._fsp--;

             current =iv_ruleSimpleBooleanOperation; 
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
    // $ANTLR end "entryRuleSimpleBooleanOperation"


    // $ANTLR start "ruleSimpleBooleanOperation"
    // InternalDSL.g:1855:1: ruleSimpleBooleanOperation returns [EObject current=null] : (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation ) ;
    public final EObject ruleSimpleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject this_EmptySetOperation_0 = null;

        EObject this_VariableEqualityOperation_1 = null;

        EObject this_VariableInequalityOperation_2 = null;

        EObject this_ElementOfOperation_3 = null;



        	enterRule();

        try {
            // InternalDSL.g:1861:2: ( (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation ) )
            // InternalDSL.g:1862:2: (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation )
            {
            // InternalDSL.g:1862:2: (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt24=1;
                }
                break;
            case RULE_ID:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==41) ) {
                    alt24=3;
                }
                else if ( (LA24_2==40) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDSL.g:1863:3: this_EmptySetOperation_0= ruleEmptySetOperation
                    {

                    			newCompositeNode(grammarAccess.getSimpleBooleanOperationAccess().getEmptySetOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmptySetOperation_0=ruleEmptySetOperation();

                    state._fsp--;


                    			current = this_EmptySetOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1872:3: this_VariableEqualityOperation_1= ruleVariableEqualityOperation
                    {

                    			newCompositeNode(grammarAccess.getSimpleBooleanOperationAccess().getVariableEqualityOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableEqualityOperation_1=ruleVariableEqualityOperation();

                    state._fsp--;


                    			current = this_VariableEqualityOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:1881:3: this_VariableInequalityOperation_2= ruleVariableInequalityOperation
                    {

                    			newCompositeNode(grammarAccess.getSimpleBooleanOperationAccess().getVariableInequalityOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableInequalityOperation_2=ruleVariableInequalityOperation();

                    state._fsp--;


                    			current = this_VariableInequalityOperation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:1890:3: this_ElementOfOperation_3= ruleElementOfOperation
                    {

                    			newCompositeNode(grammarAccess.getSimpleBooleanOperationAccess().getElementOfOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementOfOperation_3=ruleElementOfOperation();

                    state._fsp--;


                    			current = this_ElementOfOperation_3;
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
    // $ANTLR end "ruleSimpleBooleanOperation"


    // $ANTLR start "entryRuleVariableEqualityOperation"
    // InternalDSL.g:1902:1: entryRuleVariableEqualityOperation returns [EObject current=null] : iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF ;
    public final EObject entryRuleVariableEqualityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableEqualityOperation = null;


        try {
            // InternalDSL.g:1902:66: (iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF )
            // InternalDSL.g:1903:2: iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF
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
    // InternalDSL.g:1909:1: ruleVariableEqualityOperation returns [EObject current=null] : ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) ;
    public final EObject ruleVariableEqualityOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1915:2: ( ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) )
            // InternalDSL.g:1916:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            {
            // InternalDSL.g:1916:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            // InternalDSL.g:1917:3: ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) )
            {
            // InternalDSL.g:1917:3: ( (lv_left_0_0= ruleCharacteristicReference ) )
            // InternalDSL.g:1918:4: (lv_left_0_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:1918:4: (lv_left_0_0= ruleCharacteristicReference )
            // InternalDSL.g:1919:5: lv_left_0_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getVariableEqualityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_1=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableEqualityOperationAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalDSL.g:1940:3: ( (lv_right_2_0= ruleCharacteristicReference ) )
            // InternalDSL.g:1941:4: (lv_right_2_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:1941:4: (lv_right_2_0= ruleCharacteristicReference )
            // InternalDSL.g:1942:5: lv_right_2_0= ruleCharacteristicReference
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
    // InternalDSL.g:1963:1: entryRuleVariableInequalityOperation returns [EObject current=null] : iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF ;
    public final EObject entryRuleVariableInequalityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableInequalityOperation = null;


        try {
            // InternalDSL.g:1963:68: (iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF )
            // InternalDSL.g:1964:2: iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF
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
    // InternalDSL.g:1970:1: ruleVariableInequalityOperation returns [EObject current=null] : ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) ;
    public final EObject ruleVariableInequalityOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1976:2: ( ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) )
            // InternalDSL.g:1977:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            {
            // InternalDSL.g:1977:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            // InternalDSL.g:1978:3: ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) )
            {
            // InternalDSL.g:1978:3: ( (lv_left_0_0= ruleCharacteristicReference ) )
            // InternalDSL.g:1979:4: (lv_left_0_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:1979:4: (lv_left_0_0= ruleCharacteristicReference )
            // InternalDSL.g:1980:5: lv_left_0_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getVariableInequalityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_1=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableInequalityOperationAccess().getExclamationMarkEqualsSignKeyword_1());
            		
            // InternalDSL.g:2001:3: ( (lv_right_2_0= ruleCharacteristicReference ) )
            // InternalDSL.g:2002:4: (lv_right_2_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:2002:4: (lv_right_2_0= ruleCharacteristicReference )
            // InternalDSL.g:2003:5: lv_right_2_0= ruleCharacteristicReference
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
    // InternalDSL.g:2024:1: entryRuleEmptySetOperation returns [EObject current=null] : iv_ruleEmptySetOperation= ruleEmptySetOperation EOF ;
    public final EObject entryRuleEmptySetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptySetOperation = null;


        try {
            // InternalDSL.g:2024:58: (iv_ruleEmptySetOperation= ruleEmptySetOperation EOF )
            // InternalDSL.g:2025:2: iv_ruleEmptySetOperation= ruleEmptySetOperation EOF
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
    // InternalDSL.g:2031:1: ruleEmptySetOperation returns [EObject current=null] : (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleEmptySetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2037:2: ( (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' ) )
            // InternalDSL.g:2038:2: (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' )
            {
            // InternalDSL.g:2038:2: (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' )
            // InternalDSL.g:2039:3: otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEmptySetOperationAccess().getIsEmptyKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptySetOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDSL.g:2047:3: ( (lv_value_2_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:2048:4: (lv_value_2_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:2048:4: (lv_value_2_0= ruleCharacteristicSetReference )
            // InternalDSL.g:2049:5: lv_value_2_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getEmptySetOperationAccess().getValueCharacteristicSetReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_value_2_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmptySetOperationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEmptySetOperationAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalDSL.g:2074:1: entryRuleIntersectionOperation returns [EObject current=null] : iv_ruleIntersectionOperation= ruleIntersectionOperation EOF ;
    public final EObject entryRuleIntersectionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectionOperation = null;


        try {
            // InternalDSL.g:2074:62: (iv_ruleIntersectionOperation= ruleIntersectionOperation EOF )
            // InternalDSL.g:2075:2: iv_ruleIntersectionOperation= ruleIntersectionOperation EOF
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
    // InternalDSL.g:2081:1: ruleIntersectionOperation returns [EObject current=null] : (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
    public final EObject ruleIntersectionOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2087:2: ( (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalDSL.g:2088:2: (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalDSL.g:2088:2: (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalDSL.g:2089:3: otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getIntersectionOperationAccess().getIntersectionKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getIntersectionOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDSL.g:2097:3: ( (lv_left_2_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:2098:4: (lv_left_2_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:2098:4: (lv_left_2_0= ruleCharacteristicSetReference )
            // InternalDSL.g:2099:5: lv_left_2_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getIntersectionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_left_2_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntersectionOperationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getIntersectionOperationAccess().getCommaKeyword_3());
            		
            // InternalDSL.g:2120:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:2121:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:2121:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalDSL.g:2122:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getIntersectionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_right_4_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntersectionOperationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIntersectionOperationAccess().getRightParenthesisKeyword_5());
            		

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


    // $ANTLR start "entryRuleUnionOperation"
    // InternalDSL.g:2147:1: entryRuleUnionOperation returns [EObject current=null] : iv_ruleUnionOperation= ruleUnionOperation EOF ;
    public final EObject entryRuleUnionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionOperation = null;


        try {
            // InternalDSL.g:2147:55: (iv_ruleUnionOperation= ruleUnionOperation EOF )
            // InternalDSL.g:2148:2: iv_ruleUnionOperation= ruleUnionOperation EOF
            {
             newCompositeNode(grammarAccess.getUnionOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnionOperation=ruleUnionOperation();

            state._fsp--;

             current =iv_ruleUnionOperation; 
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
    // $ANTLR end "entryRuleUnionOperation"


    // $ANTLR start "ruleUnionOperation"
    // InternalDSL.g:2154:1: ruleUnionOperation returns [EObject current=null] : (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
    public final EObject ruleUnionOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2160:2: ( (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalDSL.g:2161:2: (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalDSL.g:2161:2: (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalDSL.g:2162:3: otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getUnionOperationAccess().getUnionKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getUnionOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDSL.g:2170:3: ( (lv_left_2_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:2171:4: (lv_left_2_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:2171:4: (lv_left_2_0= ruleCharacteristicSetReference )
            // InternalDSL.g:2172:5: lv_left_2_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getUnionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_left_2_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnionOperationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getUnionOperationAccess().getCommaKeyword_3());
            		
            // InternalDSL.g:2193:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:2194:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:2194:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalDSL.g:2195:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getUnionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_right_4_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnionOperationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUnionOperationAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleUnionOperation"


    // $ANTLR start "entryRuleSubtractOperation"
    // InternalDSL.g:2220:1: entryRuleSubtractOperation returns [EObject current=null] : iv_ruleSubtractOperation= ruleSubtractOperation EOF ;
    public final EObject entryRuleSubtractOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtractOperation = null;


        try {
            // InternalDSL.g:2220:58: (iv_ruleSubtractOperation= ruleSubtractOperation EOF )
            // InternalDSL.g:2221:2: iv_ruleSubtractOperation= ruleSubtractOperation EOF
            {
             newCompositeNode(grammarAccess.getSubtractOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtractOperation=ruleSubtractOperation();

            state._fsp--;

             current =iv_ruleSubtractOperation; 
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
    // $ANTLR end "entryRuleSubtractOperation"


    // $ANTLR start "ruleSubtractOperation"
    // InternalDSL.g:2227:1: ruleSubtractOperation returns [EObject current=null] : (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
    public final EObject ruleSubtractOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2233:2: ( (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalDSL.g:2234:2: (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalDSL.g:2234:2: (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalDSL.g:2235:3: otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSubtractOperationAccess().getSubtractKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getSubtractOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDSL.g:2243:3: ( (lv_left_2_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:2244:4: (lv_left_2_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:2244:4: (lv_left_2_0= ruleCharacteristicSetReference )
            // InternalDSL.g:2245:5: lv_left_2_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getSubtractOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_left_2_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtractOperationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getSubtractOperationAccess().getCommaKeyword_3());
            		
            // InternalDSL.g:2266:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:2267:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:2267:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalDSL.g:2268:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getSubtractOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_right_4_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtractOperationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubtractOperationAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleSubtractOperation"


    // $ANTLR start "entryRuleElementOfOperation"
    // InternalDSL.g:2293:1: entryRuleElementOfOperation returns [EObject current=null] : iv_ruleElementOfOperation= ruleElementOfOperation EOF ;
    public final EObject entryRuleElementOfOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementOfOperation = null;


        try {
            // InternalDSL.g:2293:59: (iv_ruleElementOfOperation= ruleElementOfOperation EOF )
            // InternalDSL.g:2294:2: iv_ruleElementOfOperation= ruleElementOfOperation EOF
            {
             newCompositeNode(grammarAccess.getElementOfOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementOfOperation=ruleElementOfOperation();

            state._fsp--;

             current =iv_ruleElementOfOperation; 
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
    // $ANTLR end "entryRuleElementOfOperation"


    // $ANTLR start "ruleElementOfOperation"
    // InternalDSL.g:2300:1: ruleElementOfOperation returns [EObject current=null] : (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
    public final EObject ruleElementOfOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2306:2: ( (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalDSL.g:2307:2: (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalDSL.g:2307:2: (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalDSL.g:2308:3: otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getElementOfOperationAccess().getElementOfKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getElementOfOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDSL.g:2316:3: ( (lv_left_2_0= ruleCharacteristicReference ) )
            // InternalDSL.g:2317:4: (lv_left_2_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:2317:4: (lv_left_2_0= ruleCharacteristicReference )
            // InternalDSL.g:2318:5: lv_left_2_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getElementOfOperationAccess().getLeftCharacteristicReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_left_2_0=ruleCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementOfOperationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getElementOfOperationAccess().getCommaKeyword_3());
            		
            // InternalDSL.g:2339:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalDSL.g:2340:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalDSL.g:2340:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalDSL.g:2341:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getElementOfOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_right_4_0=ruleCharacteristicSetReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementOfOperationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSetReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getElementOfOperationAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleElementOfOperation"


    // $ANTLR start "entryRuleCreateSetOperation"
    // InternalDSL.g:2366:1: entryRuleCreateSetOperation returns [EObject current=null] : iv_ruleCreateSetOperation= ruleCreateSetOperation EOF ;
    public final EObject entryRuleCreateSetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateSetOperation = null;


        try {
            // InternalDSL.g:2366:59: (iv_ruleCreateSetOperation= ruleCreateSetOperation EOF )
            // InternalDSL.g:2367:2: iv_ruleCreateSetOperation= ruleCreateSetOperation EOF
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
    // InternalDSL.g:2373:1: ruleCreateSetOperation returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' ) ;
    public final EObject ruleCreateSetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2379:2: ( (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' ) )
            // InternalDSL.g:2380:2: (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' )
            {
            // InternalDSL.g:2380:2: (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' )
            // InternalDSL.g:2381:3: otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateSetOperationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalDSL.g:2385:3: ( (lv_value_1_0= ruleCharacteristicReference ) )
            // InternalDSL.g:2386:4: (lv_value_1_0= ruleCharacteristicReference )
            {
            // InternalDSL.g:2386:4: (lv_value_1_0= ruleCharacteristicReference )
            // InternalDSL.g:2387:5: lv_value_1_0= ruleCharacteristicReference
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
    // InternalDSL.g:2412:1: ruleTargetModelType returns [Enumerator current=null] : ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) ) ;
    public final Enumerator ruleTargetModelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:2418:2: ( ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) ) )
            // InternalDSL.g:2419:2: ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) )
            {
            // InternalDSL.g:2419:2: ( (enumLiteral_0= 'OperationModel' ) | (enumLiteral_1= 'DataCentricPalladio' ) | (enumLiteral_2= 'ExtendedDFD' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt25=1;
                }
                break;
            case 48:
                {
                alt25=2;
                }
                break;
            case 49:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDSL.g:2420:3: (enumLiteral_0= 'OperationModel' )
                    {
                    // InternalDSL.g:2420:3: (enumLiteral_0= 'OperationModel' )
                    // InternalDSL.g:2421:4: enumLiteral_0= 'OperationModel'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:2428:3: (enumLiteral_1= 'DataCentricPalladio' )
                    {
                    // InternalDSL.g:2428:3: (enumLiteral_1= 'DataCentricPalladio' )
                    // InternalDSL.g:2429:4: enumLiteral_1= 'DataCentricPalladio'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:2436:3: (enumLiteral_2= 'ExtendedDFD' )
                    {
                    // InternalDSL.g:2436:3: (enumLiteral_2= 'ExtendedDFD' )
                    // InternalDSL.g:2437:4: enumLiteral_2= 'ExtendedDFD'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0003800000000000L});
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
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000444000100010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000444000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000380000020010L});

}