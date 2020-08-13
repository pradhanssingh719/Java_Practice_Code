package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Grouping {
	
	@BeforeClass(alwaysRun=true)            //when we are working with grouping this method not belong to any method so it wont run...we are using alwaysRum=true to forcefully run this method
	public void setUp() {					
		System.out.println("before class");
	}
	
	@Test(groups = {"cars","suv"})
	public void testBMW() {
		System.out.println("BMW i8");
	}
	
	@Test(groups = {"cars","sedan"})
	public void tesAudi() {
		System.out.println("Audi A6");
	}
	
	@Test(groups = {"bikes"})
	public void testNinja() {
		System.out.println("Kawasaki Ninja");
	}
	 
	@Test(groups = {"bikes"})
	public void testHonda() {
		System.out.println("Honda CBR");
	}
	
	@AfterClass(alwaysRun=true)
	public void cleanUp() {
		System.out.println("after class");
	}
}
 