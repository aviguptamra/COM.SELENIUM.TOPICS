

package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _32_CSSSelector {
	
	
	WebDriver driver;
	
	@Test
	public void CSSSelector()
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		driver.findElement(By.cssSelector("a.blinkingText"));
		//tagname.classname
		
		driver.findElement(By.cssSelector("input#name")).sendKeys("Selenium");
		//tagname#id, input#radioButton cannot use and it wont work
		
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		//it wont use // with tagname and @ with attribute
		
		driver.findElement(By.cssSelector("a[class='btn-style class1 class2']")).click();
		//it wont use // with tagname and @ with attribute
		
		driver.findElement(By.cssSelector("input[name='show-hide']")).sendKeys("Appium");
		//it wont use // with tagname and @ with attribute
		
		driver.findElement(By.cssSelector("button[id='openwindow']")).click();
		//it wont use // with tagname and @ with attribute
		
		
		
	}
	
	
	
	

}

