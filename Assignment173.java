package package12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment173 {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); // we will maximize the wind
		driver.get("https://www.1mg.com/?wpsrc=Google+Organic+Search");
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='style__banner-close-button___2QheJ']/div"));
		e1.click();
		
		WebElement e2 = driver.findElement(By.xpath("(//div[@class='UpdateCityModal__modal-body___H98MG']/div/div)[1]"));
		e2.click();
		
		WebElement e3 = driver.findElement(By.xpath("//input[@id='srchBarShwInfo']"));
		e3.sendKeys("Cetaphil");
		
		WebElement e4 = driver.findElement(By.xpath("(//div[@class='styles__search-results-container___3OUHy']/ul/li)[3]"));
		e4.click();
		
		//List<WebElement> e4 = driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']"));
		//int count = e4.size();
		//System.out.println(count);
		//e4.get(3).click();
		
		//boolean foundCetaphil = false;
		//for (WebElement result : e4) {
		 //   if (result.getText().toLowerCase().contains("cetaphil")) {
		       // result.click(); // Click on the Cetaphil product
		       // foundCetaphil = true;
		       // break; // Exit the loop once we've clicked the product
		    //}
		//}

		//if (!foundCetaphil) {
		   // System.out.println("Cetaphil product not found in the search results.");
		//}
		
		}
}
