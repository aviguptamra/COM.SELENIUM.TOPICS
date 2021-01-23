

package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _2_MaximizeBrowser {
	
	
	WebDriver driver;
	
	
  @Test
  public void Launch_URL() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		/*To maximize the browser or in full mode and manage is the Abstract method which is extended by webdriver interface and window is the Abstract method which is extended by options interface and maximize is the Abstract method which is extended by Window interface too and all interface extnded by webdriver interface.
	  
	  */
	
   }
  
  
  
}
