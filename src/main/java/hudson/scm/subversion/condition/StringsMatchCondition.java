package hudson.scm.subversion.condition;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.export.Exported;

public class StringsMatchCondition extends CheckoutCondition{
    private static final String displayName = "Strings match";

    @Exported
    final String arg1;
    @Exported
    final String arg2;
    @Exported
    final boolean ignoreCase;

    @DataBoundConstructor
    public StringsMatchCondition(final String arg1, final String arg2, final boolean ignoreCase) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.ignoreCase = ignoreCase;
    }

    public String getArg2() {
        return arg2;
    }

    public String getArg1() {
        return arg1;
    }

    public boolean isIgnoreCase() {
        return ignoreCase;
    }

    @Extension
    public static class StringsMatchDescriptor extends CheckoutConditionDescriptor{

        @Override
        public String getDisplayName() {
            return displayName;
        }

    }
}

