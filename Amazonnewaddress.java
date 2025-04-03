package ab49source;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazonnewaddress 
{
WebDriver driver;
	
	//Step1
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement  proceedtobybutton;
	@FindBy(xpath="//a[@id='add-new-address-desktop-sasp-tango-link']")
	WebElement newaddress;
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	@FindBy(name="address-ui-widgets-enterAddressFullName")
	WebElement firstname;
	//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	@FindBy(name="address-ui-widgets-enterAddressPhoneNumber")
	//@FindBy(xpath="//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input']")
	WebElement mobilenumber;
	
	@FindBy(name="address-ui-widgets-enterAddressPostalCode")
	WebElement pincode;
	
	@FindBy(name="address-ui-widgets-enterAddressLine1")
	WebElement address;
	
	@FindBy(name="address-ui-widgets-enterAddressLine2")
	WebElement area;
	
	@FindBy(name="address-ui-widgets-landmark")
	WebElement landmark;
	
	@FindBy(xpath="(//span[@id='checkout-primary-continue-button-id']/span/input)[2]")
	WebElement usethisaddress;
	
	public void Proceedtobybutton()
	{
		proceedtobybutton.click();
	}
	public void Newaddress()
	{
		newaddress.click();
	}
	public void Firstname()
	{
		firstname.sendKeys("Puja Kumari" +Keys.ENTER);	
	}
	public void Mobilenumbe()
	{
		mobilenumber.sendKeys("7008759106" +Keys.ENTER);	
	}
	public void Pincode()
	{
		pincode.sendKeys("495001" +Keys.ENTER);	
	}
	public void Address()
	{
		address.sendKeys("Nanda kisore vihar 27kholi, Vikash nagar 27 kholi, BILASPUR" +Keys.ENTER);	
	}
	public void Area()
	{
		area.sendKeys("27 kholi" +Keys.ENTER);	
	}
	public void Landmark()
	{
		landmark.sendKeys("Near kangarookids" +Keys.ENTER);	
	}
	public void Usethisaddress()
	{
		usethisaddress.click();
	}
	//step3
			public Amazonnewaddress(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
	
	
	
	
	
	
}
