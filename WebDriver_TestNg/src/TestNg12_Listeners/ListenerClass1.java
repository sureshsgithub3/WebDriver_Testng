package TestNg12_Listeners;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerClass1 extends TestListenerAdapter {
	
	
	@Override
	public void onTestStart(ITestResult tr){
		log("Test started....");
	}
	
	@Override
	public void onTestSuccess(ITestResult tr){
		log("Test '"+tr.getName()+"' passed");
		//this will print the class name in which the method is present
		// of the priority is nt defined it will print default priority '0'
		log("Priority of this method is "+tr.getMethod().getPriority());
		System.out.println(".......");
	}
	
	@Override
	public void onTestFailure(ITestResult tr){
		log("Test '"+tr.getName()+"' failed");
		log("Priority :"+tr.getMethod().getPriority());
		System.out.println("......");
	}
	
	public void onTestSkipped(ITestResult tr){
		log("Test '"+tr.getName()+" ' skipped");
		log("priorty :"+tr.getMethod().getPriority());
	}

	private void log(String methodName) {
		System.out.println(methodName);
		
	}
	
	private void log(IClass testClass){
		System.out.println(testClass);
	}

}
