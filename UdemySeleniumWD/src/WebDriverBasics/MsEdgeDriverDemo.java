package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MsEdgeDriverDemo {

	public static void main(String[] args) {//
		System.setProperty("webdriver.edge.driver", "D:\\Programming (Imp)\\Drivers\\MS Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String baseURL = "http://www.facebook.com";
		driver.get(baseURL);
		driver.quit();
	}

}
