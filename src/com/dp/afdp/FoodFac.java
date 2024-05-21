package com.dp.afdp;

public class FoodFac extends AdapterFac{
	
	public Food foodfac(String s, String type) {
		
		if((s==null) && (type==null)) {
			return null;
		}
		else if(s.trim().equalsIgnoreCase("JUICE")) {
			return new Juices(type);
		}
		else if(s.trim().equalsIgnoreCase("IceCream")) {
			return new IceCream(type);
		}
		else {
			return null;
		}
	}
	
	
	

}
