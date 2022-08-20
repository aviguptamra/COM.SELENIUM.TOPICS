

package COM.SELENIUM.TOPICS;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _31_BorkenLinks {
	
	
	WebDriver driver;
	
	@Test
	public void BorkenLinks() throws MalformedURLException, IOException
	
	{

		File GoogleChromeDriver=new File("D:\\\\Automation\\\\Selenium\\\\chromedriver_win32(87)\\\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		/*
		WebElement FreeAccess=driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']"));
        String GetAttribute_href=FreeAccess.getAttribute("href");
        System.out.println(GetAttribute_href);
        
        HttpsURLConnection connect=(HttpsURLConnection)new URL(GetAttribute_href).openConnection();
        connect.setRequestMethod("HEAD");
        connect.connect();
        int ResponseCode=connect.getResponseCode();
        System.out.println("ResponseCode is : " + ResponseCode);
        String ResponseMessage=connect.getResponseMessage();
        System.out.println("ResponseMessage is : " +ResponseMessage);
        */
        
        List<WebElement> Link_List= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        int Link_List_Count=Link_List.size(); 
        System.out.println(Link_List_Count);
        
        
        for(WebElement web: Link_List)

        {
        	String href=web.getAttribute("href");
        	System.out.println(href);
        	
        	HttpsURLConnection connection=(HttpsURLConnection)new URL(href).openConnection();
        	connection.setRequestMethod("HEAD");
        	connection.connect();
        	int GetResponseCode=connection.getResponseCode();
        	System.out.println("GetResponseCode is : " + GetResponseCode);
        	String GetResponseMessage=connection.getResponseMessage();
        	System.out.println("GetResponseMessage is : " + GetResponseMessage);
        	
        }
	}
	
	
	
	

}

