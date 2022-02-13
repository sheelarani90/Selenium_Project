package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Dress {

	public WebDriver driver;
	@FindBy(xpath="//a[text()='Casual Dresses']")
	private WebElement casualDress;
	
	public Select_Dress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCasualDress() {
		return casualDress;
	}

	public WebElement getPrintedDRess() {
		return printedDRess;
	}

	public WebElement getQuickview() {
		return Quickview;
	}

	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement printedDRess;
	
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement Quickview;
	
	
	
	
	
	
}
