package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _9_GetCSSValue {
	
	
	WebDriver driver;
	
	
  @Test
  public void Get_WebElement_CSSValue() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		WebElement WebElement=driver.findElement(By.id("hplogo"));
		String GetWebElementCSSValue=WebElement.getCssValue("background-color");
		//CSSValue is used to get CSS property of webelement i.e background-color and returns String in rgba format and CSSValue method is the abstract method and extended by webelement interface.
		System.out.println("GetWebElementCSSValue is " + GetWebElementCSSValue);
		
		
  }
  
  
}
