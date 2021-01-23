 package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _16_Alerts {
	
	
	WebDriver driver;
	
	
  @Test
  public void Alert_S() throws InterruptedException 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert SimpleAlert=driver.switchTo().alert();
		SimpleAlert.getText();
		/*
		    It is used to get the text of Alert and SwitchTo is the abstract method and extended by webdriver interface and
		    alert is the Abstract method and extended by tragetLocator interface and getText method is abstract method and extended by Alert interface
		    and returns String.  
		*/		
		System.out.println(SimpleAlert);
		
		driver.switchTo().alert().accept();
		/*
	    It is used to click on OK button on Alert and SwitchTo is the abstract method and extended by webdriver interface and
	    alert is the Abstract method and extended by targetLocator interface.
	*/
		
		Thread.sleep(5000);

		driver.findElement(By.id("confirmButton")).click();
		
		Alert ConfirmationAlert=driver.switchTo().alert();
		ConfirmationAlert.getText();
		System.out.println(ConfirmationAlert);
		
        driver.switchTo().alert().dismiss();
    	/*
	    It is used to click on CANCEL button on Alert and SwitchTo is the abstract method and extended by webdriver interface and
	    alert is the Abstract method and extended by ItragetLocator interface.
	*/
        
		Thread.sleep(5000);
		
		driver.findElement(By.id("promtButton")).click();

		driver.switchTo().alert().sendKeys("Prompt Alert");
		
		/*
	    It is used to enter sendkeys in textbox on Alert and SwitchTo is the abstract method and extended by webdriver interface and
	    alert is the Abstract method and extended by ItragetLocator interface.
	*/
		
        Alert PromptAlert=driver.switchTo().alert();
        PromptAlert.getText();
		System.out.println(PromptAlert);
		
        driver.switchTo().alert().accept();
	    
		
  }
  
  
}
