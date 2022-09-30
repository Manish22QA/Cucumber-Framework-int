package utils;

import org.openqa.selenium.WebDriver;

import PageObject.LogIn;
import PageObject.PageObjectManger;

public class TestContexSetup {     
	// All you Need to share in this class

	public WebDriver driver;
	public LogIn login;
	public PageObjectManger pageobj;
	public TestBase testbase;           //Returns Driver
	
	public TestContexSetup() throws Exception {
		
		testbase = new TestBase();
		pageobj = new PageObjectManger(testbase.startUp());
		
	}
	
}
