package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AttachFile {
	WebDriver driver;
	String baseUrl;
	JavascriptExecutor jse;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		jse = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
	}

	@Test
	public void attachFile() throws AWTException {
		baseUrl = "https://www.ilovepdf.com/pdf_to_word";
		driver.get(baseUrl);
		
		driver.findElement(By.id("pickfiles")).click();
		
		StringSelection path = new StringSelection("D:\\Downloads\\sakshi\\1757-1146-2-26.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("successful!!!");
	}
	
	@Test
	public void attachFile2() throws AWTException {
		baseUrl = "https://html.com/input-type-file/";
		driver.get(baseUrl);
		jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("D:\\Downloads\\sakshi\\1757-1146-2-26.pdf");  //sometimes we can also use sendKeys for uploading file 
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
