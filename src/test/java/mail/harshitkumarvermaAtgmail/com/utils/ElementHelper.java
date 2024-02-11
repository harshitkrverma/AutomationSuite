package mail.harshitkumarvermaAtgmail.com.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementHelper {
    private static Actions actions = new Actions(SeleniumHelper.getWebDriver());
    private static final JavascriptExecutor js = (JavascriptExecutor) SeleniumHelper.getWebDriver();


    public static void scrollToElement(WebElement webElement){
        actions.moveToElement(webElement).build().perform();
    }

    public static void clickOnElement(WebElement webElement){
        WaitHelper.waitForElementToBeClickable(webElement);
        scrollToElement(webElement);
        webElement.click();
    }

    public static void sendKeysToElement(WebElement webElement, String keys){
        WaitHelper.waitForElementToBeDisplayed(webElement);
        scrollToElement(webElement);
        webElement.sendKeys(keys);
    }

    public static String getAttributeOfElement(WebElement webElement, String attribute){
        WaitHelper.waitForElementToBeDisplayed(webElement);
        scrollToElement(webElement);
        return webElement.getAttribute(attribute);
    }

    public static String getTextOfElement(WebElement webElement){
        WaitHelper.waitForElementToBeDisplayed(webElement);
        scrollToElement(webElement);
        return webElement.getText();
    }

    public static void clickViaJsExecutor(WebElement webElement) {
        js.executeScript("arguments[0].click();", webElement);
    }

    //TODO
    /*
     * Element helper method to verify other attributes via js also generic js executor method.
     */
}
