package mail.harshitkumarvermaAtgmail.com.stepdef;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import mail.harshitkumarvermaAtgmail.com.utils.SeleniumHelper;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Hooks {

    @AfterStep
    public static void afterStep(Scenario scenario){
        try {
            WebDriver driver = SeleniumHelper.getWebDriver();
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", String.valueOf(scenario.getLine()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
