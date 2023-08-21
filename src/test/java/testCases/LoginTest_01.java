package testCases;

import org.testng.annotations.Test;
import PageObjects.LoginPage;
import testBase.BaseClass;

public class LoginTest_01 extends BaseClass
{
	
	
	@Test
	public void test_login()
	{
		
		LoginPage lp=new LoginPage(driver);
		lp.setusername(rb.getString("username"));
		lp.setpassword(rb.getString("password"));
		lp.loginbutton();
		logger.info("Login sucessful");
		
	}
	

}
