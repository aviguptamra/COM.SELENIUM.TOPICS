package COM.SELENIUM.TOPICS;


import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.tools.ant.taskdefs.condition.Or;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class _50_Xpath {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
        File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		
	}
	
	@Test
	public void XapthFunctions()
	
	
	{
		
		/*Absloute Xpath : Absloute xpath starts from parent node to child node and starts with single slash (/) but disadvantage is if any changes
		 made between the given xpath then Absloute xpath will be failed so, We should not use absloute xpath.
		*/
		
		/*Relative Xpath: Relative xpath starts from middle of the HTML DOM structure It starts with double forward slash (//). 
		 * It can search the elements anywhere on the webpage.
		 */
		
	    
         driver.findElement(By.xpath("//input[@name='email']"));//Relative xpath with the help of 'name' attribute
	   
         driver.findElement(By.xpath("//input[@type='password']"));//Relative xpath with the help of 'type' attribute
         
         driver.findElement(By.xpath("//div[text()='Login']"));//Relative xpath with the help of 'text()' attribute but cannot use @ with text attribute
         
         driver.findElement(By.xpath("//a[contains(text(),'orgot your password?')]"));//Relative xpath with the help of contains xpath function
         
         driver.findElement(By.xpath("//a[@href='https://classic.freecrm.com/login.cfm' or text()='Classic CRM11111']"));//Relative xpath with the help of or xpath function
         
        
         driver.get("https://classic.freecrm.com/login.cfm");
         
                    
         driver.findElement(By.xpath("//input[@class='span2' and @type='text']"));//Relative xpath with the help of and xpath function
         
         
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         
         
         driver.findElement(By.xpath("//input[@class='btn-style']//following-sibling::input[@id='confirmbtn']"));//Relative xpath with the help of //following-sibling::tag xpath function
	
         driver.findElement(By.xpath("//td[text()='Engineer']//preceding::td[text()='Alex']"));//Relative xpath with the help of //preceding::tag xpath function
    
         driver.findElement(By.xpath("//input[starts-with(@value,'radi')]"));//Relative xpath with the help of starts-with(@attribute,'AttributeValue') xpath function
	
	}
	
}
	
	

