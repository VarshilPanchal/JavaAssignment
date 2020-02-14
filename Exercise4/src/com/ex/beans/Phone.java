package com.ex.beans;

public abstract class Phone {
	 abstract String getPhone();
	 abstract String getConfiguration();
	 public String toString(){
	        return "Phone= "+this.getPhone()+", Config="+this.getConfiguration();
	    }

}
