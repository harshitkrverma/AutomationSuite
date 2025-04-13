package mail.harshitkumarvermaAtgmail.com.utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;

/**
 * Utility class to manage scenario-specific test data loaded from a JSON file.
 */
public class TestData {

    private static final String JSON_FILE_PATH = Constants.TEST_DATA;

    /**
     * Retrieves the valid username from the JSON data.
     *
     * @return valid username as string
     */
    public static String getValidUsername() {
        return getTestData("username");
    }

    /**
     * Retrieves test data for the given key from the scenario-specific block in the JSON file.
     *
     * @param key key for which data is required
     * @return data as string
     */
    public static String getTestData(String key) {
        try (FileReader reader = new FileReader(JSON_FILE_PATH)) {
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            return jsonObject.getAsJsonObject(getScenarioDataMap("testId"))
                    .get(key)
                    .getAsString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Adds a key-value pair to the scenario data map.
     *
     * @param key   map key
     * @param value map value
     */
    public static void addScenarioDataMap(String key, String value){
        ScenarioHelper.scenarioDataMap.put(key, value);
    }

    /**
     * Retrieves a value from the scenario data map for the given key.
     *
     * @param key map key
     * @return map value
     */
    public static String getScenarioDataMap(String key){
        return ScenarioHelper.scenarioDataMap.get(key);
    }
}
