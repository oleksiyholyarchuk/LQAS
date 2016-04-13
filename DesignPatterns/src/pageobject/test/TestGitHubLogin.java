package pageobject.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.pages.GitHubHomePage;
import pageobject.pages.GitHubLogin;

public class TestGitHubLogin {

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
	 * This test case will login in https://github.com/login
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
	Assert.assertTrue(objHomePage.getHomePageDashboardName().toLowerCase().contains(""));
	}	
	
	@AfterTest
	  public void afterTest() {
		  driver.quit();
	  }
	
}