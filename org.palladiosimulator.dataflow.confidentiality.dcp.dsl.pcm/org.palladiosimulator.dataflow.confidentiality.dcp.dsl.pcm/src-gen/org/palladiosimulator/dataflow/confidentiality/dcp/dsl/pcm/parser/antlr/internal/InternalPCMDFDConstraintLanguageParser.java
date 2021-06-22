package org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.parser.antlr.internal;

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
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.services.PCMDFDConstraintLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPCMDFDConstraintLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'target'", "'component.property.'", "'component.class.'", "'component.name.'", "'using'", "'type'", "':'", "'class'", "'{'", "','", "'}'", "'.'", "'!'", "'['", "']'", "'$'", "'{}'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'FLOWS'", "'NEVER'", "'WHERE'", "'|'", "'('", "')'", "'=='", "'!='", "'isEmpty'", "'intersection'", "'union'", "'subtract'", "'elementOf'", "'PCMDFD'", "'ExtendedDFD'"
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
    // InternalPCMDFDConstraintLanguage.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalPCMDFDConstraintLanguage.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalPCMDFDConstraintLanguage.g:72:1: ruleModel returns [EObject current=null] : ( ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) ) | ( (lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef ) ) )? ( (lv_elements_2_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_targetModelType_0_0 = null;

        EObject lv_pcmTargetModelType_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:78:2: ( ( ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) ) | ( (lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef ) ) )? ( (lv_elements_2_0= ruleAbstractElement ) )* ) )
            // InternalPCMDFDConstraintLanguage.g:79:2: ( ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) ) | ( (lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef ) ) )? ( (lv_elements_2_0= ruleAbstractElement ) )* )
            {
            // InternalPCMDFDConstraintLanguage.g:79:2: ( ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) ) | ( (lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef ) ) )? ( (lv_elements_2_0= ruleAbstractElement ) )* )
            // InternalPCMDFDConstraintLanguage.g:80:3: ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) ) | ( (lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef ) ) )? ( (lv_elements_2_0= ruleAbstractElement ) )*
            {
            // InternalPCMDFDConstraintLanguage.g:80:3: ( ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) ) | ( (lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef ) ) )?
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==46) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==15) ) {
                        alt1=1;
                    }
                    else if ( (LA1_3==EOF||LA1_3==RULE_SL_COMMENT||LA1_3==16||LA1_3==18||(LA1_3>=28 && LA1_3<=29)) ) {
                        alt1=2;
                    }
                }
                else if ( (LA1_1==47) ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4==15) ) {
                        alt1=1;
                    }
                    else if ( (LA1_4==EOF||LA1_4==RULE_SL_COMMENT||LA1_4==16||LA1_4==18||(LA1_4>=28 && LA1_4<=29)) ) {
                        alt1=2;
                    }
                }
            }
            switch (alt1) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:81:4: ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:81:4: ( (lv_targetModelType_0_0= ruleTargetModelTypeDef ) )
                    // InternalPCMDFDConstraintLanguage.g:82:5: (lv_targetModelType_0_0= ruleTargetModelTypeDef )
                    {
                    // InternalPCMDFDConstraintLanguage.g:82:5: (lv_targetModelType_0_0= ruleTargetModelTypeDef )
                    // InternalPCMDFDConstraintLanguage.g:83:6: lv_targetModelType_0_0= ruleTargetModelTypeDef
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getTargetModelTypeTargetModelTypeDefParserRuleCall_0_0_0());
                    					
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


                    }
                    break;
                case 2 :
                    // InternalPCMDFDConstraintLanguage.g:101:4: ( (lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:101:4: ( (lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef ) )
                    // InternalPCMDFDConstraintLanguage.g:102:5: (lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef )
                    {
                    // InternalPCMDFDConstraintLanguage.g:102:5: (lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef )
                    // InternalPCMDFDConstraintLanguage.g:103:6: lv_pcmTargetModelType_1_0= rulePCMTargetModelTypeDef
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getPcmTargetModelTypePCMTargetModelTypeDefParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_pcmTargetModelType_1_0=rulePCMTargetModelTypeDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"pcmTargetModelType",
                    							lv_pcmTargetModelType_1_0,
                    							"org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.PCMDFDConstraintLanguage.PCMTargetModelTypeDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPCMDFDConstraintLanguage.g:121:3: ( (lv_elements_2_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_SL_COMMENT||LA2_0==16||LA2_0==18||(LA2_0>=28 && LA2_0<=29)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:122:4: (lv_elements_2_0= ruleAbstractElement )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:122:4: (lv_elements_2_0= ruleAbstractElement )
            	    // InternalPCMDFDConstraintLanguage.g:123:5: lv_elements_2_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_2_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
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


    // $ANTLR start "entryRulePCMTargetModelTypeDef"
    // InternalPCMDFDConstraintLanguage.g:144:1: entryRulePCMTargetModelTypeDef returns [EObject current=null] : iv_rulePCMTargetModelTypeDef= rulePCMTargetModelTypeDef EOF ;
    public final EObject entryRulePCMTargetModelTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePCMTargetModelTypeDef = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:144:62: (iv_rulePCMTargetModelTypeDef= rulePCMTargetModelTypeDef EOF )
            // InternalPCMDFDConstraintLanguage.g:145:2: iv_rulePCMTargetModelTypeDef= rulePCMTargetModelTypeDef EOF
            {
             newCompositeNode(grammarAccess.getPCMTargetModelTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePCMTargetModelTypeDef=rulePCMTargetModelTypeDef();

            state._fsp--;

             current =iv_rulePCMTargetModelTypeDef; 
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
    // $ANTLR end "entryRulePCMTargetModelTypeDef"


    // $ANTLR start "rulePCMTargetModelTypeDef"
    // InternalPCMDFDConstraintLanguage.g:151:1: rulePCMTargetModelTypeDef returns [EObject current=null] : (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) ) ;
    public final EObject rulePCMTargetModelTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:157:2: ( (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:158:2: (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:158:2: (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) )
            // InternalPCMDFDConstraintLanguage.g:159:3: otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPCMTargetModelTypeDefAccess().getTargetKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:163:3: ( (lv_type_1_0= ruleTargetModelType ) )
            // InternalPCMDFDConstraintLanguage.g:164:4: (lv_type_1_0= ruleTargetModelType )
            {
            // InternalPCMDFDConstraintLanguage.g:164:4: (lv_type_1_0= ruleTargetModelType )
            // InternalPCMDFDConstraintLanguage.g:165:5: lv_type_1_0= ruleTargetModelType
            {

            					newCompositeNode(grammarAccess.getPCMTargetModelTypeDefAccess().getTypeTargetModelTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleTargetModelType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPCMTargetModelTypeDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.PCMDFDConstraintLanguage.TargetModelType");
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
    // $ANTLR end "rulePCMTargetModelTypeDef"


    // $ANTLR start "entryRuleDestinationSelector"
    // InternalPCMDFDConstraintLanguage.g:186:1: entryRuleDestinationSelector returns [EObject current=null] : iv_ruleDestinationSelector= ruleDestinationSelector EOF ;
    public final EObject entryRuleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:186:60: (iv_ruleDestinationSelector= ruleDestinationSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:187:2: iv_ruleDestinationSelector= ruleDestinationSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:193:1: ruleDestinationSelector returns [EObject current=null] : (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_ComponentIdentitySelector_2= ruleComponentIdentitySelector ) ;
    public final EObject ruleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject this_PropertySelector_0 = null;

        EObject this_PropertyClassSelector_1 = null;

        EObject this_ComponentIdentitySelector_2 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:199:2: ( (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_ComponentIdentitySelector_2= ruleComponentIdentitySelector ) )
            // InternalPCMDFDConstraintLanguage.g:200:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_ComponentIdentitySelector_2= ruleComponentIdentitySelector )
            {
            // InternalPCMDFDConstraintLanguage.g:200:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector | this_ComponentIdentitySelector_2= ruleComponentIdentitySelector )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:201:3: this_PropertySelector_0= rulePropertySelector
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
                    // InternalPCMDFDConstraintLanguage.g:210:3: this_PropertyClassSelector_1= rulePropertyClassSelector
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
                    // InternalPCMDFDConstraintLanguage.g:219:3: this_ComponentIdentitySelector_2= ruleComponentIdentitySelector
                    {

                    			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getComponentIdentitySelectorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentIdentitySelector_2=ruleComponentIdentitySelector();

                    state._fsp--;


                    			current = this_ComponentIdentitySelector_2;
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
    // InternalPCMDFDConstraintLanguage.g:231:1: entryRulePropertySelector returns [EObject current=null] : iv_rulePropertySelector= rulePropertySelector EOF ;
    public final EObject entryRulePropertySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:231:57: (iv_rulePropertySelector= rulePropertySelector EOF )
            // InternalPCMDFDConstraintLanguage.g:232:2: iv_rulePropertySelector= rulePropertySelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:238:1: rulePropertySelector returns [EObject current=null] : (otherlv_0= 'component.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) ;
    public final EObject rulePropertySelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:244:2: ( (otherlv_0= 'component.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:245:2: (otherlv_0= 'component.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:245:2: (otherlv_0= 'component.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            // InternalPCMDFDConstraintLanguage.g:246:3: otherlv_0= 'component.property.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertySelectorAccess().getComponentPropertyKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:250:3: ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            // InternalPCMDFDConstraintLanguage.g:251:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:251:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            // InternalPCMDFDConstraintLanguage.g:252:5: lv_ref_1_0= ruleCharacteristicTypeSelector
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
    // InternalPCMDFDConstraintLanguage.g:273:1: entryRulePropertyClassSelector returns [EObject current=null] : iv_rulePropertyClassSelector= rulePropertyClassSelector EOF ;
    public final EObject entryRulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyClassSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:273:62: (iv_rulePropertyClassSelector= rulePropertyClassSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:274:2: iv_rulePropertyClassSelector= rulePropertyClassSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:280:1: rulePropertyClassSelector returns [EObject current=null] : (otherlv_0= 'component.class.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:286:2: ( (otherlv_0= 'component.class.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:287:2: (otherlv_0= 'component.class.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:287:2: (otherlv_0= 'component.class.' ( (otherlv_1= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:288:3: otherlv_0= 'component.class.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyClassSelectorAccess().getComponentClassKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:292:3: ( (otherlv_1= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:293:4: (otherlv_1= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:293:4: (otherlv_1= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:294:5: otherlv_1= RULE_ID
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


    // $ANTLR start "entryRuleComponentIdentitySelector"
    // InternalPCMDFDConstraintLanguage.g:309:1: entryRuleComponentIdentitySelector returns [EObject current=null] : iv_ruleComponentIdentitySelector= ruleComponentIdentitySelector EOF ;
    public final EObject entryRuleComponentIdentitySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentIdentitySelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:309:66: (iv_ruleComponentIdentitySelector= ruleComponentIdentitySelector EOF )
            // InternalPCMDFDConstraintLanguage.g:310:2: iv_ruleComponentIdentitySelector= ruleComponentIdentitySelector EOF
            {
             newCompositeNode(grammarAccess.getComponentIdentitySelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentIdentitySelector=ruleComponentIdentitySelector();

            state._fsp--;

             current =iv_ruleComponentIdentitySelector; 
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
    // $ANTLR end "entryRuleComponentIdentitySelector"


    // $ANTLR start "ruleComponentIdentitySelector"
    // InternalPCMDFDConstraintLanguage.g:316:1: ruleComponentIdentitySelector returns [EObject current=null] : (otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleComponentIdentitySelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:322:2: ( (otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:323:2: (otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:323:2: (otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalPCMDFDConstraintLanguage.g:324:3: otherlv_0= 'component.name.' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentIdentitySelectorAccess().getComponentNameKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:328:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPCMDFDConstraintLanguage.g:329:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPCMDFDConstraintLanguage.g:329:4: (lv_name_1_0= RULE_STRING )
            // InternalPCMDFDConstraintLanguage.g:330:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentIdentitySelectorAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentIdentitySelectorRule());
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
    // $ANTLR end "ruleComponentIdentitySelector"


    // $ANTLR start "entryRuleTargetModelTypeDef"
    // InternalPCMDFDConstraintLanguage.g:350:1: entryRuleTargetModelTypeDef returns [EObject current=null] : iv_ruleTargetModelTypeDef= ruleTargetModelTypeDef EOF ;
    public final EObject entryRuleTargetModelTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetModelTypeDef = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:350:59: (iv_ruleTargetModelTypeDef= ruleTargetModelTypeDef EOF )
            // InternalPCMDFDConstraintLanguage.g:351:2: iv_ruleTargetModelTypeDef= ruleTargetModelTypeDef EOF
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
    // InternalPCMDFDConstraintLanguage.g:357:1: ruleTargetModelTypeDef returns [EObject current=null] : (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTargetModelTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:363:2: ( (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:364:2: (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:364:2: (otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:365:3: otherlv_0= 'target' ( (lv_type_1_0= ruleTargetModelType ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetModelTypeDefAccess().getTargetKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:369:3: ( (lv_type_1_0= ruleTargetModelType ) )
            // InternalPCMDFDConstraintLanguage.g:370:4: (lv_type_1_0= ruleTargetModelType )
            {
            // InternalPCMDFDConstraintLanguage.g:370:4: (lv_type_1_0= ruleTargetModelType )
            // InternalPCMDFDConstraintLanguage.g:371:5: lv_type_1_0= ruleTargetModelType
            {

            					newCompositeNode(grammarAccess.getTargetModelTypeDefAccess().getTypeTargetModelTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_1_0=ruleTargetModelType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetModelTypeDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.PCMDFDConstraintLanguage.TargetModelType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetModelTypeDefAccess().getUsingKeyword_2());
            		
            // InternalPCMDFDConstraintLanguage.g:392:3: ( (otherlv_3= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:393:4: (otherlv_3= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:393:4: (otherlv_3= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:394:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getTargetModelTypeDefAccess().getTypeContainerDataDictionaryCharacterizedCrossReference_3_0());
            				

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
    // InternalPCMDFDConstraintLanguage.g:409:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:409:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalPCMDFDConstraintLanguage.g:410:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // InternalPCMDFDConstraintLanguage.g:416:1: ruleAbstractElement returns [EObject current=null] : (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_5=null;
        EObject this_Include_0 = null;

        EObject this_CharacteristicType_1 = null;

        EObject this_CharacteristicClass_2 = null;

        EObject this_Constraint_3 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:422:2: ( (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) ) )
            // InternalPCMDFDConstraintLanguage.g:423:2: (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) )
            {
            // InternalPCMDFDConstraintLanguage.g:423:2: (this_Include_0= ruleInclude | this_CharacteristicType_1= ruleCharacteristicType | this_CharacteristicClass_2= ruleCharacteristicClass | this_Constraint_3= ruleConstraint | ( () this_SL_COMMENT_5= RULE_SL_COMMENT ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            case RULE_SL_COMMENT:
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
                    // InternalPCMDFDConstraintLanguage.g:424:3: this_Include_0= ruleInclude
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
                    // InternalPCMDFDConstraintLanguage.g:433:3: this_CharacteristicType_1= ruleCharacteristicType
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
                    // InternalPCMDFDConstraintLanguage.g:442:3: this_CharacteristicClass_2= ruleCharacteristicClass
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
                    // InternalPCMDFDConstraintLanguage.g:451:3: this_Constraint_3= ruleConstraint
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
                    // InternalPCMDFDConstraintLanguage.g:460:3: ( () this_SL_COMMENT_5= RULE_SL_COMMENT )
                    {
                    // InternalPCMDFDConstraintLanguage.g:460:3: ( () this_SL_COMMENT_5= RULE_SL_COMMENT )
                    // InternalPCMDFDConstraintLanguage.g:461:4: () this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    // InternalPCMDFDConstraintLanguage.g:461:4: ()
                    // InternalPCMDFDConstraintLanguage.g:462:5: 
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
    // InternalPCMDFDConstraintLanguage.g:477:1: entryRuleCharacteristicType returns [EObject current=null] : iv_ruleCharacteristicType= ruleCharacteristicType EOF ;
    public final EObject entryRuleCharacteristicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicType = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:477:59: (iv_ruleCharacteristicType= ruleCharacteristicType EOF )
            // InternalPCMDFDConstraintLanguage.g:478:2: iv_ruleCharacteristicType= ruleCharacteristicType EOF
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
    // InternalPCMDFDConstraintLanguage.g:484:1: ruleCharacteristicType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCharacteristicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:490:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:491:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:491:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:492:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:496:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:497:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:497:4: (lv_name_1_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:498:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2());
            		
            // InternalPCMDFDConstraintLanguage.g:518:3: ( (otherlv_3= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:519:4: (otherlv_3= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:519:4: (otherlv_3= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:520:5: otherlv_3= RULE_ID
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
    // InternalPCMDFDConstraintLanguage.g:535:1: entryRuleCharacteristicClass returns [EObject current=null] : iv_ruleCharacteristicClass= ruleCharacteristicClass EOF ;
    public final EObject entryRuleCharacteristicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicClass = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:535:60: (iv_ruleCharacteristicClass= ruleCharacteristicClass EOF )
            // InternalPCMDFDConstraintLanguage.g:536:2: iv_ruleCharacteristicClass= ruleCharacteristicClass EOF
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
    // InternalPCMDFDConstraintLanguage.g:542:1: ruleCharacteristicClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' ) ;
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
            // InternalPCMDFDConstraintLanguage.g:548:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' ) )
            // InternalPCMDFDConstraintLanguage.g:549:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' )
            {
            // InternalPCMDFDConstraintLanguage.g:549:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}' )
            // InternalPCMDFDConstraintLanguage.g:550:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicTypeSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicClassAccess().getClassKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:554:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:555:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:555:4: (lv_name_1_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:556:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPCMDFDConstraintLanguage.g:576:3: ( (lv_members_3_0= ruleCharacteristicTypeSelector ) )
            // InternalPCMDFDConstraintLanguage.g:577:4: (lv_members_3_0= ruleCharacteristicTypeSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:577:4: (lv_members_3_0= ruleCharacteristicTypeSelector )
            // InternalPCMDFDConstraintLanguage.g:578:5: lv_members_3_0= ruleCharacteristicTypeSelector
            {

            					newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalPCMDFDConstraintLanguage.g:595:3: (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:596:4: otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicTypeSelector ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPCMDFDConstraintLanguage.g:600:4: ( (lv_members_5_0= ruleCharacteristicTypeSelector ) )
            	    // InternalPCMDFDConstraintLanguage.g:601:5: (lv_members_5_0= ruleCharacteristicTypeSelector )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:601:5: (lv_members_5_0= ruleCharacteristicTypeSelector )
            	    // InternalPCMDFDConstraintLanguage.g:602:6: lv_members_5_0= ruleCharacteristicTypeSelector
            	    {

            	    						newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:628:1: entryRuleCharacteristicTypeSelector returns [EObject current=null] : iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF ;
    public final EObject entryRuleCharacteristicTypeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicTypeSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:628:67: (iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:629:2: iv_ruleCharacteristicTypeSelector= ruleCharacteristicTypeSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:635:1: ruleCharacteristicTypeSelector returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) ) ;
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
            // InternalPCMDFDConstraintLanguage.g:641:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:642:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:642:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:643:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:643:3: ( (otherlv_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:644:4: (otherlv_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:644:4: (otherlv_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:645:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:660:3: ( ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' ) | ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:661:4: ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:661:4: ( ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) ) )
                    // InternalPCMDFDConstraintLanguage.g:662:5: ( (lv_negated_2_0= '!' ) )? ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:662:5: ( (lv_negated_2_0= '!' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==23) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalPCMDFDConstraintLanguage.g:663:6: (lv_negated_2_0= '!' )
                            {
                            // InternalPCMDFDConstraintLanguage.g:663:6: (lv_negated_2_0= '!' )
                            // InternalPCMDFDConstraintLanguage.g:664:7: lv_negated_2_0= '!'
                            {
                            lv_negated_2_0=(Token)match(input,23,FOLLOW_5); 

                            							newLeafNode(lv_negated_2_0, grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                            							}
                            							setWithLastConsumed(current, "negated", lv_negated_2_0 != null, "!");
                            						

                            }


                            }
                            break;

                    }

                    // InternalPCMDFDConstraintLanguage.g:676:5: ( (otherlv_3= RULE_ID ) )
                    // InternalPCMDFDConstraintLanguage.g:677:6: (otherlv_3= RULE_ID )
                    {
                    // InternalPCMDFDConstraintLanguage.g:677:6: (otherlv_3= RULE_ID )
                    // InternalPCMDFDConstraintLanguage.g:678:7: otherlv_3= RULE_ID
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
                    // InternalPCMDFDConstraintLanguage.g:691:4: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )
                    {
                    // InternalPCMDFDConstraintLanguage.g:691:4: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )
                    // InternalPCMDFDConstraintLanguage.g:692:5: otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalPCMDFDConstraintLanguage.g:696:5: ( (otherlv_5= RULE_ID ) )
                    // InternalPCMDFDConstraintLanguage.g:697:6: (otherlv_5= RULE_ID )
                    {
                    // InternalPCMDFDConstraintLanguage.g:697:6: (otherlv_5= RULE_ID )
                    // InternalPCMDFDConstraintLanguage.g:698:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

                    							newLeafNode(otherlv_5, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_1_0());
                    						

                    }


                    }

                    // InternalPCMDFDConstraintLanguage.g:709:5: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPCMDFDConstraintLanguage.g:710:6: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_5); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0());
                    	    					
                    	    // InternalPCMDFDConstraintLanguage.g:714:6: ( (otherlv_7= RULE_ID ) )
                    	    // InternalPCMDFDConstraintLanguage.g:715:7: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalPCMDFDConstraintLanguage.g:715:7: (otherlv_7= RULE_ID )
                    	    // InternalPCMDFDConstraintLanguage.g:716:8: otherlv_7= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    	    								}
                    	    							
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    								newLeafNode(otherlv_7, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_2_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalPCMDFDConstraintLanguage.g:734:4: ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:734:4: ( ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) ) )
                    // InternalPCMDFDConstraintLanguage.g:735:5: ( (lv_isVariableSelector_9_0= '$' ) ) ( (lv_variable_10_0= ruleCharacteristicVariableType ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:735:5: ( (lv_isVariableSelector_9_0= '$' ) )
                    // InternalPCMDFDConstraintLanguage.g:736:6: (lv_isVariableSelector_9_0= '$' )
                    {
                    // InternalPCMDFDConstraintLanguage.g:736:6: (lv_isVariableSelector_9_0= '$' )
                    // InternalPCMDFDConstraintLanguage.g:737:7: lv_isVariableSelector_9_0= '$'
                    {
                    lv_isVariableSelector_9_0=(Token)match(input,26,FOLLOW_5); 

                    							newLeafNode(lv_isVariableSelector_9_0, grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
                    							}
                    							setWithLastConsumed(current, "isVariableSelector", lv_isVariableSelector_9_0 != null, "$");
                    						

                    }


                    }

                    // InternalPCMDFDConstraintLanguage.g:749:5: ( (lv_variable_10_0= ruleCharacteristicVariableType ) )
                    // InternalPCMDFDConstraintLanguage.g:750:6: (lv_variable_10_0= ruleCharacteristicVariableType )
                    {
                    // InternalPCMDFDConstraintLanguage.g:750:6: (lv_variable_10_0= ruleCharacteristicVariableType )
                    // InternalPCMDFDConstraintLanguage.g:751:7: lv_variable_10_0= ruleCharacteristicVariableType
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
    // InternalPCMDFDConstraintLanguage.g:774:1: entryRuleCharacteristicVariableType returns [EObject current=null] : iv_ruleCharacteristicVariableType= ruleCharacteristicVariableType EOF ;
    public final EObject entryRuleCharacteristicVariableType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicVariableType = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:774:67: (iv_ruleCharacteristicVariableType= ruleCharacteristicVariableType EOF )
            // InternalPCMDFDConstraintLanguage.g:775:2: iv_ruleCharacteristicVariableType= ruleCharacteristicVariableType EOF
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
    // InternalPCMDFDConstraintLanguage.g:781:1: ruleCharacteristicVariableType returns [EObject current=null] : (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet ) ;
    public final EObject ruleCharacteristicVariableType() throws RecognitionException {
        EObject current = null;

        EObject this_CharacteristicVariable_0 = null;

        EObject this_CharacteristicSet_1 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:787:2: ( (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet ) )
            // InternalPCMDFDConstraintLanguage.g:788:2: (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet )
            {
            // InternalPCMDFDConstraintLanguage.g:788:2: (this_CharacteristicVariable_0= ruleCharacteristicVariable | this_CharacteristicSet_1= ruleCharacteristicSet )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==27) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||(LA9_1>=20 && LA9_1<=21)||LA9_1==30||(LA9_1>=34 && LA9_1<=35)) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:789:3: this_CharacteristicVariable_0= ruleCharacteristicVariable
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
                    // InternalPCMDFDConstraintLanguage.g:798:3: this_CharacteristicSet_1= ruleCharacteristicSet
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
    // InternalPCMDFDConstraintLanguage.g:810:1: entryRuleCharacteristicVariable returns [EObject current=null] : iv_ruleCharacteristicVariable= ruleCharacteristicVariable EOF ;
    public final EObject entryRuleCharacteristicVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicVariable = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:810:63: (iv_ruleCharacteristicVariable= ruleCharacteristicVariable EOF )
            // InternalPCMDFDConstraintLanguage.g:811:2: iv_ruleCharacteristicVariable= ruleCharacteristicVariable EOF
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
    // InternalPCMDFDConstraintLanguage.g:817:1: ruleCharacteristicVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCharacteristicVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:823:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:824:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPCMDFDConstraintLanguage.g:824:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:825:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:825:3: (lv_name_0_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:826:4: lv_name_0_0= RULE_ID
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
    // InternalPCMDFDConstraintLanguage.g:845:1: entryRuleCharacteristicSet returns [EObject current=null] : iv_ruleCharacteristicSet= ruleCharacteristicSet EOF ;
    public final EObject entryRuleCharacteristicSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicSet = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:845:58: (iv_ruleCharacteristicSet= ruleCharacteristicSet EOF )
            // InternalPCMDFDConstraintLanguage.g:846:2: iv_ruleCharacteristicSet= ruleCharacteristicSet EOF
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
    // InternalPCMDFDConstraintLanguage.g:852:1: ruleCharacteristicSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' ) ;
    public final EObject ruleCharacteristicSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:858:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' ) )
            // InternalPCMDFDConstraintLanguage.g:859:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' )
            {
            // InternalPCMDFDConstraintLanguage.g:859:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}' )
            // InternalPCMDFDConstraintLanguage.g:860:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{}'
            {
            // InternalPCMDFDConstraintLanguage.g:860:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:861:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:861:4: (lv_name_0_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:862:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:886:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:886:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalPCMDFDConstraintLanguage.g:887:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalPCMDFDConstraintLanguage.g:893:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:899:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:900:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:900:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalPCMDFDConstraintLanguage.g:901:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:905:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalPCMDFDConstraintLanguage.g:906:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalPCMDFDConstraintLanguage.g:906:4: (lv_importURI_1_0= RULE_STRING )
            // InternalPCMDFDConstraintLanguage.g:907:5: lv_importURI_1_0= RULE_STRING
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
    // InternalPCMDFDConstraintLanguage.g:927:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:927:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalPCMDFDConstraintLanguage.g:928:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalPCMDFDConstraintLanguage.g:934:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:940:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) )
            // InternalPCMDFDConstraintLanguage.g:941:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            {
            // InternalPCMDFDConstraintLanguage.g:941:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            // InternalPCMDFDConstraintLanguage.g:942:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:946:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:947:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:947:4: (lv_name_1_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:948:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPCMDFDConstraintLanguage.g:968:3: ( (lv_rule_3_0= ruleRule ) )
            // InternalPCMDFDConstraintLanguage.g:969:4: (lv_rule_3_0= ruleRule )
            {
            // InternalPCMDFDConstraintLanguage.g:969:4: (lv_rule_3_0= ruleRule )
            // InternalPCMDFDConstraintLanguage.g:970:5: lv_rule_3_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:995:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:995:45: (iv_ruleRule= ruleRule EOF )
            // InternalPCMDFDConstraintLanguage.g:996:2: iv_ruleRule= ruleRule EOF
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
    // InternalPCMDFDConstraintLanguage.g:1002:1: ruleRule returns [EObject current=null] : ( ( (lv_destinationSelectors_0_0= ruleDestinationSelector ) ) (otherlv_1= '&' ( (lv_destinationSelectors_2_0= ruleDestinationSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_dataSelectors_4_0= ruleDataSelector ) ) (otherlv_5= '&' ( (lv_dataSelectors_6_0= ruleDataSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_destinationSelectors_0_0 = null;

        EObject lv_destinationSelectors_2_0 = null;

        EObject lv_statement_3_0 = null;

        EObject lv_dataSelectors_4_0 = null;

        EObject lv_dataSelectors_6_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1008:2: ( ( ( (lv_destinationSelectors_0_0= ruleDestinationSelector ) ) (otherlv_1= '&' ( (lv_destinationSelectors_2_0= ruleDestinationSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_dataSelectors_4_0= ruleDataSelector ) ) (otherlv_5= '&' ( (lv_dataSelectors_6_0= ruleDataSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? ) )
            // InternalPCMDFDConstraintLanguage.g:1009:2: ( ( (lv_destinationSelectors_0_0= ruleDestinationSelector ) ) (otherlv_1= '&' ( (lv_destinationSelectors_2_0= ruleDestinationSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_dataSelectors_4_0= ruleDataSelector ) ) (otherlv_5= '&' ( (lv_dataSelectors_6_0= ruleDataSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? )
            {
            // InternalPCMDFDConstraintLanguage.g:1009:2: ( ( (lv_destinationSelectors_0_0= ruleDestinationSelector ) ) (otherlv_1= '&' ( (lv_destinationSelectors_2_0= ruleDestinationSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_dataSelectors_4_0= ruleDataSelector ) ) (otherlv_5= '&' ( (lv_dataSelectors_6_0= ruleDataSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )? )
            // InternalPCMDFDConstraintLanguage.g:1010:3: ( (lv_destinationSelectors_0_0= ruleDestinationSelector ) ) (otherlv_1= '&' ( (lv_destinationSelectors_2_0= ruleDestinationSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_dataSelectors_4_0= ruleDataSelector ) ) (otherlv_5= '&' ( (lv_dataSelectors_6_0= ruleDataSelector ) ) )* ( (lv_condition_7_0= ruleCondition ) )?
            {
            // InternalPCMDFDConstraintLanguage.g:1010:3: ( (lv_destinationSelectors_0_0= ruleDestinationSelector ) )
            // InternalPCMDFDConstraintLanguage.g:1011:4: (lv_destinationSelectors_0_0= ruleDestinationSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:1011:4: (lv_destinationSelectors_0_0= ruleDestinationSelector )
            // InternalPCMDFDConstraintLanguage.g:1012:5: lv_destinationSelectors_0_0= ruleDestinationSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_destinationSelectors_0_0=ruleDestinationSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"destinationSelectors",
            						lv_destinationSelectors_0_0,
            						"org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.PCMDFDConstraintLanguage.DestinationSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPCMDFDConstraintLanguage.g:1029:3: (otherlv_1= '&' ( (lv_destinationSelectors_2_0= ruleDestinationSelector ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:1030:4: otherlv_1= '&' ( (lv_destinationSelectors_2_0= ruleDestinationSelector ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getAmpersandKeyword_1_0());
            	    			
            	    // InternalPCMDFDConstraintLanguage.g:1034:4: ( (lv_destinationSelectors_2_0= ruleDestinationSelector ) )
            	    // InternalPCMDFDConstraintLanguage.g:1035:5: (lv_destinationSelectors_2_0= ruleDestinationSelector )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1035:5: (lv_destinationSelectors_2_0= ruleDestinationSelector )
            	    // InternalPCMDFDConstraintLanguage.g:1036:6: lv_destinationSelectors_2_0= ruleDestinationSelector
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_destinationSelectors_2_0=ruleDestinationSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"destinationSelectors",
            	    							lv_destinationSelectors_2_0,
            	    							"org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.PCMDFDConstraintLanguage.DestinationSelector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalPCMDFDConstraintLanguage.g:1054:3: ( (lv_statement_3_0= ruleStatement ) )
            // InternalPCMDFDConstraintLanguage.g:1055:4: (lv_statement_3_0= ruleStatement )
            {
            // InternalPCMDFDConstraintLanguage.g:1055:4: (lv_statement_3_0= ruleStatement )
            // InternalPCMDFDConstraintLanguage.g:1056:5: lv_statement_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalPCMDFDConstraintLanguage.g:1073:3: ( (lv_dataSelectors_4_0= ruleDataSelector ) )
            // InternalPCMDFDConstraintLanguage.g:1074:4: (lv_dataSelectors_4_0= ruleDataSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:1074:4: (lv_dataSelectors_4_0= ruleDataSelector )
            // InternalPCMDFDConstraintLanguage.g:1075:5: lv_dataSelectors_4_0= ruleDataSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_dataSelectors_4_0=ruleDataSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"dataSelectors",
            						lv_dataSelectors_4_0,
            						"de.sebinside.dcp.dsl.DSL.DataSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPCMDFDConstraintLanguage.g:1092:3: (otherlv_5= '&' ( (lv_dataSelectors_6_0= ruleDataSelector ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:1093:4: otherlv_5= '&' ( (lv_dataSelectors_6_0= ruleDataSelector ) )
            	    {
            	    otherlv_5=(Token)match(input,30,FOLLOW_18); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAmpersandKeyword_4_0());
            	    			
            	    // InternalPCMDFDConstraintLanguage.g:1097:4: ( (lv_dataSelectors_6_0= ruleDataSelector ) )
            	    // InternalPCMDFDConstraintLanguage.g:1098:5: (lv_dataSelectors_6_0= ruleDataSelector )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1098:5: (lv_dataSelectors_6_0= ruleDataSelector )
            	    // InternalPCMDFDConstraintLanguage.g:1099:6: lv_dataSelectors_6_0= ruleDataSelector
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_dataSelectors_6_0=ruleDataSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataSelectors",
            	    							lv_dataSelectors_6_0,
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

            // InternalPCMDFDConstraintLanguage.g:1117:3: ( (lv_condition_7_0= ruleCondition ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1118:4: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1118:4: (lv_condition_7_0= ruleCondition )
                    // InternalPCMDFDConstraintLanguage.g:1119:5: lv_condition_7_0= ruleCondition
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
    // InternalPCMDFDConstraintLanguage.g:1140:1: entryRuleDataSelector returns [EObject current=null] : iv_ruleDataSelector= ruleDataSelector EOF ;
    public final EObject entryRuleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1140:53: (iv_ruleDataSelector= ruleDataSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:1141:2: iv_ruleDataSelector= ruleDataSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:1147:1: ruleDataSelector returns [EObject current=null] : (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) ;
    public final EObject ruleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeSelector_0 = null;

        EObject this_AttributeClassSelector_1 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1153:2: ( (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) )
            // InternalPCMDFDConstraintLanguage.g:1154:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:1154:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1155:3: this_AttributeSelector_0= ruleAttributeSelector
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
                    // InternalPCMDFDConstraintLanguage.g:1164:3: this_AttributeClassSelector_1= ruleAttributeClassSelector
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
    // InternalPCMDFDConstraintLanguage.g:1176:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1176:58: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:1177:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:1183:1: ruleAttributeSelector returns [EObject current=null] : (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1189:2: ( (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1190:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1190:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) ) )
            // InternalPCMDFDConstraintLanguage.g:1191:3: otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:1195:3: ( (lv_ref_1_0= ruleCharacteristicTypeSelector ) )
            // InternalPCMDFDConstraintLanguage.g:1196:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            {
            // InternalPCMDFDConstraintLanguage.g:1196:4: (lv_ref_1_0= ruleCharacteristicTypeSelector )
            // InternalPCMDFDConstraintLanguage.g:1197:5: lv_ref_1_0= ruleCharacteristicTypeSelector
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
    // InternalPCMDFDConstraintLanguage.g:1218:1: entryRuleAttributeClassSelector returns [EObject current=null] : iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF ;
    public final EObject entryRuleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeClassSelector = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1218:63: (iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF )
            // InternalPCMDFDConstraintLanguage.g:1219:2: iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF
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
    // InternalPCMDFDConstraintLanguage.g:1225:1: ruleAttributeClassSelector returns [EObject current=null] : (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1231:2: ( (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1232:2: (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1232:2: (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:1233:3: otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:1237:3: ( (otherlv_1= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:1238:4: (otherlv_1= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:1238:4: (otherlv_1= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:1239:5: otherlv_1= RULE_ID
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


    // $ANTLR start "entryRuleStatement"
    // InternalPCMDFDConstraintLanguage.g:1254:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1254:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalPCMDFDConstraintLanguage.g:1255:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalPCMDFDConstraintLanguage.g:1261:1: ruleStatement returns [EObject current=null] : ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_modality_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1267:2: ( ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1268:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1268:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            // InternalPCMDFDConstraintLanguage.g:1269:3: ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1269:3: ( (lv_modality_0_0= ruleStatementModality ) )
            // InternalPCMDFDConstraintLanguage.g:1270:4: (lv_modality_0_0= ruleStatementModality )
            {
            // InternalPCMDFDConstraintLanguage.g:1270:4: (lv_modality_0_0= ruleStatementModality )
            // InternalPCMDFDConstraintLanguage.g:1271:5: lv_modality_0_0= ruleStatementModality
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalPCMDFDConstraintLanguage.g:1288:3: ( (lv_type_1_0= ruleStatementType ) )
            // InternalPCMDFDConstraintLanguage.g:1289:4: (lv_type_1_0= ruleStatementType )
            {
            // InternalPCMDFDConstraintLanguage.g:1289:4: (lv_type_1_0= ruleStatementType )
            // InternalPCMDFDConstraintLanguage.g:1290:5: lv_type_1_0= ruleStatementType
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
    // InternalPCMDFDConstraintLanguage.g:1311:1: entryRuleStatementType returns [EObject current=null] : iv_ruleStatementType= ruleStatementType EOF ;
    public final EObject entryRuleStatementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementType = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1311:54: (iv_ruleStatementType= ruleStatementType EOF )
            // InternalPCMDFDConstraintLanguage.g:1312:2: iv_ruleStatementType= ruleStatementType EOF
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
    // InternalPCMDFDConstraintLanguage.g:1318:1: ruleStatementType returns [EObject current=null] : ( (lv_name_0_0= 'FLOWS' ) ) ;
    public final EObject ruleStatementType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1324:2: ( ( (lv_name_0_0= 'FLOWS' ) ) )
            // InternalPCMDFDConstraintLanguage.g:1325:2: ( (lv_name_0_0= 'FLOWS' ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1325:2: ( (lv_name_0_0= 'FLOWS' ) )
            // InternalPCMDFDConstraintLanguage.g:1326:3: (lv_name_0_0= 'FLOWS' )
            {
            // InternalPCMDFDConstraintLanguage.g:1326:3: (lv_name_0_0= 'FLOWS' )
            // InternalPCMDFDConstraintLanguage.g:1327:4: lv_name_0_0= 'FLOWS'
            {
            lv_name_0_0=(Token)match(input,33,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:1342:1: entryRuleStatementModality returns [EObject current=null] : iv_ruleStatementModality= ruleStatementModality EOF ;
    public final EObject entryRuleStatementModality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementModality = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1342:58: (iv_ruleStatementModality= ruleStatementModality EOF )
            // InternalPCMDFDConstraintLanguage.g:1343:2: iv_ruleStatementModality= ruleStatementModality EOF
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
    // InternalPCMDFDConstraintLanguage.g:1349:1: ruleStatementModality returns [EObject current=null] : ( (lv_name_0_0= 'NEVER' ) ) ;
    public final EObject ruleStatementModality() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1355:2: ( ( (lv_name_0_0= 'NEVER' ) ) )
            // InternalPCMDFDConstraintLanguage.g:1356:2: ( (lv_name_0_0= 'NEVER' ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1356:2: ( (lv_name_0_0= 'NEVER' ) )
            // InternalPCMDFDConstraintLanguage.g:1357:3: (lv_name_0_0= 'NEVER' )
            {
            // InternalPCMDFDConstraintLanguage.g:1357:3: (lv_name_0_0= 'NEVER' )
            // InternalPCMDFDConstraintLanguage.g:1358:4: lv_name_0_0= 'NEVER'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:1373:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1373:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalPCMDFDConstraintLanguage.g:1374:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalPCMDFDConstraintLanguage.g:1380:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operation_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1386:2: ( (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1387:2: (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1387:2: (otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) ) )
            // InternalPCMDFDConstraintLanguage.g:1388:3: otherlv_0= 'WHERE' ( (lv_operation_1_0= ruleBooleanOperation ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getWHEREKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:1392:3: ( (lv_operation_1_0= ruleBooleanOperation ) )
            // InternalPCMDFDConstraintLanguage.g:1393:4: (lv_operation_1_0= ruleBooleanOperation )
            {
            // InternalPCMDFDConstraintLanguage.g:1393:4: (lv_operation_1_0= ruleBooleanOperation )
            // InternalPCMDFDConstraintLanguage.g:1394:5: lv_operation_1_0= ruleBooleanOperation
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
    // InternalPCMDFDConstraintLanguage.g:1415:1: entryRuleCharacteristicReference returns [EObject current=null] : iv_ruleCharacteristicReference= ruleCharacteristicReference EOF ;
    public final EObject entryRuleCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicReference = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1415:64: (iv_ruleCharacteristicReference= ruleCharacteristicReference EOF )
            // InternalPCMDFDConstraintLanguage.g:1416:2: iv_ruleCharacteristicReference= ruleCharacteristicReference EOF
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
    // InternalPCMDFDConstraintLanguage.g:1422:1: ruleCharacteristicReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCharacteristicReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1428:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPCMDFDConstraintLanguage.g:1429:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1429:2: ( (otherlv_0= RULE_ID ) )
            // InternalPCMDFDConstraintLanguage.g:1430:3: (otherlv_0= RULE_ID )
            {
            // InternalPCMDFDConstraintLanguage.g:1430:3: (otherlv_0= RULE_ID )
            // InternalPCMDFDConstraintLanguage.g:1431:4: otherlv_0= RULE_ID
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
    // InternalPCMDFDConstraintLanguage.g:1445:1: entryRuleCharacteristicSetReference returns [EObject current=null] : iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF ;
    public final EObject entryRuleCharacteristicSetReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicSetReference = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1445:67: (iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF )
            // InternalPCMDFDConstraintLanguage.g:1446:2: iv_ruleCharacteristicSetReference= ruleCharacteristicSetReference EOF
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
    // InternalPCMDFDConstraintLanguage.g:1452:1: ruleCharacteristicSetReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) ) ;
    public final EObject ruleCharacteristicSetReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1458:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1459:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1459:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==19||(LA14_0>=42 && LA14_0<=44)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1460:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1460:3: ( (otherlv_0= RULE_ID ) )
                    // InternalPCMDFDConstraintLanguage.g:1461:4: (otherlv_0= RULE_ID )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1461:4: (otherlv_0= RULE_ID )
                    // InternalPCMDFDConstraintLanguage.g:1462:5: otherlv_0= RULE_ID
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
                    // InternalPCMDFDConstraintLanguage.g:1474:3: ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1474:3: ( (lv_ref_1_0= ruleCharacteristsicSetOperation ) )
                    // InternalPCMDFDConstraintLanguage.g:1475:4: (lv_ref_1_0= ruleCharacteristsicSetOperation )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1475:4: (lv_ref_1_0= ruleCharacteristsicSetOperation )
                    // InternalPCMDFDConstraintLanguage.g:1476:5: lv_ref_1_0= ruleCharacteristsicSetOperation
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
    // InternalPCMDFDConstraintLanguage.g:1497:1: entryRuleBooleanOperation returns [EObject current=null] : iv_ruleBooleanOperation= ruleBooleanOperation EOF ;
    public final EObject entryRuleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1497:57: (iv_ruleBooleanOperation= ruleBooleanOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1498:2: iv_ruleBooleanOperation= ruleBooleanOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1504:1: ruleBooleanOperation returns [EObject current=null] : this_LogicalOrOperation_0= ruleLogicalOrOperation ;
    public final EObject ruleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrOperation_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1510:2: (this_LogicalOrOperation_0= ruleLogicalOrOperation )
            // InternalPCMDFDConstraintLanguage.g:1511:2: this_LogicalOrOperation_0= ruleLogicalOrOperation
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
    // InternalPCMDFDConstraintLanguage.g:1522:1: entryRuleCharacteristsicSetOperation returns [EObject current=null] : iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF ;
    public final EObject entryRuleCharacteristsicSetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristsicSetOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1522:68: (iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1523:2: iv_ruleCharacteristsicSetOperation= ruleCharacteristsicSetOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1529:1: ruleCharacteristsicSetOperation returns [EObject current=null] : (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation ) ;
    public final EObject ruleCharacteristsicSetOperation() throws RecognitionException {
        EObject current = null;

        EObject this_CreateSetOperation_0 = null;

        EObject this_IntersectionOperation_1 = null;

        EObject this_UnionOperation_2 = null;

        EObject this_SubtractOperation_3 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1535:2: ( (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation ) )
            // InternalPCMDFDConstraintLanguage.g:1536:2: (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation )
            {
            // InternalPCMDFDConstraintLanguage.g:1536:2: (this_CreateSetOperation_0= ruleCreateSetOperation | this_IntersectionOperation_1= ruleIntersectionOperation | this_UnionOperation_2= ruleUnionOperation | this_SubtractOperation_3= ruleSubtractOperation )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt15=1;
                }
                break;
            case 42:
                {
                alt15=2;
                }
                break;
            case 43:
                {
                alt15=3;
                }
                break;
            case 44:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1537:3: this_CreateSetOperation_0= ruleCreateSetOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1546:3: this_IntersectionOperation_1= ruleIntersectionOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1555:3: this_UnionOperation_2= ruleUnionOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1564:3: this_SubtractOperation_3= ruleSubtractOperation
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
    // InternalPCMDFDConstraintLanguage.g:1576:1: entryRuleLogicalOrOperation returns [EObject current=null] : iv_ruleLogicalOrOperation= ruleLogicalOrOperation EOF ;
    public final EObject entryRuleLogicalOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1576:59: (iv_ruleLogicalOrOperation= ruleLogicalOrOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1577:2: iv_ruleLogicalOrOperation= ruleLogicalOrOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1583:1: ruleLogicalOrOperation returns [EObject current=null] : (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* ) ;
    public final EObject ruleLogicalOrOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1589:2: ( (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* ) )
            // InternalPCMDFDConstraintLanguage.g:1590:2: (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* )
            {
            // InternalPCMDFDConstraintLanguage.g:1590:2: (this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )* )
            // InternalPCMDFDConstraintLanguage.g:1591:3: this_LogicalAndOperation_0= ruleLogicalAndOperation ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalOrOperationAccess().getLogicalAndOperationParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_LogicalAndOperation_0=ruleLogicalAndOperation();

            state._fsp--;


            			current = this_LogicalAndOperation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPCMDFDConstraintLanguage.g:1599:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:1600:4: () otherlv_2= '|' ( (lv_right_3_0= ruleLogicalAndOperation ) )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1600:4: ()
            	    // InternalPCMDFDConstraintLanguage.g:1601:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicalOrOperationAccess().getLogicalOrOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLogicalOrOperationAccess().getVerticalLineKeyword_1_1());
            	    			
            	    // InternalPCMDFDConstraintLanguage.g:1611:4: ( (lv_right_3_0= ruleLogicalAndOperation ) )
            	    // InternalPCMDFDConstraintLanguage.g:1612:5: (lv_right_3_0= ruleLogicalAndOperation )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1612:5: (lv_right_3_0= ruleLogicalAndOperation )
            	    // InternalPCMDFDConstraintLanguage.g:1613:6: lv_right_3_0= ruleLogicalAndOperation
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalOrOperationAccess().getRightLogicalAndOperationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop16;
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
    // InternalPCMDFDConstraintLanguage.g:1635:1: entryRuleLogicalAndOperation returns [EObject current=null] : iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF ;
    public final EObject entryRuleLogicalAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1635:60: (iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1636:2: iv_ruleLogicalAndOperation= ruleLogicalAndOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1642:1: ruleLogicalAndOperation returns [EObject current=null] : (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* ) ;
    public final EObject ruleLogicalAndOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNegationOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1648:2: ( (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* ) )
            // InternalPCMDFDConstraintLanguage.g:1649:2: (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* )
            {
            // InternalPCMDFDConstraintLanguage.g:1649:2: (this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )* )
            // InternalPCMDFDConstraintLanguage.g:1650:3: this_LogicalNegationOperation_0= ruleLogicalNegationOperation ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalAndOperationAccess().getLogicalNegationOperationParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_LogicalNegationOperation_0=ruleLogicalNegationOperation();

            state._fsp--;


            			current = this_LogicalNegationOperation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPCMDFDConstraintLanguage.g:1658:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPCMDFDConstraintLanguage.g:1659:4: () otherlv_2= '&' ( (lv_right_3_0= ruleLogicalNegationOperation ) )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1659:4: ()
            	    // InternalPCMDFDConstraintLanguage.g:1660:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicalAndOperationAccess().getLogicalAndOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_1_1());
            	    			
            	    // InternalPCMDFDConstraintLanguage.g:1670:4: ( (lv_right_3_0= ruleLogicalNegationOperation ) )
            	    // InternalPCMDFDConstraintLanguage.g:1671:5: (lv_right_3_0= ruleLogicalNegationOperation )
            	    {
            	    // InternalPCMDFDConstraintLanguage.g:1671:5: (lv_right_3_0= ruleLogicalNegationOperation )
            	    // InternalPCMDFDConstraintLanguage.g:1672:6: lv_right_3_0= ruleLogicalNegationOperation
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalAndOperationAccess().getRightLogicalNegationOperationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop17;
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
    // InternalPCMDFDConstraintLanguage.g:1694:1: entryRuleLogicalNegationOperation returns [EObject current=null] : iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF ;
    public final EObject entryRuleLogicalNegationOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNegationOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1694:65: (iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1695:2: iv_ruleLogicalNegationOperation= ruleLogicalNegationOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1701:1: ruleLogicalNegationOperation returns [EObject current=null] : (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) ) ;
    public final EObject ruleLogicalNegationOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EncapsulatedLogicalOperation_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1707:2: ( (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1708:2: (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1708:2: (this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation | ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==37||LA18_0==41||LA18_0==45) ) {
                alt18=1;
            }
            else if ( (LA18_0==23) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1709:3: this_EncapsulatedLogicalOperation_0= ruleEncapsulatedLogicalOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1718:3: ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1718:3: ( () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) ) )
                    // InternalPCMDFDConstraintLanguage.g:1719:4: () otherlv_2= '!' ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1719:4: ()
                    // InternalPCMDFDConstraintLanguage.g:1720:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLogicalNegationOperationAccess().getLogicalNegationOperationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalPCMDFDConstraintLanguage.g:1730:4: ( (lv_value_3_0= ruleEncapsulatedLogicalOperation ) )
                    // InternalPCMDFDConstraintLanguage.g:1731:5: (lv_value_3_0= ruleEncapsulatedLogicalOperation )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1731:5: (lv_value_3_0= ruleEncapsulatedLogicalOperation )
                    // InternalPCMDFDConstraintLanguage.g:1732:6: lv_value_3_0= ruleEncapsulatedLogicalOperation
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
    // InternalPCMDFDConstraintLanguage.g:1754:1: entryRuleEncapsulatedLogicalOperation returns [EObject current=null] : iv_ruleEncapsulatedLogicalOperation= ruleEncapsulatedLogicalOperation EOF ;
    public final EObject entryRuleEncapsulatedLogicalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncapsulatedLogicalOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1754:69: (iv_ruleEncapsulatedLogicalOperation= ruleEncapsulatedLogicalOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1755:2: iv_ruleEncapsulatedLogicalOperation= ruleEncapsulatedLogicalOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1761:1: ruleEncapsulatedLogicalOperation returns [EObject current=null] : (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) ) ;
    public final EObject ruleEncapsulatedLogicalOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_SimpleBooleanOperation_0 = null;

        EObject this_LogicalOrOperation_2 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1767:2: ( (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) ) )
            // InternalPCMDFDConstraintLanguage.g:1768:2: (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1768:2: (this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation | (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==41||LA19_0==45) ) {
                alt19=1;
            }
            else if ( (LA19_0==37) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1769:3: this_SimpleBooleanOperation_0= ruleSimpleBooleanOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1778:3: (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' )
                    {
                    // InternalPCMDFDConstraintLanguage.g:1778:3: (otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')' )
                    // InternalPCMDFDConstraintLanguage.g:1779:4: otherlv_1= '(' this_LogicalOrOperation_2= ruleLogicalOrOperation otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getEncapsulatedLogicalOperationAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getEncapsulatedLogicalOperationAccess().getLogicalOrOperationParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_LogicalOrOperation_2=ruleLogicalOrOperation();

                    state._fsp--;


                    				current = this_LogicalOrOperation_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:1800:1: entryRuleSimpleBooleanOperation returns [EObject current=null] : iv_ruleSimpleBooleanOperation= ruleSimpleBooleanOperation EOF ;
    public final EObject entryRuleSimpleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBooleanOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1800:63: (iv_ruleSimpleBooleanOperation= ruleSimpleBooleanOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1801:2: iv_ruleSimpleBooleanOperation= ruleSimpleBooleanOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1807:1: ruleSimpleBooleanOperation returns [EObject current=null] : (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation ) ;
    public final EObject ruleSimpleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject this_EmptySetOperation_0 = null;

        EObject this_VariableEqualityOperation_1 = null;

        EObject this_VariableInequalityOperation_2 = null;

        EObject this_ElementOfOperation_3 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1813:2: ( (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation ) )
            // InternalPCMDFDConstraintLanguage.g:1814:2: (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation )
            {
            // InternalPCMDFDConstraintLanguage.g:1814:2: (this_EmptySetOperation_0= ruleEmptySetOperation | this_VariableEqualityOperation_1= ruleVariableEqualityOperation | this_VariableInequalityOperation_2= ruleVariableInequalityOperation | this_ElementOfOperation_3= ruleElementOfOperation )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==40) ) {
                    alt20=3;
                }
                else if ( (LA20_2==39) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:1815:3: this_EmptySetOperation_0= ruleEmptySetOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1824:3: this_VariableEqualityOperation_1= ruleVariableEqualityOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1833:3: this_VariableInequalityOperation_2= ruleVariableInequalityOperation
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
                    // InternalPCMDFDConstraintLanguage.g:1842:3: this_ElementOfOperation_3= ruleElementOfOperation
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
    // InternalPCMDFDConstraintLanguage.g:1854:1: entryRuleVariableEqualityOperation returns [EObject current=null] : iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF ;
    public final EObject entryRuleVariableEqualityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableEqualityOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1854:66: (iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1855:2: iv_ruleVariableEqualityOperation= ruleVariableEqualityOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1861:1: ruleVariableEqualityOperation returns [EObject current=null] : ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) ;
    public final EObject ruleVariableEqualityOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1867:2: ( ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1868:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1868:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            // InternalPCMDFDConstraintLanguage.g:1869:3: ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '==' ( (lv_right_2_0= ruleCharacteristicReference ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1869:3: ( (lv_left_0_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:1870:4: (lv_left_0_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:1870:4: (lv_left_0_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:1871:5: lv_left_0_0= ruleCharacteristicReference
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

            otherlv_1=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableEqualityOperationAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:1892:3: ( (lv_right_2_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:1893:4: (lv_right_2_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:1893:4: (lv_right_2_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:1894:5: lv_right_2_0= ruleCharacteristicReference
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
    // InternalPCMDFDConstraintLanguage.g:1915:1: entryRuleVariableInequalityOperation returns [EObject current=null] : iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF ;
    public final EObject entryRuleVariableInequalityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableInequalityOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1915:68: (iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1916:2: iv_ruleVariableInequalityOperation= ruleVariableInequalityOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1922:1: ruleVariableInequalityOperation returns [EObject current=null] : ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) ;
    public final EObject ruleVariableInequalityOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1928:2: ( ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) ) )
            // InternalPCMDFDConstraintLanguage.g:1929:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1929:2: ( ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) ) )
            // InternalPCMDFDConstraintLanguage.g:1930:3: ( (lv_left_0_0= ruleCharacteristicReference ) ) otherlv_1= '!=' ( (lv_right_2_0= ruleCharacteristicReference ) )
            {
            // InternalPCMDFDConstraintLanguage.g:1930:3: ( (lv_left_0_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:1931:4: (lv_left_0_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:1931:4: (lv_left_0_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:1932:5: lv_left_0_0= ruleCharacteristicReference
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

            otherlv_1=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableInequalityOperationAccess().getExclamationMarkEqualsSignKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:1953:3: ( (lv_right_2_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:1954:4: (lv_right_2_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:1954:4: (lv_right_2_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:1955:5: lv_right_2_0= ruleCharacteristicReference
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
    // InternalPCMDFDConstraintLanguage.g:1976:1: entryRuleEmptySetOperation returns [EObject current=null] : iv_ruleEmptySetOperation= ruleEmptySetOperation EOF ;
    public final EObject entryRuleEmptySetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptySetOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:1976:58: (iv_ruleEmptySetOperation= ruleEmptySetOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:1977:2: iv_ruleEmptySetOperation= ruleEmptySetOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:1983:1: ruleEmptySetOperation returns [EObject current=null] : (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleEmptySetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:1989:2: ( (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' ) )
            // InternalPCMDFDConstraintLanguage.g:1990:2: (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' )
            {
            // InternalPCMDFDConstraintLanguage.g:1990:2: (otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')' )
            // InternalPCMDFDConstraintLanguage.g:1991:3: otherlv_0= 'isEmpty' otherlv_1= '(' ( (lv_value_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getEmptySetOperationAccess().getIsEmptyKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptySetOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:1999:3: ( (lv_value_2_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2000:4: (lv_value_2_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2000:4: (lv_value_2_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2001:5: lv_value_2_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getEmptySetOperationAccess().getValueCharacteristicSetReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2026:1: entryRuleIntersectionOperation returns [EObject current=null] : iv_ruleIntersectionOperation= ruleIntersectionOperation EOF ;
    public final EObject entryRuleIntersectionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectionOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2026:62: (iv_ruleIntersectionOperation= ruleIntersectionOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2027:2: iv_ruleIntersectionOperation= ruleIntersectionOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2033:1: ruleIntersectionOperation returns [EObject current=null] : (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
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
            // InternalPCMDFDConstraintLanguage.g:2039:2: ( (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalPCMDFDConstraintLanguage.g:2040:2: (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalPCMDFDConstraintLanguage.g:2040:2: (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalPCMDFDConstraintLanguage.g:2041:3: otherlv_0= 'intersection' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getIntersectionOperationAccess().getIntersectionKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getIntersectionOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2049:3: ( (lv_left_2_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2050:4: (lv_left_2_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2050:4: (lv_left_2_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2051:5: lv_left_2_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getIntersectionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getIntersectionOperationAccess().getCommaKeyword_3());
            		
            // InternalPCMDFDConstraintLanguage.g:2072:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2073:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2073:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2074:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getIntersectionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2099:1: entryRuleUnionOperation returns [EObject current=null] : iv_ruleUnionOperation= ruleUnionOperation EOF ;
    public final EObject entryRuleUnionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2099:55: (iv_ruleUnionOperation= ruleUnionOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2100:2: iv_ruleUnionOperation= ruleUnionOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2106:1: ruleUnionOperation returns [EObject current=null] : (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
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
            // InternalPCMDFDConstraintLanguage.g:2112:2: ( (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalPCMDFDConstraintLanguage.g:2113:2: (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalPCMDFDConstraintLanguage.g:2113:2: (otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalPCMDFDConstraintLanguage.g:2114:3: otherlv_0= 'union' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getUnionOperationAccess().getUnionKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getUnionOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2122:3: ( (lv_left_2_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2123:4: (lv_left_2_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2123:4: (lv_left_2_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2124:5: lv_left_2_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getUnionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getUnionOperationAccess().getCommaKeyword_3());
            		
            // InternalPCMDFDConstraintLanguage.g:2145:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2146:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2146:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2147:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getUnionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2172:1: entryRuleSubtractOperation returns [EObject current=null] : iv_ruleSubtractOperation= ruleSubtractOperation EOF ;
    public final EObject entryRuleSubtractOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtractOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2172:58: (iv_ruleSubtractOperation= ruleSubtractOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2173:2: iv_ruleSubtractOperation= ruleSubtractOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2179:1: ruleSubtractOperation returns [EObject current=null] : (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
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
            // InternalPCMDFDConstraintLanguage.g:2185:2: ( (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalPCMDFDConstraintLanguage.g:2186:2: (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalPCMDFDConstraintLanguage.g:2186:2: (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalPCMDFDConstraintLanguage.g:2187:3: otherlv_0= 'subtract' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicSetReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getSubtractOperationAccess().getSubtractKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getSubtractOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2195:3: ( (lv_left_2_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2196:4: (lv_left_2_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2196:4: (lv_left_2_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2197:5: lv_left_2_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getSubtractOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getSubtractOperationAccess().getCommaKeyword_3());
            		
            // InternalPCMDFDConstraintLanguage.g:2218:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2219:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2219:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2220:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getSubtractOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2245:1: entryRuleElementOfOperation returns [EObject current=null] : iv_ruleElementOfOperation= ruleElementOfOperation EOF ;
    public final EObject entryRuleElementOfOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementOfOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2245:59: (iv_ruleElementOfOperation= ruleElementOfOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2246:2: iv_ruleElementOfOperation= ruleElementOfOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2252:1: ruleElementOfOperation returns [EObject current=null] : (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) ;
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
            // InternalPCMDFDConstraintLanguage.g:2258:2: ( (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' ) )
            // InternalPCMDFDConstraintLanguage.g:2259:2: (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            {
            // InternalPCMDFDConstraintLanguage.g:2259:2: (otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')' )
            // InternalPCMDFDConstraintLanguage.g:2260:3: otherlv_0= 'elementOf' otherlv_1= '(' ( (lv_left_2_0= ruleCharacteristicReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleCharacteristicSetReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getElementOfOperationAccess().getElementOfKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getElementOfOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPCMDFDConstraintLanguage.g:2268:3: ( (lv_left_2_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:2269:4: (lv_left_2_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2269:4: (lv_left_2_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:2270:5: lv_left_2_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getElementOfOperationAccess().getLeftCharacteristicReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getElementOfOperationAccess().getCommaKeyword_3());
            		
            // InternalPCMDFDConstraintLanguage.g:2291:3: ( (lv_right_4_0= ruleCharacteristicSetReference ) )
            // InternalPCMDFDConstraintLanguage.g:2292:4: (lv_right_4_0= ruleCharacteristicSetReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2292:4: (lv_right_4_0= ruleCharacteristicSetReference )
            // InternalPCMDFDConstraintLanguage.g:2293:5: lv_right_4_0= ruleCharacteristicSetReference
            {

            					newCompositeNode(grammarAccess.getElementOfOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2318:1: entryRuleCreateSetOperation returns [EObject current=null] : iv_ruleCreateSetOperation= ruleCreateSetOperation EOF ;
    public final EObject entryRuleCreateSetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateSetOperation = null;


        try {
            // InternalPCMDFDConstraintLanguage.g:2318:59: (iv_ruleCreateSetOperation= ruleCreateSetOperation EOF )
            // InternalPCMDFDConstraintLanguage.g:2319:2: iv_ruleCreateSetOperation= ruleCreateSetOperation EOF
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
    // InternalPCMDFDConstraintLanguage.g:2325:1: ruleCreateSetOperation returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' ) ;
    public final EObject ruleCreateSetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:2331:2: ( (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' ) )
            // InternalPCMDFDConstraintLanguage.g:2332:2: (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' )
            {
            // InternalPCMDFDConstraintLanguage.g:2332:2: (otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}' )
            // InternalPCMDFDConstraintLanguage.g:2333:3: otherlv_0= '{' ( (lv_value_1_0= ruleCharacteristicReference ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateSetOperationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPCMDFDConstraintLanguage.g:2337:3: ( (lv_value_1_0= ruleCharacteristicReference ) )
            // InternalPCMDFDConstraintLanguage.g:2338:4: (lv_value_1_0= ruleCharacteristicReference )
            {
            // InternalPCMDFDConstraintLanguage.g:2338:4: (lv_value_1_0= ruleCharacteristicReference )
            // InternalPCMDFDConstraintLanguage.g:2339:5: lv_value_1_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getCreateSetOperationAccess().getValueCharacteristicReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalPCMDFDConstraintLanguage.g:2364:1: ruleTargetModelType returns [Enumerator current=null] : ( (enumLiteral_0= 'PCMDFD' ) | (enumLiteral_1= 'ExtendedDFD' ) ) ;
    public final Enumerator ruleTargetModelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPCMDFDConstraintLanguage.g:2370:2: ( ( (enumLiteral_0= 'PCMDFD' ) | (enumLiteral_1= 'ExtendedDFD' ) ) )
            // InternalPCMDFDConstraintLanguage.g:2371:2: ( (enumLiteral_0= 'PCMDFD' ) | (enumLiteral_1= 'ExtendedDFD' ) )
            {
            // InternalPCMDFDConstraintLanguage.g:2371:2: ( (enumLiteral_0= 'PCMDFD' ) | (enumLiteral_1= 'ExtendedDFD' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            else if ( (LA21_0==47) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPCMDFDConstraintLanguage.g:2372:3: (enumLiteral_0= 'PCMDFD' )
                    {
                    // InternalPCMDFDConstraintLanguage.g:2372:3: (enumLiteral_0= 'PCMDFD' )
                    // InternalPCMDFDConstraintLanguage.g:2373:4: enumLiteral_0= 'PCMDFD'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTargetModelTypeAccess().getPCMDFDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTargetModelTypeAccess().getPCMDFDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPCMDFDConstraintLanguage.g:2380:3: (enumLiteral_1= 'ExtendedDFD' )
                    {
                    // InternalPCMDFDConstraintLanguage.g:2380:3: (enumLiteral_1= 'ExtendedDFD' )
                    // InternalPCMDFDConstraintLanguage.g:2381:4: enumLiteral_1= 'ExtendedDFD'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_1());
                    			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000030050042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000005800010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000222000800010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000222000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001C0000080010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});

}