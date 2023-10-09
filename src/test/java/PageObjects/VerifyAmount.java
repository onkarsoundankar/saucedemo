package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyAmount extends BasePage {

	public VerifyAmount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//div[normalize-space()='Sauce Labs Fleece Jacket']")
	WebElement jacketname;
	
	
	@FindBy(xpath="//div[@class='inventory_details_price']")
	WebElement amount;
	
	

	
	public void jacketname()
	{
		jacketname.click();
	}
	
	
	public boolean isAmountDisplayed()
	{
		try
		{
		return amount.isDisplayed();
		}
		catch(Exception e)
		{
			return(false);
		}
	}

	public void amountvalueget() 
	{
		System.out.println(amount.getText());
		
	}


	
	

}