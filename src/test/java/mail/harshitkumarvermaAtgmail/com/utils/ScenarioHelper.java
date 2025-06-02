package mail.harshitkumarvermaAtgmail.com.utils;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.HashMap;
import java.util.List;

/**
 * Helper class to manage scenario-level data and hooks in Cucumber tests.
 */
public class ScenarioHelper {

    private static List<String> tags;

    /**
     * Global scenario data map accessible across test lifecycle.
     */
    public static HashMap<String, String> scenarioDataMap = new HashMap<>();

    /**
     * Hook executed before each scenario. Extracts scenario tags and maps test ID if found.
     *
     * @param scenario the scenario object
     */
    @Before
    public static void beforeScenario(Scenario scenario){
        tags = (List<String>) scenario.getSourceTagNames();
        for (String tag : tags) {
            if(tag.contains(Constants.TEST_ID_PREFIX)){
                TestData.addScenarioDataMap("testId", tag.replace(Constants.TEST_ID_PREFIX, ""));
            }
        }
    }

    /**
     * Hook executed after each scenario. Clears the data map and tags list.
     *
     * @param scenario the scenario object
     */
    @After
    public static void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) SeleniumHelper.getWebDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot");
        }
        scenarioDataMap.clear();
        tags.clear();
    }

    /**
     * Hook executed after all scenario. Closes the browser.
     */
    @AfterAll
    public static void afterAllScenarios() throws InterruptedException {
        Thread.sleep(10000);
        SeleniumHelper.getWebDriver().quit();
    }
}
