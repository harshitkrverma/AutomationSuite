package mail.harshitkumarvermaAtgmail.com.actions;

import mail.harshitkumarvermaAtgmail.com.locators.GoogleSearchLocators;
import mail.harshitkumarvermaAtgmail.com.utils.ElementHelper;
import mail.harshitkumarvermaAtgmail.com.utils.SeleniumHelper;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearchActions {

    static {
        SeleniumHelper.pageFactoryInit(GoogleSearchLocators.class);
    }
    public static void searchBoxSendText(String inputText){
        ElementHelper.sendKeysToElement(GoogleSearchLocators.searchBox,inputText);
    }

    public static void searchButtonClick(){
        ElementHelper.clickOnElement(GoogleSearchLocators.searchButton);
        Select select = new Select(GoogleSearchLocators.searchButton);
    }
}
