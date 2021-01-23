

package COM.SELENIUM.TOPICS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _27_TakeScreenShot {
	
	
	WebDriver driver;//Webdriver reference globaly declared to access at class level from any method in class.
	
	@Test
	public void ScreenShot() throws IOException
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		driver=new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshot/"+"Screencast"+".png"));
		/*Here you have to typecast with driver into TakesScreenshot interface and getScreenshotAs abstract method 
		 * and pass one param implement OutputType interface and take file abstract method and call copyfile method and extended by fileutils class
		   and two param in 1. pass TakesScreenshot interface refference and put where you want to save screenshot address file class object
		
		*/
		//File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyDirectory(file1, new File("./Screenshot/"+"ScreenShot"+".png"));
		
	}
	
	
	
	

}

