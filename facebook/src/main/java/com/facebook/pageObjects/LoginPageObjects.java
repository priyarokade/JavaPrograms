package com.facebook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author priya LoginPage Objects definations
 */
public class LoginPageObjects {

	WebDriver driver;

	@FindBy(xpath = "//div[@id='loginform']//button[@id='loginbutton']")
	WebElement loginbutton;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifylogin() {
		if (loginbutton.isDisplayed())
			System.out.println("Something went wrong while login with your current username and pass");

	}
}
