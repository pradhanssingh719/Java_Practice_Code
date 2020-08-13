package locatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonsAndCheckBoxes {
	WebDriver driver;
	String baseUrl;

	@BeforeMethod
	public void setUp() throws Exception {
//		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();
		//driver = new InternetExplorerDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	
	@Test
	public void test() throws InterruptedException {
		
		WebElement practice = driver.findElement(By.cssSelector("a[href='/pages/practice']"));
		practice.click();
		
		WebElement bmwRadioButton = driver.findElement(By.id("bmwradio"));
		bmwRadioButton.click();
		
		Thread.sleep(2000);
		WebElement benzRadioButton = driver.findElement(By.id("benzradio"));
		benzRadioButton.click();
		
		Thread.sleep(2000);
		WebElement hondaRadioButton = driver.findElement(By.id("hondaradio"));
		hondaRadioButton.click();
		
		Thread.sleep(2000);
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		
		Thread.sleep(2000);
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		
		
		
		
		System.out.println("BMW radio button is selected? "+bmwRadioButton.isSelected());
		System.out.println("Benz radio button is selected? "+benzRadioButton.isSelected());
		System.out.println("Honda radio button is selected? "+hondaRadioButton.isSelected());
		System.out.println("Bmw CheckBox button is selected? "+bmwCheckBox.isSelected());
		System.out.println("Benz CheckBox button is selected? "+benzCheckBox.isSelected());
		
	}
	

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();      //driver.quit();
	}

	

}
