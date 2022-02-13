package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Address_Checkout;
import com.pomclass.Home_Page;
import com.pomclass.Login_Page;
import com.pomclass.Order_Summary;
import com.pomclass.Payment_Selection;
import com.pomclass.Proceed_Checkout;
import com.pomclass.Quick_View;
import com.pomclass.Select_Dress;
import com.pomclass.Shipping_Checkout;
import com.pomclass.Summary_Checkout;
import com.pomclass.Women_Dress;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Home_Page h;
	private Login_Page l;
	private  Women_Dress w;
	private  Select_Dress s;
	private  Quick_View qv;
	private Proceed_Checkout pc;
	private  Summary_Checkout sc;
	private Address_Checkout ac;
	private Shipping_Checkout sc1;
	private Payment_Selection ps;
	private  Order_Summary os;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		
	}
	
	public Home_Page getInstancehome()//making Home_Page class as  public 
	{
		if(h==null) {
			h=new Home_Page(driver);
		}
		return h;
	}
	
	public Login_Page getInstanceLogin() {
		
		if (l==null) {
			l=new Login_Page(driver);
		}
		return l;
	}
	
	public Women_Dress getInstanceWomen() {
		if (w==null) {
			w=new  Women_Dress(driver);
			
		}
		return w;
		
	}
	
	public  Select_Dress getInstanceSelect() {
		if(s==null) {
			s=new Select_Dress(driver);
		}
		return s;
	}
	
	public  Quick_View getInstanceQuick() {
		if(qv==null) {
			qv=new  Quick_View (driver);
		}
		return qv;
	}
	
	public  Proceed_Checkout getInstanceProceed() {
		if(pc==null)
		{
			pc=new Proceed_Checkout(driver);
		}
		return pc;
	}
	
	public   Summary_Checkout getInstanceSummary() {
		if(sc==null)
		{
			sc=new Summary_Checkout(driver);
		}
		return sc;
	}
	
	public   Address_Checkout getInstanceAddress() {
		if (ac==null)
		{
			ac=new Address_Checkout(driver);
		}
		return ac;
	}
	
	public Shipping_Checkout getInstanceShipping() {
		if(sc1==null)
		{
			sc1=new Shipping_Checkout(driver);
		
		}
		return sc1;
	}
	
	public Payment_Selection getInstancePayment() {
		if(ps==null)
		{
			ps=new Payment_Selection(driver);
		}
		return ps;
	}
	
	public  Order_Summary getInstanceOrder() {
		if(os==null)
		{
			os=new  Order_Summary(driver);
		}
		return os;
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
