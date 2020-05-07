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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OperationModel'", "'DataCentricPalladio'", "'ExtendedDFD'", "'target'", "'using'", "','", "'type'", "':'", "'class'", "'{'", "'}'", "'.'", "'['", "']'", "'{}'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'node.name.'", "'node.identity.'", "'WHERE'", "'|'", "'!'", "'('", "')'", "'=='", "'!='", "'isEmpty'", "'intersection'", "'union'", "'subtract'", "'elementOf'", "'$'", "'FLOWS'", "'NEVER'"
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
    // InternalDSL.g:687:1: ruleBooleanOperation : ( ruleLogicalOrOperation ) ;
    public final void ruleBooleanOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:691:2: ( ( ruleLogicalOrOperation ) )
            // InternalDSL.g:692:2: ( ruleLogicalOrOperation )
            {
            // InternalDSL.g:692:2: ( ruleLogicalOrOperation )
            // InternalDSL.g:693:3: ruleLogicalOrOperation
            {
             before(grammarAccess.getBooleanOperationAccess().getLogicalOrOperationParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleLogicalOrOperation();

            state._fsp--;

             after(grammarAccess.getBooleanOperationAccess().getLogicalOrOperationParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLogicalOrOperation"
    // InternalDSL.g:728:1: entryRuleLogicalOrOperation : ruleLogicalOrOperation EOF ;
    public final void entryRuleLogicalOrOperation() throws RecognitionException {
        try {
            // InternalDSL.g:729:1: ( ruleLogicalOrOperation EOF )
            // InternalDSL.g:730:1: ruleLogicalOrOperation EOF
            {
             before(grammarAccess.getLogicalOrOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalOrOperation();

            state._fsp--;

             after(grammarAccess.getLogicalOrOperationRule()); 
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
    // $ANTLR end "entryRuleLogicalOrOperation"


    // $ANTLR start "ruleLogicalOrOperation"
    // InternalDSL.g:737:1: ruleLogicalOrOperation : ( ( rule__LogicalOrOperation__Group__0 ) ) ;
    public final void ruleLogicalOrOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:741:2: ( ( ( rule__LogicalOrOperation__Group__0 ) ) )
            // InternalDSL.g:742:2: ( ( rule__LogicalOrOperation__Group__0 ) )
            {
            // InternalDSL.g:742:2: ( ( rule__LogicalOrOperation__Group__0 ) )
            // InternalDSL.g:743:3: ( rule__LogicalOrOperation__Group__0 )
            {
             before(grammarAccess.getLogicalOrOperationAccess().getGroup()); 
            // InternalDSL.g:744:3: ( rule__LogicalOrOperation__Group__0 )
            // InternalDSL.g:744:4: rule__LogicalOrOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOrOperation"


    // $ANTLR start "entryRuleLogicalAndOperation"
    // InternalDSL.g:753:1: entryRuleLogicalAndOperation : ruleLogicalAndOperation EOF ;
    public final void entryRuleLogicalAndOperation() throws RecognitionException {
        try {
            // InternalDSL.g:754:1: ( ruleLogicalAndOperation EOF )
            // InternalDSL.g:755:1: ruleLogicalAndOperation EOF
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
    // InternalDSL.g:762:1: ruleLogicalAndOperation : ( ( rule__LogicalAndOperation__Group__0 ) ) ;
    public final void ruleLogicalAndOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:766:2: ( ( ( rule__LogicalAndOperation__Group__0 ) ) )
            // InternalDSL.g:767:2: ( ( rule__LogicalAndOperation__Group__0 ) )
            {
            // InternalDSL.g:767:2: ( ( rule__LogicalAndOperation__Group__0 ) )
            // InternalDSL.g:768:3: ( rule__LogicalAndOperation__Group__0 )
            {
             before(grammarAccess.getLogicalAndOperationAccess().getGroup()); 
            // InternalDSL.g:769:3: ( rule__LogicalAndOperation__Group__0 )
            // InternalDSL.g:769:4: rule__LogicalAndOperation__Group__0
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
    // InternalDSL.g:778:1: entryRuleLogicalNegationOperation : ruleLogicalNegationOperation EOF ;
    public final void entryRuleLogicalNegationOperation() throws RecognitionException {
        try {
            // InternalDSL.g:779:1: ( ruleLogicalNegationOperation EOF )
            // InternalDSL.g:780:1: ruleLogicalNegationOperation EOF
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
    // InternalDSL.g:787:1: ruleLogicalNegationOperation : ( ( rule__LogicalNegationOperation__Alternatives ) ) ;
    public final void ruleLogicalNegationOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:791:2: ( ( ( rule__LogicalNegationOperation__Alternatives ) ) )
            // InternalDSL.g:792:2: ( ( rule__LogicalNegationOperation__Alternatives ) )
            {
            // InternalDSL.g:792:2: ( ( rule__LogicalNegationOperation__Alternatives ) )
            // InternalDSL.g:793:3: ( rule__LogicalNegationOperation__Alternatives )
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getAlternatives()); 
            // InternalDSL.g:794:3: ( rule__LogicalNegationOperation__Alternatives )
            // InternalDSL.g:794:4: rule__LogicalNegationOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalNegationOperationAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEncapsulatedLogicalOperation"
    // InternalDSL.g:803:1: entryRuleEncapsulatedLogicalOperation : ruleEncapsulatedLogicalOperation EOF ;
    public final void entryRuleEncapsulatedLogicalOperation() throws RecognitionException {
        try {
            // InternalDSL.g:804:1: ( ruleEncapsulatedLogicalOperation EOF )
            // InternalDSL.g:805:1: ruleEncapsulatedLogicalOperation EOF
            {
             before(grammarAccess.getEncapsulatedLogicalOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleEncapsulatedLogicalOperation();

            state._fsp--;

             after(grammarAccess.getEncapsulatedLogicalOperationRule()); 
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
    // $ANTLR end "entryRuleEncapsulatedLogicalOperation"


    // $ANTLR start "ruleEncapsulatedLogicalOperation"
    // InternalDSL.g:812:1: ruleEncapsulatedLogicalOperation : ( ( rule__EncapsulatedLogicalOperation__Alternatives ) ) ;
    public final void ruleEncapsulatedLogicalOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:816:2: ( ( ( rule__EncapsulatedLogicalOperation__Alternatives ) ) )
            // InternalDSL.g:817:2: ( ( rule__EncapsulatedLogicalOperation__Alternatives ) )
            {
            // InternalDSL.g:817:2: ( ( rule__EncapsulatedLogicalOperation__Alternatives ) )
            // InternalDSL.g:818:3: ( rule__EncapsulatedLogicalOperation__Alternatives )
            {
             before(grammarAccess.getEncapsulatedLogicalOperationAccess().getAlternatives()); 
            // InternalDSL.g:819:3: ( rule__EncapsulatedLogicalOperation__Alternatives )
            // InternalDSL.g:819:4: rule__EncapsulatedLogicalOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EncapsulatedLogicalOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEncapsulatedLogicalOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEncapsulatedLogicalOperation"


    // $ANTLR start "entryRuleSimpleBooleanOperation"
    // InternalDSL.g:828:1: entryRuleSimpleBooleanOperation : ruleSimpleBooleanOperation EOF ;
    public final void entryRuleSimpleBooleanOperation() throws RecognitionException {
        try {
            // InternalDSL.g:829:1: ( ruleSimpleBooleanOperation EOF )
            // InternalDSL.g:830:1: ruleSimpleBooleanOperation EOF
            {
             before(grammarAccess.getSimpleBooleanOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleBooleanOperation();

            state._fsp--;

             after(grammarAccess.getSimpleBooleanOperationRule()); 
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
    // $ANTLR end "entryRuleSimpleBooleanOperation"


    // $ANTLR start "ruleSimpleBooleanOperation"
    // InternalDSL.g:837:1: ruleSimpleBooleanOperation : ( ( rule__SimpleBooleanOperation__Alternatives ) ) ;
    public final void ruleSimpleBooleanOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:841:2: ( ( ( rule__SimpleBooleanOperation__Alternatives ) ) )
            // InternalDSL.g:842:2: ( ( rule__SimpleBooleanOperation__Alternatives ) )
            {
            // InternalDSL.g:842:2: ( ( rule__SimpleBooleanOperation__Alternatives ) )
            // InternalDSL.g:843:3: ( rule__SimpleBooleanOperation__Alternatives )
            {
             before(grammarAccess.getSimpleBooleanOperationAccess().getAlternatives()); 
            // InternalDSL.g:844:3: ( rule__SimpleBooleanOperation__Alternatives )
            // InternalDSL.g:844:4: rule__SimpleBooleanOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleBooleanOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleBooleanOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleBooleanOperation"


    // $ANTLR start "entryRuleVariableEqualityOperation"
    // InternalDSL.g:853:1: entryRuleVariableEqualityOperation : ruleVariableEqualityOperation EOF ;
    public final void entryRuleVariableEqualityOperation() throws RecognitionException {
        try {
            // InternalDSL.g:854:1: ( ruleVariableEqualityOperation EOF )
            // InternalDSL.g:855:1: ruleVariableEqualityOperation EOF
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
    // InternalDSL.g:862:1: ruleVariableEqualityOperation : ( ( rule__VariableEqualityOperation__Group__0 ) ) ;
    public final void ruleVariableEqualityOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:866:2: ( ( ( rule__VariableEqualityOperation__Group__0 ) ) )
            // InternalDSL.g:867:2: ( ( rule__VariableEqualityOperation__Group__0 ) )
            {
            // InternalDSL.g:867:2: ( ( rule__VariableEqualityOperation__Group__0 ) )
            // InternalDSL.g:868:3: ( rule__VariableEqualityOperation__Group__0 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getGroup()); 
            // InternalDSL.g:869:3: ( rule__VariableEqualityOperation__Group__0 )
            // InternalDSL.g:869:4: rule__VariableEqualityOperation__Group__0
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
    // InternalDSL.g:878:1: entryRuleVariableInequalityOperation : ruleVariableInequalityOperation EOF ;
    public final void entryRuleVariableInequalityOperation() throws RecognitionException {
        try {
            // InternalDSL.g:879:1: ( ruleVariableInequalityOperation EOF )
            // InternalDSL.g:880:1: ruleVariableInequalityOperation EOF
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
    // InternalDSL.g:887:1: ruleVariableInequalityOperation : ( ( rule__VariableInequalityOperation__Group__0 ) ) ;
    public final void ruleVariableInequalityOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:891:2: ( ( ( rule__VariableInequalityOperation__Group__0 ) ) )
            // InternalDSL.g:892:2: ( ( rule__VariableInequalityOperation__Group__0 ) )
            {
            // InternalDSL.g:892:2: ( ( rule__VariableInequalityOperation__Group__0 ) )
            // InternalDSL.g:893:3: ( rule__VariableInequalityOperation__Group__0 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getGroup()); 
            // InternalDSL.g:894:3: ( rule__VariableInequalityOperation__Group__0 )
            // InternalDSL.g:894:4: rule__VariableInequalityOperation__Group__0
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
    // InternalDSL.g:903:1: entryRuleEmptySetOperation : ruleEmptySetOperation EOF ;
    public final void entryRuleEmptySetOperation() throws RecognitionException {
        try {
            // InternalDSL.g:904:1: ( ruleEmptySetOperation EOF )
            // InternalDSL.g:905:1: ruleEmptySetOperation EOF
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
    // InternalDSL.g:912:1: ruleEmptySetOperation : ( ( rule__EmptySetOperation__Group__0 ) ) ;
    public final void ruleEmptySetOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:916:2: ( ( ( rule__EmptySetOperation__Group__0 ) ) )
            // InternalDSL.g:917:2: ( ( rule__EmptySetOperation__Group__0 ) )
            {
            // InternalDSL.g:917:2: ( ( rule__EmptySetOperation__Group__0 ) )
            // InternalDSL.g:918:3: ( rule__EmptySetOperation__Group__0 )
            {
             before(grammarAccess.getEmptySetOperationAccess().getGroup()); 
            // InternalDSL.g:919:3: ( rule__EmptySetOperation__Group__0 )
            // InternalDSL.g:919:4: rule__EmptySetOperation__Group__0
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
    // InternalDSL.g:928:1: entryRuleIntersectionOperation : ruleIntersectionOperation EOF ;
    public final void entryRuleIntersectionOperation() throws RecognitionException {
        try {
            // InternalDSL.g:929:1: ( ruleIntersectionOperation EOF )
            // InternalDSL.g:930:1: ruleIntersectionOperation EOF
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
    // InternalDSL.g:937:1: ruleIntersectionOperation : ( ( rule__IntersectionOperation__Group__0 ) ) ;
    public final void ruleIntersectionOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:941:2: ( ( ( rule__IntersectionOperation__Group__0 ) ) )
            // InternalDSL.g:942:2: ( ( rule__IntersectionOperation__Group__0 ) )
            {
            // InternalDSL.g:942:2: ( ( rule__IntersectionOperation__Group__0 ) )
            // InternalDSL.g:943:3: ( rule__IntersectionOperation__Group__0 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getGroup()); 
            // InternalDSL.g:944:3: ( rule__IntersectionOperation__Group__0 )
            // InternalDSL.g:944:4: rule__IntersectionOperation__Group__0
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


    // $ANTLR start "entryRuleUnionOperation"
    // InternalDSL.g:953:1: entryRuleUnionOperation : ruleUnionOperation EOF ;
    public final void entryRuleUnionOperation() throws RecognitionException {
        try {
            // InternalDSL.g:954:1: ( ruleUnionOperation EOF )
            // InternalDSL.g:955:1: ruleUnionOperation EOF
            {
             before(grammarAccess.getUnionOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleUnionOperation();

            state._fsp--;

             after(grammarAccess.getUnionOperationRule()); 
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
    // $ANTLR end "entryRuleUnionOperation"


    // $ANTLR start "ruleUnionOperation"
    // InternalDSL.g:962:1: ruleUnionOperation : ( ( rule__UnionOperation__Group__0 ) ) ;
    public final void ruleUnionOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:966:2: ( ( ( rule__UnionOperation__Group__0 ) ) )
            // InternalDSL.g:967:2: ( ( rule__UnionOperation__Group__0 ) )
            {
            // InternalDSL.g:967:2: ( ( rule__UnionOperation__Group__0 ) )
            // InternalDSL.g:968:3: ( rule__UnionOperation__Group__0 )
            {
             before(grammarAccess.getUnionOperationAccess().getGroup()); 
            // InternalDSL.g:969:3: ( rule__UnionOperation__Group__0 )
            // InternalDSL.g:969:4: rule__UnionOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnionOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnionOperation"


    // $ANTLR start "entryRuleSubtractOperation"
    // InternalDSL.g:978:1: entryRuleSubtractOperation : ruleSubtractOperation EOF ;
    public final void entryRuleSubtractOperation() throws RecognitionException {
        try {
            // InternalDSL.g:979:1: ( ruleSubtractOperation EOF )
            // InternalDSL.g:980:1: ruleSubtractOperation EOF
            {
             before(grammarAccess.getSubtractOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleSubtractOperation();

            state._fsp--;

             after(grammarAccess.getSubtractOperationRule()); 
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
    // $ANTLR end "entryRuleSubtractOperation"


    // $ANTLR start "ruleSubtractOperation"
    // InternalDSL.g:987:1: ruleSubtractOperation : ( ( rule__SubtractOperation__Group__0 ) ) ;
    public final void ruleSubtractOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:991:2: ( ( ( rule__SubtractOperation__Group__0 ) ) )
            // InternalDSL.g:992:2: ( ( rule__SubtractOperation__Group__0 ) )
            {
            // InternalDSL.g:992:2: ( ( rule__SubtractOperation__Group__0 ) )
            // InternalDSL.g:993:3: ( rule__SubtractOperation__Group__0 )
            {
             before(grammarAccess.getSubtractOperationAccess().getGroup()); 
            // InternalDSL.g:994:3: ( rule__SubtractOperation__Group__0 )
            // InternalDSL.g:994:4: rule__SubtractOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubtractOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubtractOperation"


    // $ANTLR start "entryRuleElementOfOperation"
    // InternalDSL.g:1003:1: entryRuleElementOfOperation : ruleElementOfOperation EOF ;
    public final void entryRuleElementOfOperation() throws RecognitionException {
        try {
            // InternalDSL.g:1004:1: ( ruleElementOfOperation EOF )
            // InternalDSL.g:1005:1: ruleElementOfOperation EOF
            {
             before(grammarAccess.getElementOfOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleElementOfOperation();

            state._fsp--;

             after(grammarAccess.getElementOfOperationRule()); 
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
    // $ANTLR end "entryRuleElementOfOperation"


    // $ANTLR start "ruleElementOfOperation"
    // InternalDSL.g:1012:1: ruleElementOfOperation : ( ( rule__ElementOfOperation__Group__0 ) ) ;
    public final void ruleElementOfOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1016:2: ( ( ( rule__ElementOfOperation__Group__0 ) ) )
            // InternalDSL.g:1017:2: ( ( rule__ElementOfOperation__Group__0 ) )
            {
            // InternalDSL.g:1017:2: ( ( rule__ElementOfOperation__Group__0 ) )
            // InternalDSL.g:1018:3: ( rule__ElementOfOperation__Group__0 )
            {
             before(grammarAccess.getElementOfOperationAccess().getGroup()); 
            // InternalDSL.g:1019:3: ( rule__ElementOfOperation__Group__0 )
            // InternalDSL.g:1019:4: rule__ElementOfOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementOfOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementOfOperation"


    // $ANTLR start "entryRuleCreateSetOperation"
    // InternalDSL.g:1028:1: entryRuleCreateSetOperation : ruleCreateSetOperation EOF ;
    public final void entryRuleCreateSetOperation() throws RecognitionException {
        try {
            // InternalDSL.g:1029:1: ( ruleCreateSetOperation EOF )
            // InternalDSL.g:1030:1: ruleCreateSetOperation EOF
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
    // InternalDSL.g:1037:1: ruleCreateSetOperation : ( ( rule__CreateSetOperation__Group__0 ) ) ;
    public final void ruleCreateSetOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1041:2: ( ( ( rule__CreateSetOperation__Group__0 ) ) )
            // InternalDSL.g:1042:2: ( ( rule__CreateSetOperation__Group__0 ) )
            {
            // InternalDSL.g:1042:2: ( ( rule__CreateSetOperation__Group__0 ) )
            // InternalDSL.g:1043:3: ( rule__CreateSetOperation__Group__0 )
            {
             before(grammarAccess.getCreateSetOperationAccess().getGroup()); 
            // InternalDSL.g:1044:3: ( rule__CreateSetOperation__Group__0 )
            // InternalDSL.g:1044:4: rule__CreateSetOperation__Group__0
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
    // InternalDSL.g:1053:1: ruleTargetModelType : ( ( rule__TargetModelType__Alternatives ) ) ;
    public final void ruleTargetModelType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1057:1: ( ( ( rule__TargetModelType__Alternatives ) ) )
            // InternalDSL.g:1058:2: ( ( rule__TargetModelType__Alternatives ) )
            {
            // InternalDSL.g:1058:2: ( ( rule__TargetModelType__Alternatives ) )
            // InternalDSL.g:1059:3: ( rule__TargetModelType__Alternatives )
            {
             before(grammarAccess.getTargetModelTypeAccess().getAlternatives()); 
            // InternalDSL.g:1060:3: ( rule__TargetModelType__Alternatives )
            // InternalDSL.g:1060:4: rule__TargetModelType__Alternatives
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
    // InternalDSL.g:1068:1: rule__AbstractElement__Alternatives : ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1072:1: ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) )
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
                    // InternalDSL.g:1073:2: ( ruleInclude )
                    {
                    // InternalDSL.g:1073:2: ( ruleInclude )
                    // InternalDSL.g:1074:3: ruleInclude
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
                    // InternalDSL.g:1079:2: ( ruleCharacteristicType )
                    {
                    // InternalDSL.g:1079:2: ( ruleCharacteristicType )
                    // InternalDSL.g:1080:3: ruleCharacteristicType
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
                    // InternalDSL.g:1085:2: ( ruleCharacteristicClass )
                    {
                    // InternalDSL.g:1085:2: ( ruleCharacteristicClass )
                    // InternalDSL.g:1086:3: ruleCharacteristicClass
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
                    // InternalDSL.g:1091:2: ( ruleConstraint )
                    {
                    // InternalDSL.g:1091:2: ( ruleConstraint )
                    // InternalDSL.g:1092:3: ruleConstraint
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
                    // InternalDSL.g:1097:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    {
                    // InternalDSL.g:1097:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    // InternalDSL.g:1098:3: ( rule__AbstractElement__Group_4__0 )
                    {
                     before(grammarAccess.getAbstractElementAccess().getGroup_4()); 
                    // InternalDSL.g:1099:3: ( rule__AbstractElement__Group_4__0 )
                    // InternalDSL.g:1099:4: rule__AbstractElement__Group_4__0
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
    // InternalDSL.g:1107:1: rule__CharacteristicTypeSelector__Alternatives_2 : ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) ) );
    public final void rule__CharacteristicTypeSelector__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1111:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 37:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 47:
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
                    // InternalDSL.g:1112:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    {
                    // InternalDSL.g:1112:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    // InternalDSL.g:1113:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_0()); 
                    // InternalDSL.g:1114:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    // InternalDSL.g:1114:4: rule__CharacteristicTypeSelector__Group_2_0__0
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
                    // InternalDSL.g:1118:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    {
                    // InternalDSL.g:1118:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    // InternalDSL.g:1119:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 
                    // InternalDSL.g:1120:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    // InternalDSL.g:1120:4: rule__CharacteristicTypeSelector__Group_2_1__0
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
                    // InternalDSL.g:1124:2: ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) )
                    {
                    // InternalDSL.g:1124:2: ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) )
                    // InternalDSL.g:1125:3: ( rule__CharacteristicTypeSelector__Group_2_2__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_2()); 
                    // InternalDSL.g:1126:3: ( rule__CharacteristicTypeSelector__Group_2_2__0 )
                    // InternalDSL.g:1126:4: rule__CharacteristicTypeSelector__Group_2_2__0
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
    // InternalDSL.g:1134:1: rule__CharacteristicVariableType__Alternatives : ( ( ruleCharacteristicVariable ) | ( ruleCharacteristicSet ) );
    public final void rule__CharacteristicVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1138:1: ( ( ruleCharacteristicVariable ) | ( ruleCharacteristicSet ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==16||LA3_1==21||LA3_1==28||LA3_1==35||LA3_1==49) ) {
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
                    // InternalDSL.g:1139:2: ( ruleCharacteristicVariable )
                    {
                    // InternalDSL.g:1139:2: ( ruleCharacteristicVariable )
                    // InternalDSL.g:1140:3: ruleCharacteristicVariable
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
                    // InternalDSL.g:1145:2: ( ruleCharacteristicSet )
                    {
                    // InternalDSL.g:1145:2: ( ruleCharacteristicSet )
                    // InternalDSL.g:1146:3: ruleCharacteristicSet
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
    // InternalDSL.g:1155:1: rule__DataSelector__Alternatives : ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) );
    public final void rule__DataSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1159:1: ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) )
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
                    // InternalDSL.g:1160:2: ( ruleAttributeSelector )
                    {
                    // InternalDSL.g:1160:2: ( ruleAttributeSelector )
                    // InternalDSL.g:1161:3: ruleAttributeSelector
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
                    // InternalDSL.g:1166:2: ( ruleAttributeClassSelector )
                    {
                    // InternalDSL.g:1166:2: ( ruleAttributeClassSelector )
                    // InternalDSL.g:1167:3: ruleAttributeClassSelector
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
    // InternalDSL.g:1176:1: rule__DestinationSelector__Alternatives : ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) );
    public final void rule__DestinationSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1180:1: ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) )
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
                    // InternalDSL.g:1181:2: ( rulePropertySelector )
                    {
                    // InternalDSL.g:1181:2: ( rulePropertySelector )
                    // InternalDSL.g:1182:3: rulePropertySelector
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
                    // InternalDSL.g:1187:2: ( rulePropertyClassSelector )
                    {
                    // InternalDSL.g:1187:2: ( rulePropertyClassSelector )
                    // InternalDSL.g:1188:3: rulePropertyClassSelector
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
                    // InternalDSL.g:1193:2: ( ruleNodeIdentitiySelector )
                    {
                    // InternalDSL.g:1193:2: ( ruleNodeIdentitiySelector )
                    // InternalDSL.g:1194:3: ruleNodeIdentitiySelector
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
    // InternalDSL.g:1203:1: rule__NodeIdentitiySelector__Alternatives : ( ( ( rule__NodeIdentitiySelector__Group_0__0 ) ) | ( ( rule__NodeIdentitiySelector__Group_1__0 ) ) );
    public final void rule__NodeIdentitiySelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1207:1: ( ( ( rule__NodeIdentitiySelector__Group_0__0 ) ) | ( ( rule__NodeIdentitiySelector__Group_1__0 ) ) )
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
                    // InternalDSL.g:1208:2: ( ( rule__NodeIdentitiySelector__Group_0__0 ) )
                    {
                    // InternalDSL.g:1208:2: ( ( rule__NodeIdentitiySelector__Group_0__0 ) )
                    // InternalDSL.g:1209:3: ( rule__NodeIdentitiySelector__Group_0__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_0()); 
                    // InternalDSL.g:1210:3: ( rule__NodeIdentitiySelector__Group_0__0 )
                    // InternalDSL.g:1210:4: rule__NodeIdentitiySelector__Group_0__0
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
                    // InternalDSL.g:1214:2: ( ( rule__NodeIdentitiySelector__Group_1__0 ) )
                    {
                    // InternalDSL.g:1214:2: ( ( rule__NodeIdentitiySelector__Group_1__0 ) )
                    // InternalDSL.g:1215:3: ( rule__NodeIdentitiySelector__Group_1__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_1()); 
                    // InternalDSL.g:1216:3: ( rule__NodeIdentitiySelector__Group_1__0 )
                    // InternalDSL.g:1216:4: rule__NodeIdentitiySelector__Group_1__0
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
    // InternalDSL.g:1224:1: rule__CharacteristicSetReference__Alternatives : ( ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) ) | ( ( rule__CharacteristicSetReference__RefAssignment_1 ) ) );
    public final void rule__CharacteristicSetReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1228:1: ( ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) ) | ( ( rule__CharacteristicSetReference__RefAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==20||(LA7_0>=43 && LA7_0<=45)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:1229:2: ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) )
                    {
                    // InternalDSL.g:1229:2: ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) )
                    // InternalDSL.g:1230:3: ( rule__CharacteristicSetReference__ValueAssignment_0 )
                    {
                     before(grammarAccess.getCharacteristicSetReferenceAccess().getValueAssignment_0()); 
                    // InternalDSL.g:1231:3: ( rule__CharacteristicSetReference__ValueAssignment_0 )
                    // InternalDSL.g:1231:4: rule__CharacteristicSetReference__ValueAssignment_0
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
                    // InternalDSL.g:1235:2: ( ( rule__CharacteristicSetReference__RefAssignment_1 ) )
                    {
                    // InternalDSL.g:1235:2: ( ( rule__CharacteristicSetReference__RefAssignment_1 ) )
                    // InternalDSL.g:1236:3: ( rule__CharacteristicSetReference__RefAssignment_1 )
                    {
                     before(grammarAccess.getCharacteristicSetReferenceAccess().getRefAssignment_1()); 
                    // InternalDSL.g:1237:3: ( rule__CharacteristicSetReference__RefAssignment_1 )
                    // InternalDSL.g:1237:4: rule__CharacteristicSetReference__RefAssignment_1
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


    // $ANTLR start "rule__CharacteristsicSetOperation__Alternatives"
    // InternalDSL.g:1245:1: rule__CharacteristsicSetOperation__Alternatives : ( ( ruleCreateSetOperation ) | ( ruleIntersectionOperation ) | ( ruleUnionOperation ) | ( ruleSubtractOperation ) );
    public final void rule__CharacteristsicSetOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1249:1: ( ( ruleCreateSetOperation ) | ( ruleIntersectionOperation ) | ( ruleUnionOperation ) | ( ruleSubtractOperation ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 43:
                {
                alt8=2;
                }
                break;
            case 44:
                {
                alt8=3;
                }
                break;
            case 45:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDSL.g:1250:2: ( ruleCreateSetOperation )
                    {
                    // InternalDSL.g:1250:2: ( ruleCreateSetOperation )
                    // InternalDSL.g:1251:3: ruleCreateSetOperation
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
                    // InternalDSL.g:1256:2: ( ruleIntersectionOperation )
                    {
                    // InternalDSL.g:1256:2: ( ruleIntersectionOperation )
                    // InternalDSL.g:1257:3: ruleIntersectionOperation
                    {
                     before(grammarAccess.getCharacteristsicSetOperationAccess().getIntersectionOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntersectionOperation();

                    state._fsp--;

                     after(grammarAccess.getCharacteristsicSetOperationAccess().getIntersectionOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1262:2: ( ruleUnionOperation )
                    {
                    // InternalDSL.g:1262:2: ( ruleUnionOperation )
                    // InternalDSL.g:1263:3: ruleUnionOperation
                    {
                     before(grammarAccess.getCharacteristsicSetOperationAccess().getUnionOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnionOperation();

                    state._fsp--;

                     after(grammarAccess.getCharacteristsicSetOperationAccess().getUnionOperationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:1268:2: ( ruleSubtractOperation )
                    {
                    // InternalDSL.g:1268:2: ( ruleSubtractOperation )
                    // InternalDSL.g:1269:3: ruleSubtractOperation
                    {
                     before(grammarAccess.getCharacteristsicSetOperationAccess().getSubtractOperationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSubtractOperation();

                    state._fsp--;

                     after(grammarAccess.getCharacteristsicSetOperationAccess().getSubtractOperationParserRuleCall_3()); 

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


    // $ANTLR start "rule__LogicalNegationOperation__Alternatives"
    // InternalDSL.g:1278:1: rule__LogicalNegationOperation__Alternatives : ( ( ruleEncapsulatedLogicalOperation ) | ( ( rule__LogicalNegationOperation__Group_1__0 ) ) );
    public final void rule__LogicalNegationOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1282:1: ( ( ruleEncapsulatedLogicalOperation ) | ( ( rule__LogicalNegationOperation__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==38||LA9_0==42||LA9_0==46) ) {
                alt9=1;
            }
            else if ( (LA9_0==37) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:1283:2: ( ruleEncapsulatedLogicalOperation )
                    {
                    // InternalDSL.g:1283:2: ( ruleEncapsulatedLogicalOperation )
                    // InternalDSL.g:1284:3: ruleEncapsulatedLogicalOperation
                    {
                     before(grammarAccess.getLogicalNegationOperationAccess().getEncapsulatedLogicalOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEncapsulatedLogicalOperation();

                    state._fsp--;

                     after(grammarAccess.getLogicalNegationOperationAccess().getEncapsulatedLogicalOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1289:2: ( ( rule__LogicalNegationOperation__Group_1__0 ) )
                    {
                    // InternalDSL.g:1289:2: ( ( rule__LogicalNegationOperation__Group_1__0 ) )
                    // InternalDSL.g:1290:3: ( rule__LogicalNegationOperation__Group_1__0 )
                    {
                     before(grammarAccess.getLogicalNegationOperationAccess().getGroup_1()); 
                    // InternalDSL.g:1291:3: ( rule__LogicalNegationOperation__Group_1__0 )
                    // InternalDSL.g:1291:4: rule__LogicalNegationOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicalNegationOperation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicalNegationOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LogicalNegationOperation__Alternatives"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Alternatives"
    // InternalDSL.g:1299:1: rule__EncapsulatedLogicalOperation__Alternatives : ( ( ruleSimpleBooleanOperation ) | ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) ) );
    public final void rule__EncapsulatedLogicalOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1303:1: ( ( ruleSimpleBooleanOperation ) | ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==42||LA10_0==46) ) {
                alt10=1;
            }
            else if ( (LA10_0==38) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1304:2: ( ruleSimpleBooleanOperation )
                    {
                    // InternalDSL.g:1304:2: ( ruleSimpleBooleanOperation )
                    // InternalDSL.g:1305:3: ruleSimpleBooleanOperation
                    {
                     before(grammarAccess.getEncapsulatedLogicalOperationAccess().getSimpleBooleanOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleBooleanOperation();

                    state._fsp--;

                     after(grammarAccess.getEncapsulatedLogicalOperationAccess().getSimpleBooleanOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1310:2: ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) )
                    {
                    // InternalDSL.g:1310:2: ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) )
                    // InternalDSL.g:1311:3: ( rule__EncapsulatedLogicalOperation__Group_1__0 )
                    {
                     before(grammarAccess.getEncapsulatedLogicalOperationAccess().getGroup_1()); 
                    // InternalDSL.g:1312:3: ( rule__EncapsulatedLogicalOperation__Group_1__0 )
                    // InternalDSL.g:1312:4: rule__EncapsulatedLogicalOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EncapsulatedLogicalOperation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEncapsulatedLogicalOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Alternatives"


    // $ANTLR start "rule__SimpleBooleanOperation__Alternatives"
    // InternalDSL.g:1320:1: rule__SimpleBooleanOperation__Alternatives : ( ( ruleEmptySetOperation ) | ( ruleVariableEqualityOperation ) | ( ruleVariableInequalityOperation ) | ( ruleElementOfOperation ) );
    public final void rule__SimpleBooleanOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1324:1: ( ( ruleEmptySetOperation ) | ( ruleVariableEqualityOperation ) | ( ruleVariableInequalityOperation ) | ( ruleElementOfOperation ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==40) ) {
                    alt11=2;
                }
                else if ( (LA11_2==41) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1325:2: ( ruleEmptySetOperation )
                    {
                    // InternalDSL.g:1325:2: ( ruleEmptySetOperation )
                    // InternalDSL.g:1326:3: ruleEmptySetOperation
                    {
                     before(grammarAccess.getSimpleBooleanOperationAccess().getEmptySetOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptySetOperation();

                    state._fsp--;

                     after(grammarAccess.getSimpleBooleanOperationAccess().getEmptySetOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1331:2: ( ruleVariableEqualityOperation )
                    {
                    // InternalDSL.g:1331:2: ( ruleVariableEqualityOperation )
                    // InternalDSL.g:1332:3: ruleVariableEqualityOperation
                    {
                     before(grammarAccess.getSimpleBooleanOperationAccess().getVariableEqualityOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableEqualityOperation();

                    state._fsp--;

                     after(grammarAccess.getSimpleBooleanOperationAccess().getVariableEqualityOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1337:2: ( ruleVariableInequalityOperation )
                    {
                    // InternalDSL.g:1337:2: ( ruleVariableInequalityOperation )
                    // InternalDSL.g:1338:3: ruleVariableInequalityOperation
                    {
                     before(grammarAccess.getSimpleBooleanOperationAccess().getVariableInequalityOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableInequalityOperation();

                    state._fsp--;

                     after(grammarAccess.getSimpleBooleanOperationAccess().getVariableInequalityOperationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:1343:2: ( ruleElementOfOperation )
                    {
                    // InternalDSL.g:1343:2: ( ruleElementOfOperation )
                    // InternalDSL.g:1344:3: ruleElementOfOperation
                    {
                     before(grammarAccess.getSimpleBooleanOperationAccess().getElementOfOperationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleElementOfOperation();

                    state._fsp--;

                     after(grammarAccess.getSimpleBooleanOperationAccess().getElementOfOperationParserRuleCall_3()); 

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
    // $ANTLR end "rule__SimpleBooleanOperation__Alternatives"


    // $ANTLR start "rule__TargetModelType__Alternatives"
    // InternalDSL.g:1353:1: rule__TargetModelType__Alternatives : ( ( ( 'OperationModel' ) ) | ( ( 'DataCentricPalladio' ) ) | ( ( 'ExtendedDFD' ) ) );
    public final void rule__TargetModelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1357:1: ( ( ( 'OperationModel' ) ) | ( ( 'DataCentricPalladio' ) ) | ( ( 'ExtendedDFD' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt12=1;
                }
                break;
            case 12:
                {
                alt12=2;
                }
                break;
            case 13:
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
                    // InternalDSL.g:1358:2: ( ( 'OperationModel' ) )
                    {
                    // InternalDSL.g:1358:2: ( ( 'OperationModel' ) )
                    // InternalDSL.g:1359:3: ( 'OperationModel' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1360:3: ( 'OperationModel' )
                    // InternalDSL.g:1360:4: 'OperationModel'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1364:2: ( ( 'DataCentricPalladio' ) )
                    {
                    // InternalDSL.g:1364:2: ( ( 'DataCentricPalladio' ) )
                    // InternalDSL.g:1365:3: ( 'DataCentricPalladio' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1366:3: ( 'DataCentricPalladio' )
                    // InternalDSL.g:1366:4: 'DataCentricPalladio'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1370:2: ( ( 'ExtendedDFD' ) )
                    {
                    // InternalDSL.g:1370:2: ( ( 'ExtendedDFD' ) )
                    // InternalDSL.g:1371:3: ( 'ExtendedDFD' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:1372:3: ( 'ExtendedDFD' )
                    // InternalDSL.g:1372:4: 'ExtendedDFD'
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
    // InternalDSL.g:1380:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1384:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDSL.g:1385:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDSL.g:1392:1: rule__Model__Group__0__Impl : ( ( rule__Model__TargetModelTypeAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1396:1: ( ( ( rule__Model__TargetModelTypeAssignment_0 )? ) )
            // InternalDSL.g:1397:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            {
            // InternalDSL.g:1397:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            // InternalDSL.g:1398:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getTargetModelTypeAssignment_0()); 
            // InternalDSL.g:1399:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:1399:3: rule__Model__TargetModelTypeAssignment_0
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
    // InternalDSL.g:1407:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1411:1: ( rule__Model__Group__1__Impl )
            // InternalDSL.g:1412:2: rule__Model__Group__1__Impl
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
    // InternalDSL.g:1418:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1422:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDSL.g:1423:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDSL.g:1423:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDSL.g:1424:2: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDSL.g:1425:2: ( rule__Model__ElementsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SL_COMMENT||LA14_0==17||LA14_0==19||(LA14_0>=26 && LA14_0<=27)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:1425:3: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDSL.g:1434:1: rule__TargetModelTypeDef__Group__0 : rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 ;
    public final void rule__TargetModelTypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1438:1: ( rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 )
            // InternalDSL.g:1439:2: rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1
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
    // InternalDSL.g:1446:1: rule__TargetModelTypeDef__Group__0__Impl : ( 'target' ) ;
    public final void rule__TargetModelTypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1450:1: ( ( 'target' ) )
            // InternalDSL.g:1451:1: ( 'target' )
            {
            // InternalDSL.g:1451:1: ( 'target' )
            // InternalDSL.g:1452:2: 'target'
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
    // InternalDSL.g:1461:1: rule__TargetModelTypeDef__Group__1 : rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2 ;
    public final void rule__TargetModelTypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1465:1: ( rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2 )
            // InternalDSL.g:1466:2: rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2
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
    // InternalDSL.g:1473:1: rule__TargetModelTypeDef__Group__1__Impl : ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1477:1: ( ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) )
            // InternalDSL.g:1478:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            {
            // InternalDSL.g:1478:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            // InternalDSL.g:1479:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeAssignment_1()); 
            // InternalDSL.g:1480:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            // InternalDSL.g:1480:3: rule__TargetModelTypeDef__TypeAssignment_1
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
    // InternalDSL.g:1488:1: rule__TargetModelTypeDef__Group__2 : rule__TargetModelTypeDef__Group__2__Impl ;
    public final void rule__TargetModelTypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1492:1: ( rule__TargetModelTypeDef__Group__2__Impl )
            // InternalDSL.g:1493:2: rule__TargetModelTypeDef__Group__2__Impl
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
    // InternalDSL.g:1499:1: rule__TargetModelTypeDef__Group__2__Impl : ( ( rule__TargetModelTypeDef__Group_2__0 )? ) ;
    public final void rule__TargetModelTypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1503:1: ( ( ( rule__TargetModelTypeDef__Group_2__0 )? ) )
            // InternalDSL.g:1504:1: ( ( rule__TargetModelTypeDef__Group_2__0 )? )
            {
            // InternalDSL.g:1504:1: ( ( rule__TargetModelTypeDef__Group_2__0 )? )
            // InternalDSL.g:1505:2: ( rule__TargetModelTypeDef__Group_2__0 )?
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getGroup_2()); 
            // InternalDSL.g:1506:2: ( rule__TargetModelTypeDef__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:1506:3: rule__TargetModelTypeDef__Group_2__0
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
    // InternalDSL.g:1515:1: rule__TargetModelTypeDef__Group_2__0 : rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1 ;
    public final void rule__TargetModelTypeDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1519:1: ( rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1 )
            // InternalDSL.g:1520:2: rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1
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
    // InternalDSL.g:1527:1: rule__TargetModelTypeDef__Group_2__0__Impl : ( 'using' ) ;
    public final void rule__TargetModelTypeDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1531:1: ( ( 'using' ) )
            // InternalDSL.g:1532:1: ( 'using' )
            {
            // InternalDSL.g:1532:1: ( 'using' )
            // InternalDSL.g:1533:2: 'using'
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
    // InternalDSL.g:1542:1: rule__TargetModelTypeDef__Group_2__1 : rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2 ;
    public final void rule__TargetModelTypeDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1546:1: ( rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2 )
            // InternalDSL.g:1547:2: rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2
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
    // InternalDSL.g:1554:1: rule__TargetModelTypeDef__Group_2__1__Impl : ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1558:1: ( ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) ) )
            // InternalDSL.g:1559:1: ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) )
            {
            // InternalDSL.g:1559:1: ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) )
            // InternalDSL.g:1560:2: ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerAssignment_2_1()); 
            // InternalDSL.g:1561:2: ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 )
            // InternalDSL.g:1561:3: rule__TargetModelTypeDef__TypeContainerAssignment_2_1
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
    // InternalDSL.g:1569:1: rule__TargetModelTypeDef__Group_2__2 : rule__TargetModelTypeDef__Group_2__2__Impl ;
    public final void rule__TargetModelTypeDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1573:1: ( rule__TargetModelTypeDef__Group_2__2__Impl )
            // InternalDSL.g:1574:2: rule__TargetModelTypeDef__Group_2__2__Impl
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
    // InternalDSL.g:1580:1: rule__TargetModelTypeDef__Group_2__2__Impl : ( ( rule__TargetModelTypeDef__Group_2_2__0 )? ) ;
    public final void rule__TargetModelTypeDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1584:1: ( ( ( rule__TargetModelTypeDef__Group_2_2__0 )? ) )
            // InternalDSL.g:1585:1: ( ( rule__TargetModelTypeDef__Group_2_2__0 )? )
            {
            // InternalDSL.g:1585:1: ( ( rule__TargetModelTypeDef__Group_2_2__0 )? )
            // InternalDSL.g:1586:2: ( rule__TargetModelTypeDef__Group_2_2__0 )?
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getGroup_2_2()); 
            // InternalDSL.g:1587:2: ( rule__TargetModelTypeDef__Group_2_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDSL.g:1587:3: rule__TargetModelTypeDef__Group_2_2__0
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
    // InternalDSL.g:1596:1: rule__TargetModelTypeDef__Group_2_2__0 : rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1 ;
    public final void rule__TargetModelTypeDef__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1600:1: ( rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1 )
            // InternalDSL.g:1601:2: rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1
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
    // InternalDSL.g:1608:1: rule__TargetModelTypeDef__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1612:1: ( ( ',' ) )
            // InternalDSL.g:1613:1: ( ',' )
            {
            // InternalDSL.g:1613:1: ( ',' )
            // InternalDSL.g:1614:2: ','
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
    // InternalDSL.g:1623:1: rule__TargetModelTypeDef__Group_2_2__1 : rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2 ;
    public final void rule__TargetModelTypeDef__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1627:1: ( rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2 )
            // InternalDSL.g:1628:2: rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2
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
    // InternalDSL.g:1635:1: rule__TargetModelTypeDef__Group_2_2__1__Impl : ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1639:1: ( ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) ) )
            // InternalDSL.g:1640:1: ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) )
            {
            // InternalDSL.g:1640:1: ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) )
            // InternalDSL.g:1641:2: ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAssignment_2_2_1()); 
            // InternalDSL.g:1642:2: ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 )
            // InternalDSL.g:1642:3: rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1
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
    // InternalDSL.g:1650:1: rule__TargetModelTypeDef__Group_2_2__2 : rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3 ;
    public final void rule__TargetModelTypeDef__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1654:1: ( rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3 )
            // InternalDSL.g:1655:2: rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3
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
    // InternalDSL.g:1662:1: rule__TargetModelTypeDef__Group_2_2__2__Impl : ( ',' ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1666:1: ( ( ',' ) )
            // InternalDSL.g:1667:1: ( ',' )
            {
            // InternalDSL.g:1667:1: ( ',' )
            // InternalDSL.g:1668:2: ','
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
    // InternalDSL.g:1677:1: rule__TargetModelTypeDef__Group_2_2__3 : rule__TargetModelTypeDef__Group_2_2__3__Impl ;
    public final void rule__TargetModelTypeDef__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1681:1: ( rule__TargetModelTypeDef__Group_2_2__3__Impl )
            // InternalDSL.g:1682:2: rule__TargetModelTypeDef__Group_2_2__3__Impl
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
    // InternalDSL.g:1688:1: rule__TargetModelTypeDef__Group_2_2__3__Impl : ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1692:1: ( ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) ) )
            // InternalDSL.g:1693:1: ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) )
            {
            // InternalDSL.g:1693:1: ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) )
            // InternalDSL.g:1694:2: ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsageModelAssignment_2_2_3()); 
            // InternalDSL.g:1695:2: ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 )
            // InternalDSL.g:1695:3: rule__TargetModelTypeDef__UsageModelAssignment_2_2_3
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
    // InternalDSL.g:1704:1: rule__AbstractElement__Group_4__0 : rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 ;
    public final void rule__AbstractElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1708:1: ( rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 )
            // InternalDSL.g:1709:2: rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1
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
    // InternalDSL.g:1716:1: rule__AbstractElement__Group_4__0__Impl : ( () ) ;
    public final void rule__AbstractElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1720:1: ( ( () ) )
            // InternalDSL.g:1721:1: ( () )
            {
            // InternalDSL.g:1721:1: ( () )
            // InternalDSL.g:1722:2: ()
            {
             before(grammarAccess.getAbstractElementAccess().getAbstractElementAction_4_0()); 
            // InternalDSL.g:1723:2: ()
            // InternalDSL.g:1723:3: 
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
    // InternalDSL.g:1731:1: rule__AbstractElement__Group_4__1 : rule__AbstractElement__Group_4__1__Impl ;
    public final void rule__AbstractElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1735:1: ( rule__AbstractElement__Group_4__1__Impl )
            // InternalDSL.g:1736:2: rule__AbstractElement__Group_4__1__Impl
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
    // InternalDSL.g:1742:1: rule__AbstractElement__Group_4__1__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__AbstractElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1746:1: ( ( RULE_SL_COMMENT ) )
            // InternalDSL.g:1747:1: ( RULE_SL_COMMENT )
            {
            // InternalDSL.g:1747:1: ( RULE_SL_COMMENT )
            // InternalDSL.g:1748:2: RULE_SL_COMMENT
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
    // InternalDSL.g:1758:1: rule__CharacteristicType__Group__0 : rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 ;
    public final void rule__CharacteristicType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1762:1: ( rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 )
            // InternalDSL.g:1763:2: rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1
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
    // InternalDSL.g:1770:1: rule__CharacteristicType__Group__0__Impl : ( 'type' ) ;
    public final void rule__CharacteristicType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1774:1: ( ( 'type' ) )
            // InternalDSL.g:1775:1: ( 'type' )
            {
            // InternalDSL.g:1775:1: ( 'type' )
            // InternalDSL.g:1776:2: 'type'
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
    // InternalDSL.g:1785:1: rule__CharacteristicType__Group__1 : rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 ;
    public final void rule__CharacteristicType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1789:1: ( rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 )
            // InternalDSL.g:1790:2: rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2
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
    // InternalDSL.g:1797:1: rule__CharacteristicType__Group__1__Impl : ( ( rule__CharacteristicType__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1801:1: ( ( ( rule__CharacteristicType__NameAssignment_1 ) ) )
            // InternalDSL.g:1802:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1802:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            // InternalDSL.g:1803:2: ( rule__CharacteristicType__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1804:2: ( rule__CharacteristicType__NameAssignment_1 )
            // InternalDSL.g:1804:3: rule__CharacteristicType__NameAssignment_1
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
    // InternalDSL.g:1812:1: rule__CharacteristicType__Group__2 : rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 ;
    public final void rule__CharacteristicType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1816:1: ( rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 )
            // InternalDSL.g:1817:2: rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3
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
    // InternalDSL.g:1824:1: rule__CharacteristicType__Group__2__Impl : ( ':' ) ;
    public final void rule__CharacteristicType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1828:1: ( ( ':' ) )
            // InternalDSL.g:1829:1: ( ':' )
            {
            // InternalDSL.g:1829:1: ( ':' )
            // InternalDSL.g:1830:2: ':'
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
    // InternalDSL.g:1839:1: rule__CharacteristicType__Group__3 : rule__CharacteristicType__Group__3__Impl ;
    public final void rule__CharacteristicType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1843:1: ( rule__CharacteristicType__Group__3__Impl )
            // InternalDSL.g:1844:2: rule__CharacteristicType__Group__3__Impl
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
    // InternalDSL.g:1850:1: rule__CharacteristicType__Group__3__Impl : ( ( rule__CharacteristicType__RefAssignment_3 ) ) ;
    public final void rule__CharacteristicType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1854:1: ( ( ( rule__CharacteristicType__RefAssignment_3 ) ) )
            // InternalDSL.g:1855:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            {
            // InternalDSL.g:1855:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            // InternalDSL.g:1856:2: ( rule__CharacteristicType__RefAssignment_3 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefAssignment_3()); 
            // InternalDSL.g:1857:2: ( rule__CharacteristicType__RefAssignment_3 )
            // InternalDSL.g:1857:3: rule__CharacteristicType__RefAssignment_3
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
    // InternalDSL.g:1866:1: rule__CharacteristicClass__Group__0 : rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 ;
    public final void rule__CharacteristicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1870:1: ( rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 )
            // InternalDSL.g:1871:2: rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1
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
    // InternalDSL.g:1878:1: rule__CharacteristicClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__CharacteristicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1882:1: ( ( 'class' ) )
            // InternalDSL.g:1883:1: ( 'class' )
            {
            // InternalDSL.g:1883:1: ( 'class' )
            // InternalDSL.g:1884:2: 'class'
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
    // InternalDSL.g:1893:1: rule__CharacteristicClass__Group__1 : rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 ;
    public final void rule__CharacteristicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1897:1: ( rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 )
            // InternalDSL.g:1898:2: rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2
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
    // InternalDSL.g:1905:1: rule__CharacteristicClass__Group__1__Impl : ( ( rule__CharacteristicClass__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1909:1: ( ( ( rule__CharacteristicClass__NameAssignment_1 ) ) )
            // InternalDSL.g:1910:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            {
            // InternalDSL.g:1910:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            // InternalDSL.g:1911:2: ( rule__CharacteristicClass__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 
            // InternalDSL.g:1912:2: ( rule__CharacteristicClass__NameAssignment_1 )
            // InternalDSL.g:1912:3: rule__CharacteristicClass__NameAssignment_1
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
    // InternalDSL.g:1920:1: rule__CharacteristicClass__Group__2 : rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 ;
    public final void rule__CharacteristicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1924:1: ( rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 )
            // InternalDSL.g:1925:2: rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3
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
    // InternalDSL.g:1932:1: rule__CharacteristicClass__Group__2__Impl : ( '{' ) ;
    public final void rule__CharacteristicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1936:1: ( ( '{' ) )
            // InternalDSL.g:1937:1: ( '{' )
            {
            // InternalDSL.g:1937:1: ( '{' )
            // InternalDSL.g:1938:2: '{'
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
    // InternalDSL.g:1947:1: rule__CharacteristicClass__Group__3 : rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 ;
    public final void rule__CharacteristicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1951:1: ( rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 )
            // InternalDSL.g:1952:2: rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4
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
    // InternalDSL.g:1959:1: rule__CharacteristicClass__Group__3__Impl : ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) ;
    public final void rule__CharacteristicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1963:1: ( ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) )
            // InternalDSL.g:1964:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            {
            // InternalDSL.g:1964:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            // InternalDSL.g:1965:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 
            // InternalDSL.g:1966:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            // InternalDSL.g:1966:3: rule__CharacteristicClass__MembersAssignment_3
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
    // InternalDSL.g:1974:1: rule__CharacteristicClass__Group__4 : rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 ;
    public final void rule__CharacteristicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1978:1: ( rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 )
            // InternalDSL.g:1979:2: rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5
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
    // InternalDSL.g:1986:1: rule__CharacteristicClass__Group__4__Impl : ( ( rule__CharacteristicClass__Group_4__0 )* ) ;
    public final void rule__CharacteristicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1990:1: ( ( ( rule__CharacteristicClass__Group_4__0 )* ) )
            // InternalDSL.g:1991:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            {
            // InternalDSL.g:1991:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            // InternalDSL.g:1992:2: ( rule__CharacteristicClass__Group_4__0 )*
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 
            // InternalDSL.g:1993:2: ( rule__CharacteristicClass__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:1993:3: rule__CharacteristicClass__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CharacteristicClass__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDSL.g:2001:1: rule__CharacteristicClass__Group__5 : rule__CharacteristicClass__Group__5__Impl ;
    public final void rule__CharacteristicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2005:1: ( rule__CharacteristicClass__Group__5__Impl )
            // InternalDSL.g:2006:2: rule__CharacteristicClass__Group__5__Impl
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
    // InternalDSL.g:2012:1: rule__CharacteristicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__CharacteristicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2016:1: ( ( '}' ) )
            // InternalDSL.g:2017:1: ( '}' )
            {
            // InternalDSL.g:2017:1: ( '}' )
            // InternalDSL.g:2018:2: '}'
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
    // InternalDSL.g:2028:1: rule__CharacteristicClass__Group_4__0 : rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 ;
    public final void rule__CharacteristicClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2032:1: ( rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 )
            // InternalDSL.g:2033:2: rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1
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
    // InternalDSL.g:2040:1: rule__CharacteristicClass__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2044:1: ( ( ',' ) )
            // InternalDSL.g:2045:1: ( ',' )
            {
            // InternalDSL.g:2045:1: ( ',' )
            // InternalDSL.g:2046:2: ','
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
    // InternalDSL.g:2055:1: rule__CharacteristicClass__Group_4__1 : rule__CharacteristicClass__Group_4__1__Impl ;
    public final void rule__CharacteristicClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2059:1: ( rule__CharacteristicClass__Group_4__1__Impl )
            // InternalDSL.g:2060:2: rule__CharacteristicClass__Group_4__1__Impl
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
    // InternalDSL.g:2066:1: rule__CharacteristicClass__Group_4__1__Impl : ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) ;
    public final void rule__CharacteristicClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2070:1: ( ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) )
            // InternalDSL.g:2071:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            {
            // InternalDSL.g:2071:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            // InternalDSL.g:2072:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 
            // InternalDSL.g:2073:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            // InternalDSL.g:2073:3: rule__CharacteristicClass__MembersAssignment_4_1
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
    // InternalDSL.g:2082:1: rule__CharacteristicTypeSelector__Group__0 : rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 ;
    public final void rule__CharacteristicTypeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2086:1: ( rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 )
            // InternalDSL.g:2087:2: rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1
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
    // InternalDSL.g:2094:1: rule__CharacteristicTypeSelector__Group__0__Impl : ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2098:1: ( ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) )
            // InternalDSL.g:2099:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            {
            // InternalDSL.g:2099:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            // InternalDSL.g:2100:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefAssignment_0()); 
            // InternalDSL.g:2101:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            // InternalDSL.g:2101:3: rule__CharacteristicTypeSelector__RefAssignment_0
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
    // InternalDSL.g:2109:1: rule__CharacteristicTypeSelector__Group__1 : rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 ;
    public final void rule__CharacteristicTypeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2113:1: ( rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 )
            // InternalDSL.g:2114:2: rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2
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
    // InternalDSL.g:2121:1: rule__CharacteristicTypeSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__CharacteristicTypeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2125:1: ( ( '.' ) )
            // InternalDSL.g:2126:1: ( '.' )
            {
            // InternalDSL.g:2126:1: ( '.' )
            // InternalDSL.g:2127:2: '.'
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
    // InternalDSL.g:2136:1: rule__CharacteristicTypeSelector__Group__2 : rule__CharacteristicTypeSelector__Group__2__Impl ;
    public final void rule__CharacteristicTypeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2140:1: ( rule__CharacteristicTypeSelector__Group__2__Impl )
            // InternalDSL.g:2141:2: rule__CharacteristicTypeSelector__Group__2__Impl
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
    // InternalDSL.g:2147:1: rule__CharacteristicTypeSelector__Group__2__Impl : ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2151:1: ( ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) )
            // InternalDSL.g:2152:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            {
            // InternalDSL.g:2152:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            // InternalDSL.g:2153:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2()); 
            // InternalDSL.g:2154:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            // InternalDSL.g:2154:3: rule__CharacteristicTypeSelector__Alternatives_2
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
    // InternalDSL.g:2163:1: rule__CharacteristicTypeSelector__Group_2_0__0 : rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2167:1: ( rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 )
            // InternalDSL.g:2168:2: rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1
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
    // InternalDSL.g:2175:1: rule__CharacteristicTypeSelector__Group_2_0__0__Impl : ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2179:1: ( ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) )
            // InternalDSL.g:2180:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            {
            // InternalDSL.g:2180:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            // InternalDSL.g:2181:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedAssignment_2_0_0()); 
            // InternalDSL.g:2182:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDSL.g:2182:3: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0
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
    // InternalDSL.g:2190:1: rule__CharacteristicTypeSelector__Group_2_0__1 : rule__CharacteristicTypeSelector__Group_2_0__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2194:1: ( rule__CharacteristicTypeSelector__Group_2_0__1__Impl )
            // InternalDSL.g:2195:2: rule__CharacteristicTypeSelector__Group_2_0__1__Impl
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
    // InternalDSL.g:2201:1: rule__CharacteristicTypeSelector__Group_2_0__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2205:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) )
            // InternalDSL.g:2206:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            {
            // InternalDSL.g:2206:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            // InternalDSL.g:2207:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_0_1()); 
            // InternalDSL.g:2208:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            // InternalDSL.g:2208:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1
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
    // InternalDSL.g:2217:1: rule__CharacteristicTypeSelector__Group_2_1__0 : rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2221:1: ( rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 )
            // InternalDSL.g:2222:2: rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1
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
    // InternalDSL.g:2229:1: rule__CharacteristicTypeSelector__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2233:1: ( ( '[' ) )
            // InternalDSL.g:2234:1: ( '[' )
            {
            // InternalDSL.g:2234:1: ( '[' )
            // InternalDSL.g:2235:2: '['
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
    // InternalDSL.g:2244:1: rule__CharacteristicTypeSelector__Group_2_1__1 : rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2248:1: ( rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 )
            // InternalDSL.g:2249:2: rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2
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
    // InternalDSL.g:2256:1: rule__CharacteristicTypeSelector__Group_2_1__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2260:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) )
            // InternalDSL.g:2261:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            {
            // InternalDSL.g:2261:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            // InternalDSL.g:2262:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_1()); 
            // InternalDSL.g:2263:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            // InternalDSL.g:2263:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1
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
    // InternalDSL.g:2271:1: rule__CharacteristicTypeSelector__Group_2_1__2 : rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2275:1: ( rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 )
            // InternalDSL.g:2276:2: rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3
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
    // InternalDSL.g:2283:1: rule__CharacteristicTypeSelector__Group_2_1__2__Impl : ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2287:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) )
            // InternalDSL.g:2288:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            {
            // InternalDSL.g:2288:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            // InternalDSL.g:2289:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2()); 
            // InternalDSL.g:2290:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDSL.g:2290:3: rule__CharacteristicTypeSelector__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CharacteristicTypeSelector__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalDSL.g:2298:1: rule__CharacteristicTypeSelector__Group_2_1__3 : rule__CharacteristicTypeSelector__Group_2_1__3__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2302:1: ( rule__CharacteristicTypeSelector__Group_2_1__3__Impl )
            // InternalDSL.g:2303:2: rule__CharacteristicTypeSelector__Group_2_1__3__Impl
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
    // InternalDSL.g:2309:1: rule__CharacteristicTypeSelector__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2313:1: ( ( ']' ) )
            // InternalDSL.g:2314:1: ( ']' )
            {
            // InternalDSL.g:2314:1: ( ']' )
            // InternalDSL.g:2315:2: ']'
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
    // InternalDSL.g:2325:1: rule__CharacteristicTypeSelector__Group_2_1_2__0 : rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2329:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 )
            // InternalDSL.g:2330:2: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1
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
    // InternalDSL.g:2337:1: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2341:1: ( ( ',' ) )
            // InternalDSL.g:2342:1: ( ',' )
            {
            // InternalDSL.g:2342:1: ( ',' )
            // InternalDSL.g:2343:2: ','
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
    // InternalDSL.g:2352:1: rule__CharacteristicTypeSelector__Group_2_1_2__1 : rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2356:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl )
            // InternalDSL.g:2357:2: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl
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
    // InternalDSL.g:2363:1: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2367:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) )
            // InternalDSL.g:2368:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            {
            // InternalDSL.g:2368:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            // InternalDSL.g:2369:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_1()); 
            // InternalDSL.g:2370:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            // InternalDSL.g:2370:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1
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
    // InternalDSL.g:2379:1: rule__CharacteristicTypeSelector__Group_2_2__0 : rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2383:1: ( rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1 )
            // InternalDSL.g:2384:2: rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1
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
    // InternalDSL.g:2391:1: rule__CharacteristicTypeSelector__Group_2_2__0__Impl : ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2395:1: ( ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) ) )
            // InternalDSL.g:2396:1: ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) )
            {
            // InternalDSL.g:2396:1: ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) )
            // InternalDSL.g:2397:2: ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorAssignment_2_2_0()); 
            // InternalDSL.g:2398:2: ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 )
            // InternalDSL.g:2398:3: rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0
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
    // InternalDSL.g:2406:1: rule__CharacteristicTypeSelector__Group_2_2__1 : rule__CharacteristicTypeSelector__Group_2_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2410:1: ( rule__CharacteristicTypeSelector__Group_2_2__1__Impl )
            // InternalDSL.g:2411:2: rule__CharacteristicTypeSelector__Group_2_2__1__Impl
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
    // InternalDSL.g:2417:1: rule__CharacteristicTypeSelector__Group_2_2__1__Impl : ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2421:1: ( ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) ) )
            // InternalDSL.g:2422:1: ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) )
            {
            // InternalDSL.g:2422:1: ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) )
            // InternalDSL.g:2423:2: ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableAssignment_2_2_1()); 
            // InternalDSL.g:2424:2: ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 )
            // InternalDSL.g:2424:3: rule__CharacteristicTypeSelector__VariableAssignment_2_2_1
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
    // InternalDSL.g:2433:1: rule__CharacteristicSet__Group__0 : rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1 ;
    public final void rule__CharacteristicSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2437:1: ( rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1 )
            // InternalDSL.g:2438:2: rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1
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
    // InternalDSL.g:2445:1: rule__CharacteristicSet__Group__0__Impl : ( ( rule__CharacteristicSet__NameAssignment_0 ) ) ;
    public final void rule__CharacteristicSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2449:1: ( ( ( rule__CharacteristicSet__NameAssignment_0 ) ) )
            // InternalDSL.g:2450:1: ( ( rule__CharacteristicSet__NameAssignment_0 ) )
            {
            // InternalDSL.g:2450:1: ( ( rule__CharacteristicSet__NameAssignment_0 ) )
            // InternalDSL.g:2451:2: ( rule__CharacteristicSet__NameAssignment_0 )
            {
             before(grammarAccess.getCharacteristicSetAccess().getNameAssignment_0()); 
            // InternalDSL.g:2452:2: ( rule__CharacteristicSet__NameAssignment_0 )
            // InternalDSL.g:2452:3: rule__CharacteristicSet__NameAssignment_0
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
    // InternalDSL.g:2460:1: rule__CharacteristicSet__Group__1 : rule__CharacteristicSet__Group__1__Impl ;
    public final void rule__CharacteristicSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2464:1: ( rule__CharacteristicSet__Group__1__Impl )
            // InternalDSL.g:2465:2: rule__CharacteristicSet__Group__1__Impl
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
    // InternalDSL.g:2471:1: rule__CharacteristicSet__Group__1__Impl : ( '{}' ) ;
    public final void rule__CharacteristicSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2475:1: ( ( '{}' ) )
            // InternalDSL.g:2476:1: ( '{}' )
            {
            // InternalDSL.g:2476:1: ( '{}' )
            // InternalDSL.g:2477:2: '{}'
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
    // InternalDSL.g:2487:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2491:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalDSL.g:2492:2: rule__Include__Group__0__Impl rule__Include__Group__1
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
    // InternalDSL.g:2499:1: rule__Include__Group__0__Impl : ( 'import' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2503:1: ( ( 'import' ) )
            // InternalDSL.g:2504:1: ( 'import' )
            {
            // InternalDSL.g:2504:1: ( 'import' )
            // InternalDSL.g:2505:2: 'import'
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
    // InternalDSL.g:2514:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2518:1: ( rule__Include__Group__1__Impl )
            // InternalDSL.g:2519:2: rule__Include__Group__1__Impl
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
    // InternalDSL.g:2525:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2529:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // InternalDSL.g:2530:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // InternalDSL.g:2530:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // InternalDSL.g:2531:2: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // InternalDSL.g:2532:2: ( rule__Include__ImportURIAssignment_1 )
            // InternalDSL.g:2532:3: rule__Include__ImportURIAssignment_1
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
    // InternalDSL.g:2541:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2545:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDSL.g:2546:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalDSL.g:2553:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2557:1: ( ( 'constraint' ) )
            // InternalDSL.g:2558:1: ( 'constraint' )
            {
            // InternalDSL.g:2558:1: ( 'constraint' )
            // InternalDSL.g:2559:2: 'constraint'
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
    // InternalDSL.g:2568:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2572:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDSL.g:2573:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalDSL.g:2580:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2584:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDSL.g:2585:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDSL.g:2585:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDSL.g:2586:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDSL.g:2587:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDSL.g:2587:3: rule__Constraint__NameAssignment_1
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
    // InternalDSL.g:2595:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2599:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDSL.g:2600:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
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
    // InternalDSL.g:2607:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2611:1: ( ( '{' ) )
            // InternalDSL.g:2612:1: ( '{' )
            {
            // InternalDSL.g:2612:1: ( '{' )
            // InternalDSL.g:2613:2: '{'
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
    // InternalDSL.g:2622:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2626:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDSL.g:2627:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
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
    // InternalDSL.g:2634:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__RuleAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2638:1: ( ( ( rule__Constraint__RuleAssignment_3 ) ) )
            // InternalDSL.g:2639:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            {
            // InternalDSL.g:2639:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            // InternalDSL.g:2640:2: ( rule__Constraint__RuleAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 
            // InternalDSL.g:2641:2: ( rule__Constraint__RuleAssignment_3 )
            // InternalDSL.g:2641:3: rule__Constraint__RuleAssignment_3
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
    // InternalDSL.g:2649:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2653:1: ( rule__Constraint__Group__4__Impl )
            // InternalDSL.g:2654:2: rule__Constraint__Group__4__Impl
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
    // InternalDSL.g:2660:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2664:1: ( ( '}' ) )
            // InternalDSL.g:2665:1: ( '}' )
            {
            // InternalDSL.g:2665:1: ( '}' )
            // InternalDSL.g:2666:2: '}'
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
    // InternalDSL.g:2676:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2680:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDSL.g:2681:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalDSL.g:2688:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DataSelectorsAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2692:1: ( ( ( rule__Rule__DataSelectorsAssignment_0 ) ) )
            // InternalDSL.g:2693:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            {
            // InternalDSL.g:2693:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            // InternalDSL.g:2694:2: ( rule__Rule__DataSelectorsAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 
            // InternalDSL.g:2695:2: ( rule__Rule__DataSelectorsAssignment_0 )
            // InternalDSL.g:2695:3: rule__Rule__DataSelectorsAssignment_0
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
    // InternalDSL.g:2703:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2707:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDSL.g:2708:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalDSL.g:2715:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2719:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // InternalDSL.g:2720:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // InternalDSL.g:2720:1: ( ( rule__Rule__Group_1__0 )* )
            // InternalDSL.g:2721:2: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // InternalDSL.g:2722:2: ( rule__Rule__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDSL.g:2722:3: rule__Rule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalDSL.g:2730:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2734:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDSL.g:2735:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalDSL.g:2742:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__StatementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2746:1: ( ( ( rule__Rule__StatementAssignment_2 ) ) )
            // InternalDSL.g:2747:1: ( ( rule__Rule__StatementAssignment_2 ) )
            {
            // InternalDSL.g:2747:1: ( ( rule__Rule__StatementAssignment_2 ) )
            // InternalDSL.g:2748:2: ( rule__Rule__StatementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getStatementAssignment_2()); 
            // InternalDSL.g:2749:2: ( rule__Rule__StatementAssignment_2 )
            // InternalDSL.g:2749:3: rule__Rule__StatementAssignment_2
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
    // InternalDSL.g:2757:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2761:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDSL.g:2762:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalDSL.g:2769:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2773:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) )
            // InternalDSL.g:2774:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            {
            // InternalDSL.g:2774:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            // InternalDSL.g:2775:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 
            // InternalDSL.g:2776:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            // InternalDSL.g:2776:3: rule__Rule__DestinationSelectorsAssignment_3
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
    // InternalDSL.g:2784:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2788:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalDSL.g:2789:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalDSL.g:2796:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2800:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // InternalDSL.g:2801:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // InternalDSL.g:2801:1: ( ( rule__Rule__Group_4__0 )* )
            // InternalDSL.g:2802:2: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalDSL.g:2803:2: ( rule__Rule__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDSL.g:2803:3: rule__Rule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDSL.g:2811:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2815:1: ( rule__Rule__Group__5__Impl )
            // InternalDSL.g:2816:2: rule__Rule__Group__5__Impl
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
    // InternalDSL.g:2822:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ConditionAssignment_5 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2826:1: ( ( ( rule__Rule__ConditionAssignment_5 )? ) )
            // InternalDSL.g:2827:1: ( ( rule__Rule__ConditionAssignment_5 )? )
            {
            // InternalDSL.g:2827:1: ( ( rule__Rule__ConditionAssignment_5 )? )
            // InternalDSL.g:2828:2: ( rule__Rule__ConditionAssignment_5 )?
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_5()); 
            // InternalDSL.g:2829:2: ( rule__Rule__ConditionAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDSL.g:2829:3: rule__Rule__ConditionAssignment_5
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
    // InternalDSL.g:2838:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2842:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalDSL.g:2843:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
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
    // InternalDSL.g:2850:1: rule__Rule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2854:1: ( ( '&' ) )
            // InternalDSL.g:2855:1: ( '&' )
            {
            // InternalDSL.g:2855:1: ( '&' )
            // InternalDSL.g:2856:2: '&'
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
    // InternalDSL.g:2865:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2869:1: ( rule__Rule__Group_1__1__Impl )
            // InternalDSL.g:2870:2: rule__Rule__Group_1__1__Impl
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
    // InternalDSL.g:2876:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2880:1: ( ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) )
            // InternalDSL.g:2881:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            {
            // InternalDSL.g:2881:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            // InternalDSL.g:2882:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 
            // InternalDSL.g:2883:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            // InternalDSL.g:2883:3: rule__Rule__DataSelectorsAssignment_1_1
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
    // InternalDSL.g:2892:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2896:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalDSL.g:2897:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
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
    // InternalDSL.g:2904:1: rule__Rule__Group_4__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2908:1: ( ( '&' ) )
            // InternalDSL.g:2909:1: ( '&' )
            {
            // InternalDSL.g:2909:1: ( '&' )
            // InternalDSL.g:2910:2: '&'
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
    // InternalDSL.g:2919:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2923:1: ( rule__Rule__Group_4__1__Impl )
            // InternalDSL.g:2924:2: rule__Rule__Group_4__1__Impl
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
    // InternalDSL.g:2930:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2934:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) )
            // InternalDSL.g:2935:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            {
            // InternalDSL.g:2935:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            // InternalDSL.g:2936:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 
            // InternalDSL.g:2937:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            // InternalDSL.g:2937:3: rule__Rule__DestinationSelectorsAssignment_4_1
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
    // InternalDSL.g:2946:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2950:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // InternalDSL.g:2951:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
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
    // InternalDSL.g:2958:1: rule__AttributeSelector__Group__0__Impl : ( 'data.attribute.' ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2962:1: ( ( 'data.attribute.' ) )
            // InternalDSL.g:2963:1: ( 'data.attribute.' )
            {
            // InternalDSL.g:2963:1: ( 'data.attribute.' )
            // InternalDSL.g:2964:2: 'data.attribute.'
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
    // InternalDSL.g:2973:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2977:1: ( rule__AttributeSelector__Group__1__Impl )
            // InternalDSL.g:2978:2: rule__AttributeSelector__Group__1__Impl
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
    // InternalDSL.g:2984:1: rule__AttributeSelector__Group__1__Impl : ( ( rule__AttributeSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2988:1: ( ( ( rule__AttributeSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2989:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2989:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            // InternalDSL.g:2990:2: ( rule__AttributeSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2991:2: ( rule__AttributeSelector__RefAssignment_1 )
            // InternalDSL.g:2991:3: rule__AttributeSelector__RefAssignment_1
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
    // InternalDSL.g:3000:1: rule__AttributeClassSelector__Group__0 : rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 ;
    public final void rule__AttributeClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3004:1: ( rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 )
            // InternalDSL.g:3005:2: rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1
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
    // InternalDSL.g:3012:1: rule__AttributeClassSelector__Group__0__Impl : ( 'data.class.' ) ;
    public final void rule__AttributeClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3016:1: ( ( 'data.class.' ) )
            // InternalDSL.g:3017:1: ( 'data.class.' )
            {
            // InternalDSL.g:3017:1: ( 'data.class.' )
            // InternalDSL.g:3018:2: 'data.class.'
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
    // InternalDSL.g:3027:1: rule__AttributeClassSelector__Group__1 : rule__AttributeClassSelector__Group__1__Impl ;
    public final void rule__AttributeClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3031:1: ( rule__AttributeClassSelector__Group__1__Impl )
            // InternalDSL.g:3032:2: rule__AttributeClassSelector__Group__1__Impl
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
    // InternalDSL.g:3038:1: rule__AttributeClassSelector__Group__1__Impl : ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3042:1: ( ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:3043:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:3043:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:3044:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:3045:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            // InternalDSL.g:3045:3: rule__AttributeClassSelector__RefAssignment_1
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
    // InternalDSL.g:3054:1: rule__PropertySelector__Group__0 : rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 ;
    public final void rule__PropertySelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3058:1: ( rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 )
            // InternalDSL.g:3059:2: rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1
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
    // InternalDSL.g:3066:1: rule__PropertySelector__Group__0__Impl : ( 'node.property.' ) ;
    public final void rule__PropertySelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3070:1: ( ( 'node.property.' ) )
            // InternalDSL.g:3071:1: ( 'node.property.' )
            {
            // InternalDSL.g:3071:1: ( 'node.property.' )
            // InternalDSL.g:3072:2: 'node.property.'
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
    // InternalDSL.g:3081:1: rule__PropertySelector__Group__1 : rule__PropertySelector__Group__1__Impl ;
    public final void rule__PropertySelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3085:1: ( rule__PropertySelector__Group__1__Impl )
            // InternalDSL.g:3086:2: rule__PropertySelector__Group__1__Impl
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
    // InternalDSL.g:3092:1: rule__PropertySelector__Group__1__Impl : ( ( rule__PropertySelector__RefAssignment_1 ) ) ;
    public final void rule__PropertySelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3096:1: ( ( ( rule__PropertySelector__RefAssignment_1 ) ) )
            // InternalDSL.g:3097:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:3097:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            // InternalDSL.g:3098:2: ( rule__PropertySelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:3099:2: ( rule__PropertySelector__RefAssignment_1 )
            // InternalDSL.g:3099:3: rule__PropertySelector__RefAssignment_1
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
    // InternalDSL.g:3108:1: rule__PropertyClassSelector__Group__0 : rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 ;
    public final void rule__PropertyClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3112:1: ( rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 )
            // InternalDSL.g:3113:2: rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1
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
    // InternalDSL.g:3120:1: rule__PropertyClassSelector__Group__0__Impl : ( 'node.class.' ) ;
    public final void rule__PropertyClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3124:1: ( ( 'node.class.' ) )
            // InternalDSL.g:3125:1: ( 'node.class.' )
            {
            // InternalDSL.g:3125:1: ( 'node.class.' )
            // InternalDSL.g:3126:2: 'node.class.'
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
    // InternalDSL.g:3135:1: rule__PropertyClassSelector__Group__1 : rule__PropertyClassSelector__Group__1__Impl ;
    public final void rule__PropertyClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3139:1: ( rule__PropertyClassSelector__Group__1__Impl )
            // InternalDSL.g:3140:2: rule__PropertyClassSelector__Group__1__Impl
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
    // InternalDSL.g:3146:1: rule__PropertyClassSelector__Group__1__Impl : ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) ;
    public final void rule__PropertyClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3150:1: ( ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:3151:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:3151:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:3152:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:3153:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            // InternalDSL.g:3153:3: rule__PropertyClassSelector__RefAssignment_1
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
    // InternalDSL.g:3162:1: rule__NodeIdentitiySelector__Group_0__0 : rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1 ;
    public final void rule__NodeIdentitiySelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3166:1: ( rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1 )
            // InternalDSL.g:3167:2: rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1
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
    // InternalDSL.g:3174:1: rule__NodeIdentitiySelector__Group_0__0__Impl : ( 'node.name.' ) ;
    public final void rule__NodeIdentitiySelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3178:1: ( ( 'node.name.' ) )
            // InternalDSL.g:3179:1: ( 'node.name.' )
            {
            // InternalDSL.g:3179:1: ( 'node.name.' )
            // InternalDSL.g:3180:2: 'node.name.'
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
    // InternalDSL.g:3189:1: rule__NodeIdentitiySelector__Group_0__1 : rule__NodeIdentitiySelector__Group_0__1__Impl ;
    public final void rule__NodeIdentitiySelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3193:1: ( rule__NodeIdentitiySelector__Group_0__1__Impl )
            // InternalDSL.g:3194:2: rule__NodeIdentitiySelector__Group_0__1__Impl
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
    // InternalDSL.g:3200:1: rule__NodeIdentitiySelector__Group_0__1__Impl : ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3204:1: ( ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) ) )
            // InternalDSL.g:3205:1: ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) )
            {
            // InternalDSL.g:3205:1: ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) )
            // InternalDSL.g:3206:2: ( rule__NodeIdentitiySelector__NameAssignment_0_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNameAssignment_0_1()); 
            // InternalDSL.g:3207:2: ( rule__NodeIdentitiySelector__NameAssignment_0_1 )
            // InternalDSL.g:3207:3: rule__NodeIdentitiySelector__NameAssignment_0_1
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
    // InternalDSL.g:3216:1: rule__NodeIdentitiySelector__Group_1__0 : rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1 ;
    public final void rule__NodeIdentitiySelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3220:1: ( rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1 )
            // InternalDSL.g:3221:2: rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1
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
    // InternalDSL.g:3228:1: rule__NodeIdentitiySelector__Group_1__0__Impl : ( 'node.identity.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3232:1: ( ( 'node.identity.' ) )
            // InternalDSL.g:3233:1: ( 'node.identity.' )
            {
            // InternalDSL.g:3233:1: ( 'node.identity.' )
            // InternalDSL.g:3234:2: 'node.identity.'
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
    // InternalDSL.g:3243:1: rule__NodeIdentitiySelector__Group_1__1 : rule__NodeIdentitiySelector__Group_1__1__Impl rule__NodeIdentitiySelector__Group_1__2 ;
    public final void rule__NodeIdentitiySelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3247:1: ( rule__NodeIdentitiySelector__Group_1__1__Impl rule__NodeIdentitiySelector__Group_1__2 )
            // InternalDSL.g:3248:2: rule__NodeIdentitiySelector__Group_1__1__Impl rule__NodeIdentitiySelector__Group_1__2
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
    // InternalDSL.g:3255:1: rule__NodeIdentitiySelector__Group_1__1__Impl : ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3259:1: ( ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) ) )
            // InternalDSL.g:3260:1: ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) )
            {
            // InternalDSL.g:3260:1: ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 ) )
            // InternalDSL.g:3261:2: ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssignment_1_1()); 
            // InternalDSL.g:3262:2: ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1 )
            // InternalDSL.g:3262:3: rule__NodeIdentitiySelector__AssemblyAssignment_1_1
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
    // InternalDSL.g:3270:1: rule__NodeIdentitiySelector__Group_1__2 : rule__NodeIdentitiySelector__Group_1__2__Impl rule__NodeIdentitiySelector__Group_1__3 ;
    public final void rule__NodeIdentitiySelector__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3274:1: ( rule__NodeIdentitiySelector__Group_1__2__Impl rule__NodeIdentitiySelector__Group_1__3 )
            // InternalDSL.g:3275:2: rule__NodeIdentitiySelector__Group_1__2__Impl rule__NodeIdentitiySelector__Group_1__3
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
    // InternalDSL.g:3282:1: rule__NodeIdentitiySelector__Group_1__2__Impl : ( '.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3286:1: ( ( '.' ) )
            // InternalDSL.g:3287:1: ( '.' )
            {
            // InternalDSL.g:3287:1: ( '.' )
            // InternalDSL.g:3288:2: '.'
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
    // InternalDSL.g:3297:1: rule__NodeIdentitiySelector__Group_1__3 : rule__NodeIdentitiySelector__Group_1__3__Impl rule__NodeIdentitiySelector__Group_1__4 ;
    public final void rule__NodeIdentitiySelector__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3301:1: ( rule__NodeIdentitiySelector__Group_1__3__Impl rule__NodeIdentitiySelector__Group_1__4 )
            // InternalDSL.g:3302:2: rule__NodeIdentitiySelector__Group_1__3__Impl rule__NodeIdentitiySelector__Group_1__4
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
    // InternalDSL.g:3309:1: rule__NodeIdentitiySelector__Group_1__3__Impl : ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3313:1: ( ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) ) )
            // InternalDSL.g:3314:1: ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) )
            {
            // InternalDSL.g:3314:1: ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 ) )
            // InternalDSL.g:3315:2: ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getComponentAssignment_1_3()); 
            // InternalDSL.g:3316:2: ( rule__NodeIdentitiySelector__ComponentAssignment_1_3 )
            // InternalDSL.g:3316:3: rule__NodeIdentitiySelector__ComponentAssignment_1_3
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
    // InternalDSL.g:3324:1: rule__NodeIdentitiySelector__Group_1__4 : rule__NodeIdentitiySelector__Group_1__4__Impl rule__NodeIdentitiySelector__Group_1__5 ;
    public final void rule__NodeIdentitiySelector__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3328:1: ( rule__NodeIdentitiySelector__Group_1__4__Impl rule__NodeIdentitiySelector__Group_1__5 )
            // InternalDSL.g:3329:2: rule__NodeIdentitiySelector__Group_1__4__Impl rule__NodeIdentitiySelector__Group_1__5
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
    // InternalDSL.g:3336:1: rule__NodeIdentitiySelector__Group_1__4__Impl : ( '.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3340:1: ( ( '.' ) )
            // InternalDSL.g:3341:1: ( '.' )
            {
            // InternalDSL.g:3341:1: ( '.' )
            // InternalDSL.g:3342:2: '.'
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
    // InternalDSL.g:3351:1: rule__NodeIdentitiySelector__Group_1__5 : rule__NodeIdentitiySelector__Group_1__5__Impl ;
    public final void rule__NodeIdentitiySelector__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3355:1: ( rule__NodeIdentitiySelector__Group_1__5__Impl )
            // InternalDSL.g:3356:2: rule__NodeIdentitiySelector__Group_1__5__Impl
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
    // InternalDSL.g:3362:1: rule__NodeIdentitiySelector__Group_1__5__Impl : ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3366:1: ( ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) ) )
            // InternalDSL.g:3367:1: ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) )
            {
            // InternalDSL.g:3367:1: ( ( rule__NodeIdentitiySelector__SeffAssignment_1_5 ) )
            // InternalDSL.g:3368:2: ( rule__NodeIdentitiySelector__SeffAssignment_1_5 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getSeffAssignment_1_5()); 
            // InternalDSL.g:3369:2: ( rule__NodeIdentitiySelector__SeffAssignment_1_5 )
            // InternalDSL.g:3369:3: rule__NodeIdentitiySelector__SeffAssignment_1_5
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
    // InternalDSL.g:3378:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3382:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalDSL.g:3383:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalDSL.g:3390:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__ModalityAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3394:1: ( ( ( rule__Statement__ModalityAssignment_0 ) ) )
            // InternalDSL.g:3395:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            {
            // InternalDSL.g:3395:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            // InternalDSL.g:3396:2: ( rule__Statement__ModalityAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getModalityAssignment_0()); 
            // InternalDSL.g:3397:2: ( rule__Statement__ModalityAssignment_0 )
            // InternalDSL.g:3397:3: rule__Statement__ModalityAssignment_0
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
    // InternalDSL.g:3405:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3409:1: ( rule__Statement__Group__1__Impl )
            // InternalDSL.g:3410:2: rule__Statement__Group__1__Impl
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
    // InternalDSL.g:3416:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__TypeAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3420:1: ( ( ( rule__Statement__TypeAssignment_1 ) ) )
            // InternalDSL.g:3421:1: ( ( rule__Statement__TypeAssignment_1 ) )
            {
            // InternalDSL.g:3421:1: ( ( rule__Statement__TypeAssignment_1 ) )
            // InternalDSL.g:3422:2: ( rule__Statement__TypeAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_1()); 
            // InternalDSL.g:3423:2: ( rule__Statement__TypeAssignment_1 )
            // InternalDSL.g:3423:3: rule__Statement__TypeAssignment_1
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
    // InternalDSL.g:3432:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3436:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalDSL.g:3437:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalDSL.g:3444:1: rule__Condition__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3448:1: ( ( 'WHERE' ) )
            // InternalDSL.g:3449:1: ( 'WHERE' )
            {
            // InternalDSL.g:3449:1: ( 'WHERE' )
            // InternalDSL.g:3450:2: 'WHERE'
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
    // InternalDSL.g:3459:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3463:1: ( rule__Condition__Group__1__Impl )
            // InternalDSL.g:3464:2: rule__Condition__Group__1__Impl
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
    // InternalDSL.g:3470:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperationAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3474:1: ( ( ( rule__Condition__OperationAssignment_1 ) ) )
            // InternalDSL.g:3475:1: ( ( rule__Condition__OperationAssignment_1 ) )
            {
            // InternalDSL.g:3475:1: ( ( rule__Condition__OperationAssignment_1 ) )
            // InternalDSL.g:3476:2: ( rule__Condition__OperationAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperationAssignment_1()); 
            // InternalDSL.g:3477:2: ( rule__Condition__OperationAssignment_1 )
            // InternalDSL.g:3477:3: rule__Condition__OperationAssignment_1
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


    // $ANTLR start "rule__LogicalOrOperation__Group__0"
    // InternalDSL.g:3486:1: rule__LogicalOrOperation__Group__0 : rule__LogicalOrOperation__Group__0__Impl rule__LogicalOrOperation__Group__1 ;
    public final void rule__LogicalOrOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3490:1: ( rule__LogicalOrOperation__Group__0__Impl rule__LogicalOrOperation__Group__1 )
            // InternalDSL.g:3491:2: rule__LogicalOrOperation__Group__0__Impl rule__LogicalOrOperation__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__LogicalOrOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group__0"


    // $ANTLR start "rule__LogicalOrOperation__Group__0__Impl"
    // InternalDSL.g:3498:1: rule__LogicalOrOperation__Group__0__Impl : ( ruleLogicalAndOperation ) ;
    public final void rule__LogicalOrOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3502:1: ( ( ruleLogicalAndOperation ) )
            // InternalDSL.g:3503:1: ( ruleLogicalAndOperation )
            {
            // InternalDSL.g:3503:1: ( ruleLogicalAndOperation )
            // InternalDSL.g:3504:2: ruleLogicalAndOperation
            {
             before(grammarAccess.getLogicalOrOperationAccess().getLogicalAndOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalAndOperation();

            state._fsp--;

             after(grammarAccess.getLogicalOrOperationAccess().getLogicalAndOperationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group__0__Impl"


    // $ANTLR start "rule__LogicalOrOperation__Group__1"
    // InternalDSL.g:3513:1: rule__LogicalOrOperation__Group__1 : rule__LogicalOrOperation__Group__1__Impl ;
    public final void rule__LogicalOrOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3517:1: ( rule__LogicalOrOperation__Group__1__Impl )
            // InternalDSL.g:3518:2: rule__LogicalOrOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group__1"


    // $ANTLR start "rule__LogicalOrOperation__Group__1__Impl"
    // InternalDSL.g:3524:1: rule__LogicalOrOperation__Group__1__Impl : ( ( rule__LogicalOrOperation__Group_1__0 )* ) ;
    public final void rule__LogicalOrOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3528:1: ( ( ( rule__LogicalOrOperation__Group_1__0 )* ) )
            // InternalDSL.g:3529:1: ( ( rule__LogicalOrOperation__Group_1__0 )* )
            {
            // InternalDSL.g:3529:1: ( ( rule__LogicalOrOperation__Group_1__0 )* )
            // InternalDSL.g:3530:2: ( rule__LogicalOrOperation__Group_1__0 )*
            {
             before(grammarAccess.getLogicalOrOperationAccess().getGroup_1()); 
            // InternalDSL.g:3531:2: ( rule__LogicalOrOperation__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDSL.g:3531:3: rule__LogicalOrOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__LogicalOrOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getLogicalOrOperationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group__1__Impl"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__0"
    // InternalDSL.g:3540:1: rule__LogicalOrOperation__Group_1__0 : rule__LogicalOrOperation__Group_1__0__Impl rule__LogicalOrOperation__Group_1__1 ;
    public final void rule__LogicalOrOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3544:1: ( rule__LogicalOrOperation__Group_1__0__Impl rule__LogicalOrOperation__Group_1__1 )
            // InternalDSL.g:3545:2: rule__LogicalOrOperation__Group_1__0__Impl rule__LogicalOrOperation__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__LogicalOrOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group_1__0"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__0__Impl"
    // InternalDSL.g:3552:1: rule__LogicalOrOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3556:1: ( ( () ) )
            // InternalDSL.g:3557:1: ( () )
            {
            // InternalDSL.g:3557:1: ( () )
            // InternalDSL.g:3558:2: ()
            {
             before(grammarAccess.getLogicalOrOperationAccess().getLogicalOrOperationLeftAction_1_0()); 
            // InternalDSL.g:3559:2: ()
            // InternalDSL.g:3559:3: 
            {
            }

             after(grammarAccess.getLogicalOrOperationAccess().getLogicalOrOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__1"
    // InternalDSL.g:3567:1: rule__LogicalOrOperation__Group_1__1 : rule__LogicalOrOperation__Group_1__1__Impl rule__LogicalOrOperation__Group_1__2 ;
    public final void rule__LogicalOrOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3571:1: ( rule__LogicalOrOperation__Group_1__1__Impl rule__LogicalOrOperation__Group_1__2 )
            // InternalDSL.g:3572:2: rule__LogicalOrOperation__Group_1__1__Impl rule__LogicalOrOperation__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__LogicalOrOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group_1__1"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__1__Impl"
    // InternalDSL.g:3579:1: rule__LogicalOrOperation__Group_1__1__Impl : ( '|' ) ;
    public final void rule__LogicalOrOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3583:1: ( ( '|' ) )
            // InternalDSL.g:3584:1: ( '|' )
            {
            // InternalDSL.g:3584:1: ( '|' )
            // InternalDSL.g:3585:2: '|'
            {
             before(grammarAccess.getLogicalOrOperationAccess().getVerticalLineKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLogicalOrOperationAccess().getVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__2"
    // InternalDSL.g:3594:1: rule__LogicalOrOperation__Group_1__2 : rule__LogicalOrOperation__Group_1__2__Impl ;
    public final void rule__LogicalOrOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3598:1: ( rule__LogicalOrOperation__Group_1__2__Impl )
            // InternalDSL.g:3599:2: rule__LogicalOrOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group_1__2"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__2__Impl"
    // InternalDSL.g:3605:1: rule__LogicalOrOperation__Group_1__2__Impl : ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) ) ;
    public final void rule__LogicalOrOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3609:1: ( ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) ) )
            // InternalDSL.g:3610:1: ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:3610:1: ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) )
            // InternalDSL.g:3611:2: ( rule__LogicalOrOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getLogicalOrOperationAccess().getRightAssignment_1_2()); 
            // InternalDSL.g:3612:2: ( rule__LogicalOrOperation__RightAssignment_1_2 )
            // InternalDSL.g:3612:3: rule__LogicalOrOperation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrOperationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group_1__2__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group__0"
    // InternalDSL.g:3621:1: rule__LogicalAndOperation__Group__0 : rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1 ;
    public final void rule__LogicalAndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3625:1: ( rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1 )
            // InternalDSL.g:3626:2: rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDSL.g:3633:1: rule__LogicalAndOperation__Group__0__Impl : ( ruleLogicalNegationOperation ) ;
    public final void rule__LogicalAndOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3637:1: ( ( ruleLogicalNegationOperation ) )
            // InternalDSL.g:3638:1: ( ruleLogicalNegationOperation )
            {
            // InternalDSL.g:3638:1: ( ruleLogicalNegationOperation )
            // InternalDSL.g:3639:2: ruleLogicalNegationOperation
            {
             before(grammarAccess.getLogicalAndOperationAccess().getLogicalNegationOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalNegationOperation();

            state._fsp--;

             after(grammarAccess.getLogicalAndOperationAccess().getLogicalNegationOperationParserRuleCall_0()); 

            }


            }

        }
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
    // InternalDSL.g:3648:1: rule__LogicalAndOperation__Group__1 : rule__LogicalAndOperation__Group__1__Impl ;
    public final void rule__LogicalAndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3652:1: ( rule__LogicalAndOperation__Group__1__Impl )
            // InternalDSL.g:3653:2: rule__LogicalAndOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalDSL.g:3659:1: rule__LogicalAndOperation__Group__1__Impl : ( ( rule__LogicalAndOperation__Group_1__0 )* ) ;
    public final void rule__LogicalAndOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3663:1: ( ( ( rule__LogicalAndOperation__Group_1__0 )* ) )
            // InternalDSL.g:3664:1: ( ( rule__LogicalAndOperation__Group_1__0 )* )
            {
            // InternalDSL.g:3664:1: ( ( rule__LogicalAndOperation__Group_1__0 )* )
            // InternalDSL.g:3665:2: ( rule__LogicalAndOperation__Group_1__0 )*
            {
             before(grammarAccess.getLogicalAndOperationAccess().getGroup_1()); 
            // InternalDSL.g:3666:2: ( rule__LogicalAndOperation__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==28) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDSL.g:3666:3: rule__LogicalAndOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__LogicalAndOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getLogicalAndOperationAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__LogicalAndOperation__Group_1__0"
    // InternalDSL.g:3675:1: rule__LogicalAndOperation__Group_1__0 : rule__LogicalAndOperation__Group_1__0__Impl rule__LogicalAndOperation__Group_1__1 ;
    public final void rule__LogicalAndOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3679:1: ( rule__LogicalAndOperation__Group_1__0__Impl rule__LogicalAndOperation__Group_1__1 )
            // InternalDSL.g:3680:2: rule__LogicalAndOperation__Group_1__0__Impl rule__LogicalAndOperation__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__LogicalAndOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group_1__0"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__0__Impl"
    // InternalDSL.g:3687:1: rule__LogicalAndOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3691:1: ( ( () ) )
            // InternalDSL.g:3692:1: ( () )
            {
            // InternalDSL.g:3692:1: ( () )
            // InternalDSL.g:3693:2: ()
            {
             before(grammarAccess.getLogicalAndOperationAccess().getLogicalAndOperationLeftAction_1_0()); 
            // InternalDSL.g:3694:2: ()
            // InternalDSL.g:3694:3: 
            {
            }

             after(grammarAccess.getLogicalAndOperationAccess().getLogicalAndOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__1"
    // InternalDSL.g:3702:1: rule__LogicalAndOperation__Group_1__1 : rule__LogicalAndOperation__Group_1__1__Impl rule__LogicalAndOperation__Group_1__2 ;
    public final void rule__LogicalAndOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3706:1: ( rule__LogicalAndOperation__Group_1__1__Impl rule__LogicalAndOperation__Group_1__2 )
            // InternalDSL.g:3707:2: rule__LogicalAndOperation__Group_1__1__Impl rule__LogicalAndOperation__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__LogicalAndOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group_1__1"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__1__Impl"
    // InternalDSL.g:3714:1: rule__LogicalAndOperation__Group_1__1__Impl : ( '&' ) ;
    public final void rule__LogicalAndOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3718:1: ( ( '&' ) )
            // InternalDSL.g:3719:1: ( '&' )
            {
            // InternalDSL.g:3719:1: ( '&' )
            // InternalDSL.g:3720:2: '&'
            {
             before(grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__2"
    // InternalDSL.g:3729:1: rule__LogicalAndOperation__Group_1__2 : rule__LogicalAndOperation__Group_1__2__Impl ;
    public final void rule__LogicalAndOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3733:1: ( rule__LogicalAndOperation__Group_1__2__Impl )
            // InternalDSL.g:3734:2: rule__LogicalAndOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group_1__2"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__2__Impl"
    // InternalDSL.g:3740:1: rule__LogicalAndOperation__Group_1__2__Impl : ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) ) ;
    public final void rule__LogicalAndOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3744:1: ( ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) ) )
            // InternalDSL.g:3745:1: ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:3745:1: ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) )
            // InternalDSL.g:3746:2: ( rule__LogicalAndOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getLogicalAndOperationAccess().getRightAssignment_1_2()); 
            // InternalDSL.g:3747:2: ( rule__LogicalAndOperation__RightAssignment_1_2 )
            // InternalDSL.g:3747:3: rule__LogicalAndOperation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndOperationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group_1__2__Impl"


    // $ANTLR start "rule__LogicalNegationOperation__Group_1__0"
    // InternalDSL.g:3756:1: rule__LogicalNegationOperation__Group_1__0 : rule__LogicalNegationOperation__Group_1__0__Impl rule__LogicalNegationOperation__Group_1__1 ;
    public final void rule__LogicalNegationOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3760:1: ( rule__LogicalNegationOperation__Group_1__0__Impl rule__LogicalNegationOperation__Group_1__1 )
            // InternalDSL.g:3761:2: rule__LogicalNegationOperation__Group_1__0__Impl rule__LogicalNegationOperation__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__LogicalNegationOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalNegationOperation__Group_1__0"


    // $ANTLR start "rule__LogicalNegationOperation__Group_1__0__Impl"
    // InternalDSL.g:3768:1: rule__LogicalNegationOperation__Group_1__0__Impl : ( '!' ) ;
    public final void rule__LogicalNegationOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3772:1: ( ( '!' ) )
            // InternalDSL.g:3773:1: ( '!' )
            {
            // InternalDSL.g:3773:1: ( '!' )
            // InternalDSL.g:3774:2: '!'
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalNegationOperation__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalNegationOperation__Group_1__1"
    // InternalDSL.g:3783:1: rule__LogicalNegationOperation__Group_1__1 : rule__LogicalNegationOperation__Group_1__1__Impl ;
    public final void rule__LogicalNegationOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3787:1: ( rule__LogicalNegationOperation__Group_1__1__Impl )
            // InternalDSL.g:3788:2: rule__LogicalNegationOperation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalNegationOperation__Group_1__1"


    // $ANTLR start "rule__LogicalNegationOperation__Group_1__1__Impl"
    // InternalDSL.g:3794:1: rule__LogicalNegationOperation__Group_1__1__Impl : ( ( rule__LogicalNegationOperation__ValueAssignment_1_1 ) ) ;
    public final void rule__LogicalNegationOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3798:1: ( ( ( rule__LogicalNegationOperation__ValueAssignment_1_1 ) ) )
            // InternalDSL.g:3799:1: ( ( rule__LogicalNegationOperation__ValueAssignment_1_1 ) )
            {
            // InternalDSL.g:3799:1: ( ( rule__LogicalNegationOperation__ValueAssignment_1_1 ) )
            // InternalDSL.g:3800:2: ( rule__LogicalNegationOperation__ValueAssignment_1_1 )
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getValueAssignment_1_1()); 
            // InternalDSL.g:3801:2: ( rule__LogicalNegationOperation__ValueAssignment_1_1 )
            // InternalDSL.g:3801:3: rule__LogicalNegationOperation__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalNegationOperationAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalNegationOperation__Group_1__1__Impl"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__0"
    // InternalDSL.g:3810:1: rule__EncapsulatedLogicalOperation__Group_1__0 : rule__EncapsulatedLogicalOperation__Group_1__0__Impl rule__EncapsulatedLogicalOperation__Group_1__1 ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3814:1: ( rule__EncapsulatedLogicalOperation__Group_1__0__Impl rule__EncapsulatedLogicalOperation__Group_1__1 )
            // InternalDSL.g:3815:2: rule__EncapsulatedLogicalOperation__Group_1__0__Impl rule__EncapsulatedLogicalOperation__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__EncapsulatedLogicalOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncapsulatedLogicalOperation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__0"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__0__Impl"
    // InternalDSL.g:3822:1: rule__EncapsulatedLogicalOperation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3826:1: ( ( '(' ) )
            // InternalDSL.g:3827:1: ( '(' )
            {
            // InternalDSL.g:3827:1: ( '(' )
            // InternalDSL.g:3828:2: '('
            {
             before(grammarAccess.getEncapsulatedLogicalOperationAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEncapsulatedLogicalOperationAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__0__Impl"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__1"
    // InternalDSL.g:3837:1: rule__EncapsulatedLogicalOperation__Group_1__1 : rule__EncapsulatedLogicalOperation__Group_1__1__Impl rule__EncapsulatedLogicalOperation__Group_1__2 ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3841:1: ( rule__EncapsulatedLogicalOperation__Group_1__1__Impl rule__EncapsulatedLogicalOperation__Group_1__2 )
            // InternalDSL.g:3842:2: rule__EncapsulatedLogicalOperation__Group_1__1__Impl rule__EncapsulatedLogicalOperation__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__EncapsulatedLogicalOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncapsulatedLogicalOperation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__1"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__1__Impl"
    // InternalDSL.g:3849:1: rule__EncapsulatedLogicalOperation__Group_1__1__Impl : ( ruleLogicalOrOperation ) ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3853:1: ( ( ruleLogicalOrOperation ) )
            // InternalDSL.g:3854:1: ( ruleLogicalOrOperation )
            {
            // InternalDSL.g:3854:1: ( ruleLogicalOrOperation )
            // InternalDSL.g:3855:2: ruleLogicalOrOperation
            {
             before(grammarAccess.getEncapsulatedLogicalOperationAccess().getLogicalOrOperationParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleLogicalOrOperation();

            state._fsp--;

             after(grammarAccess.getEncapsulatedLogicalOperationAccess().getLogicalOrOperationParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__1__Impl"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__2"
    // InternalDSL.g:3864:1: rule__EncapsulatedLogicalOperation__Group_1__2 : rule__EncapsulatedLogicalOperation__Group_1__2__Impl ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3868:1: ( rule__EncapsulatedLogicalOperation__Group_1__2__Impl )
            // InternalDSL.g:3869:2: rule__EncapsulatedLogicalOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EncapsulatedLogicalOperation__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__2"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__2__Impl"
    // InternalDSL.g:3875:1: rule__EncapsulatedLogicalOperation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3879:1: ( ( ')' ) )
            // InternalDSL.g:3880:1: ( ')' )
            {
            // InternalDSL.g:3880:1: ( ')' )
            // InternalDSL.g:3881:2: ')'
            {
             before(grammarAccess.getEncapsulatedLogicalOperationAccess().getRightParenthesisKeyword_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEncapsulatedLogicalOperationAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__2__Impl"


    // $ANTLR start "rule__VariableEqualityOperation__Group__0"
    // InternalDSL.g:3891:1: rule__VariableEqualityOperation__Group__0 : rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1 ;
    public final void rule__VariableEqualityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3895:1: ( rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1 )
            // InternalDSL.g:3896:2: rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDSL.g:3903:1: rule__VariableEqualityOperation__Group__0__Impl : ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) ) ;
    public final void rule__VariableEqualityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3907:1: ( ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) ) )
            // InternalDSL.g:3908:1: ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) )
            {
            // InternalDSL.g:3908:1: ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) )
            // InternalDSL.g:3909:2: ( rule__VariableEqualityOperation__LeftAssignment_0 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getLeftAssignment_0()); 
            // InternalDSL.g:3910:2: ( rule__VariableEqualityOperation__LeftAssignment_0 )
            // InternalDSL.g:3910:3: rule__VariableEqualityOperation__LeftAssignment_0
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
    // InternalDSL.g:3918:1: rule__VariableEqualityOperation__Group__1 : rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2 ;
    public final void rule__VariableEqualityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3922:1: ( rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2 )
            // InternalDSL.g:3923:2: rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2
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
    // InternalDSL.g:3930:1: rule__VariableEqualityOperation__Group__1__Impl : ( '==' ) ;
    public final void rule__VariableEqualityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3934:1: ( ( '==' ) )
            // InternalDSL.g:3935:1: ( '==' )
            {
            // InternalDSL.g:3935:1: ( '==' )
            // InternalDSL.g:3936:2: '=='
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDSL.g:3945:1: rule__VariableEqualityOperation__Group__2 : rule__VariableEqualityOperation__Group__2__Impl ;
    public final void rule__VariableEqualityOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3949:1: ( rule__VariableEqualityOperation__Group__2__Impl )
            // InternalDSL.g:3950:2: rule__VariableEqualityOperation__Group__2__Impl
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
    // InternalDSL.g:3956:1: rule__VariableEqualityOperation__Group__2__Impl : ( ( rule__VariableEqualityOperation__RightAssignment_2 ) ) ;
    public final void rule__VariableEqualityOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3960:1: ( ( ( rule__VariableEqualityOperation__RightAssignment_2 ) ) )
            // InternalDSL.g:3961:1: ( ( rule__VariableEqualityOperation__RightAssignment_2 ) )
            {
            // InternalDSL.g:3961:1: ( ( rule__VariableEqualityOperation__RightAssignment_2 ) )
            // InternalDSL.g:3962:2: ( rule__VariableEqualityOperation__RightAssignment_2 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getRightAssignment_2()); 
            // InternalDSL.g:3963:2: ( rule__VariableEqualityOperation__RightAssignment_2 )
            // InternalDSL.g:3963:3: rule__VariableEqualityOperation__RightAssignment_2
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
    // InternalDSL.g:3972:1: rule__VariableInequalityOperation__Group__0 : rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1 ;
    public final void rule__VariableInequalityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3976:1: ( rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1 )
            // InternalDSL.g:3977:2: rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDSL.g:3984:1: rule__VariableInequalityOperation__Group__0__Impl : ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) ) ;
    public final void rule__VariableInequalityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3988:1: ( ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) ) )
            // InternalDSL.g:3989:1: ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) )
            {
            // InternalDSL.g:3989:1: ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) )
            // InternalDSL.g:3990:2: ( rule__VariableInequalityOperation__LeftAssignment_0 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getLeftAssignment_0()); 
            // InternalDSL.g:3991:2: ( rule__VariableInequalityOperation__LeftAssignment_0 )
            // InternalDSL.g:3991:3: rule__VariableInequalityOperation__LeftAssignment_0
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
    // InternalDSL.g:3999:1: rule__VariableInequalityOperation__Group__1 : rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2 ;
    public final void rule__VariableInequalityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4003:1: ( rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2 )
            // InternalDSL.g:4004:2: rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2
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
    // InternalDSL.g:4011:1: rule__VariableInequalityOperation__Group__1__Impl : ( '!=' ) ;
    public final void rule__VariableInequalityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4015:1: ( ( '!=' ) )
            // InternalDSL.g:4016:1: ( '!=' )
            {
            // InternalDSL.g:4016:1: ( '!=' )
            // InternalDSL.g:4017:2: '!='
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getExclamationMarkEqualsSignKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDSL.g:4026:1: rule__VariableInequalityOperation__Group__2 : rule__VariableInequalityOperation__Group__2__Impl ;
    public final void rule__VariableInequalityOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4030:1: ( rule__VariableInequalityOperation__Group__2__Impl )
            // InternalDSL.g:4031:2: rule__VariableInequalityOperation__Group__2__Impl
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
    // InternalDSL.g:4037:1: rule__VariableInequalityOperation__Group__2__Impl : ( ( rule__VariableInequalityOperation__RightAssignment_2 ) ) ;
    public final void rule__VariableInequalityOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4041:1: ( ( ( rule__VariableInequalityOperation__RightAssignment_2 ) ) )
            // InternalDSL.g:4042:1: ( ( rule__VariableInequalityOperation__RightAssignment_2 ) )
            {
            // InternalDSL.g:4042:1: ( ( rule__VariableInequalityOperation__RightAssignment_2 ) )
            // InternalDSL.g:4043:2: ( rule__VariableInequalityOperation__RightAssignment_2 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getRightAssignment_2()); 
            // InternalDSL.g:4044:2: ( rule__VariableInequalityOperation__RightAssignment_2 )
            // InternalDSL.g:4044:3: rule__VariableInequalityOperation__RightAssignment_2
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
    // InternalDSL.g:4053:1: rule__EmptySetOperation__Group__0 : rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1 ;
    public final void rule__EmptySetOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4057:1: ( rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1 )
            // InternalDSL.g:4058:2: rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDSL.g:4065:1: rule__EmptySetOperation__Group__0__Impl : ( 'isEmpty' ) ;
    public final void rule__EmptySetOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4069:1: ( ( 'isEmpty' ) )
            // InternalDSL.g:4070:1: ( 'isEmpty' )
            {
            // InternalDSL.g:4070:1: ( 'isEmpty' )
            // InternalDSL.g:4071:2: 'isEmpty'
            {
             before(grammarAccess.getEmptySetOperationAccess().getIsEmptyKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDSL.g:4080:1: rule__EmptySetOperation__Group__1 : rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2 ;
    public final void rule__EmptySetOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4084:1: ( rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2 )
            // InternalDSL.g:4085:2: rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4092:1: rule__EmptySetOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__EmptySetOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4096:1: ( ( '(' ) )
            // InternalDSL.g:4097:1: ( '(' )
            {
            // InternalDSL.g:4097:1: ( '(' )
            // InternalDSL.g:4098:2: '('
            {
             before(grammarAccess.getEmptySetOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEmptySetOperationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalDSL.g:4107:1: rule__EmptySetOperation__Group__2 : rule__EmptySetOperation__Group__2__Impl rule__EmptySetOperation__Group__3 ;
    public final void rule__EmptySetOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4111:1: ( rule__EmptySetOperation__Group__2__Impl rule__EmptySetOperation__Group__3 )
            // InternalDSL.g:4112:2: rule__EmptySetOperation__Group__2__Impl rule__EmptySetOperation__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__EmptySetOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__3();

            state._fsp--;


            }

        }
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
    // InternalDSL.g:4119:1: rule__EmptySetOperation__Group__2__Impl : ( ( rule__EmptySetOperation__ValueAssignment_2 ) ) ;
    public final void rule__EmptySetOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4123:1: ( ( ( rule__EmptySetOperation__ValueAssignment_2 ) ) )
            // InternalDSL.g:4124:1: ( ( rule__EmptySetOperation__ValueAssignment_2 ) )
            {
            // InternalDSL.g:4124:1: ( ( rule__EmptySetOperation__ValueAssignment_2 ) )
            // InternalDSL.g:4125:2: ( rule__EmptySetOperation__ValueAssignment_2 )
            {
             before(grammarAccess.getEmptySetOperationAccess().getValueAssignment_2()); 
            // InternalDSL.g:4126:2: ( rule__EmptySetOperation__ValueAssignment_2 )
            // InternalDSL.g:4126:3: rule__EmptySetOperation__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmptySetOperationAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__EmptySetOperation__Group__3"
    // InternalDSL.g:4134:1: rule__EmptySetOperation__Group__3 : rule__EmptySetOperation__Group__3__Impl ;
    public final void rule__EmptySetOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4138:1: ( rule__EmptySetOperation__Group__3__Impl )
            // InternalDSL.g:4139:2: rule__EmptySetOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptySetOperation__Group__3"


    // $ANTLR start "rule__EmptySetOperation__Group__3__Impl"
    // InternalDSL.g:4145:1: rule__EmptySetOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__EmptySetOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4149:1: ( ( ')' ) )
            // InternalDSL.g:4150:1: ( ')' )
            {
            // InternalDSL.g:4150:1: ( ')' )
            // InternalDSL.g:4151:2: ')'
            {
             before(grammarAccess.getEmptySetOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEmptySetOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptySetOperation__Group__3__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__0"
    // InternalDSL.g:4161:1: rule__IntersectionOperation__Group__0 : rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1 ;
    public final void rule__IntersectionOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4165:1: ( rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1 )
            // InternalDSL.g:4166:2: rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDSL.g:4173:1: rule__IntersectionOperation__Group__0__Impl : ( 'intersection' ) ;
    public final void rule__IntersectionOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4177:1: ( ( 'intersection' ) )
            // InternalDSL.g:4178:1: ( 'intersection' )
            {
            // InternalDSL.g:4178:1: ( 'intersection' )
            // InternalDSL.g:4179:2: 'intersection'
            {
             before(grammarAccess.getIntersectionOperationAccess().getIntersectionKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDSL.g:4188:1: rule__IntersectionOperation__Group__1 : rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2 ;
    public final void rule__IntersectionOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4192:1: ( rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2 )
            // InternalDSL.g:4193:2: rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4200:1: rule__IntersectionOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__IntersectionOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4204:1: ( ( '(' ) )
            // InternalDSL.g:4205:1: ( '(' )
            {
            // InternalDSL.g:4205:1: ( '(' )
            // InternalDSL.g:4206:2: '('
            {
             before(grammarAccess.getIntersectionOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIntersectionOperationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalDSL.g:4215:1: rule__IntersectionOperation__Group__2 : rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3 ;
    public final void rule__IntersectionOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4219:1: ( rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3 )
            // InternalDSL.g:4220:2: rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSL.g:4227:1: rule__IntersectionOperation__Group__2__Impl : ( ( rule__IntersectionOperation__LeftAssignment_2 ) ) ;
    public final void rule__IntersectionOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4231:1: ( ( ( rule__IntersectionOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4232:1: ( ( rule__IntersectionOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4232:1: ( ( rule__IntersectionOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4233:2: ( rule__IntersectionOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4234:2: ( rule__IntersectionOperation__LeftAssignment_2 )
            // InternalDSL.g:4234:3: rule__IntersectionOperation__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionOperationAccess().getLeftAssignment_2()); 

            }


            }

        }
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
    // InternalDSL.g:4242:1: rule__IntersectionOperation__Group__3 : rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4 ;
    public final void rule__IntersectionOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4246:1: ( rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4 )
            // InternalDSL.g:4247:2: rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4254:1: rule__IntersectionOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__IntersectionOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4258:1: ( ( ',' ) )
            // InternalDSL.g:4259:1: ( ',' )
            {
            // InternalDSL.g:4259:1: ( ',' )
            // InternalDSL.g:4260:2: ','
            {
             before(grammarAccess.getIntersectionOperationAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIntersectionOperationAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // InternalDSL.g:4269:1: rule__IntersectionOperation__Group__4 : rule__IntersectionOperation__Group__4__Impl rule__IntersectionOperation__Group__5 ;
    public final void rule__IntersectionOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4273:1: ( rule__IntersectionOperation__Group__4__Impl rule__IntersectionOperation__Group__5 )
            // InternalDSL.g:4274:2: rule__IntersectionOperation__Group__4__Impl rule__IntersectionOperation__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__IntersectionOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__5();

            state._fsp--;


            }

        }
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
    // InternalDSL.g:4281:1: rule__IntersectionOperation__Group__4__Impl : ( ( rule__IntersectionOperation__RightAssignment_4 ) ) ;
    public final void rule__IntersectionOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4285:1: ( ( ( rule__IntersectionOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4286:1: ( ( rule__IntersectionOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4286:1: ( ( rule__IntersectionOperation__RightAssignment_4 ) )
            // InternalDSL.g:4287:2: ( rule__IntersectionOperation__RightAssignment_4 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4288:2: ( rule__IntersectionOperation__RightAssignment_4 )
            // InternalDSL.g:4288:3: rule__IntersectionOperation__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionOperationAccess().getRightAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__IntersectionOperation__Group__5"
    // InternalDSL.g:4296:1: rule__IntersectionOperation__Group__5 : rule__IntersectionOperation__Group__5__Impl ;
    public final void rule__IntersectionOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4300:1: ( rule__IntersectionOperation__Group__5__Impl )
            // InternalDSL.g:4301:2: rule__IntersectionOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__Group__5"


    // $ANTLR start "rule__IntersectionOperation__Group__5__Impl"
    // InternalDSL.g:4307:1: rule__IntersectionOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__IntersectionOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4311:1: ( ( ')' ) )
            // InternalDSL.g:4312:1: ( ')' )
            {
            // InternalDSL.g:4312:1: ( ')' )
            // InternalDSL.g:4313:2: ')'
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIntersectionOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__Group__5__Impl"


    // $ANTLR start "rule__UnionOperation__Group__0"
    // InternalDSL.g:4323:1: rule__UnionOperation__Group__0 : rule__UnionOperation__Group__0__Impl rule__UnionOperation__Group__1 ;
    public final void rule__UnionOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4327:1: ( rule__UnionOperation__Group__0__Impl rule__UnionOperation__Group__1 )
            // InternalDSL.g:4328:2: rule__UnionOperation__Group__0__Impl rule__UnionOperation__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__UnionOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__0"


    // $ANTLR start "rule__UnionOperation__Group__0__Impl"
    // InternalDSL.g:4335:1: rule__UnionOperation__Group__0__Impl : ( 'union' ) ;
    public final void rule__UnionOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4339:1: ( ( 'union' ) )
            // InternalDSL.g:4340:1: ( 'union' )
            {
            // InternalDSL.g:4340:1: ( 'union' )
            // InternalDSL.g:4341:2: 'union'
            {
             before(grammarAccess.getUnionOperationAccess().getUnionKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUnionOperationAccess().getUnionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__0__Impl"


    // $ANTLR start "rule__UnionOperation__Group__1"
    // InternalDSL.g:4350:1: rule__UnionOperation__Group__1 : rule__UnionOperation__Group__1__Impl rule__UnionOperation__Group__2 ;
    public final void rule__UnionOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4354:1: ( rule__UnionOperation__Group__1__Impl rule__UnionOperation__Group__2 )
            // InternalDSL.g:4355:2: rule__UnionOperation__Group__1__Impl rule__UnionOperation__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__UnionOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__1"


    // $ANTLR start "rule__UnionOperation__Group__1__Impl"
    // InternalDSL.g:4362:1: rule__UnionOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__UnionOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4366:1: ( ( '(' ) )
            // InternalDSL.g:4367:1: ( '(' )
            {
            // InternalDSL.g:4367:1: ( '(' )
            // InternalDSL.g:4368:2: '('
            {
             before(grammarAccess.getUnionOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUnionOperationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__1__Impl"


    // $ANTLR start "rule__UnionOperation__Group__2"
    // InternalDSL.g:4377:1: rule__UnionOperation__Group__2 : rule__UnionOperation__Group__2__Impl rule__UnionOperation__Group__3 ;
    public final void rule__UnionOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4381:1: ( rule__UnionOperation__Group__2__Impl rule__UnionOperation__Group__3 )
            // InternalDSL.g:4382:2: rule__UnionOperation__Group__2__Impl rule__UnionOperation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__UnionOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__2"


    // $ANTLR start "rule__UnionOperation__Group__2__Impl"
    // InternalDSL.g:4389:1: rule__UnionOperation__Group__2__Impl : ( ( rule__UnionOperation__LeftAssignment_2 ) ) ;
    public final void rule__UnionOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4393:1: ( ( ( rule__UnionOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4394:1: ( ( rule__UnionOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4394:1: ( ( rule__UnionOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4395:2: ( rule__UnionOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getUnionOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4396:2: ( rule__UnionOperation__LeftAssignment_2 )
            // InternalDSL.g:4396:3: rule__UnionOperation__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnionOperation__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnionOperationAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__2__Impl"


    // $ANTLR start "rule__UnionOperation__Group__3"
    // InternalDSL.g:4404:1: rule__UnionOperation__Group__3 : rule__UnionOperation__Group__3__Impl rule__UnionOperation__Group__4 ;
    public final void rule__UnionOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4408:1: ( rule__UnionOperation__Group__3__Impl rule__UnionOperation__Group__4 )
            // InternalDSL.g:4409:2: rule__UnionOperation__Group__3__Impl rule__UnionOperation__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__UnionOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__3"


    // $ANTLR start "rule__UnionOperation__Group__3__Impl"
    // InternalDSL.g:4416:1: rule__UnionOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__UnionOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4420:1: ( ( ',' ) )
            // InternalDSL.g:4421:1: ( ',' )
            {
            // InternalDSL.g:4421:1: ( ',' )
            // InternalDSL.g:4422:2: ','
            {
             before(grammarAccess.getUnionOperationAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUnionOperationAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__3__Impl"


    // $ANTLR start "rule__UnionOperation__Group__4"
    // InternalDSL.g:4431:1: rule__UnionOperation__Group__4 : rule__UnionOperation__Group__4__Impl rule__UnionOperation__Group__5 ;
    public final void rule__UnionOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4435:1: ( rule__UnionOperation__Group__4__Impl rule__UnionOperation__Group__5 )
            // InternalDSL.g:4436:2: rule__UnionOperation__Group__4__Impl rule__UnionOperation__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__UnionOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__4"


    // $ANTLR start "rule__UnionOperation__Group__4__Impl"
    // InternalDSL.g:4443:1: rule__UnionOperation__Group__4__Impl : ( ( rule__UnionOperation__RightAssignment_4 ) ) ;
    public final void rule__UnionOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4447:1: ( ( ( rule__UnionOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4448:1: ( ( rule__UnionOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4448:1: ( ( rule__UnionOperation__RightAssignment_4 ) )
            // InternalDSL.g:4449:2: ( rule__UnionOperation__RightAssignment_4 )
            {
             before(grammarAccess.getUnionOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4450:2: ( rule__UnionOperation__RightAssignment_4 )
            // InternalDSL.g:4450:3: rule__UnionOperation__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UnionOperation__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUnionOperationAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__4__Impl"


    // $ANTLR start "rule__UnionOperation__Group__5"
    // InternalDSL.g:4458:1: rule__UnionOperation__Group__5 : rule__UnionOperation__Group__5__Impl ;
    public final void rule__UnionOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4462:1: ( rule__UnionOperation__Group__5__Impl )
            // InternalDSL.g:4463:2: rule__UnionOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__5"


    // $ANTLR start "rule__UnionOperation__Group__5__Impl"
    // InternalDSL.g:4469:1: rule__UnionOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__UnionOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4473:1: ( ( ')' ) )
            // InternalDSL.g:4474:1: ( ')' )
            {
            // InternalDSL.g:4474:1: ( ')' )
            // InternalDSL.g:4475:2: ')'
            {
             before(grammarAccess.getUnionOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getUnionOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__Group__5__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__0"
    // InternalDSL.g:4485:1: rule__SubtractOperation__Group__0 : rule__SubtractOperation__Group__0__Impl rule__SubtractOperation__Group__1 ;
    public final void rule__SubtractOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4489:1: ( rule__SubtractOperation__Group__0__Impl rule__SubtractOperation__Group__1 )
            // InternalDSL.g:4490:2: rule__SubtractOperation__Group__0__Impl rule__SubtractOperation__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__SubtractOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__0"


    // $ANTLR start "rule__SubtractOperation__Group__0__Impl"
    // InternalDSL.g:4497:1: rule__SubtractOperation__Group__0__Impl : ( 'subtract' ) ;
    public final void rule__SubtractOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4501:1: ( ( 'subtract' ) )
            // InternalDSL.g:4502:1: ( 'subtract' )
            {
            // InternalDSL.g:4502:1: ( 'subtract' )
            // InternalDSL.g:4503:2: 'subtract'
            {
             before(grammarAccess.getSubtractOperationAccess().getSubtractKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSubtractOperationAccess().getSubtractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__0__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__1"
    // InternalDSL.g:4512:1: rule__SubtractOperation__Group__1 : rule__SubtractOperation__Group__1__Impl rule__SubtractOperation__Group__2 ;
    public final void rule__SubtractOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4516:1: ( rule__SubtractOperation__Group__1__Impl rule__SubtractOperation__Group__2 )
            // InternalDSL.g:4517:2: rule__SubtractOperation__Group__1__Impl rule__SubtractOperation__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__SubtractOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__1"


    // $ANTLR start "rule__SubtractOperation__Group__1__Impl"
    // InternalDSL.g:4524:1: rule__SubtractOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__SubtractOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4528:1: ( ( '(' ) )
            // InternalDSL.g:4529:1: ( '(' )
            {
            // InternalDSL.g:4529:1: ( '(' )
            // InternalDSL.g:4530:2: '('
            {
             before(grammarAccess.getSubtractOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSubtractOperationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__1__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__2"
    // InternalDSL.g:4539:1: rule__SubtractOperation__Group__2 : rule__SubtractOperation__Group__2__Impl rule__SubtractOperation__Group__3 ;
    public final void rule__SubtractOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4543:1: ( rule__SubtractOperation__Group__2__Impl rule__SubtractOperation__Group__3 )
            // InternalDSL.g:4544:2: rule__SubtractOperation__Group__2__Impl rule__SubtractOperation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SubtractOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__2"


    // $ANTLR start "rule__SubtractOperation__Group__2__Impl"
    // InternalDSL.g:4551:1: rule__SubtractOperation__Group__2__Impl : ( ( rule__SubtractOperation__LeftAssignment_2 ) ) ;
    public final void rule__SubtractOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4555:1: ( ( ( rule__SubtractOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4556:1: ( ( rule__SubtractOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4556:1: ( ( rule__SubtractOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4557:2: ( rule__SubtractOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getSubtractOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4558:2: ( rule__SubtractOperation__LeftAssignment_2 )
            // InternalDSL.g:4558:3: rule__SubtractOperation__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubtractOperation__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubtractOperationAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__2__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__3"
    // InternalDSL.g:4566:1: rule__SubtractOperation__Group__3 : rule__SubtractOperation__Group__3__Impl rule__SubtractOperation__Group__4 ;
    public final void rule__SubtractOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4570:1: ( rule__SubtractOperation__Group__3__Impl rule__SubtractOperation__Group__4 )
            // InternalDSL.g:4571:2: rule__SubtractOperation__Group__3__Impl rule__SubtractOperation__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__SubtractOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__3"


    // $ANTLR start "rule__SubtractOperation__Group__3__Impl"
    // InternalDSL.g:4578:1: rule__SubtractOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__SubtractOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4582:1: ( ( ',' ) )
            // InternalDSL.g:4583:1: ( ',' )
            {
            // InternalDSL.g:4583:1: ( ',' )
            // InternalDSL.g:4584:2: ','
            {
             before(grammarAccess.getSubtractOperationAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubtractOperationAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__3__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__4"
    // InternalDSL.g:4593:1: rule__SubtractOperation__Group__4 : rule__SubtractOperation__Group__4__Impl rule__SubtractOperation__Group__5 ;
    public final void rule__SubtractOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4597:1: ( rule__SubtractOperation__Group__4__Impl rule__SubtractOperation__Group__5 )
            // InternalDSL.g:4598:2: rule__SubtractOperation__Group__4__Impl rule__SubtractOperation__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__SubtractOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__4"


    // $ANTLR start "rule__SubtractOperation__Group__4__Impl"
    // InternalDSL.g:4605:1: rule__SubtractOperation__Group__4__Impl : ( ( rule__SubtractOperation__RightAssignment_4 ) ) ;
    public final void rule__SubtractOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4609:1: ( ( ( rule__SubtractOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4610:1: ( ( rule__SubtractOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4610:1: ( ( rule__SubtractOperation__RightAssignment_4 ) )
            // InternalDSL.g:4611:2: ( rule__SubtractOperation__RightAssignment_4 )
            {
             before(grammarAccess.getSubtractOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4612:2: ( rule__SubtractOperation__RightAssignment_4 )
            // InternalDSL.g:4612:3: rule__SubtractOperation__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubtractOperation__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubtractOperationAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__4__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__5"
    // InternalDSL.g:4620:1: rule__SubtractOperation__Group__5 : rule__SubtractOperation__Group__5__Impl ;
    public final void rule__SubtractOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4624:1: ( rule__SubtractOperation__Group__5__Impl )
            // InternalDSL.g:4625:2: rule__SubtractOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__5"


    // $ANTLR start "rule__SubtractOperation__Group__5__Impl"
    // InternalDSL.g:4631:1: rule__SubtractOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SubtractOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4635:1: ( ( ')' ) )
            // InternalDSL.g:4636:1: ( ')' )
            {
            // InternalDSL.g:4636:1: ( ')' )
            // InternalDSL.g:4637:2: ')'
            {
             before(grammarAccess.getSubtractOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSubtractOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__Group__5__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__0"
    // InternalDSL.g:4647:1: rule__ElementOfOperation__Group__0 : rule__ElementOfOperation__Group__0__Impl rule__ElementOfOperation__Group__1 ;
    public final void rule__ElementOfOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4651:1: ( rule__ElementOfOperation__Group__0__Impl rule__ElementOfOperation__Group__1 )
            // InternalDSL.g:4652:2: rule__ElementOfOperation__Group__0__Impl rule__ElementOfOperation__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ElementOfOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__0"


    // $ANTLR start "rule__ElementOfOperation__Group__0__Impl"
    // InternalDSL.g:4659:1: rule__ElementOfOperation__Group__0__Impl : ( 'elementOf' ) ;
    public final void rule__ElementOfOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4663:1: ( ( 'elementOf' ) )
            // InternalDSL.g:4664:1: ( 'elementOf' )
            {
            // InternalDSL.g:4664:1: ( 'elementOf' )
            // InternalDSL.g:4665:2: 'elementOf'
            {
             before(grammarAccess.getElementOfOperationAccess().getElementOfKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getElementOfOperationAccess().getElementOfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__0__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__1"
    // InternalDSL.g:4674:1: rule__ElementOfOperation__Group__1 : rule__ElementOfOperation__Group__1__Impl rule__ElementOfOperation__Group__2 ;
    public final void rule__ElementOfOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4678:1: ( rule__ElementOfOperation__Group__1__Impl rule__ElementOfOperation__Group__2 )
            // InternalDSL.g:4679:2: rule__ElementOfOperation__Group__1__Impl rule__ElementOfOperation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ElementOfOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__1"


    // $ANTLR start "rule__ElementOfOperation__Group__1__Impl"
    // InternalDSL.g:4686:1: rule__ElementOfOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ElementOfOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4690:1: ( ( '(' ) )
            // InternalDSL.g:4691:1: ( '(' )
            {
            // InternalDSL.g:4691:1: ( '(' )
            // InternalDSL.g:4692:2: '('
            {
             before(grammarAccess.getElementOfOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getElementOfOperationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__1__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__2"
    // InternalDSL.g:4701:1: rule__ElementOfOperation__Group__2 : rule__ElementOfOperation__Group__2__Impl rule__ElementOfOperation__Group__3 ;
    public final void rule__ElementOfOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4705:1: ( rule__ElementOfOperation__Group__2__Impl rule__ElementOfOperation__Group__3 )
            // InternalDSL.g:4706:2: rule__ElementOfOperation__Group__2__Impl rule__ElementOfOperation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ElementOfOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__2"


    // $ANTLR start "rule__ElementOfOperation__Group__2__Impl"
    // InternalDSL.g:4713:1: rule__ElementOfOperation__Group__2__Impl : ( ( rule__ElementOfOperation__LeftAssignment_2 ) ) ;
    public final void rule__ElementOfOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4717:1: ( ( ( rule__ElementOfOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4718:1: ( ( rule__ElementOfOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4718:1: ( ( rule__ElementOfOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4719:2: ( rule__ElementOfOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getElementOfOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4720:2: ( rule__ElementOfOperation__LeftAssignment_2 )
            // InternalDSL.g:4720:3: rule__ElementOfOperation__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementOfOperationAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__2__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__3"
    // InternalDSL.g:4728:1: rule__ElementOfOperation__Group__3 : rule__ElementOfOperation__Group__3__Impl rule__ElementOfOperation__Group__4 ;
    public final void rule__ElementOfOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4732:1: ( rule__ElementOfOperation__Group__3__Impl rule__ElementOfOperation__Group__4 )
            // InternalDSL.g:4733:2: rule__ElementOfOperation__Group__3__Impl rule__ElementOfOperation__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ElementOfOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__3"


    // $ANTLR start "rule__ElementOfOperation__Group__3__Impl"
    // InternalDSL.g:4740:1: rule__ElementOfOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ElementOfOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4744:1: ( ( ',' ) )
            // InternalDSL.g:4745:1: ( ',' )
            {
            // InternalDSL.g:4745:1: ( ',' )
            // InternalDSL.g:4746:2: ','
            {
             before(grammarAccess.getElementOfOperationAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getElementOfOperationAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__3__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__4"
    // InternalDSL.g:4755:1: rule__ElementOfOperation__Group__4 : rule__ElementOfOperation__Group__4__Impl rule__ElementOfOperation__Group__5 ;
    public final void rule__ElementOfOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4759:1: ( rule__ElementOfOperation__Group__4__Impl rule__ElementOfOperation__Group__5 )
            // InternalDSL.g:4760:2: rule__ElementOfOperation__Group__4__Impl rule__ElementOfOperation__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__ElementOfOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__4"


    // $ANTLR start "rule__ElementOfOperation__Group__4__Impl"
    // InternalDSL.g:4767:1: rule__ElementOfOperation__Group__4__Impl : ( ( rule__ElementOfOperation__RightAssignment_4 ) ) ;
    public final void rule__ElementOfOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4771:1: ( ( ( rule__ElementOfOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4772:1: ( ( rule__ElementOfOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4772:1: ( ( rule__ElementOfOperation__RightAssignment_4 ) )
            // InternalDSL.g:4773:2: ( rule__ElementOfOperation__RightAssignment_4 )
            {
             before(grammarAccess.getElementOfOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4774:2: ( rule__ElementOfOperation__RightAssignment_4 )
            // InternalDSL.g:4774:3: rule__ElementOfOperation__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElementOfOperationAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__4__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__5"
    // InternalDSL.g:4782:1: rule__ElementOfOperation__Group__5 : rule__ElementOfOperation__Group__5__Impl ;
    public final void rule__ElementOfOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4786:1: ( rule__ElementOfOperation__Group__5__Impl )
            // InternalDSL.g:4787:2: rule__ElementOfOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__5"


    // $ANTLR start "rule__ElementOfOperation__Group__5__Impl"
    // InternalDSL.g:4793:1: rule__ElementOfOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ElementOfOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4797:1: ( ( ')' ) )
            // InternalDSL.g:4798:1: ( ')' )
            {
            // InternalDSL.g:4798:1: ( ')' )
            // InternalDSL.g:4799:2: ')'
            {
             before(grammarAccess.getElementOfOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getElementOfOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__Group__5__Impl"


    // $ANTLR start "rule__CreateSetOperation__Group__0"
    // InternalDSL.g:4809:1: rule__CreateSetOperation__Group__0 : rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1 ;
    public final void rule__CreateSetOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4813:1: ( rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1 )
            // InternalDSL.g:4814:2: rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1
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
    // InternalDSL.g:4821:1: rule__CreateSetOperation__Group__0__Impl : ( '{' ) ;
    public final void rule__CreateSetOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4825:1: ( ( '{' ) )
            // InternalDSL.g:4826:1: ( '{' )
            {
            // InternalDSL.g:4826:1: ( '{' )
            // InternalDSL.g:4827:2: '{'
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
    // InternalDSL.g:4836:1: rule__CreateSetOperation__Group__1 : rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2 ;
    public final void rule__CreateSetOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4840:1: ( rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2 )
            // InternalDSL.g:4841:2: rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2
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
    // InternalDSL.g:4848:1: rule__CreateSetOperation__Group__1__Impl : ( ( rule__CreateSetOperation__ValueAssignment_1 ) ) ;
    public final void rule__CreateSetOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4852:1: ( ( ( rule__CreateSetOperation__ValueAssignment_1 ) ) )
            // InternalDSL.g:4853:1: ( ( rule__CreateSetOperation__ValueAssignment_1 ) )
            {
            // InternalDSL.g:4853:1: ( ( rule__CreateSetOperation__ValueAssignment_1 ) )
            // InternalDSL.g:4854:2: ( rule__CreateSetOperation__ValueAssignment_1 )
            {
             before(grammarAccess.getCreateSetOperationAccess().getValueAssignment_1()); 
            // InternalDSL.g:4855:2: ( rule__CreateSetOperation__ValueAssignment_1 )
            // InternalDSL.g:4855:3: rule__CreateSetOperation__ValueAssignment_1
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
    // InternalDSL.g:4863:1: rule__CreateSetOperation__Group__2 : rule__CreateSetOperation__Group__2__Impl ;
    public final void rule__CreateSetOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4867:1: ( rule__CreateSetOperation__Group__2__Impl )
            // InternalDSL.g:4868:2: rule__CreateSetOperation__Group__2__Impl
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
    // InternalDSL.g:4874:1: rule__CreateSetOperation__Group__2__Impl : ( '}' ) ;
    public final void rule__CreateSetOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4878:1: ( ( '}' ) )
            // InternalDSL.g:4879:1: ( '}' )
            {
            // InternalDSL.g:4879:1: ( '}' )
            // InternalDSL.g:4880:2: '}'
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
    // InternalDSL.g:4890:1: rule__Model__TargetModelTypeAssignment_0 : ( ruleTargetModelTypeDef ) ;
    public final void rule__Model__TargetModelTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4894:1: ( ( ruleTargetModelTypeDef ) )
            // InternalDSL.g:4895:2: ( ruleTargetModelTypeDef )
            {
            // InternalDSL.g:4895:2: ( ruleTargetModelTypeDef )
            // InternalDSL.g:4896:3: ruleTargetModelTypeDef
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
    // InternalDSL.g:4905:1: rule__Model__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4909:1: ( ( ruleAbstractElement ) )
            // InternalDSL.g:4910:2: ( ruleAbstractElement )
            {
            // InternalDSL.g:4910:2: ( ruleAbstractElement )
            // InternalDSL.g:4911:3: ruleAbstractElement
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
    // InternalDSL.g:4920:1: rule__TargetModelTypeDef__TypeAssignment_1 : ( ruleTargetModelType ) ;
    public final void rule__TargetModelTypeDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4924:1: ( ( ruleTargetModelType ) )
            // InternalDSL.g:4925:2: ( ruleTargetModelType )
            {
            // InternalDSL.g:4925:2: ( ruleTargetModelType )
            // InternalDSL.g:4926:3: ruleTargetModelType
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
    // InternalDSL.g:4935:1: rule__TargetModelTypeDef__TypeContainerAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__TypeContainerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4939:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4940:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4940:2: ( ( RULE_ID ) )
            // InternalDSL.g:4941:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerCharacteristicTypeContainerCrossReference_2_1_0()); 
            // InternalDSL.g:4942:3: ( RULE_ID )
            // InternalDSL.g:4943:4: RULE_ID
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
    // InternalDSL.g:4954:1: rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4958:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4959:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4959:2: ( ( RULE_ID ) )
            // InternalDSL.g:4960:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationCrossReference_2_2_1_0()); 
            // InternalDSL.g:4961:3: ( RULE_ID )
            // InternalDSL.g:4962:4: RULE_ID
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
    // InternalDSL.g:4973:1: rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__UsageModelAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4977:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4978:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4978:2: ( ( RULE_ID ) )
            // InternalDSL.g:4979:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelCrossReference_2_2_3_0()); 
            // InternalDSL.g:4980:3: ( RULE_ID )
            // InternalDSL.g:4981:4: RULE_ID
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
    // InternalDSL.g:4992:1: rule__CharacteristicType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4996:1: ( ( RULE_ID ) )
            // InternalDSL.g:4997:2: ( RULE_ID )
            {
            // InternalDSL.g:4997:2: ( RULE_ID )
            // InternalDSL.g:4998:3: RULE_ID
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
    // InternalDSL.g:5007:1: rule__CharacteristicType__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicType__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5011:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5012:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5012:2: ( ( RULE_ID ) )
            // InternalDSL.g:5013:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeCrossReference_3_0()); 
            // InternalDSL.g:5014:3: ( RULE_ID )
            // InternalDSL.g:5015:4: RULE_ID
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
    // InternalDSL.g:5026:1: rule__CharacteristicClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5030:1: ( ( RULE_ID ) )
            // InternalDSL.g:5031:2: ( RULE_ID )
            {
            // InternalDSL.g:5031:2: ( RULE_ID )
            // InternalDSL.g:5032:3: RULE_ID
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
    // InternalDSL.g:5041:1: rule__CharacteristicClass__MembersAssignment_3 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5045:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:5046:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:5046:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:5047:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:5056:1: rule__CharacteristicClass__MembersAssignment_4_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5060:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:5061:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:5061:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:5062:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:5071:1: rule__CharacteristicTypeSelector__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5075:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5076:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5076:2: ( ( RULE_ID ) )
            // InternalDSL.g:5077:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0()); 
            // InternalDSL.g:5078:3: ( RULE_ID )
            // InternalDSL.g:5079:4: RULE_ID
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
    // InternalDSL.g:5090:1: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 : ( ( '!' ) ) ;
    public final void rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5094:1: ( ( ( '!' ) ) )
            // InternalDSL.g:5095:2: ( ( '!' ) )
            {
            // InternalDSL.g:5095:2: ( ( '!' ) )
            // InternalDSL.g:5096:3: ( '!' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            // InternalDSL.g:5097:3: ( '!' )
            // InternalDSL.g:5098:4: '!'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDSL.g:5109:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5113:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5114:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5114:2: ( ( RULE_ID ) )
            // InternalDSL.g:5115:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_0_1_0()); 
            // InternalDSL.g:5116:3: ( RULE_ID )
            // InternalDSL.g:5117:4: RULE_ID
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
    // InternalDSL.g:5128:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5132:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5133:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5133:2: ( ( RULE_ID ) )
            // InternalDSL.g:5134:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_1_0()); 
            // InternalDSL.g:5135:3: ( RULE_ID )
            // InternalDSL.g:5136:4: RULE_ID
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
    // InternalDSL.g:5147:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5151:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5152:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5152:2: ( ( RULE_ID ) )
            // InternalDSL.g:5153:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_2_1_0()); 
            // InternalDSL.g:5154:3: ( RULE_ID )
            // InternalDSL.g:5155:4: RULE_ID
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
    // InternalDSL.g:5166:1: rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 : ( ( '$' ) ) ;
    public final void rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5170:1: ( ( ( '$' ) ) )
            // InternalDSL.g:5171:2: ( ( '$' ) )
            {
            // InternalDSL.g:5171:2: ( ( '$' ) )
            // InternalDSL.g:5172:3: ( '$' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 
            // InternalDSL.g:5173:3: ( '$' )
            // InternalDSL.g:5174:4: '$'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalDSL.g:5185:1: rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 : ( ruleCharacteristicVariableType ) ;
    public final void rule__CharacteristicTypeSelector__VariableAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5189:1: ( ( ruleCharacteristicVariableType ) )
            // InternalDSL.g:5190:2: ( ruleCharacteristicVariableType )
            {
            // InternalDSL.g:5190:2: ( ruleCharacteristicVariableType )
            // InternalDSL.g:5191:3: ruleCharacteristicVariableType
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
    // InternalDSL.g:5200:1: rule__CharacteristicVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__CharacteristicVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5204:1: ( ( RULE_ID ) )
            // InternalDSL.g:5205:2: ( RULE_ID )
            {
            // InternalDSL.g:5205:2: ( RULE_ID )
            // InternalDSL.g:5206:3: RULE_ID
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
    // InternalDSL.g:5215:1: rule__CharacteristicSet__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CharacteristicSet__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5219:1: ( ( RULE_ID ) )
            // InternalDSL.g:5220:2: ( RULE_ID )
            {
            // InternalDSL.g:5220:2: ( RULE_ID )
            // InternalDSL.g:5221:3: RULE_ID
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
    // InternalDSL.g:5230:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5234:1: ( ( RULE_STRING ) )
            // InternalDSL.g:5235:2: ( RULE_STRING )
            {
            // InternalDSL.g:5235:2: ( RULE_STRING )
            // InternalDSL.g:5236:3: RULE_STRING
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
    // InternalDSL.g:5245:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5249:1: ( ( RULE_ID ) )
            // InternalDSL.g:5250:2: ( RULE_ID )
            {
            // InternalDSL.g:5250:2: ( RULE_ID )
            // InternalDSL.g:5251:3: RULE_ID
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
    // InternalDSL.g:5260:1: rule__Constraint__RuleAssignment_3 : ( ruleRule ) ;
    public final void rule__Constraint__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5264:1: ( ( ruleRule ) )
            // InternalDSL.g:5265:2: ( ruleRule )
            {
            // InternalDSL.g:5265:2: ( ruleRule )
            // InternalDSL.g:5266:3: ruleRule
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
    // InternalDSL.g:5275:1: rule__Rule__DataSelectorsAssignment_0 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5279:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:5280:2: ( ruleDataSelector )
            {
            // InternalDSL.g:5280:2: ( ruleDataSelector )
            // InternalDSL.g:5281:3: ruleDataSelector
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
    // InternalDSL.g:5290:1: rule__Rule__DataSelectorsAssignment_1_1 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5294:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:5295:2: ( ruleDataSelector )
            {
            // InternalDSL.g:5295:2: ( ruleDataSelector )
            // InternalDSL.g:5296:3: ruleDataSelector
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
    // InternalDSL.g:5305:1: rule__Rule__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Rule__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5309:1: ( ( ruleStatement ) )
            // InternalDSL.g:5310:2: ( ruleStatement )
            {
            // InternalDSL.g:5310:2: ( ruleStatement )
            // InternalDSL.g:5311:3: ruleStatement
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
    // InternalDSL.g:5320:1: rule__Rule__DestinationSelectorsAssignment_3 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5324:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:5325:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:5325:2: ( ruleDestinationSelector )
            // InternalDSL.g:5326:3: ruleDestinationSelector
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
    // InternalDSL.g:5335:1: rule__Rule__DestinationSelectorsAssignment_4_1 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5339:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:5340:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:5340:2: ( ruleDestinationSelector )
            // InternalDSL.g:5341:3: ruleDestinationSelector
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
    // InternalDSL.g:5350:1: rule__Rule__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5354:1: ( ( ruleCondition ) )
            // InternalDSL.g:5355:2: ( ruleCondition )
            {
            // InternalDSL.g:5355:2: ( ruleCondition )
            // InternalDSL.g:5356:3: ruleCondition
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
    // InternalDSL.g:5365:1: rule__AttributeSelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__AttributeSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5369:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:5370:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:5370:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:5371:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:5380:1: rule__AttributeClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5384:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5385:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5385:2: ( ( RULE_ID ) )
            // InternalDSL.g:5386:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:5387:3: ( RULE_ID )
            // InternalDSL.g:5388:4: RULE_ID
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
    // InternalDSL.g:5399:1: rule__PropertySelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__PropertySelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5403:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:5404:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:5404:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:5405:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:5414:1: rule__PropertyClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5418:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5419:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5419:2: ( ( RULE_ID ) )
            // InternalDSL.g:5420:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:5421:3: ( RULE_ID )
            // InternalDSL.g:5422:4: RULE_ID
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
    // InternalDSL.g:5433:1: rule__NodeIdentitiySelector__NameAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__NodeIdentitiySelector__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5437:1: ( ( RULE_STRING ) )
            // InternalDSL.g:5438:2: ( RULE_STRING )
            {
            // InternalDSL.g:5438:2: ( RULE_STRING )
            // InternalDSL.g:5439:3: RULE_STRING
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
    // InternalDSL.g:5448:1: rule__NodeIdentitiySelector__AssemblyAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__AssemblyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5452:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5453:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5453:2: ( ( RULE_ID ) )
            // InternalDSL.g:5454:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_0()); 
            // InternalDSL.g:5455:3: ( RULE_ID )
            // InternalDSL.g:5456:4: RULE_ID
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
    // InternalDSL.g:5467:1: rule__NodeIdentitiySelector__ComponentAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__ComponentAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5471:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5472:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5472:2: ( ( RULE_ID ) )
            // InternalDSL.g:5473:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_3_0()); 
            // InternalDSL.g:5474:3: ( RULE_ID )
            // InternalDSL.g:5475:4: RULE_ID
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
    // InternalDSL.g:5486:1: rule__NodeIdentitiySelector__SeffAssignment_1_5 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__SeffAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5490:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5491:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5491:2: ( ( RULE_ID ) )
            // InternalDSL.g:5492:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationCrossReference_1_5_0()); 
            // InternalDSL.g:5493:3: ( RULE_ID )
            // InternalDSL.g:5494:4: RULE_ID
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
    // InternalDSL.g:5505:1: rule__Statement__ModalityAssignment_0 : ( ruleStatementModality ) ;
    public final void rule__Statement__ModalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5509:1: ( ( ruleStatementModality ) )
            // InternalDSL.g:5510:2: ( ruleStatementModality )
            {
            // InternalDSL.g:5510:2: ( ruleStatementModality )
            // InternalDSL.g:5511:3: ruleStatementModality
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
    // InternalDSL.g:5520:1: rule__Statement__TypeAssignment_1 : ( ruleStatementType ) ;
    public final void rule__Statement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5524:1: ( ( ruleStatementType ) )
            // InternalDSL.g:5525:2: ( ruleStatementType )
            {
            // InternalDSL.g:5525:2: ( ruleStatementType )
            // InternalDSL.g:5526:3: ruleStatementType
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
    // InternalDSL.g:5535:1: rule__StatementType__NameAssignment : ( ( 'FLOWS' ) ) ;
    public final void rule__StatementType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5539:1: ( ( ( 'FLOWS' ) ) )
            // InternalDSL.g:5540:2: ( ( 'FLOWS' ) )
            {
            // InternalDSL.g:5540:2: ( ( 'FLOWS' ) )
            // InternalDSL.g:5541:3: ( 'FLOWS' )
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            // InternalDSL.g:5542:3: ( 'FLOWS' )
            // InternalDSL.g:5543:4: 'FLOWS'
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalDSL.g:5554:1: rule__StatementModality__NameAssignment : ( ( 'NEVER' ) ) ;
    public final void rule__StatementModality__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5558:1: ( ( ( 'NEVER' ) ) )
            // InternalDSL.g:5559:2: ( ( 'NEVER' ) )
            {
            // InternalDSL.g:5559:2: ( ( 'NEVER' ) )
            // InternalDSL.g:5560:3: ( 'NEVER' )
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            // InternalDSL.g:5561:3: ( 'NEVER' )
            // InternalDSL.g:5562:4: 'NEVER'
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalDSL.g:5573:1: rule__Condition__OperationAssignment_1 : ( ruleBooleanOperation ) ;
    public final void rule__Condition__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5577:1: ( ( ruleBooleanOperation ) )
            // InternalDSL.g:5578:2: ( ruleBooleanOperation )
            {
            // InternalDSL.g:5578:2: ( ruleBooleanOperation )
            // InternalDSL.g:5579:3: ruleBooleanOperation
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
    // InternalDSL.g:5588:1: rule__CharacteristicReference__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicReference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5592:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5593:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5593:2: ( ( RULE_ID ) )
            // InternalDSL.g:5594:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableCrossReference_0()); 
            // InternalDSL.g:5595:3: ( RULE_ID )
            // InternalDSL.g:5596:4: RULE_ID
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
    // InternalDSL.g:5607:1: rule__CharacteristicSetReference__ValueAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicSetReference__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5611:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5612:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5612:2: ( ( RULE_ID ) )
            // InternalDSL.g:5613:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetCrossReference_0_0()); 
            // InternalDSL.g:5614:3: ( RULE_ID )
            // InternalDSL.g:5615:4: RULE_ID
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
    // InternalDSL.g:5626:1: rule__CharacteristicSetReference__RefAssignment_1 : ( ruleCharacteristsicSetOperation ) ;
    public final void rule__CharacteristicSetReference__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5630:1: ( ( ruleCharacteristsicSetOperation ) )
            // InternalDSL.g:5631:2: ( ruleCharacteristsicSetOperation )
            {
            // InternalDSL.g:5631:2: ( ruleCharacteristsicSetOperation )
            // InternalDSL.g:5632:3: ruleCharacteristsicSetOperation
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


    // $ANTLR start "rule__LogicalOrOperation__RightAssignment_1_2"
    // InternalDSL.g:5641:1: rule__LogicalOrOperation__RightAssignment_1_2 : ( ruleLogicalAndOperation ) ;
    public final void rule__LogicalOrOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5645:1: ( ( ruleLogicalAndOperation ) )
            // InternalDSL.g:5646:2: ( ruleLogicalAndOperation )
            {
            // InternalDSL.g:5646:2: ( ruleLogicalAndOperation )
            // InternalDSL.g:5647:3: ruleLogicalAndOperation
            {
             before(grammarAccess.getLogicalOrOperationAccess().getRightLogicalAndOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalAndOperation();

            state._fsp--;

             after(grammarAccess.getLogicalOrOperationAccess().getRightLogicalAndOperationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__RightAssignment_1_2"


    // $ANTLR start "rule__LogicalAndOperation__RightAssignment_1_2"
    // InternalDSL.g:5656:1: rule__LogicalAndOperation__RightAssignment_1_2 : ( ruleLogicalNegationOperation ) ;
    public final void rule__LogicalAndOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5660:1: ( ( ruleLogicalNegationOperation ) )
            // InternalDSL.g:5661:2: ( ruleLogicalNegationOperation )
            {
            // InternalDSL.g:5661:2: ( ruleLogicalNegationOperation )
            // InternalDSL.g:5662:3: ruleLogicalNegationOperation
            {
             before(grammarAccess.getLogicalAndOperationAccess().getRightLogicalNegationOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalNegationOperation();

            state._fsp--;

             after(grammarAccess.getLogicalAndOperationAccess().getRightLogicalNegationOperationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__RightAssignment_1_2"


    // $ANTLR start "rule__LogicalNegationOperation__ValueAssignment_1_1"
    // InternalDSL.g:5671:1: rule__LogicalNegationOperation__ValueAssignment_1_1 : ( ruleEncapsulatedLogicalOperation ) ;
    public final void rule__LogicalNegationOperation__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5675:1: ( ( ruleEncapsulatedLogicalOperation ) )
            // InternalDSL.g:5676:2: ( ruleEncapsulatedLogicalOperation )
            {
            // InternalDSL.g:5676:2: ( ruleEncapsulatedLogicalOperation )
            // InternalDSL.g:5677:3: ruleEncapsulatedLogicalOperation
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getValueEncapsulatedLogicalOperationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEncapsulatedLogicalOperation();

            state._fsp--;

             after(grammarAccess.getLogicalNegationOperationAccess().getValueEncapsulatedLogicalOperationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalNegationOperation__ValueAssignment_1_1"


    // $ANTLR start "rule__VariableEqualityOperation__LeftAssignment_0"
    // InternalDSL.g:5686:1: rule__VariableEqualityOperation__LeftAssignment_0 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableEqualityOperation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5690:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5691:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5691:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5692:3: ruleCharacteristicReference
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
    // InternalDSL.g:5701:1: rule__VariableEqualityOperation__RightAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableEqualityOperation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5705:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5706:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5706:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5707:3: ruleCharacteristicReference
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
    // InternalDSL.g:5716:1: rule__VariableInequalityOperation__LeftAssignment_0 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableInequalityOperation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5720:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5721:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5721:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5722:3: ruleCharacteristicReference
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
    // InternalDSL.g:5731:1: rule__VariableInequalityOperation__RightAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableInequalityOperation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5735:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5736:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5736:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5737:3: ruleCharacteristicReference
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


    // $ANTLR start "rule__EmptySetOperation__ValueAssignment_2"
    // InternalDSL.g:5746:1: rule__EmptySetOperation__ValueAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__EmptySetOperation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5750:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5751:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5751:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5752:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getEmptySetOperationAccess().getValueCharacteristicSetReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getEmptySetOperationAccess().getValueCharacteristicSetReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptySetOperation__ValueAssignment_2"


    // $ANTLR start "rule__IntersectionOperation__LeftAssignment_2"
    // InternalDSL.g:5761:1: rule__IntersectionOperation__LeftAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__IntersectionOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5765:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5766:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5766:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5767:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getIntersectionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getIntersectionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__LeftAssignment_2"


    // $ANTLR start "rule__IntersectionOperation__RightAssignment_4"
    // InternalDSL.g:5776:1: rule__IntersectionOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__IntersectionOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5780:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5781:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5781:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5782:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getIntersectionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionOperation__RightAssignment_4"


    // $ANTLR start "rule__UnionOperation__LeftAssignment_2"
    // InternalDSL.g:5791:1: rule__UnionOperation__LeftAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__UnionOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5795:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5796:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5796:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5797:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getUnionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getUnionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__LeftAssignment_2"


    // $ANTLR start "rule__UnionOperation__RightAssignment_4"
    // InternalDSL.g:5806:1: rule__UnionOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__UnionOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5810:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5811:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5811:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5812:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getUnionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getUnionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionOperation__RightAssignment_4"


    // $ANTLR start "rule__SubtractOperation__LeftAssignment_2"
    // InternalDSL.g:5821:1: rule__SubtractOperation__LeftAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__SubtractOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5825:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5826:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5826:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5827:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getSubtractOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getSubtractOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__LeftAssignment_2"


    // $ANTLR start "rule__SubtractOperation__RightAssignment_4"
    // InternalDSL.g:5836:1: rule__SubtractOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__SubtractOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5840:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5841:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5841:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5842:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getSubtractOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getSubtractOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractOperation__RightAssignment_4"


    // $ANTLR start "rule__ElementOfOperation__LeftAssignment_2"
    // InternalDSL.g:5851:1: rule__ElementOfOperation__LeftAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__ElementOfOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5855:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5856:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5856:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5857:3: ruleCharacteristicReference
            {
             before(grammarAccess.getElementOfOperationAccess().getLeftCharacteristicReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getElementOfOperationAccess().getLeftCharacteristicReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__LeftAssignment_2"


    // $ANTLR start "rule__ElementOfOperation__RightAssignment_4"
    // InternalDSL.g:5866:1: rule__ElementOfOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__ElementOfOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5870:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5871:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5871:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5872:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getElementOfOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getElementOfOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementOfOperation__RightAssignment_4"


    // $ANTLR start "rule__CreateSetOperation__ValueAssignment_1"
    // InternalDSL.g:5881:1: rule__CreateSetOperation__ValueAssignment_1 : ( ruleCharacteristicReference ) ;
    public final void rule__CreateSetOperation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5885:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5886:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5886:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5887:3: ruleCharacteristicReference
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000802000800020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000446000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000444000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000380000100020L});

}