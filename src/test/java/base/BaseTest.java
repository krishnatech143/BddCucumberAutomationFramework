package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties configprop;

	public static void LunchApplication() {
		driver = getDriver();
		driver.get(configprop.getProperty("url"));
	}

	public static WebDriver getDriver() {

		try {
			fis = new FileInputStream("properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		configprop = new Properties();
		try {
			configprop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (driver==null) {
			String BrowserName = configprop.getProperty("browser");

			if (BrowserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (BrowserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (BrowserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}

		}
		return driver;
	}

}
