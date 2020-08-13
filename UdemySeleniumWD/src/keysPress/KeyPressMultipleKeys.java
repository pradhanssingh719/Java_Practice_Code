package keysPress;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyPressMultipleKeys {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver = new ChromeDriver();
		
		baseURL = "https://learn.letskodeit.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	
	public void multipleKeys1() throws InterruptedException {
		driver.get(baseURL);
		WebElement element = driver.findElement(By.cssSelector("a[href='/sign_in']"));
		
		//clicking on multiple keys one way
		element.sendKeys(Keys.CONTROL + "a");
	}
	
	@Test
	public void multipleKeys2() throws InterruptedException {
		driver.get(baseURL);
		WebElement element = driver.findElement(By.cssSelector("a[href='/sign_in']"));
		
		//clicking on multiple keys second way
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"));     //it will return a String so we can store it into a string for better readability
		
//		String selectAll = Keys.chord(Keys.CONTROL, "a");
//		element.sendKeys(selectAll);
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
