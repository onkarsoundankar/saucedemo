package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
		@FindBy(name="user-name")
		WebElement txt_username;
		
		
		@FindBy(name="password")
		WebElement txt_password;
		
		
		@FindBy(xpath="//input[@id='login-button']")
		WebElement loginbutton;
		
		
		
		@FindBy(xpath="//button[@id='react-burger-menu-btn']")
		WebElement menu;
		
		
		@FindBy(xpath="//a[@id='logout_sidebar_link']")
		WebElement Logout;
		
		
		
		
		public void setusername(String username) 
		{
			txt_username.sendKeys(username);
		}

		public void setpassword(String password)
		{
			txt_password.sendKeys(password);
		}

		public void loginbutton() 
		{
			loginbutton.click();
		}
		
		public void menu()
		{
			menu.click();
		}
		
		public void Logout()
		{
			Logout.click();
		}
		
	
		
	}

	
