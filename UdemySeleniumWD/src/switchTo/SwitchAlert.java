package switchTo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert {

	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		//driver = new InternetExplorerDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		
		//maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("singh");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		Alert alrt = driver.switchTo().alert();   //we are using Alert class to switch on alert button
		alrt.dismiss();                            //in case of alert there is only one OK button so .accept() and dismiss() both will worked with that
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("singh");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		Alert alrt = driver.switchTo().alert();
		alrt.accept();                            //in case of confirm there are two button one is OK and another one is CANCLE
		//alrt.dismiss();
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
