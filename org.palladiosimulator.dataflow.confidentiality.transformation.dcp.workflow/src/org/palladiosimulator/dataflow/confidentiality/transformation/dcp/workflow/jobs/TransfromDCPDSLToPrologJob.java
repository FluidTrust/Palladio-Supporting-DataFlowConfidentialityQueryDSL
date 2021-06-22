package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.jobs;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
//import org.palladiosimulator.dataflow.confidentiality.pcm.workflow.TransitiveTransformationTrace;
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.DFD2PrologTransformationTrace;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.blackboards.KeyValueMDSDBlackboard;

import de.sebinside.dcp.dsl.dSL.Model;
import de.sebinside.dcp.dsl.generator.DSLGenerator;

import de.uka.ipd.sdq.workflow.jobs.AbstractBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ModelLocation;

public class TransfromDCPDSLToPrologJob<T extends KeyValueMDSDBlackboard> extends AbstractBlackboardInteractingJob<T>  {

    private final String traceKey;
	private final ModelLocation dcpdslLocation;
	private final ModelLocation constraintsLocation;
	
	public TransfromDCPDSLToPrologJob(ModelLocation dcpdslLocation, ModelLocation constraintsLocation, String traceKey) {
		this.dcpdslLocation = dcpdslLocation;
		this.constraintsLocation = constraintsLocation;
        this.traceKey = traceKey;
    }
	
	@Override
	public String getName() {
		return "Transform DCP DSL Constraints to Prolog";
	}
	
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		// getting and setting the trace for both cases
		var dfd2PrologTrace = (DFD2PrologTransformationTrace) getBlackboard().get(traceKey).get();
		//var pcm2PrologTrace = (TransitiveTransformationTrace) getBlackboard().get(traceKey).get();
		var dcpdslFiles = getBlackboard().getContents(this.dcpdslLocation)
				.stream()
	            .filter(Model.class::isInstance)
	            .map(Model.class::cast)
	            .collect(Collectors.toList());
		if (dcpdslFiles.size() != 1) {
            new JobFailedException("There is not exactly one DCP DSL Constraints file available.");
        }
		
		DSLGenerator generator = new DSLGenerator();
		// as the DCPDSL file establishes what base is used (DFD vs. extended PCM)
		// we can just set both traces. Errors exists either way if the prolog
		// constraints do not fit the prolog model 
		generator.setDFD2PrologTrace(dfd2PrologTrace);
		//generator.setPCM2PrologTrace(pcm2PrologTrace);
		var prologConstraints = generator.generateFromModel(dcpdslFiles.get(0));
		
		getBlackboard().setContents(constraintsLocation, Arrays.asList(prologConstraints));
		
        monitor.worked(1);
        monitor.done();
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {}
}
