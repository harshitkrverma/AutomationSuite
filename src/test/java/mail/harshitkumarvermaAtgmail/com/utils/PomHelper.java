package mail.harshitkumarvermaAtgmail.com.utils;

import org.openqa.selenium.WebElement;

/**
 * Helper class to resolve and initialize Page Object Model (POM) locators dynamically.
 */
public class PomHelper {

    /**
     * Resolves a WebElement from a locator string formatted as ClassName.fieldName.
     *
     * @param locatorString the string representation of the locator (e.g., "LoginPage.usernameField")
     * @return the WebElement identified by the locator
     */
    public static WebElement LocatorHelper(String locatorString) {
        try {
            String className = locatorString.split("\\.")[0];
            String locator = locatorString.split("\\.")[1];

            Class<?> clazz = Class.forName("mail.harshitkumarvermaAtgmail.com.locators." + className);
            SeleniumHelper.pageFactoryInit(clazz);

            return (WebElement) clazz.getDeclaredField(locator).get(null); // Access static field
        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Unable to locate element: " + locatorString, e);
        }
    }
}
