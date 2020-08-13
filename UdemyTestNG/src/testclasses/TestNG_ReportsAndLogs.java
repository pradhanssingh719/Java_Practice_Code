package testclasses;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNG_ReportsAndLogs {

	@BeforeClass
	public void setUp() {
		Reporter.log("TestNG_ReportsAndLogs => this one is run once before the class", true);   //if we set it to false then it wont print anything
	}

	@Test
	public void testMethod1() {
		Reporter.log("TestNG_ReportsAndLogs => testMethod1", true);
		Assert.assertTrue(true);
	}
	
	@Test
	public void testMethod2() {
		Reporter.log("TestNG_ReportsAndLogs => testMethod2", true);
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"testMethod2"}, enabled=false)
	public void testMethod3() {
		Reporter.log("TestNG_ReportsAndLogs => testMethod3", true);
	}
	
	@AfterClass
	public void cleanUp() {
		Reporter.log("TestNG_ReportsAndLogs => this one is run once after the class", true);
	}

}
