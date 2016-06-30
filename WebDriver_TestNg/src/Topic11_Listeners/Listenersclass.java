package Topic11_Listeners;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listenersclass extends TestListenerAdapter {
	
	
	@Override
	public void onTestStart(ITestResult tr){
		log("Test started.......");
	}
	
	@Override
	public void onTestSuccess(ITestResult tr){
		log("Test '"+tr.getName()+"'passed");
		//This would get priority of the method passed
		// if priority hasnt defined then it would return default priority as '0'
		log("Priorty "+tr.getMethod().getPriority());
	}
	
	@Override
	public void onTestFailure(ITestResult tr){
		log("Test '"+tr.getName()+"' failed");
	//This would get priority of the method passed
	// if priority hasnt defined then it would return default priority as '0'
		log("Priorty "+tr.getMethod().getPriority());

		
	}
	
	@Override
	public void onTestSkipped(ITestResult tr){
		log("Test '"+tr.getName()+"' skipped");
	}

	private void log(String methodName) {
		System.out.println(methodName);
		
		
	}
	
	private void log(IClass testClass){
		System.out.println(testClass);
	}
	
	

}
