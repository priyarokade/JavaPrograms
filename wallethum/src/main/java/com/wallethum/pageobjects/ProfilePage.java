package com.wallethum.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethum.helper.LoggerHelper;

/*Profile page objects initialization
 * 
 */
public class ProfilePage {

	WebDriver driver;
	Logger log = LoggerHelper.getLogger(ProfilePage.class);

	@FindBy(xpath = "//div[@class='wh-profile-sidebar']//div[contains(text(),'My Profile')]")
	WebElement myprofilecheck;

	@FindBy(xpath = "//a[@class='mywallet']")
	WebElement mywalletlink;

	@FindBy(xpath = "//div[@class='profilenav']/ul/li[3]/a")
	WebElement reviewlink;

	@FindBy(xpath = "//a[@class='user' and @data-menu='m-user']")
	WebElement muserlink;

	@FindBy(xpath = "//nav[@id='m-user']/ul/li[1]/a[text()='Profile']")
	WebElement mprofilerlink;

	@FindBy(xpath = "//div[@class='reviews']//p")
	WebElement reviewmsgtxt;

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getreviewlink() {
		return reviewlink;
	}

	public void clickonprofilelink() {
		Actions action = new Actions(driver);
		action.moveToElement(muserlink).moveToElement(myprofilecheck).click().build().perform();

	}

	public void clickonreviewtab() {
		reviewlink.click();
	}

	public WebElement getywalletlink() {
		return mywalletlink;
	}

	public WebElement getmuserlink() {
		return muserlink;
	}

	public boolean verifywalletlink() {
		if (mywalletlink.isDisplayed())
			return true;
		else
			return false;
	}

	public void verifyloginsuccess() throws InterruptedException {
		if (verifywalletlink()) {
			log.info("Login Successful");

		} else {
			log.info("Login failed");
		}
	}

	public void verifyreviewmessage(String reviewmsg) {

		String publishedreviewmsg = reviewmsgtxt.getText();
		if (publishedreviewmsg.equals(reviewmsg))
			log.info("Review message is published successfully");
		else {
			log.info("Review message published is matching with the actual message");
			log.info("published message: " + publishedreviewmsg);
			log.info("Actual message : " + reviewmsg);
		}

	}

	public void clickonprofile() {
		try {
			muserlink.isDisplayed();
			Actions action = new Actions(driver);
			// action.keyDown(Keys.CONTROL);
			action.moveToElement(muserlink);
			action.pause(10);
			action.moveToElement(mprofilerlink).click().build().perform();
		} catch (Exception e) {
			log.info("Error while clicking on profile link");
		}
	}
}
