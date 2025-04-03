package package12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment171 {

	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize(); // we will maximize the wind
			driver.get("https://www.practo.com/");
			 WebElement e1 = driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-keyword']"));
			e1.sendKeys("Archana");
			
			List<WebElement> e2=driver.findElements(By.xpath("//div[@data-qa-id='omni-suggestion-main']"));
			 int noofautosuggetion = e2.size();
			 System.out.println(noofautosuggetion);
			 e2.get(1).click();

	}

}
