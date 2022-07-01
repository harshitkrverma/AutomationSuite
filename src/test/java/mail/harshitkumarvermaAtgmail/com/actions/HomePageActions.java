package mail.harshitkumarvermaAtgmail.com.actions;

import mail.harshitkumarvermaAtgmail.com.locators.HomePageLocators;
import mail.harshitkumarvermaAtgmail.com.utils.ElementHelper;
import mail.harshitkumarvermaAtgmail.com.utils.SeleniumHelper;
import org.openqa.selenium.support.ui.Select;

public class HomePageActions {
    static {
        SeleniumHelper.pagefactoryInit(HomePageLocators.class);
    }

    public static void searchBoxSendText(String inputText){
        ElementHelper.sendKeysToElement(HomePageLocators.searchBox,inputText);
    }

    public static void searchButtonClick(){
        ElementHelper.clickOnElement(HomePageLocators.searchButton);
        Select select = new Select(HomePageLocators.searchButton);
    }

}
