package com.one;

public class Circle implements Shape{
	private double radi;
	
	Circle(double radius){
		this.radi=radius;
	}

	@Override
	public double calculateArea() {
		//Area of circle pi*r^2
		return Math.PI*radi*radi;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI;
	}
}
