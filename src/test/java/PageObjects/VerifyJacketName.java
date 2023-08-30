package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyJacketName extends BasePage {

	public VerifyJacketName(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//div[normalize-space()='Sauce Labs Onesie']")
	WebElement JacketName;
	
	@FindBy(xpath="//div[@class='inventory_details_name large_size']")
	WebElement JacketNameOnPage;
	
	public void clickjacket()
	{
		JacketName.click();
	}
	
	
	public boolean isJacketNameDisplayed()
	{
		try
		{
		return JacketNameOnPage.isDisplayed();
		}
		catch(Exception e)
		{
			return(false);
		}
	}


}
