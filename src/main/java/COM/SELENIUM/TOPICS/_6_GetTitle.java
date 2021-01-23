package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _6_GetTitle {
	
	
	WebDriver driver;
	
	
  @Test
  public void Get_WebElement_Text() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		String GetTitle=driver.getTitle();
		//GetTitle is used to get the Title of the page or website or application and GetText is the abstract method and extended by webdriver interface.
		System.out.println("GetTitle is : " +GetTitle);
  }
  
  
}
