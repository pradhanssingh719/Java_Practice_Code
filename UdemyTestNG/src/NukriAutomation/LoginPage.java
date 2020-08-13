package NukriAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement element = null;
	public static WebDriver driver;

	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.id("login_Layer"));
		return element;
	}

	public static WebElement emailId(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='form-row']//input[@type='text']"));
		return element;
	}

	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@type='password']"));
		return element;
	}

	public static WebElement login(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
	}
	
	
}
