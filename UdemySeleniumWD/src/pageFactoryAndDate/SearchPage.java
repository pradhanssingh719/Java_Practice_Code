package pageFactoryAndDate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
//	public static WebElement element;
//	public static WebDriver driver;
	

	// origin flight
	public static WebElement originTextBox(WebDriver driver) {
		return driver.findElement(By.id("flight-origin-hp-flight"));
	}
	// API for filling origin box
	public static void fillOriginTextBox(WebDriver driver, String city) {
		originTextBox(driver).sendKeys(city);
	}

	// destination text box
	public static WebElement destinationTextBox(WebDriver driver) {
		return driver.findElement(By.id("flight-destination-hp-flight"));
	}
	// API for filling destination box
	public static void fillDestinationTextBox(WebDriver driver, String city) {
		destinationTextBox(driver).sendKeys(city);
	}

	// departing date text box
	public static WebElement departingDateTextBox(WebDriver driver) {
		return driver.findElement(By.id("flight-departing-hp-flight"));
	}
	//API for filling departing date
	public static void fillDepartingDateTextBox(WebDriver driver, String date) {
		departingDateTextBox(driver).sendKeys(date);
	}
	
	// returning date text box
	public static WebElement returningDateTextBox(WebDriver driver) {
		return driver.findElement(By.id("flight-returning-hp-flight"));
	}
	//API for filling returning date
	public static void fillReturningDateTextBox(WebDriver driver, String date) {
		returningDateTextBox(driver).sendKeys(date);
	}

	// submit button
	public static WebElement searchButton(WebDriver driver) {
		return 	driver.findElement(By.xpath("//button[contains(@class,'btn-primary btn-action gcw-submit') and contains(@type,'submit')]"));
	}
	// API for clicking on submit button
	public static void clickOnSearchButton(WebDriver driver) {
		searchButton(driver).click();
	}
}
