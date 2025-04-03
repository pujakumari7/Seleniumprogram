package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimenssion {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    WebElement e1= driver.findElement(By.cssSelector(".gLFyf"));
	    Dimension d1=  e1.getSize();
	   int X =  d1.getHeight();
	   int y= d1.getWidth();
	   System.out.println(X);
	   System.out.println(y);
	   
	}

}
