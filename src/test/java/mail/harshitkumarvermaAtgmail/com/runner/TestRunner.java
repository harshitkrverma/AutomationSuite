package mail.harshitkumarvermaAtgmail.com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features/"},
        tags = "@Test_id_TC01",
        glue = {"mail.harshitkumarvermaAtgmail.com.stepdef", "mail.harshitkumarvermaAtgmail.com.utils"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber.html"
        },

        monochrome = true
)
public class TestRunner {
}
