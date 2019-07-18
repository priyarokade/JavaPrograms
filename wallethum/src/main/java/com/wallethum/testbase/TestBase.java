package com.wallethum.testbase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.wallethum.config.Browsers;
import com.wallethum.helper.ConfigReader;
import com.wallethum.helper.ResourceHelper;

/*TestBase to initialize webdriver
 * 
 */
public class TestBase {

	public static WebDriver driver;

	public WebDriver selectbrowser(String browser) throws IOException {

		if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
			System.setProperty("webdriver.chrome.driver", ResourceHelper.getresourcepath("/drivers/chromedriver.exe"));
			driver = new ChromeDriver();
			driver.get(ConfigReader.getProperty("url"));
		} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
			System.setProperty("webdriver.chrome.driver", ResourceHelper.getresourcepath("/drivers/firefox.exe"));
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
