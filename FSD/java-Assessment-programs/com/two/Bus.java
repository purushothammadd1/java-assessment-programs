package com.two;

public class Bus extends Vehicle{
	int passengerCapacity;

	Bus(String fuelType, int wheels, double maxSpeed, int passengerCapacity) {
		super(fuelType, wheels, maxSpeed);
		this.passengerCapacity=passengerCapacity;
	}

	@Override
	double calculateTravelCost(double distance) {
		double fuelEfficiency=5.0;
		double fuelCostPerLiter=5.0;
		return (distance/fuelEfficiency)*fuelCostPerLiter;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Passenger Capacity: "+ passengerCapacity);
	}
}
