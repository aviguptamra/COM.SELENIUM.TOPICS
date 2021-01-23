

package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _26_Scrolling {
	
	
	WebDriver driver;
	
	@Test
	public void Invoke_Browser() throws InterruptedException
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scroll(0,500)");
		//Here you have to typecast with driver into javascriptexecutor and execute script is the abstract method and extended by javascriptexecutor interface and pass one param scroll(horizantal cordinates, vertical conrdinates)
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		
		
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");//To scroll inside the table on webpage
		
	}
	
	
	
	

}

