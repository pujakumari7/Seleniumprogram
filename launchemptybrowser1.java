package package123;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;

public class launchemptybrowser1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(5000);
		driver.close();;
	}

}
