package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests.util;

import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.DFD2PrologTransformation;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.tests.util.StandaloneUtil;
import org.palladiosimulator.supporting.prolog.PrologStandaloneSetup;

import de.sebinside.dcp.dsl.DSLStandaloneSetup;

import tools.mdsd.library.standalone.initialization.StandaloneInitializationException;
import tools.mdsd.library.standalone.initialization.StandaloneInitializer;
import tools.mdsd.library.standalone.initialization.StandaloneInitializerBuilder;
import tools.mdsd.library.standalone.initialization.log4j.Log4jInitilizationTask;

public class DCPStandaloneUtil {

    private DCPStandaloneUtil() {
        // intentionally left blank
    }

    public static void init() throws StandaloneInitializationException {
        StandaloneInitializer initializer = StandaloneInitializerBuilder.builder()
            .registerProjectURI(DFD2PrologTransformation.class,
                    "org.palladiosimulator.dataflow.confidentiality.transformation.prolog")
            .registerProjectURI(DCPStandaloneUtil.class,
                    "org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests")
            .addCustomTask(new Log4jInitilizationTask())
            .addCustomTask(PrologStandaloneSetup::doSetup)
            .addCustomTask(DSLStandaloneSetup::doSetup)
            .build();
        initializer.init();
        
    }

    public static URI getRelativeURI(String relativePath) {
        return URI.createPlatformPluginURI("/org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests/" + relativePath, false);
    }
}