

package COM.SELENIUM.TOPICS;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _28_AutoSuggestion {
	
	
	WebDriver driver;
	
	@Test
	public void Auto_Suggestion() throws InterruptedException
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
	    Thread.sleep(3000);

		List<WebElement> List= driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		int List_Size= List.size();
		System.out.println(List_Size);
		
		
		for(WebElement web:List)
			
		{
			String List_Text=web.getText();
			System.out.println(List_Text);
			
			if(List_Text.equalsIgnoreCase("Selenium interview questions"))
			{
				web.click();
				break;
			}
		}
		
		
		
		
				
		
	}
	
	
	
	

}

