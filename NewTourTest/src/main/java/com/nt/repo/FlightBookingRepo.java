package com.nt.repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nt.base.UIBase;

public class FlightBookingRepo extends UIBase {

	//login
	public WebElement enterUsername() {
		return driver.findElement(By.name("userName"));
	}

	public WebElement enterPassword() {
		return driver.findElement(By.name("password"));
	}

	public WebElement loginButton() {
		return driver.findElement(By.cssSelector("input[name='login']"));
	}

	//flight details
	public List<WebElement> tripType() {
		return driver.findElements(By.name("tripType"));
	}

	public WebElement passCount() {
		return driver.findElement(By.name("passCount"));
	}

	public WebElement departure() {
		return driver.findElement(By.name("fromPort"));
	}

	public WebElement departureMonth() {
		return driver.findElement(By.name("fromMonth"));
	}

	public WebElement departureDate() {
		return driver.findElement(By.name("fromDay"));
	}

	public WebElement arriving() {
		return driver.findElement(By.name("toPort"));
	}

	public WebElement returnMonth() {
		return driver.findElement(By.name("toMonth"));
	}

	public WebElement returnDate() {
		return driver.findElement(By.name("toDay"));
	}

	public List<WebElement> service() {
		return driver.findElements(By.name("servClass"));
	}

	public WebElement airline() {
		return driver.findElement(By.name("airline"));
	}

	public WebElement continueButton() {
		return driver.findElement(By.name("findFlights"));
	}

	public List<WebElement> departFlight() {
		return driver.findElements(By.name("outFlight"));
	}

	//flight selection
	public List<WebElement> returnFlight() {
		return driver.findElements(By.name("inFlight"));
	}

	public WebElement cntButton() {
		return driver.findElement(By.name("reserveFlights"));
	}

	//passenger details
	public List<WebElement> firstName() {
		return driver.findElements(By.cssSelector("input[name^='passFirst']"));
	}

	public List<WebElement> lastName() {
		return driver.findElements(By.cssSelector("input[name^='passLast']"));
	}

	public List<WebElement> meal() {
		return driver.findElements(By.cssSelector("select[name*='meal']"));
	}

	public WebElement cardType() {
		return driver.findElement(By.name("creditCard"));
	}

	public WebElement cardNumber() {
		return driver.findElement(By.name("creditnumber"));
	}

	public WebElement expMonth() {
		return driver.findElement(By.name("cc_exp_dt_mn"));
	}

	public WebElement expYear() {
		return driver.findElement(By.name("cc_exp_dt_yr"));
	}

	public WebElement ccFirstName() {
		return driver.findElement(By.name("cc_frst_name"));
	}

	public WebElement ccMidName() {
		return driver.findElement(By.name("cc_mid_name"));
	}

	public WebElement ccLastName() {
		return driver.findElement(By.name("cc_last_name"));
	}

	//billing address
	public WebElement billAddressLine1() {
		return driver.findElement(By.name("billAddress1"));
	}

	public WebElement billAddressLine2() {
		return driver.findElement(By.name("billAddress2"));
	}

	public WebElement billCity() {
		return driver.findElement(By.name("billCity"));
	}

	public WebElement billState() {
		return driver.findElement(By.name("billState"));
	}

	public WebElement billZip() {
		return driver.findElement(By.name("billZip"));
	}

	public WebElement billCountry() {
		return driver.findElement(By.name("billCountry"));
	}
	
	//delivery address
	public WebElement delAddressLine1() {
		return driver.findElement(By.name("delAddress1"));
	}
	
	public WebElement delAddressLine2() {
		return driver.findElement(By.name("delAddress2"));
	}

	public WebElement delCity() {
		return driver.findElement(By.name("delCity"));
	}

	public WebElement delState() {
		return driver.findElement(By.name("delState"));
	}

	public WebElement delZip() {
		return driver.findElement(By.name("delZip"));
	}

	public WebElement delCountry() {
		return driver.findElement(By.name("delCountry"));
	}
	
	public WebElement buyFlights() {
		return driver.findElement(By.name("buyFlights"));
	}
	
	public WebElement logoutButton() {
		return driver.findElement(By.cssSelector("img[src='/images/forms/Logout.gif']"));
	}
}
