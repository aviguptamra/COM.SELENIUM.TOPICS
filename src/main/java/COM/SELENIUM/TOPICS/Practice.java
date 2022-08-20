package COM.SELENIUM.TOPICS;


import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class Practice implements ITestListener{
	
 
	public static WebDriver driver;
 
	

	
	@Test
	public void  browser() throws IOException 
	{
		 
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver_win32(87)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		

		driver.findElement(By.id("menu1")).click();
		
		List<WebElement> BootStrapList=driver.findElements(By.xpath("//ul[@role='menu']//a"));
		
		for(WebElement ele: BootStrapList)
		{
			String Text=ele.getAttribute("innerHTML");
			
			if(Text.equalsIgnoreCase("JavaScript"))
			{
				ele.click();
				break;
			}
		}
		
		
		
		
	     
	}

}
