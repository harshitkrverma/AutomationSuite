package mail.harshitkumarvermaAtgmail.com.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mail.harshitkumarvermaAtgmail.com.actions.HomePageActions;
import mail.harshitkumarvermaAtgmail.com.utils.PropertiesHelper;
import mail.harshitkumarvermaAtgmail.com.utils.SeleniumHelper;
import mail.harshitkumarvermaAtgmail.com.utils.TestData;

public class StepDefinitions {
    @Given("User navigates to the login page")
    public static void givenUserNavigatesToTheLoginPage(){
        SeleniumHelper.openURL(PropertiesHelper.getProperty("URL"));
    }

    @Then("User prints Test Data")
    public void userPrintsTestData() {
        System.out.println(TestData.getValidUsername());
    }

    @Then("User Enters username")
    public void userEntersUsername() {
        HomePageActions.enterUserName(TestData.getValidUsername());
    }
}
