package package12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment163 {

    public static void main(String[] args) {

        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.flipkart.in/");
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Locate the element using corrected XPath
        WebElement e1 = driver.findElement(By.xpath("(//div[@class='_1wE2Px'])[1]"));
        
        // Perform hover action on the element
        Actions a1 = new Actions(driver);
        a1.moveToElement(e1).perform();

        // Locate and click the second link with class '_3490ry'
        WebElement e2 = driver.findElement(By.xpath("(//a[@class='_3490ry'])[2]"));
        e2.click();

        // Close the browser
        driver.quit();
    }
}
