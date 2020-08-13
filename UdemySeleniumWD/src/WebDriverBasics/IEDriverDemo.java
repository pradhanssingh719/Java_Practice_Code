package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo {
	
public static void main(String[] args) {
		
		//System.setProperty("webdriver.ie.driver", "D:\\Programming (Imp)\\Drivers\\Internet Explorer Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		String baseURL = "http://www.facebook.com";
		driver.get(baseURL);
		driver.close();
	}

}
