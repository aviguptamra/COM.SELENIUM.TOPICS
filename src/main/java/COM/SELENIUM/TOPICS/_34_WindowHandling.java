

package COM.SELENIUM.TOPICS;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _34_WindowHandling {
	
	
	WebDriver driver;
	
	@Test
	public void WindowHandling()
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		
		driver.findElement(By.id("openwindow")).click();
		
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);
		
		
		Set<String>ChildWindow= driver.getWindowHandles();
		int TotalWindowSize=ChildWindow.size();
		System.out.println(TotalWindowSize);
		
		for(String str:ChildWindow)
		{
			if(!ParentWindow.equalsIgnoreCase(str))
			{
				driver.switchTo().window(str);
				String ChildWindowTitle=driver.getTitle();
				System.out.println(ChildWindowTitle);
				
			}
			
			 driver.switchTo().window(ParentWindow);
			
		}
		
		String ParenWindowTitle=driver.getTitle();
		System.out.println(ParenWindowTitle);
		
		
	}
	
	
	
	

}

