

package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _25_Locators {
	
	
	WebDriver driver;
	
	@Test
	public void Locators()
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		driver=new ChromeDriver();	
		
		WebElement Id=driver.findElement(By.id("id"));
		
		WebElement Name=driver.findElement(By.name("name"));
		
		WebElement Xpath=driver.findElement(By.xpath("xpath"));
		
		WebElement ClassName=driver.findElement(By.className("ClassName"));
		
		WebElement LinkText=driver.findElement(By.linkText("linkText"));
		
		WebElement PartialLinkText=driver.findElement(By.partialLinkText("partialLinkText"));
		
		WebElement TagName=driver.findElement(By.tagName("tagName"));
		
		WebElement CSSSelector=driver.findElement(By.cssSelector("cssSelector"));
		
	}
	
	
	
	

}

