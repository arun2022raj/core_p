package com.dp.afdp;

public class IceCream implements Food{
	String type;
	IceCream(String s){
		this.type=s;
	}
	

	@Override
	public void making() {
		// TODO Auto-generated method stub
		System.out.println(this.type+" IceCream is making");	
	}
	@Override
	public void serving() {
		// TODO Auto-generated method stub
		System.out.println(this.type+" IceCream is serving");
	}

}
