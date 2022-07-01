package mail.harshitkumarvermaAtgmail.com.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {
    public static Properties properties  = new Properties();
    static {
        try {
            properties.load(PropertiesHelper.class
                    .getResourceAsStream("/"+Constants.RESOURCE_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
