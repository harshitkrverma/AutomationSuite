package mail.harshitkumarvermaAtgmail.com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features/"},
        glue = {"mail.harshitkumarvermaAtgmail.com.stepdef", "mail.harshitkumarvermaAtgmail.com.utils"},
        tags = "@Test_id_TC01",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber-results.xml"
        }
)
public class TestRunner {
}
