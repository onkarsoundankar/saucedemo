package testCases;

import org.testng.annotations.*;
import PageObjects.LoginPage;
import testBase.BaseClass;

public class LoginTest_01 extends BaseClass
{
	
	
	@Test
	public void test_login()
	{
		logger.info("Starting Login Process");
		
		LoginPage lp=new LoginPage(driver);
		lp.setusername(rb.getString("username"));
		lp.setpassword(rb.getString("password"));
		lp.loginbutton();
		logger.info("Login Successful");

		
	}
	

}