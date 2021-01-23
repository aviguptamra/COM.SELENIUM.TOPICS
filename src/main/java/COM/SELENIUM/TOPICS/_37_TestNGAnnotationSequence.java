

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
       
		System.out.println("BeforeSuite");
		
	}
	
	@BeforeTest
	public void BeforeTest()
	
	{
       
		System.out.println("BeforeTest");
		
	}
	
	
	@BeforeClass
	public void BeforeClass()
	
	{
       
		System.out.println("BeforeClass");
		
	}
	

	
	@BeforeMethod
	public void BeforeMethod()
	
	{
       
		System.out.println("BeforeMethod");
		
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
       
		System.out.println("AfterMethod");
		
	}
	
	@AfterClass
	public void AfterClass()
	
	{
       
		System.out.println("AfterClass");
		
	}
	
	@AfterTest
	public void AfterTest()
	
	{
       
		System.out.println("AfterTest");
		
	}
	
	
	
	@AfterSuite
	public void AfterSuite()
	
	{
       
		System.out.println("AfterSuite");
		
	}
	
	

}

