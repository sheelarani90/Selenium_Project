package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Checkout {
       
	public WebDriver driver;
	

	public Shipping_Checkout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getCheckout4() {
		return checkout4;
	}

	@FindBy(id="cgv")
	private  WebElement agree;
	
    @FindBy(xpath="//button[@name='processCarrier']")
    private WebElement checkout4;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
