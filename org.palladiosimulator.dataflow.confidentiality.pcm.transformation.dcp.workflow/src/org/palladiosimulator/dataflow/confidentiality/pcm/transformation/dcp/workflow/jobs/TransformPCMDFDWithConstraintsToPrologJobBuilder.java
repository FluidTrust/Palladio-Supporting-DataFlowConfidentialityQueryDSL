package org.palladiosimulator.dataflow.confidentiality.pcm.transformation.dcp.workflow.jobs;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.dcp.workflow.jobs.impl.TransformPCMDFDWithConstraintsToPrologJobImpl;
import org.palladiosimulator.dataflow.confidentiality.pcm.workflow.jobs.TransformPCMDFDToPrologJobBuilder;
import org.palladiosimulator.dataflow.confidentiality.pcm.workflow.jobs.impl.TransformPCMDFDtoPrologJobImpl;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.blackboards.KeyValueMDSDBlackboard;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.jobs.InitPartitionJob;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.jobs.LoadModelJob;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.jobs.SerializeModelToStringJob;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ModelLocation;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.SavePartitionToDiskJob;

public class TransformPCMDFDWithConstraintsToPrologJobBuilder {
	
	private static final ModelLocation DEFAULT_DCPDSL_LOCATION = new ModelLocation("dfd", URI.createFileURI("tmp/constaints.DCPDSL"));
	private static final ModelLocation DEFAULT_CONSTRAINTS_LOCATION = new ModelLocation("constraints", URI.createFileURI("tmp/constraints.pl"));
	private static final String DEFAULT_CONSTRAINTS_KEY = "constraints";
	
	private ModelLocation dcpdslLocation;
	private ModelLocation prologConstraintsLocation;
	private boolean serializeConstraintsToString = false;
	private String constraintsResultKey;
	
	private TransformPCMDFDToPrologJobBuilder base = new TransformPCMDFDToPrologJobBuilder();
	
	public static TransformPCMDFDWithConstraintsToPrologJobBuilder create() {
        return new TransformPCMDFDWithConstraintsToPrologJobBuilder();
    }
	
	public TransformPCMDFDWithConstraintsToPrologJob<? extends KeyValueMDSDBlackboard> build() {
		var baseSequence = base.build();
		@SuppressWarnings("unchecked")
		var baseSequenceImpl = (TransformPCMDFDtoPrologJobImpl<KeyValueMDSDBlackboard>) baseSequence;
		if(baseSequenceImpl == null) {
			//Error 
		}
		
		var jobSequence = new TransformPCMDFDWithConstraintsToPrologJobImpl<KeyValueMDSDBlackboard>("\"PCM to Prolog Transformation with Constraints\"", 
				baseSequence.getPrologKey(), baseSequence.getTraceKey(), DEFAULT_CONSTRAINTS_KEY);
		
		// copy jobs from builder without constraints to new job
		baseSequenceImpl.iterator().forEachRemaining(jobSequence::add);

		// load DCPDSL file
		var loadDCPDSLJob = new LoadModelJob<>(dcpdslLocation);
		jobSequence.add(loadDCPDSLJob);
		
		// initialize blackboard partition for transformed prolog constraints
		var initPrologConstraintsPartitionJob = new InitPartitionJob(prologConstraintsLocation.getPartitionID());
        jobSequence.add(initPrologConstraintsPartitionJob);
        
        // actual transformation job
        var dcpdslToConstraintsJob = new TransfromPCMDFDConstraintsToPrologJob<KeyValueMDSDBlackboard>(dcpdslLocation, prologConstraintsLocation, baseSequence.getTraceKey());
        jobSequence.add(dcpdslToConstraintsJob);
		
        // serialize the prolog constraints either to file or to string
		IJob serializeConstraintsJob;
        if (serializeConstraintsToString) {
        	serializeConstraintsJob = new SerializeModelToStringJob(prologConstraintsLocation, constraintsResultKey);
        } else {
        	serializeConstraintsJob = new SavePartitionToDiskJob(prologConstraintsLocation.getPartitionID());
        }
        jobSequence.add(serializeConstraintsJob);
		
		return jobSequence;
	}
	
	public TransformPCMDFDWithConstraintsToPrologJobBuilder addDCPDSL(URI dcpURI) {
		dcpdslLocation = new ModelLocation(DEFAULT_DCPDSL_LOCATION.getPartitionID(), dcpURI);
		return this;
	}
	
	public TransformPCMDFDWithConstraintsToPrologJobBuilder addSerializeDCPPrologToFile(URI destinationURI) {
		serializeConstraintsToString = false;
		prologConstraintsLocation = new ModelLocation(DEFAULT_CONSTRAINTS_LOCATION.getPartitionID(), destinationURI);
		constraintsResultKey = DEFAULT_CONSTRAINTS_KEY;
		return this;
	}
	
	public TransformPCMDFDWithConstraintsToPrologJobBuilder addSerializeDCPPrologToString() {
		addSerializeDCPPrologToString(DEFAULT_CONSTRAINTS_KEY);
		return this;
	}
	
	public TransformPCMDFDWithConstraintsToPrologJobBuilder addSerializeDCPPrologToString(String blackboardKey) {
		serializeConstraintsToString = true;
		prologConstraintsLocation = DEFAULT_CONSTRAINTS_LOCATION;
		constraintsResultKey = blackboardKey;
		return this;
	}

	
	public TransformPCMDFDWithConstraintsToPrologJobBuilder addUsageModelsByURI(URI... uris) {
        return this.addUsageModelsByURI(Arrays.asList(uris));
    }
	
	public TransformPCMDFDWithConstraintsToPrologJobBuilder addUsageModelsByURI(Collection<URI> uris) {
        base.addUsageModelsByURI(uris);
        return this;
    }
	
	public TransformPCMDFDWithConstraintsToPrologJobBuilder addUsageModels(UsageModel... usageModels) {
        return this.addUsageModels(Arrays.asList(usageModels));
    }

    public TransformPCMDFDWithConstraintsToPrologJobBuilder addUsageModels(Collection<UsageModel> usageModels) {
        base.addUsageModels(usageModels);
        return this;
    }
    
    public TransformPCMDFDWithConstraintsToPrologJobBuilder addAllocationModelByURI(URI uri) {
        base.addAllocationModelByURI(uri);
        return this;
    }
    
    public TransformPCMDFDWithConstraintsToPrologJobBuilder addAllocationModel(Allocation allocation) {
        base.addAllocationModel(allocation);
        return this;
    }
    
    public TransformPCMDFDWithConstraintsToPrologJobBuilder addSerializeModelToString() {
        base.addSerializeModelToString();
        return this;
    }

    public TransformPCMDFDWithConstraintsToPrologJobBuilder addSerializeModelToString(String blackboardKey) {
    	base.addSerializeModelToString(blackboardKey);
        return this;
    }
}
