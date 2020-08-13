package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_EnableTimeOut {
	@BeforeClass
	public void setUp() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("after class");
	}
	
	@Test(enabled=false)      //now this method will be ignored
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test(timeOut=100)              //if we don't want to wait for long time to execute test method we can set timeout in millisecond if test will not performed in particular time then it will fail
	public void testMethod2() throws InterruptedException {
		System.out.println("testMethod2");
		Thread.sleep(200);
	}
	
}
 