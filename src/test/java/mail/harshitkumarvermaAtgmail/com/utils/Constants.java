package mail.harshitkumarvermaAtgmail.com.utils;

/**
 * Holds constant configuration values used across the Selenium test automation framework.
 */
public class Constants {

    /**
     * Default timeout for explicit waits in seconds.
     */
    public static int DEFAULT_TIMEOUTS_SECONDS = 90;

    /**
     * Default screen size resolution for browser window.
     */
    public static String DEFAULT_SCREEN_SIZE = "1920x1040";

    /**
     * Default timeout for implicit waits in seconds.
     */
    public static int IMPLICIT_TIMEOUT_SECONDS = 30;

    /**
     * Timeout for page load operations in seconds.
     */
    public static int PAGE_LOAD_TIMEOUT_SECONDS = 60;

    /**
     * Base URL of the application under test.
     */
    public static String URL = "https://www.swiggy.com/";

    /**
     * Path to the resource properties file.
     */
    public static String RESOURCE_FILE = "Resource.properties";

    /**
     * Timeout for connection operations in milliseconds.
     */
    public static int CONNECTION_TIMEOUT = 60000;

    /**
     * Path to the test data JSON file.
     */
    public static String TEST_DATA = "src/test/resources/data/testdata.json";

    /**
     * Prefix used to identify scenario test IDs.
     */
    public static String TEST_ID_PREFIX = "@Test_id_";
}
