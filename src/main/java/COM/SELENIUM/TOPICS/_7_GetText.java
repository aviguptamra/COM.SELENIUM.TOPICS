package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _7_GetText {
	
	
	WebDriver driver;
	
	
  @Test
  public void Get_WebElement_Text() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	    WebElement WebElement=driver.findElement(By.xpath("//span[text()='India']"));
	    String Get_WebElement_Text=WebElement.getText();
	    /*
	    GetText method is used to extract the text from webelement if avilabel and getTexts is the abstract method and extended 
	    from webdriver interface and returns string.
	    */
	    System.out.println("WebElement Text is : "+Get_WebElement_Text);
  }
  
  
}
