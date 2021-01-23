package COM.SELENIUM.TOPICS;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _14_NavigateMethod {
	
	
	WebDriver driver;
	
	
  @Test
  public void Navigate_Method() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		
		driver.navigate().forward();
		/*To click on forward button which is avialbel on browser and to return next page and navigate is the abstract method and extended by 
		webdriver interface and forward is the abstract method and extended by navigation interface
		*/
		driver.navigate().back();
		/*To click on back button which is avialbel on browser and to return previous page and navigate is the abstract method and extended by 
		webdriver interface and back is the abstract method and extended by navigation interface
		*/
		
		driver.navigate().refresh();
		/*To click on refresh button which is avialbel on browser and to refresh the current page and navigate is the abstract method and extended by 
		webdriver interface and refresh is the abstract method and extended by navigation interface
		 
		 */
		
	
  }
  
  
}
