package package123;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Puja123 
{
@Test
public void testcase1()
{
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/"); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.titleIs("MKT"));
	
	WebElement e1 =driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("handbags"+Keys.ENTER);
	
	WebElement e2 =driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
	e2.click();
	
	Set<String> parentchildid=driver.getWindowHandles();
 	Iterator<String> i2=parentchildid.iterator();
	String parentid=i2.next();
	String childid=i2.next();
	driver.switchTo().window(childid);
	
	 WebElement wishlist= driver.findElement(By.xpath("(//span[@data-action='add-wishlist-declarative'])[1]"));
	 wishlist.click();
	
	 WebElement userid= driver.findElement(By.name("email"));
	 userid.sendKeys("kashyapp995@gmail.com"+Keys.ENTER);
	 
	 WebElement pswd= driver.findElement(By.name("password"));
	 pswd.sendKeys("Puja@12345"+Keys.ENTER);																															pswd.sendKeys("");
	
	 WebElement signin= driver.findElement(By.className("a-button-input"));
		signin.click();
		
		WebElement addcart= driver.findElement(By.id("add-to-cart-button"));
		addcart.click();
		
		//WebElement procdtobuy= driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		//procdtobuy.click();
		
		//WebElement addcredtdetls= driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		//addcredtdetls.click();
		
		//WebElement addcredtdetls1= driver.findElement(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]"));
		//addcredtdetls1.click();
}
}
