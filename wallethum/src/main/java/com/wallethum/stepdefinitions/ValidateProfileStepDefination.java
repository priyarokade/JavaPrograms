package com.wallethum.stepdefinitions;

import com.wallethum.helper.WaitHelper;
import com.wallethum.pageobjects.HomePageObjects;
import com.wallethum.pageobjects.LoginPageObjects;
import com.wallethum.pageobjects.ProfilePage;
import com.wallethum.pageobjects.ProfileTestInsurancePage;
import com.wallethum.pageobjects.ReviewConfirmationPageObjects;
import com.wallethum.pageobjects.ReviewPageObjects;
import com.wallethum.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*Validate profile step definations
 * 
 */
public class ValidateProfileStepDefination extends TestBase {

	HomePageObjects homepage = new HomePageObjects(driver);
	LoginPageObjects loginpage = new LoginPageObjects(driver);
	ProfilePage profilepage = new ProfilePage(driver);
	ProfileTestInsurancePage profileTestInsurancePage = new ProfileTestInsurancePage(driver);
	ReviewPageObjects reviewPageObjects = new ReviewPageObjects(driver);
	ReviewConfirmationPageObjects reviewConfirmationPageObjects = new ReviewConfirmationPageObjects(driver);
	WaitHelper wait = new WaitHelper(driver);

	@Given("^User should logged in to URL$")
	public void user_should_logged_in_to_URL() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homepage.clickloginifdisplayed();
		wait.WaitForElement(loginpage.getLoginemail(), 60);
		loginpage.ValidLogin();
	}

	@Then("^User should see home page with profile link$")
	public void user_should_see_home_page_with_profile_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wait.WaitForElement(profilepage.getywalletlink(), 60);
		profilepage.verifyloginsuccess();
		Thread.sleep(100);
	}

	@Given("^User Clicks on url \"([^\"]*)\"$")
	public void user_Clicks_on_url(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.driver.navigate().to("https://wallethub.com/profile/test-insurance-company-13732055i");
	}

	@Given("^User should see profile page$")
	public void user_should_see_profile_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wait.WaitForElement(profileTestInsurancePage.gettestinsuranceheading(), 60);
		profileTestInsurancePage.verifyprofileTestInsurancePage();
	}

	@When("^User Scroll down page and hover on review Stars and Clicks on fifth star$")
	public void user_Scroll_down_page_and_hover_on_review_Stars_and_Clicks_on_fifth_star() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		profileTestInsurancePage.movetoreviewstar();
		Thread.sleep(100);
	}

	@When("^Test Insurance review page is diplayed$")
	public void test_Insurance_review_page_is_diplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		reviewPageObjects.verifyReviewPagedisplayed();
	}

	@When("^User selects \"([^\"]*)\" plan$")
	public void user_selects_plan(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		reviewPageObjects.selectplan(arg1);
	}

	@When("^Writes review \"([^\"]*)\"$")
	public void writes_review(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		reviewPageObjects.sendReviewtext(arg1);
	}

	@When("^Click's on Submit Button$")
	public void click_s_on_Submit_Button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		reviewPageObjects.clickonsubmit();
	}

	@When("^User should see Review Confirmation Message$")
	public void user_should_see_Review_Confirmation_Message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wait.WaitForElement(reviewConfirmationPageObjects.getreviewconfirmmsg(), 70);
		reviewConfirmationPageObjects.verifyreviewconfirmation();
	}

	@When("^When user navigates to profile page$")
	public void when_user_navigates_to_profile_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wait.WaitForElement(reviewConfirmationPageObjects.getmuserlink(), 60);
		reviewConfirmationPageObjects.clickonprofile();
	}

	@When("^Check for review$")
	public void check_for_review() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wait.WaitForElement(profilepage.getreviewlink(), 70);
		profilepage.clickonreviewtab();
	}

	@Then("^User should see review text correctly \"([^\"]*)\"$")
	public void user_should_see_review_text_correctly(String reviewmsg) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		profilepage.verifyreviewmessage(reviewmsg);
	}

}
