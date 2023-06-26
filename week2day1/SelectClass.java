package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("http://leaftaps.com/opentaps/control/main"); 
		b.findElement(By.id("username")).sendKeys("DemoSalesManager"); 
		b.findElement(By.id("password")).sendKeys("crmsfa");
		b.findElement(By.className("decorativeSubmit")).click(); 
		b.findElement(By.linkText("CRM/SFA")).click(); 
		b.findElement(By.linkText("Leads")).click(); 
		b.findElement(By.linkText("Create Lead")).click(); 
		b.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); 
		Thread.sleep(2000);
		b.findElement(By.id("createLeadForm_firstName")).sendKeys("Abinaya"); 
		b.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendiran"); 
		Thread.sleep(3000);
		WebElement opt = b.findElement(By.id("createLeadForm_industryEnumId"));
		Select options = new Select(opt);
		options.selectByVisibleText("Distribution");
		
		WebElement opt1= b.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select options1 = new Select(opt1);
		options1.selectByValue("4");
	b.findElement(By.name("submitButton")).click();

	Thread.sleep(2000);
	b.close();		

	
	}
}

