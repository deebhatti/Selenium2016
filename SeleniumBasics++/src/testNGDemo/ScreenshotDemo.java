package testNGDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
	}

	@Test
	public void bookTiket() throws IOException {

		try {
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();

			driver.findElement(By.name("fidFlights")).click();

			driver.findElement(By.name("reserveFlights")).click();
			driver.findElement(By.name("pass")).sendKeys("Deepinder");
			driver.findElement(By.name("passLast0")).sendKeys("Bhatti");

		}

		catch (Exception e) {
			getScreenshot();
		}

	}

	public void getScreenshot() throws IOException {
		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("C:\\Selenium13\\Newtours.jpg"));
	}

}
