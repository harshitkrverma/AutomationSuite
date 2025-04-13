package mail.harshitkumarvermaAtgmail.com.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Utility class for interacting with web elements in Selenium.
 */
public class ElementHelper {

    private static Actions actions = new Actions(SeleniumHelper.getWebDriver());

    /**
     * Scrolls to the specified WebElement.
     *
     * @param webElement the WebElement to scroll to
     */
    public static void scrollToElement(WebElement webElement){
        actions.moveToElement(webElement).build().perform();
    }

    /**
     * Waits until the element is clickable, scrolls to it, and clicks on it.
     *
     * @param webElement the WebElement to click on
     */
    public static void clickOnElement(WebElement webElement){
        WaitHelper.waitForElementToBeClickable(webElement);
        scrollToElement(webElement);
        webElement.click();
    }

    /**
     * Waits for the element to be displayed, scrolls to it, and sends keys to it.
     *
     * @param webElement the WebElement to send keys to
     * @param keys       the string keys to send
     */
    public static void sendKeysToElement(WebElement webElement, String keys){
        WaitHelper.waitForElementToBeDisplayed(webElement);
        scrollToElement(webElement);
        webElement.sendKeys(keys);
    }

    /**
     * Retrieves the value of a specified attribute from the element.
     *
     * @param webElement the WebElement from which to get the attribute
     * @param attribute  the attribute name
     * @return the attribute value
     */
    public static String getAttributeOfElement(WebElement webElement, String attribute){
        WaitHelper.waitForElementToBeDisplayed(webElement);
        scrollToElement(webElement);
        return webElement.getAttribute(attribute);
    }

    /**
     * Retrieves the visible text of the specified WebElement.
     *
     * @param webElement the WebElement from which to get the text
     * @return the text content of the element
     */
    public static String getTextOfElement(WebElement webElement){
        WaitHelper.waitForElementToBeDisplayed(webElement);
        scrollToElement(webElement);
        return webElement.getText();
    }
}
