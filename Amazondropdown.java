package package123;

//import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Amazondropdown {

	public static void main(String[] args)  {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//select[@name='url']"));
		Select s1= new Select(e1);
		//s1.selectByIndex(1);
		//s1.selectByVisibleText("Books");
		s1.selectByValue("search-alias=beauty");
		
		

	}

}
