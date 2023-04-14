package hudson.scm.subversion.condition;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

public class NeverCheckout extends CheckoutCondition{
    private static final String displayName = "Never";

    @DataBoundConstructor
    public NeverCheckout() {}

    @Extension
    public static class NeverCheckoutDescriptor extends CheckoutConditionDescriptor {
        @Override
        public String getDisplayName() {
            return displayName;
        }
    }
}
