package testclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {
	
//	@DataProvider(name="inputs")     //for better readability and clear code we can put this method inside an another class  (TestData)
//	public Object[][] getData(){
//		return new Object[][] {
//			{"pradhan","singh"},
//			{"rakesh","kumar"},
//			{"pradhan","meena"}
//		};
//	}
	
	
	@Test(dataProvider = "inputs", dataProviderClass = TestData.class)		//we need to provide class name as well 
	public void test(String fname, String lname) {
		System.out.println("Name: " + fname +" "+ lname);
	}
}
