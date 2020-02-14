package com.ex.abstractfactory;
import com.ex.beans.Iphone;
import com.ex.beans.Phone;

public class IphoneFactory implements PhoneAbstractFactory {
	

	private String phone;
	private String configuration;
	
	public IphoneFactory(String phone, String configuration) {
		this.phone = phone;
		this.configuration = configuration;
	}
	@Override
	public Phone createPhones() {
		
		return new Iphone(phone, configuration);
	}
}
