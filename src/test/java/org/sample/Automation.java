package org.sample;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automation extends Test123 {
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("chrome");
		urlLaunch("https://testautomationpractice.blogspot.com/");
		//maximize();
		implicityWait(20);
	}

	@BeforeMethod
	private void beforeMethod() {

		
	}
	
	@AfterMethod
	private void afterMethod() {

		
	}
	
	@AfterClass
	private void afterClass() {

		
	}
	
	@Test
	private void test() throws AWTException, IOException, InterruptedException {
		
		Test123 t=new Test123();
		t.page1();
		Assert.assertTrue(false);
		t.autoTest();
		
	}
	
}
