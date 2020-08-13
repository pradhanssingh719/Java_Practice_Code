package diffWaysToSelectElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByNameDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.get(baseURL);
		
		driver.findElement(By.name("enter-name")).sendKeys("singh");

	}

}
