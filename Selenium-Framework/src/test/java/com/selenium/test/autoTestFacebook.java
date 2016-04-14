package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.selenium.pageObject.LoginPage;
import com.selenium.userAction.PostStatus;
import com.selenium.userAction.SignIn;
import com.selenium.util.DriverUtil;

public class autoTestFacebook {
  
  /**
   * Create WebDriver as static variable
   */
  private static WebDriver driver;
  private static String username_login;
  private static String password_login;
  private static String status_facebook;
  
  /**
 * Setup some variable to run script test, load from the file TestNg.xml
 * Parameters in annotation Parameters will match with define in TestNG.xml 
 */
@Parameters({"browser","status","username","password"})   
@BeforeTest
  public void beforeTest(String browser, String status, String username, String password) {
   if(browser.equalsIgnoreCase("firefox")) {
        driver = new FirefoxDriver();
    }else if (browser.equalsIgnoreCase("ie")) { 
        // Here I am setting up the path for my IEDriver
        System.setProperty("webdriver.ie.driver", DriverUtil.getIeDriver());
        driver = new InternetExplorerDriver();
    }else if (browser.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver", DriverUtil.getChromeDriver());
        driver = new ChromeDriver();
    } 
   username_login = username;
   status_facebook = status;
   password_login = password;
  }
  
  /**
 * test script calls action class here
 * @throws ElementNotFoundException 
 */
@Test
  public void f() throws ElementNotFoundException {
    LoginPage.loadPage(driver);
    SignIn.Execute(driver, username_login, password_login);
    PostStatus.Execute(driver, status_facebook);
  }
  
  
  /**
 * after run of script test , closing browser
 */
@AfterTest
  public void afterTest() {
    driver.quit();
  } 
}