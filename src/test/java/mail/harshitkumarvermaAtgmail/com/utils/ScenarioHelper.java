package mail.harshitkumarvermaAtgmail.com.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.util.HashMap;
import java.util.List;

public class ScenarioHelper {
    private static List<String> tags;
    public static HashMap<String, String> scenarioDataMap = new HashMap<>();
    @Before
    public static void beforeScenario(Scenario scenario){
        tags = (List<String>) scenario.getSourceTagNames();
        for (String tag:
             tags) {
//            TODO: handle if no TestTag is present
            if(tag.contains(Constants.TEST_ID_PREFIX)){
                TestData.addScenarioDataMap("testId",tag.replace(Constants.TEST_ID_PREFIX, ""));
            }
        }
    }

    @After
    public static void afterScenario(){
        scenarioDataMap.clear();
        tags.clear();
    }
}
