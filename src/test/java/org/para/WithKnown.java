package org.para;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class WithKnown implements IRetryAnalyzer{
     int mincount=0,maxcount =5;
	public boolean retry(ITestResult arg0) {
		if(mincount<maxcount) {
			mincount++;
			return true;
		}
		return false;
	}

	
}
