package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubHomePage {

	WebDriver driver;
	@FindBy(xpath=".//*[@id='js-pjax-container']/div[1]/div/div/h2")
	WebElement homePageName;
	
	public GitHubHomePage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	//Get the User name from Home Page
		public String getHomePageDashboardName(){
		 return	homePageName.getText();
		}
}