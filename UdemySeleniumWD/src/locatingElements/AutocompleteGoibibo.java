//in case of goibibo web site dynamically provided list is gone we trying to click on that list
//so for looking into that list we can use innerHTML 

package locatingElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutocompleteGoibibo {
	WebDriver driver;
	String baseURL;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://www.goibibo.com/flights";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@Test
	public void test() {
		String patialText = "benga";  //to bring up auto complete list 
		String textToEnter = "Bengaluru";
		
		WebElement textBox = driver.findElement(By.id("gosuggest_inputSrc"));
		textBox.sendKeys(patialText);
		
		WebElement ulElements = driver.findElement(By.id("react-autosuggest-1"));
		
		String innerHTML = ulElements.getAttribute("innerHTML");		//To find out what is present inside the ul because it is disappeared as we trying to click on it
		
		System.out.println(innerHTML);
		
		List<WebElement> liElements = ulElements.findElements(By.tagName("li"));
		
		for(WebElement element : liElements) {
			//System.out.println(element.getText());
			if(element.getText().contains(textToEnter)) {
				element.click();
				break;
			}
		}
		
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
	}

	

}
