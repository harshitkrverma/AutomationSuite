package mail.harshitkumarvermaAtgmail.com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
    @FindBy(how = How.XPATH, using = "//input[@id='user-name']")
    public static WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    public static WebElement password;

    @FindBy(how = How.XPATH, using = "//input[@id='login-button']")
    public static WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Swag Labs')]")
    public static WebElement banner;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'this user has been locked out')]")
    public static WebElement lockedOut;

//    @FindBy(how = How.XPATH, using = "")
//    public static WebElement x;
}
