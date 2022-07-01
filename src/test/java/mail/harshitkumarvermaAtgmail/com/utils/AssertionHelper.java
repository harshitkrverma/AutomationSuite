package mail.harshitkumarvermaAtgmail.com.utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AssertionHelper {
    public static void assertElementIsDisplayed(WebElement webElement){
        Assert.assertTrue(webElement.isDisplayed());
    }
}
