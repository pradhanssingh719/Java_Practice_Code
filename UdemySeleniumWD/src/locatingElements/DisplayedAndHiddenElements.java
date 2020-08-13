package locatingElements;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedAndHiddenElements {
	WebDriver driver;
//	String baseUrl1 = "https://learn.letskodeit.com/p/practice";            
//	String baseUrl2 = "https://www.expedia.co.in/";

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	
	@Test
	public void testLetsKodeIt() throws InterruptedException {
		driver.get("https://learn.letskodeit.com/p/practice");
		
		//initial condition of text box
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("textBos is displayed? " + textBox.isDisplayed());
		
		//after hinding
		Thread.sleep(2000);
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("clicked on hide button");
		System.out.println("textBos is displayed? " + textBox.isDisplayed());
		
		textBox.click();          //at this time this element is hidden so we can not perform any action on it, we will get an exception
		
		//after showing
		Thread.sleep(2000);
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("clicked on show button");
		System.out.println("textBos is displayed? " + textBox.isDisplayed());

		
		
	}
	
	@Test
	public void testExpedia() {                                  //this test method will execute first because jvm execute them in alphabetical order
		driver.get("https://www.expedia.co.in/");
		WebElement childDropBox = driver.findElement(By.xpath("//div[@id='traveler-selector-hp-hotel']//label[1]/select"));
		System.out.println("childDropBox is displayed? " + childDropBox.isDisplayed());

	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
