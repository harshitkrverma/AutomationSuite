package mail.harshitkumarvermaAtgmail.com.utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TestData {
    private static final String JSON_FILE_PATH = Constants.TEST_DATA;
    public static HashMap<String, String> scenarioDataMap = new HashMap<>();

    public static String getValidUsername() {
        return getTestData("username");
    }

    public static String getValidPassword() {
        return getTestData("password");
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
        scenarioDataMap.put(key, value);
        System.out.println("test hashmap: "+scenarioDataMap);
    }

    public static String getScenarioDataMap(String key){
        return scenarioDataMap.get(key);
    }
}
