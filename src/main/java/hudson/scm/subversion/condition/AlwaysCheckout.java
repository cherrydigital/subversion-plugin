package hudson.scm.subversion.condition;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

public class AlwaysCheckout extends CheckoutCondition{
    private static final String displayName = "Always";

    @DataBoundConstructor
    public AlwaysCheckout() {}

    @Extension
    public static class AlwaysCheckoutDescriptor extends CheckoutConditionDescriptor {
        @Override
        public String getDisplayName() {
            return displayName;
        }
    }
}
