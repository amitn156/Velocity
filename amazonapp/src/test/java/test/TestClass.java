package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base;
import pom.Loginpom;
import pom.Logoutpom;

public class TestClass extends Base{
	private WebDriver driver;
	private Loginpom login;
	private Logoutpom logout;
	private SoftAssert soft;
	private String text;

	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		System.out.println(browser);
		if (browser.equalsIgnoreCase("chrome"))
		{
			driver = openchromebrowser();
		}
		else
		{
			if (browser.equalsIgnoreCase("firefox"))
			{driver = openfirefoxbrowser();}
		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void setproperty()
	{
		soft = new SoftAssert();
		logout = new Logoutpom(driver);
		login = new Loginpom(driver);
	}
	
	@BeforeMethod
	public void loginpage()
	{
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		login.login();
		login.email();
		login.conti();
		login.password();
		login.signin();
	}
	
	@Test (priority=2)
	public void homeimproement() 
	{
		login.homeimproementclick();
		String url=driver.getCurrentUrl();
		 //soft = new SoftAssert();
		soft.assertEquals(url,"https://www.amazon.in/gp/browse.html?node=3704992031&ref_=nav_cs_hi_b183765d90844c95b998beab0377167a","url fail");
		//span[@class='a-size-extra-large a-color-base a-text-bold']
//		WebElement ele = driver.findElement(By.xpath("//span[@class='a-size-extra-large a-color-base a-text-bold']"));
//             text= ele.getText();
//             login.getText();
//            soft.assertEquals(text,"Recommended for you"," text fail");
		soft.assertAll();
	}
	
	@Test (priority=1)
	public void amazonpay()
	{
		login.amazonpayclick();
		String url1= driver.getCurrentUrl();
		soft.assertEquals(url1,"https://www.amazon.in/gp/sva/dashboard?ref_=nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f","url fail");
		soft.assertAll();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		
		//logout.movetoaccountlist();
		//logout.movetoorder();
		Thread.sleep(3000);
		logout.movetoaccountlist(driver);
		logout.signoutclick();
	}
	
	@AfterClass
	public void close()
	{
		soft= null;
		logout= null;
		login= null;
		
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
		
	}
	
}
