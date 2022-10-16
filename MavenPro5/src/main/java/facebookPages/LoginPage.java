package facebookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (xpath="//a[@title='Take a look at Messenger.']")
	private WebElement messangerLink;
	
	
	
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickToMessggerLink() {
		messangerLink.click();
	} //Nikhil

}
