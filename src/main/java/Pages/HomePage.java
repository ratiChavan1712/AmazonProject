package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchInput;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchIcon;
	
	@FindBy(css="div[role='listitem']")
	List<WebElement> productList;

	
	
	
	
	public void addToCart(String searchProduct,String productName) throws InterruptedException
	{
		
		searchInput.sendKeys(searchProduct);
		searchIcon.click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200);");
		Thread.sleep(1000);
		
		WebElement productEle=productList.stream().filter(element ->element.findElement(By.cssSelector("h2[class*='a-size-base-plus'] span")).getText()
				.contains(productName))
		.findFirst().orElse(null);
		Thread.sleep(1000);
		WebElement spt=productEle.findElement(By.cssSelector("h2[class*='a-size-base-plus'] span"));
		String productCheck=productEle.findElement(By.cssSelector("h2[class*='a-size-base-plus'] span")).getText();
		System.out.println(productCheck);
		spt.click();
		
		
		
		
			

		
		
		
	}

}
