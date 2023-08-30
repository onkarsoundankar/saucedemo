package testBase;


import java.time.Duration;

import java.util.ResourceBundle;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;

    public ResourceBundle rb;
    
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{ 
		
		rb=ResourceBundle.getBundle("config");  //Load config.properties
		
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
		if(br.equals("chrome")) 
		{
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("http://localhost/opencart/upload/index.php");
		driver.get(rb.getString("appURL"));
		
	
	}
	
	//@AfterClass
	//public void tearDown()
	//{
	//	driver.quit();
	//}
	
	
	
}

