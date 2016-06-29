package Topic9_Timeout_Testng;

import org.testng.annotations.Test;

public class Example1_Timeout {
	
	
	@Test(timeOut=2000)
	public void testcase1() throws Exception{
		System.out.println("Test case");
		Thread.sleep(3000);
	}
	
	@Test
	public void testcase2(){
		System.out.println("Test case2");
	}

}
