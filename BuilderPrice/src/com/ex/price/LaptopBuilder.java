package com.ex.price;

public class LaptopBuilder {
	private String laptopBrand;
	private int ram;
	private int hdd;
	public int price;

	public LaptopBuilder setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
		return this;
	}

	public LaptopBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public LaptopBuilder setHdd(int hdd) {
		this.hdd = hdd;
		return this;
	}
	public LaptopBuilder setPrice(int price) {
		this.price=price;
		return this;
	}
	
public Laptop getPrice() {

		
		switch(laptopBrand) {
		
		case "hp": price= 30000;
			//System.out.println("price is :: "+price);
			LaptopBuilder hp=new LaptopBuilder();
			hp.setPrice(price);
			break;
		case "dell": price= 40000;
			//System.out.println("price is :: "+price);
			LaptopBuilder dell=new LaptopBuilder();
			dell.setPrice(price);
			break;	
		case "alienware": price= 1000000;
			//System.out.println("price is :: "+price);
			LaptopBuilder alienwre=new LaptopBuilder();
			alienwre.setPrice(price);
			break;
				
		case "mac": price=150000;
			//System.out.println("price is :: "+price);
			LaptopBuilder mac=new LaptopBuilder();
			mac.setPrice(price);
			break;
				
		}
		return new Laptop(laptopBrand, ram, hdd,price);
	}


}
