package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests

import de.sebinside.dcp.dsl.dSL.DSLPackage
import de.sebinside.dcp.dsl.dSL.Model
import java.util.Arrays
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.DFDWithDCPTransformationWorkflowBuilder
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests.util.DCPStandaloneUtil
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.tests.impl.AnalysisIntegrationTestBase
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterized
import org.prolog4j.IProverFactory
import org.prolog4j.swicli.DefaultSWIPrologExecutableProvider
import org.prolog4j.swicli.SWIPrologCLIProverFactory
import org.prolog4j.swicli.SWIPrologCLIProverFactory.SWIPrologExecutableProviderStandalone
import org.prolog4j.swicli.enabler.SWIPrologEmbeddedFallbackExecutableProvider
import tools.mdsd.library.standalone.initialization.InitializationTask
import tools.mdsd.library.standalone.initialization.StandaloneInitializationException
import tools.mdsd.library.standalone.initialization.StandaloneInitializerBuilder
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.internal.Activator
import static org.junit.Assert.assertFalse

class AnalysisDCPIntegrationTestBase extends AnalysisIntegrationTestBase {
	
	protected static IProverFactory proverFactory;
	protected var DFDWithDCPTransformationWorkflowBuilder dcpBuilder
	
	@BeforeAll
	static def void init() {
		AnalysisIntegrationTestBase.init()
		DCPStandaloneUtil.init
		StandaloneInitializerBuilder.builder.addCustomTask(new InitializationTask() {

			override initilizationWithoutPlatform() throws StandaloneInitializationException {
				proverFactory = new SWIPrologCLIProverFactory(
					Arrays.asList(
						new SWIPrologExecutableProviderStandalone(new DefaultSWIPrologExecutableProvider(), 2),
						new SWIPrologExecutableProviderStandalone(new SWIPrologEmbeddedFallbackExecutableProvider(),
							1)));
			}

			override initializationWithPlatform() {
				var proverFactories = Activator.instance.proverManager.provers.values
				assertFalse(proverFactories.isEmpty)
				proverFactory = proverFactories.iterator.next
			}

		}).build.init;
	}

	@BeforeEach
	override void setup() {
		super.setup()
		//super.setup() already sets a new builder, which we simply substitute for a new instance of our own builder...
		dcpBuilder = new DFDWithDCPTransformationWorkflowBuilder()
		dcpBuilder.addProverFactory(proverFactory)
		builder = dcpBuilder
	}
	
	protected def loadAndInitDFD(String ddcPath, String dfdPath, String dcpPath) {
		DSLPackage.eINSTANCE.getClass
		var resourceSet = new ResourceSetImpl
		var ddUri = getRelativeURIDCP(ddcPath)
		var ddResource = resourceSet.getResource(ddUri, true)
		var dd = ddResource.contents.iterator.next as DataDictionaryCharacterized
		var dfdUri = getRelativeURIDCP(dfdPath)
		var dfdResource = resourceSet.getResource(dfdUri, true)
		var dfd = dfdResource.contents.iterator.next as DataFlowDiagram
		var dcpUri = getRelativeURIDCP(dcpPath)
		var dcpResource = resourceSet.getResource(dcpUri, true)
		var dcp = dcpResource.contents.iterator.next as Model
		
		dcpBuilder.addDFD(dfd, dd, dcp);
		dfd
	}
	
	def static URI getRelativeURIDCP(String path) {
		DCPStandaloneUtil.getRelativeURI(path)
	}
}