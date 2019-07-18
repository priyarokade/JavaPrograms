package com.facebook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author priya HomepageObjects definations
 */

public class HomePageObject {

	WebDriver driver;

	@FindBy(id = "email")
	WebElement emailid;

	@FindBy(id = "pass")
	WebElement password;

	@FindBy(id = "loginbutton")
	WebElement loginbtn;

	public WebElement getEmailid() {
		return emailid;
	}

	public void setEmailid(String email) {
		emailid.sendKeys(email);

	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		password.sendKeys(pass);
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void ClickLoginbtn() {
		loginbtn.click();
	}

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void validlogintest(String email, String pass) {
		try {
			emailid.isDisplayed();
			setEmailid(email);
			setPassword(pass);
			ClickLoginbtn();

		} catch (Exception e) {
			System.out.println("Error while loggin to application");
		}
	}

}
