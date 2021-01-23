

package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class _30_ChromeOptions {
	
	
	WebDriver driver;//Webdriver reference globaly declared to access at class level from any method in class.
	
	@Test
	public void ChromeOptions()
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());	
		
		DesiredCapabilities dc=new DesiredCapabilities().chrome();
		//Created DesiredCapabilities class object and get chrome method and extended by DesiredCapabilities class 
		
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		/*setCapability is the method and pass param CapabilityType interface with ACCEPT_INSECURE_CERTS method and extended by CapabilityType interface 
		  and 2 param boolean value true.
		*/
		
    	//dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		/*setCapability is the method and pass param CapabilityType interface with ACCEPT_SSL_CERTS method and extended by CapabilityType interface 
		  and 2 param boolean value true.
		*/

		
		ChromeOptions opt=new ChromeOptions();
		//Created ChromeOptions class object
		
		opt.merge(dc);
		//Merge is the method and extended by chrome option class and pass DesiredCapabilities refference.
		
		opt.addArguments("start-maximized");
		//addArguments is the method and extended by ChromeOptions class and pass one param start-maximized
		
		opt.addArguments("disable-infobars");
		//addArguments is the method and extended by ChromeOptions class and pass one param disable-infobars

		opt.addArguments("--headless");
		//addArguments is the method and extended by ChromeOptions class and pass one param --headless

		
		opt.addArguments("--incognito");
		//addArguments is the method and extended by ChromeOptions class and pass one param --incognito


		
		driver=new ChromeDriver(opt);//Pass ChromeOptions class refference in ChromeDriver class object
		
        driver.get("https://wrong.host.badssl.com/");		
		
	}
	
	
	

}

