package naveen;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFIle {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException{
		
		String filePath = "D:\\Programming (Imp)\\JAVA\\Code\\Files\\config.properties";
		//linking file to our code by providing file location inside FileInputStream
		FileInputStream file = new FileInputStream(filePath);
		//Properties class for loading and reading values from properties file
		Properties prop = new Properties();
		
		prop.load(file);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("URL"));
		
		
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			driver =  new ChromeDriver();
		}else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("edge")){
			System.setProperty("webdriver.edge.driver", "D:\\Programming (Imp)\\Drivers\\MS Edge Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		
		driver.quit();
		
	}

}
