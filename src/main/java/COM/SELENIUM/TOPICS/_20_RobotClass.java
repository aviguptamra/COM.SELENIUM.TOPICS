package COM.SELENIUM.TOPICS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _20_RobotClass {
	
	
	WebDriver driver;
	
	
	
  @Test
  public void Robot_Class() throws AWTException, InterruptedException 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/seeker/registration?");
		
		
		    StringSelection ss=new StringSelection("C:\\Users\\Avi Gupta\\Desktop\\Capture.PNG");
		    //Created Stringselection class object and pass 1 param as a file name
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		    /*Toolkit is the abstract class and getDefaultToolkit is method and extended by Abstract toolkit class and getsystemclipboard 
		    is the abstract method and extended by toolkit abstract class and setcontents is the method and extended by clipborad class and pass
		    2 param in 1 param stringselection class object reffrence and in 2 null.
		    */
		    driver.findElement(By.xpath("//span[text()='Choose file']")).click();
		    
		    Thread.sleep(5000);
		   
		    Robot robot=new Robot();
		    //Created robot class object
		    
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     //To press cntl
		     robot.keyPress(KeyEvent.VK_V);
		    //To press V

		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    //To release the contrl press key
		    robot.keyRelease(KeyEvent.VK_V);
		    //To release the V press key
		    
		    robot.keyPress(KeyEvent.VK_ENTER);
		    //To press Enter/ OK button 
		    robot.keyRelease(KeyEvent.VK_ENTER);
	       //To relase Enter/ Ok button
		
  }
  
  
}
