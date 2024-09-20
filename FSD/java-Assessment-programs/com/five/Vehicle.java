package com.five;

interface Vehicle {
	void start();
	
	default void stop() {
		System.out.println("Vehicle stopped.");
	}
}
