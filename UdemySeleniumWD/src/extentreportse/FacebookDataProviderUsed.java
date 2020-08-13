package extentreportse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FacebookDataProviderUsed {
	WebDriver driver;
	String baseURL;
	ExtentReports report;
	ExtentTest test;
	FacebookHomePage fhp;
	
	@Parameters({"browser"})
	@BeforeClass
	public void setUp(String browser) {
		report = ExtentFactory.getInstance();
		test = report.startTest("Login Page Testing");
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		test.log(LogStatus.INFO, "Browser started...");

		fhp = new FacebookHomePage(driver, test);
		
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser meximized");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		baseURL = "https://www.facebook.com/";
		//driver.get(baseURL);
		test.log(LogStatus.INFO, "website opened");
	}
	
	@Test(dataProvider = "inputs", dataProviderClass = FacebookDataProvider.class)
	public void loginPage(String username, String password) {
//		fhp.enterUsername("7007829131");
//		fhp.enterPassword("pass077!");
//		fhp.clickOnLoginButton();
		driver.get(baseURL);
		//instead of above three line we can use only one line because we wrap up all the methods in side login method 
		fhp.login(username, password);
		
		boolean result = fhp.isUsernamePresent();
		
		Assert.assertTrue(result);
		test.log(LogStatus.PASS, "Verified user name");
	}

	@AfterClass
	public void tearDown() {
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
