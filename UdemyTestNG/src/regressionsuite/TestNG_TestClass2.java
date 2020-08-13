package regressionsuite;

import org.testng.annotations.Test;

import base.BaseTestSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_TestClass2 extends BaseTestSuite{
	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_TestClass2 -> before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_TestClass2 -> after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestNG_TestClass2 -> before every methond");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestNG_TestClass2 -> after every methond");
	}
	
	
	@Test
	public void testMethod1() {
		System.out.println("TestNG_TestClass2 -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("TestNG_TestClass2 -> testMethod2");
	}

	

}
