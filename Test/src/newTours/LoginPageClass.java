package newTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageClass {

	static WebDriver driver;

	//user name
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.name("userName"));
	}
	public static void fillUserName(WebDriver driver, String username) {
		userName(driver).sendKeys(username);
	}
	
	//password
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	public static void fillPassword(WebDriver driver, String password) {
		password(driver).sendKeys(password);
	}
	//submit
	public static void clickOnSubmit(WebDriver driver) {
		driver.findElement(By.name("login")).click();
	}

}
