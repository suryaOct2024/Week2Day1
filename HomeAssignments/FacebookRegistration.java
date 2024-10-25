package week2.day1.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("testfnameuser1");
		driver.findElement(By.name("lastname")).sendKeys("testlnameuser1");
		
		driver.findElement(By.name("reg_email__")).sendKeys("testuser@org.com");
		
		WebElement dayWE = driver.findElement(By.id("day"));
		Select dayDD = new Select(dayWE);
		dayDD.selectByIndex(20);
		
		WebElement monthWE = driver.findElement(By.id("month"));
		Select monthDD = new Select(monthWE);
		monthDD.selectByVisibleText("Oct");
		
		WebElement yearWE = driver.findElement(By.id("year"));
		Select yearDD = new Select(yearWE);
		yearDD.selectByValue("2002");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.id("password_step_input")).sendKeys("password1");
		

	}

}
