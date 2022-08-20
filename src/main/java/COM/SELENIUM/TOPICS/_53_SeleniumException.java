

package COM.SELENIUM.TOPICS;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _53_SeleniumException {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
        File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		//driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		/driver.get("https://www.google.com");
	}
	
		
	@Test(enabled = false)
	public void ElementNotInteractableException() 
	
	{
		driver.findElement(By.id("male")).click();
		/*it gets org.openqa.selenium.ElementNotInteractableException:
		WebElement is present in the DOM but Element is hidden or browser is minimized due to this webdriver is not able intreact with element.
     	*/
	}
	
	
	@Test(enabled = false)
	public void ElementNotVisibleException() 
	
	{
		//driver.findElement(By.id("male")).click();
		/*it gets org.openqa.selenium.ElementNotVisibleException:
		WebElement is present in the DOM but Element is hidden due to this webdriver is not able identify to element.
     	*/
		
	}
	
	
	@Test(enabled = false)
	public void InvalidSelectorException() 
	
	{
		driver.findElement(By.xpath("///input[@@id='male']")).click();
		/*it gets org.openqa.selenium.InvalidSelectorException:
		Usally we seen in xpath locator, When we create the xpath and xpath format is invalid i.e ///input[@@id='male'] then will get org.openqa.selenium.InvalidSelectorException
     	*/
		
	}
	
	@Test(enabled = false)
	public void NoAlertPresentException() 
	
	{
		driver.switchTo().alert();
		/*it gets org.openqa.selenium.NoAlertPresentException:
		 When we declared alert code (driver.switchTo().alert();) but alert not opened or before open alert, alert code executed
		  then will get org.openqa.selenium.NoAlertPresentException
     	*/
		
	}
	
	@Test(enabled = false)
	public void NoSuchElementException() 
	
	{
		 driver.findElement(By.id("radioButton"));
		/*it gets org.openqa.selenium.NoSuchElementException:
		 When element is not present in the DOM or any attribute value is invalid or wrong
		  then will get org.openqa.selenium.NoSuchElementException:
     	*/
		
	}
	
	@Test(enabled = false)
	public void NoSuchFrameException() 
	
	{
		 driver.switchTo().frame("iframe-name1");
		/*it gets org.openqa.selenium.NoSuchFrameException:
		 When frame name is invalid or wrong
		  then will get org.openqa.selenium.NoSuchFrameException:
     	*/
		
	}
	
	@Test(enabled = false)
	public void NoSuchSessionException() 
	
	{
		 driver.quit();
		 driver.findElement(By.id("radioButton"));
		/*it gets org.openqa.selenium.NoSuchSessionException::
		 When webdriver searching to WebElement but before that browser is closed 
		  then will get org.openqa.selenium.NoSuchSessionException::
     	*/
		
	}
	
	@Test(enabled = false)
	public void NoSuchWindowException() 
	
	{
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
		driver.close();
		String ParenWindowTitle=driver.getTitle();
		System.out.println(ParenWindowTitle);
		
		/*it gets org.openqa.selenium.NoSuchWindowException:
		 When we have two window and we are switching from child window to parent window and webdriver is search the webelement on parent window 
		 and suddenly parent window 
		  then will get org.openqa.selenium.NoSuchWindowException
    	*/
		
		
		
	}
	
	@Test(enabled = false)
	public void StaleElementReffrenceException() throws InterruptedException 
	
	{
		 
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
				
			}
		}
		 
		 
		 
		/*it gets org.openqa.selenium.StaleElementReferenceException:
		 When webdriver searching to WebElement but page got refreshed due to this DOM also refreshed and 
		 before refresh for that element id is diffrent so that id is old or stale and after that webdriver provide different id 
		 because it gives always unique id.
		  then will get org.openqa.selenium.StaleElementReferenceException
     	*/
		
	}
	
	@Test(enabled = true)
	public void TimeoutException() 
	
	{
		
		/*it gets org.openqa.selenium.TimeoutException:
		 When webelement is not found within the given time
		  then will get org.openqa.selenium.TimeoutException
     	*/
		
	}
	
		
	}



