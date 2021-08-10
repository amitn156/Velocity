package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver openchromebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr Amit\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		return driver;
	}
	
	public static WebDriver openfirefoxbrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mr Amit\\Firefox exe\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	    return driver;
	}
}
