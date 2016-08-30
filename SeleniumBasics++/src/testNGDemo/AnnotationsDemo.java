package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("@BeforeMethod will execute before every @Test annotation");
		
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("@AfterMethod will execute after every @Test annotation");
		
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("@BeforeClass will always execute prior to @BeforeMethod and @Test annotations");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("@AfterClass will always execute after @AfterMethod and @Test annotations");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("@BeforeTest will always execute prior to @BeforeClass, @BeforeMethod and @Test annotations");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("@AfterTest will always execute after @AfterClass, @AfterMethod and @Test annotations");
	}
	
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("@BeforeSuite will always execute prior to all annotations");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("@AfterSuite will always execute after all annotations");
	}
	
	
	@Test
	public void testCase1(){
		System.out.println("@Test 1 annotation executed");
	}
	
	
	@Test
	public void testCase2(){
		System.out.println("@Test 2 annotation executed");
	}

}
