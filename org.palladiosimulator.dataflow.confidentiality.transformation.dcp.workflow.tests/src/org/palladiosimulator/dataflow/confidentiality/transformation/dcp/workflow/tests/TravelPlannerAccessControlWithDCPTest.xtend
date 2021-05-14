package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests

import de.sebinside.dcp.dsl.dSL.Model

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.SaveOptions

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach

import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.tests.impl.AnalysisIntegrationTestBase
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.DFDWithDCPTransformationWorkflowBuilder
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.NameGenerationStrategie
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.TransformDFDWithDCPConstraintsToPrologWorkflow
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests.util.DCPStandaloneUtil
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterized
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram

import static org.junit.jupiter.api.Assertions.*
import de.sebinside.dcp.dsl.dSL.DSLPackage
import org.junit.jupiter.api.BeforeAll

class TravelPlannerAccessControlWithDCPTest extends AnalysisIntegrationTestBase {
	
	var DFDWithDCPTransformationWorkflowBuilder dcpBuilder
	
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
	
	@Test
	def void testFullRun() {
		loadAndInitDFD("models/DDC_TravelPlanner_AccessControl.xmi", "models/DFDC_TravelPlanner_AccessControl.xmi", "models/Travel_Planner.DCPDSL")
		dcpBuilder.addSerializeToString(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
		dcpBuilder.setNameDerivationMethod(NameGenerationStrategie.DETAILED)
		
		dcpBuilder.addSerializeDCPPrologToString(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
		
		var workflow = dcpBuilder.build()

		workflow.run
		
		var dcpWorkflow = workflow as TransformDFDWithDCPConstraintsToPrologWorkflow
		println(dcpWorkflow.serializedPrologConstraints)
		var result = workflow.getSerializedPrologProgram
		var constraints = dcpWorkflow.serializedPrologConstraints
		assertFalse(constraints.isEmpty)
		assertFalse(result.isEmpty)
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
	}
	
	def static URI getRelativeURIDCP(String path) {
		DCPStandaloneUtil.getRelativeURI(path)
	}
}

