package switchTo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchFrame {
	WebDriver driver;
	String baseUrl;
	
	@BeforeMethod
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
		//switch by iframe id
		//driver.switchTo().frame("courses-iframe");         //in case of string argument we can use either id or name
		
		//switch by iframe name
		//driver.switchTo().frame("iframe-name");
		
		//switch by iframe number 
		driver.switchTo().frame(0);

		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("Python");
		
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		driver.findElement(By.id("name")).sendKeys("switched to parent");
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
