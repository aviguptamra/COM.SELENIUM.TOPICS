

package COM.SELENIUM.TOPICS;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class _46_SeleniumGrid {
	
	
	WebDriver driver;
	
	@Test
	public void Selenium_Grid() throws MalformedURLException
	
	{

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.109:4444/wd/hub"), dc);
		driver.get("https://www.google.com");
		
	}
	
	
	/*
	 *
	 Hub machine configuration:
	 1.Selenium server standlone.jar file should download.(Same version file should download on both machine hub and node)
	 
	 To create hub :  java -jar selenium-server-standalone-3.14.0.jar -role hub
	 
	 To create node : java -Dwebdriver.chrome.driver="D:\Automation\chromedriver_win32(87)\chromedriver.exe" -jar selenium-server-standalone-3.14.0.jar
	  -role node -hub http://192.168.0.109:4444/grid/register/
	 
	 Node machine configuration:
	 1.Selenium server standlone.jar file should download.(Same version file should download on both machine hub and node)
	 2.Browser should install.
	 2.Browser driver should download.
	
	 Note: If we create node at another machine then wont connect to hub, if we create node same or on hub machine then issue occured.
	 
	 */
	
	
	

}

