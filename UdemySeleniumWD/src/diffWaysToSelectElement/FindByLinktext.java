package diffWaysToSelectElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinktext {

	public static void main(String[] args) throws Exception {                    //using throws Exception for Thread.sleep()
		String baseURL = "https://learn.letskodeit.com";
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(baseURL);
		driver.findElement(By.linkText("Login")).click();        //link text  (full text present in acchor <a>Login</a>)
		Thread.sleep(5000);									      //browser will wait for 5 second before performing next action
		//driver.findElement(By.xpath("//a[@href = '/secure/42299/users/password/new']")).click();;     //xpath
		driver.findElement(By.partialLinkText("Forgot")).click();                                       //partial link text  (partial text present in link text <a>Forgot Password</a>)
		
	}

}
