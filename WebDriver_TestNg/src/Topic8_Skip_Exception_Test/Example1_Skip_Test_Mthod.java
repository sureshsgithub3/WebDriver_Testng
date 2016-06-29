package Topic8_Skip_Exception_Test;

import org.testng.annotations.Test;

public class Example1_Skip_Test_Mthod {
	
	@Test(enabled=false)
	public void dividedbyzero1(){
		int i=1/0;
	}
	
	@Test
	public void Testcase(){
		System.out.println("Tc1");
	}
}
