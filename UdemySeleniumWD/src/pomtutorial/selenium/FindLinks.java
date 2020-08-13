package pomtutorial.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageFactoryAndDate.SearchPageFactory;

public class FindLinks {

	WebDriver driver;
	String baseURL;
	SearchPageFactory spf;
	
	@Before
	public void setUp() throws Exception {
//		System.setProperty("webdriver.gecko.driver",
//				"D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();
		spf = new SearchPageFactory(driver);
		baseURL = "https://www.makemytrip.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		spf.clickOnHotelTab();
		List<WebElement> linksList = clickableLinks(driver);                   //this method will return a list of links so we need to store it inside a another list
		for(WebElement link : linksList) {
			System.out.println("Link: " + link.getAttribute("href"));          //printing links
		}
	}
	
	public static List<WebElement> clickableLinks(WebDriver driver){
		List<WebElement> links = new ArrayList<WebElement>();
		List<WebElement> elements = driver.findElements(By.tagName("a"));   //found elements with anchor tags
		elements.addAll(driver.findElements(By.tagName("img")));			//found elements with img tag because image can also be a link
		
		for(WebElement link : elements) {									//storing links which contains href inside array list
			if(link.getAttribute("href") != null) {
				links.add(link);
			}
		}
		return links;
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
