package firstTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class FirstTestCase {
 
 private static WebDriver driver = null;
 
 public static void main(String[] args) {
 
 // ��������� ����� ������� �������� ��������
 
 driver = new FirefoxDriver(); 
 
 //���������� ������  ����������, ����� ����� ����-����� �������� �� ������� ���� ������� ���
 //������ ���������� ���������� �� ��������� ����������
 
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
 driver.get("https://github.com/login");
 
 // ��������� ������� � ID ��������� 'login_field' (Username)
 
 // ������� ��"� ����������� � ������� ��������� �� �������� �����.
 
 driver.findElement(By.id("login_field")).sendKeys("oleksiy.holyarchuk@gmail.com");
 
 // ��������� ������� �� ID ��������� 'password'
 
 // ������� ������ � ������� ��������� �� �������� �����.
 
 driver.findElement(By.id("password")).sendKeys("********");
 
 // ����� �������� �����. ���������� ������ ����� ��� ��� �� ��������
 
 driver.findElement(By.name("commit")).click();
 
 if (driver.findElement(By.name("q")).isDisplayed()) 
 { 
 // �������� ����������� ��� ����������� � ������� 
 System.out.println("Login to GitHub was been successfull."); 
 } 
 
 // ��������� �������
 
 driver.quit();
 
 }
 
}