package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Selection {

	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='bankwire']")
	 private WebElement payment;

	public Payment_Selection(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getPayment() {
		return payment;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
