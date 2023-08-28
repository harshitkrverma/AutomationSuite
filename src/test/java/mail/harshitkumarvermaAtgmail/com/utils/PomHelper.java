package mail.harshitkumarvermaAtgmail.com.utils;

import org.openqa.selenium.WebElement;

public class PomHelper {
    private static String className;
    PomHelper() {
        try {
            SeleniumHelper.pageFactoryInit(Class.forName("mail.harshitkumarvermaAtgmail.com.locators."+className));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static WebElement LocatorHelper(String locatorString){

        className = locatorString.split("\\.")[0];
        String locator = locatorString.split("\\.")[1];
        new PomHelper();

        try {
            return  (WebElement) Class.forName("mail.harshitkumarvermaAtgmail.com.locators."+className).
                    getDeclaredField(locator).get(className);
        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
