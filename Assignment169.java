package package12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment169 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();  
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Shoes");
		Thread.sleep(4000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		 int length = e2.size();
		 System.out.println(length);
		 e2.get(1).click();
	}

}
