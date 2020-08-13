package locatingElements;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ElementState {
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		//driver = new ChromeDriver();
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		baseUrl = "https://www.google.co.in";
		driver.get(baseUrl);
		
		WebElement e1 = driver.findElement(By.cssSelector("input[type='text']"));
		System.out.println("Element is Enabled? " + e1.isEnabled());               //by using this method we can find whether element is enabled or disabled
		
		
		
		if(e1.isEnabled()) {
			e1.sendKeys("quora");
			
		}else {
			System.out.println("Element is disabled.");
		}
		
		driver.findElement(By.cssSelector("input[value='Google Search']")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
