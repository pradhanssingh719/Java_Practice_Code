package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Programming (Imp)\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://www.quora.com";
		driver.get(baseURL);

	}

}
