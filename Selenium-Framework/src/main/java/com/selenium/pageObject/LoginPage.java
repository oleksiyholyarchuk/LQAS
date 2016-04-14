package com.selenium.pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class LoginPage {
  
   /**
   * WebElement element 
   */
  private static WebElement element = null;
  
  /**
   * @param driver
   * @return let driver load the login page of facebook
   * @throws InterruptedException
   */
  public static WebDriver loadPage(WebDriver driver) {
      driver.get("https://facebook.com");
      return driver;
  }
   
  
  /**
   * @param driver
   * 
   * @return the textbox username of login form facebook
   */
  public static WebElement txtbx_UserName(WebDriver driver) throws ElementNotFoundException{
      element = driver.findElement(By.id("email"));
      return element;
  }
  
  /**
   * @param driver
   * @return the textbox passwork of login form facebook
   */
  public static WebElement txtbx_Password(WebDriver driver) throws ElementNotFoundException{
      element = driver.findElement(By.id("pass"));
      return element;
  }
  
  /**
   * @param driver
   * @return the button login of login form facebook
   */
  public static WebElement btn_LogIn(WebDriver driver) throws ElementNotFoundException{
      element = driver.findElement(By.id("loginbutton"));
      return element;
  }
}