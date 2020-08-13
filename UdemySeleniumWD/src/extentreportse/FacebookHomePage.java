package extentreportse;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FacebookHomePage {

	WebDriver driver;
	ExtentTest test;
	
	public FacebookHomePage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public void enterUsername(String username) {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		test.log(LogStatus.INFO, "Email entered.");
	}
	
	public void enterPassword(String password) {
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		test.log(LogStatus.INFO, "Password entered.");
	}
	
	public void clickOnLoginButton() {
		WebElement clickButton = driver.findElement(By.id("loginbutton"));
		clickButton.click();
		test.log(LogStatus.INFO, "clicked on login button.");
	}
	
	 public boolean isUsernamePresent() {
		 try {
			 WebElement username = driver.findElement(By.xpath("//div[text()='Singh P']"));
			 if(username != null) {
				 return true;
			 }
		 }catch(NoSuchElementException e) {
			 System.out.println(e.getMessage());
			 return false;
		 }
		 
		 return false;
	 }
	 
	 //we can do one more thing we can wrap up all the methods in side a single method
	 public void login(String username, String password) {
		 enterUsername(username);
		 enterPassword(password);
		 clickOnLoginButton();
	 }


}
