package Topic6_TestNg_Groups;

import org.testng.annotations.Test;

public class Example1_Groups {
	
	@Test(groups="Regression")
	public void testcase1(){
		System.out.println("testcase1");
	}
	@Test(groups="Regression")
	public void testcase2(){
		System.out.println("testcase2");
	}
	@Test(groups="Regression")
	public void testcase3(){
		System.out.println("testcase3");
	}
	@Test(groups="Smoke")
	public void testcase4(){
		System.out.println("testcase4");
	}
	@Test(groups="Smoke")
	public void testcase5(){
		System.out.println("testcase5");
	}
	

	
	

}
