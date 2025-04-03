package ab49source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductpage1 
{
	WebDriver driver;
	//Step1
	@FindBy(xpath="//input[@id='add-to-wishlist-button-submit']")
	WebElement  wishlist;
	
	@FindBy(linkText="View Your List")
	WebElement viewyourlist;
	

	@FindBy(xpath="//a[@class='a-button-text a-text-center']")
	WebElement addtocart;
	
	@FindBy(linkText="View Cart")
	WebElement viewcart;
	
	//step2
	public void addtowishlist()
	{
		wishlist.click();	
	}
	public void ViewyourList()
	{
		viewyourlist.click();	
	}
	public void Addtocart()
	{
		addtocart.click();	
	}
	public void ViewCart()
	{
		viewcart.click();
	}
	
	//step3
	public AmazonProductpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
