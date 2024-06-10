package steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.Book_Hotelpage;
import pages.Login_page;
import pages.Search_HotelPage;

public class StepsDefination extends BaseTest {
	BasePage page= null;
	String verifytext;
	String verifytext2;
	String validate;
	String validate2;
	int price;
	int rooms;
	int nights;
	@Before
	public void setup() {
		LunchApplication();
	}
	
	@Given("user start browser {string}")
	public void user_start_browser(String browser) {
	   if(browser.equalsIgnoreCase("chrome")) {
		   driver = new ChromeDriver();
	   }
	   else  if(browser.equalsIgnoreCase("edge")) {
		   driver = new EdgeDriver();
	   }
	   else if(browser.equalsIgnoreCase("firefox")) {
		   driver = new FirefoxDriver();
	   }
	}

	@Given("user Lunch browser {string}")
	public void user_lunch_browser(String url) {
		driver.get(url);
	}

	@When("user Enter the text in textBox {string} using xpath {string}")
	public void user_enter_the_text_in_text_box_using_xpath(String text, String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

	@Then("user clicks on the LoginButton using xpath {string}")
	public void user_clicks_on_the_login_button_using_xpath(String xpath) {
	   driver.findElement(By.xpath(xpath)).click();
	}
	
	@When("user verify The Title using {string}")
	public void user_verify_the_title_using(String expTitle) {
	//	String MainPage=driver.getTitle();
		Assert.assertEquals(driver.getTitle(), expTitle);
		
	}
	@When("user fill the Create New Customer Account Form2")
	public void user_fill_the_create_new_customer_account_form2(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> Maplist=dataTable.asMaps();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Maplist.get(0).get("FirstName"));
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(Maplist.get(0).get("LastName"));
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(Maplist.get(0).get("Email"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Maplist.get(0).get("Password"));
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(Maplist.get(0).get("ConformPassword"));
	}
	
	@When("user fill the Create New Customer Account Form")
	public void user_fill_the_create_new_customer_account_form(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> listdata=dataTable.asLists();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(listdata.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(listdata.get(0).get(1));
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(listdata.get(0).get(2));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(listdata.get(0).get(3));
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(listdata.get(0).get(4));
		}
	
	@When("user Enter Text in {string} {string}")
	public void user_enter_text_in(String text, String LogicalName) {
		page.clear(LogicalName);
		page.type(text, LogicalName);
	}
	@When("user Enter Text2 in {string} {string}")
	public void user_enter_text2_in(String xpath, String text) {
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		
    }

	@When("user clicks on the Loginbutton {string}")
	public void user_clicks_on_the_loginbutton(String LogicalName) {
	   page.click(LogicalName);
	}

	@When("user clicks on the LogOutButton {string}")
	public void user_clicks_on_the_log_out_button(String Logicalname) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30)); 
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='logout']")));
		page.click(Logicalname);
}
	@Then("user validate title to be {string}")
	public void user_validate_title_to_be(String exptitle) {
	  page.verifyTitle(exptitle);
	}
	
	@Given("user is on {string}")
	public void user_is_on(String PageName) {
		if(PageName.equalsIgnoreCase("Login_page")) {
			page=new Login_page();
		}
		if(PageName.equalsIgnoreCase("Book_Hotelpage")) {
			page=new Book_Hotelpage();
		}
		if(PageName.equalsIgnoreCase("Search_HotelPage")) {
			page=new Search_HotelPage();
		}
	}
	
	@When("user Select the Text in dropDown Using {string} {string}")
	public void user_select_the_text_in_drop_down_using(String LogicalName, String text) {
	   page.selectDropdown(LogicalName, text);
	}
	@When("user clicks on SearchButton {string}")
	public void user_clicks_on_search_button(String Logicalname) {
	    page.click(Logicalname);
	}
	
	@Then("user clicks on the RadioButton {string}")
	public void user_clicks_on_the_radio_button(String LogicalName) {
	   page.click(LogicalName);
	}
	@Then("user clicks on Continue Button {string}")
	public void user_clicks_on_continue_button(String LogicalName) {
	    page.click(LogicalName);
	}
	@Given("user Lunch Application using url {string}")
	public void user_lunch_application_using_url(String url) {
	   driver.get(url);
	}
	@When("user clicks on the Loginbutton2 using xpath {string}")
	public void user_clicks_on_the_loginbutton2_using_xpath(String LogicalName) {
		driver.findElement(By.xpath(LogicalName)).click();
		}
	@When("user Select the Text in dropDown2 Using {string} {string}")
	public void user_select_the_text_in_drop_down2_using(String xpath, String text) {
		new Select(driver.findElement(By.xpath(xpath))).selectByVisibleText(text);
	}
	@When("user clicks on SearchButton2 {string}")
	public void user_clicks_on_search_button2(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	@When("user enter the text {string} using xpath {string}")
	public void user_enter_the_text_using_xpath(String text, String LogicalName) {
		page.type(text, LogicalName);
	}
	@Then("user verify the text {string} using xpath {string}")
	public void user_verify_the_text_using_xpath(String ActualText, String xpath) {
	WebElement Locator=	driver.findElement(By.xpath(xpath));
	Assert.assertEquals(Locator, xpath);
	}
	@When("user gettext of Element using xpath {string}")
	public void user_gettext_of_element_using_xpath(String xpath) {
		 WebElement Element= driver.findElement(By.xpath(xpath));
		   verifytext=Element.getText();
		   System.out.println(verifytext);
	}
	@When("user gettext of Element using getAttribute {string} {string}")
	public void user_gettext_of_element_using_getAttribute(String xpath, String text) {
		 WebElement Element= driver.findElement(By.xpath(xpath));
		 verifytext2= Element.getAttribute(text);
		   System.out.println(verifytext2);
	}
	@When("user verify the using Text GetAttribute {string} {string}")
	public  void user_verify_the_using_text_get_attribute(String locator, String text2) {
	    String LocatorName2=driver.findElement(By.id(locator)).getAttribute(text2);
	    System.out.println(LocatorName2);
	    Assert.assertEquals(verifytext, LocatorName2);
	}
	@When("user verify the using Text GetAttribute2 {string} {string}")
	public  void user_verify_the_using_text_get_attribute2(String locator, String text2) {
	    String LocatorName2=driver.findElement(By.id(locator)).getAttribute(text2);
	    System.out.println(LocatorName2);
	    Assert.assertEquals(verifytext2, LocatorName2);
	}
	@When("user verify the text using Stringmethods {string} {string}")
	public void user_verify_the_text_using_stringmethods(String xpath, String delimeter) {
		String Demo=driver.findElement(By.xpath(xpath)).getText();
		String arr[]=Demo.split(delimeter);
		validate =arr[0];
		System.out.println(arr[0]);
	}
	@When("user verify the text using Stringmethods2 {string} {string}")
	public void user_verify_the_text_using_stringmethods2(String xpath, String delimeter) {
		String Demo=driver.findElement(By.xpath(xpath)).getAttribute("value");
		String arr1[]=Demo.split(delimeter);
		validate2 =arr1[0];
		System.out.println(arr1[0]);
		Assert.assertEquals(validate2, validate);
	}
	
	@Then("user Verify the price as PricePernght id {string} ,NoofRooms id {string} ,NoofNights id {string}")
	public void user_verify_the_price_as_price_pernght_id_noof_rooms_id_noof_nights_id(String xpath, String xpath2, String xpath3) {
		
		String pricePernight= driver.findElement(By.id(xpath)).getAttribute("value");
		String p1 = pricePernight.substring(6, pricePernight.length()+0);
		int price = Integer.parseInt(p1);
		System.out.println(price);
		
		String NoofRooms= driver.findElement(By.id(xpath2)).getAttribute("value");
		String room[]=NoofRooms.split(" ");
		String r1=room[0];
		int rooms=Integer.parseInt(r1);
		
		System.out.println(rooms);
		
		String NoofNights= driver.findElement(By.id(xpath3)).getAttribute("value");
		String night[]=NoofNights.split(" ");
		String n1=night[0];
		int nights=Integer.parseInt(n1);
		System.out.println(nights);
		
		double total=price*rooms*nights;
		System.out.println(total);
		double totalGST= total*10/100;
		System.out.println(totalGST);
		
		double finalBill=total+totalGST;
		System.out.println(finalBill);
		
		String Biiling=driver.findElement(By.id("total_price_1")).getAttribute("value");
		String FinalBillingPrice=Biiling.substring(6 ,Biiling.length()+0);
		
		Assert.assertEquals(finalBill, FinalBillingPrice);
		
		// There is a bug not caluclating As per Noof nights not considering the Rooms
		// soo resolve as soon as possible
	}
	
	@After
	public void Teardown(Scenario scenario) {
		
		if(scenario.isFailed()) {
		TakesScreenshot shot=(TakesScreenshot) driver;
		byte[] screenshot= shot.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "Scenario Failed??");
		}
		else{
			TakesScreenshot shot=(TakesScreenshot) driver;
			byte[] screenshot= shot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Scenario sucess");
			}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	        driver.quit();
	}
	
	      
}