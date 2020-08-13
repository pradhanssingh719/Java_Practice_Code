package naveen;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait {
	WebDriver driver;
	String baseUrl;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();
		
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//dynamic wait
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();
		
		//static wait
		//Thread.sleep(2000);
	}
	@Test
	public void test() throws InterruptedException{
		baseUrl = "https://www.makemytrip.com/";
		driver.get(baseUrl);
		driver.findElement(By.id("fromCity")).sendKeys("beng");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li//p")));
		List<WebElement> uList = driver.findElements(By.xpath("//ul[@role='listbox']//li//p"));
		System.out.println(uList.size());
		
		for(WebElement list : uList) {
			if((list.getText()).equals("Bengaluru, India")) {
				System.out.println(list.getText());
				list.click();
				break;
			}
		}
		driver.findElement(By.id("toCity")).sendKeys("jaip");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li//p")));
		uList = driver.findElements(By.xpath("//ul[@role='listbox']//li//p"));
		for(WebElement list : uList) {
			if((list.getText()).equals("Jaipur, India")) {
				System.out.println(list.getText());
				list.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DayPicker-Month'][position()=2]//p[text()='1']//parent::div")));
		driver.findElement(By.xpath("//div[@class='DayPicker-Month'][position()=2]//p[text()='1']//parent::div")).click();
		driver.findElement(By.cssSelector(".primaryBtn.font24.latoBold.widgetSearchBtn")).click();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
