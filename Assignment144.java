package package12;


	import org.openqa.selenium.edge.EdgeDriver;

	public class Assignment144 {
		public static void main(String[] args) throws InterruptedException {
			EdgeDriver driver =new EdgeDriver();
			driver.get("https://www.google.com");
			
			Thread.sleep(5000);
			driver.close();
			driver.quit();
		}

	}

