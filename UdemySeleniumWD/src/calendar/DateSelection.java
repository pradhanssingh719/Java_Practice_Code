package calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DateSelection {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() { 
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.co.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//directly clicking on date
	public void test1() {
		driver.get(baseURL);
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("Jaipur (JAI-Sanganer)");
		driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("Bengaluru (BLR-Kempegowda Intl.)");
		driver.findElement(By.id("flight-departing-hp-flight")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=2]//button[@data-day='10']")).click();
		driver.findElement(By.id("flight-returning-hp-flight")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=2]//button[@data-day='15']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary btn-action gcw-submit') and contains(@type,'submit')]")).click();
	}
	
	//Complete month selected and then passing date
	@Test
	public void test2() {
		driver.get(baseURL);
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("Jaipur (JAI-Sanganer)");
		driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("Bengaluru (BLR-Kempegowda Intl.)");
		driver.findElement(By.id("flight-departing-hp-flight")).click();
		
		
		WebElement month =  driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=2]"));
		List<WebElement> allDates = month.findElements(By.tagName("button"));										//here the tag name is use full for finding all elements with same tag
		System.out.println(allDates.size());
		
		for(WebElement date : allDates) {
			if(date.getAttribute("data-day").equals("31")) {
				date.click();
			}
		}
		
	}
	
	
	@After
	public void tearDown() {
		
	}

	

}
