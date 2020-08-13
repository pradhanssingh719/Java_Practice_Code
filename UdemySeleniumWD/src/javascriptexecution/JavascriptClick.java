package javascriptexecution;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptClick {
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
	public void testJSClick() {
		js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice'");
		
		//first find the element 
		WebElement checkBoxElement = (WebElement) js.executeScript("return document.getElementById('bmwcheck')");
		
		//clicking on element
		js.executeScript("arguments[0].click()",checkBoxElement);
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
