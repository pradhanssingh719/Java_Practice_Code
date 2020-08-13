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
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		//driver = new FirefoxDriver();
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.get(baseUrl);
	}

	@Test
	public void test() {
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		
		//orange
		sel.selectByValue("orange");
		sel.deselectByValue("orange");
		
		//peach
		sel.selectByIndex(2);
		
		//apple
		sel.selectByVisibleText("Apple");
		
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		
		for(int i=0; i<size; i++) {
			if(options.get(i).isSelected()) {
				System.out.println(options.get(i).getText());
			}
		}
		
//		//we can also use for-each loop to get same result
//		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
//		for(WebElement item : selectedOptions) {
//			System.out.println(item.getText());
//		}
		
		sel.deselectAll();
	}
	
	@After
	public void tearDown() throws Exception {
	}

	

}
