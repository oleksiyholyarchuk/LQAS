package automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j {

	private static WebDriver driver = null;
    private static Logger Log = Logger.getLogger(Log4j.class.getName());

	public static void main(String[] args) {

		DOMConfigurator.configure("log4j.xml");
		// Створюємо новий інстанс Файрфокс драйвера

		driver = new FirefoxDriver();
		Log.info("New driver instantiated");
		
		// Вставляємо неявне очікування, тобто пошук будь-якого елементу на
		// сторінці може зайняти час
		// Неявне очікування виставлене до викидання виключення

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Log.info("Implicit wait applied on the driver for 10 seconds");

		driver.get("https://github.com/login");
		Log.info("GitHub launched");

		// Знаходимо елемент з ID атрибутом 'login_field' (Username)
		// Вводимо ім"я користувача в елемент знайдений по описанню нижче.

		driver.findElement(By.id("login_field")).sendKeys(
				"oleksiy.holyarchuk@gmail.com");
		Log.info("Login entered into login_field textbox");

		// Знаходимо елемент із ID атрибутом 'password'

		// Вводимо пароль в елемент знайдений по описанню нижче.

		driver.findElement(By.id("password")).sendKeys("********");
		Log.info("Password entered into wassword textbox");

		// Тепер cабмітимо форму. ВебДрайвер знайде форму для нас по елементу

		driver.findElement(By.name("commit")).click();
        Log.info("Click action performed on Submit button");

		if (driver.findElement(By.name("q")).isDisplayed()) {
			// Виводимо повідомлення про авторизацію в консоль
			System.out.println("Login to GitHub was been successfull.");
		}

		// Закриваємо драйвер

		driver.quit();
		Log.info("Browser closed");

	}

}