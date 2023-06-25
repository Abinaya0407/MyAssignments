package week1day4;

		import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.support.ui.Sleeper;
		public class LaunchBrowser {
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://login.salesforce.com/");
				driver.manage().window().maximize();
				
				driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			Thread.sleep(3000);
			
				driver.findElement(By.id("password")).sendKeys("Leaf@1234");
				Thread.sleep(3000);
				
				driver.findElement(By.id("Login")).click();
				Thread.sleep(5000);
								driver.close();
		}

	}

