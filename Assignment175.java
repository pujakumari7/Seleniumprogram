package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment175 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    
	    //by id
	    WebElement e1= driver.findElement(By.cssSelector("#APjFqb"));
	    e1.sendKeys("Modi");
	}

}
