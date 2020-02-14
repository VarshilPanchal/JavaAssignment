package com.os;
//import com.os.ProductFactory;



public class OperatingSystemFactory{
	public Os show(String str) {
		//String msg = "Enter the proper Os which you want ";
		if(str.equalsIgnoreCase("Android"))
			return new Android(); 
		else if(str.equalsIgnoreCase("IOS"))
			return new Ios();
		else if(str.equalsIgnoreCase("Blackberry")) 
			return new Blackberry();
		else 
			return new InvalidInput();
		
	}
}
