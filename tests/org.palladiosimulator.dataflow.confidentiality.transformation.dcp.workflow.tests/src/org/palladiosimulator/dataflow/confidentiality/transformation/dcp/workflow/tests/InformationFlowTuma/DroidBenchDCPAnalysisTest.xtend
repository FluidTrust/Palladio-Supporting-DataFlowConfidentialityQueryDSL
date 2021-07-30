package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests.InformationFlowTuma

import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.tests.DroidBenchAnalysisTest
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.DFDWithDCPTransformationWorkflowBuilder
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests.util.InformationFlowTumaDCPTestUtil
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests.util.TestCaseUtil.InformationFlowTumaTestCases

class DroidBenchDCPAnalysisTest extends DroidBenchAnalysisTest {
	
	protected var DFDWithDCPTransformationWorkflowBuilder dcpBuilder
	
	@BeforeAll
	static def void init() {
		InformationFlowTumaDCPTestUtil.init
	}

	@BeforeEach
	override void setup() {
		super.setup()
		//super.setup() already sets a new builder, which we simply substitute for a new instance of our own builder...
		dcpBuilder = new DFDWithDCPTransformationWorkflowBuilder()
		builder = dcpBuilder
	}
	
	override findFlaws() {
		InformationFlowTumaDCPTestUtil.findFlaws(prover, dcpBuilder, InformationFlowTumaTestCases.DROID_BENCH.toString)
	}
}
