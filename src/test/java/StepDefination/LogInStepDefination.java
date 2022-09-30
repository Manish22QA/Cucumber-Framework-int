package StepDefination;



import PageObject.LogIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utils.TestContexSetup;

public class LogInStepDefination {
	
	public TestContexSetup testcontextSetup;
	public LogIn login;
	
	public LogInStepDefination (TestContexSetup testcontexSetup)
	{
		this.testcontextSetup = testcontexSetup;
		this.login = testcontextSetup.pageobj.LoginGet();
	}

	@Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
		
		String Url = testcontextSetup.testbase.startUp().getCurrentUrl();
		System.out.println(Url);
   
    }
	
	  @When("^user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_enters_username_something_and_password_something(String username, String password) throws Throwable {
	      
		  login.username(username);
		  login.password(password);    
	    }
	  

    @Then("^user navigate dashboard to page$")
    public void user_navigate_dashboard_to_page() throws Throwable {
        
    	String Url = testcontextSetup.testbase.startUp().getCurrentUrl();
		System.out.println(Url);
    	
    }

    @Then("^user should get massege as \"([^\"]*)\"$")
    public void user_should_get_massege_as_something(String strArg1) throws Throwable {
        
    	String msg = login.spamMsg().getText();
    
    	System.out.println("Massage is " + msg);
    	Assert.assertEquals(strArg1, msg);	
    	
    }
    

@Then("user should get massege  {string}")
public void user_should_get_massege(String stringArg2) {
	String invmsg=login.invalidCred().getText();
	
	System.out.println("Massage is " + invmsg);
	Assert.assertEquals(stringArg2, invmsg);
}

    @And("^user click on login button$")
    public void user_click_on_login_button() throws Throwable {
       login.login();
    }

}

