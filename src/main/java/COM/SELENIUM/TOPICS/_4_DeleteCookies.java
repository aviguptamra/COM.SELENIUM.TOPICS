package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _4_DeleteCookies {
	
	
	WebDriver driver;
	
	
  @Test
  public void Launch_URL() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	    driver.manage().deleteAllCookies();
	    //To delete the all cookies from browser,  manage is the Abstract method which is extract from Options interface and  deleteAllCookies is the Abstract method which is extract from Options interface and all interface extended from webdrivr interface 
	    
	    driver.manage().deleteCookieNamed("ABCD");
	    //To delete the all cookies from browser,  manage is the Abstract method which is extract from Options class and  deleteAllCookies is the Abstract method which is extract from Options interface and and all interface extended from webdrivr interface

  }
  
  
}
