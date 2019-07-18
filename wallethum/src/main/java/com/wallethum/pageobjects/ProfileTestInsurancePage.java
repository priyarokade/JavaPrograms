package com.wallethum.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethum.helper.JavaScriptHelper;
import com.wallethum.helper.LoggerHelper;

/*
 * ProfileTestInsurance pageobjects initialization
 */
public class ProfileTestInsurancePage {

	WebDriver driver;
	JavaScriptHelper javaScriptHelper = new JavaScriptHelper(driver);

	Logger log = LoggerHelper.getLogger(ProfileTestInsurancePage.class);
	@FindBy(xpath = "//h1[@class='profile-name' and contains(text(),'Test Insurance Company')]")
	WebElement testinsuranceheading;

	@FindBy(xpath = "//*[@class='md-write-a-review']//review-star[@class='rvs-svg']/div[@class='rating-box-wrapper']")
	WebElement reviewstarsnav;

	@FindBy(xpath = "//review-star[@class='rvs-svg']/div[@class='rating-box-wrapper']/*[@class='rvs-star-svg']")
	WebElement reviewstars;

	String reviewstarstring = "//review-star[@class='rvs-svg']/div[@class='rating-box-wrapper']/*[@class='rvs-star-svg'][";

	String endstring = "]";

	@FindBy(xpath = "//h3[contains(text(),'Your Rating')]")
	WebElement ratingheading;

	@FindBy(xpath = "//div[@class='right-content']/button[contains(text(),'Write a Review')]")
	WebElement writereviewbtn;

	public ProfileTestInsurancePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getwritereviewbtn() {
		return writereviewbtn;
	}

	public WebElement gettestinsuranceheading() {
		return testinsuranceheading;
	}

	public void verifyprofileTestInsurancePage() {
		try {
			testinsuranceheading.isDisplayed();
			log.info("User is successfully navigated to profile insurance page ");
		} catch (Exception e) {
			log.info("Error while navigating to profile insurance page ");
		}
	}

	public void movetoreviewstar() {
		try {
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			exe.executeScript("arguments[0].scrollIntoView()", ratingheading);
			log.info("Rating heading  is displayed ");
			Thread.sleep(100);
			Actions action = new Actions(driver);
			action.keyDown(Keys.CONTROL);
			int i = 1;
			while (i < 5) {
				System.out.println("driver.findElement(By.xpath(" + reviewstarstring + i + endstring + ")");
				WebElement ratingstar = driver.findElement(By.xpath(reviewstarstring + i + endstring));
				action.moveToElement(ratingstar);
				action.pause(60);
				i++;
			}
			if (i == 5) {
				System.out.println("driver.findElement(By.xpath(" + reviewstarstring + i + endstring + ")");
				WebElement ratingstar = driver.findElement(By.xpath(reviewstarstring + i + endstring));
				action.moveToElement(ratingstar);
				action.moveToElement(ratingstar).click().keyUp(Keys.CONTROL).build().perform();
			}
		} catch (Exception e) {
			log.info("Error while writing review ");

		}

	}
}
