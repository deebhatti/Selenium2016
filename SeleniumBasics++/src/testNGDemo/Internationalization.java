package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Internationalization {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser(){
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("intl.accept_languages", "he");
		driver = new FirefoxDriver(profile);
		driver.get("https://gmail.com");
	}
	
//	@Test
//	public void verifyTitle(){
//		String expectedTitle = "Gmail";
//		String actualTitle = driver.getTitle();
//		
//	}
	
	
	

}
