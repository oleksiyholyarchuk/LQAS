package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {
	
	WebDriver driver;
	
	public GooglePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void searchText(String text){
		WebElement searchTextBox = driver.findElement(By.id("gs_htif0"));
		searchTextBox.sendKeys(text);
	}
	
	public boolean isSearchItemsQuantityCorrect(){
		List <WebElement> searchList = new ArrayList<WebElement>();
		searchList = driver.findElements(By.xpath("//div[contains(@class,'srg')]/li | //li[contains(@class,'g') and ancestor::*[@id='rso']]"));
		isSearchItemsQuantityCorrect2();
		if (searchList.size() == 7){
			return true;
		} else return false;
	}
	
	public boolean isSearchItemsQuantityCorrect2(){
		List <WebElement> searchList = new ArrayList<WebElement>();
		searchList = driver.findElements(By.xpath("//div[contains(@class,'srg')]/li | //li[contains(@class,'g') and ancestor::*[@id='rso']]"));
		if (searchList.size() == 7){
			return true;
		} else return false;
	}
	/*
	private ExpectedCondition<WebElement> optionWithValueDisplayed(final String value) {
		return new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver webDriver) {
					return webDriver.findElement(By.cssSelector("option[value='" + value + "']") );
				}
			};			
	}*/
}

