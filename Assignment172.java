package package12;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment172 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); // we will maximize the wind
		driver.get("https://www.youtube.com/");
		WebElement e1 = driver.findElement(By.xpath("//input[@name='search_query']"));
		e1.sendKeys("Softwaretesting");
		
		List<WebElement> e2=driver.findElements(By.xpath("(//yt-searchbox[@role='search']/div/div)[1]"));
		 int noofautosuggetion = e2.size();
		 System.out.println(noofautosuggetion);
		 e2.get(1).click();
	}
	
}
