package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RMLoginpage;
import resources.Base;

public class stepDefinition extends Base {

	RMLoginpage rl;
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
		driver.manage().window().maximize();
	}

	@Given("^click on sign in link on Home page to land on Secure sign in page$")
	public void click_on_sign_in_link_on_Home_page_to_land_on_Secure_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rl=new RMLoginpage(driver);
		rl.signin().click();
	}

	/*@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rl.email().sendKeys(arg1);
		rl.pwd().sendKeys(arg2);
		rl.submit().click();
	}*/
	
	@When("^User enters (.+) and (.+) and logs in $")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		rl=new RMLoginpage(driver);
		rl.email().sendKeys(username);
		rl.pwd().sendKeys(password);
		rl.submit().click();
    }

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Logged in");
	}
	
}
