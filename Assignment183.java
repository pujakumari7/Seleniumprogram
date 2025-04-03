package package12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import package123.Screenshot_amazondropdown;

public class Assignment183 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//select[@name='url']"));
		Select s1= new Select(e1);
		s1.selectByIndex(5);
		//s1.selectByVisibleText("Books");
		//s1.selectByValue("search-alias=beauty");
		
		ChromeDriver ts= driver;
	File source=	ts.getScreenshotAs(OutputType.FILE);
	
	//File destination = new File("C:\\Users\\kashy\\eclipse-workspace\\SeleniumProjec\\Screenshot\\one.png");
	
	//Take screenshot by using classname
	File destination = new File("C:\\Users\\kashy\\eclipse-workspace\\SeleniumProjec\\Screenshot\\one"+new Screenshot_amazondropdown().getClass()+".png");
	
	FileHandler.copy(source, destination);

	}

}
