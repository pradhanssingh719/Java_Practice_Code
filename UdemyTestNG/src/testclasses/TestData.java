package testclasses;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="inputs")     
	public Object[][] getData(){
		return new Object[][] {
			{"pradhan","singh"},
			{"rakesh","kumar"},
			{"pradhan","meena"}
		};
	}
}
