package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class Book_Hotelpage extends BasePage{

	static WebDriver driver;
	public Book_Hotelpage() {
		super(driver=BaseTest.getDriver());
		
		addObject("Fullname_textbox", By.xpath("//input[@id='first_name']"));
		addObject("LastName_textBox", By.xpath("//input[@id='last_name']"));
		addObject("Adderss_textBar", By.xpath("//textarea[@id='address']"));
		addObject("CreditCardnum_textBox", By.xpath("//input[@id='cc_num']"));
		addObject("Cardtype", By.xpath("//Select[@id='cc_type']"));
		addObject("cardExpiryDate", By.xpath("//Select[@id='cc_exp_month']"));
		addObject("CardYear",By.xpath("//Select[@id='cc_exp_year']"));
		addObject("cvvnum", By.xpath("//input[@id='cc_cvv']"));
		addObject("BookNowButton", By.xpath("//input[@id='book_now']"));
		addObject("CancelButtton", By.xpath("//input[@id='cancel']"));
		addObject("LogoutButton", By.xpath("//input[@id='logout']"));
		                                    //input[@id='logout']
		
	}

}
