
package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _3_LaunchURL {
	
	
	WebDriver driver;
	
	
  @Test
  public void Launch_URL() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		//To Launch or Redirect the URL and get("URL") method is the Abstract method and pass one param, which is extended by webdriver interface and returns nothing.  
		
	  
  }
  
  
}
