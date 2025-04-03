package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocator {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/kashy/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.tagName("a"));
		e1.sendKeys(Keys.ENTER);

	}

}
