package mail.harshitkumarvermaAtgmail.com.utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;

public class TestData {
    private static final String JSON_FILE_PATH = Constants.TEST_DATA;


    public static String getValidUsername() {
        return getTestData("username");
    }


    public static String getTestData(String key) {
        try (FileReader reader = new FileReader(JSON_FILE_PATH)) {
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            return jsonObject.getAsJsonObject(getScenarioDataMap("testId")).get(key).getAsString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void addScenarioDataMap(String key, String value){
        ScenarioHelper.scenarioDataMap.put(key, value);
    }

    public static String getScenarioDataMap(String key){
        return ScenarioHelper.scenarioDataMap.get(key);
    }
}
