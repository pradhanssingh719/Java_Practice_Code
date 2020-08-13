package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementSelection {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() {
		baseUrl = "https://www.expedia.co.in";
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.get(baseUrl);

	}

//	@Test
//	public void test() {
//		driver.findElement(By.id("primary-header-flight")).click();
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		String url = driver.getCurrentUrl();
//		driver.navigate().to(url);
//		System.out.println("current url is: " + url);
//		System.out.println("current title is:" + driver.getTitle());
//		
//	}

//	@Test
//	public void test2() {
//		WebElement flight = driver.findElement(By.id("primary-header-flight"));
//		System.out.println(flight.isDisplayed());
//		System.out.println(flight.isSelected());
//		System.out.println(flight.isEnabled());
//	}

//	@Test
//	public void test3() {
//		WebElement checkBox = driver.findElement(By.cssSelector("#flight-add-hotel-checkbox-hp-flight"));
//		System.out.println("befor click on check box: " + checkBox.isSelected());
//		System.out.println(checkBox.getAttribute("id"));
//		checkBox.click();
//		System.out.println("after click on check box: " + checkBox.isSelected());
//	}

//	@Test
//	public void test4() throws InterruptedException {
//		driver.get("https://letskodeit.teachable.com/");
//		WebElement practice = driver.findElement(By.cssSelector("a[class='fedora-navbar-link navbar-link']"));
//		practice.click();
//
//		List<WebElement> radioBUtton = driver
//				.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'radio')]"));
//
//		System.out.println(radioBUtton.size());
//
//		for (WebElement item : radioBUtton) {
//			item.click();
//			Thread.sleep(2000);
//		}
//
//		List<WebElement> checkBox = driver
//				.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'checkbox')]"));
//
//		System.out.println(checkBox.size());
//
//		for (WebElement item : checkBox) {
//			item.click();
//		}
//		
//		checkBox.get(0).click();
//		System.out.println(checkBox.get(0).isSelected());

		

		// input[contains(@name,'cars') and contains(@type,'checkbox')]

//		WebElement checkBox = driver.findElement(By.cssSelector("#flight-add-hotel-checkbox-hp-flight"));
//		System.out.println("befor click on check box: " + checkBox.isSelected());
//		System.out.println(checkBox.getAttribute("id"));
//		checkBox.click();
//		System.out.println("after click on check box: " + checkBox.isSelected());
//	}
	
	@Test
	public void test5() {
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement element = driver.findElement(By.id("carselect"));
		Select select = new Select(element);
		select.selectByIndex(2);
		select.selectByValue("BMW");
	}
	

	@After
	public void teatDown() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.quit();
	}
}
