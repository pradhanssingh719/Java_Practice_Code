package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	WebDriver driver;
	
	public WaitTypes(WebDriver driver) {
		this.driver = driver;
	}

	//utility method, which is return an element after waiting particular time
	
	public WebElement waiForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("Waiting for max: "+ timeout +" seconds for element to be available");
			
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
			System.out.println("Element appeard on the web page");
		
		}catch(Exception e) {
			System.out.println("Element not appeared on the web page");
		}
		return element;
	}
	
}
