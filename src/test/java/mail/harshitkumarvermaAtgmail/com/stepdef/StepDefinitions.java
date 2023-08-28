package mail.harshitkumarvermaAtgmail.com.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mail.harshitkumarvermaAtgmail.com.actions.HomePageActions;
import mail.harshitkumarvermaAtgmail.com.utils.*;
import org.openqa.selenium.WebElement;

public class StepDefinitions {
    @Given("User navigates to the login page")
    public static void givenUserNavigatesToTheLoginPage(){
        SeleniumHelper.openURL(PropertiesHelper.getProperty("URL"));
    }


    @Then("User Enters username")
    public void userEntersUsername() {
        HomePageActions.enterUserName(TestData.getValidUsername());
    }

    @Then("User Enters {string} in field {string}")
    public void userEntersInField(String value, String locatorString){
        AssertionHelper.assertValidLocator(locatorString);
        AssertionHelper.assertNotNull(value);
        WebElement element = PomHelper.LocatorHelper(locatorString);
        ElementHelper.sendKeysToElement(element, TestData.getTestData(value));
    }

    @Then("User Clicks on {string}")
    public void userClicksOn(String locatorString) {
        AssertionHelper.assertValidLocator(locatorString);
        WebElement element = PomHelper.LocatorHelper(locatorString);
        ElementHelper.clickOnElement(element);
    }

    @Then("User verifies {string} text is present at {string}")
    public void userVerifiesTextIsPresentAt(String value, String locatorString) {
        AssertionHelper.assertValidLocator(locatorString);
        AssertionHelper.assertNotNull(value);
        WebElement element = PomHelper.LocatorHelper(locatorString);
        String actualVal = ElementHelper.getTextOfElement(element);
        AssertionHelper.assertTextMatch(value, actualVal);
    }
}
