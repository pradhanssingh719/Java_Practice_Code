package UsefullMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {
	WebDriver driver;

	//first create a constructor
	public GenericMethods(WebDriver driver) {   //it need WebDriver Instance 
		this.driver = driver;                 //we are setting this.driver instance to the driver which we are getting from out side
	}
	
	//finding an element 
	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element found with id: " + locator);
			return this.driver.findElement(By.id(locator));
		}
		else if (type.equals("xpath")) {
			System.out.println("Element found with xpath: " + locator);
			return this.driver.findElement(By.xpath(locator));
		}
		else if (type.equals("css")) {
			System.out.println("Element found with xpath: " + locator);
			return this.driver.findElement(By.cssSelector(locator));
		}
		else if (type.equals("linktext")) {
			System.out.println("Element found with xpath: " + locator);
			return this.driver.findElement(By.linkText(locator));
		}
		else if (type.equals("partiallinktext")) {
			System.out.println("Element found with xpath: " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		}
		else {
			System.out.println("Locator type not supported");
			return null;
		}
	}
	
	//finding list of elements
	public List<WebElement> getElementList(String locator, String type) {
		type = type.toLowerCase();
		List<WebElement> elementList = new ArrayList<WebElement>();
		if (type.equals("id")) {
			elementList = this.driver.findElements(By.id(locator));
		}
		else if (type.equals("xpath")) {
			elementList = this.driver.findElements(By.xpath(locator));
		}
		else if (type.equals("css")) {
			elementList = this.driver.findElements(By.cssSelector(locator));
		}
		else if (type.equals("linktext")) {
			elementList = this.driver.findElements(By.linkText(locator));
		}
		else if (type.equals("partiallinktext")) {
			elementList = this.driver.findElements(By.partialLinkText(locator));
		}if(elementList.isEmpty()) {
			System.out.println("Eelement not found with: " + type + ": " + locator);
		}
		else {
			System.out.println("Eelement found with: " + type + ": " + locator);
		}
		return elementList;
	}

	//for checking if element is present or not
	public boolean isElementPresent(String locator, String type) {
		List<WebElement> elementList = getElementList(locator,type);
		
		int size = elementList.size();
		if(size > 0)
			return true;
		else
			return false;
	}
}
