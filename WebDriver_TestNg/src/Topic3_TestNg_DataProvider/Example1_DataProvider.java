package Topic3_TestNg_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example1_DataProvider {
	
	
	
	@DataProvider
	public Object[][] getdata(){
		Object[][] data=new Object[2][2];
		data[0][0]="AA";
		data[0][1]="**";
		data[1][0]="BB";
		data[1][1]="**";
		return data;
	}
	
	@Test(dataProvider="getdata")
	public void setdata(String username,String password){
		System.out.println("UserName :"+username);
		System.out.println("Password :"+password);
	}
	

}
