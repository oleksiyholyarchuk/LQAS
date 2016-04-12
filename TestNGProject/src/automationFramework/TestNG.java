package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG {
	
	public WebDriver driver;
	
  @Test
  public void main() {
	  
	  // ��������� ������� � ID ��������� 'login_field' (Username)
	  
	  // ������� ��"� ����������� � ������� ��������� �� �������� �����.
	  
	  driver.findElement(By.id("login_field")).sendKeys("oleksiy.holyarchuk@gmail.com");
	  
	  // ��������� ������� �� ID ��������� 'password'
	  
	  // ������� ������ � ������� ��������� �� �������� �����.
	  
	  driver.findElement(By.id("password")).sendKeys("********");
	  
	  // ����� �������� �����. ���������� ������ ����� ��� ��� �� ��������
	  
	  driver.findElement(By.name("commit")).click();
	  
	  // if (driver.findElement(By.name("q")).isDisplayed()) 
	 
	  Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
		
		WebElement source = driver.findElement(By.name("q"));
		
		// Assertion on correctness of user name
		
		Assert.assertEquals("", source.getText());
	  
	  { 
	  // �������� ����������� ��� ����������� � ������� 
	  System.out.println("Login to GitHub was been successfull."); 
	  } 
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	// ��������� ����� ������� �������� ��������
	  
	driver = new FirefoxDriver(); 
	//���������� ������  ����������, ����� ����� ����-����� �������� �� ������� ���� ������� ���
	//������ ���������� ���������� �� ��������� ����������
		  
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    //��������� GitHub
	driver.get("https://github.com/login");
		  
		  
  }

  @AfterMethod
  public void afterMethod() {
	// ��������� �������
	  driver.quit();
  }

}
