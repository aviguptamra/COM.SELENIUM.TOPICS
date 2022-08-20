

package COM.SELENIUM.TOPICS;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class _37_TestNGAnnotationSequence {
	
	
	WebDriver driver;
	
	@BeforeSuite
	public void BeforeSuite()
	
	{
       
		System.out.println("The @BeforeSuite annotated method will run before the execution of all the test methods in the suite.");
		
	}
	
	@BeforeTest
	public void BeforeTest()
	
	{
       
		System.out.println("The @BeforeTest annotated method will be executed before the execution of all the test methods of available classes belonging to that folder.");
		
	}
	
	
	@BeforeClass
	public void BeforeClass()
	
	{
       
		System.out.println("The @BeforeClass annotated method will be executed before the first method of the current class is invoked.");
		
	}
	
	

	
	@BeforeMethod
	public void BeforeMethod()
	
	{
       
		System.out.println("The @BeforeMethod annotated method will be executed before each test method will run.");
		
	}
	
	@Test
	public void Test1()
	
	{
       
		System.out.println("Test1");
		
	}
	
	
	@Test
	public void Test2()
	
	{
       
		System.out.println("Test2");
		
	}
	
	@AfterMethod
	public void AfterMethod()
	
	{
       
		System.out.println("The @AfterMethod annotated method will run after the execution of each test method.");
		
	}
	
	@AfterClass
	public void AfterClass()
	
	{
       
		System.out.println("The @AfterClass annotated method will be invoked after the execution of all the test methods of the current class.");
		
	}
	
	@AfterTest
	public void AfterTest()
	
	{
       
		System.out.println("The @AfterTest annotated method will be executed after the execution of all the test methods of available classes belonging to that folder.");
		
	}
	
	
	
	@AfterSuite
	public void AfterSuite()
	
	{
       
		System.out.println("The @AfterSuite annotated method will run after the execution of all the test methods in the suite.");
		
	}
	
	

}

