package org.sample;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.baseclass.BaseClass;

public class Tables extends BaseClass {
	
	public Tables() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="RESULT_TextField-1")
	private WebElement fname;
	@FindBy(id="RESULT_TextField-2")
	private WebElement lname;
	@FindBy(id="RESULT_TextField-3")
	private WebElement phone;
	@FindBy(id="RESULT_TextField-4")
	private WebElement country;
	@FindBy(id="RESULT_TextField-5")
	private WebElement city;
	@FindBy(id="RESULT_TextField-6")
	private WebElement email;
	@FindBy(xpath="//label[text()='Male']")
	private WebElement gender;
	@FindBy(xpath="//label[text()='Sunday']")
	private WebElement days;
	@FindBy(xpath="//span[@style='left: 0%;']")
	private WebElement slider;
	@FindBy(xpath="//span[@style='left: 43%;']")
	private WebElement slidert;
	
	public WebElement getSlidert() {
		return slidert;
	}
	public WebElement getSlider() {
		return slider;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getDays() {
		return days;
	}
	
	public void page1() throws AWTException {
		
		driver.switchTo().frame("frame-one1434677811");
		sendKeys(getFname(), "david");
		sendKeys(getLname(), "john");
		sendKeys(getPhone(), "5676433549");
		sendKeys(getCountry(), "london");
		sendKeys(getCity(), "oxford");
		sendKeys(getEmail(), "david@email.com");
		click(getGender());
		click(getDays());
		driver.switchTo().defaultContent();
		//javascript("scrolldown", getSlider());
		click(getSlider());
		for(int i=0;i<90;i++) {
			keyBoard("right");
		}
		
	}
	
	
}
