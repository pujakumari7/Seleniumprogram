package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment156 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kashy/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		//Username
		WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("puKumari" );
		//hint
		WebElement e2 = driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("Student");
		//pasword
		WebElement e3 = driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("Kashyap");
		//your first name
		WebElement e4 = driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		e4.sendKeys("Puja");
		//Submit button
		//WebElement e5 = driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]"));
		//e5.click();
		// i have boy check box
		WebElement e6 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		e6.click();
		//I have a Girl
		//WebElement e7 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		//e7.click();
		//i have a baby
		//WebElement e8 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		//e8.click();
		//2nd submit button
		//WebElement e9 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]"));
		//e9.click();
		//who are you radio button
		WebElement e10 = driver.findElement(By.xpath("(/html/body/input)[4]"));
		e10.click();
		
		//WebElement e11 = driver.findElement(By.xpath("(/html/body/input)[5]"));
		//e11.click();
		
		WebElement e12 = driver.findElement(By.xpath("(/html/body/input)[6]"));
		e12.click();
		//
		WebElement e13 = driver.findElement(By.tagName("a"));
		e13.sendKeys(Keys.ENTER);
		//singup
		WebElement e14 = driver.findElement(By.xpath("(/html/body/input)[7]"));
		e14.click();
		}

}
