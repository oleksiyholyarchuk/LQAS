package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GitHubHomePage {

	WebDriver driver;
	By homePageName = By.xpath(".//*[@id='js-pjax-container']/div[1]/div/div/h2");
	
	public GitHubHomePage(WebDriver driver){
		this.driver = driver;
	}
	
	//Get the Page name from Home Page
	public String getHomePageDashboardName(){
		 return	driver.findElement(homePageName).getText();
		}
}