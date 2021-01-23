

package COM.SELENIUM.TOPICS;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class _45_AnnatotationTransformer implements IAnnotationTransformer {
	
	
	
		public void Transform(ITestAnnotation ann,Class classes,Constructor construc, Method method)
		{
			ann.setRetryAnalyzer(_44_RetryAnalyzer.class);
		}
		
	}
	
	
	
	
	
	
	
	



