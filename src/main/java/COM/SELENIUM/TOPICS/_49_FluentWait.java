package COM.SELENIUM.TOPICS;


import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.tools.ant.taskdefs.condition.Or;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class _49_FluentWait {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
        File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		
	}
	
	@Test
	public void FluentWait()
	
	
	{
	    
				
				@SuppressWarnings("deprecation")
				Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS)
	            .ignoring(NoSuchElementException.class);
				
				WebElement ele=wait.until(new Function<WebDriver, WebElement>() {
					
					public WebElement apply(WebDriver driver)
					
					{
						WebElement element=driver.findElement(By.xpath("//div[text()='Login']"));
					
					
					
					return element;
				}
				});
    
	   
	
 }
	}
	
	

