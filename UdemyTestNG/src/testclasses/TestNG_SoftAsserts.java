package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAsserts {
	@Test
	public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("running test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumber(1, 2);
		sa.assertEquals(result, 2);
		System.out.println("line after 1 assert");
		sa.assertEquals(result, 3);
		System.out.println("line after 2 assert");
		sa.assertAll();
	}
}
