package Topic10_TestCasePriorty;

import org.testng.annotations.Test;

public class Example1_TestNg_Priorty {
	@Test
	public void Register(){
		System.out.println("Register");
	}
	
	
	@Test(priority=1)
	public void Login(){
		System.out.println("Login Case");
	}
	
	@Test(priority=2)
	public void Logout(){
		System.out.println("Logout case");
	}

}
