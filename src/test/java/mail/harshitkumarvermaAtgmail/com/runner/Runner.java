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
                "json:target/cucumber-reports/cucumber.json",
        },

        monochrome = true
)
public class Runner {
}
