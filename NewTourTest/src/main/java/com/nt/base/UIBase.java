package com.nt.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nt.utils.CommonUtils;
import com.nt.utils.Environment;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Select select;
	public static WebDriverWait webDriverWait;
	public static JavascriptExecutor jse;
	public static Environment env;

	public WebDriverWait getWebDriverWait() {
		if (webDriverWait == null) {
			webDriverWait = new WebDriverWait(driver, 30);
		}
		return webDriverWait;
	}

	public void jsClick(WebElement element) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", element);
	}

	public void scrollIntoView(WebElement element) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void browserInitialization(String browserName) {
		env = new Environment();

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(CommonUtils.PAGE_LOAD_TIMEOUT,
		// TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICITLY_WAIT, TimeUnit.SECONDS);

		driver.get(Environment.getURL());
	}
}
