package week1day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2Update {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
Thread.sleep(500);
b.findElement(By.name("submitButton")).click();  
b.findElement(By.linkText("Edit")).click();
b.findElement(By.id("updateLeadForm_companyName")).sendKeys("EditedCompName");
b.findElement(By.name("submitButton")).click();

Thread.sleep(2000);
b.close();		

}

	}
