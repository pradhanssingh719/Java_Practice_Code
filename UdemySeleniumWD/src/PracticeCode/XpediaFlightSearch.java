package PracticeCode;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class XpediaFlightSearch {
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() {
		baseUrl = "https://www.expedia.co.in";
		driver = new ChromeDriver();
		//driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void test() {
//		WebElement flight = driver.findElement(By.id("tab-flight-tab-hp"));
//		flight.click();
		
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		
		WebElement oneWay = driver.findElement(By.id("flight-type-one-way-label-hp-flight"));
		oneWay.click();
		
		WebElement fFlight = driver.findElement(By.cssSelector("input[class='clear-btn-input gcw-storeable text gcw-origin gcw-required gcw-distinct-locations sf-uta-verified']"));
		fFlight.click();
		
		//System.out.println(flight.isEnabled());
		
		WebElement bangalore = driver.findElement(By.xpath("//*[text()='Bengaluru (BLR - Kempegowda Intl.)']"));
		bangalore.click();
		
		WebElement sFlight = driver.findElement(By.cssSelector("input[class='clear-btn-input gcw-storeable text gcw-destination gcw-required gcw-distinct-locations sf-uta-verified']"));
		sFlight.click();
		
		WebElement jaipur = driver.findElement(By.xpath("//*[text()='Jaipur (JAI - Sanganer)']"));
		jaipur.click();
	}
	
	@After
	public void tearDown() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.quit();
	}
}
