package pageFactoryAndDate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DateClass {
	WebElement element;
	WebDriver driver;
	
	public DateClass(WebDriver driver) {
		this.driver = driver;
	}

	WebElement month = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=2]"));
	List<WebElement> allDates = month.findElements(By.tagName("button"));

	// filling departing date
	public void fillDepartingDate(String date) {
		for (WebElement element : allDates) {
			if (element.getAttribute("data-day").equals(date)) {
				element.click();
				break;
			}
		}
	}

	// filling departing date
	public void fillReturningDate(String date) {
		for (WebElement element : allDates) {
			if (element.getAttribute("data-day").equals(date)) {
				element.click();
				break;
			}
		}
	}

}
