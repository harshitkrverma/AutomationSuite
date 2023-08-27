package mail.harshitkumarvermaAtgmail.com.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.List;

public class ScenarioHelper {
    private static List<String> tags;
    @Before
    public static void beforeScenario(Scenario scenario){
        System.out.println("This is called");
        tags = (List<String>) scenario.getSourceTagNames();
        System.out.println(tags);
        for (String tag:
             tags) {
            if(tag.contains(Constants.TEST_ID_PREFIX)){
                System.out.println("This is called too");
                TestData.addScenarioDataMap("testId",tag.replace(Constants.TEST_ID_PREFIX, ""));
            }
        }
    }

    @After
    public static void afterScenario(){
        tags.clear();
    }
}
