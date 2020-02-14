package com.ex.price;

public class Laptop {
	private String laptopBrand;
	private int ram;
	private int hdd;
	public int price;
	
	public Laptop(String laptopBrand, int ram, int hdd,int price) {
		super();
		this.laptopBrand = laptopBrand;
		this.ram = ram;
		this.hdd = hdd;
		this.price=price;
	}
	
	
	@Override
	public String toString() {
		return "Laptop [laptopBrand=" + laptopBrand + ", ram=" + ram + " GB , hdd=" + hdd + " TB , price="+price+"]";
	}

//	public void getPrice() {
//		
//		//return "price["+price+"]";
//	}
	

}
