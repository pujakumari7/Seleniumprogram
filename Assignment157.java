package package12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment157 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fb%2F%3F_encoding%3DUTF8%26node%3D1380374031%26pd_rd_w%3DvIIll%26content-id%3Damzn1.sym.f8e82c51-0408-4554-a158-9be4d776850d%26pf_rd_p%3Df8e82c51-0408-4554-a158-9be4d776850d%26pf_rd_r%3D77R6BHDW4F9H93GQKFPB%26pd_rd_wg%3DORUPf%26pd_rd_r%3Da10b0717-cde4-41dd-b819-1302829dc7e7%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		Thread.sleep(4000);
		WebElement e1 = driver.findElement(By.xpath("//input[@name='email']"));
		e1.sendKeys("kashyapp995@gmail.com");
		
		//WebElement e2 = driver.findElement(By.id("continue"));
		WebElement e2 = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		e2.click();
		
		
		
		//WebElement e3 = driver.findElement(By.name("password"));
		WebElement e3 = driver.findElement(By.xpath("//input[@name='password']"));
		e3.sendKeys("Puja67");
		
		//WebElement e4 = driver.findElement(By.id("signInSubmit"));
		WebElement e4 = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		e4.click();
	}
	
}
