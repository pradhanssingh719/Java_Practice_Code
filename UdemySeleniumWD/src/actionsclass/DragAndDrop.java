package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	String baseURL;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://jqueryui.com/droppable/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}


	@Test
	public void method1() {
		driver.get(baseURL);
		Actions action = new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement droppable = driver.findElement(By.id("droppable"));

		//first way to drag and drop an element
		action.dragAndDrop(draggable, droppable).build().perform();
		
		//action.dragAndDrop(draggable, droppable).perform();      //it will work without build as well		
	}
	
	@Test
	public void method2() {
		driver.get(baseURL);
		Actions action = new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement droppable = driver.findElement(By.id("droppable"));

		//second way to drag and drop an element
		action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}


}
