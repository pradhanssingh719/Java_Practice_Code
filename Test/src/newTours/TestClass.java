package newTours;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() {
		baseUrl = "http://newtours.demoaut.com/";
		
		//SelectBrowser.chrome(driver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	
	@Test
	public void test1() {
		LoginPageClass.fillUserName(driver, "psingh123@gmail.com");
		LoginPageClass.fillPassword(driver, "psingh123!");
		LoginPageClass.clickOnSubmit(driver);
		
		FlightSearchClass.tripType(driver, "oneway");   //choose oneway or roundtrip
		FlightSearchClass.numberOfPassenger(driver, "2"); //choose from 1 to 4
		FlightSearchClass.departingCity(driver, "London");  //choose from available city
		FlightSearchClass.arrivingCity(driver, "Paris");		//choose from available city
		FlightSearchClass.departingDate(driver, "10", "May");  //Enter date and month
		FlightSearchClass.returnDate(driver, "15", "May");  //Enter date and month
		FlightSearchClass.serviceClass(driver, "First");		// Coach, Business, First
		FlightSearchClass.airline(driver, "Unified Airlines");			//Unified Airlines, Blue Skies Airlines, No Preference, Pangea Airlines
		FlightSearchClass.clickOnContinue(driver);
	}
	
	
	@After
	public void tearDown() {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("hard coded sleep time is not working.");
		}
		//driver.quit();
	}

}
