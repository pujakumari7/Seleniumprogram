package package123;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentwind_childwnd_popups {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[text()='Google']"));
		e1.click();
		Set<String> pcid = driver.getWindowHandles();
		System.out.println(pcid);
		
		Iterator<String> i2 =pcid.iterator();
		String parentid = i2.next();
		String childid = i2.next();
		System.out.println(parentid+"Parentid:");
		System.out.println(childid+"Childid:");
		//move to control from  parent to child
		driver.switchTo().window(childid);
		driver.close(); // this will close child window
		
		
	}

}
