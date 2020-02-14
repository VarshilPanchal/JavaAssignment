package com.ex.factory;

import com.ex.beans.Iphone;
import com.ex.beans.Phone;

public class IphoneFactory implements AbstractFactory {

	private String phone;

	@Override
	public Phone createPhone() {
		// TODO Auto-generated method stub
		return new Iphone(phone);
	}

}
