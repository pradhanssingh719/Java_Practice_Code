package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listenerspackage.CustomListener1;

@Listeners(CustomListener1.class)
public class TestNG_ListenersTest1 {

	@BeforeClass
	public void setUp() {
		System.out.println("before class");
	}

	@Test
	public void testMethod1() {
		System.out.println("testMethod1 code");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testMethod2() {
		System.out.println("testMethod2 code");
		Assert.assertTrue(false);
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("after class");
	}

}
