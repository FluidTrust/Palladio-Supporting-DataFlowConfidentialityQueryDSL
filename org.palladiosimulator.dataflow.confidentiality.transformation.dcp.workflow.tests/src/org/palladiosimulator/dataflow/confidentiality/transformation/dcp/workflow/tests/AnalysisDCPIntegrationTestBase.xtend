package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.tests.impl.AnalysisIntegrationTestBase
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests.util.DCPStandaloneUtil
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.DFDWithDCPTransformationWorkflowBuilder
import de.sebinside.dcp.dsl.dSL.DSLPackage
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterized
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import de.sebinside.dcp.dsl.dSL.Model
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram
import org.eclipse.emf.common.util.URI

class AnalysisDCPIntegrationTestBase extends AnalysisIntegrationTestBase {
	
	protected var DFDWithDCPTransformationWorkflowBuilder dcpBuilder
	
	@BeforeAll
	static def void init() {
		AnalysisIntegrationTestBase.init()
		DCPStandaloneUtil.init
	}

	@BeforeEach
	override void setup() {
		super.setup()
		//super.setup() already sets a new builder, which we simply substitute for a new instance of our own builder...
		dcpBuilder = new DFDWithDCPTransformationWorkflowBuilder()
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