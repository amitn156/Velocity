package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpom {
	 private WebDriver driver;
     private Actions act;
     
	@FindBy (xpath="//span[@class='nav-line-2 ']")
	private WebElement accountlist;
	
	@FindBy (xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	@FindBy (xpath= "//span[@class='nav-line-2'][2]")
	private WebElement orders;
	
	public Logoutpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void movetoaccountlist(WebDriver driver)
	{
		 act = new Actions(driver);
		 act.moveToElement(accountlist).perform();
		// act.moveToElement(signout).click().build().perform();
	}
	
	public void signoutclick()
	{
		signout.click();
	}
	
	public void movetoorder(WebDriver driver)
	{
		act = new Actions(driver);
		act.moveToElement(orders).perform();
	}
}
