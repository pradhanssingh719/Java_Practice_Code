package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_BeforeClassAnnotations {
	@BeforeClass
	public void setUp() {
		System.out.println("this run before class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("this run after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("runs before every methond");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("runs after every methond");
	}

	@Test
	public void testMethod1() {
		System.out.println("running test -> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("running test -> testMethod2");
	}

}
