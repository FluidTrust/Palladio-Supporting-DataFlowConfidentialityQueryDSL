package org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.services.PCMDFDConstraintLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPCMDFDConstraintLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'target'", "'PCMDFD'", "'using'", "','", "'component.property.'", "'component.class.'", "'component.name.'", "'component.identity.'", "'Component.'", "'.'", "'Action.'", "'SEFF.'", "'UserAction.'", "'Store.'", "'type'", "':'", "'class'", "'{'", "'}'", "'!'", "'['", "']'", "'$'", "'{}'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'FLOWS'", "'NEVER'", "'WHERE'", "'|'", "'('", "')'", "'=='", "'!='", "'isEmpty'", "'intersection'", "'union'", "'subtract'", "'elementOf'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=6;
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


        public InternalPCMDFDConstraintLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPCMDFDConstraintLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPCMDFDConstraintLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPCMDFDConstraintLanguage.g"; }



     	private PCMDFDConstraintLanguageGrammarAccess grammarAccess;

        public InternalPCMDFDConstraintLanguageParser(TokenStream input, PCMDFDConstraintLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PCMDFDConstraintLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPCMDFDConstraintLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPCMDFDConstraintLanguage.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalPCMDFDConstraintLanguage.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_targetModelType_0_0 = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:77:2: ( ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* ) )
            // InternalPCMDFDConstraintLanguage.g:78:2: ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* )
            {
            // InternalPCMDFDConstraintLanguage.g:78:2: ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )? ( (lv_elements_1_0= ruleAbstractElement ) )* )
            // InternalPCMDFDConstraintLanguage.g:79:3: ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )? ( (lv_elements_1_0= ruleAbstractElement ) )*
            {
            // InternalPCMDFDConstraintLanguage.g:79:3: ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:80:4: (lv_targetModelType_0_0= ruleTargetModelTypeDef )
                    {
                    // InternalPCMDFDConstraintLanguage.g:80:4: (lv_targetModelType_0_0= ruleTargetModelTypeDef )
                    // InternalPCMDFDConstraintLanguage.g:81:5: lv_targetModelType_0_0= ruleTargetModelTypeDef
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
                    						"org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.PCMDFDConstraintLanguage.TargetModelTypeDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPCMDFDConstraintLanguage.g:98:3: ( (lv_elements_1_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_SL_COMMENT||LA2_0==25||LA2_0==27||(LA2_0>=35 && LA2_0<=36)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:99:4: (lv_elements_1_0= ruleAbstractElement )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:99:4: (lv_elements_1_0= ruleAbstractElement )
            	    // InternalPCMDFDConstraintLanguage.g:100:5: lv_elements_1_0= ruleAbstractElement
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
    // InternalPCMDFDConstraintLanguage.g:121:1: entryRuleTargetModelTypeDef returns [EObject current=null] : iv_ruleTargetModelTypeDef= ruleTargetModelTypeDef EOF ;
    public final EObject entryRuleTargetModelTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetModelTypeDef = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:121:59: (iv_ruleTargetModelTypeDef= ruleTargetModelTypeDef EOF )
            // InternalPCMDFDConstraintLanguage.g:122:2: iv_ruleTargetModelTypeDef= ruleTargetModelTypeDef EOF
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
    // InternalPCMDFDConstraintLanguage.g:128:1: ruleTargetModelTypeDef returns [EObject current=null] : (otherlv_0= 'target' ( (lv_type_1_0= 'PCMDFD' ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? ) ;
    public final EObject ruleTargetModelTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:134:2: ( (otherlv_0= 'target' ( (lv_type_1_0= 'PCMDFD' ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? ) )
            // InternalPCMDFDConstraintLanguage.g:135:2: (otherlv_0= 'target' ( (lv_type_1_0= 'PCMDFD' ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )
            {
            // InternalPCMDFDConstraintLanguage.g:135:2: (otherlv_0= 'target' ( (lv_type_1_0= 'PCMDFD' ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )
            // InternalPCMDFDConstraintLanguage.g:136:3: otherlv_0= 'target' ( (lv_type_1_0= 'PCMDFD' ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetModelTypeDefAccess().getTargetKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:140:3: ( (lv_type_1_0= 'PCMDFD' ) )
            // InternalPCMDFDConstraintLanguage.g:141:4: (lv_type_1_0= 'PCMDFD' )
            {
            // InternalPCMDFDConstraintLanguage.g:141:4: (lv_type_1_0= 'PCMDFD' )
            // InternalPCMDFDConstraintLanguage.g:142:5: lv_type_1_0= 'PCMDFD'
            {
            lv_type_1_0=(Token)match(input,12,FOLLOW_5); 

            					newLeafNode(lv_type_1_0, grammarAccess.getTargetModelTypeDefAccess().getTypePCMDFDKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "PCMDFD");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetModelTypeDefAccess().getUsingKeyword_2());
            		
            // InternalPCMDFDConstraintLanguage.g:158:3: ( (otherlv_3= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:159:4: (otherlv_3= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:159:4: (otherlv_3= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:160:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getTargetModelTypeDefAccess().getPcmTypeContainerCharacteristicTypeDictionaryCrossReference_3_0());
            				

            }


            }

            // InternalPCMDFDConstraintLanguage.g:171:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:172:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_4_0());
                    			
                    // InternalPCMDFDConstraintLanguage.g:176:4: ( (otherlv_5= RULE_ID ) )
                    // InternalPCMDFDConstraintLanguage.g:177:5: (otherlv_5= RULE_ID )
                    {
                    // InternalPCMDFDConstraintLanguage.g:177:5: (otherlv_5= RULE_ID )
                    // InternalPCMDFDConstraintLanguage.g:178:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_5, grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelCrossReference_4_1_0());
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_4_2());
                    			
                    // InternalPCMDFDConstraintLanguage.g:193:4: ( (otherlv_7= RULE_ID ) )
                    // InternalPCMDFDConstraintLanguage.g:194:5: (otherlv_7= RULE_ID )
                    {
                    // InternalPCMDFDConstraintLanguage.g:194:5: (otherlv_7= RULE_ID )
                    // InternalPCMDFDConstraintLanguage.g:195:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getTargetModelTypeDefAccess().getRepositoryModelRepositoryCrossReference_4_3_0());
                    					

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
    // $ANTLR end "ruleTargetModelTypeDef"


    // $ANTLR start "entryRulePropertySelector"
    // InternalPCMDFDConstraintLanguage.g:211:1: entryRulePropertySelector returns [EObject current=null] : iv_rulePropertySelector= rulePropertySelector EOF ;
    public final EObject entryRulePropertySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:211:57: (iv_rulePropertySelector= rulePropertySelector EOF )
            // InternalPCMDFDConstraintLanguage.g:212:2: iv_rulePropertySelector= rulePropertySelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:218:1: rulePropertySelector returns [EObject current=null] : (otherlv_0= 'component.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) ;
    public final EObject rulePropertySelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:224:2: ( (otherlv_0= 'component.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:225:2: (otherlv_0= 'component.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:225:2: (otherlv_0= 'component.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            // InternalPCMDFDConstraintLanguage.g:226:3: otherlv_0= 'component.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertySelectorAccess().getComponentPropertyKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:230:3: ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            // InternalPCMDFDConstraintLanguage.g:231:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:231:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            // InternalPCMDFDConstraintLanguage.g:232:5: lv_ref_1_0= ruleCharacteristicTypeSelector
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
    // InternalPCMDFDConstraintLanguage.g:253:1: entryRulePropertyClassSelector returns [EObject current=null] : iv_rulePropertyClassSelector= rulePropertyClassSelector EOF ;
    public final EObject entryRulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyClassSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:253:62: (iv_rulePropertyClassSelector= rulePropertyClassSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:254:2: iv_rulePropertyClassSelector= rulePropertyClassSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:260:1: rulePropertyClassSelector returns [EObject current=null] : (otherlv_0= 'component.class.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:266:2: ( (otherlv_0= 'component.class.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:267:2: (otherlv_0= 'component.class.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:267:2: (otherlv_0= 'component.class.' ( (otherlv_1= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:268:3: otherlv_0= 'component.class.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyClassSelectorAccess().getComponentClassKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:272:3: ( (otherlv_1= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:273:4: (otherlv_1= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:273:4: (otherlv_1= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:274:5: otherlv_1= RULE_ID
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
    // InternalPCMDFDConstraintLanguage.g:289:1: entryRuleNodeIdentitiySelector returns [EObject current=null] : iv_ruleNodeIdentitiySelector= ruleNodeIdentitiySelector EOF ;
    public final EObject entryRuleNodeIdentitiySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeIdentitiySelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:289:62: (iv_ruleNodeIdentitiySelector= ruleNodeIdentitiySelector EOF )
            // InternalPCMDFDConstraintLanguage.g:290:2: iv_ruleNodeIdentitiySelector= ruleNodeIdentitiySelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:296:1: ruleNodeIdentitiySelector returns [EObject current=null] : ( (otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'component.identity.' ( (otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) ) ) | (otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) ) ) ) ) ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:302:2: ( ( (otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'component.identity.' ( (otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) ) ) | (otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:303:2: ( (otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'component.identity.' ( (otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) ) ) | (otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) ) ) ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:303:2: ( (otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) ) ) | (otherlv_2= 'component.identity.' ( (otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) ) ) | (otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) ) ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:304:3: (otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:304:3: (otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) ) )
                    // InternalPCMDFDConstraintLanguage.g:305:4: otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getNodeIdentitiySelectorAccess().getComponentNameKeyword_0_0());
                    			
                    // InternalPCMDFDConstraintLanguage.g:309:4: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalPCMDFDConstraintLanguage.g:310:5: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalPCMDFDConstraintLanguage.g:310:5: (lv_name_1_0= RULE_STRING )
                    // InternalPCMDFDConstraintLanguage.g:311:6: lv_name_1_0= RULE_STRING
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
                    // InternalPCMDFDConstraintLanguage.g:329:3: (otherlv_2= 'component.identity.' ( (otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) ) ) | (otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) ) ) ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:329:3: (otherlv_2= 'component.identity.' ( (otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) ) ) | (otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) ) ) ) )
                    // InternalPCMDFDConstraintLanguage.g:330:4: otherlv_2= 'component.identity.' ( (otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) ) ) | (otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) ) ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeIdentitiySelectorAccess().getComponentIdentityKeyword_1_0());
                    			
                    // InternalPCMDFDConstraintLanguage.g:334:4: ( (otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) ) ) | (otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) ) ) )
                    int alt4=5;
                    switch ( input.LA(1) ) {
                    case 19:
                        {
                        alt4=1;
                        }
                        break;
                    case 21:
                        {
                        alt4=2;
                        }
                        break;
                    case 22:
                        {
                        alt4=3;
                        }
                        break;
                    case 23:
                        {
                        alt4=4;
                        }
                        break;
                    case 24:
                        {
                        alt4=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }

                    switch (alt4) {
                        case 1 :
                            // InternalPCMDFDConstraintLanguage.g:335:5: (otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )
                            {
                            // InternalPCMDFDConstraintLanguage.g:335:5: (otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )
                            // InternalPCMDFDConstraintLanguage.g:336:6: otherlv_3= 'Component.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) )
                            {
                            otherlv_3=(Token)match(input,19,FOLLOW_6); 

                            						newLeafNode(otherlv_3, grammarAccess.getNodeIdentitiySelectorAccess().getComponentKeyword_1_1_0_0());
                            					
                            // InternalPCMDFDConstraintLanguage.g:340:6: ( (otherlv_4= RULE_ID ) )
                            // InternalPCMDFDConstraintLanguage.g:341:7: (otherlv_4= RULE_ID )
                            {
                            // InternalPCMDFDConstraintLanguage.g:341:7: (otherlv_4= RULE_ID )
                            // InternalPCMDFDConstraintLanguage.g:342:8: otherlv_4= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                            								newLeafNode(otherlv_4, grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_0_1_0());
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,20,FOLLOW_6); 

                            						newLeafNode(otherlv_5, grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_1_0_2());
                            					
                            // InternalPCMDFDConstraintLanguage.g:357:6: ( (otherlv_6= RULE_ID ) )
                            // InternalPCMDFDConstraintLanguage.g:358:7: (otherlv_6= RULE_ID )
                            {
                            // InternalPCMDFDConstraintLanguage.g:358:7: (otherlv_6= RULE_ID )
                            // InternalPCMDFDConstraintLanguage.g:359:8: otherlv_6= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                            								newLeafNode(otherlv_6, grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_1_0_3_0());
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPCMDFDConstraintLanguage.g:372:5: (otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) ) )
                            {
                            // InternalPCMDFDConstraintLanguage.g:372:5: (otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) ) )
                            // InternalPCMDFDConstraintLanguage.g:373:6: otherlv_7= 'Action.' ( (otherlv_8= RULE_ID ) )
                            {
                            otherlv_7=(Token)match(input,21,FOLLOW_6); 

                            						newLeafNode(otherlv_7, grammarAccess.getNodeIdentitiySelectorAccess().getActionKeyword_1_1_1_0());
                            					
                            // InternalPCMDFDConstraintLanguage.g:377:6: ( (otherlv_8= RULE_ID ) )
                            // InternalPCMDFDConstraintLanguage.g:378:7: (otherlv_8= RULE_ID )
                            {
                            // InternalPCMDFDConstraintLanguage.g:378:7: (otherlv_8= RULE_ID )
                            // InternalPCMDFDConstraintLanguage.g:379:8: otherlv_8= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                            								newLeafNode(otherlv_8, grammarAccess.getNodeIdentitiySelectorAccess().getActionAbstractActionCrossReference_1_1_1_1_0());
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPCMDFDConstraintLanguage.g:392:5: (otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) ) )
                            {
                            // InternalPCMDFDConstraintLanguage.g:392:5: (otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) ) )
                            // InternalPCMDFDConstraintLanguage.g:393:6: otherlv_9= 'SEFF.' ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' ( (otherlv_12= RULE_ID ) ) otherlv_13= '.' ( (otherlv_14= RULE_ID ) )
                            {
                            otherlv_9=(Token)match(input,22,FOLLOW_6); 

                            						newLeafNode(otherlv_9, grammarAccess.getNodeIdentitiySelectorAccess().getSEFFKeyword_1_1_2_0());
                            					
                            // InternalPCMDFDConstraintLanguage.g:397:6: ( (otherlv_10= RULE_ID ) )
                            // InternalPCMDFDConstraintLanguage.g:398:7: (otherlv_10= RULE_ID )
                            {
                            // InternalPCMDFDConstraintLanguage.g:398:7: (otherlv_10= RULE_ID )
                            // InternalPCMDFDConstraintLanguage.g:399:8: otherlv_10= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                            								newLeafNode(otherlv_10, grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_2_1_0());
                            							

                            }


                            }

                            otherlv_11=(Token)match(input,20,FOLLOW_6); 

                            						newLeafNode(otherlv_11, grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_1_2_2());
                            					
                            // InternalPCMDFDConstraintLanguage.g:414:6: ( (otherlv_12= RULE_ID ) )
                            // InternalPCMDFDConstraintLanguage.g:415:7: (otherlv_12= RULE_ID )
                            {
                            // InternalPCMDFDConstraintLanguage.g:415:7: (otherlv_12= RULE_ID )
                            // InternalPCMDFDConstraintLanguage.g:416:8: otherlv_12= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

                            								newLeafNode(otherlv_12, grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_1_2_3_0());
                            							

                            }


                            }

                            otherlv_13=(Token)match(input,20,FOLLOW_6); 

                            						newLeafNode(otherlv_13, grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_1_2_4());
                            					
                            // InternalPCMDFDConstraintLanguage.g:431:6: ( (otherlv_14= RULE_ID ) )
                            // InternalPCMDFDConstraintLanguage.g:432:7: (otherlv_14= RULE_ID )
                            {
                            // InternalPCMDFDConstraintLanguage.g:432:7: (otherlv_14= RULE_ID )
                            // InternalPCMDFDConstraintLanguage.g:433:8: otherlv_14= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_2); 

                            								newLeafNode(otherlv_14, grammarAccess.getNodeIdentitiySelectorAccess().getSignatureOperationSignatureCrossReference_1_1_2_5_0());
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalPCMDFDConstraintLanguage.g:446:5: (otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) ) )
                            {
                            // InternalPCMDFDConstraintLanguage.g:446:5: (otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) ) )
                            // InternalPCMDFDConstraintLanguage.g:447:6: otherlv_15= 'UserAction.' ( (otherlv_16= RULE_ID ) )
                            {
                            otherlv_15=(Token)match(input,23,FOLLOW_6); 

                            						newLeafNode(otherlv_15, grammarAccess.getNodeIdentitiySelectorAccess().getUserActionKeyword_1_1_3_0());
                            					
                            // InternalPCMDFDConstraintLanguage.g:451:6: ( (otherlv_16= RULE_ID ) )
                            // InternalPCMDFDConstraintLanguage.g:452:7: (otherlv_16= RULE_ID )
                            {
                            // InternalPCMDFDConstraintLanguage.g:452:7: (otherlv_16= RULE_ID )
                            // InternalPCMDFDConstraintLanguage.g:453:8: otherlv_16= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_2); 

                            								newLeafNode(otherlv_16, grammarAccess.getNodeIdentitiySelectorAccess().getUserActionEntryLevelSystemCallCrossReference_1_1_3_1_0());
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalPCMDFDConstraintLanguage.g:466:5: (otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) ) )
                            {
                            // InternalPCMDFDConstraintLanguage.g:466:5: (otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) ) )
                            // InternalPCMDFDConstraintLanguage.g:467:6: otherlv_17= 'Store.' ( (otherlv_18= RULE_ID ) ) otherlv_19= '.' ( (otherlv_20= RULE_ID ) )
                            {
                            otherlv_17=(Token)match(input,24,FOLLOW_6); 

                            						newLeafNode(otherlv_17, grammarAccess.getNodeIdentitiySelectorAccess().getStoreKeyword_1_1_4_0());
                            					
                            // InternalPCMDFDConstraintLanguage.g:471:6: ( (otherlv_18= RULE_ID ) )
                            // InternalPCMDFDConstraintLanguage.g:472:7: (otherlv_18= RULE_ID )
                            {
                            // InternalPCMDFDConstraintLanguage.g:472:7: (otherlv_18= RULE_ID )
                            // InternalPCMDFDConstraintLanguage.g:473:8: otherlv_18= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_11); 

                            								newLeafNode(otherlv_18, grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_4_1_0());
                            							

                            }


                            }

                            otherlv_19=(Token)match(input,20,FOLLOW_6); 

                            						newLeafNode(otherlv_19, grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_1_4_2());
                            					
                            // InternalPCMDFDConstraintLanguage.g:488:6: ( (otherlv_20= RULE_ID ) )
                            // InternalPCMDFDConstraintLanguage.g:489:7: (otherlv_20= RULE_ID )
                            {
                            // InternalPCMDFDConstraintLanguage.g:489:7: (otherlv_20= RULE_ID )
                            // InternalPCMDFDConstraintLanguage.g:490:8: otherlv_20= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
                            								}
                            							
                            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_2); 

                            								newLeafNode(otherlv_20, grammarAccess.getNodeIdentitiySelectorAccess().getStoreOperationalDataStoreComponentCrossReference_1_1_4_3_0());
                            							

                            }


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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalPCMDFDConstraintLanguage.g:508:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:508:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalPCMDFDConstraintLanguage.g:509:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // InternalPCMDFDConstraintLanguage.g:515:1: ruleAbstractElement returns [EObject current=null] : (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_5=null;
        EObject this_Include_0 = null;

        EObject this_CharacteristicType_1 = null;

        EObject this_CharacteristicClass_2 = null;

        EObject this_Constraint_3 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:521:2: ( (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) ) )
            // InternalPCMDFDConstraintLanguage.g:522:2: (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) )
            {
            // InternalPCMDFDConstraintLanguage.g:522:2: (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 36:
                {
                alt6=4;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:523:3: this_Include_0= ruleInclude
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
                    // InternalPCMDFDConstraintLanguage.g:532:3: this_CharacteristicType_1= ruleCharacteristicType
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
                    // InternalPCMDFDConstraintLanguage.g:541:3: this_CharacteristicClass_2= ruleCharacteristicClass
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
                    // InternalPCMDFDConstraintLanguage.g:550:3: this_Constraint_3= ruleConstraint
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
                    // InternalPCMDFDConstraintLanguage.g:559:3: ( () this_SL_COMMENT_5= RULE_SL_COMMENT )
                    {
                    // InternalPCMDFDConstraintLanguage.g:559:3: ( () this_SL_COMMENT_5= RULE_SL_COMMENT )
                    // InternalPCMDFDConstraintLanguage.g:560:4: () this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    // InternalPCMDFDConstraintLanguage.g:560:4: ()
                    // InternalPCMDFDConstraintLanguage.g:561:5: 
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
    // InternalPCMDFDConstraintLanguage.g:576:1: entryRuleCharacteristicType returns [EObject current=null] : iv_ruleCharacteristicType= ruleCharacteristicType EOF ;
    public final EObject entryRuleCharacteristicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicType = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:576:59: (iv_ruleCharacteristicType= ruleCharacteristicType EOF )
            // InternalPCMDFDConstraintLanguage.g:577:2: iv_ruleCharacteristicType= ruleCharacteristicType EOF
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
    // InternalPCMDFDConstraintLanguage.g:583:1: ruleCharacteristicType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCharacteristicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:589:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:590:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:590:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:591:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:595:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:596:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:596:4: (lv_name_1_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:597:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2());
            		
            // InternalPCMDFDConstraintLanguage.g:617:3: ( (otherlv_3= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:618:4: (otherlv_3= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:618:4: (otherlv_3= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:619:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicTypeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getCharacteristicTypeAccess().getRefEnumCharacteristicTypeCrossReference_3_0());
            				

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
    // InternalPCMDFDConstraintLanguage.g:634:1: entryRuleCharacteristicClass returns [EObject current=null] : iv_ruleCharacteristicClass= ruleCharacteristicClass EOF ;
    public final EObject entryRuleCharacteristicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicClass = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:634:60: (iv_ruleCharacteristicClass= ruleCharacteristicClass EOF )
            // InternalPCMDFDConstraintLanguage.g:635:2: iv_ruleCharacteristicClass= ruleCharacteristicClass EOF
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
    // InternalPCMDFDConstraintLanguage.g:641:1: ruleCharacteristicClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' ) ;
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
            // InternalPCMDFDConstraintLanguage.g:647:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' ) )
            // InternalPCMDFDConstraintLanguage.g:648:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' )
            {
            // InternalPCMDFDConstraintLanguage.g:648:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' )
            // InternalPCMDFDConstraintLanguage.g:649:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicClassAccess().getClassKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:653:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:654:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:654:4: (lv_name_1_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:655:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPCMDFDConstraintLanguage.g:675:3: ( (lv_members_3_0= ruleCharacteristicTypeSelector ) )
            // InternalPCMDFDConstraintLanguage.g:676:4: (lv_members_3_0= ruleCharacteristicTypeSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:676:4: (lv_members_3_0= ruleCharacteristicTypeSelector )
            // InternalPCMDFDConstraintLanguage.g:677:5: lv_members_3_0= ruleCharacteristicTypeSelector
            {

            					newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalPCMDFDConstraintLanguage.g:694:3: (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:695:4: otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPCMDFDConstraintLanguage.g:699:4: ( (lv_members_5_0= ruleCharacteristicTypeSelector ) )
            	    // InternalPCMDFDConstraintLanguage.g:700:5: (lv_members_5_0= ruleCharacteristicTypeSelector )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:700:5: (lv_members_5_0= ruleCharacteristicTypeSelector )
            	    // InternalPCMDFDConstraintLanguage.g:701:6: lv_members_5_0= ruleCharacteristicTypeSelector
            	    {

            	    						newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:727:1: entryRuleCharacteristicTypeSelector returns [EObject current=null] : iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF ;
    public final EObject entryRuleCharacteristicTypeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicTypeSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:727:67: (iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:728:2: iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:734:1: ruleCharacteristicTypeSelector returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) ) ;
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
            // InternalPCMDFDConstraintLanguage.g:740:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:741:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:741:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:742:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:742:3: ( (otherlv_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:743:4: (otherlv_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:743:4: (otherlv_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:744:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:759:3: ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:760:4: ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:760:4: ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) )
                    // InternalPCMDFDConstraintLanguage.g:761:5: ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:761:5: ( (lv_negated_2_0= '!' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==30) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalPCMDFDConstraintLanguage.g:762:6: (lv_negated_2_0= '!' )
                            {
                            // InternalPCMDFDConstraintLanguage.g:762:6: (lv_negated_2_0= '!' )
                            // InternalPCMDFDConstraintLanguage.g:763:7: lv_negated_2_0= '!'
                            {
                            lv_negated_2_0=(Token)match(input,30,FOLLOW_6); 

                            							newLeafNode(lv_negated_2_0, grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                            							}
                            							setWithLastConsumed(current, "negated", lv_negated_2_0 != null, "!");
                            						

                            }


                            }
                            break;

                    }

                    // InternalPCMDFDConstraintLanguage.g:775:5: ( (otherlv_3= RULE_ID ) )
                    // InternalPCMDFDConstraintLanguage.g:776:6: (otherlv_3= RULE_ID )
                    {
                    // InternalPCMDFDConstraintLanguage.g:776:6: (otherlv_3= RULE_ID )
                    // InternalPCMDFDConstraintLanguage.g:777:7: otherlv_3= RULE_ID
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
                    // InternalPCMDFDConstraintLanguage.g:790:4: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )
                    {
                    // InternalPCMDFDConstraintLanguage.g:790:4: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )
                    // InternalPCMDFDConstraintLanguage.g:791:5: otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalPCMDFDConstraintLanguage.g:795:5: ( (otherlv_5= RULE_ID ) )
                    // InternalPCMDFDConstraintLanguage.g:796:6: (otherlv_5= RULE_ID )
                    {
                    // InternalPCMDFDConstraintLanguage.g:796:6: (otherlv_5= RULE_ID )
                    // InternalPCMDFDConstraintLanguage.g:797:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

                    							newLeafNode(otherlv_5, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_1_0());
                    						

                    }


                    }

                    // InternalPCMDFDConstraintLanguage.g:808:5: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPCMDFDConstraintLanguage.g:809:6: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0());
                    	    					
                    	    // InternalPCMDFDConstraintLanguage.g:813:6: ( (otherlv_7= RULE_ID ) )
                    	    // InternalPCMDFDConstraintLanguage.g:814:7: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalPCMDFDConstraintLanguage.g:814:7: (otherlv_7= RULE_ID )
                    	    // InternalPCMDFDConstraintLanguage.g:815:8: otherlv_7= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    	    								}
                    	    							
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    								newLeafNode(otherlv_7, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_2_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalPCMDFDConstraintLanguage.g:833:4: ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:833:4: ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) )
                    // InternalPCMDFDConstraintLanguage.g:834:5: ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:834:5: ( (lv_isVariableSelector_9_0= '$' ) )
                    // InternalPCMDFDConstraintLanguage.g:835:6: (lv_isVariableSelector_9_0= '$' )
                    {
                    // InternalPCMDFDConstraintLanguage.g:835:6: (lv_isVariableSelector_9_0= '$' )
                    // InternalPCMDFDConstraintLanguage.g:836:7: lv_isVariableSelector_9_0= '$'
                    {
                    lv_isVariableSelector_9_0=(Token)match(input,33,FOLLOW_6); 

                    							newLeafNode(lv_isVariableSelector_9_0, grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    							}
                    							setWithLastConsumed(current, "isVariableSelector", lv_isVariableSelector_9_0 != null, "$");
                    						

                    }


                    }

                    // InternalPCMDFDConstraintLanguage.g:848:5: ( (lv_variable_10_0= ruleCharacteristicVariableType ) )
                    // InternalPCMDFDConstraintLanguage.g:849:6: (lv_variable_10_0= ruleCharacteristicVariableType )
                    {
                    // InternalPCMDFDConstraintLanguage.g:849:6: (lv_variable_10_0= ruleCharacteristicVariableType )
                    // InternalPCMDFDConstraintLanguage.g:850:7: lv_variable_10_0= ruleCharacteristicVariableType
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
    // InternalPCMDFDConstraintLanguage.g:873:1: entryRuleCharacteristicVariableType returns [EObject current=null] : iv_ruleCharacteristicVariableType= ruleCharacteristicVariableType EOF ;
    public final EObject entryRuleCharacteristicVariableType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicVariableType = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:873:67: (iv_ruleCharacteristicVariableType= ruleCharacteristicVariableType EOF )
            // InternalPCMDFDConstraintLanguage.g:874:2: iv_ruleCharacteristicVariableType= ruleCharacteristicVariableType EOF
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
    // InternalPCMDFDConstraintLanguage.g:880:1: ruleCharacteristicVariableType returns [EObject current=null] : (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet ) ;
    public final EObject ruleCharacteristicVariableType() throws RecognitionException {
        EObject current = null;

        EObject this_CharacteristicVariable_0 = null;

        EObject this_CharacteristicSet_1 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:886:2: ( (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet ) )
            // InternalPCMDFDConstraintLanguage.g:887:2: (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet )
            {
            // InternalPCMDFDConstraintLanguage.g:887:2: (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==34) ) {
                    alt11=2;
                }
                else if ( (LA11_1==EOF||LA11_1==14||LA11_1==29||LA11_1==37||(LA11_1>=41 && LA11_1<=42)) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:888:3: this_CharacteristicVariable_0= ruleCharacteristicVariable
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
                    // InternalPCMDFDConstraintLanguage.g:897:3: this_CharacteristicSet_1= ruleCharacteristicSet
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
    // InternalPCMDFDConstraintLanguage.g:909:1: entryRuleCharacteristicVariable returns [EObject current=null] : iv_ruleCharacteristicVariable= ruleCharacteristicVariable EOF ;
    public final EObject entryRuleCharacteristicVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicVariable = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:909:63: (iv_ruleCharacteristicVariable= ruleCharacteristicVariable EOF )
            // InternalPCMDFDConstraintLanguage.g:910:2: iv_ruleCharacteristicVariable= ruleCharacteristicVariable EOF
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
    // InternalPCMDFDConstraintLanguage.g:916:1: ruleCharacteristicVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCharacteristicVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:922:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:923:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPCMDFDConstraintLanguage.g:923:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:924:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:924:3: (lv_name_0_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:925:4: lv_name_0_0= RULE_ID
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
    // InternalPCMDFDConstraintLanguage.g:944:1: entryRuleCharacteristicSet returns [EObject current=null] : iv_ruleCharacteristicSet= ruleCharacteristicSet EOF ;
    public final EObject entryRuleCharacteristicSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicSet = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:944:58: (iv_ruleCharacteristicSet= ruleCharacteristicSet EOF )
            // InternalPCMDFDConstraintLanguage.g:945:2: iv_ruleCharacteristicSet= ruleCharacteristicSet EOF
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
    // InternalPCMDFDConstraintLanguage.g:951:1: ruleCharacteristicSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' ) ;
    public final EObject ruleCharacteristicSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:957:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' ) )
            // InternalPCMDFDConstraintLanguage.g:958:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' )
            {
            // InternalPCMDFDConstraintLanguage.g:958:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' )
            // InternalPCMDFDConstraintLanguage.g:959:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}'
            {
            // InternalPCMDFDConstraintLanguage.g:959:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:960:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:960:4: (lv_name_0_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:961:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:985:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:985:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalPCMDFDConstraintLanguage.g:986:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalPCMDFDConstraintLanguage.g:992:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:998:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:999:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:999:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalPCMDFDConstraintLanguage.g:1000:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:1004:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalPCMDFDConstraintLanguage.g:1005:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalPCMDFDConstraintLanguage.g:1005:4: (lv_importURI_1_0= RULE_STRING )
            // InternalPCMDFDConstraintLanguage.g:1006:5: lv_importURI_1_0= RULE_STRING
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
    // InternalPCMDFDConstraintLanguage.g:1026:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1026:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalPCMDFDConstraintLanguage.g:1027:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalPCMDFDConstraintLanguage.g:1033:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1039:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) )
            // InternalPCMDFDConstraintLanguage.g:1040:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            {
            // InternalPCMDFDConstraintLanguage.g:1040:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            // InternalPCMDFDConstraintLanguage.g:1041:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:1045:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:1046:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:1046:4: (lv_name_1_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:1047:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPCMDFDConstraintLanguage.g:1067:3: ( (lv_rule_3_0= ruleRule ) )
            // InternalPCMDFDConstraintLanguage.g:1068:4: (lv_rule_3_0= ruleRule )
            {
            // InternalPCMDFDConstraintLanguage.g:1068:4: (lv_rule_3_0= ruleRule )
            // InternalPCMDFDConstraintLanguage.g:1069:5: lv_rule_3_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:1094:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1094:45: (iv_ruleRule= ruleRule EOF )
            // InternalPCMDFDConstraintLanguage.g:1095:2: iv_ruleRule= ruleRule EOF
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
    // InternalPCMDFDConstraintLanguage.g:1101:1: ruleRule returns [EObject current=null] : ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? ) ;
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
            // InternalPCMDFDConstraintLanguage.g:1107:2: ( ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? ) )
            // InternalPCMDFDConstraintLanguage.g:1108:2: ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? )
            {
            // InternalPCMDFDConstraintLanguage.g:1108:2: ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? )
            // InternalPCMDFDConstraintLanguage.g:1109:3: ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )?
            {
            // InternalPCMDFDConstraintLanguage.g:1109:3: ( (lv_dataSelectors_0_0= ruleDataSelector ) )
            // InternalPCMDFDConstraintLanguage.g:1110:4: (lv_dataSelectors_0_0= ruleDataSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:1110:4: (lv_dataSelectors_0_0= ruleDataSelector )
            // InternalPCMDFDConstraintLanguage.g:1111:5: lv_dataSelectors_0_0= ruleDataSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalPCMDFDConstraintLanguage.g:1128:3: (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:1129:4: otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_18); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getAmpersandKeyword_1_0());
            	    			
            	    // InternalPCMDFDConstraintLanguage.g:1133:4: ( (lv_dataSelectors_2_0= ruleDataSelector ) )
            	    // InternalPCMDFDConstraintLanguage.g:1134:5: (lv_dataSelectors_2_0= ruleDataSelector )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1134:5: (lv_dataSelectors_2_0= ruleDataSelector )
            	    // InternalPCMDFDConstraintLanguage.g:1135:6: lv_dataSelectors_2_0= ruleDataSelector
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop12;
                }
            } while (true);

            // InternalPCMDFDConstraintLanguage.g:1153:3: ( (lv_statement_3_0= ruleStatement ) )
            // InternalPCMDFDConstraintLanguage.g:1154:4: (lv_statement_3_0= ruleStatement )
            {
            // InternalPCMDFDConstraintLanguage.g:1154:4: (lv_statement_3_0= ruleStatement )
            // InternalPCMDFDConstraintLanguage.g:1155:5: lv_statement_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalPCMDFDConstraintLanguage.g:1172:3: ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) )
            // InternalPCMDFDConstraintLanguage.g:1173:4: (lv_destinationSelectors_4_0= ruleDestinationSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:1173:4: (lv_destinationSelectors_4_0= ruleDestinationSelector )
            // InternalPCMDFDConstraintLanguage.g:1174:5: lv_destinationSelectors_4_0= ruleDestinationSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalPCMDFDConstraintLanguage.g:1191:3: (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:1192:4: otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) )
            	    {
            	    otherlv_5=(Token)match(input,37,FOLLOW_21); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAmpersandKeyword_4_0());
            	    			
            	    // InternalPCMDFDConstraintLanguage.g:1196:4: ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) )
            	    // InternalPCMDFDConstraintLanguage.g:1197:5: (lv_destinationSelectors_6_0= ruleDestinationSelector )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1197:5: (lv_destinationSelectors_6_0= ruleDestinationSelector )
            	    // InternalPCMDFDConstraintLanguage.g:1198:6: lv_destinationSelectors_6_0= ruleDestinationSelector
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop13;
                }
            } while (true);

            // InternalPCMDFDConstraintLanguage.g:1216:3: ( (lv_condition_7_0= ruleCondition ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1217:4: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1217:4: (lv_condition_7_0= ruleCondition )
                    // InternalPCMDFDConstraintLanguage.g:1218:5: lv_condition_7_0= ruleCondition
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
    // InternalPCMDFDConstraintLanguage.g:1239:1: entryRuleDataSelector returns [EObject current=null] : iv_ruleDataSelector= ruleDataSelector EOF ;
    public final EObject entryRuleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1239:53: (iv_ruleDataSelector= ruleDataSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:1240:2: iv_ruleDataSelector= ruleDataSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:1246:1: ruleDataSelector returns [EObject current=null] : (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) ;
    public final EObject ruleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeSelector_0 = null;

        EObject this_AttributeClassSelector_1 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1252:2: ( (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) )
            // InternalPCMDFDConstraintLanguage.g:1253:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:1253:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            else if ( (LA15_0==39) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1254:3: this_AttributeSelector_0= ruleAttributeSelector
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
                    // InternalPCMDFDConstraintLanguage.g:1263:3: this_AttributeClassSelector_1= ruleAttributeClassSelector
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
    // InternalPCMDFDConstraintLanguage.g:1275:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1275:58: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:1276:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:1282:1: ruleAttributeSelector returns [EObject current=null] : (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1288:2: ( (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1289:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1289:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            // InternalPCMDFDConstraintLanguage.g:1290:3: otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:1294:3: ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            // InternalPCMDFDConstraintLanguage.g:1295:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:1295:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            // InternalPCMDFDConstraintLanguage.g:1296:5: lv_ref_1_0= ruleCharacteristicTypeSelector
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
    // InternalPCMDFDConstraintLanguage.g:1317:1: entryRuleAttributeClassSelector returns [EObject current=null] : iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF ;
    public final EObject entryRuleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeClassSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1317:63: (iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:1318:2: iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:1324:1: ruleAttributeClassSelector returns [EObject current=null] : (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1330:2: ( (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1331:2: (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1331:2: (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:1332:3: otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:1336:3: ( (otherlv_1= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:1337:4: (otherlv_1= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:1337:4: (otherlv_1= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:1338:5: otherlv_1= RULE_ID
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
    // InternalPCMDFDConstraintLanguage.g:1353:1: entryRuleDestinationSelector returns [EObject current=null] : iv_ruleDestinationSelector= ruleDestinationSelector EOF ;
    public final EObject entryRuleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1353:60: (iv_ruleDestinationSelector= ruleDestinationSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:1354:2: iv_ruleDestinationSelector= ruleDestinationSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:1360:1: ruleDestinationSelector returns [EObject current=null] : (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector ) ;
    public final EObject ruleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject this_PropertySelector_0 = null;

        EObject this_PropertyClassSelector_1 = null;

        EObject this_NodeIdentitiySelector_2 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1366:2: ( (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector ) )
            // InternalPCMDFDConstraintLanguage.g:1367:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector )
            {
            // InternalPCMDFDConstraintLanguage.g:1367:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt16=1;
                }
                break;
            case 16:
                {
                alt16=2;
                }
                break;
            case 17:
            case 18:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1368:3: this_PropertySelector_0= rulePropertySelector
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
                    // InternalPCMDFDConstraintLanguage.g:1377:3: this_PropertyClassSelector_1= rulePropertyClassSelector
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
                    // InternalPCMDFDConstraintLanguage.g:1386:3: this_NodeIdentitiySelector_2= ruleNodeIdentitiySelector
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


    // $ANTLR start "entryRuleStatement"
    // InternalPCMDFDConstraintLanguage.g:1398:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1398:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalPCMDFDConstraintLanguage.g:1399:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalPCMDFDConstraintLanguage.g:1405:1: ruleStatement returns [EObject current=null] : ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_modality_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1411:2: ( ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1412:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1412:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            // InternalPCMDFDConstraintLanguage.g:1413:3: ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1413:3: ( (lv_modality_0_0= ruleStatementModality ) )
            // InternalPCMDFDConstraintLanguage.g:1414:4: (lv_modality_0_0= ruleStatementModality )
            {
            // InternalPCMDFDConstraintLanguage.g:1414:4: (lv_modality_0_0= ruleStatementModality )
            // InternalPCMDFDConstraintLanguage.g:1415:5: lv_modality_0_0= ruleStatementModality
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalPCMDFDConstraintLanguage.g:1432:3: ( (lv_type_1_0= ruleStatementType ) )
            // InternalPCMDFDConstraintLanguage.g:1433:4: (lv_type_1_0= ruleStatementType )
            {
            // InternalPCMDFDConstraintLanguage.g:1433:4: (lv_type_1_0= ruleStatementType )
            // InternalPCMDFDConstraintLanguage.g:1434:5: lv_type_1_0= ruleStatementType
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
    // InternalPCMDFDConstraintLanguage.g:1455:1: entryRuleStatementType returns [EObject current=null] : iv_ruleStatementType= ruleStatementType EOF ;
    public final EObject entryRuleStatementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementType = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1455:54: (iv_ruleStatementType= ruleStatementType EOF )
            // InternalPCMDFDConstraintLanguage.g:1456:2: iv_ruleStatementType= ruleStatementType EOF
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
    // InternalPCMDFDConstraintLanguage.g:1462:1: ruleStatementType returns [EObject current=null] : ( (lv_name_0_0= 'FLOWS' ) ) ;
    public final EObject ruleStatementType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1468:2: ( ( (lv_name_0_0= 'FLOWS' ) ) )
            // InternalPCMDFDConstraintLanguage.g:1469:2: ( (lv_name_0_0= 'FLOWS' ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1469:2: ( (lv_name_0_0= 'FLOWS' ) )
            // InternalPCMDFDConstraintLanguage.g:1470:3: (lv_name_0_0= 'FLOWS' )
            {
            // InternalPCMDFDConstraintLanguage.g:1470:3: (lv_name_0_0= 'FLOWS' )
            // InternalPCMDFDConstraintLanguage.g:1471:4: lv_name_0_0= 'FLOWS'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:1486:1: entryRuleStatementModality returns [EObject current=null] : iv_ruleStatementModality= ruleStatementModality EOF ;
    public final EObject entryRuleStatementModality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementModality = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1486:58: (iv_ruleStatementModality= ruleStatementModality EOF )
            // InternalPCMDFDConstraintLanguage.g:1487:2: iv_ruleStatementModality= ruleStatementModality EOF
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
    // InternalPCMDFDConstraintLanguage.g:1493:1: ruleStatementModality returns [EObject current=null] : ( (lv_name_0_0= 'NEVER' ) ) ;
    public final EObject ruleStatementModality() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1499:2: ( ( (lv_name_0_0= 'NEVER' ) ) )
            // InternalPCMDFDConstraintLanguage.g:1500:2: ( (lv_name_0_0= 'NEVER' ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1500:2: ( (lv_name_0_0= 'NEVER' ) )
            // InternalPCMDFDConstraintLanguage.g:1501:3: (lv_name_0_0= 'NEVER' )
            {
            // InternalPCMDFDConstraintLanguage.g:1501:3: (lv_name_0_0= 'NEVER' )
            // InternalPCMDFDConstraintLanguage.g:1502:4: lv_name_0_0= 'NEVER'
            {
            lv_name_0_0=(Token)match(input,41,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:1517:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1517:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalPCMDFDConstraintLanguage.g:1518:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalPCMDFDConstraintLanguage.g:1524:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operation_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1530:2: ( (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1531:2: (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1531:2: (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) )
            // InternalPCMDFDConstraintLanguage.g:1532:3: otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getWHEREKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:1536:3: ( (lv_operation_1_0= ruleBooleanOperation ) )
            // InternalPCMDFDConstraintLanguage.g:1537:4: (lv_operation_1_0= ruleBooleanOperation )
            {
            // InternalPCMDFDConstraintLanguage.g:1537:4: (lv_operation_1_0= ruleBooleanOperation )
            // InternalPCMDFDConstraintLanguage.g:1538:5: lv_operation_1_0= ruleBooleanOperation
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
    // InternalPCMDFDConstraintLanguage.g:1559:1: entryRuleCharacteristicReference returns [EObject current=null] : iv_ruleCharacteristicReference= ruleCharacteristicReference EOF ;
    public final EObject entryRuleCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicReference = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1559:64: (iv_ruleCharacteristicReference= ruleCharacteristicReference EOF )
            // InternalPCMDFDConstraintLanguage.g:1560:2: iv_ruleCharacteristicReference= ruleCharacteristicReference EOF
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
    // InternalPCMDFDConstraintLanguage.g:1566:1: ruleCharacteristicReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCharacteristicReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1572:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:1573:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1573:2: ( (otherlv_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:1574:3: (otherlv_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:1574:3: (otherlv_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:1575:4: otherlv_0= RULE_ID
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
    // InternalPCMDFDConstraintLanguage.g:1589:1: entryRuleCharacteristicSetReference returns [EObject current=null] : iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF ;
    public final EObject entryRuleCharacteristicSetReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicSetReference = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1589:67: (iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF )
            // InternalPCMDFDConstraintLanguage.g:1590:2: iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF
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
    // InternalPCMDFDConstraintLanguage.g:1596:1: ruleCharacteristicSetReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) ) ;
    public final EObject ruleCharacteristicSetReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1602:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1603:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1603:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==28||(LA17_0>=49 && LA17_0<=51)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1604:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1604:3: ( (otherlv_0= RULE_ID ) )
                    // InternalPCMDFDConstraintLanguage.g:1605:4: (otherlv_0= RULE_ID )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1605:4: (otherlv_0= RULE_ID )
                    // InternalPCMDFDConstraintLanguage.g:1606:5: otherlv_0= RULE_ID
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
                    // InternalPCMDFDConstraintLanguage.g:1618:3: ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1618:3: ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) )
                    // InternalPCMDFDConstraintLanguage.g:1619:4: (lv_ref_1_0= ruleCharacteristsicSetOperation )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1619:4: (lv_ref_1_0= ruleCharacteristsicSetOperation )
                    // InternalPCMDFDConstraintLanguage.g:1620:5: lv_ref_1_0= ruleCharacteristsicSetOperation
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
    // InternalPCMDFDConstraintLanguage.g:1641:1: entryRuleBooleanOperation returns [EObject current=null] : iv_ruleBooleanOperation= ruleBooleanOperation EOF ;
    public final EObject entryRuleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1641:57: (iv_ruleBooleanOperation= ruleBooleanOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1642:2: iv_ruleBooleanOperation= ruleBooleanOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1648:1: ruleBooleanOperation returns [EObject current=null] : this_LogicalOrOperation_0= ruleLogicalOrOperation ;
    public final EObject ruleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrOperation_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1654:2: (this_LogicalOrOperation_0= ruleLogicalOrOperation )
            // InternalPCMDFDConstraintLanguage.g:1655:2: this_LogicalOrOperation_0= ruleLogicalOrOperation
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
    // InternalPCMDFDConstraintLanguage.g:1666:1: entryRuleCharacteristsicSetOperation returns [EObject current=null] : iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF ;
    public final EObject entryRuleCharacteristsicSetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristsicSetOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1666:68: (iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1667:2: iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1673:1: ruleCharacteristsicSetOperation returns [EObject current=null] : (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation ) ;
    public final EObject ruleCharacteristsicSetOperation() throws RecognitionException {
        EObject current = null;

        EObject this_CreateSetOperation_0 = null;

        EObject this_IntersectionOperation_1 = null;

        EObject this_UnionOperation_2 = null;

        EObject this_SubtractOperation_3 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1679:2: ( (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation ) )
            // InternalPCMDFDConstraintLanguage.g:1680:2: (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation )
            {
            // InternalPCMDFDConstraintLanguage.g:1680:2: (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt18=1;
                }
                break;
            case 49:
                {
                alt18=2;
                }
                break;
            case 50:
                {
                alt18=3;
                }
                break;
            case 51:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1681:3: this_CreateSetOperation_0= ruleCreateSetOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1690:3: this_IntersectionOperation_1= ruleIntersectionOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1699:3: this_UnionOperation_2= ruleUnionOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1708:3: this_SubtractOperation_3= ruleSubtractOperation
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
    // InternalPCMDFDConstraintLanguage.g:1720:1: entryRuleLogicalOrOperation returns [EObject current=null] : iv_ruleLogicalOrOperation= ruleLogicalOrOperation EOF ;
    public final EObject entryRuleLogicalOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1720:59: (iv_ruleLogicalOrOperation= ruleLogicalOrOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1721:2: iv_ruleLogicalOrOperation= ruleLogicalOrOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1727:1: ruleLogicalOrOperation returns [EObject current=null] : (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* ) ;
    public final EObject ruleLogicalOrOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1733:2: ( (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* ) )
            // InternalPCMDFDConstraintLanguage.g:1734:2: (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* )
            {
            // InternalPCMDFDConstraintLanguage.g:1734:2: (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* )
            // InternalPCMDFDConstraintLanguage.g:1735:3: this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalOrOperationAccess().getLogicalAndOperationParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_LogicalAndOperation_0=ruleLogicalAndOperation();

            state._fsp--;


            			current = this_LogicalAndOperation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPCMDFDConstraintLanguage.g:1743:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:1744:4: () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1744:4: ()
            	    // InternalPCMDFDConstraintLanguage.g:1745:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicalOrOperationAccess().getLogicalOrOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLogicalOrOperationAccess().getVerticalLineKeyword_1_1());
            	    			
            	    // InternalPCMDFDConstraintLanguage.g:1755:4: ( (lv_right_3_0= ruleLogicalAndOperation ) )
            	    // InternalPCMDFDConstraintLanguage.g:1756:5: (lv_right_3_0= ruleLogicalAndOperation )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1756:5: (lv_right_3_0= ruleLogicalAndOperation )
            	    // InternalPCMDFDConstraintLanguage.g:1757:6: lv_right_3_0= ruleLogicalAndOperation
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalOrOperationAccess().getRightLogicalAndOperationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop19;
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
    // InternalPCMDFDConstraintLanguage.g:1779:1: entryRuleLogicalAndOperation returns [EObject current=null] : iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF ;
    public final EObject entryRuleLogicalAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1779:60: (iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1780:2: iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1786:1: ruleLogicalAndOperation returns [EObject current=null] : (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* ) ;
    public final EObject ruleLogicalAndOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNegationOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1792:2: ( (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* ) )
            // InternalPCMDFDConstraintLanguage.g:1793:2: (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* )
            {
            // InternalPCMDFDConstraintLanguage.g:1793:2: (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* )
            // InternalPCMDFDConstraintLanguage.g:1794:3: this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalAndOperationAccess().getLogicalNegationOperationParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_LogicalNegationOperation_0=ruleLogicalNegationOperation();

            state._fsp--;


            			current = this_LogicalNegationOperation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPCMDFDConstraintLanguage.g:1802:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:1803:4: () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1803:4: ()
            	    // InternalPCMDFDConstraintLanguage.g:1804:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicalAndOperationAccess().getLogicalAndOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_1_1());
            	    			
            	    // InternalPCMDFDConstraintLanguage.g:1814:4: ( (lv_right_3_0= ruleLogicalNegationOperation ) )
            	    // InternalPCMDFDConstraintLanguage.g:1815:5: (lv_right_3_0= ruleLogicalNegationOperation )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1815:5: (lv_right_3_0= ruleLogicalNegationOperation )
            	    // InternalPCMDFDConstraintLanguage.g:1816:6: lv_right_3_0= ruleLogicalNegationOperation
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalAndOperationAccess().getRightLogicalNegationOperationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "ruleLogicalAndOperation"


    // $ANTLR start "entryRuleLogicalNegationOperation"
    // InternalPCMDFDConstraintLanguage.g:1838:1: entryRuleLogicalNegationOperation returns [EObject current=null] : iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF ;
    public final EObject entryRuleLogicalNegationOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNegationOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1838:65: (iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1839:2: iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1845:1: ruleLogicalNegationOperation returns [EObject current=null] : (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) ) ;
    public final EObject ruleLogicalNegationOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EncapsulatedLogicalOperation_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1851:2: ( (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1852:2: (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1852:2: (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==44||LA21_0==48||LA21_0==52) ) {
                alt21=1;
            }
            else if ( (LA21_0==30) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1853:3: this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1862:3: ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1862:3: ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) )
                    // InternalPCMDFDConstraintLanguage.g:1863:4: () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1863:4: ()
                    // InternalPCMDFDConstraintLanguage.g:1864:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLogicalNegationOperationAccess().getLogicalNegationOperationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalPCMDFDConstraintLanguage.g:1874:4: ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) )
                    // InternalPCMDFDConstraintLanguage.g:1875:5: (lv_value_3_0= ruleEncapsulatedLogicalOperation )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1875:5: (lv_value_3_0= ruleEncapsulatedLogicalOperation )
                    // InternalPCMDFDConstraintLanguage.g:1876:6: lv_value_3_0= ruleEncapsulatedLogicalOperation
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
    // InternalPCMDFDConstraintLanguage.g:1898:1: entryRuleEncapsulatedLogicalOperation returns [EObject current=null] : iv_ruleEncapsulatedLogicalOperation= ruleEncapsulatedLogicalOperation EOF ;
    public final EObject entryRuleEncapsulatedLogicalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncapsulatedLogicalOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1898:69: (iv_ruleEncapsulatedLogicalOperation= ruleEncapsulatedLogicalOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1899:2: iv_ruleEncapsulatedLogicalOperation= ruleEncapsulatedLogicalOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1905:1: ruleEncapsulatedLogicalOperation returns [EObject current=null] : (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) ) ;
    public final EObject ruleEncapsulatedLogicalOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_SimpleBooleanOperation_0 = null;

        EObject this_LogicalOrOperation_2 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1911:2: ( (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) ) )
            // InternalPCMDFDConstraintLanguage.g:1912:2: (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1912:2: (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==48||LA22_0==52) ) {
                alt22=1;
            }
            else if ( (LA22_0==44) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1913:3: this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1922:3: (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1922:3: (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' )
                    // InternalPCMDFDConstraintLanguage.g:1923:4: otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getEncapsulatedLogicalOperationAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getEncapsulatedLogicalOperationAccess().getLogicalOrOperationParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_LogicalOrOperation_2=ruleLogicalOrOperation();

                    state._fsp--;


                    				current = this_LogicalOrOperation_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,45,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:1944:1: entryRuleSimpleBooleanOperation returns [EObject current=null] : iv_ruleSimpleBooleanOperation= ruleSimpleBooleanOperation EOF ;
    public final EObject entryRuleSimpleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBooleanOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1944:63: (iv_ruleSimpleBooleanOperation= ruleSimpleBooleanOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1945:2: iv_ruleSimpleBooleanOperation= ruleSimpleBooleanOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1951:1: ruleSimpleBooleanOperation returns [EObject current=null] : (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation ) ;
    public final EObject ruleSimpleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject this_EmptySetOperation_0 = null;

        EObject this_VariableEqualityOperation_1 = null;

        EObject this_VariableInequalityOperation_2 = null;

        EObject this_ElementOfOperation_3 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1957:2: ( (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation ) )
            // InternalPCMDFDConstraintLanguage.g:1958:2: (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation )
            {
            // InternalPCMDFDConstraintLanguage.g:1958:2: (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt23=1;
                }
                break;
            case RULE_ID:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==47) ) {
                    alt23=3;
                }
                else if ( (LA23_2==46) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1959:3: this_EmptySetOperation_0= ruleEmptySetOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1968:3: this_VariableEqualityOperation_1= ruleVariableEqualityOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1977:3: this_VariableInequalityOperation_2= ruleVariableInequalityOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1986:3: this_ElementOfOperation_3= ruleElementOfOperation
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
    // InternalPCMDFDConstraintLanguage.g:1998:1: entryRuleVariableEqualityOperation returns [EObject current=null] : iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF ;
    public final EObject entryRuleVariableEqualityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableEqualityOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1998:66: (iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1999:2: iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2005:1: ruleVariableEqualityOperation returns [EObject current=null] : ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) ;
    public final EObject ruleVariableEqualityOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:2011:2: ( ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:2012:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:2012:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            // InternalPCMDFDConstraintLanguage.g:2013:3: ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) )
            {
            // InternalPCMDFDConstraintLanguage.g:2013:3: ( (lv_left_0_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:2014:4: (lv_left_0_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2014:4: (lv_left_0_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:2015:5: lv_left_0_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getVariableEqualityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_1=(Token)match(input,46,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableEqualityOperationAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2036:3: ( (lv_right_2_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:2037:4: (lv_right_2_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2037:4: (lv_right_2_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:2038:5: lv_right_2_0= ruleCharacteristicReference
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
    // InternalPCMDFDConstraintLanguage.g:2059:1: entryRuleVariableInequalityOperation returns [EObject current=null] : iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF ;
    public final EObject entryRuleVariableInequalityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableInequalityOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2059:68: (iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2060:2: iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2066:1: ruleVariableInequalityOperation returns [EObject current=null] : ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) ;
    public final EObject ruleVariableInequalityOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:2072:2: ( ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:2073:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:2073:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            // InternalPCMDFDConstraintLanguage.g:2074:3: ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) )
            {
            // InternalPCMDFDConstraintLanguage.g:2074:3: ( (lv_left_0_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:2075:4: (lv_left_0_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2075:4: (lv_left_0_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:2076:5: lv_left_0_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getVariableInequalityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_1=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableInequalityOperationAccess().getExclamationMarkEqualsSignKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2097:3: ( (lv_right_2_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:2098:4: (lv_right_2_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2098:4: (lv_right_2_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:2099:5: lv_right_2_0= ruleCharacteristicReference
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
    // InternalPCMDFDConstraintLanguage.g:2120:1: entryRuleEmptySetOperation returns [EObject current=null] : iv_ruleEmptySetOperation= ruleEmptySetOperation EOF ;
    public final EObject entryRuleEmptySetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptySetOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2120:58: (iv_ruleEmptySetOperation= ruleEmptySetOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2121:2: iv_ruleEmptySetOperation= ruleEmptySetOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2127:1: ruleEmptySetOperation returns [EObject current=null] : (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleEmptySetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:2133:2: ( (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' ) )
            // InternalPCMDFDConstraintLanguage.g:2134:2: (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' )
            {
            // InternalPCMDFDConstraintLanguage.g:2134:2: (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' )
            // InternalPCMDFDConstraintLanguage.g:2135:3: otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getEmptySetOperationAccess().getIsEmptyKeyword_0());
            		
            otherlv_1=(Token)match(input,44,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptySetOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2143:3: ( (lv_value_2_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2144:4: (lv_value_2_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2144:4: (lv_value_2_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2145:5: lv_value_2_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getEmptySetOperationAccess().getValueCharacteristicSetReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_3=(Token)match(input,45,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2170:1: entryRuleIntersectionOperation returns [EObject current=null] : iv_ruleIntersectionOperation= ruleIntersectionOperation EOF ;
    public final EObject entryRuleIntersectionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectionOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2170:62: (iv_ruleIntersectionOperation= ruleIntersectionOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2171:2: iv_ruleIntersectionOperation= ruleIntersectionOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2177:1: ruleIntersectionOperation returns [EObject current=null] : (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
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
            // InternalPCMDFDConstraintLanguage.g:2183:2: ( (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalPCMDFDConstraintLanguage.g:2184:2: (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalPCMDFDConstraintLanguage.g:2184:2: (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalPCMDFDConstraintLanguage.g:2185:3: otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getIntersectionOperationAccess().getIntersectionKeyword_0());
            		
            otherlv_1=(Token)match(input,44,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getIntersectionOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2193:3: ( (lv_left_2_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2194:4: (lv_left_2_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2194:4: (lv_left_2_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2195:5: lv_left_2_0= ruleCharacteristicSetReference
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

            otherlv_3=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getIntersectionOperationAccess().getCommaKeyword_3());
            		
            // InternalPCMDFDConstraintLanguage.g:2216:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2217:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2217:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2218:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getIntersectionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_5=(Token)match(input,45,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2243:1: entryRuleUnionOperation returns [EObject current=null] : iv_ruleUnionOperation= ruleUnionOperation EOF ;
    public final EObject entryRuleUnionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2243:55: (iv_ruleUnionOperation= ruleUnionOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2244:2: iv_ruleUnionOperation= ruleUnionOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2250:1: ruleUnionOperation returns [EObject current=null] : (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
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
            // InternalPCMDFDConstraintLanguage.g:2256:2: ( (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalPCMDFDConstraintLanguage.g:2257:2: (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalPCMDFDConstraintLanguage.g:2257:2: (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalPCMDFDConstraintLanguage.g:2258:3: otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getUnionOperationAccess().getUnionKeyword_0());
            		
            otherlv_1=(Token)match(input,44,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getUnionOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2266:3: ( (lv_left_2_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2267:4: (lv_left_2_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2267:4: (lv_left_2_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2268:5: lv_left_2_0= ruleCharacteristicSetReference
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

            otherlv_3=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getUnionOperationAccess().getCommaKeyword_3());
            		
            // InternalPCMDFDConstraintLanguage.g:2289:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2290:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2290:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2291:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getUnionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_5=(Token)match(input,45,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2316:1: entryRuleSubtractOperation returns [EObject current=null] : iv_ruleSubtractOperation= ruleSubtractOperation EOF ;
    public final EObject entryRuleSubtractOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtractOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2316:58: (iv_ruleSubtractOperation= ruleSubtractOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2317:2: iv_ruleSubtractOperation= ruleSubtractOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2323:1: ruleSubtractOperation returns [EObject current=null] : (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
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
            // InternalPCMDFDConstraintLanguage.g:2329:2: ( (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalPCMDFDConstraintLanguage.g:2330:2: (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalPCMDFDConstraintLanguage.g:2330:2: (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalPCMDFDConstraintLanguage.g:2331:3: otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getSubtractOperationAccess().getSubtractKeyword_0());
            		
            otherlv_1=(Token)match(input,44,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getSubtractOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2339:3: ( (lv_left_2_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2340:4: (lv_left_2_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2340:4: (lv_left_2_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2341:5: lv_left_2_0= ruleCharacteristicSetReference
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

            otherlv_3=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getSubtractOperationAccess().getCommaKeyword_3());
            		
            // InternalPCMDFDConstraintLanguage.g:2362:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2363:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2363:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2364:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getSubtractOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_5=(Token)match(input,45,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2389:1: entryRuleElementOfOperation returns [EObject current=null] : iv_ruleElementOfOperation= ruleElementOfOperation EOF ;
    public final EObject entryRuleElementOfOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementOfOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2389:59: (iv_ruleElementOfOperation= ruleElementOfOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2390:2: iv_ruleElementOfOperation= ruleElementOfOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2396:1: ruleElementOfOperation returns [EObject current=null] : (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
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
            // InternalPCMDFDConstraintLanguage.g:2402:2: ( (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalPCMDFDConstraintLanguage.g:2403:2: (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalPCMDFDConstraintLanguage.g:2403:2: (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalPCMDFDConstraintLanguage.g:2404:3: otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getElementOfOperationAccess().getElementOfKeyword_0());
            		
            otherlv_1=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getElementOfOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2412:3: ( (lv_left_2_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:2413:4: (lv_left_2_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2413:4: (lv_left_2_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:2414:5: lv_left_2_0= ruleCharacteristicReference
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

            otherlv_3=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getElementOfOperationAccess().getCommaKeyword_3());
            		
            // InternalPCMDFDConstraintLanguage.g:2435:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2436:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2436:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2437:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getElementOfOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_5=(Token)match(input,45,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2462:1: entryRuleCreateSetOperation returns [EObject current=null] : iv_ruleCreateSetOperation= ruleCreateSetOperation EOF ;
    public final EObject entryRuleCreateSetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateSetOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2462:59: (iv_ruleCreateSetOperation= ruleCreateSetOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2463:2: iv_ruleCreateSetOperation= ruleCreateSetOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2469:1: ruleCreateSetOperation returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' ) ;
    public final EObject ruleCreateSetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:2475:2: ( (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' ) )
            // InternalPCMDFDConstraintLanguage.g:2476:2: (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' )
            {
            // InternalPCMDFDConstraintLanguage.g:2476:2: (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' )
            // InternalPCMDFDConstraintLanguage.g:2477:3: otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateSetOperationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:2481:3: ( (lv_value_1_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:2482:4: (lv_value_1_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2482:4: (lv_value_1_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:2483:5: lv_value_1_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getCreateSetOperationAccess().getValueCharacteristicReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000180A000042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001E80000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000002C0000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0011100040000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0011100000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000E000010000010L});

}