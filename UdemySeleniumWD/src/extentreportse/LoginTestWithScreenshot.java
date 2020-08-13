package extentreportse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTestWithScreenshot {
	WebDriver driver;
	String baseURL;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		report = new ExtentReports("D:\\Programming (Imp)\\JAVA\\UdemySeleniumWD\\extentreports\\logintest.html");
		test = report.startTest("Username verification...");
		test.log(LogStatus.INFO, "Browser started...");
		
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser maximized...");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		baseURL = "https://www.facebook.com/";
		driver.get(baseURL);
		test.log(LogStatus.INFO, "web application opend.");
	}
	
	@Test
	public void loginPage() throws InterruptedException {
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("7007829131");
		test.log(LogStatus.INFO, "enter username");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("pass07!");
		test.log(LogStatus.INFO, "enter password");
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		test.log(LogStatus.INFO, "clicked on login button.");
		
		WebElement name = driver.findElement(By.xpath("//div[text()='Singh P']"));
		String nameOfUser = name.getText();
		Assert.assertTrue(nameOfUser.equals("Singh P"));
		test.log(LogStatus.PASS, "Username verified successfully.");	
	}


	@AfterMethod
	public void testDown(ITestResult testResult) throws Exception {
		if(testResult.getStatus() == ITestResult.FAILURE) {
			String path = Screenshot.takeScreenshot(testResult.getName(), driver);
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "username verification failed.", imagePath);
		}
		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
