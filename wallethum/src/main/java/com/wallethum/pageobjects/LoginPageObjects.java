package com.wallethum.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethum.helper.ConfigReader;
import com.wallethum.helper.LoggerHelper;

/*
 * LoginPageObjects initialization
 */
public class LoginPageObjects {

	Logger log = LoggerHelper.getLogger(LoginPageObjects.class);

	WebDriver driver;

	@FindBy(xpath = "//input[@type='text' and @name='em']")
	WebElement loginemail;

	@FindBy(xpath = "//input[@type='password' and @name='pw1']")
	WebElement loginpwd;

	@FindBy(xpath = "//div[@class='btns']/button[@type='button']//span[contains(text(),'Login') ]")
	WebElement loginbtn;

	@FindBy(xpath = "//div[@class='top']/div[@class='logo']")
	WebElement homepageicon;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginemail() {
		return loginemail;
	}

	public void setLoginemail(String email) {
		loginemail.clear();
		loginemail.sendKeys(email);
	}

	public WebElement getLoginpwd() {
		return loginpwd;
	}

	public void setLoginpwd(String pwd) {
		loginpwd.clear();
		loginpwd.sendKeys(pwd);
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void clickonLoginbtn() {
		loginbtn.click();
	}

	public void ValidLogin() {
		try {

			loginemail.isDisplayed();
			setLoginemail(ConfigReader.getProperty("username1"));
			setLoginpwd(ConfigReader.getProperty("password1"));
			clickonLoginbtn();

		} catch (Exception e) {
			log.info("Error while login to url  ");
		}
	}

	public WebElement getHomePageicon() {
		return homepageicon;
	}

	public void ClickonHomePageicon() {
		homepageicon.click();
	}
}
