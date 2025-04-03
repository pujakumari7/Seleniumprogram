package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    //driver.get("https://www.google.com/");
	    driver.get("https://www.amazon.in/");
	    //by id
	    //WebElement e1= driver.findElement(By.cssSelector("#APjFqb"));
	    //e1.sendKeys("Modi");
	    //by class name
	    //WebElement e1= driver.findElement(By.cssSelector(".gLFyf"));
	    //e1.sendKeys("Modi");
	    //by TagNmae ClassName
	    //WebElement e1= driver.findElement(By.cssSelector("textarea.gLFyf"));
	    //e1.sendKeys("Modi");
	    //by Tagname AN and AV
	   // WebElement e1= driver.findElement(By.cssSelector("textarea[name='q']"));
	    //e1.sendKeys("Modi");
	    //by Tagname Classname AN and AV
	    //WebElement e1= driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
	    //e1.sendKeys("Modi");
	    //with the help of caretsymbol(^)(amazon search field)
	    //WebElement e1= driver.findElement(By.cssSelector("input[id^='t']"));
	    //e1.sendKeys("Modi");
	    
	    

	}

}
