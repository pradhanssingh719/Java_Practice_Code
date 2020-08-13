/***
 * perform() is mandatory for actions class
 * perform() is mandatory for actions class
 * perform() is mandatory for actions class
 * perform() is mandatory for actions class
 */

package actionsclass;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import WebDriverBasics.MsEdgeDriverDemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleAndRightClick {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.edge.driver", "D:\\Programming (Imp)\\Drivers\\MS Edge Driver\\msedgedriver.exe");
		driver = new ChromeDriver();
		baseURL = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void slider() throws InterruptedException {
		driver.get(baseURL);
		Actions action = new Actions(driver);
		
		//double click on element 
		WebElement element = driver.findElement(By.id("bmwcheck"));
		action.doubleClick(element).perform();
		
		//right click on element
		WebElement element2 = driver.findElement(By.id("opentab"));
		action.contextClick(element2).perform();
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
