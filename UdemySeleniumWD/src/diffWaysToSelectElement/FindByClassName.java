package diffWaysToSelectElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClassName {

	public static void main(String[] args) {
		
		//no need for setting System.setProperty(key,value); because I already set it in system environment variable path
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "https://facebook.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(baseURL);
		
//		String baseURL2 = "http://www.linkedin.com";                             //first it will open facebook then immediately it will open linkedin
//		driver.get(baseURL2);
		
//		driver.findElement(By.className("inputtext")).sendKeys("automation");    //other tag also have inputtaxt class name so it always select first element which is using this class name
//
//		driver.findElement(By.className("uiButtonConfirm")).click();				//this one is unique so selenium wont get confused...it will give desired output
		
		String baseURL3 = "https://letskodeit.teachable.com/";
		driver.get(baseURL3);
		driver.findElement(By.linkText("Practice")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn-style') and contains(@class,'class1')]")).click();    //if any element have two class and we want to find element the we needs to use xpath
	}

}
	
