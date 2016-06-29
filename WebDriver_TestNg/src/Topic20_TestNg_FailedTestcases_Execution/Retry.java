package Topic20_TestNg_FailedTestcases_Execution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	private int retrycnt=0;
	private int maxretrycnt=1;
	
	//below method returns true fi the method has to be retried else 
	//false and it takes the 'result' as parameter of the test method that just ran
	
	
	@Override
	public boolean retry(ITestResult result) {
		if(retrycnt<maxretrycnt){
			System.out.println("retryng test "+result.getName()+ "with status"
					+getresultStatuName(result.getStatus())+" for the "+(retrycnt+1)
					+"  times.");
			retrycnt++;
			return true;
		}
		return false;
		
		
	}

	private String getresultStatuName(int status) {
		String resultName= null;
		if(status==1)
			resultName="success";
		if(status==2)
			resultName="Failure";
		if(status==3)
			resultName="Skip";
		return resultName;
	}
	

}
