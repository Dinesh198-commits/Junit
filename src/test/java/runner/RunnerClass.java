package runner;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
@SelectPackages({"PkgA","PkgB"})
@IncludeTags("Regression")
public class RunnerClass {

}
