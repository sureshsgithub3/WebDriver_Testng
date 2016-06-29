package Topic21_Testng_Test_Run_Count_after_retry;

import java.util.Set;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class Example1_TestListeners implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
		Set<ITestResult>failedtests=context.getFailedTests().getAllResults();
		for(ITestResult temp:failedtests){
			ITestNGMethod method=temp.getMethod();
			if(context.getFailedTests().getResults(method).size()>1){
				failedtests.remove(temp);
			}else{
					if(context.getPassedTests().getResults(method).size()>0){
						failedtests.remove(temp);
					}
				}
			}
		}
		
		
	

	
	public void onStart(ITestContext result) {
		
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		
	}

	
	public void onTestSkipped(ITestResult result) {
		
		
	}

	
	public void onTestStart(ITestResult result) {
		
		
	}

	
	public void onTestSuccess(ITestResult result) {
		
		
	}

}
