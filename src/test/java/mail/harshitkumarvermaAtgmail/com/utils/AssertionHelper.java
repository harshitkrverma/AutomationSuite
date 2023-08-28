package mail.harshitkumarvermaAtgmail.com.utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AssertionHelper {
    public static void assertElementIsDisplayed(WebElement webElement){
        Assert.assertTrue(webElement.isDisplayed());
    }

    public static void assertValidLocator(String locator){
        Assert.assertTrue(locator.contains("."));
    }

    public static void assertNotNull(String value){
        Assert.assertNotNull(value);
    }

    public static void assertTextMatch(String expected, String actual){
        Assert.assertEquals(expected, actual);
    }

    public static void assertContainsText(String expected, String actual){
        Assert.assertTrue(actual.contains(expected));
    }
}
