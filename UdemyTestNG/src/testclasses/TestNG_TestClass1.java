package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_TestClass1 {
	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_TestClass1 -> this run before class");

	}

	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_TestClass1 -> this run after class");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestNG_TestClass1 -> runs before every methond");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestNG_TestClass1 -> runs after every methond");

	}

	@Test
	public void testMethod1() {
		System.out.println("running test ->TestNG_TestClass1 -> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("running test ->TestNG_TestClass1 -> testMethod2");

	}

}
