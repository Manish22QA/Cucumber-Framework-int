package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	public WebDriver driver;
	// Constructor
	public LogIn(WebDriver driver) {
		this.driver = driver;
	}
	// Locate WebElements
	   By username = By.xpath("//*[@name='username']");	
	   By password = By.xpath("//*[@name='password']");
	   By login = By.xpath("//*[@type='submit']");
	   By emptyMsg = By.xpath("//span[contains(@class,'oxd-input-field')]");
	   By invalidMsg = By.xpath("//p[contains(@class,'oxd-alert')]");
	
	   // Create Action Methods
	   public void username(String un)
	   {
		   driver.findElement(username).sendKeys(un);
	   }
	   public void password(String pass)
	   {
		   driver.findElement(password).sendKeys(pass);
	   }
	   public void login()
	   {
		   driver.findElement(login).click();
	   }
	   
	   public WebElement spamMsg()
	   {
		  return driver.findElement(emptyMsg);
		  
	   }
	   public WebElement invalidCred()
	   {
		return driver.findElement(invalidMsg);   
	   }
	
	   public String Title()
	   {
		   return driver.getTitle();
	   }
}
