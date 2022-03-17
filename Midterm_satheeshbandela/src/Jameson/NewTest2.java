package Jameson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest2 {
	
	WebDriver driver= new FirefoxDriver(); 
@BeforeTest
 public void launchBrowser()
	{
		  System.out.println("launching firefox browser");
		  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		  driver.get("https://demo.openmrs.org/openmrs/");
		   System.out.println("tt");
	}
@Test(priority=-1)
public void login()
{
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
	driver.findElement(By.xpath("//li[contains(text(),'Registration Desk')]")).click();
	driver.findElement(By.xpath("//input[@id='loginButton']")).click();
	driver.findElement(By.xpath("//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")).click();
	}
@Test(priority=0)
public void registerPatient()
{
	driver.findElement(By.xpath("//input[@name=\"givenName\"]")).sendKeys("Satheesh");
	driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("Patel");
	driver.findElement(By.xpath("//input[@name=\"familyName\"]")).sendKeys("Bandela");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//select[@id=\"gender-field\"]//option[1]")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"birthdateDay-field\"]")).sendKeys("24");
	driver.findElement(By.xpath("//select[@id=\"birthdateMonth-field\"]//option[@value=\"09\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"birthdateYear-field\"]")).sendKeys("1997");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("4360");
	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Avenue Dupuis");
	driver.findElement(By.xpath("//input[@id='cityVillage']")).sendKeys("Montreal");
	driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("Quebec");
	driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Canada");
	driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("H3T1E8");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("5149124691");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//select[@id=\"relationship_type\"]//option[@data-val=\"Sibling\"]")).click();
	driver.findElement(By.xpath("//input[@ng-model=\"relationship.name\"]")).sendKeys("Karan");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"submit\"]")).click();
}
@Test(priority=0)
public void logout()
{
	driver.findElement(By.xpath("//a[ href=\"/openmrs/appui/header/logout.action?successUrl=openmrs\">")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}
	driver.quit();
}
	  	
	  	
	  
	  

