package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment152 {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement gmail_link = driver.findElement(By.linkText("Gmail"));
		gmail_link.click();
		
		WebElement image_link = driver.findElement(By.linkText("Images"));
		image_link.click();
		
		
	}

}
