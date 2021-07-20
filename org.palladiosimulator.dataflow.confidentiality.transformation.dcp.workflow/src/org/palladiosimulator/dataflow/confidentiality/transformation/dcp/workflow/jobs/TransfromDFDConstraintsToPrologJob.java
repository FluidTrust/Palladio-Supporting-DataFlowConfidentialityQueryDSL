package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.jobs;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.DFD2PrologTransformationTrace;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.blackboards.KeyValueMDSDBlackboard;

import de.sebinside.dcp.dsl.dSL.Model;
import de.sebinside.dcp.dsl.generator.DSLGenerator;

import de.uka.ipd.sdq.workflow.jobs.AbstractBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ModelLocation;

public class TransfromDFDConstraintsToPrologJob<T extends KeyValueMDSDBlackboard> extends AbstractBlackboardInteractingJob<T>  {

    private final String traceKey;
	private final ModelLocation dcpdslLocation;
	private final ModelLocation constraintsLocation;
	private final ModelLocation callableQueryLocation;
	
	public TransfromDFDConstraintsToPrologJob(ModelLocation dcpdslLocation, ModelLocation constraintsLocation, ModelLocation callableQueryLocation, String traceKey) {
		this.dcpdslLocation = dcpdslLocation;
		this.constraintsLocation = constraintsLocation;
		this.callableQueryLocation = callableQueryLocation;
        this.traceKey = traceKey;
    }
	
	@Override
	public String getName() {
		return "Transform DCP DSL Constraints to Prolog";
	}
	
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		monitor.beginTask(getName(), 1);
		var optTrace = getBlackboard().get(traceKey);
		if(optTrace.isEmpty()) {
            throw new JobFailedException("There is no trace available on blackboard.");
		}
		
		var traceObj = optTrace.get();
		DSLGenerator generator = new DSLGenerator();
		if(traceObj instanceof DFD2PrologTransformationTrace) {
			var dfd2PrologTrace = (DFD2PrologTransformationTrace) traceObj;
			generator.setDFD2PrologTrace(dfd2PrologTrace);
		} else {
			throw new JobFailedException("There is no trace from the DFD2Prolog transformation available on blackboard.");
		}
		
		var dcpdslFiles = getBlackboard().getContents(this.dcpdslLocation)
				.stream()
	            .filter(Model.class::isInstance)
	            .map(Model.class::cast)
	            .collect(Collectors.toList());
		if (dcpdslFiles.size() != 1) {
            throw new JobFailedException("There is not exactly one DCP DSL Constraints file available.");
        }

		var prologConstraints = generator.generateFromModel(dcpdslFiles.get(0));
		getBlackboard().put("converter", generator.getConverter());
		
		var callQueryProgram = generator.getCallableQueryProgram();
		
		getBlackboard().setContents(constraintsLocation, Arrays.asList(prologConstraints));
		getBlackboard().setContents(callableQueryLocation, Arrays.asList(callQueryProgram));
		
        monitor.worked(1);
        monitor.done();
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {}
}
