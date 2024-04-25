package com.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer{

	int count = 1 ;
	int maxLimit = 2 ;
	public boolean retry(ITestResult result) {
		if(count <= maxLimit){
			count++;
			return true ;
		}
		return false;
	}

}
