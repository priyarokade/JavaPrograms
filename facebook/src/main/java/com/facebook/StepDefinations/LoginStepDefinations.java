package com.facebook.StepDefinations;

import com.facebook.config.ConfigReader;
import com.facebook.pageObjects.AccountPageObjects;
import com.facebook.pageObjects.HomePageObject;
import com.facebook.pageObjects.LoginPageObjects;
import com.facebook.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/*
 * Login step definations 
 */
public class LoginStepDefinations extends TestBase {

	HomePageObject homepage = new HomePageObject(driver);
	LoginPageObjects loginpage = new LoginPageObjects(driver);
	AccountPageObjects accountpage = new AccountPageObjects(driver);

	@Given("^User navigates to homepage url of the application$")
	public void user_navigates_to_homepage_url_of_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(ConfigReader.getProperty("url"));
	}

	@Given("^User enters valid username$")
	public void user_enters_valid_username() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homepage.setEmailid(ConfigReader.getProperty("username"));
	}

	@Given("^User enters valid Password$")
	public void user_enters_valid_Password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homepage.setPassword(ConfigReader.getProperty("password"));
	}

	@Given("^User clicks on loginbutton$")
	public void user_clicks_on_loginbutton() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homepage.ClickLoginbtn();
	}

	@Given("^User enters valid email \"([^\"]*)\"$")
	public void user_enters_valid_email(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homepage.setEmailid(arg1);
	}

	@Given("^User enters valid password \"([^\"]*)\"$")
	public void user_enters_valid_password(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homepage.setPassword(arg1);
	}

	@Given("^User enters invalid email \"([^\"]*)\"$")
	public void user_enters_invalid_email(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homepage.setEmailid(arg1);
	}

	@Given("^User enters invalid password \"([^\"]*)\"$")
	public void user_enters_invalid_password(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homepage.setPassword(arg1);
	}

	@Then("^User should not see profile page$")
	public void user_should_not_see_profile_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		loginpage.verifylogin();
	}

	@Then("^User should see profile page$")
	public void user_should_see_profile_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		accountpage.verifysuccesslogin();
	}

}
