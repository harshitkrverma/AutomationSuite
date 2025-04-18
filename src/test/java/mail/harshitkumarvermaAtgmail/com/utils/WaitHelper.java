package mail.harshitkumarvermaAtgmail.com.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Utility class to handle explicit wait conditions for Selenium WebElements.
 */
public class WaitHelper {

    /**
     * Waits until the element is visible using default timeout.
     *
     * @param webElement element to wait for
     * @return visible WebElement
     */
    public static WebElement waitForElementToBeDisplayed(WebElement webElement){
        return SeleniumHelper.getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
    }

    /**
     * Waits until the element is visible using a custom timeout.
     *
     * @param webElement       element to wait for
     * @param timeOutInSeconds timeout value in seconds
     * @return visible WebElement
     */
    public static WebElement waitForElementToBeDisplayed(WebElement webElement, long timeOutInSeconds){
        return SeleniumHelper.getWebDriverWait(timeOutInSeconds).until(ExpectedConditions.visibilityOf(webElement));
    }

    /**
     * Waits until the element is clickable using default timeout.
     *
     * @param webElement element to wait for
     * @return clickable WebElement
     */
    public static WebElement waitForElementToBeClickable(WebElement webElement){
        return SeleniumHelper.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
    }

    /**
     * Waits until the element is clickable using a custom timeout.
     *
     * @param webElement      element to wait for
     * @param timOutInSeconds timeout value in seconds
     * @return clickable WebElement
     */
    public static WebElement waitForElementToBeClickable(WebElement webElement, long timOutInSeconds){
        return SeleniumHelper.getWebDriverWait(timOutInSeconds).until(ExpectedConditions.elementToBeClickable(webElement));
    }

    /**
     * Waits until the page is fully loaded.
     */
    public static void waitForPageToLoad() {
        SeleniumHelper.getWebDriverWait().until((ExpectedCondition<Boolean>) webDriver ->
        {
            assert webDriver != null;
            return ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete");
        });
    }
}
