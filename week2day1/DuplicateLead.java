package week2day1;
 
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		a.get("http://leaftaps.com/opentaps/control/login");
					
		a.findElement(By.id("username")).sendKeys("DemoSalesManager");
					
		a.findElement(By.id("password")).sendKeys("crmsfa");
					
		a.findElement(By.className("decorativeSubmit")).click();
					
		a.findElement(By.linkText("CRM/SFA")).click();
					
		a.findElement(By.linkText("Leads")).click();
					
		a.findElement(By.linkText("Create Lead")).click();
		a.findElement(By.id("createLeadForm_companyName")).sendKeys("Company 1 Ltd.");
		
		a.findElement(By.id("createLeadForm_firstName")).sendKeys("Sachin");
		
		a.findElement(By.id("createLeadForm_lastName")).sendKeys("Kohli");
		
		a.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Robin");
		
		a.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		a.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
		
		a.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sachin.kohli@gmail.com");
		
		a.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
		
		String title1 = a.getTitle();
		System.out.println("Page 1 title is: "+title1);
		
		a.findElement(By.xpath("//a[text() = 'Duplicate Lead']")).click();
		
		a.findElement(By.id("createLeadForm_companyName")).clear();
		Thread.sleep(2000);
		a.findElement(By.id("createLeadForm_companyName")).sendKeys("Company 2 Ltd.");
		
		a.findElement(By.id("createLeadForm_firstName")).clear();
		Thread.sleep(2000);
		a.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuvraj");
		
		a.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
		
		String title2 = a.getTitle();
		System.out.println("page 2 title is: "+title2);

	}

}
