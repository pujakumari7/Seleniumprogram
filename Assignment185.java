package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment185 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("fname"));
		e1.sendKeys("Puja");
		
		WebElement e2=driver.findElement(By.id("lname"));
		e2.sendKeys("Kumari");
		
		WebElement e3=driver.findElement(By.id("email"));
		e3.sendKeys("Kashyapp995@gmail.com");
		
		WebElement e4=driver.findElement(By.id("password"));
		e4.sendKeys("Puja@12345");
		
		WebElement e5=driver.findElement(By.xpath("(//select[@name='Skills'])"));
		Select s1= new Select(e5);
		s1.selectByIndex(1);
		
		WebElement e6=driver.findElement(By.xpath("(//select[@name='Country'])"));
		Select s2= new Select(e6);
		s2.selectByIndex(7);
		
		WebElement e7=driver.findElement(By.id("Present-Address"));
		e7.sendKeys("Banglore");
		
		WebElement e8=driver.findElement(By.id("Permanent-Address"));
		e8.sendKeys("Bihar");
		
		WebElement e9=driver.findElement(By.id("Pincode"));
		e9.sendKeys("12345");
		
		WebElement e10=driver.findElement(By.xpath("(//select[@name='Relegion'])"));
		Select s3= new Select(e10);
		s3.selectByIndex(1);
		
		WebElement e11=driver.findElement(By.id("file"));
		e11.sendKeys("C:\\Users\\kashy\\Desktop\\Assignment//Assignment54..pdf");
		
		WebElement e12=driver.findElement(By.name("relocate"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e12).perform();
		
		e12.click();
		
		WebElement e13=driver.findElement(By.name("Submit"));
		e13.click();
	}

}
