package extentreportse;

import org.testng.annotations.DataProvider;

public class FacebookDataProvider {

	@DataProvider(name= "inputs")
	public Object[][] getData(){
		return new Object[][] {
			{"7007829","pass07"},
			{"7007829","pass077df2"},
			{"70078291dfdf31","pasdfdfds077"}
		};
	}
	
}
