package fileupload;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FIleUploadWithAutoIt {
	WebDriver driver;
	String baseURL;
	Password pass;
	
	@BeforeClass
	public void setUp() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-Notifications");   //it will disable all the browser level Notifications
		
		driver = new ChromeDriver(option);
		pass = new Password();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		baseURL = "https://www.facebook.com/";
		driver.get(baseURL);
	}
	
	@Test
	public void loginPage() throws InterruptedException, IOException {

			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("7007829131");
		
			String password = pass.getPassword();
			WebElement pass = driver.findElement(By.id("pass"));
			pass.sendKeys(password);
			
			WebElement clickButton = driver.findElement(By.id("loginbutton"));
			clickButton.click();
			
			WebElement postPhoto = driver.findElement(By.xpath("//div[@class='_3jk']"));
			postPhoto.click();
			
			Runtime.getRuntime().exec("D:\\Programming (Imp)\\JAVA\\UdemySeleniumWD\\scripts\\FileUpload.exe");    //runtime class provided by java to  execute .exe file from system
 			
			//posting file
			WebElement postButton = driver.findElement(By.xpath("//button[@class='_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft']"));
			postButton.click();
			
			Thread.sleep(5000);
			WebElement nevigation =  driver.findElement(By.id("userNavigationLabel"));
			nevigation.click();
			
			WebElement logOut =  driver.findElement(By.xpath("//span[text()='Log Out']"));
			logOut.click();
			Thread.sleep(5000);
	}
	@AfterClass
	public void tearDown() throws InterruptedException {
		driver.quit();
	}
}
