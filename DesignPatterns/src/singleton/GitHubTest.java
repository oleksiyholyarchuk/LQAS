package singleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GitHubTest {

    @Test
    public void testGithub() {
        WebDriver driver  = WebDriverSingleton.getWebDriverInstance();
        driver.navigate().to("http://www.github.com");
        WebDriverSingleton.closeWebBrowser();
    }
}