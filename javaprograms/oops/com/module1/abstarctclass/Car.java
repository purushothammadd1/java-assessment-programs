package com.module1.abstarctclass;

public abstract class Car {
	
	int mileage;
	
	Car(int mileage){
		this.mileage = mileage;
	}
	
	public abstract void pressBreak();
	
	public abstract void pressClutch();
	
	public int getNumberOfWheels() {
		return 4;
	}

}
