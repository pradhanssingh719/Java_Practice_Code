package fileupload;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowsAuthentication {
	WebDriver driver;
	String baseURL;

	@BeforeClass
	public void setUp() {

//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--disable-Notifications"); // it will disable all the browser level Notifications

		System.setProperty("webdriver.gecko.driver",
				"D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		baseURL = "http://rsyspedia.india.rsystems.com";
		driver.get(baseURL);
	}

	@Test
	public void loginPage() throws InterruptedException, IOException {
		// runtime class provided by java to execute .exe file from system
		
		Runtime.getRuntime().exec("D:\\Programming (Imp)\\JAVA\\UdemySeleniumWD\\scripts\\WindowsAuthentication.exe");
		
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		// driver.quit();
	}
}
