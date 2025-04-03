package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment148 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		WebElement e1 = driver.findElement(By.id("email"));
		e1.sendKeys("kashyapp99@gmail.com");
		
		WebElement e2 = driver.findElement(By.id("pass"));
		e2.sendKeys("Puja@123");
		
		WebElement e3 = driver.findElement(By.name("login"));
		e3.click();
		
		
		

	}

}
