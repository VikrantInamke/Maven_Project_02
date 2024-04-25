package com.test;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Listeners.MyListeners;
import com.TestBase.BaseClass;
import com.pages.GoogleSearchButtonPage;

@Listeners(MyListeners.class)
public class GoogleSearchButtonTest extends BaseClass {

	GoogleSearchButtonPage gp;
	public static Logger log = Logger.getLogger(GoogleSearchButtonPage.class);

	@BeforeMethod
	public void openBrowser() throws Exception {
		log.info("Open Browser------------");
		initialization();
		gp = new GoogleSearchButtonPage(driver);
	}

	@Test(priority=1)
	public void tc_001VerifyTitle() {
		log.info("TestCase Start------------");
		gp.enterData();
		Assert.assertEquals(driver.getTitle(), "Selenium WebDriver - Google Search");
	}
	
	@Test(priority=2)
	public void tc_002VerifyTitle() {
		log.info("TestCase Start------------");
		gp.enterData();
		Assert.assertEquals(driver.getTitle(), "Selenium WebDriver | Google Search");
	}
}
