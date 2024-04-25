package com.Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.TestBase.BaseClass;
import com.aventstack.extentreports.Status;
import com.test.GoogleSearchButtonTest;
import com.Utilities.DriverUtils;

public class MyListeners extends BaseClass implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase Name " + result.getName() + "is Started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase Name " + result.getName() + "is Passed");
	}

	public void onTestFailure(ITestResult result) {
//		test.log(Status.FAIL, "Testcase failed with name: " + result.getName());
		String path = DriverUtils.captureScreenshot(result.getName());
//		test.addScreenCaptureFromPath(path);
		System.out.println("TestCase Name " + result.getName() + "is Failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase Name " + result.getName() + "is Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		System.out.println("TestCases Ready To Executed");
	}

	public void onFinish(ITestContext context) {
		System.out.println("TestCases Execution Completed");
	}

}