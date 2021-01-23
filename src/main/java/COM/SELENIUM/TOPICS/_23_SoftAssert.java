

package COM.SELENIUM.TOPICS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class _23_SoftAssert {
	
	
	WebDriver driver;
    SoftAssert asserts;
	
	@Test(priority = 1)
	public void TestCase_1()
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		asserts=new SoftAssert();
		
		
		WebElement Home=driver.findElement(By.xpath("//button[text()='Home']"));
		String Home_Text=Home.getText();
		System.out.println(Home_Text);
		
         asserts.assertEquals(Home_Text, "Ho");
        //TestNG assertEquals used to verify the text and returns nothing and pass 2 param actual and expected and if asserts failed then next line of code will be execute.		
        
		driver.findElement(By.name("radioButton")).click();
		
		asserts.assertAll();//assertAll method collect all the assert result, if not implemented then failed test cases won't show as failure even testcases failed.
		
	}
	
	
	@Test(priority = 2)
	public void TestCase_2()
	
	{	
		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		asserts=new SoftAssert();
		
		
		WebElement Home=driver.findElement(By.xpath("//button[text()='Home']"));
		String Home_Text=Home.getText();
		System.out.println(Home_Text);
		
         asserts.assertEquals(Home_Text, "Home");
        //TestNG assertEquals used to verify the text and returns nothing and pass 2 param actual and expected and if asserts failed then next line of code will be execute.		
        
		driver.findElement(By.name("radioButton")).click();
		
		asserts.assertAll();//assertAll method collect all the assert result, if not implemented then failed test cases won't show as failure even testcases failed.
		
	}
	
	
	
	

}

