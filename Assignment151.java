package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment151 {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();  
		WebElement e1 = driver.findElement(By.name("firstName"));		
		e1.sendKeys("Puja");
		WebElement e2 = driver.findElement(By.name("lastName"));		
		e2.sendKeys("Kumari");
		WebElement e3 = driver.findElement(By.name("email"));		
		e3.sendKeys("kashyapp995@gmail.com");
		WebElement e4 = driver.findElement(By.name("phone"));		
		e4.sendKeys("7008759106");
		WebElement e5 = driver.findElement(By.name("aadhaar"));		
		e5.sendKeys("7008759108");
		WebElement e6 = driver.findElement(By.name("pan"));		
		e6.sendKeys("2008759108");
		WebElement e7 = driver.findElement(By.name("terms"));		
		e7.click();
		WebElement e8 = driver.findElement(By.name("Submit"));		
		e8.click();
		
		
	}

}
