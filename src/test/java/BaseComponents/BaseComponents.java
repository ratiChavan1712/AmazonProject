package BaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.LoginPageAmazon;
import io.github.bonigarcia.wdm.WebDriverManager;





public class BaseComponents {
	
	WebDriver driver;
	LoginPageAmazon pga;

	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\chava\\eclipse-workspace\\AmazonProj\\src\\main\\java\\Resources\\Global.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
	}

	
	public LoginPageAmazon loadUrl() throws IOException
	{
		driver=initializeDriver();
		pga=new LoginPageAmazon(driver);
		pga.landPage1();
		return pga;
		
	}
}
