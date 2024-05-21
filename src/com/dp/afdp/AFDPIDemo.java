package com.dp.afdp;

public class AFDPIDemo {
	public static void main(String[] args) {
		AFDPI s=FacFac.facfood();
		Food j=s.foodfac("juice","orange");
		j.making();
		j.serving();
		Food i=s.foodfac("icecream", "chocolate");
		i.making();
		i.serving();
		AFDPI sh=FacFac.facshape();
		Shape c=sh.shapefac("circle");
		c.draw();
		c.paint();
		Shape t=sh.shapefac("triangle");
		t.draw();
		t.paint();
		Shape r=sh.shapefac("rectangle");
		r.draw();
		r.paint();	
	}
}
