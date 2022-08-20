

package COM.SELENIUM.TOPICS;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class _36_TestNGPriorty {
	
	
	WebDriver driver;
	
	@Test(priority = 1,groups = "Smoke")
	public void TestCase_1()
	
	{
       
		System.out.println("Test case -1 will be execute on 1st priorty");
		
	}
	
	
	@Test(priority = 2)
	public void TestCase_2()
	
	{
       
		System.out.println("Test case -2 will be execute on 2nd priorty or After execution of Test case-1");
		
	}
	
	@Test(priority = 3)
	public void TestCase_3()
	
	{
       
		System.out.println("Test case -3 will be execute on 3rd priorty or After execution of Test case-2");
		
	}
	
	@Test(enabled = false)
	public void TestCase_4()
	
	{
       
		System.out.println("Test case -3 will be execute on 3rd priorty or After execution of Test case-2");
		
	}
	
	@Test
	public void Case_5()
	
	{
       
		System.out.println("Test case -3 will be execute on 3rd priorty or After execution of Test case-2");
		
	}
	
	@Test
	public void Case_6()
	
	{
       
		System.out.println("Test case -3 will be execute on 3rd priorty or After execution of Test case-2");
		
	}
	
	

}

