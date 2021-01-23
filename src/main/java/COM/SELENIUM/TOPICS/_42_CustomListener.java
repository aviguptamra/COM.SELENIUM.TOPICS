package COM.SELENIUM.TOPICS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class _42_CustomListener extends _22_HardAssert implements ITestListener {
	
	
	public void onTestFailure(ITestResult result) {  

		
		try {
			ScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		   
		   
		   public   void  ScreenShot(String ScreenCast) throws IOException
			
			{

			    TakesScreenshot ts= (TakesScreenshot)driver;
				File file=ts.getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(file, new File("./FailureScreenshot/"+ScreenCast+".png"));
				
				
				
				
				
			}
		
			
		}  
	


