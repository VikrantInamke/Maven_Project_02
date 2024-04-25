package com.test;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Listeners.MyListeners;
import com.TestBase.BaseClass;
import com.pages.JbkLoginPage;


@Listeners(MyListeners.class)
public class JbkLoginTest extends BaseClass{
	
	public JbkLoginPage lp ;
	public static Logger log  = Logger.getLogger(JbkLoginTest.class);
	
	@BeforeMethod
	public void openBrowser() throws Exception{
		log.info("Open Browser------------");
		initialization();
		lp = new JbkLoginPage(driver);
	}
	@Test
	public void tc_001VerifyTitleOfDashBoard(){
		log.info("TestCase Start------------");
		lp.correctData();
//		System.out.println(System.getProperty("user.dir"));
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test
	public void tc_002VerifyTitleOfDashBoard(){
		log.info("TestCase Start------------");
		lp.correctData();
		Assert.assertEquals(driver.getTitle(), "TheKiranAcademy | Dashboard");
	}

}
 