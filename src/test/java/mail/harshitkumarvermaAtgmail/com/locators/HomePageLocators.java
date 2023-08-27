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

//    @FindBy(how = How.XPATH, using = "")
//    public static WebElement x;
//    @FindBy(how = How.XPATH, using = "")
//    public static WebElement x;
//    @FindBy(how = How.XPATH, using = "")
//    public static WebElement x;
//    @FindBy(how = How.XPATH, using = "")
//    public static WebElement x;
}
