package keysPress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyPress {
	WebDriver driver;
	String baseURL;
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://learn.letskodeit.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void keyPress() throws InterruptedException {
		driver.get(baseURL);
		driver.findElement(By.cssSelector("a[href='/sign_in']")).click();
		driver.findElement(By.id("user_email")).sendKeys("psingh");
		
		//click on tab button on keyboard using Keys class
		driver.findElement(By.id("user_email")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		//click on enter or return key using Keys Class
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
