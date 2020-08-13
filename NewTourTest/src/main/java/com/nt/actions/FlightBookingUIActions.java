package com.nt.actions;

import java.util.Arrays;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nt.repo.FlightBookingRepo;
import com.nt.utils.Environment;

public class FlightBookingUIActions extends FlightBookingRepo {
	public static Select select;

	public void login() {
		enterUsername().clear();
		enterUsername().sendKeys(Environment.getUsername());
		enterPassword().clear();
		enterPassword().sendKeys(Environment.getPassword());
		loginButton().click();
	}

	public void flightBooking(String tripType, String passCount, String departure, String departMonth,
			String departDate, String arriving, String returnMonth, String returnDate, String serviceClass,
			String airline) {

		// for selecting one value from radio button
		for (WebElement option : tripType()) {
			if (option.getAttribute("value").equals(tripType)) {
				option.click();
			}
		}

		select = new Select(passCount());
		select.selectByVisibleText(passCount);
		select = new Select(departure());
		select.selectByVisibleText(departure);
		select = new Select(departureMonth());
		select.selectByVisibleText(departMonth);
		select = new Select(departureDate());
		select.selectByVisibleText(departDate);
		select = new Select(arriving());
		select.selectByVisibleText(arriving);
		select = new Select(returnMonth());
		select.selectByVisibleText(returnMonth);
		select = new Select(returnDate());
		select.selectByVisibleText(returnDate);

		// for selecting one value from radio button
		for (WebElement option : service()) {
			if (option.getAttribute("value").equals(serviceClass)) {
				option.click();
			}
		}

		select = new Select(airline());
		select.selectByVisibleText(airline);
		continueButton().click();
	}

	public void checkFlightAndSelect(int departFlightNum, int retrunFlightNum) {
		departFlight().get(departFlightNum).click();
		returnFlight().get(retrunFlightNum).click();
		cntButton().click();
	}

	public void enterPassengerDetails(String firstName, String lastName, String meal, String cardType,
			String cardNumber, String expMonth, String expYear, String ccFirstName, String ccMidName,
			String ccLastName) {
		// first name
		for (int i = 0; i < firstName().size(); i++) {
			firstName().get(i).clear();
			firstName().get(i).sendKeys(Arrays.asList(firstName.split("&")).get(i));
		}
		// last name
		for (int i = 0; i < lastName().size(); i++) {
			lastName().get(i).clear();
			lastName().get(i).sendKeys(Arrays.asList(lastName.split("&")).get(i));
		}
		// meal
		for (int i = 0; i < meal().size(); i++) {
			select = new Select(meal().get(i));
			select.selectByVisibleText(Arrays.asList(meal.split("&")).get(i));
		}

		select = new Select(cardType());
		select.selectByVisibleText(cardType);
		cardNumber().clear();
		cardNumber().sendKeys(cardNumber);
		select = new Select(expMonth());
		select.selectByVisibleText(expMonth);
		select = new Select(expYear());
		select.selectByVisibleText(expYear);
		ccFirstName().clear();
		ccFirstName().sendKeys(ccFirstName);
		ccMidName().clear();
		ccMidName().sendKeys(ccMidName);
		ccLastName().clear();
		ccLastName().sendKeys(ccLastName);
	}

	public void billingAddress(String billAddressLine1, String billAddressLine2, String billCity, String billState,
			String billZip, String billCountry) {
		billAddressLine1().clear();
		billAddressLine1().sendKeys(billAddressLine1);
		billAddressLine2().clear();
		billAddressLine2().sendKeys(billAddressLine2);
		billCity().clear();
		billCity().sendKeys(billCity);
		billState().clear();
		billState().sendKeys(billState);
		billZip().clear();
		billZip().sendKeys(billZip);
		select = new Select(billCountry());
		select.selectByVisibleText(billCountry);
	}

	public void deliveryAddress(String delAddressLine1, String delAddressLine2, String delCity, String delState,
			String delZip, String delCountry) {
		delAddressLine1().clear();
		delAddressLine1().sendKeys(delAddressLine1);
		delAddressLine2().clear();
		delAddressLine2().sendKeys(delAddressLine2);
		delCity().clear();
		delCity().sendKeys(delCity);
		delState().clear();
		delState().sendKeys(delState);
		delZip().clear();
		delZip().sendKeys(delZip);
		select = new Select(delCountry());
		select.selectByVisibleText(delCountry);
		// for handling java script alert
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			System.out.println("there is no alert box.");
		}
	}

	public void BuyFlightAndLogout() {
		buyFlights().click();
		// logout
		logoutButton().click();
	}
}
