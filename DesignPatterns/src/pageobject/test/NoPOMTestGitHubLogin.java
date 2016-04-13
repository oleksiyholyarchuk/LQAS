package pageobject.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NoPOMTestGitHubLogin {

	/**
	 * This test case will login in https://github.com/login
	 * Login to application
	 * Verify the home page using Dashboard message
	 */
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://github.com/login");
		//Find user name and fill user name
	    driver.findElement(By.id("login_field")).sendKeys("oleksiyholyarchuk");
	    //find password and fill it
	    driver.findElement(By.id("password")).sendKeys("1957xxxx");
	    //click login button
	    driver.findElement(By.name("commit")).click(); 
	    String homeText = driver.findElement(By.xpath(".//*[@id='js-pjax-container']/div[1]/div/div/h2")).getText();
	    //verify login success
		Assert.assertTrue(homeText.toLowerCase().contains(""));
		driver.quit();
	}
}