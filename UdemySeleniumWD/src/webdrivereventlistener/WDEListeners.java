package webdrivereventlistener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WDEListeners {
	WebDriver driver;
	String baseURL;
	EventFiringWebDriver eDriver;
	HandleEvents he;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		
		//we required this class in order to work with WebDriverEventListener
		eDriver = new EventFiringWebDriver(driver);  
		
		//Initializing HandleEvents class
		he = new HandleEvents();
		
		//now register EventFiringWebDriver with the class which implements the WebDriverEventListener interface
		//i.e HandleEvents class (we are using WebDriverEventListener interface in this class)
		eDriver.register(he);
		
		//now we are ready to use eDriver instead of driver...
		//it will provides all the method which provided by driver
		baseURL = "https://www.facebook.com/";
		eDriver.manage().window().maximize();
		eDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		eDriver.get(baseURL);
		eDriver.findElement(By.id("email")).sendKeys("fjalsjfl");
		eDriver.findElement(By.id("pass")).sendKeys("asdfadsfsadf");
		eDriver.findElement(By.id("loginbutton")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		eDriver.quit();
	}
}
