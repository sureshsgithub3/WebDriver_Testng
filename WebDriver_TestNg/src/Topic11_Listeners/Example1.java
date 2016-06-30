package Topic11_Listeners;

import org.testng.annotations.Test;

public class Example1 {
	
	@Test
	public void Testcase(){
		System.out.println("Test case1");
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void dividedbyzero(){
		int i=1/0;
		System.out.println("divided by 0");
	}
	
	@Test(dependsOnMethods="dividedbyzero")
	public void methodtoskip(){
		System.out.println("methodtoskip");
	}

}
