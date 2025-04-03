package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment178 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	  //by Tagname AN and AV
		   WebElement e1= driver.findElement(By.cssSelector("textarea[name='q']"));
		    e1.sendKeys("Modi");
	}

}
