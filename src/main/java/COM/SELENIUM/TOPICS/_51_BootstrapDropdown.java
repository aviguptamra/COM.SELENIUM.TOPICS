package COM.SELENIUM.TOPICS;


import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class _51_BootstrapDropdown {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
        File GoogleChromeDriver=new File("D:\\\\Automation\\\\Selenium\\\\chromedriver_win32(87)\\\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
	}
	
	@Test
	public void BootStrapDropdown()
	
	
	{
		
		driver.findElement(By.id("menu1")).click();
		
		List<WebElement>DropDownValues= driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
		
		
		for(WebElement ele:DropDownValues)
		{
			String InnerHTML=ele.getAttribute("innerHTML");
			System.out.println(InnerHTML);
			
			if(InnerHTML.equalsIgnoreCase("JavaScript"))
			{
				ele.click();
				
			}
		}
		
	}
	
}
	
	

