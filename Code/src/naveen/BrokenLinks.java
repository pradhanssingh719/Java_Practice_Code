package naveen;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrokenLinks {
	WebDriver driver;
	FileInputStream file;
	Properties prop;
	String site;

	@BeforeClass
	public void setUp() {
		String path = "D:\\Programming (Imp)\\JAVA\\Code\\Files\\config.properties";

		try {
			file = new FileInputStream(path);
			prop = new Properties();
			prop.load(file);
		} catch (IOException exep) {
			exep.getMessage();
			exep.getCause();
		}

		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"D:\\Programming (Imp)\\Drivers\\MS Edge Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();
	}

	@Test
	public void method1() throws MalformedURLException, IOException  {
		//site1 = facebook and site2 =  google
		site = prop.getProperty("site2");
		System.out.println(site);
		driver.get(site);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of anchor tags: " + allLinks.size());
		allLinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Number of anchor + img tags: " + allLinks.size());
		
		List<String> activeLinks = new ArrayList<String>();
		
		for(WebElement link : allLinks) {
			if(link.getAttribute("href") != null) {
				activeLinks.add(link.getAttribute("href"));
			}
		}
		System.out.println("Number of active links: " + activeLinks.size());
		//checking status of links (broken or working)
		for(WebElement link : allLinks) {
			HttpURLConnection connection = (HttpURLConnection) new URL(link.getAttribute("href")).openConnection();
			connection.connect();
			String status = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(link.getAttribute("href") + " ---> " + status);
			
		}
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
