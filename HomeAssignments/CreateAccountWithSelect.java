package week2.day1.HomeAssignments;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelect {

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
		
		driver.findElement(By.id("accountName")).sendKeys("TestAccount3000");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//Select Industry by index
		
		WebElement indWE = driver.findElement(By.name("industryEnumId"));
		Select indDD = new Select(indWE);
		indDD.selectByIndex(3);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText. 
		
		WebElement ownWE = driver.findElement(By.name("ownershipEnumId"));
		Select ownDD = new Select(ownWE);
		ownDD.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue. 
		
		WebElement srcWE = driver.findElement(By.id("dataSourceId"));
		Select srcDD = new Select(srcWE);
		srcDD.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
		
		WebElement mktcampWE = driver.findElement(By.id("marketingCampaignId"));
		Select mktcampDD = new Select(mktcampWE);
		mktcampDD.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue.
		
		WebElement stateWE = driver.findElement(By.id("generalStateProvinceGeoId"));       
		Select stateDD = new Select(stateWE);
		stateDD.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify Account name
		//String AcctName = driver.findElement(By.xpath("//span[contains(text(),'TestAccount')]").toString();
		
		//System.out.println("Account name:"+AcctName);

	}

}
