package firstTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class FirstTestCase {
 
 private static WebDriver driver = null;
 
 public static void main(String[] args) {
 
 // Створюємо новий інстанс Файрфокс драйвера
 
 driver = new FirefoxDriver(); 
 
 //Вставляємо неявне  очікування, тобто пошук будь-якого елементу на сторінці може зайняти час
 //Неявне очікування виставлене до викидання виключення
 
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
 driver.get("https://github.com/login");
 
 // Знаходимо елемент з ID атрибутом 'login_field' (Username)
 
 // Вводимо ім"я користувача в елемент знайдений по описанню нижче.
 
 driver.findElement(By.id("login_field")).sendKeys("oleksiy.holyarchuk@gmail.com");
 
 // Знаходимо елемент із ID атрибутом 'password'
 
 // Вводимо пароль в елемент знайдений по описанню нижче.
 
 driver.findElement(By.id("password")).sendKeys("********");
 
 // Тепер забмітимо форму. ВебДрайвер знайде форму для нас по елементу
 
 driver.findElement(By.name("commit")).click();
 
 if (driver.findElement(By.name("q")).isDisplayed()) 
 { 
 // Виводимо повідомлення про авторизацію в консоль 
 System.out.println("Login to GitHub was been successfull."); 
 } 
 
 // Закриваємо драйвер
 
 driver.quit();
 
 }
 
}