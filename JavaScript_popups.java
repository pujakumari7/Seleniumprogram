package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_popups {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kashy/Downloads/learningHTML1.html");
		//below method is used to handle the java script pop ups
		driver.switchTo().alert().accept();//use when one option abavilable in java script pop ups
		driver.switchTo().alert().dismiss();//use when two option abavilable in java script pop ups
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.id("1"));
		e1.sendKeys("puja");
		

	}

}
