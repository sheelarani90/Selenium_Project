package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Summary {

	public WebDriver driver;
	
	public Order_Summary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getConfirm() {
		return confirm;
	}
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement confirm;
	
	
	
	
	
	
	
	
}
