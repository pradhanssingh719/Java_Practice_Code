package pageFactoryAndDate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectBrowser {
	WebDriver driver;
	
	public SelectBrowser(WebDriver driver) {
		this.driver = driver;
	}

	// Chrome
	public void chrome(WebDriver driver) {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	// Firefox
	public void firefox(WebDriver driver) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	// Internet Explorer
	public void internetExplorer(WebDriver driver) {
		driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
