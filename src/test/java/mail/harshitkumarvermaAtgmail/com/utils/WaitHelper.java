package mail.harshitkumarvermaAtgmail.com.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WaitHelper {
    public static WebElement waitForElementToBeDisplayed(WebElement webElement){
        return SeleniumHelper.getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
    }

    public static WebElement waitForElementToBeDisplayed(WebElement webElement, long timeOutInSeconds){
        return SeleniumHelper.getWebDriverWait(timeOutInSeconds).until(ExpectedConditions.visibilityOf(webElement));
    }

    public static WebElement waitForElementToBeClickable(WebElement webElement){
        return SeleniumHelper.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static WebElement waitForElementToBeClickable(WebElement webElement, long timOutInSeconds){
        return SeleniumHelper.getWebDriverWait(timOutInSeconds).until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
