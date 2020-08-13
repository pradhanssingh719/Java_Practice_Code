package locatingElements;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntroduction {

	@BeforeClass								//it will execute once before any thing start
	public static void bc() {
		System.out.println("Execute Before class..");
	}
	
	@AfterClass									//it will execute once after everything is done
	public static void ac() {
		System.out.println("Execute After class..");
	}
	
	@Before										//it will always execute before every test case
	public void before() {
		System.out.println("Execute Before..");
	}
	@After										//it will always execute after every test case
	public void after() {
		System.out.println("Execute After..");
	}
	@Test										//this is test case 1
	public void test1() {
		System.out.println("Execute test1..");
	}
	
	@Test									//this is test case 2
	public void test2() {
		System.out.println("Execute test2..");
	}

}
