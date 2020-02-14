package com.ex.beans;

public class Android implements Phone {
	private String phone;
	private String config="8 GB RAM";
public Android(String phone) {
	this.phone=phone;
	//this.config=config;
}
	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}

	@Override
	public String getConfig() {
		// TODO Auto-generated method stub
		return config;
	}

}
