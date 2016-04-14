package com.selenium.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

  /**
   * WebElement
   */
  private static WebElement element;
  
  /**
   * @param driver
   * @return textbox update status element
   */
  public static WebElement txt_status(WebDriver driver) {
      element = driver.findElement(By.xpath("//div[@id='pagelet_composer']/div/div/div"));
      //element = driver.findElement(By.xpath("//div[@id='pagelet_composer']/div/div/div/form[1]/div[1]/div[2]/div/div/div[2]/div/div/textarea"));
      return element;
  }
  
  /**
   * @param driver
   * @return button to post status
   */
  public static WebElement butt_post(WebDriver driver){
      element = driver.findElement(By.xpath("//button[contains(.,'Опублікувати')]"));
      return element;
  }
}