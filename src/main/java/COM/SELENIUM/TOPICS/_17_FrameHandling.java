package COM.SELENIUM.TOPICS;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _17_FrameHandling {
	
	
	WebDriver driver;
	
	
  @Test
  public void Implicit_Wait() 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
	
		driver.switchTo().frame("courses-iframe");//by ID or Name
		/*It is used to switch on frame, In the frame multiple webelement can be avilabel and switchTo is the abstract method
		  which is extended by webdriver interface and frame is the abstract method which is extended by trargetlocator interface and
		  SwitchTo method is used to switch on frame and frame method need to put frame name.
		 */
              
		String Login=driver.findElement(By.xpath("//a[text()='Login']")).getText();
	    System.out.println(Login);
	    
	    driver.switchTo().parentFrame();
	    /*It is used to switch on default page and switchTo is the abstract method
		  which is extended by webdriver interface and Parentframe is the abstract method which is extended by trargetlocator interface and
		  SwitchTo method is used to switch it and Parentframe method is used to switch on Parent frame.
		 */
	    
	    String Home=driver.findElement(By.xpath("//button[text()='Home']")).getText();
	    System.out.println(Home);
	    
	    
	    driver.switchTo().frame(0);//by Index
	    
	    String Login1=driver.findElement(By.xpath("//a[text()='Login']")).getText();
	    System.out.println(Login1);
	    
	    driver.switchTo().parentFrame();
	    
	    String Home1=driver.findElement(By.xpath("//button[text()='Home']")).getText();
	    System.out.println(Home1);
	    
	    
	    driver.switchTo().frame(driver.findElement(By.name("iframe-name")));//by Locator
	    
	    String Login2=driver.findElement(By.xpath("//a[text()='Login']")).getText();
	    System.out.println(Login2);
	    
	    driver.switchTo().parentFrame();
	    
	    String Home2=driver.findElement(By.xpath("//button[text()='Home']")).getText();
	    System.out.println(Home2);
	    
	    driver.switchTo().defaultContent();
	    
		
  }
  
  
}
