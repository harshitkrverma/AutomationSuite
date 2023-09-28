package mail.harshitkumarvermaAtgmail.com.utils;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class SeleniumHelper {
    public static WebDriver webDriver;
    public static WebDriverWait webDriverWait;
    public static SeleniumHelper seleniumHelper;


    private SeleniumHelper() {

//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setBrowserVersion("115");
//        chromeOptions.addArguments("--remote-allow-origins=*");
////        chromeOptions.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
//
////      chromeOptions.addArguments("--headless");
////       chromeOptions.addArguments("--no-sandbox");
//        webDriver = new ChromeDriver(chromeOptions);

        MutableCapabilities capabilities = new MutableCapabilities();
        HashMap<String, String> bstackOptions = new HashMap<>();
        bstackOptions.putIfAbsent("source", "cucumber-java:sample-master:v1.2");
        capabilities.setCapability("bstack:options", bstackOptions);
        try {
            webDriver = new RemoteWebDriver(
                    new URL("https://hub.browserstack.com/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

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
