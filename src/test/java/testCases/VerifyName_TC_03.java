package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.LoginPage;
import PageObjects.VerifyJacketName;
import testBase.BaseClass;
import testCases.LoginTest_01;
import PageObjects.LoginPage;

public class VerifyName_TC_03 extends BaseClass {
	
	
	   
	@Test 
	public void checkjacketname()
	{	
		LoginPage lt = new LoginPage(driver);
		lt.dologin(rb.getString("username"), rb.getString("password"));
		
		try
		{
		VerifyJacketName vp = new VerifyJacketName(driver);
		vp.clickjacket();
		
		boolean name = vp.isJacketNameDisplayed();
		Assert.assertEquals(name, true);
		}
		catch(Exception e)
		{
		Assert.fail();
		}
	
	}
	
}