package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Abinaya");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Rajendiran");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("Test@1234");
		
		WebElement opt1 = driver.findElement(By.id("day"));
		Select options1 = new Select(opt1);
		options1.selectByValue("24");
		
		WebElement opt2 = driver.findElement(By.id("month"));
		Select options2 = new Select(opt2);
		options2.selectByIndex(10);
		
		WebElement opt3 = driver.findElement(By.id("year"));
		Select options3 = new Select(opt3);
		options3.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		Thread.sleep(2500); 
		
		driver.close();
		
		
		

		

	}
}
