

package COM.SELENIUM.TOPICS;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class _44_RetryAnalyzer implements IRetryAnalyzer {
	
	int counter=0;
	int limit=1;

	public boolean retry(ITestResult result) {
		
		if(counter<limit)
		{
			counter++;
			
			
			return true;
		}
		
		
		return false;
		
		
	}
	
	
	
	
	
	
	
	

}

