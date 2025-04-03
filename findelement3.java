package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement3 {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize(); // we will maximize the window 
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		//1st testcase: Launch Amazon search shoes			
		e1.sendKeys("Shoes"); // from send key only pass alphabate,numeric and special charectar
		//2nd testcase : Launch Amazon search shoes->press enter button			
		//e1.sendKeys(Keys.ENTER);
		//3rd test case : Launch Amazon search shoes->Click on search button			
		WebElement e2 = driver.findElement(By.id("nav-search-submit-text"));
		e2.click();
	}

}
