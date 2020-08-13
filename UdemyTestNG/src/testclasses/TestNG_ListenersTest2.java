package testclasses;

//import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import listenerspackage.CustomListener2;

//@Listeners(CustomListener2.class)
public class TestNG_ListenersTest2 {

	/**
	 * this one is testing for it ISuiteListener's method will run before @BeforeSuite annotation method
	 */
//	@BeforeSuite                           
//	public void beforeSuite() {
//		System.out.println("it will rum before suite...@BeforeSuite annotation");
//	}
	
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
	
	@Test(dependsOnMethods = {"testMethod2"})
	public void testMethod3() {
		System.out.println("testMethod3 code");
	}
	
	
	@AfterClass
	public void cleanUp() {
		System.out.println("after class");
	}

}
