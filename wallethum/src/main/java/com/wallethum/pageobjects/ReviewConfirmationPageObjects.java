package com.wallethum.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethum.helper.LoggerHelper;

/*
 * ReviewConfirmation page objects initialization
 */
public class ReviewConfirmationPageObjects {

	WebDriver driver;

	Logger log = LoggerHelper.getLogger(ReviewConfirmationPageObjects.class);

	public ReviewConfirmationPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @FindBy(xpath =
	 * "//h2[contains(text(),'Before we publish your review we need you to verify your email.')]"
	 * ) WebElement reviewconfirmmsg;
	 */
	@FindBy(xpath = "//a[@class='user' and @data-menu='m-user']")
	WebElement muserlink;

	@FindBy(xpath = "//nav[@id='m-user']/ul/li[1]/a[text()='Profile']")
	WebElement mprofilerlink;

	@FindBy(xpath = "//div[@class='brgm-button brgm-user brgm-list-box']/span")
	WebElement muser;

	@FindBy(xpath = "//div[@class='brgm-button brgm-user brgm-list-box']/div/a[1]")
	WebElement mprofile;

	@FindBy(xpath = "//div[@class='rvc-header']/h4[contains(text(),'Your review has been posted.')]")
	WebElement reviewconfirmmsg1;

	public WebElement getmuserlink() {
		return muser;
	}

	public void clickonprofile() {
		try {
			muser.isDisplayed();
			Actions action = new Actions(driver);
			action.keyDown(Keys.CONTROL);
			action.moveToElement(muser);
			action.pause(10);
			action.moveToElement(mprofile).click().keyUp(Keys.CONTROL).build().perform();
		} catch (Exception e) {
			log.info("Error while clicking on profile link");
		}
	}

	public WebElement getreviewconfirmmsg() {
		return reviewconfirmmsg1;
	}

	public void verifyreviewconfirmation() {
		try {
			reviewconfirmmsg1.isDisplayed();
			log.info("Review confirmation message is submitted successfully");
		} catch (Exception e) {
			log.info("Review confirmation message is not submitted successfully");
		}
	}

}
