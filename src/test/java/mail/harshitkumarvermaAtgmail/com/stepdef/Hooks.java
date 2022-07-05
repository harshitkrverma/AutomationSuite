package mail.harshitkumarvermaAtgmail.com.stepdef;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import mail.harshitkumarvermaAtgmail.com.utils.SeleniumHelper;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Random;


public class Hooks {
    @Before
    public static void beforeScenario(Scenario scenario){
        System.out.println("getId "+scenario.getId());
        System.out.println("getLine "+scenario.getLine());
        System.out.println("getName "+scenario.getName());

    }

    @AfterStep
    public static void afterStep(Scenario scenario){
        try {
            WebDriver driver = SeleniumHelper.getWebDriver();
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", String.valueOf(scenario.getLine()));
        } catch (Exception e) {
        }
    }

}
