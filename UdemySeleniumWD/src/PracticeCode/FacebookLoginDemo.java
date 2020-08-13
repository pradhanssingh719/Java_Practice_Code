package PracticeCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginDemo {
	
	public static void main(String[] args) {
		String baseURL = "https://facebook.com";
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.id("email")).sendKeys("7007829131");
		driver.findElement(By.id("pass")).sendKeys("pass077!");
		driver.findElement(By.id("loginbutton")).click();
		
		
	}

}
