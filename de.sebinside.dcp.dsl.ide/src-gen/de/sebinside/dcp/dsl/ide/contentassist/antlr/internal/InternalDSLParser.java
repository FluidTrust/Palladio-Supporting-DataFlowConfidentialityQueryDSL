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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OperationModel'", "'DataCentricPalladio'", "'ExtendedDFD'", "'target'", "'using'", "','", "'type'", "':'", "'class'", "'{'", "'}'", "'.'", "'['", "']'", "'{}'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'node.name.'", "'node.identity.'", "'WHERE'", "'('", "')'", "'!'", "'=='", "'!='", "'isEmpty('", "'intersection('", "'$'", "'FLOWS'", "'NEVER'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_SL_COMMENT=4;
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


    // $ANTLR start "entryRuleCharacteristicVariableType"
    // InternalDSL.g:203:1: entryRuleCharacteristicVariableType : ruleCharacteristicVariableType EOF ;
    public final void entryRuleCharacteristicVariableType() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleCharacteristicVariableType EOF )
            // InternalDSL.g:205:1: ruleCharacteristicVariableType EOF
            {
             before(grammarAccess.getCharacteristicVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicVariableType();

            state._fsp--;

             after(grammarAccess.getCharacteristicVariableTypeRule()); 
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
    // $ANTLR end "entryRuleCharacteristicVariableType"


    // $ANTLR start "ruleCharacteristicVariableType"
    // InternalDSL.g:212:1: ruleCharacteristicVariableType : ( ( rule__CharacteristicVariableType__Alternatives ) ) ;
    public final void ruleCharacteristicVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__CharacteristicVariableType__Alternatives ) ) )
            // InternalDSL.g:217:2: ( ( rule__CharacteristicVariableType__Alternatives ) )
            {
            // InternalDSL.g:217:2: ( ( rule__CharacteristicVariableType__Alternatives ) )
            // InternalDSL.g:218:3: ( rule__CharacteristicVariableType__Alternatives )
            {
             before(grammarAccess.getCharacteristicVariableTypeAccess().getAlternatives()); 
            // InternalDSL.g:219:3: ( rule__CharacteristicVariableType__Alternatives )
            // InternalDSL.g:219:4: rule__CharacteristicVariableType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicVariableType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicVariableTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristicVariableType"


    // $ANTLR start "entryRuleCharacteristicVariable"
    // InternalDSL.g:228:1: entryRuleCharacteristicVariable : ruleCharacteristicVariable EOF ;
    public final void entryRuleCharacteristicVariable() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleCharacteristicVariable EOF )
            // InternalDSL.g:230:1: ruleCharacteristicVariable EOF
            {
             before(grammarAccess.getCharacteristicVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicVariable();

            state._fsp--;

             after(grammarAccess.getCharacteristicVariableRule()); 
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
    // $ANTLR end "entryRuleCharacteristicVariable"


    // $ANTLR start "ruleCharacteristicVariable"
    // InternalDSL.g:237:1: ruleCharacteristicVariable : ( ( rule__CharacteristicVariable__NameAssignment ) ) ;
    public final void ruleCharacteristicVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__CharacteristicVariable__NameAssignment ) ) )
            // InternalDSL.g:242:2: ( ( rule__CharacteristicVariable__NameAssignment ) )
            {
            // InternalDSL.g:242:2: ( ( rule__CharacteristicVariable__NameAssignment ) )
            // InternalDSL.g:243:3: ( rule__CharacteristicVariable__NameAssignment )
            {
             before(grammarAccess.getCharacteristicVariableAccess().getNameAssignment()); 
            // InternalDSL.g:244:3: ( rule__CharacteristicVariable__NameAssignment )
            // InternalDSL.g:244:4: rule__CharacteristicVariable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicVariable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristicVariable"


    // $ANTLR start "entryRuleCharacteristicSet"
    // InternalDSL.g:253:1: entryRuleCharacteristicSet : ruleCharacteristicSet EOF ;
    public final void entryRuleCharacteristicSet() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleCharacteristicSet EOF )
            // InternalDSL.g:255:1: ruleCharacteristicSet EOF
            {
             before(grammarAccess.getCharacteristicSetRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicSet();

            state._fsp--;

             after(grammarAccess.getCharacteristicSetRule()); 
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
    // $ANTLR end "entryRuleCharacteristicSet"


    // $ANTLR start "ruleCharacteristicSet"
    // InternalDSL.g:262:1: ruleCharacteristicSet : ( ( rule__CharacteristicSet__Group__0 ) ) ;
    public final void ruleCharacteristicSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__CharacteristicSet__Group__0 ) ) )
            // InternalDSL.g:267:2: ( ( rule__CharacteristicSet__Group__0 ) )
            {
            // InternalDSL.g:267:2: ( ( rule__CharacteristicSet__Group__0 ) )
            // InternalDSL.g:268:3: ( rule__CharacteristicSet__Group__0 )
            {
             before(grammarAccess.getCharacteristicSetAccess().getGroup()); 
            // InternalDSL.g:269:3: ( rule__CharacteristicSet__Group__0 )
            // InternalDSL.g:269:4: rule__CharacteristicSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristicSet"


    // $ANTLR start "entryRuleInclude"
    // InternalDSL.g:278:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleInclude EOF )
            // InternalDSL.g:280:1: ruleInclude EOF
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
    // InternalDSL.g:287:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__Include__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__Include__Group__0 )
            // InternalDSL.g:294:4: rule__Include__Group__0
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
    // InternalDSL.g:303:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleConstraint EOF )
            // InternalDSL.g:305:1: ruleConstraint EOF
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
    // InternalDSL.g:312:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__Constraint__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__Constraint__Group__0 )
            // InternalDSL.g:319:4: rule__Constraint__Group__0
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
    // InternalDSL.g:328:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleRule EOF )
            // InternalDSL.g:330:1: ruleRule EOF
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
    // InternalDSL.g:337:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__Rule__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__Rule__Group__0 )
            // InternalDSL.g:344:4: rule__Rule__Group__0
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
    // InternalDSL.g:353:1: entryRuleDataSelector : ruleDataSelector EOF ;
    public final void entryRuleDataSelector() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleDataSelector EOF )
            // InternalDSL.g:355:1: ruleDataSelector EOF
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
    // InternalDSL.g:362:1: ruleDataSelector : ( ( rule__DataSelector__Alternatives ) ) ;
    public final void ruleDataSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__DataSelector__Alternatives ) ) )
            // InternalDSL.g:367:2: ( ( rule__DataSelector__Alternatives ) )
            {
            // InternalDSL.g:367:2: ( ( rule__DataSelector__Alternatives ) )
            // InternalDSL.g:368:3: ( rule__DataSelector__Alternatives )
            {
             before(grammarAccess.getDataSelectorAccess().getAlternatives()); 
            // InternalDSL.g:369:3: ( rule__DataSelector__Alternatives )
            // InternalDSL.g:369:4: rule__DataSelector__Alternatives
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
    // InternalDSL.g:378:1: entryRuleAttributeSelector : ruleAttributeSelector EOF ;
    public final void entryRuleAttributeSelector() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( ruleAttributeSelector EOF )
            // InternalDSL.g:380:1: ruleAttributeSelector EOF
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
    // InternalDSL.g:387:1: ruleAttributeSelector : ( ( rule__AttributeSelector__Group__0 ) ) ;
    public final void ruleAttributeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__AttributeSelector__Group__0 ) ) )
            // InternalDSL.g:392:2: ( ( rule__AttributeSelector__Group__0 ) )
            {
            // InternalDSL.g:392:2: ( ( rule__AttributeSelector__Group__0 ) )
            // InternalDSL.g:393:3: ( rule__AttributeSelector__Group__0 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getGroup()); 
            // InternalDSL.g:394:3: ( rule__AttributeSelector__Group__0 )
            // InternalDSL.g:394:4: rule__AttributeSelector__Group__0
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
    // InternalDSL.g:403:1: entryRuleAttributeClassSelector : ruleAttributeClassSelector EOF ;
    public final void entryRuleAttributeClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( ruleAttributeClassSelector EOF )
            // InternalDSL.g:405:1: ruleAttributeClassSelector EOF
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
    // InternalDSL.g:412:1: ruleAttributeClassSelector : ( ( rule__AttributeClassSelector__Group__0 ) ) ;
    public final void ruleAttributeClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__AttributeClassSelector__Group__0 ) ) )
            // InternalDSL.g:417:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            {
            // InternalDSL.g:417:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            // InternalDSL.g:418:3: ( rule__AttributeClassSelector__Group__0 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getGroup()); 
            // InternalDSL.g:419:3: ( rule__AttributeClassSelector__Group__0 )
            // InternalDSL.g:419:4: rule__AttributeClassSelector__Group__0
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
    // InternalDSL.g:428:1: entryRuleDestinationSelector : ruleDestinationSelector EOF ;
    public final void entryRuleDestinationSelector() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( ruleDestinationSelector EOF )
            // InternalDSL.g:430:1: ruleDestinationSelector EOF
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
    // InternalDSL.g:437:1: ruleDestinationSelector : ( ( rule__DestinationSelector__Alternatives ) ) ;
    public final void ruleDestinationSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__DestinationSelector__Alternatives ) ) )
            // InternalDSL.g:442:2: ( ( rule__DestinationSelector__Alternatives ) )
            {
            // InternalDSL.g:442:2: ( ( rule__DestinationSelector__Alternatives ) )
            // InternalDSL.g:443:3: ( rule__DestinationSelector__Alternatives )
            {
             before(grammarAccess.getDestinationSelectorAccess().getAlternatives()); 
            // InternalDSL.g:444:3: ( rule__DestinationSelector__Alternatives )
            // InternalDSL.g:444:4: rule__DestinationSelector__Alternatives
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
    // InternalDSL.g:453:1: entryRulePropertySelector : rulePropertySelector EOF ;
    public final void entryRulePropertySelector() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( rulePropertySelector EOF )
            // InternalDSL.g:455:1: rulePropertySelector EOF
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
    // InternalDSL.g:462:1: rulePropertySelector : ( ( rule__PropertySelector__Group__0 ) ) ;
    public final void rulePropertySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__PropertySelector__Group__0 ) ) )
            // InternalDSL.g:467:2: ( ( rule__PropertySelector__Group__0 ) )
            {
            // InternalDSL.g:467:2: ( ( rule__PropertySelector__Group__0 ) )
            // InternalDSL.g:468:3: ( rule__PropertySelector__Group__0 )
            {
             before(grammarAccess.getPropertySelectorAccess().getGroup()); 
            // InternalDSL.g:469:3: ( rule__PropertySelector__Group__0 )
            // InternalDSL.g:469:4: rule__PropertySelector__Group__0
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
    // InternalDSL.g:478:1: entryRulePropertyClassSelector : rulePropertyClassSelector EOF ;
    public final void entryRulePropertyClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:479:1: ( rulePropertyClassSelector EOF )
            // InternalDSL.g:480:1: rulePropertyClassSelector EOF
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
    // InternalDSL.g:487:1: rulePropertyClassSelector : ( ( rule__PropertyClassSelector__Group__0 ) ) ;
    public final void rulePropertyClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:2: ( ( ( rule__PropertyClassSelector__Group__0 ) ) )
            // InternalDSL.g:492:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            {
            // InternalDSL.g:492:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            // InternalDSL.g:493:3: ( rule__PropertyClassSelector__Group__0 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getGroup()); 
            // InternalDSL.g:494:3: ( rule__PropertyClassSelector__Group__0 )
            // InternalDSL.g:494:4: rule__PropertyClassSelector__Group__0
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
    // InternalDSL.g:503:1: entryRuleNodeIdentitiySelector : ruleNodeIdentitiySelector EOF ;
    public final void entryRuleNodeIdentitiySelector() throws RecognitionException {
        try {
            // InternalDSL.g:504:1: ( ruleNodeIdentitiySelector EOF )
            // InternalDSL.g:505:1: ruleNodeIdentitiySelector EOF
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
    // InternalDSL.g:512:1: ruleNodeIdentitiySelector : ( ( rule__NodeIdentitiySelector__Alternatives ) ) ;
    public final void ruleNodeIdentitiySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:2: ( ( ( rule__NodeIdentitiySelector__Alternatives ) ) )
            // InternalDSL.g:517:2: ( ( rule__NodeIdentitiySelector__Alternatives ) )
            {
            // InternalDSL.g:517:2: ( ( rule__NodeIdentitiySelector__Alternatives ) )
            // InternalDSL.g:518:3: ( rule__NodeIdentitiySelector__Alternatives )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAlternatives()); 
            // InternalDSL.g:519:3: ( rule__NodeIdentitiySelector__Alternatives )
            // InternalDSL.g:519:4: rule__NodeIdentitiySelector__Alternatives
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
    // InternalDSL.g:528:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalDSL.g:529:1: ( ruleStatement EOF )
            // InternalDSL.g:530:1: ruleStatement EOF
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
    // InternalDSL.g:537:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:541:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalDSL.g:542:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalDSL.g:542:2: ( ( rule__Statement__Group__0 ) )
            // InternalDSL.g:543:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalDSL.g:544:3: ( rule__Statement__Group__0 )
            // InternalDSL.g:544:4: rule__Statement__Group__0
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
    // InternalDSL.g:553:1: entryRuleStatementType : ruleStatementType EOF ;
    public final void entryRuleStatementType() throws RecognitionException {
        try {
            // InternalDSL.g:554:1: ( ruleStatementType EOF )
            // InternalDSL.g:555:1: ruleStatementType EOF
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
    // InternalDSL.g:562:1: ruleStatementType : ( ( rule__StatementType__NameAssignment ) ) ;
    public final void ruleStatementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:566:2: ( ( ( rule__StatementType__NameAssignment ) ) )
            // InternalDSL.g:567:2: ( ( rule__StatementType__NameAssignment ) )
            {
            // InternalDSL.g:567:2: ( ( rule__StatementType__NameAssignment ) )
            // InternalDSL.g:568:3: ( rule__StatementType__NameAssignment )
            {
             before(grammarAccess.getStatementTypeAccess().getNameAssignment()); 
            // InternalDSL.g:569:3: ( rule__StatementType__NameAssignment )
            // InternalDSL.g:569:4: rule__StatementType__NameAssignment
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
    // InternalDSL.g:578:1: entryRuleStatementModality : ruleStatementModality EOF ;
    public final void entryRuleStatementModality() throws RecognitionException {
        try {
            // InternalDSL.g:579:1: ( ruleStatementModality EOF )
            // InternalDSL.g:580:1: ruleStatementModality EOF
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
    // InternalDSL.g:587:1: ruleStatementModality : ( ( rule__StatementModality__NameAssignment ) ) ;
    public final void ruleStatementModality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:591:2: ( ( ( rule__StatementModality__NameAssignment ) ) )
            // InternalDSL.g:592:2: ( ( rule__StatementModality__NameAssignment ) )
            {
            // InternalDSL.g:592:2: ( ( rule__StatementModality__NameAssignment ) )
            // InternalDSL.g:593:3: ( rule__StatementModality__NameAssignment )
            {
             before(grammarAccess.getStatementModalityAccess().getNameAssignment()); 
            // InternalDSL.g:594:3: ( rule__StatementModality__NameAssignment )
            // InternalDSL.g:594:4: rule__StatementModality__NameAssignment
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


    // $ANTLR start "entryRuleCondition"
    // InternalDSL.g:603:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalDSL.g:604:1: ( ruleCondition EOF )
            // InternalDSL.g:605:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalDSL.g:612:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:616:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalDSL.g:617:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalDSL.g:617:2: ( ( rule__Condition__Group__0 ) )
            // InternalDSL.g:618:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalDSL.g:619:3: ( rule__Condition__Group__0 )
            // InternalDSL.g:619:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCharacteristicReference"
    // InternalDSL.g:628:1: entryRuleCharacteristicReference : ruleCharacteristicReference EOF ;
    public final void entryRuleCharacteristicReference() throws RecognitionException {
        try {
            // InternalDSL.g:629:1: ( ruleCharacteristicReference EOF )
            // InternalDSL.g:630:1: ruleCharacteristicReference EOF
            {
             before(grammarAccess.getCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getCharacteristicReferenceRule()); 
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
    // $ANTLR end "entryRuleCharacteristicReference"


    // $ANTLR start "ruleCharacteristicReference"
    // InternalDSL.g:637:1: ruleCharacteristicReference : ( ( rule__CharacteristicReference__ValueAssignment ) ) ;
    public final void ruleCharacteristicReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:641:2: ( ( ( rule__CharacteristicReference__ValueAssignment ) ) )
            // InternalDSL.g:642:2: ( ( rule__CharacteristicReference__ValueAssignment ) )
            {
            // InternalDSL.g:642:2: ( ( rule__CharacteristicReference__ValueAssignment ) )
            // InternalDSL.g:643:3: ( rule__CharacteristicReference__ValueAssignment )
            {
             before(grammarAccess.getCharacteristicReferenceAccess().getValueAssignment()); 
            // InternalDSL.g:644:3: ( rule__CharacteristicReference__ValueAssignment )
            // InternalDSL.g:644:4: rule__CharacteristicReference__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicReference__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicReferenceAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristicReference"


    // $ANTLR start "entryRuleCharacteristicSetReference"
    // InternalDSL.g:653:1: entryRuleCharacteristicSetReference : ruleCharacteristicSetReference EOF ;
    public final void entryRuleCharacteristicSetReference() throws RecognitionException {
        try {
            // InternalDSL.g:654:1: ( ruleCharacteristicSetReference EOF )
            // InternalDSL.g:655:1: ruleCharacteristicSetReference EOF
            {
             before(grammarAccess.getCharacteristicSetReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getCharacteristicSetReferenceRule()); 
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
    // $ANTLR end "entryRuleCharacteristicSetReference"


    // $ANTLR start "ruleCharacteristicSetReference"
    // InternalDSL.g:662:1: ruleCharacteristicSetReference : ( ( rule__CharacteristicSetReference__Alternatives ) ) ;
    public final void ruleCharacteristicSetReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:666:2: ( ( ( rule__CharacteristicSetReference__Alternatives ) ) )
            // InternalDSL.g:667:2: ( ( rule__CharacteristicSetReference__Alternatives ) )
            {
            // InternalDSL.g:667:2: ( ( rule__CharacteristicSetReference__Alternatives ) )
            // InternalDSL.g:668:3: ( rule__CharacteristicSetReference__Alternatives )
            {
             before(grammarAccess.getCharacteristicSetReferenceAccess().getAlternatives()); 
            // InternalDSL.g:669:3: ( rule__CharacteristicSetReference__Alternatives )
            // InternalDSL.g:669:4: rule__CharacteristicSetReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSetReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSetReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristicSetReference"


    // $ANTLR start "entryRuleBooleanOperation"
    // InternalDSL.g:678:1: entryRuleBooleanOperation : ruleBooleanOperation EOF ;
    public final void entryRuleBooleanOperation() throws RecognitionException {
        try {
            // InternalDSL.g:679:1: ( ruleBooleanOperation EOF )
            // InternalDSL.g:680:1: ruleBooleanOperation EOF
            {
             before(grammarAccess.getBooleanOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanOperation();

            state._fsp--;

             after(grammarAccess.getBooleanOperationRule()); 
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
    // $ANTLR end "entryRuleBooleanOperation"


    // $ANTLR start "ruleBooleanOperation"
    // InternalDSL.g:687:1: ruleBooleanOperation : ( ( rule__BooleanOperation__Alternatives ) ) ;
    public final void ruleBooleanOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:691:2: ( ( ( rule__BooleanOperation__Alternatives ) ) )
            // InternalDSL.g:692:2: ( ( rule__BooleanOperation__Alternatives ) )
            {
            // InternalDSL.g:692:2: ( ( rule__BooleanOperation__Alternatives ) )
            // InternalDSL.g:693:3: ( rule__BooleanOperation__Alternatives )
            {
             before(grammarAccess.getBooleanOperationAccess().getAlternatives()); 
            // InternalDSL.g:694:3: ( rule__BooleanOperation__Alternatives )
            // InternalDSL.g:694:4: rule__BooleanOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOperation"


    // $ANTLR start "entryRuleCharacteristsicSetOperation"
    // InternalDSL.g:703:1: entryRuleCharacteristsicSetOperation : ruleCharacteristsicSetOperation EOF ;
    public final void entryRuleCharacteristsicSetOperation() throws RecognitionException {
        try {
            // InternalDSL.g:704:1: ( ruleCharacteristsicSetOperation EOF )
            // InternalDSL.g:705:1: ruleCharacteristsicSetOperation EOF
            {
             before(grammarAccess.getCharacteristsicSetOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristsicSetOperation();

            state._fsp--;

             after(grammarAccess.getCharacteristsicSetOperationRule()); 
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
    // $ANTLR end "entryRuleCharacteristsicSetOperation"


    // $ANTLR start "ruleCharacteristsicSetOperation"
    // InternalDSL.g:712:1: ruleCharacteristsicSetOperation : ( ( rule__CharacteristsicSetOperation__Alternatives ) ) ;
    public final void ruleCharacteristsicSetOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:716:2: ( ( ( rule__CharacteristsicSetOperation__Alternatives ) ) )
            // InternalDSL.g:717:2: ( ( rule__CharacteristsicSetOperation__Alternatives ) )
            {
            // InternalDSL.g:717:2: ( ( rule__CharacteristsicSetOperation__Alternatives ) )
            // InternalDSL.g:718:3: ( rule__CharacteristsicSetOperation__Alternatives )
            {
             before(grammarAccess.getCharacteristsicSetOperationAccess().getAlternatives()); 
            // InternalDSL.g:719:3: ( rule__CharacteristsicSetOperation__Alternatives )
            // InternalDSL.g:719:4: rule__CharacteristsicSetOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristsicSetOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristsicSetOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristsicSetOperation"


    // $ANTLR start "entryRuleLogicalAndOperation"
    // InternalDSL.g:728:1: entryRuleLogicalAndOperation : ruleLogicalAndOperation EOF ;
    public final void entryRuleLogicalAndOperation() throws RecognitionException {
        try {
            // InternalDSL.g:729:1: ( ruleLogicalAndOperation EOF )
            // InternalDSL.g:730:1: ruleLogicalAndOperation EOF
            {
             before(grammarAccess.getLogicalAndOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalAndOperation();

            state._fsp--;

             after(grammarAccess.getLogicalAndOperationRule()); 
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
    // $ANTLR end "entryRuleLogicalAndOperation"


    // $ANTLR start "ruleLogicalAndOperation"
    // InternalDSL.g:737:1: ruleLogicalAndOperation : ( ( rule__LogicalAndOperation__Group__0 ) ) ;
    public final void ruleLogicalAndOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:741:2: ( ( ( rule__LogicalAndOperation__Group__0 ) ) )
            // InternalDSL.g:742:2: ( ( rule__LogicalAndOperation__Group__0 ) )
            {
            // InternalDSL.g:742:2: ( ( rule__LogicalAndOperation__Group__0 ) )
            // InternalDSL.g:743:3: ( rule__LogicalAndOperation__Group__0 )
            {
             before(grammarAccess.getLogicalAndOperationAccess().getGroup()); 
            // InternalDSL.g:744:3: ( rule__LogicalAndOperation__Group__0 )
            // InternalDSL.g:744:4: rule__LogicalAndOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAndOperation"


    // $ANTLR start "entryRuleLogicalNegationOperation"
    // InternalDSL.g:753:1: entryRuleLogicalNegationOperation : ruleLogicalNegationOperation EOF ;
    public final void entryRuleLogicalNegationOperation() throws RecognitionException {
        try {
            // InternalDSL.g:754:1: ( ruleLogicalNegationOperation EOF )
            // InternalDSL.g:755:1: ruleLogicalNegationOperation EOF
            {
             before(grammarAccess.getLogicalNegationOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalNegationOperation();

            state._fsp--;

             after(grammarAccess.getLogicalNegationOperationRule()); 
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
    // $ANTLR end "entryRuleLogicalNegationOperation"


    // $ANTLR start "ruleLogicalNegationOperation"
    // InternalDSL.g:762:1: ruleLogicalNegationOperation : ( ( rule__LogicalNegationOperation__Group__0 ) ) ;
    public final void ruleLogicalNegationOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:766:2: ( ( ( rule__LogicalNegationOperation__Group__0 ) ) )
            // InternalDSL.g:767:2: ( ( rule__LogicalNegationOperation__Group__0 ) )
            {
            // InternalDSL.g:767:2: ( ( rule__LogicalNegationOperation__Group__0 ) )
            // InternalDSL.g:768:3: ( rule__LogicalNegationOperation__Group__0 )
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getGroup()); 
            // InternalDSL.g:769:3: ( rule__LogicalNegationOperation__Group__0 )
            // InternalDSL.g:769:4: rule__LogicalNegationOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalNegationOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalNegationOperation"


    // $ANTLR start "entryRuleVariableEqualityOperation"
    // InternalDSL.g:778:1: entryRuleVariableEqualityOperation : ruleVariableEqualityOperation EOF ;
    public final void entryRuleVariableEqualityOperation() throws RecognitionException {
        try {
            // InternalDSL.g:779:1: ( ruleVariableEqualityOperation EOF )
            // InternalDSL.g:780:1: ruleVariableEqualityOperation EOF
            {
             before(grammarAccess.getVariableEqualityOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableEqualityOperation();

            state._fsp--;

             after(grammarAccess.getVariableEqualityOperationRule()); 
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
    // $ANTLR end "entryRuleVariableEqualityOperation"


    // $ANTLR start "ruleVariableEqualityOperation"
    // InternalDSL.g:787:1: ruleVariableEqualityOperation : ( ( rule__VariableEqualityOperation__Group__0 ) ) ;
    public final void ruleVariableEqualityOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:791:2: ( ( ( rule__VariableEqualityOperation__Group__0 ) ) )
            // InternalDSL.g:792:2: ( ( rule__VariableEqualityOperation__Group__0 ) )
            {
            // InternalDSL.g:792:2: ( ( rule__VariableEqualityOperation__Group__0 ) )
            // InternalDSL.g:793:3: ( rule__VariableEqualityOperation__Group__0 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getGroup()); 
            // InternalDSL.g:794:3: ( rule__VariableEqualityOperation__Group__0 )
            // InternalDSL.g:794:4: rule__VariableEqualityOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableEqualityOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableEqualityOperation"


    // $ANTLR start "entryRuleVariableInequalityOperation"
    // InternalDSL.g:803:1: entryRuleVariableInequalityOperation : ruleVariableInequalityOperation EOF ;
    public final void entryRuleVariableInequalityOperation() throws RecognitionException {
        try {
            // InternalDSL.g:804:1: ( ruleVariableInequalityOperation EOF )
            // InternalDSL.g:805:1: ruleVariableInequalityOperation EOF
            {
             before(grammarAccess.getVariableInequalityOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableInequalityOperation();

            state._fsp--;

             after(grammarAccess.getVariableInequalityOperationRule()); 
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
    // $ANTLR end "entryRuleVariableInequalityOperation"


    // $ANTLR start "ruleVariableInequalityOperation"
    // InternalDSL.g:812:1: ruleVariableInequalityOperation : ( ( rule__VariableInequalityOperation__Group__0 ) ) ;
    public final void ruleVariableInequalityOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:816:2: ( ( ( rule__VariableInequalityOperation__Group__0 ) ) )
            // InternalDSL.g:817:2: ( ( rule__VariableInequalityOperation__Group__0 ) )
            {
            // InternalDSL.g:817:2: ( ( rule__VariableInequalityOperation__Group__0 ) )
            // InternalDSL.g:818:3: ( rule__VariableInequalityOperation__Group__0 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getGroup()); 
            // InternalDSL.g:819:3: ( rule__VariableInequalityOperation__Group__0 )
            // InternalDSL.g:819:4: rule__VariableInequalityOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableInequalityOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableInequalityOperation"


    // $ANTLR start "entryRuleEmptySetOperation"
    // InternalDSL.g:828:1: entryRuleEmptySetOperation : ruleEmptySetOperation EOF ;
    public final void entryRuleEmptySetOperation() throws RecognitionException {
        try {
            // InternalDSL.g:829:1: ( ruleEmptySetOperation EOF )
            // InternalDSL.g:830:1: ruleEmptySetOperation EOF
            {
             before(grammarAccess.getEmptySetOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptySetOperation();

            state._fsp--;

             after(grammarAccess.getEmptySetOperationRule()); 
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
    // $ANTLR end "entryRuleEmptySetOperation"


    // $ANTLR start "ruleEmptySetOperation"
    // InternalDSL.g:837:1: ruleEmptySetOperation : ( ( rule__EmptySetOperation__Group__0 ) ) ;
    public final void ruleEmptySetOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:841:2: ( ( ( rule__EmptySetOperation__Group__0 ) ) )
            // InternalDSL.g:842:2: ( ( rule__EmptySetOperation__Group__0 ) )
            {
            // InternalDSL.g:842:2: ( ( rule__EmptySetOperation__Group__0 ) )
            // InternalDSL.g:843:3: ( rule__EmptySetOperation__Group__0 )
            {
             before(grammarAccess.getEmptySetOperationAccess().getGroup()); 
            // InternalDSL.g:844:3: ( rule__EmptySetOperation__Group__0 )
            // InternalDSL.g:844:4: rule__EmptySetOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmptySetOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptySetOperation"


    // $ANTLR start "entryRuleIntersectionOperation"
    // InternalDSL.g:853:1: entryRuleIntersectionOperation : ruleIntersectionOperation EOF ;
    public final void entryRuleIntersectionOperation() throws RecognitionException {
        try {
            // InternalDSL.g:854:1: ( ruleIntersectionOperation EOF )
            // InternalDSL.g:855:1: ruleIntersectionOperation EOF
            {
             before(grammarAccess.getIntersectionOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleIntersectionOperation();

            state._fsp--;

             after(grammarAccess.getIntersectionOperationRule()); 
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
    // $ANTLR end "entryRuleIntersectionOperation"


    // $ANTLR start "ruleIntersectionOperation"
    // InternalDSL.g:862:1: ruleIntersectionOperation : ( ( rule__IntersectionOperation__Group__0 ) ) ;
    public final void ruleIntersectionOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:866:2: ( ( ( rule__IntersectionOperation__Group__0 ) ) )
            // InternalDSL.g:867:2: ( ( rule__IntersectionOperation__Group__0 ) )
            {
            // InternalDSL.g:867:2: ( ( rule__IntersectionOperation__Group__0 ) )
            // InternalDSL.g:868:3: ( rule__IntersectionOperation__Group__0 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getGroup()); 
            // InternalDSL.g:869:3: ( rule__IntersectionOperation__Group__0 )
            // InternalDSL.g:869:4: rule__IntersectionOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntersectionOperation"


    // $ANTLR start "entryRuleCreateSetOperation"
    // InternalDSL.g:878:1: entryRuleCreateSetOperation : ruleCreateSetOperation EOF ;
    public final void entryRuleCreateSetOperation() throws RecognitionException {
        try {
            // InternalDSL.g:879:1: ( ruleCreateSetOperation EOF )
            // InternalDSL.g:880:1: ruleCreateSetOperation EOF
            {
             before(grammarAccess.getCreateSetOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateSetOperation();

            state._fsp--;

             after(grammarAccess.getCreateSetOperationRule()); 
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
    // $ANTLR end "entryRuleCreateSetOperation"


    // $ANTLR start "ruleCreateSetOperation"
    // InternalDSL.g:887:1: ruleCreateSetOperation : ( ( rule__CreateSetOperation__Group__0 ) ) ;
    public final void ruleCreateSetOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:891:2: ( ( ( rule__CreateSetOperation__Group__0 ) ) )
            // InternalDSL.g:892:2: ( ( rule__CreateSetOperation__Group__0 ) )
            {
            // InternalDSL.g:892:2: ( ( rule__CreateSetOperation__Group__0 ) )
            // InternalDSL.g:893:3: ( rule__CreateSetOperation__Group__0 )
            {
             before(grammarAccess.getCreateSetOperationAccess().getGroup()); 
            // InternalDSL.g:894:3: ( rule__CreateSetOperation__Group__0 )
            // InternalDSL.g:894:4: rule__CreateSetOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateSetOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateSetOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateSetOperation"


    // $ANTLR start "ruleTargetModelType"
    // InternalDSL.g:903:1: ruleTargetModelType : ( ( rule__TargetModelType__Alternatives ) ) ;
    public final void ruleTargetModelType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:907:1: ( ( ( rule__TargetModelType__Alternatives ) ) )
            // InternalDSL.g:908:2: ( ( rule__TargetModelType__Alternatives ) )
            {
            // InternalDSL.g:908:2: ( ( rule__TargetModelType__Alternatives ) )
            // InternalDSL.g:909:3: ( rule__TargetModelType__Alternatives )
            {
             before(grammarAccess.getTargetModelTypeAccess().getAlternatives()); 
            // InternalDSL.g:910:3: ( rule__TargetModelType__Alternatives )
            // InternalDSL.g:910:4: rule__TargetModelType__Alternatives
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
    // InternalDSL.g:918:1: rule__AbstractElement__Alternatives : ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:922:1: ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 26:
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
            case 27:
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
                    // InternalDSL.g:923:2: ( ruleInclude )
                    {
                    // InternalDSL.g:923:2: ( ruleInclude )
                    // InternalDSL.g:924:3: ruleInclude
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
                    // InternalDSL.g:929:2: ( ruleCharacteristicType )
                    {
                    // InternalDSL.g:929:2: ( ruleCharacteristicType )
                    // InternalDSL.g:930:3: ruleCharacteristicType
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
                    // InternalDSL.g:935:2: ( ruleCharacteristicClass )
                    {
                    // InternalDSL.g:935:2: ( ruleCharacteristicClass )
                    // InternalDSL.g:936:3: ruleCharacteristicClass
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
                    // InternalDSL.g:941:2: ( ruleConstraint )
                    {
                    // InternalDSL.g:941:2: ( ruleConstraint )
                    // InternalDSL.g:942:3: ruleConstraint
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
                    // InternalDSL.g:947:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    {
                    // InternalDSL.g:947:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    // InternalDSL.g:948:3: ( rule__AbstractElement__Group_4__0 )
                    {
                     before(grammarAccess.getAbstractElementAccess().getGroup_4()); 
                    // InternalDSL.g:949:3: ( rule__AbstractElement__Group_4__0 )
                    // InternalDSL.g:949:4: rule__AbstractElement__Group_4__0
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
    // InternalDSL.g:957:1: rule__CharacteristicTypeSelector__Alternatives_2 : ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) ) );
    public final void rule__CharacteristicTypeSelector__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:961:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 38:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 43:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:962:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    {
                    // InternalDSL.g:962:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    // InternalDSL.g:963:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_0()); 
                    // InternalDSL.g:964:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    // InternalDSL.g:964:4: rule__CharacteristicTypeSelector__Group_2_0__0
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
                    // InternalDSL.g:968:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    {
                    // InternalDSL.g:968:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    // InternalDSL.g:969:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 
                    // InternalDSL.g:970:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    // InternalDSL.g:970:4: rule__CharacteristicTypeSelector__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicTypeSelector__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:974:2: ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) )
                    {
                    // InternalDSL.g:974:2: ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) )
                    // InternalDSL.g:975:3: ( rule__CharacteristicTypeSelector__Group_2_2__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_2()); 
                    // InternalDSL.g:976:3: ( rule__CharacteristicTypeSelector__Group_2_2__0 )
                    // InternalDSL.g:976:4: rule__CharacteristicTypeSelector__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicTypeSelector__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_2()); 

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


    // $ANTLR start "rule__CharacteristicVariableType__Alternatives"
    // InternalDSL.g:984:1: rule__CharacteristicVariableType__Alternatives : ( ( ruleCharacteristicVariable ) | ( ruleCharacteristicSet ) );
    public final void rule__CharacteristicVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:988:1: ( ( ruleCharacteristicVariable ) | ( ruleCharacteristicSet ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==16||LA3_1==21||LA3_1==28||LA3_1==35||LA3_1==45) ) {
                    alt3=1;
                }
                else if ( (LA3_1==25) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:989:2: ( ruleCharacteristicVariable )
                    {
                    // InternalDSL.g:989:2: ( ruleCharacteristicVariable )
                    // InternalDSL.g:990:3: ruleCharacteristicVariable
                    {
                     before(grammarAccess.getCharacteristicVariableTypeAccess().getCharacteristicVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicVariable();

                    state._fsp--;

                     after(grammarAccess.getCharacteristicVariableTypeAccess().getCharacteristicVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:995:2: ( ruleCharacteristicSet )
                    {
                    // InternalDSL.g:995:2: ( ruleCharacteristicSet )
                    // InternalDSL.g:996:3: ruleCharacteristicSet
                    {
                     before(grammarAccess.getCharacteristicVariableTypeAccess().getCharacteristicSetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicSet();

                    state._fsp--;

                     after(grammarAccess.getCharacteristicVariableTypeAccess().getCharacteristicSetParserRuleCall_1()); 

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
    // $ANTLR end "rule__CharacteristicVariableType__Alternatives"


    // $ANTLR start "rule__DataSelector__Alternatives"
    // InternalDSL.g:1005:1: rule__DataSelector__Alternatives : ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) );
    public final void rule__DataSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1009:1: ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:1010:2: ( ruleAttributeSelector )
                    {
                    // InternalDSL.g:1010:2: ( ruleAttributeSelector )
                    // InternalDSL.g:1011:3: ruleAttributeSelector
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
                    // InternalDSL.g:1016:2: ( ruleAttributeClassSelector )
                    {
                    // InternalDSL.g:1016:2: ( ruleAttributeClassSelector )
                    // InternalDSL.g:1017:3: ruleAttributeClassSelector
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
    // InternalDSL.g:1026:1: rule__DestinationSelector__Alternatives : ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) );
    public final void rule__DestinationSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1030:1: ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
            case 34:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDSL.g:1031:2: ( rulePropertySelector )
                    {
                    // InternalDSL.g:1031:2: ( rulePropertySelector )
                    // InternalDSL.g:1032:3: rulePropertySelector
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
                    // InternalDSL.g:1037:2: ( rulePropertyClassSelector )
                    {
                    // InternalDSL.g:1037:2: ( rulePropertyClassSelector )
                    // InternalDSL.g:1038:3: rulePropertyClassSelector
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
                    // InternalDSL.g:1043:2: ( ruleNodeIdentitiySelector )
                    {
                    // InternalDSL.g:1043:2: ( ruleNodeIdentitiySelector )
                    // InternalDSL.g:1044:3: ruleNodeIdentitiySelector
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
    // InternalDSL.g:1053:1: rule__NodeIdentitiySelector__Alternatives : ( ( ( rule__NodeIdentitiySelector__Group_0__0 ) ) | ( ( rule__NodeIdentitiySelector__Group_1__0 ) ) );
    public final void rule__NodeIdentitiySelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1057:1: ( ( ( rule__NodeIdentitiySelector__Group_0__0 ) ) | ( ( rule__NodeIdentitiySelector__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            else if ( (LA6_0==34) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:1058:2: ( ( rule__NodeIdentitiySelector__Group_0__0 ) )
                    {
                    // InternalDSL.g:1058:2: ( ( rule__NodeIdentitiySelector__Group_0__0 ) )
                    // InternalDSL.g:1059:3: ( rule__NodeIdentitiySelector__Group_0__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_0()); 
                    // InternalDSL.g:1060:3: ( rule__NodeIdentitiySelector__Group_0__0 )
                    // InternalDSL.g:1060:4: rule__NodeIdentitiySelector__Group_0__0
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
                    // InternalDSL.g:1064:2: ( ( rule__NodeIdentitiySelector__Group_1__0 ) )
                    {
                    // InternalDSL.g:1064:2: ( ( rule__NodeIdentitiySelector__Group_1__0 ) )
                    // InternalDSL.g:1065:3: ( rule__NodeIdentitiySelector__Group_1__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_1()); 
                    // InternalDSL.g:1066:3: ( rule__NodeIdentitiySelector__Group_1__0 )
                    // InternalDSL.g:1066:4: rule__NodeIdentitiySelector__Group_1__0
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


    // $ANTLR start "rule__CharacteristicSetReference__Alternatives"
    // InternalDSL.g:1074:1: rule__CharacteristicSetReference__Alternatives : ( ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) ) | ( ( rule__CharacteristicSetReference__RefAssignment_1 ) ) );
    public final void rule__CharacteristicSetReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1078:1: ( ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) ) | ( ( rule__CharacteristicSetReference__RefAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==20||LA7_0==42) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:1079:2: ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) )
                    {
                    // InternalDSL.g:1079:2: ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) )
                    // InternalDSL.g:1080:3: ( rule__CharacteristicSetReference__ValueAssignment_0 )
                    {
                     before(grammarAccess.getCharacteristicSetReferenceAccess().getValueAssignment_0()); 
                    // InternalDSL.g:1081:3: ( rule__CharacteristicSetReference__ValueAssignment_0 )
                    // InternalDSL.g:1081:4: rule__CharacteristicSetReference__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicSetReference__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicSetReferenceAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1085:2: ( ( rule__CharacteristicSetReference__RefAssignment_1 ) )
                    {
                    // InternalDSL.g:1085:2: ( ( rule__CharacteristicSetReference__RefAssignment_1 ) )
                    // InternalDSL.g:1086:3: ( rule__CharacteristicSetReference__RefAssignment_1 )
                    {
                     before(grammarAccess.getCharacteristicSetReferenceAccess().getRefAssignment_1()); 
                    // InternalDSL.g:1087:3: ( rule__CharacteristicSetReference__RefAssignment_1 )
                    // InternalDSL.g:1087:4: rule__CharacteristicSetReference__RefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicSetReference__RefAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicSetReferenceAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__CharacteristicSetReference__Alternatives"


    // $ANTLR start "rule__BooleanOperation__Alternatives"
    // InternalDSL.g:1095:1: rule__BooleanOperation__Alternatives : ( ( ruleLogicalAndOperation ) | ( ruleLogicalNegationOperation ) | ( ruleVariableEqualityOperation ) | ( ruleVariableInequalityOperation ) | ( ruleEmptySetOperation ) );
    public final void rule__BooleanOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1099:1: ( ( ruleLogicalAndOperation ) | ( ruleLogicalNegationOperation ) | ( ruleVariableEqualityOperation ) | ( ruleVariableInequalityOperation ) | ( ruleEmptySetOperation ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt8=1;
                }
                break;
            case 38:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==40) ) {
                    alt8=4;
                }
                else if ( (LA8_3==39) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDSL.g:1100:2: ( ruleLogicalAndOperation )
                    {
                    // InternalDSL.g:1100:2: ( ruleLogicalAndOperation )
                    // InternalDSL.g:1101:3: ruleLogicalAndOperation
                    {
                     before(grammarAccess.getBooleanOperationAccess().getLogicalAndOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLogicalAndOperation();

                    state._fsp--;

                     after(grammarAccess.getBooleanOperationAccess().getLogicalAndOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1106:2: ( ruleLogicalNegationOperation )
                    {
                    // InternalDSL.g:1106:2: ( ruleLogicalNegationOperation )
                    // InternalDSL.g:1107:3: ruleLogicalNegationOperation
                    {
                     before(grammarAccess.getBooleanOperationAccess().getLogicalNegationOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLogicalNegationOperation();

                    state._fsp--;

                     after(grammarAccess.getBooleanOperationAccess().getLogicalNegationOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1112:2: ( ruleVariableEqualityOperation )
                    {
                    // InternalDSL.g:1112:2: ( ruleVariableEqualityOperation )
                    // InternalDSL.g:1113:3: ruleVariableEqualityOperation
                    {
                     before(grammarAccess.getBooleanOperationAccess().getVariableEqualityOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableEqualityOperation();

                    state._fsp--;

                     after(grammarAccess.getBooleanOperationAccess().getVariableEqualityOperationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:1118:2: ( ruleVariableInequalityOperation )
                    {
                    // InternalDSL.g:1118:2: ( ruleVariableInequalityOperation )
                    // InternalDSL.g:1119:3: ruleVariableInequalityOperation
                    {
                     before(grammarAccess.getBooleanOperationAccess().getVariableInequalityOperationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableInequalityOperation();

                    state._fsp--;

                     after(grammarAccess.getBooleanOperationAccess().getVariableInequalityOperationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:1124:2: ( ruleEmptySetOperation )
                    {
                    // InternalDSL.g:1124:2: ( ruleEmptySetOperation )
                    // InternalDSL.g:1125:3: ruleEmptySetOperation
                    {
                     before(grammarAccess.getBooleanOperationAccess().getEmptySetOperationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptySetOperation();

                    state._fsp--;

                     after(grammarAccess.getBooleanOperationAccess().getEmptySetOperationParserRuleCall_4()); 

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
    // $ANTLR end "rule__BooleanOperation__Alternatives"


    // $ANTLR start "rule__CharacteristsicSetOperation__Alternatives"
    // InternalDSL.g:1134:1: rule__CharacteristsicSetOperation__Alternatives : ( ( ruleCreateSetOperation ) | ( ruleIntersectionOperation ) );
    public final void rule__CharacteristsicSetOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1138:1: ( ( ruleCreateSetOperation ) | ( ruleIntersectionOperation ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==42) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:1139:2: ( ruleCreateSetOperation )
                    {
                    // InternalDSL.g:1139:2: ( ruleCreateSetOperation )
                    // InternalDSL.g:1140:3: ruleCreateSetOperation
                    {
                     before(grammarAccess.getCharacteristsicSetOperationAccess().getCreateSetOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateSetOperation();

                    state._fsp--;

                     after(grammarAccess.getCharacteristsicSetOperationAccess().getCreateSetOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1145:2: ( ruleIntersectionOperation )
                    {
                    // InternalDSL.g:1145:2: ( ruleIntersectionOperation )
                    // InternalDSL.g:1146:3: ruleIntersectionOperation
                    {
                     before(grammarAccess.getCharacteristsicSetOperationAccess().getIntersectionOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntersectionOperation();

                    state._fsp--;

                     after(grammarAccess.getCharacteristsicSetOperationAccess().getIntersectionOperationParserRuleCall_1()); 

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
    // $ANTLR end "rule__CharacteristsicSetOperation__Alternatives"


    // $ANTLR start "rule__TargetModelType__Alternatives"
    // InternalDSL.g:1155:1: rule__TargetModelType__Alternatives : ( ( ( 'OperationModel' ) ) | ( ( 'DataCentricPalladio' ) ) | ( ( 'ExtendedDFD' ) ) );
    public final void rule__TargetModelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1159:1: ( ( ( 'OperationModel' ) ) | ( ( 'DataCentricPalladio' ) ) | ( ( 'ExtendedDFD' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt10=1;
                }
                break;
            case 12:
                {
                alt10=2;
                }
                break;
            case 13:
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
                    // InternalDSL.g:1160:2: ( ( 'OperationModel' ) )
                    {
                    // InternalDSL.g:1160:2: ( ( 'OperationModel' ) )
                    // InternalDSL.g:1161:3: ( 'OperationModel' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1162:3: ( 'OperationModel' )
                    // InternalDSL.g:1162:4: 'OperationModel'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1166:2: ( ( 'DataCentricPalladio' ) )
                    {
                    // InternalDSL.g:1166:2: ( ( 'DataCentricPalladio' ) )
                    // InternalDSL.g:1167:3: ( 'DataCentricPalladio' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1168:3: ( 'DataCentricPalladio' )
                    // InternalDSL.g:1168:4: 'DataCentricPalladio'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1172:2: ( ( 'ExtendedDFD' ) )
                    {
                    // InternalDSL.g:1172:2: ( ( 'ExtendedDFD' ) )
                    // InternalDSL.g:1173:3: ( 'ExtendedDFD' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:1174:3: ( 'ExtendedDFD' )
                    // InternalDSL.g:1174:4: 'ExtendedDFD'
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
    // InternalDSL.g:1182:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1186:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDSL.g:1187:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDSL.g:1194:1: rule__Model__Group__0__Impl : ( ( rule__Model__TargetModelTypeAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1198:1: ( ( ( rule__Model__TargetModelTypeAssignment_0 )? ) )
            // InternalDSL.g:1199:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            {
            // InternalDSL.g:1199:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            // InternalDSL.g:1200:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getTargetModelTypeAssignment_0()); 
            // InternalDSL.g:1201:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1201:3: rule__Model__TargetModelTypeAssignment_0
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
    // InternalDSL.g:1209:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1213:1: ( rule__Model__Group__1__Impl )
            // InternalDSL.g:1214:2: rule__Model__Group__1__Impl
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
    // InternalDSL.g:1220:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1224:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDSL.g:1225:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDSL.g:1225:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDSL.g:1226:2: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDSL.g:1227:2: ( rule__Model__ElementsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_SL_COMMENT||LA12_0==17||LA12_0==19||(LA12_0>=26 && LA12_0<=27)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:1227:3: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDSL.g:1236:1: rule__TargetModelTypeDef__Group__0 : rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 ;
    public final void rule__TargetModelTypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1240:1: ( rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 )
            // InternalDSL.g:1241:2: rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1
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
    // InternalDSL.g:1248:1: rule__TargetModelTypeDef__Group__0__Impl : ( 'target' ) ;
    public final void rule__TargetModelTypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1252:1: ( ( 'target' ) )
            // InternalDSL.g:1253:1: ( 'target' )
            {
            // InternalDSL.g:1253:1: ( 'target' )
            // InternalDSL.g:1254:2: 'target'
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
    // InternalDSL.g:1263:1: rule__TargetModelTypeDef__Group__1 : rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2 ;
    public final void rule__TargetModelTypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1267:1: ( rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2 )
            // InternalDSL.g:1268:2: rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2
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
    // InternalDSL.g:1275:1: rule__TargetModelTypeDef__Group__1__Impl : ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1279:1: ( ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) )
            // InternalDSL.g:1280:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            {
            // InternalDSL.g:1280:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            // InternalDSL.g:1281:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeAssignment_1()); 
            // InternalDSL.g:1282:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            // InternalDSL.g:1282:3: rule__TargetModelTypeDef__TypeAssignment_1
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
    // InternalDSL.g:1290:1: rule__TargetModelTypeDef__Group__2 : rule__TargetModelTypeDef__Group__2__Impl ;
    public final void rule__TargetModelTypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1294:1: ( rule__TargetModelTypeDef__Group__2__Impl )
            // InternalDSL.g:1295:2: rule__TargetModelTypeDef__Group__2__Impl
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
    // InternalDSL.g:1301:1: rule__TargetModelTypeDef__Group__2__Impl : ( ( rule__TargetModelTypeDef__Group_2__0 )? ) ;
    public final void rule__TargetModelTypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1305:1: ( ( ( rule__TargetModelTypeDef__Group_2__0 )? ) )
            // InternalDSL.g:1306:1: ( ( rule__TargetModelTypeDef__Group_2__0 )? )
            {
            // InternalDSL.g:1306:1: ( ( rule__TargetModelTypeDef__Group_2__0 )? )
            // InternalDSL.g:1307:2: ( rule__TargetModelTypeDef__Group_2__0 )?
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getGroup_2()); 
            // InternalDSL.g:1308:2: ( rule__TargetModelTypeDef__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:1308:3: rule__TargetModelTypeDef__Group_2__0
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
    // InternalDSL.g:1317:1: rule__TargetModelTypeDef__Group_2__0 : rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1 ;
    public final void rule__TargetModelTypeDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1321:1: ( rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1 )
            // InternalDSL.g:1322:2: rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1
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
    // InternalDSL.g:1329:1: rule__TargetModelTypeDef__Group_2__0__Impl : ( 'using' ) ;
    public final void rule__TargetModelTypeDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1333:1: ( ( 'using' ) )
            // InternalDSL.g:1334:1: ( 'using' )
            {
            // InternalDSL.g:1334:1: ( 'using' )
            // InternalDSL.g:1335:2: 'using'
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
    // InternalDSL.g:1344:1: rule__TargetModelTypeDef__Group_2__1 : rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2 ;
    public final void rule__TargetModelTypeDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1348:1: ( rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2 )
            // InternalDSL.g:1349:2: rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2
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
    // InternalDSL.g:1356:1: rule__TargetModelTypeDef__Group_2__1__Impl : ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1360:1: ( ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) ) )
            // InternalDSL.g:1361:1: ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) )
            {
            // InternalDSL.g:1361:1: ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) )
            // InternalDSL.g:1362:2: ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerAssignment_2_1()); 
            // InternalDSL.g:1363:2: ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 )
            // InternalDSL.g:1363:3: rule__TargetModelTypeDef__TypeContainerAssignment_2_1
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
    // InternalDSL.g:1371:1: rule__TargetModelTypeDef__Group_2__2 : rule__TargetModelTypeDef__Group_2__2__Impl ;
    public final void rule__TargetModelTypeDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1375:1: ( rule__TargetModelTypeDef__Group_2__2__Impl )
            // InternalDSL.g:1376:2: rule__TargetModelTypeDef__Group_2__2__Impl
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
    // InternalDSL.g:1382:1: rule__TargetModelTypeDef__Group_2__2__Impl : ( ( rule__TargetModelTypeDef__Group_2_2__0 )? ) ;
    public final void rule__TargetModelTypeDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1386:1: ( ( ( rule__TargetModelTypeDef__Group_2_2__0 )? ) )
            // InternalDSL.g:1387:1: ( ( rule__TargetModelTypeDef__Group_2_2__0 )? )
            {
            // InternalDSL.g:1387:1: ( ( rule__TargetModelTypeDef__Group_2_2__0 )? )
            // InternalDSL.g:1388:2: ( rule__TargetModelTypeDef__Group_2_2__0 )?
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getGroup_2_2()); 
            // InternalDSL.g:1389:2: ( rule__TargetModelTypeDef__Group_2_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:1389:3: rule__TargetModelTypeDef__Group_2_2__0
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
    // InternalDSL.g:1398:1: rule__TargetModelTypeDef__Group_2_2__0 : rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1 ;
    public final void rule__TargetModelTypeDef__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1402:1: ( rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1 )
            // InternalDSL.g:1403:2: rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1
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
    // InternalDSL.g:1410:1: rule__TargetModelTypeDef__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1414:1: ( ( ',' ) )
            // InternalDSL.g:1415:1: ( ',' )
            {
            // InternalDSL.g:1415:1: ( ',' )
            // InternalDSL.g:1416:2: ','
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
    // InternalDSL.g:1425:1: rule__TargetModelTypeDef__Group_2_2__1 : rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2 ;
    public final void rule__TargetModelTypeDef__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1429:1: ( rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2 )
            // InternalDSL.g:1430:2: rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2
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
    // InternalDSL.g:1437:1: rule__TargetModelTypeDef__Group_2_2__1__Impl : ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1441:1: ( ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) ) )
            // InternalDSL.g:1442:1: ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) )
            {
            // InternalDSL.g:1442:1: ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) )
            // InternalDSL.g:1443:2: ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAssignment_2_2_1()); 
            // InternalDSL.g:1444:2: ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 )
            // InternalDSL.g:1444:3: rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1
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
    // InternalDSL.g:1452:1: rule__TargetModelTypeDef__Group_2_2__2 : rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3 ;
    public final void rule__TargetModelTypeDef__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1456:1: ( rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3 )
            // InternalDSL.g:1457:2: rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3
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
    // InternalDSL.g:1464:1: rule__TargetModelTypeDef__Group_2_2__2__Impl : ( ',' ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1468:1: ( ( ',' ) )
            // InternalDSL.g:1469:1: ( ',' )
            {
            // InternalDSL.g:1469:1: ( ',' )
            // InternalDSL.g:1470:2: ','
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
    // InternalDSL.g:1479:1: rule__TargetModelTypeDef__Group_2_2__3 : rule__TargetModelTypeDef__Group_2_2__3__Impl ;
    public final void rule__TargetModelTypeDef__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1483:1: ( rule__TargetModelTypeDef__Group_2_2__3__Impl )
            // InternalDSL.g:1484:2: rule__TargetModelTypeDef__Group_2_2__3__Impl
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
    // InternalDSL.g:1490:1: rule__TargetModelTypeDef__Group_2_2__3__Impl : ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1494:1: ( ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) ) )
            // InternalDSL.g:1495:1: ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) )
            {
            // InternalDSL.g:1495:1: ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) )
            // InternalDSL.g:1496:2: ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsageModelAssignment_2_2_3()); 
            // InternalDSL.g:1497:2: ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 )
            // InternalDSL.g:1497:3: rule__TargetModelTypeDef__UsageModelAssignment_2_2_3
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
    // InternalDSL.g:1506:1: rule__AbstractElement__Group_4__0 : rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 ;
    public final void rule__AbstractElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1510:1: ( rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 )
            // InternalDSL.g:1511:2: rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1
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
    // InternalDSL.g:1518:1: rule__AbstractElement__Group_4__0__Impl : ( () ) ;
    public final void rule__AbstractElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1522:1: ( ( () ) )
            // InternalDSL.g:1523:1: ( () )
            {
            // InternalDSL.g:1523:1: ( () )
            // InternalDSL.g:1524:2: ()
            {
             before(grammarAccess.getAbstractElementAccess().getAbstractElementAction_4_0()); 
            // InternalDSL.g:1525:2: ()
            // InternalDSL.g:1525:3: 
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
    // InternalDSL.g:1533:1: rule__AbstractElement__Group_4__1 : rule__AbstractElement__Group_4__1__Impl ;
    public final void rule__AbstractElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1537:1: ( rule__AbstractElement__Group_4__1__Impl )
            // InternalDSL.g:1538:2: rule__AbstractElement__Group_4__1__Impl
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
    // InternalDSL.g:1544:1: rule__AbstractElement__Group_4__1__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__AbstractElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1548:1: ( ( RULE_SL_COMMENT ) )
            // InternalDSL.g:1549:1: ( RULE_SL_COMMENT )
            {
            // InternalDSL.g:1549:1: ( RULE_SL_COMMENT )
            // InternalDSL.g:1550:2: RULE_SL_COMMENT
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
    // InternalDSL.g:1560:1: rule__CharacteristicType__Group__0 : rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 ;
    public final void rule__CharacteristicType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1564:1: ( rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 )
            // InternalDSL.g:1565:2: rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1
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
    // InternalDSL.g:1572:1: rule__CharacteristicType__Group__0__Impl : ( 'type' ) ;
    public final void rule__CharacteristicType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1576:1: ( ( 'type' ) )
            // InternalDSL.g:1577:1: ( 'type' )
            {
            // InternalDSL.g:1577:1: ( 'type' )
            // InternalDSL.g:1578:2: 'type'
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
    // InternalDSL.g:1587:1: rule__CharacteristicType__Group__1 : rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 ;
    public final void rule__CharacteristicType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1591:1: ( rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 )
            // InternalDSL.g:1592:2: rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2
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
    // InternalDSL.g:1599:1: rule__CharacteristicType__Group__1__Impl : ( ( rule__CharacteristicType__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1603:1: ( ( ( rule__CharacteristicType__NameAssignment_1 ) ) )
            // InternalDSL.g:1604:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1604:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            // InternalDSL.g:1605:2: ( rule__CharacteristicType__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1606:2: ( rule__CharacteristicType__NameAssignment_1 )
            // InternalDSL.g:1606:3: rule__CharacteristicType__NameAssignment_1
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
    // InternalDSL.g:1614:1: rule__CharacteristicType__Group__2 : rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 ;
    public final void rule__CharacteristicType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1618:1: ( rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 )
            // InternalDSL.g:1619:2: rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3
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
    // InternalDSL.g:1626:1: rule__CharacteristicType__Group__2__Impl : ( ':' ) ;
    public final void rule__CharacteristicType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1630:1: ( ( ':' ) )
            // InternalDSL.g:1631:1: ( ':' )
            {
            // InternalDSL.g:1631:1: ( ':' )
            // InternalDSL.g:1632:2: ':'
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
    // InternalDSL.g:1641:1: rule__CharacteristicType__Group__3 : rule__CharacteristicType__Group__3__Impl ;
    public final void rule__CharacteristicType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1645:1: ( rule__CharacteristicType__Group__3__Impl )
            // InternalDSL.g:1646:2: rule__CharacteristicType__Group__3__Impl
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
    // InternalDSL.g:1652:1: rule__CharacteristicType__Group__3__Impl : ( ( rule__CharacteristicType__RefAssignment_3 ) ) ;
    public final void rule__CharacteristicType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1656:1: ( ( ( rule__CharacteristicType__RefAssignment_3 ) ) )
            // InternalDSL.g:1657:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            {
            // InternalDSL.g:1657:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            // InternalDSL.g:1658:2: ( rule__CharacteristicType__RefAssignment_3 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefAssignment_3()); 
            // InternalDSL.g:1659:2: ( rule__CharacteristicType__RefAssignment_3 )
            // InternalDSL.g:1659:3: rule__CharacteristicType__RefAssignment_3
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
    // InternalDSL.g:1668:1: rule__CharacteristicClass__Group__0 : rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 ;
    public final void rule__CharacteristicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1672:1: ( rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 )
            // InternalDSL.g:1673:2: rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1
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
    // InternalDSL.g:1680:1: rule__CharacteristicClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__CharacteristicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1684:1: ( ( 'class' ) )
            // InternalDSL.g:1685:1: ( 'class' )
            {
            // InternalDSL.g:1685:1: ( 'class' )
            // InternalDSL.g:1686:2: 'class'
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
    // InternalDSL.g:1695:1: rule__CharacteristicClass__Group__1 : rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 ;
    public final void rule__CharacteristicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1699:1: ( rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 )
            // InternalDSL.g:1700:2: rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2
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
    // InternalDSL.g:1707:1: rule__CharacteristicClass__Group__1__Impl : ( ( rule__CharacteristicClass__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1711:1: ( ( ( rule__CharacteristicClass__NameAssignment_1 ) ) )
            // InternalDSL.g:1712:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            {
            // InternalDSL.g:1712:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            // InternalDSL.g:1713:2: ( rule__CharacteristicClass__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 
            // InternalDSL.g:1714:2: ( rule__CharacteristicClass__NameAssignment_1 )
            // InternalDSL.g:1714:3: rule__CharacteristicClass__NameAssignment_1
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
    // InternalDSL.g:1722:1: rule__CharacteristicClass__Group__2 : rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 ;
    public final void rule__CharacteristicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1726:1: ( rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 )
            // InternalDSL.g:1727:2: rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3
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
    // InternalDSL.g:1734:1: rule__CharacteristicClass__Group__2__Impl : ( '{' ) ;
    public final void rule__CharacteristicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1738:1: ( ( '{' ) )
            // InternalDSL.g:1739:1: ( '{' )
            {
            // InternalDSL.g:1739:1: ( '{' )
            // InternalDSL.g:1740:2: '{'
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
    // InternalDSL.g:1749:1: rule__CharacteristicClass__Group__3 : rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 ;
    public final void rule__CharacteristicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1753:1: ( rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 )
            // InternalDSL.g:1754:2: rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4
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
    // InternalDSL.g:1761:1: rule__CharacteristicClass__Group__3__Impl : ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) ;
    public final void rule__CharacteristicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1765:1: ( ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) )
            // InternalDSL.g:1766:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            {
            // InternalDSL.g:1766:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            // InternalDSL.g:1767:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 
            // InternalDSL.g:1768:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            // InternalDSL.g:1768:3: rule__CharacteristicClass__MembersAssignment_3
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
    // InternalDSL.g:1776:1: rule__CharacteristicClass__Group__4 : rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 ;
    public final void rule__CharacteristicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1780:1: ( rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 )
            // InternalDSL.g:1781:2: rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5
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
    // InternalDSL.g:1788:1: rule__CharacteristicClass__Group__4__Impl : ( ( rule__CharacteristicClass__Group_4__0 )* ) ;
    public final void rule__CharacteristicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1792:1: ( ( ( rule__CharacteristicClass__Group_4__0 )* ) )
            // InternalDSL.g:1793:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            {
            // InternalDSL.g:1793:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            // InternalDSL.g:1794:2: ( rule__CharacteristicClass__Group_4__0 )*
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 
            // InternalDSL.g:1795:2: ( rule__CharacteristicClass__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDSL.g:1795:3: rule__CharacteristicClass__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CharacteristicClass__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDSL.g:1803:1: rule__CharacteristicClass__Group__5 : rule__CharacteristicClass__Group__5__Impl ;
    public final void rule__CharacteristicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1807:1: ( rule__CharacteristicClass__Group__5__Impl )
            // InternalDSL.g:1808:2: rule__CharacteristicClass__Group__5__Impl
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
    // InternalDSL.g:1814:1: rule__CharacteristicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__CharacteristicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1818:1: ( ( '}' ) )
            // InternalDSL.g:1819:1: ( '}' )
            {
            // InternalDSL.g:1819:1: ( '}' )
            // InternalDSL.g:1820:2: '}'
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
    // InternalDSL.g:1830:1: rule__CharacteristicClass__Group_4__0 : rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 ;
    public final void rule__CharacteristicClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1834:1: ( rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 )
            // InternalDSL.g:1835:2: rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1
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
    // InternalDSL.g:1842:1: rule__CharacteristicClass__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1846:1: ( ( ',' ) )
            // InternalDSL.g:1847:1: ( ',' )
            {
            // InternalDSL.g:1847:1: ( ',' )
            // InternalDSL.g:1848:2: ','
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
    // InternalDSL.g:1857:1: rule__CharacteristicClass__Group_4__1 : rule__CharacteristicClass__Group_4__1__Impl ;
    public final void rule__CharacteristicClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1861:1: ( rule__CharacteristicClass__Group_4__1__Impl )
            // InternalDSL.g:1862:2: rule__CharacteristicClass__Group_4__1__Impl
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
    // InternalDSL.g:1868:1: rule__CharacteristicClass__Group_4__1__Impl : ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) ;
    public final void rule__CharacteristicClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1872:1: ( ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) )
            // InternalDSL.g:1873:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            {
            // InternalDSL.g:1873:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            // InternalDSL.g:1874:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 
            // InternalDSL.g:1875:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            // InternalDSL.g:1875:3: rule__CharacteristicClass__MembersAssignment_4_1
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
    // InternalDSL.g:1884:1: rule__CharacteristicTypeSelector__Group__0 : rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 ;
    public final void rule__CharacteristicTypeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1888:1: ( rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 )
            // InternalDSL.g:1889:2: rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1
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
    // InternalDSL.g:1896:1: rule__CharacteristicTypeSelector__Group__0__Impl : ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1900:1: ( ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) )
            // InternalDSL.g:1901:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            {
            // InternalDSL.g:1901:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            // InternalDSL.g:1902:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefAssignment_0()); 
            // InternalDSL.g:1903:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            // InternalDSL.g:1903:3: rule__CharacteristicTypeSelector__RefAssignment_0
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
    // InternalDSL.g:1911:1: rule__CharacteristicTypeSelector__Group__1 : rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 ;
    public final void rule__CharacteristicTypeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1915:1: ( rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 )
            // InternalDSL.g:1916:2: rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2
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
    // InternalDSL.g:1923:1: rule__CharacteristicTypeSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__CharacteristicTypeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1927:1: ( ( '.' ) )
            // InternalDSL.g:1928:1: ( '.' )
            {
            // InternalDSL.g:1928:1: ( '.' )
            // InternalDSL.g:1929:2: '.'
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
    // InternalDSL.g:1938:1: rule__CharacteristicTypeSelector__Group__2 : rule__CharacteristicTypeSelector__Group__2__Impl ;
    public final void rule__CharacteristicTypeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1942:1: ( rule__CharacteristicTypeSelector__Group__2__Impl )
            // InternalDSL.g:1943:2: rule__CharacteristicTypeSelector__Group__2__Impl
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
    // InternalDSL.g:1949:1: rule__CharacteristicTypeSelector__Group__2__Impl : ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1953:1: ( ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) )
            // InternalDSL.g:1954:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            {
            // InternalDSL.g:1954:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            // InternalDSL.g:1955:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2()); 
            // InternalDSL.g:1956:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            // InternalDSL.g:1956:3: rule__CharacteristicTypeSelector__Alternatives_2
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
    // InternalDSL.g:1965:1: rule__CharacteristicTypeSelector__Group_2_0__0 : rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1969:1: ( rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 )
            // InternalDSL.g:1970:2: rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1
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
    // InternalDSL.g:1977:1: rule__CharacteristicTypeSelector__Group_2_0__0__Impl : ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1981:1: ( ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) )
            // InternalDSL.g:1982:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            {
            // InternalDSL.g:1982:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            // InternalDSL.g:1983:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedAssignment_2_0_0()); 
            // InternalDSL.g:1984:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDSL.g:1984:3: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0
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
    // InternalDSL.g:1992:1: rule__CharacteristicTypeSelector__Group_2_0__1 : rule__CharacteristicTypeSelector__Group_2_0__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1996:1: ( rule__CharacteristicTypeSelector__Group_2_0__1__Impl )
            // InternalDSL.g:1997:2: rule__CharacteristicTypeSelector__Group_2_0__1__Impl
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
    // InternalDSL.g:2003:1: rule__CharacteristicTypeSelector__Group_2_0__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2007:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) )
            // InternalDSL.g:2008:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            {
            // InternalDSL.g:2008:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            // InternalDSL.g:2009:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_0_1()); 
            // InternalDSL.g:2010:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            // InternalDSL.g:2010:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1
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
    // InternalDSL.g:2019:1: rule__CharacteristicTypeSelector__Group_2_1__0 : rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2023:1: ( rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 )
            // InternalDSL.g:2024:2: rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1
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
    // InternalDSL.g:2031:1: rule__CharacteristicTypeSelector__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2035:1: ( ( '[' ) )
            // InternalDSL.g:2036:1: ( '[' )
            {
            // InternalDSL.g:2036:1: ( '[' )
            // InternalDSL.g:2037:2: '['
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
    // InternalDSL.g:2046:1: rule__CharacteristicTypeSelector__Group_2_1__1 : rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2050:1: ( rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 )
            // InternalDSL.g:2051:2: rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2
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
    // InternalDSL.g:2058:1: rule__CharacteristicTypeSelector__Group_2_1__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2062:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) )
            // InternalDSL.g:2063:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            {
            // InternalDSL.g:2063:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            // InternalDSL.g:2064:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_1()); 
            // InternalDSL.g:2065:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            // InternalDSL.g:2065:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1
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
    // InternalDSL.g:2073:1: rule__CharacteristicTypeSelector__Group_2_1__2 : rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2077:1: ( rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 )
            // InternalDSL.g:2078:2: rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3
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
    // InternalDSL.g:2085:1: rule__CharacteristicTypeSelector__Group_2_1__2__Impl : ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2089:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) )
            // InternalDSL.g:2090:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            {
            // InternalDSL.g:2090:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            // InternalDSL.g:2091:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2()); 
            // InternalDSL.g:2092:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:2092:3: rule__CharacteristicTypeSelector__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CharacteristicTypeSelector__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDSL.g:2100:1: rule__CharacteristicTypeSelector__Group_2_1__3 : rule__CharacteristicTypeSelector__Group_2_1__3__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2104:1: ( rule__CharacteristicTypeSelector__Group_2_1__3__Impl )
            // InternalDSL.g:2105:2: rule__CharacteristicTypeSelector__Group_2_1__3__Impl
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
    // InternalDSL.g:2111:1: rule__CharacteristicTypeSelector__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2115:1: ( ( ']' ) )
            // InternalDSL.g:2116:1: ( ']' )
            {
            // InternalDSL.g:2116:1: ( ']' )
            // InternalDSL.g:2117:2: ']'
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
    // InternalDSL.g:2127:1: rule__CharacteristicTypeSelector__Group_2_1_2__0 : rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2131:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 )
            // InternalDSL.g:2132:2: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1
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
    // InternalDSL.g:2139:1: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2143:1: ( ( ',' ) )
            // InternalDSL.g:2144:1: ( ',' )
            {
            // InternalDSL.g:2144:1: ( ',' )
            // InternalDSL.g:2145:2: ','
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
    // InternalDSL.g:2154:1: rule__CharacteristicTypeSelector__Group_2_1_2__1 : rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2158:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl )
            // InternalDSL.g:2159:2: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl
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
    // InternalDSL.g:2165:1: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2169:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) )
            // InternalDSL.g:2170:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            {
            // InternalDSL.g:2170:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            // InternalDSL.g:2171:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_1()); 
            // InternalDSL.g:2172:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            // InternalDSL.g:2172:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1
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


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_2__0"
    // InternalDSL.g:2181:1: rule__CharacteristicTypeSelector__Group_2_2__0 : rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2185:1: ( rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1 )
            // InternalDSL.g:2186:2: rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1
            {
            pushFollow(FOLLOW_7);
            rule__CharacteristicTypeSelector__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_2__1();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_2__0"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_2__0__Impl"
    // InternalDSL.g:2193:1: rule__CharacteristicTypeSelector__Group_2_2__0__Impl : ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2197:1: ( ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) ) )
            // InternalDSL.g:2198:1: ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) )
            {
            // InternalDSL.g:2198:1: ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) )
            // InternalDSL.g:2199:2: ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorAssignment_2_2_0()); 
            // InternalDSL.g:2200:2: ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 )
            // InternalDSL.g:2200:3: rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_2__0__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_2__1"
    // InternalDSL.g:2208:1: rule__CharacteristicTypeSelector__Group_2_2__1 : rule__CharacteristicTypeSelector__Group_2_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2212:1: ( rule__CharacteristicTypeSelector__Group_2_2__1__Impl )
            // InternalDSL.g:2213:2: rule__CharacteristicTypeSelector__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_2__1"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_2__1__Impl"
    // InternalDSL.g:2219:1: rule__CharacteristicTypeSelector__Group_2_2__1__Impl : ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2223:1: ( ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) ) )
            // InternalDSL.g:2224:1: ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) )
            {
            // InternalDSL.g:2224:1: ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) )
            // InternalDSL.g:2225:2: ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableAssignment_2_2_1()); 
            // InternalDSL.g:2226:2: ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 )
            // InternalDSL.g:2226:3: rule__CharacteristicTypeSelector__VariableAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__VariableAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_2__1__Impl"


    // $ANTLR start "rule__CharacteristicSet__Group__0"
    // InternalDSL.g:2235:1: rule__CharacteristicSet__Group__0 : rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1 ;
    public final void rule__CharacteristicSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2239:1: ( rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1 )
            // InternalDSL.g:2240:2: rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__CharacteristicSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSet__Group__1();

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
    // $ANTLR end "rule__CharacteristicSet__Group__0"


    // $ANTLR start "rule__CharacteristicSet__Group__0__Impl"
    // InternalDSL.g:2247:1: rule__CharacteristicSet__Group__0__Impl : ( ( rule__CharacteristicSet__NameAssignment_0 ) ) ;
    public final void rule__CharacteristicSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2251:1: ( ( ( rule__CharacteristicSet__NameAssignment_0 ) ) )
            // InternalDSL.g:2252:1: ( ( rule__CharacteristicSet__NameAssignment_0 ) )
            {
            // InternalDSL.g:2252:1: ( ( rule__CharacteristicSet__NameAssignment_0 ) )
            // InternalDSL.g:2253:2: ( rule__CharacteristicSet__NameAssignment_0 )
            {
             before(grammarAccess.getCharacteristicSetAccess().getNameAssignment_0()); 
            // InternalDSL.g:2254:2: ( rule__CharacteristicSet__NameAssignment_0 )
            // InternalDSL.g:2254:3: rule__CharacteristicSet__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSet__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSetAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSet__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicSet__Group__1"
    // InternalDSL.g:2262:1: rule__CharacteristicSet__Group__1 : rule__CharacteristicSet__Group__1__Impl ;
    public final void rule__CharacteristicSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2266:1: ( rule__CharacteristicSet__Group__1__Impl )
            // InternalDSL.g:2267:2: rule__CharacteristicSet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSet__Group__1__Impl();

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
    // $ANTLR end "rule__CharacteristicSet__Group__1"


    // $ANTLR start "rule__CharacteristicSet__Group__1__Impl"
    // InternalDSL.g:2273:1: rule__CharacteristicSet__Group__1__Impl : ( '{}' ) ;
    public final void rule__CharacteristicSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2277:1: ( ( '{}' ) )
            // InternalDSL.g:2278:1: ( '{}' )
            {
            // InternalDSL.g:2278:1: ( '{}' )
            // InternalDSL.g:2279:2: '{}'
            {
             before(grammarAccess.getCharacteristicSetAccess().getLeftCurlyBracketRightCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSetAccess().getLeftCurlyBracketRightCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSet__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // InternalDSL.g:2289:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2293:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalDSL.g:2294:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDSL.g:2301:1: rule__Include__Group__0__Impl : ( 'import' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2305:1: ( ( 'import' ) )
            // InternalDSL.g:2306:1: ( 'import' )
            {
            // InternalDSL.g:2306:1: ( 'import' )
            // InternalDSL.g:2307:2: 'import'
            {
             before(grammarAccess.getIncludeAccess().getImportKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:2316:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2320:1: ( rule__Include__Group__1__Impl )
            // InternalDSL.g:2321:2: rule__Include__Group__1__Impl
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
    // InternalDSL.g:2327:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2331:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // InternalDSL.g:2332:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // InternalDSL.g:2332:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // InternalDSL.g:2333:2: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // InternalDSL.g:2334:2: ( rule__Include__ImportURIAssignment_1 )
            // InternalDSL.g:2334:3: rule__Include__ImportURIAssignment_1
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
    // InternalDSL.g:2343:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2347:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDSL.g:2348:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalDSL.g:2355:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2359:1: ( ( 'constraint' ) )
            // InternalDSL.g:2360:1: ( 'constraint' )
            {
            // InternalDSL.g:2360:1: ( 'constraint' )
            // InternalDSL.g:2361:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDSL.g:2370:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2374:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDSL.g:2375:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalDSL.g:2382:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2386:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDSL.g:2387:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDSL.g:2387:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDSL.g:2388:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDSL.g:2389:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDSL.g:2389:3: rule__Constraint__NameAssignment_1
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
    // InternalDSL.g:2397:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2401:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDSL.g:2402:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalDSL.g:2409:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2413:1: ( ( '{' ) )
            // InternalDSL.g:2414:1: ( '{' )
            {
            // InternalDSL.g:2414:1: ( '{' )
            // InternalDSL.g:2415:2: '{'
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
    // InternalDSL.g:2424:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2428:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDSL.g:2429:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalDSL.g:2436:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__RuleAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2440:1: ( ( ( rule__Constraint__RuleAssignment_3 ) ) )
            // InternalDSL.g:2441:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            {
            // InternalDSL.g:2441:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            // InternalDSL.g:2442:2: ( rule__Constraint__RuleAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 
            // InternalDSL.g:2443:2: ( rule__Constraint__RuleAssignment_3 )
            // InternalDSL.g:2443:3: rule__Constraint__RuleAssignment_3
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
    // InternalDSL.g:2451:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2455:1: ( rule__Constraint__Group__4__Impl )
            // InternalDSL.g:2456:2: rule__Constraint__Group__4__Impl
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
    // InternalDSL.g:2462:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2466:1: ( ( '}' ) )
            // InternalDSL.g:2467:1: ( '}' )
            {
            // InternalDSL.g:2467:1: ( '}' )
            // InternalDSL.g:2468:2: '}'
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
    // InternalDSL.g:2478:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2482:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDSL.g:2483:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDSL.g:2490:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DataSelectorsAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2494:1: ( ( ( rule__Rule__DataSelectorsAssignment_0 ) ) )
            // InternalDSL.g:2495:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            {
            // InternalDSL.g:2495:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            // InternalDSL.g:2496:2: ( rule__Rule__DataSelectorsAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 
            // InternalDSL.g:2497:2: ( rule__Rule__DataSelectorsAssignment_0 )
            // InternalDSL.g:2497:3: rule__Rule__DataSelectorsAssignment_0
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
    // InternalDSL.g:2505:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2509:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDSL.g:2510:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalDSL.g:2517:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2521:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // InternalDSL.g:2522:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // InternalDSL.g:2522:1: ( ( rule__Rule__Group_1__0 )* )
            // InternalDSL.g:2523:2: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // InternalDSL.g:2524:2: ( rule__Rule__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDSL.g:2524:3: rule__Rule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalDSL.g:2532:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2536:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDSL.g:2537:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalDSL.g:2544:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__StatementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2548:1: ( ( ( rule__Rule__StatementAssignment_2 ) ) )
            // InternalDSL.g:2549:1: ( ( rule__Rule__StatementAssignment_2 ) )
            {
            // InternalDSL.g:2549:1: ( ( rule__Rule__StatementAssignment_2 ) )
            // InternalDSL.g:2550:2: ( rule__Rule__StatementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getStatementAssignment_2()); 
            // InternalDSL.g:2551:2: ( rule__Rule__StatementAssignment_2 )
            // InternalDSL.g:2551:3: rule__Rule__StatementAssignment_2
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
    // InternalDSL.g:2559:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2563:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDSL.g:2564:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalDSL.g:2571:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2575:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) )
            // InternalDSL.g:2576:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            {
            // InternalDSL.g:2576:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            // InternalDSL.g:2577:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 
            // InternalDSL.g:2578:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            // InternalDSL.g:2578:3: rule__Rule__DestinationSelectorsAssignment_3
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
    // InternalDSL.g:2586:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2590:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalDSL.g:2591:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

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
    // InternalDSL.g:2598:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2602:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // InternalDSL.g:2603:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // InternalDSL.g:2603:1: ( ( rule__Rule__Group_4__0 )* )
            // InternalDSL.g:2604:2: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalDSL.g:2605:2: ( rule__Rule__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDSL.g:2605:3: rule__Rule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "rule__Rule__Group__5"
    // InternalDSL.g:2613:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2617:1: ( rule__Rule__Group__5__Impl )
            // InternalDSL.g:2618:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__5__Impl();

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
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalDSL.g:2624:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ConditionAssignment_5 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2628:1: ( ( ( rule__Rule__ConditionAssignment_5 )? ) )
            // InternalDSL.g:2629:1: ( ( rule__Rule__ConditionAssignment_5 )? )
            {
            // InternalDSL.g:2629:1: ( ( rule__Rule__ConditionAssignment_5 )? )
            // InternalDSL.g:2630:2: ( rule__Rule__ConditionAssignment_5 )?
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_5()); 
            // InternalDSL.g:2631:2: ( rule__Rule__ConditionAssignment_5 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDSL.g:2631:3: rule__Rule__ConditionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__ConditionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group_1__0"
    // InternalDSL.g:2640:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2644:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalDSL.g:2645:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDSL.g:2652:1: rule__Rule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2656:1: ( ( '&' ) )
            // InternalDSL.g:2657:1: ( '&' )
            {
            // InternalDSL.g:2657:1: ( '&' )
            // InternalDSL.g:2658:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:2667:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2671:1: ( rule__Rule__Group_1__1__Impl )
            // InternalDSL.g:2672:2: rule__Rule__Group_1__1__Impl
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
    // InternalDSL.g:2678:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2682:1: ( ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) )
            // InternalDSL.g:2683:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            {
            // InternalDSL.g:2683:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            // InternalDSL.g:2684:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 
            // InternalDSL.g:2685:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            // InternalDSL.g:2685:3: rule__Rule__DataSelectorsAssignment_1_1
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
    // InternalDSL.g:2694:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2698:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalDSL.g:2699:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDSL.g:2706:1: rule__Rule__Group_4__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2710:1: ( ( '&' ) )
            // InternalDSL.g:2711:1: ( '&' )
            {
            // InternalDSL.g:2711:1: ( '&' )
            // InternalDSL.g:2712:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:2721:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2725:1: ( rule__Rule__Group_4__1__Impl )
            // InternalDSL.g:2726:2: rule__Rule__Group_4__1__Impl
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
    // InternalDSL.g:2732:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2736:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) )
            // InternalDSL.g:2737:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            {
            // InternalDSL.g:2737:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            // InternalDSL.g:2738:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 
            // InternalDSL.g:2739:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            // InternalDSL.g:2739:3: rule__Rule__DestinationSelectorsAssignment_4_1
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
    // InternalDSL.g:2748:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2752:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // InternalDSL.g:2753:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
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
    // InternalDSL.g:2760:1: rule__AttributeSelector__Group__0__Impl : ( 'data.attribute.' ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2764:1: ( ( 'data.attribute.' ) )
            // InternalDSL.g:2765:1: ( 'data.attribute.' )
            {
            // InternalDSL.g:2765:1: ( 'data.attribute.' )
            // InternalDSL.g:2766:2: 'data.attribute.'
            {
             before(grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:2775:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2779:1: ( rule__AttributeSelector__Group__1__Impl )
            // InternalDSL.g:2780:2: rule__AttributeSelector__Group__1__Impl
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
    // InternalDSL.g:2786:1: rule__AttributeSelector__Group__1__Impl : ( ( rule__AttributeSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2790:1: ( ( ( rule__AttributeSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2791:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2791:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            // InternalDSL.g:2792:2: ( rule__AttributeSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2793:2: ( rule__AttributeSelector__RefAssignment_1 )
            // InternalDSL.g:2793:3: rule__AttributeSelector__RefAssignment_1
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
    // InternalDSL.g:2802:1: rule__AttributeClassSelector__Group__0 : rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 ;
    public final void rule__AttributeClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2806:1: ( rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 )
            // InternalDSL.g:2807:2: rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1
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
    // InternalDSL.g:2814:1: rule__AttributeClassSelector__Group__0__Impl : ( 'data.class.' ) ;
    public final void rule__AttributeClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2818:1: ( ( 'data.class.' ) )
            // InternalDSL.g:2819:1: ( 'data.class.' )
            {
            // InternalDSL.g:2819:1: ( 'data.class.' )
            // InternalDSL.g:2820:2: 'data.class.'
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:2829:1: rule__AttributeClassSelector__Group__1 : rule__AttributeClassSelector__Group__1__Impl ;
    public final void rule__AttributeClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2833:1: ( rule__AttributeClassSelector__Group__1__Impl )
            // InternalDSL.g:2834:2: rule__AttributeClassSelector__Group__1__Impl
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
    // InternalDSL.g:2840:1: rule__AttributeClassSelector__Group__1__Impl : ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2844:1: ( ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2845:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2845:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:2846:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2847:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            // InternalDSL.g:2847:3: rule__AttributeClassSelector__RefAssignment_1
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
    // InternalDSL.g:2856:1: rule__PropertySelector__Group__0 : rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 ;
    public final void rule__PropertySelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2860:1: ( rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 )
            // InternalDSL.g:2861:2: rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1
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
    // InternalDSL.g:2868:1: rule__PropertySelector__Group__0__Impl : ( 'node.property.' ) ;
    public final void rule__PropertySelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2872:1: ( ( 'node.property.' ) )
            // InternalDSL.g:2873:1: ( 'node.property.' )
            {
            // InternalDSL.g:2873:1: ( 'node.property.' )
            // InternalDSL.g:2874:2: 'node.property.'
            {
             before(grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:2883:1: rule__PropertySelector__Group__1 : rule__PropertySelector__Group__1__Impl ;
    public final void rule__PropertySelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2887:1: ( rule__PropertySelector__Group__1__Impl )
            // InternalDSL.g:2888:2: rule__PropertySelector__Group__1__Impl
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
    // InternalDSL.g:2894:1: rule__PropertySelector__Group__1__Impl : ( ( rule__PropertySelector__RefAssignment_1 ) ) ;
    public final void rule__PropertySelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2898:1: ( ( ( rule__PropertySelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2899:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2899:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            // InternalDSL.g:2900:2: ( rule__PropertySelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2901:2: ( rule__PropertySelector__RefAssignment_1 )
            // InternalDSL.g:2901:3: rule__PropertySelector__RefAssignment_1
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
    // InternalDSL.g:2910:1: rule__PropertyClassSelector__Group__0 : rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 ;
    public final void rule__PropertyClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2914:1: ( rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 )
            // InternalDSL.g:2915:2: rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1
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
    // InternalDSL.g:2922:1: rule__PropertyClassSelector__Group__0__Impl : ( 'node.class.' ) ;
    public final void rule__PropertyClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2926:1: ( ( 'node.class.' ) )
            // InternalDSL.g:2927:1: ( 'node.class.' )
            {
            // InternalDSL.g:2927:1: ( 'node.class.' )
            // InternalDSL.g:2928:2: 'node.class.'
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDSL.g:2937:1: rule__PropertyClassSelector__Group__1 : rule__PropertyClassSelector__Group__1__Impl ;
    public final void rule__PropertyClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2941:1: ( rule__PropertyClassSelector__Group__1__Impl )
            // InternalDSL.g:2942:2: rule__PropertyClassSelector__Group__1__Impl
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
    // InternalDSL.g:2948:1: rule__PropertyClassSelector__Group__1__Impl : ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) ;
    public final void rule__PropertyClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2952:1: ( ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2953:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2953:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:2954:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2955:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            // InternalDSL.g:2955:3: rule__PropertyClassSelector__RefAssignment_1
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
    // InternalDSL.g:2964:1: rule__NodeIdentitiySelector__Group_0__0 : rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1 ;
    public final void rule__NodeIdentitiySelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2968:1: ( rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1 )
            // InternalDSL.g:2969:2: rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDSL.g:2976:1: rule__NodeIdentitiySelector__Group_0__0__Impl : ( 'node.name.' ) ;
    public final void rule__NodeIdentitiySelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2980:1: ( ( 'node.name.' ) )
            // InternalDSL.g:2981:1: ( 'node.name.' )
            {
            // InternalDSL.g:2981:1: ( 'node.name.' )
            // InternalDSL.g:2982:2: 'node.name.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDSL.g:2991:1: rule__NodeIdentitiySelector__Group_0__1 : rule__NodeIdentitiySelector__Group_0__1__Impl ;
    public final void rule__NodeIdentitiySelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2995:1: ( rule__NodeIdentitiySelector__Group_0__1__Impl )
            // InternalDSL.g:2996:2: rule__NodeIdentitiySelector__Group_0__1__Impl
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
    // InternalDSL.g:3002:1: rule__NodeIdentitiySelector__Group_0__1__Impl : ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3006:1: ( ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) ) )
            // InternalDSL.g:3007:1: ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) )
            {
            // InternalDSL.g:3007:1: ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) )
            // InternalDSL.g:3008:2: ( rule__NodeIdentitiySelector__NameAssignment_0_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNameAssignment_0_1()); 
            // InternalDSL.g:3009:2: ( rule__NodeIdentitiySelector__NameAssignment_0_1 )
            // InternalDSL.g:3009:3: rule__NodeIdentitiySelector__NameAssignment_0_1
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
    // InternalDSL.g:3018:1: rule__NodeIdentitiySelector__Group_1__0 : rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1 ;
    public final void rule__NodeIdentitiySelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3022:1: ( rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1 )
            // InternalDSL.g:3023:2: rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1
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
    // InternalDSL.g:3030:1: rule__NodeIdentitiySelector__Group_1__0__Impl : ( 'node.identity.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3034:1: ( ( 'node.identity.' ) )
            // InternalDSL.g:3035:1: ( 'node.identity.' )
            {
            // InternalDSL.g:3035:1: ( 'node.identity.' )
            // InternalDSL.g:3036:2: 'node.identity.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNodeIdentityKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDSL.g:3045:1: rule__NodeIdentitiySelector__Group_1__1 : rule__NodeIdentitiySelector__Group_1__1__Impl rule__NodeIdentitiySelector__Group_1__2 ;
    public final void rule__NodeIdentitiySelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3049:1: ( rule__NodeIdentitiySelector__Group_1__1__Impl rule__NodeIdentitiySelector__Group_1__2 )
            // InternalDSL.g:3050:2: rule__NodeIdentitiySelector__Group_1__1__Impl rule__NodeIdentitiySelector__Group_1__2
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
    // InternalDSL.g:3057:1: rule__NodeIdentitiySelector__Group_1__1__Impl : ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3061:1: ( ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) ) )
            // InternalDSL.g:3062:1: ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) )
            {
            // InternalDSL.g:3062:1: ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) )
            // InternalDSL.g:3063:2: ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssignment_1_1()); 
            // InternalDSL.g:3064:2: ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 )
            // InternalDSL.g:3064:3: rule__NodeIdentitiySelector__AssemblyAssignment_1_1
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
    // InternalDSL.g:3072:1: rule__NodeIdentitiySelector__Group_1__2 : rule__NodeIdentitiySelector__Group_1__2__Impl rule__NodeIdentitiySelector__Group_1__3 ;
    public final void rule__NodeIdentitiySelector__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3076:1: ( rule__NodeIdentitiySelector__Group_1__2__Impl rule__NodeIdentitiySelector__Group_1__3 )
            // InternalDSL.g:3077:2: rule__NodeIdentitiySelector__Group_1__2__Impl rule__NodeIdentitiySelector__Group_1__3
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
    // InternalDSL.g:3084:1: rule__NodeIdentitiySelector__Group_1__2__Impl : ( '.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3088:1: ( ( '.' ) )
            // InternalDSL.g:3089:1: ( '.' )
            {
            // InternalDSL.g:3089:1: ( '.' )
            // InternalDSL.g:3090:2: '.'
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
    // InternalDSL.g:3099:1: rule__NodeIdentitiySelector__Group_1__3 : rule__NodeIdentitiySelector__Group_1__3__Impl rule__NodeIdentitiySelector__Group_1__4 ;
    public final void rule__NodeIdentitiySelector__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3103:1: ( rule__NodeIdentitiySelector__Group_1__3__Impl rule__NodeIdentitiySelector__Group_1__4 )
            // InternalDSL.g:3104:2: rule__NodeIdentitiySelector__Group_1__3__Impl rule__NodeIdentitiySelector__Group_1__4
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
    // InternalDSL.g:3111:1: rule__NodeIdentitiySelector__Group_1__3__Impl : ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3115:1: ( ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) ) )
            // InternalDSL.g:3116:1: ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) )
            {
            // InternalDSL.g:3116:1: ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) )
            // InternalDSL.g:3117:2: ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getComponentAssignment_1_3()); 
            // InternalDSL.g:3118:2: ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 )
            // InternalDSL.g:3118:3: rule__NodeIdentitiySelector__ComponentAssignment_1_3
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
    // InternalDSL.g:3126:1: rule__NodeIdentitiySelector__Group_1__4 : rule__NodeIdentitiySelector__Group_1__4__Impl rule__NodeIdentitiySelector__Group_1__5 ;
    public final void rule__NodeIdentitiySelector__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3130:1: ( rule__NodeIdentitiySelector__Group_1__4__Impl rule__NodeIdentitiySelector__Group_1__5 )
            // InternalDSL.g:3131:2: rule__NodeIdentitiySelector__Group_1__4__Impl rule__NodeIdentitiySelector__Group_1__5
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
    // InternalDSL.g:3138:1: rule__NodeIdentitiySelector__Group_1__4__Impl : ( '.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3142:1: ( ( '.' ) )
            // InternalDSL.g:3143:1: ( '.' )
            {
            // InternalDSL.g:3143:1: ( '.' )
            // InternalDSL.g:3144:2: '.'
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
    // InternalDSL.g:3153:1: rule__NodeIdentitiySelector__Group_1__5 : rule__NodeIdentitiySelector__Group_1__5__Impl ;
    public final void rule__NodeIdentitiySelector__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3157:1: ( rule__NodeIdentitiySelector__Group_1__5__Impl )
            // InternalDSL.g:3158:2: rule__NodeIdentitiySelector__Group_1__5__Impl
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
    // InternalDSL.g:3164:1: rule__NodeIdentitiySelector__Group_1__5__Impl : ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3168:1: ( ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) ) )
            // InternalDSL.g:3169:1: ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) )
            {
            // InternalDSL.g:3169:1: ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) )
            // InternalDSL.g:3170:2: ( rule__NodeIdentitiySelector__SeffAssignment_1_5 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getSeffAssignment_1_5()); 
            // InternalDSL.g:3171:2: ( rule__NodeIdentitiySelector__SeffAssignment_1_5 )
            // InternalDSL.g:3171:3: rule__NodeIdentitiySelector__SeffAssignment_1_5
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
    // InternalDSL.g:3180:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3184:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalDSL.g:3185:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDSL.g:3192:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__ModalityAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3196:1: ( ( ( rule__Statement__ModalityAssignment_0 ) ) )
            // InternalDSL.g:3197:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            {
            // InternalDSL.g:3197:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            // InternalDSL.g:3198:2: ( rule__Statement__ModalityAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getModalityAssignment_0()); 
            // InternalDSL.g:3199:2: ( rule__Statement__ModalityAssignment_0 )
            // InternalDSL.g:3199:3: rule__Statement__ModalityAssignment_0
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
    // InternalDSL.g:3207:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3211:1: ( rule__Statement__Group__1__Impl )
            // InternalDSL.g:3212:2: rule__Statement__Group__1__Impl
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
    // InternalDSL.g:3218:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__TypeAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3222:1: ( ( ( rule__Statement__TypeAssignment_1 ) ) )
            // InternalDSL.g:3223:1: ( ( rule__Statement__TypeAssignment_1 ) )
            {
            // InternalDSL.g:3223:1: ( ( rule__Statement__TypeAssignment_1 ) )
            // InternalDSL.g:3224:2: ( rule__Statement__TypeAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_1()); 
            // InternalDSL.g:3225:2: ( rule__Statement__TypeAssignment_1 )
            // InternalDSL.g:3225:3: rule__Statement__TypeAssignment_1
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


    // $ANTLR start "rule__Condition__Group__0"
    // InternalDSL.g:3234:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3238:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalDSL.g:3239:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalDSL.g:3246:1: rule__Condition__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3250:1: ( ( 'WHERE' ) )
            // InternalDSL.g:3251:1: ( 'WHERE' )
            {
            // InternalDSL.g:3251:1: ( 'WHERE' )
            // InternalDSL.g:3252:2: 'WHERE'
            {
             before(grammarAccess.getConditionAccess().getWHEREKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getWHEREKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalDSL.g:3261:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3265:1: ( rule__Condition__Group__1__Impl )
            // InternalDSL.g:3266:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalDSL.g:3272:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperationAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3276:1: ( ( ( rule__Condition__OperationAssignment_1 ) ) )
            // InternalDSL.g:3277:1: ( ( rule__Condition__OperationAssignment_1 ) )
            {
            // InternalDSL.g:3277:1: ( ( rule__Condition__OperationAssignment_1 ) )
            // InternalDSL.g:3278:2: ( rule__Condition__OperationAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperationAssignment_1()); 
            // InternalDSL.g:3279:2: ( rule__Condition__OperationAssignment_1 )
            // InternalDSL.g:3279:3: rule__Condition__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group__0"
    // InternalDSL.g:3288:1: rule__LogicalAndOperation__Group__0 : rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1 ;
    public final void rule__LogicalAndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3292:1: ( rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1 )
            // InternalDSL.g:3293:2: rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__LogicalAndOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group__1();

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
    // $ANTLR end "rule__LogicalAndOperation__Group__0"


    // $ANTLR start "rule__LogicalAndOperation__Group__0__Impl"
    // InternalDSL.g:3300:1: rule__LogicalAndOperation__Group__0__Impl : ( '(' ) ;
    public final void rule__LogicalAndOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3304:1: ( ( '(' ) )
            // InternalDSL.g:3305:1: ( '(' )
            {
            // InternalDSL.g:3305:1: ( '(' )
            // InternalDSL.g:3306:2: '('
            {
             before(grammarAccess.getLogicalAndOperationAccess().getLeftParenthesisKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLogicalAndOperationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group__0__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group__1"
    // InternalDSL.g:3315:1: rule__LogicalAndOperation__Group__1 : rule__LogicalAndOperation__Group__1__Impl rule__LogicalAndOperation__Group__2 ;
    public final void rule__LogicalAndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3319:1: ( rule__LogicalAndOperation__Group__1__Impl rule__LogicalAndOperation__Group__2 )
            // InternalDSL.g:3320:2: rule__LogicalAndOperation__Group__1__Impl rule__LogicalAndOperation__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__LogicalAndOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group__2();

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
    // $ANTLR end "rule__LogicalAndOperation__Group__1"


    // $ANTLR start "rule__LogicalAndOperation__Group__1__Impl"
    // InternalDSL.g:3327:1: rule__LogicalAndOperation__Group__1__Impl : ( ( rule__LogicalAndOperation__LeftAssignment_1 ) ) ;
    public final void rule__LogicalAndOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3331:1: ( ( ( rule__LogicalAndOperation__LeftAssignment_1 ) ) )
            // InternalDSL.g:3332:1: ( ( rule__LogicalAndOperation__LeftAssignment_1 ) )
            {
            // InternalDSL.g:3332:1: ( ( rule__LogicalAndOperation__LeftAssignment_1 ) )
            // InternalDSL.g:3333:2: ( rule__LogicalAndOperation__LeftAssignment_1 )
            {
             before(grammarAccess.getLogicalAndOperationAccess().getLeftAssignment_1()); 
            // InternalDSL.g:3334:2: ( rule__LogicalAndOperation__LeftAssignment_1 )
            // InternalDSL.g:3334:3: rule__LogicalAndOperation__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndOperationAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group__1__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group__2"
    // InternalDSL.g:3342:1: rule__LogicalAndOperation__Group__2 : rule__LogicalAndOperation__Group__2__Impl rule__LogicalAndOperation__Group__3 ;
    public final void rule__LogicalAndOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3346:1: ( rule__LogicalAndOperation__Group__2__Impl rule__LogicalAndOperation__Group__3 )
            // InternalDSL.g:3347:2: rule__LogicalAndOperation__Group__2__Impl rule__LogicalAndOperation__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__LogicalAndOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group__3();

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
    // $ANTLR end "rule__LogicalAndOperation__Group__2"


    // $ANTLR start "rule__LogicalAndOperation__Group__2__Impl"
    // InternalDSL.g:3354:1: rule__LogicalAndOperation__Group__2__Impl : ( '&' ) ;
    public final void rule__LogicalAndOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3358:1: ( ( '&' ) )
            // InternalDSL.g:3359:1: ( '&' )
            {
            // InternalDSL.g:3359:1: ( '&' )
            // InternalDSL.g:3360:2: '&'
            {
             before(grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group__2__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group__3"
    // InternalDSL.g:3369:1: rule__LogicalAndOperation__Group__3 : rule__LogicalAndOperation__Group__3__Impl rule__LogicalAndOperation__Group__4 ;
    public final void rule__LogicalAndOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3373:1: ( rule__LogicalAndOperation__Group__3__Impl rule__LogicalAndOperation__Group__4 )
            // InternalDSL.g:3374:2: rule__LogicalAndOperation__Group__3__Impl rule__LogicalAndOperation__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__LogicalAndOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group__4();

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
    // $ANTLR end "rule__LogicalAndOperation__Group__3"


    // $ANTLR start "rule__LogicalAndOperation__Group__3__Impl"
    // InternalDSL.g:3381:1: rule__LogicalAndOperation__Group__3__Impl : ( ( rule__LogicalAndOperation__RightAssignment_3 ) ) ;
    public final void rule__LogicalAndOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3385:1: ( ( ( rule__LogicalAndOperation__RightAssignment_3 ) ) )
            // InternalDSL.g:3386:1: ( ( rule__LogicalAndOperation__RightAssignment_3 ) )
            {
            // InternalDSL.g:3386:1: ( ( rule__LogicalAndOperation__RightAssignment_3 ) )
            // InternalDSL.g:3387:2: ( rule__LogicalAndOperation__RightAssignment_3 )
            {
             before(grammarAccess.getLogicalAndOperationAccess().getRightAssignment_3()); 
            // InternalDSL.g:3388:2: ( rule__LogicalAndOperation__RightAssignment_3 )
            // InternalDSL.g:3388:3: rule__LogicalAndOperation__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndOperationAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group__3__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group__4"
    // InternalDSL.g:3396:1: rule__LogicalAndOperation__Group__4 : rule__LogicalAndOperation__Group__4__Impl ;
    public final void rule__LogicalAndOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3400:1: ( rule__LogicalAndOperation__Group__4__Impl )
            // InternalDSL.g:3401:2: rule__LogicalAndOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group__4__Impl();

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
    // $ANTLR end "rule__LogicalAndOperation__Group__4"


    // $ANTLR start "rule__LogicalAndOperation__Group__4__Impl"
    // InternalDSL.g:3407:1: rule__LogicalAndOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__LogicalAndOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3411:1: ( ( ')' ) )
            // InternalDSL.g:3412:1: ( ')' )
            {
            // InternalDSL.g:3412:1: ( ')' )
            // InternalDSL.g:3413:2: ')'
            {
             before(grammarAccess.getLogicalAndOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLogicalAndOperationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group__4__Impl"


    // $ANTLR start "rule__LogicalNegationOperation__Group__0"
    // InternalDSL.g:3423:1: rule__LogicalNegationOperation__Group__0 : rule__LogicalNegationOperation__Group__0__Impl rule__LogicalNegationOperation__Group__1 ;
    public final void rule__LogicalNegationOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3427:1: ( rule__LogicalNegationOperation__Group__0__Impl rule__LogicalNegationOperation__Group__1 )
            // InternalDSL.g:3428:2: rule__LogicalNegationOperation__Group__0__Impl rule__LogicalNegationOperation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__LogicalNegationOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__Group__1();

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
    // $ANTLR end "rule__LogicalNegationOperation__Group__0"


    // $ANTLR start "rule__LogicalNegationOperation__Group__0__Impl"
    // InternalDSL.g:3435:1: rule__LogicalNegationOperation__Group__0__Impl : ( '!' ) ;
    public final void rule__LogicalNegationOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3439:1: ( ( '!' ) )
            // InternalDSL.g:3440:1: ( '!' )
            {
            // InternalDSL.g:3440:1: ( '!' )
            // InternalDSL.g:3441:2: '!'
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalNegationOperation__Group__0__Impl"


    // $ANTLR start "rule__LogicalNegationOperation__Group__1"
    // InternalDSL.g:3450:1: rule__LogicalNegationOperation__Group__1 : rule__LogicalNegationOperation__Group__1__Impl ;
    public final void rule__LogicalNegationOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3454:1: ( rule__LogicalNegationOperation__Group__1__Impl )
            // InternalDSL.g:3455:2: rule__LogicalNegationOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__Group__1__Impl();

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
    // $ANTLR end "rule__LogicalNegationOperation__Group__1"


    // $ANTLR start "rule__LogicalNegationOperation__Group__1__Impl"
    // InternalDSL.g:3461:1: rule__LogicalNegationOperation__Group__1__Impl : ( ( rule__LogicalNegationOperation__ValueAssignment_1 ) ) ;
    public final void rule__LogicalNegationOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3465:1: ( ( ( rule__LogicalNegationOperation__ValueAssignment_1 ) ) )
            // InternalDSL.g:3466:1: ( ( rule__LogicalNegationOperation__ValueAssignment_1 ) )
            {
            // InternalDSL.g:3466:1: ( ( rule__LogicalNegationOperation__ValueAssignment_1 ) )
            // InternalDSL.g:3467:2: ( rule__LogicalNegationOperation__ValueAssignment_1 )
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getValueAssignment_1()); 
            // InternalDSL.g:3468:2: ( rule__LogicalNegationOperation__ValueAssignment_1 )
            // InternalDSL.g:3468:3: rule__LogicalNegationOperation__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalNegationOperationAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalNegationOperation__Group__1__Impl"


    // $ANTLR start "rule__VariableEqualityOperation__Group__0"
    // InternalDSL.g:3477:1: rule__VariableEqualityOperation__Group__0 : rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1 ;
    public final void rule__VariableEqualityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3481:1: ( rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1 )
            // InternalDSL.g:3482:2: rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__VariableEqualityOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__Group__1();

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
    // $ANTLR end "rule__VariableEqualityOperation__Group__0"


    // $ANTLR start "rule__VariableEqualityOperation__Group__0__Impl"
    // InternalDSL.g:3489:1: rule__VariableEqualityOperation__Group__0__Impl : ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) ) ;
    public final void rule__VariableEqualityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3493:1: ( ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) ) )
            // InternalDSL.g:3494:1: ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) )
            {
            // InternalDSL.g:3494:1: ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) )
            // InternalDSL.g:3495:2: ( rule__VariableEqualityOperation__LeftAssignment_0 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getLeftAssignment_0()); 
            // InternalDSL.g:3496:2: ( rule__VariableEqualityOperation__LeftAssignment_0 )
            // InternalDSL.g:3496:3: rule__VariableEqualityOperation__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableEqualityOperationAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableEqualityOperation__Group__0__Impl"


    // $ANTLR start "rule__VariableEqualityOperation__Group__1"
    // InternalDSL.g:3504:1: rule__VariableEqualityOperation__Group__1 : rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2 ;
    public final void rule__VariableEqualityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3508:1: ( rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2 )
            // InternalDSL.g:3509:2: rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__VariableEqualityOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__Group__2();

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
    // $ANTLR end "rule__VariableEqualityOperation__Group__1"


    // $ANTLR start "rule__VariableEqualityOperation__Group__1__Impl"
    // InternalDSL.g:3516:1: rule__VariableEqualityOperation__Group__1__Impl : ( '==' ) ;
    public final void rule__VariableEqualityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3520:1: ( ( '==' ) )
            // InternalDSL.g:3521:1: ( '==' )
            {
            // InternalDSL.g:3521:1: ( '==' )
            // InternalDSL.g:3522:2: '=='
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVariableEqualityOperationAccess().getEqualsSignEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableEqualityOperation__Group__1__Impl"


    // $ANTLR start "rule__VariableEqualityOperation__Group__2"
    // InternalDSL.g:3531:1: rule__VariableEqualityOperation__Group__2 : rule__VariableEqualityOperation__Group__2__Impl ;
    public final void rule__VariableEqualityOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3535:1: ( rule__VariableEqualityOperation__Group__2__Impl )
            // InternalDSL.g:3536:2: rule__VariableEqualityOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__Group__2__Impl();

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
    // $ANTLR end "rule__VariableEqualityOperation__Group__2"


    // $ANTLR start "rule__VariableEqualityOperation__Group__2__Impl"
    // InternalDSL.g:3542:1: rule__VariableEqualityOperation__Group__2__Impl : ( ( rule__VariableEqualityOperation__RightAssignment_2 ) ) ;
    public final void rule__VariableEqualityOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3546:1: ( ( ( rule__VariableEqualityOperation__RightAssignment_2 ) ) )
            // InternalDSL.g:3547:1: ( ( rule__VariableEqualityOperation__RightAssignment_2 ) )
            {
            // InternalDSL.g:3547:1: ( ( rule__VariableEqualityOperation__RightAssignment_2 ) )
            // InternalDSL.g:3548:2: ( rule__VariableEqualityOperation__RightAssignment_2 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getRightAssignment_2()); 
            // InternalDSL.g:3549:2: ( rule__VariableEqualityOperation__RightAssignment_2 )
            // InternalDSL.g:3549:3: rule__VariableEqualityOperation__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableEqualityOperationAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableEqualityOperation__Group__2__Impl"


    // $ANTLR start "rule__VariableInequalityOperation__Group__0"
    // InternalDSL.g:3558:1: rule__VariableInequalityOperation__Group__0 : rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1 ;
    public final void rule__VariableInequalityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3562:1: ( rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1 )
            // InternalDSL.g:3563:2: rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__VariableInequalityOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__Group__1();

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
    // $ANTLR end "rule__VariableInequalityOperation__Group__0"


    // $ANTLR start "rule__VariableInequalityOperation__Group__0__Impl"
    // InternalDSL.g:3570:1: rule__VariableInequalityOperation__Group__0__Impl : ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) ) ;
    public final void rule__VariableInequalityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3574:1: ( ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) ) )
            // InternalDSL.g:3575:1: ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) )
            {
            // InternalDSL.g:3575:1: ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) )
            // InternalDSL.g:3576:2: ( rule__VariableInequalityOperation__LeftAssignment_0 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getLeftAssignment_0()); 
            // InternalDSL.g:3577:2: ( rule__VariableInequalityOperation__LeftAssignment_0 )
            // InternalDSL.g:3577:3: rule__VariableInequalityOperation__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableInequalityOperationAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInequalityOperation__Group__0__Impl"


    // $ANTLR start "rule__VariableInequalityOperation__Group__1"
    // InternalDSL.g:3585:1: rule__VariableInequalityOperation__Group__1 : rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2 ;
    public final void rule__VariableInequalityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3589:1: ( rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2 )
            // InternalDSL.g:3590:2: rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__VariableInequalityOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__Group__2();

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
    // $ANTLR end "rule__VariableInequalityOperation__Group__1"


    // $ANTLR start "rule__VariableInequalityOperation__Group__1__Impl"
    // InternalDSL.g:3597:1: rule__VariableInequalityOperation__Group__1__Impl : ( '!=' ) ;
    public final void rule__VariableInequalityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3601:1: ( ( '!=' ) )
            // InternalDSL.g:3602:1: ( '!=' )
            {
            // InternalDSL.g:3602:1: ( '!=' )
            // InternalDSL.g:3603:2: '!='
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getExclamationMarkEqualsSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVariableInequalityOperationAccess().getExclamationMarkEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInequalityOperation__Group__1__Impl"


    // $ANTLR start "rule__VariableInequalityOperation__Group__2"
    // InternalDSL.g:3612:1: rule__VariableInequalityOperation__Group__2 : rule__VariableInequalityOperation__Group__2__Impl ;
    public final void rule__VariableInequalityOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3616:1: ( rule__VariableInequalityOperation__Group__2__Impl )
            // InternalDSL.g:3617:2: rule__VariableInequalityOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__Group__2__Impl();

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
    // $ANTLR end "rule__VariableInequalityOperation__Group__2"


    // $ANTLR start "rule__VariableInequalityOperation__Group__2__Impl"
    // InternalDSL.g:3623:1: rule__VariableInequalityOperation__Group__2__Impl : ( ( rule__VariableInequalityOperation__RightAssignment_2 ) ) ;
    public final void rule__VariableInequalityOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3627:1: ( ( ( rule__VariableInequalityOperation__RightAssignment_2 ) ) )
            // InternalDSL.g:3628:1: ( ( rule__VariableInequalityOperation__RightAssignment_2 ) )
            {
            // InternalDSL.g:3628:1: ( ( rule__VariableInequalityOperation__RightAssignment_2 ) )
            // InternalDSL.g:3629:2: ( rule__VariableInequalityOperation__RightAssignment_2 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getRightAssignment_2()); 
            // InternalDSL.g:3630:2: ( rule__VariableInequalityOperation__RightAssignment_2 )
            // InternalDSL.g:3630:3: rule__VariableInequalityOperation__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableInequalityOperationAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInequalityOperation__Group__2__Impl"


    // $ANTLR start "rule__EmptySetOperation__Group__0"
    // InternalDSL.g:3639:1: rule__EmptySetOperation__Group__0 : rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1 ;
    public final void rule__EmptySetOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3643:1: ( rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1 )
            // InternalDSL.g:3644:2: rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__EmptySetOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__1();

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
    // $ANTLR end "rule__EmptySetOperation__Group__0"


    // $ANTLR start "rule__EmptySetOperation__Group__0__Impl"
    // InternalDSL.g:3651:1: rule__EmptySetOperation__Group__0__Impl : ( 'isEmpty(' ) ;
    public final void rule__EmptySetOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3655:1: ( ( 'isEmpty(' ) )
            // InternalDSL.g:3656:1: ( 'isEmpty(' )
            {
            // InternalDSL.g:3656:1: ( 'isEmpty(' )
            // InternalDSL.g:3657:2: 'isEmpty('
            {
             before(grammarAccess.getEmptySetOperationAccess().getIsEmptyKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEmptySetOperationAccess().getIsEmptyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptySetOperation__Group__0__Impl"


    // $ANTLR start "rule__EmptySetOperation__Group__1"
    // InternalDSL.g:3666:1: rule__EmptySetOperation__Group__1 : rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2 ;
    public final void rule__EmptySetOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3670:1: ( rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2 )
            // InternalDSL.g:3671:2: rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__EmptySetOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__2();

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
    // $ANTLR end "rule__EmptySetOperation__Group__1"


    // $ANTLR start "rule__EmptySetOperation__Group__1__Impl"
    // InternalDSL.g:3678:1: rule__EmptySetOperation__Group__1__Impl : ( ( rule__EmptySetOperation__ValueAssignment_1 ) ) ;
    public final void rule__EmptySetOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3682:1: ( ( ( rule__EmptySetOperation__ValueAssignment_1 ) ) )
            // InternalDSL.g:3683:1: ( ( rule__EmptySetOperation__ValueAssignment_1 ) )
            {
            // InternalDSL.g:3683:1: ( ( rule__EmptySetOperation__ValueAssignment_1 ) )
            // InternalDSL.g:3684:2: ( rule__EmptySetOperation__ValueAssignment_1 )
            {
             before(grammarAccess.getEmptySetOperationAccess().getValueAssignment_1()); 
            // InternalDSL.g:3685:2: ( rule__EmptySetOperation__ValueAssignment_1 )
            // InternalDSL.g:3685:3: rule__EmptySetOperation__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmptySetOperationAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptySetOperation__Group__1__Impl"


    // $ANTLR start "rule__EmptySetOperation__Group__2"
    // InternalDSL.g:3693:1: rule__EmptySetOperation__Group__2 : rule__EmptySetOperation__Group__2__Impl ;
    public final void rule__EmptySetOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3697:1: ( rule__EmptySetOperation__Group__2__Impl )
            // InternalDSL.g:3698:2: rule__EmptySetOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__2__Impl();

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
    // $ANTLR end "rule__EmptySetOperation__Group__2"


    // $ANTLR start "rule__EmptySetOperation__Group__2__Impl"
    // InternalDSL.g:3704:1: rule__EmptySetOperation__Group__2__Impl : ( ')' ) ;
    public final void rule__EmptySetOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3708:1: ( ( ')' ) )
            // InternalDSL.g:3709:1: ( ')' )
            {
            // InternalDSL.g:3709:1: ( ')' )
            // InternalDSL.g:3710:2: ')'
            {
             before(grammarAccess.getEmptySetOperationAccess().getRightParenthesisKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEmptySetOperationAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptySetOperation__Group__2__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__0"
    // InternalDSL.g:3720:1: rule__IntersectionOperation__Group__0 : rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1 ;
    public final void rule__IntersectionOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3724:1: ( rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1 )
            // InternalDSL.g:3725:2: rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__IntersectionOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__1();

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
    // $ANTLR end "rule__IntersectionOperation__Group__0"


    // $ANTLR start "rule__IntersectionOperation__Group__0__Impl"
    // InternalDSL.g:3732:1: rule__IntersectionOperation__Group__0__Impl : ( 'intersection(' ) ;
    public final void rule__IntersectionOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3736:1: ( ( 'intersection(' ) )
            // InternalDSL.g:3737:1: ( 'intersection(' )
            {
            // InternalDSL.g:3737:1: ( 'intersection(' )
            // InternalDSL.g:3738:2: 'intersection('
            {
             before(grammarAccess.getIntersectionOperationAccess().getIntersectionKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getIntersectionOperationAccess().getIntersectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__Group__0__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__1"
    // InternalDSL.g:3747:1: rule__IntersectionOperation__Group__1 : rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2 ;
    public final void rule__IntersectionOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3751:1: ( rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2 )
            // InternalDSL.g:3752:2: rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__IntersectionOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__2();

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
    // $ANTLR end "rule__IntersectionOperation__Group__1"


    // $ANTLR start "rule__IntersectionOperation__Group__1__Impl"
    // InternalDSL.g:3759:1: rule__IntersectionOperation__Group__1__Impl : ( ( rule__IntersectionOperation__LeftAssignment_1 ) ) ;
    public final void rule__IntersectionOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3763:1: ( ( ( rule__IntersectionOperation__LeftAssignment_1 ) ) )
            // InternalDSL.g:3764:1: ( ( rule__IntersectionOperation__LeftAssignment_1 ) )
            {
            // InternalDSL.g:3764:1: ( ( rule__IntersectionOperation__LeftAssignment_1 ) )
            // InternalDSL.g:3765:2: ( rule__IntersectionOperation__LeftAssignment_1 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getLeftAssignment_1()); 
            // InternalDSL.g:3766:2: ( rule__IntersectionOperation__LeftAssignment_1 )
            // InternalDSL.g:3766:3: rule__IntersectionOperation__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionOperationAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__Group__1__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__2"
    // InternalDSL.g:3774:1: rule__IntersectionOperation__Group__2 : rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3 ;
    public final void rule__IntersectionOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3778:1: ( rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3 )
            // InternalDSL.g:3779:2: rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__IntersectionOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__3();

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
    // $ANTLR end "rule__IntersectionOperation__Group__2"


    // $ANTLR start "rule__IntersectionOperation__Group__2__Impl"
    // InternalDSL.g:3786:1: rule__IntersectionOperation__Group__2__Impl : ( ',' ) ;
    public final void rule__IntersectionOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3790:1: ( ( ',' ) )
            // InternalDSL.g:3791:1: ( ',' )
            {
            // InternalDSL.g:3791:1: ( ',' )
            // InternalDSL.g:3792:2: ','
            {
             before(grammarAccess.getIntersectionOperationAccess().getCommaKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIntersectionOperationAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__Group__2__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__3"
    // InternalDSL.g:3801:1: rule__IntersectionOperation__Group__3 : rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4 ;
    public final void rule__IntersectionOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3805:1: ( rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4 )
            // InternalDSL.g:3806:2: rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__IntersectionOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__4();

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
    // $ANTLR end "rule__IntersectionOperation__Group__3"


    // $ANTLR start "rule__IntersectionOperation__Group__3__Impl"
    // InternalDSL.g:3813:1: rule__IntersectionOperation__Group__3__Impl : ( ( rule__IntersectionOperation__RightAssignment_3 ) ) ;
    public final void rule__IntersectionOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3817:1: ( ( ( rule__IntersectionOperation__RightAssignment_3 ) ) )
            // InternalDSL.g:3818:1: ( ( rule__IntersectionOperation__RightAssignment_3 ) )
            {
            // InternalDSL.g:3818:1: ( ( rule__IntersectionOperation__RightAssignment_3 ) )
            // InternalDSL.g:3819:2: ( rule__IntersectionOperation__RightAssignment_3 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightAssignment_3()); 
            // InternalDSL.g:3820:2: ( rule__IntersectionOperation__RightAssignment_3 )
            // InternalDSL.g:3820:3: rule__IntersectionOperation__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionOperationAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__Group__3__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__4"
    // InternalDSL.g:3828:1: rule__IntersectionOperation__Group__4 : rule__IntersectionOperation__Group__4__Impl ;
    public final void rule__IntersectionOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3832:1: ( rule__IntersectionOperation__Group__4__Impl )
            // InternalDSL.g:3833:2: rule__IntersectionOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__4__Impl();

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
    // $ANTLR end "rule__IntersectionOperation__Group__4"


    // $ANTLR start "rule__IntersectionOperation__Group__4__Impl"
    // InternalDSL.g:3839:1: rule__IntersectionOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__IntersectionOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3843:1: ( ( ')' ) )
            // InternalDSL.g:3844:1: ( ')' )
            {
            // InternalDSL.g:3844:1: ( ')' )
            // InternalDSL.g:3845:2: ')'
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIntersectionOperationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__Group__4__Impl"


    // $ANTLR start "rule__CreateSetOperation__Group__0"
    // InternalDSL.g:3855:1: rule__CreateSetOperation__Group__0 : rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1 ;
    public final void rule__CreateSetOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3859:1: ( rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1 )
            // InternalDSL.g:3860:2: rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CreateSetOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateSetOperation__Group__1();

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
    // $ANTLR end "rule__CreateSetOperation__Group__0"


    // $ANTLR start "rule__CreateSetOperation__Group__0__Impl"
    // InternalDSL.g:3867:1: rule__CreateSetOperation__Group__0__Impl : ( '{' ) ;
    public final void rule__CreateSetOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3871:1: ( ( '{' ) )
            // InternalDSL.g:3872:1: ( '{' )
            {
            // InternalDSL.g:3872:1: ( '{' )
            // InternalDSL.g:3873:2: '{'
            {
             before(grammarAccess.getCreateSetOperationAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCreateSetOperationAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateSetOperation__Group__0__Impl"


    // $ANTLR start "rule__CreateSetOperation__Group__1"
    // InternalDSL.g:3882:1: rule__CreateSetOperation__Group__1 : rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2 ;
    public final void rule__CreateSetOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3886:1: ( rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2 )
            // InternalDSL.g:3887:2: rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__CreateSetOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateSetOperation__Group__2();

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
    // $ANTLR end "rule__CreateSetOperation__Group__1"


    // $ANTLR start "rule__CreateSetOperation__Group__1__Impl"
    // InternalDSL.g:3894:1: rule__CreateSetOperation__Group__1__Impl : ( ( rule__CreateSetOperation__ValueAssignment_1 ) ) ;
    public final void rule__CreateSetOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3898:1: ( ( ( rule__CreateSetOperation__ValueAssignment_1 ) ) )
            // InternalDSL.g:3899:1: ( ( rule__CreateSetOperation__ValueAssignment_1 ) )
            {
            // InternalDSL.g:3899:1: ( ( rule__CreateSetOperation__ValueAssignment_1 ) )
            // InternalDSL.g:3900:2: ( rule__CreateSetOperation__ValueAssignment_1 )
            {
             before(grammarAccess.getCreateSetOperationAccess().getValueAssignment_1()); 
            // InternalDSL.g:3901:2: ( rule__CreateSetOperation__ValueAssignment_1 )
            // InternalDSL.g:3901:3: rule__CreateSetOperation__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CreateSetOperation__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateSetOperationAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateSetOperation__Group__1__Impl"


    // $ANTLR start "rule__CreateSetOperation__Group__2"
    // InternalDSL.g:3909:1: rule__CreateSetOperation__Group__2 : rule__CreateSetOperation__Group__2__Impl ;
    public final void rule__CreateSetOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3913:1: ( rule__CreateSetOperation__Group__2__Impl )
            // InternalDSL.g:3914:2: rule__CreateSetOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateSetOperation__Group__2__Impl();

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
    // $ANTLR end "rule__CreateSetOperation__Group__2"


    // $ANTLR start "rule__CreateSetOperation__Group__2__Impl"
    // InternalDSL.g:3920:1: rule__CreateSetOperation__Group__2__Impl : ( '}' ) ;
    public final void rule__CreateSetOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3924:1: ( ( '}' ) )
            // InternalDSL.g:3925:1: ( '}' )
            {
            // InternalDSL.g:3925:1: ( '}' )
            // InternalDSL.g:3926:2: '}'
            {
             before(grammarAccess.getCreateSetOperationAccess().getRightCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCreateSetOperationAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateSetOperation__Group__2__Impl"


    // $ANTLR start "rule__Model__TargetModelTypeAssignment_0"
    // InternalDSL.g:3936:1: rule__Model__TargetModelTypeAssignment_0 : ( ruleTargetModelTypeDef ) ;
    public final void rule__Model__TargetModelTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3940:1: ( ( ruleTargetModelTypeDef ) )
            // InternalDSL.g:3941:2: ( ruleTargetModelTypeDef )
            {
            // InternalDSL.g:3941:2: ( ruleTargetModelTypeDef )
            // InternalDSL.g:3942:3: ruleTargetModelTypeDef
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
    // InternalDSL.g:3951:1: rule__Model__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3955:1: ( ( ruleAbstractElement ) )
            // InternalDSL.g:3956:2: ( ruleAbstractElement )
            {
            // InternalDSL.g:3956:2: ( ruleAbstractElement )
            // InternalDSL.g:3957:3: ruleAbstractElement
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
    // InternalDSL.g:3966:1: rule__TargetModelTypeDef__TypeAssignment_1 : ( ruleTargetModelType ) ;
    public final void rule__TargetModelTypeDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3970:1: ( ( ruleTargetModelType ) )
            // InternalDSL.g:3971:2: ( ruleTargetModelType )
            {
            // InternalDSL.g:3971:2: ( ruleTargetModelType )
            // InternalDSL.g:3972:3: ruleTargetModelType
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
    // InternalDSL.g:3981:1: rule__TargetModelTypeDef__TypeContainerAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__TypeContainerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3985:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:3986:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:3986:2: ( ( RULE_ID ) )
            // InternalDSL.g:3987:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerCharacteristicTypeContainerCrossReference_2_1_0()); 
            // InternalDSL.g:3988:3: ( RULE_ID )
            // InternalDSL.g:3989:4: RULE_ID
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
    // InternalDSL.g:4000:1: rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4004:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4005:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4005:2: ( ( RULE_ID ) )
            // InternalDSL.g:4006:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationCrossReference_2_2_1_0()); 
            // InternalDSL.g:4007:3: ( RULE_ID )
            // InternalDSL.g:4008:4: RULE_ID
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
    // InternalDSL.g:4019:1: rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__UsageModelAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4023:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4024:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4024:2: ( ( RULE_ID ) )
            // InternalDSL.g:4025:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelCrossReference_2_2_3_0()); 
            // InternalDSL.g:4026:3: ( RULE_ID )
            // InternalDSL.g:4027:4: RULE_ID
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
    // InternalDSL.g:4038:1: rule__CharacteristicType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4042:1: ( ( RULE_ID ) )
            // InternalDSL.g:4043:2: ( RULE_ID )
            {
            // InternalDSL.g:4043:2: ( RULE_ID )
            // InternalDSL.g:4044:3: RULE_ID
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
    // InternalDSL.g:4053:1: rule__CharacteristicType__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicType__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4057:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4058:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4058:2: ( ( RULE_ID ) )
            // InternalDSL.g:4059:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeCrossReference_3_0()); 
            // InternalDSL.g:4060:3: ( RULE_ID )
            // InternalDSL.g:4061:4: RULE_ID
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
    // InternalDSL.g:4072:1: rule__CharacteristicClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4076:1: ( ( RULE_ID ) )
            // InternalDSL.g:4077:2: ( RULE_ID )
            {
            // InternalDSL.g:4077:2: ( RULE_ID )
            // InternalDSL.g:4078:3: RULE_ID
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
    // InternalDSL.g:4087:1: rule__CharacteristicClass__MembersAssignment_3 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4091:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:4092:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:4092:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:4093:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:4102:1: rule__CharacteristicClass__MembersAssignment_4_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4106:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:4107:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:4107:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:4108:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:4117:1: rule__CharacteristicTypeSelector__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4121:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4122:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4122:2: ( ( RULE_ID ) )
            // InternalDSL.g:4123:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0()); 
            // InternalDSL.g:4124:3: ( RULE_ID )
            // InternalDSL.g:4125:4: RULE_ID
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
    // InternalDSL.g:4136:1: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 : ( ( '!' ) ) ;
    public final void rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4140:1: ( ( ( '!' ) ) )
            // InternalDSL.g:4141:2: ( ( '!' ) )
            {
            // InternalDSL.g:4141:2: ( ( '!' ) )
            // InternalDSL.g:4142:3: ( '!' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            // InternalDSL.g:4143:3: ( '!' )
            // InternalDSL.g:4144:4: '!'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:4155:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4159:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4160:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4160:2: ( ( RULE_ID ) )
            // InternalDSL.g:4161:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_0_1_0()); 
            // InternalDSL.g:4162:3: ( RULE_ID )
            // InternalDSL.g:4163:4: RULE_ID
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
    // InternalDSL.g:4174:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4178:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4179:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4179:2: ( ( RULE_ID ) )
            // InternalDSL.g:4180:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_1_0()); 
            // InternalDSL.g:4181:3: ( RULE_ID )
            // InternalDSL.g:4182:4: RULE_ID
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
    // InternalDSL.g:4193:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4197:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4198:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4198:2: ( ( RULE_ID ) )
            // InternalDSL.g:4199:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_2_1_0()); 
            // InternalDSL.g:4200:3: ( RULE_ID )
            // InternalDSL.g:4201:4: RULE_ID
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


    // $ANTLR start "rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0"
    // InternalDSL.g:4212:1: rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 : ( ( '$' ) ) ;
    public final void rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4216:1: ( ( ( '$' ) ) )
            // InternalDSL.g:4217:2: ( ( '$' ) )
            {
            // InternalDSL.g:4217:2: ( ( '$' ) )
            // InternalDSL.g:4218:3: ( '$' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 
            // InternalDSL.g:4219:3: ( '$' )
            // InternalDSL.g:4220:4: '$'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0"


    // $ANTLR start "rule__CharacteristicTypeSelector__VariableAssignment_2_2_1"
    // InternalDSL.g:4231:1: rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 : ( ruleCharacteristicVariableType ) ;
    public final void rule__CharacteristicTypeSelector__VariableAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4235:1: ( ( ruleCharacteristicVariableType ) )
            // InternalDSL.g:4236:2: ( ruleCharacteristicVariableType )
            {
            // InternalDSL.g:4236:2: ( ruleCharacteristicVariableType )
            // InternalDSL.g:4237:3: ruleCharacteristicVariableType
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableCharacteristicVariableTypeParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicVariableType();

            state._fsp--;

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableCharacteristicVariableTypeParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicTypeSelector__VariableAssignment_2_2_1"


    // $ANTLR start "rule__CharacteristicVariable__NameAssignment"
    // InternalDSL.g:4246:1: rule__CharacteristicVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__CharacteristicVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4250:1: ( ( RULE_ID ) )
            // InternalDSL.g:4251:2: ( RULE_ID )
            {
            // InternalDSL.g:4251:2: ( RULE_ID )
            // InternalDSL.g:4252:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicVariable__NameAssignment"


    // $ANTLR start "rule__CharacteristicSet__NameAssignment_0"
    // InternalDSL.g:4261:1: rule__CharacteristicSet__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CharacteristicSet__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4265:1: ( ( RULE_ID ) )
            // InternalDSL.g:4266:2: ( RULE_ID )
            {
            // InternalDSL.g:4266:2: ( RULE_ID )
            // InternalDSL.g:4267:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicSetAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSetAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSet__NameAssignment_0"


    // $ANTLR start "rule__Include__ImportURIAssignment_1"
    // InternalDSL.g:4276:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4280:1: ( ( RULE_STRING ) )
            // InternalDSL.g:4281:2: ( RULE_STRING )
            {
            // InternalDSL.g:4281:2: ( RULE_STRING )
            // InternalDSL.g:4282:3: RULE_STRING
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
    // InternalDSL.g:4291:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4295:1: ( ( RULE_ID ) )
            // InternalDSL.g:4296:2: ( RULE_ID )
            {
            // InternalDSL.g:4296:2: ( RULE_ID )
            // InternalDSL.g:4297:3: RULE_ID
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
    // InternalDSL.g:4306:1: rule__Constraint__RuleAssignment_3 : ( ruleRule ) ;
    public final void rule__Constraint__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4310:1: ( ( ruleRule ) )
            // InternalDSL.g:4311:2: ( ruleRule )
            {
            // InternalDSL.g:4311:2: ( ruleRule )
            // InternalDSL.g:4312:3: ruleRule
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
    // InternalDSL.g:4321:1: rule__Rule__DataSelectorsAssignment_0 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4325:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:4326:2: ( ruleDataSelector )
            {
            // InternalDSL.g:4326:2: ( ruleDataSelector )
            // InternalDSL.g:4327:3: ruleDataSelector
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
    // InternalDSL.g:4336:1: rule__Rule__DataSelectorsAssignment_1_1 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4340:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:4341:2: ( ruleDataSelector )
            {
            // InternalDSL.g:4341:2: ( ruleDataSelector )
            // InternalDSL.g:4342:3: ruleDataSelector
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
    // InternalDSL.g:4351:1: rule__Rule__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Rule__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4355:1: ( ( ruleStatement ) )
            // InternalDSL.g:4356:2: ( ruleStatement )
            {
            // InternalDSL.g:4356:2: ( ruleStatement )
            // InternalDSL.g:4357:3: ruleStatement
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
    // InternalDSL.g:4366:1: rule__Rule__DestinationSelectorsAssignment_3 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4370:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:4371:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:4371:2: ( ruleDestinationSelector )
            // InternalDSL.g:4372:3: ruleDestinationSelector
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
    // InternalDSL.g:4381:1: rule__Rule__DestinationSelectorsAssignment_4_1 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4385:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:4386:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:4386:2: ( ruleDestinationSelector )
            // InternalDSL.g:4387:3: ruleDestinationSelector
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


    // $ANTLR start "rule__Rule__ConditionAssignment_5"
    // InternalDSL.g:4396:1: rule__Rule__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4400:1: ( ( ruleCondition ) )
            // InternalDSL.g:4401:2: ( ruleCondition )
            {
            // InternalDSL.g:4401:2: ( ruleCondition )
            // InternalDSL.g:4402:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_5"


    // $ANTLR start "rule__AttributeSelector__RefAssignment_1"
    // InternalDSL.g:4411:1: rule__AttributeSelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__AttributeSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4415:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:4416:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:4416:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:4417:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:4426:1: rule__AttributeClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4430:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4431:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4431:2: ( ( RULE_ID ) )
            // InternalDSL.g:4432:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:4433:3: ( RULE_ID )
            // InternalDSL.g:4434:4: RULE_ID
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
    // InternalDSL.g:4445:1: rule__PropertySelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__PropertySelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4449:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:4450:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:4450:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:4451:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:4460:1: rule__PropertyClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4464:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4465:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4465:2: ( ( RULE_ID ) )
            // InternalDSL.g:4466:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:4467:3: ( RULE_ID )
            // InternalDSL.g:4468:4: RULE_ID
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
    // InternalDSL.g:4479:1: rule__NodeIdentitiySelector__NameAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__NodeIdentitiySelector__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4483:1: ( ( RULE_STRING ) )
            // InternalDSL.g:4484:2: ( RULE_STRING )
            {
            // InternalDSL.g:4484:2: ( RULE_STRING )
            // InternalDSL.g:4485:3: RULE_STRING
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
    // InternalDSL.g:4494:1: rule__NodeIdentitiySelector__AssemblyAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__AssemblyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4498:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4499:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4499:2: ( ( RULE_ID ) )
            // InternalDSL.g:4500:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_0()); 
            // InternalDSL.g:4501:3: ( RULE_ID )
            // InternalDSL.g:4502:4: RULE_ID
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
    // InternalDSL.g:4513:1: rule__NodeIdentitiySelector__ComponentAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__ComponentAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4517:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4518:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4518:2: ( ( RULE_ID ) )
            // InternalDSL.g:4519:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_3_0()); 
            // InternalDSL.g:4520:3: ( RULE_ID )
            // InternalDSL.g:4521:4: RULE_ID
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
    // InternalDSL.g:4532:1: rule__NodeIdentitiySelector__SeffAssignment_1_5 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__SeffAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4536:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4537:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4537:2: ( ( RULE_ID ) )
            // InternalDSL.g:4538:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationCrossReference_1_5_0()); 
            // InternalDSL.g:4539:3: ( RULE_ID )
            // InternalDSL.g:4540:4: RULE_ID
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
    // InternalDSL.g:4551:1: rule__Statement__ModalityAssignment_0 : ( ruleStatementModality ) ;
    public final void rule__Statement__ModalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4555:1: ( ( ruleStatementModality ) )
            // InternalDSL.g:4556:2: ( ruleStatementModality )
            {
            // InternalDSL.g:4556:2: ( ruleStatementModality )
            // InternalDSL.g:4557:3: ruleStatementModality
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
    // InternalDSL.g:4566:1: rule__Statement__TypeAssignment_1 : ( ruleStatementType ) ;
    public final void rule__Statement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4570:1: ( ( ruleStatementType ) )
            // InternalDSL.g:4571:2: ( ruleStatementType )
            {
            // InternalDSL.g:4571:2: ( ruleStatementType )
            // InternalDSL.g:4572:3: ruleStatementType
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
    // InternalDSL.g:4581:1: rule__StatementType__NameAssignment : ( ( 'FLOWS' ) ) ;
    public final void rule__StatementType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4585:1: ( ( ( 'FLOWS' ) ) )
            // InternalDSL.g:4586:2: ( ( 'FLOWS' ) )
            {
            // InternalDSL.g:4586:2: ( ( 'FLOWS' ) )
            // InternalDSL.g:4587:3: ( 'FLOWS' )
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            // InternalDSL.g:4588:3: ( 'FLOWS' )
            // InternalDSL.g:4589:4: 'FLOWS'
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDSL.g:4600:1: rule__StatementModality__NameAssignment : ( ( 'NEVER' ) ) ;
    public final void rule__StatementModality__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4604:1: ( ( ( 'NEVER' ) ) )
            // InternalDSL.g:4605:2: ( ( 'NEVER' ) )
            {
            // InternalDSL.g:4605:2: ( ( 'NEVER' ) )
            // InternalDSL.g:4606:3: ( 'NEVER' )
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            // InternalDSL.g:4607:3: ( 'NEVER' )
            // InternalDSL.g:4608:4: 'NEVER'
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            match(input,45,FOLLOW_2); 
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


    // $ANTLR start "rule__Condition__OperationAssignment_1"
    // InternalDSL.g:4619:1: rule__Condition__OperationAssignment_1 : ( ruleBooleanOperation ) ;
    public final void rule__Condition__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4623:1: ( ( ruleBooleanOperation ) )
            // InternalDSL.g:4624:2: ( ruleBooleanOperation )
            {
            // InternalDSL.g:4624:2: ( ruleBooleanOperation )
            // InternalDSL.g:4625:3: ruleBooleanOperation
            {
             before(grammarAccess.getConditionAccess().getOperationBooleanOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanOperation();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperationBooleanOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__OperationAssignment_1"


    // $ANTLR start "rule__CharacteristicReference__ValueAssignment"
    // InternalDSL.g:4634:1: rule__CharacteristicReference__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicReference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4638:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4639:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4639:2: ( ( RULE_ID ) )
            // InternalDSL.g:4640:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableCrossReference_0()); 
            // InternalDSL.g:4641:3: ( RULE_ID )
            // InternalDSL.g:4642:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicReference__ValueAssignment"


    // $ANTLR start "rule__CharacteristicSetReference__ValueAssignment_0"
    // InternalDSL.g:4653:1: rule__CharacteristicSetReference__ValueAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicSetReference__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4657:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4658:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4658:2: ( ( RULE_ID ) )
            // InternalDSL.g:4659:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetCrossReference_0_0()); 
            // InternalDSL.g:4660:3: ( RULE_ID )
            // InternalDSL.g:4661:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSetReference__ValueAssignment_0"


    // $ANTLR start "rule__CharacteristicSetReference__RefAssignment_1"
    // InternalDSL.g:4672:1: rule__CharacteristicSetReference__RefAssignment_1 : ( ruleCharacteristsicSetOperation ) ;
    public final void rule__CharacteristicSetReference__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4676:1: ( ( ruleCharacteristsicSetOperation ) )
            // InternalDSL.g:4677:2: ( ruleCharacteristsicSetOperation )
            {
            // InternalDSL.g:4677:2: ( ruleCharacteristsicSetOperation )
            // InternalDSL.g:4678:3: ruleCharacteristsicSetOperation
            {
             before(grammarAccess.getCharacteristicSetReferenceAccess().getRefCharacteristsicSetOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristsicSetOperation();

            state._fsp--;

             after(grammarAccess.getCharacteristicSetReferenceAccess().getRefCharacteristsicSetOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSetReference__RefAssignment_1"


    // $ANTLR start "rule__LogicalAndOperation__LeftAssignment_1"
    // InternalDSL.g:4687:1: rule__LogicalAndOperation__LeftAssignment_1 : ( ruleBooleanOperation ) ;
    public final void rule__LogicalAndOperation__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4691:1: ( ( ruleBooleanOperation ) )
            // InternalDSL.g:4692:2: ( ruleBooleanOperation )
            {
            // InternalDSL.g:4692:2: ( ruleBooleanOperation )
            // InternalDSL.g:4693:3: ruleBooleanOperation
            {
             before(grammarAccess.getLogicalAndOperationAccess().getLeftBooleanOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanOperation();

            state._fsp--;

             after(grammarAccess.getLogicalAndOperationAccess().getLeftBooleanOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__LeftAssignment_1"


    // $ANTLR start "rule__LogicalAndOperation__RightAssignment_3"
    // InternalDSL.g:4702:1: rule__LogicalAndOperation__RightAssignment_3 : ( ruleBooleanOperation ) ;
    public final void rule__LogicalAndOperation__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4706:1: ( ( ruleBooleanOperation ) )
            // InternalDSL.g:4707:2: ( ruleBooleanOperation )
            {
            // InternalDSL.g:4707:2: ( ruleBooleanOperation )
            // InternalDSL.g:4708:3: ruleBooleanOperation
            {
             before(grammarAccess.getLogicalAndOperationAccess().getRightBooleanOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanOperation();

            state._fsp--;

             after(grammarAccess.getLogicalAndOperationAccess().getRightBooleanOperationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__RightAssignment_3"


    // $ANTLR start "rule__LogicalNegationOperation__ValueAssignment_1"
    // InternalDSL.g:4717:1: rule__LogicalNegationOperation__ValueAssignment_1 : ( ruleBooleanOperation ) ;
    public final void rule__LogicalNegationOperation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4721:1: ( ( ruleBooleanOperation ) )
            // InternalDSL.g:4722:2: ( ruleBooleanOperation )
            {
            // InternalDSL.g:4722:2: ( ruleBooleanOperation )
            // InternalDSL.g:4723:3: ruleBooleanOperation
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getValueBooleanOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanOperation();

            state._fsp--;

             after(grammarAccess.getLogicalNegationOperationAccess().getValueBooleanOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalNegationOperation__ValueAssignment_1"


    // $ANTLR start "rule__VariableEqualityOperation__LeftAssignment_0"
    // InternalDSL.g:4732:1: rule__VariableEqualityOperation__LeftAssignment_0 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableEqualityOperation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4736:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:4737:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:4737:2: ( ruleCharacteristicReference )
            // InternalDSL.g:4738:3: ruleCharacteristicReference
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getVariableEqualityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableEqualityOperation__LeftAssignment_0"


    // $ANTLR start "rule__VariableEqualityOperation__RightAssignment_2"
    // InternalDSL.g:4747:1: rule__VariableEqualityOperation__RightAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableEqualityOperation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4751:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:4752:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:4752:2: ( ruleCharacteristicReference )
            // InternalDSL.g:4753:3: ruleCharacteristicReference
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getRightCharacteristicReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getVariableEqualityOperationAccess().getRightCharacteristicReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableEqualityOperation__RightAssignment_2"


    // $ANTLR start "rule__VariableInequalityOperation__LeftAssignment_0"
    // InternalDSL.g:4762:1: rule__VariableInequalityOperation__LeftAssignment_0 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableInequalityOperation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4766:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:4767:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:4767:2: ( ruleCharacteristicReference )
            // InternalDSL.g:4768:3: ruleCharacteristicReference
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getVariableInequalityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInequalityOperation__LeftAssignment_0"


    // $ANTLR start "rule__VariableInequalityOperation__RightAssignment_2"
    // InternalDSL.g:4777:1: rule__VariableInequalityOperation__RightAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableInequalityOperation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4781:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:4782:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:4782:2: ( ruleCharacteristicReference )
            // InternalDSL.g:4783:3: ruleCharacteristicReference
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getRightCharacteristicReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getVariableInequalityOperationAccess().getRightCharacteristicReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInequalityOperation__RightAssignment_2"


    // $ANTLR start "rule__EmptySetOperation__ValueAssignment_1"
    // InternalDSL.g:4792:1: rule__EmptySetOperation__ValueAssignment_1 : ( ruleCharacteristicSetReference ) ;
    public final void rule__EmptySetOperation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4796:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:4797:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:4797:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:4798:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getEmptySetOperationAccess().getValueCharacteristicSetReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getEmptySetOperationAccess().getValueCharacteristicSetReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptySetOperation__ValueAssignment_1"


    // $ANTLR start "rule__IntersectionOperation__LeftAssignment_1"
    // InternalDSL.g:4807:1: rule__IntersectionOperation__LeftAssignment_1 : ( ruleCharacteristicSetReference ) ;
    public final void rule__IntersectionOperation__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4811:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:4812:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:4812:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:4813:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getIntersectionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getIntersectionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__LeftAssignment_1"


    // $ANTLR start "rule__IntersectionOperation__RightAssignment_3"
    // InternalDSL.g:4822:1: rule__IntersectionOperation__RightAssignment_3 : ( ruleCharacteristicSetReference ) ;
    public final void rule__IntersectionOperation__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4826:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:4827:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:4827:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:4828:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getIntersectionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__RightAssignment_3"


    // $ANTLR start "rule__CreateSetOperation__ValueAssignment_1"
    // InternalDSL.g:4837:1: rule__CreateSetOperation__ValueAssignment_1 : ( ruleCharacteristicReference ) ;
    public final void rule__CreateSetOperation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4841:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:4842:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:4842:2: ( ruleCharacteristicReference )
            // InternalDSL.g:4843:3: ruleCharacteristicReference
            {
             before(grammarAccess.getCreateSetOperationAccess().getValueCharacteristicReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getCreateSetOperationAccess().getValueCharacteristicReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateSetOperation__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000C0A0010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000C0A0012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000084000800020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000025000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000100020L});

}