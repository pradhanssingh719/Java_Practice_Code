package testclasses;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestNG_ITestResultDemo {
	@Test
	public void testMethod1() {
		System.out.println("testMethod1" );
		Assert.assertTrue(false);               //we are making it intentionally fail
	}
	
	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
//		System.out.println(testResult.getName());            //this method will return the name of method
//		System.out.println(testResult.getStatus());			//this will return status of the method           (it returns an integer value 1 for pass and 2 for fail)
		
		if(testResult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Method " + testResult.getName() + " is passed.");
		}
		if(testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Method " + testResult.getName() + " is failed.");
		}
	}

}
