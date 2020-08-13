package locatingElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WorkingWithElementsList {

	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() {
		baseUrl = "https://learn.letskodeit.com/p/practice";
		//System.setProperty(key, value);
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws InterruptedException {
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]")); 
		int size = radioButtons.size();
		System.out.println("Size of list is: " + size);
		
		for(int i=0; i<size; i++) {
			if(!radioButtons.get(i).isSelected()) {
				radioButtons.get(i).click();
				//Thread.sleep(1000);
			}	
		}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
