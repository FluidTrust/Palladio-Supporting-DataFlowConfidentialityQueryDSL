package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow;

import java.util.Optional;

import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.TransformDFDToPrologWorkflow;

public interface TransformDFDWithDCPConstraintsToPrologWorkflow extends TransformDFDToPrologWorkflow {
	
	public Optional<String> getSerializedPrologConstraints();
}
