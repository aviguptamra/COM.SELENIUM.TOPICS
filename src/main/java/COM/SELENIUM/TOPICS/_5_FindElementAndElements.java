package COM.SELENIUM.TOPICS;

import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _5_FindElementAndElements {
	
	
	WebDriver driver;
	
	
  @Test
  public void FindElement_Elements() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		

		
		driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
        //Findelement is used to identify the webelement on the webpage and its return single webelement and it is abstract method and extended by webdriver interface
		
		
		List<WebElement> List= driver.findElements(By.xpath("//div[@id='radio-btn-example']"));
        //Findelements is used to identify the webelement on the webpage and its return List of webelement and it is abstract method and extended by webdriver interface

	    int List_Size=List.size();
	    
	    System.out.println(List_Size);
	    
	    for(WebElement web:List)
	    	
	    {
	    	     String ListWebElementName=web.getText();
	    	     System.out.println(ListWebElementName);
	    }
		
  }
  
  
  
}
