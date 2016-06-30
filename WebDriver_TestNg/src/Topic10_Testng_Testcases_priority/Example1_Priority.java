package Topic10_Testng_Testcases_priority;

import org.testng.annotations.Test;

public class Example1_Priority {
	
	@Test
	public void Testcase1(){
		System.out.println("Test case1");
	}
	
	@Test(priority=1)
	public void Testcase2(){
		System.out.println("Test case2");
	}
	
	@Test(priority=2)
	public void Testcase3(){
		System.out.println("Test case3");
	}

}
