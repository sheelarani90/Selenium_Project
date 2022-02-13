package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
    public static Properties p;
    
    public Configuration() throws Throwable
    {
    	File f=new File("D:\\Automation Related\\Projects\\Maven_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
	    p=new Properties();
		p.load(fis);
    }
    
	
	public String getUrl(){

		String url = p.getProperty("url");
		return url;
    }


	public String getEmail(){
		
		String email = p.getProperty("email");
		return email;
		
	}
     public String getpwd() throws IOException {
		
		String pwd = p.getProperty("password");
		return pwd;
	
     }
	
}	