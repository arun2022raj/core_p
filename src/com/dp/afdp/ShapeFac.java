package com.dp.afdp;

public class ShapeFac extends AdapterFac{
	public Shape shapefac(String s) {
		if(s==null) {
			return null;
		}
		else if(s.trim().equalsIgnoreCase("circle")) {
			return  new Circle();
		}
		else if(s.trim().equalsIgnoreCase("triangle")) {
			return  new Triangle();
		}
		else if(s.trim().equalsIgnoreCase("rectangle")) {
			return  new Rectangle();
		}
		else {
			return null;
		}
	}

}
