package ab49source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonaddtocartpage 
{
	WebDriver driver;
	
	//Step1
	@FindBy(xpath="//span[@class='a-icon a-icon-small-trash']")
	WebElement  removefromcart;
	
	//step2
	
	public void Removefromcart()
	{
		removefromcart.click();
	}
	//step3
	public Amazonaddtocartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
