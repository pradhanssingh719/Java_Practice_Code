package switchTo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	WebDriver driver;
	String baseUrl;
	
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		//driver = new InternetExplorerDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		
		//maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	@Test
	public void test() throws InterruptedException {
//		WebElement openWindow = driver.findElement(By.id("openwindow"));
//		openWindow.click();
		
		//WebElement searchBox = driver.findElement(By.id("search-courses"));
		//searchBox.sendKeys("python");
		
		//Get the handle
		String parentHandle = driver.getWindowHandle();           //getting handle of current window
		System.out.println("parent handle: " + parentHandle);
		
		//Find Open Window button
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		
		//Get all handles
		Set<String> handles = driver.getWindowHandles();      //getting handle of all open windows
		
		//Switching between handles
		for(String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);						//switching between windows
				Thread.sleep(2000);
				WebElement searchBox = driver.findElement(By.id("search-courses"));
				searchBox.sendKeys("python");
				driver.close();                                        //closing last open window
				break;													//if our work is done we don't want to execute it further more			
			}
		}
		// Switch back to parent window
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("opentab")).click();
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}

}
