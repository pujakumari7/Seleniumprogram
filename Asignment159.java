package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asignment159 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//select[@name='gender']"));
		Select s1= new Select(e1);
		//Select class using selectBy index, selectBy visible Text, selectBy value 
		//s1.selectByIndex(1);
		//Select class using selectBy value 
		//s1.selectByValue("male");
		//Select class using selectBy visible Text
		s1.selectByVisibleText("Male");
	}

}
