package mail.harshitkumarvermaAtgmail.com.utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

/**
 * Utility class for common assertions used in Selenium test automation.
 */
public class AssertionHelper {

    /**
     * Verifies that the given WebElement is displayed on the page.
     *
     * @param webElement the WebElement to verify
     */
    public static void assertElementIsDisplayed(WebElement webElement) {
        Assert.assertTrue("Element is not displayed", webElement.isDisplayed());
    }

    /**
     * Asserts that the locator string is valid (contains a dot to separate class and field).
     *
     * @param locator the locator string to check
     */
    public static void assertValidLocator(String locator) {
        Assert.assertTrue("Invalid locator format", locator.contains("."));
    }

    /**
     * Asserts that the provided value is not null.
     *
     * @param value the string to verify
     */
    public static void assertNotNull(String value) {
        Assert.assertNotNull("Value is null", value);
    }

    /**
     * Asserts that two strings match exactly.
     *
     * @param expected the expected string
     * @param actual   the actual string
     */
    public static void assertTextMatch(String expected, String actual) {
        Assert.assertEquals("Text does not match", expected, actual);
    }

    /**
     * Asserts that the actual string contains the expected substring.
     *
     * @param expected the expected substring
     * @param actual   the actual string
     */
    public static void assertContainsText(String expected, String actual) {
        Assert.assertTrue("Actual text does not contain expected", actual.contains(expected));
    }

    /**
     * Asserts that the actual string does NOT contain the unexpected substring.
     *
     * @param unexpected the substring that should not be present
     * @param actual     the actual string
     */
    public static void assertDoesNotContainText(String unexpected, String actual) {
        Assert.assertFalse("Actual text contains unexpected string: " + unexpected, actual.contains(unexpected));
    }
}
