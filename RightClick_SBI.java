package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick_SBI {

	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();	
    driver.manage().window().maximize();
    driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
    WebElement e1= driver.findElement(By.linkText("CONTINUE TO LOGIN"));
    e1.click();

}
}