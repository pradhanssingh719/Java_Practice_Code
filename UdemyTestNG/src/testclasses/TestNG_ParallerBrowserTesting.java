package testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_ParallerBrowserTesting {

	WebDriver driver;
	String baseURL;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser) {
		baseURL = "https://letskodeit.teachable.com/";
		
		if(browser.equals("firefox")) {								//here we can also use browser.equalsIgnoreCase() instead of browser.equals()
			System.setProperty("webdriver.gecko.driver", 
					"D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")) {                         
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@Parameters({"username","password"})
	@Test
	public void test(String username, String password) {
		WebElement login = driver.findElement(By.cssSelector("a[href='/sign_in']"));
		login.click();
		WebElement user = driver.findElement(By.id("user_email"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.id("user_password"));
		pass.sendKeys(password);
		WebElement loginButton = driver.findElement(By.name("commit"));
		loginButton.sendKeys(Keys.ENTER);
		
//		clicking using actions class
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ENTER).perform();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
