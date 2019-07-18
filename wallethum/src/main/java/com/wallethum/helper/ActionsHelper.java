package com.wallethum.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*
 * Helper class for testing Mousehover actions
 */
public class ActionsHelper {

	WebDriver driver;
	Actions action;

	public ActionsHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void movetoelement(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element);
	}

}
