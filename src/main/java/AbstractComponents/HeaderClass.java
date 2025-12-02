package AbstractComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderClass {
	
	WebDriver driver;
	public HeaderClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[id='icp-nav-flyout'] a")
	WebElement CountryDropDown;
	
	
	public void chooseCountry()
	{
		CountryDropDown.click();
	}

}
