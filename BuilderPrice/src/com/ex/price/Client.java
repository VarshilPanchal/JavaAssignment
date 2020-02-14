package com.ex.price;


public class Client {

	

	public static void main(String [] args) {
		
		
		Laptop laptop = new LaptopBuilder().setLaptopBrand("mac").setHdd(2).setRam(16).getPrice();
		
		System.out.println(laptop);
//		Laptop lapy1=new LaptopBuilder().getPrice();
//		System.out.println(lapy1);
		//lapy.setLaptopBrand();
	}
}
