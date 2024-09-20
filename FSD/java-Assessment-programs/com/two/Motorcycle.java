package com.two;

public class Motorcycle extends Vehicle{
	boolean hasSidecar;

	Motorcycle(String fuelType, int wheels, double maxSpeed,boolean hasSidecar) {
		super(fuelType, wheels, maxSpeed);
		this.hasSidecar=hasSidecar;
	}

	@Override
	double calculateTravelCost(double distance) {
		double fuelEfficiency =30.0;
		double fuelCostPerLiter=5.0;
		return (distance/fuelEfficiency)*fuelCostPerLiter;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Has Sidecar: "+(hasSidecar ? "Yes" : "No"));
	}

}
