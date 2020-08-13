package UsefullMethods;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributesValueDemo {
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
		WebElement element = driver.findElement(By.id("name"));
		String classAttributeValue = element.getAttribute("class");
		String placeholderAttributeValue = element.getAttribute("placeholder");
		
		System.out.println("value of the class attribute: " + classAttributeValue);
		System.out.println("value of the placeholder attribute: " + placeholderAttributeValue);
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
