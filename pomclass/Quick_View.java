package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quick_View {

	public WebDriver driver;
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	public Quick_View(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
 	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement Quantity;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(id="add_to_cart")
	private WebElement addtocart;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
