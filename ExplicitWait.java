package package123;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait				 {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		// Create WebDriverWait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for the search box to be clickable
		WebElement e1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		e1.sendKeys("handbags" + Keys.ENTER);

		// Wait for the first product to be clickable
		WebElement e2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")));
		e2.click();

		// Switch to the new window
		Set<String> parentchildid = driver.getWindowHandles();
		Iterator<String> i2 = parentchildid.iterator();
		String parentid = i2.next();
		String childid = i2.next();
		driver.switchTo().window(childid);

		// Wait for the wishlist button to be clickable
		WebElement wishlist = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@data-action='add-wishlist-declarative'])[1]")));
		wishlist.click();

		// Wait for the email field to be visible
		WebElement userid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		userid.sendKeys("kashyapp995@gmail.com" + Keys.ENTER);

		// Wait for the password field to be visible
		WebElement pswd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		pswd.sendKeys("Puja@12345" + Keys.ENTER);

		// Wait for the sign-in button to be clickable
		WebElement signin = wait.until(ExpectedConditions.elementToBeClickable(By.className("a-button-input")));
		signin.click();

		// Wait for the "Add to Cart" button to be clickable
		WebElement addcart = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
		addcart.click();

		// Wait for the checkout button to be clickable
		WebElement procdtobuy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='proceedToRetailCheckout']")));
		procdtobuy.click();

		// Wait for the credit card option to be clickable
		WebElement addcredtdetls = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='SelectableAddCreditCard']")));
		addcredtdetls.click();

		// Wait for the link to add credit card details to be clickable
		WebElement addcredtdetls1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")));
		addcredtdetls1.click();

	}

}
