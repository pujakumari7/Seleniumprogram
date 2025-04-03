package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment179 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	  //by Tagname Classname AN and AV
	    WebElement e1= driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
	    e1.sendKeys("Modi");
	}

}
