package testclasses;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_ScreenshotOnFailure {

	WebDriver driver;
	String baseUrl;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		baseUrl = "https://letskodeit.teachable.com/";
	}

	@Test
	public void gotoLoginPage() {
		driver.get(baseUrl);
		WebElement login = driver.findElement(By.cssSelector("a[href='/sign_in']"));
		login.click();
	}

	@Test
	public void loginMethod() {
		driver.get(baseUrl);
		WebElement login = driver.findElement(By.cssSelector("a[href='/sign_in']"));
		login.click();
		WebElement user = driver.findElement(By.id("user_email"));
		user.sendKeys("singh");
		WebElement pass = driver.findElement(By.id("user_password"));
		pass.sendKeys("singh123");
		WebElement loginButton = driver.findElement(By.name("invalid name")); // valid name is: commit
		loginButton.click();
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String location = "D:\\Programming (Imp)\\JAVA\\UdemyTestNG\\screenshots"; // location for image
			String methodName = result.getName(); // fetching test method name

			try {
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot, new File(location, methodName + "_" + ".png"));
			} catch (IOException e) {
				e.getMessage();
			}
		}
		driver.quit();
	}

}
