package StepDefination;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContexSetup;

public class Hooks {

public TestContexSetup testContextSetup;//object

	
	public Hooks (TestContexSetup testContextSetup)  //Constructor
	{
		this.testContextSetup = testContextSetup;
		
	}
	@After
	public void after() throws Exception//after scenario
	{
	  testContextSetup.testbase.startUp().quit();//driver.quit()
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws Exception//after each stage
	{
		WebDriver driver = testContextSetup.testbase.startUp();//driver
		
		if(scenario.isFailed())
		{
			
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                byte [] fileContent = FileUtils.readFileToByteArray(src);
	            scenario.attach(fileContent, "image/png", "image");
	           // scenario.attach(fileContent, null, null)
			
		
		}
	}
	
}
