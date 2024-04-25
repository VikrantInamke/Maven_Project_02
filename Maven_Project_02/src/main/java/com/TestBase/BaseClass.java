package com.TestBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Utilities.PropertyUtils;
import com.aventstack.extentreports.ExtentTest;

public class BaseClass {
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(BaseClass.class);
	public static ExtentTest test ;

	public void initialization() throws Exception {
		String browserName = PropertyUtils.readProperty("browser");

		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WebDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\JAVA\\WebDriver\\geckodriver.exe");
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(PropertyUtils.readProperty("url"));
		

	}
}
