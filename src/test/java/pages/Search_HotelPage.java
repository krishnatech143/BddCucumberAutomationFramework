package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class Search_HotelPage extends BasePage {
	
	static WebDriver driver;
	public Search_HotelPage(){
		
		super(driver=BaseTest.getDriver());
		
		addObject("Location_dropDown", By.xpath("//select[@id='location']"));
		addObject("Hotel_dropDown", By.xpath("//select[@id='hotels']"));
		addObject("Roomtype_dropDown", By.xpath("//select[@id='room_type']"));
		addObject("NoofRooms_dropDown", By.xpath("//select[@id='room_nos']"));
		addObject("CheckinDate_dropDown", By.xpath("//input[@id='datepick_in']"));
		addObject("Checkout_dropDown", By.xpath("//input[@id='datepick_out']"));
		addObject("Adutls_dropDown", By.xpath("//select[@id='adult_room']"));
		addObject("SearchButton", By.xpath("//input[@id='continue']"));
		addObject("RadioButton", By.xpath("//input[@id='radiobutton_0']"));
		addObject("ContinueButton", By.xpath("//input[@id='Submit']"));
		
		
		
		
		
	}
	

}
