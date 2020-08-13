package fileupload;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class FileUpload {
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
	public void loginPage() throws AWTException, InterruptedException {

			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("7007829131");
		
			String password = pass.getPassword();
			WebElement pass = driver.findElement(By.id("pass"));
			pass.sendKeys(password);
			
			WebElement clickButton = driver.findElement(By.id("loginbutton"));
			clickButton.click();
			
			WebElement postPhoto = driver.findElement(By.xpath("//div[@class='_3jk']"));
			postPhoto.click();
			
			//file which we are going to attach or upload
			StringSelection fileForUpload = new StringSelection("C:\\Users\\pradh\\OneDrive\\Pictures\\Earth.jpg");
			//copying file to clip board
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileForUpload, null);
			
			//now paste it inside opened browser windows for uploading file from system using robot class
			Robot robot = new Robot();
			//while working with robot class we need to press and release the key 
			robot.keyPress(KeyEvent.VK_CONTROL);    //pressing control key on keyboard
			robot.keyPress(KeyEvent.VK_V);          //pressing V key
			
			robot.keyRelease(KeyEvent.VK_V);        //releasing V key
			robot.keyRelease(KeyEvent.VK_CONTROL);  //releasing control key
			
			robot.keyPress(KeyEvent.VK_ENTER);		//pressing enter
			robot.keyRelease(KeyEvent.VK_ENTER);    //releasing enter
			
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
