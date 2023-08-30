package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.LoginPage;
import PageObjects.VerifyJacketName;
import testBase.BaseClass;


public class VerifyName_TC_03 extends BaseClass {
	

	 
	 
	@Test 
	public void checkjacketname()
	{
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