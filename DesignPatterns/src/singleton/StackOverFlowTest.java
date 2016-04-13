package singleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class StackOverFlowTest {

    @Test
    public void testStackOverFlow() {
        WebDriver driver  = WebDriverSingleton.getWebDriverInstance();
        driver.navigate().to("http://www.stackoverflow.com");
        WebDriverSingleton.closeWebBrowser();
    }
}
