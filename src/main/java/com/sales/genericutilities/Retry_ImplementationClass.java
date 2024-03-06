package com.sales.genericutilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_ImplementationClass implements IRetryAnalyzer{
	int count=0;
	int retrycount=3;
	@Override
	public boolean retry(ITestResult result) {
		if (count<retrycount) {
			count++;
			return true;
		}
		return false;
	}

}
