package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFatory;

public class LoginTest {
	
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToLogin() {
		 driver = BrowserFatory.init();
		 
		  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		  loginPage.insertUserName("demo@techfios.com");
		  loginPage.insertPassword("abc123");
		  loginPage.clickSignInButton();
	}

}
