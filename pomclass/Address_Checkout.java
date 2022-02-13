package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Checkout {

public WebDriver driver;
	
	@FindBy(xpath="//button[@name='processAddress']")
	 private WebElement checkout3;

	
	public Address_Checkout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getCheckout3() {
		return checkout3;
	}


	
	
	
	
	
	
	
	
	
	
}
