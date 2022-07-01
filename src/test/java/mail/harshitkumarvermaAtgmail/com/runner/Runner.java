package mail.harshitkumarvermaAtgmail.com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features/"},
        glue = {"mail.harshitkumarvermaAtgmail.com.stepdef"},
        plugin = {
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber-reports/cucumber.json",
                "usage:target/cucumber-reports/cucumber-usage.json",
                "junit:target/cucumber-reports/cucumber-results.xml"
        },

        monochrome = true
)
public class Runner {
}
