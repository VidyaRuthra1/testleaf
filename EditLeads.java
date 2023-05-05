package week2.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditLeads {
	
			public static void main(String[] args) throws InterruptedException{
			    
				// *1	Launch the browser
				//http://leaftaps.com/opentaps/control/main
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(DurationofSeconds(30));
				//String myurl=driver.getCurrentUrl();
				//System.out.println(myurl);
				
						
			
				//* 2	Enter the username
				driver.findElement(By.id("username")).sendKeys("demosalesManager");
				
				// * 3	Enter the password
				  driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				  // 4	Click Login
				  
				  driver.findElement(By.className("decorativeSubmit")).click();
				// 5	Click crm/sfa link
				 
				  driver.findElement(By.linkText("CRM/SFA")).click();
				//* 6	Click Leads link
				 driver.findElement(By.linkText("Leads")).click();
				//* 7	Click Find leads
				driver.findElement(By.linkText("Find Leads")).click();
				// 8	Enter first name
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("c");
					
				
				//* 9	Click Find leads button
				
			  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			  Thread.sleep(2000);
			  
			  
				//10 Click on first resulting lead
		
			  WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
				System.out.println(leadID.getText());
				leadID.click();
				  
				// 11 Verify title of the page
				 //12 Click Edit
				 
				driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
				//13 Change the company name
				 
				driver.findElement(By.id("updateLeadForm_companyName")).clear();
				driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("NewTestLeaf");
				
				
				
				// 14 Click Update
				driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
				// 15 Confirm the changed name appears
				 
				  String compname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Updated Company Name"+compname);

				// 16 Close the browser (Do not log out)
	
		
		
	}

			
			
}
