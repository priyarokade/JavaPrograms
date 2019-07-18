package com.facebook.testbase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.enums.Browsers;

/*
 * Testbase to initialise browser
 */
public class TestBase {
	public static WebDriver driver;

	String projectpath = System.getProperty("user.dir");

	public WebDriver selectbrowser(String browser) throws IOException {

		if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
			System.setProperty("webdriver.chrome.driver", projectpath + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
			System.setProperty("webdriver.chrome.driver", projectpath + "\\drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
