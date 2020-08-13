package locatingElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocomplete {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		baseURL = "https://www.expedia.co.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	
	@Test
	public void test() {
		WebElement flightTab = driver.findElement(By.id("tab-flight-tab-hp"));
		flightTab.click();
		
		String partialText = "beng";
		String departingCity  = "Bengaluru (BLR - Kempegowda Intl.)";
		
		WebElement enterFilghtName = driver.findElement(By.id("flight-origin-hp-flight"));
		enterFilghtName.sendKeys(partialText);
		
		WebElement ulElements = driver.findElement(By.id("typeaheadDataPlain"));
		List<WebElement> liElements =  ulElements.findElements(By.tagName("li"));
		
		for(WebElement element : liElements) {
			System.out.println(element.getText());
		}
		
		for(WebElement element : liElements) {
			if(element.getText().contains(departingCity)) {
				element.click();
				break;
			}
		}
		
		List<WebElement> allAnchoreTag = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']//a"));
//		for(WebElement tag : allAnchoreTag) {
//			System.out.println(tag.getAttribute("data-value"));
//		}
//		
//		for(WebElement tag : allAnchoreTag) {
//			if(tag.getAttribute("data-value").equals(departingCity)) {
//				tag.click();
//				System.out.println("clicke on bangalore");
//			}
//		}
		
		
	}
	
	
	@After
	public void tearDown() throws InterruptedException   {
		Thread.sleep(3000);
		driver.quit();
	}

	

}
