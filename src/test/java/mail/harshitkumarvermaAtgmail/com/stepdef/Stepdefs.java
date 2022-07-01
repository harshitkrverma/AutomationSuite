package mail.harshitkumarvermaAtgmail.com.stepdef;

import io.cucumber.java.en.Given;
import mail.harshitkumarvermaAtgmail.com.utils.PropertiesHelper;
import mail.harshitkumarvermaAtgmail.com.utils.SeleniumHelper;

public class Stepdefs {
    @Given("User navigates to the login page")
    public static void givenUserNavigatesToTheLoginPage(){
        SeleniumHelper.openURL(PropertiesHelper.getProperty("URL"));
    }
}
