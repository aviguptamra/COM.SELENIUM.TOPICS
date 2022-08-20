package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _8_GetAttribute {
	
	
	WebDriver driver;
	
	
  @Test
  public void Get_WebElement_Attribute() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\\\Automation\\\\Selenium\\\\chromedriver_win32(87)\\\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	    WebElement WebElement=driver.findElement(By.xpath("//div[text()='India']"));
	    
	    String Get_WebElement_Attribute_For_InnerText=WebElement.getAttribute("innerText");
	    /*GetAttribute method is used to extract the attribute i.e class, id, name innerText and etc. from <tag> and getAttribute method 
	      is the abstract method and extended from webelement interface and returns string.
	    */
	    System.out.println("Get_WebElement_Attribute_For_InnerText : "+Get_WebElement_Attribute_For_InnerText);
	    
	    String Get_WebElement_Attribute_For_Class=WebElement.getAttribute("tagName");
	    System.out.println("Get_WebElement_Attribute_For_Class : "+Get_WebElement_Attribute_For_Class);
	    
	   
  }
  
  
}
