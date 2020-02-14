package com.ex.abstractfactory;

import com.ex.beans.Phone;

public class PhoneFactory {
	public static Phone createPhoneModel(PhoneAbstractFactory phone) {
		return phone.createPhones();
	}
}
