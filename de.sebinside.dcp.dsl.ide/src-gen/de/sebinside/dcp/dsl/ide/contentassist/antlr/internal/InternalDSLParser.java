package de.sebinside.dcp.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.sebinside.dcp.dsl.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ASSIGNEMENT_OPERATOR", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'valueset'", "'['", "']'", "','", "'attribute'", "'property'", "'class'", "'{'", "'}'", "'.'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'!'", "'FLOWS'", "'NEVER'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ASSIGNEMENT_OPERATOR=4;
    public static final int RULE_ANY_OTHER=11;
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

    	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleModel EOF )
            // InternalDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDSL.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalDSL.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalDSL.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalDSL.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalDSL.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||(LA1_0>=17 && LA1_0<=19)||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDSL.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDSL.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleAbstractElement EOF )
            // InternalDSL.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDSL.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalDSL.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalDSL.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalDSL.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalDSL.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalDSL.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleDataType"
    // InternalDSL.g:103:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleDataType EOF )
            // InternalDSL.g:105:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDSL.g:112:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDSL.g:117:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDSL.g:117:2: ( ( rule__DataType__Group__0 ) )
            // InternalDSL.g:118:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDSL.g:119:3: ( rule__DataType__Group__0 )
            // InternalDSL.g:119:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleValueSet"
    // InternalDSL.g:128:1: entryRuleValueSet : ruleValueSet EOF ;
    public final void entryRuleValueSet() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleValueSet EOF )
            // InternalDSL.g:130:1: ruleValueSet EOF
            {
             before(grammarAccess.getValueSetRule()); 
            pushFollow(FOLLOW_1);
            ruleValueSet();

            state._fsp--;

             after(grammarAccess.getValueSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueSet"


    // $ANTLR start "ruleValueSet"
    // InternalDSL.g:137:1: ruleValueSet : ( ( rule__ValueSet__Group__0 ) ) ;
    public final void ruleValueSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__ValueSet__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__ValueSet__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__ValueSet__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__ValueSet__Group__0 )
            {
             before(grammarAccess.getValueSetAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__ValueSet__Group__0 )
            // InternalDSL.g:144:4: rule__ValueSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueSet"


    // $ANTLR start "entryRuleCharacteristicsType"
    // InternalDSL.g:153:1: entryRuleCharacteristicsType : ruleCharacteristicsType EOF ;
    public final void entryRuleCharacteristicsType() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleCharacteristicsType EOF )
            // InternalDSL.g:155:1: ruleCharacteristicsType EOF
            {
             before(grammarAccess.getCharacteristicsTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicsType();

            state._fsp--;

             after(grammarAccess.getCharacteristicsTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacteristicsType"


    // $ANTLR start "ruleCharacteristicsType"
    // InternalDSL.g:162:1: ruleCharacteristicsType : ( ( rule__CharacteristicsType__Alternatives ) ) ;
    public final void ruleCharacteristicsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__CharacteristicsType__Alternatives ) ) )
            // InternalDSL.g:167:2: ( ( rule__CharacteristicsType__Alternatives ) )
            {
            // InternalDSL.g:167:2: ( ( rule__CharacteristicsType__Alternatives ) )
            // InternalDSL.g:168:3: ( rule__CharacteristicsType__Alternatives )
            {
             before(grammarAccess.getCharacteristicsTypeAccess().getAlternatives()); 
            // InternalDSL.g:169:3: ( rule__CharacteristicsType__Alternatives )
            // InternalDSL.g:169:4: rule__CharacteristicsType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicsType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicsTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristicsType"


    // $ANTLR start "entryRuleAttributeType"
    // InternalDSL.g:178:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleAttributeType EOF )
            // InternalDSL.g:180:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalDSL.g:187:1: ruleAttributeType : ( ( rule__AttributeType__Group__0 ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__AttributeType__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__AttributeType__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__AttributeType__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__AttributeType__Group__0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__AttributeType__Group__0 )
            // InternalDSL.g:194:4: rule__AttributeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRulePropertyType"
    // InternalDSL.g:203:1: entryRulePropertyType : rulePropertyType EOF ;
    public final void entryRulePropertyType() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( rulePropertyType EOF )
            // InternalDSL.g:205:1: rulePropertyType EOF
            {
             before(grammarAccess.getPropertyTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getPropertyTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // InternalDSL.g:212:1: rulePropertyType : ( ( rule__PropertyType__Group__0 ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__PropertyType__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__PropertyType__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__PropertyType__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__PropertyType__Group__0 )
            {
             before(grammarAccess.getPropertyTypeAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__PropertyType__Group__0 )
            // InternalDSL.g:219:4: rule__PropertyType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRuleCharacteristicClass"
    // InternalDSL.g:228:1: entryRuleCharacteristicClass : ruleCharacteristicClass EOF ;
    public final void entryRuleCharacteristicClass() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleCharacteristicClass EOF )
            // InternalDSL.g:230:1: ruleCharacteristicClass EOF
            {
             before(grammarAccess.getCharacteristicClassRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicClass();

            state._fsp--;

             after(grammarAccess.getCharacteristicClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacteristicClass"


    // $ANTLR start "ruleCharacteristicClass"
    // InternalDSL.g:237:1: ruleCharacteristicClass : ( ( rule__CharacteristicClass__Group__0 ) ) ;
    public final void ruleCharacteristicClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__CharacteristicClass__Group__0 ) ) )
            // InternalDSL.g:242:2: ( ( rule__CharacteristicClass__Group__0 ) )
            {
            // InternalDSL.g:242:2: ( ( rule__CharacteristicClass__Group__0 ) )
            // InternalDSL.g:243:3: ( rule__CharacteristicClass__Group__0 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup()); 
            // InternalDSL.g:244:3: ( rule__CharacteristicClass__Group__0 )
            // InternalDSL.g:244:4: rule__CharacteristicClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristicClass"


    // $ANTLR start "entryRuleCharacteristicSelector"
    // InternalDSL.g:253:1: entryRuleCharacteristicSelector : ruleCharacteristicSelector EOF ;
    public final void entryRuleCharacteristicSelector() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleCharacteristicSelector EOF )
            // InternalDSL.g:255:1: ruleCharacteristicSelector EOF
            {
             before(grammarAccess.getCharacteristicSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicSelector();

            state._fsp--;

             after(grammarAccess.getCharacteristicSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacteristicSelector"


    // $ANTLR start "ruleCharacteristicSelector"
    // InternalDSL.g:262:1: ruleCharacteristicSelector : ( ( rule__CharacteristicSelector__Group__0 ) ) ;
    public final void ruleCharacteristicSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__CharacteristicSelector__Group__0 ) ) )
            // InternalDSL.g:267:2: ( ( rule__CharacteristicSelector__Group__0 ) )
            {
            // InternalDSL.g:267:2: ( ( rule__CharacteristicSelector__Group__0 ) )
            // InternalDSL.g:268:3: ( rule__CharacteristicSelector__Group__0 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getGroup()); 
            // InternalDSL.g:269:3: ( rule__CharacteristicSelector__Group__0 )
            // InternalDSL.g:269:4: rule__CharacteristicSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristicSelector"


    // $ANTLR start "entryRuleConstraint"
    // InternalDSL.g:278:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleConstraint EOF )
            // InternalDSL.g:280:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalDSL.g:287:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__Constraint__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__Constraint__Group__0 )
            // InternalDSL.g:294:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRule"
    // InternalDSL.g:303:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleRule EOF )
            // InternalDSL.g:305:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDSL.g:312:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__Rule__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__Rule__Group__0 )
            // InternalDSL.g:319:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDataSelector"
    // InternalDSL.g:328:1: entryRuleDataSelector : ruleDataSelector EOF ;
    public final void entryRuleDataSelector() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleDataSelector EOF )
            // InternalDSL.g:330:1: ruleDataSelector EOF
            {
             before(grammarAccess.getDataSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDataSelector();

            state._fsp--;

             after(grammarAccess.getDataSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataSelector"


    // $ANTLR start "ruleDataSelector"
    // InternalDSL.g:337:1: ruleDataSelector : ( ( rule__DataSelector__Alternatives ) ) ;
    public final void ruleDataSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__DataSelector__Alternatives ) ) )
            // InternalDSL.g:342:2: ( ( rule__DataSelector__Alternatives ) )
            {
            // InternalDSL.g:342:2: ( ( rule__DataSelector__Alternatives ) )
            // InternalDSL.g:343:3: ( rule__DataSelector__Alternatives )
            {
             before(grammarAccess.getDataSelectorAccess().getAlternatives()); 
            // InternalDSL.g:344:3: ( rule__DataSelector__Alternatives )
            // InternalDSL.g:344:4: rule__DataSelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataSelector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataSelectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // InternalDSL.g:353:1: entryRuleAttributeSelector : ruleAttributeSelector EOF ;
    public final void entryRuleAttributeSelector() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleAttributeSelector EOF )
            // InternalDSL.g:355:1: ruleAttributeSelector EOF
            {
             before(grammarAccess.getAttributeSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeSelector();

            state._fsp--;

             after(grammarAccess.getAttributeSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // InternalDSL.g:362:1: ruleAttributeSelector : ( ( rule__AttributeSelector__Group__0 ) ) ;
    public final void ruleAttributeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__AttributeSelector__Group__0 ) ) )
            // InternalDSL.g:367:2: ( ( rule__AttributeSelector__Group__0 ) )
            {
            // InternalDSL.g:367:2: ( ( rule__AttributeSelector__Group__0 ) )
            // InternalDSL.g:368:3: ( rule__AttributeSelector__Group__0 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getGroup()); 
            // InternalDSL.g:369:3: ( rule__AttributeSelector__Group__0 )
            // InternalDSL.g:369:4: rule__AttributeSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleAttributeClassSelector"
    // InternalDSL.g:378:1: entryRuleAttributeClassSelector : ruleAttributeClassSelector EOF ;
    public final void entryRuleAttributeClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( ruleAttributeClassSelector EOF )
            // InternalDSL.g:380:1: ruleAttributeClassSelector EOF
            {
             before(grammarAccess.getAttributeClassSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeClassSelector();

            state._fsp--;

             after(grammarAccess.getAttributeClassSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeClassSelector"


    // $ANTLR start "ruleAttributeClassSelector"
    // InternalDSL.g:387:1: ruleAttributeClassSelector : ( ( rule__AttributeClassSelector__Group__0 ) ) ;
    public final void ruleAttributeClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__AttributeClassSelector__Group__0 ) ) )
            // InternalDSL.g:392:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            {
            // InternalDSL.g:392:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            // InternalDSL.g:393:3: ( rule__AttributeClassSelector__Group__0 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getGroup()); 
            // InternalDSL.g:394:3: ( rule__AttributeClassSelector__Group__0 )
            // InternalDSL.g:394:4: rule__AttributeClassSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeClassSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeClassSelector"


    // $ANTLR start "entryRuleDestinationSelector"
    // InternalDSL.g:403:1: entryRuleDestinationSelector : ruleDestinationSelector EOF ;
    public final void entryRuleDestinationSelector() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( ruleDestinationSelector EOF )
            // InternalDSL.g:405:1: ruleDestinationSelector EOF
            {
             before(grammarAccess.getDestinationSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDestinationSelector();

            state._fsp--;

             after(grammarAccess.getDestinationSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDestinationSelector"


    // $ANTLR start "ruleDestinationSelector"
    // InternalDSL.g:412:1: ruleDestinationSelector : ( ( rule__DestinationSelector__Alternatives ) ) ;
    public final void ruleDestinationSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__DestinationSelector__Alternatives ) ) )
            // InternalDSL.g:417:2: ( ( rule__DestinationSelector__Alternatives ) )
            {
            // InternalDSL.g:417:2: ( ( rule__DestinationSelector__Alternatives ) )
            // InternalDSL.g:418:3: ( rule__DestinationSelector__Alternatives )
            {
             before(grammarAccess.getDestinationSelectorAccess().getAlternatives()); 
            // InternalDSL.g:419:3: ( rule__DestinationSelector__Alternatives )
            // InternalDSL.g:419:4: rule__DestinationSelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DestinationSelector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDestinationSelectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestinationSelector"


    // $ANTLR start "entryRulePropertySelector"
    // InternalDSL.g:428:1: entryRulePropertySelector : rulePropertySelector EOF ;
    public final void entryRulePropertySelector() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( rulePropertySelector EOF )
            // InternalDSL.g:430:1: rulePropertySelector EOF
            {
             before(grammarAccess.getPropertySelectorRule()); 
            pushFollow(FOLLOW_1);
            rulePropertySelector();

            state._fsp--;

             after(grammarAccess.getPropertySelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertySelector"


    // $ANTLR start "rulePropertySelector"
    // InternalDSL.g:437:1: rulePropertySelector : ( ( rule__PropertySelector__Group__0 ) ) ;
    public final void rulePropertySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__PropertySelector__Group__0 ) ) )
            // InternalDSL.g:442:2: ( ( rule__PropertySelector__Group__0 ) )
            {
            // InternalDSL.g:442:2: ( ( rule__PropertySelector__Group__0 ) )
            // InternalDSL.g:443:3: ( rule__PropertySelector__Group__0 )
            {
             before(grammarAccess.getPropertySelectorAccess().getGroup()); 
            // InternalDSL.g:444:3: ( rule__PropertySelector__Group__0 )
            // InternalDSL.g:444:4: rule__PropertySelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertySelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertySelector"


    // $ANTLR start "entryRulePropertyClassSelector"
    // InternalDSL.g:453:1: entryRulePropertyClassSelector : rulePropertyClassSelector EOF ;
    public final void entryRulePropertyClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( rulePropertyClassSelector EOF )
            // InternalDSL.g:455:1: rulePropertyClassSelector EOF
            {
             before(grammarAccess.getPropertyClassSelectorRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyClassSelector();

            state._fsp--;

             after(grammarAccess.getPropertyClassSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyClassSelector"


    // $ANTLR start "rulePropertyClassSelector"
    // InternalDSL.g:462:1: rulePropertyClassSelector : ( ( rule__PropertyClassSelector__Group__0 ) ) ;
    public final void rulePropertyClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__PropertyClassSelector__Group__0 ) ) )
            // InternalDSL.g:467:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            {
            // InternalDSL.g:467:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            // InternalDSL.g:468:3: ( rule__PropertyClassSelector__Group__0 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getGroup()); 
            // InternalDSL.g:469:3: ( rule__PropertyClassSelector__Group__0 )
            // InternalDSL.g:469:4: rule__PropertyClassSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyClassSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyClassSelector"


    // $ANTLR start "entryRuleStatement"
    // InternalDSL.g:478:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalDSL.g:479:1: ( ruleStatement EOF )
            // InternalDSL.g:480:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDSL.g:487:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalDSL.g:492:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalDSL.g:492:2: ( ( rule__Statement__Group__0 ) )
            // InternalDSL.g:493:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalDSL.g:494:3: ( rule__Statement__Group__0 )
            // InternalDSL.g:494:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStatementType"
    // InternalDSL.g:503:1: entryRuleStatementType : ruleStatementType EOF ;
    public final void entryRuleStatementType() throws RecognitionException {
        try {
            // InternalDSL.g:504:1: ( ruleStatementType EOF )
            // InternalDSL.g:505:1: ruleStatementType EOF
            {
             before(grammarAccess.getStatementTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStatementType();

            state._fsp--;

             after(grammarAccess.getStatementTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatementType"


    // $ANTLR start "ruleStatementType"
    // InternalDSL.g:512:1: ruleStatementType : ( ( rule__StatementType__NameAssignment ) ) ;
    public final void ruleStatementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:2: ( ( ( rule__StatementType__NameAssignment ) ) )
            // InternalDSL.g:517:2: ( ( rule__StatementType__NameAssignment ) )
            {
            // InternalDSL.g:517:2: ( ( rule__StatementType__NameAssignment ) )
            // InternalDSL.g:518:3: ( rule__StatementType__NameAssignment )
            {
             before(grammarAccess.getStatementTypeAccess().getNameAssignment()); 
            // InternalDSL.g:519:3: ( rule__StatementType__NameAssignment )
            // InternalDSL.g:519:4: rule__StatementType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StatementType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStatementTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatementType"


    // $ANTLR start "entryRuleStatementModality"
    // InternalDSL.g:528:1: entryRuleStatementModality : ruleStatementModality EOF ;
    public final void entryRuleStatementModality() throws RecognitionException {
        try {
            // InternalDSL.g:529:1: ( ruleStatementModality EOF )
            // InternalDSL.g:530:1: ruleStatementModality EOF
            {
             before(grammarAccess.getStatementModalityRule()); 
            pushFollow(FOLLOW_1);
            ruleStatementModality();

            state._fsp--;

             after(grammarAccess.getStatementModalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatementModality"


    // $ANTLR start "ruleStatementModality"
    // InternalDSL.g:537:1: ruleStatementModality : ( ( rule__StatementModality__NameAssignment ) ) ;
    public final void ruleStatementModality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:541:2: ( ( ( rule__StatementModality__NameAssignment ) ) )
            // InternalDSL.g:542:2: ( ( rule__StatementModality__NameAssignment ) )
            {
            // InternalDSL.g:542:2: ( ( rule__StatementModality__NameAssignment ) )
            // InternalDSL.g:543:3: ( rule__StatementModality__NameAssignment )
            {
             before(grammarAccess.getStatementModalityAccess().getNameAssignment()); 
            // InternalDSL.g:544:3: ( rule__StatementModality__NameAssignment )
            // InternalDSL.g:544:4: rule__StatementModality__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StatementModality__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStatementModalityAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatementModality"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalDSL.g:552:1: rule__AbstractElement__Alternatives : ( ( ruleDataType ) | ( ruleValueSet ) | ( ruleCharacteristicsType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:556:1: ( ( ruleDataType ) | ( ruleValueSet ) | ( ruleCharacteristicsType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 17:
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:557:2: ( ruleDataType )
                    {
                    // InternalDSL.g:557:2: ( ruleDataType )
                    // InternalDSL.g:558:3: ruleDataType
                    {
                     before(grammarAccess.getAbstractElementAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:563:2: ( ruleValueSet )
                    {
                    // InternalDSL.g:563:2: ( ruleValueSet )
                    // InternalDSL.g:564:3: ruleValueSet
                    {
                     before(grammarAccess.getAbstractElementAccess().getValueSetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValueSet();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getValueSetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:569:2: ( ruleCharacteristicsType )
                    {
                    // InternalDSL.g:569:2: ( ruleCharacteristicsType )
                    // InternalDSL.g:570:3: ruleCharacteristicsType
                    {
                     before(grammarAccess.getAbstractElementAccess().getCharacteristicsTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicsType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCharacteristicsTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:575:2: ( ruleCharacteristicClass )
                    {
                    // InternalDSL.g:575:2: ( ruleCharacteristicClass )
                    // InternalDSL.g:576:3: ruleCharacteristicClass
                    {
                     before(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:581:2: ( ruleConstraint )
                    {
                    // InternalDSL.g:581:2: ( ruleConstraint )
                    // InternalDSL.g:582:3: ruleConstraint
                    {
                     before(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__CharacteristicsType__Alternatives"
    // InternalDSL.g:591:1: rule__CharacteristicsType__Alternatives : ( ( ruleAttributeType ) | ( rulePropertyType ) );
    public final void rule__CharacteristicsType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:595:1: ( ( ruleAttributeType ) | ( rulePropertyType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:596:2: ( ruleAttributeType )
                    {
                    // InternalDSL.g:596:2: ( ruleAttributeType )
                    // InternalDSL.g:597:3: ruleAttributeType
                    {
                     before(grammarAccess.getCharacteristicsTypeAccess().getAttributeTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeType();

                    state._fsp--;

                     after(grammarAccess.getCharacteristicsTypeAccess().getAttributeTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:602:2: ( rulePropertyType )
                    {
                    // InternalDSL.g:602:2: ( rulePropertyType )
                    // InternalDSL.g:603:3: rulePropertyType
                    {
                     before(grammarAccess.getCharacteristicsTypeAccess().getPropertyTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyType();

                    state._fsp--;

                     after(grammarAccess.getCharacteristicsTypeAccess().getPropertyTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicsType__Alternatives"


    // $ANTLR start "rule__CharacteristicSelector__Alternatives_2"
    // InternalDSL.g:612:1: rule__CharacteristicSelector__Alternatives_2 : ( ( ( rule__CharacteristicSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicSelector__Group_2_1__0 ) ) );
    public final void rule__CharacteristicSelector__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:616:1: ( ( ( rule__CharacteristicSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicSelector__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:617:2: ( ( rule__CharacteristicSelector__Group_2_0__0 ) )
                    {
                    // InternalDSL.g:617:2: ( ( rule__CharacteristicSelector__Group_2_0__0 ) )
                    // InternalDSL.g:618:3: ( rule__CharacteristicSelector__Group_2_0__0 )
                    {
                     before(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_0()); 
                    // InternalDSL.g:619:3: ( rule__CharacteristicSelector__Group_2_0__0 )
                    // InternalDSL.g:619:4: rule__CharacteristicSelector__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicSelector__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:623:2: ( ( rule__CharacteristicSelector__Group_2_1__0 ) )
                    {
                    // InternalDSL.g:623:2: ( ( rule__CharacteristicSelector__Group_2_1__0 ) )
                    // InternalDSL.g:624:3: ( rule__CharacteristicSelector__Group_2_1__0 )
                    {
                     before(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_1()); 
                    // InternalDSL.g:625:3: ( rule__CharacteristicSelector__Group_2_1__0 )
                    // InternalDSL.g:625:4: rule__CharacteristicSelector__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicSelector__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Alternatives_2"


    // $ANTLR start "rule__CharacteristicSelector__Alternatives_2_1_2"
    // InternalDSL.g:633:1: rule__CharacteristicSelector__Alternatives_2_1_2 : ( ( ( rule__CharacteristicSelector__Group_2_1_2_0__0 )* ) | ( ( rule__CharacteristicSelector__Group_2_1_2_1__0 )* ) );
    public final void rule__CharacteristicSelector__Alternatives_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:637:1: ( ( ( rule__CharacteristicSelector__Group_2_1_2_0__0 )* ) | ( ( rule__CharacteristicSelector__Group_2_1_2_1__0 )* ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:638:2: ( ( rule__CharacteristicSelector__Group_2_1_2_0__0 )* )
                    {
                    // InternalDSL.g:638:2: ( ( rule__CharacteristicSelector__Group_2_1_2_0__0 )* )
                    // InternalDSL.g:639:3: ( rule__CharacteristicSelector__Group_2_1_2_0__0 )*
                    {
                     before(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_1_2_0()); 
                    // InternalDSL.g:640:3: ( rule__CharacteristicSelector__Group_2_1_2_0__0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDSL.g:640:4: rule__CharacteristicSelector__Group_2_1_2_0__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__CharacteristicSelector__Group_2_1_2_0__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:644:2: ( ( rule__CharacteristicSelector__Group_2_1_2_1__0 )* )
                    {
                    // InternalDSL.g:644:2: ( ( rule__CharacteristicSelector__Group_2_1_2_1__0 )* )
                    // InternalDSL.g:645:3: ( rule__CharacteristicSelector__Group_2_1_2_1__0 )*
                    {
                     before(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_1_2_1()); 
                    // InternalDSL.g:646:3: ( rule__CharacteristicSelector__Group_2_1_2_1__0 )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDSL.g:646:4: rule__CharacteristicSelector__Group_2_1_2_1__0
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__CharacteristicSelector__Group_2_1_2_1__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     after(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_1_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Alternatives_2_1_2"


    // $ANTLR start "rule__DataSelector__Alternatives"
    // InternalDSL.g:654:1: rule__DataSelector__Alternatives : ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) );
    public final void rule__DataSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:658:1: ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSL.g:659:2: ( ruleAttributeSelector )
                    {
                    // InternalDSL.g:659:2: ( ruleAttributeSelector )
                    // InternalDSL.g:660:3: ruleAttributeSelector
                    {
                     before(grammarAccess.getDataSelectorAccess().getAttributeSelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeSelector();

                    state._fsp--;

                     after(grammarAccess.getDataSelectorAccess().getAttributeSelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:665:2: ( ruleAttributeClassSelector )
                    {
                    // InternalDSL.g:665:2: ( ruleAttributeClassSelector )
                    // InternalDSL.g:666:3: ruleAttributeClassSelector
                    {
                     before(grammarAccess.getDataSelectorAccess().getAttributeClassSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeClassSelector();

                    state._fsp--;

                     after(grammarAccess.getDataSelectorAccess().getAttributeClassSelectorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSelector__Alternatives"


    // $ANTLR start "rule__DestinationSelector__Alternatives"
    // InternalDSL.g:675:1: rule__DestinationSelector__Alternatives : ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) );
    public final void rule__DestinationSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:679:1: ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:680:2: ( rulePropertySelector )
                    {
                    // InternalDSL.g:680:2: ( rulePropertySelector )
                    // InternalDSL.g:681:3: rulePropertySelector
                    {
                     before(grammarAccess.getDestinationSelectorAccess().getPropertySelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePropertySelector();

                    state._fsp--;

                     after(grammarAccess.getDestinationSelectorAccess().getPropertySelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:686:2: ( rulePropertyClassSelector )
                    {
                    // InternalDSL.g:686:2: ( rulePropertyClassSelector )
                    // InternalDSL.g:687:3: rulePropertyClassSelector
                    {
                     before(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyClassSelector();

                    state._fsp--;

                     after(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationSelector__Alternatives"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalDSL.g:696:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:700:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDSL.g:701:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalDSL.g:708:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:712:1: ( ( 'datatype' ) )
            // InternalDSL.g:713:1: ( 'datatype' )
            {
            // InternalDSL.g:713:1: ( 'datatype' )
            // InternalDSL.g:714:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalDSL.g:723:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:727:1: ( rule__DataType__Group__1__Impl )
            // InternalDSL.g:728:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalDSL.g:734:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:738:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalDSL.g:739:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalDSL.g:739:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalDSL.g:740:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:741:2: ( rule__DataType__NameAssignment_1 )
            // InternalDSL.g:741:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__ValueSet__Group__0"
    // InternalDSL.g:750:1: rule__ValueSet__Group__0 : rule__ValueSet__Group__0__Impl rule__ValueSet__Group__1 ;
    public final void rule__ValueSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:754:1: ( rule__ValueSet__Group__0__Impl rule__ValueSet__Group__1 )
            // InternalDSL.g:755:2: rule__ValueSet__Group__0__Impl rule__ValueSet__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ValueSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__0"


    // $ANTLR start "rule__ValueSet__Group__0__Impl"
    // InternalDSL.g:762:1: rule__ValueSet__Group__0__Impl : ( 'valueset' ) ;
    public final void rule__ValueSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:766:1: ( ( 'valueset' ) )
            // InternalDSL.g:767:1: ( 'valueset' )
            {
            // InternalDSL.g:767:1: ( 'valueset' )
            // InternalDSL.g:768:2: 'valueset'
            {
             before(grammarAccess.getValueSetAccess().getValuesetKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getValuesetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__0__Impl"


    // $ANTLR start "rule__ValueSet__Group__1"
    // InternalDSL.g:777:1: rule__ValueSet__Group__1 : rule__ValueSet__Group__1__Impl rule__ValueSet__Group__2 ;
    public final void rule__ValueSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:781:1: ( rule__ValueSet__Group__1__Impl rule__ValueSet__Group__2 )
            // InternalDSL.g:782:2: rule__ValueSet__Group__1__Impl rule__ValueSet__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ValueSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__1"


    // $ANTLR start "rule__ValueSet__Group__1__Impl"
    // InternalDSL.g:789:1: rule__ValueSet__Group__1__Impl : ( ( rule__ValueSet__NameAssignment_1 ) ) ;
    public final void rule__ValueSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:793:1: ( ( ( rule__ValueSet__NameAssignment_1 ) ) )
            // InternalDSL.g:794:1: ( ( rule__ValueSet__NameAssignment_1 ) )
            {
            // InternalDSL.g:794:1: ( ( rule__ValueSet__NameAssignment_1 ) )
            // InternalDSL.g:795:2: ( rule__ValueSet__NameAssignment_1 )
            {
             before(grammarAccess.getValueSetAccess().getNameAssignment_1()); 
            // InternalDSL.g:796:2: ( rule__ValueSet__NameAssignment_1 )
            // InternalDSL.g:796:3: rule__ValueSet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__1__Impl"


    // $ANTLR start "rule__ValueSet__Group__2"
    // InternalDSL.g:804:1: rule__ValueSet__Group__2 : rule__ValueSet__Group__2__Impl rule__ValueSet__Group__3 ;
    public final void rule__ValueSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:808:1: ( rule__ValueSet__Group__2__Impl rule__ValueSet__Group__3 )
            // InternalDSL.g:809:2: rule__ValueSet__Group__2__Impl rule__ValueSet__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ValueSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__2"


    // $ANTLR start "rule__ValueSet__Group__2__Impl"
    // InternalDSL.g:816:1: rule__ValueSet__Group__2__Impl : ( RULE_ASSIGNEMENT_OPERATOR ) ;
    public final void rule__ValueSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:820:1: ( ( RULE_ASSIGNEMENT_OPERATOR ) )
            // InternalDSL.g:821:1: ( RULE_ASSIGNEMENT_OPERATOR )
            {
            // InternalDSL.g:821:1: ( RULE_ASSIGNEMENT_OPERATOR )
            // InternalDSL.g:822:2: RULE_ASSIGNEMENT_OPERATOR
            {
             before(grammarAccess.getValueSetAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2()); 
            match(input,RULE_ASSIGNEMENT_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__2__Impl"


    // $ANTLR start "rule__ValueSet__Group__3"
    // InternalDSL.g:831:1: rule__ValueSet__Group__3 : rule__ValueSet__Group__3__Impl rule__ValueSet__Group__4 ;
    public final void rule__ValueSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:835:1: ( rule__ValueSet__Group__3__Impl rule__ValueSet__Group__4 )
            // InternalDSL.g:836:2: rule__ValueSet__Group__3__Impl rule__ValueSet__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ValueSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__3"


    // $ANTLR start "rule__ValueSet__Group__3__Impl"
    // InternalDSL.g:843:1: rule__ValueSet__Group__3__Impl : ( '[' ) ;
    public final void rule__ValueSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:847:1: ( ( '[' ) )
            // InternalDSL.g:848:1: ( '[' )
            {
            // InternalDSL.g:848:1: ( '[' )
            // InternalDSL.g:849:2: '['
            {
             before(grammarAccess.getValueSetAccess().getLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__3__Impl"


    // $ANTLR start "rule__ValueSet__Group__4"
    // InternalDSL.g:858:1: rule__ValueSet__Group__4 : rule__ValueSet__Group__4__Impl rule__ValueSet__Group__5 ;
    public final void rule__ValueSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:862:1: ( rule__ValueSet__Group__4__Impl rule__ValueSet__Group__5 )
            // InternalDSL.g:863:2: rule__ValueSet__Group__4__Impl rule__ValueSet__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ValueSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__4"


    // $ANTLR start "rule__ValueSet__Group__4__Impl"
    // InternalDSL.g:870:1: rule__ValueSet__Group__4__Impl : ( ( rule__ValueSet__MembersAssignment_4 ) ) ;
    public final void rule__ValueSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:874:1: ( ( ( rule__ValueSet__MembersAssignment_4 ) ) )
            // InternalDSL.g:875:1: ( ( rule__ValueSet__MembersAssignment_4 ) )
            {
            // InternalDSL.g:875:1: ( ( rule__ValueSet__MembersAssignment_4 ) )
            // InternalDSL.g:876:2: ( rule__ValueSet__MembersAssignment_4 )
            {
             before(grammarAccess.getValueSetAccess().getMembersAssignment_4()); 
            // InternalDSL.g:877:2: ( rule__ValueSet__MembersAssignment_4 )
            // InternalDSL.g:877:3: rule__ValueSet__MembersAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__MembersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getValueSetAccess().getMembersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__4__Impl"


    // $ANTLR start "rule__ValueSet__Group__5"
    // InternalDSL.g:885:1: rule__ValueSet__Group__5 : rule__ValueSet__Group__5__Impl rule__ValueSet__Group__6 ;
    public final void rule__ValueSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:889:1: ( rule__ValueSet__Group__5__Impl rule__ValueSet__Group__6 )
            // InternalDSL.g:890:2: rule__ValueSet__Group__5__Impl rule__ValueSet__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ValueSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__5"


    // $ANTLR start "rule__ValueSet__Group__5__Impl"
    // InternalDSL.g:897:1: rule__ValueSet__Group__5__Impl : ( ( rule__ValueSet__Group_5__0 )* ) ;
    public final void rule__ValueSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:901:1: ( ( ( rule__ValueSet__Group_5__0 )* ) )
            // InternalDSL.g:902:1: ( ( rule__ValueSet__Group_5__0 )* )
            {
            // InternalDSL.g:902:1: ( ( rule__ValueSet__Group_5__0 )* )
            // InternalDSL.g:903:2: ( rule__ValueSet__Group_5__0 )*
            {
             before(grammarAccess.getValueSetAccess().getGroup_5()); 
            // InternalDSL.g:904:2: ( rule__ValueSet__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:904:3: rule__ValueSet__Group_5__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ValueSet__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getValueSetAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__5__Impl"


    // $ANTLR start "rule__ValueSet__Group__6"
    // InternalDSL.g:912:1: rule__ValueSet__Group__6 : rule__ValueSet__Group__6__Impl ;
    public final void rule__ValueSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:916:1: ( rule__ValueSet__Group__6__Impl )
            // InternalDSL.g:917:2: rule__ValueSet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__6"


    // $ANTLR start "rule__ValueSet__Group__6__Impl"
    // InternalDSL.g:923:1: rule__ValueSet__Group__6__Impl : ( ']' ) ;
    public final void rule__ValueSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:927:1: ( ( ']' ) )
            // InternalDSL.g:928:1: ( ']' )
            {
            // InternalDSL.g:928:1: ( ']' )
            // InternalDSL.g:929:2: ']'
            {
             before(grammarAccess.getValueSetAccess().getRightSquareBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__6__Impl"


    // $ANTLR start "rule__ValueSet__Group_5__0"
    // InternalDSL.g:939:1: rule__ValueSet__Group_5__0 : rule__ValueSet__Group_5__0__Impl rule__ValueSet__Group_5__1 ;
    public final void rule__ValueSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:943:1: ( rule__ValueSet__Group_5__0__Impl rule__ValueSet__Group_5__1 )
            // InternalDSL.g:944:2: rule__ValueSet__Group_5__0__Impl rule__ValueSet__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__ValueSet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group_5__0"


    // $ANTLR start "rule__ValueSet__Group_5__0__Impl"
    // InternalDSL.g:951:1: rule__ValueSet__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ValueSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:955:1: ( ( ',' ) )
            // InternalDSL.g:956:1: ( ',' )
            {
            // InternalDSL.g:956:1: ( ',' )
            // InternalDSL.g:957:2: ','
            {
             before(grammarAccess.getValueSetAccess().getCommaKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group_5__0__Impl"


    // $ANTLR start "rule__ValueSet__Group_5__1"
    // InternalDSL.g:966:1: rule__ValueSet__Group_5__1 : rule__ValueSet__Group_5__1__Impl ;
    public final void rule__ValueSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:970:1: ( rule__ValueSet__Group_5__1__Impl )
            // InternalDSL.g:971:2: rule__ValueSet__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group_5__1"


    // $ANTLR start "rule__ValueSet__Group_5__1__Impl"
    // InternalDSL.g:977:1: rule__ValueSet__Group_5__1__Impl : ( ( rule__ValueSet__MembersAssignment_5_1 ) ) ;
    public final void rule__ValueSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:981:1: ( ( ( rule__ValueSet__MembersAssignment_5_1 ) ) )
            // InternalDSL.g:982:1: ( ( rule__ValueSet__MembersAssignment_5_1 ) )
            {
            // InternalDSL.g:982:1: ( ( rule__ValueSet__MembersAssignment_5_1 ) )
            // InternalDSL.g:983:2: ( rule__ValueSet__MembersAssignment_5_1 )
            {
             before(grammarAccess.getValueSetAccess().getMembersAssignment_5_1()); 
            // InternalDSL.g:984:2: ( rule__ValueSet__MembersAssignment_5_1 )
            // InternalDSL.g:984:3: rule__ValueSet__MembersAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__MembersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getValueSetAccess().getMembersAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group_5__1__Impl"


    // $ANTLR start "rule__AttributeType__Group__0"
    // InternalDSL.g:993:1: rule__AttributeType__Group__0 : rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 ;
    public final void rule__AttributeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:997:1: ( rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 )
            // InternalDSL.g:998:2: rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AttributeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__0"


    // $ANTLR start "rule__AttributeType__Group__0__Impl"
    // InternalDSL.g:1005:1: rule__AttributeType__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AttributeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1009:1: ( ( 'attribute' ) )
            // InternalDSL.g:1010:1: ( 'attribute' )
            {
            // InternalDSL.g:1010:1: ( 'attribute' )
            // InternalDSL.g:1011:2: 'attribute'
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__0__Impl"


    // $ANTLR start "rule__AttributeType__Group__1"
    // InternalDSL.g:1020:1: rule__AttributeType__Group__1 : rule__AttributeType__Group__1__Impl rule__AttributeType__Group__2 ;
    public final void rule__AttributeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1024:1: ( rule__AttributeType__Group__1__Impl rule__AttributeType__Group__2 )
            // InternalDSL.g:1025:2: rule__AttributeType__Group__1__Impl rule__AttributeType__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__AttributeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__1"


    // $ANTLR start "rule__AttributeType__Group__1__Impl"
    // InternalDSL.g:1032:1: rule__AttributeType__Group__1__Impl : ( ( rule__AttributeType__NameAssignment_1 ) ) ;
    public final void rule__AttributeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1036:1: ( ( ( rule__AttributeType__NameAssignment_1 ) ) )
            // InternalDSL.g:1037:1: ( ( rule__AttributeType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1037:1: ( ( rule__AttributeType__NameAssignment_1 ) )
            // InternalDSL.g:1038:2: ( rule__AttributeType__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1039:2: ( rule__AttributeType__NameAssignment_1 )
            // InternalDSL.g:1039:3: rule__AttributeType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__1__Impl"


    // $ANTLR start "rule__AttributeType__Group__2"
    // InternalDSL.g:1047:1: rule__AttributeType__Group__2 : rule__AttributeType__Group__2__Impl rule__AttributeType__Group__3 ;
    public final void rule__AttributeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1051:1: ( rule__AttributeType__Group__2__Impl rule__AttributeType__Group__3 )
            // InternalDSL.g:1052:2: rule__AttributeType__Group__2__Impl rule__AttributeType__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AttributeType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__2"


    // $ANTLR start "rule__AttributeType__Group__2__Impl"
    // InternalDSL.g:1059:1: rule__AttributeType__Group__2__Impl : ( RULE_ASSIGNEMENT_OPERATOR ) ;
    public final void rule__AttributeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1063:1: ( ( RULE_ASSIGNEMENT_OPERATOR ) )
            // InternalDSL.g:1064:1: ( RULE_ASSIGNEMENT_OPERATOR )
            {
            // InternalDSL.g:1064:1: ( RULE_ASSIGNEMENT_OPERATOR )
            // InternalDSL.g:1065:2: RULE_ASSIGNEMENT_OPERATOR
            {
             before(grammarAccess.getAttributeTypeAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2()); 
            match(input,RULE_ASSIGNEMENT_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__2__Impl"


    // $ANTLR start "rule__AttributeType__Group__3"
    // InternalDSL.g:1074:1: rule__AttributeType__Group__3 : rule__AttributeType__Group__3__Impl ;
    public final void rule__AttributeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1078:1: ( rule__AttributeType__Group__3__Impl )
            // InternalDSL.g:1079:2: rule__AttributeType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__3"


    // $ANTLR start "rule__AttributeType__Group__3__Impl"
    // InternalDSL.g:1085:1: rule__AttributeType__Group__3__Impl : ( ( rule__AttributeType__ValuesetAssignment_3 ) ) ;
    public final void rule__AttributeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1089:1: ( ( ( rule__AttributeType__ValuesetAssignment_3 ) ) )
            // InternalDSL.g:1090:1: ( ( rule__AttributeType__ValuesetAssignment_3 ) )
            {
            // InternalDSL.g:1090:1: ( ( rule__AttributeType__ValuesetAssignment_3 ) )
            // InternalDSL.g:1091:2: ( rule__AttributeType__ValuesetAssignment_3 )
            {
             before(grammarAccess.getAttributeTypeAccess().getValuesetAssignment_3()); 
            // InternalDSL.g:1092:2: ( rule__AttributeType__ValuesetAssignment_3 )
            // InternalDSL.g:1092:3: rule__AttributeType__ValuesetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__ValuesetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getValuesetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__3__Impl"


    // $ANTLR start "rule__PropertyType__Group__0"
    // InternalDSL.g:1101:1: rule__PropertyType__Group__0 : rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1 ;
    public final void rule__PropertyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1105:1: ( rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1 )
            // InternalDSL.g:1106:2: rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PropertyType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__0"


    // $ANTLR start "rule__PropertyType__Group__0__Impl"
    // InternalDSL.g:1113:1: rule__PropertyType__Group__0__Impl : ( 'property' ) ;
    public final void rule__PropertyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1117:1: ( ( 'property' ) )
            // InternalDSL.g:1118:1: ( 'property' )
            {
            // InternalDSL.g:1118:1: ( 'property' )
            // InternalDSL.g:1119:2: 'property'
            {
             before(grammarAccess.getPropertyTypeAccess().getPropertyKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPropertyTypeAccess().getPropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__0__Impl"


    // $ANTLR start "rule__PropertyType__Group__1"
    // InternalDSL.g:1128:1: rule__PropertyType__Group__1 : rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2 ;
    public final void rule__PropertyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1132:1: ( rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2 )
            // InternalDSL.g:1133:2: rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__PropertyType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__1"


    // $ANTLR start "rule__PropertyType__Group__1__Impl"
    // InternalDSL.g:1140:1: rule__PropertyType__Group__1__Impl : ( ( rule__PropertyType__NameAssignment_1 ) ) ;
    public final void rule__PropertyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1144:1: ( ( ( rule__PropertyType__NameAssignment_1 ) ) )
            // InternalDSL.g:1145:1: ( ( rule__PropertyType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1145:1: ( ( rule__PropertyType__NameAssignment_1 ) )
            // InternalDSL.g:1146:2: ( rule__PropertyType__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1147:2: ( rule__PropertyType__NameAssignment_1 )
            // InternalDSL.g:1147:3: rule__PropertyType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__1__Impl"


    // $ANTLR start "rule__PropertyType__Group__2"
    // InternalDSL.g:1155:1: rule__PropertyType__Group__2 : rule__PropertyType__Group__2__Impl rule__PropertyType__Group__3 ;
    public final void rule__PropertyType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1159:1: ( rule__PropertyType__Group__2__Impl rule__PropertyType__Group__3 )
            // InternalDSL.g:1160:2: rule__PropertyType__Group__2__Impl rule__PropertyType__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PropertyType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__2"


    // $ANTLR start "rule__PropertyType__Group__2__Impl"
    // InternalDSL.g:1167:1: rule__PropertyType__Group__2__Impl : ( RULE_ASSIGNEMENT_OPERATOR ) ;
    public final void rule__PropertyType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1171:1: ( ( RULE_ASSIGNEMENT_OPERATOR ) )
            // InternalDSL.g:1172:1: ( RULE_ASSIGNEMENT_OPERATOR )
            {
            // InternalDSL.g:1172:1: ( RULE_ASSIGNEMENT_OPERATOR )
            // InternalDSL.g:1173:2: RULE_ASSIGNEMENT_OPERATOR
            {
             before(grammarAccess.getPropertyTypeAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2()); 
            match(input,RULE_ASSIGNEMENT_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getPropertyTypeAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__2__Impl"


    // $ANTLR start "rule__PropertyType__Group__3"
    // InternalDSL.g:1182:1: rule__PropertyType__Group__3 : rule__PropertyType__Group__3__Impl ;
    public final void rule__PropertyType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1186:1: ( rule__PropertyType__Group__3__Impl )
            // InternalDSL.g:1187:2: rule__PropertyType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__3"


    // $ANTLR start "rule__PropertyType__Group__3__Impl"
    // InternalDSL.g:1193:1: rule__PropertyType__Group__3__Impl : ( ( rule__PropertyType__ValuesetAssignment_3 ) ) ;
    public final void rule__PropertyType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1197:1: ( ( ( rule__PropertyType__ValuesetAssignment_3 ) ) )
            // InternalDSL.g:1198:1: ( ( rule__PropertyType__ValuesetAssignment_3 ) )
            {
            // InternalDSL.g:1198:1: ( ( rule__PropertyType__ValuesetAssignment_3 ) )
            // InternalDSL.g:1199:2: ( rule__PropertyType__ValuesetAssignment_3 )
            {
             before(grammarAccess.getPropertyTypeAccess().getValuesetAssignment_3()); 
            // InternalDSL.g:1200:2: ( rule__PropertyType__ValuesetAssignment_3 )
            // InternalDSL.g:1200:3: rule__PropertyType__ValuesetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__ValuesetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getValuesetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__3__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__0"
    // InternalDSL.g:1209:1: rule__CharacteristicClass__Group__0 : rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 ;
    public final void rule__CharacteristicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1213:1: ( rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 )
            // InternalDSL.g:1214:2: rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CharacteristicClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__0"


    // $ANTLR start "rule__CharacteristicClass__Group__0__Impl"
    // InternalDSL.g:1221:1: rule__CharacteristicClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__CharacteristicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1225:1: ( ( 'class' ) )
            // InternalDSL.g:1226:1: ( 'class' )
            {
            // InternalDSL.g:1226:1: ( 'class' )
            // InternalDSL.g:1227:2: 'class'
            {
             before(grammarAccess.getCharacteristicClassAccess().getClassKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCharacteristicClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__1"
    // InternalDSL.g:1236:1: rule__CharacteristicClass__Group__1 : rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 ;
    public final void rule__CharacteristicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1240:1: ( rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 )
            // InternalDSL.g:1241:2: rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CharacteristicClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__1"


    // $ANTLR start "rule__CharacteristicClass__Group__1__Impl"
    // InternalDSL.g:1248:1: rule__CharacteristicClass__Group__1__Impl : ( ( rule__CharacteristicClass__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1252:1: ( ( ( rule__CharacteristicClass__NameAssignment_1 ) ) )
            // InternalDSL.g:1253:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            {
            // InternalDSL.g:1253:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            // InternalDSL.g:1254:2: ( rule__CharacteristicClass__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 
            // InternalDSL.g:1255:2: ( rule__CharacteristicClass__NameAssignment_1 )
            // InternalDSL.g:1255:3: rule__CharacteristicClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__1__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__2"
    // InternalDSL.g:1263:1: rule__CharacteristicClass__Group__2 : rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 ;
    public final void rule__CharacteristicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1267:1: ( rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 )
            // InternalDSL.g:1268:2: rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CharacteristicClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__2"


    // $ANTLR start "rule__CharacteristicClass__Group__2__Impl"
    // InternalDSL.g:1275:1: rule__CharacteristicClass__Group__2__Impl : ( '{' ) ;
    public final void rule__CharacteristicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1279:1: ( ( '{' ) )
            // InternalDSL.g:1280:1: ( '{' )
            {
            // InternalDSL.g:1280:1: ( '{' )
            // InternalDSL.g:1281:2: '{'
            {
             before(grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__2__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__3"
    // InternalDSL.g:1290:1: rule__CharacteristicClass__Group__3 : rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 ;
    public final void rule__CharacteristicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1294:1: ( rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 )
            // InternalDSL.g:1295:2: rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__CharacteristicClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__3"


    // $ANTLR start "rule__CharacteristicClass__Group__3__Impl"
    // InternalDSL.g:1302:1: rule__CharacteristicClass__Group__3__Impl : ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) ;
    public final void rule__CharacteristicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1306:1: ( ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) )
            // InternalDSL.g:1307:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            {
            // InternalDSL.g:1307:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            // InternalDSL.g:1308:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 
            // InternalDSL.g:1309:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            // InternalDSL.g:1309:3: rule__CharacteristicClass__MembersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__MembersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__3__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__4"
    // InternalDSL.g:1317:1: rule__CharacteristicClass__Group__4 : rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 ;
    public final void rule__CharacteristicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1321:1: ( rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 )
            // InternalDSL.g:1322:2: rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__CharacteristicClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__4"


    // $ANTLR start "rule__CharacteristicClass__Group__4__Impl"
    // InternalDSL.g:1329:1: rule__CharacteristicClass__Group__4__Impl : ( ( rule__CharacteristicClass__Group_4__0 )* ) ;
    public final void rule__CharacteristicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1333:1: ( ( ( rule__CharacteristicClass__Group_4__0 )* ) )
            // InternalDSL.g:1334:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            {
            // InternalDSL.g:1334:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            // InternalDSL.g:1335:2: ( rule__CharacteristicClass__Group_4__0 )*
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 
            // InternalDSL.g:1336:2: ( rule__CharacteristicClass__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:1336:3: rule__CharacteristicClass__Group_4__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CharacteristicClass__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__4__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__5"
    // InternalDSL.g:1344:1: rule__CharacteristicClass__Group__5 : rule__CharacteristicClass__Group__5__Impl ;
    public final void rule__CharacteristicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1348:1: ( rule__CharacteristicClass__Group__5__Impl )
            // InternalDSL.g:1349:2: rule__CharacteristicClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__5"


    // $ANTLR start "rule__CharacteristicClass__Group__5__Impl"
    // InternalDSL.g:1355:1: rule__CharacteristicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__CharacteristicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1359:1: ( ( '}' ) )
            // InternalDSL.g:1360:1: ( '}' )
            {
            // InternalDSL.g:1360:1: ( '}' )
            // InternalDSL.g:1361:2: '}'
            {
             before(grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group__5__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group_4__0"
    // InternalDSL.g:1371:1: rule__CharacteristicClass__Group_4__0 : rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 ;
    public final void rule__CharacteristicClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1375:1: ( rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 )
            // InternalDSL.g:1376:2: rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__CharacteristicClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group_4__0"


    // $ANTLR start "rule__CharacteristicClass__Group_4__0__Impl"
    // InternalDSL.g:1383:1: rule__CharacteristicClass__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1387:1: ( ( ',' ) )
            // InternalDSL.g:1388:1: ( ',' )
            {
            // InternalDSL.g:1388:1: ( ',' )
            // InternalDSL.g:1389:2: ','
            {
             before(grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group_4__0__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group_4__1"
    // InternalDSL.g:1398:1: rule__CharacteristicClass__Group_4__1 : rule__CharacteristicClass__Group_4__1__Impl ;
    public final void rule__CharacteristicClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1402:1: ( rule__CharacteristicClass__Group_4__1__Impl )
            // InternalDSL.g:1403:2: rule__CharacteristicClass__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group_4__1"


    // $ANTLR start "rule__CharacteristicClass__Group_4__1__Impl"
    // InternalDSL.g:1409:1: rule__CharacteristicClass__Group_4__1__Impl : ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) ;
    public final void rule__CharacteristicClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1413:1: ( ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) )
            // InternalDSL.g:1414:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            {
            // InternalDSL.g:1414:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            // InternalDSL.g:1415:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 
            // InternalDSL.g:1416:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            // InternalDSL.g:1416:3: rule__CharacteristicClass__MembersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__MembersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__Group_4__1__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group__0"
    // InternalDSL.g:1425:1: rule__CharacteristicSelector__Group__0 : rule__CharacteristicSelector__Group__0__Impl rule__CharacteristicSelector__Group__1 ;
    public final void rule__CharacteristicSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1429:1: ( rule__CharacteristicSelector__Group__0__Impl rule__CharacteristicSelector__Group__1 )
            // InternalDSL.g:1430:2: rule__CharacteristicSelector__Group__0__Impl rule__CharacteristicSelector__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CharacteristicSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__0"


    // $ANTLR start "rule__CharacteristicSelector__Group__0__Impl"
    // InternalDSL.g:1437:1: rule__CharacteristicSelector__Group__0__Impl : ( ( rule__CharacteristicSelector__RefAssignment_0 ) ) ;
    public final void rule__CharacteristicSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1441:1: ( ( ( rule__CharacteristicSelector__RefAssignment_0 ) ) )
            // InternalDSL.g:1442:1: ( ( rule__CharacteristicSelector__RefAssignment_0 ) )
            {
            // InternalDSL.g:1442:1: ( ( rule__CharacteristicSelector__RefAssignment_0 ) )
            // InternalDSL.g:1443:2: ( rule__CharacteristicSelector__RefAssignment_0 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getRefAssignment_0()); 
            // InternalDSL.g:1444:2: ( rule__CharacteristicSelector__RefAssignment_0 )
            // InternalDSL.g:1444:3: rule__CharacteristicSelector__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group__1"
    // InternalDSL.g:1452:1: rule__CharacteristicSelector__Group__1 : rule__CharacteristicSelector__Group__1__Impl rule__CharacteristicSelector__Group__2 ;
    public final void rule__CharacteristicSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1456:1: ( rule__CharacteristicSelector__Group__1__Impl rule__CharacteristicSelector__Group__2 )
            // InternalDSL.g:1457:2: rule__CharacteristicSelector__Group__1__Impl rule__CharacteristicSelector__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__CharacteristicSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__1"


    // $ANTLR start "rule__CharacteristicSelector__Group__1__Impl"
    // InternalDSL.g:1464:1: rule__CharacteristicSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__CharacteristicSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1468:1: ( ( '.' ) )
            // InternalDSL.g:1469:1: ( '.' )
            {
            // InternalDSL.g:1469:1: ( '.' )
            // InternalDSL.g:1470:2: '.'
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getFullStopKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__1__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group__2"
    // InternalDSL.g:1479:1: rule__CharacteristicSelector__Group__2 : rule__CharacteristicSelector__Group__2__Impl ;
    public final void rule__CharacteristicSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1483:1: ( rule__CharacteristicSelector__Group__2__Impl )
            // InternalDSL.g:1484:2: rule__CharacteristicSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__2"


    // $ANTLR start "rule__CharacteristicSelector__Group__2__Impl"
    // InternalDSL.g:1490:1: rule__CharacteristicSelector__Group__2__Impl : ( ( rule__CharacteristicSelector__Alternatives_2 ) ) ;
    public final void rule__CharacteristicSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1494:1: ( ( ( rule__CharacteristicSelector__Alternatives_2 ) ) )
            // InternalDSL.g:1495:1: ( ( rule__CharacteristicSelector__Alternatives_2 ) )
            {
            // InternalDSL.g:1495:1: ( ( rule__CharacteristicSelector__Alternatives_2 ) )
            // InternalDSL.g:1496:2: ( rule__CharacteristicSelector__Alternatives_2 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getAlternatives_2()); 
            // InternalDSL.g:1497:2: ( rule__CharacteristicSelector__Alternatives_2 )
            // InternalDSL.g:1497:3: rule__CharacteristicSelector__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__2__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_0__0"
    // InternalDSL.g:1506:1: rule__CharacteristicSelector__Group_2_0__0 : rule__CharacteristicSelector__Group_2_0__0__Impl rule__CharacteristicSelector__Group_2_0__1 ;
    public final void rule__CharacteristicSelector__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1510:1: ( rule__CharacteristicSelector__Group_2_0__0__Impl rule__CharacteristicSelector__Group_2_0__1 )
            // InternalDSL.g:1511:2: rule__CharacteristicSelector__Group_2_0__0__Impl rule__CharacteristicSelector__Group_2_0__1
            {
            pushFollow(FOLLOW_14);
            rule__CharacteristicSelector__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_0__0"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_0__0__Impl"
    // InternalDSL.g:1518:1: rule__CharacteristicSelector__Group_2_0__0__Impl : ( ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )? ) ;
    public final void rule__CharacteristicSelector__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1522:1: ( ( ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )? ) )
            // InternalDSL.g:1523:1: ( ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )? )
            {
            // InternalDSL.g:1523:1: ( ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )? )
            // InternalDSL.g:1524:2: ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )?
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getNegatedAssignment_2_0_0()); 
            // InternalDSL.g:1525:2: ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1525:3: rule__CharacteristicSelector__NegatedAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicSelector__NegatedAssignment_2_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacteristicSelectorAccess().getNegatedAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_0__0__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_0__1"
    // InternalDSL.g:1533:1: rule__CharacteristicSelector__Group_2_0__1 : rule__CharacteristicSelector__Group_2_0__1__Impl ;
    public final void rule__CharacteristicSelector__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1537:1: ( rule__CharacteristicSelector__Group_2_0__1__Impl )
            // InternalDSL.g:1538:2: rule__CharacteristicSelector__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_0__1"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_0__1__Impl"
    // InternalDSL.g:1544:1: rule__CharacteristicSelector__Group_2_0__1__Impl : ( ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1548:1: ( ( ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 ) ) )
            // InternalDSL.g:1549:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 ) )
            {
            // InternalDSL.g:1549:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 ) )
            // InternalDSL.g:1550:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_0_1()); 
            // InternalDSL.g:1551:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 )
            // InternalDSL.g:1551:3: rule__CharacteristicSelector__LiteralsAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__LiteralsAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_0__1__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1__0"
    // InternalDSL.g:1560:1: rule__CharacteristicSelector__Group_2_1__0 : rule__CharacteristicSelector__Group_2_1__0__Impl rule__CharacteristicSelector__Group_2_1__1 ;
    public final void rule__CharacteristicSelector__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1564:1: ( rule__CharacteristicSelector__Group_2_1__0__Impl rule__CharacteristicSelector__Group_2_1__1 )
            // InternalDSL.g:1565:2: rule__CharacteristicSelector__Group_2_1__0__Impl rule__CharacteristicSelector__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__CharacteristicSelector__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1__0"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1__0__Impl"
    // InternalDSL.g:1572:1: rule__CharacteristicSelector__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__CharacteristicSelector__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1576:1: ( ( '[' ) )
            // InternalDSL.g:1577:1: ( '[' )
            {
            // InternalDSL.g:1577:1: ( '[' )
            // InternalDSL.g:1578:2: '['
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getLeftSquareBracketKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1__0__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1__1"
    // InternalDSL.g:1587:1: rule__CharacteristicSelector__Group_2_1__1 : rule__CharacteristicSelector__Group_2_1__1__Impl rule__CharacteristicSelector__Group_2_1__2 ;
    public final void rule__CharacteristicSelector__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1591:1: ( rule__CharacteristicSelector__Group_2_1__1__Impl rule__CharacteristicSelector__Group_2_1__2 )
            // InternalDSL.g:1592:2: rule__CharacteristicSelector__Group_2_1__1__Impl rule__CharacteristicSelector__Group_2_1__2
            {
            pushFollow(FOLLOW_15);
            rule__CharacteristicSelector__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1__1"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1__1__Impl"
    // InternalDSL.g:1599:1: rule__CharacteristicSelector__Group_2_1__1__Impl : ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1603:1: ( ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 ) ) )
            // InternalDSL.g:1604:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 ) )
            {
            // InternalDSL.g:1604:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 ) )
            // InternalDSL.g:1605:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_1_1()); 
            // InternalDSL.g:1606:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 )
            // InternalDSL.g:1606:3: rule__CharacteristicSelector__LiteralsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__LiteralsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1__1__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1__2"
    // InternalDSL.g:1614:1: rule__CharacteristicSelector__Group_2_1__2 : rule__CharacteristicSelector__Group_2_1__2__Impl rule__CharacteristicSelector__Group_2_1__3 ;
    public final void rule__CharacteristicSelector__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1618:1: ( rule__CharacteristicSelector__Group_2_1__2__Impl rule__CharacteristicSelector__Group_2_1__3 )
            // InternalDSL.g:1619:2: rule__CharacteristicSelector__Group_2_1__2__Impl rule__CharacteristicSelector__Group_2_1__3
            {
            pushFollow(FOLLOW_16);
            rule__CharacteristicSelector__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1__2"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1__2__Impl"
    // InternalDSL.g:1626:1: rule__CharacteristicSelector__Group_2_1__2__Impl : ( ( rule__CharacteristicSelector__Alternatives_2_1_2 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1630:1: ( ( ( rule__CharacteristicSelector__Alternatives_2_1_2 ) ) )
            // InternalDSL.g:1631:1: ( ( rule__CharacteristicSelector__Alternatives_2_1_2 ) )
            {
            // InternalDSL.g:1631:1: ( ( rule__CharacteristicSelector__Alternatives_2_1_2 ) )
            // InternalDSL.g:1632:2: ( rule__CharacteristicSelector__Alternatives_2_1_2 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getAlternatives_2_1_2()); 
            // InternalDSL.g:1633:2: ( rule__CharacteristicSelector__Alternatives_2_1_2 )
            // InternalDSL.g:1633:3: rule__CharacteristicSelector__Alternatives_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Alternatives_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getAlternatives_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1__2__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1__3"
    // InternalDSL.g:1641:1: rule__CharacteristicSelector__Group_2_1__3 : rule__CharacteristicSelector__Group_2_1__3__Impl ;
    public final void rule__CharacteristicSelector__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1645:1: ( rule__CharacteristicSelector__Group_2_1__3__Impl )
            // InternalDSL.g:1646:2: rule__CharacteristicSelector__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1__3"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1__3__Impl"
    // InternalDSL.g:1652:1: rule__CharacteristicSelector__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__CharacteristicSelector__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1656:1: ( ( ']' ) )
            // InternalDSL.g:1657:1: ( ']' )
            {
            // InternalDSL.g:1657:1: ( ']' )
            // InternalDSL.g:1658:2: ']'
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getRightSquareBracketKeyword_2_1_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getRightSquareBracketKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1__3__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1_2_0__0"
    // InternalDSL.g:1668:1: rule__CharacteristicSelector__Group_2_1_2_0__0 : rule__CharacteristicSelector__Group_2_1_2_0__0__Impl rule__CharacteristicSelector__Group_2_1_2_0__1 ;
    public final void rule__CharacteristicSelector__Group_2_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1672:1: ( rule__CharacteristicSelector__Group_2_1_2_0__0__Impl rule__CharacteristicSelector__Group_2_1_2_0__1 )
            // InternalDSL.g:1673:2: rule__CharacteristicSelector__Group_2_1_2_0__0__Impl rule__CharacteristicSelector__Group_2_1_2_0__1
            {
            pushFollow(FOLLOW_6);
            rule__CharacteristicSelector__Group_2_1_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group_2_1_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1_2_0__0"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1_2_0__0__Impl"
    // InternalDSL.g:1680:1: rule__CharacteristicSelector__Group_2_1_2_0__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicSelector__Group_2_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1684:1: ( ( ',' ) )
            // InternalDSL.g:1685:1: ( ',' )
            {
            // InternalDSL.g:1685:1: ( ',' )
            // InternalDSL.g:1686:2: ','
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getCommaKeyword_2_1_2_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getCommaKeyword_2_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1_2_0__0__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1_2_0__1"
    // InternalDSL.g:1695:1: rule__CharacteristicSelector__Group_2_1_2_0__1 : rule__CharacteristicSelector__Group_2_1_2_0__1__Impl ;
    public final void rule__CharacteristicSelector__Group_2_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1699:1: ( rule__CharacteristicSelector__Group_2_1_2_0__1__Impl )
            // InternalDSL.g:1700:2: rule__CharacteristicSelector__Group_2_1_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group_2_1_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1_2_0__1"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1_2_0__1__Impl"
    // InternalDSL.g:1706:1: rule__CharacteristicSelector__Group_2_1_2_0__1__Impl : ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1710:1: ( ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 ) ) )
            // InternalDSL.g:1711:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 ) )
            {
            // InternalDSL.g:1711:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 ) )
            // InternalDSL.g:1712:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_1_2_0_1()); 
            // InternalDSL.g:1713:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 )
            // InternalDSL.g:1713:3: rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_1_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1_2_0__1__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1_2_1__0"
    // InternalDSL.g:1722:1: rule__CharacteristicSelector__Group_2_1_2_1__0 : rule__CharacteristicSelector__Group_2_1_2_1__0__Impl rule__CharacteristicSelector__Group_2_1_2_1__1 ;
    public final void rule__CharacteristicSelector__Group_2_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1726:1: ( rule__CharacteristicSelector__Group_2_1_2_1__0__Impl rule__CharacteristicSelector__Group_2_1_2_1__1 )
            // InternalDSL.g:1727:2: rule__CharacteristicSelector__Group_2_1_2_1__0__Impl rule__CharacteristicSelector__Group_2_1_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__CharacteristicSelector__Group_2_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group_2_1_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1_2_1__0"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1_2_1__0__Impl"
    // InternalDSL.g:1734:1: rule__CharacteristicSelector__Group_2_1_2_1__0__Impl : ( ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1738:1: ( ( ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 ) ) )
            // InternalDSL.g:1739:1: ( ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 ) )
            {
            // InternalDSL.g:1739:1: ( ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 ) )
            // InternalDSL.g:1740:2: ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getConjunctedAssignment_2_1_2_1_0()); 
            // InternalDSL.g:1741:2: ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 )
            // InternalDSL.g:1741:3: rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getConjunctedAssignment_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1_2_1__0__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1_2_1__1"
    // InternalDSL.g:1749:1: rule__CharacteristicSelector__Group_2_1_2_1__1 : rule__CharacteristicSelector__Group_2_1_2_1__1__Impl ;
    public final void rule__CharacteristicSelector__Group_2_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1753:1: ( rule__CharacteristicSelector__Group_2_1_2_1__1__Impl )
            // InternalDSL.g:1754:2: rule__CharacteristicSelector__Group_2_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group_2_1_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1_2_1__1"


    // $ANTLR start "rule__CharacteristicSelector__Group_2_1_2_1__1__Impl"
    // InternalDSL.g:1760:1: rule__CharacteristicSelector__Group_2_1_2_1__1__Impl : ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1764:1: ( ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 ) ) )
            // InternalDSL.g:1765:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 ) )
            {
            // InternalDSL.g:1765:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 ) )
            // InternalDSL.g:1766:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_1_2_1_1()); 
            // InternalDSL.g:1767:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 )
            // InternalDSL.g:1767:3: rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_1_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group_2_1_2_1__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalDSL.g:1776:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1780:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDSL.g:1781:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalDSL.g:1788:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1792:1: ( ( 'constraint' ) )
            // InternalDSL.g:1793:1: ( 'constraint' )
            {
            // InternalDSL.g:1793:1: ( 'constraint' )
            // InternalDSL.g:1794:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalDSL.g:1803:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1807:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDSL.g:1808:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalDSL.g:1815:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1819:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDSL.g:1820:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDSL.g:1820:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDSL.g:1821:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDSL.g:1822:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDSL.g:1822:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalDSL.g:1830:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1834:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDSL.g:1835:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalDSL.g:1842:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1846:1: ( ( '{' ) )
            // InternalDSL.g:1847:1: ( '{' )
            {
            // InternalDSL.g:1847:1: ( '{' )
            // InternalDSL.g:1848:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalDSL.g:1857:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1861:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDSL.g:1862:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalDSL.g:1869:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__RuleAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1873:1: ( ( ( rule__Constraint__RuleAssignment_3 ) ) )
            // InternalDSL.g:1874:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            {
            // InternalDSL.g:1874:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            // InternalDSL.g:1875:2: ( rule__Constraint__RuleAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 
            // InternalDSL.g:1876:2: ( rule__Constraint__RuleAssignment_3 )
            // InternalDSL.g:1876:3: rule__Constraint__RuleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__RuleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalDSL.g:1884:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1888:1: ( rule__Constraint__Group__4__Impl )
            // InternalDSL.g:1889:2: rule__Constraint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalDSL.g:1895:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1899:1: ( ( '}' ) )
            // InternalDSL.g:1900:1: ( '}' )
            {
            // InternalDSL.g:1900:1: ( '}' )
            // InternalDSL.g:1901:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalDSL.g:1911:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1915:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDSL.g:1916:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalDSL.g:1923:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DataSelectorsAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1927:1: ( ( ( rule__Rule__DataSelectorsAssignment_0 ) ) )
            // InternalDSL.g:1928:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            {
            // InternalDSL.g:1928:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            // InternalDSL.g:1929:2: ( rule__Rule__DataSelectorsAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 
            // InternalDSL.g:1930:2: ( rule__Rule__DataSelectorsAssignment_0 )
            // InternalDSL.g:1930:3: rule__Rule__DataSelectorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DataSelectorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalDSL.g:1938:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1942:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDSL.g:1943:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalDSL.g:1950:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1954:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // InternalDSL.g:1955:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // InternalDSL.g:1955:1: ( ( rule__Rule__Group_1__0 )* )
            // InternalDSL.g:1956:2: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // InternalDSL.g:1957:2: ( rule__Rule__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1957:3: rule__Rule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Rule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalDSL.g:1965:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1969:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDSL.g:1970:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalDSL.g:1977:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__StatementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1981:1: ( ( ( rule__Rule__StatementAssignment_2 ) ) )
            // InternalDSL.g:1982:1: ( ( rule__Rule__StatementAssignment_2 ) )
            {
            // InternalDSL.g:1982:1: ( ( rule__Rule__StatementAssignment_2 ) )
            // InternalDSL.g:1983:2: ( rule__Rule__StatementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getStatementAssignment_2()); 
            // InternalDSL.g:1984:2: ( rule__Rule__StatementAssignment_2 )
            // InternalDSL.g:1984:3: rule__Rule__StatementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__StatementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getStatementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalDSL.g:1992:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1996:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDSL.g:1997:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalDSL.g:2004:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2008:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) )
            // InternalDSL.g:2009:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            {
            // InternalDSL.g:2009:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            // InternalDSL.g:2010:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 
            // InternalDSL.g:2011:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            // InternalDSL.g:2011:3: rule__Rule__DestinationSelectorsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DestinationSelectorsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalDSL.g:2019:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2023:1: ( rule__Rule__Group__4__Impl )
            // InternalDSL.g:2024:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalDSL.g:2030:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2034:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // InternalDSL.g:2035:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // InternalDSL.g:2035:1: ( ( rule__Rule__Group_4__0 )* )
            // InternalDSL.g:2036:2: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalDSL.g:2037:2: ( rule__Rule__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:2037:3: rule__Rule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Rule__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group_1__0"
    // InternalDSL.g:2046:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2050:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalDSL.g:2051:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__0"


    // $ANTLR start "rule__Rule__Group_1__0__Impl"
    // InternalDSL.g:2058:1: rule__Rule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2062:1: ( ( '&' ) )
            // InternalDSL.g:2063:1: ( '&' )
            {
            // InternalDSL.g:2063:1: ( '&' )
            // InternalDSL.g:2064:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAmpersandKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_1__1"
    // InternalDSL.g:2073:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2077:1: ( rule__Rule__Group_1__1__Impl )
            // InternalDSL.g:2078:2: rule__Rule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__1"


    // $ANTLR start "rule__Rule__Group_1__1__Impl"
    // InternalDSL.g:2084:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2088:1: ( ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) )
            // InternalDSL.g:2089:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            {
            // InternalDSL.g:2089:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            // InternalDSL.g:2090:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 
            // InternalDSL.g:2091:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            // InternalDSL.g:2091:3: rule__Rule__DataSelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DataSelectorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__1__Impl"


    // $ANTLR start "rule__Rule__Group_4__0"
    // InternalDSL.g:2100:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2104:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalDSL.g:2105:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__0"


    // $ANTLR start "rule__Rule__Group_4__0__Impl"
    // InternalDSL.g:2112:1: rule__Rule__Group_4__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2116:1: ( ( '&' ) )
            // InternalDSL.g:2117:1: ( '&' )
            {
            // InternalDSL.g:2117:1: ( '&' )
            // InternalDSL.g:2118:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAmpersandKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__0__Impl"


    // $ANTLR start "rule__Rule__Group_4__1"
    // InternalDSL.g:2127:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2131:1: ( rule__Rule__Group_4__1__Impl )
            // InternalDSL.g:2132:2: rule__Rule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__1"


    // $ANTLR start "rule__Rule__Group_4__1__Impl"
    // InternalDSL.g:2138:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2142:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) )
            // InternalDSL.g:2143:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            {
            // InternalDSL.g:2143:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            // InternalDSL.g:2144:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 
            // InternalDSL.g:2145:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            // InternalDSL.g:2145:3: rule__Rule__DestinationSelectorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DestinationSelectorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__1__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__0"
    // InternalDSL.g:2154:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2158:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // InternalDSL.g:2159:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AttributeSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__0"


    // $ANTLR start "rule__AttributeSelector__Group__0__Impl"
    // InternalDSL.g:2166:1: rule__AttributeSelector__Group__0__Impl : ( 'data.attribute.' ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2170:1: ( ( 'data.attribute.' ) )
            // InternalDSL.g:2171:1: ( 'data.attribute.' )
            {
            // InternalDSL.g:2171:1: ( 'data.attribute.' )
            // InternalDSL.g:2172:2: 'data.attribute.'
            {
             before(grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__0__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__1"
    // InternalDSL.g:2181:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2185:1: ( rule__AttributeSelector__Group__1__Impl )
            // InternalDSL.g:2186:2: rule__AttributeSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__1"


    // $ANTLR start "rule__AttributeSelector__Group__1__Impl"
    // InternalDSL.g:2192:1: rule__AttributeSelector__Group__1__Impl : ( ( rule__AttributeSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2196:1: ( ( ( rule__AttributeSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2197:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2197:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            // InternalDSL.g:2198:2: ( rule__AttributeSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2199:2: ( rule__AttributeSelector__RefAssignment_1 )
            // InternalDSL.g:2199:3: rule__AttributeSelector__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__1__Impl"


    // $ANTLR start "rule__AttributeClassSelector__Group__0"
    // InternalDSL.g:2208:1: rule__AttributeClassSelector__Group__0 : rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 ;
    public final void rule__AttributeClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2212:1: ( rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 )
            // InternalDSL.g:2213:2: rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AttributeClassSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClassSelector__Group__0"


    // $ANTLR start "rule__AttributeClassSelector__Group__0__Impl"
    // InternalDSL.g:2220:1: rule__AttributeClassSelector__Group__0__Impl : ( 'data.class.' ) ;
    public final void rule__AttributeClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2224:1: ( ( 'data.class.' ) )
            // InternalDSL.g:2225:1: ( 'data.class.' )
            {
            // InternalDSL.g:2225:1: ( 'data.class.' )
            // InternalDSL.g:2226:2: 'data.class.'
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClassSelector__Group__0__Impl"


    // $ANTLR start "rule__AttributeClassSelector__Group__1"
    // InternalDSL.g:2235:1: rule__AttributeClassSelector__Group__1 : rule__AttributeClassSelector__Group__1__Impl rule__AttributeClassSelector__Group__2 ;
    public final void rule__AttributeClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2239:1: ( rule__AttributeClassSelector__Group__1__Impl rule__AttributeClassSelector__Group__2 )
            // InternalDSL.g:2240:2: rule__AttributeClassSelector__Group__1__Impl rule__AttributeClassSelector__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AttributeClassSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClassSelector__Group__1"


    // $ANTLR start "rule__AttributeClassSelector__Group__1__Impl"
    // InternalDSL.g:2247:1: rule__AttributeClassSelector__Group__1__Impl : ( ( rule__AttributeClassSelector__NegatedAssignment_1 )? ) ;
    public final void rule__AttributeClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2251:1: ( ( ( rule__AttributeClassSelector__NegatedAssignment_1 )? ) )
            // InternalDSL.g:2252:1: ( ( rule__AttributeClassSelector__NegatedAssignment_1 )? )
            {
            // InternalDSL.g:2252:1: ( ( rule__AttributeClassSelector__NegatedAssignment_1 )? )
            // InternalDSL.g:2253:2: ( rule__AttributeClassSelector__NegatedAssignment_1 )?
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getNegatedAssignment_1()); 
            // InternalDSL.g:2254:2: ( rule__AttributeClassSelector__NegatedAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:2254:3: rule__AttributeClassSelector__NegatedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeClassSelector__NegatedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeClassSelectorAccess().getNegatedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClassSelector__Group__1__Impl"


    // $ANTLR start "rule__AttributeClassSelector__Group__2"
    // InternalDSL.g:2262:1: rule__AttributeClassSelector__Group__2 : rule__AttributeClassSelector__Group__2__Impl ;
    public final void rule__AttributeClassSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2266:1: ( rule__AttributeClassSelector__Group__2__Impl )
            // InternalDSL.g:2267:2: rule__AttributeClassSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClassSelector__Group__2"


    // $ANTLR start "rule__AttributeClassSelector__Group__2__Impl"
    // InternalDSL.g:2273:1: rule__AttributeClassSelector__Group__2__Impl : ( ( rule__AttributeClassSelector__RefAssignment_2 ) ) ;
    public final void rule__AttributeClassSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2277:1: ( ( ( rule__AttributeClassSelector__RefAssignment_2 ) ) )
            // InternalDSL.g:2278:1: ( ( rule__AttributeClassSelector__RefAssignment_2 ) )
            {
            // InternalDSL.g:2278:1: ( ( rule__AttributeClassSelector__RefAssignment_2 ) )
            // InternalDSL.g:2279:2: ( rule__AttributeClassSelector__RefAssignment_2 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_2()); 
            // InternalDSL.g:2280:2: ( rule__AttributeClassSelector__RefAssignment_2 )
            // InternalDSL.g:2280:3: rule__AttributeClassSelector__RefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__RefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClassSelector__Group__2__Impl"


    // $ANTLR start "rule__PropertySelector__Group__0"
    // InternalDSL.g:2289:1: rule__PropertySelector__Group__0 : rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 ;
    public final void rule__PropertySelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2293:1: ( rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 )
            // InternalDSL.g:2294:2: rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PropertySelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelector__Group__0"


    // $ANTLR start "rule__PropertySelector__Group__0__Impl"
    // InternalDSL.g:2301:1: rule__PropertySelector__Group__0__Impl : ( 'node.property.' ) ;
    public final void rule__PropertySelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2305:1: ( ( 'node.property.' ) )
            // InternalDSL.g:2306:1: ( 'node.property.' )
            {
            // InternalDSL.g:2306:1: ( 'node.property.' )
            // InternalDSL.g:2307:2: 'node.property.'
            {
             before(grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelector__Group__0__Impl"


    // $ANTLR start "rule__PropertySelector__Group__1"
    // InternalDSL.g:2316:1: rule__PropertySelector__Group__1 : rule__PropertySelector__Group__1__Impl ;
    public final void rule__PropertySelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2320:1: ( rule__PropertySelector__Group__1__Impl )
            // InternalDSL.g:2321:2: rule__PropertySelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelector__Group__1"


    // $ANTLR start "rule__PropertySelector__Group__1__Impl"
    // InternalDSL.g:2327:1: rule__PropertySelector__Group__1__Impl : ( ( rule__PropertySelector__RefAssignment_1 ) ) ;
    public final void rule__PropertySelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2331:1: ( ( ( rule__PropertySelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2332:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2332:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            // InternalDSL.g:2333:2: ( rule__PropertySelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2334:2: ( rule__PropertySelector__RefAssignment_1 )
            // InternalDSL.g:2334:3: rule__PropertySelector__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelector__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelector__Group__1__Impl"


    // $ANTLR start "rule__PropertyClassSelector__Group__0"
    // InternalDSL.g:2343:1: rule__PropertyClassSelector__Group__0 : rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 ;
    public final void rule__PropertyClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2347:1: ( rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 )
            // InternalDSL.g:2348:2: rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyClassSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassSelector__Group__0"


    // $ANTLR start "rule__PropertyClassSelector__Group__0__Impl"
    // InternalDSL.g:2355:1: rule__PropertyClassSelector__Group__0__Impl : ( 'node.class.' ) ;
    public final void rule__PropertyClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2359:1: ( ( 'node.class.' ) )
            // InternalDSL.g:2360:1: ( 'node.class.' )
            {
            // InternalDSL.g:2360:1: ( 'node.class.' )
            // InternalDSL.g:2361:2: 'node.class.'
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassSelector__Group__0__Impl"


    // $ANTLR start "rule__PropertyClassSelector__Group__1"
    // InternalDSL.g:2370:1: rule__PropertyClassSelector__Group__1 : rule__PropertyClassSelector__Group__1__Impl rule__PropertyClassSelector__Group__2 ;
    public final void rule__PropertyClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2374:1: ( rule__PropertyClassSelector__Group__1__Impl rule__PropertyClassSelector__Group__2 )
            // InternalDSL.g:2375:2: rule__PropertyClassSelector__Group__1__Impl rule__PropertyClassSelector__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PropertyClassSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassSelector__Group__1"


    // $ANTLR start "rule__PropertyClassSelector__Group__1__Impl"
    // InternalDSL.g:2382:1: rule__PropertyClassSelector__Group__1__Impl : ( ( rule__PropertyClassSelector__NegatedAssignment_1 )? ) ;
    public final void rule__PropertyClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2386:1: ( ( ( rule__PropertyClassSelector__NegatedAssignment_1 )? ) )
            // InternalDSL.g:2387:1: ( ( rule__PropertyClassSelector__NegatedAssignment_1 )? )
            {
            // InternalDSL.g:2387:1: ( ( rule__PropertyClassSelector__NegatedAssignment_1 )? )
            // InternalDSL.g:2388:2: ( rule__PropertyClassSelector__NegatedAssignment_1 )?
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNegatedAssignment_1()); 
            // InternalDSL.g:2389:2: ( rule__PropertyClassSelector__NegatedAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDSL.g:2389:3: rule__PropertyClassSelector__NegatedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyClassSelector__NegatedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyClassSelectorAccess().getNegatedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassSelector__Group__1__Impl"


    // $ANTLR start "rule__PropertyClassSelector__Group__2"
    // InternalDSL.g:2397:1: rule__PropertyClassSelector__Group__2 : rule__PropertyClassSelector__Group__2__Impl ;
    public final void rule__PropertyClassSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2401:1: ( rule__PropertyClassSelector__Group__2__Impl )
            // InternalDSL.g:2402:2: rule__PropertyClassSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassSelector__Group__2"


    // $ANTLR start "rule__PropertyClassSelector__Group__2__Impl"
    // InternalDSL.g:2408:1: rule__PropertyClassSelector__Group__2__Impl : ( ( rule__PropertyClassSelector__RefAssignment_2 ) ) ;
    public final void rule__PropertyClassSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2412:1: ( ( ( rule__PropertyClassSelector__RefAssignment_2 ) ) )
            // InternalDSL.g:2413:1: ( ( rule__PropertyClassSelector__RefAssignment_2 ) )
            {
            // InternalDSL.g:2413:1: ( ( rule__PropertyClassSelector__RefAssignment_2 ) )
            // InternalDSL.g:2414:2: ( rule__PropertyClassSelector__RefAssignment_2 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_2()); 
            // InternalDSL.g:2415:2: ( rule__PropertyClassSelector__RefAssignment_2 )
            // InternalDSL.g:2415:3: rule__PropertyClassSelector__RefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__RefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassSelector__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalDSL.g:2424:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2428:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalDSL.g:2429:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalDSL.g:2436:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__ModalityAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2440:1: ( ( ( rule__Statement__ModalityAssignment_0 ) ) )
            // InternalDSL.g:2441:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            {
            // InternalDSL.g:2441:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            // InternalDSL.g:2442:2: ( rule__Statement__ModalityAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getModalityAssignment_0()); 
            // InternalDSL.g:2443:2: ( rule__Statement__ModalityAssignment_0 )
            // InternalDSL.g:2443:3: rule__Statement__ModalityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ModalityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getModalityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalDSL.g:2451:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2455:1: ( rule__Statement__Group__1__Impl )
            // InternalDSL.g:2456:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalDSL.g:2462:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__TypeAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2466:1: ( ( ( rule__Statement__TypeAssignment_1 ) ) )
            // InternalDSL.g:2467:1: ( ( rule__Statement__TypeAssignment_1 ) )
            {
            // InternalDSL.g:2467:1: ( ( rule__Statement__TypeAssignment_1 ) )
            // InternalDSL.g:2468:2: ( rule__Statement__TypeAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_1()); 
            // InternalDSL.g:2469:2: ( rule__Statement__TypeAssignment_1 )
            // InternalDSL.g:2469:3: rule__Statement__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalDSL.g:2478:1: rule__Model__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2482:1: ( ( ruleAbstractElement ) )
            // InternalDSL.g:2483:2: ( ruleAbstractElement )
            {
            // InternalDSL.g:2483:2: ( ruleAbstractElement )
            // InternalDSL.g:2484:3: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalDSL.g:2493:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2497:1: ( ( RULE_ID ) )
            // InternalDSL.g:2498:2: ( RULE_ID )
            {
            // InternalDSL.g:2498:2: ( RULE_ID )
            // InternalDSL.g:2499:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__ValueSet__NameAssignment_1"
    // InternalDSL.g:2508:1: rule__ValueSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ValueSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2512:1: ( ( RULE_ID ) )
            // InternalDSL.g:2513:2: ( RULE_ID )
            {
            // InternalDSL.g:2513:2: ( RULE_ID )
            // InternalDSL.g:2514:3: RULE_ID
            {
             before(grammarAccess.getValueSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__NameAssignment_1"


    // $ANTLR start "rule__ValueSet__MembersAssignment_4"
    // InternalDSL.g:2523:1: rule__ValueSet__MembersAssignment_4 : ( RULE_ID ) ;
    public final void rule__ValueSet__MembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2527:1: ( ( RULE_ID ) )
            // InternalDSL.g:2528:2: ( RULE_ID )
            {
            // InternalDSL.g:2528:2: ( RULE_ID )
            // InternalDSL.g:2529:3: RULE_ID
            {
             before(grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__MembersAssignment_4"


    // $ANTLR start "rule__ValueSet__MembersAssignment_5_1"
    // InternalDSL.g:2538:1: rule__ValueSet__MembersAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ValueSet__MembersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2542:1: ( ( RULE_ID ) )
            // InternalDSL.g:2543:2: ( RULE_ID )
            {
            // InternalDSL.g:2543:2: ( RULE_ID )
            // InternalDSL.g:2544:3: RULE_ID
            {
             before(grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__MembersAssignment_5_1"


    // $ANTLR start "rule__AttributeType__NameAssignment_1"
    // InternalDSL.g:2553:1: rule__AttributeType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2557:1: ( ( RULE_ID ) )
            // InternalDSL.g:2558:2: ( RULE_ID )
            {
            // InternalDSL.g:2558:2: ( RULE_ID )
            // InternalDSL.g:2559:3: RULE_ID
            {
             before(grammarAccess.getAttributeTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_1"


    // $ANTLR start "rule__AttributeType__ValuesetAssignment_3"
    // InternalDSL.g:2568:1: rule__AttributeType__ValuesetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeType__ValuesetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2572:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2573:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2573:2: ( ( RULE_ID ) )
            // InternalDSL.g:2574:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeTypeAccess().getValuesetValueSetCrossReference_3_0()); 
            // InternalDSL.g:2575:3: ( RULE_ID )
            // InternalDSL.g:2576:4: RULE_ID
            {
             before(grammarAccess.getAttributeTypeAccess().getValuesetValueSetIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getValuesetValueSetIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getValuesetValueSetCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__ValuesetAssignment_3"


    // $ANTLR start "rule__PropertyType__NameAssignment_1"
    // InternalDSL.g:2587:1: rule__PropertyType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PropertyType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2591:1: ( ( RULE_ID ) )
            // InternalDSL.g:2592:2: ( RULE_ID )
            {
            // InternalDSL.g:2592:2: ( RULE_ID )
            // InternalDSL.g:2593:3: RULE_ID
            {
             before(grammarAccess.getPropertyTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__NameAssignment_1"


    // $ANTLR start "rule__PropertyType__ValuesetAssignment_3"
    // InternalDSL.g:2602:1: rule__PropertyType__ValuesetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyType__ValuesetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2606:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2607:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2607:2: ( ( RULE_ID ) )
            // InternalDSL.g:2608:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyTypeAccess().getValuesetValueSetCrossReference_3_0()); 
            // InternalDSL.g:2609:3: ( RULE_ID )
            // InternalDSL.g:2610:4: RULE_ID
            {
             before(grammarAccess.getPropertyTypeAccess().getValuesetValueSetIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyTypeAccess().getValuesetValueSetIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPropertyTypeAccess().getValuesetValueSetCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__ValuesetAssignment_3"


    // $ANTLR start "rule__CharacteristicClass__NameAssignment_1"
    // InternalDSL.g:2621:1: rule__CharacteristicClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2625:1: ( ( RULE_ID ) )
            // InternalDSL.g:2626:2: ( RULE_ID )
            {
            // InternalDSL.g:2626:2: ( RULE_ID )
            // InternalDSL.g:2627:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__NameAssignment_1"


    // $ANTLR start "rule__CharacteristicClass__MembersAssignment_3"
    // InternalDSL.g:2636:1: rule__CharacteristicClass__MembersAssignment_3 : ( ruleCharacteristicSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2640:1: ( ( ruleCharacteristicSelector ) )
            // InternalDSL.g:2641:2: ( ruleCharacteristicSelector )
            {
            // InternalDSL.g:2641:2: ( ruleCharacteristicSelector )
            // InternalDSL.g:2642:3: ruleCharacteristicSelector
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicSelectorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSelector();

            state._fsp--;

             after(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicSelectorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__MembersAssignment_3"


    // $ANTLR start "rule__CharacteristicClass__MembersAssignment_4_1"
    // InternalDSL.g:2651:1: rule__CharacteristicClass__MembersAssignment_4_1 : ( ruleCharacteristicSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2655:1: ( ( ruleCharacteristicSelector ) )
            // InternalDSL.g:2656:2: ( ruleCharacteristicSelector )
            {
            // InternalDSL.g:2656:2: ( ruleCharacteristicSelector )
            // InternalDSL.g:2657:3: ruleCharacteristicSelector
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicSelectorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSelector();

            state._fsp--;

             after(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicSelectorParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicClass__MembersAssignment_4_1"


    // $ANTLR start "rule__CharacteristicSelector__RefAssignment_0"
    // InternalDSL.g:2666:1: rule__CharacteristicSelector__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicSelector__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2670:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2671:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2671:2: ( ( RULE_ID ) )
            // InternalDSL.g:2672:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getRefCharacteristicsTypeCrossReference_0_0()); 
            // InternalDSL.g:2673:3: ( RULE_ID )
            // InternalDSL.g:2674:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getRefCharacteristicsTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getRefCharacteristicsTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCharacteristicSelectorAccess().getRefCharacteristicsTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__RefAssignment_0"


    // $ANTLR start "rule__CharacteristicSelector__NegatedAssignment_2_0_0"
    // InternalDSL.g:2685:1: rule__CharacteristicSelector__NegatedAssignment_2_0_0 : ( ( '!' ) ) ;
    public final void rule__CharacteristicSelector__NegatedAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2689:1: ( ( ( '!' ) ) )
            // InternalDSL.g:2690:2: ( ( '!' ) )
            {
            // InternalDSL.g:2690:2: ( ( '!' ) )
            // InternalDSL.g:2691:3: ( '!' )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            // InternalDSL.g:2692:3: ( '!' )
            // InternalDSL.g:2693:4: '!'
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 

            }

             after(grammarAccess.getCharacteristicSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__NegatedAssignment_2_0_0"


    // $ANTLR start "rule__CharacteristicSelector__LiteralsAssignment_2_0_1"
    // InternalDSL.g:2704:1: rule__CharacteristicSelector__LiteralsAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicSelector__LiteralsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2708:1: ( ( RULE_ID ) )
            // InternalDSL.g:2709:2: ( RULE_ID )
            {
            // InternalDSL.g:2709:2: ( RULE_ID )
            // InternalDSL.g:2710:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__LiteralsAssignment_2_0_1"


    // $ANTLR start "rule__CharacteristicSelector__LiteralsAssignment_2_1_1"
    // InternalDSL.g:2719:1: rule__CharacteristicSelector__LiteralsAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicSelector__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2723:1: ( ( RULE_ID ) )
            // InternalDSL.g:2724:2: ( RULE_ID )
            {
            // InternalDSL.g:2724:2: ( RULE_ID )
            // InternalDSL.g:2725:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__LiteralsAssignment_2_1_1"


    // $ANTLR start "rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1"
    // InternalDSL.g:2734:1: rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2738:1: ( ( RULE_ID ) )
            // InternalDSL.g:2739:2: ( RULE_ID )
            {
            // InternalDSL.g:2739:2: ( RULE_ID )
            // InternalDSL.g:2740:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1"


    // $ANTLR start "rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0"
    // InternalDSL.g:2749:1: rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 : ( ( '&' ) ) ;
    public final void rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2753:1: ( ( ( '&' ) ) )
            // InternalDSL.g:2754:2: ( ( '&' ) )
            {
            // InternalDSL.g:2754:2: ( ( '&' ) )
            // InternalDSL.g:2755:3: ( '&' )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getConjunctedAmpersandKeyword_2_1_2_1_0_0()); 
            // InternalDSL.g:2756:3: ( '&' )
            // InternalDSL.g:2757:4: '&'
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getConjunctedAmpersandKeyword_2_1_2_1_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getConjunctedAmpersandKeyword_2_1_2_1_0_0()); 

            }

             after(grammarAccess.getCharacteristicSelectorAccess().getConjunctedAmpersandKeyword_2_1_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0"


    // $ANTLR start "rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1"
    // InternalDSL.g:2768:1: rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2772:1: ( ( RULE_ID ) )
            // InternalDSL.g:2773:2: ( RULE_ID )
            {
            // InternalDSL.g:2773:2: ( RULE_ID )
            // InternalDSL.g:2774:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // InternalDSL.g:2783:1: rule__Constraint__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2787:1: ( ( RULE_STRING ) )
            // InternalDSL.g:2788:2: ( RULE_STRING )
            {
            // InternalDSL.g:2788:2: ( RULE_STRING )
            // InternalDSL.g:2789:3: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_1"


    // $ANTLR start "rule__Constraint__RuleAssignment_3"
    // InternalDSL.g:2798:1: rule__Constraint__RuleAssignment_3 : ( ruleRule ) ;
    public final void rule__Constraint__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2802:1: ( ( ruleRule ) )
            // InternalDSL.g:2803:2: ( ruleRule )
            {
            // InternalDSL.g:2803:2: ( ruleRule )
            // InternalDSL.g:2804:3: ruleRule
            {
             before(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__RuleAssignment_3"


    // $ANTLR start "rule__Rule__DataSelectorsAssignment_0"
    // InternalDSL.g:2813:1: rule__Rule__DataSelectorsAssignment_0 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2817:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:2818:2: ( ruleDataSelector )
            {
            // InternalDSL.g:2818:2: ( ruleDataSelector )
            // InternalDSL.g:2819:3: ruleDataSelector
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataSelector();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__DataSelectorsAssignment_0"


    // $ANTLR start "rule__Rule__DataSelectorsAssignment_1_1"
    // InternalDSL.g:2828:1: rule__Rule__DataSelectorsAssignment_1_1 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2832:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:2833:2: ( ruleDataSelector )
            {
            // InternalDSL.g:2833:2: ( ruleDataSelector )
            // InternalDSL.g:2834:3: ruleDataSelector
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataSelector();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__DataSelectorsAssignment_1_1"


    // $ANTLR start "rule__Rule__StatementAssignment_2"
    // InternalDSL.g:2843:1: rule__Rule__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Rule__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2847:1: ( ( ruleStatement ) )
            // InternalDSL.g:2848:2: ( ruleStatement )
            {
            // InternalDSL.g:2848:2: ( ruleStatement )
            // InternalDSL.g:2849:3: ruleStatement
            {
             before(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__StatementAssignment_2"


    // $ANTLR start "rule__Rule__DestinationSelectorsAssignment_3"
    // InternalDSL.g:2858:1: rule__Rule__DestinationSelectorsAssignment_3 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2862:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:2863:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:2863:2: ( ruleDestinationSelector )
            // InternalDSL.g:2864:3: ruleDestinationSelector
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDestinationSelector();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__DestinationSelectorsAssignment_3"


    // $ANTLR start "rule__Rule__DestinationSelectorsAssignment_4_1"
    // InternalDSL.g:2873:1: rule__Rule__DestinationSelectorsAssignment_4_1 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2877:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:2878:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:2878:2: ( ruleDestinationSelector )
            // InternalDSL.g:2879:3: ruleDestinationSelector
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestinationSelector();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__DestinationSelectorsAssignment_4_1"


    // $ANTLR start "rule__AttributeSelector__RefAssignment_1"
    // InternalDSL.g:2888:1: rule__AttributeSelector__RefAssignment_1 : ( ruleCharacteristicSelector ) ;
    public final void rule__AttributeSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2892:1: ( ( ruleCharacteristicSelector ) )
            // InternalDSL.g:2893:2: ( ruleCharacteristicSelector )
            {
            // InternalDSL.g:2893:2: ( ruleCharacteristicSelector )
            // InternalDSL.g:2894:3: ruleCharacteristicSelector
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefCharacteristicSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSelector();

            state._fsp--;

             after(grammarAccess.getAttributeSelectorAccess().getRefCharacteristicSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__RefAssignment_1"


    // $ANTLR start "rule__AttributeClassSelector__NegatedAssignment_1"
    // InternalDSL.g:2903:1: rule__AttributeClassSelector__NegatedAssignment_1 : ( ( '!' ) ) ;
    public final void rule__AttributeClassSelector__NegatedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2907:1: ( ( ( '!' ) ) )
            // InternalDSL.g:2908:2: ( ( '!' ) )
            {
            // InternalDSL.g:2908:2: ( ( '!' ) )
            // InternalDSL.g:2909:3: ( '!' )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0()); 
            // InternalDSL.g:2910:3: ( '!' )
            // InternalDSL.g:2911:4: '!'
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClassSelector__NegatedAssignment_1"


    // $ANTLR start "rule__AttributeClassSelector__RefAssignment_2"
    // InternalDSL.g:2922:1: rule__AttributeClassSelector__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeClassSelector__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2926:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2927:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2927:2: ( ( RULE_ID ) )
            // InternalDSL.g:2928:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_2_0()); 
            // InternalDSL.g:2929:3: ( RULE_ID )
            // InternalDSL.g:2930:4: RULE_ID
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClassSelector__RefAssignment_2"


    // $ANTLR start "rule__PropertySelector__RefAssignment_1"
    // InternalDSL.g:2941:1: rule__PropertySelector__RefAssignment_1 : ( ruleCharacteristicSelector ) ;
    public final void rule__PropertySelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2945:1: ( ( ruleCharacteristicSelector ) )
            // InternalDSL.g:2946:2: ( ruleCharacteristicSelector )
            {
            // InternalDSL.g:2946:2: ( ruleCharacteristicSelector )
            // InternalDSL.g:2947:3: ruleCharacteristicSelector
            {
             before(grammarAccess.getPropertySelectorAccess().getRefCharacteristicSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSelector();

            state._fsp--;

             after(grammarAccess.getPropertySelectorAccess().getRefCharacteristicSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelector__RefAssignment_1"


    // $ANTLR start "rule__PropertyClassSelector__NegatedAssignment_1"
    // InternalDSL.g:2956:1: rule__PropertyClassSelector__NegatedAssignment_1 : ( ( '!' ) ) ;
    public final void rule__PropertyClassSelector__NegatedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2960:1: ( ( ( '!' ) ) )
            // InternalDSL.g:2961:2: ( ( '!' ) )
            {
            // InternalDSL.g:2961:2: ( ( '!' ) )
            // InternalDSL.g:2962:3: ( '!' )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0()); 
            // InternalDSL.g:2963:3: ( '!' )
            // InternalDSL.g:2964:4: '!'
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPropertyClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0()); 

            }

             after(grammarAccess.getPropertyClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassSelector__NegatedAssignment_1"


    // $ANTLR start "rule__PropertyClassSelector__RefAssignment_2"
    // InternalDSL.g:2975:1: rule__PropertyClassSelector__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyClassSelector__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2979:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2980:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2980:2: ( ( RULE_ID ) )
            // InternalDSL.g:2981:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_2_0()); 
            // InternalDSL.g:2982:3: ( RULE_ID )
            // InternalDSL.g:2983:4: RULE_ID
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassSelector__RefAssignment_2"


    // $ANTLR start "rule__Statement__ModalityAssignment_0"
    // InternalDSL.g:2994:1: rule__Statement__ModalityAssignment_0 : ( ruleStatementModality ) ;
    public final void rule__Statement__ModalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2998:1: ( ( ruleStatementModality ) )
            // InternalDSL.g:2999:2: ( ruleStatementModality )
            {
            // InternalDSL.g:2999:2: ( ruleStatementModality )
            // InternalDSL.g:3000:3: ruleStatementModality
            {
             before(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementModality();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ModalityAssignment_0"


    // $ANTLR start "rule__Statement__TypeAssignment_1"
    // InternalDSL.g:3009:1: rule__Statement__TypeAssignment_1 : ( ruleStatementType ) ;
    public final void rule__Statement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3013:1: ( ( ruleStatementType ) )
            // InternalDSL.g:3014:2: ( ruleStatementType )
            {
            // InternalDSL.g:3014:2: ( ruleStatementType )
            // InternalDSL.g:3015:3: ruleStatementType
            {
             before(grammarAccess.getStatementAccess().getTypeStatementTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementType();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getTypeStatementTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__TypeAssignment_1"


    // $ANTLR start "rule__StatementType__NameAssignment"
    // InternalDSL.g:3024:1: rule__StatementType__NameAssignment : ( ( 'FLOWS' ) ) ;
    public final void rule__StatementType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3028:1: ( ( ( 'FLOWS' ) ) )
            // InternalDSL.g:3029:2: ( ( 'FLOWS' ) )
            {
            // InternalDSL.g:3029:2: ( ( 'FLOWS' ) )
            // InternalDSL.g:3030:3: ( 'FLOWS' )
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            // InternalDSL.g:3031:3: ( 'FLOWS' )
            // InternalDSL.g:3032:4: 'FLOWS'
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 

            }

             after(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatementType__NameAssignment"


    // $ANTLR start "rule__StatementModality__NameAssignment"
    // InternalDSL.g:3043:1: rule__StatementModality__NameAssignment : ( ( 'NEVER' ) ) ;
    public final void rule__StatementModality__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3047:1: ( ( ( 'NEVER' ) ) )
            // InternalDSL.g:3048:2: ( ( 'NEVER' ) )
            {
            // InternalDSL.g:3048:2: ( ( 'NEVER' ) )
            // InternalDSL.g:3049:3: ( 'NEVER' )
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            // InternalDSL.g:3050:3: ( 'NEVER' )
            // InternalDSL.g:3051:4: 'NEVER'
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 

            }

             after(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatementModality__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000008E3002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020004020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}