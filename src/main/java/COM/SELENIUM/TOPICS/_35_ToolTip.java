

package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _35_ToolTip {
	
	
	WebDriver driver;//Webdriver reference globaly declared to access at class level from any method in class.
	
	@Test
	public void ToolTip()
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//button[text()='Mouse Hover']"))).build().perform();
		
		WebElement MouseHover_Text=driver.findElement(By.xpath("//a[text()='Top']"));
		String Get_MouseHover_Text=MouseHover_Text.getText();
		System.out.println(Get_MouseHover_Text);
		
	}
	
	
	
	

}

