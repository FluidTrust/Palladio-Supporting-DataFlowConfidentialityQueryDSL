package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests

import org.eclipse.xtext.resource.SaveOptions
import org.junit.jupiter.api.Test
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.NameGenerationStrategie
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.TransformDFDWithDCPConstraintsToPrologWorkflow
import static org.junit.jupiter.api.Assertions.*
import java.util.Arrays
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.DataFlowDiagramCharacterizedFactory
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedProcess
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.Behaving

class TravelPlannerAccessControlWithDCPTest extends AnalysisDCPIntegrationTestBase {
	
	@Test
	def void testNoFlaws() {
		loadAndInitDFD("models/DDC_TravelPlanner_AccessControl.xmi", "models/DFDC_TravelPlanner_AccessControl.xmi", "models/Travel_Planner.DCPDSL")
		dcpBuilder.addSerializeToString(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
		dcpBuilder.setNameDerivationMethod(NameGenerationStrategie.DETAILED)
		dcpBuilder.addSerializeDCPPrologToString(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
		
		var workflow = dcpBuilder.build()
		workflow.run
		
		var dcpWorkflow = workflow as TransformDFDWithDCPConstraintsToPrologWorkflow
		var result = dcpWorkflow.getSerializedPrologProgram
		var constraints = dcpWorkflow.serializedPrologConstraints
		assertFalse(result.isEmpty)
		assertFalse(constraints.isEmpty)
		
		prover.loadTheory(result.get())
		prover.addTheory(constraints.get)
		var query = prover.query("constraint_AuthorizedAccess(ConstraintName, QueryType, N, PIN, S, VarSet_accessRoles, VarSet_authRoles).")
		var solution = query.solve()
		assertNumberOfSolutions(solution, 0, Arrays.asList("ConstraintName", "QueryType", "N", "VarSet_authRoles", "VarSet_accessRoles"))
	}
	
	@Test
	def void testNoDeclassification() {
		var dfd = loadAndInitDFD("models/DDC_TravelPlanner_AccessControl.xmi", "models/DFDC_TravelPlanner_AccessControl.xmi", "models/Travel_Planner.DCPDSL")
		// add possible data flow from CCD store to booking process
		var directCCDFlow = DataFlowDiagramCharacterizedFactory.eINSTANCE.createCharacterizedDataFlow
		directCCDFlow.name = "ccd direct"
		directCCDFlow.source = dfd.nodes.filter(CharacterizedProcess).findFirst["CCD.readCCD" == name]
		directCCDFlow.sourcePin = (directCCDFlow.source as Behaving).behavior.outputs.iterator.next
		directCCDFlow.target = dfd.nodes.filter(CharacterizedProcess).findFirst["User.bookFlight" == name]
		directCCDFlow.targetPin = (directCCDFlow.target as Behaving).behavior.inputs.get(1)
		dfd.edges += directCCDFlow
		
		dcpBuilder.addSerializeToString(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
		dcpBuilder.setNameDerivationMethod(NameGenerationStrategie.DETAILED)
		dcpBuilder.addSerializeDCPPrologToString(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
		
		var workflow = dcpBuilder.build()
		workflow.run	
		var dcpWorkflow = workflow as TransformDFDWithDCPConstraintsToPrologWorkflow
		var result = dcpWorkflow.getSerializedPrologProgram
		var constraints = dcpWorkflow.serializedPrologConstraints
		assertFalse(result.isEmpty)
		assertFalse(constraints.isEmpty)
		
		prover.loadTheory(result.get())
		prover.addTheory(constraints.get)
		var query = prover.query("constraint_AuthorizedAccess(ConstraintName, QueryType, N, PIN, S, VarSet_accessRoles, VarSet_authRoles).")
		var solution = query.solve()
		assertNumberOfSolutions(solution, 3, Arrays.asList("ConstraintName", "QueryType", "N", "VarSet_authRoles", "VarSet_accessRoles"))
	}
}

