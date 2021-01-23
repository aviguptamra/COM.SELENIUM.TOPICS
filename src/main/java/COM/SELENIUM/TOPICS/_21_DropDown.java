

package COM.SELENIUM.TOPICS;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _21_DropDown {
	
	
	WebDriver driver;
	
	@Test
	public void Dropdown() throws InterruptedException
	
	{

		File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement DropDown=driver.findElement(By.id("dropdown-class-example"));
		
		Select select=new Select(DropDown);//Created select class object and pass one param and assigned one webelement
		
		Thread.sleep(2000);
		
		select.selectByIndex(1);//We can select dropdown value by Select by index and Select by index is the method of select class and returns nothing
		
		Thread.sleep(2000);
		
		select.selectByValue("option2");//We can select dropdown value Select by value which is availabel in <tag> and Select by value is the method of select class and returns nothing
		
		Thread.sleep(2000);
		
		select.selectByVisibleText("Option3");//We can select dropdown value by Select by visible text and Select by visible text is the method of select class and returns nothing
		
		
		  WebElement GetFirstSelectOption=select.getFirstSelectedOption();
		  //To get the firstselected option from dropdown and getFirstSelectedOption is the method of select class and returns one webelement
		  String GetFirstSelectOption_Text=GetFirstSelectOption.getText();
		  System.out.println(GetFirstSelectOption_Text);
		  
		  
		  
		  
		  List<WebElement>GetAllOptionsForDropDown= select.getOptions();
		  //To get the all options from dropdown and getoptions is method of select class and returns List of <Webelement>
		  int GetOptionsForDropDownSize=GetAllOptionsForDropDown.size();
		  System.out.println(GetOptionsForDropDownSize);
		  
		  
		  for(WebElement web:GetAllOptionsForDropDown)
			  
		  {
			  String GetAllOptionsForDropDown_Text= web.getText();
			  System.out.println(GetAllOptionsForDropDown_Text);
		  }
		
		
	}
	
	
	
	

}

