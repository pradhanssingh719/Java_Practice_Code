package UsefullMethods;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import UsefullMethods.GenericMethods;

public class GenericMethodsDemo {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		//driver = new InternetExplorerDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		
		gm = new GenericMethods(driver);     //we have to define this after browser instantiation, other wise our code will not work
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		//WebElement element = driver.findElement(By.id("name"));
		WebElement element = gm.getElement("name", "id");
		element.sendKeys("Hello mr. singh");
		
//		WebElement element2 = gm.getElement("xpath", "//input[@id='alertbtn']");
//		element2.click();
		
		//list of elements
		List<WebElement> elementList = gm.getElementList("//input[contains(@name,'cars')]", "xpath");       //we can not send keys or click on elements in list because it contain multiple elements
		
		int size = elementList.size();
		System.out.println("size of the  list is: " + size);
		
		
	}

	@After
	public void tearDown() throws Exception {
		//Thread.sleep(3000);
		driver.quit();
	}
}
