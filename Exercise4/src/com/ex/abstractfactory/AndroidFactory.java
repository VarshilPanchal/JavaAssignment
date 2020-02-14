package com.ex.abstractfactory;

import com.ex.beans.Android;
import com.ex.beans.Phone;

public class AndroidFactory implements PhoneAbstractFactory {
	
	
	private String phone;
	private String configuration;
	
	public AndroidFactory(String phone, String configuration) {
		this.phone = phone;
		this.configuration = configuration;
	}
	public Phone createPhones() {
		
		return new Android(phone,configuration);
	}
	}

