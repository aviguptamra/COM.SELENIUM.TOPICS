package COM.SELENIUM.TOPICS;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _18_ImplicitWait {
	
	
	WebDriver driver;
	
	
  @Test
  public void Implicit_Wait() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws 
		  a "No Such Element Exception"Implicit wait will be applicable for every element for that page,If any element found 
		  within time then rest of time will be ignored or not found within the time then will get an exception.
		  ->manage is Abstract method and extended from options interface and timeouts Abstract method is also extended from options interface and Implicitlywait is the abstract method and extended from Timeout interface
          */
	    
		
  }
  
  
}
