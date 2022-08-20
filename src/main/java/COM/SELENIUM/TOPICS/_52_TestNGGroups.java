

package COM.SELENIUM.TOPICS;

import org.testng.annotations.Test;

public class _52_TestNGGroups {
	
	
		
	@Test(groups = "Smoke")
	public void TestCase_1()
	
	{
       
		System.out.println("Test case -1");
		
	}
	
	
	@Test(groups = "Smoke")
	public void TestCase_2()
	
	{
       
		System.out.println("Test case -2");
		
	}
	
	@Test
	public void TestCase_3()
	
	{
       
		System.out.println("Test case -3");
		
	}
	
	
	
	

}

