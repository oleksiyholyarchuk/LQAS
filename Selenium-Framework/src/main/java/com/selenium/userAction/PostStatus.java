package com.selenium.userAction;

import org.openqa.selenium.WebDriver;

import com.selenium.pageObject.HomePage;

public class PostStatus {
  
  /**
   * @param driver
   * @param status
   * execute post status in facebook
   */
  public static void Execute(WebDriver driver, String status){
      HomePage.txt_status(driver).sendKeys(status);
      HomePage.butt_post(driver).click();
  }
  
}