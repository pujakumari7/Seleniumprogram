package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		WebElement e1= driver.findElement(By.linkText("Gmail"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();

	}

}
