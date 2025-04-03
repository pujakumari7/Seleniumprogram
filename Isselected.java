package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/kashy/Downloads/learningHTML1.html");
	    
	    //by partiallinkText(it will give false result)
	    //WebElement e1= driver.findElement(By.partialLinkText("about"));
	    //boolean b1= e1.isSelected();
	    //System.out.println(b1);
	    
	   //by xpath(it will give true result)
	    WebElement e1= driver.findElement(By.xpath("(//input)[13]"));
	    e1.click();
	    boolean b1= e1.isSelected();
	    System.out.println(b1);
	  
	}
}

