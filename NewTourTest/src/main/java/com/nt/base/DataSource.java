package com.nt.base;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.nt.utils.CommonUtils;

public class DataSource {

	@DataProvider(name = "flightBookingData")
	public static Object[][] data(Method method) {
		Object[][] arrayObject = null;
		if (method.getName().equals("bookingDetails")) {
			arrayObject = CommonUtils.getTestData("bookingDetails");
		} else if (method.getName().equals("FlightSelection")) {
			arrayObject = CommonUtils.getTestData("FlightSelection");
		} else if (method.getName().equals("passengerDetails")) {
			arrayObject = CommonUtils.getTestData("passengerDetails");
		} else if (method.getName().equals("billAddressDetails")) {
			arrayObject = CommonUtils.getTestData("billAddress");
		} else if (method.getName().equals("delAddressDetails")) {
			arrayObject = CommonUtils.getTestData("delAddress");
		}
		return arrayObject;
	}

}
