package org.palladiosimulator.dataflow.confidentiality.pcm.transformation.dcp.workflow.tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.prolog4j.swicli.SWIPrologCLIProverFactory
import org.prolog4j.Prover
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.util.Arrays
import org.prolog4j.swicli.SWIPrologCLIProverFactory.SWIPrologExecutableProviderStandalone
import org.prolog4j.swicli.DefaultSWIPrologExecutableProvider
import org.prolog4j.swicli.enabler.SWIPrologEmbeddedFallbackExecutableProvider
import org.palladiosiumlator.dataflow.confidentiality.pcm.transformation.dcp.workflow.tests.util.PCMDCPDSLStandaloneUtil
import org.palladiosimulator.pcm.usagemodel.UsageModel
import org.palladiosimulator.pcm.allocation.Allocation
import org.eclipse.emf.ecore.util.EcoreUtil
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.dcp.workflow.jobs.TransformPCMDFDWithConstraintsToPrologJobBuilder
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.dcp.workflow.TransformPCMDFDWithConstraintsToPrologWorkflowFactory
import static org.junit.Assert.assertTrue

class TestBase {
	static SWIPrologCLIProverFactory proverFactory
	protected Prover prover
	protected ResourceSetImpl rs
	
	@BeforeAll
	static def void init() {
		PCMDCPDSLStandaloneUtil.init
		var factory = new SWIPrologCLIProverFactory(
			Arrays.asList(new SWIPrologExecutableProviderStandalone(new DefaultSWIPrologExecutableProvider(), 2),
				new SWIPrologExecutableProviderStandalone(new SWIPrologEmbeddedFallbackExecutableProvider(), 1)));
		proverFactory = factory;
	}
	
	@BeforeEach
	def void setup() {
		prover = proverFactory.createProver
		rs = new ResourceSetImpl
	}
	
	@Test
	def void testTravelPlannerRBAC() {
		val usageModelURI = PCMDCPDSLStandaloneUtil.getModelURI("newUsageModel.usagemodel")
		val usageModelResource = rs.getResource(usageModelURI, true)
		var UsageModel usageModel = usageModelResource.contents.get(0) as UsageModel

		val allocationModelURI = PCMDCPDSLStandaloneUtil.getModelURI("newAllocation.allocation")
		val allocationModelResource = rs.getResource(allocationModelURI, true)
		var Allocation allocationModel = allocationModelResource.contents.get(0) as Allocation
		EcoreUtil.resolveAll(rs)
		
		var builder = new TransformPCMDFDWithConstraintsToPrologJobBuilder()
			.addSerializeModelToString
			.addSerializeDCPPrologToString
			.addUsageModels(usageModel)
			.addAllocationModel(allocationModel)
			.addDCPDSL(PCMDCPDSLStandaloneUtil.getModelURI("test.DCPDSL"))
		var job = builder.build
		val workflow = TransformPCMDFDWithConstraintsToPrologWorkflowFactory.createWorkflow(job)
		workflow.run
		
		val program = workflow.prologProgram
		val constraints = workflow.prologConstraints
		
		assertTrue(program.present)
		assertTrue(constraints.present)
		
		prover.loadTheory(program.get)
		prover.addTheory(constraints.get)
		
		val query = prover.query("constraint_RBAC(ConstraintName, QueryType, N, PIN, S, VarSet_authRoles, VarSet_compRoles).")
		val solution = query.solve()
		
		assertTrue(solution !== null && solution.size == 1)
	}
}