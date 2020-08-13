package pomtutorial.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageFactoryAndDate.*;

public class PageObjectModel {
	WebDriver driver;
	String baseURL;
	JavascriptExecutor jse;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		jse = (JavascriptExecutor) driver;
		//driver = new ChromeDriver();
		baseURL = "https://www.expedia.co.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.findElement(By.id("tab-flight-tab-hp")).click();
	}

	@Test
	public void test() throws InterruptedException {
		SearchPage.fillOriginTextBox(driver, "Bengaluru (BLR-Kempegowda Intl.)");
		SearchPage.fillDestinationTextBox(driver, "Jaipur (JAI-Sanganer)");
		SearchPage.fillDepartingDateTextBox(driver, "12/05/2020");
		// Added a line to clear the return date text box
		// before entering the return date, because Expedia by default
		// enters the return date same as the departure date
		SearchPage.returningDateTextBox(driver).clear();
		SearchPage.fillReturningDateTextBox(driver, "25/05/2020");
		SearchPage.clickOnSearchButton(driver);
		//jse.executeScript("arguments[0].click()", SearchPage.searchButton(driver));     //in case if above click command not work
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
