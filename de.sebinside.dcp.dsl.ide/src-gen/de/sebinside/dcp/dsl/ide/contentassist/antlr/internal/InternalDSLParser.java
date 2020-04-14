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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OperationModel'", "'DataCentricPalladio'", "'ExtendedDFD'", "'target'", "'using'", "','", "'type'", "':'", "'class'", "'{'", "'}'", "'.'", "'['", "']'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'node.name.'", "'node.identity.'", "'!'", "'FLOWS'", "'NEVER'"
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
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    // InternalDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleTargetModelTypeDef"
    // InternalDSL.g:78:1: entryRuleTargetModelTypeDef : ruleTargetModelTypeDef EOF ;
    public final void entryRuleTargetModelTypeDef() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleTargetModelTypeDef EOF )
            // InternalDSL.g:80:1: ruleTargetModelTypeDef EOF
            {
             before(grammarAccess.getTargetModelTypeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetModelTypeDef();

            state._fsp--;

             after(grammarAccess.getTargetModelTypeDefRule()); 
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
    // $ANTLR end "entryRuleTargetModelTypeDef"


    // $ANTLR start "ruleTargetModelTypeDef"
    // InternalDSL.g:87:1: ruleTargetModelTypeDef : ( ( rule__TargetModelTypeDef__Group__0 ) ) ;
    public final void ruleTargetModelTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__TargetModelTypeDef__Group__0 ) ) )
            // InternalDSL.g:92:2: ( ( rule__TargetModelTypeDef__Group__0 ) )
            {
            // InternalDSL.g:92:2: ( ( rule__TargetModelTypeDef__Group__0 ) )
            // InternalDSL.g:93:3: ( rule__TargetModelTypeDef__Group__0 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getGroup()); 
            // InternalDSL.g:94:3: ( rule__TargetModelTypeDef__Group__0 )
            // InternalDSL.g:94:4: rule__TargetModelTypeDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getGroup()); 

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
    // $ANTLR end "ruleTargetModelTypeDef"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDSL.g:103:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleAbstractElement EOF )
            // InternalDSL.g:105:1: ruleAbstractElement EOF
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
    // InternalDSL.g:112:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalDSL.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalDSL.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalDSL.g:118:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalDSL.g:119:3: ( rule__AbstractElement__Alternatives )
            // InternalDSL.g:119:4: rule__AbstractElement__Alternatives
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


    // $ANTLR start "entryRuleCharacteristicType"
    // InternalDSL.g:128:1: entryRuleCharacteristicType : ruleCharacteristicType EOF ;
    public final void entryRuleCharacteristicType() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleCharacteristicType EOF )
            // InternalDSL.g:130:1: ruleCharacteristicType EOF
            {
             before(grammarAccess.getCharacteristicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicType();

            state._fsp--;

             after(grammarAccess.getCharacteristicTypeRule()); 
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
    // $ANTLR end "entryRuleCharacteristicType"


    // $ANTLR start "ruleCharacteristicType"
    // InternalDSL.g:137:1: ruleCharacteristicType : ( ( rule__CharacteristicType__Group__0 ) ) ;
    public final void ruleCharacteristicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__CharacteristicType__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__CharacteristicType__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__CharacteristicType__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__CharacteristicType__Group__0 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__CharacteristicType__Group__0 )
            // InternalDSL.g:144:4: rule__CharacteristicType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacteristicType"


    // $ANTLR start "entryRuleCharacteristicClass"
    // InternalDSL.g:153:1: entryRuleCharacteristicClass : ruleCharacteristicClass EOF ;
    public final void entryRuleCharacteristicClass() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleCharacteristicClass EOF )
            // InternalDSL.g:155:1: ruleCharacteristicClass EOF
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
    // InternalDSL.g:162:1: ruleCharacteristicClass : ( ( rule__CharacteristicClass__Group__0 ) ) ;
    public final void ruleCharacteristicClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__CharacteristicClass__Group__0 ) ) )
            // InternalDSL.g:167:2: ( ( rule__CharacteristicClass__Group__0 ) )
            {
            // InternalDSL.g:167:2: ( ( rule__CharacteristicClass__Group__0 ) )
            // InternalDSL.g:168:3: ( rule__CharacteristicClass__Group__0 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup()); 
            // InternalDSL.g:169:3: ( rule__CharacteristicClass__Group__0 )
            // InternalDSL.g:169:4: rule__CharacteristicClass__Group__0
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


    // $ANTLR start "entryRuleCharacteristicTypeSelector"
    // InternalDSL.g:178:1: entryRuleCharacteristicTypeSelector : ruleCharacteristicTypeSelector EOF ;
    public final void entryRuleCharacteristicTypeSelector() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleCharacteristicTypeSelector EOF )
            // InternalDSL.g:180:1: ruleCharacteristicTypeSelector EOF
            {
             before(grammarAccess.getCharacteristicTypeSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicTypeSelector();

            state._fsp--;

             after(grammarAccess.getCharacteristicTypeSelectorRule()); 
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
    // $ANTLR end "entryRuleCharacteristicTypeSelector"


    // $ANTLR start "ruleCharacteristicTypeSelector"
    // InternalDSL.g:187:1: ruleCharacteristicTypeSelector : ( ( rule__CharacteristicTypeSelector__Group__0 ) ) ;
    public final void ruleCharacteristicTypeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__CharacteristicTypeSelector__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__CharacteristicTypeSelector__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__CharacteristicTypeSelector__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__CharacteristicTypeSelector__Group__0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__CharacteristicTypeSelector__Group__0 )
            // InternalDSL.g:194:4: rule__CharacteristicTypeSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacteristicTypeSelector"


    // $ANTLR start "entryRuleInclude"
    // InternalDSL.g:203:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleInclude EOF )
            // InternalDSL.g:205:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalDSL.g:212:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__Include__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__Include__Group__0 )
            // InternalDSL.g:219:4: rule__Include__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleConstraint"
    // InternalDSL.g:228:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleConstraint EOF )
            // InternalDSL.g:230:1: ruleConstraint EOF
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
    // InternalDSL.g:237:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalDSL.g:242:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalDSL.g:242:2: ( ( rule__Constraint__Group__0 ) )
            // InternalDSL.g:243:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalDSL.g:244:3: ( rule__Constraint__Group__0 )
            // InternalDSL.g:244:4: rule__Constraint__Group__0
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
    // InternalDSL.g:253:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleRule EOF )
            // InternalDSL.g:255:1: ruleRule EOF
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
    // InternalDSL.g:262:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDSL.g:267:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDSL.g:267:2: ( ( rule__Rule__Group__0 ) )
            // InternalDSL.g:268:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDSL.g:269:3: ( rule__Rule__Group__0 )
            // InternalDSL.g:269:4: rule__Rule__Group__0
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
    // InternalDSL.g:278:1: entryRuleDataSelector : ruleDataSelector EOF ;
    public final void entryRuleDataSelector() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleDataSelector EOF )
            // InternalDSL.g:280:1: ruleDataSelector EOF
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
    // InternalDSL.g:287:1: ruleDataSelector : ( ( rule__DataSelector__Alternatives ) ) ;
    public final void ruleDataSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__DataSelector__Alternatives ) ) )
            // InternalDSL.g:292:2: ( ( rule__DataSelector__Alternatives ) )
            {
            // InternalDSL.g:292:2: ( ( rule__DataSelector__Alternatives ) )
            // InternalDSL.g:293:3: ( rule__DataSelector__Alternatives )
            {
             before(grammarAccess.getDataSelectorAccess().getAlternatives()); 
            // InternalDSL.g:294:3: ( rule__DataSelector__Alternatives )
            // InternalDSL.g:294:4: rule__DataSelector__Alternatives
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
    // InternalDSL.g:303:1: entryRuleAttributeSelector : ruleAttributeSelector EOF ;
    public final void entryRuleAttributeSelector() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleAttributeSelector EOF )
            // InternalDSL.g:305:1: ruleAttributeSelector EOF
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
    // InternalDSL.g:312:1: ruleAttributeSelector : ( ( rule__AttributeSelector__Group__0 ) ) ;
    public final void ruleAttributeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__AttributeSelector__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__AttributeSelector__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__AttributeSelector__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__AttributeSelector__Group__0 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__AttributeSelector__Group__0 )
            // InternalDSL.g:319:4: rule__AttributeSelector__Group__0
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
    // InternalDSL.g:328:1: entryRuleAttributeClassSelector : ruleAttributeClassSelector EOF ;
    public final void entryRuleAttributeClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleAttributeClassSelector EOF )
            // InternalDSL.g:330:1: ruleAttributeClassSelector EOF
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
    // InternalDSL.g:337:1: ruleAttributeClassSelector : ( ( rule__AttributeClassSelector__Group__0 ) ) ;
    public final void ruleAttributeClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__AttributeClassSelector__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__AttributeClassSelector__Group__0 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__AttributeClassSelector__Group__0 )
            // InternalDSL.g:344:4: rule__AttributeClassSelector__Group__0
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
    // InternalDSL.g:353:1: entryRuleDestinationSelector : ruleDestinationSelector EOF ;
    public final void entryRuleDestinationSelector() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleDestinationSelector EOF )
            // InternalDSL.g:355:1: ruleDestinationSelector EOF
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
    // InternalDSL.g:362:1: ruleDestinationSelector : ( ( rule__DestinationSelector__Alternatives ) ) ;
    public final void ruleDestinationSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__DestinationSelector__Alternatives ) ) )
            // InternalDSL.g:367:2: ( ( rule__DestinationSelector__Alternatives ) )
            {
            // InternalDSL.g:367:2: ( ( rule__DestinationSelector__Alternatives ) )
            // InternalDSL.g:368:3: ( rule__DestinationSelector__Alternatives )
            {
             before(grammarAccess.getDestinationSelectorAccess().getAlternatives()); 
            // InternalDSL.g:369:3: ( rule__DestinationSelector__Alternatives )
            // InternalDSL.g:369:4: rule__DestinationSelector__Alternatives
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
    // InternalDSL.g:378:1: entryRulePropertySelector : rulePropertySelector EOF ;
    public final void entryRulePropertySelector() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( rulePropertySelector EOF )
            // InternalDSL.g:380:1: rulePropertySelector EOF
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
    // InternalDSL.g:387:1: rulePropertySelector : ( ( rule__PropertySelector__Group__0 ) ) ;
    public final void rulePropertySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__PropertySelector__Group__0 ) ) )
            // InternalDSL.g:392:2: ( ( rule__PropertySelector__Group__0 ) )
            {
            // InternalDSL.g:392:2: ( ( rule__PropertySelector__Group__0 ) )
            // InternalDSL.g:393:3: ( rule__PropertySelector__Group__0 )
            {
             before(grammarAccess.getPropertySelectorAccess().getGroup()); 
            // InternalDSL.g:394:3: ( rule__PropertySelector__Group__0 )
            // InternalDSL.g:394:4: rule__PropertySelector__Group__0
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
    // InternalDSL.g:403:1: entryRulePropertyClassSelector : rulePropertyClassSelector EOF ;
    public final void entryRulePropertyClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( rulePropertyClassSelector EOF )
            // InternalDSL.g:405:1: rulePropertyClassSelector EOF
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
    // InternalDSL.g:412:1: rulePropertyClassSelector : ( ( rule__PropertyClassSelector__Group__0 ) ) ;
    public final void rulePropertyClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__PropertyClassSelector__Group__0 ) ) )
            // InternalDSL.g:417:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            {
            // InternalDSL.g:417:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            // InternalDSL.g:418:3: ( rule__PropertyClassSelector__Group__0 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getGroup()); 
            // InternalDSL.g:419:3: ( rule__PropertyClassSelector__Group__0 )
            // InternalDSL.g:419:4: rule__PropertyClassSelector__Group__0
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


    // $ANTLR start "entryRuleNodeIdentitiySelector"
    // InternalDSL.g:428:1: entryRuleNodeIdentitiySelector : ruleNodeIdentitiySelector EOF ;
    public final void entryRuleNodeIdentitiySelector() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( ruleNodeIdentitiySelector EOF )
            // InternalDSL.g:430:1: ruleNodeIdentitiySelector EOF
            {
             before(grammarAccess.getNodeIdentitiySelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeIdentitiySelector();

            state._fsp--;

             after(grammarAccess.getNodeIdentitiySelectorRule()); 
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
    // $ANTLR end "entryRuleNodeIdentitiySelector"


    // $ANTLR start "ruleNodeIdentitiySelector"
    // InternalDSL.g:437:1: ruleNodeIdentitiySelector : ( ( rule__NodeIdentitiySelector__Alternatives ) ) ;
    public final void ruleNodeIdentitiySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__NodeIdentitiySelector__Alternatives ) ) )
            // InternalDSL.g:442:2: ( ( rule__NodeIdentitiySelector__Alternatives ) )
            {
            // InternalDSL.g:442:2: ( ( rule__NodeIdentitiySelector__Alternatives ) )
            // InternalDSL.g:443:3: ( rule__NodeIdentitiySelector__Alternatives )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAlternatives()); 
            // InternalDSL.g:444:3: ( rule__NodeIdentitiySelector__Alternatives )
            // InternalDSL.g:444:4: rule__NodeIdentitiySelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNodeIdentitiySelector"


    // $ANTLR start "entryRuleStatement"
    // InternalDSL.g:453:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( ruleStatement EOF )
            // InternalDSL.g:455:1: ruleStatement EOF
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
    // InternalDSL.g:462:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalDSL.g:467:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalDSL.g:467:2: ( ( rule__Statement__Group__0 ) )
            // InternalDSL.g:468:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalDSL.g:469:3: ( rule__Statement__Group__0 )
            // InternalDSL.g:469:4: rule__Statement__Group__0
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
    // InternalDSL.g:478:1: entryRuleStatementType : ruleStatementType EOF ;
    public final void entryRuleStatementType() throws RecognitionException {
        try {
            // InternalDSL.g:479:1: ( ruleStatementType EOF )
            // InternalDSL.g:480:1: ruleStatementType EOF
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
    // InternalDSL.g:487:1: ruleStatementType : ( ( rule__StatementType__NameAssignment ) ) ;
    public final void ruleStatementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:2: ( ( ( rule__StatementType__NameAssignment ) ) )
            // InternalDSL.g:492:2: ( ( rule__StatementType__NameAssignment ) )
            {
            // InternalDSL.g:492:2: ( ( rule__StatementType__NameAssignment ) )
            // InternalDSL.g:493:3: ( rule__StatementType__NameAssignment )
            {
             before(grammarAccess.getStatementTypeAccess().getNameAssignment()); 
            // InternalDSL.g:494:3: ( rule__StatementType__NameAssignment )
            // InternalDSL.g:494:4: rule__StatementType__NameAssignment
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
    // InternalDSL.g:503:1: entryRuleStatementModality : ruleStatementModality EOF ;
    public final void entryRuleStatementModality() throws RecognitionException {
        try {
            // InternalDSL.g:504:1: ( ruleStatementModality EOF )
            // InternalDSL.g:505:1: ruleStatementModality EOF
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
    // InternalDSL.g:512:1: ruleStatementModality : ( ( rule__StatementModality__NameAssignment ) ) ;
    public final void ruleStatementModality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:2: ( ( ( rule__StatementModality__NameAssignment ) ) )
            // InternalDSL.g:517:2: ( ( rule__StatementModality__NameAssignment ) )
            {
            // InternalDSL.g:517:2: ( ( rule__StatementModality__NameAssignment ) )
            // InternalDSL.g:518:3: ( rule__StatementModality__NameAssignment )
            {
             before(grammarAccess.getStatementModalityAccess().getNameAssignment()); 
            // InternalDSL.g:519:3: ( rule__StatementModality__NameAssignment )
            // InternalDSL.g:519:4: rule__StatementModality__NameAssignment
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


    // $ANTLR start "ruleTargetModelType"
    // InternalDSL.g:528:1: ruleTargetModelType : ( ( rule__TargetModelType__Alternatives ) ) ;
    public final void ruleTargetModelType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:532:1: ( ( ( rule__TargetModelType__Alternatives ) ) )
            // InternalDSL.g:533:2: ( ( rule__TargetModelType__Alternatives ) )
            {
            // InternalDSL.g:533:2: ( ( rule__TargetModelType__Alternatives ) )
            // InternalDSL.g:534:3: ( rule__TargetModelType__Alternatives )
            {
             before(grammarAccess.getTargetModelTypeAccess().getAlternatives()); 
            // InternalDSL.g:535:3: ( rule__TargetModelType__Alternatives )
            // InternalDSL.g:535:4: rule__TargetModelType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTargetModelType"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalDSL.g:543:1: rule__AbstractElement__Alternatives : ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:547:1: ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDSL.g:548:2: ( ruleInclude )
                    {
                    // InternalDSL.g:548:2: ( ruleInclude )
                    // InternalDSL.g:549:3: ruleInclude
                    {
                     before(grammarAccess.getAbstractElementAccess().getIncludeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInclude();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getIncludeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:554:2: ( ruleCharacteristicType )
                    {
                    // InternalDSL.g:554:2: ( ruleCharacteristicType )
                    // InternalDSL.g:555:3: ruleCharacteristicType
                    {
                     before(grammarAccess.getAbstractElementAccess().getCharacteristicTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCharacteristicTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:560:2: ( ruleCharacteristicClass )
                    {
                    // InternalDSL.g:560:2: ( ruleCharacteristicClass )
                    // InternalDSL.g:561:3: ruleCharacteristicClass
                    {
                     before(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:566:2: ( ruleConstraint )
                    {
                    // InternalDSL.g:566:2: ( ruleConstraint )
                    // InternalDSL.g:567:3: ruleConstraint
                    {
                     before(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:572:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    {
                    // InternalDSL.g:572:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    // InternalDSL.g:573:3: ( rule__AbstractElement__Group_4__0 )
                    {
                     before(grammarAccess.getAbstractElementAccess().getGroup_4()); 
                    // InternalDSL.g:574:3: ( rule__AbstractElement__Group_4__0 )
                    // InternalDSL.g:574:4: rule__AbstractElement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractElement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractElementAccess().getGroup_4()); 

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


    // $ANTLR start "rule__CharacteristicTypeSelector__Alternatives_2"
    // InternalDSL.g:582:1: rule__CharacteristicTypeSelector__Alternatives_2 : ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) );
    public final void rule__CharacteristicTypeSelector__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:586:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:587:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    {
                    // InternalDSL.g:587:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    // InternalDSL.g:588:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_0()); 
                    // InternalDSL.g:589:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    // InternalDSL.g:589:4: rule__CharacteristicTypeSelector__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicTypeSelector__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:593:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    {
                    // InternalDSL.g:593:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    // InternalDSL.g:594:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 
                    // InternalDSL.g:595:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    // InternalDSL.g:595:4: rule__CharacteristicTypeSelector__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicTypeSelector__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Alternatives_2"


    // $ANTLR start "rule__DataSelector__Alternatives"
    // InternalDSL.g:603:1: rule__DataSelector__Alternatives : ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) );
    public final void rule__DataSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:607:1: ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:608:2: ( ruleAttributeSelector )
                    {
                    // InternalDSL.g:608:2: ( ruleAttributeSelector )
                    // InternalDSL.g:609:3: ruleAttributeSelector
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
                    // InternalDSL.g:614:2: ( ruleAttributeClassSelector )
                    {
                    // InternalDSL.g:614:2: ( ruleAttributeClassSelector )
                    // InternalDSL.g:615:3: ruleAttributeClassSelector
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
    // InternalDSL.g:624:1: rule__DestinationSelector__Alternatives : ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) );
    public final void rule__DestinationSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:628:1: ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 32:
            case 33:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDSL.g:629:2: ( rulePropertySelector )
                    {
                    // InternalDSL.g:629:2: ( rulePropertySelector )
                    // InternalDSL.g:630:3: rulePropertySelector
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
                    // InternalDSL.g:635:2: ( rulePropertyClassSelector )
                    {
                    // InternalDSL.g:635:2: ( rulePropertyClassSelector )
                    // InternalDSL.g:636:3: rulePropertyClassSelector
                    {
                     before(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyClassSelector();

                    state._fsp--;

                     after(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:641:2: ( ruleNodeIdentitiySelector )
                    {
                    // InternalDSL.g:641:2: ( ruleNodeIdentitiySelector )
                    // InternalDSL.g:642:3: ruleNodeIdentitiySelector
                    {
                     before(grammarAccess.getDestinationSelectorAccess().getNodeIdentitiySelectorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeIdentitiySelector();

                    state._fsp--;

                     after(grammarAccess.getDestinationSelectorAccess().getNodeIdentitiySelectorParserRuleCall_2()); 

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


    // $ANTLR start "rule__NodeIdentitiySelector__Alternatives"
    // InternalDSL.g:651:1: rule__NodeIdentitiySelector__Alternatives : ( ( ( rule__NodeIdentitiySelector__Group_0__0 ) ) | ( ( rule__NodeIdentitiySelector__Group_1__0 ) ) );
    public final void rule__NodeIdentitiySelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:655:1: ( ( ( rule__NodeIdentitiySelector__Group_0__0 ) ) | ( ( rule__NodeIdentitiySelector__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:656:2: ( ( rule__NodeIdentitiySelector__Group_0__0 ) )
                    {
                    // InternalDSL.g:656:2: ( ( rule__NodeIdentitiySelector__Group_0__0 ) )
                    // InternalDSL.g:657:3: ( rule__NodeIdentitiySelector__Group_0__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_0()); 
                    // InternalDSL.g:658:3: ( rule__NodeIdentitiySelector__Group_0__0 )
                    // InternalDSL.g:658:4: rule__NodeIdentitiySelector__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeIdentitiySelector__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:662:2: ( ( rule__NodeIdentitiySelector__Group_1__0 ) )
                    {
                    // InternalDSL.g:662:2: ( ( rule__NodeIdentitiySelector__Group_1__0 ) )
                    // InternalDSL.g:663:3: ( rule__NodeIdentitiySelector__Group_1__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_1()); 
                    // InternalDSL.g:664:3: ( rule__NodeIdentitiySelector__Group_1__0 )
                    // InternalDSL.g:664:4: rule__NodeIdentitiySelector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeIdentitiySelector__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Alternatives"


    // $ANTLR start "rule__TargetModelType__Alternatives"
    // InternalDSL.g:672:1: rule__TargetModelType__Alternatives : ( ( ( 'OperationModel' ) ) | ( ( 'DataCentricPalladio' ) ) | ( ( 'ExtendedDFD' ) ) );
    public final void rule__TargetModelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:676:1: ( ( ( 'OperationModel' ) ) | ( ( 'DataCentricPalladio' ) ) | ( ( 'ExtendedDFD' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDSL.g:677:2: ( ( 'OperationModel' ) )
                    {
                    // InternalDSL.g:677:2: ( ( 'OperationModel' ) )
                    // InternalDSL.g:678:3: ( 'OperationModel' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:679:3: ( 'OperationModel' )
                    // InternalDSL.g:679:4: 'OperationModel'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:683:2: ( ( 'DataCentricPalladio' ) )
                    {
                    // InternalDSL.g:683:2: ( ( 'DataCentricPalladio' ) )
                    // InternalDSL.g:684:3: ( 'DataCentricPalladio' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:685:3: ( 'DataCentricPalladio' )
                    // InternalDSL.g:685:4: 'DataCentricPalladio'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:689:2: ( ( 'ExtendedDFD' ) )
                    {
                    // InternalDSL.g:689:2: ( ( 'ExtendedDFD' ) )
                    // InternalDSL.g:690:3: ( 'ExtendedDFD' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:691:3: ( 'ExtendedDFD' )
                    // InternalDSL.g:691:4: 'ExtendedDFD'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TargetModelType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDSL.g:699:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:703:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDSL.g:704:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDSL.g:711:1: rule__Model__Group__0__Impl : ( ( rule__Model__TargetModelTypeAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:715:1: ( ( ( rule__Model__TargetModelTypeAssignment_0 )? ) )
            // InternalDSL.g:716:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            {
            // InternalDSL.g:716:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            // InternalDSL.g:717:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getTargetModelTypeAssignment_0()); 
            // InternalDSL.g:718:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:718:3: rule__Model__TargetModelTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__TargetModelTypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getTargetModelTypeAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDSL.g:726:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:730:1: ( rule__Model__Group__1__Impl )
            // InternalDSL.g:731:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDSL.g:737:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:741:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDSL.g:742:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDSL.g:742:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDSL.g:743:2: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDSL.g:744:2: ( rule__Model__ElementsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SL_COMMENT||LA8_0==17||LA8_0==19||(LA8_0>=25 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:744:3: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group__0"
    // InternalDSL.g:753:1: rule__TargetModelTypeDef__Group__0 : rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 ;
    public final void rule__TargetModelTypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:757:1: ( rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 )
            // InternalDSL.g:758:2: rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__TargetModelTypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__1();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__0"


    // $ANTLR start "rule__TargetModelTypeDef__Group__0__Impl"
    // InternalDSL.g:765:1: rule__TargetModelTypeDef__Group__0__Impl : ( 'target' ) ;
    public final void rule__TargetModelTypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:769:1: ( ( 'target' ) )
            // InternalDSL.g:770:1: ( 'target' )
            {
            // InternalDSL.g:770:1: ( 'target' )
            // InternalDSL.g:771:2: 'target'
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTargetKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getTargetKeyword_0()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__0__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group__1"
    // InternalDSL.g:780:1: rule__TargetModelTypeDef__Group__1 : rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2 ;
    public final void rule__TargetModelTypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:784:1: ( rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2 )
            // InternalDSL.g:785:2: rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__TargetModelTypeDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__2();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__1"


    // $ANTLR start "rule__TargetModelTypeDef__Group__1__Impl"
    // InternalDSL.g:792:1: rule__TargetModelTypeDef__Group__1__Impl : ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:796:1: ( ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) )
            // InternalDSL.g:797:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            {
            // InternalDSL.g:797:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            // InternalDSL.g:798:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeAssignment_1()); 
            // InternalDSL.g:799:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            // InternalDSL.g:799:3: rule__TargetModelTypeDef__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__1__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group__2"
    // InternalDSL.g:807:1: rule__TargetModelTypeDef__Group__2 : rule__TargetModelTypeDef__Group__2__Impl ;
    public final void rule__TargetModelTypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:811:1: ( rule__TargetModelTypeDef__Group__2__Impl )
            // InternalDSL.g:812:2: rule__TargetModelTypeDef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__2__Impl();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__2"


    // $ANTLR start "rule__TargetModelTypeDef__Group__2__Impl"
    // InternalDSL.g:818:1: rule__TargetModelTypeDef__Group__2__Impl : ( ( rule__TargetModelTypeDef__Group_2__0 )? ) ;
    public final void rule__TargetModelTypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:822:1: ( ( ( rule__TargetModelTypeDef__Group_2__0 )? ) )
            // InternalDSL.g:823:1: ( ( rule__TargetModelTypeDef__Group_2__0 )? )
            {
            // InternalDSL.g:823:1: ( ( rule__TargetModelTypeDef__Group_2__0 )? )
            // InternalDSL.g:824:2: ( rule__TargetModelTypeDef__Group_2__0 )?
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getGroup_2()); 
            // InternalDSL.g:825:2: ( rule__TargetModelTypeDef__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:825:3: rule__TargetModelTypeDef__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetModelTypeDef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getGroup_2()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__2__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__0"
    // InternalDSL.g:834:1: rule__TargetModelTypeDef__Group_2__0 : rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1 ;
    public final void rule__TargetModelTypeDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:838:1: ( rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1 )
            // InternalDSL.g:839:2: rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__TargetModelTypeDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2__1();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__0"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__0__Impl"
    // InternalDSL.g:846:1: rule__TargetModelTypeDef__Group_2__0__Impl : ( 'using' ) ;
    public final void rule__TargetModelTypeDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:850:1: ( ( 'using' ) )
            // InternalDSL.g:851:1: ( 'using' )
            {
            // InternalDSL.g:851:1: ( 'using' )
            // InternalDSL.g:852:2: 'using'
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsingKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getUsingKeyword_2_0()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__0__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__1"
    // InternalDSL.g:861:1: rule__TargetModelTypeDef__Group_2__1 : rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2 ;
    public final void rule__TargetModelTypeDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:865:1: ( rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2 )
            // InternalDSL.g:866:2: rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__TargetModelTypeDef__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2__2();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__1"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__1__Impl"
    // InternalDSL.g:873:1: rule__TargetModelTypeDef__Group_2__1__Impl : ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:877:1: ( ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) ) )
            // InternalDSL.g:878:1: ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) )
            {
            // InternalDSL.g:878:1: ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) )
            // InternalDSL.g:879:2: ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerAssignment_2_1()); 
            // InternalDSL.g:880:2: ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 )
            // InternalDSL.g:880:3: rule__TargetModelTypeDef__TypeContainerAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__TypeContainerAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerAssignment_2_1()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__1__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__2"
    // InternalDSL.g:888:1: rule__TargetModelTypeDef__Group_2__2 : rule__TargetModelTypeDef__Group_2__2__Impl ;
    public final void rule__TargetModelTypeDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:892:1: ( rule__TargetModelTypeDef__Group_2__2__Impl )
            // InternalDSL.g:893:2: rule__TargetModelTypeDef__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2__2__Impl();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__2"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__2__Impl"
    // InternalDSL.g:899:1: rule__TargetModelTypeDef__Group_2__2__Impl : ( ( rule__TargetModelTypeDef__Group_2_2__0 )? ) ;
    public final void rule__TargetModelTypeDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:903:1: ( ( ( rule__TargetModelTypeDef__Group_2_2__0 )? ) )
            // InternalDSL.g:904:1: ( ( rule__TargetModelTypeDef__Group_2_2__0 )? )
            {
            // InternalDSL.g:904:1: ( ( rule__TargetModelTypeDef__Group_2_2__0 )? )
            // InternalDSL.g:905:2: ( rule__TargetModelTypeDef__Group_2_2__0 )?
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getGroup_2_2()); 
            // InternalDSL.g:906:2: ( rule__TargetModelTypeDef__Group_2_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:906:3: rule__TargetModelTypeDef__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetModelTypeDef__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__2__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__0"
    // InternalDSL.g:915:1: rule__TargetModelTypeDef__Group_2_2__0 : rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1 ;
    public final void rule__TargetModelTypeDef__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:919:1: ( rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1 )
            // InternalDSL.g:920:2: rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1
            {
            pushFollow(FOLLOW_7);
            rule__TargetModelTypeDef__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2_2__1();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__0"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__0__Impl"
    // InternalDSL.g:927:1: rule__TargetModelTypeDef__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:931:1: ( ( ',' ) )
            // InternalDSL.g:932:1: ( ',' )
            {
            // InternalDSL.g:932:1: ( ',' )
            // InternalDSL.g:933:2: ','
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__0__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__1"
    // InternalDSL.g:942:1: rule__TargetModelTypeDef__Group_2_2__1 : rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2 ;
    public final void rule__TargetModelTypeDef__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:946:1: ( rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2 )
            // InternalDSL.g:947:2: rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2
            {
            pushFollow(FOLLOW_8);
            rule__TargetModelTypeDef__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2_2__2();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__1"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__1__Impl"
    // InternalDSL.g:954:1: rule__TargetModelTypeDef__Group_2_2__1__Impl : ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:958:1: ( ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) ) )
            // InternalDSL.g:959:1: ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) )
            {
            // InternalDSL.g:959:1: ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) )
            // InternalDSL.g:960:2: ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAssignment_2_2_1()); 
            // InternalDSL.g:961:2: ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 )
            // InternalDSL.g:961:3: rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAssignment_2_2_1()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__1__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__2"
    // InternalDSL.g:969:1: rule__TargetModelTypeDef__Group_2_2__2 : rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3 ;
    public final void rule__TargetModelTypeDef__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:973:1: ( rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3 )
            // InternalDSL.g:974:2: rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3
            {
            pushFollow(FOLLOW_7);
            rule__TargetModelTypeDef__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2_2__3();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__2"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__2__Impl"
    // InternalDSL.g:981:1: rule__TargetModelTypeDef__Group_2_2__2__Impl : ( ',' ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:985:1: ( ( ',' ) )
            // InternalDSL.g:986:1: ( ',' )
            {
            // InternalDSL.g:986:1: ( ',' )
            // InternalDSL.g:987:2: ','
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_2()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__2__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__3"
    // InternalDSL.g:996:1: rule__TargetModelTypeDef__Group_2_2__3 : rule__TargetModelTypeDef__Group_2_2__3__Impl ;
    public final void rule__TargetModelTypeDef__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1000:1: ( rule__TargetModelTypeDef__Group_2_2__3__Impl )
            // InternalDSL.g:1001:2: rule__TargetModelTypeDef__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2_2__3__Impl();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__3"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__3__Impl"
    // InternalDSL.g:1007:1: rule__TargetModelTypeDef__Group_2_2__3__Impl : ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1011:1: ( ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) ) )
            // InternalDSL.g:1012:1: ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) )
            {
            // InternalDSL.g:1012:1: ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) )
            // InternalDSL.g:1013:2: ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsageModelAssignment_2_2_3()); 
            // InternalDSL.g:1014:2: ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 )
            // InternalDSL.g:1014:3: rule__TargetModelTypeDef__UsageModelAssignment_2_2_3
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__UsageModelAssignment_2_2_3();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getUsageModelAssignment_2_2_3()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__3__Impl"


    // $ANTLR start "rule__AbstractElement__Group_4__0"
    // InternalDSL.g:1023:1: rule__AbstractElement__Group_4__0 : rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 ;
    public final void rule__AbstractElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1027:1: ( rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 )
            // InternalDSL.g:1028:2: rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__AbstractElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractElement__Group_4__1();

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
    // $ANTLR end "rule__AbstractElement__Group_4__0"


    // $ANTLR start "rule__AbstractElement__Group_4__0__Impl"
    // InternalDSL.g:1035:1: rule__AbstractElement__Group_4__0__Impl : ( () ) ;
    public final void rule__AbstractElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1039:1: ( ( () ) )
            // InternalDSL.g:1040:1: ( () )
            {
            // InternalDSL.g:1040:1: ( () )
            // InternalDSL.g:1041:2: ()
            {
             before(grammarAccess.getAbstractElementAccess().getAbstractElementAction_4_0()); 
            // InternalDSL.g:1042:2: ()
            // InternalDSL.g:1042:3: 
            {
            }

             after(grammarAccess.getAbstractElementAccess().getAbstractElementAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Group_4__0__Impl"


    // $ANTLR start "rule__AbstractElement__Group_4__1"
    // InternalDSL.g:1050:1: rule__AbstractElement__Group_4__1 : rule__AbstractElement__Group_4__1__Impl ;
    public final void rule__AbstractElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1054:1: ( rule__AbstractElement__Group_4__1__Impl )
            // InternalDSL.g:1055:2: rule__AbstractElement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Group_4__1__Impl();

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
    // $ANTLR end "rule__AbstractElement__Group_4__1"


    // $ANTLR start "rule__AbstractElement__Group_4__1__Impl"
    // InternalDSL.g:1061:1: rule__AbstractElement__Group_4__1__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__AbstractElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1065:1: ( ( RULE_SL_COMMENT ) )
            // InternalDSL.g:1066:1: ( RULE_SL_COMMENT )
            {
            // InternalDSL.g:1066:1: ( RULE_SL_COMMENT )
            // InternalDSL.g:1067:2: RULE_SL_COMMENT
            {
             before(grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_4_1()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__AbstractElement__Group_4__1__Impl"


    // $ANTLR start "rule__CharacteristicType__Group__0"
    // InternalDSL.g:1077:1: rule__CharacteristicType__Group__0 : rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 ;
    public final void rule__CharacteristicType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1081:1: ( rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 )
            // InternalDSL.g:1082:2: rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CharacteristicType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicType__Group__1();

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
    // $ANTLR end "rule__CharacteristicType__Group__0"


    // $ANTLR start "rule__CharacteristicType__Group__0__Impl"
    // InternalDSL.g:1089:1: rule__CharacteristicType__Group__0__Impl : ( 'type' ) ;
    public final void rule__CharacteristicType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1093:1: ( ( 'type' ) )
            // InternalDSL.g:1094:1: ( 'type' )
            {
            // InternalDSL.g:1094:1: ( 'type' )
            // InternalDSL.g:1095:2: 'type'
            {
             before(grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__CharacteristicType__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicType__Group__1"
    // InternalDSL.g:1104:1: rule__CharacteristicType__Group__1 : rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 ;
    public final void rule__CharacteristicType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1108:1: ( rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 )
            // InternalDSL.g:1109:2: rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CharacteristicType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicType__Group__2();

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
    // $ANTLR end "rule__CharacteristicType__Group__1"


    // $ANTLR start "rule__CharacteristicType__Group__1__Impl"
    // InternalDSL.g:1116:1: rule__CharacteristicType__Group__1__Impl : ( ( rule__CharacteristicType__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1120:1: ( ( ( rule__CharacteristicType__NameAssignment_1 ) ) )
            // InternalDSL.g:1121:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1121:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            // InternalDSL.g:1122:2: ( rule__CharacteristicType__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1123:2: ( rule__CharacteristicType__NameAssignment_1 )
            // InternalDSL.g:1123:3: rule__CharacteristicType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CharacteristicType__Group__1__Impl"


    // $ANTLR start "rule__CharacteristicType__Group__2"
    // InternalDSL.g:1131:1: rule__CharacteristicType__Group__2 : rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 ;
    public final void rule__CharacteristicType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1135:1: ( rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 )
            // InternalDSL.g:1136:2: rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__CharacteristicType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicType__Group__3();

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
    // $ANTLR end "rule__CharacteristicType__Group__2"


    // $ANTLR start "rule__CharacteristicType__Group__2__Impl"
    // InternalDSL.g:1143:1: rule__CharacteristicType__Group__2__Impl : ( ':' ) ;
    public final void rule__CharacteristicType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1147:1: ( ( ':' ) )
            // InternalDSL.g:1148:1: ( ':' )
            {
            // InternalDSL.g:1148:1: ( ':' )
            // InternalDSL.g:1149:2: ':'
            {
             before(grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__CharacteristicType__Group__2__Impl"


    // $ANTLR start "rule__CharacteristicType__Group__3"
    // InternalDSL.g:1158:1: rule__CharacteristicType__Group__3 : rule__CharacteristicType__Group__3__Impl ;
    public final void rule__CharacteristicType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1162:1: ( rule__CharacteristicType__Group__3__Impl )
            // InternalDSL.g:1163:2: rule__CharacteristicType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicType__Group__3__Impl();

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
    // $ANTLR end "rule__CharacteristicType__Group__3"


    // $ANTLR start "rule__CharacteristicType__Group__3__Impl"
    // InternalDSL.g:1169:1: rule__CharacteristicType__Group__3__Impl : ( ( rule__CharacteristicType__RefAssignment_3 ) ) ;
    public final void rule__CharacteristicType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1173:1: ( ( ( rule__CharacteristicType__RefAssignment_3 ) ) )
            // InternalDSL.g:1174:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            {
            // InternalDSL.g:1174:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            // InternalDSL.g:1175:2: ( rule__CharacteristicType__RefAssignment_3 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefAssignment_3()); 
            // InternalDSL.g:1176:2: ( rule__CharacteristicType__RefAssignment_3 )
            // InternalDSL.g:1176:3: rule__CharacteristicType__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicType__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeAccess().getRefAssignment_3()); 

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
    // $ANTLR end "rule__CharacteristicType__Group__3__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__0"
    // InternalDSL.g:1185:1: rule__CharacteristicClass__Group__0 : rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 ;
    public final void rule__CharacteristicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1189:1: ( rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 )
            // InternalDSL.g:1190:2: rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:1197:1: rule__CharacteristicClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__CharacteristicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1201:1: ( ( 'class' ) )
            // InternalDSL.g:1202:1: ( 'class' )
            {
            // InternalDSL.g:1202:1: ( 'class' )
            // InternalDSL.g:1203:2: 'class'
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
    // InternalDSL.g:1212:1: rule__CharacteristicClass__Group__1 : rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 ;
    public final void rule__CharacteristicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1216:1: ( rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 )
            // InternalDSL.g:1217:2: rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2
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
    // InternalDSL.g:1224:1: rule__CharacteristicClass__Group__1__Impl : ( ( rule__CharacteristicClass__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1228:1: ( ( ( rule__CharacteristicClass__NameAssignment_1 ) ) )
            // InternalDSL.g:1229:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            {
            // InternalDSL.g:1229:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            // InternalDSL.g:1230:2: ( rule__CharacteristicClass__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 
            // InternalDSL.g:1231:2: ( rule__CharacteristicClass__NameAssignment_1 )
            // InternalDSL.g:1231:3: rule__CharacteristicClass__NameAssignment_1
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
    // InternalDSL.g:1239:1: rule__CharacteristicClass__Group__2 : rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 ;
    public final void rule__CharacteristicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1243:1: ( rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 )
            // InternalDSL.g:1244:2: rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:1251:1: rule__CharacteristicClass__Group__2__Impl : ( '{' ) ;
    public final void rule__CharacteristicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1255:1: ( ( '{' ) )
            // InternalDSL.g:1256:1: ( '{' )
            {
            // InternalDSL.g:1256:1: ( '{' )
            // InternalDSL.g:1257:2: '{'
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
    // InternalDSL.g:1266:1: rule__CharacteristicClass__Group__3 : rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 ;
    public final void rule__CharacteristicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1270:1: ( rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 )
            // InternalDSL.g:1271:2: rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4
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
    // InternalDSL.g:1278:1: rule__CharacteristicClass__Group__3__Impl : ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) ;
    public final void rule__CharacteristicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1282:1: ( ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) )
            // InternalDSL.g:1283:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            {
            // InternalDSL.g:1283:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            // InternalDSL.g:1284:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 
            // InternalDSL.g:1285:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            // InternalDSL.g:1285:3: rule__CharacteristicClass__MembersAssignment_3
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
    // InternalDSL.g:1293:1: rule__CharacteristicClass__Group__4 : rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 ;
    public final void rule__CharacteristicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1297:1: ( rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 )
            // InternalDSL.g:1298:2: rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5
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
    // InternalDSL.g:1305:1: rule__CharacteristicClass__Group__4__Impl : ( ( rule__CharacteristicClass__Group_4__0 )* ) ;
    public final void rule__CharacteristicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1309:1: ( ( ( rule__CharacteristicClass__Group_4__0 )* ) )
            // InternalDSL.g:1310:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            {
            // InternalDSL.g:1310:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            // InternalDSL.g:1311:2: ( rule__CharacteristicClass__Group_4__0 )*
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 
            // InternalDSL.g:1312:2: ( rule__CharacteristicClass__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:1312:3: rule__CharacteristicClass__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalDSL.g:1320:1: rule__CharacteristicClass__Group__5 : rule__CharacteristicClass__Group__5__Impl ;
    public final void rule__CharacteristicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1324:1: ( rule__CharacteristicClass__Group__5__Impl )
            // InternalDSL.g:1325:2: rule__CharacteristicClass__Group__5__Impl
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
    // InternalDSL.g:1331:1: rule__CharacteristicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__CharacteristicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1335:1: ( ( '}' ) )
            // InternalDSL.g:1336:1: ( '}' )
            {
            // InternalDSL.g:1336:1: ( '}' )
            // InternalDSL.g:1337:2: '}'
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
    // InternalDSL.g:1347:1: rule__CharacteristicClass__Group_4__0 : rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 ;
    public final void rule__CharacteristicClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1351:1: ( rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 )
            // InternalDSL.g:1352:2: rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:1359:1: rule__CharacteristicClass__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1363:1: ( ( ',' ) )
            // InternalDSL.g:1364:1: ( ',' )
            {
            // InternalDSL.g:1364:1: ( ',' )
            // InternalDSL.g:1365:2: ','
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
    // InternalDSL.g:1374:1: rule__CharacteristicClass__Group_4__1 : rule__CharacteristicClass__Group_4__1__Impl ;
    public final void rule__CharacteristicClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1378:1: ( rule__CharacteristicClass__Group_4__1__Impl )
            // InternalDSL.g:1379:2: rule__CharacteristicClass__Group_4__1__Impl
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
    // InternalDSL.g:1385:1: rule__CharacteristicClass__Group_4__1__Impl : ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) ;
    public final void rule__CharacteristicClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1389:1: ( ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) )
            // InternalDSL.g:1390:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            {
            // InternalDSL.g:1390:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            // InternalDSL.g:1391:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 
            // InternalDSL.g:1392:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            // InternalDSL.g:1392:3: rule__CharacteristicClass__MembersAssignment_4_1
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


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__0"
    // InternalDSL.g:1401:1: rule__CharacteristicTypeSelector__Group__0 : rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 ;
    public final void rule__CharacteristicTypeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1405:1: ( rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 )
            // InternalDSL.g:1406:2: rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__CharacteristicTypeSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group__1();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__0"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__0__Impl"
    // InternalDSL.g:1413:1: rule__CharacteristicTypeSelector__Group__0__Impl : ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1417:1: ( ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) )
            // InternalDSL.g:1418:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            {
            // InternalDSL.g:1418:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            // InternalDSL.g:1419:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefAssignment_0()); 
            // InternalDSL.g:1420:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            // InternalDSL.g:1420:3: rule__CharacteristicTypeSelector__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getRefAssignment_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__1"
    // InternalDSL.g:1428:1: rule__CharacteristicTypeSelector__Group__1 : rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 ;
    public final void rule__CharacteristicTypeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1432:1: ( rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 )
            // InternalDSL.g:1433:2: rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__CharacteristicTypeSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group__2();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__1"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__1__Impl"
    // InternalDSL.g:1440:1: rule__CharacteristicTypeSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__CharacteristicTypeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1444:1: ( ( '.' ) )
            // InternalDSL.g:1445:1: ( '.' )
            {
            // InternalDSL.g:1445:1: ( '.' )
            // InternalDSL.g:1446:2: '.'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__1__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__2"
    // InternalDSL.g:1455:1: rule__CharacteristicTypeSelector__Group__2 : rule__CharacteristicTypeSelector__Group__2__Impl ;
    public final void rule__CharacteristicTypeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1459:1: ( rule__CharacteristicTypeSelector__Group__2__Impl )
            // InternalDSL.g:1460:2: rule__CharacteristicTypeSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group__2__Impl();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__2"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__2__Impl"
    // InternalDSL.g:1466:1: rule__CharacteristicTypeSelector__Group__2__Impl : ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1470:1: ( ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) )
            // InternalDSL.g:1471:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            {
            // InternalDSL.g:1471:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            // InternalDSL.g:1472:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2()); 
            // InternalDSL.g:1473:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            // InternalDSL.g:1473:3: rule__CharacteristicTypeSelector__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__2__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_0__0"
    // InternalDSL.g:1482:1: rule__CharacteristicTypeSelector__Group_2_0__0 : rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1486:1: ( rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 )
            // InternalDSL.g:1487:2: rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1
            {
            pushFollow(FOLLOW_15);
            rule__CharacteristicTypeSelector__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_0__1();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_0__0"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_0__0__Impl"
    // InternalDSL.g:1494:1: rule__CharacteristicTypeSelector__Group_2_0__0__Impl : ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1498:1: ( ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) )
            // InternalDSL.g:1499:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            {
            // InternalDSL.g:1499:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            // InternalDSL.g:1500:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedAssignment_2_0_0()); 
            // InternalDSL.g:1501:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1501:3: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedAssignment_2_0_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_0__0__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_0__1"
    // InternalDSL.g:1509:1: rule__CharacteristicTypeSelector__Group_2_0__1 : rule__CharacteristicTypeSelector__Group_2_0__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1513:1: ( rule__CharacteristicTypeSelector__Group_2_0__1__Impl )
            // InternalDSL.g:1514:2: rule__CharacteristicTypeSelector__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_0__1"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_0__1__Impl"
    // InternalDSL.g:1520:1: rule__CharacteristicTypeSelector__Group_2_0__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1524:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) )
            // InternalDSL.g:1525:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            {
            // InternalDSL.g:1525:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            // InternalDSL.g:1526:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_0_1()); 
            // InternalDSL.g:1527:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            // InternalDSL.g:1527:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_0_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_0__1__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__0"
    // InternalDSL.g:1536:1: rule__CharacteristicTypeSelector__Group_2_1__0 : rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1540:1: ( rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 )
            // InternalDSL.g:1541:2: rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__CharacteristicTypeSelector__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1__1();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__0"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__0__Impl"
    // InternalDSL.g:1548:1: rule__CharacteristicTypeSelector__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1552:1: ( ( '[' ) )
            // InternalDSL.g:1553:1: ( '[' )
            {
            // InternalDSL.g:1553:1: ( '[' )
            // InternalDSL.g:1554:2: '['
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__0__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__1"
    // InternalDSL.g:1563:1: rule__CharacteristicTypeSelector__Group_2_1__1 : rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1567:1: ( rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 )
            // InternalDSL.g:1568:2: rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2
            {
            pushFollow(FOLLOW_16);
            rule__CharacteristicTypeSelector__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1__2();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__1"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__1__Impl"
    // InternalDSL.g:1575:1: rule__CharacteristicTypeSelector__Group_2_1__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1579:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) )
            // InternalDSL.g:1580:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            {
            // InternalDSL.g:1580:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            // InternalDSL.g:1581:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_1()); 
            // InternalDSL.g:1582:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            // InternalDSL.g:1582:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__1__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__2"
    // InternalDSL.g:1590:1: rule__CharacteristicTypeSelector__Group_2_1__2 : rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1594:1: ( rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 )
            // InternalDSL.g:1595:2: rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3
            {
            pushFollow(FOLLOW_16);
            rule__CharacteristicTypeSelector__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1__3();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__2"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__2__Impl"
    // InternalDSL.g:1602:1: rule__CharacteristicTypeSelector__Group_2_1__2__Impl : ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1606:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) )
            // InternalDSL.g:1607:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            {
            // InternalDSL.g:1607:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            // InternalDSL.g:1608:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2()); 
            // InternalDSL.g:1609:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1609:3: rule__CharacteristicTypeSelector__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CharacteristicTypeSelector__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__2__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__3"
    // InternalDSL.g:1617:1: rule__CharacteristicTypeSelector__Group_2_1__3 : rule__CharacteristicTypeSelector__Group_2_1__3__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1621:1: ( rule__CharacteristicTypeSelector__Group_2_1__3__Impl )
            // InternalDSL.g:1622:2: rule__CharacteristicTypeSelector__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__3"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__3__Impl"
    // InternalDSL.g:1628:1: rule__CharacteristicTypeSelector__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1632:1: ( ( ']' ) )
            // InternalDSL.g:1633:1: ( ']' )
            {
            // InternalDSL.g:1633:1: ( ']' )
            // InternalDSL.g:1634:2: ']'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__3__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1_2__0"
    // InternalDSL.g:1644:1: rule__CharacteristicTypeSelector__Group_2_1_2__0 : rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1648:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 )
            // InternalDSL.g:1649:2: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1
            {
            pushFollow(FOLLOW_7);
            rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1_2__1();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1_2__0"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl"
    // InternalDSL.g:1656:1: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1660:1: ( ( ',' ) )
            // InternalDSL.g:1661:1: ( ',' )
            {
            // InternalDSL.g:1661:1: ( ',' )
            // InternalDSL.g:1662:2: ','
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1_2__1"
    // InternalDSL.g:1671:1: rule__CharacteristicTypeSelector__Group_2_1_2__1 : rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1675:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl )
            // InternalDSL.g:1676:2: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1_2__1"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl"
    // InternalDSL.g:1682:1: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1686:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) )
            // InternalDSL.g:1687:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            {
            // InternalDSL.g:1687:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            // InternalDSL.g:1688:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_1()); 
            // InternalDSL.g:1689:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            // InternalDSL.g:1689:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // InternalDSL.g:1698:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1702:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalDSL.g:1703:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__1();

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
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // InternalDSL.g:1710:1: rule__Include__Group__0__Impl : ( 'import' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1714:1: ( ( 'import' ) )
            // InternalDSL.g:1715:1: ( 'import' )
            {
            // InternalDSL.g:1715:1: ( 'import' )
            // InternalDSL.g:1716:2: 'import'
            {
             before(grammarAccess.getIncludeAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // InternalDSL.g:1725:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1729:1: ( rule__Include__Group__1__Impl )
            // InternalDSL.g:1730:2: rule__Include__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__1__Impl();

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
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // InternalDSL.g:1736:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1740:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // InternalDSL.g:1741:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // InternalDSL.g:1741:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // InternalDSL.g:1742:2: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // InternalDSL.g:1743:2: ( rule__Include__ImportURIAssignment_1 )
            // InternalDSL.g:1743:3: rule__Include__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Include__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalDSL.g:1752:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1756:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDSL.g:1757:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:1764:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1768:1: ( ( 'constraint' ) )
            // InternalDSL.g:1769:1: ( 'constraint' )
            {
            // InternalDSL.g:1769:1: ( 'constraint' )
            // InternalDSL.g:1770:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:1779:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1783:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDSL.g:1784:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalDSL.g:1791:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1795:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDSL.g:1796:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDSL.g:1796:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDSL.g:1797:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDSL.g:1798:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDSL.g:1798:3: rule__Constraint__NameAssignment_1
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
    // InternalDSL.g:1806:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1810:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDSL.g:1811:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
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
    // InternalDSL.g:1818:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1822:1: ( ( '{' ) )
            // InternalDSL.g:1823:1: ( '{' )
            {
            // InternalDSL.g:1823:1: ( '{' )
            // InternalDSL.g:1824:2: '{'
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
    // InternalDSL.g:1833:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1837:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDSL.g:1838:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
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
    // InternalDSL.g:1845:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__RuleAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1849:1: ( ( ( rule__Constraint__RuleAssignment_3 ) ) )
            // InternalDSL.g:1850:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            {
            // InternalDSL.g:1850:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            // InternalDSL.g:1851:2: ( rule__Constraint__RuleAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 
            // InternalDSL.g:1852:2: ( rule__Constraint__RuleAssignment_3 )
            // InternalDSL.g:1852:3: rule__Constraint__RuleAssignment_3
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
    // InternalDSL.g:1860:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1864:1: ( rule__Constraint__Group__4__Impl )
            // InternalDSL.g:1865:2: rule__Constraint__Group__4__Impl
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
    // InternalDSL.g:1871:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1875:1: ( ( '}' ) )
            // InternalDSL.g:1876:1: ( '}' )
            {
            // InternalDSL.g:1876:1: ( '}' )
            // InternalDSL.g:1877:2: '}'
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
    // InternalDSL.g:1887:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1891:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDSL.g:1892:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalDSL.g:1899:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DataSelectorsAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1903:1: ( ( ( rule__Rule__DataSelectorsAssignment_0 ) ) )
            // InternalDSL.g:1904:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            {
            // InternalDSL.g:1904:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            // InternalDSL.g:1905:2: ( rule__Rule__DataSelectorsAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 
            // InternalDSL.g:1906:2: ( rule__Rule__DataSelectorsAssignment_0 )
            // InternalDSL.g:1906:3: rule__Rule__DataSelectorsAssignment_0
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
    // InternalDSL.g:1914:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1918:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDSL.g:1919:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalDSL.g:1926:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1930:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // InternalDSL.g:1931:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // InternalDSL.g:1931:1: ( ( rule__Rule__Group_1__0 )* )
            // InternalDSL.g:1932:2: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // InternalDSL.g:1933:2: ( rule__Rule__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:1933:3: rule__Rule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Rule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDSL.g:1941:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1945:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDSL.g:1946:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:1953:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__StatementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1957:1: ( ( ( rule__Rule__StatementAssignment_2 ) ) )
            // InternalDSL.g:1958:1: ( ( rule__Rule__StatementAssignment_2 ) )
            {
            // InternalDSL.g:1958:1: ( ( rule__Rule__StatementAssignment_2 ) )
            // InternalDSL.g:1959:2: ( rule__Rule__StatementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getStatementAssignment_2()); 
            // InternalDSL.g:1960:2: ( rule__Rule__StatementAssignment_2 )
            // InternalDSL.g:1960:3: rule__Rule__StatementAssignment_2
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
    // InternalDSL.g:1968:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1972:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDSL.g:1973:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalDSL.g:1980:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1984:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) )
            // InternalDSL.g:1985:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            {
            // InternalDSL.g:1985:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            // InternalDSL.g:1986:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 
            // InternalDSL.g:1987:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            // InternalDSL.g:1987:3: rule__Rule__DestinationSelectorsAssignment_3
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
    // InternalDSL.g:1995:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1999:1: ( rule__Rule__Group__4__Impl )
            // InternalDSL.g:2000:2: rule__Rule__Group__4__Impl
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
    // InternalDSL.g:2006:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2010:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // InternalDSL.g:2011:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // InternalDSL.g:2011:1: ( ( rule__Rule__Group_4__0 )* )
            // InternalDSL.g:2012:2: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalDSL.g:2013:2: ( rule__Rule__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDSL.g:2013:3: rule__Rule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Rule__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDSL.g:2022:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2026:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalDSL.g:2027:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
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
    // InternalDSL.g:2034:1: rule__Rule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2038:1: ( ( '&' ) )
            // InternalDSL.g:2039:1: ( '&' )
            {
            // InternalDSL.g:2039:1: ( '&' )
            // InternalDSL.g:2040:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDSL.g:2049:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2053:1: ( rule__Rule__Group_1__1__Impl )
            // InternalDSL.g:2054:2: rule__Rule__Group_1__1__Impl
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
    // InternalDSL.g:2060:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2064:1: ( ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) )
            // InternalDSL.g:2065:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            {
            // InternalDSL.g:2065:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            // InternalDSL.g:2066:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 
            // InternalDSL.g:2067:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            // InternalDSL.g:2067:3: rule__Rule__DataSelectorsAssignment_1_1
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
    // InternalDSL.g:2076:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2080:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalDSL.g:2081:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:2088:1: rule__Rule__Group_4__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2092:1: ( ( '&' ) )
            // InternalDSL.g:2093:1: ( '&' )
            {
            // InternalDSL.g:2093:1: ( '&' )
            // InternalDSL.g:2094:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDSL.g:2103:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2107:1: ( rule__Rule__Group_4__1__Impl )
            // InternalDSL.g:2108:2: rule__Rule__Group_4__1__Impl
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
    // InternalDSL.g:2114:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2118:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) )
            // InternalDSL.g:2119:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            {
            // InternalDSL.g:2119:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            // InternalDSL.g:2120:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 
            // InternalDSL.g:2121:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            // InternalDSL.g:2121:3: rule__Rule__DestinationSelectorsAssignment_4_1
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
    // InternalDSL.g:2130:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2134:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // InternalDSL.g:2135:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2142:1: rule__AttributeSelector__Group__0__Impl : ( 'data.attribute.' ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2146:1: ( ( 'data.attribute.' ) )
            // InternalDSL.g:2147:1: ( 'data.attribute.' )
            {
            // InternalDSL.g:2147:1: ( 'data.attribute.' )
            // InternalDSL.g:2148:2: 'data.attribute.'
            {
             before(grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:2157:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2161:1: ( rule__AttributeSelector__Group__1__Impl )
            // InternalDSL.g:2162:2: rule__AttributeSelector__Group__1__Impl
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
    // InternalDSL.g:2168:1: rule__AttributeSelector__Group__1__Impl : ( ( rule__AttributeSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2172:1: ( ( ( rule__AttributeSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2173:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2173:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            // InternalDSL.g:2174:2: ( rule__AttributeSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2175:2: ( rule__AttributeSelector__RefAssignment_1 )
            // InternalDSL.g:2175:3: rule__AttributeSelector__RefAssignment_1
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
    // InternalDSL.g:2184:1: rule__AttributeClassSelector__Group__0 : rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 ;
    public final void rule__AttributeClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2188:1: ( rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 )
            // InternalDSL.g:2189:2: rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2196:1: rule__AttributeClassSelector__Group__0__Impl : ( 'data.class.' ) ;
    public final void rule__AttributeClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2200:1: ( ( 'data.class.' ) )
            // InternalDSL.g:2201:1: ( 'data.class.' )
            {
            // InternalDSL.g:2201:1: ( 'data.class.' )
            // InternalDSL.g:2202:2: 'data.class.'
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:2211:1: rule__AttributeClassSelector__Group__1 : rule__AttributeClassSelector__Group__1__Impl ;
    public final void rule__AttributeClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2215:1: ( rule__AttributeClassSelector__Group__1__Impl )
            // InternalDSL.g:2216:2: rule__AttributeClassSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__Group__1__Impl();

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
    // InternalDSL.g:2222:1: rule__AttributeClassSelector__Group__1__Impl : ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2226:1: ( ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2227:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2227:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:2228:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2229:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            // InternalDSL.g:2229:3: rule__AttributeClassSelector__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_1()); 

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


    // $ANTLR start "rule__PropertySelector__Group__0"
    // InternalDSL.g:2238:1: rule__PropertySelector__Group__0 : rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 ;
    public final void rule__PropertySelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2242:1: ( rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 )
            // InternalDSL.g:2243:2: rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2250:1: rule__PropertySelector__Group__0__Impl : ( 'node.property.' ) ;
    public final void rule__PropertySelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2254:1: ( ( 'node.property.' ) )
            // InternalDSL.g:2255:1: ( 'node.property.' )
            {
            // InternalDSL.g:2255:1: ( 'node.property.' )
            // InternalDSL.g:2256:2: 'node.property.'
            {
             before(grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:2265:1: rule__PropertySelector__Group__1 : rule__PropertySelector__Group__1__Impl ;
    public final void rule__PropertySelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2269:1: ( rule__PropertySelector__Group__1__Impl )
            // InternalDSL.g:2270:2: rule__PropertySelector__Group__1__Impl
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
    // InternalDSL.g:2276:1: rule__PropertySelector__Group__1__Impl : ( ( rule__PropertySelector__RefAssignment_1 ) ) ;
    public final void rule__PropertySelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2280:1: ( ( ( rule__PropertySelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2281:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2281:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            // InternalDSL.g:2282:2: ( rule__PropertySelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2283:2: ( rule__PropertySelector__RefAssignment_1 )
            // InternalDSL.g:2283:3: rule__PropertySelector__RefAssignment_1
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
    // InternalDSL.g:2292:1: rule__PropertyClassSelector__Group__0 : rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 ;
    public final void rule__PropertyClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2296:1: ( rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 )
            // InternalDSL.g:2297:2: rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2304:1: rule__PropertyClassSelector__Group__0__Impl : ( 'node.class.' ) ;
    public final void rule__PropertyClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2308:1: ( ( 'node.class.' ) )
            // InternalDSL.g:2309:1: ( 'node.class.' )
            {
            // InternalDSL.g:2309:1: ( 'node.class.' )
            // InternalDSL.g:2310:2: 'node.class.'
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:2319:1: rule__PropertyClassSelector__Group__1 : rule__PropertyClassSelector__Group__1__Impl ;
    public final void rule__PropertyClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2323:1: ( rule__PropertyClassSelector__Group__1__Impl )
            // InternalDSL.g:2324:2: rule__PropertyClassSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__Group__1__Impl();

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
    // InternalDSL.g:2330:1: rule__PropertyClassSelector__Group__1__Impl : ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) ;
    public final void rule__PropertyClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2334:1: ( ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2335:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2335:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:2336:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2337:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            // InternalDSL.g:2337:3: rule__PropertyClassSelector__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_1()); 

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


    // $ANTLR start "rule__NodeIdentitiySelector__Group_0__0"
    // InternalDSL.g:2346:1: rule__NodeIdentitiySelector__Group_0__0 : rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1 ;
    public final void rule__NodeIdentitiySelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2350:1: ( rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1 )
            // InternalDSL.g:2351:2: rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__NodeIdentitiySelector__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_0__1();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_0__0"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_0__0__Impl"
    // InternalDSL.g:2358:1: rule__NodeIdentitiySelector__Group_0__0__Impl : ( 'node.name.' ) ;
    public final void rule__NodeIdentitiySelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2362:1: ( ( 'node.name.' ) )
            // InternalDSL.g:2363:1: ( 'node.name.' )
            {
            // InternalDSL.g:2363:1: ( 'node.name.' )
            // InternalDSL.g:2364:2: 'node.name.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_0__0__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_0__1"
    // InternalDSL.g:2373:1: rule__NodeIdentitiySelector__Group_0__1 : rule__NodeIdentitiySelector__Group_0__1__Impl ;
    public final void rule__NodeIdentitiySelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2377:1: ( rule__NodeIdentitiySelector__Group_0__1__Impl )
            // InternalDSL.g:2378:2: rule__NodeIdentitiySelector__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_0__1__Impl();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_0__1"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_0__1__Impl"
    // InternalDSL.g:2384:1: rule__NodeIdentitiySelector__Group_0__1__Impl : ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2388:1: ( ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) ) )
            // InternalDSL.g:2389:1: ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) )
            {
            // InternalDSL.g:2389:1: ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) )
            // InternalDSL.g:2390:2: ( rule__NodeIdentitiySelector__NameAssignment_0_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNameAssignment_0_1()); 
            // InternalDSL.g:2391:2: ( rule__NodeIdentitiySelector__NameAssignment_0_1 )
            // InternalDSL.g:2391:3: rule__NodeIdentitiySelector__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_0__1__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__0"
    // InternalDSL.g:2400:1: rule__NodeIdentitiySelector__Group_1__0 : rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1 ;
    public final void rule__NodeIdentitiySelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2404:1: ( rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1 )
            // InternalDSL.g:2405:2: rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__NodeIdentitiySelector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1__1();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__0"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__0__Impl"
    // InternalDSL.g:2412:1: rule__NodeIdentitiySelector__Group_1__0__Impl : ( 'node.identity.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2416:1: ( ( 'node.identity.' ) )
            // InternalDSL.g:2417:1: ( 'node.identity.' )
            {
            // InternalDSL.g:2417:1: ( 'node.identity.' )
            // InternalDSL.g:2418:2: 'node.identity.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNodeIdentityKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getNodeIdentityKeyword_1_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__0__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__1"
    // InternalDSL.g:2427:1: rule__NodeIdentitiySelector__Group_1__1 : rule__NodeIdentitiySelector__Group_1__1__Impl rule__NodeIdentitiySelector__Group_1__2 ;
    public final void rule__NodeIdentitiySelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2431:1: ( rule__NodeIdentitiySelector__Group_1__1__Impl rule__NodeIdentitiySelector__Group_1__2 )
            // InternalDSL.g:2432:2: rule__NodeIdentitiySelector__Group_1__1__Impl rule__NodeIdentitiySelector__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__NodeIdentitiySelector__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1__2();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__1"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__1__Impl"
    // InternalDSL.g:2439:1: rule__NodeIdentitiySelector__Group_1__1__Impl : ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2443:1: ( ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) ) )
            // InternalDSL.g:2444:1: ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) )
            {
            // InternalDSL.g:2444:1: ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) )
            // InternalDSL.g:2445:2: ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssignment_1_1()); 
            // InternalDSL.g:2446:2: ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 )
            // InternalDSL.g:2446:3: rule__NodeIdentitiySelector__AssemblyAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__AssemblyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssignment_1_1()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__1__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__2"
    // InternalDSL.g:2454:1: rule__NodeIdentitiySelector__Group_1__2 : rule__NodeIdentitiySelector__Group_1__2__Impl rule__NodeIdentitiySelector__Group_1__3 ;
    public final void rule__NodeIdentitiySelector__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2458:1: ( rule__NodeIdentitiySelector__Group_1__2__Impl rule__NodeIdentitiySelector__Group_1__3 )
            // InternalDSL.g:2459:2: rule__NodeIdentitiySelector__Group_1__2__Impl rule__NodeIdentitiySelector__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__NodeIdentitiySelector__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1__3();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__2"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__2__Impl"
    // InternalDSL.g:2466:1: rule__NodeIdentitiySelector__Group_1__2__Impl : ( '.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2470:1: ( ( '.' ) )
            // InternalDSL.g:2471:1: ( '.' )
            {
            // InternalDSL.g:2471:1: ( '.' )
            // InternalDSL.g:2472:2: '.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_2()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__2__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__3"
    // InternalDSL.g:2481:1: rule__NodeIdentitiySelector__Group_1__3 : rule__NodeIdentitiySelector__Group_1__3__Impl rule__NodeIdentitiySelector__Group_1__4 ;
    public final void rule__NodeIdentitiySelector__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2485:1: ( rule__NodeIdentitiySelector__Group_1__3__Impl rule__NodeIdentitiySelector__Group_1__4 )
            // InternalDSL.g:2486:2: rule__NodeIdentitiySelector__Group_1__3__Impl rule__NodeIdentitiySelector__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__NodeIdentitiySelector__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1__4();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__3"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__3__Impl"
    // InternalDSL.g:2493:1: rule__NodeIdentitiySelector__Group_1__3__Impl : ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2497:1: ( ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) ) )
            // InternalDSL.g:2498:1: ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) )
            {
            // InternalDSL.g:2498:1: ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) )
            // InternalDSL.g:2499:2: ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getComponentAssignment_1_3()); 
            // InternalDSL.g:2500:2: ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 )
            // InternalDSL.g:2500:3: rule__NodeIdentitiySelector__ComponentAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__ComponentAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getComponentAssignment_1_3()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__3__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__4"
    // InternalDSL.g:2508:1: rule__NodeIdentitiySelector__Group_1__4 : rule__NodeIdentitiySelector__Group_1__4__Impl rule__NodeIdentitiySelector__Group_1__5 ;
    public final void rule__NodeIdentitiySelector__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2512:1: ( rule__NodeIdentitiySelector__Group_1__4__Impl rule__NodeIdentitiySelector__Group_1__5 )
            // InternalDSL.g:2513:2: rule__NodeIdentitiySelector__Group_1__4__Impl rule__NodeIdentitiySelector__Group_1__5
            {
            pushFollow(FOLLOW_7);
            rule__NodeIdentitiySelector__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1__5();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__4"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__4__Impl"
    // InternalDSL.g:2520:1: rule__NodeIdentitiySelector__Group_1__4__Impl : ( '.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2524:1: ( ( '.' ) )
            // InternalDSL.g:2525:1: ( '.' )
            {
            // InternalDSL.g:2525:1: ( '.' )
            // InternalDSL.g:2526:2: '.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_4()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__4__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__5"
    // InternalDSL.g:2535:1: rule__NodeIdentitiySelector__Group_1__5 : rule__NodeIdentitiySelector__Group_1__5__Impl ;
    public final void rule__NodeIdentitiySelector__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2539:1: ( rule__NodeIdentitiySelector__Group_1__5__Impl )
            // InternalDSL.g:2540:2: rule__NodeIdentitiySelector__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1__5__Impl();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__5"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__5__Impl"
    // InternalDSL.g:2546:1: rule__NodeIdentitiySelector__Group_1__5__Impl : ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2550:1: ( ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) ) )
            // InternalDSL.g:2551:1: ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) )
            {
            // InternalDSL.g:2551:1: ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) )
            // InternalDSL.g:2552:2: ( rule__NodeIdentitiySelector__SeffAssignment_1_5 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getSeffAssignment_1_5()); 
            // InternalDSL.g:2553:2: ( rule__NodeIdentitiySelector__SeffAssignment_1_5 )
            // InternalDSL.g:2553:3: rule__NodeIdentitiySelector__SeffAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__SeffAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getSeffAssignment_1_5()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__5__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalDSL.g:2562:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2566:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalDSL.g:2567:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDSL.g:2574:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__ModalityAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2578:1: ( ( ( rule__Statement__ModalityAssignment_0 ) ) )
            // InternalDSL.g:2579:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            {
            // InternalDSL.g:2579:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            // InternalDSL.g:2580:2: ( rule__Statement__ModalityAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getModalityAssignment_0()); 
            // InternalDSL.g:2581:2: ( rule__Statement__ModalityAssignment_0 )
            // InternalDSL.g:2581:3: rule__Statement__ModalityAssignment_0
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
    // InternalDSL.g:2589:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2593:1: ( rule__Statement__Group__1__Impl )
            // InternalDSL.g:2594:2: rule__Statement__Group__1__Impl
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
    // InternalDSL.g:2600:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__TypeAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2604:1: ( ( ( rule__Statement__TypeAssignment_1 ) ) )
            // InternalDSL.g:2605:1: ( ( rule__Statement__TypeAssignment_1 ) )
            {
            // InternalDSL.g:2605:1: ( ( rule__Statement__TypeAssignment_1 ) )
            // InternalDSL.g:2606:2: ( rule__Statement__TypeAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_1()); 
            // InternalDSL.g:2607:2: ( rule__Statement__TypeAssignment_1 )
            // InternalDSL.g:2607:3: rule__Statement__TypeAssignment_1
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


    // $ANTLR start "rule__Model__TargetModelTypeAssignment_0"
    // InternalDSL.g:2616:1: rule__Model__TargetModelTypeAssignment_0 : ( ruleTargetModelTypeDef ) ;
    public final void rule__Model__TargetModelTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2620:1: ( ( ruleTargetModelTypeDef ) )
            // InternalDSL.g:2621:2: ( ruleTargetModelTypeDef )
            {
            // InternalDSL.g:2621:2: ( ruleTargetModelTypeDef )
            // InternalDSL.g:2622:3: ruleTargetModelTypeDef
            {
             before(grammarAccess.getModelAccess().getTargetModelTypeTargetModelTypeDefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetModelTypeDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTargetModelTypeTargetModelTypeDefParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__TargetModelTypeAssignment_0"


    // $ANTLR start "rule__Model__ElementsAssignment_1"
    // InternalDSL.g:2631:1: rule__Model__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2635:1: ( ( ruleAbstractElement ) )
            // InternalDSL.g:2636:2: ( ruleAbstractElement )
            {
            // InternalDSL.g:2636:2: ( ruleAbstractElement )
            // InternalDSL.g:2637:3: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_1"


    // $ANTLR start "rule__TargetModelTypeDef__TypeAssignment_1"
    // InternalDSL.g:2646:1: rule__TargetModelTypeDef__TypeAssignment_1 : ( ruleTargetModelType ) ;
    public final void rule__TargetModelTypeDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2650:1: ( ( ruleTargetModelType ) )
            // InternalDSL.g:2651:2: ( ruleTargetModelType )
            {
            // InternalDSL.g:2651:2: ( ruleTargetModelType )
            // InternalDSL.g:2652:3: ruleTargetModelType
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeTargetModelTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetModelType();

            state._fsp--;

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeTargetModelTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__TypeAssignment_1"


    // $ANTLR start "rule__TargetModelTypeDef__TypeContainerAssignment_2_1"
    // InternalDSL.g:2661:1: rule__TargetModelTypeDef__TypeContainerAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__TypeContainerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2665:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2666:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2666:2: ( ( RULE_ID ) )
            // InternalDSL.g:2667:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerCharacteristicTypeContainerCrossReference_2_1_0()); 
            // InternalDSL.g:2668:3: ( RULE_ID )
            // InternalDSL.g:2669:4: RULE_ID
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerCharacteristicTypeContainerIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerCharacteristicTypeContainerIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerCharacteristicTypeContainerCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__TypeContainerAssignment_2_1"


    // $ANTLR start "rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1"
    // InternalDSL.g:2680:1: rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2684:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2685:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2685:2: ( ( RULE_ID ) )
            // InternalDSL.g:2686:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationCrossReference_2_2_1_0()); 
            // InternalDSL.g:2687:3: ( RULE_ID )
            // InternalDSL.g:2688:4: RULE_ID
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1"


    // $ANTLR start "rule__TargetModelTypeDef__UsageModelAssignment_2_2_3"
    // InternalDSL.g:2699:1: rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__UsageModelAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2703:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2704:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2704:2: ( ( RULE_ID ) )
            // InternalDSL.g:2705:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelCrossReference_2_2_3_0()); 
            // InternalDSL.g:2706:3: ( RULE_ID )
            // InternalDSL.g:2707:4: RULE_ID
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelIDTerminalRuleCall_2_2_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelIDTerminalRuleCall_2_2_3_0_1()); 

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelCrossReference_2_2_3_0()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__UsageModelAssignment_2_2_3"


    // $ANTLR start "rule__CharacteristicType__NameAssignment_1"
    // InternalDSL.g:2718:1: rule__CharacteristicType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2722:1: ( ( RULE_ID ) )
            // InternalDSL.g:2723:2: ( RULE_ID )
            {
            // InternalDSL.g:2723:2: ( RULE_ID )
            // InternalDSL.g:2724:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CharacteristicType__NameAssignment_1"


    // $ANTLR start "rule__CharacteristicType__RefAssignment_3"
    // InternalDSL.g:2733:1: rule__CharacteristicType__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicType__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2737:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2738:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2738:2: ( ( RULE_ID ) )
            // InternalDSL.g:2739:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeCrossReference_3_0()); 
            // InternalDSL.g:2740:3: ( RULE_ID )
            // InternalDSL.g:2741:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__CharacteristicType__RefAssignment_3"


    // $ANTLR start "rule__CharacteristicClass__NameAssignment_1"
    // InternalDSL.g:2752:1: rule__CharacteristicClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2756:1: ( ( RULE_ID ) )
            // InternalDSL.g:2757:2: ( RULE_ID )
            {
            // InternalDSL.g:2757:2: ( RULE_ID )
            // InternalDSL.g:2758:3: RULE_ID
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
    // InternalDSL.g:2767:1: rule__CharacteristicClass__MembersAssignment_3 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2771:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:2772:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:2772:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:2773:3: ruleCharacteristicTypeSelector
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicTypeSelector();

            state._fsp--;

             after(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_3_0()); 

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
    // InternalDSL.g:2782:1: rule__CharacteristicClass__MembersAssignment_4_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2786:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:2787:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:2787:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:2788:3: ruleCharacteristicTypeSelector
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicTypeSelector();

            state._fsp--;

             after(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_4_1_0()); 

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


    // $ANTLR start "rule__CharacteristicTypeSelector__RefAssignment_0"
    // InternalDSL.g:2797:1: rule__CharacteristicTypeSelector__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2801:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2802:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2802:2: ( ( RULE_ID ) )
            // InternalDSL.g:2803:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0()); 
            // InternalDSL.g:2804:3: ( RULE_ID )
            // InternalDSL.g:2805:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__RefAssignment_0"


    // $ANTLR start "rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0"
    // InternalDSL.g:2816:1: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 : ( ( '!' ) ) ;
    public final void rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2820:1: ( ( ( '!' ) ) )
            // InternalDSL.g:2821:2: ( ( '!' ) )
            {
            // InternalDSL.g:2821:2: ( ( '!' ) )
            // InternalDSL.g:2822:3: ( '!' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            // InternalDSL.g:2823:3: ( '!' )
            // InternalDSL.g:2824:4: '!'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0"


    // $ANTLR start "rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1"
    // InternalDSL.g:2835:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2839:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2840:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2840:2: ( ( RULE_ID ) )
            // InternalDSL.g:2841:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_0_1_0()); 
            // InternalDSL.g:2842:3: ( RULE_ID )
            // InternalDSL.g:2843:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_0_1_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1"


    // $ANTLR start "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1"
    // InternalDSL.g:2854:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2858:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2859:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2859:2: ( ( RULE_ID ) )
            // InternalDSL.g:2860:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_1_0()); 
            // InternalDSL.g:2861:3: ( RULE_ID )
            // InternalDSL.g:2862:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_1_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1"


    // $ANTLR start "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1"
    // InternalDSL.g:2873:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2877:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2878:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2878:2: ( ( RULE_ID ) )
            // InternalDSL.g:2879:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_2_1_0()); 
            // InternalDSL.g:2880:3: ( RULE_ID )
            // InternalDSL.g:2881:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_1_2_1_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_2_1_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1"


    // $ANTLR start "rule__Include__ImportURIAssignment_1"
    // InternalDSL.g:2892:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2896:1: ( ( RULE_STRING ) )
            // InternalDSL.g:2897:2: ( RULE_STRING )
            {
            // InternalDSL.g:2897:2: ( RULE_STRING )
            // InternalDSL.g:2898:3: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Include__ImportURIAssignment_1"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // InternalDSL.g:2907:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2911:1: ( ( RULE_ID ) )
            // InternalDSL.g:2912:2: ( RULE_ID )
            {
            // InternalDSL.g:2912:2: ( RULE_ID )
            // InternalDSL.g:2913:3: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // InternalDSL.g:2922:1: rule__Constraint__RuleAssignment_3 : ( ruleRule ) ;
    public final void rule__Constraint__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2926:1: ( ( ruleRule ) )
            // InternalDSL.g:2927:2: ( ruleRule )
            {
            // InternalDSL.g:2927:2: ( ruleRule )
            // InternalDSL.g:2928:3: ruleRule
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
    // InternalDSL.g:2937:1: rule__Rule__DataSelectorsAssignment_0 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2941:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:2942:2: ( ruleDataSelector )
            {
            // InternalDSL.g:2942:2: ( ruleDataSelector )
            // InternalDSL.g:2943:3: ruleDataSelector
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
    // InternalDSL.g:2952:1: rule__Rule__DataSelectorsAssignment_1_1 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2956:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:2957:2: ( ruleDataSelector )
            {
            // InternalDSL.g:2957:2: ( ruleDataSelector )
            // InternalDSL.g:2958:3: ruleDataSelector
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
    // InternalDSL.g:2967:1: rule__Rule__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Rule__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2971:1: ( ( ruleStatement ) )
            // InternalDSL.g:2972:2: ( ruleStatement )
            {
            // InternalDSL.g:2972:2: ( ruleStatement )
            // InternalDSL.g:2973:3: ruleStatement
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
    // InternalDSL.g:2982:1: rule__Rule__DestinationSelectorsAssignment_3 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2986:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:2987:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:2987:2: ( ruleDestinationSelector )
            // InternalDSL.g:2988:3: ruleDestinationSelector
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
    // InternalDSL.g:2997:1: rule__Rule__DestinationSelectorsAssignment_4_1 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3001:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:3002:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:3002:2: ( ruleDestinationSelector )
            // InternalDSL.g:3003:3: ruleDestinationSelector
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
    // InternalDSL.g:3012:1: rule__AttributeSelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__AttributeSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3016:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:3017:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:3017:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:3018:3: ruleCharacteristicTypeSelector
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicTypeSelector();

            state._fsp--;

             after(grammarAccess.getAttributeSelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__AttributeClassSelector__RefAssignment_1"
    // InternalDSL.g:3027:1: rule__AttributeClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3031:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:3032:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:3032:2: ( ( RULE_ID ) )
            // InternalDSL.g:3033:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:3034:3: ( RULE_ID )
            // InternalDSL.g:3035:4: RULE_ID
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 

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
    // $ANTLR end "rule__AttributeClassSelector__RefAssignment_1"


    // $ANTLR start "rule__PropertySelector__RefAssignment_1"
    // InternalDSL.g:3046:1: rule__PropertySelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__PropertySelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3050:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:3051:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:3051:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:3052:3: ruleCharacteristicTypeSelector
            {
             before(grammarAccess.getPropertySelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicTypeSelector();

            state._fsp--;

             after(grammarAccess.getPropertySelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__PropertyClassSelector__RefAssignment_1"
    // InternalDSL.g:3061:1: rule__PropertyClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3065:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:3066:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:3066:2: ( ( RULE_ID ) )
            // InternalDSL.g:3067:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:3068:3: ( RULE_ID )
            // InternalDSL.g:3069:4: RULE_ID
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 

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
    // $ANTLR end "rule__PropertyClassSelector__RefAssignment_1"


    // $ANTLR start "rule__NodeIdentitiySelector__NameAssignment_0_1"
    // InternalDSL.g:3080:1: rule__NodeIdentitiySelector__NameAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__NodeIdentitiySelector__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3084:1: ( ( RULE_STRING ) )
            // InternalDSL.g:3085:2: ( RULE_STRING )
            {
            // InternalDSL.g:3085:2: ( RULE_STRING )
            // InternalDSL.g:3086:3: RULE_STRING
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNameSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getNameSTRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__NameAssignment_0_1"


    // $ANTLR start "rule__NodeIdentitiySelector__AssemblyAssignment_1_1"
    // InternalDSL.g:3095:1: rule__NodeIdentitiySelector__AssemblyAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__AssemblyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3099:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:3100:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:3100:2: ( ( RULE_ID ) )
            // InternalDSL.g:3101:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_0()); 
            // InternalDSL.g:3102:3: ( RULE_ID )
            // InternalDSL.g:3103:4: RULE_ID
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__AssemblyAssignment_1_1"


    // $ANTLR start "rule__NodeIdentitiySelector__ComponentAssignment_1_3"
    // InternalDSL.g:3114:1: rule__NodeIdentitiySelector__ComponentAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__ComponentAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3118:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:3119:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:3119:2: ( ( RULE_ID ) )
            // InternalDSL.g:3120:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_3_0()); 
            // InternalDSL.g:3121:3: ( RULE_ID )
            // InternalDSL.g:3122:4: RULE_ID
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_3_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__ComponentAssignment_1_3"


    // $ANTLR start "rule__NodeIdentitiySelector__SeffAssignment_1_5"
    // InternalDSL.g:3133:1: rule__NodeIdentitiySelector__SeffAssignment_1_5 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__SeffAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3137:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:3138:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:3138:2: ( ( RULE_ID ) )
            // InternalDSL.g:3139:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationCrossReference_1_5_0()); 
            // InternalDSL.g:3140:3: ( RULE_ID )
            // InternalDSL.g:3141:4: RULE_ID
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationIDTerminalRuleCall_1_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationIDTerminalRuleCall_1_5_0_1()); 

            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationCrossReference_1_5_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__SeffAssignment_1_5"


    // $ANTLR start "rule__Statement__ModalityAssignment_0"
    // InternalDSL.g:3152:1: rule__Statement__ModalityAssignment_0 : ( ruleStatementModality ) ;
    public final void rule__Statement__ModalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3156:1: ( ( ruleStatementModality ) )
            // InternalDSL.g:3157:2: ( ruleStatementModality )
            {
            // InternalDSL.g:3157:2: ( ruleStatementModality )
            // InternalDSL.g:3158:3: ruleStatementModality
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
    // InternalDSL.g:3167:1: rule__Statement__TypeAssignment_1 : ( ruleStatementType ) ;
    public final void rule__Statement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3171:1: ( ( ruleStatementType ) )
            // InternalDSL.g:3172:2: ( ruleStatementType )
            {
            // InternalDSL.g:3172:2: ( ruleStatementType )
            // InternalDSL.g:3173:3: ruleStatementType
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
    // InternalDSL.g:3182:1: rule__StatementType__NameAssignment : ( ( 'FLOWS' ) ) ;
    public final void rule__StatementType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3186:1: ( ( ( 'FLOWS' ) ) )
            // InternalDSL.g:3187:2: ( ( 'FLOWS' ) )
            {
            // InternalDSL.g:3187:2: ( ( 'FLOWS' ) )
            // InternalDSL.g:3188:3: ( 'FLOWS' )
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            // InternalDSL.g:3189:3: ( 'FLOWS' )
            // InternalDSL.g:3190:4: 'FLOWS'
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDSL.g:3201:1: rule__StatementModality__NameAssignment : ( ( 'NEVER' ) ) ;
    public final void rule__StatementModality__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3205:1: ( ( ( 'NEVER' ) ) )
            // InternalDSL.g:3206:2: ( ( 'NEVER' ) )
            {
            // InternalDSL.g:3206:2: ( ( 'NEVER' ) )
            // InternalDSL.g:3207:3: ( 'NEVER' )
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            // InternalDSL.g:3208:3: ( 'NEVER' )
            // InternalDSL.g:3209:4: 'NEVER'
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000060A0010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000060A0012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400800020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});

}