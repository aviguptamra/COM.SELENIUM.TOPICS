package COM.SELENIUM.TOPICS;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _19_ExplicitWait {
	
	
	WebDriver driver;
	
	
  @Test
  public void Implicit_Wait() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		WebDriverWait wd=new WebDriverWait(driver, 30);
		//Created the webdriverwait class object
		
		wd.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hplogo"))));
		/*The explicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time for a particular 
		web element before it throws a "No Such Element Exception". Explicit wait will be applicable for a particular element 
		for that page,If any element found within time then rest of time will be ignored or not found within the time then will get an exception
		and until is the method and expectedCondition is the class and visibilityof the method 
		*/
		
              
		
	    
		
  }
  
  
}
