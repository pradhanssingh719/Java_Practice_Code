package BrowserProfiles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxProfilesJunit {
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Programming (Imp)\\Drivers\\geckodriver (Firefox Driver)\\geckodriver.exe");
		
		//this code will open the particular profile which we provided 
		ProfilesIni profile = new ProfilesIni();							//create an object of ProfileIni Class
		FirefoxProfile fxProfile = profile.getProfile("AutomationProfile");		//create a variable to get profile using ProfileIni class object
		
		FirefoxOptions options = new FirefoxOptions();						//create an object of FirefoxOptions to set that perticular profile
		options.setProfile(fxProfile);										//set profile
		
		driver = new FirefoxDriver(options);
		driver.get("https://google.com");
		
//		//this code will open an anonymous profile 
//		driver = new FirefoxDriver();					
//		driver.get("https://youtube.com");     
	}
	
	@Test
	public void test() {
	
	}


	@After
	public void tearDown() throws Exception {
	}

	

}
