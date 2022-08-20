package COM.SELENIUM.TOPICS;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.tools.ant.taskdefs.condition.Or;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _48_Sorting {
	
	WebDriver driver;
	
	@Test
	public void Regular()
	
	{
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Avi");
		names.add("Abhishek");
		names.add("Nanne");
		names.add("Tom");
		names.add("Alexender");
		names.add("Rahul");
		names.add("Ronak");
		
		int count=0;
		
		for(int i=0;i<names.size();i++)
			
		{
			 String Names=names.get(i);
			 System.out.println(Names);
			 
			 if(Names.startsWith("A"))
				 
			 {
				 count++;
			 }
		}
		
		System.out.println(count);
		
	}
	
	@Test
	public void StreamFilter()
	
	{
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("Avi");
		name.add("Abhishek");
		name.add("Nanne");
		name.add("Tom");
		name.add("Alexender");
		name.add("Rahul");
		name.add("Ronak");
		
		Long count= name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count);
		
		Long counts=Stream.of("Ramesh","Ravish","Abhinav","Boul").filter(s->s.startsWith("A")).count();
		System.out.println(counts);
		
		
	}
	
	@Test
	public void InSortedOrder()
	
	{
		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//span[@class='sort-icon sort-descending']")).click();
		
	    List<WebElement>Element= driver.findElements(By.xpath("//td[1]"));
	    
	    List<String> Original_List= Element.stream().map(s->s.getText()).collect(Collectors.toList());
	    
	    List<String> Sorted_List= Original_List.stream().sorted().collect(Collectors.toList());
	    
	    Assert.assertEquals(Original_List, Sorted_List);
	    
	    
	}
	
	
}
