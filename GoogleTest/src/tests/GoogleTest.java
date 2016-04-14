package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.GooglePage;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	void setup() throws Exception{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--test-type");
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(ChromeOptions.CAPABILITY, options);
		setChromeDriver();
		driver = new ChromeDriver(capability);
		//driver = new FirefoxDriver();
		driver.get("https://www.google.com.ua");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testPage1() throws InterruptedException{
		//driver.get("https://www.google.com.ua");
		GooglePage google = new GooglePage(driver);
		google.searchText("lqas");
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("lqas"));
		
		Assert.assertTrue(google.isSearchItemsQuantityCorrect(), "items quantity was not 7");
	}
	
	@AfterMethod
	void tearDown(){
		driver.quit();
	}
	
	private void setChromeDriver() throws Exception {
		String osName = System.getProperty("os.name").toLowerCase();
		StringBuffer chromeBinaryPath = new StringBuffer(
				"drivers/");

		if (osName.startsWith("win")) {
			chromeBinaryPath.append("chrome-win/chromedriver.exe");
		} else if (osName.startsWith("lin")) {
			chromeBinaryPath.append("chrome-lin/chromedriver");
		} else if (osName.startsWith("mac")) {
			chromeBinaryPath.append("chrome-mac/chromedriver");
		} else
			throw new Exception("Your OS is invalid for webdriver tests");

		System.setProperty("webdriver.chrome.driver",
				chromeBinaryPath.toString());
	}

}
