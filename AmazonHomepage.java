package ab49source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepage 
{
	WebDriver driver;
//step1
	//for first component
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountsandlist;
	//for second component
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin;
	//for seach component
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout;
	
	//Step2
	public void hoveroveraccountsandlist(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountsandlist).perform();
	}
	public void signin_click()
	{
		signin.click();
	}
	public void Search()
	{
		search.sendKeys("HandBags"+Keys.ENTER);	
	}
	public void Signout()
	{
		signout.click();
	}
	//step3
	public AmazonHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
