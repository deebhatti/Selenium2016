package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BeforeMethodDemo {
	
	String baseUrl = "http://newtours.demoaut.com/mercurywelcome.php";
	WebDriver driver;
	String expected;
	String actual;
	
	@BeforeTest
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
	
	@BeforeMethod
	public void verifyHomePageTitle(){
		expected = "Welcome: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}
	
	@Test(priority=1)
	public void register(){
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=0)
	public void support(){
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	
	
	@AfterMethod
	public void goBackToHomePage(){
		driver.findElement(By.linkText("Home")).click();
	}
	
	@AfterTest
	public void terminateProcess(){
		driver.quit();
	}
	

}
