package NukriAutomation;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActionClass {
	static WebDriver driver;
	String baseUrl;
	String parentHandle;

	@BeforeSuite
	public void setUp() throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
//		driver = new FirefoxDriver();

		driver = new ChromeDriver();

		baseUrl = "https://naukri.com";

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);

		// popups
		String parentHandle = driver.getWindowHandle();
		System.out.println("window handle id: " + parentHandle);
		Set<String> allHandles = driver.getWindowHandles();

		for (String handle : allHandles) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				driver.close();
			}
		}
		Thread.sleep(5000);
		// swith to parent
		driver.switchTo().window(parentHandle);
		parentHandle = driver.getWindowHandle();
		System.out.println("window handle id: " + parentHandle);
			
	}

	
	@Test(priority = 0)
	public void mainPage(){

		LoginPage.loginButton(driver).click();

//		Set<String> allHandles = driver.getWindowHandles();
//		for(String hadle : allHandles) {
//			if(!hadle.equals(parentHandle)) {
//				driver.switchTo().window(hadle);
//			}
//		}

		LoginPage.emailId(driver).sendKeys("pradhan.smeena.cer13@iitbhu.ac.in");
		LoginPage.password(driver).sendKeys("pSingh719!");
		LoginPage.login(driver).click();
	}

	@Test(priority = 1)
	public void editPage() {

		EditPage.clickOnTitle(driver).click();
		EditPage.ResumeHeadline(driver).click();

//		Set<String> allHandles = driver.getWindowHandles();
//		for(String handle : allHandles) {
//			if(!hadle.equals(parentHandle)) {
//				driver.switchTo().window(handle);
//			}
//		}
	}

	@Test(priority = 2)
	public void newDetails() {
		EditPage.editHeadline(driver).clear();
		EditPage.editHeadline(driver)
				.sendKeys("1+ Year of experience as QA Engineer with Khidki Software Pvt Ltd. "
						+ "Currently working on automation testing using selenium and core java. "
						+ "creating test cases and executing on a daily bases. "
						+ "I have good knowledge of core java and TestNg framework.");
		EditPage.cancelOrSave(driver).click();
	}
	
//	@Test
//	public void takeScreenshot() throws IOException {
//		EditPage.screenshot(5);
//	}
	@Test(priority = 4)
	public void takeScreenshot() throws IOException {
		String fileName = randomString(5) + ".png";
		String directory = System.getProperty("user.dir") + "/screenshots//";
		File fileSource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fileSource, new File(directory + fileName));
	}
	public static String randomString(int length) {
		StringBuffer sb = new StringBuffer();
		String characters = "abcdefghijklmnopqrstuvwxyz1234567890";
		int size = characters.length();
		for(int i = 0; i < length; i++ ) {
			int index = (int)(Math.random() * size);
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
