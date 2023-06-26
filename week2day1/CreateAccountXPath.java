package week2day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountXPath{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver a = new ChromeDriver();
		a.get("http://leaftaps.com/opentaps/control/login");
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		a.findElement(By.id("username")).sendKeys("DemoSalesManager");
		a.findElement(By.id("password")).sendKeys("crmsfa");
		a.findElement(By.className("decorativeSubmit")).click();
		
		a.findElement(By.linkText("CRM/SFA")).click();
		a.findElement(By.linkText("Accounts")).click();
		a.findElement(By.linkText("Create Account")).click();
		
		a.findElement(By.xpath("//input[@id = 'accountName']")).sendKeys("Debit Limited Account");
		a.findElement(By.xpath("//textarea[@name = 'description']")).sendKeys("Selenium Automation Tester");
		a.findElement(By.xpath("//input[@id = 'groupNameLocal']")).sendKeys("LocalGroupOne");
		a.findElement(By.xpath("//input[@id = 'officeSiteName']")).sendKeys("SiteName1");
		a.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("5,00,000");
		
		WebElement opt1 = a.findElement(By.name("industryEnumId"));
		Select option1 = new Select(opt1);
		option1.selectByIndex(2);
		
		WebElement opt2 = a.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select(opt2);
		option2.selectByVisibleText("S-Corporation");
		
		WebElement opt3 = a.findElement(By.name("dataSourceId"));
		Select option3 = new Select(opt3);
		option3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement opt4 = a.findElement(By.name("marketingCampaignId"));
		Select option4 = new Select(opt4);
		option4.selectByIndex(5);
		
		WebElement opt5 = a.findElement(By.name("generalStateProvinceGeoId"));
		Select option5 = new Select(opt5);
		option5.selectByValue("TX");
		
		a.findElement(By.xpath("//input[@value = 'Create Account']")).click();
		
		Thread.sleep(10000);
		a.close();
		
	}

}
