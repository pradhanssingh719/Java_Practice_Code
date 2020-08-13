package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllLinks {

	WebDriver driver;
	String baseURL;

	@Parameters({"browser"})    //it will work fine even without {} as well
	@BeforeClass
	public void setUp(String name) {
		if (name.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		baseURL = "https://www.facebook.com";
		driver.get(baseURL);
	}

	@Test
	public void links() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			if (link.getAttribute("href") != null) {
				System.out.println(link.getAttribute("href"));
			}
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
