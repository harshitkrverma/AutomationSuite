package mail.harshitkumarvermaAtgmail.com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Utility class for interacting with web elements in Selenium.
 */
public class ElementHelper {

    private static final Actions actions = new Actions(SeleniumHelper.getWebDriver());

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

    /**
     * Get Current URL of the page.
     */
    public static String getCurrentURL() {
        return SeleniumHelper.getWebDriver().getCurrentUrl();
    }

    /**
     * Crawls all links on the current page, skips third-party/external URLs,
     * clicks each valid link, and verifies no errors are present.
     */
    public static void testAllLinksOnPage(String baseUrl) {
        WebDriver driver = SeleniumHelper.getWebDriver();
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String href = getAttributeOfElement(link, "href");

            // Skip invalid or external links
            if (href == null || href.isEmpty() ||
                    href.startsWith("mailto:") ||
                    href.startsWith("tel:") ||
                    href.startsWith("javascript:") ||
                    (!href.startsWith(baseUrl) && !href.startsWith("/"))) {
                System.out.println("Skipping link: " + href);
                continue;
            }

            try {
                System.out.println("Testing link: " + href);
                clickOnElement(link); // Click the link
                WaitHelper.waitForPageToLoad(); // Wait for the page to load

                // Verify the page does not contain common error messages
                String pageSource = driver.getPageSource();
                if (pageSource.contains("404") || pageSource.contains("500") || pageSource.contains("Error")) {
                    System.err.println("Error found on page: " + href);
                }

                // Navigate back to the original page
                driver.navigate().back();
                WaitHelper.waitForPageToLoad();
            } catch (Exception e) {
                System.err.println("Failed to test link: " + href);
                e.printStackTrace();
            }
        }
    }
}
