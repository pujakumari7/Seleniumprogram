package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment190 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.linkText("About Amazon"));
		
		Point p1= e1.getLocation();
		int X = p1.getX();
		int Y= p1.getY();
		
		System.out.println(X);
		System.out.println(Y);

	}

}
