package week2.day1.HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("TestAccount3002");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//Enter a Number Of Employees. 
		
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		
		//Enter a Site Name as “LeafTaps”
		
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Click the "Create Account" button. 
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify that the Title is displayed correctly. 
		
		String title = driver.getTitle();
		System.out.println("Title of the webpage:"+title);
		
		//Close the browser window. */
		
		driver.close();

	}

}
