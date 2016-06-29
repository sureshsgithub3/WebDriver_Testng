package Topic1_TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1_Testng_Anos {
	
	@BeforeTest
	public void beforetestmethod(){
		System.out.println("I will be Executed :before Test");
	}
	@AfterTest
	public void aftertestmethod(){
		System.out.println("I will be Executed :after Test");
	}
	
	@Test
	public void Testcase1(){
		System.out.println("Test case1");
	}
	@Test
	public void Testcase2(){
		System.out.println("Test case2");
	}
	@BeforeMethod
	public void openbrowser(){
		System.out.println("Before each : Test method");
	}
	@AfterMethod
	public void closebrowser(){
		System.out.println("After Each :Test Method ");
	}

}
