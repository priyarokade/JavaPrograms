package com.wallethum.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethum.helper.LoggerHelper;

/*ReviewPageObjects initialization
 * 
 */
public class ReviewPageObjects {

	WebDriver driver;
	Logger log = LoggerHelper.getLogger(ReviewPageObjects.class);

	@FindBy(xpath = "//*[@class='wrev-drp']/div/span")
	WebElement insuranceplanlist;

	@FindBy(xpath = "//*[@class='wrev-drp']//li[@class='dropdown-item' and contains(text(),'Health Insurance')]")
	WebElement insuranceplanitem;

	@FindBy(xpath = "//div[@class='android']/textarea")
	WebElement reviewtext;

	@FindBy(xpath = "//div[text()='Submit']")
	WebElement submitbtn;

	public ReviewPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getInsuranceplanlist() {
		return insuranceplanlist;
	}

	public void clickInsuranceplanlist() {
		insuranceplanlist.click();
	}

	public WebElement getInsuranceplanitem() {
		return insuranceplanitem;
	}

	public void clickInsuranceplanitem() {
		insuranceplanitem.click();
	}

	public WebElement getReviewtext() {
		return reviewtext;
	}

	public void sendReviewtext(String reviewmsg) {
		try {
			if (reviewmsg.length() > 130)
				reviewtext.sendKeys(reviewmsg);
		} catch (Exception e) {
			log.info("Please enter review message 130 characters long ");
		}
	}

	public void clickonsubmit() {
		submitbtn.click();
	}

	public void verifyReviewPagedisplayed() {
		try {
			insuranceplanlist.isDisplayed();
			log.info("Review Page is displayed successfully");
		} catch (Exception e) {
			log.info("Review Page is not displayed ");
		}
	}

	public void selectplan(String plan) {
		try {
			insuranceplanlist.click();
			insuranceplanitem.isDisplayed();
			insuranceplanitem.click();
			log.info("health insurance plan selected");
		} catch (Exception e) {
			log.info("Error while selecting health insurance plan ");
		}

	}
}
