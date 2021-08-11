package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.internal;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.prolog4j.swicli.SWIPrologCLIProverFactory;

public class Activator extends Plugin {

    private static Activator instance;
    private ServiceReference<SWIPrologCLIProverFactory> proverFactoryReference;
    private SWIPrologCLIProverFactory proverFactory;

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        setInstance(this);

        proverFactoryReference = context.getServiceReference(SWIPrologCLIProverFactory.class);
        proverFactory = context.getService(proverFactoryReference);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        context.ungetService(proverFactoryReference);
        proverFactory = null;
        proverFactoryReference = null;

        setInstance(null);
        super.stop(context);
    }

    public static Activator getInstance() {
        return Activator.instance;
    }

    private static void setInstance(Activator instance) {
        Activator.instance = instance;
    }

    public SWIPrologCLIProverFactory getProverFactory() {
        return proverFactory;
    }

}
