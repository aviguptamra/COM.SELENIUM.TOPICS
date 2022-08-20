

package COM.SELENIUM.TOPICS;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _24_LinksCount {
	
	
	WebDriver driver;
	
	@Test
	public void Links_Count()
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		List<WebElement> FullPageLinksCount= driver.findElements(By.tagName("a"));//To get the full page links
		int LinksCountsSize=FullPageLinksCount.size();
		System.out.println(LinksCountsSize);
		
		for(WebElement web:FullPageLinksCount)
 
		{
			String LinkCounts_Text=web.getText();
			System.out.println(LinkCounts_Text);
			
		}
		
		for(int i=0;i<FullPageLinksCount.size();i++)
		
		{
			
			WebElement Element=FullPageLinksCount.get(i);
                 String Text=Element.getText();
                 System.out.println("Link is : " + Text);
			
		}
		
		
		
		 WebElement BottomSection=driver.findElement(By.id("gf-BIG")); //To get the bottom section links only.
		 List<WebElement>BottomSectionLinksCount= BottomSection.findElements(By.tagName("a"));
		 int BottomSectionLinksCountSize=BottomSectionLinksCount.size();
		 System.out.println(BottomSectionLinksCountSize);
		 
		 for(WebElement web: BottomSectionLinksCount)
			 
		 {
			 String BottomSectionLinksCount_Text= web.getText();
			 System.out.println(BottomSectionLinksCount_Text);
		 }
		
		 
		
		 WebElement FirstColumnLinks=driver.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));//To get the bottom section first column links only.
		 List<WebElement>FirstColumnLinksCount= FirstColumnLinks.findElements(By.tagName("a"));
		 int FirstColumnLinksCountSize=FirstColumnLinksCount.size();
		 System.out.println(FirstColumnLinksCountSize);
		 
		 for(WebElement web: FirstColumnLinksCount)
			 
		 {
			
			 String FirstColumnLinksCount_Text= web.getText();
			 System.out.println(FirstColumnLinksCount_Text);
		 }
		
		
	}
	
	
	
	

}

