package com.dp.fdp;

public class FDPdemo {
	public static void main(String[] args) {
		Shape c=FDP.fdp("circle");
		c.draw();
		c.paint();
		Shape r=FDP.fdp("rectangle");
		r.draw();
		r.paint();
		Shape t=FDP.fdp("triangle");
		t.draw();
		t.paint();
	}

}
