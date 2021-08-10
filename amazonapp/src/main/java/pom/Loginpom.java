package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpom {
	private WebDriver driver;
	private String text;

	@FindBy (xpath="//span[@class='nav-line-2 ']")
	private WebElement login;
	
	@FindBy (xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement conti;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	
	@FindBy (xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search;
	
	@FindBy (xpath="//input[@id='nav-search-submit-button']")
	private WebElement button;
	
	@FindBy (xpath="//span[@class='a-size-medium a-color-base a-text-normal'][1]")
	private WebElement iphone;
	
	
	@FindBy (xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	//a[@data-csa-c-slot-id='nav_cs_0']
	@FindBy (xpath="//a[@data-csa-c-slot-id='nav_cs_0']")
	private WebElement homeimproement;
	
//	@FindBy (xpath="//span[@class='a-size-extra-large a-color-base a-text-bold']")
//	private WebElement gettext;
	
	
	@FindBy (xpath="//a[@data-csa-c-slot-id='nav_cs_1']")
	private WebElement amazonpay;
	
	public Loginpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
		
	public void login()
	{
		login.click();
	}
	
	public void email()
	{
		email.sendKeys("9405973923");
	}
	
	public void conti()
	{
		conti.click();
	}
	
	public void password()
	{
		password.sendKeys("Internet@1234");
	}
	
	public void signin()
	{
		signin.click();
	}
	
	public void search()
	{
		search.sendKeys("iphone 12");
	}
	
	public void buttonclick()
	{
		 button.click();
	}
	
	public void iphoneclick()
	{
		iphone.click();
	}
	
	public void signoutclick()
	{
		signout.click();
	}
	 
	public void homeimproementclick()
	{
		homeimproement.click();
	}
//	public void getText()
//	{
//		  text= gettext.getText();
//	}
	public void amazonpayclick()
	{
		amazonpay.click();
	}
}
