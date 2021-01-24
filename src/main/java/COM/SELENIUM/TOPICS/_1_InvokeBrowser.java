

package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _1_InvokeBrowser {
	
	
	WebDriver driver;//Webdriver reference globaly declared to access at class level from any method in class.
	
	@Test
	public void Invoke_Browser()
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		//Need to mention which browser you want to open(Key), Where is your Browser driver.exe file(Value).
		
		driver=new ChromeDriver();
		//Create the chromedriver class object and implement into webdriver interface variable to launch the browser.
		
		//ChromeDriver driver1=new ChromeDriver();
		//We can do above this to launch the browser but if we want to open FF browser then need to create another browser driver class object again, so we will implement browser class object into webdriver interface.
		

               //Git practise
		       //Git Demo

                  //Git practise
		       //Git Demo
		

                 //Git practise
		       //Git Demo
		
		
	}
	
	
	
	

}

