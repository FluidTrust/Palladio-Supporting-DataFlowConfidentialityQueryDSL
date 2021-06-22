package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.impl;

import java.util.Optional;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.TransformDFDWithDCPConstraintsToPrologWorkflow;
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.DFD2PrologTransformationTrace;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.blackboards.KeyValueMDSDBlackboard;

import de.uka.ipd.sdq.workflow.BlackboardBasedWorkflow;
import de.uka.ipd.sdq.workflow.WorkflowExceptionHandler;
import de.uka.ipd.sdq.workflow.jobs.IJob;

public class TransformDFDWithDCPConstraintsToPrologWorkflowImpl extends BlackboardBasedWorkflow<KeyValueMDSDBlackboard>
		implements TransformDFDWithDCPConstraintsToPrologWorkflow {

    private final KeyValueMDSDBlackboard blackboard;
    private final String serializedProgramKey;
    private final String traceKey;
    private final String serializedDCPConstraintsKey;

    public TransformDFDWithDCPConstraintsToPrologWorkflowImpl(IJob job, KeyValueMDSDBlackboard blackboard, String serializedProgramKey,
            String traceKey, String serializedDCPConstraintsKey) {
        super(job, blackboard);
        this.blackboard = blackboard;
        this.serializedProgramKey = serializedProgramKey;
        this.traceKey = traceKey;
        this.serializedDCPConstraintsKey = serializedDCPConstraintsKey;
    }

    public TransformDFDWithDCPConstraintsToPrologWorkflowImpl(IJob job, IProgressMonitor monitor, WorkflowExceptionHandler handler,
            KeyValueMDSDBlackboard blackboard, String serializedProgramKey, String traceKey, String serializedDCPConstraintsKey) {
        super(job, monitor, handler, blackboard);
        this.blackboard = blackboard;
        this.serializedProgramKey = serializedProgramKey;
        this.traceKey = traceKey;
        this.serializedDCPConstraintsKey = serializedDCPConstraintsKey;
    }

    public TransformDFDWithDCPConstraintsToPrologWorkflowImpl(IJob job, WorkflowExceptionHandler handler,
            KeyValueMDSDBlackboard blackboard, String serializedProgramKey, String traceKey, String serializedDCPConstraintsKey) {
        super(job, handler, blackboard);
        this.blackboard = blackboard;
        this.serializedProgramKey = serializedProgramKey;
        this.traceKey = traceKey;
        this.serializedDCPConstraintsKey = serializedDCPConstraintsKey;
    }

	@Override
	public Optional<String> getSerializedPrologProgram() {
		return blackboard.get(serializedProgramKey)
	            .map(String.class::cast);
	}

	@Override
	public Optional<DFD2PrologTransformationTrace> getTransformationTrace() {
        return blackboard.get(traceKey)
                .filter(DFD2PrologTransformationTrace.class::isInstance)
                .map(DFD2PrologTransformationTrace.class::cast);
	}
	
	@Override
	public Optional<String> getSerializedPrologConstraints() {
		return blackboard.get(serializedDCPConstraintsKey)
	            .map(String.class::cast);
	}
}
