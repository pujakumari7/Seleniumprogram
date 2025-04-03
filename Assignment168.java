package package12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment168 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); // we will maximize the wind
		driver.get("https://www.google.com/");
		 WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("India");
		Thread.sleep(20000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[class='OBMEnb']/ul/li"));
		 int noofautosuggetion = e2.size();
		 System.out.println(noofautosuggetion);
		 e2.get(1).click();

	}

}
