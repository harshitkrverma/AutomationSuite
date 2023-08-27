package mail.harshitkumarvermaAtgmail.com.actions;

import mail.harshitkumarvermaAtgmail.com.locators.HomePageLocators;
import mail.harshitkumarvermaAtgmail.com.utils.ElementHelper;
import mail.harshitkumarvermaAtgmail.com.utils.SeleniumHelper;

public class HomePageActions {
    static {
        SeleniumHelper.pageFactoryInit(HomePageLocators.class);
    }

    public static void enterUserName(String userName){
        ElementHelper.sendKeysToElement(HomePageLocators.userName, userName);
    }

    public static void enterPassword(String password){
        ElementHelper.sendKeysToElement(HomePageLocators.password, password);
    }

    public static void clickLoginButton(){
        ElementHelper.clickOnElement(HomePageLocators.loginButton);
    }
}
