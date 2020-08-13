package javascriptexecution;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollElementIntoView {
	WebDriver driver;
	String baseURL;
	JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");
		
		Thread.sleep(2000);
		//scroll down
		js.executeScript("window.scrollBy(0,1500)");
		
		Thread.sleep(2000);
		//scroll up (we are using - sign for scrolling up)
		js.executeScript("window.scrollBy(0,-1500)");
		
		Thread.sleep(2000);
		//scrolling element into view
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		Thread.sleep(2000);
		//scrolling little bit up to see element because right now it's under header so we can not interact with it
		js.executeScript("window.scrollBy(0,-100)");
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
