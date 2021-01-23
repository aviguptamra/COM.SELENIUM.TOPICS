

package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _22_HardAssert {
	
	
	static WebDriver driver;
	
	@Test(retryAnalyzer = _44_RetryAnalyzer.class)
	public void HardAssert()
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		WebElement Home=driver.findElement(By.xpath("//button[text()='Home']"));
		String Home_Text=Home.getText();
		System.out.println(Home_Text);
		
        Assert.assertEquals(Home_Text, "Ho");
        //TestNG assertEquals used to verify the text and returns nothing and pass 2 param actual and expected and if asserts failed then next line of code won't execute.		
        
		driver.findElement(By.name("radioButton")).click();
		
	}
	
	
	
	

}

