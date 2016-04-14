package com.selenium.userAction;

import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.selenium.pageObject.LoginPage;

public class SignIn {

  /**
   * @param driver
   * @param username
   * @param password
   * execute login to facebook
 * @throws ElementNotFoundException 
   */
  public static void Execute(WebDriver driver , String username, String password) throws ElementNotFoundException {
      LoginPage.loadPage(driver);
      LoginPage.txtbx_UserName(driver).sendKeys(username);
      LoginPage.txtbx_Password(driver).sendKeys(password);
      LoginPage.btn_LogIn(driver).click();
  }

}