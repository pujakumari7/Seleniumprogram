package ab49source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seachresultpage 
{
	WebDriver driver;
	//1st step
	//searchfield component
	@FindBy(xpath="//div[@class='a-section aok-relative s-image-tall-aspect']")
	WebElement clickProduct;
	
	
	
	
	//2nd step
	public void ClickProduct(WebDriver driver)
	{
		clickProduct.click();
		Set <String> pcid=	driver.getWindowHandles();	
        Iterator <String> pc=pcid.iterator();
        String parentid=  pc.next();
        String childid=  pc.next();
        
        driver.switchTo().window(childid);//control move to child page
	}
	
	//step3
			public Seachresultpage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
}
