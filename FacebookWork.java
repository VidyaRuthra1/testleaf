package week2.day2;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Assignments Facebook

public class FacebookWork {

	public static void main(String[] args) {

		// Step 1: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

	// Step 2: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com");
	// Step 3: Maximize the window
		driver.manage().window().maximize();
	// Step 4: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	// Step 5: Click on Create New Account button
		driver.findElement(By.linkText("Create new account")).click();

	// Step 6: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Vidya");

	// Step 7: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Ruthra");

	// Step 8: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("vidyast@yahoo.com");

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vidyast@yahoo.com");

	// Step 9: Enter the password
		driver.findElement(By.name("reg_passwd__")).sendKeys("pass1234*");

	// Step 10: Handle all the three drop downs

	// Create object of the Select class
		Select selMonth = new Select(driver.findElement(By.xpath("//*[@id='month']")));

		Select selDay = new Select(driver.findElement(By.xpath("//*[@id='day']")));

		Select seYear = new Select(driver.findElement(By.xpath("//*[@id='year']")));

	// Select the option by index
		selMonth.selectByIndex(7);
		selDay.selectByIndex(7);
		seYear.selectByIndex(7);

	// Step 11: Select the radio button "Female"
	// ( A normal click will do for this step)

		driver.findElement(By.xpath("//input[@value='1']")).click();

	}

}
