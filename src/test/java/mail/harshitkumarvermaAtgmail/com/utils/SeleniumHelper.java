package mail.harshitkumarvermaAtgmail.com.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumHelper {
    public static WebDriver webDriver;
    public static WebDriverWait webDriverWait;
    public static SeleniumHelper seleniumHelper;

    private SeleniumHelper(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setBrowserVersion("118");
        webDriver = new EdgeDriver(edgeOptions);
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(Constants.DEFAULT_TIMEOUTS_SECONDS));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_TIMEOUT_SECONDS));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT_SECONDS));
    }

    public static WebDriver getWebDriver(){
        if (seleniumHelper==null)
            seleniumHelper = new SeleniumHelper();
        return webDriver;
    }

    public static WebDriverWait getWebDriverWait(){
        return webDriverWait;
    }

    public static WebDriverWait getWebDriverWait(long  timeoutInSeconds){

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeoutInSeconds));
    }
    public static void openURL(String url){
        getWebDriver();
        webDriver.get(url);
    }

    public static <T> void pageFactoryInit(Class<T> tClass){
        PageFactory.initElements(getWebDriver(), tClass);
    }

}
