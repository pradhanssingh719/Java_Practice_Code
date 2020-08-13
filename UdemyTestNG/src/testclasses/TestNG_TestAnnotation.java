package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_TestAnnotation {

	@Test												//this is testNG annotation
	public void testMethod1() {
		SomeClassToTest obj = new SomeClassToTest();    //this is how we test a class in testNG
		int result = obj.sumNumber(1, 2);
		System.out.println("running test -> testMethod1");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("running test -> testMethod3");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("running test -> testMethod2");
	}
}
