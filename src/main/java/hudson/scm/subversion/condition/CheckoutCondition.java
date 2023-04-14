package hudson.scm.subversion.condition;

import hudson.DescriptorExtensionList;
import hudson.ExtensionPoint;
import hudson.model.Describable;
import hudson.model.Descriptor;
import hudson.model.Hudson;

import java.io.Serializable;

public abstract class CheckoutCondition implements Describable<CheckoutCondition>, ExtensionPoint, Serializable {
    private static final long serialVersionUID = 1L;

    public static DescriptorExtensionList<CheckoutCondition, CheckoutConditionDescriptor> all() {
        return Hudson.getInstance().<CheckoutCondition, CheckoutConditionDescriptor>getDescriptorList(CheckoutCondition.class);
    }

    public CheckoutConditionDescriptor getDescriptor() {
        return (CheckoutConditionDescriptor)Hudson.getInstance().getDescriptor(getClass());
    }

    public static abstract class CheckoutConditionDescriptor extends Descriptor<CheckoutCondition> {
        protected CheckoutConditionDescriptor() { }
        protected CheckoutConditionDescriptor(Class<? extends CheckoutCondition> clazz) {
            super(clazz);
        }
    }
}
