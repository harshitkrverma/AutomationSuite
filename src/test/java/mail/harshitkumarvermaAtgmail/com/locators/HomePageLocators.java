package mail.harshitkumarvermaAtgmail.com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
    @FindBy(how = How.XPATH, using = "//input[@type='text']")
    public static WebElement searchBox;

    @FindBy(how = How.XPATH, using = "(//input[@value='Google Search'])[1]")
    public static WebElement searchButton;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'HelloWorld')]")
    public static WebElement helloWorldLink;
}
