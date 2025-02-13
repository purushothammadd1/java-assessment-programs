package com.two;

public class Car extends Vehicle{
	int seatingCapacity;

	Car(String fuelType, int wheels, double maxSpeed, int seatingCapacity) {
		super(fuelType, wheels, maxSpeed);
		this.seatingCapacity=seatingCapacity;
	}

	@Override
	double calculateTravelCost(double distance) {
		double fuelEfficiency = 15.0;
		double fuelCostPerLiter=5.0;
		return (distance / fuelEfficiency)*fuelCostPerLiter;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Seating Capacity: "+ seatingCapacity);
	}

}
