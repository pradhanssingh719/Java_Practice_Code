package UsefullMethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextDemo {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseUrl = "https://learn.letskodeit.com/p/practice";
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement  buttonElement = driver.findElement(By.id("opentab"));
		String elementText = buttonElement.getText();
		System.out.println("text: " + elementText );
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
