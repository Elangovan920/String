package org.excels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.baseclass.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pa2 extends BaseClass {
	//@Parameters({"uname","password"})
	@Test(dataProvider="login",dataProviderClass=Pa3.class)
	public void test11(String uname,String password,String caps) {
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");	
		WebElement wb1 = driver.findElement(By.id("email"));
		WebElement wb2 = driver.findElement(By.id("pass"));
		sendKeys(wb1, uname);
		sendKeys(wb2, password);
		System.out.println(caps);
		
	}
//	@Parameters({"uname","password"})
//	@Test
//	public void test12(String uname,String password) {
//		browserLaunch("chrome");
//		urlLaunch("https://adactinhotelapp.com/");	
//		WebElement wb1 = driver.findElement(By.id("username"));
//		WebElement wb2 = driver.findElement(By.id("password"));
//		sendKeys(wb1, uname);
//		sendKeys(wb2, password);

//			}
//	@Parameters({"uname","password"})
//	@Test
//	private void test13(String uname,String password) {
//		System.out.println("test13");
//		System.out.println(uname);
//		System.out.println(password);
//		System.out.println("====================");
//	}
	@Test
	private void test14() {
		System.out.println("test14");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void test15() {
		System.out.println("test15");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void test16() {
		System.out.println("test16");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void test17() {
		System.out.println("test17");
		System.out.println(Thread.currentThread().getId());
	}
}
