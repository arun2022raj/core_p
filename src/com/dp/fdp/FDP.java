package com.dp.fdp;

public abstract class FDP {
	public static Shape fdp(String type) {
		if(type=="null")
			return null;
		else if(type.strip().equalsIgnoreCase("Circle"))
			return new Circle();
		else if(type.strip().equalsIgnoreCase("rectangle"))
			return new Rectangle();
		else if(type.strip().equalsIgnoreCase("triangle"))
			return new Triangle();
		else
			return null;
	}

}
