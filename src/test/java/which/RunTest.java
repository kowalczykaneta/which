package which;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import which.browser.Browser;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "~@Ignore")
public class RunTest {

    @AfterClass
    public static void afterAllScenarios() {
        Browser.close();
    }
}
