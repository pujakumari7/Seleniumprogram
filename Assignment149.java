package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment149 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement e1 = driver.findElement(By.name("firstname"));
		e1.sendKeys("Puja");
		
		WebElement e2 = driver.findElement(By.name("lastname"));
		e2.sendKeys("Kashyap");
		
		WebElement e3 = driver.findElement(By.name("reg_email__"));
		e3.sendKeys("kashyapp99@gmail.com");
		
		WebElement e4 = driver.findElement(By.id("password_step_input"));
		e4.sendKeys("1234");
		
		WebElement e5 = driver.findElement(By.name("websubmit"));
		e5.click();

	}

}
