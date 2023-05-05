package week2.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateContact {


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
		
		 // 6. Click on Create Contact
			driver.findElement(By.linkText("Create Contact")).click();
		  
			//7. Enter FirstName Field Using id Locator
			driver.findElement(By.id("firstNameField")).sendKeys("Shanthi");
		 
			// 8 Enter LastName Field Using id Locator
			driver.findElement(By.id("lastNameField")).sendKeys("Srinivasan");
			
			//9. Enter FirstName(Local) Field Using id Locator
		  
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Shanthi");
		  //10 Enter Description
		  driver.findElement(By.id("createContactForm_description")).sendKeys("description");
		
		  //  11. Enter Department Field Using any Locator of Your Choice 
		  driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Sales");	
		
		  //  * 13. Enter your email in the E-mail address Field using the locator of your choice
		  driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("vidyasp@yahoo.com");
		  
		  driver.findElement(By.className("smallSubmit")).click();
		 
			 
			 
			 
			 /* 13. Enter your email in the E-mail address Field using the locator of your choice
			 * 
			 * 14. Select State/Province as NewYork Using Visible Text
			 * 
			 * 15. Click on Create Contact
			 * 
			 * 16. Click on edit button 
			 * 
			 * 17. Clear the Description Field using .clear
			 * 
			 * 18. Fill ImportantNote Field with Any text
			 * 
			 * 19. Click on update button using Xpath locator
			 * 
			 * 20. Get the Title of Resulting Page.
	         */
}
}