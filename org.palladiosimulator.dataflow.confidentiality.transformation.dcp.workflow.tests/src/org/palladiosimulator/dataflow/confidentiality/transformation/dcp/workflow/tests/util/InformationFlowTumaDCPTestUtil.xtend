package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests.util

import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.DFDWithDCPTransformationWorkflowBuilder
import org.eclipse.xtext.resource.SaveOptions
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.NameGenerationStrategie

import static org.junit.jupiter.api.Assertions.*
import org.prolog4j.Prover
import org.eclipse.emf.common.util.URI
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.tests.impl.AnalysisIntegrationTestBase
import de.sebinside.dcp.dsl.dSL.DSLPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterized
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram
import de.sebinside.dcp.dsl.dSL.Model

class InformationFlowTumaDCPTestUtil {
	
	static def init() {
		AnalysisIntegrationTestBase.init()
		DCPStandaloneUtil.init
	}
	
	static def findFlaws(Prover prover, DFDWithDCPTransformationWorkflowBuilder dcpBuilder, String testCase) {
		dcpBuilder.addDDC(getRelativeURIDCP("models/InformationFlowTuma/" + testCase + "/DDC_" + testCase + ".xmi"))
		dcpBuilder.addDCPDSL(getRelativeURIDCP("models/InformationFlowTuma/" + testCase + "/" + testCase + ".DCPDSL"))
				
		dcpBuilder.addSerializeToString(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
		dcpBuilder.setNameDerivationMethod(NameGenerationStrategie.DETAILED)
		dcpBuilder.addSerializeDCPPrologToString(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
		
		var workflow = dcpBuilder.build()

		workflow.run()
		var result = workflow.getSerializedPrologProgram()
		var constraints = workflow.serializedPrologConstraints
		assertFalse(result.isEmpty())
		assertFalse(constraints.isEmpty)

		prover.loadTheory(result.get())
		prover.addTheory(constraints.get)
		var query = prover.query("constraint_IllegalInformationFlow(ConstraintName, QueryType, P, PIN, S).")
		
		var solution = query.solve()
		solution
	}
	
	def static URI getRelativeURIDCP(String path) {
		DCPStandaloneUtil.getRelativeURI(path)
	}
}