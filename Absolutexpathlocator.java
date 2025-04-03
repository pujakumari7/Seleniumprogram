package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpathlocator {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kashy/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("puja" );
		WebElement e2 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		e2.click();
		


	}

}
