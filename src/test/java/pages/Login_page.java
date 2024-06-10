package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class Login_page extends BasePage {
	
	static WebDriver driver;
	
	public Login_page() {
		
		 super(driver=BaseTest.getDriver());
		
		addObject("username_Textbox", By.xpath("//input[@id='username']"));
		addObject("password_TextBox", By.xpath("//input[@id='password']"));
		addObject("Login_Button", By.xpath("//input[@id='login']"));
	}

}
