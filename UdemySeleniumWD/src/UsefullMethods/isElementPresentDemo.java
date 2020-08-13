package UsefullMethods;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import UsefullMethods.GenericMethods;

public class isElementPresentDemo {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		//driver = new InternetExplorerDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		
		gm = new GenericMethods(driver);     //we have to define this after browser instantiation, other wise our code will not work
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
	
		boolean result = gm.isElementPresent("name", "id");
		System.out.println("Is element present: " + result);
		
		boolean result2 = gm.isElementPresent("//input[contains(@name,'cars')]", "xpath");
		System.out.println("Is element present: " + result2);
		
		
	}
	

	@After
	public void tearDown() throws Exception {
		//Thread.sleep(3000);
		driver.quit();
	}
}
