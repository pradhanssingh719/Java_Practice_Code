package NukriAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditPage {

	public static WebElement element = null;
	public static WebDriver driver;
	
	public static WebElement clickOnTitle(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div[title='Pradhan Singh Meena']"));
		return element;
	}
	public static WebElement ResumeHeadline(WebDriver driver) {
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='lazyResumeHead']//span[@class='edit icon']")));
		
		element = driver.findElement(By.xpath("//div[@id='lazyResumeHead']//span[@class='edit icon']"));
		return element;
	}
	
	public static WebElement editHeadline(WebDriver driver) {
		element = driver.findElement(By.id("resumeHeadlineTxt"));
		return element;
	}
	
	public static WebElement cancelOrSave(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='action s12']//a[@class='cancelLayer']"));
		return element;
	}
	
	//screenshot code but not worked so put it into ActionClass..
//	public static void screenshot(int length) throws IOException {
//		String fileName = randomString(length) + ".png";
//		String directory = System.getProperty("user.dir") + "/screenshots//";
//		File fileSource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(fileSource, new File(directory + fileName));
//	}
//	public static String randomString(int length) {
//		StringBuffer sb = new StringBuffer();
//		String characters = "abcdefghijklmnopqrstuvwxyz1234567890";
//		int size = characters.length();
//		for(int i = 0; i < length; i++ ) {
//			int index = (int)(Math.random() * size);
//			sb.append(characters.charAt(index));
//		}
//		return sb.toString();
//	}
}
