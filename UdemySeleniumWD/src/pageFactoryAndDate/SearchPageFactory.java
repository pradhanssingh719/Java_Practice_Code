/***
 * when we are working with page factory 
 * 1. finds all the elements using @FindBY annotation 
 * 2. initialize constructor 
 * 3. now initialize all the founded element by using initElement so we can use them
 */

package pageFactoryAndDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;
	
	@FindBy(xpath="//li[@data-cy='menu_Flights']")
	WebElement flightTab;
	
	@FindBy(xpath="//li[@data-cy='menu_Hotels']")
	WebElement hotelTab;
	
	@FindBy(xpath="//li[@data-cy='menu_VillasApts']")
	WebElement villasTab;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFlightTab() {
		flightTab.click();
	}

	public void clickOnHotelTab() {
		hotelTab.click();
	}
	
	public void clickOnVillasTab() {
		villasTab.click();
	}
}
