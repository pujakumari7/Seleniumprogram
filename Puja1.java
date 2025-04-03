package package123;



	
		import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.edge.EdgeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import org.openqa.selenium.StaleElementReferenceException;

		import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

		public class Puja1 {

		    public static void main(String[] args) {
		        // Launches Microsoft Edge
		        WebDriver driver = new EdgeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.amazon.in/");

		        // Implicit wait (uncomment if needed)
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        // Searches for Handbags
		        WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		        e1.sendKeys("handbags" + Keys.ENTER);

		        // Wait for search results to load (use WebDriverWait for more specific waits)
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")));

		        // Clicks on the first product image
		        WebElement e2 = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		        e2.click();

		        // Switches to the new window that opens
		        Set<String> parentChildIds = driver.getWindowHandles();
		        Iterator<String> iterator = parentChildIds.iterator();
		        String parentId = iterator.next();
		        String childId = iterator.next();
		        driver.switchTo().window(childId);

		        // Adds the product to the wishlist
		        WebElement wishlist = driver.findElement(By.xpath("(//span[@data-action='add-wishlist-declarative'])[1]"));
		        wishlist.click();

		        // Signs in with credentials
		        WebElement userId = driver.findElement(By.name("email"));
		        userId.sendKeys("kashyapp995@gmail.com" + Keys.ENTER);

		        // Wait for password field to be visible before interacting
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		        WebElement password = driver.findElement(By.name("password"));
		        password.sendKeys("Puja@12345" + Keys.ENTER);

		        // Wait for the sign-in button to be clickable and try clicking again if stale element occurs
		        try {
		            WebElement signInButton = driver.findElement(By.className("a-button-input"));
		            wait.until(ExpectedConditions.elementToBeClickable(signInButton));
		            signInButton.click();
		        } catch (StaleElementReferenceException e) {
		            // If the element becomes stale, refind and click again
		            WebElement signInButton = driver.findElement(By.className("a-button-input"));
		            wait.until(ExpectedConditions.elementToBeClickable(signInButton));
		            signInButton.click();
		        }

		        // Adds the product to the shopping cart
		        wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
		        WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		        cart.click();

		        // Proceeds to checkout
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='proceedToRetailCheckout']")));
		        WebElement proceedToBuy = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		        proceedToBuy.click();

		        // Add credit card details
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='SelectableAddCreditCard']")));
		        WebElement addCreditDetails = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		        addCreditDetails.click();

		        // Click on the add credit card link
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")));
		        WebElement addCreditDetailsLink = driver.findElement(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]"));
		        addCreditDetailsLink.click();
		    }
		}

	


