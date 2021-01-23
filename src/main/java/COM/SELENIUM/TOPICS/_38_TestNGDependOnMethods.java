

package COM.SELENIUM.TOPICS;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class _38_TestNGDependOnMethods {
	
	
	WebDriver driver;
	
	@Test(dependsOnMethods = "TestCase_2")
	public void TestCase_1()
	
	{
       
		System.out.println("Test case -1");
		
	}
	
	
	@Test
	public void TestCase_2()
	
	{
       
		System.out.println("Test case -2");
		
	}
	
	@Test(dependsOnMethods = "TestCase_2")
	public void TestCase_3()
	
	{
       
		System.out.println("Test case -3");
		
	}
	
	
	
	

}

