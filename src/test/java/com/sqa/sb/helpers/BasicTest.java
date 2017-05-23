package com.sqa.sb.helpers;

import java.util.concurrent.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.testng.annotations.*;

public abstract class BasicTest extends Core {

	public BasicTest(String baseUrl) {
		super(baseUrl, null);
	}

	@BeforeClass(enabled = false)
	public void setUpChrome() throws Exception {
		// Set property for specifc drivers
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// Initialize the specific driver to run test
		setDriver(new ChromeDriver());
		// Set baseURL for the website you will be testing
		// setBaseUrl("https://www.ebay.com/");
		// Set any properties for the driver, such as setting an implicit wait
		// for 30 seconds
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDriver().get(getBaseUrl());
	}

	@BeforeClass(enabled = true)
	public void setUpFirefox() throws Exception {
		setDriver(new FirefoxDriver());
		// this.baseUrl = "https://www.ebay.com/";
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDriver().get(getBaseUrl());
	}

	@BeforeClass(enabled = false)
	public void setUpInternetExplorer() throws Exception {
		System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
		setDriver(new InternetExplorerDriver());
		// this.baseUrl = "https://www.ebay.com/";
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDriver().get(getBaseUrl());
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		getDriver().quit();
	}
	// @Test
	// public void testEbay() throws Exception {
	// getDriver().get(getBaseUrl() + "/");
	// // find the element for signing in and click it.
	// WebElement loginFormButton = getDriver().findElement(By.linkText("Sign
	// in"));
	// loginFormButton.click();
	// WebElement usernameField =
	// getDriver().findElement(By.xpath("//div[@id='pri_signin']/div[4]/span[2]/input"));
	// WebElement passwordField =
	// getDriver().findElement(By.xpath("//div[@id='pri_signin']/div[5]/span[2]/input"));
	// WebElement signInButton = getDriver().findElement(By.id("sgnBt"));
	// usernameField.clear();
	// usernameField.sendKeys("sowmya.11oct@gmail.com");
	// passwordField.clear();
	// passwordField.sendKeys("Edcrfv@2");
	// signInButton.click();
	// //
	// getDriver().findElement(By.xpath("//div[@id='pri_signin']/div[4]/span[2]/input")).clear();
	// //
	// getDriver().findElement(By.xpath("//div[@id='pri_signin']/div[4]/span[2]/input")).sendKeys("sowmya.11oct@gmail.com");
	// //
	// getDriver().findElement(By.xpath("//div[@id='pri_signin']/div[5]/span[2]/input")).clear();
	// //
	// getDriver().findElement(By.xpath("//div[@id='pri_signin']/div[5]/span[2]/input")).sendKeys("Edcrfv@2");
	// //
	// // this.driver.findElement(By.id("Edcrfv@2")).click();
	// WebElement searchField = getDriver().findElement(By.id("gh-ac"));
	// searchField.click();
	// searchField.clear();
	// searchField.sendKeys("mountain bike");
	// searchField.submit();
	// // getDriver().findElement(By.id("gh-ac")).click();
	// getDriver().findElement(By.cssSelector("img.b-img")).click();
	// getDriver().findElement(By.cssSelector("div.b-info__title.")).click();
	// getDriver().findElement(By.cssSelector("span.vi-atw-txt")).click();
	// getDriver().findElement(By.cssSelector("#w1-5-_lmsg > a")).click();
	// getDriver().findElement(By.cssSelector("span.label")).click();
	// getDriver().findElement(By.xpath("//div[@id='watchlist']/div[2]/div[3]/div/div/button")).click();
	// getDriver().findElement(By.cssSelector("b.gh-eb-arw.gh-sprRetina")).click();
	// getDriver().findElement(By.linkText("Sign out")).click();
	// }
}
