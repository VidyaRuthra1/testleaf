package week2.day2;


	import java.time.Duration;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	public class DeleteLead {
	
	public static void main(String[] args) {
	
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
		
	/*	8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)*/
	}
	
}
