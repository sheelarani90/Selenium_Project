package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	 public Login_Page(WebDriver driver2) {
		 
		 this.driver=driver2;
		 PageFactory.initElements(driver, this);
	}
	public WebDriver driver;
	
		@FindBy(id="email")
		private WebElement email;
	
	    
		@FindBy(id="passwd")
		private WebElement pwd;
		
		@FindBy(xpath="//i[@class='icon-lock left']")
		private WebElement signin1;
	
		public WebElement getEmail() {
			return email;
		}

		public WebElement getPwd() {
			return pwd;
		}

		public WebElement getSignin1() {
			return signin1;
		}
	
	
	
	
	
	
	
}
