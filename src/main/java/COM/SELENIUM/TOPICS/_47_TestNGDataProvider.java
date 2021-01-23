package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _47_TestNGDataProvider {
	
	
	WebDriver driver;
	
	
  @Test(dataProvider = "getData")
  public void DataProvider(String UserName,String Password) 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		
		driver.findElement(By.name("email")).sendKeys(UserName);
		
		driver.findElement(By.name("password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
  }
  
    @DataProvider
    public Object[][] getData()
    
    {
    	
    	Object[][] data=new Object[3][2];//3 rows and 2 columns and its 2 dimensional array
    	
    	data[0][0]="avi";
    	data[0][1]="cspl";
    	data[1][0]="avi.gupta";
    	data[1][1]="cspl@1234";
    	data[2][0]="avi.g";
    	data[2][1]="cspl@123";
    	
    	return data;
    	
    	
    }
  
  
}
