package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_and_Paste {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/kashy/Downloads/learningHTML1.html");
		WebElement e1= driver.findElement(By.id("1"));
		e1.sendKeys("Puja");
		e1.sendKeys(Keys.CONTROL+"a");
		e1.sendKeys(Keys.CONTROL+"c");
		
		WebElement e2= driver.findElement(By.id("2"));
		e2.sendKeys(Keys.CONTROL+"v");
		
		
	}

}
