package com.wallethum.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethum.helper.LoggerHelper;

/*
 * HomePageObjects intialization
 */
public class HomePageObjects {

	WebDriver driver;

	Logger log = LoggerHelper.getLogger(HomePageObjects.class);

	@FindBy(xpath = "//div[@id='join-light']//a[contains(text(),'Login')]")
	WebElement loginlinknew;

	@FindBy(xpath = "//div[@class='login-join']/a[@class='login']")
	WebElement loginlink;

	@FindBy(xpath = "//div[@class='top']/div[@class='logo']/a/span[2]")
	WebElement homepageicon;

	/*
	 * @FindBy(xpath = "//a[@class='user' and @data-menu='m-user']") WebElement
	 * userlink;
	 */

	@FindBy(xpath = "//div[@class='brgm-user-info']")
	WebElement userlink;

	@FindBy(xpath = "//div[@class='brgm-user-info']//div[@class='brgm-user-bts']/a[contains(text(),'Profile')]")
	WebElement profilelink;

	/*
	 * @FindBy(xpath = "//nav[@id='m-user']/ul/li[1]/a") WebElement profilelink;
	 */
	@FindBy(xpath = "//nav[@id='m-user']/ul/li[3]/a")
	WebElement logoutlink;

	@FindBy(xpath = "//div[@id='join-address']//div[@class='ac']")
	WebElement addresstextbar;

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickonLoginLink() {
		loginlinknew.click();
	}

	public WebElement gethomepageicon() {
		return homepageicon;
	}

	public void clickonhomepageicon() {
		homepageicon.click();
	}

	public WebElement getUserlink() {
		return userlink;
	}

	public void ClickUserlink() {
		userlink.click();
	}

	public WebElement getProfilelink() {
		return profilelink;
	}

	public void clickProfilelink() {
		profilelink.click();
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public void clickLogoutlink() {
		logoutlink.click();
	}

	public void clickonprofile() {
		try {
			userlink.isDisplayed();
			Actions action = new Actions(driver);
			// action.keyDown(Keys.CONTROL);
			action.moveToElement(userlink);
			action.pause(10);
			action.moveToElement(profilelink).click().build().perform();
		} catch (Exception e) {
			log.info("Error while clicking on profile link");
		}
	}

	public void clickonlogout() {
		try {
			userlink.isDisplayed();
			Actions action = new Actions(driver);
			action.moveToElement(userlink).moveToElement(logoutlink).click().build().perform();
		} catch (Exception e) {
			log.info("Error while logging out ");
		}
	}

	public void clickloginifdisplayed() {
		try {
			loginlinknew.isDisplayed();
			ClickonLoginLink();
		} catch (Exception e) {
			log.info("Error while clicking on login link");
		}

	}

	public WebElement getAddressbar() {
		return addresstextbar;
	}

	/*
	 * public void verifyloginsuccess() throws InterruptedException { if
	 * (addresstextbar.isDisplayed()) { log.info("Login Successful");
	 * 
	 * } else { log.info("Login failed"); } }
	 */
}