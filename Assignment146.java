package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment146 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//Launch Google----> search India----->enter button        

		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("India" +Keys.ENTER);
		
		//Launch Amazon search shoes ---->Press enter button
		WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
		//1st testcase: Launch Amazon search shoes			
		e1.sendKeys("Shoes" + Keys.ENTER); 
	}
}
