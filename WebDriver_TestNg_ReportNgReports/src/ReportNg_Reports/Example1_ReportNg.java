package ReportNg_Reports;

import org.testng.annotations.Test;

public class Example1_ReportNg {
	
	
	@Test(timeOut=1000)
	public void Testcase1() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("Testcase1");
	}
	public void Testcase2(){
		
		System.out.println("Testcase2");
	}
	

}
