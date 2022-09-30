package utils;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	public WebDriver startUp() throws Exception
	{
		//String Path = System.getProperty("user.dir");
		//FileReader reader1 = new FileReader("path"+"/src/resources/global.properties");
		FileReader reader = new FileReader("C:/Users/chaud/git/Cucumber-Framework/Cucumber/resources/global.properties");
		//FileInputStream fis = new FileInputStream("C:/Users/chaud/eclipse-workspace/Cucumber/resources/global.properties");
		Properties prop = new Properties();
		prop.load(reader);
		
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("QAurl");
		//System.out.println("path = "+projectPath);
		if(driver==null)
		{
		if(browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("ch"))
		{WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox") || browserName.equalsIgnoreCase("ie"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		}
		return driver;      // Returns Driver
	}
	
}
