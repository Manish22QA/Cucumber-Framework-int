package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManger {

	public WebDriver driver;
	public LogIn login;
	
	public PageObjectManger(WebDriver driver)    // Constructor
	{
		this.driver = driver;
	}
	
	public LogIn LoginGet() {
		
	   login = new LogIn(driver);     // Object Of Login
		return login;	
	}
	
	
}
