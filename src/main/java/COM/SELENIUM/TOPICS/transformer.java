package COM.SELENIUM.TOPICS;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;


public class transformer implements IAnnotationTransformer {
	
	
	
	public void transform(ITestAnnotation ann, Constructor cons, Method meth, Class cls)
	{
		ann.setRetryAnalyzer(retrys.class);
	}
	

}
