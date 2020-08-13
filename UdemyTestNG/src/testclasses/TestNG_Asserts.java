/***
 * In this code we are using SomeClassToTest from appcode package
 */
package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_Asserts {

	@Test												//this is testNG annotation
	public void testSum() {
		System.out.println("running test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();    
		int result = obj.sumNumber(1, 2);
		Assert.assertEquals(result, 3);
	}
	
	@Test
	public void testString() {
		System.out.println("running test -> testString");
		String expectedString = "Hello World";
		SomeClassToTest obj = new SomeClassToTest();
		String result = obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void testArrays() {
		System.out.println("running test -> testArrays");
		int[] expectedArray = {1,2};
		SomeClassToTest obj = new SomeClassToTest();
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
		System.out.println("End test -> testArrays");
	}
}
