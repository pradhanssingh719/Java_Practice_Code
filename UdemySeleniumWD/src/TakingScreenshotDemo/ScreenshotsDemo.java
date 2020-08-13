package TakingScreenshotDemo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsDemo {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		baseUrl = "https://facebook.com";
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement login = driver.findElement(By.cssSelector("input[data-testid='royal_login_button']"));
		login.click();
	}

	@After
	public void tearDown() throws Exception {
		//Thread.sleep(2);
		//System.out.println("run succesfully");
		
		String filename = randomFileName(10) + ".png";
		String directory = System.getProperty("user.dir") + "//screenshots//";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + filename));
		driver.quit();
	}
	public String randomFileName(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for(int i=0; i<length; i++) {
			int index = (int)((Math.random()) * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	

	

}
