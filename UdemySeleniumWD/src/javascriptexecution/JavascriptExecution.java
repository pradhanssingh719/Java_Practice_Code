package javascriptexecution;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecution {
	WebDriver driver;
	String baseURL;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		baseURL = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		//driver.get(baseURL);    
		js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");   //opening a web page using java script executor  // ; semicolon is not mandatory after js command
		
//		WebElement element = driver.findElement(By.id("name"));
//		element.sendKeys("confident");
		WebElement element = (WebElement) js.executeScript("return document.getElementById('name')");    //finding element by using java script executor
		element.sendKeys("confident");
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
