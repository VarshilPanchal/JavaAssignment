package com.ex.beans;

public class Iphone extends Phone {
	
	private String phone;
	private String configuration;
	
	public Iphone(String phone, String configuration) {
		this.phone = phone;
		this.configuration = configuration;
	}
	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
//		System.out.println("IOS ");
		return this.phone;
		
	}

	@Override
	public String getConfiguration() {
		// TODO Auto-generated method stub
//		System.out.println("IOS cofiguration  ");
		return this.configuration;
	}

}
