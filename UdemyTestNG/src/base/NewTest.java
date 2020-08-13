package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  
	@Test(dependsOnMethods = "test5", priority=1)
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority=3)
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(priority=4)
	public void test5() {
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("test5");
		sa.assertAll();
	}
	
	@Test(priority=5)
	public void test4() {
		System.out.println("test4");
	}

	
}
