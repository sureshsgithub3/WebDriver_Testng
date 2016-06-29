package Topic7_TestNg_Exception_Test;

import org.testng.annotations.Test;

public class Example1_ExceptionHandling_in_TestNg {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void dividedbyzero(){
		int i=1/0;
		
		
	}
	@Test
	public void dividedbyzero1(){
		int i=1/0;
		
		
	}

}
