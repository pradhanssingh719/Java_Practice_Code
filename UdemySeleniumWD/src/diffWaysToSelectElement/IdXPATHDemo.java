package diffWaysToSelectElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdXPATHDemo {

	public static void main(String[] args) {
		String baseURL = "https://letskodeit.teachable.com";   //site on which we are working     //(http://www.letskodeit.teachable.com) we use this url as well but most of the sites run on https:// and without www
		WebDriver driver;     									//we need WebDriver
		
		//System.setProperty("webdriver.chrome.driver","D:\\Programming (Imp)\\Drivers\\Chrome Driver\\chromedriver.exe");     //setting properties (webdriver and driver location in our system) 
																															//but I already set a environment path variable so there is no need to write this code again and again
		driver = new ChromeDriver();												//ChromeDriver initialization because we are working with chrome 
		driver.manage().window().maximize();										//open chrome browser in maximize mode
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  			 //this is needed for handling browser synchronization issue always add it once in code after driver initialization
																			
	
		driver.get(baseURL);														//web site is opening by this statement
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();				//web site is opened now I want to click on login button (I provided Xpath of href)
		
		driver.findElement(By.id("user_email")).sendKeys("singh123@gmail.com");      //It will enter the given value in input section //we can use this xpath("//input[@id='user_email']") as well instead of id 
	}

}
