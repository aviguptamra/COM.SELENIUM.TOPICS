package COM.SELENIUM.TOPICS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class _42_CustomListener extends _22_HardAssert implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {  

		
		ScreenShot(result.getMethod().getMethodName());
		
		
	}
		   
		   
		   public   void  ScreenShot(String ScreenCast) 
			
			{

			    TakesScreenshot ts= (TakesScreenshot)driver;
				File file=ts.getScreenshotAs(OutputType.FILE);
			    try {
					FileUtils.copyFile(file, new File("./FailureScreenshot/"+ScreenCast+".png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
			}
		
			
		}  
	


