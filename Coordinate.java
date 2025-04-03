package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinate {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.linkText("About Amazon"));
		
		Point p1= e1.getLocation();
		int X = p1.getX();
		int Y= p1.getY();
		
		System.out.println(X);
		System.out.println(Y);
		JavascriptExecutor js= driver;
		js.executeScript("window.scrollBy(0,"+Y+")");
		//js.executeScript("Window.scrollBy(0,500)"); //Scroll down
		//Thread.sleep(2000);
		//js.executeScript("Window.scrollBy(0,-500)"); //Scroll up
		
		

	}

}
