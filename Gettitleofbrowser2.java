package package123;


	import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

	public class Gettitleofbrowser2 {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://www.Flipkart.com");
			String title = driver.getTitle();
			System.out.println(title);
			String parentid = driver.getWindowHandle();
			System.out.println(parentid);
			Set<String> pcid = driver.getWindowHandles();
			System.out.println(pcid);
			
}
	}
