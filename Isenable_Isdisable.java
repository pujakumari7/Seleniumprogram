package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable_Isdisable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    //by class name
	    WebElement e1= driver.findElement(By.cssSelector(".gLFyf"));
	    
	  //boolean b1=   e1.isDisplayed();
	  //boolean b2= e1.isEnabled();
	  if(e1.isDisplayed() && e1.isEnabled())
	  {
		  e1.sendKeys("Modi");  
	  }
	}

}
