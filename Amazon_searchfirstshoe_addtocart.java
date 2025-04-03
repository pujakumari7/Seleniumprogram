package package123;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_searchfirstshoe_addtocart {

	public static void main(String[] args) throws InterruptedException {
		//on amazon search any things by Xpath
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("(//input)[5]"));
		e1.sendKeys("shoes");
		
		WebElement e2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		e2.click();
		
		WebElement firstshoes = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		firstshoes.click();
		
		Set <String> pcid=	driver.getWindowHandles();	
        Iterator <String> pc=pcid.iterator();
        String parentid=  pc.next();
        String childid=  pc.next();
        driver.switchTo().window(childid);
        
        WebElement cart=  driver.findElement(By.id("add-to-cart-button"));
        cart.click();
        
        
        
        
	}

}
