package locatingElements;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NavigatingBetweenPages {
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");   //no need of this because system variable path is already set
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		baseUrl = "https://learn.letskodeit.com";
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		//title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		
		//current url of the page
		String curretnUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + curretnUrl);
		
		//navigating to login page without clicking on login element
		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		Thread.sleep(2000);
		
		curretnUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + curretnUrl);
		
		//navigating backward
		driver.navigate().back();
		Thread.sleep(2000);
		
		//navigating forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//again backward
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Refreshing page (by using .refresh() method)
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//refreshing page (by proving same url so it will load again)
		driver.get(baseUrl);
		Thread.sleep(2000);
		
//		//page resources
//		String pageResources = driver.getPageSource();
//		System.out.println("Page Resources: " + pageResources);
		
	}

	@After
	public void tearDown() throws Exception { 
		driver.quit();
	}

	

}
