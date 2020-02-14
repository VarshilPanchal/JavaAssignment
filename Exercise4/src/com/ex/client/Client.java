package com.ex.client;

import java.util.Scanner;

import com.ex.abstractfactory.AndroidFactory;
import com.ex.abstractfactory.IphoneFactory;
import com.ex.abstractfactory.PhoneFactory;
import com.ex.beans.Phone;

public class Client {

	static String phoneType;
	public static void main(String[] args) {
		
		Scanner scannerObj = new  Scanner(System.in);
		System.out.println("Which phone you want:");
		phoneType=scannerObj.next();
//		if(phoneType.equalsIgnoreCase("iphone")) {
//		Phone iphone = PhoneFactory.createPhoneModel(new IphoneFactory("IPHONE","2 GB RAM"));
//		System.out.println(" ::cretind Iphone phone:: \n"+iphone);
//		}
//		else if (phoneType.equalsIgnoreCase("android"))
//		{Phone android = PhoneFactory.createPhoneModel(new AndroidFactory("android", "8 GB RAM"));
//		System.out.println("  ::cretind Android phone:: \n"+android);
//		}
//		else
//			return ;
		
		switch(phoneType)
		{
		case "Iphone" : Phone iphone = PhoneFactory.createPhoneModel(new IphoneFactory("IPHONE","2 GB RAM"));
						System.out.println("Iphone::"+iphone);
						break;
		case "Android" : Phone android = PhoneFactory.createPhoneModel(new AndroidFactory("android", "8 GB RAM"));
						System.out.println("Android::"+android);
						break;
		}	
		
	}
}