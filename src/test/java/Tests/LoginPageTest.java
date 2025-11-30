package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import BaseComponents.BaseComponents;
import Pages.HomePage;
import Pages.LoginPageAmazon;




public class LoginPageTest extends BaseComponents {
	
	
	@Test
	@Parameters({"username","password"})
	public void checkSignTest(String username,String password) throws IOException, InterruptedException
	{
		
		LoginPageAmazon pg=loadUrl();
		String text=pg.checkSignIn(username,password);
		Assert.assertEquals("Hello, Rati", text);
		HomePage hp=pg.loadHomePage();
		hp.addToCart("women trouser pants","High Waist");
		
		
		
		
	}
	

}
