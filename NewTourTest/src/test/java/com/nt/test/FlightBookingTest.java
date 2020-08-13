package com.nt.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nt.actions.FlightBookingUIActions;
import com.nt.base.DataSource;
import com.nt.base.UIBase;
import com.nt.utils.CommonUtils;

public class FlightBookingTest extends FlightBookingUIActions {

	FlightBookingUIActions flightsBookingUIAction;

	@BeforeSuite
	@Parameters({"browserName"})
	public void setUp(String browserName) {
		UIBase.browserInitialization(browserName);
		CommonUtils.cleanFolder();
		flightsBookingUIAction = new FlightBookingUIActions();
	}

	@Test(priority = 1)
	public void loginToSite() {
		flightsBookingUIAction.login();
	}

	@Test(dataProvider = "flightBookingData", dataProviderClass = DataSource.class, priority = 2)
	public void bookingDetails(String tripType, String passCount, String departure, String departMonth,
			String departDate, String arriving, String returnMonth, String returnDate, String serviceClass,
			String airline) {
		flightsBookingUIAction.flightBooking(tripType, passCount, departure, departMonth, departDate, arriving,
				returnMonth, returnDate, serviceClass, airline);
	}

	@Test(dataProvider = "flightBookingData", dataProviderClass = DataSource.class, priority = 3)
	public void FlightSelection(String departFlight, String retrunFlight) {
		// we are getting data in String format but here we required int value
		int departFlightNum = Integer.parseInt(departFlight);
		int retrunFlightNum = Integer.parseInt(retrunFlight);
		flightsBookingUIAction.checkFlightAndSelect(departFlightNum, retrunFlightNum);
	}

	@Test(dataProvider = "flightBookingData", dataProviderClass = DataSource.class, priority = 4, enabled = true)
	public void passengerDetails(String firstName, String lastName, String meal, String cardType, String cardNumber,
			String expMonth, String expYear, String ccFirstName, String ccMidName, String ccLastName) {
		flightsBookingUIAction.enterPassengerDetails(firstName, lastName, meal, cardType, cardNumber, expMonth, expYear,
				ccFirstName, ccMidName, ccLastName);
	}

	@Test(dataProvider = "flightBookingData", dataProviderClass = DataSource.class, priority = 5)
	public void billAddressDetails(String billAddressLine1, String billAddressLine2, String billCity, String billState,
			String billZip, String billCountry) {
		flightsBookingUIAction.billingAddress(billAddressLine1, billAddressLine2, billCity, billState, billZip,
				billCountry);
	}

	@Test(dataProvider = "flightBookingData", dataProviderClass = DataSource.class, priority = 6)
	public void delAddressDetails(String delAddressLine1, String delAddressLine2, String delCity, String delState,
			String delZip, String delCountry) {
		flightsBookingUIAction.deliveryAddress(delAddressLine1, delAddressLine2, delCity, delState, delZip, delCountry);
		flightsBookingUIAction.BuyFlightAndLogout();
	}
	
	@AfterSuite
	public void tesrDown() {
		driver.quit();
	}
}
