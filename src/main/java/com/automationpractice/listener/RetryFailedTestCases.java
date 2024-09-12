package com.automationpractice.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {

	private int retryCount = 0;
	// If there are any failed test cases, then it runs 2 times
	private int maxRetryCount = 1;
	
	@Override
	public boolean retry(ITestResult arg0) {
		if(retryCount < maxRetryCount) {
			System.out.println("empty");
		}
		return false;
	}
	
	public void mainteast()
	{
		int a = 10;
		int b = 5;
		System.out.println(a+b);
	}
	public void sum() {
		int a=1;
		int b=2;
		int c=3;
		System.out.println(a+b+2);
		}

}
