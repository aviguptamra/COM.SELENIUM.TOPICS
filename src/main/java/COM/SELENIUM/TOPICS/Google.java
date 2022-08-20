package COM.SELENIUM.TOPICS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Google implements ITestListener{
	
	
	static WebDriver driver;
	@Test(groups = "Smoke")
	public void Googles() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String Title=driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Google1");
		
	}
	
	
	public  static void TakScreenshot(String SS) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("./GetScreenShot/"+SS+".png"));
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		
		try {
			TakScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
