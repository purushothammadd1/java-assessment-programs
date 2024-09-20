package com.one;

public class Triangle implements Shape{
	private double sideA,sideB,sideC;
	
	Triangle(double sideA,double sideB,double sideC){
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double s=(sideA+sideB+sideC)/2;
		return Math.sqrt(s * (s-sideA)*(s-sideB)*(s-sideC));
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return sideA+sideB+sideC;
	}

}
