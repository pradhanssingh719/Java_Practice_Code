package BrowserProfiles;

import java.awt.List;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		
		//in case of chrome we dont need to use ProfileIni, here we are working with .crx file
		ChromeOptions options = new ChromeOptions();   
		options.addExtensions(new File("C:\\Users\\pradh\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\gighmmpiobklfepjocnamgkkbiglidom\\4.7.3_0.crx"));
	
		
		WebDriver driver;
		driver = new ChromeDriver(options);
		driver.get("https://google.com");
	}

}
