package mail.harshitkumarvermaAtgmail.com.utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SeleniumHelper {
    public static WebDriver webDriver;
    public static WebDriverWait webDriverWait;
    public static SeleniumHelper seleniumHelper;

    SeleniumHelper(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        webDriver = new ChromeDriver(chromeOptions);
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(Constants.DEFAULT_TIMEOUTS_SECONDS));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_TIMEOUT_SECONDS));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT_SECONDS));
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }

    public static WebDriverWait getWebDriverWait(){
        return webDriverWait;
    }

    public static WebDriverWait getWebDriverWait(long  timeoutInSeconds){

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeoutInSeconds));
    }
    public static void openURL(String url){
        setWebDriver();
        webDriver.get(url);
    }

    public static void setWebDriver(){
        if (seleniumHelper==null)
            seleniumHelper = new SeleniumHelper();
    }

    public static <T> T pagefactoryInit(Class<T> tClass){
        return PageFactory.initElements(getWebDriver(),tClass);
    }

    public static void main(String[] args) {
        openURL("https://www.youtube.com/watch?v=DSLQYTt8BjA");
    }
}
