package pages;

import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class BasePage {
	
	WebDriver driver;
	HashMap<String,By> objrepo=new HashMap<String,By>();
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void addObject(String LogicalName, By by) {
		objrepo.put(LogicalName, by);
	}
	
	public void click(String LogicalName) {
		getElement(LogicalName).click();
	}
	public void type(String text,String logicalName)
	{
		getElement(logicalName).sendKeys(text);
	}
	public void clear(String LogicalName) {
		getElement(LogicalName).clear();
		
	}
	public void verifyTitle(String expTitle) {
		Assert.assertEquals(expTitle, driver.getTitle());
	}
	
	public void selectDropdown(String LogicalName,String text) {
		new Select(getElement(LogicalName)).selectByVisibleText(text);
		
	}
	public void selectDropDown2(WebElement xpath, String text) {
		new Select(xpath).selectByVisibleText(text);
	}
	private WebElement getElement(String logicalName) {
		
		By by=objrepo.get(logicalName);
		WebElement element=driver.findElement(by);
		return element;
	}
}
