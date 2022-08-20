package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _10_GetCurrentURL {
	
	
	WebDriver driver;
	
	
  @Test
  public void Get_WebElement_Text() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		String GetCurrentURL=driver.getCurrentUrl();
		//GetCuurentURL is used to get the current URL of the page or where you landed on browser and getcurrentURL is the abstract method and extended by webdriver interface.
		System.out.println("GetCurrentURL is : " +GetCurrentURL);
		
		
  }
  
  
}
 