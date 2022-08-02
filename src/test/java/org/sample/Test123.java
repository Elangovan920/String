package org.sample;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.baseclass.BaseClass;

public class Test123 extends Tables{
	public Test123() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Wikipedia1_wikipedia-search-input")
	private WebElement page1 ;
	@FindBy(xpath="//button[text()='Click Me']")
	private WebElement page3 ;
	@FindBy(xpath="//span[text()='Main page']")
	private WebElement page2 ;
	@FindBy(id="datepicker")
	private WebElement page4 ;
	@FindBy(id="speed")
	private WebElement page5 ;
	@FindBy(id="files")
	private WebElement page6 ;
	@FindBy(id="number")
	private WebElement page7 ;
	@FindBy(id="products")
	private WebElement page8 ;
	@FindBy(id="animals")
	private WebElement page9 ;
	@FindBy(xpath="//button[text()='Copy Text']")
	private WebElement page10 ;
	@FindBy(xpath="//p[contains(text(),'target')]")
	private WebElement page11;
	@FindBy(id="droppable")
	private WebElement page12 ;
	@FindBy(xpath="//img[@alt='the peaks of high tatras']")
	private WebElement page13 ;
	@FindBy(xpath="(//img[@height='100'])[2]")
	private WebElement page14 ;
	@FindBy(id="trash")
	private WebElement page15 ;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement page16 ;
	@FindBy(id="resizable")
	private WebElement page17 ;
	@FindBy(xpath="(//div[@style='z-index: 90;'])[3]")
	private WebElement page18 ;
	public WebElement getPage1() {
		return page1;
	}
	public WebElement getPage3() {
		return page3;
	}
	public WebElement getPage2() {
		return page2;
	}
	public WebElement getPage4() {
		return page4;
	}
	public WebElement getPage5() {
		return page5;
	}
	public WebElement getPage6() {
		return page6;
	}
	public WebElement getPage7() {
		return page7;
	}
	public WebElement getPage8() {
		return page8;
	}
	public WebElement getPage9() {
		return page9;
	}
	public WebElement getPage10() {
		return page10;
	}
	public WebElement getPage11() {
		return page11;
	}
	public WebElement getPage12() {
		return page12;
	}
	public WebElement getPage13() {
		return page13;
	}
	public WebElement getPage14() {
		return page14;
	}
	public WebElement getPage15() {
		return page15;
	}
	
	public WebElement getPage16() {
		return page16;
		
	}
	public WebElement getPage17() {
		return page17;
		
	}
	public WebElement getPage18() {
		return page18;
		
	}
	public void autoTest() throws IOException, InterruptedException, AWTException {
		sendKeys(getPage1(), "hello");
		click(getPage16());
		staticWait(1000);
		keyBoard("tab");
		keyBoard("tab");
		keyBoard("enter");
		staticWait(3000);
		Set<String> wh = driver.getWindowHandles();
		List l = new ArrayList(wh);
		Object o1 = l.get(1);
		String ss = o1.toString();
		Object o2 = l.get(0);
		String se = o2.toString();
		driver.switchTo().window(ss);
		click(getPage2());
		staticWait(3000);
		screenShot("C:\\Users\\Elangovan\\eclipse-workspace\\TestNgs\\src\\test\\resources\\autos.png");
		driver.switchTo().window(se);
		click(getPage3());
		Alert a1 = driver.switchTo().alert();
        a1.accept();
        sendKeys(getPage4(), "08/07/2022");
        keyBoard("enter");
        selectby(getPage5(),2);
        selectby(getPage6(),2);
        selectby(getPage7(),1);
        selectby(getPage8(),1);
        selectby(getPage9(),0);
        javascript("scrollup", getPage10());
       Actions a = new Actions(driver);
       a.doubleClick(getPage10());
       a.dragAndDrop(getPage11(), getPage12()).perform();
   //    340px x=442px
       javascript("scrolldown", getPage17());
    	//	a.dragAndDropBy(getPage18(), 442, 340).perform();  
	}
}
