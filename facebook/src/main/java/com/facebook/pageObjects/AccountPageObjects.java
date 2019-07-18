package com.facebook.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author priya AccountPageObjects definations
 */

public class AccountPageObjects {

	WebDriver driver;

	Logger log = Logger.getLogger(AccountPageObjects.class);
	@FindBy(xpath = "//a[@title='Profile']")
	WebElement profilelink;

	@FindBy(id = "logoutMenu")
	WebElement logoutmenu;

	@FindBy(xpath = "//*[contains(text(),'Log Out')]")
	WebElement logout;

	public AccountPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getprofilelink() {
		return profilelink;
	}

	public void verifysuccesslogin() {
		try {
			profilelink.isDisplayed();
			System.out.println("User is logged in successfully " + profilelink.getText());
			System.out.println("Hello World");
			log.info("User is logged in successfully");
		} catch (Exception e) {
			System.out.println("Error while logged in to the application");
			log.info("User logged in failed");
		}
	}

	public void clickonlogout() {
		logout.click();
	}

	public void verifyprofilelink() {
		if (!profilelink.isDisplayed()) {
			System.out.println("Error while logged in to the application, username and password is invalid");
			log.info("User logged in failed");
		}
	}

}
