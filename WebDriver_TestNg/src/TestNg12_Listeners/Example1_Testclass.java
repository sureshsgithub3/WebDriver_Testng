package TestNg12_Listeners;

import org.testng.annotations.Test;

public class Example1_Testclass {
	
	
	@Test
	public void AddNumbers(){
		System.out.println("Adding numbers");
	}
	
	@Test
	public void Didvidedbyzero(){
		int i=1/0;
	}
    
	
	@Test(dependsOnMethods={"Didvidedbyzero"})
	public void Methodtoskip(){
		System.out.println("Method to Skip");
	}
	
}
