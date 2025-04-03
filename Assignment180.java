package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment180 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	   // with the help of caretsymbol(^)(amazon search field)
	    WebElement e1= driver.findElement(By.cssSelector("input[id^='t']"));
	    e1.sendKeys("Modi");
	}

}
