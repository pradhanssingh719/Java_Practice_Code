package extentreportse;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
		
	public static String takeScreenshot(String name, WebDriver driver) throws IOException {
		String location = "D:\\Programming (Imp)\\JAVA\\UdemySeleniumWD\\extentreports\\";
		String fileName = name + ".png";
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(location + fileName));
		String screenshotName = location + fileName;
		return screenshotName;
	}
}
