package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookPages.LoginPage;
import facebookPages.MessangerPage;
import facebookPages.RoomsPage;

public class VerifyRoomsPageButton {
    
	WebDriver driver;
	RoomsPage roomsPage;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium file\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@BeforeMethod
	public void beforeMethod(){
		driver.get("https://www.facebook.com/");
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.clickToMessggerLink();
		
		MessangerPage messangerPage=new MessangerPage(driver);
		messangerPage.clickToRoomsLink();
		
		roomsPage=new RoomsPage(driver);
		
	}
	
	@Test
	public void test1() {
		roomsPage.clickToreturnToMessangerLink();
		
	}
	
	@Test
	public void test2() {
		roomsPage.clickToVisitToHelpCentreLink();
	}
	
	
	
	
	
	
}
