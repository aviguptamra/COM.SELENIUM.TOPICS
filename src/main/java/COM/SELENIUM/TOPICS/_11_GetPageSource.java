package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _11_GetPageSource {
	
	
	WebDriver driver;
	
	
  @Test
  public void Get_WebElement_Text() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		String GetPageSource=driver.getPageSource();
		/*GetPageSource is used to get the pagesource of the page or website or application and its returns string and GetPageSource is the abstract method 
		and extended from webdriver interface and this method is used when we can not do mouse Right click option i.e banking/financial application.
		*/
		System.out.println("GetPageSource is : " +GetPageSource);
  }
  
  
}
