package newTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightSearchClass {

	public static WebDriver driver;

	// one way or two way
	public static void tripType(WebDriver driver, String type) {
		List<WebElement> tripOptions = driver.findElements(By.name("tripType"));
		for (WebElement option : tripOptions) {
			if (option.getAttribute("value").equals(type)) {
				option.click();
			}
		}
	}

	// number of passengers
	public static void numberOfPassenger(WebDriver driver, String number) {
		WebElement numberOfPassenger = driver.findElement(By.name("passCount"));
		Select select = new Select(numberOfPassenger);
		select.selectByValue(number);
	}

	// departing city
	public static void departingCity(WebDriver driver, String city) {
		WebElement cities = driver.findElement(By.name("fromPort"));
		Select select = new Select(cities);
		select.selectByVisibleText(city);
	}

	// arriving city
	public static void arrivingCity(WebDriver driver, String city) {
		WebElement cities = driver.findElement(By.name("toPort"));
		Select select = new Select(cities);
		select.selectByVisibleText(city);
	}

	// departing date
	public static void departingDate(WebDriver driver, String date, String month) {

		// date
		WebElement dates = driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select selectDate = new Select(dates);
		selectDate.selectByVisibleText(date);

		// month
		WebElement months = driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select selectMonth = new Select(months);
		selectMonth.selectByVisibleText(month);
	}

	// return date
	public static void returnDate(WebDriver driver, String date, String month) {

		// date
		WebElement dates = driver.findElement(By.xpath("//select[@name='toDay']"));
		Select selectDate = new Select(dates);
		selectDate.selectByVisibleText(date);

		// month
		WebElement months = driver.findElement(By.xpath("//select[@name='toMonth']"));
		Select selectMonth = new Select(months);
		selectMonth.selectByVisibleText(month);
	}
	
	//service class
	public static void serviceClass(WebDriver driver, String serviceType) {
		List<WebElement> options = driver.findElements(By.name("servClass"));
		for(WebElement type : options) {
			if(type.getAttribute("value").equals(serviceType)) {
				type.click();
			}
		}
	}
	
	//Airline Choice
	public static void airline(WebDriver driver, String airlineName) {
		WebElement airlines = driver.findElement(By.name("airline"));
		Select selectAirline = new Select(airlines);
		selectAirline.selectByVisibleText(airlineName);
	}
	
	//click on find flight
	public static void clickOnContinue(WebDriver driver) {
		driver.findElement(By.name("findFlights")).click();
	}

}
