package com.two;

abstract class Vehicle {
	String fuelType;
	int wheels;
	double maxSpeed;
	
	Vehicle(String fuelType,int wheels,double maxSpeed){
		this.fuelType=fuelType;
		this.wheels=wheels;
		this.maxSpeed=maxSpeed;
	}
	abstract double calculateTravelCost(double distance);
	
	public void displayInfo() {
		System.out.println("Fuel Type: "+ fuelType);
		System.out.println("Number of Wheels: "+wheels);
		System.out.println("Maximum Speed: "+maxSpeed+" km/h");
	}
}
