package com.ex.beans;

public class Android extends Phone {

	private String phone;
	private String configuration;

	public Android(String phone, String configuration) {
		this.phone = phone;
		this.configuration = configuration;
	}
	@Override
	public String  getPhone() {
		// TODO Auto-generated method stub
		return this.phone ;
	}

	@Override
	public String getConfiguration() {
		// TODO Auto-generated method stub
		return this.configuration ;
	}

}
