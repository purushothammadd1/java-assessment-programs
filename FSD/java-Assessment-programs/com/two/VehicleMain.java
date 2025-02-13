package com.two;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle car=new Car("Petrol", 4, 180.0, 5);
		Vehicle bus=new Bus("Diesel", 6, 100.0, 54);
		Vehicle motorCycle=new Motorcycle("Petrol", 2, 120, false);
		
		double distance = 100.0;
		
		System.out.println("Car Information: ");
		car.displayInfo();
		System.out.println("Travel cost for "+ distance+" km: "+car.calculateTravelCost(distance)+" units");
		System.out.println("------------------------------------");
		
		System.out.println("Bus Information: ");
		bus.displayInfo();
		System.out.println("Travel cost for "+ distance+" km: "+bus.calculateTravelCost(distance)+" units");
		System.out.println("------------------------------------");

		System.out.println("MotorCycle Information: ");
		motorCycle.displayInfo();
		System.out.println("Travel cost for "+ distance+" km: "+motorCycle.calculateTravelCost(distance)+" units");
		
	}

}
