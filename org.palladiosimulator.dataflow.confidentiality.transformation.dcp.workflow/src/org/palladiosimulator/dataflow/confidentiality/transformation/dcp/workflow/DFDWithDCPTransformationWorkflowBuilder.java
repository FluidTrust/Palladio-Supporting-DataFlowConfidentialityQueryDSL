package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.impl.TransformDFDWithDCPConstraintsToPrologWorkflowImpl;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.jobs.TransfromDCPDSLToPrologJob;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.TransformationWorkflowBuilder;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.blackboards.KeyValueMDSDBlackboard;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.jobs.LoadModelJob;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary;

import de.sebinside.dcp.dsl.dSL.Model;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ModelLocation;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

public class DFDWithDCPTransformationWorkflowBuilder extends TransformationWorkflowBuilder {
	
	private static final ModelLocation DEFAULT_DCPDSL_LOCATION = new ModelLocation("dfd", URI.createFileURI("tmp/constaints.DCPDSL"));
	private static final ModelLocation DEFAULT_CONSTRAINTS_LOCATION = new ModelLocation("constraints", URI.createFileURI("tmp/constraints.pl"));
	private static final String DEFAULT_CONSTRAINTS_KEY = "constraints";
	
	private ModelLocation dcpdslLocation;
	private ModelLocation ddcLocation;
	
	protected final Collection<IJob> dcpPrologSerializationJobs = new ArrayList<>();
	
	public TransformDFDWithDCPConstraintsToPrologWorkflow build() {
		var jobSequence = super.createJobSequence();
		
		// validate state
		Validate.validState(dcpdslLocation != null, "A DFD diagram has to be given");
		//Validate.validState(dcpdslLocation != null, "DCP DSL constraints have to be given");
        Validate.validState(!dcpPrologSerializationJobs.isEmpty(), "At least one serialization option for DCP DSL constraints has to be given");
		
		//add load existing dcpDSL model; add to blackboard at DEFAULT_DCPDSL_LOCATION
        var loadDCPJob = new LoadModelJob<>(dcpdslLocation);
        jobSequence.add(loadDCPJob);

        // create transformation job
        getBlackboard().addPartition(DEFAULT_CONSTRAINTS_LOCATION.getPartitionID(), new ResourceSetPartition());
		
        jobSequence.add(new TransfromDCPDSLToPrologJob<KeyValueMDSDBlackboard>(dcpdslLocation, DEFAULT_CONSTRAINTS_LOCATION, DEFAULT_TRACE_KEY));
		
		//add serialize model job; prolog constraints at DEFAULT_CONSTRAINTS_LOCATION
		jobSequence.addAll(dcpPrologSerializationJobs);
		
		return new TransformDFDWithDCPConstraintsToPrologWorkflowImpl(jobSequence, progressMonitor, workflowExceptionHandler, getBlackboard(), 
				DEFAULT_PROLOG_KEY, DEFAULT_TRACE_KEY, DEFAULT_CONSTRAINTS_KEY);
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addDFD(DataFlowDiagram dfd, DataDictionary dd, Model dcp) {
		getBlackboard().removePartition(DEFAULT_DFD_LOCATION.getPartitionID());
		getBlackboard().addPartition(DEFAULT_DFD_LOCATION.getPartitionID(), new ResourceSetPartition());
		
		getBlackboard().setContents(DEFAULT_DD_LOCATION, Arrays.asList(dd));
		getBlackboard().setContents(DEFAULT_DFD_LOCATION, Arrays.asList(dfd));
		getBlackboard().setContents(DEFAULT_DCPDSL_LOCATION, Arrays.asList(dcp));
		dfdLocation = DEFAULT_DFD_LOCATION;
		ddcLocation = DEFAULT_DFD_LOCATION;
		dcpdslLocation = DEFAULT_DCPDSL_LOCATION;
		return this;
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addDDC(URI ddcURI) {
		ddcLocation = new ModelLocation(dfdLocation.getPartitionID(), ddcURI);
		return this;
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addDCPDSL(URI dcpURI) {
		dcpdslLocation = new ModelLocation(dfdLocation.getPartitionID(), dcpURI);
		return this;
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addSerializeDCPPrologToString(Map<Object, Object> saveOptions) {		
		addSerializeToString(DEFAULT_CONSTRAINTS_LOCATION, saveOptions, DEFAULT_CONSTRAINTS_KEY, dcpPrologSerializationJobs);
		return this;
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addSerializeDCPPrologToFile(URI destinationURI) {
		addSerializeDCPPrologToFile(destinationURI, Collections.emptyMap());
		return this;
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addSerializeDCPPrologToFile(URI destinationURI, Map<String, Object> saveOptions) {
		addSerializeModelToFile(DEFAULT_CONSTRAINTS_LOCATION, destinationURI, saveOptions, dcpPrologSerializationJobs);
		return this;
	}

}
