package com.Maven_Project;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
//browser launch
 public static  WebDriver browserLaunch(String name) {

	if(name.equalsIgnoreCase("chrome")) {
		 
        System.setProperty("webdriver.chrome.driver","C:\\Users\\308310\\SeleniumConcepts\\SeleniumConcepts\\Driver\\chromedriver.exe");
	driver =new ChromeDriver();
	
	driver.manage().window().maximize(); 
	 }
	 
else if (name.equalsIgnoreCase("firefox")) {
	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		 
		 driver =new ChromeDriver();
			
			driver.manage().window().maximize(); 
	 
}
	 return driver; 
	 	 
 }	 

 //WAIT
 public static void waitmethod(int a) {
	 driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);	 
}
 
 
//get
 public static  void launchurl(String url) {
  driver.get(url);
	 
}
 
//close
 public static void closeBrowser() {

	 driver.close();
}
 
//quit
public static void quitBrowser() {

 driver.quit();
}

//sendkeys
public static void inputvalues(WebElement element,String input) {

	element.sendKeys(input);
	
}

//click
public static void clickMethod(WebElement element ) {
   
	element.click();
	
}
//action
public static void actionsmethod(WebElement element) {

	 Actions ac=new Actions(driver);

     ac.moveToElement(element).build().perform();
	
}
//frames
public static void framemethod(WebElement element) {
	
       driver.switchTo().frame(element);
	
}

//dropdown
public static void selectmethod(WebElement element,String input) {

	 Select s=new Select(element);

     s.selectByValue(input);
	
}

public static void defaultContent() {
	driver.switchTo().defaultContent();
}
//screenshot
public static  void screenshotmethod(String name) throws IOException {

	TakesScreenshot ts=(TakesScreenshot) driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File(name);
	FileUtils.copyFile(Source, destination);
}

//Navigate to
	
	public static  void navigateTo(String input) {

		driver.navigate().to(input);
	}

//Navigate back
	
	public static  void navigateBack() {

			driver.navigate().back();
		}
		
//Navigate forward
		
	public static  void navigateForward(){

				driver.navigate().forward();
			}		
//Navigate refresh
	public static void navigateRefresh() {
                driver.navigate().refresh();
	}
	
//Alert

	public static  void alert_Accept() {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public static  void alert_Dismiss() {

		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public static  void alert_Sendkeys(String input){

		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
	}
//get all selected options
	
	public static void getallselectedoptions(WebElement element) {

		 Select s=new Select(element);
		 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	    for (WebElement test : allSelectedOptions) {
			test.getText();
		}
	     
	}
	
//get First selected options	
	
	public static void getFirstselectedoptions(WebElement element) {

		 Select s=new Select(element);
		 WebElement firstSelectedOption = s.getFirstSelectedOption();
		 firstSelectedOption.getText();
	}
	
//Robot
	public static void robot() {
     Robot r =new Robot();
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
	}
//window handles
	
	public static  void windowHandles() {
               Set<String> multiple = driver.getWindowHandles();
		          for (String id : multiple) {
					driver.switchTo().window(id).getTitle();
				} 
	}		          
//isEnabled
		  public static  void isenabled(WebElement element) {
           element.isEnabled();
		} 
//isDisplayed
		  public void isDisplayed(WebElement element) {
           element.isDisplayed();
		}
		  
//isSelected
		  public static  void isSelected(WebElement element) {
			   element.isSelected();

		}
		  
		  
		
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


