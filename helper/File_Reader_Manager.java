package com.helper;

public class File_Reader_Manager {
	
	//private constructor
	private File_Reader_Manager() {
		
	}
	//static method
	public static File_Reader_Manager getInstanceFRM(){
		File_Reader_Manager frm=new File_Reader_Manager();//object creation for File_Reader_Manager class 
				
		return frm;	
				
	}
    //non static method
   public Configuration getInstanceCR() throws Throwable {
	   
	   Configuration cr=new Configuration();//object creation for configuration class
	   
	   return cr;
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
