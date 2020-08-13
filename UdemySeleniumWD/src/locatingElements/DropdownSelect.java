
package locatingElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropdownSelect {
	WebDriver driver;
	String baseUrl;

	@BeforeClass
	public void setUp() {
		//System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.get(baseUrl);
	}

	@Test
	public void test() throws InterruptedException {
		WebElement element = driver.findElement(By.id("carselect"));

		Select sel = new Select(element); // here we using Select class which is provided by selenium to work with
											// select tag
		// It will take an element type argument
		// now we can use it to select elements which present inside select tag
		// there are three way to select element by using this class
		// 1. selectByIndex
		// 2. selectByValue
		// 3. selectByVisibleText

		// 1. selectByIndex
		System.out.println("Selected by index");
		sel.selectByIndex(0);

		// 2. selectByValue
		System.out.println("selected by Value");
		sel.selectByValue("benz");

		// 3. selectByVisibleText
		System.out.println("select by visible text");
		sel.selectByVisibleText("Honda");

//		//we can replace above 3 line with this for loop....always go for loop if you want to perform action on multiple element like 20, 50, 100 etc....
//		for (int i = 0; i < 3; i++) {
//			sel.selectByIndex(i);
//			Thread.sleep(2000);
//		}

		System.out.println("print the list of all options");
		// first we need to store them in a list
		List<WebElement> options = sel.getOptions(); // by using getOption() method of Select class we can store all the
														// elements inside a list

		int size = options.size(); // size of the list

		for (int i = 0; i < size; i++) {
			String s = options.get(i).getText(); // first we selected the option then getting visible text from that option using .getText() method
			System.out.println(s);
		}

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
