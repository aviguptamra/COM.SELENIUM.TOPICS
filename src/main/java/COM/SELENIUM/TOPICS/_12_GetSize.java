package COM.SELENIUM.TOPICS;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _12_GetSize {
	
	
	WebDriver driver;
	
	
  @Test
  public void Implicit_Wait() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		

		
		WebElement AlertButton=driver.findElement(By.id("alertbtn"));
        Dimension GetSize_Alert_button=AlertButton.getSize();
        //GetSize method is used to get the size of webelement and its returns dimension (width and height) and its a abstract method and extended by webelement interface
        
        System.out.println(GetSize_Alert_button);
         		
	    
		
  }
  
  
}
