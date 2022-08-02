package org.para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.baseclass.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Q1 extends BaseClass{

	//@Parameters({"uname","password"})
	
	@Test(dataProvider="account",dataProviderClass=Q2.class)
	
	private void m1(String uname,String pass) {
		browserLaunch("chrome");
	    urlLaunch("https://www.facebook.com/");
	    WebElement txtuname = driver.findElement(By.id("email"));
	    sendKeys(txtuname,uname);
	    WebElement txtpass = driver.findElement(By.id("pass"));
	    sendKeys(txtpass, pass);
	}
}
