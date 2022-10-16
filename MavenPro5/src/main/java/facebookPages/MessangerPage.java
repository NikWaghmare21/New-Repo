package facebookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessangerPage {
	@FindBy (xpath="//a[text()='Rooms']")
	private WebElement roomsLink;
	
	
	
	
	public MessangerPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickToRoomsLink() {
		roomsLink.click();
	}

}
