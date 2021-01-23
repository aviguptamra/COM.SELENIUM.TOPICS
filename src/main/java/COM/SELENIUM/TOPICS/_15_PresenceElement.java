package COM.SELENIUM.TOPICS;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _15_PresenceElement {
	
	
	WebDriver driver;
	
	
  @Test
  public void Presence_Element() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		WebElement IsDisplayed=driver.findElement(By.id("openwindow"));
		boolean ElementIsDisplayed=IsDisplayed.isDisplayed();
		//IsDisplayed is used to presence of webelement on the webpage and its returns String and IsDisplayed is the abstract method and extended by webelement interface 
		
		System.out.println(ElementIsDisplayed);
		
		
		
		WebElement IsSelected=driver.findElement(By.id("checkBoxOption1"));
		IsSelected.click();
		boolean ElementIsSelected=IsSelected.isSelected();
		//IsSelected is used to to check radio box or checkbox is selected or not on the webpage and its returns String and IsSelected is the abstract method and extended by webelement interface 

		System.out.println(ElementIsSelected);	
		
		
		
		WebElement IsEnabled=driver.findElement(By.id("openwindow"));
		boolean ElementIsEnabled=IsEnabled.isEnabled();
		//IsEnabled is used to check button is enabled or not on the webpage and its returns String and IsEnabled is the abstract method and extended by webelement interface 

		
		System.out.println(ElementIsEnabled);	
	    
		
  }
  
  
}
