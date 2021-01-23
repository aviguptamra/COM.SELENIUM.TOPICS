package COM.SELENIUM.TOPICS;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _29_ActionsClass {
	
	
	WebDriver driver;
	
	
  @Test
  public void ActionsClass() throws InterruptedException 
  
  {
	  
	  File GoogleChromeDriver=new File("D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", GoogleChromeDriver.getAbsolutePath());		
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
	   Actions action=new Actions(driver);
	  driver.findElement(By.xpath("//button[text()='OK']")).click(); 
	  WebElement Trains= driver.findElement(By.xpath("//strong[text()='TRAINS']"));
	  WebElement IRCTCTRAINS=driver.findElement(By.xpath("//span[text()='IRCTC TRAINS']"));
	  WebElement Searchbutton=driver.findElement(By.xpath("//button[text()='Search']"));
	  WebElement Searchbox=driver.findElement(By.xpath("//input[@role='searchbox']"));
	  
	  
	  
	  action.clickAndHold(Trains).build().perform();
	  //ClickandHold method is used to click the any menu in that menu multiple option will be there and clicknadHold methid is the actions class method
	  
	  action.moveToElement(IRCTCTRAINS).build().perform();
	  //moveToElement method is used to identify webelement and clicknadHold method is the actions class method

		
      action.contextClick(IRCTCTRAINS).build().perform();   
      //contextClick method is used to mouse right click option and contextClick is the actions class method
		
	  action.doubleClick(Searchbutton).build().perform();
	  //doubleClick method is used to doble click on any webelement and doubleClick method is the actions class method
	  
	  action.sendKeys(Searchbox, Keys.F12).build().perform();
	  action.sendKeys(Searchbox, Keys.SEMICOLON).build().perform();
	  action.sendKeys("Delhi").build().perform();
	  action.sendKeys(Searchbox, Keys.NUMPAD6).build().perform();
		
	  action.click(Searchbutton).build().perform();
	  
	  
	  driver.get("https://www.globalsqa.com/demo-site/sorting/#Portlets");
	  
	
	  driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']")));
	  WebElement Drag=driver.findElement(By.xpath("//div[text()='Shopping']"));
	  WebElement Drop=driver.findElement(By.xpath("//div[text()='Feeds']"));
	  
	  action.dragAndDrop(Drag, Drop).build().perform();
	  //dragAndDrop method is used to drag to one webelement on any webelement place and dragAndDrop method is the actions class method

	  
	  driver.get("https://jqueryui.com/slider/");
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	  WebElement DragSlider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

	  
	  action.dragAndDropBy(DragSlider, 500, 0).build().perform();
	  //dragAndDrop method is used to drag to one webelement on any webelement place via cordinates and dragAndDrop method is the actions class method
  }
  
  
}
