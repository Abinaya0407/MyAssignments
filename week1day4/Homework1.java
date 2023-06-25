package week1day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver a=new ChromeDriver();
a.manage().window().maximize();
a.get("http://leaftaps.com/opentaps/control/login");
a.findElement(By.id("username")).sendKeys("DemoSalesManager");
a.findElement(By.id("password")).sendKeys("crmsfa");
a.findElement(By.className("decorativeSubmit")).click(); 
a.findElement(By.linkText("CRM/SFA")).click(); 

a.findElement(By.linkText("Leads")).click(); 
a.findElement(By.linkText("Create Lead")).click(); 

	a.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); 
	a.findElement(By.id("createLeadForm_firstName")).sendKeys("Abinaya"); 		
	a.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendiran"); 
	a.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abinayarajediran94@gmail.com");	
	a.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9629587304");   
	Thread.sleep(1000) ;
	
	a.findElement(By.name("smallSubmit")).click();
	
	Thread.sleep(2000);
	a.close();
	
}
}
