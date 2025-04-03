package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class findelement4 {

	public static void main(String[] args) {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize(); // we will maximize the window 
		WebElement e1 = driver.findElement(By.name("q"));
		//1st testcase: Launch google search india			
		e1.sendKeys("india"); // from send key only pass alphabate,numeric and special charectar
		//2nd testcase : Launch google search india->press enter button			
		e1.sendKeys(Keys.ENTER);
		
	}

}
