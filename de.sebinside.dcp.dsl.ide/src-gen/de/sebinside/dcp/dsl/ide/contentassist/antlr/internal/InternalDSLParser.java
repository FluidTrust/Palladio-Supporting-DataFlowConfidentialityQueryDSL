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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<-'", "'datatype'", "'valueset'", "'['", "']'", "','", "'attribute'", "'property'", "'class'", "'{'", "'}'", "'.'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'!'", "'FLOWS'", "'NEVER'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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


    // $ANTLR start "entryRuleAssignementOperator"
    // InternalDSL.g:553:1: entryRuleAssignementOperator : ruleAssignementOperator EOF ;
    public final void entryRuleAssignementOperator() throws RecognitionException {
        try {
            // InternalDSL.g:554:1: ( ruleAssignementOperator EOF )
            // InternalDSL.g:555:1: ruleAssignementOperator EOF
            {
             before(grammarAccess.getAssignementOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignementOperator();

            state._fsp--;

             after(grammarAccess.getAssignementOperatorRule()); 
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
    // $ANTLR end "entryRuleAssignementOperator"


    // $ANTLR start "ruleAssignementOperator"
    // InternalDSL.g:562:1: ruleAssignementOperator : ( '<-' ) ;
    public final void ruleAssignementOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:566:2: ( ( '<-' ) )
            // InternalDSL.g:567:2: ( '<-' )
            {
            // InternalDSL.g:567:2: ( '<-' )
            // InternalDSL.g:568:3: '<-'
            {
             before(grammarAccess.getAssignementOperatorAccess().getLessThanSignHyphenMinusKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAssignementOperatorAccess().getLessThanSignHyphenMinusKeyword()); 

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
    // $ANTLR end "ruleAssignementOperator"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalDSL.g:577:1: rule__AbstractElement__Alternatives : ( ( ruleDataType ) | ( ruleValueSet ) | ( ruleCharacteristicsType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:581:1: ( ( ruleDataType ) | ( ruleValueSet ) | ( ruleCharacteristicsType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) )
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
                    // InternalDSL.g:582:2: ( ruleDataType )
                    {
                    // InternalDSL.g:582:2: ( ruleDataType )
                    // InternalDSL.g:583:3: ruleDataType
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
                    // InternalDSL.g:588:2: ( ruleValueSet )
                    {
                    // InternalDSL.g:588:2: ( ruleValueSet )
                    // InternalDSL.g:589:3: ruleValueSet
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
                    // InternalDSL.g:594:2: ( ruleCharacteristicsType )
                    {
                    // InternalDSL.g:594:2: ( ruleCharacteristicsType )
                    // InternalDSL.g:595:3: ruleCharacteristicsType
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
                    // InternalDSL.g:600:2: ( ruleCharacteristicClass )
                    {
                    // InternalDSL.g:600:2: ( ruleCharacteristicClass )
                    // InternalDSL.g:601:3: ruleCharacteristicClass
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
                    // InternalDSL.g:606:2: ( ruleConstraint )
                    {
                    // InternalDSL.g:606:2: ( ruleConstraint )
                    // InternalDSL.g:607:3: ruleConstraint
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
    // InternalDSL.g:616:1: rule__CharacteristicsType__Alternatives : ( ( ruleAttributeType ) | ( rulePropertyType ) );
    public final void rule__CharacteristicsType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:620:1: ( ( ruleAttributeType ) | ( rulePropertyType ) )
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
                    // InternalDSL.g:621:2: ( ruleAttributeType )
                    {
                    // InternalDSL.g:621:2: ( ruleAttributeType )
                    // InternalDSL.g:622:3: ruleAttributeType
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
                    // InternalDSL.g:627:2: ( rulePropertyType )
                    {
                    // InternalDSL.g:627:2: ( rulePropertyType )
                    // InternalDSL.g:628:3: rulePropertyType
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
    // InternalDSL.g:637:1: rule__CharacteristicSelector__Alternatives_2 : ( ( ( rule__CharacteristicSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicSelector__Group_2_1__0 ) ) );
    public final void rule__CharacteristicSelector__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:641:1: ( ( ( rule__CharacteristicSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicSelector__Group_2_1__0 ) ) )
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
                    // InternalDSL.g:642:2: ( ( rule__CharacteristicSelector__Group_2_0__0 ) )
                    {
                    // InternalDSL.g:642:2: ( ( rule__CharacteristicSelector__Group_2_0__0 ) )
                    // InternalDSL.g:643:3: ( rule__CharacteristicSelector__Group_2_0__0 )
                    {
                     before(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_0()); 
                    // InternalDSL.g:644:3: ( rule__CharacteristicSelector__Group_2_0__0 )
                    // InternalDSL.g:644:4: rule__CharacteristicSelector__Group_2_0__0
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
                    // InternalDSL.g:648:2: ( ( rule__CharacteristicSelector__Group_2_1__0 ) )
                    {
                    // InternalDSL.g:648:2: ( ( rule__CharacteristicSelector__Group_2_1__0 ) )
                    // InternalDSL.g:649:3: ( rule__CharacteristicSelector__Group_2_1__0 )
                    {
                     before(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_1()); 
                    // InternalDSL.g:650:3: ( rule__CharacteristicSelector__Group_2_1__0 )
                    // InternalDSL.g:650:4: rule__CharacteristicSelector__Group_2_1__0
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
    // InternalDSL.g:658:1: rule__CharacteristicSelector__Alternatives_2_1_2 : ( ( ( rule__CharacteristicSelector__Group_2_1_2_0__0 )* ) | ( ( rule__CharacteristicSelector__Group_2_1_2_1__0 )* ) );
    public final void rule__CharacteristicSelector__Alternatives_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:662:1: ( ( ( rule__CharacteristicSelector__Group_2_1_2_0__0 )* ) | ( ( rule__CharacteristicSelector__Group_2_1_2_1__0 )* ) )
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
                    // InternalDSL.g:663:2: ( ( rule__CharacteristicSelector__Group_2_1_2_0__0 )* )
                    {
                    // InternalDSL.g:663:2: ( ( rule__CharacteristicSelector__Group_2_1_2_0__0 )* )
                    // InternalDSL.g:664:3: ( rule__CharacteristicSelector__Group_2_1_2_0__0 )*
                    {
                     before(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_1_2_0()); 
                    // InternalDSL.g:665:3: ( rule__CharacteristicSelector__Group_2_1_2_0__0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDSL.g:665:4: rule__CharacteristicSelector__Group_2_1_2_0__0
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
                    // InternalDSL.g:669:2: ( ( rule__CharacteristicSelector__Group_2_1_2_1__0 )* )
                    {
                    // InternalDSL.g:669:2: ( ( rule__CharacteristicSelector__Group_2_1_2_1__0 )* )
                    // InternalDSL.g:670:3: ( rule__CharacteristicSelector__Group_2_1_2_1__0 )*
                    {
                     before(grammarAccess.getCharacteristicSelectorAccess().getGroup_2_1_2_1()); 
                    // InternalDSL.g:671:3: ( rule__CharacteristicSelector__Group_2_1_2_1__0 )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDSL.g:671:4: rule__CharacteristicSelector__Group_2_1_2_1__0
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
    // InternalDSL.g:679:1: rule__DataSelector__Alternatives : ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) );
    public final void rule__DataSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:683:1: ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) )
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
                    // InternalDSL.g:684:2: ( ruleAttributeSelector )
                    {
                    // InternalDSL.g:684:2: ( ruleAttributeSelector )
                    // InternalDSL.g:685:3: ruleAttributeSelector
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
                    // InternalDSL.g:690:2: ( ruleAttributeClassSelector )
                    {
                    // InternalDSL.g:690:2: ( ruleAttributeClassSelector )
                    // InternalDSL.g:691:3: ruleAttributeClassSelector
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
    // InternalDSL.g:700:1: rule__DestinationSelector__Alternatives : ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) );
    public final void rule__DestinationSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:704:1: ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) )
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
                    // InternalDSL.g:705:2: ( rulePropertySelector )
                    {
                    // InternalDSL.g:705:2: ( rulePropertySelector )
                    // InternalDSL.g:706:3: rulePropertySelector
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
                    // InternalDSL.g:711:2: ( rulePropertyClassSelector )
                    {
                    // InternalDSL.g:711:2: ( rulePropertyClassSelector )
                    // InternalDSL.g:712:3: rulePropertyClassSelector
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
    // InternalDSL.g:721:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:725:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDSL.g:726:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalDSL.g:733:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:737:1: ( ( 'datatype' ) )
            // InternalDSL.g:738:1: ( 'datatype' )
            {
            // InternalDSL.g:738:1: ( 'datatype' )
            // InternalDSL.g:739:2: 'datatype'
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
    // InternalDSL.g:748:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:752:1: ( rule__DataType__Group__1__Impl )
            // InternalDSL.g:753:2: rule__DataType__Group__1__Impl
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
    // InternalDSL.g:759:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:763:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalDSL.g:764:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalDSL.g:764:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalDSL.g:765:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:766:2: ( rule__DataType__NameAssignment_1 )
            // InternalDSL.g:766:3: rule__DataType__NameAssignment_1
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
    // InternalDSL.g:775:1: rule__ValueSet__Group__0 : rule__ValueSet__Group__0__Impl rule__ValueSet__Group__1 ;
    public final void rule__ValueSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:779:1: ( rule__ValueSet__Group__0__Impl rule__ValueSet__Group__1 )
            // InternalDSL.g:780:2: rule__ValueSet__Group__0__Impl rule__ValueSet__Group__1
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
    // InternalDSL.g:787:1: rule__ValueSet__Group__0__Impl : ( 'valueset' ) ;
    public final void rule__ValueSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:791:1: ( ( 'valueset' ) )
            // InternalDSL.g:792:1: ( 'valueset' )
            {
            // InternalDSL.g:792:1: ( 'valueset' )
            // InternalDSL.g:793:2: 'valueset'
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
    // InternalDSL.g:802:1: rule__ValueSet__Group__1 : rule__ValueSet__Group__1__Impl rule__ValueSet__Group__2 ;
    public final void rule__ValueSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:806:1: ( rule__ValueSet__Group__1__Impl rule__ValueSet__Group__2 )
            // InternalDSL.g:807:2: rule__ValueSet__Group__1__Impl rule__ValueSet__Group__2
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
    // InternalDSL.g:814:1: rule__ValueSet__Group__1__Impl : ( ( rule__ValueSet__NameAssignment_1 ) ) ;
    public final void rule__ValueSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:818:1: ( ( ( rule__ValueSet__NameAssignment_1 ) ) )
            // InternalDSL.g:819:1: ( ( rule__ValueSet__NameAssignment_1 ) )
            {
            // InternalDSL.g:819:1: ( ( rule__ValueSet__NameAssignment_1 ) )
            // InternalDSL.g:820:2: ( rule__ValueSet__NameAssignment_1 )
            {
             before(grammarAccess.getValueSetAccess().getNameAssignment_1()); 
            // InternalDSL.g:821:2: ( rule__ValueSet__NameAssignment_1 )
            // InternalDSL.g:821:3: rule__ValueSet__NameAssignment_1
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
    // InternalDSL.g:829:1: rule__ValueSet__Group__2 : rule__ValueSet__Group__2__Impl rule__ValueSet__Group__3 ;
    public final void rule__ValueSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:833:1: ( rule__ValueSet__Group__2__Impl rule__ValueSet__Group__3 )
            // InternalDSL.g:834:2: rule__ValueSet__Group__2__Impl rule__ValueSet__Group__3
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
    // InternalDSL.g:841:1: rule__ValueSet__Group__2__Impl : ( ruleAssignementOperator ) ;
    public final void rule__ValueSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:845:1: ( ( ruleAssignementOperator ) )
            // InternalDSL.g:846:1: ( ruleAssignementOperator )
            {
            // InternalDSL.g:846:1: ( ruleAssignementOperator )
            // InternalDSL.g:847:2: ruleAssignementOperator
            {
             before(grammarAccess.getValueSetAccess().getAssignementOperatorParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAssignementOperator();

            state._fsp--;

             after(grammarAccess.getValueSetAccess().getAssignementOperatorParserRuleCall_2()); 

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
    // InternalDSL.g:856:1: rule__ValueSet__Group__3 : rule__ValueSet__Group__3__Impl rule__ValueSet__Group__4 ;
    public final void rule__ValueSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:860:1: ( rule__ValueSet__Group__3__Impl rule__ValueSet__Group__4 )
            // InternalDSL.g:861:2: rule__ValueSet__Group__3__Impl rule__ValueSet__Group__4
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
    // InternalDSL.g:868:1: rule__ValueSet__Group__3__Impl : ( '[' ) ;
    public final void rule__ValueSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:872:1: ( ( '[' ) )
            // InternalDSL.g:873:1: ( '[' )
            {
            // InternalDSL.g:873:1: ( '[' )
            // InternalDSL.g:874:2: '['
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
    // InternalDSL.g:883:1: rule__ValueSet__Group__4 : rule__ValueSet__Group__4__Impl rule__ValueSet__Group__5 ;
    public final void rule__ValueSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:887:1: ( rule__ValueSet__Group__4__Impl rule__ValueSet__Group__5 )
            // InternalDSL.g:888:2: rule__ValueSet__Group__4__Impl rule__ValueSet__Group__5
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
    // InternalDSL.g:895:1: rule__ValueSet__Group__4__Impl : ( ( rule__ValueSet__MembersAssignment_4 ) ) ;
    public final void rule__ValueSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:899:1: ( ( ( rule__ValueSet__MembersAssignment_4 ) ) )
            // InternalDSL.g:900:1: ( ( rule__ValueSet__MembersAssignment_4 ) )
            {
            // InternalDSL.g:900:1: ( ( rule__ValueSet__MembersAssignment_4 ) )
            // InternalDSL.g:901:2: ( rule__ValueSet__MembersAssignment_4 )
            {
             before(grammarAccess.getValueSetAccess().getMembersAssignment_4()); 
            // InternalDSL.g:902:2: ( rule__ValueSet__MembersAssignment_4 )
            // InternalDSL.g:902:3: rule__ValueSet__MembersAssignment_4
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
    // InternalDSL.g:910:1: rule__ValueSet__Group__5 : rule__ValueSet__Group__5__Impl rule__ValueSet__Group__6 ;
    public final void rule__ValueSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:914:1: ( rule__ValueSet__Group__5__Impl rule__ValueSet__Group__6 )
            // InternalDSL.g:915:2: rule__ValueSet__Group__5__Impl rule__ValueSet__Group__6
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
    // InternalDSL.g:922:1: rule__ValueSet__Group__5__Impl : ( ( rule__ValueSet__Group_5__0 )* ) ;
    public final void rule__ValueSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:926:1: ( ( ( rule__ValueSet__Group_5__0 )* ) )
            // InternalDSL.g:927:1: ( ( rule__ValueSet__Group_5__0 )* )
            {
            // InternalDSL.g:927:1: ( ( rule__ValueSet__Group_5__0 )* )
            // InternalDSL.g:928:2: ( rule__ValueSet__Group_5__0 )*
            {
             before(grammarAccess.getValueSetAccess().getGroup_5()); 
            // InternalDSL.g:929:2: ( rule__ValueSet__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:929:3: rule__ValueSet__Group_5__0
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
    // InternalDSL.g:937:1: rule__ValueSet__Group__6 : rule__ValueSet__Group__6__Impl ;
    public final void rule__ValueSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:941:1: ( rule__ValueSet__Group__6__Impl )
            // InternalDSL.g:942:2: rule__ValueSet__Group__6__Impl
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
    // InternalDSL.g:948:1: rule__ValueSet__Group__6__Impl : ( ']' ) ;
    public final void rule__ValueSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:952:1: ( ( ']' ) )
            // InternalDSL.g:953:1: ( ']' )
            {
            // InternalDSL.g:953:1: ( ']' )
            // InternalDSL.g:954:2: ']'
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
    // InternalDSL.g:964:1: rule__ValueSet__Group_5__0 : rule__ValueSet__Group_5__0__Impl rule__ValueSet__Group_5__1 ;
    public final void rule__ValueSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:968:1: ( rule__ValueSet__Group_5__0__Impl rule__ValueSet__Group_5__1 )
            // InternalDSL.g:969:2: rule__ValueSet__Group_5__0__Impl rule__ValueSet__Group_5__1
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
    // InternalDSL.g:976:1: rule__ValueSet__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ValueSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:980:1: ( ( ',' ) )
            // InternalDSL.g:981:1: ( ',' )
            {
            // InternalDSL.g:981:1: ( ',' )
            // InternalDSL.g:982:2: ','
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
    // InternalDSL.g:991:1: rule__ValueSet__Group_5__1 : rule__ValueSet__Group_5__1__Impl ;
    public final void rule__ValueSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:995:1: ( rule__ValueSet__Group_5__1__Impl )
            // InternalDSL.g:996:2: rule__ValueSet__Group_5__1__Impl
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
    // InternalDSL.g:1002:1: rule__ValueSet__Group_5__1__Impl : ( ( rule__ValueSet__MembersAssignment_5_1 ) ) ;
    public final void rule__ValueSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1006:1: ( ( ( rule__ValueSet__MembersAssignment_5_1 ) ) )
            // InternalDSL.g:1007:1: ( ( rule__ValueSet__MembersAssignment_5_1 ) )
            {
            // InternalDSL.g:1007:1: ( ( rule__ValueSet__MembersAssignment_5_1 ) )
            // InternalDSL.g:1008:2: ( rule__ValueSet__MembersAssignment_5_1 )
            {
             before(grammarAccess.getValueSetAccess().getMembersAssignment_5_1()); 
            // InternalDSL.g:1009:2: ( rule__ValueSet__MembersAssignment_5_1 )
            // InternalDSL.g:1009:3: rule__ValueSet__MembersAssignment_5_1
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
    // InternalDSL.g:1018:1: rule__AttributeType__Group__0 : rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 ;
    public final void rule__AttributeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1022:1: ( rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 )
            // InternalDSL.g:1023:2: rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1
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
    // InternalDSL.g:1030:1: rule__AttributeType__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AttributeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1034:1: ( ( 'attribute' ) )
            // InternalDSL.g:1035:1: ( 'attribute' )
            {
            // InternalDSL.g:1035:1: ( 'attribute' )
            // InternalDSL.g:1036:2: 'attribute'
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
    // InternalDSL.g:1045:1: rule__AttributeType__Group__1 : rule__AttributeType__Group__1__Impl rule__AttributeType__Group__2 ;
    public final void rule__AttributeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1049:1: ( rule__AttributeType__Group__1__Impl rule__AttributeType__Group__2 )
            // InternalDSL.g:1050:2: rule__AttributeType__Group__1__Impl rule__AttributeType__Group__2
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
    // InternalDSL.g:1057:1: rule__AttributeType__Group__1__Impl : ( ( rule__AttributeType__NameAssignment_1 ) ) ;
    public final void rule__AttributeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1061:1: ( ( ( rule__AttributeType__NameAssignment_1 ) ) )
            // InternalDSL.g:1062:1: ( ( rule__AttributeType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1062:1: ( ( rule__AttributeType__NameAssignment_1 ) )
            // InternalDSL.g:1063:2: ( rule__AttributeType__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1064:2: ( rule__AttributeType__NameAssignment_1 )
            // InternalDSL.g:1064:3: rule__AttributeType__NameAssignment_1
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
    // InternalDSL.g:1072:1: rule__AttributeType__Group__2 : rule__AttributeType__Group__2__Impl rule__AttributeType__Group__3 ;
    public final void rule__AttributeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1076:1: ( rule__AttributeType__Group__2__Impl rule__AttributeType__Group__3 )
            // InternalDSL.g:1077:2: rule__AttributeType__Group__2__Impl rule__AttributeType__Group__3
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
    // InternalDSL.g:1084:1: rule__AttributeType__Group__2__Impl : ( ruleAssignementOperator ) ;
    public final void rule__AttributeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1088:1: ( ( ruleAssignementOperator ) )
            // InternalDSL.g:1089:1: ( ruleAssignementOperator )
            {
            // InternalDSL.g:1089:1: ( ruleAssignementOperator )
            // InternalDSL.g:1090:2: ruleAssignementOperator
            {
             before(grammarAccess.getAttributeTypeAccess().getAssignementOperatorParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAssignementOperator();

            state._fsp--;

             after(grammarAccess.getAttributeTypeAccess().getAssignementOperatorParserRuleCall_2()); 

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
    // InternalDSL.g:1099:1: rule__AttributeType__Group__3 : rule__AttributeType__Group__3__Impl ;
    public final void rule__AttributeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1103:1: ( rule__AttributeType__Group__3__Impl )
            // InternalDSL.g:1104:2: rule__AttributeType__Group__3__Impl
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
    // InternalDSL.g:1110:1: rule__AttributeType__Group__3__Impl : ( ( rule__AttributeType__ValuesetAssignment_3 ) ) ;
    public final void rule__AttributeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1114:1: ( ( ( rule__AttributeType__ValuesetAssignment_3 ) ) )
            // InternalDSL.g:1115:1: ( ( rule__AttributeType__ValuesetAssignment_3 ) )
            {
            // InternalDSL.g:1115:1: ( ( rule__AttributeType__ValuesetAssignment_3 ) )
            // InternalDSL.g:1116:2: ( rule__AttributeType__ValuesetAssignment_3 )
            {
             before(grammarAccess.getAttributeTypeAccess().getValuesetAssignment_3()); 
            // InternalDSL.g:1117:2: ( rule__AttributeType__ValuesetAssignment_3 )
            // InternalDSL.g:1117:3: rule__AttributeType__ValuesetAssignment_3
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
    // InternalDSL.g:1126:1: rule__PropertyType__Group__0 : rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1 ;
    public final void rule__PropertyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1130:1: ( rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1 )
            // InternalDSL.g:1131:2: rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1
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
    // InternalDSL.g:1138:1: rule__PropertyType__Group__0__Impl : ( 'property' ) ;
    public final void rule__PropertyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1142:1: ( ( 'property' ) )
            // InternalDSL.g:1143:1: ( 'property' )
            {
            // InternalDSL.g:1143:1: ( 'property' )
            // InternalDSL.g:1144:2: 'property'
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
    // InternalDSL.g:1153:1: rule__PropertyType__Group__1 : rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2 ;
    public final void rule__PropertyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1157:1: ( rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2 )
            // InternalDSL.g:1158:2: rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2
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
    // InternalDSL.g:1165:1: rule__PropertyType__Group__1__Impl : ( ( rule__PropertyType__NameAssignment_1 ) ) ;
    public final void rule__PropertyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1169:1: ( ( ( rule__PropertyType__NameAssignment_1 ) ) )
            // InternalDSL.g:1170:1: ( ( rule__PropertyType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1170:1: ( ( rule__PropertyType__NameAssignment_1 ) )
            // InternalDSL.g:1171:2: ( rule__PropertyType__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1172:2: ( rule__PropertyType__NameAssignment_1 )
            // InternalDSL.g:1172:3: rule__PropertyType__NameAssignment_1
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
    // InternalDSL.g:1180:1: rule__PropertyType__Group__2 : rule__PropertyType__Group__2__Impl rule__PropertyType__Group__3 ;
    public final void rule__PropertyType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1184:1: ( rule__PropertyType__Group__2__Impl rule__PropertyType__Group__3 )
            // InternalDSL.g:1185:2: rule__PropertyType__Group__2__Impl rule__PropertyType__Group__3
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
    // InternalDSL.g:1192:1: rule__PropertyType__Group__2__Impl : ( ruleAssignementOperator ) ;
    public final void rule__PropertyType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1196:1: ( ( ruleAssignementOperator ) )
            // InternalDSL.g:1197:1: ( ruleAssignementOperator )
            {
            // InternalDSL.g:1197:1: ( ruleAssignementOperator )
            // InternalDSL.g:1198:2: ruleAssignementOperator
            {
             before(grammarAccess.getPropertyTypeAccess().getAssignementOperatorParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAssignementOperator();

            state._fsp--;

             after(grammarAccess.getPropertyTypeAccess().getAssignementOperatorParserRuleCall_2()); 

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
    // InternalDSL.g:1207:1: rule__PropertyType__Group__3 : rule__PropertyType__Group__3__Impl ;
    public final void rule__PropertyType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1211:1: ( rule__PropertyType__Group__3__Impl )
            // InternalDSL.g:1212:2: rule__PropertyType__Group__3__Impl
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
    // InternalDSL.g:1218:1: rule__PropertyType__Group__3__Impl : ( ( rule__PropertyType__ValuesetAssignment_3 ) ) ;
    public final void rule__PropertyType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1222:1: ( ( ( rule__PropertyType__ValuesetAssignment_3 ) ) )
            // InternalDSL.g:1223:1: ( ( rule__PropertyType__ValuesetAssignment_3 ) )
            {
            // InternalDSL.g:1223:1: ( ( rule__PropertyType__ValuesetAssignment_3 ) )
            // InternalDSL.g:1224:2: ( rule__PropertyType__ValuesetAssignment_3 )
            {
             before(grammarAccess.getPropertyTypeAccess().getValuesetAssignment_3()); 
            // InternalDSL.g:1225:2: ( rule__PropertyType__ValuesetAssignment_3 )
            // InternalDSL.g:1225:3: rule__PropertyType__ValuesetAssignment_3
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
    // InternalDSL.g:1234:1: rule__CharacteristicClass__Group__0 : rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 ;
    public final void rule__CharacteristicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1238:1: ( rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 )
            // InternalDSL.g:1239:2: rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1
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
    // InternalDSL.g:1246:1: rule__CharacteristicClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__CharacteristicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1250:1: ( ( 'class' ) )
            // InternalDSL.g:1251:1: ( 'class' )
            {
            // InternalDSL.g:1251:1: ( 'class' )
            // InternalDSL.g:1252:2: 'class'
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
    // InternalDSL.g:1261:1: rule__CharacteristicClass__Group__1 : rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 ;
    public final void rule__CharacteristicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1265:1: ( rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 )
            // InternalDSL.g:1266:2: rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2
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
    // InternalDSL.g:1273:1: rule__CharacteristicClass__Group__1__Impl : ( ( rule__CharacteristicClass__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1277:1: ( ( ( rule__CharacteristicClass__NameAssignment_1 ) ) )
            // InternalDSL.g:1278:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            {
            // InternalDSL.g:1278:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            // InternalDSL.g:1279:2: ( rule__CharacteristicClass__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 
            // InternalDSL.g:1280:2: ( rule__CharacteristicClass__NameAssignment_1 )
            // InternalDSL.g:1280:3: rule__CharacteristicClass__NameAssignment_1
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
    // InternalDSL.g:1288:1: rule__CharacteristicClass__Group__2 : rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 ;
    public final void rule__CharacteristicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1292:1: ( rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 )
            // InternalDSL.g:1293:2: rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3
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
    // InternalDSL.g:1300:1: rule__CharacteristicClass__Group__2__Impl : ( '{' ) ;
    public final void rule__CharacteristicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1304:1: ( ( '{' ) )
            // InternalDSL.g:1305:1: ( '{' )
            {
            // InternalDSL.g:1305:1: ( '{' )
            // InternalDSL.g:1306:2: '{'
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
    // InternalDSL.g:1315:1: rule__CharacteristicClass__Group__3 : rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 ;
    public final void rule__CharacteristicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1319:1: ( rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 )
            // InternalDSL.g:1320:2: rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4
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
    // InternalDSL.g:1327:1: rule__CharacteristicClass__Group__3__Impl : ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) ;
    public final void rule__CharacteristicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1331:1: ( ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) )
            // InternalDSL.g:1332:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            {
            // InternalDSL.g:1332:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            // InternalDSL.g:1333:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 
            // InternalDSL.g:1334:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            // InternalDSL.g:1334:3: rule__CharacteristicClass__MembersAssignment_3
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
    // InternalDSL.g:1342:1: rule__CharacteristicClass__Group__4 : rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 ;
    public final void rule__CharacteristicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1346:1: ( rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 )
            // InternalDSL.g:1347:2: rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5
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
    // InternalDSL.g:1354:1: rule__CharacteristicClass__Group__4__Impl : ( ( rule__CharacteristicClass__Group_4__0 )* ) ;
    public final void rule__CharacteristicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1358:1: ( ( ( rule__CharacteristicClass__Group_4__0 )* ) )
            // InternalDSL.g:1359:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            {
            // InternalDSL.g:1359:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            // InternalDSL.g:1360:2: ( rule__CharacteristicClass__Group_4__0 )*
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 
            // InternalDSL.g:1361:2: ( rule__CharacteristicClass__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:1361:3: rule__CharacteristicClass__Group_4__0
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
    // InternalDSL.g:1369:1: rule__CharacteristicClass__Group__5 : rule__CharacteristicClass__Group__5__Impl ;
    public final void rule__CharacteristicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1373:1: ( rule__CharacteristicClass__Group__5__Impl )
            // InternalDSL.g:1374:2: rule__CharacteristicClass__Group__5__Impl
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
    // InternalDSL.g:1380:1: rule__CharacteristicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__CharacteristicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1384:1: ( ( '}' ) )
            // InternalDSL.g:1385:1: ( '}' )
            {
            // InternalDSL.g:1385:1: ( '}' )
            // InternalDSL.g:1386:2: '}'
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
    // InternalDSL.g:1396:1: rule__CharacteristicClass__Group_4__0 : rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 ;
    public final void rule__CharacteristicClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1400:1: ( rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 )
            // InternalDSL.g:1401:2: rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1
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
    // InternalDSL.g:1408:1: rule__CharacteristicClass__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1412:1: ( ( ',' ) )
            // InternalDSL.g:1413:1: ( ',' )
            {
            // InternalDSL.g:1413:1: ( ',' )
            // InternalDSL.g:1414:2: ','
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
    // InternalDSL.g:1423:1: rule__CharacteristicClass__Group_4__1 : rule__CharacteristicClass__Group_4__1__Impl ;
    public final void rule__CharacteristicClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1427:1: ( rule__CharacteristicClass__Group_4__1__Impl )
            // InternalDSL.g:1428:2: rule__CharacteristicClass__Group_4__1__Impl
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
    // InternalDSL.g:1434:1: rule__CharacteristicClass__Group_4__1__Impl : ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) ;
    public final void rule__CharacteristicClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1438:1: ( ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) )
            // InternalDSL.g:1439:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            {
            // InternalDSL.g:1439:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            // InternalDSL.g:1440:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 
            // InternalDSL.g:1441:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            // InternalDSL.g:1441:3: rule__CharacteristicClass__MembersAssignment_4_1
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
    // InternalDSL.g:1450:1: rule__CharacteristicSelector__Group__0 : rule__CharacteristicSelector__Group__0__Impl rule__CharacteristicSelector__Group__1 ;
    public final void rule__CharacteristicSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1454:1: ( rule__CharacteristicSelector__Group__0__Impl rule__CharacteristicSelector__Group__1 )
            // InternalDSL.g:1455:2: rule__CharacteristicSelector__Group__0__Impl rule__CharacteristicSelector__Group__1
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
    // InternalDSL.g:1462:1: rule__CharacteristicSelector__Group__0__Impl : ( ( rule__CharacteristicSelector__RefAssignment_0 ) ) ;
    public final void rule__CharacteristicSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1466:1: ( ( ( rule__CharacteristicSelector__RefAssignment_0 ) ) )
            // InternalDSL.g:1467:1: ( ( rule__CharacteristicSelector__RefAssignment_0 ) )
            {
            // InternalDSL.g:1467:1: ( ( rule__CharacteristicSelector__RefAssignment_0 ) )
            // InternalDSL.g:1468:2: ( rule__CharacteristicSelector__RefAssignment_0 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getRefAssignment_0()); 
            // InternalDSL.g:1469:2: ( rule__CharacteristicSelector__RefAssignment_0 )
            // InternalDSL.g:1469:3: rule__CharacteristicSelector__RefAssignment_0
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
    // InternalDSL.g:1477:1: rule__CharacteristicSelector__Group__1 : rule__CharacteristicSelector__Group__1__Impl rule__CharacteristicSelector__Group__2 ;
    public final void rule__CharacteristicSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1481:1: ( rule__CharacteristicSelector__Group__1__Impl rule__CharacteristicSelector__Group__2 )
            // InternalDSL.g:1482:2: rule__CharacteristicSelector__Group__1__Impl rule__CharacteristicSelector__Group__2
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
    // InternalDSL.g:1489:1: rule__CharacteristicSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__CharacteristicSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1493:1: ( ( '.' ) )
            // InternalDSL.g:1494:1: ( '.' )
            {
            // InternalDSL.g:1494:1: ( '.' )
            // InternalDSL.g:1495:2: '.'
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
    // InternalDSL.g:1504:1: rule__CharacteristicSelector__Group__2 : rule__CharacteristicSelector__Group__2__Impl ;
    public final void rule__CharacteristicSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1508:1: ( rule__CharacteristicSelector__Group__2__Impl )
            // InternalDSL.g:1509:2: rule__CharacteristicSelector__Group__2__Impl
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
    // InternalDSL.g:1515:1: rule__CharacteristicSelector__Group__2__Impl : ( ( rule__CharacteristicSelector__Alternatives_2 ) ) ;
    public final void rule__CharacteristicSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1519:1: ( ( ( rule__CharacteristicSelector__Alternatives_2 ) ) )
            // InternalDSL.g:1520:1: ( ( rule__CharacteristicSelector__Alternatives_2 ) )
            {
            // InternalDSL.g:1520:1: ( ( rule__CharacteristicSelector__Alternatives_2 ) )
            // InternalDSL.g:1521:2: ( rule__CharacteristicSelector__Alternatives_2 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getAlternatives_2()); 
            // InternalDSL.g:1522:2: ( rule__CharacteristicSelector__Alternatives_2 )
            // InternalDSL.g:1522:3: rule__CharacteristicSelector__Alternatives_2
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
    // InternalDSL.g:1531:1: rule__CharacteristicSelector__Group_2_0__0 : rule__CharacteristicSelector__Group_2_0__0__Impl rule__CharacteristicSelector__Group_2_0__1 ;
    public final void rule__CharacteristicSelector__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1535:1: ( rule__CharacteristicSelector__Group_2_0__0__Impl rule__CharacteristicSelector__Group_2_0__1 )
            // InternalDSL.g:1536:2: rule__CharacteristicSelector__Group_2_0__0__Impl rule__CharacteristicSelector__Group_2_0__1
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
    // InternalDSL.g:1543:1: rule__CharacteristicSelector__Group_2_0__0__Impl : ( ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )? ) ;
    public final void rule__CharacteristicSelector__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1547:1: ( ( ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )? ) )
            // InternalDSL.g:1548:1: ( ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )? )
            {
            // InternalDSL.g:1548:1: ( ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )? )
            // InternalDSL.g:1549:2: ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )?
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getNegatedAssignment_2_0_0()); 
            // InternalDSL.g:1550:2: ( rule__CharacteristicSelector__NegatedAssignment_2_0_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1550:3: rule__CharacteristicSelector__NegatedAssignment_2_0_0
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
    // InternalDSL.g:1558:1: rule__CharacteristicSelector__Group_2_0__1 : rule__CharacteristicSelector__Group_2_0__1__Impl ;
    public final void rule__CharacteristicSelector__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1562:1: ( rule__CharacteristicSelector__Group_2_0__1__Impl )
            // InternalDSL.g:1563:2: rule__CharacteristicSelector__Group_2_0__1__Impl
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
    // InternalDSL.g:1569:1: rule__CharacteristicSelector__Group_2_0__1__Impl : ( ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1573:1: ( ( ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 ) ) )
            // InternalDSL.g:1574:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 ) )
            {
            // InternalDSL.g:1574:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 ) )
            // InternalDSL.g:1575:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_0_1()); 
            // InternalDSL.g:1576:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_0_1 )
            // InternalDSL.g:1576:3: rule__CharacteristicSelector__LiteralsAssignment_2_0_1
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
    // InternalDSL.g:1585:1: rule__CharacteristicSelector__Group_2_1__0 : rule__CharacteristicSelector__Group_2_1__0__Impl rule__CharacteristicSelector__Group_2_1__1 ;
    public final void rule__CharacteristicSelector__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1589:1: ( rule__CharacteristicSelector__Group_2_1__0__Impl rule__CharacteristicSelector__Group_2_1__1 )
            // InternalDSL.g:1590:2: rule__CharacteristicSelector__Group_2_1__0__Impl rule__CharacteristicSelector__Group_2_1__1
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
    // InternalDSL.g:1597:1: rule__CharacteristicSelector__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__CharacteristicSelector__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1601:1: ( ( '[' ) )
            // InternalDSL.g:1602:1: ( '[' )
            {
            // InternalDSL.g:1602:1: ( '[' )
            // InternalDSL.g:1603:2: '['
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
    // InternalDSL.g:1612:1: rule__CharacteristicSelector__Group_2_1__1 : rule__CharacteristicSelector__Group_2_1__1__Impl rule__CharacteristicSelector__Group_2_1__2 ;
    public final void rule__CharacteristicSelector__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1616:1: ( rule__CharacteristicSelector__Group_2_1__1__Impl rule__CharacteristicSelector__Group_2_1__2 )
            // InternalDSL.g:1617:2: rule__CharacteristicSelector__Group_2_1__1__Impl rule__CharacteristicSelector__Group_2_1__2
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
    // InternalDSL.g:1624:1: rule__CharacteristicSelector__Group_2_1__1__Impl : ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1628:1: ( ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 ) ) )
            // InternalDSL.g:1629:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 ) )
            {
            // InternalDSL.g:1629:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 ) )
            // InternalDSL.g:1630:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_1_1()); 
            // InternalDSL.g:1631:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_1 )
            // InternalDSL.g:1631:3: rule__CharacteristicSelector__LiteralsAssignment_2_1_1
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
    // InternalDSL.g:1639:1: rule__CharacteristicSelector__Group_2_1__2 : rule__CharacteristicSelector__Group_2_1__2__Impl rule__CharacteristicSelector__Group_2_1__3 ;
    public final void rule__CharacteristicSelector__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1643:1: ( rule__CharacteristicSelector__Group_2_1__2__Impl rule__CharacteristicSelector__Group_2_1__3 )
            // InternalDSL.g:1644:2: rule__CharacteristicSelector__Group_2_1__2__Impl rule__CharacteristicSelector__Group_2_1__3
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
    // InternalDSL.g:1651:1: rule__CharacteristicSelector__Group_2_1__2__Impl : ( ( rule__CharacteristicSelector__Alternatives_2_1_2 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1655:1: ( ( ( rule__CharacteristicSelector__Alternatives_2_1_2 ) ) )
            // InternalDSL.g:1656:1: ( ( rule__CharacteristicSelector__Alternatives_2_1_2 ) )
            {
            // InternalDSL.g:1656:1: ( ( rule__CharacteristicSelector__Alternatives_2_1_2 ) )
            // InternalDSL.g:1657:2: ( rule__CharacteristicSelector__Alternatives_2_1_2 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getAlternatives_2_1_2()); 
            // InternalDSL.g:1658:2: ( rule__CharacteristicSelector__Alternatives_2_1_2 )
            // InternalDSL.g:1658:3: rule__CharacteristicSelector__Alternatives_2_1_2
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
    // InternalDSL.g:1666:1: rule__CharacteristicSelector__Group_2_1__3 : rule__CharacteristicSelector__Group_2_1__3__Impl ;
    public final void rule__CharacteristicSelector__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1670:1: ( rule__CharacteristicSelector__Group_2_1__3__Impl )
            // InternalDSL.g:1671:2: rule__CharacteristicSelector__Group_2_1__3__Impl
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
    // InternalDSL.g:1677:1: rule__CharacteristicSelector__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__CharacteristicSelector__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1681:1: ( ( ']' ) )
            // InternalDSL.g:1682:1: ( ']' )
            {
            // InternalDSL.g:1682:1: ( ']' )
            // InternalDSL.g:1683:2: ']'
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
    // InternalDSL.g:1693:1: rule__CharacteristicSelector__Group_2_1_2_0__0 : rule__CharacteristicSelector__Group_2_1_2_0__0__Impl rule__CharacteristicSelector__Group_2_1_2_0__1 ;
    public final void rule__CharacteristicSelector__Group_2_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1697:1: ( rule__CharacteristicSelector__Group_2_1_2_0__0__Impl rule__CharacteristicSelector__Group_2_1_2_0__1 )
            // InternalDSL.g:1698:2: rule__CharacteristicSelector__Group_2_1_2_0__0__Impl rule__CharacteristicSelector__Group_2_1_2_0__1
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
    // InternalDSL.g:1705:1: rule__CharacteristicSelector__Group_2_1_2_0__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicSelector__Group_2_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1709:1: ( ( ',' ) )
            // InternalDSL.g:1710:1: ( ',' )
            {
            // InternalDSL.g:1710:1: ( ',' )
            // InternalDSL.g:1711:2: ','
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
    // InternalDSL.g:1720:1: rule__CharacteristicSelector__Group_2_1_2_0__1 : rule__CharacteristicSelector__Group_2_1_2_0__1__Impl ;
    public final void rule__CharacteristicSelector__Group_2_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1724:1: ( rule__CharacteristicSelector__Group_2_1_2_0__1__Impl )
            // InternalDSL.g:1725:2: rule__CharacteristicSelector__Group_2_1_2_0__1__Impl
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
    // InternalDSL.g:1731:1: rule__CharacteristicSelector__Group_2_1_2_0__1__Impl : ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1735:1: ( ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 ) ) )
            // InternalDSL.g:1736:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 ) )
            {
            // InternalDSL.g:1736:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 ) )
            // InternalDSL.g:1737:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_1_2_0_1()); 
            // InternalDSL.g:1738:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 )
            // InternalDSL.g:1738:3: rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1
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
    // InternalDSL.g:1747:1: rule__CharacteristicSelector__Group_2_1_2_1__0 : rule__CharacteristicSelector__Group_2_1_2_1__0__Impl rule__CharacteristicSelector__Group_2_1_2_1__1 ;
    public final void rule__CharacteristicSelector__Group_2_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1751:1: ( rule__CharacteristicSelector__Group_2_1_2_1__0__Impl rule__CharacteristicSelector__Group_2_1_2_1__1 )
            // InternalDSL.g:1752:2: rule__CharacteristicSelector__Group_2_1_2_1__0__Impl rule__CharacteristicSelector__Group_2_1_2_1__1
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
    // InternalDSL.g:1759:1: rule__CharacteristicSelector__Group_2_1_2_1__0__Impl : ( ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1763:1: ( ( ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 ) ) )
            // InternalDSL.g:1764:1: ( ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 ) )
            {
            // InternalDSL.g:1764:1: ( ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 ) )
            // InternalDSL.g:1765:2: ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getConjunctedAssignment_2_1_2_1_0()); 
            // InternalDSL.g:1766:2: ( rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 )
            // InternalDSL.g:1766:3: rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0
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
    // InternalDSL.g:1774:1: rule__CharacteristicSelector__Group_2_1_2_1__1 : rule__CharacteristicSelector__Group_2_1_2_1__1__Impl ;
    public final void rule__CharacteristicSelector__Group_2_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1778:1: ( rule__CharacteristicSelector__Group_2_1_2_1__1__Impl )
            // InternalDSL.g:1779:2: rule__CharacteristicSelector__Group_2_1_2_1__1__Impl
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
    // InternalDSL.g:1785:1: rule__CharacteristicSelector__Group_2_1_2_1__1__Impl : ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 ) ) ;
    public final void rule__CharacteristicSelector__Group_2_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1789:1: ( ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 ) ) )
            // InternalDSL.g:1790:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 ) )
            {
            // InternalDSL.g:1790:1: ( ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 ) )
            // InternalDSL.g:1791:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralsAssignment_2_1_2_1_1()); 
            // InternalDSL.g:1792:2: ( rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 )
            // InternalDSL.g:1792:3: rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1
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
    // InternalDSL.g:1801:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1805:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDSL.g:1806:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalDSL.g:1813:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1817:1: ( ( 'constraint' ) )
            // InternalDSL.g:1818:1: ( 'constraint' )
            {
            // InternalDSL.g:1818:1: ( 'constraint' )
            // InternalDSL.g:1819:2: 'constraint'
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
    // InternalDSL.g:1828:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1832:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDSL.g:1833:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalDSL.g:1840:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1844:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDSL.g:1845:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDSL.g:1845:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDSL.g:1846:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDSL.g:1847:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDSL.g:1847:3: rule__Constraint__NameAssignment_1
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
    // InternalDSL.g:1855:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1859:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDSL.g:1860:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
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
    // InternalDSL.g:1867:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1871:1: ( ( '{' ) )
            // InternalDSL.g:1872:1: ( '{' )
            {
            // InternalDSL.g:1872:1: ( '{' )
            // InternalDSL.g:1873:2: '{'
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
    // InternalDSL.g:1882:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1886:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDSL.g:1887:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
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
    // InternalDSL.g:1894:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__RuleAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1898:1: ( ( ( rule__Constraint__RuleAssignment_3 ) ) )
            // InternalDSL.g:1899:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            {
            // InternalDSL.g:1899:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            // InternalDSL.g:1900:2: ( rule__Constraint__RuleAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 
            // InternalDSL.g:1901:2: ( rule__Constraint__RuleAssignment_3 )
            // InternalDSL.g:1901:3: rule__Constraint__RuleAssignment_3
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
    // InternalDSL.g:1909:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1913:1: ( rule__Constraint__Group__4__Impl )
            // InternalDSL.g:1914:2: rule__Constraint__Group__4__Impl
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
    // InternalDSL.g:1920:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1924:1: ( ( '}' ) )
            // InternalDSL.g:1925:1: ( '}' )
            {
            // InternalDSL.g:1925:1: ( '}' )
            // InternalDSL.g:1926:2: '}'
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
    // InternalDSL.g:1936:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1940:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDSL.g:1941:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalDSL.g:1948:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DataSelectorsAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1952:1: ( ( ( rule__Rule__DataSelectorsAssignment_0 ) ) )
            // InternalDSL.g:1953:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            {
            // InternalDSL.g:1953:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            // InternalDSL.g:1954:2: ( rule__Rule__DataSelectorsAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 
            // InternalDSL.g:1955:2: ( rule__Rule__DataSelectorsAssignment_0 )
            // InternalDSL.g:1955:3: rule__Rule__DataSelectorsAssignment_0
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
    // InternalDSL.g:1963:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1967:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDSL.g:1968:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalDSL.g:1975:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1979:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // InternalDSL.g:1980:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // InternalDSL.g:1980:1: ( ( rule__Rule__Group_1__0 )* )
            // InternalDSL.g:1981:2: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // InternalDSL.g:1982:2: ( rule__Rule__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1982:3: rule__Rule__Group_1__0
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
    // InternalDSL.g:1990:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1994:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDSL.g:1995:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalDSL.g:2002:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__StatementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2006:1: ( ( ( rule__Rule__StatementAssignment_2 ) ) )
            // InternalDSL.g:2007:1: ( ( rule__Rule__StatementAssignment_2 ) )
            {
            // InternalDSL.g:2007:1: ( ( rule__Rule__StatementAssignment_2 ) )
            // InternalDSL.g:2008:2: ( rule__Rule__StatementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getStatementAssignment_2()); 
            // InternalDSL.g:2009:2: ( rule__Rule__StatementAssignment_2 )
            // InternalDSL.g:2009:3: rule__Rule__StatementAssignment_2
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
    // InternalDSL.g:2017:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2021:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDSL.g:2022:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalDSL.g:2029:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2033:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) )
            // InternalDSL.g:2034:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            {
            // InternalDSL.g:2034:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            // InternalDSL.g:2035:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 
            // InternalDSL.g:2036:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            // InternalDSL.g:2036:3: rule__Rule__DestinationSelectorsAssignment_3
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
    // InternalDSL.g:2044:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2048:1: ( rule__Rule__Group__4__Impl )
            // InternalDSL.g:2049:2: rule__Rule__Group__4__Impl
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
    // InternalDSL.g:2055:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2059:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // InternalDSL.g:2060:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // InternalDSL.g:2060:1: ( ( rule__Rule__Group_4__0 )* )
            // InternalDSL.g:2061:2: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalDSL.g:2062:2: ( rule__Rule__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:2062:3: rule__Rule__Group_4__0
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
    // InternalDSL.g:2071:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2075:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalDSL.g:2076:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
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
    // InternalDSL.g:2083:1: rule__Rule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2087:1: ( ( '&' ) )
            // InternalDSL.g:2088:1: ( '&' )
            {
            // InternalDSL.g:2088:1: ( '&' )
            // InternalDSL.g:2089:2: '&'
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
    // InternalDSL.g:2098:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2102:1: ( rule__Rule__Group_1__1__Impl )
            // InternalDSL.g:2103:2: rule__Rule__Group_1__1__Impl
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
    // InternalDSL.g:2109:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2113:1: ( ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) )
            // InternalDSL.g:2114:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            {
            // InternalDSL.g:2114:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            // InternalDSL.g:2115:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 
            // InternalDSL.g:2116:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            // InternalDSL.g:2116:3: rule__Rule__DataSelectorsAssignment_1_1
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
    // InternalDSL.g:2125:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2129:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalDSL.g:2130:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
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
    // InternalDSL.g:2137:1: rule__Rule__Group_4__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2141:1: ( ( '&' ) )
            // InternalDSL.g:2142:1: ( '&' )
            {
            // InternalDSL.g:2142:1: ( '&' )
            // InternalDSL.g:2143:2: '&'
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
    // InternalDSL.g:2152:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2156:1: ( rule__Rule__Group_4__1__Impl )
            // InternalDSL.g:2157:2: rule__Rule__Group_4__1__Impl
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
    // InternalDSL.g:2163:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2167:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) )
            // InternalDSL.g:2168:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            {
            // InternalDSL.g:2168:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            // InternalDSL.g:2169:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 
            // InternalDSL.g:2170:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            // InternalDSL.g:2170:3: rule__Rule__DestinationSelectorsAssignment_4_1
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
    // InternalDSL.g:2179:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2183:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // InternalDSL.g:2184:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
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
    // InternalDSL.g:2191:1: rule__AttributeSelector__Group__0__Impl : ( 'data.attribute.' ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2195:1: ( ( 'data.attribute.' ) )
            // InternalDSL.g:2196:1: ( 'data.attribute.' )
            {
            // InternalDSL.g:2196:1: ( 'data.attribute.' )
            // InternalDSL.g:2197:2: 'data.attribute.'
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
    // InternalDSL.g:2206:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2210:1: ( rule__AttributeSelector__Group__1__Impl )
            // InternalDSL.g:2211:2: rule__AttributeSelector__Group__1__Impl
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
    // InternalDSL.g:2217:1: rule__AttributeSelector__Group__1__Impl : ( ( rule__AttributeSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2221:1: ( ( ( rule__AttributeSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2222:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2222:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            // InternalDSL.g:2223:2: ( rule__AttributeSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2224:2: ( rule__AttributeSelector__RefAssignment_1 )
            // InternalDSL.g:2224:3: rule__AttributeSelector__RefAssignment_1
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
    // InternalDSL.g:2233:1: rule__AttributeClassSelector__Group__0 : rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 ;
    public final void rule__AttributeClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2237:1: ( rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 )
            // InternalDSL.g:2238:2: rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1
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
    // InternalDSL.g:2245:1: rule__AttributeClassSelector__Group__0__Impl : ( 'data.class.' ) ;
    public final void rule__AttributeClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2249:1: ( ( 'data.class.' ) )
            // InternalDSL.g:2250:1: ( 'data.class.' )
            {
            // InternalDSL.g:2250:1: ( 'data.class.' )
            // InternalDSL.g:2251:2: 'data.class.'
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
    // InternalDSL.g:2260:1: rule__AttributeClassSelector__Group__1 : rule__AttributeClassSelector__Group__1__Impl rule__AttributeClassSelector__Group__2 ;
    public final void rule__AttributeClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2264:1: ( rule__AttributeClassSelector__Group__1__Impl rule__AttributeClassSelector__Group__2 )
            // InternalDSL.g:2265:2: rule__AttributeClassSelector__Group__1__Impl rule__AttributeClassSelector__Group__2
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
    // InternalDSL.g:2272:1: rule__AttributeClassSelector__Group__1__Impl : ( ( rule__AttributeClassSelector__NegatedAssignment_1 )? ) ;
    public final void rule__AttributeClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2276:1: ( ( ( rule__AttributeClassSelector__NegatedAssignment_1 )? ) )
            // InternalDSL.g:2277:1: ( ( rule__AttributeClassSelector__NegatedAssignment_1 )? )
            {
            // InternalDSL.g:2277:1: ( ( rule__AttributeClassSelector__NegatedAssignment_1 )? )
            // InternalDSL.g:2278:2: ( rule__AttributeClassSelector__NegatedAssignment_1 )?
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getNegatedAssignment_1()); 
            // InternalDSL.g:2279:2: ( rule__AttributeClassSelector__NegatedAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:2279:3: rule__AttributeClassSelector__NegatedAssignment_1
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
    // InternalDSL.g:2287:1: rule__AttributeClassSelector__Group__2 : rule__AttributeClassSelector__Group__2__Impl ;
    public final void rule__AttributeClassSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2291:1: ( rule__AttributeClassSelector__Group__2__Impl )
            // InternalDSL.g:2292:2: rule__AttributeClassSelector__Group__2__Impl
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
    // InternalDSL.g:2298:1: rule__AttributeClassSelector__Group__2__Impl : ( ( rule__AttributeClassSelector__RefAssignment_2 ) ) ;
    public final void rule__AttributeClassSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2302:1: ( ( ( rule__AttributeClassSelector__RefAssignment_2 ) ) )
            // InternalDSL.g:2303:1: ( ( rule__AttributeClassSelector__RefAssignment_2 ) )
            {
            // InternalDSL.g:2303:1: ( ( rule__AttributeClassSelector__RefAssignment_2 ) )
            // InternalDSL.g:2304:2: ( rule__AttributeClassSelector__RefAssignment_2 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_2()); 
            // InternalDSL.g:2305:2: ( rule__AttributeClassSelector__RefAssignment_2 )
            // InternalDSL.g:2305:3: rule__AttributeClassSelector__RefAssignment_2
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
    // InternalDSL.g:2314:1: rule__PropertySelector__Group__0 : rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 ;
    public final void rule__PropertySelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2318:1: ( rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 )
            // InternalDSL.g:2319:2: rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1
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
    // InternalDSL.g:2326:1: rule__PropertySelector__Group__0__Impl : ( 'node.property.' ) ;
    public final void rule__PropertySelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2330:1: ( ( 'node.property.' ) )
            // InternalDSL.g:2331:1: ( 'node.property.' )
            {
            // InternalDSL.g:2331:1: ( 'node.property.' )
            // InternalDSL.g:2332:2: 'node.property.'
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
    // InternalDSL.g:2341:1: rule__PropertySelector__Group__1 : rule__PropertySelector__Group__1__Impl ;
    public final void rule__PropertySelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2345:1: ( rule__PropertySelector__Group__1__Impl )
            // InternalDSL.g:2346:2: rule__PropertySelector__Group__1__Impl
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
    // InternalDSL.g:2352:1: rule__PropertySelector__Group__1__Impl : ( ( rule__PropertySelector__RefAssignment_1 ) ) ;
    public final void rule__PropertySelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2356:1: ( ( ( rule__PropertySelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2357:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2357:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            // InternalDSL.g:2358:2: ( rule__PropertySelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2359:2: ( rule__PropertySelector__RefAssignment_1 )
            // InternalDSL.g:2359:3: rule__PropertySelector__RefAssignment_1
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
    // InternalDSL.g:2368:1: rule__PropertyClassSelector__Group__0 : rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 ;
    public final void rule__PropertyClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2372:1: ( rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 )
            // InternalDSL.g:2373:2: rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1
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
    // InternalDSL.g:2380:1: rule__PropertyClassSelector__Group__0__Impl : ( 'node.class.' ) ;
    public final void rule__PropertyClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2384:1: ( ( 'node.class.' ) )
            // InternalDSL.g:2385:1: ( 'node.class.' )
            {
            // InternalDSL.g:2385:1: ( 'node.class.' )
            // InternalDSL.g:2386:2: 'node.class.'
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
    // InternalDSL.g:2395:1: rule__PropertyClassSelector__Group__1 : rule__PropertyClassSelector__Group__1__Impl rule__PropertyClassSelector__Group__2 ;
    public final void rule__PropertyClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2399:1: ( rule__PropertyClassSelector__Group__1__Impl rule__PropertyClassSelector__Group__2 )
            // InternalDSL.g:2400:2: rule__PropertyClassSelector__Group__1__Impl rule__PropertyClassSelector__Group__2
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
    // InternalDSL.g:2407:1: rule__PropertyClassSelector__Group__1__Impl : ( ( rule__PropertyClassSelector__NegatedAssignment_1 )? ) ;
    public final void rule__PropertyClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2411:1: ( ( ( rule__PropertyClassSelector__NegatedAssignment_1 )? ) )
            // InternalDSL.g:2412:1: ( ( rule__PropertyClassSelector__NegatedAssignment_1 )? )
            {
            // InternalDSL.g:2412:1: ( ( rule__PropertyClassSelector__NegatedAssignment_1 )? )
            // InternalDSL.g:2413:2: ( rule__PropertyClassSelector__NegatedAssignment_1 )?
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNegatedAssignment_1()); 
            // InternalDSL.g:2414:2: ( rule__PropertyClassSelector__NegatedAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDSL.g:2414:3: rule__PropertyClassSelector__NegatedAssignment_1
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
    // InternalDSL.g:2422:1: rule__PropertyClassSelector__Group__2 : rule__PropertyClassSelector__Group__2__Impl ;
    public final void rule__PropertyClassSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2426:1: ( rule__PropertyClassSelector__Group__2__Impl )
            // InternalDSL.g:2427:2: rule__PropertyClassSelector__Group__2__Impl
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
    // InternalDSL.g:2433:1: rule__PropertyClassSelector__Group__2__Impl : ( ( rule__PropertyClassSelector__RefAssignment_2 ) ) ;
    public final void rule__PropertyClassSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2437:1: ( ( ( rule__PropertyClassSelector__RefAssignment_2 ) ) )
            // InternalDSL.g:2438:1: ( ( rule__PropertyClassSelector__RefAssignment_2 ) )
            {
            // InternalDSL.g:2438:1: ( ( rule__PropertyClassSelector__RefAssignment_2 ) )
            // InternalDSL.g:2439:2: ( rule__PropertyClassSelector__RefAssignment_2 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_2()); 
            // InternalDSL.g:2440:2: ( rule__PropertyClassSelector__RefAssignment_2 )
            // InternalDSL.g:2440:3: rule__PropertyClassSelector__RefAssignment_2
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
    // InternalDSL.g:2449:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2453:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalDSL.g:2454:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalDSL.g:2461:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__ModalityAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2465:1: ( ( ( rule__Statement__ModalityAssignment_0 ) ) )
            // InternalDSL.g:2466:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            {
            // InternalDSL.g:2466:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            // InternalDSL.g:2467:2: ( rule__Statement__ModalityAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getModalityAssignment_0()); 
            // InternalDSL.g:2468:2: ( rule__Statement__ModalityAssignment_0 )
            // InternalDSL.g:2468:3: rule__Statement__ModalityAssignment_0
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
    // InternalDSL.g:2476:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2480:1: ( rule__Statement__Group__1__Impl )
            // InternalDSL.g:2481:2: rule__Statement__Group__1__Impl
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
    // InternalDSL.g:2487:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__TypeAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2491:1: ( ( ( rule__Statement__TypeAssignment_1 ) ) )
            // InternalDSL.g:2492:1: ( ( rule__Statement__TypeAssignment_1 ) )
            {
            // InternalDSL.g:2492:1: ( ( rule__Statement__TypeAssignment_1 ) )
            // InternalDSL.g:2493:2: ( rule__Statement__TypeAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_1()); 
            // InternalDSL.g:2494:2: ( rule__Statement__TypeAssignment_1 )
            // InternalDSL.g:2494:3: rule__Statement__TypeAssignment_1
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
    // InternalDSL.g:2503:1: rule__Model__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2507:1: ( ( ruleAbstractElement ) )
            // InternalDSL.g:2508:2: ( ruleAbstractElement )
            {
            // InternalDSL.g:2508:2: ( ruleAbstractElement )
            // InternalDSL.g:2509:3: ruleAbstractElement
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
    // InternalDSL.g:2518:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2522:1: ( ( RULE_ID ) )
            // InternalDSL.g:2523:2: ( RULE_ID )
            {
            // InternalDSL.g:2523:2: ( RULE_ID )
            // InternalDSL.g:2524:3: RULE_ID
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
    // InternalDSL.g:2533:1: rule__ValueSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ValueSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2537:1: ( ( RULE_ID ) )
            // InternalDSL.g:2538:2: ( RULE_ID )
            {
            // InternalDSL.g:2538:2: ( RULE_ID )
            // InternalDSL.g:2539:3: RULE_ID
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
    // InternalDSL.g:2548:1: rule__ValueSet__MembersAssignment_4 : ( RULE_ID ) ;
    public final void rule__ValueSet__MembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2552:1: ( ( RULE_ID ) )
            // InternalDSL.g:2553:2: ( RULE_ID )
            {
            // InternalDSL.g:2553:2: ( RULE_ID )
            // InternalDSL.g:2554:3: RULE_ID
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
    // InternalDSL.g:2563:1: rule__ValueSet__MembersAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ValueSet__MembersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2567:1: ( ( RULE_ID ) )
            // InternalDSL.g:2568:2: ( RULE_ID )
            {
            // InternalDSL.g:2568:2: ( RULE_ID )
            // InternalDSL.g:2569:3: RULE_ID
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
    // InternalDSL.g:2578:1: rule__AttributeType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2582:1: ( ( RULE_ID ) )
            // InternalDSL.g:2583:2: ( RULE_ID )
            {
            // InternalDSL.g:2583:2: ( RULE_ID )
            // InternalDSL.g:2584:3: RULE_ID
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
    // InternalDSL.g:2593:1: rule__AttributeType__ValuesetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeType__ValuesetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2597:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2598:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2598:2: ( ( RULE_ID ) )
            // InternalDSL.g:2599:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeTypeAccess().getValuesetValueSetCrossReference_3_0()); 
            // InternalDSL.g:2600:3: ( RULE_ID )
            // InternalDSL.g:2601:4: RULE_ID
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
    // InternalDSL.g:2612:1: rule__PropertyType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PropertyType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2616:1: ( ( RULE_ID ) )
            // InternalDSL.g:2617:2: ( RULE_ID )
            {
            // InternalDSL.g:2617:2: ( RULE_ID )
            // InternalDSL.g:2618:3: RULE_ID
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
    // InternalDSL.g:2627:1: rule__PropertyType__ValuesetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyType__ValuesetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2631:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2632:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2632:2: ( ( RULE_ID ) )
            // InternalDSL.g:2633:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyTypeAccess().getValuesetValueSetCrossReference_3_0()); 
            // InternalDSL.g:2634:3: ( RULE_ID )
            // InternalDSL.g:2635:4: RULE_ID
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
    // InternalDSL.g:2646:1: rule__CharacteristicClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2650:1: ( ( RULE_ID ) )
            // InternalDSL.g:2651:2: ( RULE_ID )
            {
            // InternalDSL.g:2651:2: ( RULE_ID )
            // InternalDSL.g:2652:3: RULE_ID
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
    // InternalDSL.g:2661:1: rule__CharacteristicClass__MembersAssignment_3 : ( ruleCharacteristicSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2665:1: ( ( ruleCharacteristicSelector ) )
            // InternalDSL.g:2666:2: ( ruleCharacteristicSelector )
            {
            // InternalDSL.g:2666:2: ( ruleCharacteristicSelector )
            // InternalDSL.g:2667:3: ruleCharacteristicSelector
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
    // InternalDSL.g:2676:1: rule__CharacteristicClass__MembersAssignment_4_1 : ( ruleCharacteristicSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2680:1: ( ( ruleCharacteristicSelector ) )
            // InternalDSL.g:2681:2: ( ruleCharacteristicSelector )
            {
            // InternalDSL.g:2681:2: ( ruleCharacteristicSelector )
            // InternalDSL.g:2682:3: ruleCharacteristicSelector
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
    // InternalDSL.g:2691:1: rule__CharacteristicSelector__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicSelector__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2695:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2696:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2696:2: ( ( RULE_ID ) )
            // InternalDSL.g:2697:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getRefCharacteristicsTypeCrossReference_0_0()); 
            // InternalDSL.g:2698:3: ( RULE_ID )
            // InternalDSL.g:2699:4: RULE_ID
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
    // InternalDSL.g:2710:1: rule__CharacteristicSelector__NegatedAssignment_2_0_0 : ( ( '!' ) ) ;
    public final void rule__CharacteristicSelector__NegatedAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2714:1: ( ( ( '!' ) ) )
            // InternalDSL.g:2715:2: ( ( '!' ) )
            {
            // InternalDSL.g:2715:2: ( ( '!' ) )
            // InternalDSL.g:2716:3: ( '!' )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            // InternalDSL.g:2717:3: ( '!' )
            // InternalDSL.g:2718:4: '!'
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
    // InternalDSL.g:2729:1: rule__CharacteristicSelector__LiteralsAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicSelector__LiteralsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2733:1: ( ( RULE_ID ) )
            // InternalDSL.g:2734:2: ( RULE_ID )
            {
            // InternalDSL.g:2734:2: ( RULE_ID )
            // InternalDSL.g:2735:3: RULE_ID
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
    // InternalDSL.g:2744:1: rule__CharacteristicSelector__LiteralsAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicSelector__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2748:1: ( ( RULE_ID ) )
            // InternalDSL.g:2749:2: ( RULE_ID )
            {
            // InternalDSL.g:2749:2: ( RULE_ID )
            // InternalDSL.g:2750:3: RULE_ID
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
    // InternalDSL.g:2759:1: rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicSelector__LiteralsAssignment_2_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2763:1: ( ( RULE_ID ) )
            // InternalDSL.g:2764:2: ( RULE_ID )
            {
            // InternalDSL.g:2764:2: ( RULE_ID )
            // InternalDSL.g:2765:3: RULE_ID
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
    // InternalDSL.g:2774:1: rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0 : ( ( '&' ) ) ;
    public final void rule__CharacteristicSelector__ConjunctedAssignment_2_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2778:1: ( ( ( '&' ) ) )
            // InternalDSL.g:2779:2: ( ( '&' ) )
            {
            // InternalDSL.g:2779:2: ( ( '&' ) )
            // InternalDSL.g:2780:3: ( '&' )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getConjunctedAmpersandKeyword_2_1_2_1_0_0()); 
            // InternalDSL.g:2781:3: ( '&' )
            // InternalDSL.g:2782:4: '&'
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
    // InternalDSL.g:2793:1: rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicSelector__LiteralsAssignment_2_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2797:1: ( ( RULE_ID ) )
            // InternalDSL.g:2798:2: ( RULE_ID )
            {
            // InternalDSL.g:2798:2: ( RULE_ID )
            // InternalDSL.g:2799:3: RULE_ID
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
    // InternalDSL.g:2808:1: rule__Constraint__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2812:1: ( ( RULE_STRING ) )
            // InternalDSL.g:2813:2: ( RULE_STRING )
            {
            // InternalDSL.g:2813:2: ( RULE_STRING )
            // InternalDSL.g:2814:3: RULE_STRING
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
    // InternalDSL.g:2823:1: rule__Constraint__RuleAssignment_3 : ( ruleRule ) ;
    public final void rule__Constraint__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2827:1: ( ( ruleRule ) )
            // InternalDSL.g:2828:2: ( ruleRule )
            {
            // InternalDSL.g:2828:2: ( ruleRule )
            // InternalDSL.g:2829:3: ruleRule
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
    // InternalDSL.g:2838:1: rule__Rule__DataSelectorsAssignment_0 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2842:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:2843:2: ( ruleDataSelector )
            {
            // InternalDSL.g:2843:2: ( ruleDataSelector )
            // InternalDSL.g:2844:3: ruleDataSelector
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
    // InternalDSL.g:2853:1: rule__Rule__DataSelectorsAssignment_1_1 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2857:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:2858:2: ( ruleDataSelector )
            {
            // InternalDSL.g:2858:2: ( ruleDataSelector )
            // InternalDSL.g:2859:3: ruleDataSelector
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
    // InternalDSL.g:2868:1: rule__Rule__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Rule__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2872:1: ( ( ruleStatement ) )
            // InternalDSL.g:2873:2: ( ruleStatement )
            {
            // InternalDSL.g:2873:2: ( ruleStatement )
            // InternalDSL.g:2874:3: ruleStatement
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
    // InternalDSL.g:2883:1: rule__Rule__DestinationSelectorsAssignment_3 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2887:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:2888:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:2888:2: ( ruleDestinationSelector )
            // InternalDSL.g:2889:3: ruleDestinationSelector
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
    // InternalDSL.g:2898:1: rule__Rule__DestinationSelectorsAssignment_4_1 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2902:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:2903:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:2903:2: ( ruleDestinationSelector )
            // InternalDSL.g:2904:3: ruleDestinationSelector
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
    // InternalDSL.g:2913:1: rule__AttributeSelector__RefAssignment_1 : ( ruleCharacteristicSelector ) ;
    public final void rule__AttributeSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2917:1: ( ( ruleCharacteristicSelector ) )
            // InternalDSL.g:2918:2: ( ruleCharacteristicSelector )
            {
            // InternalDSL.g:2918:2: ( ruleCharacteristicSelector )
            // InternalDSL.g:2919:3: ruleCharacteristicSelector
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
    // InternalDSL.g:2928:1: rule__AttributeClassSelector__NegatedAssignment_1 : ( ( '!' ) ) ;
    public final void rule__AttributeClassSelector__NegatedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2932:1: ( ( ( '!' ) ) )
            // InternalDSL.g:2933:2: ( ( '!' ) )
            {
            // InternalDSL.g:2933:2: ( ( '!' ) )
            // InternalDSL.g:2934:3: ( '!' )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0()); 
            // InternalDSL.g:2935:3: ( '!' )
            // InternalDSL.g:2936:4: '!'
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
    // InternalDSL.g:2947:1: rule__AttributeClassSelector__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeClassSelector__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2951:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2952:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2952:2: ( ( RULE_ID ) )
            // InternalDSL.g:2953:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_2_0()); 
            // InternalDSL.g:2954:3: ( RULE_ID )
            // InternalDSL.g:2955:4: RULE_ID
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
    // InternalDSL.g:2966:1: rule__PropertySelector__RefAssignment_1 : ( ruleCharacteristicSelector ) ;
    public final void rule__PropertySelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2970:1: ( ( ruleCharacteristicSelector ) )
            // InternalDSL.g:2971:2: ( ruleCharacteristicSelector )
            {
            // InternalDSL.g:2971:2: ( ruleCharacteristicSelector )
            // InternalDSL.g:2972:3: ruleCharacteristicSelector
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
    // InternalDSL.g:2981:1: rule__PropertyClassSelector__NegatedAssignment_1 : ( ( '!' ) ) ;
    public final void rule__PropertyClassSelector__NegatedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2985:1: ( ( ( '!' ) ) )
            // InternalDSL.g:2986:2: ( ( '!' ) )
            {
            // InternalDSL.g:2986:2: ( ( '!' ) )
            // InternalDSL.g:2987:3: ( '!' )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0()); 
            // InternalDSL.g:2988:3: ( '!' )
            // InternalDSL.g:2989:4: '!'
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
    // InternalDSL.g:3000:1: rule__PropertyClassSelector__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyClassSelector__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3004:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:3005:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:3005:2: ( ( RULE_ID ) )
            // InternalDSL.g:3006:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_2_0()); 
            // InternalDSL.g:3007:3: ( RULE_ID )
            // InternalDSL.g:3008:4: RULE_ID
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
    // InternalDSL.g:3019:1: rule__Statement__ModalityAssignment_0 : ( ruleStatementModality ) ;
    public final void rule__Statement__ModalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3023:1: ( ( ruleStatementModality ) )
            // InternalDSL.g:3024:2: ( ruleStatementModality )
            {
            // InternalDSL.g:3024:2: ( ruleStatementModality )
            // InternalDSL.g:3025:3: ruleStatementModality
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
    // InternalDSL.g:3034:1: rule__Statement__TypeAssignment_1 : ( ruleStatementType ) ;
    public final void rule__Statement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3038:1: ( ( ruleStatementType ) )
            // InternalDSL.g:3039:2: ( ruleStatementType )
            {
            // InternalDSL.g:3039:2: ( ruleStatementType )
            // InternalDSL.g:3040:3: ruleStatementType
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
    // InternalDSL.g:3049:1: rule__StatementType__NameAssignment : ( ( 'FLOWS' ) ) ;
    public final void rule__StatementType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3053:1: ( ( ( 'FLOWS' ) ) )
            // InternalDSL.g:3054:2: ( ( 'FLOWS' ) )
            {
            // InternalDSL.g:3054:2: ( ( 'FLOWS' ) )
            // InternalDSL.g:3055:3: ( 'FLOWS' )
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            // InternalDSL.g:3056:3: ( 'FLOWS' )
            // InternalDSL.g:3057:4: 'FLOWS'
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
    // InternalDSL.g:3068:1: rule__StatementModality__NameAssignment : ( ( 'NEVER' ) ) ;
    public final void rule__StatementModality__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3072:1: ( ( ( 'NEVER' ) ) )
            // InternalDSL.g:3073:2: ( ( 'NEVER' ) )
            {
            // InternalDSL.g:3073:2: ( ( 'NEVER' ) )
            // InternalDSL.g:3074:3: ( 'NEVER' )
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            // InternalDSL.g:3075:3: ( 'NEVER' )
            // InternalDSL.g:3076:4: 'NEVER'
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020004010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}