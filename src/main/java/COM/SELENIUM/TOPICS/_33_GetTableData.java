

package COM.SELENIUM.TOPICS;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _33_GetTableData {
	
	
	WebDriver driver;
	
	@Test
	public void Invoke_Browser()
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		 List<WebElement> FullList=driver.findElements(By.xpath("//div[@class='tableFixHead']"));
		 int FullList_SizeList=FullList.size();
         System.out.println(FullList_SizeList);
         
         
         for(WebElement web:FullList)
        	 
         { 
        	 String ListAllValue=web.getText();
        	 System.out.println(ListAllValue);
         }
         
         System.out.println("---------------");
		
	    List<WebElement> List=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
	    int List_SizeList=List.size();
	    System.out.println(List_SizeList);
	    int sum=0;
	    
	    for(int i=0;i<List.size();i++)
	    	
	    {
	    	WebElement web=List.get(i);
	    	String Value=web.getText();
	    	System.out.println(Value);
	    	int ActualTotalIntFormat=Integer.parseInt(Value);
	    	System.out.println(ActualTotalIntFormat);
	    	
	    	sum=ActualTotalIntFormat+sum;
	    }
		
		   System.out.println(sum);
		
		  WebElement  TotalAmountCollected=driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']"));
		  String GetTotalAmountCollected=TotalAmountCollected.getText();
		  System.out.println(GetTotalAmountCollected);
		  
		  
		  String Data=GetTotalAmountCollected.split(":")[1].trim();
		  int ExpectedTotalIntFormat=Integer.parseInt(Data);
		  System.out.println(ExpectedTotalIntFormat);
		  
		  Assert.assertEquals(sum, ExpectedTotalIntFormat);
		  
		 
	}
	
	
	
	

}

