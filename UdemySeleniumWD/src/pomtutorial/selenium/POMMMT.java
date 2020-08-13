package pomtutorial.selenium;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageFactoryAndDate.SearchPageFactory;

public class POMMMT {
	WebDriver driver;
	String baseURL;
	SearchPageFactory spf;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		spf = new SearchPageFactory(driver);
		baseURL = "https://www.makemytrip.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		spf.clickOnHotelTab();
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
