package pageobject.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import pagefactory.GitHubHomePage;
import pagefactory.GitHubLogin;


public class TestGitHubLoginWithPageFactory {

	WebDriver driver;
	GitHubLogin objLogin;
	GitHubHomePage objHomePage;
	
	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://github.com/login");
	}

	/**
	 * This test go to https://github.com/login
	 * Login to application
	 * Verify the home page using Dashboard message
	 */
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
		//Create Login Page object
	objLogin = new GitHubLogin(driver);
	//login to application
	objLogin.loginToGitHub("oleksiyholyarchuk", "1957xxxx");
	// go the next page
	objHomePage = new GitHubHomePage(driver);
	//Verify home page
	AssertJUnit.assertTrue(objHomePage.getHomePageDashboardName().toLowerCase().contains(" "));
	}
	
	@AfterTest
	  public void afterTest() {
		  driver.quit();
	  }
	
}