package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.jobs;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;

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
	private final ModelLocation prologConstraintsLocation;
	
	public TransfromDCPDSLToPrologJob(ModelLocation dcpdslLocation, ModelLocation prologConstraintsLocation, String traceKey) {
		this.dcpdslLocation = dcpdslLocation;
		this.prologConstraintsLocation = prologConstraintsLocation;
        this.traceKey = traceKey;
    }
	
	@Override
	public String getName() {
		return "Transform DCP DSL Constraints to Prolog";
	}
	
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		var trace = (DFD2PrologTransformationTrace) getBlackboard().get(traceKey).get();
		var dcpdslFiles = getBlackboard().getContents(this.dcpdslLocation)
				.stream()
	            .filter(Model.class::isInstance)
	            .map(Model.class::cast)
	            .collect(Collectors.toList());
		if (dcpdslFiles.size() != 1) {
            new JobFailedException("There is not exactly one DCP DSL Constraints file available.");
        }
		
		DSLGenerator generator = new DSLGenerator();
		generator.setExtendedDFDConvertrerTrace(trace);
		var program = generator.generateFromModel(dcpdslFiles.get(0));
		
		getBlackboard().setContents(prologConstraintsLocation, Arrays.asList(program));
		
        monitor.worked(1);
        monitor.done();
		
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {}
}
