package locatingElements;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {
	
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {															//It will be execute before every test case
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://learn.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After														//it will be execute after completion of every test case
	public void tearDown() throws Exception {			
		Thread.sleep(2000);								//it will wait for 2 second before closing browser
		driver.quit();									//for closing browser
	}

	@Test
	public void test() {																					//if anything fail next line will not execute
		driver.get(baseURL);
		driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
		System.out.println("Clicked on login button");
		driver.findElement(By.cssSelector("#user_email")).clear();
		System.out.println("email section clread");
		driver.findElement(By.cssSelector("#user_email")).sendKeys("kuch bhi enter kro lo@gmail.com");
		System.out.println("new email enterd");
		driver.findElement(By.cssSelector("input[id='user_password']")).clear();
		System.out.println("password section cleared");
		driver.findElement(By.cssSelector("input#user_password")).sendKeys("test123");
		System.out.println("new password entered");                                              
	}

}
