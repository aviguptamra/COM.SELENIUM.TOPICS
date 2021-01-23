

package COM.SELENIUM.TOPICS;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _40_TestNGInvocationCount {
	
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void browser()
	{
		 File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
			driver=new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			
	}
	
	
	@Test(invocationCount = 2)
	public void TestCase_1()
	
	{
       
		
		
	}
	
	
	@Test(invocationCount = 2)
	public void TestCase_2()
	
	{
       
		
		
	}
	
	@Test(invocationCount = 2)
	public void TestCase_3()
	
	{
       
	
		
	}
	
	
	
	

}

