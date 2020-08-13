package actionsclass;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
	WebDriver driver;
	String baseUrl;
	JavascriptExecutor jse;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		//driver = new InternetExplorerDriver();
		
//		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
	
		baseUrl = "https://learn.letskodeit.com/p/practice";
		jse = (JavascriptExecutor)driver;
		
		//maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();   //on which element you want to move your mouse
		Thread.sleep(2000);
		 
		
		WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		//subElement.click();
		action.moveToElement(subElement).click().perform();    //we can click by using action class also...here how we perform click action in actions class
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
