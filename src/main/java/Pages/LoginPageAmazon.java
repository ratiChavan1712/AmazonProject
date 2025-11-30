package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAmazon{
	
	WebDriver driver;
	public LoginPageAmazon(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(css="#nav-link-accountList-nav-line-1")
	WebElement signIn;
	
	@FindBy(css="div[id='nav-flyout-ya-signin'] a[href*='signin']")
	WebElement signInBtn;
	
	@FindBy(css=".a-button-text")
	WebElement continueBtn;
	
	@FindBy(id="ap_email_login")
	WebElement input;
	
	@FindBy(css="#ap_password")
	WebElement password;
	
	@FindBy(css=".a-button-input")
	WebElement continueBtn1;
	
	@FindBy(id="signInSubmit")
	WebElement continueBtn2;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement TextValue;
	
	
	public void landPage1()
	{
		driver.get("https://www.amazon.com/");
	}
	
	public String checkSignIn(String email,String passwordval)
	{
		continueBtn.click();
		Actions a=new Actions(driver);
		a.moveToElement(signIn).build().perform();
		signInBtn.click();
		input.sendKeys(email);
		continueBtn1.click();
		password.sendKeys(passwordval);
		continueBtn2.click();
		String TextData=TextValue.getText();
		return TextData;
		
		
				
	}
	
	public HomePage loadHomePage()
	{
		HomePage hp=new HomePage(driver);
		return hp;
		
	}

}
