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
	  
	  // Знаходимо елемент з ID атрибутом 'login_field' (Username)
	  
	  // Вводимо ім"я користувача в елемент знайдений по описанню нижче.
	  
	  driver.findElement(By.id("login_field")).sendKeys("oleksiy.holyarchuk@gmail.com");
	  
	  // Знаходимо елемент із ID атрибутом 'password'
	  
	  // Вводимо пароль в елемент знайдений по описанню нижче.
	  
	  driver.findElement(By.id("password")).sendKeys("********");
	  
	  // Тепер забмітимо форму. ВебДрайвер знайде форму для нас по елементу
	  
	  driver.findElement(By.name("commit")).click();
	  
	  // if (driver.findElement(By.name("q")).isDisplayed()) 
	 
	  Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
		
		WebElement source = driver.findElement(By.name("q"));
		
		// Assertion on correctness of user name
		
		Assert.assertEquals("", source.getText());
	  
	  { 
	  // Виводимо повідомлення про авторизацію в консоль 
	  System.out.println("Login to GitHub was been successfull."); 
	  } 
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	// Створюємо новий інстанс Файрфокс драйвера
	  
	driver = new FirefoxDriver(); 
	//Вставляємо неявне  очікування, тобто пошук будь-якого елементу на сторінці може зайняти час
	//Неявне очікування виставлене до викидання виключення
		  
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    //запускаємо GitHub
	driver.get("https://github.com/login");
		  
		  
  }

  @AfterMethod
  public void afterMethod() {
	// Закриваємо драйвер
	  driver.quit();
  }

}
