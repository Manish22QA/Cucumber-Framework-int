package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failed_scenarios.txt",
glue="StepDefination",
monochrome = true,dryRun=false,
plugin ={"pretty",
		"html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		})
public class TestRunnerFailed {

}
