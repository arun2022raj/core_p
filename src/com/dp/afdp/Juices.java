package com.dp.afdp;

public class Juices implements Food {
	String type;
	Juices(String s){
		this.type=s;
	}

	@Override
	public void making() {
		// TODO Auto-generated method stub
		System.out.println(this.type+" juice is making");

	}

	@Override
	public void serving() {
		// TODO Auto-generated method stub
		System.out.println(this.type+" juice is serving");

	}

}
