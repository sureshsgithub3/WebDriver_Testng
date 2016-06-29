package Topic8_Skip_Exception_Test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Example2_SkipException {
	
	@Test
	public void dividedbyzero1(){
		int i=1/0;
		throw new SkipException("skip this Exception");
		
	}

}
