package Topic20_TestNg_FailedTestcases_Execution;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation testannotation, Class testclass, Constructor testconstructor,
			Method testmethod) {
		
		IRetryAnalyzer retry=testannotation.getRetryAnalyzer();
		
		if(retry==null){
			testannotation.setRetryAnalyzer(Retry.class);
		}
		
	}

}
